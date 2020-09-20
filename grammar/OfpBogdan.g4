grammar OfpBogdan;

@header {
    package ua.nure.lnu2020.ofp_4dv507.bogdan;
}

start : anyFuncDef* mainDef anyFuncDef* EOF;

mainDef : VOID MAIN LRB RRB block ;
anyFuncDef : voidFuncDef | funcDef ;
funcDef : datatype ID funcArgs LCB stat+ RCB ;
voidFuncDef : VOID ID funcArgs voidBlock ; // void function can have empty body while non-void function must have at least one statement, at least one return

funcArgs : LRB (varDef (COMMA varDef)*)? RRB ;

datatype : DT_INT | DT_FLOAT | DT_CHAR | DT_BOOL | DT_STR | DT_INT_ARR | DT_FLOAT_ARR | DT_CHAR_ARR ;
varDef : intDef | floatDef | charDef | boolDef | strDef | intArrDef | floatArrDef | charArrDef ;

ifDef : IF LRB boolExpr RRB statOrBlock (ELSE statOrBlock)? ;
voidIfDef : IF LRB boolExpr RRB voidStatOrBlock (ELSE voidStatOrBlock)? ;
whileDef : WHILE LRB boolExpr RRB statOrBlock ;
voidWhileDef : WHILE LRB boolExpr RRB voidStatOrBlock ;

statOrBlock : stat | block ;
voidStatOrBlock : voidStat | voidBlock ;
block : LCB stat* RCB ;
voidBlock : LCB voidStat* RCB ;

stat : scStat | ifDef | whileDef ;
voidStat : voidScStat | voidIfDef | voidWhileDef ;

// statement with semicolon
scStat : (voidScStatValue | returnExpr) SC ;
voidScStat : voidScStatValue SC ;
voidScStatValue : (intDecl
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
    | printExpr
    | printlnExpr
    |) ; // intentionally allow unlimited amount of semicolons for code similar to python `pass`

assign : ID ASSIGN expr ;
arrSet : arrGet ASSIGN
    (complexExpr
    | intExpr
    | floatExpr
    | charExpr);
complexExpr : funcCall | arrGet ;
arrGet : ID LSB (intExpr | complexExpr) RSB ;
funcCall : ID LRB (expr (COMMA expr)*)? RRB ;
returnExpr : RETURN expr ;

expr : complexExpr
    | ID
    | intExpr
    | charExpr
    | floatExpr
    | boolExpr
    | strExpr
    | intArrExpr // treat {} in non-typed contexts as int[]
    | floatArrExpr
    | charArrExpr;

printExpr : PRINT LRB printable RRB ;
printlnExpr : PRINTLN LRB printable RRB ;
printable : complexExpr | intExpr | floatExpr | boolExpr | charExpr | strExpr ;

intDecl : intDef (ASSIGN intExpr)? ;
floatDecl : floatDef (ASSIGN floatExpr)? ;
charDecl : charDef (ASSIGN charExpr)? ;
boolDecl : boolDef (ASSIGN boolExpr)? ;
strDecl : strDef (ASSIGN strExpr)? ;
intArrDecl : intArrDef (ASSIGN intArrExpr)? ;
floatArrDecl : floatArrDef (ASSIGN floatArrExpr)? ;
charArrDecl : charArrDef (ASSIGN charArrExpr)? ;

intDef : DT_INT ID ;
floatDef : DT_FLOAT ID ;
charDef : DT_CHAR ID ;
boolDef : DT_BOOL ID ;
strDef : DT_STR ID ;
intArrDef : DT_INT_ARR ID ;
floatArrDef : DT_FLOAT_ARR ID ;
charArrDef : DT_CHAR_ARR ID ;

intArrExpr : intArr | newArr | funcCall | ID ;
floatArrExpr : floatArr | newArr | funcCall | ID ;
charArrExpr : charArr | newArr | funcCall | ID ;

intArr : LCB (intExpr (COMMA intExpr)*)? RCB ;
floatArr : LCB (floatExpr (COMMA floatExpr)*)? RCB ;
charArr : LCB (charExpr (COMMA charExpr)*)? RCB ;

newArr : NEW (DT_INT | DT_FLOAT | DT_CHAR) LSB intExpr RSB ;
lengthRead : (intArr | floatArr | charArr | funcCall | STRING | ID) LENGTH ;

boolExpr : LRB boolExpr RRB
    | intExpr EQ intExpr
    | intExpr GT intExpr
    | intExpr LT intExpr
    | floatExpr EQ floatExpr
    | floatExpr GT floatExpr
    | floatExpr LT floatExpr
    | charExpr EQ charExpr
    | boolExpr EQ boolExpr
    | funcCall
    | TRUE | FALSE | ID;
intExpr : MINUS? LRB intExpr RRB
    | intExpr (MULT | DIV) intExpr
    | intExpr (PLUS | MINUS) intExpr
    | MINUS? (complexExpr | lengthRead)
    | int | MINUS? ID;
floatExpr : MINUS? LRB floatExpr RRB
    | floatExpr (MULT | DIV) floatExpr
    | floatExpr (PLUS | MINUS) floatExpr
    | MINUS? complexExpr
    | float | MINUS? ID;
charExpr : complexExpr | QUOTED_CHAR | ID ;
strExpr : funcCall | STRING | ID ;

int : INT_ZERO | MINUS? POSITIVE_INT ;
float : FLOAT_ZERO | MINUS? POSITIVE_FLOAT ;

WS : [ \t\r\n]+ -> skip ;
// using number for channel because cannot use channel names in files with combined grammar
// channel 2 is used for comments only
COMMENT : '#' ~('\n')* '\r'?'\n' -> channel(2);

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
