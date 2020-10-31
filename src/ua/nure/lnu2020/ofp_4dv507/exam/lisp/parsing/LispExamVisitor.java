// Generated from ./LispExam.g4 by ANTLR 4.8

package ua.nure.lnu2020.ofp_4dv507.exam.lisp.parsing;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LispExamParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LispExamVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LispExamParser#programDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramDef(LispExamParser.ProgramDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispExamParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(LispExamParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispExamParser#funcDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDecl(LispExamParser.FuncDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispExamParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(LispExamParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispExamParser#intExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExpr(LispExamParser.IntExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispExamParser#intOperand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntOperand(LispExamParser.IntOperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispExamParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(LispExamParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispExamParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(LispExamParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispExamParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol(LispExamParser.SymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispExamParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(LispExamParser.LiteralContext ctx);
}