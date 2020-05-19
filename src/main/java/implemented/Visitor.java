package implemented;


import implemented.methods.Method;
import implemented.methods.MethodType;
import implemented.variables.Variable;
import implemented.variables.VariableType;
import gen.setCompilerParser;
import gen.setCompilerVisitor;
import com.google.common.base.Preconditions;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class Visitor implements setCompilerVisitor<String> {

    private final Parser parserV1;
    private final String name;

    private final List<Method> methods = new ArrayList<>();
    private final Set<Variable> globalVariables = new HashSet<>();
    private final Map<Integer, Map<Integer, Set<Variable>>> variables = new HashMap<>();

    public boolean registerMethod(Method method) {
        if (method.equals(getRegisteredMethod(method.getID()))) {
            return false;
        }
        return methods.add(method);
    }

    public Method getRegisteredMethod(String ID) {
        for (Method method : methods) {
            if (method.getID().equals(ID)) {
                return method;
            }
        }
        return null;
    }

    public void registerMethodInvocation() {
        Map<Integer, Set<Variable>> var = new HashMap<>();
        // input method vars.
        var.put(var.size(), new HashSet<>());
        variables.put(variables.size(), var);
    }

    public boolean registerVariable(Variable variable) {
        Map<Integer, Set<Variable>> methodVariables = Preconditions.checkNotNull(variables.get(variables.size() - 1));
        Variable registered = getVariable(variable.getID());
        if (registered == null) {
            return Preconditions.checkNotNull(methodVariables.get(methodVariables.size() - 1)).add(variable);
        }
        return false;
    }

    public boolean registerGlobalVariable(Variable variable) {
        Variable registered = getVariable(variable.getID());
        if (registered == null) {
            return globalVariables.add(variable);
        }
        return false;
    }

    public Variable getVariable(String ID) {
        for (Variable global : globalVariables) {
            if (global.getID().equals(ID)) {
                return global;
            }
        }
        Map<Integer, Set<Variable>> methodVariables = variables.get(variables.size() - 1);
        if (methodVariables != null) {
            for (Set<Variable> list : methodVariables.values()) {
                for (Variable variable : list) {
                    if (variable.getID().equals(ID)) {
                        return variable;
                    }
                }
            }
        }
        return null;
    }

    public void registerNewVisibilityArea() {
        Map<Integer, Set<Variable>> methodVariables = Preconditions.checkNotNull(variables.get(variables.size() - 1));
        methodVariables.put(methodVariables.size(), new HashSet<>());
    }

    public boolean registerVisibilityAreaEnded() {
        Map<Integer, Set<Variable>> methodVariables = Preconditions.checkNotNull(variables.get(variables.size() - 1));
        return methodVariables.remove(methodVariables.size() - 1) != null;
    }

    public boolean registerMethodInvocationEnded() {
        return variables.remove(variables.size() - 1) != null;
    }


    public Visitor(Parser parserV1, String name) {
        this.parserV1 = parserV1;
        this.name = name;
    }

    @Override
    public String visitProgram(setCompilerParser.ProgramContext ctx) {
        registerMethodInvocation();
        String out = "private static void program () " + ctx.block().accept(this);
        registerMethodInvocationEnded();
        return out;
    }

    @Override
    public String visitBlock(setCompilerParser.BlockContext ctx) {
        registerNewVisibilityArea();
        StringBuilder out = new StringBuilder("{\n").append(invokeAllStatementsForBlock(ctx.statement()));
        out.append("}\n");
        registerVisibilityAreaEnded();
        return out.toString();
    }

    private StringBuilder invokeAllStatementsForBlock(List<setCompilerParser.StatementContext> list) {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            out.append(list.get(i).accept(this));
        }
        return out;
    }

    @Override
    public String visitStatement(setCompilerParser.StatementContext ctx) {
        Statement statement = Statement.findStatement(ctx);
        Preconditions.checkNotNull(statement);
        return statement.invoke(ctx, this);
    }

    @Override
    public String visitDigit_expression(setCompilerParser.Digit_expressionContext ctx) {
        validateDigitExpression(ctx);
        return concatExpr(ctx) + ";\n";
    }

    @Override
    public String visitIntialize_set(setCompilerParser.Intialize_setContext ctx) {
        String ID = ((setCompilerParser.Assign_setContext) ctx.parent).ID().getText();
        return VariableType.SET.getOutName() + " " + ID + "=" + "new Set()" + ";\n" + handleSetInitialization(ctx.ID(), ID);
    }

    private String handleSetInitialization(List<TerminalNode> list, String rootID) {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            Variable variable = Preconditions.checkNotNull(getVariable(list.get(i).getText()));
            if (variable.getVariableType() != VariableType.ELEMENT) {
                throw new UnsupportedOperationException();
            }
            out.append(rootID).append(".").append(String.format("add(%s)", variable.getID())).append(";\n");
        }
        return out.toString();
    }

    @Override
    public String visitIntialize_element(setCompilerParser.Intialize_elementContext ctx) {
        return String.format("new Element(%s)", ctx.STRING()) + ";\n";
    }

    @Override
    public String visitAssign_var_method_invocation(setCompilerParser.Assign_var_method_invocationContext ctx) {
        Variable variable = new Variable(ctx.ID().getText(), Preconditions.checkNotNull(VariableType.findByDisplayName(ctx.type().getText())), ctx.CONST() != null);
        Preconditions.checkState(registerVariable(variable));
        Method method = Preconditions.checkNotNull(getRegisteredMethod(ctx.method_invokation().ID().getText()));
        if (method.getMethodType() == MethodType.RETURN_OPTIONAL || method.getMethodType().getReturnedType() != variable.getVariableType()) {
            throw new UnsupportedOperationException();
        }
        return variable.getVariableType().getOutName() + " " + variable.getID() + "=" + ctx.method_invokation().accept(this);
    }

    private void validateDigitExpression(setCompilerParser.Digit_expressionContext ctx) {
        if (ctx.ID() != null) {
            Variable variable = getVariable(ctx.ID().toString());
            if (variable == null || variable.getVariableType() != VariableType.INT) {
                throw new UnsupportedOperationException();
            }
        }
        List<setCompilerParser.Digit_expressionContext> expr = ctx.digit_expression();
        for (int i = 0; i < expr.size(); i++) {
            validateDigitExpression(expr.get(i));
        }
    }

    @Override
    public String visitAssign_var(setCompilerParser.Assign_varContext ctx) {
        return processAssignVar(ctx, false);
    }

    private String processAssignVar(setCompilerParser.Assign_varContext ctx, boolean global) {
        VariableType variableType = Preconditions.checkNotNull(VariableType.findByDisplayName(ctx.type_1().getText()));
        String out = variableType.getOutName() + " " + ctx.ID() + "=" + variableType.invokeInitLine(ctx, this);
            if (!global) {
            Preconditions.checkState(registerVariable(new Variable(ctx.ID().toString(), variableType, ctx.CONST() != null)));
        } else {
            Preconditions.checkState(registerGlobalVariable(new Variable(ctx.ID().toString(), variableType, ctx.CONST() != null)));
        }
        return out;
    }

    @Override
    public String visitAssign_set(setCompilerParser.Assign_setContext ctx) {
        return processAssignSet(ctx, false);
    }

    private String processAssignSet(setCompilerParser.Assign_setContext ctx, boolean global) {
        StringBuilder out = new StringBuilder();
        SetOperations setOperations = SetOperations.findOperation(ctx.intialize_set());
        Variable varForRegister;
        if (setOperations == null) {
            out.append(VariableType.SET.invokeInitLine(ctx, this));
            varForRegister = new Variable(ctx.ID().toString(), VariableType.SET, ctx.CONST() != null);
        } else {
            for (int i = 1; i < 2; i++) {
                Variable variable = Preconditions.checkNotNull(getVariable(ctx.intialize_set().ID(i).getText()));
                if (variable.getVariableType() != VariableType.SET) {
                    throw new UnsupportedOperationException();
                }
            }
            out.append(VariableType.SET.getOutName()).append(" ").append(ctx.ID()).append("=");
            out.append(String.format(setOperations.getOverrideSet(), ctx.intialize_set().ID(0), ctx.intialize_set().ID(1))).append(";\n");
            varForRegister = new Variable(ctx.ID().toString(), VariableType.SET);
        }
        if (!global) {
            Preconditions.checkState(registerVariable(varForRegister));
        } else {
            Preconditions.checkState(registerGlobalVariable(varForRegister));
        }
        return out.toString();
    }

    @Override
    public String visitPrint(setCompilerParser.PrintContext ctx) {
        if (ctx.ID() != null) {
            Variable variable = Preconditions.checkNotNull(getVariable(ctx.ID().getText()));
            return String.format("System.out.println(String.valueOf(%s))", variable.getID()) + ";\n";
        } else {
            return String.format("System.out.println(String.valueOf(%s))", ctx.STRING() == null ? ctx.NUMBER() : ctx.STRING()) + ";\n";
        }
    }

    @Override
    public String visitOperations(setCompilerParser.OperationsContext ctx) {
        Variable variable = getVariable(ctx.ID().toString());
        if (variable == null || variable.getVariableType() != VariableType.INT || variable.isConstant()) {
            throw new UnsupportedOperationException();
        }
        validateDigitExpression(ctx.digit_expression());
        return variable.getID() + "=" + concatExpr(ctx.digit_expression()) + ";\n";
    }

    @Override
    //TODO rework.
    public String visitOperarions_with_set(setCompilerParser.Operarions_with_setContext ctx) {
        Variable variable = Preconditions.checkNotNull(getVariable(ctx.ID(0).getText()));
        Variable el = Preconditions.checkNotNull(getVariable(ctx.ID(1).getText()));
        if (variable.getVariableType() != VariableType.SET || el.getVariableType() != VariableType.ELEMENT || variable.isConstant()) {
            throw new UnsupportedOperationException();
        }
        if (ctx.ADD() == null) {
            return variable.getID() + "." + String.format("remove(%s)", el.getID()) + ";\n";
        } else {
            return variable.getID() + "." + String.format("remove(%s)", el.getID()) + ";\n";
        }
    }

    @Override
    public String visitSimple_compare(setCompilerParser.Simple_compareContext ctx) {
        List<setCompilerParser.Digit_expressionContext> dctx = ctx.digit_expression();
        validateDigitExpression(dctx.get(0));
        validateDigitExpression(dctx.get(1));
        return concatExpr(ctx);
    }

    private String concatExpr(ParserRuleContext ctx) {
        StringBuilder out = new StringBuilder();
        List<Token> tokens = parserV1.getTokens(ctx.start, ctx.stop);
        for (int i = 0; i < tokens.size(); i++) {
            out.append(tokens.get(i).getText());
        }
        return out.toString();
    }

    @Override
    public String visitHard_compare(setCompilerParser.Hard_compareContext ctx) {
        return ctx.NEGATION().getText() + ctx.O_BRACKET().getText() + visitSimple_compare(ctx.simple_compare()) + ctx.C_BRACKET().getText();
    }

    @Override
    public String visitWhile_cicle(setCompilerParser.While_cicleContext ctx) {
        String out = String.format("while (%s)", handlerCompare(ctx.hard_compare(), ctx.simple_compare()));
        out += ctx.block().accept(this);
        return out;
    }

    private String handlerCompare(setCompilerParser.Hard_compareContext htx, setCompilerParser.Simple_compareContext stx) {
        return stx == null ? htx.accept(this) : stx.accept(this);
    }

    @Override
    public String visitIf_else(setCompilerParser.If_elseContext ctx) {
        return String.format("if (%s) %s else %s", handlerCompare(ctx.hard_compare(), ctx.simple_compare()), ctx.block(0).accept(this), ctx.block(1).accept(this));
    }

    @Override
    public String visitFor_each(setCompilerParser.For_eachContext ctx) {
        Variable variable = getVariable(ctx.ID(1).getText());
        if (variable == null || variable.getVariableType() != VariableType.SET) {
            throw new UnsupportedOperationException();
        }
        Preconditions.checkState(registerVariable(new Variable(ctx.ID(0).getText(), VariableType.ELEMENT)));
        return String.format("for (%s:%s)", "Element" + " " + ctx.ID(0).getText(), variable.getID()) + ctx.block().accept(this);
    }

    @Override
    public String visitGlobal_assign_set(setCompilerParser.Global_assign_setContext ctx) {
        return "private static " + processAssignSet(ctx.assign_set(), true);
    }

    @Override
    public String visitGlobal_assign_var(setCompilerParser.Global_assign_varContext ctx) {
        return "private static " + processAssignVar(ctx.assign_var(), true);
    }

    @Override
    public String visitType(setCompilerParser.TypeContext ctx) {
        VariableType variableType = VariableType.findByDisplayName(ctx.getText());
        return Preconditions.checkNotNull(variableType).getOutName();
    }

    @Override
    public String visitType_1(setCompilerParser.Type_1Context ctx) {
        VariableType variableType = VariableType.findByDisplayName(ctx.getText());
        return Preconditions.checkNotNull(variableType).getOutName();
    }

    @Override
    public String visitSignature(setCompilerParser.SignatureContext ctx) {
        StringBuilder builder = new StringBuilder();
        builder.append("(");
        for (int i = 0; i < ctx.ID().size(); i++) {
            VariableType variableType = VariableType.findByDisplayName(ctx.type(i).getText());
            Preconditions.checkNotNull(variableType);
            registerVariable(new Variable(ctx.ID(i).getText(), variableType));
            builder.append(ctx.type(i).accept(this)).append(" ").append(ctx.ID(i));
            if (i != ctx.ID().size() - 1) {
                builder.append(",");
            }
        }
        builder.append(")");
        return builder.toString();
    }

    @Override
    public String visitSubprogram_return(setCompilerParser.Subprogram_returnContext ctx) {
        Method method = getRegisteredMethod(ctx.ID().toString());
        if (method == null || method.getMethodType() == MethodType.RETURN_OPTIONAL) {
            throw new UnsupportedOperationException();
        }
        registerMethodInvocation();
        //NPE checked before.
        String s = "private static " + method.getMethodType().getReturnedType().getOutName()
                + " " + ctx.ID() + ctx.signature().accept(this) + ctx.block_return().accept(this);
        registerMethodInvocationEnded();
        return s;
    }

    @Override
    public String visitSubprogram_non_return(setCompilerParser.Subprogram_non_returnContext ctx) {
        Method method = getRegisteredMethod(ctx.ID().toString());
        if (method == null || method.getMethodType() != MethodType.RETURN_OPTIONAL) {
            throw new UnsupportedOperationException();
        }
        registerMethodInvocation();
        String s = "private static " + "void" + " " + ctx.ID() + handleSignature(ctx.signature());
        s += ctx.block_non_return() == null ? ctx.block().accept(this) : ctx.block_non_return().accept(this);
        registerMethodInvocationEnded();
        return s;
    }

    private String handleSignature(setCompilerParser.SignatureContext ctx) {
        return ctx == null ? "(" + ")" : ctx.accept(this);
    }

    @Override
    public String visitBlock_return(setCompilerParser.Block_returnContext ctx) {
        registerNewVisibilityArea();
        Method method = Preconditions.checkNotNull(getRegisteredMethod(((setCompilerParser.Subprogram_returnContext) ctx.parent).ID().getText()));
        StringBuilder out = new StringBuilder("{\n").append(invokeAllStatementsForBlock(ctx.statement()));
        out.append("return");
        Variable variable = Preconditions.checkNotNull(getVariable(ctx.ID().getText()));
        if (variable.getVariableType() != method.getMethodType().getReturnedType()) {
            throw new UnsupportedOperationException();
        }
        out.append(" ").append(variable.getID()).append(";\n").append("}\n");
        registerVisibilityAreaEnded();
        return out.toString();
    }

    @Override
    public String visitBlock_non_return(setCompilerParser.Block_non_returnContext ctx) {
        registerNewVisibilityArea();
        StringBuilder out = new StringBuilder("{\n").append(invokeAllStatementsForBlock(ctx.statement()));
        out.append("return");
        out.append(";\n");
        out.append("}\n");
        registerVisibilityAreaEnded();
        return out.toString();
    }

    @Override
    public String visitSignature_method_invokation(setCompilerParser.Signature_method_invokationContext ctx) {
        StringBuilder builder = new StringBuilder();
        builder.append("(");
        Method method = getRegisteredMethod(((setCompilerParser.Method_invokationContext) ctx.parent).ID().getText());
        Preconditions.checkNotNull(method);
        if (method.getArguments().size() != ctx.ID().size()) {
            throw new UnsupportedOperationException();
        }
        for (int i = 0; i < ctx.ID().size(); i++) {
            Variable variable = getVariable(ctx.ID(i).getText());
            if (variable == null || method.getArguments().get(i) != variable.getVariableType()) {
                throw new UnsupportedOperationException();
            }
            builder.append(variable.getID());
        }
        return builder.append(")").toString();
    }

    @Override
    public String visitMethod_invokation(setCompilerParser.Method_invokationContext ctx) {
        Method method = getRegisteredMethod(ctx.ID().toString());
        if (method == null) {
            throw new UnsupportedOperationException();
        }
        return method.getID() + " " + handleSignatureOfInvocation(ctx) + ";\n";
    }

    private String handleSignatureOfInvocation(setCompilerParser.Method_invokationContext ctx) {
        if (ctx.signature_method_invokation() == null) {
            Method method = Preconditions.checkNotNull(getRegisteredMethod(ctx.ID().getText()));
            if (method.getArguments().size() != 0) {
                throw new UnsupportedOperationException();
            }
            return "(" + ")";
        }
        return ctx.signature_method_invokation().accept(this);
    }

    @Override
    public String visitGlobal_program(setCompilerParser.Global_programContext ctx) {
        StringBuilder out = new StringBuilder();
        registerMethod(new Method("program", MethodType.RETURN_OPTIONAL, Collections.emptyList()));
        List<setCompilerParser.Subprogram_non_returnContext> non_returnContexts = ctx.subprogram_non_return();
        List<setCompilerParser.Subprogram_returnContext> returnContexts = ctx.subprogram_return();
        for (setCompilerParser.Global_assign_varContext ct : ctx.global_assign_var()) {
            out.append(ct.accept(this));
        }
        for (setCompilerParser.Global_assign_setContext ct : ctx.global_assign_set()) {
            out.append(ct.accept(this));
        }
        for (setCompilerParser.Subprogram_returnContext ct : returnContexts) {
            VariableType variableType = Preconditions.checkNotNull(VariableType.findByDisplayName(ct.type().getText()));
            registerMethod(new Method(ct.ID().toString(), Preconditions.checkNotNull(MethodType.findByReturnedType(variableType)), collectMethodArguments(ct.signature())));
            out.append(ct.accept(this));
        }
        for (setCompilerParser.Subprogram_non_returnContext ct : non_returnContexts) {
            registerMethod(new Method(ct.ID().toString(), MethodType.RETURN_OPTIONAL, collectMethodArguments(ct.signature())));
            out.append(ct.accept(this));
        }
        out.append(ctx.program().accept(this));
        return out.toString();
    }

    private List<VariableType> collectMethodArguments(setCompilerParser.SignatureContext ctx) {
        List<VariableType> variableTypes = new ArrayList<>();
        if (ctx == null) {
            return Collections.emptyList();
        }
        for (int i = 0; i < ctx.ID().size(); i++) {
            VariableType variableType = VariableType.findByDisplayName(ctx.type(i).getText());
            variableTypes.add(Preconditions.checkNotNull(variableType));
        }
        return variableTypes;
    }

    @Override
    public String visit(ParseTree parseTree) {
        String out = parseTree.accept(this);
        System.out.println(out);
        return String.format(MainString.FINAL_FILE, name, out);
    }

    @Override
    public String visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public String visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public String visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}
