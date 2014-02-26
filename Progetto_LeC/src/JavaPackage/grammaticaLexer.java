// $ANTLR 3.4 /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g 2014-02-26 12:08:08

  package JavaPackage;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class grammaticaLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public grammaticaLexer() {} 
    public grammaticaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public grammaticaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g"; }

    // $ANTLR start "VERTEX"
    public final void mVERTEX() throws RecognitionException {
        try {
            int _type = VERTEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:319:9: ( 'vertex' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:319:11: 'vertex'
            {
            match("vertex"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VERTEX"

    // $ANTLR start "VERTEXSET"
    public final void mVERTEXSET() throws RecognitionException {
        try {
            int _type = VERTEXSET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:320:12: ( 'vertexset' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:320:14: 'vertexset'
            {
            match("vertexset"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VERTEXSET"

    // $ANTLR start "VTEXTURE"
    public final void mVTEXTURE() throws RecognitionException {
        try {
            int _type = VTEXTURE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:321:11: ( 'vtexture' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:321:13: 'vtexture'
            {
            match("vtexture"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VTEXTURE"

    // $ANTLR start "TEXTURESET"
    public final void mTEXTURESET() throws RecognitionException {
        try {
            int _type = TEXTURESET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:322:13: ( 'textureset' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:322:15: 'textureset'
            {
            match("textureset"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TEXTURESET"

    // $ANTLR start "VNORMAL"
    public final void mVNORMAL() throws RecognitionException {
        try {
            int _type = VNORMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:323:10: ( 'vnormal' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:323:12: 'vnormal'
            {
            match("vnormal"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VNORMAL"

    // $ANTLR start "NORMALSET"
    public final void mNORMALSET() throws RecognitionException {
        try {
            int _type = NORMALSET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:324:12: ( 'normalset' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:324:14: 'normalset'
            {
            match("normalset"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NORMALSET"

    // $ANTLR start "POINT"
    public final void mPOINT() throws RecognitionException {
        try {
            int _type = POINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:325:8: ( 'point' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:325:10: 'point'
            {
            match("point"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "POINT"

    // $ANTLR start "LINE"
    public final void mLINE() throws RecognitionException {
        try {
            int _type = LINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:326:6: ( 'line' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:326:8: 'line'
            {
            match("line"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINE"

    // $ANTLR start "FACE"
    public final void mFACE() throws RecognitionException {
        try {
            int _type = FACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:327:6: ( 'face' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:327:8: 'face'
            {
            match("face"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FACE"

    // $ANTLR start "SMOOTHING"
    public final void mSMOOTHING() throws RecognitionException {
        try {
            int _type = SMOOTHING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:328:11: ( 'smoothing' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:328:13: 'smoothing'
            {
            match("smoothing"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SMOOTHING"

    // $ANTLR start "GROUP"
    public final void mGROUP() throws RecognitionException {
        try {
            int _type = GROUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:329:7: ( 'group' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:329:9: 'group'
            {
            match("group"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GROUP"

    // $ANTLR start "ADD"
    public final void mADD() throws RecognitionException {
        try {
            int _type = ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:330:5: ( 'add' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:330:7: 'add'
            {
            match("add"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ADD"

    // $ANTLR start "DEFTEX"
    public final void mDEFTEX() throws RecognitionException {
        try {
            int _type = DEFTEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:331:8: ( 'deftex' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:331:10: 'deftex'
            {
            match("deftex"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEFTEX"

    // $ANTLR start "DEFNORM"
    public final void mDEFNORM() throws RecognitionException {
        try {
            int _type = DEFNORM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:332:9: ( 'defnorm' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:332:11: 'defnorm'
            {
            match("defnorm"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEFNORM"

    // $ANTLR start "DEFSMOOTH"
    public final void mDEFSMOOTH() throws RecognitionException {
        try {
            int _type = DEFSMOOTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:333:11: ( 'defsmooth' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:333:13: 'defsmooth'
            {
            match("defsmooth"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEFSMOOTH"

    // $ANTLR start "BOX"
    public final void mBOX() throws RecognitionException {
        try {
            int _type = BOX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:334:5: ( 'box' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:334:7: 'box'
            {
            match("box"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOX"

    // $ANTLR start "NEW"
    public final void mNEW() throws RecognitionException {
        try {
            int _type = NEW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:335:5: ( 'new' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:335:7: 'new'
            {
            match("new"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEW"

    // $ANTLR start "SCALE"
    public final void mSCALE() throws RecognitionException {
        try {
            int _type = SCALE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:338:7: ( 'scale' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:338:9: 'scale'
            {
            match("scale"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SCALE"

    // $ANTLR start "ROTATE"
    public final void mROTATE() throws RecognitionException {
        try {
            int _type = ROTATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:339:8: ( 'rotate' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:339:10: 'rotate'
            {
            match("rotate"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ROTATE"

    // $ANTLR start "TRASLATE"
    public final void mTRASLATE() throws RecognitionException {
        try {
            int _type = TRASLATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:340:10: ( 'traslate' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:340:12: 'traslate'
            {
            match("traslate"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRASLATE"

    // $ANTLR start "LSB"
    public final void mLSB() throws RecognitionException {
        try {
            int _type = LSB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:341:5: ( '[' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:341:7: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LSB"

    // $ANTLR start "RSB"
    public final void mRSB() throws RecognitionException {
        try {
            int _type = RSB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:342:5: ( ']' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:342:7: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RSB"

    // $ANTLR start "LTB"
    public final void mLTB() throws RecognitionException {
        try {
            int _type = LTB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:344:5: ( '(' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:344:7: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LTB"

    // $ANTLR start "RTB"
    public final void mRTB() throws RecognitionException {
        try {
            int _type = RTB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:345:5: ( ')' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:345:7: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RTB"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:347:7: ( ',' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:347:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:348:4: ( '=' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:348:6: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "SC"
    public final void mSC() throws RecognitionException {
        try {
            int _type = SC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:349:4: ( ';' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:349:6: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SC"

    // $ANTLR start "SINGLELINECM"
    public final void mSINGLELINECM() throws RecognitionException {
        try {
            int _type = SINGLELINECM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:352:14: ( '//' ( . )* ( '\\r' | '\\n' ) )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:352:16: '//' ( . )* ( '\\r' | '\\n' )
            {
            match("//"); 



            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:352:21: ( . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\n'||LA1_0=='\r') ) {
                    alt1=2;
                }
                else if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\f')||(LA1_0 >= '\u000E' && LA1_0 <= '\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:352:21: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SINGLELINECM"

    // $ANTLR start "MULTILINETEXTCM"
    public final void mMULTILINETEXTCM() throws RecognitionException {
        try {
            int _type = MULTILINETEXTCM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:353:17: ( '/*' ( . )* '*/' )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:353:19: '/*' ( . )* '*/'
            {
            match("/*"); 



            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:353:24: ( . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='*') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='/') ) {
                        alt2=2;
                    }
                    else if ( ((LA2_1 >= '\u0000' && LA2_1 <= '.')||(LA2_1 >= '0' && LA2_1 <= '\uFFFF')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0 >= '\u0000' && LA2_0 <= ')')||(LA2_0 >= '+' && LA2_0 <= '\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:353:24: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match("*/"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MULTILINETEXTCM"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:356:7: ( ( '-' )? ( '0' .. '9' )+ )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:356:9: ( '-' )? ( '0' .. '9' )+
            {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:356:9: ( '-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='-') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:356:10: '-'
                    {
                    match('-'); 

                    }
                    break;

            }


            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:356:16: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:357:7: ( ( '-' )? ( '0' .. '9' )* '.' ( '0' .. '9' )+ )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:357:9: ( '-' )? ( '0' .. '9' )* '.' ( '0' .. '9' )+
            {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:357:9: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:357:10: '-'
                    {
                    match('-'); 

                    }
                    break;

            }


            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:357:16: ( '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            match('.'); 

            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:357:32: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:358:7: ( ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) ) ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) | '_' )* )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:358:9: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) ) ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:359:9: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) | '_' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '0' && LA8_0 <= '9')||(LA8_0 >= 'A' && LA8_0 <= 'Z')||LA8_0=='_'||(LA8_0 >= 'a' && LA8_0 <= 'z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:360:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:360:7: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:360:7: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= '\t' && LA9_0 <= '\n')||LA9_0=='\r'||LA9_0==' ') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:8: ( VERTEX | VERTEXSET | VTEXTURE | TEXTURESET | VNORMAL | NORMALSET | POINT | LINE | FACE | SMOOTHING | GROUP | ADD | DEFTEX | DEFNORM | DEFSMOOTH | BOX | NEW | SCALE | ROTATE | TRASLATE | LSB | RSB | LTB | RTB | COMMA | EQ | SC | SINGLELINECM | MULTILINETEXTCM | INT | FLOAT | ID | WS )
        int alt10=33;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:10: VERTEX
                {
                mVERTEX(); 


                }
                break;
            case 2 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:17: VERTEXSET
                {
                mVERTEXSET(); 


                }
                break;
            case 3 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:27: VTEXTURE
                {
                mVTEXTURE(); 


                }
                break;
            case 4 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:36: TEXTURESET
                {
                mTEXTURESET(); 


                }
                break;
            case 5 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:47: VNORMAL
                {
                mVNORMAL(); 


                }
                break;
            case 6 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:55: NORMALSET
                {
                mNORMALSET(); 


                }
                break;
            case 7 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:65: POINT
                {
                mPOINT(); 


                }
                break;
            case 8 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:71: LINE
                {
                mLINE(); 


                }
                break;
            case 9 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:76: FACE
                {
                mFACE(); 


                }
                break;
            case 10 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:81: SMOOTHING
                {
                mSMOOTHING(); 


                }
                break;
            case 11 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:91: GROUP
                {
                mGROUP(); 


                }
                break;
            case 12 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:97: ADD
                {
                mADD(); 


                }
                break;
            case 13 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:101: DEFTEX
                {
                mDEFTEX(); 


                }
                break;
            case 14 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:108: DEFNORM
                {
                mDEFNORM(); 


                }
                break;
            case 15 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:116: DEFSMOOTH
                {
                mDEFSMOOTH(); 


                }
                break;
            case 16 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:126: BOX
                {
                mBOX(); 


                }
                break;
            case 17 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:130: NEW
                {
                mNEW(); 


                }
                break;
            case 18 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:134: SCALE
                {
                mSCALE(); 


                }
                break;
            case 19 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:140: ROTATE
                {
                mROTATE(); 


                }
                break;
            case 20 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:147: TRASLATE
                {
                mTRASLATE(); 


                }
                break;
            case 21 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:156: LSB
                {
                mLSB(); 


                }
                break;
            case 22 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:160: RSB
                {
                mRSB(); 


                }
                break;
            case 23 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:164: LTB
                {
                mLTB(); 


                }
                break;
            case 24 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:168: RTB
                {
                mRTB(); 


                }
                break;
            case 25 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:172: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 26 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:178: EQ
                {
                mEQ(); 


                }
                break;
            case 27 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:181: SC
                {
                mSC(); 


                }
                break;
            case 28 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:184: SINGLELINECM
                {
                mSINGLELINECM(); 


                }
                break;
            case 29 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:197: MULTILINETEXTCM
                {
                mMULTILINETEXTCM(); 


                }
                break;
            case 30 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:213: INT
                {
                mINT(); 


                }
                break;
            case 31 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:217: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 32 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:223: ID
                {
                mID(); 


                }
                break;
            case 33 :
                // /media/Data/Universita/V_anno/1_semestre/Linguaggi e Compilatori/Progetto/Git/LeC/Progetto_LeC/src/grammatica.g:1:226: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\1\uffff\14\30\11\uffff\1\55\3\uffff\21\30\3\uffff\6\30\1\105\6"+
        "\30\1\114\1\30\1\120\7\30\1\uffff\1\30\1\131\1\132\3\30\1\uffff"+
        "\3\30\1\uffff\7\30\1\150\2\uffff\1\30\1\152\1\153\4\30\1\161\5\30"+
        "\1\uffff\1\30\2\uffff\1\170\2\30\1\173\1\30\1\uffff\1\30\1\176\4"+
        "\30\1\uffff\1\u0083\1\30\1\uffff\1\30\1\u0086\1\uffff\1\30\1\u0088"+
        "\2\30\1\uffff\1\30\1\u008c\1\uffff\1\30\1\uffff\1\u008e\1\u008f"+
        "\1\u0090\1\uffff\1\u0091\4\uffff";
    static final String DFA10_eofS =
        "\u0092\uffff";
    static final String DFA10_minS =
        "\1\11\3\145\1\157\1\151\1\141\1\143\1\162\1\144\1\145\2\157\7\uffff"+
        "\1\52\2\56\3\uffff\1\162\1\145\1\157\1\170\1\141\1\162\1\167\1\151"+
        "\1\156\1\143\1\157\1\141\1\157\1\144\1\146\1\170\1\164\3\uffff\1"+
        "\164\1\170\1\162\1\164\1\163\1\155\1\60\1\156\2\145\1\157\1\154"+
        "\1\165\1\60\1\156\1\60\1\141\1\145\1\164\1\155\1\165\1\154\1\141"+
        "\1\uffff\1\164\2\60\1\164\1\145\1\160\1\uffff\1\145\1\157\1\155"+
        "\1\uffff\1\164\1\170\1\165\1\141\1\162\1\141\1\154\1\60\2\uffff"+
        "\1\150\2\60\1\170\1\162\1\157\1\145\1\60\1\162\1\154\1\145\1\164"+
        "\1\163\1\uffff\1\151\2\uffff\1\60\1\155\1\157\1\60\1\145\1\uffff"+
        "\1\145\1\60\1\163\2\145\1\156\1\uffff\1\60\1\164\1\uffff\1\164\1"+
        "\60\1\uffff\1\145\1\60\1\164\1\147\1\uffff\1\150\1\60\1\uffff\1"+
        "\164\1\uffff\3\60\1\uffff\1\60\4\uffff";
    static final String DFA10_maxS =
        "\1\172\1\164\1\162\2\157\1\151\1\141\1\155\1\162\1\144\1\145\2\157"+
        "\7\uffff\1\57\2\71\3\uffff\1\162\1\145\1\157\1\170\1\141\1\162\1"+
        "\167\1\151\1\156\1\143\1\157\1\141\1\157\1\144\1\146\1\170\1\164"+
        "\3\uffff\1\164\1\170\1\162\1\164\1\163\1\155\1\172\1\156\2\145\1"+
        "\157\1\154\1\165\1\172\1\164\1\172\1\141\1\145\1\164\1\155\1\165"+
        "\1\154\1\141\1\uffff\1\164\2\172\1\164\1\145\1\160\1\uffff\1\145"+
        "\1\157\1\155\1\uffff\1\164\1\170\1\165\1\141\1\162\1\141\1\154\1"+
        "\172\2\uffff\1\150\2\172\1\170\1\162\1\157\1\145\1\172\1\162\1\154"+
        "\1\145\1\164\1\163\1\uffff\1\151\2\uffff\1\172\1\155\1\157\1\172"+
        "\1\145\1\uffff\1\145\1\172\1\163\2\145\1\156\1\uffff\1\172\1\164"+
        "\1\uffff\1\164\1\172\1\uffff\1\145\1\172\1\164\1\147\1\uffff\1\150"+
        "\1\172\1\uffff\1\164\1\uffff\3\172\1\uffff\1\172\4\uffff";
    static final String DFA10_acceptS =
        "\15\uffff\1\25\1\26\1\27\1\30\1\31\1\32\1\33\3\uffff\1\37\1\40\1"+
        "\41\21\uffff\1\34\1\35\1\36\27\uffff\1\21\6\uffff\1\14\3\uffff\1"+
        "\20\10\uffff\1\10\1\11\15\uffff\1\7\1\uffff\1\22\1\13\5\uffff\1"+
        "\1\6\uffff\1\15\2\uffff\1\23\2\uffff\1\5\4\uffff\1\16\2\uffff\1"+
        "\3\1\uffff\1\24\3\uffff\1\2\1\uffff\1\6\1\12\1\17\1\4";
    static final String DFA10_specialS =
        "\u0092\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\31\2\uffff\1\31\22\uffff\1\31\7\uffff\1\17\1\20\2\uffff\1"+
            "\21\1\25\1\27\1\24\12\26\1\uffff\1\23\1\uffff\1\22\3\uffff\32"+
            "\30\1\15\1\uffff\1\16\3\uffff\1\11\1\13\1\30\1\12\1\30\1\6\1"+
            "\10\4\30\1\5\1\30\1\3\1\30\1\4\1\30\1\14\1\7\1\2\1\30\1\1\4"+
            "\30",
            "\1\32\10\uffff\1\34\5\uffff\1\33",
            "\1\35\14\uffff\1\36",
            "\1\40\11\uffff\1\37",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\45\11\uffff\1\44",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\54\4\uffff\1\53",
            "\1\27\1\uffff\12\26",
            "\1\27\1\uffff\12\26",
            "",
            "",
            "",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "",
            "",
            "",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\116\4\uffff\1\117\1\115",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "",
            "\1\130",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\133",
            "\1\134",
            "\1\135",
            "",
            "\1\136",
            "\1\137",
            "\1\140",
            "",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "",
            "\1\151",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\22\30\1\160\7\30",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "",
            "\1\167",
            "",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\171",
            "\1\172",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\174",
            "",
            "\1\175",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u0084",
            "",
            "\1\u0085",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\u0087",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u0089",
            "\1\u008a",
            "",
            "\1\u008b",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\u008d",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( VERTEX | VERTEXSET | VTEXTURE | TEXTURESET | VNORMAL | NORMALSET | POINT | LINE | FACE | SMOOTHING | GROUP | ADD | DEFTEX | DEFNORM | DEFSMOOTH | BOX | NEW | SCALE | ROTATE | TRASLATE | LSB | RSB | LTB | RTB | COMMA | EQ | SC | SINGLELINECM | MULTILINETEXTCM | INT | FLOAT | ID | WS );";
        }
    }
 

}