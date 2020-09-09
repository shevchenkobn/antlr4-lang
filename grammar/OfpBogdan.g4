/**
 * Define a grammar called Expression
 */
grammar OfpBogdan;

@header {
    package ua.nure.lnu2020.ofp_4dv507.bogdan;
}

start : funcDef* mainDef funcDef* ;

mainDef : VOID MAIN LRB RRB block ;
funcDef : (VOID | datatype) ID LRB (varDef (COMMA varDef)*)? RRB block ;

datatype : DT_INT | DT_FLOAT | DT_CHAR | DT_BOOL | DT_STR | DT_INT_ARR | DT_FLOAT_ARR | DT_CHAR_ARR ;
varDef : intDef | floatDef | charDef | boolDef | strDef | intArrDef | floatArrDef | charArrDef ;

ifDef : IF LRB boolExpr RRB statOrBlock (ELSE statOrBlock)? ;
whileDef : WHILE LRB boolExpr RRB statOrBlock ;

statOrBlock : stat | block ;
block : LCB stat RCB ;

stat : scStat | ifDef | whileDef ;

scStat : (
    | intDecl
    | floatDecl
    | charDecl
    | boolDecl
    | strDecl
    | intArrDecl
    | floatArrDecl
    | charArrDecl
    | assign
    | arrSet
    | funcCall
    | returnExpr
    | printExpr
    | printlnExpr) SC ;

assign : ID ASSIGN (expr | funcCall) ;
arrSet : arrGet ASSIGN
    floatExpr
    | intExpr
    | charExpr;
arrGet : ID LSB intExpr RSB ;
funcCall : ID LRB (expr (COMMA expr)*)? RRB ;
returnExpr : RETURN expr ;

expr : boolExpr
    | intExpr
    | floatExpr
    | charExpr
    | strExpr
    | intArrExpr
    | floatArrExpr
    | charArrExpr ;

printExpr : PRINT LRB printable RRB ;
printlnExpr : PRINTLN LRB printable RRB ;
printable : funcCall | arrGet | intExpr | floatExpr | boolExpr | charExpr | strExpr ;

intDecl : intDef (ASSIGN (intExpr | funcCall))? ;
floatDecl : floatDef (ASSIGN (floatExpr | funcCall))? ;
charDecl : charDef (ASSIGN (charExpr | funcCall))? ;
boolDecl : boolDef (ASSIGN (boolExpr | funcCall))? ;
strDecl : strDef (ASSIGN (strExpr | funcCall))? ;
intArrDecl : intArrDef (ASSIGN (intArrExpr | funcCall))? ;
floatArrDecl : floatArrDef (ASSIGN (floatArrExpr | funcCall))? ;
charArrDecl : charArrDef (ASSIGN (charArrExpr | funcCall))? ;

intDef : DT_INT ID ;
floatDef : DT_FLOAT ID ;
charDef : DT_CHAR ID ;
boolDef : DT_BOOL ID ;
strDef : DT_STR ID ;
intArrDef : DT_INT_ARR ID ;
floatArrDef : DT_FLOAT_ARR ID ;
charArrDef : DT_CHAR_ARR ID ;

intArrExpr : intArr | newIntArr | ID ;
floatArrExpr : floatArr | newFloatArr | ID ;
charArrExpr : charArr | newCharArr | ID ;

intArr : LCB intExpr (COMMA intExpr)* RCB ;
floatArr : LCB floatExpr (COMMA floatExpr)* RCB ;
charArr : LCB charExpr (COMMA charExpr)* RCB ;

newIntArr : NEW DT_INT LSB intExpr RSB ;
newFloatArr : NEW DT_FLOAT LSB intExpr RSB ;
newCharArr : NEW DT_CHAR LSB intExpr RSB ;
lengthRead : (intArr | floatArr | charArr | STRING | ID) LENGTH ;

boolExpr : intExpr EQ intExpr
    | intExpr GT intExpr
    | intExpr LT intExpr
    | floatExpr EQ floatExpr
    | floatExpr GT floatExpr
    | floatExpr LT floatExpr
    | charExpr EQ charExpr
    | funcCall
    | TRUE | FALSE | ID;
intExpr : LRB intExpr RRB
    | intExpr (MULT | DIV) intExpr
    | intExpr (PLUS | MINUS) intExpr
    | funcCall | arrGet | lengthRead
    | int | ID;
floatExpr : LRB floatExpr RRB
    | floatExpr (MULT | DIV) floatExpr
    | floatExpr (PLUS | MINUS) floatExpr
    | funcCall | arrGet
    | float | ID;
charExpr : funcCall | arrGet | QUOTED_CHAR | ID ;
strExpr : funcCall | STRING | ID ;

int : INT_ZERO | '-'?POSITIVE_INT ;
float : FLOAT_ZERO | '-'?POSITIVE_FLOAT ;

WS : [ \t\r\n]+ -> skip ;
// using number because cannot use channel names in files with combined grammar
COMMENT : '#' ~('\r' | '\n')* '\r'?'\n' -> channel(2);

NEW : 'new' ;
LENGTH : '.length' ;
COMMA : ',' ;
ASSIGN : '=' ;
EQ : '==' ;
GT : '>' ;
LT : '<' ;
PLUS : '+' ;
MINUS : '-' ;
MULT : '*' ;
DIV : '/' ;
LCB : '{' ; // Left Curly Bracket
RCB : '}' ;
LRB : '(' ; // Left Round Bracket
RRB : ')' ;
LSB : '[' ; // Left Square Bracket
RSB : ']' ;

DT_INT_ARR : DT_INT LSB RSB ;
DT_FLOAT_ARR : DT_FLOAT LSB RSB ;
DT_CHAR_ARR : DT_CHAR LSB RSB ;
DT_BOOL : 'bool' ;
DT_STR : 'string' ;
DT_INT : 'int' ;
DT_FLOAT : 'float' ;
DT_CHAR : 'char' ;

RETURN : 'return' ;
IF : 'if' ;
ELSE : 'else' ;
WHILE : 'while' ;
VOID : 'void' ;
MAIN : 'main' ;
PRINT : 'print' ;
PRINTLN : 'println' ;
TRUE : 'true' ;
FALSE : 'false' ;
POSITIVE_FLOAT : ('1'..'9')('0'..'9')*'.'('0'..'9')+ | '0.'('0'..'9')*('1'..'9')('0'..'9')* ;
FLOAT_ZERO : '0.''0'+ ;
POSITIVE_INT : ('1'..'9')('0'..'9')*;
INT_ZERO : '0' ;
STRING : '"' CHAR+ '"' ;
QUOTED_CHAR : '\'' CHAR '\'' ;
ID : ('a'..'z'|'A'..'Z')+ ;
CHAR : ('a'..'z'|'A'..'Z'|'!'|'.'|','|' '|'?'|'='|':'|'('|')') ;

SC : ';' ;
