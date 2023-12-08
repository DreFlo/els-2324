package org.feup.els5.dsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTableDSLLexer extends Lexer {
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int RULE_COLUMN_NAME_KEYWORDS=4;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=9;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int RULE_SELECTOR_KEYWORDS=7;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalTableDSLLexer() {;} 
    public InternalTableDSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalTableDSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalTableDSL.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:11:7: ( 'column' )
            // InternalTableDSL.g:11:9: 'column'
            {
            match("column"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:12:7: ( 'columns' )
            // InternalTableDSL.g:12:9: 'columns'
            {
            match("columns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:13:7: ( 'object' )
            // InternalTableDSL.g:13:9: 'object'
            {
            match("object"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:14:7: ( 'objects' )
            // InternalTableDSL.g:14:9: 'objects'
            {
            match("objects"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:15:7: ( 'create' )
            // InternalTableDSL.g:15:9: 'create'
            {
            match("create"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:16:7: ( 'table' )
            // InternalTableDSL.g:16:9: 'table'
            {
            match("table"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:17:7: ( 'from' )
            // InternalTableDSL.g:17:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:18:7: ( 'load' )
            // InternalTableDSL.g:18:9: 'load'
            {
            match("load"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:19:7: ( ',' )
            // InternalTableDSL.g:19:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:20:7: ( 'output' )
            // InternalTableDSL.g:20:9: 'output'
            {
            match("output"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:21:7: ( 'to' )
            // InternalTableDSL.g:21:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:22:7: ( 'select' )
            // InternalTableDSL.g:22:9: 'select'
            {
            match("select"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:23:7: ( 'rename' )
            // InternalTableDSL.g:23:9: 'rename'
            {
            match("rename"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:24:7: ( 'prepend' )
            // InternalTableDSL.g:24:9: 'prepend'
            {
            match("prepend"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:25:7: ( 'append' )
            // InternalTableDSL.g:25:9: 'append'
            {
            match("append"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:26:7: ( 'extract' )
            // InternalTableDSL.g:26:9: 'extract'
            {
            match("extract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:27:7: ( 'sort' )
            // InternalTableDSL.g:27:9: 'sort'
            {
            match("sort"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:28:7: ( 'by' )
            // InternalTableDSL.g:28:9: 'by'
            {
            match("by"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:29:7: ( 'as' )
            // InternalTableDSL.g:29:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:30:7: ( 'TOP' )
            // InternalTableDSL.g:30:9: 'TOP'
            {
            match("TOP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:31:7: ( 'squash' )
            // InternalTableDSL.g:31:9: 'squash'
            {
            match("squash"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:32:7: ( 'rows' )
            // InternalTableDSL.g:32:9: 'rows'
            {
            match("rows"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:33:7: ( 'filter' )
            // InternalTableDSL.g:33:9: 'filter'
            {
            match("filter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:34:7: ( 'deny' )
            // InternalTableDSL.g:34:9: 'deny'
            {
            match("deny"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:35:7: ( 'except' )
            // InternalTableDSL.g:35:9: 'except'
            {
            match("except"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:36:7: ( 'of' )
            // InternalTableDSL.g:36:9: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:37:7: ( 'reduce' )
            // InternalTableDSL.g:37:9: 'reduce'
            {
            match("reduce"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "RULE_SELECTOR_KEYWORDS"
    public final void mRULE_SELECTOR_KEYWORDS() throws RecognitionException {
        try {
            int _type = RULE_SELECTOR_KEYWORDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:4328:24: ( ( 'MAX' | 'MIN' | 'MEDIAN' | 'SUM' | 'AVG' ) )
            // InternalTableDSL.g:4328:26: ( 'MAX' | 'MIN' | 'MEDIAN' | 'SUM' | 'AVG' )
            {
            // InternalTableDSL.g:4328:26: ( 'MAX' | 'MIN' | 'MEDIAN' | 'SUM' | 'AVG' )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 'M':
                {
                switch ( input.LA(2) ) {
                case 'A':
                    {
                    alt1=1;
                    }
                    break;
                case 'I':
                    {
                    alt1=2;
                    }
                    break;
                case 'E':
                    {
                    alt1=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }

                }
                break;
            case 'S':
                {
                alt1=4;
                }
                break;
            case 'A':
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalTableDSL.g:4328:27: 'MAX'
                    {
                    match("MAX"); 


                    }
                    break;
                case 2 :
                    // InternalTableDSL.g:4328:33: 'MIN'
                    {
                    match("MIN"); 


                    }
                    break;
                case 3 :
                    // InternalTableDSL.g:4328:39: 'MEDIAN'
                    {
                    match("MEDIAN"); 


                    }
                    break;
                case 4 :
                    // InternalTableDSL.g:4328:48: 'SUM'
                    {
                    match("SUM"); 


                    }
                    break;
                case 5 :
                    // InternalTableDSL.g:4328:54: 'AVG'
                    {
                    match("AVG"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SELECTOR_KEYWORDS"

    // $ANTLR start "RULE_COLUMN_NAME_KEYWORDS"
    public final void mRULE_COLUMN_NAME_KEYWORDS() throws RecognitionException {
        try {
            int _type = RULE_COLUMN_NAME_KEYWORDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:4330:27: ( ( 'FILENAME' | 'DIRECTORY' ) )
            // InternalTableDSL.g:4330:29: ( 'FILENAME' | 'DIRECTORY' )
            {
            // InternalTableDSL.g:4330:29: ( 'FILENAME' | 'DIRECTORY' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='F') ) {
                alt2=1;
            }
            else if ( (LA2_0=='D') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTableDSL.g:4330:30: 'FILENAME'
                    {
                    match("FILENAME"); 


                    }
                    break;
                case 2 :
                    // InternalTableDSL.g:4330:41: 'DIRECTORY'
                    {
                    match("DIRECTORY"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLUMN_NAME_KEYWORDS"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:4332:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalTableDSL.g:4332:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalTableDSL.g:4332:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTableDSL.g:4332:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalTableDSL.g:4332:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTableDSL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:4334:10: ( ( '0' .. '9' )+ )
            // InternalTableDSL.g:4334:12: ( '0' .. '9' )+
            {
            // InternalTableDSL.g:4334:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTableDSL.g:4334:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:4336:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalTableDSL.g:4336:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalTableDSL.g:4336:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTableDSL.g:4336:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalTableDSL.g:4336:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalTableDSL.g:4336:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTableDSL.g:4336:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalTableDSL.g:4336:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalTableDSL.g:4336:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalTableDSL.g:4336:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTableDSL.g:4336:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:4338:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalTableDSL.g:4338:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalTableDSL.g:4338:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTableDSL.g:4338:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:4340:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalTableDSL.g:4340:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalTableDSL.g:4340:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTableDSL.g:4340:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalTableDSL.g:4340:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTableDSL.g:4340:41: ( '\\r' )? '\\n'
                    {
                    // InternalTableDSL.g:4340:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalTableDSL.g:4340:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:4342:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalTableDSL.g:4342:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalTableDSL.g:4342:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTableDSL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:4344:16: ( . )
            // InternalTableDSL.g:4344:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalTableDSL.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | RULE_SELECTOR_KEYWORDS | RULE_COLUMN_NAME_KEYWORDS | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=36;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalTableDSL.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalTableDSL.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalTableDSL.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalTableDSL.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalTableDSL.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalTableDSL.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalTableDSL.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalTableDSL.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalTableDSL.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalTableDSL.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalTableDSL.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalTableDSL.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalTableDSL.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalTableDSL.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalTableDSL.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalTableDSL.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalTableDSL.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalTableDSL.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalTableDSL.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalTableDSL.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalTableDSL.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalTableDSL.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalTableDSL.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalTableDSL.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // InternalTableDSL.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // InternalTableDSL.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // InternalTableDSL.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // InternalTableDSL.g:1:172: RULE_SELECTOR_KEYWORDS
                {
                mRULE_SELECTOR_KEYWORDS(); 

                }
                break;
            case 29 :
                // InternalTableDSL.g:1:195: RULE_COLUMN_NAME_KEYWORDS
                {
                mRULE_COLUMN_NAME_KEYWORDS(); 

                }
                break;
            case 30 :
                // InternalTableDSL.g:1:221: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 31 :
                // InternalTableDSL.g:1:229: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 32 :
                // InternalTableDSL.g:1:238: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 33 :
                // InternalTableDSL.g:1:250: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 34 :
                // InternalTableDSL.g:1:266: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 35 :
                // InternalTableDSL.g:1:282: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 36 :
                // InternalTableDSL.g:1:290: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\5\36\1\uffff\15\36\1\33\2\uffff\3\33\2\uffff\2\36\1\uffff\2\36\1\104\1\36\1\106\3\36\1\uffff\7\36\1\122\1\36\1\125\11\36\5\uffff\4\36\1\uffff\1\36\1\uffff\13\36\1\uffff\2\36\1\uffff\1\161\1\36\2\163\1\36\2\163\7\36\1\174\1\36\1\176\1\36\1\u0080\3\36\1\u0084\4\36\1\uffff\1\u0089\1\uffff\7\36\1\u0091\1\uffff\1\36\1\uffff\1\36\1\uffff\3\36\1\uffff\4\36\1\uffff\3\36\1\u009f\1\u00a0\1\u00a2\1\u00a3\1\uffff\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\36\1\u00aa\1\36\1\u00ac\1\163\2\36\1\u00af\2\uffff\1\u00b0\7\uffff\1\u00b1\1\uffff\1\u00b2\1\uffff\2\36\4\uffff\1\u00b5\1\36\1\uffff\1\u00b5";
    static final String DFA14_eofS =
        "\u00b7\uffff";
    static final String DFA14_minS =
        "\1\0\1\157\1\142\1\141\1\151\1\157\1\uffff\2\145\1\162\1\160\1\170\1\171\1\117\1\145\1\101\1\125\1\126\2\111\1\101\2\uffff\2\0\1\52\2\uffff\1\154\1\145\1\uffff\1\152\1\164\1\60\1\142\1\60\1\157\1\154\1\141\1\uffff\1\154\1\162\1\165\1\144\1\167\1\145\1\160\1\60\1\143\1\60\1\120\1\156\1\130\1\116\1\104\1\115\1\107\1\114\1\122\5\uffff\1\165\1\141\1\145\1\160\1\uffff\1\154\1\uffff\1\155\1\164\1\144\1\145\1\164\2\141\1\165\1\163\1\160\1\145\1\uffff\1\162\1\145\1\uffff\1\60\1\171\2\60\1\111\2\60\2\105\1\155\1\164\1\143\1\165\1\145\1\60\1\145\1\60\1\143\1\60\1\163\1\155\1\143\1\60\1\145\1\156\1\141\1\160\1\uffff\1\60\1\uffff\1\101\1\116\1\103\1\156\1\145\2\164\1\60\1\uffff\1\162\1\uffff\1\164\1\uffff\1\150\2\145\1\uffff\1\156\1\144\1\143\1\164\1\uffff\1\116\1\101\1\124\4\60\1\uffff\5\60\1\144\1\60\1\164\2\60\1\115\1\117\1\60\2\uffff\1\60\7\uffff\1\60\1\uffff\1\60\1\uffff\1\105\1\122\4\uffff\1\60\1\131\1\uffff\1\60";
    static final String DFA14_maxS =
        "\1\uffff\1\162\1\165\1\157\1\162\1\157\1\uffff\1\161\1\157\1\162\1\163\1\170\1\171\1\117\1\145\1\111\1\125\1\126\2\111\1\172\2\uffff\2\uffff\1\57\2\uffff\1\154\1\145\1\uffff\1\152\1\164\1\172\1\142\1\172\1\157\1\154\1\141\1\uffff\1\154\1\162\1\165\1\156\1\167\1\145\1\160\1\172\1\164\1\172\1\120\1\156\1\130\1\116\1\104\1\115\1\107\1\114\1\122\5\uffff\1\165\1\141\1\145\1\160\1\uffff\1\154\1\uffff\1\155\1\164\1\144\1\145\1\164\2\141\1\165\1\163\1\160\1\145\1\uffff\1\162\1\145\1\uffff\1\172\1\171\2\172\1\111\2\172\2\105\1\155\1\164\1\143\1\165\1\145\1\172\1\145\1\172\1\143\1\172\1\163\1\155\1\143\1\172\1\145\1\156\1\141\1\160\1\uffff\1\172\1\uffff\1\101\1\116\1\103\1\156\1\145\2\164\1\172\1\uffff\1\162\1\uffff\1\164\1\uffff\1\150\2\145\1\uffff\1\156\1\144\1\143\1\164\1\uffff\1\116\1\101\1\124\4\172\1\uffff\5\172\1\144\1\172\1\164\2\172\1\115\1\117\1\172\2\uffff\1\172\7\uffff\1\172\1\uffff\1\172\1\uffff\1\105\1\122\4\uffff\1\172\1\131\1\uffff\1\172";
    static final String DFA14_acceptS =
        "\6\uffff\1\11\16\uffff\1\36\1\37\3\uffff\1\43\1\44\2\uffff\1\36\10\uffff\1\11\23\uffff\1\37\1\40\1\41\1\42\1\43\4\uffff\1\32\1\uffff\1\13\13\uffff\1\23\2\uffff\1\22\33\uffff\1\24\1\uffff\1\34\10\uffff\1\7\1\uffff\1\10\1\uffff\1\21\3\uffff\1\26\4\uffff\1\30\7\uffff\1\6\15\uffff\1\1\1\5\1\uffff\1\3\1\12\1\27\1\14\1\25\1\15\1\33\1\uffff\1\17\1\uffff\1\31\2\uffff\1\2\1\4\1\16\1\20\2\uffff\1\35\1\uffff";
    static final String DFA14_specialS =
        "\1\0\26\uffff\1\2\1\1\u009e\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\33\2\32\2\33\1\32\22\33\1\32\1\33\1\27\4\33\1\30\4\33\1\6\2\33\1\31\12\26\7\33\1\21\2\25\1\23\1\25\1\22\6\25\1\17\5\25\1\20\1\15\6\25\3\33\1\24\1\25\1\33\1\12\1\14\1\1\1\16\1\13\1\4\5\25\1\5\2\25\1\2\1\11\1\25\1\10\1\7\1\3\6\25\uff85\33",
            "\1\34\2\uffff\1\35",
            "\1\37\3\uffff\1\41\16\uffff\1\40",
            "\1\42\15\uffff\1\43",
            "\1\45\10\uffff\1\44",
            "\1\46",
            "",
            "\1\50\11\uffff\1\51\1\uffff\1\52",
            "\1\53\11\uffff\1\54",
            "\1\55",
            "\1\56\2\uffff\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64\3\uffff\1\66\3\uffff\1\65",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "\0\74",
            "\0\74",
            "\1\75\4\uffff\1\76",
            "",
            "",
            "\1\100",
            "\1\101",
            "",
            "\1\102",
            "\1\103",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\105",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\107",
            "\1\110",
            "\1\111",
            "",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\116\11\uffff\1\115",
            "\1\117",
            "\1\120",
            "\1\121",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\124\20\uffff\1\123",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "",
            "",
            "",
            "",
            "",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "",
            "\1\143",
            "",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "",
            "\1\157",
            "\1\160",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\162",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\164",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\175",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\177",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\u0092",
            "",
            "\1\u0093",
            "",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\22\36\1\u009e\7\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\22\36\1\u00a1\7\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u00a9",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u00ab",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u00ad",
            "\1\u00ae",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\u00b3",
            "\1\u00b4",
            "",
            "",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u00b6",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36"
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | RULE_SELECTOR_KEYWORDS | RULE_COLUMN_NAME_KEYWORDS | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='c') ) {s = 1;}

                        else if ( (LA14_0=='o') ) {s = 2;}

                        else if ( (LA14_0=='t') ) {s = 3;}

                        else if ( (LA14_0=='f') ) {s = 4;}

                        else if ( (LA14_0=='l') ) {s = 5;}

                        else if ( (LA14_0==',') ) {s = 6;}

                        else if ( (LA14_0=='s') ) {s = 7;}

                        else if ( (LA14_0=='r') ) {s = 8;}

                        else if ( (LA14_0=='p') ) {s = 9;}

                        else if ( (LA14_0=='a') ) {s = 10;}

                        else if ( (LA14_0=='e') ) {s = 11;}

                        else if ( (LA14_0=='b') ) {s = 12;}

                        else if ( (LA14_0=='T') ) {s = 13;}

                        else if ( (LA14_0=='d') ) {s = 14;}

                        else if ( (LA14_0=='M') ) {s = 15;}

                        else if ( (LA14_0=='S') ) {s = 16;}

                        else if ( (LA14_0=='A') ) {s = 17;}

                        else if ( (LA14_0=='F') ) {s = 18;}

                        else if ( (LA14_0=='D') ) {s = 19;}

                        else if ( (LA14_0=='^') ) {s = 20;}

                        else if ( ((LA14_0>='B' && LA14_0<='C')||LA14_0=='E'||(LA14_0>='G' && LA14_0<='L')||(LA14_0>='N' && LA14_0<='R')||(LA14_0>='U' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='g' && LA14_0<='k')||(LA14_0>='m' && LA14_0<='n')||LA14_0=='q'||(LA14_0>='u' && LA14_0<='z')) ) {s = 21;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 22;}

                        else if ( (LA14_0=='\"') ) {s = 23;}

                        else if ( (LA14_0=='\'') ) {s = 24;}

                        else if ( (LA14_0=='/') ) {s = 25;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 26;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='+')||(LA14_0>='-' && LA14_0<='.')||(LA14_0>=':' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_24 = input.LA(1);

                        s = -1;
                        if ( ((LA14_24>='\u0000' && LA14_24<='\uFFFF')) ) {s = 60;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_23 = input.LA(1);

                        s = -1;
                        if ( ((LA14_23>='\u0000' && LA14_23<='\uFFFF')) ) {s = 60;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}