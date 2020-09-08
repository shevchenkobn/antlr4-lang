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

if : IF LRB boolExpr RRB (stat | block) ;
while : WHILE LRB boolExpr RRB (stat | block) ; // FIXME: continue? break?

block : LCB stat+ RCB ;

stat : scStat | if | while ;

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
    | arrAssign
    | funcCall
    | returnExpr
    | printExpr
    | printlnExpr) SC ;

assign : ID ASSIGN expr ;
arrAssign : ID LSB intExpr RSB ASSIGN intExpr
    | floatExpr
    | charExpr;
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
printable : intExpr | floatExpr | boolExpr | charExpr | strExpr ;

// TODO: can be unassigned?
intDecl : intDef ASSIGN intExpr? ;
floatDecl : floatDef ASSIGN floatExpr? ;
charDecl : charDef ASSIGN charExpr? ;
boolDecl : boolDef ASSIGN boolExpr? ;
strDecl : strDef ASSIGN strExpr? ;
intArrDecl : intArrDef ASSIGN intArrExpr? ;
floatArrDecl : floatArrDef ASSIGN floatArrExpr? ;
charArrDecl : charArrDef ASSIGN charArrExpr? ;

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
lengthRead : (intArr | floatArr | charArr | STRING | ID) DOT LENGTH ;

boolExpr : intExpr EQ intExpr
    | intExpr GT intExpr
    | intExpr LT intExpr
    | floatExpr EQ floatExpr
    | floatExpr GT floatExpr
    | floatExpr LT floatExpr
    | charExpr EQ charExpr
    | (TRUE | FALSE | ID);
intExpr :  LRB intExpr RRB
    | intExpr (MULT | DIV) intExpr
    | intExpr (PLUS | MINUS) intExpr
    | lengthRead
    | (INT | ID);
floatExpr :  LRB floatExpr RRB
    | floatExpr (MULT | DIV) floatExpr
    | floatExpr (PLUS | MINUS) floatExpr
    | (FLOAT | ID);
charExpr : Q_CHAR | ID ;
strExpr : STRING | ID ;

NEW : 'new' ;
LENGTH : 'length' ;
DOT : '.' ;
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
WHILE : 'while' ;
VOID : 'void' ;
MAIN : 'main' ;
PRINT : 'print' ;
PRINTLN : 'println' ;
TRUE : 'true' ;
FALSE : 'false' ;
INT : ('-'?('1'..'9')('0'..'9')*) | '0' ;
FLOAT : ('-'?(('1'..'9')('0'..'9')*|'0')'.'(('0'..'9')*('1'..'9')('0'..'9')*)) | '0''.''0'+ ;
STRING : '"' CHAR+ '"' ;
Q_CHAR : '\'' CHAR '\'' ; // Quoted char
CHAR : ('a'..'z'|'A'..'Z'|'!'|'.'|','|' '|'?'|'='|':'|'('|')') ;
ID : ('a'..'z'|'A'..'Z')+ ;

SC : ';' ;

WS : [ \t\r\n]+ -> skip ; // TODO: verify on comments and between
