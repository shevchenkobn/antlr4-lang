grammar LispExam;

@header {
package ua.nure.lnu2020.ofp_4dv507.exam.lisp.parsing;
}

programDef : expression+ EOF ;

expression : LRB (funcCall | intExpr | funcDecl | varDecl | println) RRB ;

funcDecl : 'defn' ID '[' (symbol symbol*)? ']' intExpr ;
varDecl : 'def' ID intExpr ;
intExpr : LRB intExpr RRB | ((PLUS | MINUS) intOperand intOperand+) | funcCall | literal ;
intOperand :  symbol | literal | intExpr;
println : 'println' intExpr ;
funcCall : ID (intExpr)* ;
symbol : ID ;
literal : INT_LITERAL ;

WS : [ \t\r\n]+ -> skip ;
COMMENT : ';' ~('\n')* '\r'?'\n' -> skip ;

ID : [a-zA-Z][a-zA-Z0-9_-]* ;
INT_LITERAL : ('1'..'9')('0'..'9')* ;
PLUS : '+' ;
MINUS : '-' ;

LRB : '(' ; // Left Round Bracket
RRB : ')' ;
