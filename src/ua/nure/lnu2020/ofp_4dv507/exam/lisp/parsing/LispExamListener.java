// Generated from ./LispExam.g4 by ANTLR 4.8

package ua.nure.lnu2020.ofp_4dv507.exam.lisp.parsing;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LispExamParser}.
 */
public interface LispExamListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LispExamParser#programDef}.
	 * @param ctx the parse tree
	 */
	void enterProgramDef(LispExamParser.ProgramDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispExamParser#programDef}.
	 * @param ctx the parse tree
	 */
	void exitProgramDef(LispExamParser.ProgramDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispExamParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(LispExamParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispExamParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(LispExamParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispExamParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void enterFuncDecl(LispExamParser.FuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispExamParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void exitFuncDecl(LispExamParser.FuncDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispExamParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(LispExamParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispExamParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(LispExamParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispExamParser#intExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntExpr(LispExamParser.IntExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispExamParser#intExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntExpr(LispExamParser.IntExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispExamParser#intOperand}.
	 * @param ctx the parse tree
	 */
	void enterIntOperand(LispExamParser.IntOperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispExamParser#intOperand}.
	 * @param ctx the parse tree
	 */
	void exitIntOperand(LispExamParser.IntOperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispExamParser#println}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(LispExamParser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispExamParser#println}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(LispExamParser.PrintlnContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispExamParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(LispExamParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispExamParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(LispExamParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispExamParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(LispExamParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispExamParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(LispExamParser.SymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispExamParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(LispExamParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispExamParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(LispExamParser.LiteralContext ctx);
}