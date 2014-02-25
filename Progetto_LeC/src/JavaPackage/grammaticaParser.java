// $ANTLR 3.4 /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g 2014-02-25 01:36:31

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "BOX", "COMMA", "DEFNORM", "DEFTEX", "EQ", "FACE", "FLOAT", "GROUP", "ID", "INT", "LINE", "LSB", "LTB", "MULTILINETEXTCM", "NEW", "NORMALSET", "POINT", "ROTATE", "RSB", "RTB", "SC", "SCALE", "SINGLELINECM", "SMOOTHING", "TEXTURESET", "TRASLATE", "VERTEX", "VERTEXSET", "VNORMAL", "VTEXTURE", "WS"
    };

    public static final int EOF=-1;
    public static final int ADD=4;
    public static final int BOX=5;
    public static final int COMMA=6;
    public static final int DEFNORM=7;
    public static final int DEFTEX=8;
    public static final int EQ=9;
    public static final int FACE=10;
    public static final int FLOAT=11;
    public static final int GROUP=12;
    public static final int ID=13;
    public static final int INT=14;
    public static final int LINE=15;
    public static final int LSB=16;
    public static final int LTB=17;
    public static final int MULTILINETEXTCM=18;
    public static final int NEW=19;
    public static final int NORMALSET=20;
    public static final int POINT=21;
    public static final int ROTATE=22;
    public static final int RSB=23;
    public static final int RTB=24;
    public static final int SC=25;
    public static final int SCALE=26;
    public static final int SINGLELINECM=27;
    public static final int SMOOTHING=28;
    public static final int TEXTURESET=29;
    public static final int TRASLATE=30;
    public static final int VERTEX=31;
    public static final int VERTEXSET=32;
    public static final int VNORMAL=33;
    public static final int VTEXTURE=34;
    public static final int WS=35;

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
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:159:1: pointInLine : NEW LTB ( pointDefinition ) RTB ;
    public final void pointInLine() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:159:13: ( NEW LTB ( pointDefinition ) RTB )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:159:15: NEW LTB ( pointDefinition ) RTB
            {
            match(input,NEW,FOLLOW_NEW_in_pointInLine1092); 

            match(input,LTB,FOLLOW_LTB_in_pointInLine1094); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:159:22: ( pointDefinition )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:159:23: pointDefinition
            {
            pushFollow(FOLLOW_pointDefinition_in_pointInLine1096);
            pointDefinition();

            state._fsp--;


            }


            match(input,RTB,FOLLOW_RTB_in_pointInLine1098); 

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
    // $ANTLR end "pointInLine"



    // $ANTLR start "pointDefinition"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:161:1: pointDefinition : POINT ( singlePointDef | multiplePointDef ) ;
    public final void pointDefinition() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:161:17: ( POINT ( singlePointDef | multiplePointDef ) )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:161:19: POINT ( singlePointDef | multiplePointDef )
            {
            match(input,POINT,FOLLOW_POINT_in_pointDefinition1106); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:161:25: ( singlePointDef | multiplePointDef )
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
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:161:26: singlePointDef
                    {
                    pushFollow(FOLLOW_singlePointDef_in_pointDefinition1109);
                    singlePointDef();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:161:41: multiplePointDef
                    {
                    pushFollow(FOLLOW_multiplePointDef_in_pointDefinition1111);
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
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:162:1: singlePointDef returns [Point p] : ( (tag_point_or_vertex= tagname ( equal ( (tag_v= tagname ) | (v= vertexInline ) ) )? ) |v= vertexInline ) ;
    public final Point singlePointDef() throws RecognitionException {
        Point p = null;


        String tag_point_or_vertex =null;

        String tag_v =null;

        Vertex v =null;


        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:163:13: ( ( (tag_point_or_vertex= tagname ( equal ( (tag_v= tagname ) | (v= vertexInline ) ) )? ) |v= vertexInline ) )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:163:15: ( (tag_point_or_vertex= tagname ( equal ( (tag_v= tagname ) | (v= vertexInline ) ) )? ) |v= vertexInline )
            {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:163:15: ( (tag_point_or_vertex= tagname ( equal ( (tag_v= tagname ) | (v= vertexInline ) ) )? ) |v= vertexInline )
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
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:163:16: (tag_point_or_vertex= tagname ( equal ( (tag_v= tagname ) | (v= vertexInline ) ) )? )
                    {
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:163:16: (tag_point_or_vertex= tagname ( equal ( (tag_v= tagname ) | (v= vertexInline ) ) )? )
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:163:18: tag_point_or_vertex= tagname ( equal ( (tag_v= tagname ) | (v= vertexInline ) ) )?
                    {
                    pushFollow(FOLLOW_tagname_in_singlePointDef1140);
                    tag_point_or_vertex=tagname();

                    state._fsp--;


                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:163:46: ( equal ( (tag_v= tagname ) | (v= vertexInline ) ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==EQ) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:163:47: equal ( (tag_v= tagname ) | (v= vertexInline ) )
                            {
                            pushFollow(FOLLOW_equal_in_singlePointDef1143);
                            equal();

                            state._fsp--;


                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:163:53: ( (tag_v= tagname ) | (v= vertexInline ) )
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
                                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:164:31: (tag_v= tagname )
                                    {
                                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:164:31: (tag_v= tagname )
                                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:164:32: tag_v= tagname
                                    {
                                    pushFollow(FOLLOW_tagname_in_singlePointDef1180);
                                    tag_v=tagname();

                                    state._fsp--;


                                    }


                                    }
                                    break;
                                case 2 :
                                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:165:31: (v= vertexInline )
                                    {
                                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:165:31: (v= vertexInline )
                                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:165:32: v= vertexInline
                                    {
                                    pushFollow(FOLLOW_vertexInline_in_singlePointDef1216);
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
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:166:17: v= vertexInline
                    {
                    pushFollow(FOLLOW_vertexInline_in_singlePointDef1241);
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
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:169:1: multiplePointDef : LSB ( singlePointDef ) ( COMMA singlePointDef )* RSB ;
    public final void multiplePointDef() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:169:18: ( LSB ( singlePointDef ) ( COMMA singlePointDef )* RSB )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:169:20: LSB ( singlePointDef ) ( COMMA singlePointDef )* RSB
            {
            match(input,LSB,FOLLOW_LSB_in_multiplePointDef1278); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:169:24: ( singlePointDef )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:169:25: singlePointDef
            {
            pushFollow(FOLLOW_singlePointDef_in_multiplePointDef1281);
            singlePointDef();

            state._fsp--;


            }


            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:170:20: ( COMMA singlePointDef )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==COMMA) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:170:21: COMMA singlePointDef
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_multiplePointDef1304); 

            	    pushFollow(FOLLOW_singlePointDef_in_multiplePointDef1306);
            	    singlePointDef();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            match(input,RSB,FOLLOW_RSB_in_multiplePointDef1310); 

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
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:173:1: lineRule : tag_line= lineDefinition SC ;
    public final void lineRule() throws RecognitionException {
        String tag_line =null;


        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:173:10: (tag_line= lineDefinition SC )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:173:12: tag_line= lineDefinition SC
            {
            pushFollow(FOLLOW_lineDefinition_in_lineRule1321);
            tag_line=lineDefinition();

            state._fsp--;


            match(input,SC,FOLLOW_SC_in_lineRule1323); 

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
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:176:1: lineInLine returns [Line line] : NEW LTB (tag_line= lineDefinition ) RTB ;
    public final Line lineInLine() throws RecognitionException {
        Line line = null;


        String tag_line =null;


        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:177:17: ( NEW LTB (tag_line= lineDefinition ) RTB )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:177:19: NEW LTB (tag_line= lineDefinition ) RTB
            {
            match(input,NEW,FOLLOW_NEW_in_lineInLine1372); 

            match(input,LTB,FOLLOW_LTB_in_lineInLine1374); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:177:26: (tag_line= lineDefinition )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:177:27: tag_line= lineDefinition
            {
            pushFollow(FOLLOW_lineDefinition_in_lineInLine1380);
            tag_line=lineDefinition();

            state._fsp--;


            }


            match(input,RTB,FOLLOW_RTB_in_lineInLine1382); 

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
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:180:1: lineDefinition returns [String tag_line] : LINE (tag= assignTag )? LSB ( (tag_vertex= tagname |vertex= vertexInline ) ( DEFTEX (tag_texture1= tagname |vTexture1= vTextureInline ) )? ) ( COMMA (tag_vertex= tagname |vertex= vertexInline ) ( DEFTEX (tag_texture2= tagname |vTexture2= vTextureInline ) )? )+ RSB ;
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
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:181:17: ( LINE (tag= assignTag )? LSB ( (tag_vertex= tagname |vertex= vertexInline ) ( DEFTEX (tag_texture1= tagname |vTexture1= vTextureInline ) )? ) ( COMMA (tag_vertex= tagname |vertex= vertexInline ) ( DEFTEX (tag_texture2= tagname |vTexture2= vTextureInline ) )? )+ RSB )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:181:19: LINE (tag= assignTag )? LSB ( (tag_vertex= tagname |vertex= vertexInline ) ( DEFTEX (tag_texture1= tagname |vTexture1= vTextureInline ) )? ) ( COMMA (tag_vertex= tagname |vertex= vertexInline ) ( DEFTEX (tag_texture2= tagname |vTexture2= vTextureInline ) )? )+ RSB
            {
            env.initializeTempLine();

            match(input,LINE,FOLLOW_LINE_in_lineDefinition1464); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:182:27: (tag= assignTag )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:182:27: tag= assignTag
                    {
                    pushFollow(FOLLOW_assignTag_in_lineDefinition1468);
                    tag=assignTag();

                    state._fsp--;


                    }
                    break;

            }


            match(input,LSB,FOLLOW_LSB_in_lineDefinition1471); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:182:47: ( (tag_vertex= tagname |vertex= vertexInline ) ( DEFTEX (tag_texture1= tagname |vTexture1= vTextureInline ) )? )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:183:49: (tag_vertex= tagname |vertex= vertexInline ) ( DEFTEX (tag_texture1= tagname |vTexture1= vTextureInline ) )?
            {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:183:49: (tag_vertex= tagname |vertex= vertexInline )
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
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:183:53: tag_vertex= tagname
                    {
                    pushFollow(FOLLOW_tagname_in_lineDefinition1533);
                    tag_vertex=tagname();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:184:53: vertex= vertexInline
                    {
                    pushFollow(FOLLOW_vertexInline_in_lineDefinition1589);
                    vertex=vertexInline();

                    state._fsp--;


                    }
                    break;

            }


            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:186:49: ( DEFTEX (tag_texture1= tagname |vTexture1= vTextureInline ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==DEFTEX) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:186:50: DEFTEX (tag_texture1= tagname |vTexture1= vTextureInline )
                    {
                    match(input,DEFTEX,FOLLOW_DEFTEX_in_lineDefinition1691); 

                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:187:51: (tag_texture1= tagname |vTexture1= vTextureInline )
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
                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:187:55: tag_texture1= tagname
                            {
                            pushFollow(FOLLOW_tagname_in_lineDefinition1750);
                            tag_texture1=tagname();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:188:55: vTexture1= vTextureInline
                            {
                            pushFollow(FOLLOW_vTextureInline_in_lineDefinition1808);
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


            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:193:47: ( COMMA (tag_vertex= tagname |vertex= vertexInline ) ( DEFTEX (tag_texture2= tagname |vTexture2= vTextureInline ) )? )+
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
            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:193:48: COMMA (tag_vertex= tagname |vertex= vertexInline ) ( DEFTEX (tag_texture2= tagname |vTexture2= vTextureInline ) )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_lineDefinition2058); 

            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:194:49: (tag_vertex= tagname |vertex= vertexInline )
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
            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:194:53: tag_vertex= tagname
            	            {
            	            pushFollow(FOLLOW_tagname_in_lineDefinition2115);
            	            tag_vertex=tagname();

            	            state._fsp--;


            	            }
            	            break;
            	        case 2 :
            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:195:53: vertex= vertexInline
            	            {
            	            pushFollow(FOLLOW_vertexInline_in_lineDefinition2171);
            	            vertex=vertexInline();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:197:49: ( DEFTEX (tag_texture2= tagname |vTexture2= vTextureInline ) )?
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==DEFTEX) ) {
            	        alt26=1;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:197:50: DEFTEX (tag_texture2= tagname |vTexture2= vTextureInline )
            	            {
            	            match(input,DEFTEX,FOLLOW_DEFTEX_in_lineDefinition2273); 

            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:198:51: (tag_texture2= tagname |vTexture2= vTextureInline )
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
            	                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:198:55: tag_texture2= tagname
            	                    {
            	                    pushFollow(FOLLOW_tagname_in_lineDefinition2332);
            	                    tag_texture2=tagname();

            	                    state._fsp--;


            	                    }
            	                    break;
            	                case 2 :
            	                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:199:55: vTexture2= vTextureInline
            	                    {
            	                    pushFollow(FOLLOW_vTextureInline_in_lineDefinition2390);
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


            match(input,RSB,FOLLOW_RSB_in_lineDefinition2636); 

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
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:209:1: faceRule : faceDefinition SC ;
    public final void faceRule() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:209:10: ( faceDefinition SC )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:209:12: faceDefinition SC
            {
            pushFollow(FOLLOW_faceDefinition_in_faceRule2744);
            faceDefinition();

            state._fsp--;


            match(input,SC,FOLLOW_SC_in_faceRule2746); 

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
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:210:1: faceInLine : NEW LTB ( faceDefinition ) RTB ;
    public final void faceInLine() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:210:12: ( NEW LTB ( faceDefinition ) RTB )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:210:14: NEW LTB ( faceDefinition ) RTB
            {
            match(input,NEW,FOLLOW_NEW_in_faceInLine2753); 

            match(input,LTB,FOLLOW_LTB_in_faceInLine2755); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:210:21: ( faceDefinition )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:210:22: faceDefinition
            {
            pushFollow(FOLLOW_faceDefinition_in_faceInLine2757);
            faceDefinition();

            state._fsp--;


            }


            match(input,RTB,FOLLOW_RTB_in_faceInLine2759); 

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
    // $ANTLR end "faceInLine"



    // $ANTLR start "faceDefinition"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:211:1: faceDefinition returns [String tag_face] : FACE (tag= assignTag )? LSB ( (tag_vertex= tagname |vertex= vertexInline ) ( DEFTEX (tag_texture1= tagname |vTexure1= vTextureInline ) )? ( DEFNORM (tag_normal1= tagname |vNormal1= vNormalInline ) )? ) ( COMMA (tag_vertex= tagname |vertex= vertexInline ) ( DEFTEX (tag_texture2= tagname |vTexture2= vTextureInline ) )? ( DEFNORM (tag_normal2= tagname |vNormal2= vNormalInline ) )? )* RSB ;
    public final String faceDefinition() throws RecognitionException {
        String tag_face = null;


        String tag =null;

        String tag_vertex =null;

        Vertex vertex =null;

        String tag_texture1 =null;

        VTexture vTexure1 =null;

        String tag_normal1 =null;

        VNormal vNormal1 =null;

        String tag_texture2 =null;

        VTexture vTexture2 =null;

        String tag_normal2 =null;

        VNormal vNormal2 =null;


        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:212:5: ( FACE (tag= assignTag )? LSB ( (tag_vertex= tagname |vertex= vertexInline ) ( DEFTEX (tag_texture1= tagname |vTexure1= vTextureInline ) )? ( DEFNORM (tag_normal1= tagname |vNormal1= vNormalInline ) )? ) ( COMMA (tag_vertex= tagname |vertex= vertexInline ) ( DEFTEX (tag_texture2= tagname |vTexture2= vTextureInline ) )? ( DEFNORM (tag_normal2= tagname |vNormal2= vNormalInline ) )? )* RSB )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:212:8: FACE (tag= assignTag )? LSB ( (tag_vertex= tagname |vertex= vertexInline ) ( DEFTEX (tag_texture1= tagname |vTexure1= vTextureInline ) )? ( DEFNORM (tag_normal1= tagname |vNormal1= vNormalInline ) )? ) ( COMMA (tag_vertex= tagname |vertex= vertexInline ) ( DEFTEX (tag_texture2= tagname |vTexture2= vTextureInline ) )? ( DEFNORM (tag_normal2= tagname |vNormal2= vNormalInline ) )? )* RSB
            {
            match(input,FACE,FOLLOW_FACE_in_faceDefinition2775); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:212:16: (tag= assignTag )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:212:16: tag= assignTag
                    {
                    pushFollow(FOLLOW_assignTag_in_faceDefinition2779);
                    tag=assignTag();

                    state._fsp--;


                    }
                    break;

            }


            match(input,LSB,FOLLOW_LSB_in_faceDefinition2782); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:212:32: ( (tag_vertex= tagname |vertex= vertexInline ) ( DEFTEX (tag_texture1= tagname |vTexure1= vTextureInline ) )? ( DEFNORM (tag_normal1= tagname |vNormal1= vNormalInline ) )? )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:213:40: (tag_vertex= tagname |vertex= vertexInline ) ( DEFTEX (tag_texture1= tagname |vTexure1= vTextureInline ) )? ( DEFNORM (tag_normal1= tagname |vNormal1= vNormalInline ) )?
            {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:213:40: (tag_vertex= tagname |vertex= vertexInline )
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
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:213:45: tag_vertex= tagname
                    {
                    pushFollow(FOLLOW_tagname_in_faceDefinition2832);
                    tag_vertex=tagname();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:214:45: vertex= vertexInline
                    {
                    pushFollow(FOLLOW_vertexInline_in_faceDefinition2880);
                    vertex=vertexInline();

                    state._fsp--;


                    }
                    break;

            }


            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:216:40: ( DEFTEX (tag_texture1= tagname |vTexure1= vTextureInline ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==DEFTEX) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:216:41: DEFTEX (tag_texture1= tagname |vTexure1= vTextureInline )
                    {
                    match(input,DEFTEX,FOLLOW_DEFTEX_in_faceDefinition2964); 

                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:217:43: (tag_texture1= tagname |vTexure1= vTextureInline )
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
                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:217:47: tag_texture1= tagname
                            {
                            pushFollow(FOLLOW_tagname_in_faceDefinition3014);
                            tag_texture1=tagname();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:218:47: vTexure1= vTextureInline
                            {
                            pushFollow(FOLLOW_vTextureInline_in_faceDefinition3064);
                            vTexure1=vTextureInline();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }


            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:221:40: ( DEFNORM (tag_normal1= tagname |vNormal1= vNormalInline ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==DEFNORM) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:221:41: DEFNORM (tag_normal1= tagname |vNormal1= vNormalInline )
                    {
                    match(input,DEFNORM,FOLLOW_DEFNORM_in_faceDefinition3193); 

                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:222:43: (tag_normal1= tagname |vNormal1= vNormalInline )
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
                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:222:47: tag_normal1= tagname
                            {
                            pushFollow(FOLLOW_tagname_in_faceDefinition3243);
                            tag_normal1=tagname();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:223:47: vNormal1= vNormalInline
                            {
                            pushFollow(FOLLOW_vNormalInline_in_faceDefinition3293);
                            vNormal1=vNormalInline();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:227:38: ( COMMA (tag_vertex= tagname |vertex= vertexInline ) ( DEFTEX (tag_texture2= tagname |vTexture2= vTextureInline ) )? ( DEFNORM (tag_normal2= tagname |vNormal2= vNormalInline ) )? )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==COMMA) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:227:39: COMMA (tag_vertex= tagname |vertex= vertexInline ) ( DEFTEX (tag_texture2= tagname |vTexture2= vTextureInline ) )? ( DEFNORM (tag_normal2= tagname |vNormal2= vNormalInline ) )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_faceDefinition3458); 

            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:228:41: (tag_vertex= tagname |vertex= vertexInline )
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
            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:228:45: tag_vertex= tagname
            	            {
            	            pushFollow(FOLLOW_tagname_in_faceDefinition3506);
            	            tag_vertex=tagname();

            	            state._fsp--;


            	            }
            	            break;
            	        case 2 :
            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:229:45: vertex= vertexInline
            	            {
            	            pushFollow(FOLLOW_vertexInline_in_faceDefinition3554);
            	            vertex=vertexInline();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:231:41: ( DEFTEX (tag_texture2= tagname |vTexture2= vTextureInline ) )?
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==DEFTEX) ) {
            	        alt36=1;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:231:42: DEFTEX (tag_texture2= tagname |vTexture2= vTextureInline )
            	            {
            	            match(input,DEFTEX,FOLLOW_DEFTEX_in_faceDefinition3640); 

            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:232:45: (tag_texture2= tagname |vTexture2= vTextureInline )
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
            	                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:232:49: tag_texture2= tagname
            	                    {
            	                    pushFollow(FOLLOW_tagname_in_faceDefinition3692);
            	                    tag_texture2=tagname();

            	                    state._fsp--;


            	                    }
            	                    break;
            	                case 2 :
            	                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:233:49: vTexture2= vTextureInline
            	                    {
            	                    pushFollow(FOLLOW_vTextureInline_in_faceDefinition3744);
            	                    vTexture2=vTextureInline();

            	                    state._fsp--;


            	                    }
            	                    break;

            	            }


            	            }
            	            break;

            	    }


            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:236:41: ( DEFNORM (tag_normal2= tagname |vNormal2= vNormalInline ) )?
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==DEFNORM) ) {
            	        alt38=1;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:236:42: DEFNORM (tag_normal2= tagname |vNormal2= vNormalInline )
            	            {
            	            match(input,DEFNORM,FOLLOW_DEFNORM_in_faceDefinition3877); 

            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:237:45: (tag_normal2= tagname |vNormal2= vNormalInline )
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
            	                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:237:49: tag_normal2= tagname
            	                    {
            	                    pushFollow(FOLLOW_tagname_in_faceDefinition3929);
            	                    tag_normal2=tagname();

            	                    state._fsp--;


            	                    }
            	                    break;
            	                case 2 :
            	                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:238:49: vNormal2= vNormalInline
            	                    {
            	                    pushFollow(FOLLOW_vNormalInline_in_faceDefinition3981);
            	                    vNormal2=vNormalInline();

            	                    state._fsp--;


            	                    }
            	                    break;

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            match(input,RSB,FOLLOW_RSB_in_faceDefinition4145); 

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
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:249:1: primitive : () ;
    public final void primitive() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:249:11: ( () )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:249:13: ()
            {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:249:13: ()
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:251:13: 
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
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:256:1: grouping : ( groupRule | smoothingRule ) ;
    public final void grouping() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:256:10: ( ( groupRule | smoothingRule ) )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:256:12: ( groupRule | smoothingRule )
            {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:256:12: ( groupRule | smoothingRule )
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
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:257:14: groupRule
                    {
                    pushFollow(FOLLOW_groupRule_in_grouping4244);
                    groupRule();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:258:14: smoothingRule
                    {
                    pushFollow(FOLLOW_smoothingRule_in_grouping4259);
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
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:262:1: groupRule : GROUP assignTag LSB ( ( tagname | NEW LSB ( faceDefinition | lineDefinition | pointDefinition ) RTB ) smoothingInLine ) ( ( COMMA tagname | NEW LSB ( faceDefinition | lineDefinition | pointDefinition ) RTB ) smoothingInLine )* ;
    public final void groupRule() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:262:11: ( GROUP assignTag LSB ( ( tagname | NEW LSB ( faceDefinition | lineDefinition | pointDefinition ) RTB ) smoothingInLine ) ( ( COMMA tagname | NEW LSB ( faceDefinition | lineDefinition | pointDefinition ) RTB ) smoothingInLine )* )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:262:13: GROUP assignTag LSB ( ( tagname | NEW LSB ( faceDefinition | lineDefinition | pointDefinition ) RTB ) smoothingInLine ) ( ( COMMA tagname | NEW LSB ( faceDefinition | lineDefinition | pointDefinition ) RTB ) smoothingInLine )*
            {
            match(input,GROUP,FOLLOW_GROUP_in_groupRule4270); 

            pushFollow(FOLLOW_assignTag_in_groupRule4272);
            assignTag();

            state._fsp--;


            match(input,LSB,FOLLOW_LSB_in_groupRule4274); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:263:19: ( ( tagname | NEW LSB ( faceDefinition | lineDefinition | pointDefinition ) RTB ) smoothingInLine )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:263:20: ( tagname | NEW LSB ( faceDefinition | lineDefinition | pointDefinition ) RTB ) smoothingInLine
            {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:263:20: ( tagname | NEW LSB ( faceDefinition | lineDefinition | pointDefinition ) RTB )
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
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:263:21: tagname
                    {
                    pushFollow(FOLLOW_tagname_in_groupRule4297);
                    tagname();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:263:29: NEW LSB ( faceDefinition | lineDefinition | pointDefinition ) RTB
                    {
                    match(input,NEW,FOLLOW_NEW_in_groupRule4299); 

                    match(input,LSB,FOLLOW_LSB_in_groupRule4301); 

                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:263:37: ( faceDefinition | lineDefinition | pointDefinition )
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
                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:264:33: faceDefinition
                            {
                            pushFollow(FOLLOW_faceDefinition_in_groupRule4337);
                            faceDefinition();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:265:33: lineDefinition
                            {
                            pushFollow(FOLLOW_lineDefinition_in_groupRule4371);
                            lineDefinition();

                            state._fsp--;


                            }
                            break;
                        case 3 :
                            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:266:33: pointDefinition
                            {
                            pushFollow(FOLLOW_pointDefinition_in_groupRule4405);
                            pointDefinition();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input,RTB,FOLLOW_RTB_in_groupRule4475); 

                    }
                    break;

            }


            pushFollow(FOLLOW_smoothingInLine_in_groupRule4499);
            smoothingInLine();

            state._fsp--;


            }


            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:272:19: ( ( COMMA tagname | NEW LSB ( faceDefinition | lineDefinition | pointDefinition ) RTB ) smoothingInLine )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==COMMA||LA45_0==NEW) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:272:20: ( COMMA tagname | NEW LSB ( faceDefinition | lineDefinition | pointDefinition ) RTB ) smoothingInLine
            	    {
            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:272:20: ( COMMA tagname | NEW LSB ( faceDefinition | lineDefinition | pointDefinition ) RTB )
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==COMMA) ) {
            	        alt44=1;
            	    }
            	    else if ( (LA44_0==NEW) ) {
            	        alt44=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 44, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:272:21: COMMA tagname
            	            {
            	            match(input,COMMA,FOLLOW_COMMA_in_groupRule4573); 

            	            pushFollow(FOLLOW_tagname_in_groupRule4575);
            	            tagname();

            	            state._fsp--;


            	            }
            	            break;
            	        case 2 :
            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:272:35: NEW LSB ( faceDefinition | lineDefinition | pointDefinition ) RTB
            	            {
            	            match(input,NEW,FOLLOW_NEW_in_groupRule4577); 

            	            match(input,LSB,FOLLOW_LSB_in_groupRule4579); 

            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:272:43: ( faceDefinition | lineDefinition | pointDefinition )
            	            int alt43=3;
            	            switch ( input.LA(1) ) {
            	            case FACE:
            	                {
            	                alt43=1;
            	                }
            	                break;
            	            case LINE:
            	                {
            	                alt43=2;
            	                }
            	                break;
            	            case POINT:
            	                {
            	                alt43=3;
            	                }
            	                break;
            	            default:
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 43, 0, input);

            	                throw nvae;

            	            }

            	            switch (alt43) {
            	                case 1 :
            	                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:273:33: faceDefinition
            	                    {
            	                    pushFollow(FOLLOW_faceDefinition_in_groupRule4615);
            	                    faceDefinition();

            	                    state._fsp--;


            	                    }
            	                    break;
            	                case 2 :
            	                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:274:33: lineDefinition
            	                    {
            	                    pushFollow(FOLLOW_lineDefinition_in_groupRule4649);
            	                    lineDefinition();

            	                    state._fsp--;


            	                    }
            	                    break;
            	                case 3 :
            	                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:275:33: pointDefinition
            	                    {
            	                    pushFollow(FOLLOW_pointDefinition_in_groupRule4683);
            	                    pointDefinition();

            	                    state._fsp--;


            	                    }
            	                    break;

            	            }


            	            match(input,RTB,FOLLOW_RTB_in_groupRule4753); 

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_smoothingInLine_in_groupRule4776);
            	    smoothingInLine();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
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
    // $ANTLR end "groupRule"



    // $ANTLR start "smoothingRule"
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:282:1: smoothingRule : SMOOTHING ( assignTag )? ( singleSmoothDef | multipleSmoothDef ) SC ;
    public final void smoothingRule() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:282:15: ( SMOOTHING ( assignTag )? ( singleSmoothDef | multipleSmoothDef ) SC )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:282:17: SMOOTHING ( assignTag )? ( singleSmoothDef | multipleSmoothDef ) SC
            {
            match(input,SMOOTHING,FOLLOW_SMOOTHING_in_smoothingRule4806); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:282:27: ( assignTag )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==ID) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:282:27: assignTag
                    {
                    pushFollow(FOLLOW_assignTag_in_smoothingRule4808);
                    assignTag();

                    state._fsp--;


                    }
                    break;

            }


            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:282:38: ( singleSmoothDef | multipleSmoothDef )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==INT) ) {
                alt47=1;
            }
            else if ( (LA47_0==LSB) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;

            }
            switch (alt47) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:282:39: singleSmoothDef
                    {
                    pushFollow(FOLLOW_singleSmoothDef_in_smoothingRule4812);
                    singleSmoothDef();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:282:55: multipleSmoothDef
                    {
                    pushFollow(FOLLOW_multipleSmoothDef_in_smoothingRule4814);
                    multipleSmoothDef();

                    state._fsp--;


                    }
                    break;

            }


            match(input,SC,FOLLOW_SC_in_smoothingRule4816); 

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
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:283:1: singleSmoothDef : INT ;
    public final void singleSmoothDef() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:283:17: ( INT )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:283:20: INT
            {
            match(input,INT,FOLLOW_INT_in_singleSmoothDef4824); 

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
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:284:1: multipleSmoothDef : LSB ( ( assignTag )? INT ) ( COMMA ( assignTag )? INT )* RSB ;
    public final void multipleSmoothDef() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:284:19: ( LSB ( ( assignTag )? INT ) ( COMMA ( assignTag )? INT )* RSB )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:284:21: LSB ( ( assignTag )? INT ) ( COMMA ( assignTag )? INT )* RSB
            {
            match(input,LSB,FOLLOW_LSB_in_multipleSmoothDef4831); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:284:25: ( ( assignTag )? INT )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:284:26: ( assignTag )? INT
            {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:284:26: ( assignTag )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==ID) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:284:26: assignTag
                    {
                    pushFollow(FOLLOW_assignTag_in_multipleSmoothDef4834);
                    assignTag();

                    state._fsp--;


                    }
                    break;

            }


            match(input,INT,FOLLOW_INT_in_multipleSmoothDef4837); 

            }


            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:284:42: ( COMMA ( assignTag )? INT )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==COMMA) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:284:43: COMMA ( assignTag )? INT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_multipleSmoothDef4841); 

            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:284:49: ( assignTag )?
            	    int alt49=2;
            	    int LA49_0 = input.LA(1);

            	    if ( (LA49_0==ID) ) {
            	        alt49=1;
            	    }
            	    switch (alt49) {
            	        case 1 :
            	            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:284:49: assignTag
            	            {
            	            pushFollow(FOLLOW_assignTag_in_multipleSmoothDef4843);
            	            assignTag();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    match(input,INT,FOLLOW_INT_in_multipleSmoothDef4846); 

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            match(input,RSB,FOLLOW_RSB_in_multipleSmoothDef4850); 

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
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:285:1: smoothingInLine : NEW LTB ( SMOOTHING ( assignTag )? INT ) RTB ;
    public final void smoothingInLine() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:285:17: ( NEW LTB ( SMOOTHING ( assignTag )? INT ) RTB )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:285:19: NEW LTB ( SMOOTHING ( assignTag )? INT ) RTB
            {
            match(input,NEW,FOLLOW_NEW_in_smoothingInLine4857); 

            match(input,LTB,FOLLOW_LTB_in_smoothingInLine4859); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:285:27: ( SMOOTHING ( assignTag )? INT )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:285:28: SMOOTHING ( assignTag )? INT
            {
            match(input,SMOOTHING,FOLLOW_SMOOTHING_in_smoothingInLine4862); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:285:38: ( assignTag )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==ID) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:285:38: assignTag
                    {
                    pushFollow(FOLLOW_assignTag_in_smoothingInLine4864);
                    assignTag();

                    state._fsp--;


                    }
                    break;

            }


            match(input,INT,FOLLOW_INT_in_smoothingInLine4867); 

            }


            match(input,RTB,FOLLOW_RTB_in_smoothingInLine4870); 

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
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:292:1: functional : () ;
    public final void functional() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:292:12: ( () )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:292:14: ()
            {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:292:14: ()
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:294:14: 
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
    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:296:1: comment : ( SINGLELINECM | MULTILINETEXTCM );
    public final void comment() throws RecognitionException {
        try {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:296:9: ( SINGLELINECM | MULTILINETEXTCM )
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


 

    public static final BitSet FOLLOW_istruction_in_start68 = new BitSet(new long[]{0x00000007B8349402L});
    public static final BitSet FOLLOW_vertexInfo_in_istruction93 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphElement_in_istruction106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_grouping_in_istruction119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comment_in_istruction132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tagname_in_assignTag154 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_equal_in_assignTag156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_equal179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_tagname196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_num_in_vDef225 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_num_in_vDef229 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_num_in_vDef233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_num260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vertexRule_in_vertexInfo301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vertexSetRule_in_vertexInfo318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vTextureRule_in_vertexInfo335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_textureSetRule_in_vertexInfo352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vNormalRule_in_vertexInfo369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_normalSetRule_in_vertexInfo386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignTag_in_singleDef408 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_vDef_in_singleDef412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSB_in_multipleDef437 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_singleDef_in_multipleDef440 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_COMMA_in_multipleDef445 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_singleDef_in_multipleDef447 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_RSB_in_multipleDef452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSB_in_setDef466 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_tagname_in_setDef469 = new BitSet(new long[]{0x0000000000800240L});
    public static final BitSet FOLLOW_equal_in_setDef471 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_vDef_in_setDef473 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_COMMA_in_setDef479 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_tagname_in_setDef481 = new BitSet(new long[]{0x0000000000800240L});
    public static final BitSet FOLLOW_equal_in_setDef483 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_vDef_in_setDef485 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_RSB_in_setDef491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VERTEX_in_vertexRule500 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_multipleDef_in_vertexRule503 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_singleDef_in_vertexRule506 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_SC_in_vertexRule509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_vertexInline532 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LTB_in_vertexInline534 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_VERTEX_in_vertexInline561 = new BitSet(new long[]{0x0000000000006800L});
    public static final BitSet FOLLOW_assignTag_in_vertexInline565 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_vDef_in_vertexInline570 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RTB_in_vertexInline615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VERTEXSET_in_vertexSetRule655 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_assignTag_in_vertexSetRule657 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_setDef_in_vertexSetRule659 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_SC_in_vertexSetRule661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VTEXTURE_in_vTextureRule670 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_multipleDef_in_vTextureRule673 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_singleDef_in_vTextureRule676 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_SC_in_vTextureRule679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_vTextureInline703 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LTB_in_vTextureInline705 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_VTEXTURE_in_vTextureInline732 = new BitSet(new long[]{0x0000000000006800L});
    public static final BitSet FOLLOW_assignTag_in_vTextureInline736 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_vDef_in_vTextureInline741 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RTB_in_vTextureInline786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXTURESET_in_textureSetRule827 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_assignTag_in_textureSetRule829 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_setDef_in_textureSetRule831 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_SC_in_textureSetRule833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VNORMAL_in_vNormalRule842 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_multipleDef_in_vNormalRule845 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_singleDef_in_vNormalRule848 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_SC_in_vNormalRule851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_vNormalInline875 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LTB_in_vNormalInline877 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_VNORMAL_in_vNormalInline904 = new BitSet(new long[]{0x0000000000006800L});
    public static final BitSet FOLLOW_assignTag_in_vNormalInline908 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_vDef_in_vNormalInline913 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RTB_in_vNormalInline958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NORMALSET_in_normalSetRule998 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_assignTag_in_normalSetRule1000 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_setDef_in_normalSetRule1002 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_SC_in_normalSetRule1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointRule_in_graphElement1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lineRule_in_graphElement1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_faceRule_in_graphElement1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointDefinition_in_pointRule1083 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_SC_in_pointRule1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_pointInLine1092 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LTB_in_pointInLine1094 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_pointDefinition_in_pointInLine1096 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RTB_in_pointInLine1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POINT_in_pointDefinition1106 = new BitSet(new long[]{0x0000000000092000L});
    public static final BitSet FOLLOW_singlePointDef_in_pointDefinition1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplePointDef_in_pointDefinition1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tagname_in_singlePointDef1140 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_equal_in_singlePointDef1143 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_tagname_in_singlePointDef1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vertexInline_in_singlePointDef1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vertexInline_in_singlePointDef1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSB_in_multiplePointDef1278 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_singlePointDef_in_multiplePointDef1281 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_COMMA_in_multiplePointDef1304 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_singlePointDef_in_multiplePointDef1306 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_RSB_in_multiplePointDef1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lineDefinition_in_lineRule1321 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_SC_in_lineRule1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_lineInLine1372 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LTB_in_lineInLine1374 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_lineDefinition_in_lineInLine1380 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RTB_in_lineInLine1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_in_lineDefinition1464 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_assignTag_in_lineDefinition1468 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_LSB_in_lineDefinition1471 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_tagname_in_lineDefinition1533 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_vertexInline_in_lineDefinition1589 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_DEFTEX_in_lineDefinition1691 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_tagname_in_lineDefinition1750 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_vTextureInline_in_lineDefinition1808 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_COMMA_in_lineDefinition2058 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_tagname_in_lineDefinition2115 = new BitSet(new long[]{0x0000000000800140L});
    public static final BitSet FOLLOW_vertexInline_in_lineDefinition2171 = new BitSet(new long[]{0x0000000000800140L});
    public static final BitSet FOLLOW_DEFTEX_in_lineDefinition2273 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_tagname_in_lineDefinition2332 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_vTextureInline_in_lineDefinition2390 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_RSB_in_lineDefinition2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_faceDefinition_in_faceRule2744 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_SC_in_faceRule2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_faceInLine2753 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LTB_in_faceInLine2755 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_faceDefinition_in_faceInLine2757 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RTB_in_faceInLine2759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FACE_in_faceDefinition2775 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_assignTag_in_faceDefinition2779 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_LSB_in_faceDefinition2782 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_tagname_in_faceDefinition2832 = new BitSet(new long[]{0x00000000008001C0L});
    public static final BitSet FOLLOW_vertexInline_in_faceDefinition2880 = new BitSet(new long[]{0x00000000008001C0L});
    public static final BitSet FOLLOW_DEFTEX_in_faceDefinition2964 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_tagname_in_faceDefinition3014 = new BitSet(new long[]{0x00000000008000C0L});
    public static final BitSet FOLLOW_vTextureInline_in_faceDefinition3064 = new BitSet(new long[]{0x00000000008000C0L});
    public static final BitSet FOLLOW_DEFNORM_in_faceDefinition3193 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_tagname_in_faceDefinition3243 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_vNormalInline_in_faceDefinition3293 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_COMMA_in_faceDefinition3458 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_tagname_in_faceDefinition3506 = new BitSet(new long[]{0x00000000008001C0L});
    public static final BitSet FOLLOW_vertexInline_in_faceDefinition3554 = new BitSet(new long[]{0x00000000008001C0L});
    public static final BitSet FOLLOW_DEFTEX_in_faceDefinition3640 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_tagname_in_faceDefinition3692 = new BitSet(new long[]{0x00000000008000C0L});
    public static final BitSet FOLLOW_vTextureInline_in_faceDefinition3744 = new BitSet(new long[]{0x00000000008000C0L});
    public static final BitSet FOLLOW_DEFNORM_in_faceDefinition3877 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_tagname_in_faceDefinition3929 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_vNormalInline_in_faceDefinition3981 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_RSB_in_faceDefinition4145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_groupRule_in_grouping4244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_smoothingRule_in_grouping4259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GROUP_in_groupRule4270 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_assignTag_in_groupRule4272 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_LSB_in_groupRule4274 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_tagname_in_groupRule4297 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NEW_in_groupRule4299 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_LSB_in_groupRule4301 = new BitSet(new long[]{0x0000000000208400L});
    public static final BitSet FOLLOW_faceDefinition_in_groupRule4337 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_lineDefinition_in_groupRule4371 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_pointDefinition_in_groupRule4405 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RTB_in_groupRule4475 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_smoothingInLine_in_groupRule4499 = new BitSet(new long[]{0x0000000000080042L});
    public static final BitSet FOLLOW_COMMA_in_groupRule4573 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_tagname_in_groupRule4575 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NEW_in_groupRule4577 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_LSB_in_groupRule4579 = new BitSet(new long[]{0x0000000000208400L});
    public static final BitSet FOLLOW_faceDefinition_in_groupRule4615 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_lineDefinition_in_groupRule4649 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_pointDefinition_in_groupRule4683 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RTB_in_groupRule4753 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_smoothingInLine_in_groupRule4776 = new BitSet(new long[]{0x0000000000080042L});
    public static final BitSet FOLLOW_SMOOTHING_in_smoothingRule4806 = new BitSet(new long[]{0x0000000000016000L});
    public static final BitSet FOLLOW_assignTag_in_smoothingRule4808 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_singleSmoothDef_in_smoothingRule4812 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_multipleSmoothDef_in_smoothingRule4814 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_SC_in_smoothingRule4816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_singleSmoothDef4824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSB_in_multipleSmoothDef4831 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_assignTag_in_multipleSmoothDef4834 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_INT_in_multipleSmoothDef4837 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_COMMA_in_multipleSmoothDef4841 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_assignTag_in_multipleSmoothDef4843 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_INT_in_multipleSmoothDef4846 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_RSB_in_multipleSmoothDef4850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_smoothingInLine4857 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_LTB_in_smoothingInLine4859 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_SMOOTHING_in_smoothingInLine4862 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_assignTag_in_smoothingInLine4864 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_INT_in_smoothingInLine4867 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RTB_in_smoothingInLine4870 = new BitSet(new long[]{0x0000000000000002L});

}