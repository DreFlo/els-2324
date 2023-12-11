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
    public static final int RULE_OBJECT_TYPES=6;
    public static final int RULE_SL_COMMENT=12;
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
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=10;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
    public static final int T__29=29;
    public static final int RULE_SELECTOR_KEYWORDS=8;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
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

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
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
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
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
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
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
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
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
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
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
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
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
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
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
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
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
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
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
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
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
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
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
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:26:7: ( 'replace' )
            // InternalTableDSL.g:26:9: 'replace'
            {
            match("replace"); 


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
            // InternalTableDSL.g:27:7: ( 'with' )
            // InternalTableDSL.g:27:9: 'with'
            {
            match("with"); 


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
            // InternalTableDSL.g:28:7: ( 'extract' )
            // InternalTableDSL.g:28:9: 'extract'
            {
            match("extract"); 


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
            // InternalTableDSL.g:29:7: ( 'sort' )
            // InternalTableDSL.g:29:9: 'sort'
            {
            match("sort"); 


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
            // InternalTableDSL.g:30:7: ( 'by' )
            // InternalTableDSL.g:30:9: 'by'
            {
            match("by"); 


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
            // InternalTableDSL.g:31:7: ( 'as' )
            // InternalTableDSL.g:31:9: 'as'
            {
            match("as"); 


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
            // InternalTableDSL.g:32:7: ( 'TOP' )
            // InternalTableDSL.g:32:9: 'TOP'
            {
            match("TOP"); 


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
            // InternalTableDSL.g:33:7: ( 'squash' )
            // InternalTableDSL.g:33:9: 'squash'
            {
            match("squash"); 


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
            // InternalTableDSL.g:34:7: ( 'rows' )
            // InternalTableDSL.g:34:9: 'rows'
            {
            match("rows"); 


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
            // InternalTableDSL.g:35:7: ( 'filter' )
            // InternalTableDSL.g:35:9: 'filter'
            {
            match("filter"); 


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
            // InternalTableDSL.g:36:7: ( 'deny' )
            // InternalTableDSL.g:36:9: 'deny'
            {
            match("deny"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:37:7: ( 'except' )
            // InternalTableDSL.g:37:9: 'except'
            {
            match("except"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:38:7: ( 'of' )
            // InternalTableDSL.g:38:9: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:39:7: ( 'reduce' )
            // InternalTableDSL.g:39:9: 'reduce'
            {
            match("reduce"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "RULE_SELECTOR_KEYWORDS"
    public final void mRULE_SELECTOR_KEYWORDS() throws RecognitionException {
        try {
            int _type = RULE_SELECTOR_KEYWORDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:4558:24: ( ( 'MAX' | 'MIN' | 'MEDIAN' | 'SUM' | 'AVG' ) )
            // InternalTableDSL.g:4558:26: ( 'MAX' | 'MIN' | 'MEDIAN' | 'SUM' | 'AVG' )
            {
            // InternalTableDSL.g:4558:26: ( 'MAX' | 'MIN' | 'MEDIAN' | 'SUM' | 'AVG' )
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
                    // InternalTableDSL.g:4558:27: 'MAX'
                    {
                    match("MAX"); 


                    }
                    break;
                case 2 :
                    // InternalTableDSL.g:4558:33: 'MIN'
                    {
                    match("MIN"); 


                    }
                    break;
                case 3 :
                    // InternalTableDSL.g:4558:39: 'MEDIAN'
                    {
                    match("MEDIAN"); 


                    }
                    break;
                case 4 :
                    // InternalTableDSL.g:4558:48: 'SUM'
                    {
                    match("SUM"); 


                    }
                    break;
                case 5 :
                    // InternalTableDSL.g:4558:54: 'AVG'
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

    // $ANTLR start "RULE_OBJECT_TYPES"
    public final void mRULE_OBJECT_TYPES() throws RecognitionException {
        try {
            int _type = RULE_OBJECT_TYPES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:4560:19: ( ( 'STRING' | 'NUMBER' | 'INTEGER' | 'FLOAT' | 'DOUBLE' | 'BOOLEAN' ) )
            // InternalTableDSL.g:4560:21: ( 'STRING' | 'NUMBER' | 'INTEGER' | 'FLOAT' | 'DOUBLE' | 'BOOLEAN' )
            {
            // InternalTableDSL.g:4560:21: ( 'STRING' | 'NUMBER' | 'INTEGER' | 'FLOAT' | 'DOUBLE' | 'BOOLEAN' )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 'S':
                {
                alt2=1;
                }
                break;
            case 'N':
                {
                alt2=2;
                }
                break;
            case 'I':
                {
                alt2=3;
                }
                break;
            case 'F':
                {
                alt2=4;
                }
                break;
            case 'D':
                {
                alt2=5;
                }
                break;
            case 'B':
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalTableDSL.g:4560:22: 'STRING'
                    {
                    match("STRING"); 


                    }
                    break;
                case 2 :
                    // InternalTableDSL.g:4560:31: 'NUMBER'
                    {
                    match("NUMBER"); 


                    }
                    break;
                case 3 :
                    // InternalTableDSL.g:4560:40: 'INTEGER'
                    {
                    match("INTEGER"); 


                    }
                    break;
                case 4 :
                    // InternalTableDSL.g:4560:50: 'FLOAT'
                    {
                    match("FLOAT"); 


                    }
                    break;
                case 5 :
                    // InternalTableDSL.g:4560:58: 'DOUBLE'
                    {
                    match("DOUBLE"); 


                    }
                    break;
                case 6 :
                    // InternalTableDSL.g:4560:67: 'BOOLEAN'
                    {
                    match("BOOLEAN"); 


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
    // $ANTLR end "RULE_OBJECT_TYPES"

    // $ANTLR start "RULE_COLUMN_NAME_KEYWORDS"
    public final void mRULE_COLUMN_NAME_KEYWORDS() throws RecognitionException {
        try {
            int _type = RULE_COLUMN_NAME_KEYWORDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTableDSL.g:4562:27: ( ( 'FILENAME' | 'DIRECTORY' | 'GENERATED' ) )
            // InternalTableDSL.g:4562:29: ( 'FILENAME' | 'DIRECTORY' | 'GENERATED' )
            {
            // InternalTableDSL.g:4562:29: ( 'FILENAME' | 'DIRECTORY' | 'GENERATED' )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 'F':
                {
                alt3=1;
                }
                break;
            case 'D':
                {
                alt3=2;
                }
                break;
            case 'G':
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalTableDSL.g:4562:30: 'FILENAME'
                    {
                    match("FILENAME"); 


                    }
                    break;
                case 2 :
                    // InternalTableDSL.g:4562:41: 'DIRECTORY'
                    {
                    match("DIRECTORY"); 


                    }
                    break;
                case 3 :
                    // InternalTableDSL.g:4562:53: 'GENERATED'
                    {
                    match("GENERATED"); 


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
            // InternalTableDSL.g:4564:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalTableDSL.g:4564:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalTableDSL.g:4564:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTableDSL.g:4564:11: '^'
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

            // InternalTableDSL.g:4564:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
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
            	    break loop5;
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
            // InternalTableDSL.g:4566:10: ( ( '0' .. '9' )+ )
            // InternalTableDSL.g:4566:12: ( '0' .. '9' )+
            {
            // InternalTableDSL.g:4566:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTableDSL.g:4566:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
            // InternalTableDSL.g:4568:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalTableDSL.g:4568:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalTableDSL.g:4568:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalTableDSL.g:4568:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalTableDSL.g:4568:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalTableDSL.g:4568:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTableDSL.g:4568:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalTableDSL.g:4568:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalTableDSL.g:4568:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalTableDSL.g:4568:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTableDSL.g:4568:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop8;
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
            // InternalTableDSL.g:4570:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalTableDSL.g:4570:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalTableDSL.g:4570:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTableDSL.g:4570:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
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
            // InternalTableDSL.g:4572:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalTableDSL.g:4572:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalTableDSL.g:4572:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTableDSL.g:4572:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop11;
                }
            } while (true);

            // InternalTableDSL.g:4572:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTableDSL.g:4572:41: ( '\\r' )? '\\n'
                    {
                    // InternalTableDSL.g:4572:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalTableDSL.g:4572:41: '\\r'
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
            // InternalTableDSL.g:4574:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalTableDSL.g:4574:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalTableDSL.g:4574:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
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
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
            // InternalTableDSL.g:4576:16: ( . )
            // InternalTableDSL.g:4576:18: .
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
        // InternalTableDSL.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | RULE_SELECTOR_KEYWORDS | RULE_OBJECT_TYPES | RULE_COLUMN_NAME_KEYWORDS | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=39;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // InternalTableDSL.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalTableDSL.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalTableDSL.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalTableDSL.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalTableDSL.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalTableDSL.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalTableDSL.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalTableDSL.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalTableDSL.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalTableDSL.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalTableDSL.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalTableDSL.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalTableDSL.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalTableDSL.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalTableDSL.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalTableDSL.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalTableDSL.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalTableDSL.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalTableDSL.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalTableDSL.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalTableDSL.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalTableDSL.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalTableDSL.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalTableDSL.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalTableDSL.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // InternalTableDSL.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // InternalTableDSL.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // InternalTableDSL.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // InternalTableDSL.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // InternalTableDSL.g:1:184: RULE_SELECTOR_KEYWORDS
                {
                mRULE_SELECTOR_KEYWORDS(); 

                }
                break;
            case 31 :
                // InternalTableDSL.g:1:207: RULE_OBJECT_TYPES
                {
                mRULE_OBJECT_TYPES(); 

                }
                break;
            case 32 :
                // InternalTableDSL.g:1:225: RULE_COLUMN_NAME_KEYWORDS
                {
                mRULE_COLUMN_NAME_KEYWORDS(); 

                }
                break;
            case 33 :
                // InternalTableDSL.g:1:251: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 34 :
                // InternalTableDSL.g:1:259: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 35 :
                // InternalTableDSL.g:1:268: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 36 :
                // InternalTableDSL.g:1:280: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 37 :
                // InternalTableDSL.g:1:296: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 38 :
                // InternalTableDSL.g:1:312: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 39 :
                // InternalTableDSL.g:1:320: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\5\43\1\uffff\22\43\1\40\2\uffff\3\40\2\uffff\2\43\1\uffff\2\43\1\121\1\43\1\123\3\43\1\uffff\7\43\1\140\2\43\1\144\20\43\5\uffff\4\43\1\uffff\1\43\1\uffff\14\43\1\uffff\3\43\1\uffff\1\u0089\1\43\2\u008b\1\43\1\u008b\1\43\1\u008b\15\43\1\u009b\1\43\1\u009d\1\43\1\u009f\4\43\1\u00a4\2\43\1\u00a7\2\43\1\uffff\1\u00aa\1\uffff\16\43\1\u00b9\1\uffff\1\43\1\uffff\1\43\1\uffff\4\43\1\uffff\2\43\1\uffff\2\43\1\uffff\4\43\1\u00c8\5\43\1\u00cf\1\u00d0\1\u00d2\1\u00d3\1\uffff\1\u00d4\1\u00d5\1\u00d6\1\u00d7\1\43\1\u00d9\1\43\1\u00db\1\43\1\u00dd\1\u008b\2\u00c8\1\43\1\uffff\1\43\1\u00c8\3\43\1\u00e3\2\uffff\1\u00e4\6\uffff\1\u00e5\1\uffff\1\u00e6\1\uffff\1\u00e7\1\uffff\1\u00c8\2\43\1\u00c8\1\43\5\uffff\1\u00eb\2\43\1\uffff\2\u00eb";
    static final String DFA15_eofS =
        "\u00ee\uffff";
    static final String DFA15_minS =
        "\1\0\1\157\1\142\1\141\1\151\1\157\1\uffff\2\145\1\162\1\160\1\151\1\170\1\171\1\117\1\145\1\101\1\124\1\126\1\125\1\116\2\111\1\117\1\105\1\101\2\uffff\2\0\1\52\2\uffff\1\154\1\145\1\uffff\1\152\1\164\1\60\1\142\1\60\1\157\1\154\1\141\1\uffff\1\154\1\162\1\165\1\144\1\167\1\145\1\160\1\60\1\164\1\143\1\60\1\120\1\156\1\130\1\116\1\104\1\115\1\122\1\107\1\115\1\124\1\117\1\114\1\125\1\122\1\117\1\116\5\uffff\1\165\1\141\1\145\1\160\1\uffff\1\154\1\uffff\1\155\1\164\1\144\1\145\1\164\2\141\1\154\1\165\1\163\1\160\1\145\1\uffff\1\150\1\162\1\145\1\uffff\1\60\1\171\2\60\1\111\1\60\1\111\1\60\1\102\1\105\1\101\1\105\1\102\1\105\1\114\1\105\1\155\1\164\1\143\1\165\1\145\1\60\1\145\1\60\1\143\1\60\1\163\1\155\1\141\1\143\1\60\1\145\1\156\1\60\1\141\1\160\1\uffff\1\60\1\uffff\1\101\1\116\1\105\1\107\1\124\1\116\1\114\1\103\1\105\1\122\1\156\1\145\2\164\1\60\1\uffff\1\162\1\uffff\1\164\1\uffff\1\150\1\145\1\143\1\145\1\uffff\1\156\1\144\1\uffff\1\143\1\164\1\uffff\1\116\1\107\1\122\1\105\1\60\1\101\1\105\1\124\2\101\4\60\1\uffff\4\60\1\145\1\60\1\144\1\60\1\164\4\60\1\122\1\uffff\1\115\1\60\1\117\1\116\1\124\1\60\2\uffff\1\60\6\uffff\1\60\1\uffff\1\60\1\uffff\1\60\1\uffff\1\60\1\105\1\122\1\60\1\105\5\uffff\1\60\1\131\1\104\1\uffff\2\60";
    static final String DFA15_maxS =
        "\1\uffff\1\162\1\165\1\157\1\162\1\157\1\uffff\1\161\1\157\1\162\1\163\1\151\1\170\1\171\1\117\1\145\1\111\1\125\1\126\1\125\1\116\1\114\2\117\1\105\1\172\2\uffff\2\uffff\1\57\2\uffff\1\154\1\145\1\uffff\1\152\1\164\1\172\1\142\1\172\1\157\1\154\1\141\1\uffff\1\154\1\162\1\165\1\160\1\167\1\145\1\160\1\172\2\164\1\172\1\120\1\156\1\130\1\116\1\104\1\115\1\122\1\107\1\115\1\124\1\117\1\114\1\125\1\122\1\117\1\116\5\uffff\1\165\1\141\1\145\1\160\1\uffff\1\154\1\uffff\1\155\1\164\1\144\1\145\1\164\2\141\1\154\1\165\1\163\1\160\1\145\1\uffff\1\150\1\162\1\145\1\uffff\1\172\1\171\2\172\1\111\1\172\1\111\1\172\1\102\1\105\1\101\1\105\1\102\1\105\1\114\1\105\1\155\1\164\1\143\1\165\1\145\1\172\1\145\1\172\1\143\1\172\1\163\1\155\1\141\1\143\1\172\1\145\1\156\1\172\1\141\1\160\1\uffff\1\172\1\uffff\1\101\1\116\1\105\1\107\1\124\1\116\1\114\1\103\1\105\1\122\1\156\1\145\2\164\1\172\1\uffff\1\162\1\uffff\1\164\1\uffff\1\150\1\145\1\143\1\145\1\uffff\1\156\1\144\1\uffff\1\143\1\164\1\uffff\1\116\1\107\1\122\1\105\1\172\1\101\1\105\1\124\2\101\4\172\1\uffff\4\172\1\145\1\172\1\144\1\172\1\164\4\172\1\122\1\uffff\1\115\1\172\1\117\1\116\1\124\1\172\2\uffff\1\172\6\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\105\1\122\1\172\1\105\5\uffff\1\172\1\131\1\104\1\uffff\2\172";
    static final String DFA15_acceptS =
        "\6\uffff\1\11\23\uffff\1\41\1\42\3\uffff\1\46\1\47\2\uffff\1\41\10\uffff\1\11\33\uffff\1\42\1\43\1\44\1\45\1\46\4\uffff\1\34\1\uffff\1\13\14\uffff\1\25\3\uffff\1\24\44\uffff\1\26\1\uffff\1\36\17\uffff\1\7\1\uffff\1\10\1\uffff\1\23\4\uffff\1\30\2\uffff\1\21\2\uffff\1\32\16\uffff\1\6\16\uffff\1\37\6\uffff\1\1\1\5\1\uffff\1\3\1\12\1\31\1\14\1\27\1\15\1\uffff\1\35\1\uffff\1\17\1\uffff\1\33\5\uffff\1\2\1\4\1\20\1\16\1\22\3\uffff\1\40\2\uffff";
    static final String DFA15_specialS =
        "\1\2\33\uffff\1\0\1\1\u00d0\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\40\2\37\2\40\1\37\22\40\1\37\1\40\1\34\4\40\1\35\4\40\1\6\2\40\1\36\12\33\7\40\1\22\1\27\1\32\1\26\1\32\1\25\1\30\1\32\1\24\3\32\1\20\1\23\4\32\1\21\1\16\6\32\3\40\1\31\1\32\1\40\1\12\1\15\1\1\1\17\1\14\1\4\5\32\1\5\2\32\1\2\1\11\1\32\1\10\1\7\1\3\2\32\1\13\3\32\uff85\40",
            "\1\41\2\uffff\1\42",
            "\1\44\3\uffff\1\46\16\uffff\1\45",
            "\1\47\15\uffff\1\50",
            "\1\52\10\uffff\1\51",
            "\1\53",
            "",
            "\1\55\11\uffff\1\56\1\uffff\1\57",
            "\1\60\11\uffff\1\61",
            "\1\62",
            "\1\63\2\uffff\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72\3\uffff\1\74\3\uffff\1\73",
            "\1\76\1\75",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\103\2\uffff\1\102",
            "\1\105\5\uffff\1\104",
            "\1\106",
            "\1\107",
            "\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "\0\111",
            "\0\111",
            "\1\112\4\uffff\1\113",
            "",
            "",
            "\1\115",
            "\1\116",
            "",
            "\1\117",
            "\1\120",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\122",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\124",
            "\1\125",
            "\1\126",
            "",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\134\11\uffff\1\132\1\uffff\1\133",
            "\1\135",
            "\1\136",
            "\1\137",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\141",
            "\1\143\20\uffff\1\142",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
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
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "",
            "",
            "",
            "",
            "",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "",
            "\1\171",
            "",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u008a",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u008c",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u008d",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u009c",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u009e",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00a5",
            "\1\u00a6",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00a8",
            "\1\u00a9",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\u00ba",
            "",
            "\1\u00bb",
            "",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "",
            "\1\u00c0",
            "\1\u00c1",
            "",
            "\1\u00c2",
            "\1\u00c3",
            "",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\22\43\1\u00ce\7\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\22\43\1\u00d1\7\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00d8",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00da",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00dc",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00de",
            "",
            "\1\u00df",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00e8",
            "\1\u00e9",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00ea",
            "",
            "",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00ec",
            "\1\u00ed",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43"
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | RULE_SELECTOR_KEYWORDS | RULE_OBJECT_TYPES | RULE_COLUMN_NAME_KEYWORDS | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_28 = input.LA(1);

                        s = -1;
                        if ( ((LA15_28>='\u0000' && LA15_28<='\uFFFF')) ) {s = 73;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_29 = input.LA(1);

                        s = -1;
                        if ( ((LA15_29>='\u0000' && LA15_29<='\uFFFF')) ) {s = 73;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='c') ) {s = 1;}

                        else if ( (LA15_0=='o') ) {s = 2;}

                        else if ( (LA15_0=='t') ) {s = 3;}

                        else if ( (LA15_0=='f') ) {s = 4;}

                        else if ( (LA15_0=='l') ) {s = 5;}

                        else if ( (LA15_0==',') ) {s = 6;}

                        else if ( (LA15_0=='s') ) {s = 7;}

                        else if ( (LA15_0=='r') ) {s = 8;}

                        else if ( (LA15_0=='p') ) {s = 9;}

                        else if ( (LA15_0=='a') ) {s = 10;}

                        else if ( (LA15_0=='w') ) {s = 11;}

                        else if ( (LA15_0=='e') ) {s = 12;}

                        else if ( (LA15_0=='b') ) {s = 13;}

                        else if ( (LA15_0=='T') ) {s = 14;}

                        else if ( (LA15_0=='d') ) {s = 15;}

                        else if ( (LA15_0=='M') ) {s = 16;}

                        else if ( (LA15_0=='S') ) {s = 17;}

                        else if ( (LA15_0=='A') ) {s = 18;}

                        else if ( (LA15_0=='N') ) {s = 19;}

                        else if ( (LA15_0=='I') ) {s = 20;}

                        else if ( (LA15_0=='F') ) {s = 21;}

                        else if ( (LA15_0=='D') ) {s = 22;}

                        else if ( (LA15_0=='B') ) {s = 23;}

                        else if ( (LA15_0=='G') ) {s = 24;}

                        else if ( (LA15_0=='^') ) {s = 25;}

                        else if ( (LA15_0=='C'||LA15_0=='E'||LA15_0=='H'||(LA15_0>='J' && LA15_0<='L')||(LA15_0>='O' && LA15_0<='R')||(LA15_0>='U' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='g' && LA15_0<='k')||(LA15_0>='m' && LA15_0<='n')||LA15_0=='q'||(LA15_0>='u' && LA15_0<='v')||(LA15_0>='x' && LA15_0<='z')) ) {s = 26;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 27;}

                        else if ( (LA15_0=='\"') ) {s = 28;}

                        else if ( (LA15_0=='\'') ) {s = 29;}

                        else if ( (LA15_0=='/') ) {s = 30;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 31;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='#' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='+')||(LA15_0>='-' && LA15_0<='.')||(LA15_0>=':' && LA15_0<='@')||(LA15_0>='[' && LA15_0<=']')||LA15_0=='`'||(LA15_0>='{' && LA15_0<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}