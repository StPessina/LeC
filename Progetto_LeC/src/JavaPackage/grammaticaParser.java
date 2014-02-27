// $ANTLR 3.4 /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g 2014-02-26 12:36:30

  package JavaPackage;
  
  import lec.semantic.*;
  import lec.vertexInfo.*;
  import lec.storage.IStorage;
  import lec.graphelement.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class grammaticaParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "BOX", "COMMA", "DEFNORM", "DEFSMOOTH", "DEFTEX", "EQ", "FACE", "FLOAT", "GROUP", "ID", "INT", "LINE", "LSB", "LTB", "MULTILINETEXTCM", "NEW", "NORMALSET", "POINT", "ROTATE", "RSB", "RTB", "SC", "SCALE", "SINGLELINECM", "SMOOTHING", "TEXTURESET", "TRASLATE", "VERTEX", "VERTEXSET", "VNORMAL", "VTEXTURE", "WS"
    };

    public static final int EOF=-1;
    public static final int ADD=4;
    public static final int BOX=5;
    public static final int COMMA=6;
    public static final int DEFNORM=7;
    public static final int DEFSMOOTH=8;
    public static final int DEFTEX=9;
    public static final int EQ=10;
    public static final int FACE=11;
    public static final int FLOAT=12;
    public static final int GROUP=13;
    public static final int ID=14;
    public static final int INT=15;
    public static final int LINE=16;
    public static final int LSB=17;
    public static final int LTB=18;
    public static final int MULTILINETEXTCM=19;
    public static final int NEW=20;
    public static final int NORMALSET=21;
    public static final int POINT=22;
    public static final int ROTATE=23;
    public static final int RSB=24;
    public static final int RTB=25;
    public static final int SC=26;
    public static final int SCALE=27;
    public static final int SINGLELINECM=28;
    public static final int SMOOTHING=29;
    public static final int TEXTURESET=30;
    public static final int TRASLATE=31;
    public static final int VERTEX=32;
    public static final int VERTEXSET=33;
    public static final int VNORMAL=34;
    public static final int VTEXTURE=35;
    public static final int WS=36;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public grammaticaParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public grammaticaParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return grammaticaParser.tokenNames; }
    public String getGrammarFileName() { return "/media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g"; }


      private ParserEnvironment env;
      private IStorage storage;

      public grammaticaParser(TokenStream input, IStorage storage) {
         this(input, new RecognizerSharedState());
         this.storage = storage;
      }
      
      void init () {
        env = new ParserEnvironment(storage);
      }  



    // $ANTLR start "start"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:37:1: start : ( istruction )* ;
    public final void start() throws RecognitionException {

          System.out.println("Start parsing EBNF\n");
          init();

        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:42:5: ( ( istruction )* )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:42:7: ( istruction )*
            {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:42:7: ( istruction )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==FACE||LA1_0==GROUP||LA1_0==LINE||LA1_0==MULTILINETEXTCM||(LA1_0 >= NORMALSET && LA1_0 <= POINT)||(LA1_0 >= SINGLELINECM && LA1_0 <= TEXTURESET)||(LA1_0 >= VERTEX && LA1_0 <= VTEXTURE)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:42:7: istruction
            	    {
            	    pushFollow(FOLLOW_istruction_in_start68);
            	    istruction();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "start"



    // $ANTLR start "istruction"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:48:1: istruction : ( vertexInfo | graphElement | grouping | comment ) ;
    public final void istruction() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:48:12: ( ( vertexInfo | graphElement | grouping | comment ) )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:48:14: ( vertexInfo | graphElement | grouping | comment )
            {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:48:14: ( vertexInfo | graphElement | grouping | comment )
            int alt2=4;
            switch ( input.LA(1) ) {
            case NORMALSET:
            case TEXTURESET:
            case VERTEX:
            case VERTEXSET:
            case VNORMAL:
            case VTEXTURE:
                {
                alt2=1;
                }
                break;
            case FACE:
            case LINE:
            case POINT:
                {
                alt2=2;
                }
                break;
            case GROUP:
            case SMOOTHING:
                {
                alt2=3;
                }
                break;
            case MULTILINETEXTCM:
            case SINGLELINECM:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:49:11: vertexInfo
                    {
                    pushFollow(FOLLOW_vertexInfo_in_istruction93);
                    vertexInfo();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:50:11: graphElement
                    {
                    pushFollow(FOLLOW_graphElement_in_istruction106);
                    graphElement();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:52:11: grouping
                    {
                    pushFollow(FOLLOW_grouping_in_istruction119);
                    grouping();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:54:11: comment
                    {
                    pushFollow(FOLLOW_comment_in_istruction132);
                    comment();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "istruction"



    // $ANTLR start "assignTag"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:60:1: assignTag returns [String tag] : tag_t= tagname equal ;
    public final String assignTag() throws RecognitionException {
        String tag = null;


        String tag_t =null;


        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:61:3: (tag_t= tagname equal )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:61:6: tag_t= tagname equal
            {
            pushFollow(FOLLOW_tagname_in_assignTag154);
            tag_t=tagname();

            state._fsp--;


            pushFollow(FOLLOW_equal_in_assignTag156);
            equal();

            state._fsp--;


            tag=tag_t;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return tag;
    }
    // $ANTLR end "assignTag"



    // $ANTLR start "equal"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:65:1: equal : EQ ;
    public final void equal() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:65:7: ( EQ )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:65:9: EQ
            {
            match(input,EQ,FOLLOW_EQ_in_equal179); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "equal"



    // $ANTLR start "tagname"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:67:1: tagname returns [String tagname] : tag_t= ID ;
    public final String tagname() throws RecognitionException {
        String tagname = null;


        Token tag_t=null;

        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:68:3: (tag_t= ID )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:68:5: tag_t= ID
            {
            tag_t=(Token)match(input,ID,FOLLOW_ID_in_tagname196); 

            tagname=env.parseTagname(tag_t);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return tagname;
    }
    // $ANTLR end "tagname"



    // $ANTLR start "vDef"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:73:1: vDef returns [Vertex3d v] : (X= num Y= num Z= num ) ;
    public final Vertex3d vDef() throws RecognitionException {
        Vertex3d v = null;


        float X =0.0f;

        float Y =0.0f;

        float Z =0.0f;


        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:74:3: ( (X= num Y= num Z= num ) )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:74:5: (X= num Y= num Z= num )
            {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:74:5: (X= num Y= num Z= num )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:74:6: X= num Y= num Z= num
            {
            pushFollow(FOLLOW_num_in_vDef225);
            X=num();

            state._fsp--;


            pushFollow(FOLLOW_num_in_vDef229);
            Y=num();

            state._fsp--;


            pushFollow(FOLLOW_num_in_vDef233);
            Z=num();

            state._fsp--;


            }


            v=env.translateInVertex3d(X,Y,Z);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return v;
    }
    // $ANTLR end "vDef"



    // $ANTLR start "num"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:77:1: num returns [float num] : s_num= ( INT | FLOAT ) ;
    public final float num() throws RecognitionException {
        float num = 0.0f;


        Token s_num=null;

        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:78:3: (s_num= ( INT | FLOAT ) )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:78:5: s_num= ( INT | FLOAT )
            {
            s_num=(Token)input.LT(1);

            if ( input.LA(1)==FLOAT||input.LA(1)==INT ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            num = env.parseNumber(s_num);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return num;
    }
    // $ANTLR end "num"



    // $ANTLR start "vertexInfo"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:85:1: vertexInfo : ( vertexRule | vertexSetRule | vTextureRule | textureSetRule | vNormalRule | normalSetRule ) ;
    public final void vertexInfo() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:85:12: ( ( vertexRule | vertexSetRule | vTextureRule | textureSetRule | vNormalRule | normalSetRule ) )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:85:14: ( vertexRule | vertexSetRule | vTextureRule | textureSetRule | vNormalRule | normalSetRule )
            {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:85:14: ( vertexRule | vertexSetRule | vTextureRule | textureSetRule | vNormalRule | normalSetRule )
            int alt3=6;
            switch ( input.LA(1) ) {
            case VERTEX:
                {
                alt3=1;
                }
                break;
            case VERTEXSET:
                {
                alt3=2;
                }
                break;
            case VTEXTURE:
                {
                alt3=3;
                }
                break;
            case TEXTURESET:
                {
                alt3=4;
                }
                break;
            case VNORMAL:
                {
                alt3=5;
                }
                break;
            case NORMALSET:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:86:16: vertexRule
                    {
                    pushFollow(FOLLOW_vertexRule_in_vertexInfo301);
                    vertexRule();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:87:16: vertexSetRule
                    {
                    pushFollow(FOLLOW_vertexSetRule_in_vertexInfo318);
                    vertexSetRule();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:88:16: vTextureRule
                    {
                    pushFollow(FOLLOW_vTextureRule_in_vertexInfo335);
                    vTextureRule();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:89:16: textureSetRule
                    {
                    pushFollow(FOLLOW_textureSetRule_in_vertexInfo352);
                    textureSetRule();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:90:16: vNormalRule
                    {
                    pushFollow(FOLLOW_vNormalRule_in_vertexInfo369);
                    vNormalRule();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:91:16: normalSetRule
                    {
                    pushFollow(FOLLOW_normalSetRule_in_vertexInfo386);
                    normalSetRule();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "vertexInfo"



    // $ANTLR start "singleDef"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:96:1: singleDef[String type] returns [temp_vertex3d v] : tag_t= assignTag v_t= vDef ;
    public final temp_vertex3d singleDef(String type) throws RecognitionException {
        temp_vertex3d v = null;


        String tag_t =null;

        Vertex3d v_t =null;


        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:97:3: (tag_t= assignTag v_t= vDef )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:97:5: tag_t= assignTag v_t= vDef
            {
            pushFollow(FOLLOW_assignTag_in_singleDef408);
            tag_t=assignTag();

            state._fsp--;


            pushFollow(FOLLOW_vDef_in_singleDef412);
            v_t=vDef();

            state._fsp--;


            env.addNewVertexInfo(type,tag_t, v_t);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return v;
    }
    // $ANTLR end "singleDef"



    // $ANTLR start "multipleDef"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:100:1: multipleDef[String type] : LSB ( singleDef[type] ) ( COMMA singleDef[type] )* RSB ;
    public final void multipleDef(String type) throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:101:3: ( LSB ( singleDef[type] ) ( COMMA singleDef[type] )* RSB )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:102:5: LSB ( singleDef[type] ) ( COMMA singleDef[type] )* RSB
            {
            match(input,LSB,FOLLOW_LSB_in_multipleDef437); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:102:9: ( singleDef[type] )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:102:10: singleDef[type]
            {
            pushFollow(FOLLOW_singleDef_in_multipleDef440);
            singleDef(type);

            state._fsp--;


            }


            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:102:27: ( COMMA singleDef[type] )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==COMMA) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:102:28: COMMA singleDef[type]
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_multipleDef445); 

            	    pushFollow(FOLLOW_singleDef_in_multipleDef447);
            	    singleDef(type);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match(input,RSB,FOLLOW_RSB_in_multipleDef452); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "multipleDef"



    // $ANTLR start "setDef"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:106:1: setDef : LSB ( tagname ( equal vDef )? ) ( COMMA tagname ( equal vDef )? )* RSB ;
    public final void setDef() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:106:8: ( LSB ( tagname ( equal vDef )? ) ( COMMA tagname ( equal vDef )? )* RSB )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:106:10: LSB ( tagname ( equal vDef )? ) ( COMMA tagname ( equal vDef )? )* RSB
            {
            match(input,LSB,FOLLOW_LSB_in_setDef466); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:106:14: ( tagname ( equal vDef )? )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:106:15: tagname ( equal vDef )?
            {
            pushFollow(FOLLOW_tagname_in_setDef469);
            tagname();

            state._fsp--;


            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:106:22: ( equal vDef )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==EQ) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:106:23: equal vDef
                    {
                    pushFollow(FOLLOW_equal_in_setDef471);
                    equal();

                    state._fsp--;


                    pushFollow(FOLLOW_vDef_in_setDef473);
                    vDef();

                    state._fsp--;


                    }
                    break;

            }


            }


            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:106:37: ( COMMA tagname ( equal vDef )? )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==COMMA) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:106:38: COMMA tagname ( equal vDef )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_setDef479); 

            	    pushFollow(FOLLOW_tagname_in_setDef481);
            	    tagname();

            	    state._fsp--;


            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:106:51: ( equal vDef )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==EQ) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:106:52: equal vDef
            	            {
            	            pushFollow(FOLLOW_equal_in_setDef483);
            	            equal();

            	            state._fsp--;


            	            pushFollow(FOLLOW_vDef_in_setDef485);
            	            vDef();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            match(input,RSB,FOLLOW_RSB_in_setDef491); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "setDef"



    // $ANTLR start "vertexRule"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:109:1: vertexRule : VERTEX ( multipleDef[\"vertex\"] | singleDef[\"vertex\"] ) SC ;
    public final void vertexRule() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:109:12: ( VERTEX ( multipleDef[\"vertex\"] | singleDef[\"vertex\"] ) SC )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:109:14: VERTEX ( multipleDef[\"vertex\"] | singleDef[\"vertex\"] ) SC
            {
            match(input,VERTEX,FOLLOW_VERTEX_in_vertexRule500); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:109:21: ( multipleDef[\"vertex\"] | singleDef[\"vertex\"] )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==LSB) ) {
                alt8=1;
            }
            else if ( (LA8_0==ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:109:22: multipleDef[\"vertex\"]
                    {
                    pushFollow(FOLLOW_multipleDef_in_vertexRule503);
                    multipleDef("vertex");

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:109:44: singleDef[\"vertex\"]
                    {
                    pushFollow(FOLLOW_singleDef_in_vertexRule506);
                    singleDef("vertex");

                    state._fsp--;


                    }
                    break;

            }


            match(input,SC,FOLLOW_SC_in_vertexRule509); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "vertexRule"



    // $ANTLR start "vertexInline"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:110:1: vertexInline returns [Vertex v] : NEW LTB ( VERTEX (tag_t= assignTag )? v_t= vDef ) RTB ;
    public final Vertex vertexInline() throws RecognitionException {
        Vertex v = null;


        String tag_t =null;

        Vertex3d v_t =null;


        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:111:12: ( NEW LTB ( VERTEX (tag_t= assignTag )? v_t= vDef ) RTB )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:111:14: NEW LTB ( VERTEX (tag_t= assignTag )? v_t= vDef ) RTB
            {
            match(input,NEW,FOLLOW_NEW_in_vertexInline532); 

            match(input,LTB,FOLLOW_LTB_in_vertexInline534); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:111:21: ( VERTEX (tag_t= assignTag )? v_t= vDef )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:112:25: VERTEX (tag_t= assignTag )? v_t= vDef
            {
            match(input,VERTEX,FOLLOW_VERTEX_in_vertexInline561); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:112:37: (tag_t= assignTag )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:112:37: tag_t= assignTag
                    {
                    pushFollow(FOLLOW_assignTag_in_vertexInline565);
                    tag_t=assignTag();

                    state._fsp--;


                    }
                    break;

            }


            pushFollow(FOLLOW_vDef_in_vertexInline570);
            v_t=vDef();

            state._fsp--;


            }


            match(input,RTB,FOLLOW_RTB_in_vertexInline615); 


                                    v = env.addNewVertexInLine(tag_t, v_t);
                               

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return v;
    }
    // $ANTLR end "vertexInline"



    // $ANTLR start "vertexSetRule"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:119:1: vertexSetRule : VERTEXSET assignTag setDef SC ;
    public final void vertexSetRule() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:119:15: ( VERTEXSET assignTag setDef SC )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:119:17: VERTEXSET assignTag setDef SC
            {
            match(input,VERTEXSET,FOLLOW_VERTEXSET_in_vertexSetRule655); 

            pushFollow(FOLLOW_assignTag_in_vertexSetRule657);
            assignTag();

            state._fsp--;


            pushFollow(FOLLOW_setDef_in_vertexSetRule659);
            setDef();

            state._fsp--;


            match(input,SC,FOLLOW_SC_in_vertexSetRule661); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "vertexSetRule"



    // $ANTLR start "vTextureRule"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:122:1: vTextureRule : VTEXTURE ( multipleDef[\"texture\"] | singleDef[\"texture\"] ) SC ;
    public final void vTextureRule() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:122:14: ( VTEXTURE ( multipleDef[\"texture\"] | singleDef[\"texture\"] ) SC )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:122:16: VTEXTURE ( multipleDef[\"texture\"] | singleDef[\"texture\"] ) SC
            {
            match(input,VTEXTURE,FOLLOW_VTEXTURE_in_vTextureRule670); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:122:25: ( multipleDef[\"texture\"] | singleDef[\"texture\"] )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==LSB) ) {
                alt10=1;
            }
            else if ( (LA10_0==ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:122:26: multipleDef[\"texture\"]
                    {
                    pushFollow(FOLLOW_multipleDef_in_vTextureRule673);
                    multipleDef("texture");

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:122:49: singleDef[\"texture\"]
                    {
                    pushFollow(FOLLOW_singleDef_in_vTextureRule676);
                    singleDef("texture");

                    state._fsp--;


                    }
                    break;

            }


            match(input,SC,FOLLOW_SC_in_vTextureRule679); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "vTextureRule"



    // $ANTLR start "vTextureInline"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:123:1: vTextureInline returns [VTexture v] : NEW LTB ( VTEXTURE (tag_t= assignTag )? v_t= vDef ) RTB ;
    public final VTexture vTextureInline() throws RecognitionException {
        VTexture v = null;


        String tag_t =null;

        Vertex3d v_t =null;


        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:124:13: ( NEW LTB ( VTEXTURE (tag_t= assignTag )? v_t= vDef ) RTB )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:124:15: NEW LTB ( VTEXTURE (tag_t= assignTag )? v_t= vDef ) RTB
            {
            match(input,NEW,FOLLOW_NEW_in_vTextureInline703); 

            match(input,LTB,FOLLOW_LTB_in_vTextureInline705); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:124:22: ( VTEXTURE (tag_t= assignTag )? v_t= vDef )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:125:25: VTEXTURE (tag_t= assignTag )? v_t= vDef
            {
            match(input,VTEXTURE,FOLLOW_VTEXTURE_in_vTextureInline732); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:125:39: (tag_t= assignTag )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:125:39: tag_t= assignTag
                    {
                    pushFollow(FOLLOW_assignTag_in_vTextureInline736);
                    tag_t=assignTag();

                    state._fsp--;


                    }
                    break;

            }


            pushFollow(FOLLOW_vDef_in_vTextureInline741);
            v_t=vDef();

            state._fsp--;


            }


            match(input,RTB,FOLLOW_RTB_in_vTextureInline786); 


                                  v = env.addNewVTextureInLine(tag_t, v_t);
                               

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return v;
    }
    // $ANTLR end "vTextureInline"



    // $ANTLR start "textureSetRule"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:133:1: textureSetRule : TEXTURESET assignTag setDef SC ;
    public final void textureSetRule() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:133:16: ( TEXTURESET assignTag setDef SC )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:133:18: TEXTURESET assignTag setDef SC
            {
            match(input,TEXTURESET,FOLLOW_TEXTURESET_in_textureSetRule827); 

            pushFollow(FOLLOW_assignTag_in_textureSetRule829);
            assignTag();

            state._fsp--;


            pushFollow(FOLLOW_setDef_in_textureSetRule831);
            setDef();

            state._fsp--;


            match(input,SC,FOLLOW_SC_in_textureSetRule833); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "textureSetRule"



    // $ANTLR start "vNormalRule"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:136:1: vNormalRule : VNORMAL ( multipleDef[\"normal\"] | singleDef[\"normal\"] ) SC ;
    public final void vNormalRule() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:136:13: ( VNORMAL ( multipleDef[\"normal\"] | singleDef[\"normal\"] ) SC )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:136:15: VNORMAL ( multipleDef[\"normal\"] | singleDef[\"normal\"] ) SC
            {
            match(input,VNORMAL,FOLLOW_VNORMAL_in_vNormalRule842); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:136:23: ( multipleDef[\"normal\"] | singleDef[\"normal\"] )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==LSB) ) {
                alt12=1;
            }
            else if ( (LA12_0==ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:136:24: multipleDef[\"normal\"]
                    {
                    pushFollow(FOLLOW_multipleDef_in_vNormalRule845);
                    multipleDef("normal");

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:136:46: singleDef[\"normal\"]
                    {
                    pushFollow(FOLLOW_singleDef_in_vNormalRule848);
                    singleDef("normal");

                    state._fsp--;


                    }
                    break;

            }


            match(input,SC,FOLLOW_SC_in_vNormalRule851); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "vNormalRule"



    // $ANTLR start "vNormalInline"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:137:1: vNormalInline returns [VNormal v] : NEW LTB ( VNORMAL (tag_t= assignTag )? v_t= vDef ) RTB ;
    public final VNormal vNormalInline() throws RecognitionException {
        VNormal v = null;


        String tag_t =null;

        Vertex3d v_t =null;


        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:138:13: ( NEW LTB ( VNORMAL (tag_t= assignTag )? v_t= vDef ) RTB )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:138:15: NEW LTB ( VNORMAL (tag_t= assignTag )? v_t= vDef ) RTB
            {
            match(input,NEW,FOLLOW_NEW_in_vNormalInline875); 

            match(input,LTB,FOLLOW_LTB_in_vNormalInline877); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:138:22: ( VNORMAL (tag_t= assignTag )? v_t= vDef )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:139:25: VNORMAL (tag_t= assignTag )? v_t= vDef
            {
            match(input,VNORMAL,FOLLOW_VNORMAL_in_vNormalInline904); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:139:38: (tag_t= assignTag )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:139:38: tag_t= assignTag
                    {
                    pushFollow(FOLLOW_assignTag_in_vNormalInline908);
                    tag_t=assignTag();

                    state._fsp--;


                    }
                    break;

            }


            pushFollow(FOLLOW_vDef_in_vNormalInline913);
            v_t=vDef();

            state._fsp--;


            }


            match(input,RTB,FOLLOW_RTB_in_vNormalInline958); 


                                  v = env.addNewVNormalInLine(tag_t, v_t);
                               

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return v;
    }
    // $ANTLR end "vNormalInline"



    // $ANTLR start "normalSetRule"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:146:1: normalSetRule : NORMALSET assignTag setDef SC ;
    public final void normalSetRule() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:146:15: ( NORMALSET assignTag setDef SC )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:146:17: NORMALSET assignTag setDef SC
            {
            match(input,NORMALSET,FOLLOW_NORMALSET_in_normalSetRule998); 

            pushFollow(FOLLOW_assignTag_in_normalSetRule1000);
            assignTag();

            state._fsp--;


            pushFollow(FOLLOW_setDef_in_normalSetRule1002);
            setDef();

            state._fsp--;


            match(input,SC,FOLLOW_SC_in_normalSetRule1004); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "normalSetRule"



    // $ANTLR start "graphElement"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:151:1: graphElement : ( pointRule | lineRule | faceRule ) ;
    public final void graphElement() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:151:14: ( ( pointRule | lineRule | faceRule ) )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:151:16: ( pointRule | lineRule | faceRule )
            {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:151:16: ( pointRule | lineRule | faceRule )
            int alt14=3;
            switch ( input.LA(1) ) {
            case POINT:
                {
                alt14=1;
                }
                break;
            case LINE:
                {
                alt14=2;
                }
                break;
            case FACE:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:152:18: pointRule
                    {
                    pushFollow(FOLLOW_pointRule_in_graphElement1033);
                    pointRule();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:153:18: lineRule
                    {
                    pushFollow(FOLLOW_lineRule_in_graphElement1052);
                    lineRule();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:154:18: faceRule
                    {
                    pushFollow(FOLLOW_faceRule_in_graphElement1071);
                    faceRule();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "graphElement"



    // $ANTLR start "pointRule"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:158:1: pointRule : pointDefinition SC ;
    public final void pointRule() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:158:11: ( pointDefinition SC )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:158:13: pointDefinition SC
            {
            pushFollow(FOLLOW_pointDefinition_in_pointRule1083);
            pointDefinition();

            state._fsp--;


            match(input,SC,FOLLOW_SC_in_pointRule1085); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "pointRule"



    // $ANTLR start "pointInLine"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:159:1: pointInLine returns [Point p] : POINT tempPoint= singlePointDef ;
    public final Point pointInLine() throws RecognitionException {
        Point p = null;


        Point tempPoint =null;


        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:160:5: ( POINT tempPoint= singlePointDef )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:160:7: POINT tempPoint= singlePointDef
            {
            match(input,POINT,FOLLOW_POINT_in_pointInLine1100); 

            pushFollow(FOLLOW_singlePointDef_in_pointInLine1104);
            tempPoint=singlePointDef();

            state._fsp--;


            p = tempPoint;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return p;
    }
    // $ANTLR end "pointInLine"



    // $ANTLR start "pointDefinition"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:164:1: pointDefinition : POINT ( singlePointDef | multiplePointDef ) ;
    public final void pointDefinition() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:164:17: ( POINT ( singlePointDef | multiplePointDef ) )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:164:19: POINT ( singlePointDef | multiplePointDef )
            {
            match(input,POINT,FOLLOW_POINT_in_pointDefinition1127); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:164:25: ( singlePointDef | multiplePointDef )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==ID||LA15_0==NEW) ) {
                alt15=1;
            }
            else if ( (LA15_0==LSB) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:164:26: singlePointDef
                    {
                    pushFollow(FOLLOW_singlePointDef_in_pointDefinition1130);
                    singlePointDef();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:164:41: multiplePointDef
                    {
                    pushFollow(FOLLOW_multiplePointDef_in_pointDefinition1132);
                    multiplePointDef();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "pointDefinition"



    // $ANTLR start "singlePointDef"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:165:1: singlePointDef returns [Point p] : ( (tag_point_or_vertex= tagname ( equal ( (tag_v= tagname ) | (v= vertexInline ) ) )? ) |v= vertexInline ) ;
    public final Point singlePointDef() throws RecognitionException {
        Point p = null;


        String tag_point_or_vertex =null;

        String tag_v =null;

        Vertex v =null;


        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:166:13: ( ( (tag_point_or_vertex= tagname ( equal ( (tag_v= tagname ) | (v= vertexInline ) ) )? ) |v= vertexInline ) )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:166:15: ( (tag_point_or_vertex= tagname ( equal ( (tag_v= tagname ) | (v= vertexInline ) ) )? ) |v= vertexInline )
            {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:166:15: ( (tag_point_or_vertex= tagname ( equal ( (tag_v= tagname ) | (v= vertexInline ) ) )? ) |v= vertexInline )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==ID) ) {
                alt18=1;
            }
            else if ( (LA18_0==NEW) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:166:16: (tag_point_or_vertex= tagname ( equal ( (tag_v= tagname ) | (v= vertexInline ) ) )? )
                    {
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:166:16: (tag_point_or_vertex= tagname ( equal ( (tag_v= tagname ) | (v= vertexInline ) ) )? )
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:166:18: tag_point_or_vertex= tagname ( equal ( (tag_v= tagname ) | (v= vertexInline ) ) )?
                    {
                    pushFollow(FOLLOW_tagname_in_singlePointDef1161);
                    tag_point_or_vertex=tagname();

                    state._fsp--;


                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:166:46: ( equal ( (tag_v= tagname ) | (v= vertexInline ) ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==EQ) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:166:47: equal ( (tag_v= tagname ) | (v= vertexInline ) )
                            {
                            pushFollow(FOLLOW_equal_in_singlePointDef1164);
                            equal();

                            state._fsp--;


                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:166:53: ( (tag_v= tagname ) | (v= vertexInline ) )
                            int alt16=2;
                            int LA16_0 = input.LA(1);

                            if ( (LA16_0==ID) ) {
                                alt16=1;
                            }
                            else if ( (LA16_0==NEW) ) {
                                alt16=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 16, 0, input);

                                throw nvae;

                            }
                            switch (alt16) {
                                case 1 :
                                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:167:31: (tag_v= tagname )
                                    {
                                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:167:31: (tag_v= tagname )
                                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:167:32: tag_v= tagname
                                    {
                                    pushFollow(FOLLOW_tagname_in_singlePointDef1201);
                                    tag_v=tagname();

                                    state._fsp--;


                                    }


                                    }
                                    break;
                                case 2 :
                                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:168:31: (v= vertexInline )
                                    {
                                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:168:31: (v= vertexInline )
                                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:168:32: v= vertexInline
                                    {
                                    pushFollow(FOLLOW_vertexInline_in_singlePointDef1237);
                                    v=vertexInline();

                                    state._fsp--;


                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:169:17: v= vertexInline
                    {
                    pushFollow(FOLLOW_vertexInline_in_singlePointDef1262);
                    v=vertexInline();

                    state._fsp--;


                    }
                    break;

            }


            p = env.addNewPoint(tag_point_or_vertex, tag_v, v);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return p;
    }
    // $ANTLR end "singlePointDef"



    // $ANTLR start "multiplePointDef"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:172:1: multiplePointDef : LSB ( singlePointDef ) ( COMMA singlePointDef )* RSB ;
    public final void multiplePointDef() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:172:18: ( LSB ( singlePointDef ) ( COMMA singlePointDef )* RSB )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:172:20: LSB ( singlePointDef ) ( COMMA singlePointDef )* RSB
            {
            match(input,LSB,FOLLOW_LSB_in_multiplePointDef1299); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:172:24: ( singlePointDef )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:172:25: singlePointDef
            {
            pushFollow(FOLLOW_singlePointDef_in_multiplePointDef1302);
            singlePointDef();

            state._fsp--;


            }


            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:173:20: ( COMMA singlePointDef )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==COMMA) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:173:21: COMMA singlePointDef
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_multiplePointDef1325); 

            	    pushFollow(FOLLOW_singlePointDef_in_multiplePointDef1327);
            	    singlePointDef();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            match(input,RSB,FOLLOW_RSB_in_multiplePointDef1331); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "multiplePointDef"



    // $ANTLR start "lineRule"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:176:1: lineRule : tag_line= lineDefinition SC ;
    public final void lineRule() throws RecognitionException {
        String tag_line =null;


        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:176:10: (tag_line= lineDefinition SC )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:176:12: tag_line= lineDefinition SC
            {
            pushFollow(FOLLOW_lineDefinition_in_lineRule1342);
            tag_line=lineDefinition();

            state._fsp--;


            match(input,SC,FOLLOW_SC_in_lineRule1344); 

            env.saveLine(tag_line);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "lineRule"



    // $ANTLR start "lineInLine"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:179:1: lineInLine returns [Line line] : tag_line= lineDefinition ;
    public final Line lineInLine() throws RecognitionException {
        Line line = null;


        String tag_line =null;


        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:180:17: (tag_line= lineDefinition )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:180:19: tag_line= lineDefinition
            {
            pushFollow(FOLLOW_lineDefinition_in_lineInLine1397);
            tag_line=lineDefinition();

            state._fsp--;


            line = env.saveLineInLine(tag_line);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return line;
    }
    // $ANTLR end "lineInLine"



    // $ANTLR start "lineDefinition"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:183:1: lineDefinition returns [String tag_line] : LINE (tag= assignTag )? LSB ( (tag_vertex= tagname |vertex= vertexInline ) ( DEFTEX (tag_texture1= tagname |vTexture1= vTextureInline ) )? ) ( COMMA (tag_vertex= tagname |vertex= vertexInline ) ( DEFTEX (tag_texture2= tagname |vTexture2= vTextureInline ) )? )+ RSB ;
    public final String lineDefinition() throws RecognitionException {
        String tag_line = null;


        String tag =null;

        String tag_vertex =null;

        Vertex vertex =null;

        String tag_texture1 =null;

        VTexture vTexture1 =null;

        String tag_texture2 =null;

        VTexture vTexture2 =null;


        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:184:17: ( LINE (tag= assignTag )? LSB ( (tag_vertex= tagname |vertex= vertexInline ) ( DEFTEX (tag_texture1= tagname |vTexture1= vTextureInline ) )? ) ( COMMA (tag_vertex= tagname |vertex= vertexInline ) ( DEFTEX (tag_texture2= tagname |vTexture2= vTextureInline ) )? )+ RSB )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:184:19: LINE (tag= assignTag )? LSB ( (tag_vertex= tagname |vertex= vertexInline ) ( DEFTEX (tag_texture1= tagname |vTexture1= vTextureInline ) )? ) ( COMMA (tag_vertex= tagname |vertex= vertexInline ) ( DEFTEX (tag_texture2= tagname |vTexture2= vTextureInline ) )? )+ RSB
            {
            env.initializeTempLine();

            match(input,LINE,FOLLOW_LINE_in_lineDefinition1479); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:185:27: (tag= assignTag )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:185:27: tag= assignTag
                    {
                    pushFollow(FOLLOW_assignTag_in_lineDefinition1483);
                    tag=assignTag();

                    state._fsp--;


                    }
                    break;

            }


            match(input,LSB,FOLLOW_LSB_in_lineDefinition1486); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:185:47: ( (tag_vertex= tagname |vertex= vertexInline ) ( DEFTEX (tag_texture1= tagname |vTexture1= vTextureInline ) )? )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:186:49: (tag_vertex= tagname |vertex= vertexInline ) ( DEFTEX (tag_texture1= tagname |vTexture1= vTextureInline ) )?
            {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:186:49: (tag_vertex= tagname |vertex= vertexInline )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==ID) ) {
                alt21=1;
            }
            else if ( (LA21_0==NEW) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:186:53: tag_vertex= tagname
                    {
                    pushFollow(FOLLOW_tagname_in_lineDefinition1548);
                    tag_vertex=tagname();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:187:53: vertex= vertexInline
                    {
                    pushFollow(FOLLOW_vertexInline_in_lineDefinition1604);
                    vertex=vertexInline();

                    state._fsp--;


                    }
                    break;

            }


            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:189:49: ( DEFTEX (tag_texture1= tagname |vTexture1= vTextureInline ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==DEFTEX) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:189:50: DEFTEX (tag_texture1= tagname |vTexture1= vTextureInline )
                    {
                    match(input,DEFTEX,FOLLOW_DEFTEX_in_lineDefinition1706); 

                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:190:51: (tag_texture1= tagname |vTexture1= vTextureInline )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==ID) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==NEW) ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;

                    }
                    switch (alt22) {
                        case 1 :
                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:190:55: tag_texture1= tagname
                            {
                            pushFollow(FOLLOW_tagname_in_lineDefinition1765);
                            tag_texture1=tagname();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:191:55: vTexture1= vTextureInline
                            {
                            pushFollow(FOLLOW_vTextureInline_in_lineDefinition1823);
                            vTexture1=vTextureInline();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }


            env.addToTempLine(tag_vertex, vertex, tag_texture1, vTexture1);

            }


            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:196:47: ( COMMA (tag_vertex= tagname |vertex= vertexInline ) ( DEFTEX (tag_texture2= tagname |vTexture2= vTextureInline ) )? )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==COMMA) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:196:48: COMMA (tag_vertex= tagname |vertex= vertexInline ) ( DEFTEX (tag_texture2= tagname |vTexture2= vTextureInline ) )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_lineDefinition2073); 

            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:197:49: (tag_vertex= tagname |vertex= vertexInline )
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==ID) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==NEW) ) {
            	        alt24=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:197:53: tag_vertex= tagname
            	            {
            	            pushFollow(FOLLOW_tagname_in_lineDefinition2130);
            	            tag_vertex=tagname();

            	            state._fsp--;


            	            }
            	            break;
            	        case 2 :
            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:198:53: vertex= vertexInline
            	            {
            	            pushFollow(FOLLOW_vertexInline_in_lineDefinition2186);
            	            vertex=vertexInline();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:200:49: ( DEFTEX (tag_texture2= tagname |vTexture2= vTextureInline ) )?
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==DEFTEX) ) {
            	        alt26=1;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:200:50: DEFTEX (tag_texture2= tagname |vTexture2= vTextureInline )
            	            {
            	            match(input,DEFTEX,FOLLOW_DEFTEX_in_lineDefinition2288); 

            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:201:51: (tag_texture2= tagname |vTexture2= vTextureInline )
            	            int alt25=2;
            	            int LA25_0 = input.LA(1);

            	            if ( (LA25_0==ID) ) {
            	                alt25=1;
            	            }
            	            else if ( (LA25_0==NEW) ) {
            	                alt25=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 25, 0, input);

            	                throw nvae;

            	            }
            	            switch (alt25) {
            	                case 1 :
            	                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:201:55: tag_texture2= tagname
            	                    {
            	                    pushFollow(FOLLOW_tagname_in_lineDefinition2347);
            	                    tag_texture2=tagname();

            	                    state._fsp--;


            	                    }
            	                    break;
            	                case 2 :
            	                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:202:55: vTexture2= vTextureInline
            	                    {
            	                    pushFollow(FOLLOW_vTextureInline_in_lineDefinition2405);
            	                    vTexture2=vTextureInline();

            	                    state._fsp--;


            	                    }
            	                    break;

            	            }


            	            }
            	            break;

            	    }


            	    env.addToTempLine(tag_vertex, vertex, tag_texture2, vTexture2);

            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);


            match(input,RSB,FOLLOW_RSB_in_lineDefinition2651); 

            tag_line=tag;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return tag_line;
    }
    // $ANTLR end "lineDefinition"



    // $ANTLR start "faceRule"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:212:1: faceRule : tag_face= faceDefinition SC ;
    public final void faceRule() throws RecognitionException {
        String tag_face =null;


        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:212:10: (tag_face= faceDefinition SC )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:212:12: tag_face= faceDefinition SC
            {
            pushFollow(FOLLOW_faceDefinition_in_faceRule2761);
            tag_face=faceDefinition();

            state._fsp--;


            match(input,SC,FOLLOW_SC_in_faceRule2763); 

            env.saveFace(tag_face);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "faceRule"



    // $ANTLR start "faceInLine"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:216:1: faceInLine returns [Face face] : tag_face= faceDefinition ;
    public final Face faceInLine() throws RecognitionException {
        Face face = null;


        String tag_face =null;


        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:217:18: (tag_face= faceDefinition )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:217:20: tag_face= faceDefinition
            {
            pushFollow(FOLLOW_faceDefinition_in_faceInLine2828);
            tag_face=faceDefinition();

            state._fsp--;


            face = env.saveFaceInline(tag_face);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return face;
    }
    // $ANTLR end "faceInLine"



    // $ANTLR start "faceDefinition"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:220:1: faceDefinition returns [String tag_face] : FACE (tag= assignTag )? LSB ( (tag_vertex= tagname |vertex= vertexInline ) ( DEFTEX (tag_texture1= tagname |vTexture1= vTextureInline ) )? ( DEFNORM (tag_normal1= tagname |vNormal1= vNormalInline ) )? ) ( COMMA (tag_vertex= tagname |vertex= vertexInline ) ( DEFTEX (tag_texture2= tagname |vTexture2= vTextureInline ) )? ( DEFNORM (tag_normal2= tagname |vNormal2= vNormalInline ) )? )* RSB ;
    public final String faceDefinition() throws RecognitionException {
        String tag_face = null;


        String tag =null;

        String tag_vertex =null;

        Vertex vertex =null;

        String tag_texture1 =null;

        VTexture vTexture1 =null;

        String tag_normal1 =null;

        VNormal vNormal1 =null;

        String tag_texture2 =null;

        VTexture vTexture2 =null;

        String tag_normal2 =null;

        VNormal vNormal2 =null;


        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:221:18: ( FACE (tag= assignTag )? LSB ( (tag_vertex= tagname |vertex= vertexInline ) ( DEFTEX (tag_texture1= tagname |vTexture1= vTextureInline ) )? ( DEFNORM (tag_normal1= tagname |vNormal1= vNormalInline ) )? ) ( COMMA (tag_vertex= tagname |vertex= vertexInline ) ( DEFTEX (tag_texture2= tagname |vTexture2= vTextureInline ) )? ( DEFNORM (tag_normal2= tagname |vNormal2= vNormalInline ) )? )* RSB )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:221:21: FACE (tag= assignTag )? LSB ( (tag_vertex= tagname |vertex= vertexInline ) ( DEFTEX (tag_texture1= tagname |vTexture1= vTextureInline ) )? ( DEFNORM (tag_normal1= tagname |vNormal1= vNormalInline ) )? ) ( COMMA (tag_vertex= tagname |vertex= vertexInline ) ( DEFTEX (tag_texture2= tagname |vTexture2= vTextureInline ) )? ( DEFNORM (tag_normal2= tagname |vNormal2= vNormalInline ) )? )* RSB
            {
            env.initializeTempFace();

            match(input,FACE,FOLLOW_FACE_in_faceDefinition2916); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:222:29: (tag= assignTag )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:222:29: tag= assignTag
                    {
                    pushFollow(FOLLOW_assignTag_in_faceDefinition2920);
                    tag=assignTag();

                    state._fsp--;


                    }
                    break;

            }


            match(input,LSB,FOLLOW_LSB_in_faceDefinition2923); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:222:45: ( (tag_vertex= tagname |vertex= vertexInline ) ( DEFTEX (tag_texture1= tagname |vTexture1= vTextureInline ) )? ( DEFNORM (tag_normal1= tagname |vNormal1= vNormalInline ) )? )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:223:40: (tag_vertex= tagname |vertex= vertexInline ) ( DEFTEX (tag_texture1= tagname |vTexture1= vTextureInline ) )? ( DEFNORM (tag_normal1= tagname |vNormal1= vNormalInline ) )?
            {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:223:40: (tag_vertex= tagname |vertex= vertexInline )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==ID) ) {
                alt29=1;
            }
            else if ( (LA29_0==NEW) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:223:45: tag_vertex= tagname
                    {
                    pushFollow(FOLLOW_tagname_in_faceDefinition2973);
                    tag_vertex=tagname();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:224:45: vertex= vertexInline
                    {
                    pushFollow(FOLLOW_vertexInline_in_faceDefinition3021);
                    vertex=vertexInline();

                    state._fsp--;


                    }
                    break;

            }


            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:226:40: ( DEFTEX (tag_texture1= tagname |vTexture1= vTextureInline ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==DEFTEX) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:226:41: DEFTEX (tag_texture1= tagname |vTexture1= vTextureInline )
                    {
                    match(input,DEFTEX,FOLLOW_DEFTEX_in_faceDefinition3105); 

                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:227:43: (tag_texture1= tagname |vTexture1= vTextureInline )
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==ID) ) {
                        alt30=1;
                    }
                    else if ( (LA30_0==NEW) ) {
                        alt30=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;

                    }
                    switch (alt30) {
                        case 1 :
                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:227:47: tag_texture1= tagname
                            {
                            pushFollow(FOLLOW_tagname_in_faceDefinition3155);
                            tag_texture1=tagname();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:228:47: vTexture1= vTextureInline
                            {
                            pushFollow(FOLLOW_vTextureInline_in_faceDefinition3205);
                            vTexture1=vTextureInline();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }


            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:231:40: ( DEFNORM (tag_normal1= tagname |vNormal1= vNormalInline ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==DEFNORM) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:231:41: DEFNORM (tag_normal1= tagname |vNormal1= vNormalInline )
                    {
                    match(input,DEFNORM,FOLLOW_DEFNORM_in_faceDefinition3333); 

                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:232:43: (tag_normal1= tagname |vNormal1= vNormalInline )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==ID) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==NEW) ) {
                        alt32=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;

                    }
                    switch (alt32) {
                        case 1 :
                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:232:47: tag_normal1= tagname
                            {
                            pushFollow(FOLLOW_tagname_in_faceDefinition3383);
                            tag_normal1=tagname();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:233:47: vNormal1= vNormalInline
                            {
                            pushFollow(FOLLOW_vNormalInline_in_faceDefinition3433);
                            vNormal1=vNormalInline();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }


            env.addToTempFace(tag_vertex, vertex, tag_texture1, vTexture1, tag_normal1, vNormal1);

            }


            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:238:38: ( COMMA (tag_vertex= tagname |vertex= vertexInline ) ( DEFTEX (tag_texture2= tagname |vTexture2= vTextureInline ) )? ( DEFNORM (tag_normal2= tagname |vNormal2= vNormalInline ) )? )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==COMMA) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:238:39: COMMA (tag_vertex= tagname |vertex= vertexInline ) ( DEFTEX (tag_texture2= tagname |vTexture2= vTextureInline ) )? ( DEFNORM (tag_normal2= tagname |vNormal2= vNormalInline ) )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_faceDefinition3639); 

            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:239:41: (tag_vertex= tagname |vertex= vertexInline )
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==ID) ) {
            	        alt34=1;
            	    }
            	    else if ( (LA34_0==NEW) ) {
            	        alt34=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 34, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:239:45: tag_vertex= tagname
            	            {
            	            pushFollow(FOLLOW_tagname_in_faceDefinition3687);
            	            tag_vertex=tagname();

            	            state._fsp--;


            	            }
            	            break;
            	        case 2 :
            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:240:45: vertex= vertexInline
            	            {
            	            pushFollow(FOLLOW_vertexInline_in_faceDefinition3735);
            	            vertex=vertexInline();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:242:41: ( DEFTEX (tag_texture2= tagname |vTexture2= vTextureInline ) )?
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==DEFTEX) ) {
            	        alt36=1;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:242:42: DEFTEX (tag_texture2= tagname |vTexture2= vTextureInline )
            	            {
            	            match(input,DEFTEX,FOLLOW_DEFTEX_in_faceDefinition3821); 

            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:243:45: (tag_texture2= tagname |vTexture2= vTextureInline )
            	            int alt35=2;
            	            int LA35_0 = input.LA(1);

            	            if ( (LA35_0==ID) ) {
            	                alt35=1;
            	            }
            	            else if ( (LA35_0==NEW) ) {
            	                alt35=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 35, 0, input);

            	                throw nvae;

            	            }
            	            switch (alt35) {
            	                case 1 :
            	                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:243:49: tag_texture2= tagname
            	                    {
            	                    pushFollow(FOLLOW_tagname_in_faceDefinition3873);
            	                    tag_texture2=tagname();

            	                    state._fsp--;


            	                    }
            	                    break;
            	                case 2 :
            	                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:244:49: vTexture2= vTextureInline
            	                    {
            	                    pushFollow(FOLLOW_vTextureInline_in_faceDefinition3925);
            	                    vTexture2=vTextureInline();

            	                    state._fsp--;


            	                    }
            	                    break;

            	            }


            	            }
            	            break;

            	    }


            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:247:41: ( DEFNORM (tag_normal2= tagname |vNormal2= vNormalInline ) )?
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==DEFNORM) ) {
            	        alt38=1;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:247:42: DEFNORM (tag_normal2= tagname |vNormal2= vNormalInline )
            	            {
            	            match(input,DEFNORM,FOLLOW_DEFNORM_in_faceDefinition4058); 

            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:248:45: (tag_normal2= tagname |vNormal2= vNormalInline )
            	            int alt37=2;
            	            int LA37_0 = input.LA(1);

            	            if ( (LA37_0==ID) ) {
            	                alt37=1;
            	            }
            	            else if ( (LA37_0==NEW) ) {
            	                alt37=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 37, 0, input);

            	                throw nvae;

            	            }
            	            switch (alt37) {
            	                case 1 :
            	                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:248:49: tag_normal2= tagname
            	                    {
            	                    pushFollow(FOLLOW_tagname_in_faceDefinition4110);
            	                    tag_normal2=tagname();

            	                    state._fsp--;


            	                    }
            	                    break;
            	                case 2 :
            	                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:249:49: vNormal2= vNormalInline
            	                    {
            	                    pushFollow(FOLLOW_vNormalInline_in_faceDefinition4162);
            	                    vNormal2=vNormalInline();

            	                    state._fsp--;


            	                    }
            	                    break;

            	            }


            	            }
            	            break;

            	    }


            	    env.addToTempFace(tag_vertex, vertex, tag_texture2, vTexture2, tag_normal2, vNormal2);

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            match(input,RSB,FOLLOW_RSB_in_faceDefinition4368); 

            tag_face=tag;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return tag_face;
    }
    // $ANTLR end "faceDefinition"



    // $ANTLR start "primitive"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:261:1: primitive : () ;
    public final void primitive() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:261:11: ( () )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:261:13: ()
            {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:261:13: ()
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:263:13: 
            {
            }


            }

        }
        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "primitive"



    // $ANTLR start "grouping"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:268:1: grouping : ( groupRule | smoothingRule ) ;
    public final void grouping() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:268:10: ( ( groupRule | smoothingRule ) )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:268:12: ( groupRule | smoothingRule )
            {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:268:12: ( groupRule | smoothingRule )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==GROUP) ) {
                alt40=1;
            }
            else if ( (LA40_0==SMOOTHING) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;

            }
            switch (alt40) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:269:14: groupRule
                    {
                    pushFollow(FOLLOW_groupRule_in_grouping4467);
                    groupRule();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:270:14: smoothingRule
                    {
                    pushFollow(FOLLOW_smoothingRule_in_grouping4482);
                    smoothingRule();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "grouping"



    // $ANTLR start "groupRule"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:274:1: groupRule : GROUP groupTag= assignTag LSB ( (GraphElementName1= tagname | NEW LSB (face1= faceInLine |line1= lineInLine |point1= pointInLine ) RTB ) ( DEFSMOOTH (smooth_tag1= tagname | smoothingInLine ) )? ) ( ( COMMA GraphElementName2= tagname | NEW LSB (face2= faceInLine |line2= lineInLine |point2= pointInLine ) RTB ) ( DEFSMOOTH (smooth_tag2= tagname | smoothingInLine ) )? )* RSB SC ;
    public final void groupRule() throws RecognitionException {
        String groupTag =null;

        String GraphElementName1 =null;

        Face face1 =null;

        Line line1 =null;

        Point point1 =null;

        String smooth_tag1 =null;

        String GraphElementName2 =null;

        Face face2 =null;

        Line line2 =null;

        Point point2 =null;

        String smooth_tag2 =null;


        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:274:11: ( GROUP groupTag= assignTag LSB ( (GraphElementName1= tagname | NEW LSB (face1= faceInLine |line1= lineInLine |point1= pointInLine ) RTB ) ( DEFSMOOTH (smooth_tag1= tagname | smoothingInLine ) )? ) ( ( COMMA GraphElementName2= tagname | NEW LSB (face2= faceInLine |line2= lineInLine |point2= pointInLine ) RTB ) ( DEFSMOOTH (smooth_tag2= tagname | smoothingInLine ) )? )* RSB SC )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:274:13: GROUP groupTag= assignTag LSB ( (GraphElementName1= tagname | NEW LSB (face1= faceInLine |line1= lineInLine |point1= pointInLine ) RTB ) ( DEFSMOOTH (smooth_tag1= tagname | smoothingInLine ) )? ) ( ( COMMA GraphElementName2= tagname | NEW LSB (face2= faceInLine |line2= lineInLine |point2= pointInLine ) RTB ) ( DEFSMOOTH (smooth_tag2= tagname | smoothingInLine ) )? )* RSB SC
            {
            match(input,GROUP,FOLLOW_GROUP_in_groupRule4493); 

            pushFollow(FOLLOW_assignTag_in_groupRule4497);
            groupTag=assignTag();

            state._fsp--;


            match(input,LSB,FOLLOW_LSB_in_groupRule4512); 

            env.initializeGroup(groupTag);

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:277:19: ( (GraphElementName1= tagname | NEW LSB (face1= faceInLine |line1= lineInLine |point1= pointInLine ) RTB ) ( DEFSMOOTH (smooth_tag1= tagname | smoothingInLine ) )? )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:277:20: (GraphElementName1= tagname | NEW LSB (face1= faceInLine |line1= lineInLine |point1= pointInLine ) RTB ) ( DEFSMOOTH (smooth_tag1= tagname | smoothingInLine ) )?
            {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:277:20: (GraphElementName1= tagname | NEW LSB (face1= faceInLine |line1= lineInLine |point1= pointInLine ) RTB )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==ID) ) {
                alt42=1;
            }
            else if ( (LA42_0==NEW) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;

            }
            switch (alt42) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:277:21: GraphElementName1= tagname
                    {
                    pushFollow(FOLLOW_tagname_in_groupRule4552);
                    GraphElementName1=tagname();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:277:47: NEW LSB (face1= faceInLine |line1= lineInLine |point1= pointInLine ) RTB
                    {
                    match(input,NEW,FOLLOW_NEW_in_groupRule4554); 

                    match(input,LSB,FOLLOW_LSB_in_groupRule4556); 

                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:277:55: (face1= faceInLine |line1= lineInLine |point1= pointInLine )
                    int alt41=3;
                    switch ( input.LA(1) ) {
                    case FACE:
                        {
                        alt41=1;
                        }
                        break;
                    case LINE:
                        {
                        alt41=2;
                        }
                        break;
                    case POINT:
                        {
                        alt41=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 0, input);

                        throw nvae;

                    }

                    switch (alt41) {
                        case 1 :
                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:278:33: face1= faceInLine
                            {
                            pushFollow(FOLLOW_faceInLine_in_groupRule4594);
                            face1=faceInLine();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:279:33: line1= lineInLine
                            {
                            pushFollow(FOLLOW_lineInLine_in_groupRule4630);
                            line1=lineInLine();

                            state._fsp--;


                            }
                            break;
                        case 3 :
                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:280:33: point1= pointInLine
                            {
                            pushFollow(FOLLOW_pointInLine_in_groupRule4666);
                            point1=pointInLine();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input,RTB,FOLLOW_RTB_in_groupRule4736); 

                    }
                    break;

            }


            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:283:23: ( DEFSMOOTH (smooth_tag1= tagname | smoothingInLine ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==DEFSMOOTH) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:283:24: DEFSMOOTH (smooth_tag1= tagname | smoothingInLine )
                    {
                    match(input,DEFSMOOTH,FOLLOW_DEFSMOOTH_in_groupRule4761); 

                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:283:34: (smooth_tag1= tagname | smoothingInLine )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==ID) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==NEW) ) {
                        alt43=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;

                    }
                    switch (alt43) {
                        case 1 :
                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:283:35: smooth_tag1= tagname
                            {
                            pushFollow(FOLLOW_tagname_in_groupRule4766);
                            smooth_tag1=tagname();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:283:55: smoothingInLine
                            {
                            pushFollow(FOLLOW_smoothingInLine_in_groupRule4768);
                            smoothingInLine();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            env.addToTempGroup(GraphElementName1, point1, line1, face1, smooth_tag1);

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:285:19: ( ( COMMA GraphElementName2= tagname | NEW LSB (face2= faceInLine |line2= lineInLine |point2= pointInLine ) RTB ) ( DEFSMOOTH (smooth_tag2= tagname | smoothingInLine ) )? )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==COMMA||LA49_0==NEW) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:285:20: ( COMMA GraphElementName2= tagname | NEW LSB (face2= faceInLine |line2= lineInLine |point2= pointInLine ) RTB ) ( DEFSMOOTH (smooth_tag2= tagname | smoothingInLine ) )?
            	    {
            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:285:20: ( COMMA GraphElementName2= tagname | NEW LSB (face2= faceInLine |line2= lineInLine |point2= pointInLine ) RTB )
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==COMMA) ) {
            	        alt46=1;
            	    }
            	    else if ( (LA46_0==NEW) ) {
            	        alt46=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 46, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:285:21: COMMA GraphElementName2= tagname
            	            {
            	            match(input,COMMA,FOLLOW_COMMA_in_groupRule4825); 

            	            pushFollow(FOLLOW_tagname_in_groupRule4829);
            	            GraphElementName2=tagname();

            	            state._fsp--;


            	            }
            	            break;
            	        case 2 :
            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:285:53: NEW LSB (face2= faceInLine |line2= lineInLine |point2= pointInLine ) RTB
            	            {
            	            match(input,NEW,FOLLOW_NEW_in_groupRule4831); 

            	            match(input,LSB,FOLLOW_LSB_in_groupRule4833); 

            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:285:61: (face2= faceInLine |line2= lineInLine |point2= pointInLine )
            	            int alt45=3;
            	            switch ( input.LA(1) ) {
            	            case FACE:
            	                {
            	                alt45=1;
            	                }
            	                break;
            	            case LINE:
            	                {
            	                alt45=2;
            	                }
            	                break;
            	            case POINT:
            	                {
            	                alt45=3;
            	                }
            	                break;
            	            default:
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 45, 0, input);

            	                throw nvae;

            	            }

            	            switch (alt45) {
            	                case 1 :
            	                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:286:33: face2= faceInLine
            	                    {
            	                    pushFollow(FOLLOW_faceInLine_in_groupRule4871);
            	                    face2=faceInLine();

            	                    state._fsp--;


            	                    }
            	                    break;
            	                case 2 :
            	                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:287:33: line2= lineInLine
            	                    {
            	                    pushFollow(FOLLOW_lineInLine_in_groupRule4907);
            	                    line2=lineInLine();

            	                    state._fsp--;


            	                    }
            	                    break;
            	                case 3 :
            	                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:288:33: point2= pointInLine
            	                    {
            	                    pushFollow(FOLLOW_pointInLine_in_groupRule4943);
            	                    point2=pointInLine();

            	                    state._fsp--;


            	                    }
            	                    break;

            	            }


            	            match(input,RTB,FOLLOW_RTB_in_groupRule5013); 

            	            }
            	            break;

            	    }


            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:291:22: ( DEFSMOOTH (smooth_tag2= tagname | smoothingInLine ) )?
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( (LA48_0==DEFSMOOTH) ) {
            	        alt48=1;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:291:23: DEFSMOOTH (smooth_tag2= tagname | smoothingInLine )
            	            {
            	            match(input,DEFSMOOTH,FOLLOW_DEFSMOOTH_in_groupRule5037); 

            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:291:33: (smooth_tag2= tagname | smoothingInLine )
            	            int alt47=2;
            	            int LA47_0 = input.LA(1);

            	            if ( (LA47_0==ID) ) {
            	                alt47=1;
            	            }
            	            else if ( (LA47_0==NEW) ) {
            	                alt47=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 47, 0, input);

            	                throw nvae;

            	            }
            	            switch (alt47) {
            	                case 1 :
            	                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:291:34: smooth_tag2= tagname
            	                    {
            	                    pushFollow(FOLLOW_tagname_in_groupRule5042);
            	                    smooth_tag2=tagname();

            	                    state._fsp--;


            	                    }
            	                    break;
            	                case 2 :
            	                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:291:54: smoothingInLine
            	                    {
            	                    pushFollow(FOLLOW_smoothingInLine_in_groupRule5044);
            	                    smoothingInLine();

            	                    state._fsp--;


            	                    }
            	                    break;

            	            }


            	            }
            	            break;

            	    }


            	    env.addToTempGroup(GraphElementName2, point2, line2, face2, smooth_tag2);

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            match(input,RSB,FOLLOW_RSB_in_groupRule5106); 

            match(input,SC,FOLLOW_SC_in_groupRule5108); 

            env.saveGroup();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "groupRule"



    // $ANTLR start "smoothingRule"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:299:1: smoothingRule : SMOOTHING ( assignTag )? ( singleSmoothDef | multipleSmoothDef ) SC ;
    public final void smoothingRule() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:299:15: ( SMOOTHING ( assignTag )? ( singleSmoothDef | multipleSmoothDef ) SC )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:299:17: SMOOTHING ( assignTag )? ( singleSmoothDef | multipleSmoothDef ) SC
            {
            match(input,SMOOTHING,FOLLOW_SMOOTHING_in_smoothingRule5146); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:299:27: ( assignTag )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==ID) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:299:27: assignTag
                    {
                    pushFollow(FOLLOW_assignTag_in_smoothingRule5148);
                    assignTag();

                    state._fsp--;


                    }
                    break;

            }


            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:299:38: ( singleSmoothDef | multipleSmoothDef )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==INT) ) {
                alt51=1;
            }
            else if ( (LA51_0==LSB) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;

            }
            switch (alt51) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:299:39: singleSmoothDef
                    {
                    pushFollow(FOLLOW_singleSmoothDef_in_smoothingRule5152);
                    singleSmoothDef();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:299:55: multipleSmoothDef
                    {
                    pushFollow(FOLLOW_multipleSmoothDef_in_smoothingRule5154);
                    multipleSmoothDef();

                    state._fsp--;


                    }
                    break;

            }


            match(input,SC,FOLLOW_SC_in_smoothingRule5156); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "smoothingRule"



    // $ANTLR start "singleSmoothDef"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:300:1: singleSmoothDef : INT ;
    public final void singleSmoothDef() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:300:17: ( INT )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:300:20: INT
            {
            match(input,INT,FOLLOW_INT_in_singleSmoothDef5164); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "singleSmoothDef"



    // $ANTLR start "multipleSmoothDef"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:301:1: multipleSmoothDef : LSB ( ( assignTag )? INT ) ( COMMA ( assignTag )? INT )* RSB ;
    public final void multipleSmoothDef() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:301:19: ( LSB ( ( assignTag )? INT ) ( COMMA ( assignTag )? INT )* RSB )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:301:21: LSB ( ( assignTag )? INT ) ( COMMA ( assignTag )? INT )* RSB
            {
            match(input,LSB,FOLLOW_LSB_in_multipleSmoothDef5171); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:301:25: ( ( assignTag )? INT )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:301:26: ( assignTag )? INT
            {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:301:26: ( assignTag )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==ID) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:301:26: assignTag
                    {
                    pushFollow(FOLLOW_assignTag_in_multipleSmoothDef5174);
                    assignTag();

                    state._fsp--;


                    }
                    break;

            }


            match(input,INT,FOLLOW_INT_in_multipleSmoothDef5177); 

            }


            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:301:42: ( COMMA ( assignTag )? INT )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==COMMA) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:301:43: COMMA ( assignTag )? INT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_multipleSmoothDef5181); 

            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:301:49: ( assignTag )?
            	    int alt53=2;
            	    int LA53_0 = input.LA(1);

            	    if ( (LA53_0==ID) ) {
            	        alt53=1;
            	    }
            	    switch (alt53) {
            	        case 1 :
            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:301:49: assignTag
            	            {
            	            pushFollow(FOLLOW_assignTag_in_multipleSmoothDef5183);
            	            assignTag();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    match(input,INT,FOLLOW_INT_in_multipleSmoothDef5186); 

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            match(input,RSB,FOLLOW_RSB_in_multipleSmoothDef5190); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "multipleSmoothDef"



    // $ANTLR start "smoothingInLine"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:302:1: smoothingInLine : NEW LTB ( SMOOTHING ( assignTag )? INT ) RTB ;
    public final void smoothingInLine() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:302:17: ( NEW LTB ( SMOOTHING ( assignTag )? INT ) RTB )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:302:19: NEW LTB ( SMOOTHING ( assignTag )? INT ) RTB
            {
            match(input,NEW,FOLLOW_NEW_in_smoothingInLine5197); 

            match(input,LTB,FOLLOW_LTB_in_smoothingInLine5199); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:302:27: ( SMOOTHING ( assignTag )? INT )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:302:28: SMOOTHING ( assignTag )? INT
            {
            match(input,SMOOTHING,FOLLOW_SMOOTHING_in_smoothingInLine5202); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:302:38: ( assignTag )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==ID) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:302:38: assignTag
                    {
                    pushFollow(FOLLOW_assignTag_in_smoothingInLine5204);
                    assignTag();

                    state._fsp--;


                    }
                    break;

            }


            match(input,INT,FOLLOW_INT_in_smoothingInLine5207); 

            }


            match(input,RTB,FOLLOW_RTB_in_smoothingInLine5210); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "smoothingInLine"



    // $ANTLR start "functional"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:309:1: functional : () ;
    public final void functional() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:309:12: ( () )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:309:14: ()
            {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:309:14: ()
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:311:14: 
            {
            }


            }

        }
        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "functional"



    // $ANTLR start "comment"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:313:1: comment : ( SINGLELINECM | MULTILINETEXTCM );
    public final void comment() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:313:9: ( SINGLELINECM | MULTILINETEXTCM )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:
            {
            if ( input.LA(1)==MULTILINETEXTCM||input.LA(1)==SINGLELINECM ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "comment"

    // Delegated rules


 

    public static final BitSet FOLLOW_istruction_in_start68 = new BitSet(new long[]{0x0000000F70692802L});
    public static final BitSet FOLLOW_vertexInfo_in_istruction93 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphElement_in_istruction106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_grouping_in_istruction119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comment_in_istruction132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tagname_in_assignTag154 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_equal_in_assignTag156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_equal179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_tagname196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_num_in_vDef225 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_num_in_vDef229 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_num_in_vDef233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_num260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vertexRule_in_vertexInfo301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vertexSetRule_in_vertexInfo318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vTextureRule_in_vertexInfo335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_textureSetRule_in_vertexInfo352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vNormalRule_in_vertexInfo369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_normalSetRule_in_vertexInfo386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignTag_in_singleDef408 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_vDef_in_singleDef412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSB_in_multipleDef437 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_singleDef_in_multipleDef440 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_COMMA_in_multipleDef445 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_singleDef_in_multipleDef447 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_RSB_in_multipleDef452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSB_in_setDef466 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_tagname_in_setDef469 = new BitSet(new long[]{0x0000000001000440L});
    public static final BitSet FOLLOW_equal_in_setDef471 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_vDef_in_setDef473 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_COMMA_in_setDef479 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_tagname_in_setDef481 = new BitSet(new long[]{0x0000000001000440L});
    public static final BitSet FOLLOW_equal_in_setDef483 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_vDef_in_setDef485 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_RSB_in_setDef491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VERTEX_in_vertexRule500 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_multipleDef_in_vertexRule503 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_singleDef_in_vertexRule506 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_SC_in_vertexRule509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_vertexInline532 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LTB_in_vertexInline534 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_VERTEX_in_vertexInline561 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_assignTag_in_vertexInline565 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_vDef_in_vertexInline570 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_RTB_in_vertexInline615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VERTEXSET_in_vertexSetRule655 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_assignTag_in_vertexSetRule657 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_setDef_in_vertexSetRule659 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_SC_in_vertexSetRule661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VTEXTURE_in_vTextureRule670 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_multipleDef_in_vTextureRule673 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_singleDef_in_vTextureRule676 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_SC_in_vTextureRule679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_vTextureInline703 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LTB_in_vTextureInline705 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_VTEXTURE_in_vTextureInline732 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_assignTag_in_vTextureInline736 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_vDef_in_vTextureInline741 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_RTB_in_vTextureInline786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXTURESET_in_textureSetRule827 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_assignTag_in_textureSetRule829 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_setDef_in_textureSetRule831 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_SC_in_textureSetRule833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VNORMAL_in_vNormalRule842 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_multipleDef_in_vNormalRule845 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_singleDef_in_vNormalRule848 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_SC_in_vNormalRule851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_vNormalInline875 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LTB_in_vNormalInline877 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_VNORMAL_in_vNormalInline904 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_assignTag_in_vNormalInline908 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_vDef_in_vNormalInline913 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_RTB_in_vNormalInline958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NORMALSET_in_normalSetRule998 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_assignTag_in_normalSetRule1000 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_setDef_in_normalSetRule1002 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_SC_in_normalSetRule1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointRule_in_graphElement1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lineRule_in_graphElement1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_faceRule_in_graphElement1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointDefinition_in_pointRule1083 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_SC_in_pointRule1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POINT_in_pointInLine1100 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_singlePointDef_in_pointInLine1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POINT_in_pointDefinition1127 = new BitSet(new long[]{0x0000000000124000L});
    public static final BitSet FOLLOW_singlePointDef_in_pointDefinition1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplePointDef_in_pointDefinition1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tagname_in_singlePointDef1161 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_equal_in_singlePointDef1164 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_tagname_in_singlePointDef1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vertexInline_in_singlePointDef1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vertexInline_in_singlePointDef1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSB_in_multiplePointDef1299 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_singlePointDef_in_multiplePointDef1302 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_COMMA_in_multiplePointDef1325 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_singlePointDef_in_multiplePointDef1327 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_RSB_in_multiplePointDef1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lineDefinition_in_lineRule1342 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_SC_in_lineRule1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lineDefinition_in_lineInLine1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_in_lineDefinition1479 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_assignTag_in_lineDefinition1483 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LSB_in_lineDefinition1486 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_tagname_in_lineDefinition1548 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_vertexInline_in_lineDefinition1604 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_DEFTEX_in_lineDefinition1706 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_tagname_in_lineDefinition1765 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_vTextureInline_in_lineDefinition1823 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_COMMA_in_lineDefinition2073 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_tagname_in_lineDefinition2130 = new BitSet(new long[]{0x0000000001000240L});
    public static final BitSet FOLLOW_vertexInline_in_lineDefinition2186 = new BitSet(new long[]{0x0000000001000240L});
    public static final BitSet FOLLOW_DEFTEX_in_lineDefinition2288 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_tagname_in_lineDefinition2347 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_vTextureInline_in_lineDefinition2405 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_RSB_in_lineDefinition2651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_faceDefinition_in_faceRule2761 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_SC_in_faceRule2763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_faceDefinition_in_faceInLine2828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FACE_in_faceDefinition2916 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_assignTag_in_faceDefinition2920 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LSB_in_faceDefinition2923 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_tagname_in_faceDefinition2973 = new BitSet(new long[]{0x00000000010002C0L});
    public static final BitSet FOLLOW_vertexInline_in_faceDefinition3021 = new BitSet(new long[]{0x00000000010002C0L});
    public static final BitSet FOLLOW_DEFTEX_in_faceDefinition3105 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_tagname_in_faceDefinition3155 = new BitSet(new long[]{0x00000000010000C0L});
    public static final BitSet FOLLOW_vTextureInline_in_faceDefinition3205 = new BitSet(new long[]{0x00000000010000C0L});
    public static final BitSet FOLLOW_DEFNORM_in_faceDefinition3333 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_tagname_in_faceDefinition3383 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_vNormalInline_in_faceDefinition3433 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_COMMA_in_faceDefinition3639 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_tagname_in_faceDefinition3687 = new BitSet(new long[]{0x00000000010002C0L});
    public static final BitSet FOLLOW_vertexInline_in_faceDefinition3735 = new BitSet(new long[]{0x00000000010002C0L});
    public static final BitSet FOLLOW_DEFTEX_in_faceDefinition3821 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_tagname_in_faceDefinition3873 = new BitSet(new long[]{0x00000000010000C0L});
    public static final BitSet FOLLOW_vTextureInline_in_faceDefinition3925 = new BitSet(new long[]{0x00000000010000C0L});
    public static final BitSet FOLLOW_DEFNORM_in_faceDefinition4058 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_tagname_in_faceDefinition4110 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_vNormalInline_in_faceDefinition4162 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_RSB_in_faceDefinition4368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_groupRule_in_grouping4467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_smoothingRule_in_grouping4482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GROUP_in_groupRule4493 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_assignTag_in_groupRule4497 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LSB_in_groupRule4512 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_tagname_in_groupRule4552 = new BitSet(new long[]{0x0000000001100140L});
    public static final BitSet FOLLOW_NEW_in_groupRule4554 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LSB_in_groupRule4556 = new BitSet(new long[]{0x0000000000410800L});
    public static final BitSet FOLLOW_faceInLine_in_groupRule4594 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_lineInLine_in_groupRule4630 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_pointInLine_in_groupRule4666 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_RTB_in_groupRule4736 = new BitSet(new long[]{0x0000000001100140L});
    public static final BitSet FOLLOW_DEFSMOOTH_in_groupRule4761 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_tagname_in_groupRule4766 = new BitSet(new long[]{0x0000000001100040L});
    public static final BitSet FOLLOW_smoothingInLine_in_groupRule4768 = new BitSet(new long[]{0x0000000001100040L});
    public static final BitSet FOLLOW_COMMA_in_groupRule4825 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_tagname_in_groupRule4829 = new BitSet(new long[]{0x0000000001100140L});
    public static final BitSet FOLLOW_NEW_in_groupRule4831 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LSB_in_groupRule4833 = new BitSet(new long[]{0x0000000000410800L});
    public static final BitSet FOLLOW_faceInLine_in_groupRule4871 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_lineInLine_in_groupRule4907 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_pointInLine_in_groupRule4943 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_RTB_in_groupRule5013 = new BitSet(new long[]{0x0000000001100140L});
    public static final BitSet FOLLOW_DEFSMOOTH_in_groupRule5037 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_tagname_in_groupRule5042 = new BitSet(new long[]{0x0000000001100040L});
    public static final BitSet FOLLOW_smoothingInLine_in_groupRule5044 = new BitSet(new long[]{0x0000000001100040L});
    public static final BitSet FOLLOW_RSB_in_groupRule5106 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_SC_in_groupRule5108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SMOOTHING_in_smoothingRule5146 = new BitSet(new long[]{0x000000000002C000L});
    public static final BitSet FOLLOW_assignTag_in_smoothingRule5148 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_singleSmoothDef_in_smoothingRule5152 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_multipleSmoothDef_in_smoothingRule5154 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_SC_in_smoothingRule5156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_singleSmoothDef5164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSB_in_multipleSmoothDef5171 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_assignTag_in_multipleSmoothDef5174 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_INT_in_multipleSmoothDef5177 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_COMMA_in_multipleSmoothDef5181 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_assignTag_in_multipleSmoothDef5183 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_INT_in_multipleSmoothDef5186 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_RSB_in_multipleSmoothDef5190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_smoothingInLine5197 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LTB_in_smoothingInLine5199 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SMOOTHING_in_smoothingInLine5202 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_assignTag_in_smoothingInLine5204 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_INT_in_smoothingInLine5207 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_RTB_in_smoothingInLine5210 = new BitSet(new long[]{0x0000000000000002L});

}