grammar grammatica;

options {
  k = 1;
  language = Java;
}
@header{
  package JavaPackage;
}

@lexer::header{
  package JavaPackage;
}

@members{
}
@lexer::members{
}
 
//produzioni parser
start 
@init{System.out.println("Start parsing EBNF\n");}
    : istruction*;


/*
* Produzione start: 5 tipologie differenti di produzione
*/
istruction : ( 
          vertexInfo
        | graphElement
//        | primitive
//        | grouping
//        | functional
        | comment
);

/*
* Produzioni utility
*/
assignTag : (tagname equal);
equal : EQ;
tagname : ID;
vDef : (num num num);
num : (INT|FLOAT);

/*
* Produzione vertexInfo: relative alle informazioni sui vertici
*/
vertexInfo : (
               vertexRule
             | vertexSetRule
             | vTextureRule
             | textureSetRule
             | vNormalRule
             | normalSetRule
);

// definizione singola e multipla per tutte le produzioni riguardanti le info
// sui vertici
singleDef : assignTag vDef;
multipleDef : LB (singleDef) (COMMA singleDef)* RB;

//definizione di un insieme di informazioni sui vertici
setDef : LB (tagname(equal vDef)?) (COMMA tagname(equal vDef)?)* RB;

// produzioni relative alla definizione di vertici
vertexRule : VERTEX (multipleDef|singleDef)SC;
vertexInline : VERTEX assignTag? vDef; //per definizione inline
vertexSetRule : VERTEXSET assignTag setDef SC;

// produzioni relative alla definizione di texture coord
vTextureRule : VTEXTURE (multipleDef|singleDef)SC;
vTextureInline : VTEXTURE assignTag? vDef; //per definizione inline
textureSetRule : TEXTURESET assignTag setDef SC;

// produzioni relative alla definizione di normali ai vertici
vNormalRule : VNORMAL (multipleDef|singleDef)SC;
vNormalInline : VNORMAL assignTag? vDef; //per definizione inline
normalSetRule : NORMALSET assignTag setDef SC;

/*
* Produzione graphElement: relative agli elementi grafici
*/
graphElement : (
                 pointRule
               | lineRule
               | faceRule 
);

// produzioni relative alla definizione di un punto
pointRule : POINT (singlePointDef|multiplePointDef) SC;
singlePointDef : (tagname (equal (tagname|vertexInline))?)|(vertexInline);
multiplePointDef : LB (singlePointDef)
                   (COMMA singlePointDef)* RB;

// produzione relativa alla definizione di una linea
lineRule : LINE assignTag? LB ((tagname|vertexInline) 
                                (DEFTEX (tagname|vTextureInline))?)
                            (COMMA (tagname|vertexInline) 
                                (DEFTEX (tagname|vTextureInline))?)+ 
                         RB SC;
            
// produzione relativa alla definizione di una faccia
faceRule : FACE assignTag? LB ((tagname|vertexInline) 
                                (DEFTEX (tagname|vTextureInline))? 
                                (DEFNORM (tagname|vNormalInline))?)
                              //TODO 3 ripetizioni 
                            (COMMA (tagname|vertexInline) 
                                (DEFTEX (tagname|vTextureInline))?
                                (DEFNORM (tagname|vNormalInline))?)* 
                         RB SC;

/*
* Produzione primitive: relative alle primitive grafiche
*/
primitive : (

);

/*
* Produzione grouping: relative alle funzionalit� di raggruppamento
*/
grouping : (
//             groupRule
//          | smoothingRule
);

//groupRule : GROUP assignTag LB 
//                  ID|faceRule|lineRule|pointRule


//singleSmoothDef :  assignTag? INT;
//multipleSmoothDef : assignTag? LB (assignTag? INT) (COMMA assignTag? INT)* RB;
//smoothingRule : SMOOTHING (singleSmoothDef|multipleSmoothDef)SC;


/*
* Produzione grouping: relative alla programmazione funzionale
*/
functional : (
               
);

comment : SINGLELINECM|MULTILINETEXTCM;



   
//lexer
VERTEX  : 'vertex';
VERTEXSET  : 'vertexset';
VTEXTURE  : 'vtexture';
TEXTURESET  : 'textureset';
VNORMAL  : 'vnormal';
NORMALSET  : 'normalset';
POINT  : 'point';
LINE : 'line';
FACE : 'face';
SMOOTHING : 'smoothing';
GROUP : 'group';
ADD : 'add';
DEFTEX : 'deftex';
DEFNORM : 'defnorm';
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

//Commenti:
SINGLELINECM : '//' .* ( '\r' | '\n' );
MULTILINETEXTCM : '/*' .* '*/';
     

INT   : ('0'..'9')+ ;
FLOAT : ('0'..'9')* '.' ('0'..'9')+ ;
ID    : (('a'..'z')|('A'..'Z'))
        (('a'..'z')|('A'..'Z')|('0'..'9')|'_')*;
WS  : ( ' '           
      | '\t'
      | '\r'
      | '\n'
//      ) {$channel=HIDDEN;}
      )+ {skip();}
   ;  
//ERROR : . ;