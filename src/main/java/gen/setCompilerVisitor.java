package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link setCompilerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface setCompilerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link setCompilerParser#global_program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_program(setCompilerParser.Global_programContext ctx);
	/**
	 * Visit a parse tree produced by {@link setCompilerParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(setCompilerParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link setCompilerParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(setCompilerParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link setCompilerParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(setCompilerParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link setCompilerParser#digit_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigit_expression(setCompilerParser.Digit_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link setCompilerParser#intialize_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntialize_set(setCompilerParser.Intialize_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link setCompilerParser#intialize_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntialize_element(setCompilerParser.Intialize_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link setCompilerParser#assign_var_method_invocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_var_method_invocation(setCompilerParser.Assign_var_method_invocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link setCompilerParser#assign_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_set(setCompilerParser.Assign_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link setCompilerParser#assign_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_var(setCompilerParser.Assign_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link setCompilerParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(setCompilerParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link setCompilerParser#operations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperations(setCompilerParser.OperationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link setCompilerParser#operarions_with_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperarions_with_set(setCompilerParser.Operarions_with_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link setCompilerParser#simple_compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_compare(setCompilerParser.Simple_compareContext ctx);
	/**
	 * Visit a parse tree produced by {@link setCompilerParser#hard_compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHard_compare(setCompilerParser.Hard_compareContext ctx);
	/**
	 * Visit a parse tree produced by {@link setCompilerParser#while_cicle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_cicle(setCompilerParser.While_cicleContext ctx);
	/**
	 * Visit a parse tree produced by {@link setCompilerParser#if_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else(setCompilerParser.If_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link setCompilerParser#for_each}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_each(setCompilerParser.For_eachContext ctx);
	/**
	 * Visit a parse tree produced by {@link setCompilerParser#global_assign_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_assign_set(setCompilerParser.Global_assign_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link setCompilerParser#global_assign_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_assign_var(setCompilerParser.Global_assign_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link setCompilerParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(setCompilerParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link setCompilerParser#type_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_1(setCompilerParser.Type_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link setCompilerParser#subprogram_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram_return(setCompilerParser.Subprogram_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link setCompilerParser#signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignature(setCompilerParser.SignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link setCompilerParser#subprogram_non_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram_non_return(setCompilerParser.Subprogram_non_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link setCompilerParser#block_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_return(setCompilerParser.Block_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link setCompilerParser#block_non_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_non_return(setCompilerParser.Block_non_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link setCompilerParser#signature_method_invokation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignature_method_invokation(setCompilerParser.Signature_method_invokationContext ctx);
	/**
	 * Visit a parse tree produced by {@link setCompilerParser#method_invokation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_invokation(setCompilerParser.Method_invokationContext ctx);
}