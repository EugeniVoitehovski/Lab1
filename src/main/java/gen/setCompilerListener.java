package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link setCompilerParser}.
 */
public interface setCompilerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link setCompilerParser#global_program}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_program(setCompilerParser.Global_programContext ctx);
	/**
	 * Exit a parse tree produced by {@link setCompilerParser#global_program}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_program(setCompilerParser.Global_programContext ctx);
	/**
	 * Enter a parse tree produced by {@link setCompilerParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(setCompilerParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link setCompilerParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(setCompilerParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link setCompilerParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(setCompilerParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link setCompilerParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(setCompilerParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link setCompilerParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(setCompilerParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link setCompilerParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(setCompilerParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link setCompilerParser#digit_expression}.
	 * @param ctx the parse tree
	 */
	void enterDigit_expression(setCompilerParser.Digit_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link setCompilerParser#digit_expression}.
	 * @param ctx the parse tree
	 */
	void exitDigit_expression(setCompilerParser.Digit_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link setCompilerParser#intialize_set}.
	 * @param ctx the parse tree
	 */
	void enterIntialize_set(setCompilerParser.Intialize_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link setCompilerParser#intialize_set}.
	 * @param ctx the parse tree
	 */
	void exitIntialize_set(setCompilerParser.Intialize_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link setCompilerParser#intialize_element}.
	 * @param ctx the parse tree
	 */
	void enterIntialize_element(setCompilerParser.Intialize_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link setCompilerParser#intialize_element}.
	 * @param ctx the parse tree
	 */
	void exitIntialize_element(setCompilerParser.Intialize_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link setCompilerParser#assign_var_method_invocation}.
	 * @param ctx the parse tree
	 */
	void enterAssign_var_method_invocation(setCompilerParser.Assign_var_method_invocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link setCompilerParser#assign_var_method_invocation}.
	 * @param ctx the parse tree
	 */
	void exitAssign_var_method_invocation(setCompilerParser.Assign_var_method_invocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link setCompilerParser#assign_set}.
	 * @param ctx the parse tree
	 */
	void enterAssign_set(setCompilerParser.Assign_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link setCompilerParser#assign_set}.
	 * @param ctx the parse tree
	 */
	void exitAssign_set(setCompilerParser.Assign_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link setCompilerParser#assign_var}.
	 * @param ctx the parse tree
	 */
	void enterAssign_var(setCompilerParser.Assign_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link setCompilerParser#assign_var}.
	 * @param ctx the parse tree
	 */
	void exitAssign_var(setCompilerParser.Assign_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link setCompilerParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(setCompilerParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link setCompilerParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(setCompilerParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link setCompilerParser#operations}.
	 * @param ctx the parse tree
	 */
	void enterOperations(setCompilerParser.OperationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link setCompilerParser#operations}.
	 * @param ctx the parse tree
	 */
	void exitOperations(setCompilerParser.OperationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link setCompilerParser#operarions_with_set}.
	 * @param ctx the parse tree
	 */
	void enterOperarions_with_set(setCompilerParser.Operarions_with_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link setCompilerParser#operarions_with_set}.
	 * @param ctx the parse tree
	 */
	void exitOperarions_with_set(setCompilerParser.Operarions_with_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link setCompilerParser#simple_compare}.
	 * @param ctx the parse tree
	 */
	void enterSimple_compare(setCompilerParser.Simple_compareContext ctx);
	/**
	 * Exit a parse tree produced by {@link setCompilerParser#simple_compare}.
	 * @param ctx the parse tree
	 */
	void exitSimple_compare(setCompilerParser.Simple_compareContext ctx);
	/**
	 * Enter a parse tree produced by {@link setCompilerParser#hard_compare}.
	 * @param ctx the parse tree
	 */
	void enterHard_compare(setCompilerParser.Hard_compareContext ctx);
	/**
	 * Exit a parse tree produced by {@link setCompilerParser#hard_compare}.
	 * @param ctx the parse tree
	 */
	void exitHard_compare(setCompilerParser.Hard_compareContext ctx);
	/**
	 * Enter a parse tree produced by {@link setCompilerParser#while_cicle}.
	 * @param ctx the parse tree
	 */
	void enterWhile_cicle(setCompilerParser.While_cicleContext ctx);
	/**
	 * Exit a parse tree produced by {@link setCompilerParser#while_cicle}.
	 * @param ctx the parse tree
	 */
	void exitWhile_cicle(setCompilerParser.While_cicleContext ctx);
	/**
	 * Enter a parse tree produced by {@link setCompilerParser#if_else}.
	 * @param ctx the parse tree
	 */
	void enterIf_else(setCompilerParser.If_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link setCompilerParser#if_else}.
	 * @param ctx the parse tree
	 */
	void exitIf_else(setCompilerParser.If_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link setCompilerParser#for_each}.
	 * @param ctx the parse tree
	 */
	void enterFor_each(setCompilerParser.For_eachContext ctx);
	/**
	 * Exit a parse tree produced by {@link setCompilerParser#for_each}.
	 * @param ctx the parse tree
	 */
	void exitFor_each(setCompilerParser.For_eachContext ctx);
	/**
	 * Enter a parse tree produced by {@link setCompilerParser#global_assign_set}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_assign_set(setCompilerParser.Global_assign_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link setCompilerParser#global_assign_set}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_assign_set(setCompilerParser.Global_assign_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link setCompilerParser#global_assign_var}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_assign_var(setCompilerParser.Global_assign_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link setCompilerParser#global_assign_var}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_assign_var(setCompilerParser.Global_assign_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link setCompilerParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(setCompilerParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link setCompilerParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(setCompilerParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link setCompilerParser#type_1}.
	 * @param ctx the parse tree
	 */
	void enterType_1(setCompilerParser.Type_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link setCompilerParser#type_1}.
	 * @param ctx the parse tree
	 */
	void exitType_1(setCompilerParser.Type_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link setCompilerParser#subprogram_return}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_return(setCompilerParser.Subprogram_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link setCompilerParser#subprogram_return}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_return(setCompilerParser.Subprogram_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link setCompilerParser#signature}.
	 * @param ctx the parse tree
	 */
	void enterSignature(setCompilerParser.SignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link setCompilerParser#signature}.
	 * @param ctx the parse tree
	 */
	void exitSignature(setCompilerParser.SignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link setCompilerParser#subprogram_non_return}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_non_return(setCompilerParser.Subprogram_non_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link setCompilerParser#subprogram_non_return}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_non_return(setCompilerParser.Subprogram_non_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link setCompilerParser#block_return}.
	 * @param ctx the parse tree
	 */
	void enterBlock_return(setCompilerParser.Block_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link setCompilerParser#block_return}.
	 * @param ctx the parse tree
	 */
	void exitBlock_return(setCompilerParser.Block_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link setCompilerParser#block_non_return}.
	 * @param ctx the parse tree
	 */
	void enterBlock_non_return(setCompilerParser.Block_non_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link setCompilerParser#block_non_return}.
	 * @param ctx the parse tree
	 */
	void exitBlock_non_return(setCompilerParser.Block_non_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link setCompilerParser#signature_method_invokation}.
	 * @param ctx the parse tree
	 */
	void enterSignature_method_invokation(setCompilerParser.Signature_method_invokationContext ctx);
	/**
	 * Exit a parse tree produced by {@link setCompilerParser#signature_method_invokation}.
	 * @param ctx the parse tree
	 */
	void exitSignature_method_invokation(setCompilerParser.Signature_method_invokationContext ctx);
	/**
	 * Enter a parse tree produced by {@link setCompilerParser#method_invokation}.
	 * @param ctx the parse tree
	 */
	void enterMethod_invokation(setCompilerParser.Method_invokationContext ctx);
	/**
	 * Exit a parse tree produced by {@link setCompilerParser#method_invokation}.
	 * @param ctx the parse tree
	 */
	void exitMethod_invokation(setCompilerParser.Method_invokationContext ctx);
}