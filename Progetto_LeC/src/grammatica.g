grammar grammatica;

options {
  k = 1;
  language = Java;
}

rule: ;

//lexer

VERTEX  : 'vertex';
VTEXTURE  : 'vtexture';
VNORMAL  : 'vnormal';
POINT  : 'point';
LINE : 'line';
FACE : 'face';
SMOOTHING : 'smoothing';
GROUP : 'group';
ADD : 'add';
WITH : 'with';
BOX : 'box';
//PRIMITIVE : 'box'|'plane';

SCALE : 'scale';
ROTATE : 'rotate';
TRASLATE : 'traslate';
LB : '{';
RB : '}';
COMMA : ',';
EQ : '=';
SC : ';';
CM : '//';

INT   : ('0'..'9')+ ;
FLOAT : ('0'..'9')* '.' ('0'..'9')+ ;
ID    : (('a'..'z')|('A'..'Z'))
        (('a'..'z')|('A'..'Z')|('0'..'9')|'_')*;
WS  : ( ' '           
      | '\t'
      | '\r'
      | '\n'
      ) /*{$channel=HIDDEN;}*/
   ;  
//ERROR : . ;