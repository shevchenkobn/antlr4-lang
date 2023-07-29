package ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.transformation.bytecode;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;
import org.objectweb.asm.Type;
import org.objectweb.asm.commons.GeneratorAdapter;
import org.objectweb.asm.commons.Method;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.parsing.OfpPashaievaShevchenkoParser;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.OfpType;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.Scope;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.symbols.FunctionSymbol;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.symbols.VariableSymbol;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.visitors.BaseOfpVisitor;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.objectweb.asm.Opcodes.*;

public class BytecodeGenerator extends BaseOfpVisitor<Type> {

    private final ClassWriter classWriter;
    private GeneratorAdapter generatorAdapter;
    private static final Map<OfpType, Type> OfpTypeToASMType = new HashMap<>();
    private static final Map<String, String> OfpTypeToJavaType = new HashMap<>();
    private final String className;
    private FunctionSymbol functionSymbol;
    private Scope<VariableSymbol> currentScope;
    private boolean isMain = false;

    public BytecodeGenerator(Scope<FunctionSymbol> globalScope, String className) {
        super(globalScope);
        this.className = className;
        classWriter = new ClassWriter(ClassWriter.COMPUTE_MAXS);
    }

    static {
        OfpTypeToASMType.put(OfpType.INT, Type.INT_TYPE);
        OfpTypeToASMType.put(OfpType.FLOAT, Type.DOUBLE_TYPE);
        OfpTypeToASMType.put(OfpType.CHAR, Type.CHAR_TYPE);
        OfpTypeToASMType.put(OfpType.BOOL, Type.BOOLEAN_TYPE);
        OfpTypeToASMType.put(OfpType.STRING, Type.getType(String.class));
        OfpTypeToASMType.put(OfpType.INT_ARR, Type.getType(int[].class));
        OfpTypeToASMType.put(OfpType.FLOAT_ARR, Type.getType(double[].class));
        OfpTypeToASMType.put(OfpType.CHAR_ARR, Type.getType(char[].class));

        OfpTypeToJavaType.put("int", "int");
        OfpTypeToJavaType.put("float", "double");
        OfpTypeToJavaType.put("char", "char");
        OfpTypeToJavaType.put("bool", "boolean");
        OfpTypeToJavaType.put("string", "String");
        OfpTypeToJavaType.put("int[]", "int[]");
        OfpTypeToJavaType.put("float[]", "double[]");
        OfpTypeToJavaType.put("char[]", "char[]");
    }

    public ClassWriter getClassWriter() {
        return classWriter;
    }

    @Override
    public Type visitProgramDef(OfpPashaievaShevchenkoParser.ProgramDefContext ctx) {
        classWriter.visit(V1_1, ACC_PUBLIC, className, null, "java/lang/Object", null);
        Method m = Method.getMethod("void <init> ()");
        GeneratorAdapter mg = new GeneratorAdapter(ACC_PUBLIC, m, null, null, classWriter);
        mg.loadThis();
        mg.invokeConstructor(Type.getType(Object.class), m);
        mg.returnValue();
        mg.endMethod();

        super.visitProgramDef(ctx);

        classWriter.visitEnd();
        return null;
    }

    @Override
    public Type visitMainDef(OfpPashaievaShevchenkoParser.MainDefContext ctx) {
        isMain = true;
        enterMethod("main", "void", ACC_PUBLIC + ACC_STATIC, null);
        super.visitMainDef(ctx);
        exitMethod();
        isMain = false;
        return null;
    }

    @Override
    public Type visitFuncDef(OfpPashaievaShevchenkoParser.FuncDefContext ctx) {
        enterMethod(ctx.ID().getText(),
                OfpTypeToJavaType.get(ctx.datatype().getText()),
                ACC_PRIVATE + ACC_STATIC,
                ctx.funcArgs().varDef());
        super.visitFuncDef(ctx);
        exitMethod();
        return null;
    }

    @Override
    public Type visitVoidFuncDef(OfpPashaievaShevchenkoParser.VoidFuncDefContext ctx) {
        enterMethod(ctx.ID().getText(),
                "void",
                ACC_PRIVATE + ACC_STATIC,
                ctx.funcArgs().varDef());
        super.visitVoidFuncDef(ctx);
        exitMethod();
        return null;
    }

    @Override
    public Type visitFuncBlock(OfpPashaievaShevchenkoParser.FuncBlockContext ctx) {
        enterBlock(ctx);
        super.visitFuncBlock(ctx);
        exitBlock(ctx);

        return null;
    }

    @Override
    public Type visitVoidBlock(OfpPashaievaShevchenkoParser.VoidBlockContext ctx) {
        enterBlock(ctx);
        super.visitVoidBlock(ctx);
        exitBlock(ctx);

        return null;
    }

    @Override
    public Type visitBlock(OfpPashaievaShevchenkoParser.BlockContext ctx) {
        enterBlock(ctx);
        super.visitBlock(ctx);
        exitBlock(ctx);

        return null;
    }

    @Override
    public Type visitWhileDef(OfpPashaievaShevchenkoParser.WhileDefContext ctx) {
        return loop(ctx);
    }

    @Override
    public Type visitVoidWhileDef(OfpPashaievaShevchenkoParser.VoidWhileDefContext ctx) {
        return loop(ctx);
    }

    @Override
    public Type visitIfDef(OfpPashaievaShevchenkoParser.IfDefContext ctx) {
        return applyCondition(ctx);
    }

    @Override
    public Type visitVoidIfDef(OfpPashaievaShevchenkoParser.VoidIfDefContext ctx) {
        return applyCondition(ctx);
    }

    @Override
    public Type visitFuncCall(OfpPashaievaShevchenkoParser.FuncCallContext ctx) {
        String functionName = ctx.ID().getText();
        var function = globalScope.resolve(functionName);
        String returnType = "void";
        if (function.getType() != null)
            returnType = OfpTypeToJavaType.get(function.getType().getName());

        String methodSignature = returnType + " " + functionName + "(" + getParameters(function) + ")";

        for (OfpPashaievaShevchenkoParser.ExprContext expr: ctx.expr() ) {
            visit(expr);
        }

        generatorAdapter.invokeStatic(Type.getType("L" + className + ";"), Method.getMethod(methodSignature));

        if (function.getType() == null)
            return Type.VOID_TYPE;

        return OfpTypeToASMType.get(function.getType());
    }

    @Override
    public Type visitReturnExpr(OfpPashaievaShevchenkoParser.ReturnExprContext ctx) {
        visit(ctx.expr());
        generatorAdapter.returnValue();
        return null;
    }

    //<editor-fold desc="Print">
    @Override
    public Type visitPrintlnExpr(OfpPashaievaShevchenkoParser.PrintlnExprContext ctx) {
        return print(ctx, "println");
    }

    @Override
    public Type visitPrintExpr(OfpPashaievaShevchenkoParser.PrintExprContext ctx) {
        return print(ctx, "print");
    }
    //</editor-fold>

    //<editor-fold desc="Length">
    @Override
    public Type visitLengthRead(OfpPashaievaShevchenkoParser.LengthReadContext ctx) {
        Type expression;
        if (ctx.STRING() != null)
        {
            String str = ctx.STRING().getText();
            generatorAdapter.push(str.substring(1, str.length() - 1));
            expression = Type.getType(String.class);
        }
        else
            expression  = visit(ctx.getChild(0));

        if (expression.toString().contains("lang/String"))
            generatorAdapter.invokeVirtual(Type.getType(String.class), Method.getMethod("int length ()"));
        else
            generatorAdapter.arrayLength();

        return Type.INT_TYPE;
    }
    //</editor-fold> //f

    //<editor-fold desc="Variable Declarations">
    @Override
    public Type visitIntDecl(OfpPashaievaShevchenkoParser.IntDeclContext ctx) {
        return declareVariable(ctx);
    }

    @Override
    public Type visitFloatDecl(OfpPashaievaShevchenkoParser.FloatDeclContext ctx) {
        return declareVariable(ctx);
    }

    @Override
    public Type visitCharDecl(OfpPashaievaShevchenkoParser.CharDeclContext ctx) {
        return declareVariable(ctx);
    }

    @Override
    public Type visitBoolDecl(OfpPashaievaShevchenkoParser.BoolDeclContext ctx) {
        return declareVariable(ctx);
    }

    @Override
    public Type visitStrDecl(OfpPashaievaShevchenkoParser.StrDeclContext ctx) {
        return declareVariable(ctx);
    }

    @Override
    public Type visitIntArrDecl(OfpPashaievaShevchenkoParser.IntArrDeclContext ctx) {
        return declareVariable(ctx);
    }

    @Override
    public Type visitFloatArrDecl(OfpPashaievaShevchenkoParser.FloatArrDeclContext ctx) {
        return declareVariable(ctx);
    }

    @Override
    public Type visitCharArrDecl(OfpPashaievaShevchenkoParser.CharArrDeclContext ctx) {
        return declareVariable(ctx);
    }
    //</editor-fold>

    @Override
    public Type visitAssign(OfpPashaievaShevchenkoParser.AssignContext ctx) {
        Type rightValueType = visit(ctx.expr());
        VariableSymbol variable = currentScope.resolve(ctx.ID().getText());
        generatorAdapter.storeLocal(indexOfVariable(variable), rightValueType);

        return null;
    }

    //<editor-fold desc="Arrays">

    @Override
    public Type visitArrGet(OfpPashaievaShevchenkoParser.ArrGetContext ctx) {
        var arrType = visit(ctx.getChild(0));
        visit(ctx.intExpr());

        Type type = Type.CHAR_TYPE;
        if (arrType.toString().contains("String")){
            generatorAdapter.invokeVirtual(Type.getType(String.class), Method.getMethod("char charAt ( int )"));
            return Type.CHAR_TYPE;
        }

        if (arrType.toString().contains("I"))
            type = Type.INT_TYPE;
        if (arrType.toString().contains("D"))
            type = Type.DOUBLE_TYPE;

        generatorAdapter.arrayLoad(type);

        return type;
    }

    @Override
    public Type visitArrSet(OfpPashaievaShevchenkoParser.ArrSetContext ctx) {
        var arrType = visit(ctx.getChild(0));
        visit(ctx.getChild(2));

        Type type = Type.CHAR_TYPE;
        if (arrType.toString().contains("I"))
            type = Type.INT_TYPE;
        if (arrType.toString().contains("D"))
            type = Type.DOUBLE_TYPE;

        visit(ctx.getChild(5));
        generatorAdapter.arrayStore(type);
        return null;
    }

    @Override
    public Type visitNewIntArr(OfpPashaievaShevchenkoParser.NewIntArrContext ctx) {
        visit(ctx.intExpr());
        generatorAdapter.newArray(Type.INT_TYPE);
        return Type.getType(int[].class);
    }

    @Override
    public Type visitNewFloatArr(OfpPashaievaShevchenkoParser.NewFloatArrContext ctx) {
        visit(ctx.intExpr());
        generatorAdapter.newArray(Type.DOUBLE_TYPE);
        return Type.getType(double[].class);
    }

    @Override
    public Type visitNewCharArr(OfpPashaievaShevchenkoParser.NewCharArrContext ctx) {
        visit(ctx.intExpr());
        generatorAdapter.newArray(Type.CHAR_TYPE);
        return Type.getType(char[].class);
    }

    @Override
    public Type visitIntArr(OfpPashaievaShevchenkoParser.IntArrContext ctx) {
        return initArray(ctx.intExpr().size(),
                Type.INT_TYPE,
                Type.getType(int[].class),
                ctx.intExpr().toArray(ParserRuleContext[]::new));
    }

    @Override
    public Type visitFloatArr(OfpPashaievaShevchenkoParser.FloatArrContext ctx) {
        return initArray(ctx.floatExpr().size(),
                Type.DOUBLE_TYPE,
                Type.getType(double[].class),
                ctx.floatExpr().toArray(ParserRuleContext[]::new));
    }

    @Override
    public Type visitCharArr(OfpPashaievaShevchenkoParser.CharArrContext ctx) {
        return initArray(ctx.charExpr().size(),
                Type.CHAR_TYPE,
                Type.getType(char[].class),
                ctx.charExpr().toArray(ParserRuleContext[]::new));
    }
    //</editor-fold>

    @Override
    public Type visitIntExpr(OfpPashaievaShevchenkoParser.IntExprContext ctx) {
        if (ctx.children.size() == 3){
            Type resultType = calculate(ctx, ctx.PLUS(), ctx.MINUS(), ctx.MULT(), ctx.DIV());
            if (resultType != null)
                return resultType;
        }

        Type resultType = ctx.LRB() != null
                ? visit(ctx.intExpr(0))
                : super.visitIntExpr(ctx);

        if (ctx.MINUS() != null)
        {
            generatorAdapter.math(GeneratorAdapter.NEG, resultType);
        }

        return resultType;
    }

    @Override
    public Type visitFloatExpr(OfpPashaievaShevchenkoParser.FloatExprContext ctx) {
        if (ctx.children.size() == 3){
            Type resultType = calculate(ctx, ctx.PLUS(), ctx.MINUS(), ctx.MULT(), ctx.DIV());
            if (resultType != null)
                return resultType;
        }

        Type resultType = ctx.LRB() != null
                ? visit(ctx.floatExpr(0))
                : super.visitFloatExpr(ctx);

        if (ctx.MINUS() != null) {
            generatorAdapter.math(GeneratorAdapter.NEG, resultType);
        }

        return resultType;
    }

    @Override
    public Type visitBoolExpr(OfpPashaievaShevchenkoParser.BoolExprContext ctx) {
        if (ctx.LRB() != null)
            return visit(ctx.boolExpr(0));
        if (ctx.GT() != null)
            return calculateCondition(ctx, GeneratorAdapter.GT);
        if (ctx.LT() != null)
            return calculateCondition(ctx, GeneratorAdapter.LT);
        if (ctx.EQ() != null)
            return calculateCondition(ctx, GeneratorAdapter.EQ);
        if (ctx.TRUE() != null) {
            generatorAdapter.push(true);
            return Type.BOOLEAN_TYPE;
        }
        if (ctx.FALSE() != null) {
            generatorAdapter.push(false);
            return Type.BOOLEAN_TYPE;
        }

        return super.visitBoolExpr(ctx);
    }

    @Override
    public Type visitCharExpr(OfpPashaievaShevchenkoParser.CharExprContext ctx) {
        if (ctx.QUOTED_CHAR() != null){
            String str = ctx.QUOTED_CHAR().getText();
            generatorAdapter.push(str.charAt(1));
            return Type.CHAR_TYPE;
        }

        return super.visitCharExpr(ctx);
    }

    @Override
    public Type visitStrExpr(OfpPashaievaShevchenkoParser.StrExprContext ctx) {
        if (ctx.STRING() != null){
            String str = ctx.STRING().getText();
            generatorAdapter.push(str.substring(1, str.length() - 1));
            return Type.getType(String.class);
        }

        return super.visitStrExpr(ctx);
    }

    @Override
    public Type visitVariable(OfpPashaievaShevchenkoParser.VariableContext ctx) {
        String variableName = ctx.ID().getText();
        VariableSymbol resolveVariable = currentScope.resolve(variableName);
        int variableIndex = indexOfVariable(resolveVariable);

        if (resolveVariable instanceof FunctionSymbol.ParameterSymbol)
            generatorAdapter.loadArg(variableIndex);
        else
            generatorAdapter.loadLocal(variableIndex);

        return OfpTypeToASMType.get(resolveVariable.getType());
    }

    @Override
    public Type visitIntLiteral(OfpPashaievaShevchenkoParser.IntLiteralContext ctx) {
        var text = ctx.getText();
        int value;
        try {
            value = Integer.parseInt(text);
        } catch (NumberFormatException exception) {
            if (text.charAt(0) == '-') {
                value = Integer.MIN_VALUE;
            } else {
                value = Integer.MAX_VALUE;
            }
        }
        generatorAdapter.push(value);
        return Type.INT_TYPE;
    }

    @Override
    public Type visitFloatLiteral(OfpPashaievaShevchenkoParser.FloatLiteralContext ctx) {
        generatorAdapter.push(Double.parseDouble(ctx.getText()));
        return Type.DOUBLE_TYPE;
    }

    private void enterMethod(String methodName, String returnType, int type, List<OfpPashaievaShevchenkoParser.VarDefContext> args)
    {
        functionSymbol = globalScope.resolve(methodName);
        var argsTypes = isMain ? "String[]" : getParameters(functionSymbol);
        String methodSignature = returnType + " " + methodName + " (" + argsTypes + ")";
        Method method = Method.getMethod(methodSignature);

        generatorAdapter = new GeneratorAdapter(type, method, null, null, classWriter);
    }

    private void exitMethod() {
        var type = functionSymbol.getType();
        if (type != null) {
            switch (type) {
                case INT:
                    generatorAdapter.push(0);
                    break;
                case FLOAT:
                    generatorAdapter.push(0.0d);
                    break;
                case CHAR:
                    generatorAdapter.push(' ');
                    break;
                case STRING:
                    generatorAdapter.push(" ");
                    break;
                case INT_ARR:
                    initArray(0, Type.INT_TYPE, Type.getType(int[].class), new ParserRuleContext[] {});
                    break;
                case FLOAT_ARR:
                    initArray(0, Type.FLOAT_TYPE, Type.getType(double[].class), new ParserRuleContext[] {});
                    break;
                case CHAR_ARR:
                    initArray(0, Type.CHAR_TYPE, Type.getType(char[].class), new ParserRuleContext[] {});
                    break;
            }
        }
        generatorAdapter.returnValue();
        generatorAdapter.endMethod();
    }

    private void enterBlock(ParserRuleContext ctx){
        if (currentScope == null) {
            currentScope = functionSymbol.getVariableScope();
        } else {
            currentScope = currentScope.getEnclosedScope(ctx);
        }
    }

    private void exitBlock(ParserRuleContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

    private Type applyCondition(ParserRuleContext ctx){
        visit(ctx.getChild(2));
        generatorAdapter.push(true);

        Label exitLabel = new Label();
        Label ifBodyLabel = new Label();
        generatorAdapter.ifCmp(Type.BOOLEAN_TYPE, GeneratorAdapter.EQ, ifBodyLabel);
        var elseBlock = ctx.getChild(6);
        if (elseBlock != null)
            visit(elseBlock);
        generatorAdapter.goTo(exitLabel);
        generatorAdapter.mark(ifBodyLabel);
        visit(ctx.getChild(4));
        generatorAdapter.mark(exitLabel);

        return null;
    }

    private Type loop(ParserRuleContext ctx){
        Label whileBodyLabel = new Label();
        Label exitLabel = new Label();

        generatorAdapter.goTo(exitLabel);
        generatorAdapter.mark(whileBodyLabel);
        visit(ctx.getChild(4));
        generatorAdapter.mark(exitLabel);
        visit(ctx.getChild(2));
        generatorAdapter.push(true);
        generatorAdapter.ifCmp(Type.BOOLEAN_TYPE, GeneratorAdapter.EQ, whileBodyLabel);

        return null;
    }

    private Type calculate(ParserRuleContext ctx,
                           TerminalNode plus,
                           TerminalNode minus,
                           TerminalNode mult,
                           TerminalNode divide){
        if (plus != null)
            return calculate(ctx, GeneratorAdapter.ADD);

        if (minus != null)
            return calculate(ctx, GeneratorAdapter.SUB);

        if (mult != null)
            return calculate(ctx, GeneratorAdapter.MUL);

        if (divide != null)
            return calculate(ctx, GeneratorAdapter.DIV);

        return null;
    }

    private Type calculate(ParserRuleContext ctx, int operation){
        Type leftChild = visit(ctx.getChild(0));
        visit(ctx.getChild(2));

        generatorAdapter.math(operation, leftChild);
        return leftChild;
    }

    private Type calculateCondition(ParserRuleContext ctx, int compare){
        Type leftType = visit(ctx.getChild(0));
        visit(ctx.getChild(2));

        Label ifTrue = new Label();
        Label exit = new Label();

        generatorAdapter.ifCmp(leftType, compare, ifTrue);
        generatorAdapter.push(false);
        generatorAdapter.goTo(exit);
        generatorAdapter.mark(ifTrue);
        generatorAdapter.push(true);
        generatorAdapter.mark(exit);

        return Type.BOOLEAN_TYPE;
    }

    private Type declareVariable(ParserRuleContext ctx) {
        String variableName = ctx.getChild(0).getChild(1).getText();

        ParseTree expression = ctx.getChild(2);
        VariableSymbol variable = currentScope.resolve(variableName);
        int index = indexOfVariable(variable);
        if (expression != null){
            Type valueType = visit(expression);
            generatorAdapter.storeLocal(index, valueType);
        }

        return null;
    }

    private Type initArray(int expressionsCount, Type type, Type arrayType, ParserRuleContext[] expressions) {
        generatorAdapter.push(expressionsCount);
        generatorAdapter.newArray(type);

        for (int i = 0; i < expressionsCount; i++){
            generatorAdapter.dup();
            generatorAdapter.push(i);
            visit(expressions[i]);
            generatorAdapter.arrayStore(type);
        }

        return arrayType;
    }

    private Type print(ParserRuleContext ctx, String printFunction){
        generatorAdapter.getStatic(Type.getType(System.class), "out",Type.getType(PrintStream.class));
        Type eType = visit(ctx.getChild(2));
        String type = null;

        if (eType == Type.INT_TYPE) type = "int";
        else if (eType == Type.DOUBLE_TYPE) type = "double";
        else if (eType == Type.CHAR_TYPE) type = "char";
        else if (eType == Type.BOOLEAN_TYPE) type = "boolean";
        else if (eType.toString().contains("java/lang/String")) type = "java.lang.String";

        generatorAdapter.invokeVirtual(Type.getType(PrintStream.class),
                Method.getMethod("void " + printFunction + " ("+ type + ")"));

        return null;
    }

    private int indexOfVariable(VariableSymbol variable) {
        var index = functionSymbol.indexOf(variable);
        return isMain ? index + 1 : index;
    }

    private String getParameters(FunctionSymbol function) {
        return String.join(", ", Arrays
                .stream(function.getArguments())
                .map(x->OfpTypeToJavaType.get(x.getType().getName()))
                .toArray(String[]::new));
    }


}
