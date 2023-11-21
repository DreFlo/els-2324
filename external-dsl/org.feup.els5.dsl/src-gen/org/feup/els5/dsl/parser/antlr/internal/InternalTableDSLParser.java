package org.feup.els5.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.feup.els5.dsl.services.TableDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTableDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ANY_OTHER", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'create'", "'table'", "'from'", "'load'", "','", "'output'", "'to'", "'select'", "'rename'", "'column'", "'extract'", "'squash'", "'rows'", "'by'", "'filter'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=4;
    public static final int RULE_INT=7;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTableDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTableDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTableDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTableDSL.g"; }



     	private TableDSLGrammarAccess grammarAccess;

        public InternalTableDSLParser(TokenStream input, TableDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Start";
       	}

       	@Override
       	protected TableDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleStart"
    // InternalTableDSL.g:64:1: entryRuleStart returns [EObject current=null] : iv_ruleStart= ruleStart EOF ;
    public final EObject entryRuleStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStart = null;


        try {
            // InternalTableDSL.g:64:46: (iv_ruleStart= ruleStart EOF )
            // InternalTableDSL.g:65:2: iv_ruleStart= ruleStart EOF
            {
             newCompositeNode(grammarAccess.getStartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStart=ruleStart();

            state._fsp--;

             current =iv_ruleStart; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStart"


    // $ANTLR start "ruleStart"
    // InternalTableDSL.g:71:1: ruleStart returns [EObject current=null] : ( ( (lv_actions_0_0= ruleCreateTable ) )? ( (lv_actions_1_0= ruleTableAction ) )* ) ;
    public final EObject ruleStart() throws RecognitionException {
        EObject current = null;

        EObject lv_actions_0_0 = null;

        EObject lv_actions_1_0 = null;



        	enterRule();

        try {
            // InternalTableDSL.g:77:2: ( ( ( (lv_actions_0_0= ruleCreateTable ) )? ( (lv_actions_1_0= ruleTableAction ) )* ) )
            // InternalTableDSL.g:78:2: ( ( (lv_actions_0_0= ruleCreateTable ) )? ( (lv_actions_1_0= ruleTableAction ) )* )
            {
            // InternalTableDSL.g:78:2: ( ( (lv_actions_0_0= ruleCreateTable ) )? ( (lv_actions_1_0= ruleTableAction ) )* )
            // InternalTableDSL.g:79:3: ( (lv_actions_0_0= ruleCreateTable ) )? ( (lv_actions_1_0= ruleTableAction ) )*
            {
            // InternalTableDSL.g:79:3: ( (lv_actions_0_0= ruleCreateTable ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=11 && LA1_0<=12)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalTableDSL.g:80:4: (lv_actions_0_0= ruleCreateTable )
                    {
                    // InternalTableDSL.g:80:4: (lv_actions_0_0= ruleCreateTable )
                    // InternalTableDSL.g:81:5: lv_actions_0_0= ruleCreateTable
                    {

                    					newCompositeNode(grammarAccess.getStartAccess().getActionsCreateTableParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_actions_0_0=ruleCreateTable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStartRule());
                    					}
                    					add(
                    						current,
                    						"actions",
                    						lv_actions_0_0,
                    						"org.feup.els5.dsl.TableDSL.CreateTable");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalTableDSL.g:98:3: ( (lv_actions_1_0= ruleTableAction ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14||LA2_0==16||(LA2_0>=18 && LA2_0<=19)||(LA2_0>=21 && LA2_0<=22)||LA2_0==25) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTableDSL.g:99:4: (lv_actions_1_0= ruleTableAction )
            	    {
            	    // InternalTableDSL.g:99:4: (lv_actions_1_0= ruleTableAction )
            	    // InternalTableDSL.g:100:5: lv_actions_1_0= ruleTableAction
            	    {

            	    					newCompositeNode(grammarAccess.getStartAccess().getActionsTableActionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_actions_1_0=ruleTableAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStartRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_1_0,
            	    						"org.feup.els5.dsl.TableDSL.TableAction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStart"


    // $ANTLR start "entryRuleCreateTable"
    // InternalTableDSL.g:121:1: entryRuleCreateTable returns [EObject current=null] : iv_ruleCreateTable= ruleCreateTable EOF ;
    public final EObject entryRuleCreateTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateTable = null;


        try {
            // InternalTableDSL.g:121:52: (iv_ruleCreateTable= ruleCreateTable EOF )
            // InternalTableDSL.g:122:2: iv_ruleCreateTable= ruleCreateTable EOF
            {
             newCompositeNode(grammarAccess.getCreateTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreateTable=ruleCreateTable();

            state._fsp--;

             current =iv_ruleCreateTable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreateTable"


    // $ANTLR start "ruleCreateTable"
    // InternalTableDSL.g:128:1: ruleCreateTable returns [EObject current=null] : ( (otherlv_0= 'create' )? otherlv_1= 'table' otherlv_2= 'from' this_TableInputPath_3= ruleTableInputPath this_ANY_OTHER_4= RULE_ANY_OTHER ) ;
    public final EObject ruleCreateTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_ANY_OTHER_4=null;
        EObject this_TableInputPath_3 = null;



        	enterRule();

        try {
            // InternalTableDSL.g:134:2: ( ( (otherlv_0= 'create' )? otherlv_1= 'table' otherlv_2= 'from' this_TableInputPath_3= ruleTableInputPath this_ANY_OTHER_4= RULE_ANY_OTHER ) )
            // InternalTableDSL.g:135:2: ( (otherlv_0= 'create' )? otherlv_1= 'table' otherlv_2= 'from' this_TableInputPath_3= ruleTableInputPath this_ANY_OTHER_4= RULE_ANY_OTHER )
            {
            // InternalTableDSL.g:135:2: ( (otherlv_0= 'create' )? otherlv_1= 'table' otherlv_2= 'from' this_TableInputPath_3= ruleTableInputPath this_ANY_OTHER_4= RULE_ANY_OTHER )
            // InternalTableDSL.g:136:3: (otherlv_0= 'create' )? otherlv_1= 'table' otherlv_2= 'from' this_TableInputPath_3= ruleTableInputPath this_ANY_OTHER_4= RULE_ANY_OTHER
            {
            // InternalTableDSL.g:136:3: (otherlv_0= 'create' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTableDSL.g:137:4: otherlv_0= 'create'
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getCreateTableAccess().getCreateKeyword_0());
                    			

                    }
                    break;

            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getCreateTableAccess().getTableKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCreateTableAccess().getFromKeyword_2());
            		

            			newCompositeNode(grammarAccess.getCreateTableAccess().getTableInputPathParserRuleCall_3());
            		
            pushFollow(FOLLOW_7);
            this_TableInputPath_3=ruleTableInputPath();

            state._fsp--;


            			current = this_TableInputPath_3;
            			afterParserOrEnumRuleCall();
            		
            this_ANY_OTHER_4=(Token)match(input,RULE_ANY_OTHER,FOLLOW_2); 

            			newLeafNode(this_ANY_OTHER_4, grammarAccess.getCreateTableAccess().getANY_OTHERTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCreateTable"


    // $ANTLR start "entryRuleTableAction"
    // InternalTableDSL.g:166:1: entryRuleTableAction returns [EObject current=null] : iv_ruleTableAction= ruleTableAction EOF ;
    public final EObject entryRuleTableAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableAction = null;


        try {
            // InternalTableDSL.g:166:52: (iv_ruleTableAction= ruleTableAction EOF )
            // InternalTableDSL.g:167:2: iv_ruleTableAction= ruleTableAction EOF
            {
             newCompositeNode(grammarAccess.getTableActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTableAction=ruleTableAction();

            state._fsp--;

             current =iv_ruleTableAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTableAction"


    // $ANTLR start "ruleTableAction"
    // InternalTableDSL.g:173:1: ruleTableAction returns [EObject current=null] : (this_LoadData_0= ruleLoadData | this_Operation_1= ruleOperation | (this_Output_2= ruleOutput this_ANY_OTHER_3= RULE_ANY_OTHER ) ) ;
    public final EObject ruleTableAction() throws RecognitionException {
        EObject current = null;

        Token this_ANY_OTHER_3=null;
        EObject this_LoadData_0 = null;

        EObject this_Operation_1 = null;

        EObject this_Output_2 = null;



        	enterRule();

        try {
            // InternalTableDSL.g:179:2: ( (this_LoadData_0= ruleLoadData | this_Operation_1= ruleOperation | (this_Output_2= ruleOutput this_ANY_OTHER_3= RULE_ANY_OTHER ) ) )
            // InternalTableDSL.g:180:2: (this_LoadData_0= ruleLoadData | this_Operation_1= ruleOperation | (this_Output_2= ruleOutput this_ANY_OTHER_3= RULE_ANY_OTHER ) )
            {
            // InternalTableDSL.g:180:2: (this_LoadData_0= ruleLoadData | this_Operation_1= ruleOperation | (this_Output_2= ruleOutput this_ANY_OTHER_3= RULE_ANY_OTHER ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 18:
            case 19:
            case 21:
            case 22:
            case 25:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalTableDSL.g:181:3: this_LoadData_0= ruleLoadData
                    {

                    			newCompositeNode(grammarAccess.getTableActionAccess().getLoadDataParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LoadData_0=ruleLoadData();

                    state._fsp--;


                    			current = this_LoadData_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTableDSL.g:190:3: this_Operation_1= ruleOperation
                    {

                    			newCompositeNode(grammarAccess.getTableActionAccess().getOperationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Operation_1=ruleOperation();

                    state._fsp--;


                    			current = this_Operation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTableDSL.g:199:3: (this_Output_2= ruleOutput this_ANY_OTHER_3= RULE_ANY_OTHER )
                    {
                    // InternalTableDSL.g:199:3: (this_Output_2= ruleOutput this_ANY_OTHER_3= RULE_ANY_OTHER )
                    // InternalTableDSL.g:200:4: this_Output_2= ruleOutput this_ANY_OTHER_3= RULE_ANY_OTHER
                    {

                    				newCompositeNode(grammarAccess.getTableActionAccess().getOutputParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_7);
                    this_Output_2=ruleOutput();

                    state._fsp--;


                    				current = this_Output_2;
                    				afterParserOrEnumRuleCall();
                    			
                    this_ANY_OTHER_3=(Token)match(input,RULE_ANY_OTHER,FOLLOW_2); 

                    				newLeafNode(this_ANY_OTHER_3, grammarAccess.getTableActionAccess().getANY_OTHERTerminalRuleCall_2_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTableAction"


    // $ANTLR start "entryRuleLoadData"
    // InternalTableDSL.g:217:1: entryRuleLoadData returns [EObject current=null] : iv_ruleLoadData= ruleLoadData EOF ;
    public final EObject entryRuleLoadData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoadData = null;


        try {
            // InternalTableDSL.g:217:49: (iv_ruleLoadData= ruleLoadData EOF )
            // InternalTableDSL.g:218:2: iv_ruleLoadData= ruleLoadData EOF
            {
             newCompositeNode(grammarAccess.getLoadDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoadData=ruleLoadData();

            state._fsp--;

             current =iv_ruleLoadData; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoadData"


    // $ANTLR start "ruleLoadData"
    // InternalTableDSL.g:224:1: ruleLoadData returns [EObject current=null] : (otherlv_0= 'load' this_TableInputPath_1= ruleTableInputPath ) ;
    public final EObject ruleLoadData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_TableInputPath_1 = null;



        	enterRule();

        try {
            // InternalTableDSL.g:230:2: ( (otherlv_0= 'load' this_TableInputPath_1= ruleTableInputPath ) )
            // InternalTableDSL.g:231:2: (otherlv_0= 'load' this_TableInputPath_1= ruleTableInputPath )
            {
            // InternalTableDSL.g:231:2: (otherlv_0= 'load' this_TableInputPath_1= ruleTableInputPath )
            // InternalTableDSL.g:232:3: otherlv_0= 'load' this_TableInputPath_1= ruleTableInputPath
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getLoadDataAccess().getLoadKeyword_0());
            		

            			newCompositeNode(grammarAccess.getLoadDataAccess().getTableInputPathParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_TableInputPath_1=ruleTableInputPath();

            state._fsp--;


            			current = this_TableInputPath_1;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoadData"


    // $ANTLR start "entryRuleTableInputPath"
    // InternalTableDSL.g:248:1: entryRuleTableInputPath returns [EObject current=null] : iv_ruleTableInputPath= ruleTableInputPath EOF ;
    public final EObject entryRuleTableInputPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableInputPath = null;


        try {
            // InternalTableDSL.g:248:55: (iv_ruleTableInputPath= ruleTableInputPath EOF )
            // InternalTableDSL.g:249:2: iv_ruleTableInputPath= ruleTableInputPath EOF
            {
             newCompositeNode(grammarAccess.getTableInputPathRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTableInputPath=ruleTableInputPath();

            state._fsp--;

             current =iv_ruleTableInputPath; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTableInputPath"


    // $ANTLR start "ruleTableInputPath"
    // InternalTableDSL.g:255:1: ruleTableInputPath returns [EObject current=null] : ( ( (lv_pathPatterns_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_pathPatterns_2_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleTableInputPath() throws RecognitionException {
        EObject current = null;

        Token lv_pathPatterns_0_0=null;
        Token otherlv_1=null;
        Token lv_pathPatterns_2_0=null;


        	enterRule();

        try {
            // InternalTableDSL.g:261:2: ( ( ( (lv_pathPatterns_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_pathPatterns_2_0= RULE_STRING ) ) )* ) )
            // InternalTableDSL.g:262:2: ( ( (lv_pathPatterns_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_pathPatterns_2_0= RULE_STRING ) ) )* )
            {
            // InternalTableDSL.g:262:2: ( ( (lv_pathPatterns_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_pathPatterns_2_0= RULE_STRING ) ) )* )
            // InternalTableDSL.g:263:3: ( (lv_pathPatterns_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_pathPatterns_2_0= RULE_STRING ) ) )*
            {
            // InternalTableDSL.g:263:3: ( (lv_pathPatterns_0_0= RULE_STRING ) )
            // InternalTableDSL.g:264:4: (lv_pathPatterns_0_0= RULE_STRING )
            {
            // InternalTableDSL.g:264:4: (lv_pathPatterns_0_0= RULE_STRING )
            // InternalTableDSL.g:265:5: lv_pathPatterns_0_0= RULE_STRING
            {
            lv_pathPatterns_0_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_pathPatterns_0_0, grammarAccess.getTableInputPathAccess().getPathPatternsSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableInputPathRule());
            					}
            					addWithLastConsumed(
            						current,
            						"pathPatterns",
            						lv_pathPatterns_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalTableDSL.g:281:3: (otherlv_1= ',' ( (lv_pathPatterns_2_0= RULE_STRING ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTableDSL.g:282:4: otherlv_1= ',' ( (lv_pathPatterns_2_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_1, grammarAccess.getTableInputPathAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalTableDSL.g:286:4: ( (lv_pathPatterns_2_0= RULE_STRING ) )
            	    // InternalTableDSL.g:287:5: (lv_pathPatterns_2_0= RULE_STRING )
            	    {
            	    // InternalTableDSL.g:287:5: (lv_pathPatterns_2_0= RULE_STRING )
            	    // InternalTableDSL.g:288:6: lv_pathPatterns_2_0= RULE_STRING
            	    {
            	    lv_pathPatterns_2_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            	    						newLeafNode(lv_pathPatterns_2_0, grammarAccess.getTableInputPathAccess().getPathPatternsSTRINGTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTableInputPathRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"pathPatterns",
            	    							lv_pathPatterns_2_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTableInputPath"


    // $ANTLR start "entryRuleOutput"
    // InternalTableDSL.g:309:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalTableDSL.g:309:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalTableDSL.g:310:2: iv_ruleOutput= ruleOutput EOF
            {
             newCompositeNode(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutput=ruleOutput();

            state._fsp--;

             current =iv_ruleOutput; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalTableDSL.g:316:1: ruleOutput returns [EObject current=null] : (otherlv_0= 'output' otherlv_1= 'to' ( (lv_outputPaths_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_outputPaths_4_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_outputPaths_2_0=null;
        Token otherlv_3=null;
        Token lv_outputPaths_4_0=null;


        	enterRule();

        try {
            // InternalTableDSL.g:322:2: ( (otherlv_0= 'output' otherlv_1= 'to' ( (lv_outputPaths_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_outputPaths_4_0= RULE_STRING ) ) )* ) )
            // InternalTableDSL.g:323:2: (otherlv_0= 'output' otherlv_1= 'to' ( (lv_outputPaths_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_outputPaths_4_0= RULE_STRING ) ) )* )
            {
            // InternalTableDSL.g:323:2: (otherlv_0= 'output' otherlv_1= 'to' ( (lv_outputPaths_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_outputPaths_4_0= RULE_STRING ) ) )* )
            // InternalTableDSL.g:324:3: otherlv_0= 'output' otherlv_1= 'to' ( (lv_outputPaths_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_outputPaths_4_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getOutputAccess().getOutputKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getToKeyword_1());
            		
            // InternalTableDSL.g:332:3: ( (lv_outputPaths_2_0= RULE_STRING ) )
            // InternalTableDSL.g:333:4: (lv_outputPaths_2_0= RULE_STRING )
            {
            // InternalTableDSL.g:333:4: (lv_outputPaths_2_0= RULE_STRING )
            // InternalTableDSL.g:334:5: lv_outputPaths_2_0= RULE_STRING
            {
            lv_outputPaths_2_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_outputPaths_2_0, grammarAccess.getOutputAccess().getOutputPathsSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutputRule());
            					}
            					addWithLastConsumed(
            						current,
            						"outputPaths",
            						lv_outputPaths_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalTableDSL.g:350:3: (otherlv_3= ',' ( (lv_outputPaths_4_0= RULE_STRING ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTableDSL.g:351:4: otherlv_3= ',' ( (lv_outputPaths_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_3, grammarAccess.getOutputAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalTableDSL.g:355:4: ( (lv_outputPaths_4_0= RULE_STRING ) )
            	    // InternalTableDSL.g:356:5: (lv_outputPaths_4_0= RULE_STRING )
            	    {
            	    // InternalTableDSL.g:356:5: (lv_outputPaths_4_0= RULE_STRING )
            	    // InternalTableDSL.g:357:6: lv_outputPaths_4_0= RULE_STRING
            	    {
            	    lv_outputPaths_4_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            	    						newLeafNode(lv_outputPaths_4_0, grammarAccess.getOutputAccess().getOutputPathsSTRINGTerminalRuleCall_3_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getOutputRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"outputPaths",
            	    							lv_outputPaths_4_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleOperation"
    // InternalTableDSL.g:378:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalTableDSL.g:378:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalTableDSL.g:379:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalTableDSL.g:385:1: ruleOperation returns [EObject current=null] : (this_Select_0= ruleSelect | this_RenameColumn_1= ruleRenameColumn | this_Extract_2= ruleExtract | this_SquashRows_3= ruleSquashRows | this_Filter_4= ruleFilter ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_Select_0 = null;

        EObject this_RenameColumn_1 = null;

        EObject this_Extract_2 = null;

        EObject this_SquashRows_3 = null;

        EObject this_Filter_4 = null;



        	enterRule();

        try {
            // InternalTableDSL.g:391:2: ( (this_Select_0= ruleSelect | this_RenameColumn_1= ruleRenameColumn | this_Extract_2= ruleExtract | this_SquashRows_3= ruleSquashRows | this_Filter_4= ruleFilter ) )
            // InternalTableDSL.g:392:2: (this_Select_0= ruleSelect | this_RenameColumn_1= ruleRenameColumn | this_Extract_2= ruleExtract | this_SquashRows_3= ruleSquashRows | this_Filter_4= ruleFilter )
            {
            // InternalTableDSL.g:392:2: (this_Select_0= ruleSelect | this_RenameColumn_1= ruleRenameColumn | this_Extract_2= ruleExtract | this_SquashRows_3= ruleSquashRows | this_Filter_4= ruleFilter )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt7=1;
                }
                break;
            case 19:
                {
                alt7=2;
                }
                break;
            case 21:
                {
                alt7=3;
                }
                break;
            case 22:
                {
                alt7=4;
                }
                break;
            case 25:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalTableDSL.g:393:3: this_Select_0= ruleSelect
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getSelectParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Select_0=ruleSelect();

                    state._fsp--;


                    			current = this_Select_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTableDSL.g:402:3: this_RenameColumn_1= ruleRenameColumn
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getRenameColumnParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RenameColumn_1=ruleRenameColumn();

                    state._fsp--;


                    			current = this_RenameColumn_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTableDSL.g:411:3: this_Extract_2= ruleExtract
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getExtractParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Extract_2=ruleExtract();

                    state._fsp--;


                    			current = this_Extract_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTableDSL.g:420:3: this_SquashRows_3= ruleSquashRows
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getSquashRowsParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_SquashRows_3=ruleSquashRows();

                    state._fsp--;


                    			current = this_SquashRows_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalTableDSL.g:429:3: this_Filter_4= ruleFilter
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getFilterParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Filter_4=ruleFilter();

                    state._fsp--;


                    			current = this_Filter_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleSelect"
    // InternalTableDSL.g:441:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // InternalTableDSL.g:441:47: (iv_ruleSelect= ruleSelect EOF )
            // InternalTableDSL.g:442:2: iv_ruleSelect= ruleSelect EOF
            {
             newCompositeNode(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelect=ruleSelect();

            state._fsp--;

             current =iv_ruleSelect; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // InternalTableDSL.g:448:1: ruleSelect returns [EObject current=null] : (otherlv_0= 'select' ( (lv_columnsPatterns_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_columnPatterns_3_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_columnsPatterns_1_0=null;
        Token otherlv_2=null;
        Token lv_columnPatterns_3_0=null;


        	enterRule();

        try {
            // InternalTableDSL.g:454:2: ( (otherlv_0= 'select' ( (lv_columnsPatterns_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_columnPatterns_3_0= RULE_STRING ) ) )* ) )
            // InternalTableDSL.g:455:2: (otherlv_0= 'select' ( (lv_columnsPatterns_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_columnPatterns_3_0= RULE_STRING ) ) )* )
            {
            // InternalTableDSL.g:455:2: (otherlv_0= 'select' ( (lv_columnsPatterns_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_columnPatterns_3_0= RULE_STRING ) ) )* )
            // InternalTableDSL.g:456:3: otherlv_0= 'select' ( (lv_columnsPatterns_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_columnPatterns_3_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getSelectKeyword_0());
            		
            // InternalTableDSL.g:460:3: ( (lv_columnsPatterns_1_0= RULE_STRING ) )
            // InternalTableDSL.g:461:4: (lv_columnsPatterns_1_0= RULE_STRING )
            {
            // InternalTableDSL.g:461:4: (lv_columnsPatterns_1_0= RULE_STRING )
            // InternalTableDSL.g:462:5: lv_columnsPatterns_1_0= RULE_STRING
            {
            lv_columnsPatterns_1_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_columnsPatterns_1_0, grammarAccess.getSelectAccess().getColumnsPatternsSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectRule());
            					}
            					addWithLastConsumed(
            						current,
            						"columnsPatterns",
            						lv_columnsPatterns_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalTableDSL.g:478:3: (otherlv_2= ',' ( (lv_columnPatterns_3_0= RULE_STRING ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTableDSL.g:479:4: otherlv_2= ',' ( (lv_columnPatterns_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSelectAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalTableDSL.g:483:4: ( (lv_columnPatterns_3_0= RULE_STRING ) )
            	    // InternalTableDSL.g:484:5: (lv_columnPatterns_3_0= RULE_STRING )
            	    {
            	    // InternalTableDSL.g:484:5: (lv_columnPatterns_3_0= RULE_STRING )
            	    // InternalTableDSL.g:485:6: lv_columnPatterns_3_0= RULE_STRING
            	    {
            	    lv_columnPatterns_3_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            	    						newLeafNode(lv_columnPatterns_3_0, grammarAccess.getSelectAccess().getColumnPatternsSTRINGTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSelectRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"columnPatterns",
            	    							lv_columnPatterns_3_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleRenameColumn"
    // InternalTableDSL.g:506:1: entryRuleRenameColumn returns [EObject current=null] : iv_ruleRenameColumn= ruleRenameColumn EOF ;
    public final EObject entryRuleRenameColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenameColumn = null;


        try {
            // InternalTableDSL.g:506:53: (iv_ruleRenameColumn= ruleRenameColumn EOF )
            // InternalTableDSL.g:507:2: iv_ruleRenameColumn= ruleRenameColumn EOF
            {
             newCompositeNode(grammarAccess.getRenameColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRenameColumn=ruleRenameColumn();

            state._fsp--;

             current =iv_ruleRenameColumn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRenameColumn"


    // $ANTLR start "ruleRenameColumn"
    // InternalTableDSL.g:513:1: ruleRenameColumn returns [EObject current=null] : (otherlv_0= 'rename' (otherlv_1= 'column' )? ( (lv_oldName_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_newName_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleRenameColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_oldName_2_0=null;
        Token otherlv_3=null;
        Token lv_newName_4_0=null;


        	enterRule();

        try {
            // InternalTableDSL.g:519:2: ( (otherlv_0= 'rename' (otherlv_1= 'column' )? ( (lv_oldName_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_newName_4_0= RULE_STRING ) ) ) )
            // InternalTableDSL.g:520:2: (otherlv_0= 'rename' (otherlv_1= 'column' )? ( (lv_oldName_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_newName_4_0= RULE_STRING ) ) )
            {
            // InternalTableDSL.g:520:2: (otherlv_0= 'rename' (otherlv_1= 'column' )? ( (lv_oldName_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_newName_4_0= RULE_STRING ) ) )
            // InternalTableDSL.g:521:3: otherlv_0= 'rename' (otherlv_1= 'column' )? ( (lv_oldName_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_newName_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRenameColumnAccess().getRenameKeyword_0());
            		
            // InternalTableDSL.g:525:3: (otherlv_1= 'column' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTableDSL.g:526:4: otherlv_1= 'column'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getRenameColumnAccess().getColumnKeyword_1());
                    			

                    }
                    break;

            }

            // InternalTableDSL.g:531:3: ( (lv_oldName_2_0= RULE_STRING ) )
            // InternalTableDSL.g:532:4: (lv_oldName_2_0= RULE_STRING )
            {
            // InternalTableDSL.g:532:4: (lv_oldName_2_0= RULE_STRING )
            // InternalTableDSL.g:533:5: lv_oldName_2_0= RULE_STRING
            {
            lv_oldName_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_oldName_2_0, grammarAccess.getRenameColumnAccess().getOldNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRenameColumnRule());
            					}
            					setWithLastConsumed(
            						current,
            						"oldName",
            						lv_oldName_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getRenameColumnAccess().getToKeyword_3());
            		
            // InternalTableDSL.g:553:3: ( (lv_newName_4_0= RULE_STRING ) )
            // InternalTableDSL.g:554:4: (lv_newName_4_0= RULE_STRING )
            {
            // InternalTableDSL.g:554:4: (lv_newName_4_0= RULE_STRING )
            // InternalTableDSL.g:555:5: lv_newName_4_0= RULE_STRING
            {
            lv_newName_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_newName_4_0, grammarAccess.getRenameColumnAccess().getNewNameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRenameColumnRule());
            					}
            					setWithLastConsumed(
            						current,
            						"newName",
            						lv_newName_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRenameColumn"


    // $ANTLR start "entryRuleExtract"
    // InternalTableDSL.g:575:1: entryRuleExtract returns [EObject current=null] : iv_ruleExtract= ruleExtract EOF ;
    public final EObject entryRuleExtract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtract = null;


        try {
            // InternalTableDSL.g:575:48: (iv_ruleExtract= ruleExtract EOF )
            // InternalTableDSL.g:576:2: iv_ruleExtract= ruleExtract EOF
            {
             newCompositeNode(grammarAccess.getExtractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtract=ruleExtract();

            state._fsp--;

             current =iv_ruleExtract; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExtract"


    // $ANTLR start "ruleExtract"
    // InternalTableDSL.g:582:1: ruleExtract returns [EObject current=null] : (otherlv_0= 'extract' ( (lv_placeholder_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleExtract() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_placeholder_1_0=null;


        	enterRule();

        try {
            // InternalTableDSL.g:588:2: ( (otherlv_0= 'extract' ( (lv_placeholder_1_0= RULE_STRING ) ) ) )
            // InternalTableDSL.g:589:2: (otherlv_0= 'extract' ( (lv_placeholder_1_0= RULE_STRING ) ) )
            {
            // InternalTableDSL.g:589:2: (otherlv_0= 'extract' ( (lv_placeholder_1_0= RULE_STRING ) ) )
            // InternalTableDSL.g:590:3: otherlv_0= 'extract' ( (lv_placeholder_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getExtractAccess().getExtractKeyword_0());
            		
            // InternalTableDSL.g:594:3: ( (lv_placeholder_1_0= RULE_STRING ) )
            // InternalTableDSL.g:595:4: (lv_placeholder_1_0= RULE_STRING )
            {
            // InternalTableDSL.g:595:4: (lv_placeholder_1_0= RULE_STRING )
            // InternalTableDSL.g:596:5: lv_placeholder_1_0= RULE_STRING
            {
            lv_placeholder_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_placeholder_1_0, grammarAccess.getExtractAccess().getPlaceholderSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtractRule());
            					}
            					setWithLastConsumed(
            						current,
            						"placeholder",
            						lv_placeholder_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExtract"


    // $ANTLR start "entryRuleSquashRows"
    // InternalTableDSL.g:616:1: entryRuleSquashRows returns [EObject current=null] : iv_ruleSquashRows= ruleSquashRows EOF ;
    public final EObject entryRuleSquashRows() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSquashRows = null;


        try {
            // InternalTableDSL.g:616:51: (iv_ruleSquashRows= ruleSquashRows EOF )
            // InternalTableDSL.g:617:2: iv_ruleSquashRows= ruleSquashRows EOF
            {
             newCompositeNode(grammarAccess.getSquashRowsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSquashRows=ruleSquashRows();

            state._fsp--;

             current =iv_ruleSquashRows; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSquashRows"


    // $ANTLR start "ruleSquashRows"
    // InternalTableDSL.g:623:1: ruleSquashRows returns [EObject current=null] : (otherlv_0= 'squash' (otherlv_1= 'rows' )? otherlv_2= 'by' ( (lv_columns_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_columns_5_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleSquashRows() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_columns_3_0=null;
        Token otherlv_4=null;
        Token lv_columns_5_0=null;


        	enterRule();

        try {
            // InternalTableDSL.g:629:2: ( (otherlv_0= 'squash' (otherlv_1= 'rows' )? otherlv_2= 'by' ( (lv_columns_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_columns_5_0= RULE_STRING ) ) )* ) )
            // InternalTableDSL.g:630:2: (otherlv_0= 'squash' (otherlv_1= 'rows' )? otherlv_2= 'by' ( (lv_columns_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_columns_5_0= RULE_STRING ) ) )* )
            {
            // InternalTableDSL.g:630:2: (otherlv_0= 'squash' (otherlv_1= 'rows' )? otherlv_2= 'by' ( (lv_columns_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_columns_5_0= RULE_STRING ) ) )* )
            // InternalTableDSL.g:631:3: otherlv_0= 'squash' (otherlv_1= 'rows' )? otherlv_2= 'by' ( (lv_columns_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_columns_5_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getSquashRowsAccess().getSquashKeyword_0());
            		
            // InternalTableDSL.g:635:3: (otherlv_1= 'rows' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTableDSL.g:636:4: otherlv_1= 'rows'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getSquashRowsAccess().getRowsKeyword_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getSquashRowsAccess().getByKeyword_2());
            		
            // InternalTableDSL.g:645:3: ( (lv_columns_3_0= RULE_STRING ) )
            // InternalTableDSL.g:646:4: (lv_columns_3_0= RULE_STRING )
            {
            // InternalTableDSL.g:646:4: (lv_columns_3_0= RULE_STRING )
            // InternalTableDSL.g:647:5: lv_columns_3_0= RULE_STRING
            {
            lv_columns_3_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_columns_3_0, grammarAccess.getSquashRowsAccess().getColumnsSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSquashRowsRule());
            					}
            					addWithLastConsumed(
            						current,
            						"columns",
            						lv_columns_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalTableDSL.g:663:3: (otherlv_4= ',' ( (lv_columns_5_0= RULE_STRING ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTableDSL.g:664:4: otherlv_4= ',' ( (lv_columns_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSquashRowsAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalTableDSL.g:668:4: ( (lv_columns_5_0= RULE_STRING ) )
            	    // InternalTableDSL.g:669:5: (lv_columns_5_0= RULE_STRING )
            	    {
            	    // InternalTableDSL.g:669:5: (lv_columns_5_0= RULE_STRING )
            	    // InternalTableDSL.g:670:6: lv_columns_5_0= RULE_STRING
            	    {
            	    lv_columns_5_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            	    						newLeafNode(lv_columns_5_0, grammarAccess.getSquashRowsAccess().getColumnsSTRINGTerminalRuleCall_4_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSquashRowsRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"columns",
            	    							lv_columns_5_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSquashRows"


    // $ANTLR start "entryRuleFilter"
    // InternalTableDSL.g:691:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // InternalTableDSL.g:691:47: (iv_ruleFilter= ruleFilter EOF )
            // InternalTableDSL.g:692:2: iv_ruleFilter= ruleFilter EOF
            {
             newCompositeNode(grammarAccess.getFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilter=ruleFilter();

            state._fsp--;

             current =iv_ruleFilter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // InternalTableDSL.g:698:1: ruleFilter returns [EObject current=null] : (otherlv_0= 'filter' otherlv_1= 'by' ( (lv_placeholder_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_placeholder_2_0=null;


        	enterRule();

        try {
            // InternalTableDSL.g:704:2: ( (otherlv_0= 'filter' otherlv_1= 'by' ( (lv_placeholder_2_0= RULE_STRING ) ) ) )
            // InternalTableDSL.g:705:2: (otherlv_0= 'filter' otherlv_1= 'by' ( (lv_placeholder_2_0= RULE_STRING ) ) )
            {
            // InternalTableDSL.g:705:2: (otherlv_0= 'filter' otherlv_1= 'by' ( (lv_placeholder_2_0= RULE_STRING ) ) )
            // InternalTableDSL.g:706:3: otherlv_0= 'filter' otherlv_1= 'by' ( (lv_placeholder_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getFilterAccess().getFilterKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getFilterAccess().getByKeyword_1());
            		
            // InternalTableDSL.g:714:3: ( (lv_placeholder_2_0= RULE_STRING ) )
            // InternalTableDSL.g:715:4: (lv_placeholder_2_0= RULE_STRING )
            {
            // InternalTableDSL.g:715:4: (lv_placeholder_2_0= RULE_STRING )
            // InternalTableDSL.g:716:5: lv_placeholder_2_0= RULE_STRING
            {
            lv_placeholder_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_placeholder_2_0, grammarAccess.getFilterAccess().getPlaceholderSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFilterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"placeholder",
            						lv_placeholder_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFilter"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000026D4002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});

}