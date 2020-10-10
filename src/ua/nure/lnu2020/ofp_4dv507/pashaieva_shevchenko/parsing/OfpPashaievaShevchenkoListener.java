// Generated from ./OfpPashaievaShevchenko.g4 by ANTLR 4.8

package ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.parsing;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OfpPashaievaShevchenkoParser}.
 */
public interface OfpPashaievaShevchenkoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#programDef}.
	 * @param ctx the parse tree
	 */
	void enterProgramDef(OfpPashaievaShevchenkoParser.ProgramDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#programDef}.
	 * @param ctx the parse tree
	 */
	void exitProgramDef(OfpPashaievaShevchenkoParser.ProgramDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#mainDef}.
	 * @param ctx the parse tree
	 */
	void enterMainDef(OfpPashaievaShevchenkoParser.MainDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#mainDef}.
	 * @param ctx the parse tree
	 */
	void exitMainDef(OfpPashaievaShevchenkoParser.MainDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#anyFuncDef}.
	 * @param ctx the parse tree
	 */
	void enterAnyFuncDef(OfpPashaievaShevchenkoParser.AnyFuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#anyFuncDef}.
	 * @param ctx the parse tree
	 */
	void exitAnyFuncDef(OfpPashaievaShevchenkoParser.AnyFuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(OfpPashaievaShevchenkoParser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(OfpPashaievaShevchenkoParser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#voidFuncDef}.
	 * @param ctx the parse tree
	 */
	void enterVoidFuncDef(OfpPashaievaShevchenkoParser.VoidFuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#voidFuncDef}.
	 * @param ctx the parse tree
	 */
	void exitVoidFuncDef(OfpPashaievaShevchenkoParser.VoidFuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#funcArgs}.
	 * @param ctx the parse tree
	 */
	void enterFuncArgs(OfpPashaievaShevchenkoParser.FuncArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#funcArgs}.
	 * @param ctx the parse tree
	 */
	void exitFuncArgs(OfpPashaievaShevchenkoParser.FuncArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(OfpPashaievaShevchenkoParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(OfpPashaievaShevchenkoParser.DatatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(OfpPashaievaShevchenkoParser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(OfpPashaievaShevchenkoParser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#ifDef}.
	 * @param ctx the parse tree
	 */
	void enterIfDef(OfpPashaievaShevchenkoParser.IfDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#ifDef}.
	 * @param ctx the parse tree
	 */
	void exitIfDef(OfpPashaievaShevchenkoParser.IfDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#voidIfDef}.
	 * @param ctx the parse tree
	 */
	void enterVoidIfDef(OfpPashaievaShevchenkoParser.VoidIfDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#voidIfDef}.
	 * @param ctx the parse tree
	 */
	void exitVoidIfDef(OfpPashaievaShevchenkoParser.VoidIfDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#whileDef}.
	 * @param ctx the parse tree
	 */
	void enterWhileDef(OfpPashaievaShevchenkoParser.WhileDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#whileDef}.
	 * @param ctx the parse tree
	 */
	void exitWhileDef(OfpPashaievaShevchenkoParser.WhileDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#voidWhileDef}.
	 * @param ctx the parse tree
	 */
	void enterVoidWhileDef(OfpPashaievaShevchenkoParser.VoidWhileDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#voidWhileDef}.
	 * @param ctx the parse tree
	 */
	void exitVoidWhileDef(OfpPashaievaShevchenkoParser.VoidWhileDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#statOrBlock}.
	 * @param ctx the parse tree
	 */
	void enterStatOrBlock(OfpPashaievaShevchenkoParser.StatOrBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#statOrBlock}.
	 * @param ctx the parse tree
	 */
	void exitStatOrBlock(OfpPashaievaShevchenkoParser.StatOrBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#voidStatOrBlock}.
	 * @param ctx the parse tree
	 */
	void enterVoidStatOrBlock(OfpPashaievaShevchenkoParser.VoidStatOrBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#voidStatOrBlock}.
	 * @param ctx the parse tree
	 */
	void exitVoidStatOrBlock(OfpPashaievaShevchenkoParser.VoidStatOrBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(OfpPashaievaShevchenkoParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(OfpPashaievaShevchenkoParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#funcBlock}.
	 * @param ctx the parse tree
	 */
	void enterFuncBlock(OfpPashaievaShevchenkoParser.FuncBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#funcBlock}.
	 * @param ctx the parse tree
	 */
	void exitFuncBlock(OfpPashaievaShevchenkoParser.FuncBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#voidBlock}.
	 * @param ctx the parse tree
	 */
	void enterVoidBlock(OfpPashaievaShevchenkoParser.VoidBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#voidBlock}.
	 * @param ctx the parse tree
	 */
	void exitVoidBlock(OfpPashaievaShevchenkoParser.VoidBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(OfpPashaievaShevchenkoParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(OfpPashaievaShevchenkoParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#voidStat}.
	 * @param ctx the parse tree
	 */
	void enterVoidStat(OfpPashaievaShevchenkoParser.VoidStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#voidStat}.
	 * @param ctx the parse tree
	 */
	void exitVoidStat(OfpPashaievaShevchenkoParser.VoidStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#scStat}.
	 * @param ctx the parse tree
	 */
	void enterScStat(OfpPashaievaShevchenkoParser.ScStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#scStat}.
	 * @param ctx the parse tree
	 */
	void exitScStat(OfpPashaievaShevchenkoParser.ScStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#voidScStat}.
	 * @param ctx the parse tree
	 */
	void enterVoidScStat(OfpPashaievaShevchenkoParser.VoidScStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#voidScStat}.
	 * @param ctx the parse tree
	 */
	void exitVoidScStat(OfpPashaievaShevchenkoParser.VoidScStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#voidScStatValue}.
	 * @param ctx the parse tree
	 */
	void enterVoidScStatValue(OfpPashaievaShevchenkoParser.VoidScStatValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#voidScStatValue}.
	 * @param ctx the parse tree
	 */
	void exitVoidScStatValue(OfpPashaievaShevchenkoParser.VoidScStatValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(OfpPashaievaShevchenkoParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(OfpPashaievaShevchenkoParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#arrSet}.
	 * @param ctx the parse tree
	 */
	void enterArrSet(OfpPashaievaShevchenkoParser.ArrSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#arrSet}.
	 * @param ctx the parse tree
	 */
	void exitArrSet(OfpPashaievaShevchenkoParser.ArrSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#complexExpr}.
	 * @param ctx the parse tree
	 */
	void enterComplexExpr(OfpPashaievaShevchenkoParser.ComplexExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#complexExpr}.
	 * @param ctx the parse tree
	 */
	void exitComplexExpr(OfpPashaievaShevchenkoParser.ComplexExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#arrGet}.
	 * @param ctx the parse tree
	 */
	void enterArrGet(OfpPashaievaShevchenkoParser.ArrGetContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#arrGet}.
	 * @param ctx the parse tree
	 */
	void exitArrGet(OfpPashaievaShevchenkoParser.ArrGetContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(OfpPashaievaShevchenkoParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(OfpPashaievaShevchenkoParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#returnExpr}.
	 * @param ctx the parse tree
	 */
	void enterReturnExpr(OfpPashaievaShevchenkoParser.ReturnExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#returnExpr}.
	 * @param ctx the parse tree
	 */
	void exitReturnExpr(OfpPashaievaShevchenkoParser.ReturnExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(OfpPashaievaShevchenkoParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(OfpPashaievaShevchenkoParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#printExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(OfpPashaievaShevchenkoParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#printExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(OfpPashaievaShevchenkoParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#printlnExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrintlnExpr(OfpPashaievaShevchenkoParser.PrintlnExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#printlnExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrintlnExpr(OfpPashaievaShevchenkoParser.PrintlnExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#printable}.
	 * @param ctx the parse tree
	 */
	void enterPrintable(OfpPashaievaShevchenkoParser.PrintableContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#printable}.
	 * @param ctx the parse tree
	 */
	void exitPrintable(OfpPashaievaShevchenkoParser.PrintableContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#intDecl}.
	 * @param ctx the parse tree
	 */
	void enterIntDecl(OfpPashaievaShevchenkoParser.IntDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#intDecl}.
	 * @param ctx the parse tree
	 */
	void exitIntDecl(OfpPashaievaShevchenkoParser.IntDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#floatDecl}.
	 * @param ctx the parse tree
	 */
	void enterFloatDecl(OfpPashaievaShevchenkoParser.FloatDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#floatDecl}.
	 * @param ctx the parse tree
	 */
	void exitFloatDecl(OfpPashaievaShevchenkoParser.FloatDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#charDecl}.
	 * @param ctx the parse tree
	 */
	void enterCharDecl(OfpPashaievaShevchenkoParser.CharDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#charDecl}.
	 * @param ctx the parse tree
	 */
	void exitCharDecl(OfpPashaievaShevchenkoParser.CharDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#boolDecl}.
	 * @param ctx the parse tree
	 */
	void enterBoolDecl(OfpPashaievaShevchenkoParser.BoolDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#boolDecl}.
	 * @param ctx the parse tree
	 */
	void exitBoolDecl(OfpPashaievaShevchenkoParser.BoolDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#strDecl}.
	 * @param ctx the parse tree
	 */
	void enterStrDecl(OfpPashaievaShevchenkoParser.StrDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#strDecl}.
	 * @param ctx the parse tree
	 */
	void exitStrDecl(OfpPashaievaShevchenkoParser.StrDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#intArrDecl}.
	 * @param ctx the parse tree
	 */
	void enterIntArrDecl(OfpPashaievaShevchenkoParser.IntArrDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#intArrDecl}.
	 * @param ctx the parse tree
	 */
	void exitIntArrDecl(OfpPashaievaShevchenkoParser.IntArrDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#floatArrDecl}.
	 * @param ctx the parse tree
	 */
	void enterFloatArrDecl(OfpPashaievaShevchenkoParser.FloatArrDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#floatArrDecl}.
	 * @param ctx the parse tree
	 */
	void exitFloatArrDecl(OfpPashaievaShevchenkoParser.FloatArrDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#charArrDecl}.
	 * @param ctx the parse tree
	 */
	void enterCharArrDecl(OfpPashaievaShevchenkoParser.CharArrDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#charArrDecl}.
	 * @param ctx the parse tree
	 */
	void exitCharArrDecl(OfpPashaievaShevchenkoParser.CharArrDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#intDef}.
	 * @param ctx the parse tree
	 */
	void enterIntDef(OfpPashaievaShevchenkoParser.IntDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#intDef}.
	 * @param ctx the parse tree
	 */
	void exitIntDef(OfpPashaievaShevchenkoParser.IntDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#floatDef}.
	 * @param ctx the parse tree
	 */
	void enterFloatDef(OfpPashaievaShevchenkoParser.FloatDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#floatDef}.
	 * @param ctx the parse tree
	 */
	void exitFloatDef(OfpPashaievaShevchenkoParser.FloatDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#charDef}.
	 * @param ctx the parse tree
	 */
	void enterCharDef(OfpPashaievaShevchenkoParser.CharDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#charDef}.
	 * @param ctx the parse tree
	 */
	void exitCharDef(OfpPashaievaShevchenkoParser.CharDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#boolDef}.
	 * @param ctx the parse tree
	 */
	void enterBoolDef(OfpPashaievaShevchenkoParser.BoolDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#boolDef}.
	 * @param ctx the parse tree
	 */
	void exitBoolDef(OfpPashaievaShevchenkoParser.BoolDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#strDef}.
	 * @param ctx the parse tree
	 */
	void enterStrDef(OfpPashaievaShevchenkoParser.StrDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#strDef}.
	 * @param ctx the parse tree
	 */
	void exitStrDef(OfpPashaievaShevchenkoParser.StrDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#intArrDef}.
	 * @param ctx the parse tree
	 */
	void enterIntArrDef(OfpPashaievaShevchenkoParser.IntArrDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#intArrDef}.
	 * @param ctx the parse tree
	 */
	void exitIntArrDef(OfpPashaievaShevchenkoParser.IntArrDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#floatArrDef}.
	 * @param ctx the parse tree
	 */
	void enterFloatArrDef(OfpPashaievaShevchenkoParser.FloatArrDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#floatArrDef}.
	 * @param ctx the parse tree
	 */
	void exitFloatArrDef(OfpPashaievaShevchenkoParser.FloatArrDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#charArrDef}.
	 * @param ctx the parse tree
	 */
	void enterCharArrDef(OfpPashaievaShevchenkoParser.CharArrDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#charArrDef}.
	 * @param ctx the parse tree
	 */
	void exitCharArrDef(OfpPashaievaShevchenkoParser.CharArrDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#intArrExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntArrExpr(OfpPashaievaShevchenkoParser.IntArrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#intArrExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntArrExpr(OfpPashaievaShevchenkoParser.IntArrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#floatArrExpr}.
	 * @param ctx the parse tree
	 */
	void enterFloatArrExpr(OfpPashaievaShevchenkoParser.FloatArrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#floatArrExpr}.
	 * @param ctx the parse tree
	 */
	void exitFloatArrExpr(OfpPashaievaShevchenkoParser.FloatArrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#charArrExpr}.
	 * @param ctx the parse tree
	 */
	void enterCharArrExpr(OfpPashaievaShevchenkoParser.CharArrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#charArrExpr}.
	 * @param ctx the parse tree
	 */
	void exitCharArrExpr(OfpPashaievaShevchenkoParser.CharArrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#intArr}.
	 * @param ctx the parse tree
	 */
	void enterIntArr(OfpPashaievaShevchenkoParser.IntArrContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#intArr}.
	 * @param ctx the parse tree
	 */
	void exitIntArr(OfpPashaievaShevchenkoParser.IntArrContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#floatArr}.
	 * @param ctx the parse tree
	 */
	void enterFloatArr(OfpPashaievaShevchenkoParser.FloatArrContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#floatArr}.
	 * @param ctx the parse tree
	 */
	void exitFloatArr(OfpPashaievaShevchenkoParser.FloatArrContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#charArr}.
	 * @param ctx the parse tree
	 */
	void enterCharArr(OfpPashaievaShevchenkoParser.CharArrContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#charArr}.
	 * @param ctx the parse tree
	 */
	void exitCharArr(OfpPashaievaShevchenkoParser.CharArrContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#newIntArr}.
	 * @param ctx the parse tree
	 */
	void enterNewIntArr(OfpPashaievaShevchenkoParser.NewIntArrContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#newIntArr}.
	 * @param ctx the parse tree
	 */
	void exitNewIntArr(OfpPashaievaShevchenkoParser.NewIntArrContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#newFloatArr}.
	 * @param ctx the parse tree
	 */
	void enterNewFloatArr(OfpPashaievaShevchenkoParser.NewFloatArrContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#newFloatArr}.
	 * @param ctx the parse tree
	 */
	void exitNewFloatArr(OfpPashaievaShevchenkoParser.NewFloatArrContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#newCharArr}.
	 * @param ctx the parse tree
	 */
	void enterNewCharArr(OfpPashaievaShevchenkoParser.NewCharArrContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#newCharArr}.
	 * @param ctx the parse tree
	 */
	void exitNewCharArr(OfpPashaievaShevchenkoParser.NewCharArrContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#lengthRead}.
	 * @param ctx the parse tree
	 */
	void enterLengthRead(OfpPashaievaShevchenkoParser.LengthReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#lengthRead}.
	 * @param ctx the parse tree
	 */
	void exitLengthRead(OfpPashaievaShevchenkoParser.LengthReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(OfpPashaievaShevchenkoParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(OfpPashaievaShevchenkoParser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#intExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntExpr(OfpPashaievaShevchenkoParser.IntExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#intExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntExpr(OfpPashaievaShevchenkoParser.IntExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#floatExpr}.
	 * @param ctx the parse tree
	 */
	void enterFloatExpr(OfpPashaievaShevchenkoParser.FloatExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#floatExpr}.
	 * @param ctx the parse tree
	 */
	void exitFloatExpr(OfpPashaievaShevchenkoParser.FloatExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#charExpr}.
	 * @param ctx the parse tree
	 */
	void enterCharExpr(OfpPashaievaShevchenkoParser.CharExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#charExpr}.
	 * @param ctx the parse tree
	 */
	void exitCharExpr(OfpPashaievaShevchenkoParser.CharExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#strExpr}.
	 * @param ctx the parse tree
	 */
	void enterStrExpr(OfpPashaievaShevchenkoParser.StrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#strExpr}.
	 * @param ctx the parse tree
	 */
	void exitStrExpr(OfpPashaievaShevchenkoParser.StrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#intLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteral(OfpPashaievaShevchenkoParser.IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#intLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteral(OfpPashaievaShevchenkoParser.IntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(OfpPashaievaShevchenkoParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(OfpPashaievaShevchenkoParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link OfpPashaievaShevchenkoParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(OfpPashaievaShevchenkoParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link OfpPashaievaShevchenkoParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(OfpPashaievaShevchenkoParser.VariableContext ctx);
}