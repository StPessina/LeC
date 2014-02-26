grammar grammatica;

options {
  k = 1;
  language = Java;
}
@header{
  package JavaPackage;
  
  import lec.semantic.*;
  import lec.vertexInfo.*;
  import lec.storage.IStorage;
  import lec.graphelement.*;
}

@lexer::header{
  package JavaPackage;
}

@members{
  private ParserEnvironment env;
  private IStorage storage;

  public grammaticaParser(TokenStream input, IStorage storage) {
     this(input, new RecognizerSharedState());
     this.storage = storage;
  }
  
  void init () {
    env = new ParserEnvironment(storage);
  }  
}
@lexer::members{
}
 
//produzioni parser
start 
@init{
  System.out.println("Start parsing EBNF\n");
  init();
}
    : istruction*;


/*
* Produzione start: 5 tipologie differenti di produzione
*/
istruction : ( 
          vertexInfo 
        | graphElement
//        | primitive
        | grouping
//        | functional
        | comment
);

/*
* Produzioni utility
*/
assignTag returns [String tag] 
  :  tag_t=tagname equal
     {tag=tag_t;}
  ;
     
equal : EQ;

tagname returns [String tagname] 
  : tag_t=ID
    {tagname=env.parseTagname(tag_t);}
  ;
  
//vDef [String points] returns [Vertex3d v] 
vDef returns [Vertex3d v]
  : (X=num Y=num Z=num) 
    {v=env.translateInVertex3d(X,Y,Z);}
  ;
num returns [float num] 
  : s_num=(INT|FLOAT) 
    {num = env.parseNumber(s_num);}
  ;

/*
* Produzione vertexInfo: relative alle infurormazioni sui vertici
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
singleDef [String type] returns [temp_vertex3d v]
  : tag_t=assignTag v_t=vDef
    {env.addNewVertexInfo(type,tag_t, v_t);}
  ;
multipleDef [String type]
  : 
    LSB (singleDef[type]) (COMMA singleDef[type])* RSB
    ;

//definizione di un insieme di informazioni sui vertici
setDef : LSB (tagname(equal vDef)?) (COMMA tagname(equal vDef)?)* RSB;

// produzioni relative alla definizione di vertici
vertexRule : VERTEX (multipleDef["vertex"]|singleDef["vertex"])SC;
vertexInline returns [Vertex v] 
           : NEW LTB(
                        VERTEX tag_t=assignTag? v_t=vDef
                      )
                   RTB
                   {
                        v = env.addNewVertexInLine(tag_t, v_t);
                   }
           ;
vertexSetRule : VERTEXSET assignTag setDef SC;

// produzioni relative alla definizione di texture coord
vTextureRule : VTEXTURE (multipleDef["texture"]|singleDef["texture"])SC;
vTextureInline returns [VTexture v] 
            : NEW LTB(
                        VTEXTURE tag_t=assignTag? v_t=vDef
                      )
                   RTB
                   {
                      v = env.addNewVTextureInLine(tag_t, v_t);
                   }
           ;

textureSetRule : TEXTURESET assignTag setDef SC;

// produzioni relative alla definizione di normali ai vertici
vNormalRule : VNORMAL (multipleDef["normal"]|singleDef["normal"])SC;
vNormalInline returns [VNormal v] 
            : NEW LTB(
                        VNORMAL tag_t=assignTag? v_t=vDef
                      )
                   RTB
                   {
                      v = env.addNewVNormalInLine(tag_t, v_t);
                   }
           ;
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
pointRule : pointDefinition SC;
pointInLine returns [Point p]
    : POINT tempPoint=singlePointDef
    {p = tempPoint;}
    ;
    
pointDefinition : POINT (singlePointDef|multiplePointDef);
singlePointDef returns [Point p]
            : (( tag_point_or_vertex=tagname (equal (
                              (tag_v=tagname)
                            | (v=vertexInline)))?)
              | v=vertexInline)
              {p = env.addNewPoint(tag_point_or_vertex, tag_v, v);}
            ;
multiplePointDef : LSB (singlePointDef)
                   (COMMA singlePointDef)* RSB;

// produzione relativa alla definizione di una linea
lineRule : tag_line=lineDefinition SC
         {env.saveLine(tag_line);} 
         ;
lineInLine returns [Line line]
                : tag_line = lineDefinition
                {line = env.saveLineInLine(tag_line);}
                ;
lineDefinition returns [String tag_line]
                : {env.initializeTempLine();}
                  LINE tag=assignTag? LSB     (
                                                (   tag_vertex=tagname
                                                  | vertex=vertexInline
                                                ) 
                                                (DEFTEX 
                                                  (   tag_texture1=tagname
                                                    | vTexture1=vTextureInline
                                                  )
                                                )?
                                                {env.addToTempLine(tag_vertex, vertex, tag_texture1, vTexture1);}
                                              )
                                              (COMMA 
                                                (   tag_vertex=tagname
                                                  | vertex=vertexInline
                                                ) 
                                                (DEFTEX 
                                                  (   tag_texture2=tagname
                                                    | vTexture2=vTextureInline
                                                  )
                                                )?
                                                {env.addToTempLine(tag_vertex, vertex, tag_texture2, vTexture2);}
                                              )+
                                          RSB
                                          {tag_line=tag;}
                                          ;
            
// produzione relativa alla definizione di una faccia
faceRule : tag_face=faceDefinition SC
         {env.saveFace(tag_face);} 
         ;
            
faceInLine returns [Face face]
                 : tag_face=faceDefinition
                 {face = env.saveFaceInline(tag_face);}
                 ;
faceDefinition returns [String tag_face]
                 :  {env.initializeTempFace();}
                    FACE tag=assignTag? LSB (
                                       (    tag_vertex=tagname
                                         |  vertex=vertexInline
                                       ) 
                                       (DEFTEX
                                          (   tag_texture1=tagname
                                            | vTexture1=vTextureInline
                                          )
                                       )?
                                       (DEFNORM
                                          (   tag_normal1=tagname
                                            | vNormal1=vNormalInline
                                          )
                                       )?
                                       {env.addToTempFace(tag_vertex, vertex, tag_texture1, vTexture1, tag_normal1, vNormal1);}
                                     )
                                     (COMMA
                                        (   tag_vertex=tagname
                                          | vertex=vertexInline
                                        ) 
                                        (DEFTEX
                                            (   tag_texture2=tagname
                                              | vTexture2=vTextureInline
                                            )
                                        )? 
                                        (DEFNORM
                                            (   tag_normal2=tagname
                                              | vNormal2=vNormalInline
                                            )
                                        )?
                                        {env.addToTempFace(tag_vertex, vertex, tag_texture2, vTexture2, tag_normal2, vNormal2);}
                                     )* 
                                RSB
                          {tag_face=tag;}      
                          ;

/*
* Produzione primitive: relative alle primitive grafiche
*/
primitive : (

);

/*
* Produzione grouping: relative alle funzionalita' di raggruppamento
*/
grouping : (
             groupRule
           | smoothingRule
);

//Raggruppamento
groupRule : GROUP groupTag=assignTag 
            LSB
              {env.initializeGroup(groupTag);}
                  ((GraphElementName1=tagname|NEW LSB (
                                face1=faceInLine
                              | line1=lineInLine
                              | point1=pointInLine
                                   )
                               RTB
                    ) (DEFSMOOTH (smooth_tag1=tagname|smoothingInLine))?          
                  ) {env.addToTempGroup(GraphElementName1, point1, line1, face1, smooth_tag1);}
                  ((COMMA GraphElementName2=tagname|NEW LSB (
                                face2=faceInLine
                              | line2=lineInLine
                              | point2=pointInLine
                                   )
                               RTB
                   ) (DEFSMOOTH (smooth_tag2=tagname|smoothingInLine))?
                     {env.addToTempGroup(GraphElementName2, point2, line2, face2, smooth_tag2);}
                  )*
             RSB SC
             {env.saveGroup();}   
          ;

//Definizione dello smoothing di un gruppo
smoothingRule : SMOOTHING assignTag? (singleSmoothDef|multipleSmoothDef)SC;
singleSmoothDef :  INT;
multipleSmoothDef : LSB (assignTag? INT) (COMMA assignTag? INT)* RSB;
smoothingInLine : NEW LTB (SMOOTHING assignTag? INT) RTB;



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
DEFSMOOTH : 'defsmooth';
BOX : 'box';
NEW : 'new';
//PRIMITIVE : 'box'|'plane';

SCALE : 'scale';
ROTATE : 'rotate';
TRASLATE : 'traslate';
LSB : '[';
RSB : ']';

LTB : '(';
RTB : ')';

COMMA : ',';
EQ : '=';
SC : ';';

//Commenti:
SINGLELINECM : '//' .* ( '\r' | '\n' );
MULTILINETEXTCM : '/*' .* '*/';
     

INT   : ('-')? ('0'..'9')+ ;
FLOAT : ('-')? ('0'..'9')* '.' ('0'..'9')+ ;
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