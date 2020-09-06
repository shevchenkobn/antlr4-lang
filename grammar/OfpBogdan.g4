/**
 * Define a grammar called Expression
 */
grammar OfpBogdan;

@header {
    package ua.nure.lnu2020.ofp_4dv507.bogdan;
}

start : stat+ ;

stat : intExpr SC
     | assign
     ;

intExpr :  rBExpr
        | intExpr (MULT | DIV) intExpr
        | intExpr (PLUS | MINUS) intExpr
        | (INT | ID)
     ;

rBExpr : LRB intExpr RRB ;

assign : ID ASSIGN intExpr SC ;

// Below is checked TODO: [, ] as literal

// arrIndex : ID
newArr : 'new' WS+ (DT_INT | DT_FLOAT | DT_CHAR)'['UINT']' ;
lengthRead : (intArr | floatArr | charArr | STRING | ID) LENGTH ;

intArr : LCB INT (','INT)* RCB ;
floatArr : LCB FLOAT (','FLOAT)* RCB ;
charArr : LCB Q_CHAR (','Q_CHAR)* RCB ;

LENGTH : '.length' ;
ASSIGN : '=' ;
PLUS : '+' ;
MINUS : '-' ;
MULT : '*' ;
DIV : '/' ;
LCB : '{' ; // Left Curly Bracket
RCB : '}' ;
LRB : '(' ; // Left Round Bracket
RRB : ')' ;

DT_ARR : (DT_INT | DT_FLOAT | DT_CHAR)'[]';
DT_BOOL : 'bool' ;
DT_STR : 'string' ;
DT_INT : 'int' ;
DT_FLOAT : 'float' ;
DT_CHAR : 'char' ;

TRUE : 'true' ;
FALSE : 'false' ;
INT : ('-'?POSITIVE_INT) | ZERO ;
UINT : POSITIVE_INT | ZERO ;
ZERO : '0' ;
POSITIVE_INT : ('1'..'9')('0'..'9')* ;
FLOAT : ('-'?(('1'..'9')('0'..'9')*|'0')'.'(('0'..'9')*('1'..'9')('0'..'9')*)) | '0''.''0'+ ;
STRING : '"' CHAR+ '"' ;
Q_CHAR : '\'' CHAR '\'' ; // Quoted char
CHAR : ('a'..'z'|'A'..'Z'|'!'|'.'|','|' '|'?'|'='|':'|'('|')') ;
ID : ('a'..'z'|'A'..'Z')+ ;

SC : ';' ;

WS : [ \t\r\n]+ -> skip ; // TODO: verify on comments
