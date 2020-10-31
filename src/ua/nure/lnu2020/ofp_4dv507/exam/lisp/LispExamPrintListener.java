package ua.nure.lnu2020.ofp_4dv507.exam.lisp;

import ua.nure.lnu2020.ofp_4dv507.exam.lisp.parsing.LispExamBaseListener;
import ua.nure.lnu2020.ofp_4dv507.exam.lisp.parsing.LispExamParser;

import java.io.OutputStream;
import java.io.PrintStream;

public class LispExamPrintListener extends LispExamBaseListener {
    private final PrintStream output;

    LispExamPrintListener(OutputStream output) {
        if (output == null) {
            throw new NullPointerException("output");
        }
        this.output = new PrintStream(output);
    }

    @Override
    public void enterExpression(LispExamParser.ExpressionContext ctx) {
        output.print("expression ");
    }

    @Override
    public void exitExpression(LispExamParser.ExpressionContext ctx) {
        output.println();
    }

    @Override
    public void enterFuncCall(LispExamParser.FuncCallContext ctx) {
        output.print("funcCall " + ctx.ID().getText() + " ( ");
    }

    @Override
    public void exitFuncCall(LispExamParser.FuncCallContext ctx) {
        output.print(") ");
    }

    @Override
    public void enterIntExpr(LispExamParser.IntExprContext ctx) {
        output.print("intExpr ");

        if (ctx.intExpr() != null) {
            output.print("( ");
        } else if (ctx.intOperand().size() > 0) {
            output.print(ctx.PLUS() != null ? "+ " : "- ");
        }
    }

    @Override
    public void exitIntExpr(LispExamParser.IntExprContext ctx) {
        if (ctx.intExpr() != null) {
            output.print(") ");
        }
    }

    @Override
    public void enterFuncDecl(LispExamParser.FuncDeclContext ctx) {
        output.print("funcDecl " + ctx.ID().getText() + " args( ");
    }

    @Override
    public void exitFuncDecl(LispExamParser.FuncDeclContext ctx) {
        output.println(") ");
    }

    @Override
    public void enterVarDecl(LispExamParser.VarDeclContext ctx) {
        output.print("varDecl " + ctx.ID().getText() + " ");
    }

    @Override
    public void enterPrintln(LispExamParser.PrintlnContext ctx) {
        output.print("println ");
    }

    @Override
    public void enterSymbol(LispExamParser.SymbolContext ctx) {
        output.print("symbol(" + ctx.ID().getText() + ") ");
    }

    @Override
    public void enterLiteral(LispExamParser.LiteralContext ctx) {
        output.print("literal(" + ctx.INT_LITERAL() + ") ");
    }
}
