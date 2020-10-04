// Generated from ./OfpPashaievaShevchenko.g4 by ANTLR 4.8

package ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.parsing;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OfpPashaievaShevchenkoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OfpPashaievaShevchenkoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#programDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramDef(OfpPashaievaShevchenkoParser.ProgramDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#mainDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainDef(OfpPashaievaShevchenkoParser.MainDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#anyFuncDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyFuncDef(OfpPashaievaShevchenkoParser.AnyFuncDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#funcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(OfpPashaievaShevchenkoParser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#voidFuncDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidFuncDef(OfpPashaievaShevchenkoParser.VoidFuncDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#funcArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncArgs(OfpPashaievaShevchenkoParser.FuncArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype(OfpPashaievaShevchenkoParser.DatatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDef(OfpPashaievaShevchenkoParser.VarDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#ifDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfDef(OfpPashaievaShevchenkoParser.IfDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#voidIfDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidIfDef(OfpPashaievaShevchenkoParser.VoidIfDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#whileDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileDef(OfpPashaievaShevchenkoParser.WhileDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#voidWhileDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidWhileDef(OfpPashaievaShevchenkoParser.VoidWhileDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#statOrBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatOrBlock(OfpPashaievaShevchenkoParser.StatOrBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#voidStatOrBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidStatOrBlock(OfpPashaievaShevchenkoParser.VoidStatOrBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(OfpPashaievaShevchenkoParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#funcBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncBlock(OfpPashaievaShevchenkoParser.FuncBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#voidBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidBlock(OfpPashaievaShevchenkoParser.VoidBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(OfpPashaievaShevchenkoParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#voidStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidStat(OfpPashaievaShevchenkoParser.VoidStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#scStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScStat(OfpPashaievaShevchenkoParser.ScStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#voidScStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidScStat(OfpPashaievaShevchenkoParser.VoidScStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#voidScStatValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidScStatValue(OfpPashaievaShevchenkoParser.VoidScStatValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(OfpPashaievaShevchenkoParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#arrSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrSet(OfpPashaievaShevchenkoParser.ArrSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#complexExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexExpr(OfpPashaievaShevchenkoParser.ComplexExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#arrGet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrGet(OfpPashaievaShevchenkoParser.ArrGetContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(OfpPashaievaShevchenkoParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#returnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnExpr(OfpPashaievaShevchenkoParser.ReturnExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(OfpPashaievaShevchenkoParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#printExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(OfpPashaievaShevchenkoParser.PrintExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#printlnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintlnExpr(OfpPashaievaShevchenkoParser.PrintlnExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#printable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintable(OfpPashaievaShevchenkoParser.PrintableContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#intDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntDecl(OfpPashaievaShevchenkoParser.IntDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#floatDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatDecl(OfpPashaievaShevchenkoParser.FloatDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#charDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharDecl(OfpPashaievaShevchenkoParser.CharDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#boolDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolDecl(OfpPashaievaShevchenkoParser.BoolDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#strDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrDecl(OfpPashaievaShevchenkoParser.StrDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#intArrDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntArrDecl(OfpPashaievaShevchenkoParser.IntArrDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#floatArrDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatArrDecl(OfpPashaievaShevchenkoParser.FloatArrDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#charArrDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharArrDecl(OfpPashaievaShevchenkoParser.CharArrDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#intDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntDef(OfpPashaievaShevchenkoParser.IntDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#floatDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatDef(OfpPashaievaShevchenkoParser.FloatDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#charDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharDef(OfpPashaievaShevchenkoParser.CharDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#boolDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolDef(OfpPashaievaShevchenkoParser.BoolDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#strDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrDef(OfpPashaievaShevchenkoParser.StrDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#intArrDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntArrDef(OfpPashaievaShevchenkoParser.IntArrDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#floatArrDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatArrDef(OfpPashaievaShevchenkoParser.FloatArrDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#charArrDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharArrDef(OfpPashaievaShevchenkoParser.CharArrDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#intArrExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntArrExpr(OfpPashaievaShevchenkoParser.IntArrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#floatArrExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatArrExpr(OfpPashaievaShevchenkoParser.FloatArrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#charArrExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharArrExpr(OfpPashaievaShevchenkoParser.CharArrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#intArr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntArr(OfpPashaievaShevchenkoParser.IntArrContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#floatArr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatArr(OfpPashaievaShevchenkoParser.FloatArrContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#charArr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharArr(OfpPashaievaShevchenkoParser.CharArrContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#newIntArr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewIntArr(OfpPashaievaShevchenkoParser.NewIntArrContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#newFloatArr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewFloatArr(OfpPashaievaShevchenkoParser.NewFloatArrContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#newCharArr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewCharArr(OfpPashaievaShevchenkoParser.NewCharArrContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#lengthRead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLengthRead(OfpPashaievaShevchenkoParser.LengthReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(OfpPashaievaShevchenkoParser.BoolExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#intExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExpr(OfpPashaievaShevchenkoParser.IntExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#floatExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatExpr(OfpPashaievaShevchenkoParser.FloatExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#charExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharExpr(OfpPashaievaShevchenkoParser.CharExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#strExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrExpr(OfpPashaievaShevchenkoParser.StrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#intLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral(OfpPashaievaShevchenkoParser.IntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link OfpPashaievaShevchenkoParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(OfpPashaievaShevchenkoParser.FloatLiteralContext ctx);
}