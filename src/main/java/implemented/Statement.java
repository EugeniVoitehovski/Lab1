package implemented;

import gen.setCompilerParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import javax.annotation.Nullable;

public enum Statement {

    ASSIGN(setCompilerParser.Assign_varContext.class, (ctx, visitor) -> {
        return ctx.assign_var().accept(visitor);
    }),
    ASSIGN_SET(setCompilerParser.Assign_setContext.class, (ctx, visitor) -> {
        return ctx.assign_set().accept(visitor);
    }),
    PRINT(setCompilerParser.PrintContext.class, (ctx, visitor) -> {
        return ctx.print().accept(visitor);
    }),
    OPERATION_INT(setCompilerParser.OperationsContext.class, (ctx, visitor) -> {
        return ctx.operations().accept(visitor);
    }),
    WHILE_CICLE(setCompilerParser.While_cicleContext.class, (ctx, visitor) -> {
        return ctx.while_cicle().accept(visitor);
    }),
    IF_THEN(setCompilerParser.If_elseContext.class, (ctx, visitor) -> {
        return ctx.if_else().accept(visitor);
    }),
    METHOD_INVOCATION(setCompilerParser.Method_invokationContext.class, (ctx, visitor) -> {
        return ctx.method_invokation().accept(visitor);
    }),
    METHOD_INVOCATION_AND_ASSIGN(setCompilerParser.Assign_var_method_invocationContext.class, (ctx, visitor) -> {
        return ctx.assign_var_method_invocation().accept(visitor);
    }),
    SET_OPERATIONS(setCompilerParser.Operarions_with_setContext.class, (ctx, visitor) -> {
        return ctx.operarions_with_set().accept(visitor);
    }),
    FOR_EACH(setCompilerParser.For_eachContext.class, (ctx, visitor) -> {
        return ctx.for_each().accept(visitor);
    });

    private final Class clas;
    private final InvocationAction<String> action;

    Statement(Class clas, InvocationAction<String> action) {
        this.clas = clas;
        this.action = action;
    }

    @Nullable
    public static Statement findStatement(ParserRuleContext ctx) {
        for (Statement statement : Statement.values()) {
            if (ctx.getRuleContext(statement.clas, 0) != null) {
                return statement;
            }
        }
        return null;
    }

    public String invoke(setCompilerParser.StatementContext ctx, ParseTreeVisitor<String> visitor) {
        return action.invoke(ctx, visitor);
    }

    private interface InvocationAction<T> {

        T invoke(setCompilerParser.StatementContext ctx, ParseTreeVisitor<T> visitor);

    }

}
