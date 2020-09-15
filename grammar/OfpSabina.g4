grammar OfpSabina;

@header {
    package ua.nure.lnu2020.ofp_4dv507.sabina;
}

start :  funcDef* mainDef funcDef*;

mainDef : VOID MAIN LRB RRB block ;

funcDef : (VOID
    | INT_TYPE
    | CHAR_TYPE
    | FLOAT_TYPE
    | BOOL_TYPE
    | STR_TYPE
    | INT_ARR_TYPE
    | FLOAT_ARR_TYPE
    | CHAR_ARR_TYPE) ID LRB (param (COMMA param)*)? RRB  block ;
param : intDef | floatDef | charDef | boolDef | strDef | intArrDef | floatArrDef | charArrDef ;

block : LCB stat* RCB ;
stat : (statLine SC) | ifDef | whileDef  ;

ifDef : IF LRB boolExpr RRB (stat | block) (ELSE (stat | block))? ;
whileDef : WHILE LRB boolExpr RRB (stat | block) ;

statLine : (intDecl
    | floatDecl
    | charDecl
    | boolDecl
    | strDecl
    | intArrDecl
    | floatArrDecl
    | charArrDecl
    | arrItemSet
    | assign
    | printExpr
    | printlnExpr
    | returnExp);

expr : arrItemGet
    | funcCallExpr
    | boolExpr
    | intExpr
    | floatExpr
    | charArrExpr
    | strExpr
    | intArrExpr
    | floatArrExpr
    | charArrExpr ;

intDecl : intDef (ASSIGN intExpr)? ;
floatDecl : floatDef (ASSIGN floatExpr)? ;
charDecl : charDef (ASSIGN charExpr)? ;
boolDecl : boolDef (ASSIGN boolExpr)? ;
strDecl : strDef (ASSIGN strExpr)? ;
intArrDecl : intArrDef (ASSIGN intArrExpr)? ;
floatArrDecl : floatArrDef (ASSIGN floatArrExpr)? ;
charArrDecl : charArrDef (ASSIGN charArrExpr)? ;
arrItemSet: arrItemGet ASSIGN (intExpr | floatExpr | charExpr) ;
arrItemGet : ID LSB intExpr RSB ;

boolExpr : LRB boolExpr RRB
    | intExpr (EQ | GT | LT) intExpr
    | floatExpr (EQ | GT | LT) floatExpr
    | charExpr EQ charExpr
    | boolExpr EQ boolExpr
    | funcCallExpr
    | TRUE
    | FALSE
     | ID;
intExpr : LRB intExpr RRB
    | intExpr (MULT | DIV) intExpr
    | intExpr (PLUS | MINUS) intExpr
    | arrItemGet
    | lengthExpr
    | funcCallExpr
    | INT
    | ID ;
floatExpr : LRB floatExpr RRB
    | floatExpr (MULT | DIV) floatExpr
    | floatExpr (PLUS | MINUS) floatExpr
    | arrItemGet
    | float
    | funcCallExpr
    | ID;
charExpr : arrItemGet | funcCallExpr | QUOTED_CHAR | ID ;
strExpr : funcCallExpr | STRING | ID ;
intArrExpr : intArr | newArr | funcCallExpr | ID ;
floatArrExpr : floatArr | newArr | funcCallExpr| ID ;
charArrExpr : charArr | newArr | funcCallExpr | ID ;
returnExp : RETURN expr ;
printExpr : PRINT LRB supportedPrintExpr RRB ;
printlnExpr : PRINTLN LRB supportedPrintExpr RRB ;
newArr : NEW (INT_TYPE | FLOAT_TYPE | CHAR_TYPE) LSB intExpr RSB ;
lengthExpr : (intArr | floatArr | charArr | STRING | ID) LENGTH ;
funcCallExpr : ID LRB (expr (COMMA expr)*)? RRB ;

intArr : LCB (intExpr (COMMA intExpr)*)? RCB ;
floatArr : LCB (floatExpr (COMMA floatExpr)*)? RCB ;
charArr : LCB (charExpr (COMMA charExpr)*)? RCB ;

supportedPrintExpr : intExpr | floatExpr | boolExpr | charExpr | strExpr ;
assign : ID ASSIGN expr ;

intDef : INT_TYPE ID ;
floatDef : FLOAT_TYPE ID ;
charDef : CHAR_TYPE ID ;
boolDef : BOOL_TYPE ID ;
strDef : STR_TYPE ID ;
intArrDef : INT_ARR_TYPE ID ;
floatArrDef : FLOAT_ARR_TYPE ID ;
charArrDef : CHAR_ARR_TYPE ID ;

float: INT FRACTION ;

// Lexer Specification ==> Regular Expressions
ASSIGN : '=' ;
PLUS : '+' ;
MINUS : '-' ;
MULT : '*' ;
DIV : '/' ;
GT : '>' ;
LT : '<' ;
EQ : '==' ;
LRB : '(' ;
RRB : ')' ;
LCB : '{' ;
RCB : '}' ;
LSB : '[' ;
RSB : ']' ;

INT_ARR_TYPE : INT_TYPE LSB RSB ;
FLOAT_ARR_TYPE : FLOAT_TYPE LSB RSB ;
CHAR_ARR_TYPE : CHAR_TYPE LSB RSB ;

BOOL_TYPE : 'bool' ;
STR_TYPE : 'string' ;
INT_TYPE : 'int' ;
FLOAT_TYPE : 'float' ;
CHAR_TYPE : 'char' ;

RETURN : 'return' ;
NEW : 'new' ;
LENGTH : '.length' ;
IF : 'if' ;
ELSE : 'else' ;
WHILE : 'while' ;
VOID : 'void' ;
MAIN : 'main' ;
PRINT : 'print' ;
PRINTLN : 'println' ;

WS	:	[ \t\r\n]+ -> skip ;
COMMA : ',' ;

INT : ('-')?('1'..'9')('0'..'9')*|'0' ;
FRACTION : '.'('0'..'9')+ ;
TRUE : 'true' ;
FALSE : 'false' ;
STRING : '"' CHAR+ '"' ;
QUOTED_CHAR : '\'' CHAR '\'' ;
ID  : ('a'..'z'|'A'..'Z')+ ;
CHAR : ('a'..'z'|'A'..'Z'|'!'|'.'|','|' '|'?'|'='|':'|'('|')') ;

SC : ';' ;
COMMENT : '#' ~[\r\n]* -> channel(HIDDEN) ;