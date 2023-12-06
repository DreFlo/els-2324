package org.feup.els5.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.feup.els5.dsl.services.TableDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTableDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_COLUMN_NAME_KEYWORDS", "RULE_STRING", "RULE_ANY_OTHER", "RULE_SELECTOR_KEYWORDS", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'column'", "'columns'", "'object'", "'objects'", "'create'", "'table'", "'from'", "'load'", "','", "'output'", "'to'", "'select'", "'rename'", "'prepend'", "'append'", "'extract'", "'sort'", "'by'", "'as'", "'TOP'", "'squash'", "'rows'", "'filter'", "'deny'", "'except'", "'of'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int RULE_COLUMN_NAME_KEYWORDS=4;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
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


        public InternalTableDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTableDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTableDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTableDSL.g"; }


    	private TableDSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(TableDSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleStart"
    // InternalTableDSL.g:53:1: entryRuleStart : ruleStart EOF ;
    public final void entryRuleStart() throws RecognitionException {
        try {
            // InternalTableDSL.g:54:1: ( ruleStart EOF )
            // InternalTableDSL.g:55:1: ruleStart EOF
            {
             before(grammarAccess.getStartRule()); 
            pushFollow(FOLLOW_1);
            ruleStart();

            state._fsp--;

             after(grammarAccess.getStartRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStart"


    // $ANTLR start "ruleStart"
    // InternalTableDSL.g:62:1: ruleStart : ( ( rule__Start__Group__0 ) ) ;
    public final void ruleStart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:66:2: ( ( ( rule__Start__Group__0 ) ) )
            // InternalTableDSL.g:67:2: ( ( rule__Start__Group__0 ) )
            {
            // InternalTableDSL.g:67:2: ( ( rule__Start__Group__0 ) )
            // InternalTableDSL.g:68:3: ( rule__Start__Group__0 )
            {
             before(grammarAccess.getStartAccess().getGroup()); 
            // InternalTableDSL.g:69:3: ( rule__Start__Group__0 )
            // InternalTableDSL.g:69:4: rule__Start__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Start__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStartAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStart"


    // $ANTLR start "entryRuleCreateTable"
    // InternalTableDSL.g:78:1: entryRuleCreateTable : ruleCreateTable EOF ;
    public final void entryRuleCreateTable() throws RecognitionException {
        try {
            // InternalTableDSL.g:79:1: ( ruleCreateTable EOF )
            // InternalTableDSL.g:80:1: ruleCreateTable EOF
            {
             before(grammarAccess.getCreateTableRule()); 
            pushFollow(FOLLOW_1);
            ruleCreateTable();

            state._fsp--;

             after(grammarAccess.getCreateTableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCreateTable"


    // $ANTLR start "ruleCreateTable"
    // InternalTableDSL.g:87:1: ruleCreateTable : ( ( rule__CreateTable__Group__0 ) ) ;
    public final void ruleCreateTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:91:2: ( ( ( rule__CreateTable__Group__0 ) ) )
            // InternalTableDSL.g:92:2: ( ( rule__CreateTable__Group__0 ) )
            {
            // InternalTableDSL.g:92:2: ( ( rule__CreateTable__Group__0 ) )
            // InternalTableDSL.g:93:3: ( rule__CreateTable__Group__0 )
            {
             before(grammarAccess.getCreateTableAccess().getGroup()); 
            // InternalTableDSL.g:94:3: ( rule__CreateTable__Group__0 )
            // InternalTableDSL.g:94:4: rule__CreateTable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CreateTable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCreateTableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCreateTable"


    // $ANTLR start "entryRuleTableAction"
    // InternalTableDSL.g:103:1: entryRuleTableAction : ruleTableAction EOF ;
    public final void entryRuleTableAction() throws RecognitionException {
        try {
            // InternalTableDSL.g:104:1: ( ruleTableAction EOF )
            // InternalTableDSL.g:105:1: ruleTableAction EOF
            {
             before(grammarAccess.getTableActionRule()); 
            pushFollow(FOLLOW_1);
            ruleTableAction();

            state._fsp--;

             after(grammarAccess.getTableActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTableAction"


    // $ANTLR start "ruleTableAction"
    // InternalTableDSL.g:112:1: ruleTableAction : ( ( rule__TableAction__Group__0 ) ) ;
    public final void ruleTableAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:116:2: ( ( ( rule__TableAction__Group__0 ) ) )
            // InternalTableDSL.g:117:2: ( ( rule__TableAction__Group__0 ) )
            {
            // InternalTableDSL.g:117:2: ( ( rule__TableAction__Group__0 ) )
            // InternalTableDSL.g:118:3: ( rule__TableAction__Group__0 )
            {
             before(grammarAccess.getTableActionAccess().getGroup()); 
            // InternalTableDSL.g:119:3: ( rule__TableAction__Group__0 )
            // InternalTableDSL.g:119:4: rule__TableAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TableAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTableAction"


    // $ANTLR start "entryRuleLoadData"
    // InternalTableDSL.g:128:1: entryRuleLoadData : ruleLoadData EOF ;
    public final void entryRuleLoadData() throws RecognitionException {
        try {
            // InternalTableDSL.g:129:1: ( ruleLoadData EOF )
            // InternalTableDSL.g:130:1: ruleLoadData EOF
            {
             before(grammarAccess.getLoadDataRule()); 
            pushFollow(FOLLOW_1);
            ruleLoadData();

            state._fsp--;

             after(grammarAccess.getLoadDataRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLoadData"


    // $ANTLR start "ruleLoadData"
    // InternalTableDSL.g:137:1: ruleLoadData : ( ( rule__LoadData__Group__0 ) ) ;
    public final void ruleLoadData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:141:2: ( ( ( rule__LoadData__Group__0 ) ) )
            // InternalTableDSL.g:142:2: ( ( rule__LoadData__Group__0 ) )
            {
            // InternalTableDSL.g:142:2: ( ( rule__LoadData__Group__0 ) )
            // InternalTableDSL.g:143:3: ( rule__LoadData__Group__0 )
            {
             before(grammarAccess.getLoadDataAccess().getGroup()); 
            // InternalTableDSL.g:144:3: ( rule__LoadData__Group__0 )
            // InternalTableDSL.g:144:4: rule__LoadData__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LoadData__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoadDataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLoadData"


    // $ANTLR start "entryRuleTableInputPath"
    // InternalTableDSL.g:153:1: entryRuleTableInputPath : ruleTableInputPath EOF ;
    public final void entryRuleTableInputPath() throws RecognitionException {
        try {
            // InternalTableDSL.g:154:1: ( ruleTableInputPath EOF )
            // InternalTableDSL.g:155:1: ruleTableInputPath EOF
            {
             before(grammarAccess.getTableInputPathRule()); 
            pushFollow(FOLLOW_1);
            ruleTableInputPath();

            state._fsp--;

             after(grammarAccess.getTableInputPathRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTableInputPath"


    // $ANTLR start "ruleTableInputPath"
    // InternalTableDSL.g:162:1: ruleTableInputPath : ( ( rule__TableInputPath__Group__0 ) ) ;
    public final void ruleTableInputPath() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:166:2: ( ( ( rule__TableInputPath__Group__0 ) ) )
            // InternalTableDSL.g:167:2: ( ( rule__TableInputPath__Group__0 ) )
            {
            // InternalTableDSL.g:167:2: ( ( rule__TableInputPath__Group__0 ) )
            // InternalTableDSL.g:168:3: ( rule__TableInputPath__Group__0 )
            {
             before(grammarAccess.getTableInputPathAccess().getGroup()); 
            // InternalTableDSL.g:169:3: ( rule__TableInputPath__Group__0 )
            // InternalTableDSL.g:169:4: rule__TableInputPath__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TableInputPath__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableInputPathAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTableInputPath"


    // $ANTLR start "entryRuleOutput"
    // InternalTableDSL.g:178:1: entryRuleOutput : ruleOutput EOF ;
    public final void entryRuleOutput() throws RecognitionException {
        try {
            // InternalTableDSL.g:179:1: ( ruleOutput EOF )
            // InternalTableDSL.g:180:1: ruleOutput EOF
            {
             before(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            ruleOutput();

            state._fsp--;

             after(grammarAccess.getOutputRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalTableDSL.g:187:1: ruleOutput : ( ( rule__Output__Group__0 ) ) ;
    public final void ruleOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:191:2: ( ( ( rule__Output__Group__0 ) ) )
            // InternalTableDSL.g:192:2: ( ( rule__Output__Group__0 ) )
            {
            // InternalTableDSL.g:192:2: ( ( rule__Output__Group__0 ) )
            // InternalTableDSL.g:193:3: ( rule__Output__Group__0 )
            {
             before(grammarAccess.getOutputAccess().getGroup()); 
            // InternalTableDSL.g:194:3: ( rule__Output__Group__0 )
            // InternalTableDSL.g:194:4: rule__Output__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleOperation"
    // InternalTableDSL.g:203:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalTableDSL.g:204:1: ( ruleOperation EOF )
            // InternalTableDSL.g:205:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalTableDSL.g:212:1: ruleOperation : ( ( rule__Operation__Alternatives ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:216:2: ( ( ( rule__Operation__Alternatives ) ) )
            // InternalTableDSL.g:217:2: ( ( rule__Operation__Alternatives ) )
            {
            // InternalTableDSL.g:217:2: ( ( rule__Operation__Alternatives ) )
            // InternalTableDSL.g:218:3: ( rule__Operation__Alternatives )
            {
             before(grammarAccess.getOperationAccess().getAlternatives()); 
            // InternalTableDSL.g:219:3: ( rule__Operation__Alternatives )
            // InternalTableDSL.g:219:4: rule__Operation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleSelect"
    // InternalTableDSL.g:228:1: entryRuleSelect : ruleSelect EOF ;
    public final void entryRuleSelect() throws RecognitionException {
        try {
            // InternalTableDSL.g:229:1: ( ruleSelect EOF )
            // InternalTableDSL.g:230:1: ruleSelect EOF
            {
             before(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_1);
            ruleSelect();

            state._fsp--;

             after(grammarAccess.getSelectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // InternalTableDSL.g:237:1: ruleSelect : ( ( rule__Select__Group__0 ) ) ;
    public final void ruleSelect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:241:2: ( ( ( rule__Select__Group__0 ) ) )
            // InternalTableDSL.g:242:2: ( ( rule__Select__Group__0 ) )
            {
            // InternalTableDSL.g:242:2: ( ( rule__Select__Group__0 ) )
            // InternalTableDSL.g:243:3: ( rule__Select__Group__0 )
            {
             before(grammarAccess.getSelectAccess().getGroup()); 
            // InternalTableDSL.g:244:3: ( rule__Select__Group__0 )
            // InternalTableDSL.g:244:4: rule__Select__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleRenameColumn"
    // InternalTableDSL.g:253:1: entryRuleRenameColumn : ruleRenameColumn EOF ;
    public final void entryRuleRenameColumn() throws RecognitionException {
        try {
            // InternalTableDSL.g:254:1: ( ruleRenameColumn EOF )
            // InternalTableDSL.g:255:1: ruleRenameColumn EOF
            {
             before(grammarAccess.getRenameColumnRule()); 
            pushFollow(FOLLOW_1);
            ruleRenameColumn();

            state._fsp--;

             after(grammarAccess.getRenameColumnRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRenameColumn"


    // $ANTLR start "ruleRenameColumn"
    // InternalTableDSL.g:262:1: ruleRenameColumn : ( ( rule__RenameColumn__Group__0 ) ) ;
    public final void ruleRenameColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:266:2: ( ( ( rule__RenameColumn__Group__0 ) ) )
            // InternalTableDSL.g:267:2: ( ( rule__RenameColumn__Group__0 ) )
            {
            // InternalTableDSL.g:267:2: ( ( rule__RenameColumn__Group__0 ) )
            // InternalTableDSL.g:268:3: ( rule__RenameColumn__Group__0 )
            {
             before(grammarAccess.getRenameColumnAccess().getGroup()); 
            // InternalTableDSL.g:269:3: ( rule__RenameColumn__Group__0 )
            // InternalTableDSL.g:269:4: rule__RenameColumn__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RenameColumn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRenameColumnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRenameColumn"


    // $ANTLR start "entryRuleRenameColumnPair"
    // InternalTableDSL.g:278:1: entryRuleRenameColumnPair : ruleRenameColumnPair EOF ;
    public final void entryRuleRenameColumnPair() throws RecognitionException {
        try {
            // InternalTableDSL.g:279:1: ( ruleRenameColumnPair EOF )
            // InternalTableDSL.g:280:1: ruleRenameColumnPair EOF
            {
             before(grammarAccess.getRenameColumnPairRule()); 
            pushFollow(FOLLOW_1);
            ruleRenameColumnPair();

            state._fsp--;

             after(grammarAccess.getRenameColumnPairRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRenameColumnPair"


    // $ANTLR start "ruleRenameColumnPair"
    // InternalTableDSL.g:287:1: ruleRenameColumnPair : ( ( rule__RenameColumnPair__Alternatives ) ) ;
    public final void ruleRenameColumnPair() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:291:2: ( ( ( rule__RenameColumnPair__Alternatives ) ) )
            // InternalTableDSL.g:292:2: ( ( rule__RenameColumnPair__Alternatives ) )
            {
            // InternalTableDSL.g:292:2: ( ( rule__RenameColumnPair__Alternatives ) )
            // InternalTableDSL.g:293:3: ( rule__RenameColumnPair__Alternatives )
            {
             before(grammarAccess.getRenameColumnPairAccess().getAlternatives()); 
            // InternalTableDSL.g:294:3: ( rule__RenameColumnPair__Alternatives )
            // InternalTableDSL.g:294:4: rule__RenameColumnPair__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RenameColumnPair__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRenameColumnPairAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRenameColumnPair"


    // $ANTLR start "entryRuleRenameColumnToPair"
    // InternalTableDSL.g:303:1: entryRuleRenameColumnToPair : ruleRenameColumnToPair EOF ;
    public final void entryRuleRenameColumnToPair() throws RecognitionException {
        try {
            // InternalTableDSL.g:304:1: ( ruleRenameColumnToPair EOF )
            // InternalTableDSL.g:305:1: ruleRenameColumnToPair EOF
            {
             before(grammarAccess.getRenameColumnToPairRule()); 
            pushFollow(FOLLOW_1);
            ruleRenameColumnToPair();

            state._fsp--;

             after(grammarAccess.getRenameColumnToPairRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRenameColumnToPair"


    // $ANTLR start "ruleRenameColumnToPair"
    // InternalTableDSL.g:312:1: ruleRenameColumnToPair : ( ( rule__RenameColumnToPair__Group__0 ) ) ;
    public final void ruleRenameColumnToPair() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:316:2: ( ( ( rule__RenameColumnToPair__Group__0 ) ) )
            // InternalTableDSL.g:317:2: ( ( rule__RenameColumnToPair__Group__0 ) )
            {
            // InternalTableDSL.g:317:2: ( ( rule__RenameColumnToPair__Group__0 ) )
            // InternalTableDSL.g:318:3: ( rule__RenameColumnToPair__Group__0 )
            {
             before(grammarAccess.getRenameColumnToPairAccess().getGroup()); 
            // InternalTableDSL.g:319:3: ( rule__RenameColumnToPair__Group__0 )
            // InternalTableDSL.g:319:4: rule__RenameColumnToPair__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RenameColumnToPair__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRenameColumnToPairAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRenameColumnToPair"


    // $ANTLR start "entryRuleRenameColumnPrependPair"
    // InternalTableDSL.g:328:1: entryRuleRenameColumnPrependPair : ruleRenameColumnPrependPair EOF ;
    public final void entryRuleRenameColumnPrependPair() throws RecognitionException {
        try {
            // InternalTableDSL.g:329:1: ( ruleRenameColumnPrependPair EOF )
            // InternalTableDSL.g:330:1: ruleRenameColumnPrependPair EOF
            {
             before(grammarAccess.getRenameColumnPrependPairRule()); 
            pushFollow(FOLLOW_1);
            ruleRenameColumnPrependPair();

            state._fsp--;

             after(grammarAccess.getRenameColumnPrependPairRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRenameColumnPrependPair"


    // $ANTLR start "ruleRenameColumnPrependPair"
    // InternalTableDSL.g:337:1: ruleRenameColumnPrependPair : ( ( rule__RenameColumnPrependPair__Group__0 ) ) ;
    public final void ruleRenameColumnPrependPair() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:341:2: ( ( ( rule__RenameColumnPrependPair__Group__0 ) ) )
            // InternalTableDSL.g:342:2: ( ( rule__RenameColumnPrependPair__Group__0 ) )
            {
            // InternalTableDSL.g:342:2: ( ( rule__RenameColumnPrependPair__Group__0 ) )
            // InternalTableDSL.g:343:3: ( rule__RenameColumnPrependPair__Group__0 )
            {
             before(grammarAccess.getRenameColumnPrependPairAccess().getGroup()); 
            // InternalTableDSL.g:344:3: ( rule__RenameColumnPrependPair__Group__0 )
            // InternalTableDSL.g:344:4: rule__RenameColumnPrependPair__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RenameColumnPrependPair__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRenameColumnPrependPairAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRenameColumnPrependPair"


    // $ANTLR start "entryRuleRenameColumnAppendPair"
    // InternalTableDSL.g:353:1: entryRuleRenameColumnAppendPair : ruleRenameColumnAppendPair EOF ;
    public final void entryRuleRenameColumnAppendPair() throws RecognitionException {
        try {
            // InternalTableDSL.g:354:1: ( ruleRenameColumnAppendPair EOF )
            // InternalTableDSL.g:355:1: ruleRenameColumnAppendPair EOF
            {
             before(grammarAccess.getRenameColumnAppendPairRule()); 
            pushFollow(FOLLOW_1);
            ruleRenameColumnAppendPair();

            state._fsp--;

             after(grammarAccess.getRenameColumnAppendPairRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRenameColumnAppendPair"


    // $ANTLR start "ruleRenameColumnAppendPair"
    // InternalTableDSL.g:362:1: ruleRenameColumnAppendPair : ( ( rule__RenameColumnAppendPair__Group__0 ) ) ;
    public final void ruleRenameColumnAppendPair() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:366:2: ( ( ( rule__RenameColumnAppendPair__Group__0 ) ) )
            // InternalTableDSL.g:367:2: ( ( rule__RenameColumnAppendPair__Group__0 ) )
            {
            // InternalTableDSL.g:367:2: ( ( rule__RenameColumnAppendPair__Group__0 ) )
            // InternalTableDSL.g:368:3: ( rule__RenameColumnAppendPair__Group__0 )
            {
             before(grammarAccess.getRenameColumnAppendPairAccess().getGroup()); 
            // InternalTableDSL.g:369:3: ( rule__RenameColumnAppendPair__Group__0 )
            // InternalTableDSL.g:369:4: rule__RenameColumnAppendPair__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RenameColumnAppendPair__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRenameColumnAppendPairAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRenameColumnAppendPair"


    // $ANTLR start "entryRuleExtract"
    // InternalTableDSL.g:378:1: entryRuleExtract : ruleExtract EOF ;
    public final void entryRuleExtract() throws RecognitionException {
        try {
            // InternalTableDSL.g:379:1: ( ruleExtract EOF )
            // InternalTableDSL.g:380:1: ruleExtract EOF
            {
             before(grammarAccess.getExtractRule()); 
            pushFollow(FOLLOW_1);
            ruleExtract();

            state._fsp--;

             after(grammarAccess.getExtractRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExtract"


    // $ANTLR start "ruleExtract"
    // InternalTableDSL.g:387:1: ruleExtract : ( ( rule__Extract__Group__0 ) ) ;
    public final void ruleExtract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:391:2: ( ( ( rule__Extract__Group__0 ) ) )
            // InternalTableDSL.g:392:2: ( ( rule__Extract__Group__0 ) )
            {
            // InternalTableDSL.g:392:2: ( ( rule__Extract__Group__0 ) )
            // InternalTableDSL.g:393:3: ( rule__Extract__Group__0 )
            {
             before(grammarAccess.getExtractAccess().getGroup()); 
            // InternalTableDSL.g:394:3: ( rule__Extract__Group__0 )
            // InternalTableDSL.g:394:4: rule__Extract__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Extract__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExtractAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExtract"


    // $ANTLR start "entryRuleExtractColumnMapping"
    // InternalTableDSL.g:403:1: entryRuleExtractColumnMapping : ruleExtractColumnMapping EOF ;
    public final void entryRuleExtractColumnMapping() throws RecognitionException {
        try {
            // InternalTableDSL.g:404:1: ( ruleExtractColumnMapping EOF )
            // InternalTableDSL.g:405:1: ruleExtractColumnMapping EOF
            {
             before(grammarAccess.getExtractColumnMappingRule()); 
            pushFollow(FOLLOW_1);
            ruleExtractColumnMapping();

            state._fsp--;

             after(grammarAccess.getExtractColumnMappingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExtractColumnMapping"


    // $ANTLR start "ruleExtractColumnMapping"
    // InternalTableDSL.g:412:1: ruleExtractColumnMapping : ( ( rule__ExtractColumnMapping__Group__0 ) ) ;
    public final void ruleExtractColumnMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:416:2: ( ( ( rule__ExtractColumnMapping__Group__0 ) ) )
            // InternalTableDSL.g:417:2: ( ( rule__ExtractColumnMapping__Group__0 ) )
            {
            // InternalTableDSL.g:417:2: ( ( rule__ExtractColumnMapping__Group__0 ) )
            // InternalTableDSL.g:418:3: ( rule__ExtractColumnMapping__Group__0 )
            {
             before(grammarAccess.getExtractColumnMappingAccess().getGroup()); 
            // InternalTableDSL.g:419:3: ( rule__ExtractColumnMapping__Group__0 )
            // InternalTableDSL.g:419:4: rule__ExtractColumnMapping__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExtractColumnMapping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExtractColumnMappingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExtractColumnMapping"


    // $ANTLR start "entryRuleSelector"
    // InternalTableDSL.g:428:1: entryRuleSelector : ruleSelector EOF ;
    public final void entryRuleSelector() throws RecognitionException {
        try {
            // InternalTableDSL.g:429:1: ( ruleSelector EOF )
            // InternalTableDSL.g:430:1: ruleSelector EOF
            {
             before(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getSelectorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelector"


    // $ANTLR start "ruleSelector"
    // InternalTableDSL.g:437:1: ruleSelector : ( ( rule__Selector__Alternatives ) ) ;
    public final void ruleSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:441:2: ( ( ( rule__Selector__Alternatives ) ) )
            // InternalTableDSL.g:442:2: ( ( rule__Selector__Alternatives ) )
            {
            // InternalTableDSL.g:442:2: ( ( rule__Selector__Alternatives ) )
            // InternalTableDSL.g:443:3: ( rule__Selector__Alternatives )
            {
             before(grammarAccess.getSelectorAccess().getAlternatives()); 
            // InternalTableDSL.g:444:3: ( rule__Selector__Alternatives )
            // InternalTableDSL.g:444:4: rule__Selector__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleKeySelector"
    // InternalTableDSL.g:453:1: entryRuleKeySelector : ruleKeySelector EOF ;
    public final void entryRuleKeySelector() throws RecognitionException {
        try {
            // InternalTableDSL.g:454:1: ( ruleKeySelector EOF )
            // InternalTableDSL.g:455:1: ruleKeySelector EOF
            {
             before(grammarAccess.getKeySelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleKeySelector();

            state._fsp--;

             after(grammarAccess.getKeySelectorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKeySelector"


    // $ANTLR start "ruleKeySelector"
    // InternalTableDSL.g:462:1: ruleKeySelector : ( ( rule__KeySelector__KeyAssignment ) ) ;
    public final void ruleKeySelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:466:2: ( ( ( rule__KeySelector__KeyAssignment ) ) )
            // InternalTableDSL.g:467:2: ( ( rule__KeySelector__KeyAssignment ) )
            {
            // InternalTableDSL.g:467:2: ( ( rule__KeySelector__KeyAssignment ) )
            // InternalTableDSL.g:468:3: ( rule__KeySelector__KeyAssignment )
            {
             before(grammarAccess.getKeySelectorAccess().getKeyAssignment()); 
            // InternalTableDSL.g:469:3: ( rule__KeySelector__KeyAssignment )
            // InternalTableDSL.g:469:4: rule__KeySelector__KeyAssignment
            {
            pushFollow(FOLLOW_2);
            rule__KeySelector__KeyAssignment();

            state._fsp--;


            }

             after(grammarAccess.getKeySelectorAccess().getKeyAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKeySelector"


    // $ANTLR start "entryRuleTopNSelector"
    // InternalTableDSL.g:478:1: entryRuleTopNSelector : ruleTopNSelector EOF ;
    public final void entryRuleTopNSelector() throws RecognitionException {
        try {
            // InternalTableDSL.g:479:1: ( ruleTopNSelector EOF )
            // InternalTableDSL.g:480:1: ruleTopNSelector EOF
            {
             before(grammarAccess.getTopNSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleTopNSelector();

            state._fsp--;

             after(grammarAccess.getTopNSelectorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTopNSelector"


    // $ANTLR start "ruleTopNSelector"
    // InternalTableDSL.g:487:1: ruleTopNSelector : ( ( rule__TopNSelector__Group__0 ) ) ;
    public final void ruleTopNSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:491:2: ( ( ( rule__TopNSelector__Group__0 ) ) )
            // InternalTableDSL.g:492:2: ( ( rule__TopNSelector__Group__0 ) )
            {
            // InternalTableDSL.g:492:2: ( ( rule__TopNSelector__Group__0 ) )
            // InternalTableDSL.g:493:3: ( rule__TopNSelector__Group__0 )
            {
             before(grammarAccess.getTopNSelectorAccess().getGroup()); 
            // InternalTableDSL.g:494:3: ( rule__TopNSelector__Group__0 )
            // InternalTableDSL.g:494:4: rule__TopNSelector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TopNSelector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTopNSelectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTopNSelector"


    // $ANTLR start "entryRuleComparator"
    // InternalTableDSL.g:503:1: entryRuleComparator : ruleComparator EOF ;
    public final void entryRuleComparator() throws RecognitionException {
        try {
            // InternalTableDSL.g:504:1: ( ruleComparator EOF )
            // InternalTableDSL.g:505:1: ruleComparator EOF
            {
             before(grammarAccess.getComparatorRule()); 
            pushFollow(FOLLOW_1);
            ruleComparator();

            state._fsp--;

             after(grammarAccess.getComparatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComparator"


    // $ANTLR start "ruleComparator"
    // InternalTableDSL.g:512:1: ruleComparator : ( ( rule__Comparator__Group__0 ) ) ;
    public final void ruleComparator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:516:2: ( ( ( rule__Comparator__Group__0 ) ) )
            // InternalTableDSL.g:517:2: ( ( rule__Comparator__Group__0 ) )
            {
            // InternalTableDSL.g:517:2: ( ( rule__Comparator__Group__0 ) )
            // InternalTableDSL.g:518:3: ( rule__Comparator__Group__0 )
            {
             before(grammarAccess.getComparatorAccess().getGroup()); 
            // InternalTableDSL.g:519:3: ( rule__Comparator__Group__0 )
            // InternalTableDSL.g:519:4: rule__Comparator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Comparator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparator"


    // $ANTLR start "entryRuleSquashRows"
    // InternalTableDSL.g:528:1: entryRuleSquashRows : ruleSquashRows EOF ;
    public final void entryRuleSquashRows() throws RecognitionException {
        try {
            // InternalTableDSL.g:529:1: ( ruleSquashRows EOF )
            // InternalTableDSL.g:530:1: ruleSquashRows EOF
            {
             before(grammarAccess.getSquashRowsRule()); 
            pushFollow(FOLLOW_1);
            ruleSquashRows();

            state._fsp--;

             after(grammarAccess.getSquashRowsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSquashRows"


    // $ANTLR start "ruleSquashRows"
    // InternalTableDSL.g:537:1: ruleSquashRows : ( ( rule__SquashRows__Group__0 ) ) ;
    public final void ruleSquashRows() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:541:2: ( ( ( rule__SquashRows__Group__0 ) ) )
            // InternalTableDSL.g:542:2: ( ( rule__SquashRows__Group__0 ) )
            {
            // InternalTableDSL.g:542:2: ( ( rule__SquashRows__Group__0 ) )
            // InternalTableDSL.g:543:3: ( rule__SquashRows__Group__0 )
            {
             before(grammarAccess.getSquashRowsAccess().getGroup()); 
            // InternalTableDSL.g:544:3: ( rule__SquashRows__Group__0 )
            // InternalTableDSL.g:544:4: rule__SquashRows__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SquashRows__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSquashRowsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSquashRows"


    // $ANTLR start "entryRuleFilter"
    // InternalTableDSL.g:553:1: entryRuleFilter : ruleFilter EOF ;
    public final void entryRuleFilter() throws RecognitionException {
        try {
            // InternalTableDSL.g:554:1: ( ruleFilter EOF )
            // InternalTableDSL.g:555:1: ruleFilter EOF
            {
             before(grammarAccess.getFilterRule()); 
            pushFollow(FOLLOW_1);
            ruleFilter();

            state._fsp--;

             after(grammarAccess.getFilterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // InternalTableDSL.g:562:1: ruleFilter : ( ( rule__Filter__Group__0 ) ) ;
    public final void ruleFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:566:2: ( ( ( rule__Filter__Group__0 ) ) )
            // InternalTableDSL.g:567:2: ( ( rule__Filter__Group__0 ) )
            {
            // InternalTableDSL.g:567:2: ( ( rule__Filter__Group__0 ) )
            // InternalTableDSL.g:568:3: ( rule__Filter__Group__0 )
            {
             before(grammarAccess.getFilterAccess().getGroup()); 
            // InternalTableDSL.g:569:3: ( rule__Filter__Group__0 )
            // InternalTableDSL.g:569:4: rule__Filter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Filter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFilterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleFilterDenylist"
    // InternalTableDSL.g:578:1: entryRuleFilterDenylist : ruleFilterDenylist EOF ;
    public final void entryRuleFilterDenylist() throws RecognitionException {
        try {
            // InternalTableDSL.g:579:1: ( ruleFilterDenylist EOF )
            // InternalTableDSL.g:580:1: ruleFilterDenylist EOF
            {
             before(grammarAccess.getFilterDenylistRule()); 
            pushFollow(FOLLOW_1);
            ruleFilterDenylist();

            state._fsp--;

             after(grammarAccess.getFilterDenylistRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFilterDenylist"


    // $ANTLR start "ruleFilterDenylist"
    // InternalTableDSL.g:587:1: ruleFilterDenylist : ( ( rule__FilterDenylist__Group__0 ) ) ;
    public final void ruleFilterDenylist() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:591:2: ( ( ( rule__FilterDenylist__Group__0 ) ) )
            // InternalTableDSL.g:592:2: ( ( rule__FilterDenylist__Group__0 ) )
            {
            // InternalTableDSL.g:592:2: ( ( rule__FilterDenylist__Group__0 ) )
            // InternalTableDSL.g:593:3: ( rule__FilterDenylist__Group__0 )
            {
             before(grammarAccess.getFilterDenylistAccess().getGroup()); 
            // InternalTableDSL.g:594:3: ( rule__FilterDenylist__Group__0 )
            // InternalTableDSL.g:594:4: rule__FilterDenylist__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FilterDenylist__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFilterDenylistAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilterDenylist"


    // $ANTLR start "entryRuleFilterExceptlist"
    // InternalTableDSL.g:603:1: entryRuleFilterExceptlist : ruleFilterExceptlist EOF ;
    public final void entryRuleFilterExceptlist() throws RecognitionException {
        try {
            // InternalTableDSL.g:604:1: ( ruleFilterExceptlist EOF )
            // InternalTableDSL.g:605:1: ruleFilterExceptlist EOF
            {
             before(grammarAccess.getFilterExceptlistRule()); 
            pushFollow(FOLLOW_1);
            ruleFilterExceptlist();

            state._fsp--;

             after(grammarAccess.getFilterExceptlistRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFilterExceptlist"


    // $ANTLR start "ruleFilterExceptlist"
    // InternalTableDSL.g:612:1: ruleFilterExceptlist : ( ( rule__FilterExceptlist__Group__0 ) ) ;
    public final void ruleFilterExceptlist() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:616:2: ( ( ( rule__FilterExceptlist__Group__0 ) ) )
            // InternalTableDSL.g:617:2: ( ( rule__FilterExceptlist__Group__0 ) )
            {
            // InternalTableDSL.g:617:2: ( ( rule__FilterExceptlist__Group__0 ) )
            // InternalTableDSL.g:618:3: ( rule__FilterExceptlist__Group__0 )
            {
             before(grammarAccess.getFilterExceptlistAccess().getGroup()); 
            // InternalTableDSL.g:619:3: ( rule__FilterExceptlist__Group__0 )
            // InternalTableDSL.g:619:4: rule__FilterExceptlist__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FilterExceptlist__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFilterExceptlistAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilterExceptlist"


    // $ANTLR start "entryRuleFilterRule"
    // InternalTableDSL.g:628:1: entryRuleFilterRule : ruleFilterRule EOF ;
    public final void entryRuleFilterRule() throws RecognitionException {
        try {
            // InternalTableDSL.g:629:1: ( ruleFilterRule EOF )
            // InternalTableDSL.g:630:1: ruleFilterRule EOF
            {
             before(grammarAccess.getFilterRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleFilterRule();

            state._fsp--;

             after(grammarAccess.getFilterRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFilterRule"


    // $ANTLR start "ruleFilterRule"
    // InternalTableDSL.g:637:1: ruleFilterRule : ( ( rule__FilterRule__Alternatives ) ) ;
    public final void ruleFilterRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:641:2: ( ( ( rule__FilterRule__Alternatives ) ) )
            // InternalTableDSL.g:642:2: ( ( rule__FilterRule__Alternatives ) )
            {
            // InternalTableDSL.g:642:2: ( ( rule__FilterRule__Alternatives ) )
            // InternalTableDSL.g:643:3: ( rule__FilterRule__Alternatives )
            {
             before(grammarAccess.getFilterRuleAccess().getAlternatives()); 
            // InternalTableDSL.g:644:3: ( rule__FilterRule__Alternatives )
            // InternalTableDSL.g:644:4: rule__FilterRule__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FilterRule__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFilterRuleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilterRule"


    // $ANTLR start "entryRuleFilterColumnRule"
    // InternalTableDSL.g:653:1: entryRuleFilterColumnRule : ruleFilterColumnRule EOF ;
    public final void entryRuleFilterColumnRule() throws RecognitionException {
        try {
            // InternalTableDSL.g:654:1: ( ruleFilterColumnRule EOF )
            // InternalTableDSL.g:655:1: ruleFilterColumnRule EOF
            {
             before(grammarAccess.getFilterColumnRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleFilterColumnRule();

            state._fsp--;

             after(grammarAccess.getFilterColumnRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFilterColumnRule"


    // $ANTLR start "ruleFilterColumnRule"
    // InternalTableDSL.g:662:1: ruleFilterColumnRule : ( ( rule__FilterColumnRule__Group__0 ) ) ;
    public final void ruleFilterColumnRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:666:2: ( ( ( rule__FilterColumnRule__Group__0 ) ) )
            // InternalTableDSL.g:667:2: ( ( rule__FilterColumnRule__Group__0 ) )
            {
            // InternalTableDSL.g:667:2: ( ( rule__FilterColumnRule__Group__0 ) )
            // InternalTableDSL.g:668:3: ( rule__FilterColumnRule__Group__0 )
            {
             before(grammarAccess.getFilterColumnRuleAccess().getGroup()); 
            // InternalTableDSL.g:669:3: ( rule__FilterColumnRule__Group__0 )
            // InternalTableDSL.g:669:4: rule__FilterColumnRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FilterColumnRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFilterColumnRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilterColumnRule"


    // $ANTLR start "entryRuleFilterObjectTypeRule"
    // InternalTableDSL.g:678:1: entryRuleFilterObjectTypeRule : ruleFilterObjectTypeRule EOF ;
    public final void entryRuleFilterObjectTypeRule() throws RecognitionException {
        try {
            // InternalTableDSL.g:679:1: ( ruleFilterObjectTypeRule EOF )
            // InternalTableDSL.g:680:1: ruleFilterObjectTypeRule EOF
            {
             before(grammarAccess.getFilterObjectTypeRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleFilterObjectTypeRule();

            state._fsp--;

             after(grammarAccess.getFilterObjectTypeRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFilterObjectTypeRule"


    // $ANTLR start "ruleFilterObjectTypeRule"
    // InternalTableDSL.g:687:1: ruleFilterObjectTypeRule : ( ( rule__FilterObjectTypeRule__Group__0 ) ) ;
    public final void ruleFilterObjectTypeRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:691:2: ( ( ( rule__FilterObjectTypeRule__Group__0 ) ) )
            // InternalTableDSL.g:692:2: ( ( rule__FilterObjectTypeRule__Group__0 ) )
            {
            // InternalTableDSL.g:692:2: ( ( rule__FilterObjectTypeRule__Group__0 ) )
            // InternalTableDSL.g:693:3: ( rule__FilterObjectTypeRule__Group__0 )
            {
             before(grammarAccess.getFilterObjectTypeRuleAccess().getGroup()); 
            // InternalTableDSL.g:694:3: ( rule__FilterObjectTypeRule__Group__0 )
            // InternalTableDSL.g:694:4: rule__FilterObjectTypeRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FilterObjectTypeRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFilterObjectTypeRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilterObjectTypeRule"


    // $ANTLR start "entryRuleColumnName"
    // InternalTableDSL.g:703:1: entryRuleColumnName : ruleColumnName EOF ;
    public final void entryRuleColumnName() throws RecognitionException {
        try {
            // InternalTableDSL.g:704:1: ( ruleColumnName EOF )
            // InternalTableDSL.g:705:1: ruleColumnName EOF
            {
             before(grammarAccess.getColumnNameRule()); 
            pushFollow(FOLLOW_1);
            ruleColumnName();

            state._fsp--;

             after(grammarAccess.getColumnNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColumnName"


    // $ANTLR start "ruleColumnName"
    // InternalTableDSL.g:712:1: ruleColumnName : ( ( rule__ColumnName__ColumnNameAssignment ) ) ;
    public final void ruleColumnName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:716:2: ( ( ( rule__ColumnName__ColumnNameAssignment ) ) )
            // InternalTableDSL.g:717:2: ( ( rule__ColumnName__ColumnNameAssignment ) )
            {
            // InternalTableDSL.g:717:2: ( ( rule__ColumnName__ColumnNameAssignment ) )
            // InternalTableDSL.g:718:3: ( rule__ColumnName__ColumnNameAssignment )
            {
             before(grammarAccess.getColumnNameAccess().getColumnNameAssignment()); 
            // InternalTableDSL.g:719:3: ( rule__ColumnName__ColumnNameAssignment )
            // InternalTableDSL.g:719:4: rule__ColumnName__ColumnNameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ColumnName__ColumnNameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getColumnNameAccess().getColumnNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumnName"


    // $ANTLR start "rule__TableAction__Alternatives_0"
    // InternalTableDSL.g:727:1: rule__TableAction__Alternatives_0 : ( ( ruleLoadData ) | ( ruleOperation ) | ( ruleOutput ) );
    public final void rule__TableAction__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:731:1: ( ( ruleLoadData ) | ( ruleOperation ) | ( ruleOutput ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt1=1;
                }
                break;
            case 24:
            case 25:
            case 28:
            case 33:
            case 35:
                {
                alt1=2;
                }
                break;
            case 22:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalTableDSL.g:732:2: ( ruleLoadData )
                    {
                    // InternalTableDSL.g:732:2: ( ruleLoadData )
                    // InternalTableDSL.g:733:3: ruleLoadData
                    {
                     before(grammarAccess.getTableActionAccess().getLoadDataParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLoadData();

                    state._fsp--;

                     after(grammarAccess.getTableActionAccess().getLoadDataParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTableDSL.g:738:2: ( ruleOperation )
                    {
                    // InternalTableDSL.g:738:2: ( ruleOperation )
                    // InternalTableDSL.g:739:3: ruleOperation
                    {
                     before(grammarAccess.getTableActionAccess().getOperationParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOperation();

                    state._fsp--;

                     after(grammarAccess.getTableActionAccess().getOperationParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTableDSL.g:744:2: ( ruleOutput )
                    {
                    // InternalTableDSL.g:744:2: ( ruleOutput )
                    // InternalTableDSL.g:745:3: ruleOutput
                    {
                     before(grammarAccess.getTableActionAccess().getOutputParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleOutput();

                    state._fsp--;

                     after(grammarAccess.getTableActionAccess().getOutputParserRuleCall_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableAction__Alternatives_0"


    // $ANTLR start "rule__Operation__Alternatives"
    // InternalTableDSL.g:754:1: rule__Operation__Alternatives : ( ( ruleSelect ) | ( ruleRenameColumn ) | ( ruleExtract ) | ( ruleSquashRows ) | ( ruleFilter ) );
    public final void rule__Operation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:758:1: ( ( ruleSelect ) | ( ruleRenameColumn ) | ( ruleExtract ) | ( ruleSquashRows ) | ( ruleFilter ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt2=1;
                }
                break;
            case 25:
                {
                alt2=2;
                }
                break;
            case 28:
                {
                alt2=3;
                }
                break;
            case 33:
                {
                alt2=4;
                }
                break;
            case 35:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalTableDSL.g:759:2: ( ruleSelect )
                    {
                    // InternalTableDSL.g:759:2: ( ruleSelect )
                    // InternalTableDSL.g:760:3: ruleSelect
                    {
                     before(grammarAccess.getOperationAccess().getSelectParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSelect();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getSelectParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTableDSL.g:765:2: ( ruleRenameColumn )
                    {
                    // InternalTableDSL.g:765:2: ( ruleRenameColumn )
                    // InternalTableDSL.g:766:3: ruleRenameColumn
                    {
                     before(grammarAccess.getOperationAccess().getRenameColumnParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRenameColumn();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getRenameColumnParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTableDSL.g:771:2: ( ruleExtract )
                    {
                    // InternalTableDSL.g:771:2: ( ruleExtract )
                    // InternalTableDSL.g:772:3: ruleExtract
                    {
                     before(grammarAccess.getOperationAccess().getExtractParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleExtract();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getExtractParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTableDSL.g:777:2: ( ruleSquashRows )
                    {
                    // InternalTableDSL.g:777:2: ( ruleSquashRows )
                    // InternalTableDSL.g:778:3: ruleSquashRows
                    {
                     before(grammarAccess.getOperationAccess().getSquashRowsParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSquashRows();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getSquashRowsParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTableDSL.g:783:2: ( ruleFilter )
                    {
                    // InternalTableDSL.g:783:2: ( ruleFilter )
                    // InternalTableDSL.g:784:3: ruleFilter
                    {
                     before(grammarAccess.getOperationAccess().getFilterParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleFilter();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getFilterParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Alternatives"


    // $ANTLR start "rule__RenameColumnPair__Alternatives"
    // InternalTableDSL.g:793:1: rule__RenameColumnPair__Alternatives : ( ( ruleRenameColumnToPair ) | ( ruleRenameColumnAppendPair ) | ( ruleRenameColumnPrependPair ) );
    public final void rule__RenameColumnPair__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:797:1: ( ( ruleRenameColumnToPair ) | ( ruleRenameColumnAppendPair ) | ( ruleRenameColumnPrependPair ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                switch ( input.LA(2) ) {
                case 23:
                    {
                    alt3=1;
                    }
                    break;
                case 26:
                    {
                    alt3=3;
                    }
                    break;
                case 27:
                    {
                    alt3=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTableDSL.g:798:2: ( ruleRenameColumnToPair )
                    {
                    // InternalTableDSL.g:798:2: ( ruleRenameColumnToPair )
                    // InternalTableDSL.g:799:3: ruleRenameColumnToPair
                    {
                     before(grammarAccess.getRenameColumnPairAccess().getRenameColumnToPairParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRenameColumnToPair();

                    state._fsp--;

                     after(grammarAccess.getRenameColumnPairAccess().getRenameColumnToPairParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTableDSL.g:804:2: ( ruleRenameColumnAppendPair )
                    {
                    // InternalTableDSL.g:804:2: ( ruleRenameColumnAppendPair )
                    // InternalTableDSL.g:805:3: ruleRenameColumnAppendPair
                    {
                     before(grammarAccess.getRenameColumnPairAccess().getRenameColumnAppendPairParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRenameColumnAppendPair();

                    state._fsp--;

                     after(grammarAccess.getRenameColumnPairAccess().getRenameColumnAppendPairParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTableDSL.g:810:2: ( ruleRenameColumnPrependPair )
                    {
                    // InternalTableDSL.g:810:2: ( ruleRenameColumnPrependPair )
                    // InternalTableDSL.g:811:3: ruleRenameColumnPrependPair
                    {
                     before(grammarAccess.getRenameColumnPairAccess().getRenameColumnPrependPairParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRenameColumnPrependPair();

                    state._fsp--;

                     after(grammarAccess.getRenameColumnPairAccess().getRenameColumnPrependPairParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnPair__Alternatives"


    // $ANTLR start "rule__Selector__Alternatives"
    // InternalTableDSL.g:820:1: rule__Selector__Alternatives : ( ( ruleKeySelector ) | ( ruleTopNSelector ) );
    public final void rule__Selector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:824:1: ( ( ruleKeySelector ) | ( ruleTopNSelector ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_SELECTOR_KEYWORDS) ) {
                alt4=1;
            }
            else if ( (LA4_0==32) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTableDSL.g:825:2: ( ruleKeySelector )
                    {
                    // InternalTableDSL.g:825:2: ( ruleKeySelector )
                    // InternalTableDSL.g:826:3: ruleKeySelector
                    {
                     before(grammarAccess.getSelectorAccess().getKeySelectorParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleKeySelector();

                    state._fsp--;

                     after(grammarAccess.getSelectorAccess().getKeySelectorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTableDSL.g:831:2: ( ruleTopNSelector )
                    {
                    // InternalTableDSL.g:831:2: ( ruleTopNSelector )
                    // InternalTableDSL.g:832:3: ruleTopNSelector
                    {
                     before(grammarAccess.getSelectorAccess().getTopNSelectorParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTopNSelector();

                    state._fsp--;

                     after(grammarAccess.getSelectorAccess().getTopNSelectorParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Alternatives"


    // $ANTLR start "rule__FilterRule__Alternatives"
    // InternalTableDSL.g:841:1: rule__FilterRule__Alternatives : ( ( ruleFilterColumnRule ) | ( ruleFilterObjectTypeRule ) );
    public final void rule__FilterRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:845:1: ( ( ruleFilterColumnRule ) | ( ruleFilterObjectTypeRule ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=13 && LA5_0<=14)) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=15 && LA5_0<=16)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalTableDSL.g:846:2: ( ruleFilterColumnRule )
                    {
                    // InternalTableDSL.g:846:2: ( ruleFilterColumnRule )
                    // InternalTableDSL.g:847:3: ruleFilterColumnRule
                    {
                     before(grammarAccess.getFilterRuleAccess().getFilterColumnRuleParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFilterColumnRule();

                    state._fsp--;

                     after(grammarAccess.getFilterRuleAccess().getFilterColumnRuleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTableDSL.g:852:2: ( ruleFilterObjectTypeRule )
                    {
                    // InternalTableDSL.g:852:2: ( ruleFilterObjectTypeRule )
                    // InternalTableDSL.g:853:3: ruleFilterObjectTypeRule
                    {
                     before(grammarAccess.getFilterRuleAccess().getFilterObjectTypeRuleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFilterObjectTypeRule();

                    state._fsp--;

                     after(grammarAccess.getFilterRuleAccess().getFilterObjectTypeRuleParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterRule__Alternatives"


    // $ANTLR start "rule__FilterColumnRule__Alternatives_0"
    // InternalTableDSL.g:862:1: rule__FilterColumnRule__Alternatives_0 : ( ( 'column' ) | ( 'columns' ) );
    public final void rule__FilterColumnRule__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:866:1: ( ( 'column' ) | ( 'columns' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalTableDSL.g:867:2: ( 'column' )
                    {
                    // InternalTableDSL.g:867:2: ( 'column' )
                    // InternalTableDSL.g:868:3: 'column'
                    {
                     before(grammarAccess.getFilterColumnRuleAccess().getColumnKeyword_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getFilterColumnRuleAccess().getColumnKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTableDSL.g:873:2: ( 'columns' )
                    {
                    // InternalTableDSL.g:873:2: ( 'columns' )
                    // InternalTableDSL.g:874:3: 'columns'
                    {
                     before(grammarAccess.getFilterColumnRuleAccess().getColumnsKeyword_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getFilterColumnRuleAccess().getColumnsKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterColumnRule__Alternatives_0"


    // $ANTLR start "rule__FilterObjectTypeRule__Alternatives_0"
    // InternalTableDSL.g:883:1: rule__FilterObjectTypeRule__Alternatives_0 : ( ( 'object' ) | ( 'objects' ) );
    public final void rule__FilterObjectTypeRule__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:887:1: ( ( 'object' ) | ( 'objects' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTableDSL.g:888:2: ( 'object' )
                    {
                    // InternalTableDSL.g:888:2: ( 'object' )
                    // InternalTableDSL.g:889:3: 'object'
                    {
                     before(grammarAccess.getFilterObjectTypeRuleAccess().getObjectKeyword_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getFilterObjectTypeRuleAccess().getObjectKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTableDSL.g:894:2: ( 'objects' )
                    {
                    // InternalTableDSL.g:894:2: ( 'objects' )
                    // InternalTableDSL.g:895:3: 'objects'
                    {
                     before(grammarAccess.getFilterObjectTypeRuleAccess().getObjectsKeyword_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getFilterObjectTypeRuleAccess().getObjectsKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterObjectTypeRule__Alternatives_0"


    // $ANTLR start "rule__ColumnName__ColumnNameAlternatives_0"
    // InternalTableDSL.g:904:1: rule__ColumnName__ColumnNameAlternatives_0 : ( ( RULE_COLUMN_NAME_KEYWORDS ) | ( RULE_STRING ) );
    public final void rule__ColumnName__ColumnNameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:908:1: ( ( RULE_COLUMN_NAME_KEYWORDS ) | ( RULE_STRING ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_COLUMN_NAME_KEYWORDS) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_STRING) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTableDSL.g:909:2: ( RULE_COLUMN_NAME_KEYWORDS )
                    {
                    // InternalTableDSL.g:909:2: ( RULE_COLUMN_NAME_KEYWORDS )
                    // InternalTableDSL.g:910:3: RULE_COLUMN_NAME_KEYWORDS
                    {
                     before(grammarAccess.getColumnNameAccess().getColumnNameCOLUMN_NAME_KEYWORDSTerminalRuleCall_0_0()); 
                    match(input,RULE_COLUMN_NAME_KEYWORDS,FOLLOW_2); 
                     after(grammarAccess.getColumnNameAccess().getColumnNameCOLUMN_NAME_KEYWORDSTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTableDSL.g:915:2: ( RULE_STRING )
                    {
                    // InternalTableDSL.g:915:2: ( RULE_STRING )
                    // InternalTableDSL.g:916:3: RULE_STRING
                    {
                     before(grammarAccess.getColumnNameAccess().getColumnNameSTRINGTerminalRuleCall_0_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getColumnNameAccess().getColumnNameSTRINGTerminalRuleCall_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnName__ColumnNameAlternatives_0"


    // $ANTLR start "rule__Start__Group__0"
    // InternalTableDSL.g:925:1: rule__Start__Group__0 : rule__Start__Group__0__Impl rule__Start__Group__1 ;
    public final void rule__Start__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:929:1: ( rule__Start__Group__0__Impl rule__Start__Group__1 )
            // InternalTableDSL.g:930:2: rule__Start__Group__0__Impl rule__Start__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Start__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Start__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Start__Group__0"


    // $ANTLR start "rule__Start__Group__0__Impl"
    // InternalTableDSL.g:937:1: rule__Start__Group__0__Impl : ( ( rule__Start__ActionsAssignment_0 )? ) ;
    public final void rule__Start__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:941:1: ( ( ( rule__Start__ActionsAssignment_0 )? ) )
            // InternalTableDSL.g:942:1: ( ( rule__Start__ActionsAssignment_0 )? )
            {
            // InternalTableDSL.g:942:1: ( ( rule__Start__ActionsAssignment_0 )? )
            // InternalTableDSL.g:943:2: ( rule__Start__ActionsAssignment_0 )?
            {
             before(grammarAccess.getStartAccess().getActionsAssignment_0()); 
            // InternalTableDSL.g:944:2: ( rule__Start__ActionsAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=17 && LA9_0<=18)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTableDSL.g:944:3: rule__Start__ActionsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Start__ActionsAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStartAccess().getActionsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Start__Group__0__Impl"


    // $ANTLR start "rule__Start__Group__1"
    // InternalTableDSL.g:952:1: rule__Start__Group__1 : rule__Start__Group__1__Impl ;
    public final void rule__Start__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:956:1: ( rule__Start__Group__1__Impl )
            // InternalTableDSL.g:957:2: rule__Start__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Start__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Start__Group__1"


    // $ANTLR start "rule__Start__Group__1__Impl"
    // InternalTableDSL.g:963:1: rule__Start__Group__1__Impl : ( ( rule__Start__ActionsAssignment_1 )* ) ;
    public final void rule__Start__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:967:1: ( ( ( rule__Start__ActionsAssignment_1 )* ) )
            // InternalTableDSL.g:968:1: ( ( rule__Start__ActionsAssignment_1 )* )
            {
            // InternalTableDSL.g:968:1: ( ( rule__Start__ActionsAssignment_1 )* )
            // InternalTableDSL.g:969:2: ( rule__Start__ActionsAssignment_1 )*
            {
             before(grammarAccess.getStartAccess().getActionsAssignment_1()); 
            // InternalTableDSL.g:970:2: ( rule__Start__ActionsAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20||LA10_0==22||(LA10_0>=24 && LA10_0<=25)||LA10_0==28||LA10_0==33||LA10_0==35) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTableDSL.g:970:3: rule__Start__ActionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Start__ActionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getStartAccess().getActionsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Start__Group__1__Impl"


    // $ANTLR start "rule__CreateTable__Group__0"
    // InternalTableDSL.g:979:1: rule__CreateTable__Group__0 : rule__CreateTable__Group__0__Impl rule__CreateTable__Group__1 ;
    public final void rule__CreateTable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:983:1: ( rule__CreateTable__Group__0__Impl rule__CreateTable__Group__1 )
            // InternalTableDSL.g:984:2: rule__CreateTable__Group__0__Impl rule__CreateTable__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__CreateTable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateTable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateTable__Group__0"


    // $ANTLR start "rule__CreateTable__Group__0__Impl"
    // InternalTableDSL.g:991:1: rule__CreateTable__Group__0__Impl : ( ( 'create' )? ) ;
    public final void rule__CreateTable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:995:1: ( ( ( 'create' )? ) )
            // InternalTableDSL.g:996:1: ( ( 'create' )? )
            {
            // InternalTableDSL.g:996:1: ( ( 'create' )? )
            // InternalTableDSL.g:997:2: ( 'create' )?
            {
             before(grammarAccess.getCreateTableAccess().getCreateKeyword_0()); 
            // InternalTableDSL.g:998:2: ( 'create' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTableDSL.g:998:3: 'create'
                    {
                    match(input,17,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getCreateTableAccess().getCreateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateTable__Group__0__Impl"


    // $ANTLR start "rule__CreateTable__Group__1"
    // InternalTableDSL.g:1006:1: rule__CreateTable__Group__1 : rule__CreateTable__Group__1__Impl rule__CreateTable__Group__2 ;
    public final void rule__CreateTable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1010:1: ( rule__CreateTable__Group__1__Impl rule__CreateTable__Group__2 )
            // InternalTableDSL.g:1011:2: rule__CreateTable__Group__1__Impl rule__CreateTable__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__CreateTable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateTable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateTable__Group__1"


    // $ANTLR start "rule__CreateTable__Group__1__Impl"
    // InternalTableDSL.g:1018:1: rule__CreateTable__Group__1__Impl : ( 'table' ) ;
    public final void rule__CreateTable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1022:1: ( ( 'table' ) )
            // InternalTableDSL.g:1023:1: ( 'table' )
            {
            // InternalTableDSL.g:1023:1: ( 'table' )
            // InternalTableDSL.g:1024:2: 'table'
            {
             before(grammarAccess.getCreateTableAccess().getTableKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCreateTableAccess().getTableKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateTable__Group__1__Impl"


    // $ANTLR start "rule__CreateTable__Group__2"
    // InternalTableDSL.g:1033:1: rule__CreateTable__Group__2 : rule__CreateTable__Group__2__Impl rule__CreateTable__Group__3 ;
    public final void rule__CreateTable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1037:1: ( rule__CreateTable__Group__2__Impl rule__CreateTable__Group__3 )
            // InternalTableDSL.g:1038:2: rule__CreateTable__Group__2__Impl rule__CreateTable__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__CreateTable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateTable__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateTable__Group__2"


    // $ANTLR start "rule__CreateTable__Group__2__Impl"
    // InternalTableDSL.g:1045:1: rule__CreateTable__Group__2__Impl : ( 'from' ) ;
    public final void rule__CreateTable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1049:1: ( ( 'from' ) )
            // InternalTableDSL.g:1050:1: ( 'from' )
            {
            // InternalTableDSL.g:1050:1: ( 'from' )
            // InternalTableDSL.g:1051:2: 'from'
            {
             before(grammarAccess.getCreateTableAccess().getFromKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCreateTableAccess().getFromKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateTable__Group__2__Impl"


    // $ANTLR start "rule__CreateTable__Group__3"
    // InternalTableDSL.g:1060:1: rule__CreateTable__Group__3 : rule__CreateTable__Group__3__Impl rule__CreateTable__Group__4 ;
    public final void rule__CreateTable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1064:1: ( rule__CreateTable__Group__3__Impl rule__CreateTable__Group__4 )
            // InternalTableDSL.g:1065:2: rule__CreateTable__Group__3__Impl rule__CreateTable__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__CreateTable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateTable__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateTable__Group__3"


    // $ANTLR start "rule__CreateTable__Group__3__Impl"
    // InternalTableDSL.g:1072:1: rule__CreateTable__Group__3__Impl : ( ruleTableInputPath ) ;
    public final void rule__CreateTable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1076:1: ( ( ruleTableInputPath ) )
            // InternalTableDSL.g:1077:1: ( ruleTableInputPath )
            {
            // InternalTableDSL.g:1077:1: ( ruleTableInputPath )
            // InternalTableDSL.g:1078:2: ruleTableInputPath
            {
             before(grammarAccess.getCreateTableAccess().getTableInputPathParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleTableInputPath();

            state._fsp--;

             after(grammarAccess.getCreateTableAccess().getTableInputPathParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateTable__Group__3__Impl"


    // $ANTLR start "rule__CreateTable__Group__4"
    // InternalTableDSL.g:1087:1: rule__CreateTable__Group__4 : rule__CreateTable__Group__4__Impl ;
    public final void rule__CreateTable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1091:1: ( rule__CreateTable__Group__4__Impl )
            // InternalTableDSL.g:1092:2: rule__CreateTable__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CreateTable__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateTable__Group__4"


    // $ANTLR start "rule__CreateTable__Group__4__Impl"
    // InternalTableDSL.g:1098:1: rule__CreateTable__Group__4__Impl : ( RULE_ANY_OTHER ) ;
    public final void rule__CreateTable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1102:1: ( ( RULE_ANY_OTHER ) )
            // InternalTableDSL.g:1103:1: ( RULE_ANY_OTHER )
            {
            // InternalTableDSL.g:1103:1: ( RULE_ANY_OTHER )
            // InternalTableDSL.g:1104:2: RULE_ANY_OTHER
            {
             before(grammarAccess.getCreateTableAccess().getANY_OTHERTerminalRuleCall_4()); 
            match(input,RULE_ANY_OTHER,FOLLOW_2); 
             after(grammarAccess.getCreateTableAccess().getANY_OTHERTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateTable__Group__4__Impl"


    // $ANTLR start "rule__TableAction__Group__0"
    // InternalTableDSL.g:1114:1: rule__TableAction__Group__0 : rule__TableAction__Group__0__Impl rule__TableAction__Group__1 ;
    public final void rule__TableAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1118:1: ( rule__TableAction__Group__0__Impl rule__TableAction__Group__1 )
            // InternalTableDSL.g:1119:2: rule__TableAction__Group__0__Impl rule__TableAction__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__TableAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableAction__Group__0"


    // $ANTLR start "rule__TableAction__Group__0__Impl"
    // InternalTableDSL.g:1126:1: rule__TableAction__Group__0__Impl : ( ( rule__TableAction__Alternatives_0 ) ) ;
    public final void rule__TableAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1130:1: ( ( ( rule__TableAction__Alternatives_0 ) ) )
            // InternalTableDSL.g:1131:1: ( ( rule__TableAction__Alternatives_0 ) )
            {
            // InternalTableDSL.g:1131:1: ( ( rule__TableAction__Alternatives_0 ) )
            // InternalTableDSL.g:1132:2: ( rule__TableAction__Alternatives_0 )
            {
             before(grammarAccess.getTableActionAccess().getAlternatives_0()); 
            // InternalTableDSL.g:1133:2: ( rule__TableAction__Alternatives_0 )
            // InternalTableDSL.g:1133:3: rule__TableAction__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__TableAction__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getTableActionAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableAction__Group__0__Impl"


    // $ANTLR start "rule__TableAction__Group__1"
    // InternalTableDSL.g:1141:1: rule__TableAction__Group__1 : rule__TableAction__Group__1__Impl ;
    public final void rule__TableAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1145:1: ( rule__TableAction__Group__1__Impl )
            // InternalTableDSL.g:1146:2: rule__TableAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableAction__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableAction__Group__1"


    // $ANTLR start "rule__TableAction__Group__1__Impl"
    // InternalTableDSL.g:1152:1: rule__TableAction__Group__1__Impl : ( RULE_ANY_OTHER ) ;
    public final void rule__TableAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1156:1: ( ( RULE_ANY_OTHER ) )
            // InternalTableDSL.g:1157:1: ( RULE_ANY_OTHER )
            {
            // InternalTableDSL.g:1157:1: ( RULE_ANY_OTHER )
            // InternalTableDSL.g:1158:2: RULE_ANY_OTHER
            {
             before(grammarAccess.getTableActionAccess().getANY_OTHERTerminalRuleCall_1()); 
            match(input,RULE_ANY_OTHER,FOLLOW_2); 
             after(grammarAccess.getTableActionAccess().getANY_OTHERTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableAction__Group__1__Impl"


    // $ANTLR start "rule__LoadData__Group__0"
    // InternalTableDSL.g:1168:1: rule__LoadData__Group__0 : rule__LoadData__Group__0__Impl rule__LoadData__Group__1 ;
    public final void rule__LoadData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1172:1: ( rule__LoadData__Group__0__Impl rule__LoadData__Group__1 )
            // InternalTableDSL.g:1173:2: rule__LoadData__Group__0__Impl rule__LoadData__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__LoadData__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoadData__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadData__Group__0"


    // $ANTLR start "rule__LoadData__Group__0__Impl"
    // InternalTableDSL.g:1180:1: rule__LoadData__Group__0__Impl : ( 'load' ) ;
    public final void rule__LoadData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1184:1: ( ( 'load' ) )
            // InternalTableDSL.g:1185:1: ( 'load' )
            {
            // InternalTableDSL.g:1185:1: ( 'load' )
            // InternalTableDSL.g:1186:2: 'load'
            {
             before(grammarAccess.getLoadDataAccess().getLoadKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLoadDataAccess().getLoadKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadData__Group__0__Impl"


    // $ANTLR start "rule__LoadData__Group__1"
    // InternalTableDSL.g:1195:1: rule__LoadData__Group__1 : rule__LoadData__Group__1__Impl ;
    public final void rule__LoadData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1199:1: ( rule__LoadData__Group__1__Impl )
            // InternalTableDSL.g:1200:2: rule__LoadData__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoadData__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadData__Group__1"


    // $ANTLR start "rule__LoadData__Group__1__Impl"
    // InternalTableDSL.g:1206:1: rule__LoadData__Group__1__Impl : ( ruleTableInputPath ) ;
    public final void rule__LoadData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1210:1: ( ( ruleTableInputPath ) )
            // InternalTableDSL.g:1211:1: ( ruleTableInputPath )
            {
            // InternalTableDSL.g:1211:1: ( ruleTableInputPath )
            // InternalTableDSL.g:1212:2: ruleTableInputPath
            {
             before(grammarAccess.getLoadDataAccess().getTableInputPathParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleTableInputPath();

            state._fsp--;

             after(grammarAccess.getLoadDataAccess().getTableInputPathParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoadData__Group__1__Impl"


    // $ANTLR start "rule__TableInputPath__Group__0"
    // InternalTableDSL.g:1222:1: rule__TableInputPath__Group__0 : rule__TableInputPath__Group__0__Impl rule__TableInputPath__Group__1 ;
    public final void rule__TableInputPath__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1226:1: ( rule__TableInputPath__Group__0__Impl rule__TableInputPath__Group__1 )
            // InternalTableDSL.g:1227:2: rule__TableInputPath__Group__0__Impl rule__TableInputPath__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__TableInputPath__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableInputPath__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableInputPath__Group__0"


    // $ANTLR start "rule__TableInputPath__Group__0__Impl"
    // InternalTableDSL.g:1234:1: rule__TableInputPath__Group__0__Impl : ( ( rule__TableInputPath__PathPatternsAssignment_0 ) ) ;
    public final void rule__TableInputPath__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1238:1: ( ( ( rule__TableInputPath__PathPatternsAssignment_0 ) ) )
            // InternalTableDSL.g:1239:1: ( ( rule__TableInputPath__PathPatternsAssignment_0 ) )
            {
            // InternalTableDSL.g:1239:1: ( ( rule__TableInputPath__PathPatternsAssignment_0 ) )
            // InternalTableDSL.g:1240:2: ( rule__TableInputPath__PathPatternsAssignment_0 )
            {
             before(grammarAccess.getTableInputPathAccess().getPathPatternsAssignment_0()); 
            // InternalTableDSL.g:1241:2: ( rule__TableInputPath__PathPatternsAssignment_0 )
            // InternalTableDSL.g:1241:3: rule__TableInputPath__PathPatternsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TableInputPath__PathPatternsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTableInputPathAccess().getPathPatternsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableInputPath__Group__0__Impl"


    // $ANTLR start "rule__TableInputPath__Group__1"
    // InternalTableDSL.g:1249:1: rule__TableInputPath__Group__1 : rule__TableInputPath__Group__1__Impl ;
    public final void rule__TableInputPath__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1253:1: ( rule__TableInputPath__Group__1__Impl )
            // InternalTableDSL.g:1254:2: rule__TableInputPath__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableInputPath__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableInputPath__Group__1"


    // $ANTLR start "rule__TableInputPath__Group__1__Impl"
    // InternalTableDSL.g:1260:1: rule__TableInputPath__Group__1__Impl : ( ( rule__TableInputPath__Group_1__0 )* ) ;
    public final void rule__TableInputPath__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1264:1: ( ( ( rule__TableInputPath__Group_1__0 )* ) )
            // InternalTableDSL.g:1265:1: ( ( rule__TableInputPath__Group_1__0 )* )
            {
            // InternalTableDSL.g:1265:1: ( ( rule__TableInputPath__Group_1__0 )* )
            // InternalTableDSL.g:1266:2: ( rule__TableInputPath__Group_1__0 )*
            {
             before(grammarAccess.getTableInputPathAccess().getGroup_1()); 
            // InternalTableDSL.g:1267:2: ( rule__TableInputPath__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTableDSL.g:1267:3: rule__TableInputPath__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__TableInputPath__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getTableInputPathAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableInputPath__Group__1__Impl"


    // $ANTLR start "rule__TableInputPath__Group_1__0"
    // InternalTableDSL.g:1276:1: rule__TableInputPath__Group_1__0 : rule__TableInputPath__Group_1__0__Impl rule__TableInputPath__Group_1__1 ;
    public final void rule__TableInputPath__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1280:1: ( rule__TableInputPath__Group_1__0__Impl rule__TableInputPath__Group_1__1 )
            // InternalTableDSL.g:1281:2: rule__TableInputPath__Group_1__0__Impl rule__TableInputPath__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__TableInputPath__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableInputPath__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableInputPath__Group_1__0"


    // $ANTLR start "rule__TableInputPath__Group_1__0__Impl"
    // InternalTableDSL.g:1288:1: rule__TableInputPath__Group_1__0__Impl : ( ',' ) ;
    public final void rule__TableInputPath__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1292:1: ( ( ',' ) )
            // InternalTableDSL.g:1293:1: ( ',' )
            {
            // InternalTableDSL.g:1293:1: ( ',' )
            // InternalTableDSL.g:1294:2: ','
            {
             before(grammarAccess.getTableInputPathAccess().getCommaKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTableInputPathAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableInputPath__Group_1__0__Impl"


    // $ANTLR start "rule__TableInputPath__Group_1__1"
    // InternalTableDSL.g:1303:1: rule__TableInputPath__Group_1__1 : rule__TableInputPath__Group_1__1__Impl ;
    public final void rule__TableInputPath__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1307:1: ( rule__TableInputPath__Group_1__1__Impl )
            // InternalTableDSL.g:1308:2: rule__TableInputPath__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableInputPath__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableInputPath__Group_1__1"


    // $ANTLR start "rule__TableInputPath__Group_1__1__Impl"
    // InternalTableDSL.g:1314:1: rule__TableInputPath__Group_1__1__Impl : ( ( rule__TableInputPath__PathPatternsAssignment_1_1 ) ) ;
    public final void rule__TableInputPath__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1318:1: ( ( ( rule__TableInputPath__PathPatternsAssignment_1_1 ) ) )
            // InternalTableDSL.g:1319:1: ( ( rule__TableInputPath__PathPatternsAssignment_1_1 ) )
            {
            // InternalTableDSL.g:1319:1: ( ( rule__TableInputPath__PathPatternsAssignment_1_1 ) )
            // InternalTableDSL.g:1320:2: ( rule__TableInputPath__PathPatternsAssignment_1_1 )
            {
             before(grammarAccess.getTableInputPathAccess().getPathPatternsAssignment_1_1()); 
            // InternalTableDSL.g:1321:2: ( rule__TableInputPath__PathPatternsAssignment_1_1 )
            // InternalTableDSL.g:1321:3: rule__TableInputPath__PathPatternsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TableInputPath__PathPatternsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTableInputPathAccess().getPathPatternsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableInputPath__Group_1__1__Impl"


    // $ANTLR start "rule__Output__Group__0"
    // InternalTableDSL.g:1330:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1334:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // InternalTableDSL.g:1335:2: rule__Output__Group__0__Impl rule__Output__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Output__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__0"


    // $ANTLR start "rule__Output__Group__0__Impl"
    // InternalTableDSL.g:1342:1: rule__Output__Group__0__Impl : ( 'output' ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1346:1: ( ( 'output' ) )
            // InternalTableDSL.g:1347:1: ( 'output' )
            {
            // InternalTableDSL.g:1347:1: ( 'output' )
            // InternalTableDSL.g:1348:2: 'output'
            {
             before(grammarAccess.getOutputAccess().getOutputKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getOutputKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__0__Impl"


    // $ANTLR start "rule__Output__Group__1"
    // InternalTableDSL.g:1357:1: rule__Output__Group__1 : rule__Output__Group__1__Impl rule__Output__Group__2 ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1361:1: ( rule__Output__Group__1__Impl rule__Output__Group__2 )
            // InternalTableDSL.g:1362:2: rule__Output__Group__1__Impl rule__Output__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Output__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__1"


    // $ANTLR start "rule__Output__Group__1__Impl"
    // InternalTableDSL.g:1369:1: rule__Output__Group__1__Impl : ( 'to' ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1373:1: ( ( 'to' ) )
            // InternalTableDSL.g:1374:1: ( 'to' )
            {
            // InternalTableDSL.g:1374:1: ( 'to' )
            // InternalTableDSL.g:1375:2: 'to'
            {
             before(grammarAccess.getOutputAccess().getToKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getToKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__1__Impl"


    // $ANTLR start "rule__Output__Group__2"
    // InternalTableDSL.g:1384:1: rule__Output__Group__2 : rule__Output__Group__2__Impl rule__Output__Group__3 ;
    public final void rule__Output__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1388:1: ( rule__Output__Group__2__Impl rule__Output__Group__3 )
            // InternalTableDSL.g:1389:2: rule__Output__Group__2__Impl rule__Output__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Output__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__2"


    // $ANTLR start "rule__Output__Group__2__Impl"
    // InternalTableDSL.g:1396:1: rule__Output__Group__2__Impl : ( ( rule__Output__OutputPathsAssignment_2 ) ) ;
    public final void rule__Output__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1400:1: ( ( ( rule__Output__OutputPathsAssignment_2 ) ) )
            // InternalTableDSL.g:1401:1: ( ( rule__Output__OutputPathsAssignment_2 ) )
            {
            // InternalTableDSL.g:1401:1: ( ( rule__Output__OutputPathsAssignment_2 ) )
            // InternalTableDSL.g:1402:2: ( rule__Output__OutputPathsAssignment_2 )
            {
             before(grammarAccess.getOutputAccess().getOutputPathsAssignment_2()); 
            // InternalTableDSL.g:1403:2: ( rule__Output__OutputPathsAssignment_2 )
            // InternalTableDSL.g:1403:3: rule__Output__OutputPathsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Output__OutputPathsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getOutputPathsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__2__Impl"


    // $ANTLR start "rule__Output__Group__3"
    // InternalTableDSL.g:1411:1: rule__Output__Group__3 : rule__Output__Group__3__Impl ;
    public final void rule__Output__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1415:1: ( rule__Output__Group__3__Impl )
            // InternalTableDSL.g:1416:2: rule__Output__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__3"


    // $ANTLR start "rule__Output__Group__3__Impl"
    // InternalTableDSL.g:1422:1: rule__Output__Group__3__Impl : ( ( rule__Output__Group_3__0 )* ) ;
    public final void rule__Output__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1426:1: ( ( ( rule__Output__Group_3__0 )* ) )
            // InternalTableDSL.g:1427:1: ( ( rule__Output__Group_3__0 )* )
            {
            // InternalTableDSL.g:1427:1: ( ( rule__Output__Group_3__0 )* )
            // InternalTableDSL.g:1428:2: ( rule__Output__Group_3__0 )*
            {
             before(grammarAccess.getOutputAccess().getGroup_3()); 
            // InternalTableDSL.g:1429:2: ( rule__Output__Group_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==21) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTableDSL.g:1429:3: rule__Output__Group_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Output__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getOutputAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__3__Impl"


    // $ANTLR start "rule__Output__Group_3__0"
    // InternalTableDSL.g:1438:1: rule__Output__Group_3__0 : rule__Output__Group_3__0__Impl rule__Output__Group_3__1 ;
    public final void rule__Output__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1442:1: ( rule__Output__Group_3__0__Impl rule__Output__Group_3__1 )
            // InternalTableDSL.g:1443:2: rule__Output__Group_3__0__Impl rule__Output__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Output__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_3__0"


    // $ANTLR start "rule__Output__Group_3__0__Impl"
    // InternalTableDSL.g:1450:1: rule__Output__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Output__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1454:1: ( ( ',' ) )
            // InternalTableDSL.g:1455:1: ( ',' )
            {
            // InternalTableDSL.g:1455:1: ( ',' )
            // InternalTableDSL.g:1456:2: ','
            {
             before(grammarAccess.getOutputAccess().getCommaKeyword_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_3__0__Impl"


    // $ANTLR start "rule__Output__Group_3__1"
    // InternalTableDSL.g:1465:1: rule__Output__Group_3__1 : rule__Output__Group_3__1__Impl ;
    public final void rule__Output__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1469:1: ( rule__Output__Group_3__1__Impl )
            // InternalTableDSL.g:1470:2: rule__Output__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_3__1"


    // $ANTLR start "rule__Output__Group_3__1__Impl"
    // InternalTableDSL.g:1476:1: rule__Output__Group_3__1__Impl : ( ( rule__Output__OutputPathsAssignment_3_1 ) ) ;
    public final void rule__Output__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1480:1: ( ( ( rule__Output__OutputPathsAssignment_3_1 ) ) )
            // InternalTableDSL.g:1481:1: ( ( rule__Output__OutputPathsAssignment_3_1 ) )
            {
            // InternalTableDSL.g:1481:1: ( ( rule__Output__OutputPathsAssignment_3_1 ) )
            // InternalTableDSL.g:1482:2: ( rule__Output__OutputPathsAssignment_3_1 )
            {
             before(grammarAccess.getOutputAccess().getOutputPathsAssignment_3_1()); 
            // InternalTableDSL.g:1483:2: ( rule__Output__OutputPathsAssignment_3_1 )
            // InternalTableDSL.g:1483:3: rule__Output__OutputPathsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Output__OutputPathsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getOutputPathsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_3__1__Impl"


    // $ANTLR start "rule__Select__Group__0"
    // InternalTableDSL.g:1492:1: rule__Select__Group__0 : rule__Select__Group__0__Impl rule__Select__Group__1 ;
    public final void rule__Select__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1496:1: ( rule__Select__Group__0__Impl rule__Select__Group__1 )
            // InternalTableDSL.g:1497:2: rule__Select__Group__0__Impl rule__Select__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Select__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__0"


    // $ANTLR start "rule__Select__Group__0__Impl"
    // InternalTableDSL.g:1504:1: rule__Select__Group__0__Impl : ( 'select' ) ;
    public final void rule__Select__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1508:1: ( ( 'select' ) )
            // InternalTableDSL.g:1509:1: ( 'select' )
            {
            // InternalTableDSL.g:1509:1: ( 'select' )
            // InternalTableDSL.g:1510:2: 'select'
            {
             before(grammarAccess.getSelectAccess().getSelectKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getSelectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__0__Impl"


    // $ANTLR start "rule__Select__Group__1"
    // InternalTableDSL.g:1519:1: rule__Select__Group__1 : rule__Select__Group__1__Impl rule__Select__Group__2 ;
    public final void rule__Select__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1523:1: ( rule__Select__Group__1__Impl rule__Select__Group__2 )
            // InternalTableDSL.g:1524:2: rule__Select__Group__1__Impl rule__Select__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Select__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__1"


    // $ANTLR start "rule__Select__Group__1__Impl"
    // InternalTableDSL.g:1531:1: rule__Select__Group__1__Impl : ( ( rule__Select__ColumnsPatternsAssignment_1 ) ) ;
    public final void rule__Select__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1535:1: ( ( ( rule__Select__ColumnsPatternsAssignment_1 ) ) )
            // InternalTableDSL.g:1536:1: ( ( rule__Select__ColumnsPatternsAssignment_1 ) )
            {
            // InternalTableDSL.g:1536:1: ( ( rule__Select__ColumnsPatternsAssignment_1 ) )
            // InternalTableDSL.g:1537:2: ( rule__Select__ColumnsPatternsAssignment_1 )
            {
             before(grammarAccess.getSelectAccess().getColumnsPatternsAssignment_1()); 
            // InternalTableDSL.g:1538:2: ( rule__Select__ColumnsPatternsAssignment_1 )
            // InternalTableDSL.g:1538:3: rule__Select__ColumnsPatternsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Select__ColumnsPatternsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getColumnsPatternsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__1__Impl"


    // $ANTLR start "rule__Select__Group__2"
    // InternalTableDSL.g:1546:1: rule__Select__Group__2 : rule__Select__Group__2__Impl ;
    public final void rule__Select__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1550:1: ( rule__Select__Group__2__Impl )
            // InternalTableDSL.g:1551:2: rule__Select__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__2"


    // $ANTLR start "rule__Select__Group__2__Impl"
    // InternalTableDSL.g:1557:1: rule__Select__Group__2__Impl : ( ( rule__Select__Group_2__0 )* ) ;
    public final void rule__Select__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1561:1: ( ( ( rule__Select__Group_2__0 )* ) )
            // InternalTableDSL.g:1562:1: ( ( rule__Select__Group_2__0 )* )
            {
            // InternalTableDSL.g:1562:1: ( ( rule__Select__Group_2__0 )* )
            // InternalTableDSL.g:1563:2: ( rule__Select__Group_2__0 )*
            {
             before(grammarAccess.getSelectAccess().getGroup_2()); 
            // InternalTableDSL.g:1564:2: ( rule__Select__Group_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTableDSL.g:1564:3: rule__Select__Group_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Select__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getSelectAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__2__Impl"


    // $ANTLR start "rule__Select__Group_2__0"
    // InternalTableDSL.g:1573:1: rule__Select__Group_2__0 : rule__Select__Group_2__0__Impl rule__Select__Group_2__1 ;
    public final void rule__Select__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1577:1: ( rule__Select__Group_2__0__Impl rule__Select__Group_2__1 )
            // InternalTableDSL.g:1578:2: rule__Select__Group_2__0__Impl rule__Select__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__Select__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_2__0"


    // $ANTLR start "rule__Select__Group_2__0__Impl"
    // InternalTableDSL.g:1585:1: rule__Select__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Select__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1589:1: ( ( ',' ) )
            // InternalTableDSL.g:1590:1: ( ',' )
            {
            // InternalTableDSL.g:1590:1: ( ',' )
            // InternalTableDSL.g:1591:2: ','
            {
             before(grammarAccess.getSelectAccess().getCommaKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_2__0__Impl"


    // $ANTLR start "rule__Select__Group_2__1"
    // InternalTableDSL.g:1600:1: rule__Select__Group_2__1 : rule__Select__Group_2__1__Impl ;
    public final void rule__Select__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1604:1: ( rule__Select__Group_2__1__Impl )
            // InternalTableDSL.g:1605:2: rule__Select__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_2__1"


    // $ANTLR start "rule__Select__Group_2__1__Impl"
    // InternalTableDSL.g:1611:1: rule__Select__Group_2__1__Impl : ( ( rule__Select__ColumnPatternsAssignment_2_1 ) ) ;
    public final void rule__Select__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1615:1: ( ( ( rule__Select__ColumnPatternsAssignment_2_1 ) ) )
            // InternalTableDSL.g:1616:1: ( ( rule__Select__ColumnPatternsAssignment_2_1 ) )
            {
            // InternalTableDSL.g:1616:1: ( ( rule__Select__ColumnPatternsAssignment_2_1 ) )
            // InternalTableDSL.g:1617:2: ( rule__Select__ColumnPatternsAssignment_2_1 )
            {
             before(grammarAccess.getSelectAccess().getColumnPatternsAssignment_2_1()); 
            // InternalTableDSL.g:1618:2: ( rule__Select__ColumnPatternsAssignment_2_1 )
            // InternalTableDSL.g:1618:3: rule__Select__ColumnPatternsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Select__ColumnPatternsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getColumnPatternsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_2__1__Impl"


    // $ANTLR start "rule__RenameColumn__Group__0"
    // InternalTableDSL.g:1627:1: rule__RenameColumn__Group__0 : rule__RenameColumn__Group__0__Impl rule__RenameColumn__Group__1 ;
    public final void rule__RenameColumn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1631:1: ( rule__RenameColumn__Group__0__Impl rule__RenameColumn__Group__1 )
            // InternalTableDSL.g:1632:2: rule__RenameColumn__Group__0__Impl rule__RenameColumn__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__RenameColumn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenameColumn__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumn__Group__0"


    // $ANTLR start "rule__RenameColumn__Group__0__Impl"
    // InternalTableDSL.g:1639:1: rule__RenameColumn__Group__0__Impl : ( 'rename' ) ;
    public final void rule__RenameColumn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1643:1: ( ( 'rename' ) )
            // InternalTableDSL.g:1644:1: ( 'rename' )
            {
            // InternalTableDSL.g:1644:1: ( 'rename' )
            // InternalTableDSL.g:1645:2: 'rename'
            {
             before(grammarAccess.getRenameColumnAccess().getRenameKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRenameColumnAccess().getRenameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumn__Group__0__Impl"


    // $ANTLR start "rule__RenameColumn__Group__1"
    // InternalTableDSL.g:1654:1: rule__RenameColumn__Group__1 : rule__RenameColumn__Group__1__Impl rule__RenameColumn__Group__2 ;
    public final void rule__RenameColumn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1658:1: ( rule__RenameColumn__Group__1__Impl rule__RenameColumn__Group__2 )
            // InternalTableDSL.g:1659:2: rule__RenameColumn__Group__1__Impl rule__RenameColumn__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__RenameColumn__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenameColumn__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumn__Group__1"


    // $ANTLR start "rule__RenameColumn__Group__1__Impl"
    // InternalTableDSL.g:1666:1: rule__RenameColumn__Group__1__Impl : ( ( 'column' )? ) ;
    public final void rule__RenameColumn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1670:1: ( ( ( 'column' )? ) )
            // InternalTableDSL.g:1671:1: ( ( 'column' )? )
            {
            // InternalTableDSL.g:1671:1: ( ( 'column' )? )
            // InternalTableDSL.g:1672:2: ( 'column' )?
            {
             before(grammarAccess.getRenameColumnAccess().getColumnKeyword_1()); 
            // InternalTableDSL.g:1673:2: ( 'column' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==13) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTableDSL.g:1673:3: 'column'
                    {
                    match(input,13,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getRenameColumnAccess().getColumnKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumn__Group__1__Impl"


    // $ANTLR start "rule__RenameColumn__Group__2"
    // InternalTableDSL.g:1681:1: rule__RenameColumn__Group__2 : rule__RenameColumn__Group__2__Impl ;
    public final void rule__RenameColumn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1685:1: ( rule__RenameColumn__Group__2__Impl )
            // InternalTableDSL.g:1686:2: rule__RenameColumn__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RenameColumn__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumn__Group__2"


    // $ANTLR start "rule__RenameColumn__Group__2__Impl"
    // InternalTableDSL.g:1692:1: rule__RenameColumn__Group__2__Impl : ( ( ( rule__RenameColumn__RenameTuplesAssignment_2 ) ) ( ( rule__RenameColumn__RenameTuplesAssignment_2 )* ) ) ;
    public final void rule__RenameColumn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1696:1: ( ( ( ( rule__RenameColumn__RenameTuplesAssignment_2 ) ) ( ( rule__RenameColumn__RenameTuplesAssignment_2 )* ) ) )
            // InternalTableDSL.g:1697:1: ( ( ( rule__RenameColumn__RenameTuplesAssignment_2 ) ) ( ( rule__RenameColumn__RenameTuplesAssignment_2 )* ) )
            {
            // InternalTableDSL.g:1697:1: ( ( ( rule__RenameColumn__RenameTuplesAssignment_2 ) ) ( ( rule__RenameColumn__RenameTuplesAssignment_2 )* ) )
            // InternalTableDSL.g:1698:2: ( ( rule__RenameColumn__RenameTuplesAssignment_2 ) ) ( ( rule__RenameColumn__RenameTuplesAssignment_2 )* )
            {
            // InternalTableDSL.g:1698:2: ( ( rule__RenameColumn__RenameTuplesAssignment_2 ) )
            // InternalTableDSL.g:1699:3: ( rule__RenameColumn__RenameTuplesAssignment_2 )
            {
             before(grammarAccess.getRenameColumnAccess().getRenameTuplesAssignment_2()); 
            // InternalTableDSL.g:1700:3: ( rule__RenameColumn__RenameTuplesAssignment_2 )
            // InternalTableDSL.g:1700:4: rule__RenameColumn__RenameTuplesAssignment_2
            {
            pushFollow(FOLLOW_14);
            rule__RenameColumn__RenameTuplesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRenameColumnAccess().getRenameTuplesAssignment_2()); 

            }

            // InternalTableDSL.g:1703:2: ( ( rule__RenameColumn__RenameTuplesAssignment_2 )* )
            // InternalTableDSL.g:1704:3: ( rule__RenameColumn__RenameTuplesAssignment_2 )*
            {
             before(grammarAccess.getRenameColumnAccess().getRenameTuplesAssignment_2()); 
            // InternalTableDSL.g:1705:3: ( rule__RenameColumn__RenameTuplesAssignment_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_STRING) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalTableDSL.g:1705:4: rule__RenameColumn__RenameTuplesAssignment_2
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__RenameColumn__RenameTuplesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getRenameColumnAccess().getRenameTuplesAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumn__Group__2__Impl"


    // $ANTLR start "rule__RenameColumnToPair__Group__0"
    // InternalTableDSL.g:1715:1: rule__RenameColumnToPair__Group__0 : rule__RenameColumnToPair__Group__0__Impl rule__RenameColumnToPair__Group__1 ;
    public final void rule__RenameColumnToPair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1719:1: ( rule__RenameColumnToPair__Group__0__Impl rule__RenameColumnToPair__Group__1 )
            // InternalTableDSL.g:1720:2: rule__RenameColumnToPair__Group__0__Impl rule__RenameColumnToPair__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__RenameColumnToPair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenameColumnToPair__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnToPair__Group__0"


    // $ANTLR start "rule__RenameColumnToPair__Group__0__Impl"
    // InternalTableDSL.g:1727:1: rule__RenameColumnToPair__Group__0__Impl : ( ( rule__RenameColumnToPair__OldNameAssignment_0 ) ) ;
    public final void rule__RenameColumnToPair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1731:1: ( ( ( rule__RenameColumnToPair__OldNameAssignment_0 ) ) )
            // InternalTableDSL.g:1732:1: ( ( rule__RenameColumnToPair__OldNameAssignment_0 ) )
            {
            // InternalTableDSL.g:1732:1: ( ( rule__RenameColumnToPair__OldNameAssignment_0 ) )
            // InternalTableDSL.g:1733:2: ( rule__RenameColumnToPair__OldNameAssignment_0 )
            {
             before(grammarAccess.getRenameColumnToPairAccess().getOldNameAssignment_0()); 
            // InternalTableDSL.g:1734:2: ( rule__RenameColumnToPair__OldNameAssignment_0 )
            // InternalTableDSL.g:1734:3: rule__RenameColumnToPair__OldNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RenameColumnToPair__OldNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRenameColumnToPairAccess().getOldNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnToPair__Group__0__Impl"


    // $ANTLR start "rule__RenameColumnToPair__Group__1"
    // InternalTableDSL.g:1742:1: rule__RenameColumnToPair__Group__1 : rule__RenameColumnToPair__Group__1__Impl rule__RenameColumnToPair__Group__2 ;
    public final void rule__RenameColumnToPair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1746:1: ( rule__RenameColumnToPair__Group__1__Impl rule__RenameColumnToPair__Group__2 )
            // InternalTableDSL.g:1747:2: rule__RenameColumnToPair__Group__1__Impl rule__RenameColumnToPair__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__RenameColumnToPair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenameColumnToPair__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnToPair__Group__1"


    // $ANTLR start "rule__RenameColumnToPair__Group__1__Impl"
    // InternalTableDSL.g:1754:1: rule__RenameColumnToPair__Group__1__Impl : ( 'to' ) ;
    public final void rule__RenameColumnToPair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1758:1: ( ( 'to' ) )
            // InternalTableDSL.g:1759:1: ( 'to' )
            {
            // InternalTableDSL.g:1759:1: ( 'to' )
            // InternalTableDSL.g:1760:2: 'to'
            {
             before(grammarAccess.getRenameColumnToPairAccess().getToKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRenameColumnToPairAccess().getToKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnToPair__Group__1__Impl"


    // $ANTLR start "rule__RenameColumnToPair__Group__2"
    // InternalTableDSL.g:1769:1: rule__RenameColumnToPair__Group__2 : rule__RenameColumnToPair__Group__2__Impl ;
    public final void rule__RenameColumnToPair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1773:1: ( rule__RenameColumnToPair__Group__2__Impl )
            // InternalTableDSL.g:1774:2: rule__RenameColumnToPair__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RenameColumnToPair__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnToPair__Group__2"


    // $ANTLR start "rule__RenameColumnToPair__Group__2__Impl"
    // InternalTableDSL.g:1780:1: rule__RenameColumnToPair__Group__2__Impl : ( ( rule__RenameColumnToPair__NewNameAssignment_2 ) ) ;
    public final void rule__RenameColumnToPair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1784:1: ( ( ( rule__RenameColumnToPair__NewNameAssignment_2 ) ) )
            // InternalTableDSL.g:1785:1: ( ( rule__RenameColumnToPair__NewNameAssignment_2 ) )
            {
            // InternalTableDSL.g:1785:1: ( ( rule__RenameColumnToPair__NewNameAssignment_2 ) )
            // InternalTableDSL.g:1786:2: ( rule__RenameColumnToPair__NewNameAssignment_2 )
            {
             before(grammarAccess.getRenameColumnToPairAccess().getNewNameAssignment_2()); 
            // InternalTableDSL.g:1787:2: ( rule__RenameColumnToPair__NewNameAssignment_2 )
            // InternalTableDSL.g:1787:3: rule__RenameColumnToPair__NewNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RenameColumnToPair__NewNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRenameColumnToPairAccess().getNewNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnToPair__Group__2__Impl"


    // $ANTLR start "rule__RenameColumnPrependPair__Group__0"
    // InternalTableDSL.g:1796:1: rule__RenameColumnPrependPair__Group__0 : rule__RenameColumnPrependPair__Group__0__Impl rule__RenameColumnPrependPair__Group__1 ;
    public final void rule__RenameColumnPrependPair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1800:1: ( rule__RenameColumnPrependPair__Group__0__Impl rule__RenameColumnPrependPair__Group__1 )
            // InternalTableDSL.g:1801:2: rule__RenameColumnPrependPair__Group__0__Impl rule__RenameColumnPrependPair__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__RenameColumnPrependPair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenameColumnPrependPair__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnPrependPair__Group__0"


    // $ANTLR start "rule__RenameColumnPrependPair__Group__0__Impl"
    // InternalTableDSL.g:1808:1: rule__RenameColumnPrependPair__Group__0__Impl : ( ( rule__RenameColumnPrependPair__OldNameAssignment_0 ) ) ;
    public final void rule__RenameColumnPrependPair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1812:1: ( ( ( rule__RenameColumnPrependPair__OldNameAssignment_0 ) ) )
            // InternalTableDSL.g:1813:1: ( ( rule__RenameColumnPrependPair__OldNameAssignment_0 ) )
            {
            // InternalTableDSL.g:1813:1: ( ( rule__RenameColumnPrependPair__OldNameAssignment_0 ) )
            // InternalTableDSL.g:1814:2: ( rule__RenameColumnPrependPair__OldNameAssignment_0 )
            {
             before(grammarAccess.getRenameColumnPrependPairAccess().getOldNameAssignment_0()); 
            // InternalTableDSL.g:1815:2: ( rule__RenameColumnPrependPair__OldNameAssignment_0 )
            // InternalTableDSL.g:1815:3: rule__RenameColumnPrependPair__OldNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RenameColumnPrependPair__OldNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRenameColumnPrependPairAccess().getOldNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnPrependPair__Group__0__Impl"


    // $ANTLR start "rule__RenameColumnPrependPair__Group__1"
    // InternalTableDSL.g:1823:1: rule__RenameColumnPrependPair__Group__1 : rule__RenameColumnPrependPair__Group__1__Impl rule__RenameColumnPrependPair__Group__2 ;
    public final void rule__RenameColumnPrependPair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1827:1: ( rule__RenameColumnPrependPair__Group__1__Impl rule__RenameColumnPrependPair__Group__2 )
            // InternalTableDSL.g:1828:2: rule__RenameColumnPrependPair__Group__1__Impl rule__RenameColumnPrependPair__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__RenameColumnPrependPair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenameColumnPrependPair__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnPrependPair__Group__1"


    // $ANTLR start "rule__RenameColumnPrependPair__Group__1__Impl"
    // InternalTableDSL.g:1835:1: rule__RenameColumnPrependPair__Group__1__Impl : ( 'prepend' ) ;
    public final void rule__RenameColumnPrependPair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1839:1: ( ( 'prepend' ) )
            // InternalTableDSL.g:1840:1: ( 'prepend' )
            {
            // InternalTableDSL.g:1840:1: ( 'prepend' )
            // InternalTableDSL.g:1841:2: 'prepend'
            {
             before(grammarAccess.getRenameColumnPrependPairAccess().getPrependKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRenameColumnPrependPairAccess().getPrependKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnPrependPair__Group__1__Impl"


    // $ANTLR start "rule__RenameColumnPrependPair__Group__2"
    // InternalTableDSL.g:1850:1: rule__RenameColumnPrependPair__Group__2 : rule__RenameColumnPrependPair__Group__2__Impl ;
    public final void rule__RenameColumnPrependPair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1854:1: ( rule__RenameColumnPrependPair__Group__2__Impl )
            // InternalTableDSL.g:1855:2: rule__RenameColumnPrependPair__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RenameColumnPrependPair__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnPrependPair__Group__2"


    // $ANTLR start "rule__RenameColumnPrependPair__Group__2__Impl"
    // InternalTableDSL.g:1861:1: rule__RenameColumnPrependPair__Group__2__Impl : ( ( rule__RenameColumnPrependPair__PrefixAssignment_2 ) ) ;
    public final void rule__RenameColumnPrependPair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1865:1: ( ( ( rule__RenameColumnPrependPair__PrefixAssignment_2 ) ) )
            // InternalTableDSL.g:1866:1: ( ( rule__RenameColumnPrependPair__PrefixAssignment_2 ) )
            {
            // InternalTableDSL.g:1866:1: ( ( rule__RenameColumnPrependPair__PrefixAssignment_2 ) )
            // InternalTableDSL.g:1867:2: ( rule__RenameColumnPrependPair__PrefixAssignment_2 )
            {
             before(grammarAccess.getRenameColumnPrependPairAccess().getPrefixAssignment_2()); 
            // InternalTableDSL.g:1868:2: ( rule__RenameColumnPrependPair__PrefixAssignment_2 )
            // InternalTableDSL.g:1868:3: rule__RenameColumnPrependPair__PrefixAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RenameColumnPrependPair__PrefixAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRenameColumnPrependPairAccess().getPrefixAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnPrependPair__Group__2__Impl"


    // $ANTLR start "rule__RenameColumnAppendPair__Group__0"
    // InternalTableDSL.g:1877:1: rule__RenameColumnAppendPair__Group__0 : rule__RenameColumnAppendPair__Group__0__Impl rule__RenameColumnAppendPair__Group__1 ;
    public final void rule__RenameColumnAppendPair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1881:1: ( rule__RenameColumnAppendPair__Group__0__Impl rule__RenameColumnAppendPair__Group__1 )
            // InternalTableDSL.g:1882:2: rule__RenameColumnAppendPair__Group__0__Impl rule__RenameColumnAppendPair__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__RenameColumnAppendPair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenameColumnAppendPair__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnAppendPair__Group__0"


    // $ANTLR start "rule__RenameColumnAppendPair__Group__0__Impl"
    // InternalTableDSL.g:1889:1: rule__RenameColumnAppendPair__Group__0__Impl : ( ( rule__RenameColumnAppendPair__OldNameAssignment_0 ) ) ;
    public final void rule__RenameColumnAppendPair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1893:1: ( ( ( rule__RenameColumnAppendPair__OldNameAssignment_0 ) ) )
            // InternalTableDSL.g:1894:1: ( ( rule__RenameColumnAppendPair__OldNameAssignment_0 ) )
            {
            // InternalTableDSL.g:1894:1: ( ( rule__RenameColumnAppendPair__OldNameAssignment_0 ) )
            // InternalTableDSL.g:1895:2: ( rule__RenameColumnAppendPair__OldNameAssignment_0 )
            {
             before(grammarAccess.getRenameColumnAppendPairAccess().getOldNameAssignment_0()); 
            // InternalTableDSL.g:1896:2: ( rule__RenameColumnAppendPair__OldNameAssignment_0 )
            // InternalTableDSL.g:1896:3: rule__RenameColumnAppendPair__OldNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RenameColumnAppendPair__OldNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRenameColumnAppendPairAccess().getOldNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnAppendPair__Group__0__Impl"


    // $ANTLR start "rule__RenameColumnAppendPair__Group__1"
    // InternalTableDSL.g:1904:1: rule__RenameColumnAppendPair__Group__1 : rule__RenameColumnAppendPair__Group__1__Impl rule__RenameColumnAppendPair__Group__2 ;
    public final void rule__RenameColumnAppendPair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1908:1: ( rule__RenameColumnAppendPair__Group__1__Impl rule__RenameColumnAppendPair__Group__2 )
            // InternalTableDSL.g:1909:2: rule__RenameColumnAppendPair__Group__1__Impl rule__RenameColumnAppendPair__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__RenameColumnAppendPair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenameColumnAppendPair__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnAppendPair__Group__1"


    // $ANTLR start "rule__RenameColumnAppendPair__Group__1__Impl"
    // InternalTableDSL.g:1916:1: rule__RenameColumnAppendPair__Group__1__Impl : ( 'append' ) ;
    public final void rule__RenameColumnAppendPair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1920:1: ( ( 'append' ) )
            // InternalTableDSL.g:1921:1: ( 'append' )
            {
            // InternalTableDSL.g:1921:1: ( 'append' )
            // InternalTableDSL.g:1922:2: 'append'
            {
             before(grammarAccess.getRenameColumnAppendPairAccess().getAppendKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRenameColumnAppendPairAccess().getAppendKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnAppendPair__Group__1__Impl"


    // $ANTLR start "rule__RenameColumnAppendPair__Group__2"
    // InternalTableDSL.g:1931:1: rule__RenameColumnAppendPair__Group__2 : rule__RenameColumnAppendPair__Group__2__Impl ;
    public final void rule__RenameColumnAppendPair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1935:1: ( rule__RenameColumnAppendPair__Group__2__Impl )
            // InternalTableDSL.g:1936:2: rule__RenameColumnAppendPair__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RenameColumnAppendPair__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnAppendPair__Group__2"


    // $ANTLR start "rule__RenameColumnAppendPair__Group__2__Impl"
    // InternalTableDSL.g:1942:1: rule__RenameColumnAppendPair__Group__2__Impl : ( ( rule__RenameColumnAppendPair__SuffixAssignment_2 ) ) ;
    public final void rule__RenameColumnAppendPair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1946:1: ( ( ( rule__RenameColumnAppendPair__SuffixAssignment_2 ) ) )
            // InternalTableDSL.g:1947:1: ( ( rule__RenameColumnAppendPair__SuffixAssignment_2 ) )
            {
            // InternalTableDSL.g:1947:1: ( ( rule__RenameColumnAppendPair__SuffixAssignment_2 ) )
            // InternalTableDSL.g:1948:2: ( rule__RenameColumnAppendPair__SuffixAssignment_2 )
            {
             before(grammarAccess.getRenameColumnAppendPairAccess().getSuffixAssignment_2()); 
            // InternalTableDSL.g:1949:2: ( rule__RenameColumnAppendPair__SuffixAssignment_2 )
            // InternalTableDSL.g:1949:3: rule__RenameColumnAppendPair__SuffixAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RenameColumnAppendPair__SuffixAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRenameColumnAppendPairAccess().getSuffixAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnAppendPair__Group__2__Impl"


    // $ANTLR start "rule__Extract__Group__0"
    // InternalTableDSL.g:1958:1: rule__Extract__Group__0 : rule__Extract__Group__0__Impl rule__Extract__Group__1 ;
    public final void rule__Extract__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1962:1: ( rule__Extract__Group__0__Impl rule__Extract__Group__1 )
            // InternalTableDSL.g:1963:2: rule__Extract__Group__0__Impl rule__Extract__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Extract__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extract__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group__0"


    // $ANTLR start "rule__Extract__Group__0__Impl"
    // InternalTableDSL.g:1970:1: rule__Extract__Group__0__Impl : ( 'extract' ) ;
    public final void rule__Extract__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1974:1: ( ( 'extract' ) )
            // InternalTableDSL.g:1975:1: ( 'extract' )
            {
            // InternalTableDSL.g:1975:1: ( 'extract' )
            // InternalTableDSL.g:1976:2: 'extract'
            {
             before(grammarAccess.getExtractAccess().getExtractKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getExtractAccess().getExtractKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group__0__Impl"


    // $ANTLR start "rule__Extract__Group__1"
    // InternalTableDSL.g:1985:1: rule__Extract__Group__1 : rule__Extract__Group__1__Impl rule__Extract__Group__2 ;
    public final void rule__Extract__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1989:1: ( rule__Extract__Group__1__Impl rule__Extract__Group__2 )
            // InternalTableDSL.g:1990:2: rule__Extract__Group__1__Impl rule__Extract__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Extract__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extract__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group__1"


    // $ANTLR start "rule__Extract__Group__1__Impl"
    // InternalTableDSL.g:1997:1: rule__Extract__Group__1__Impl : ( ( rule__Extract__TargetsAssignment_1 ) ) ;
    public final void rule__Extract__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2001:1: ( ( ( rule__Extract__TargetsAssignment_1 ) ) )
            // InternalTableDSL.g:2002:1: ( ( rule__Extract__TargetsAssignment_1 ) )
            {
            // InternalTableDSL.g:2002:1: ( ( rule__Extract__TargetsAssignment_1 ) )
            // InternalTableDSL.g:2003:2: ( rule__Extract__TargetsAssignment_1 )
            {
             before(grammarAccess.getExtractAccess().getTargetsAssignment_1()); 
            // InternalTableDSL.g:2004:2: ( rule__Extract__TargetsAssignment_1 )
            // InternalTableDSL.g:2004:3: rule__Extract__TargetsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Extract__TargetsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExtractAccess().getTargetsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group__1__Impl"


    // $ANTLR start "rule__Extract__Group__2"
    // InternalTableDSL.g:2012:1: rule__Extract__Group__2 : rule__Extract__Group__2__Impl rule__Extract__Group__3 ;
    public final void rule__Extract__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2016:1: ( rule__Extract__Group__2__Impl rule__Extract__Group__3 )
            // InternalTableDSL.g:2017:2: rule__Extract__Group__2__Impl rule__Extract__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Extract__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extract__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group__2"


    // $ANTLR start "rule__Extract__Group__2__Impl"
    // InternalTableDSL.g:2024:1: rule__Extract__Group__2__Impl : ( ( rule__Extract__Group_2__0 )* ) ;
    public final void rule__Extract__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2028:1: ( ( ( rule__Extract__Group_2__0 )* ) )
            // InternalTableDSL.g:2029:1: ( ( rule__Extract__Group_2__0 )* )
            {
            // InternalTableDSL.g:2029:1: ( ( rule__Extract__Group_2__0 )* )
            // InternalTableDSL.g:2030:2: ( rule__Extract__Group_2__0 )*
            {
             before(grammarAccess.getExtractAccess().getGroup_2()); 
            // InternalTableDSL.g:2031:2: ( rule__Extract__Group_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==21) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTableDSL.g:2031:3: rule__Extract__Group_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Extract__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getExtractAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group__2__Impl"


    // $ANTLR start "rule__Extract__Group__3"
    // InternalTableDSL.g:2039:1: rule__Extract__Group__3 : rule__Extract__Group__3__Impl rule__Extract__Group__4 ;
    public final void rule__Extract__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2043:1: ( rule__Extract__Group__3__Impl rule__Extract__Group__4 )
            // InternalTableDSL.g:2044:2: rule__Extract__Group__3__Impl rule__Extract__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Extract__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extract__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group__3"


    // $ANTLR start "rule__Extract__Group__3__Impl"
    // InternalTableDSL.g:2051:1: rule__Extract__Group__3__Impl : ( 'from' ) ;
    public final void rule__Extract__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2055:1: ( ( 'from' ) )
            // InternalTableDSL.g:2056:1: ( 'from' )
            {
            // InternalTableDSL.g:2056:1: ( 'from' )
            // InternalTableDSL.g:2057:2: 'from'
            {
             before(grammarAccess.getExtractAccess().getFromKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getExtractAccess().getFromKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group__3__Impl"


    // $ANTLR start "rule__Extract__Group__4"
    // InternalTableDSL.g:2066:1: rule__Extract__Group__4 : rule__Extract__Group__4__Impl rule__Extract__Group__5 ;
    public final void rule__Extract__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2070:1: ( rule__Extract__Group__4__Impl rule__Extract__Group__5 )
            // InternalTableDSL.g:2071:2: rule__Extract__Group__4__Impl rule__Extract__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Extract__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extract__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group__4"


    // $ANTLR start "rule__Extract__Group__4__Impl"
    // InternalTableDSL.g:2078:1: rule__Extract__Group__4__Impl : ( ( rule__Extract__SourceColumnAssignment_4 ) ) ;
    public final void rule__Extract__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2082:1: ( ( ( rule__Extract__SourceColumnAssignment_4 ) ) )
            // InternalTableDSL.g:2083:1: ( ( rule__Extract__SourceColumnAssignment_4 ) )
            {
            // InternalTableDSL.g:2083:1: ( ( rule__Extract__SourceColumnAssignment_4 ) )
            // InternalTableDSL.g:2084:2: ( rule__Extract__SourceColumnAssignment_4 )
            {
             before(grammarAccess.getExtractAccess().getSourceColumnAssignment_4()); 
            // InternalTableDSL.g:2085:2: ( rule__Extract__SourceColumnAssignment_4 )
            // InternalTableDSL.g:2085:3: rule__Extract__SourceColumnAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Extract__SourceColumnAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getExtractAccess().getSourceColumnAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group__4__Impl"


    // $ANTLR start "rule__Extract__Group__5"
    // InternalTableDSL.g:2093:1: rule__Extract__Group__5 : rule__Extract__Group__5__Impl rule__Extract__Group__6 ;
    public final void rule__Extract__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2097:1: ( rule__Extract__Group__5__Impl rule__Extract__Group__6 )
            // InternalTableDSL.g:2098:2: rule__Extract__Group__5__Impl rule__Extract__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__Extract__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extract__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group__5"


    // $ANTLR start "rule__Extract__Group__5__Impl"
    // InternalTableDSL.g:2105:1: rule__Extract__Group__5__Impl : ( 'select' ) ;
    public final void rule__Extract__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2109:1: ( ( 'select' ) )
            // InternalTableDSL.g:2110:1: ( 'select' )
            {
            // InternalTableDSL.g:2110:1: ( 'select' )
            // InternalTableDSL.g:2111:2: 'select'
            {
             before(grammarAccess.getExtractAccess().getSelectKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getExtractAccess().getSelectKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group__5__Impl"


    // $ANTLR start "rule__Extract__Group__6"
    // InternalTableDSL.g:2120:1: rule__Extract__Group__6 : rule__Extract__Group__6__Impl rule__Extract__Group__7 ;
    public final void rule__Extract__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2124:1: ( rule__Extract__Group__6__Impl rule__Extract__Group__7 )
            // InternalTableDSL.g:2125:2: rule__Extract__Group__6__Impl rule__Extract__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__Extract__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extract__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group__6"


    // $ANTLR start "rule__Extract__Group__6__Impl"
    // InternalTableDSL.g:2132:1: rule__Extract__Group__6__Impl : ( ( rule__Extract__SelectorAssignment_6 ) ) ;
    public final void rule__Extract__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2136:1: ( ( ( rule__Extract__SelectorAssignment_6 ) ) )
            // InternalTableDSL.g:2137:1: ( ( rule__Extract__SelectorAssignment_6 ) )
            {
            // InternalTableDSL.g:2137:1: ( ( rule__Extract__SelectorAssignment_6 ) )
            // InternalTableDSL.g:2138:2: ( rule__Extract__SelectorAssignment_6 )
            {
             before(grammarAccess.getExtractAccess().getSelectorAssignment_6()); 
            // InternalTableDSL.g:2139:2: ( rule__Extract__SelectorAssignment_6 )
            // InternalTableDSL.g:2139:3: rule__Extract__SelectorAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Extract__SelectorAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getExtractAccess().getSelectorAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group__6__Impl"


    // $ANTLR start "rule__Extract__Group__7"
    // InternalTableDSL.g:2147:1: rule__Extract__Group__7 : rule__Extract__Group__7__Impl rule__Extract__Group__8 ;
    public final void rule__Extract__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2151:1: ( rule__Extract__Group__7__Impl rule__Extract__Group__8 )
            // InternalTableDSL.g:2152:2: rule__Extract__Group__7__Impl rule__Extract__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__Extract__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extract__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group__7"


    // $ANTLR start "rule__Extract__Group__7__Impl"
    // InternalTableDSL.g:2159:1: rule__Extract__Group__7__Impl : ( 'sort' ) ;
    public final void rule__Extract__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2163:1: ( ( 'sort' ) )
            // InternalTableDSL.g:2164:1: ( 'sort' )
            {
            // InternalTableDSL.g:2164:1: ( 'sort' )
            // InternalTableDSL.g:2165:2: 'sort'
            {
             before(grammarAccess.getExtractAccess().getSortKeyword_7()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getExtractAccess().getSortKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group__7__Impl"


    // $ANTLR start "rule__Extract__Group__8"
    // InternalTableDSL.g:2174:1: rule__Extract__Group__8 : rule__Extract__Group__8__Impl rule__Extract__Group__9 ;
    public final void rule__Extract__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2178:1: ( rule__Extract__Group__8__Impl rule__Extract__Group__9 )
            // InternalTableDSL.g:2179:2: rule__Extract__Group__8__Impl rule__Extract__Group__9
            {
            pushFollow(FOLLOW_21);
            rule__Extract__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extract__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group__8"


    // $ANTLR start "rule__Extract__Group__8__Impl"
    // InternalTableDSL.g:2186:1: rule__Extract__Group__8__Impl : ( ( 'by' )? ) ;
    public final void rule__Extract__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2190:1: ( ( ( 'by' )? ) )
            // InternalTableDSL.g:2191:1: ( ( 'by' )? )
            {
            // InternalTableDSL.g:2191:1: ( ( 'by' )? )
            // InternalTableDSL.g:2192:2: ( 'by' )?
            {
             before(grammarAccess.getExtractAccess().getByKeyword_8()); 
            // InternalTableDSL.g:2193:2: ( 'by' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalTableDSL.g:2193:3: 'by'
                    {
                    match(input,30,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getExtractAccess().getByKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group__8__Impl"


    // $ANTLR start "rule__Extract__Group__9"
    // InternalTableDSL.g:2201:1: rule__Extract__Group__9 : rule__Extract__Group__9__Impl ;
    public final void rule__Extract__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2205:1: ( rule__Extract__Group__9__Impl )
            // InternalTableDSL.g:2206:2: rule__Extract__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Extract__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group__9"


    // $ANTLR start "rule__Extract__Group__9__Impl"
    // InternalTableDSL.g:2212:1: rule__Extract__Group__9__Impl : ( ( rule__Extract__ComparatorAssignment_9 ) ) ;
    public final void rule__Extract__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2216:1: ( ( ( rule__Extract__ComparatorAssignment_9 ) ) )
            // InternalTableDSL.g:2217:1: ( ( rule__Extract__ComparatorAssignment_9 ) )
            {
            // InternalTableDSL.g:2217:1: ( ( rule__Extract__ComparatorAssignment_9 ) )
            // InternalTableDSL.g:2218:2: ( rule__Extract__ComparatorAssignment_9 )
            {
             before(grammarAccess.getExtractAccess().getComparatorAssignment_9()); 
            // InternalTableDSL.g:2219:2: ( rule__Extract__ComparatorAssignment_9 )
            // InternalTableDSL.g:2219:3: rule__Extract__ComparatorAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Extract__ComparatorAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getExtractAccess().getComparatorAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group__9__Impl"


    // $ANTLR start "rule__Extract__Group_2__0"
    // InternalTableDSL.g:2228:1: rule__Extract__Group_2__0 : rule__Extract__Group_2__0__Impl rule__Extract__Group_2__1 ;
    public final void rule__Extract__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2232:1: ( rule__Extract__Group_2__0__Impl rule__Extract__Group_2__1 )
            // InternalTableDSL.g:2233:2: rule__Extract__Group_2__0__Impl rule__Extract__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__Extract__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extract__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group_2__0"


    // $ANTLR start "rule__Extract__Group_2__0__Impl"
    // InternalTableDSL.g:2240:1: rule__Extract__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Extract__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2244:1: ( ( ',' ) )
            // InternalTableDSL.g:2245:1: ( ',' )
            {
            // InternalTableDSL.g:2245:1: ( ',' )
            // InternalTableDSL.g:2246:2: ','
            {
             before(grammarAccess.getExtractAccess().getCommaKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getExtractAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group_2__0__Impl"


    // $ANTLR start "rule__Extract__Group_2__1"
    // InternalTableDSL.g:2255:1: rule__Extract__Group_2__1 : rule__Extract__Group_2__1__Impl ;
    public final void rule__Extract__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2259:1: ( rule__Extract__Group_2__1__Impl )
            // InternalTableDSL.g:2260:2: rule__Extract__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Extract__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group_2__1"


    // $ANTLR start "rule__Extract__Group_2__1__Impl"
    // InternalTableDSL.g:2266:1: rule__Extract__Group_2__1__Impl : ( ( rule__Extract__TargetsAssignment_2_1 ) ) ;
    public final void rule__Extract__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2270:1: ( ( ( rule__Extract__TargetsAssignment_2_1 ) ) )
            // InternalTableDSL.g:2271:1: ( ( rule__Extract__TargetsAssignment_2_1 ) )
            {
            // InternalTableDSL.g:2271:1: ( ( rule__Extract__TargetsAssignment_2_1 ) )
            // InternalTableDSL.g:2272:2: ( rule__Extract__TargetsAssignment_2_1 )
            {
             before(grammarAccess.getExtractAccess().getTargetsAssignment_2_1()); 
            // InternalTableDSL.g:2273:2: ( rule__Extract__TargetsAssignment_2_1 )
            // InternalTableDSL.g:2273:3: rule__Extract__TargetsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Extract__TargetsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getExtractAccess().getTargetsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__Group_2__1__Impl"


    // $ANTLR start "rule__ExtractColumnMapping__Group__0"
    // InternalTableDSL.g:2282:1: rule__ExtractColumnMapping__Group__0 : rule__ExtractColumnMapping__Group__0__Impl rule__ExtractColumnMapping__Group__1 ;
    public final void rule__ExtractColumnMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2286:1: ( rule__ExtractColumnMapping__Group__0__Impl rule__ExtractColumnMapping__Group__1 )
            // InternalTableDSL.g:2287:2: rule__ExtractColumnMapping__Group__0__Impl rule__ExtractColumnMapping__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__ExtractColumnMapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtractColumnMapping__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractColumnMapping__Group__0"


    // $ANTLR start "rule__ExtractColumnMapping__Group__0__Impl"
    // InternalTableDSL.g:2294:1: rule__ExtractColumnMapping__Group__0__Impl : ( ( rule__ExtractColumnMapping__TargetColumnAssignment_0 ) ) ;
    public final void rule__ExtractColumnMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2298:1: ( ( ( rule__ExtractColumnMapping__TargetColumnAssignment_0 ) ) )
            // InternalTableDSL.g:2299:1: ( ( rule__ExtractColumnMapping__TargetColumnAssignment_0 ) )
            {
            // InternalTableDSL.g:2299:1: ( ( rule__ExtractColumnMapping__TargetColumnAssignment_0 ) )
            // InternalTableDSL.g:2300:2: ( rule__ExtractColumnMapping__TargetColumnAssignment_0 )
            {
             before(grammarAccess.getExtractColumnMappingAccess().getTargetColumnAssignment_0()); 
            // InternalTableDSL.g:2301:2: ( rule__ExtractColumnMapping__TargetColumnAssignment_0 )
            // InternalTableDSL.g:2301:3: rule__ExtractColumnMapping__TargetColumnAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ExtractColumnMapping__TargetColumnAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExtractColumnMappingAccess().getTargetColumnAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractColumnMapping__Group__0__Impl"


    // $ANTLR start "rule__ExtractColumnMapping__Group__1"
    // InternalTableDSL.g:2309:1: rule__ExtractColumnMapping__Group__1 : rule__ExtractColumnMapping__Group__1__Impl ;
    public final void rule__ExtractColumnMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2313:1: ( rule__ExtractColumnMapping__Group__1__Impl )
            // InternalTableDSL.g:2314:2: rule__ExtractColumnMapping__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExtractColumnMapping__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractColumnMapping__Group__1"


    // $ANTLR start "rule__ExtractColumnMapping__Group__1__Impl"
    // InternalTableDSL.g:2320:1: rule__ExtractColumnMapping__Group__1__Impl : ( ( rule__ExtractColumnMapping__Group_1__0 )? ) ;
    public final void rule__ExtractColumnMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2324:1: ( ( ( rule__ExtractColumnMapping__Group_1__0 )? ) )
            // InternalTableDSL.g:2325:1: ( ( rule__ExtractColumnMapping__Group_1__0 )? )
            {
            // InternalTableDSL.g:2325:1: ( ( rule__ExtractColumnMapping__Group_1__0 )? )
            // InternalTableDSL.g:2326:2: ( rule__ExtractColumnMapping__Group_1__0 )?
            {
             before(grammarAccess.getExtractColumnMappingAccess().getGroup_1()); 
            // InternalTableDSL.g:2327:2: ( rule__ExtractColumnMapping__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalTableDSL.g:2327:3: rule__ExtractColumnMapping__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExtractColumnMapping__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExtractColumnMappingAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractColumnMapping__Group__1__Impl"


    // $ANTLR start "rule__ExtractColumnMapping__Group_1__0"
    // InternalTableDSL.g:2336:1: rule__ExtractColumnMapping__Group_1__0 : rule__ExtractColumnMapping__Group_1__0__Impl rule__ExtractColumnMapping__Group_1__1 ;
    public final void rule__ExtractColumnMapping__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2340:1: ( rule__ExtractColumnMapping__Group_1__0__Impl rule__ExtractColumnMapping__Group_1__1 )
            // InternalTableDSL.g:2341:2: rule__ExtractColumnMapping__Group_1__0__Impl rule__ExtractColumnMapping__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__ExtractColumnMapping__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtractColumnMapping__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractColumnMapping__Group_1__0"


    // $ANTLR start "rule__ExtractColumnMapping__Group_1__0__Impl"
    // InternalTableDSL.g:2348:1: rule__ExtractColumnMapping__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__ExtractColumnMapping__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2352:1: ( ( 'as' ) )
            // InternalTableDSL.g:2353:1: ( 'as' )
            {
            // InternalTableDSL.g:2353:1: ( 'as' )
            // InternalTableDSL.g:2354:2: 'as'
            {
             before(grammarAccess.getExtractColumnMappingAccess().getAsKeyword_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getExtractColumnMappingAccess().getAsKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractColumnMapping__Group_1__0__Impl"


    // $ANTLR start "rule__ExtractColumnMapping__Group_1__1"
    // InternalTableDSL.g:2363:1: rule__ExtractColumnMapping__Group_1__1 : rule__ExtractColumnMapping__Group_1__1__Impl ;
    public final void rule__ExtractColumnMapping__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2367:1: ( rule__ExtractColumnMapping__Group_1__1__Impl )
            // InternalTableDSL.g:2368:2: rule__ExtractColumnMapping__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExtractColumnMapping__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractColumnMapping__Group_1__1"


    // $ANTLR start "rule__ExtractColumnMapping__Group_1__1__Impl"
    // InternalTableDSL.g:2374:1: rule__ExtractColumnMapping__Group_1__1__Impl : ( ( rule__ExtractColumnMapping__NewNameAssignment_1_1 ) ) ;
    public final void rule__ExtractColumnMapping__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2378:1: ( ( ( rule__ExtractColumnMapping__NewNameAssignment_1_1 ) ) )
            // InternalTableDSL.g:2379:1: ( ( rule__ExtractColumnMapping__NewNameAssignment_1_1 ) )
            {
            // InternalTableDSL.g:2379:1: ( ( rule__ExtractColumnMapping__NewNameAssignment_1_1 ) )
            // InternalTableDSL.g:2380:2: ( rule__ExtractColumnMapping__NewNameAssignment_1_1 )
            {
             before(grammarAccess.getExtractColumnMappingAccess().getNewNameAssignment_1_1()); 
            // InternalTableDSL.g:2381:2: ( rule__ExtractColumnMapping__NewNameAssignment_1_1 )
            // InternalTableDSL.g:2381:3: rule__ExtractColumnMapping__NewNameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ExtractColumnMapping__NewNameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExtractColumnMappingAccess().getNewNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractColumnMapping__Group_1__1__Impl"


    // $ANTLR start "rule__TopNSelector__Group__0"
    // InternalTableDSL.g:2390:1: rule__TopNSelector__Group__0 : rule__TopNSelector__Group__0__Impl rule__TopNSelector__Group__1 ;
    public final void rule__TopNSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2394:1: ( rule__TopNSelector__Group__0__Impl rule__TopNSelector__Group__1 )
            // InternalTableDSL.g:2395:2: rule__TopNSelector__Group__0__Impl rule__TopNSelector__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__TopNSelector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopNSelector__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopNSelector__Group__0"


    // $ANTLR start "rule__TopNSelector__Group__0__Impl"
    // InternalTableDSL.g:2402:1: rule__TopNSelector__Group__0__Impl : ( 'TOP' ) ;
    public final void rule__TopNSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2406:1: ( ( 'TOP' ) )
            // InternalTableDSL.g:2407:1: ( 'TOP' )
            {
            // InternalTableDSL.g:2407:1: ( 'TOP' )
            // InternalTableDSL.g:2408:2: 'TOP'
            {
             before(grammarAccess.getTopNSelectorAccess().getTOPKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTopNSelectorAccess().getTOPKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopNSelector__Group__0__Impl"


    // $ANTLR start "rule__TopNSelector__Group__1"
    // InternalTableDSL.g:2417:1: rule__TopNSelector__Group__1 : rule__TopNSelector__Group__1__Impl ;
    public final void rule__TopNSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2421:1: ( rule__TopNSelector__Group__1__Impl )
            // InternalTableDSL.g:2422:2: rule__TopNSelector__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TopNSelector__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopNSelector__Group__1"


    // $ANTLR start "rule__TopNSelector__Group__1__Impl"
    // InternalTableDSL.g:2428:1: rule__TopNSelector__Group__1__Impl : ( ( rule__TopNSelector__NAssignment_1 ) ) ;
    public final void rule__TopNSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2432:1: ( ( ( rule__TopNSelector__NAssignment_1 ) ) )
            // InternalTableDSL.g:2433:1: ( ( rule__TopNSelector__NAssignment_1 ) )
            {
            // InternalTableDSL.g:2433:1: ( ( rule__TopNSelector__NAssignment_1 ) )
            // InternalTableDSL.g:2434:2: ( rule__TopNSelector__NAssignment_1 )
            {
             before(grammarAccess.getTopNSelectorAccess().getNAssignment_1()); 
            // InternalTableDSL.g:2435:2: ( rule__TopNSelector__NAssignment_1 )
            // InternalTableDSL.g:2435:3: rule__TopNSelector__NAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TopNSelector__NAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTopNSelectorAccess().getNAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopNSelector__Group__1__Impl"


    // $ANTLR start "rule__Comparator__Group__0"
    // InternalTableDSL.g:2444:1: rule__Comparator__Group__0 : rule__Comparator__Group__0__Impl rule__Comparator__Group__1 ;
    public final void rule__Comparator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2448:1: ( rule__Comparator__Group__0__Impl rule__Comparator__Group__1 )
            // InternalTableDSL.g:2449:2: rule__Comparator__Group__0__Impl rule__Comparator__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Comparator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group__0"


    // $ANTLR start "rule__Comparator__Group__0__Impl"
    // InternalTableDSL.g:2456:1: rule__Comparator__Group__0__Impl : ( ( rule__Comparator__KeysAssignment_0 ) ) ;
    public final void rule__Comparator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2460:1: ( ( ( rule__Comparator__KeysAssignment_0 ) ) )
            // InternalTableDSL.g:2461:1: ( ( rule__Comparator__KeysAssignment_0 ) )
            {
            // InternalTableDSL.g:2461:1: ( ( rule__Comparator__KeysAssignment_0 ) )
            // InternalTableDSL.g:2462:2: ( rule__Comparator__KeysAssignment_0 )
            {
             before(grammarAccess.getComparatorAccess().getKeysAssignment_0()); 
            // InternalTableDSL.g:2463:2: ( rule__Comparator__KeysAssignment_0 )
            // InternalTableDSL.g:2463:3: rule__Comparator__KeysAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Comparator__KeysAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getComparatorAccess().getKeysAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group__0__Impl"


    // $ANTLR start "rule__Comparator__Group__1"
    // InternalTableDSL.g:2471:1: rule__Comparator__Group__1 : rule__Comparator__Group__1__Impl ;
    public final void rule__Comparator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2475:1: ( rule__Comparator__Group__1__Impl )
            // InternalTableDSL.g:2476:2: rule__Comparator__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparator__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group__1"


    // $ANTLR start "rule__Comparator__Group__1__Impl"
    // InternalTableDSL.g:2482:1: rule__Comparator__Group__1__Impl : ( ( rule__Comparator__Group_1__0 )* ) ;
    public final void rule__Comparator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2486:1: ( ( ( rule__Comparator__Group_1__0 )* ) )
            // InternalTableDSL.g:2487:1: ( ( rule__Comparator__Group_1__0 )* )
            {
            // InternalTableDSL.g:2487:1: ( ( rule__Comparator__Group_1__0 )* )
            // InternalTableDSL.g:2488:2: ( rule__Comparator__Group_1__0 )*
            {
             before(grammarAccess.getComparatorAccess().getGroup_1()); 
            // InternalTableDSL.g:2489:2: ( rule__Comparator__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==21) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalTableDSL.g:2489:3: rule__Comparator__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Comparator__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getComparatorAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group__1__Impl"


    // $ANTLR start "rule__Comparator__Group_1__0"
    // InternalTableDSL.g:2498:1: rule__Comparator__Group_1__0 : rule__Comparator__Group_1__0__Impl rule__Comparator__Group_1__1 ;
    public final void rule__Comparator__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2502:1: ( rule__Comparator__Group_1__0__Impl rule__Comparator__Group_1__1 )
            // InternalTableDSL.g:2503:2: rule__Comparator__Group_1__0__Impl rule__Comparator__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Comparator__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparator__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_1__0"


    // $ANTLR start "rule__Comparator__Group_1__0__Impl"
    // InternalTableDSL.g:2510:1: rule__Comparator__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Comparator__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2514:1: ( ( ',' ) )
            // InternalTableDSL.g:2515:1: ( ',' )
            {
            // InternalTableDSL.g:2515:1: ( ',' )
            // InternalTableDSL.g:2516:2: ','
            {
             before(grammarAccess.getComparatorAccess().getCommaKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getComparatorAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_1__0__Impl"


    // $ANTLR start "rule__Comparator__Group_1__1"
    // InternalTableDSL.g:2525:1: rule__Comparator__Group_1__1 : rule__Comparator__Group_1__1__Impl ;
    public final void rule__Comparator__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2529:1: ( rule__Comparator__Group_1__1__Impl )
            // InternalTableDSL.g:2530:2: rule__Comparator__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparator__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_1__1"


    // $ANTLR start "rule__Comparator__Group_1__1__Impl"
    // InternalTableDSL.g:2536:1: rule__Comparator__Group_1__1__Impl : ( ( rule__Comparator__KeysAssignment_1_1 ) ) ;
    public final void rule__Comparator__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2540:1: ( ( ( rule__Comparator__KeysAssignment_1_1 ) ) )
            // InternalTableDSL.g:2541:1: ( ( rule__Comparator__KeysAssignment_1_1 ) )
            {
            // InternalTableDSL.g:2541:1: ( ( rule__Comparator__KeysAssignment_1_1 ) )
            // InternalTableDSL.g:2542:2: ( rule__Comparator__KeysAssignment_1_1 )
            {
             before(grammarAccess.getComparatorAccess().getKeysAssignment_1_1()); 
            // InternalTableDSL.g:2543:2: ( rule__Comparator__KeysAssignment_1_1 )
            // InternalTableDSL.g:2543:3: rule__Comparator__KeysAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Comparator__KeysAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComparatorAccess().getKeysAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_1__1__Impl"


    // $ANTLR start "rule__SquashRows__Group__0"
    // InternalTableDSL.g:2552:1: rule__SquashRows__Group__0 : rule__SquashRows__Group__0__Impl rule__SquashRows__Group__1 ;
    public final void rule__SquashRows__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2556:1: ( rule__SquashRows__Group__0__Impl rule__SquashRows__Group__1 )
            // InternalTableDSL.g:2557:2: rule__SquashRows__Group__0__Impl rule__SquashRows__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__SquashRows__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SquashRows__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquashRows__Group__0"


    // $ANTLR start "rule__SquashRows__Group__0__Impl"
    // InternalTableDSL.g:2564:1: rule__SquashRows__Group__0__Impl : ( 'squash' ) ;
    public final void rule__SquashRows__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2568:1: ( ( 'squash' ) )
            // InternalTableDSL.g:2569:1: ( 'squash' )
            {
            // InternalTableDSL.g:2569:1: ( 'squash' )
            // InternalTableDSL.g:2570:2: 'squash'
            {
             before(grammarAccess.getSquashRowsAccess().getSquashKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSquashRowsAccess().getSquashKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquashRows__Group__0__Impl"


    // $ANTLR start "rule__SquashRows__Group__1"
    // InternalTableDSL.g:2579:1: rule__SquashRows__Group__1 : rule__SquashRows__Group__1__Impl rule__SquashRows__Group__2 ;
    public final void rule__SquashRows__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2583:1: ( rule__SquashRows__Group__1__Impl rule__SquashRows__Group__2 )
            // InternalTableDSL.g:2584:2: rule__SquashRows__Group__1__Impl rule__SquashRows__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__SquashRows__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SquashRows__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquashRows__Group__1"


    // $ANTLR start "rule__SquashRows__Group__1__Impl"
    // InternalTableDSL.g:2591:1: rule__SquashRows__Group__1__Impl : ( ( 'rows' )? ) ;
    public final void rule__SquashRows__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2595:1: ( ( ( 'rows' )? ) )
            // InternalTableDSL.g:2596:1: ( ( 'rows' )? )
            {
            // InternalTableDSL.g:2596:1: ( ( 'rows' )? )
            // InternalTableDSL.g:2597:2: ( 'rows' )?
            {
             before(grammarAccess.getSquashRowsAccess().getRowsKeyword_1()); 
            // InternalTableDSL.g:2598:2: ( 'rows' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalTableDSL.g:2598:3: 'rows'
                    {
                    match(input,34,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getSquashRowsAccess().getRowsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquashRows__Group__1__Impl"


    // $ANTLR start "rule__SquashRows__Group__2"
    // InternalTableDSL.g:2606:1: rule__SquashRows__Group__2 : rule__SquashRows__Group__2__Impl rule__SquashRows__Group__3 ;
    public final void rule__SquashRows__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2610:1: ( rule__SquashRows__Group__2__Impl rule__SquashRows__Group__3 )
            // InternalTableDSL.g:2611:2: rule__SquashRows__Group__2__Impl rule__SquashRows__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__SquashRows__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SquashRows__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquashRows__Group__2"


    // $ANTLR start "rule__SquashRows__Group__2__Impl"
    // InternalTableDSL.g:2618:1: rule__SquashRows__Group__2__Impl : ( 'by' ) ;
    public final void rule__SquashRows__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2622:1: ( ( 'by' ) )
            // InternalTableDSL.g:2623:1: ( 'by' )
            {
            // InternalTableDSL.g:2623:1: ( 'by' )
            // InternalTableDSL.g:2624:2: 'by'
            {
             before(grammarAccess.getSquashRowsAccess().getByKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSquashRowsAccess().getByKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquashRows__Group__2__Impl"


    // $ANTLR start "rule__SquashRows__Group__3"
    // InternalTableDSL.g:2633:1: rule__SquashRows__Group__3 : rule__SquashRows__Group__3__Impl rule__SquashRows__Group__4 ;
    public final void rule__SquashRows__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2637:1: ( rule__SquashRows__Group__3__Impl rule__SquashRows__Group__4 )
            // InternalTableDSL.g:2638:2: rule__SquashRows__Group__3__Impl rule__SquashRows__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__SquashRows__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SquashRows__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquashRows__Group__3"


    // $ANTLR start "rule__SquashRows__Group__3__Impl"
    // InternalTableDSL.g:2645:1: rule__SquashRows__Group__3__Impl : ( ( rule__SquashRows__ColumnsAssignment_3 ) ) ;
    public final void rule__SquashRows__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2649:1: ( ( ( rule__SquashRows__ColumnsAssignment_3 ) ) )
            // InternalTableDSL.g:2650:1: ( ( rule__SquashRows__ColumnsAssignment_3 ) )
            {
            // InternalTableDSL.g:2650:1: ( ( rule__SquashRows__ColumnsAssignment_3 ) )
            // InternalTableDSL.g:2651:2: ( rule__SquashRows__ColumnsAssignment_3 )
            {
             before(grammarAccess.getSquashRowsAccess().getColumnsAssignment_3()); 
            // InternalTableDSL.g:2652:2: ( rule__SquashRows__ColumnsAssignment_3 )
            // InternalTableDSL.g:2652:3: rule__SquashRows__ColumnsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SquashRows__ColumnsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSquashRowsAccess().getColumnsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquashRows__Group__3__Impl"


    // $ANTLR start "rule__SquashRows__Group__4"
    // InternalTableDSL.g:2660:1: rule__SquashRows__Group__4 : rule__SquashRows__Group__4__Impl ;
    public final void rule__SquashRows__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2664:1: ( rule__SquashRows__Group__4__Impl )
            // InternalTableDSL.g:2665:2: rule__SquashRows__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SquashRows__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquashRows__Group__4"


    // $ANTLR start "rule__SquashRows__Group__4__Impl"
    // InternalTableDSL.g:2671:1: rule__SquashRows__Group__4__Impl : ( ( rule__SquashRows__Group_4__0 )* ) ;
    public final void rule__SquashRows__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2675:1: ( ( ( rule__SquashRows__Group_4__0 )* ) )
            // InternalTableDSL.g:2676:1: ( ( rule__SquashRows__Group_4__0 )* )
            {
            // InternalTableDSL.g:2676:1: ( ( rule__SquashRows__Group_4__0 )* )
            // InternalTableDSL.g:2677:2: ( rule__SquashRows__Group_4__0 )*
            {
             before(grammarAccess.getSquashRowsAccess().getGroup_4()); 
            // InternalTableDSL.g:2678:2: ( rule__SquashRows__Group_4__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==21) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalTableDSL.g:2678:3: rule__SquashRows__Group_4__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__SquashRows__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getSquashRowsAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquashRows__Group__4__Impl"


    // $ANTLR start "rule__SquashRows__Group_4__0"
    // InternalTableDSL.g:2687:1: rule__SquashRows__Group_4__0 : rule__SquashRows__Group_4__0__Impl rule__SquashRows__Group_4__1 ;
    public final void rule__SquashRows__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2691:1: ( rule__SquashRows__Group_4__0__Impl rule__SquashRows__Group_4__1 )
            // InternalTableDSL.g:2692:2: rule__SquashRows__Group_4__0__Impl rule__SquashRows__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__SquashRows__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SquashRows__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquashRows__Group_4__0"


    // $ANTLR start "rule__SquashRows__Group_4__0__Impl"
    // InternalTableDSL.g:2699:1: rule__SquashRows__Group_4__0__Impl : ( ',' ) ;
    public final void rule__SquashRows__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2703:1: ( ( ',' ) )
            // InternalTableDSL.g:2704:1: ( ',' )
            {
            // InternalTableDSL.g:2704:1: ( ',' )
            // InternalTableDSL.g:2705:2: ','
            {
             before(grammarAccess.getSquashRowsAccess().getCommaKeyword_4_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSquashRowsAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquashRows__Group_4__0__Impl"


    // $ANTLR start "rule__SquashRows__Group_4__1"
    // InternalTableDSL.g:2714:1: rule__SquashRows__Group_4__1 : rule__SquashRows__Group_4__1__Impl ;
    public final void rule__SquashRows__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2718:1: ( rule__SquashRows__Group_4__1__Impl )
            // InternalTableDSL.g:2719:2: rule__SquashRows__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SquashRows__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquashRows__Group_4__1"


    // $ANTLR start "rule__SquashRows__Group_4__1__Impl"
    // InternalTableDSL.g:2725:1: rule__SquashRows__Group_4__1__Impl : ( ( rule__SquashRows__ColumnsAssignment_4_1 ) ) ;
    public final void rule__SquashRows__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2729:1: ( ( ( rule__SquashRows__ColumnsAssignment_4_1 ) ) )
            // InternalTableDSL.g:2730:1: ( ( rule__SquashRows__ColumnsAssignment_4_1 ) )
            {
            // InternalTableDSL.g:2730:1: ( ( rule__SquashRows__ColumnsAssignment_4_1 ) )
            // InternalTableDSL.g:2731:2: ( rule__SquashRows__ColumnsAssignment_4_1 )
            {
             before(grammarAccess.getSquashRowsAccess().getColumnsAssignment_4_1()); 
            // InternalTableDSL.g:2732:2: ( rule__SquashRows__ColumnsAssignment_4_1 )
            // InternalTableDSL.g:2732:3: rule__SquashRows__ColumnsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__SquashRows__ColumnsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSquashRowsAccess().getColumnsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquashRows__Group_4__1__Impl"


    // $ANTLR start "rule__Filter__Group__0"
    // InternalTableDSL.g:2741:1: rule__Filter__Group__0 : rule__Filter__Group__0__Impl rule__Filter__Group__1 ;
    public final void rule__Filter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2745:1: ( rule__Filter__Group__0__Impl rule__Filter__Group__1 )
            // InternalTableDSL.g:2746:2: rule__Filter__Group__0__Impl rule__Filter__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Filter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__0"


    // $ANTLR start "rule__Filter__Group__0__Impl"
    // InternalTableDSL.g:2753:1: rule__Filter__Group__0__Impl : ( 'filter' ) ;
    public final void rule__Filter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2757:1: ( ( 'filter' ) )
            // InternalTableDSL.g:2758:1: ( 'filter' )
            {
            // InternalTableDSL.g:2758:1: ( 'filter' )
            // InternalTableDSL.g:2759:2: 'filter'
            {
             before(grammarAccess.getFilterAccess().getFilterKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getFilterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__0__Impl"


    // $ANTLR start "rule__Filter__Group__1"
    // InternalTableDSL.g:2768:1: rule__Filter__Group__1 : rule__Filter__Group__1__Impl rule__Filter__Group__2 ;
    public final void rule__Filter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2772:1: ( rule__Filter__Group__1__Impl rule__Filter__Group__2 )
            // InternalTableDSL.g:2773:2: rule__Filter__Group__1__Impl rule__Filter__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Filter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__1"


    // $ANTLR start "rule__Filter__Group__1__Impl"
    // InternalTableDSL.g:2780:1: rule__Filter__Group__1__Impl : ( ( rule__Filter__DenylistAssignment_1 ) ) ;
    public final void rule__Filter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2784:1: ( ( ( rule__Filter__DenylistAssignment_1 ) ) )
            // InternalTableDSL.g:2785:1: ( ( rule__Filter__DenylistAssignment_1 ) )
            {
            // InternalTableDSL.g:2785:1: ( ( rule__Filter__DenylistAssignment_1 ) )
            // InternalTableDSL.g:2786:2: ( rule__Filter__DenylistAssignment_1 )
            {
             before(grammarAccess.getFilterAccess().getDenylistAssignment_1()); 
            // InternalTableDSL.g:2787:2: ( rule__Filter__DenylistAssignment_1 )
            // InternalTableDSL.g:2787:3: rule__Filter__DenylistAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Filter__DenylistAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterAccess().getDenylistAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__1__Impl"


    // $ANTLR start "rule__Filter__Group__2"
    // InternalTableDSL.g:2795:1: rule__Filter__Group__2 : rule__Filter__Group__2__Impl ;
    public final void rule__Filter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2799:1: ( rule__Filter__Group__2__Impl )
            // InternalTableDSL.g:2800:2: rule__Filter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Filter__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__2"


    // $ANTLR start "rule__Filter__Group__2__Impl"
    // InternalTableDSL.g:2806:1: rule__Filter__Group__2__Impl : ( ( rule__Filter__ExceptlistAssignment_2 )? ) ;
    public final void rule__Filter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2810:1: ( ( ( rule__Filter__ExceptlistAssignment_2 )? ) )
            // InternalTableDSL.g:2811:1: ( ( rule__Filter__ExceptlistAssignment_2 )? )
            {
            // InternalTableDSL.g:2811:1: ( ( rule__Filter__ExceptlistAssignment_2 )? )
            // InternalTableDSL.g:2812:2: ( rule__Filter__ExceptlistAssignment_2 )?
            {
             before(grammarAccess.getFilterAccess().getExceptlistAssignment_2()); 
            // InternalTableDSL.g:2813:2: ( rule__Filter__ExceptlistAssignment_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==37) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalTableDSL.g:2813:3: rule__Filter__ExceptlistAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Filter__ExceptlistAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFilterAccess().getExceptlistAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__2__Impl"


    // $ANTLR start "rule__FilterDenylist__Group__0"
    // InternalTableDSL.g:2822:1: rule__FilterDenylist__Group__0 : rule__FilterDenylist__Group__0__Impl rule__FilterDenylist__Group__1 ;
    public final void rule__FilterDenylist__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2826:1: ( rule__FilterDenylist__Group__0__Impl rule__FilterDenylist__Group__1 )
            // InternalTableDSL.g:2827:2: rule__FilterDenylist__Group__0__Impl rule__FilterDenylist__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__FilterDenylist__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterDenylist__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDenylist__Group__0"


    // $ANTLR start "rule__FilterDenylist__Group__0__Impl"
    // InternalTableDSL.g:2834:1: rule__FilterDenylist__Group__0__Impl : ( 'deny' ) ;
    public final void rule__FilterDenylist__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2838:1: ( ( 'deny' ) )
            // InternalTableDSL.g:2839:1: ( 'deny' )
            {
            // InternalTableDSL.g:2839:1: ( 'deny' )
            // InternalTableDSL.g:2840:2: 'deny'
            {
             before(grammarAccess.getFilterDenylistAccess().getDenyKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getFilterDenylistAccess().getDenyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDenylist__Group__0__Impl"


    // $ANTLR start "rule__FilterDenylist__Group__1"
    // InternalTableDSL.g:2849:1: rule__FilterDenylist__Group__1 : rule__FilterDenylist__Group__1__Impl rule__FilterDenylist__Group__2 ;
    public final void rule__FilterDenylist__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2853:1: ( rule__FilterDenylist__Group__1__Impl rule__FilterDenylist__Group__2 )
            // InternalTableDSL.g:2854:2: rule__FilterDenylist__Group__1__Impl rule__FilterDenylist__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__FilterDenylist__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterDenylist__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDenylist__Group__1"


    // $ANTLR start "rule__FilterDenylist__Group__1__Impl"
    // InternalTableDSL.g:2861:1: rule__FilterDenylist__Group__1__Impl : ( ( rule__FilterDenylist__DenylistAssignment_1 ) ) ;
    public final void rule__FilterDenylist__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2865:1: ( ( ( rule__FilterDenylist__DenylistAssignment_1 ) ) )
            // InternalTableDSL.g:2866:1: ( ( rule__FilterDenylist__DenylistAssignment_1 ) )
            {
            // InternalTableDSL.g:2866:1: ( ( rule__FilterDenylist__DenylistAssignment_1 ) )
            // InternalTableDSL.g:2867:2: ( rule__FilterDenylist__DenylistAssignment_1 )
            {
             before(grammarAccess.getFilterDenylistAccess().getDenylistAssignment_1()); 
            // InternalTableDSL.g:2868:2: ( rule__FilterDenylist__DenylistAssignment_1 )
            // InternalTableDSL.g:2868:3: rule__FilterDenylist__DenylistAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FilterDenylist__DenylistAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterDenylistAccess().getDenylistAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDenylist__Group__1__Impl"


    // $ANTLR start "rule__FilterDenylist__Group__2"
    // InternalTableDSL.g:2876:1: rule__FilterDenylist__Group__2 : rule__FilterDenylist__Group__2__Impl ;
    public final void rule__FilterDenylist__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2880:1: ( rule__FilterDenylist__Group__2__Impl )
            // InternalTableDSL.g:2881:2: rule__FilterDenylist__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilterDenylist__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDenylist__Group__2"


    // $ANTLR start "rule__FilterDenylist__Group__2__Impl"
    // InternalTableDSL.g:2887:1: rule__FilterDenylist__Group__2__Impl : ( ( rule__FilterDenylist__Group_2__0 )* ) ;
    public final void rule__FilterDenylist__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2891:1: ( ( ( rule__FilterDenylist__Group_2__0 )* ) )
            // InternalTableDSL.g:2892:1: ( ( rule__FilterDenylist__Group_2__0 )* )
            {
            // InternalTableDSL.g:2892:1: ( ( rule__FilterDenylist__Group_2__0 )* )
            // InternalTableDSL.g:2893:2: ( rule__FilterDenylist__Group_2__0 )*
            {
             before(grammarAccess.getFilterDenylistAccess().getGroup_2()); 
            // InternalTableDSL.g:2894:2: ( rule__FilterDenylist__Group_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==21) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalTableDSL.g:2894:3: rule__FilterDenylist__Group_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__FilterDenylist__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getFilterDenylistAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDenylist__Group__2__Impl"


    // $ANTLR start "rule__FilterDenylist__Group_2__0"
    // InternalTableDSL.g:2903:1: rule__FilterDenylist__Group_2__0 : rule__FilterDenylist__Group_2__0__Impl rule__FilterDenylist__Group_2__1 ;
    public final void rule__FilterDenylist__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2907:1: ( rule__FilterDenylist__Group_2__0__Impl rule__FilterDenylist__Group_2__1 )
            // InternalTableDSL.g:2908:2: rule__FilterDenylist__Group_2__0__Impl rule__FilterDenylist__Group_2__1
            {
            pushFollow(FOLLOW_27);
            rule__FilterDenylist__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterDenylist__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDenylist__Group_2__0"


    // $ANTLR start "rule__FilterDenylist__Group_2__0__Impl"
    // InternalTableDSL.g:2915:1: rule__FilterDenylist__Group_2__0__Impl : ( ',' ) ;
    public final void rule__FilterDenylist__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2919:1: ( ( ',' ) )
            // InternalTableDSL.g:2920:1: ( ',' )
            {
            // InternalTableDSL.g:2920:1: ( ',' )
            // InternalTableDSL.g:2921:2: ','
            {
             before(grammarAccess.getFilterDenylistAccess().getCommaKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFilterDenylistAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDenylist__Group_2__0__Impl"


    // $ANTLR start "rule__FilterDenylist__Group_2__1"
    // InternalTableDSL.g:2930:1: rule__FilterDenylist__Group_2__1 : rule__FilterDenylist__Group_2__1__Impl ;
    public final void rule__FilterDenylist__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2934:1: ( rule__FilterDenylist__Group_2__1__Impl )
            // InternalTableDSL.g:2935:2: rule__FilterDenylist__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilterDenylist__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDenylist__Group_2__1"


    // $ANTLR start "rule__FilterDenylist__Group_2__1__Impl"
    // InternalTableDSL.g:2941:1: rule__FilterDenylist__Group_2__1__Impl : ( ( rule__FilterDenylist__DenylistAssignment_2_1 ) ) ;
    public final void rule__FilterDenylist__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2945:1: ( ( ( rule__FilterDenylist__DenylistAssignment_2_1 ) ) )
            // InternalTableDSL.g:2946:1: ( ( rule__FilterDenylist__DenylistAssignment_2_1 ) )
            {
            // InternalTableDSL.g:2946:1: ( ( rule__FilterDenylist__DenylistAssignment_2_1 ) )
            // InternalTableDSL.g:2947:2: ( rule__FilterDenylist__DenylistAssignment_2_1 )
            {
             before(grammarAccess.getFilterDenylistAccess().getDenylistAssignment_2_1()); 
            // InternalTableDSL.g:2948:2: ( rule__FilterDenylist__DenylistAssignment_2_1 )
            // InternalTableDSL.g:2948:3: rule__FilterDenylist__DenylistAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FilterDenylist__DenylistAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterDenylistAccess().getDenylistAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDenylist__Group_2__1__Impl"


    // $ANTLR start "rule__FilterExceptlist__Group__0"
    // InternalTableDSL.g:2957:1: rule__FilterExceptlist__Group__0 : rule__FilterExceptlist__Group__0__Impl rule__FilterExceptlist__Group__1 ;
    public final void rule__FilterExceptlist__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2961:1: ( rule__FilterExceptlist__Group__0__Impl rule__FilterExceptlist__Group__1 )
            // InternalTableDSL.g:2962:2: rule__FilterExceptlist__Group__0__Impl rule__FilterExceptlist__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__FilterExceptlist__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterExceptlist__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterExceptlist__Group__0"


    // $ANTLR start "rule__FilterExceptlist__Group__0__Impl"
    // InternalTableDSL.g:2969:1: rule__FilterExceptlist__Group__0__Impl : ( 'except' ) ;
    public final void rule__FilterExceptlist__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2973:1: ( ( 'except' ) )
            // InternalTableDSL.g:2974:1: ( 'except' )
            {
            // InternalTableDSL.g:2974:1: ( 'except' )
            // InternalTableDSL.g:2975:2: 'except'
            {
             before(grammarAccess.getFilterExceptlistAccess().getExceptKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFilterExceptlistAccess().getExceptKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterExceptlist__Group__0__Impl"


    // $ANTLR start "rule__FilterExceptlist__Group__1"
    // InternalTableDSL.g:2984:1: rule__FilterExceptlist__Group__1 : rule__FilterExceptlist__Group__1__Impl rule__FilterExceptlist__Group__2 ;
    public final void rule__FilterExceptlist__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2988:1: ( rule__FilterExceptlist__Group__1__Impl rule__FilterExceptlist__Group__2 )
            // InternalTableDSL.g:2989:2: rule__FilterExceptlist__Group__1__Impl rule__FilterExceptlist__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__FilterExceptlist__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterExceptlist__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterExceptlist__Group__1"


    // $ANTLR start "rule__FilterExceptlist__Group__1__Impl"
    // InternalTableDSL.g:2996:1: rule__FilterExceptlist__Group__1__Impl : ( ( rule__FilterExceptlist__ExceptlistAssignment_1 ) ) ;
    public final void rule__FilterExceptlist__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3000:1: ( ( ( rule__FilterExceptlist__ExceptlistAssignment_1 ) ) )
            // InternalTableDSL.g:3001:1: ( ( rule__FilterExceptlist__ExceptlistAssignment_1 ) )
            {
            // InternalTableDSL.g:3001:1: ( ( rule__FilterExceptlist__ExceptlistAssignment_1 ) )
            // InternalTableDSL.g:3002:2: ( rule__FilterExceptlist__ExceptlistAssignment_1 )
            {
             before(grammarAccess.getFilterExceptlistAccess().getExceptlistAssignment_1()); 
            // InternalTableDSL.g:3003:2: ( rule__FilterExceptlist__ExceptlistAssignment_1 )
            // InternalTableDSL.g:3003:3: rule__FilterExceptlist__ExceptlistAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FilterExceptlist__ExceptlistAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterExceptlistAccess().getExceptlistAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterExceptlist__Group__1__Impl"


    // $ANTLR start "rule__FilterExceptlist__Group__2"
    // InternalTableDSL.g:3011:1: rule__FilterExceptlist__Group__2 : rule__FilterExceptlist__Group__2__Impl ;
    public final void rule__FilterExceptlist__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3015:1: ( rule__FilterExceptlist__Group__2__Impl )
            // InternalTableDSL.g:3016:2: rule__FilterExceptlist__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilterExceptlist__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterExceptlist__Group__2"


    // $ANTLR start "rule__FilterExceptlist__Group__2__Impl"
    // InternalTableDSL.g:3022:1: rule__FilterExceptlist__Group__2__Impl : ( ( rule__FilterExceptlist__Group_2__0 )* ) ;
    public final void rule__FilterExceptlist__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3026:1: ( ( ( rule__FilterExceptlist__Group_2__0 )* ) )
            // InternalTableDSL.g:3027:1: ( ( rule__FilterExceptlist__Group_2__0 )* )
            {
            // InternalTableDSL.g:3027:1: ( ( rule__FilterExceptlist__Group_2__0 )* )
            // InternalTableDSL.g:3028:2: ( rule__FilterExceptlist__Group_2__0 )*
            {
             before(grammarAccess.getFilterExceptlistAccess().getGroup_2()); 
            // InternalTableDSL.g:3029:2: ( rule__FilterExceptlist__Group_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==21) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalTableDSL.g:3029:3: rule__FilterExceptlist__Group_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__FilterExceptlist__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getFilterExceptlistAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterExceptlist__Group__2__Impl"


    // $ANTLR start "rule__FilterExceptlist__Group_2__0"
    // InternalTableDSL.g:3038:1: rule__FilterExceptlist__Group_2__0 : rule__FilterExceptlist__Group_2__0__Impl rule__FilterExceptlist__Group_2__1 ;
    public final void rule__FilterExceptlist__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3042:1: ( rule__FilterExceptlist__Group_2__0__Impl rule__FilterExceptlist__Group_2__1 )
            // InternalTableDSL.g:3043:2: rule__FilterExceptlist__Group_2__0__Impl rule__FilterExceptlist__Group_2__1
            {
            pushFollow(FOLLOW_27);
            rule__FilterExceptlist__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterExceptlist__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterExceptlist__Group_2__0"


    // $ANTLR start "rule__FilterExceptlist__Group_2__0__Impl"
    // InternalTableDSL.g:3050:1: rule__FilterExceptlist__Group_2__0__Impl : ( ',' ) ;
    public final void rule__FilterExceptlist__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3054:1: ( ( ',' ) )
            // InternalTableDSL.g:3055:1: ( ',' )
            {
            // InternalTableDSL.g:3055:1: ( ',' )
            // InternalTableDSL.g:3056:2: ','
            {
             before(grammarAccess.getFilterExceptlistAccess().getCommaKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFilterExceptlistAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterExceptlist__Group_2__0__Impl"


    // $ANTLR start "rule__FilterExceptlist__Group_2__1"
    // InternalTableDSL.g:3065:1: rule__FilterExceptlist__Group_2__1 : rule__FilterExceptlist__Group_2__1__Impl ;
    public final void rule__FilterExceptlist__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3069:1: ( rule__FilterExceptlist__Group_2__1__Impl )
            // InternalTableDSL.g:3070:2: rule__FilterExceptlist__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilterExceptlist__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterExceptlist__Group_2__1"


    // $ANTLR start "rule__FilterExceptlist__Group_2__1__Impl"
    // InternalTableDSL.g:3076:1: rule__FilterExceptlist__Group_2__1__Impl : ( ( rule__FilterExceptlist__ExceptlistAssignment_2_1 ) ) ;
    public final void rule__FilterExceptlist__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3080:1: ( ( ( rule__FilterExceptlist__ExceptlistAssignment_2_1 ) ) )
            // InternalTableDSL.g:3081:1: ( ( rule__FilterExceptlist__ExceptlistAssignment_2_1 ) )
            {
            // InternalTableDSL.g:3081:1: ( ( rule__FilterExceptlist__ExceptlistAssignment_2_1 ) )
            // InternalTableDSL.g:3082:2: ( rule__FilterExceptlist__ExceptlistAssignment_2_1 )
            {
             before(grammarAccess.getFilterExceptlistAccess().getExceptlistAssignment_2_1()); 
            // InternalTableDSL.g:3083:2: ( rule__FilterExceptlist__ExceptlistAssignment_2_1 )
            // InternalTableDSL.g:3083:3: rule__FilterExceptlist__ExceptlistAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FilterExceptlist__ExceptlistAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterExceptlistAccess().getExceptlistAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterExceptlist__Group_2__1__Impl"


    // $ANTLR start "rule__FilterColumnRule__Group__0"
    // InternalTableDSL.g:3092:1: rule__FilterColumnRule__Group__0 : rule__FilterColumnRule__Group__0__Impl rule__FilterColumnRule__Group__1 ;
    public final void rule__FilterColumnRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3096:1: ( rule__FilterColumnRule__Group__0__Impl rule__FilterColumnRule__Group__1 )
            // InternalTableDSL.g:3097:2: rule__FilterColumnRule__Group__0__Impl rule__FilterColumnRule__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__FilterColumnRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterColumnRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterColumnRule__Group__0"


    // $ANTLR start "rule__FilterColumnRule__Group__0__Impl"
    // InternalTableDSL.g:3104:1: rule__FilterColumnRule__Group__0__Impl : ( ( rule__FilterColumnRule__Alternatives_0 ) ) ;
    public final void rule__FilterColumnRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3108:1: ( ( ( rule__FilterColumnRule__Alternatives_0 ) ) )
            // InternalTableDSL.g:3109:1: ( ( rule__FilterColumnRule__Alternatives_0 ) )
            {
            // InternalTableDSL.g:3109:1: ( ( rule__FilterColumnRule__Alternatives_0 ) )
            // InternalTableDSL.g:3110:2: ( rule__FilterColumnRule__Alternatives_0 )
            {
             before(grammarAccess.getFilterColumnRuleAccess().getAlternatives_0()); 
            // InternalTableDSL.g:3111:2: ( rule__FilterColumnRule__Alternatives_0 )
            // InternalTableDSL.g:3111:3: rule__FilterColumnRule__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__FilterColumnRule__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getFilterColumnRuleAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterColumnRule__Group__0__Impl"


    // $ANTLR start "rule__FilterColumnRule__Group__1"
    // InternalTableDSL.g:3119:1: rule__FilterColumnRule__Group__1 : rule__FilterColumnRule__Group__1__Impl rule__FilterColumnRule__Group__2 ;
    public final void rule__FilterColumnRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3123:1: ( rule__FilterColumnRule__Group__1__Impl rule__FilterColumnRule__Group__2 )
            // InternalTableDSL.g:3124:2: rule__FilterColumnRule__Group__1__Impl rule__FilterColumnRule__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__FilterColumnRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterColumnRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterColumnRule__Group__1"


    // $ANTLR start "rule__FilterColumnRule__Group__1__Impl"
    // InternalTableDSL.g:3131:1: rule__FilterColumnRule__Group__1__Impl : ( ( rule__FilterColumnRule__ColumnPatternsAssignment_1 ) ) ;
    public final void rule__FilterColumnRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3135:1: ( ( ( rule__FilterColumnRule__ColumnPatternsAssignment_1 ) ) )
            // InternalTableDSL.g:3136:1: ( ( rule__FilterColumnRule__ColumnPatternsAssignment_1 ) )
            {
            // InternalTableDSL.g:3136:1: ( ( rule__FilterColumnRule__ColumnPatternsAssignment_1 ) )
            // InternalTableDSL.g:3137:2: ( rule__FilterColumnRule__ColumnPatternsAssignment_1 )
            {
             before(grammarAccess.getFilterColumnRuleAccess().getColumnPatternsAssignment_1()); 
            // InternalTableDSL.g:3138:2: ( rule__FilterColumnRule__ColumnPatternsAssignment_1 )
            // InternalTableDSL.g:3138:3: rule__FilterColumnRule__ColumnPatternsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FilterColumnRule__ColumnPatternsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterColumnRuleAccess().getColumnPatternsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterColumnRule__Group__1__Impl"


    // $ANTLR start "rule__FilterColumnRule__Group__2"
    // InternalTableDSL.g:3146:1: rule__FilterColumnRule__Group__2 : rule__FilterColumnRule__Group__2__Impl ;
    public final void rule__FilterColumnRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3150:1: ( rule__FilterColumnRule__Group__2__Impl )
            // InternalTableDSL.g:3151:2: rule__FilterColumnRule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilterColumnRule__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterColumnRule__Group__2"


    // $ANTLR start "rule__FilterColumnRule__Group__2__Impl"
    // InternalTableDSL.g:3157:1: rule__FilterColumnRule__Group__2__Impl : ( ( rule__FilterColumnRule__Group_2__0 )* ) ;
    public final void rule__FilterColumnRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3161:1: ( ( ( rule__FilterColumnRule__Group_2__0 )* ) )
            // InternalTableDSL.g:3162:1: ( ( rule__FilterColumnRule__Group_2__0 )* )
            {
            // InternalTableDSL.g:3162:1: ( ( rule__FilterColumnRule__Group_2__0 )* )
            // InternalTableDSL.g:3163:2: ( rule__FilterColumnRule__Group_2__0 )*
            {
             before(grammarAccess.getFilterColumnRuleAccess().getGroup_2()); 
            // InternalTableDSL.g:3164:2: ( rule__FilterColumnRule__Group_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==21) ) {
                    int LA26_2 = input.LA(2);

                    if ( ((LA26_2>=RULE_COLUMN_NAME_KEYWORDS && LA26_2<=RULE_STRING)) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // InternalTableDSL.g:3164:3: rule__FilterColumnRule__Group_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__FilterColumnRule__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getFilterColumnRuleAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterColumnRule__Group__2__Impl"


    // $ANTLR start "rule__FilterColumnRule__Group_2__0"
    // InternalTableDSL.g:3173:1: rule__FilterColumnRule__Group_2__0 : rule__FilterColumnRule__Group_2__0__Impl rule__FilterColumnRule__Group_2__1 ;
    public final void rule__FilterColumnRule__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3177:1: ( rule__FilterColumnRule__Group_2__0__Impl rule__FilterColumnRule__Group_2__1 )
            // InternalTableDSL.g:3178:2: rule__FilterColumnRule__Group_2__0__Impl rule__FilterColumnRule__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__FilterColumnRule__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterColumnRule__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterColumnRule__Group_2__0"


    // $ANTLR start "rule__FilterColumnRule__Group_2__0__Impl"
    // InternalTableDSL.g:3185:1: rule__FilterColumnRule__Group_2__0__Impl : ( ',' ) ;
    public final void rule__FilterColumnRule__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3189:1: ( ( ',' ) )
            // InternalTableDSL.g:3190:1: ( ',' )
            {
            // InternalTableDSL.g:3190:1: ( ',' )
            // InternalTableDSL.g:3191:2: ','
            {
             before(grammarAccess.getFilterColumnRuleAccess().getCommaKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFilterColumnRuleAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterColumnRule__Group_2__0__Impl"


    // $ANTLR start "rule__FilterColumnRule__Group_2__1"
    // InternalTableDSL.g:3200:1: rule__FilterColumnRule__Group_2__1 : rule__FilterColumnRule__Group_2__1__Impl ;
    public final void rule__FilterColumnRule__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3204:1: ( rule__FilterColumnRule__Group_2__1__Impl )
            // InternalTableDSL.g:3205:2: rule__FilterColumnRule__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilterColumnRule__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterColumnRule__Group_2__1"


    // $ANTLR start "rule__FilterColumnRule__Group_2__1__Impl"
    // InternalTableDSL.g:3211:1: rule__FilterColumnRule__Group_2__1__Impl : ( ( rule__FilterColumnRule__ColumnPatternsAssignment_2_1 ) ) ;
    public final void rule__FilterColumnRule__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3215:1: ( ( ( rule__FilterColumnRule__ColumnPatternsAssignment_2_1 ) ) )
            // InternalTableDSL.g:3216:1: ( ( rule__FilterColumnRule__ColumnPatternsAssignment_2_1 ) )
            {
            // InternalTableDSL.g:3216:1: ( ( rule__FilterColumnRule__ColumnPatternsAssignment_2_1 ) )
            // InternalTableDSL.g:3217:2: ( rule__FilterColumnRule__ColumnPatternsAssignment_2_1 )
            {
             before(grammarAccess.getFilterColumnRuleAccess().getColumnPatternsAssignment_2_1()); 
            // InternalTableDSL.g:3218:2: ( rule__FilterColumnRule__ColumnPatternsAssignment_2_1 )
            // InternalTableDSL.g:3218:3: rule__FilterColumnRule__ColumnPatternsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FilterColumnRule__ColumnPatternsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterColumnRuleAccess().getColumnPatternsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterColumnRule__Group_2__1__Impl"


    // $ANTLR start "rule__FilterObjectTypeRule__Group__0"
    // InternalTableDSL.g:3227:1: rule__FilterObjectTypeRule__Group__0 : rule__FilterObjectTypeRule__Group__0__Impl rule__FilterObjectTypeRule__Group__1 ;
    public final void rule__FilterObjectTypeRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3231:1: ( rule__FilterObjectTypeRule__Group__0__Impl rule__FilterObjectTypeRule__Group__1 )
            // InternalTableDSL.g:3232:2: rule__FilterObjectTypeRule__Group__0__Impl rule__FilterObjectTypeRule__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__FilterObjectTypeRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterObjectTypeRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterObjectTypeRule__Group__0"


    // $ANTLR start "rule__FilterObjectTypeRule__Group__0__Impl"
    // InternalTableDSL.g:3239:1: rule__FilterObjectTypeRule__Group__0__Impl : ( ( rule__FilterObjectTypeRule__Alternatives_0 ) ) ;
    public final void rule__FilterObjectTypeRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3243:1: ( ( ( rule__FilterObjectTypeRule__Alternatives_0 ) ) )
            // InternalTableDSL.g:3244:1: ( ( rule__FilterObjectTypeRule__Alternatives_0 ) )
            {
            // InternalTableDSL.g:3244:1: ( ( rule__FilterObjectTypeRule__Alternatives_0 ) )
            // InternalTableDSL.g:3245:2: ( rule__FilterObjectTypeRule__Alternatives_0 )
            {
             before(grammarAccess.getFilterObjectTypeRuleAccess().getAlternatives_0()); 
            // InternalTableDSL.g:3246:2: ( rule__FilterObjectTypeRule__Alternatives_0 )
            // InternalTableDSL.g:3246:3: rule__FilterObjectTypeRule__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__FilterObjectTypeRule__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getFilterObjectTypeRuleAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterObjectTypeRule__Group__0__Impl"


    // $ANTLR start "rule__FilterObjectTypeRule__Group__1"
    // InternalTableDSL.g:3254:1: rule__FilterObjectTypeRule__Group__1 : rule__FilterObjectTypeRule__Group__1__Impl rule__FilterObjectTypeRule__Group__2 ;
    public final void rule__FilterObjectTypeRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3258:1: ( rule__FilterObjectTypeRule__Group__1__Impl rule__FilterObjectTypeRule__Group__2 )
            // InternalTableDSL.g:3259:2: rule__FilterObjectTypeRule__Group__1__Impl rule__FilterObjectTypeRule__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__FilterObjectTypeRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterObjectTypeRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterObjectTypeRule__Group__1"


    // $ANTLR start "rule__FilterObjectTypeRule__Group__1__Impl"
    // InternalTableDSL.g:3266:1: rule__FilterObjectTypeRule__Group__1__Impl : ( ( 'of' )? ) ;
    public final void rule__FilterObjectTypeRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3270:1: ( ( ( 'of' )? ) )
            // InternalTableDSL.g:3271:1: ( ( 'of' )? )
            {
            // InternalTableDSL.g:3271:1: ( ( 'of' )? )
            // InternalTableDSL.g:3272:2: ( 'of' )?
            {
             before(grammarAccess.getFilterObjectTypeRuleAccess().getOfKeyword_1()); 
            // InternalTableDSL.g:3273:2: ( 'of' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==38) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalTableDSL.g:3273:3: 'of'
                    {
                    match(input,38,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getFilterObjectTypeRuleAccess().getOfKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterObjectTypeRule__Group__1__Impl"


    // $ANTLR start "rule__FilterObjectTypeRule__Group__2"
    // InternalTableDSL.g:3281:1: rule__FilterObjectTypeRule__Group__2 : rule__FilterObjectTypeRule__Group__2__Impl rule__FilterObjectTypeRule__Group__3 ;
    public final void rule__FilterObjectTypeRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3285:1: ( rule__FilterObjectTypeRule__Group__2__Impl rule__FilterObjectTypeRule__Group__3 )
            // InternalTableDSL.g:3286:2: rule__FilterObjectTypeRule__Group__2__Impl rule__FilterObjectTypeRule__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__FilterObjectTypeRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterObjectTypeRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterObjectTypeRule__Group__2"


    // $ANTLR start "rule__FilterObjectTypeRule__Group__2__Impl"
    // InternalTableDSL.g:3293:1: rule__FilterObjectTypeRule__Group__2__Impl : ( ( rule__FilterObjectTypeRule__ObjectClassesAssignment_2 ) ) ;
    public final void rule__FilterObjectTypeRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3297:1: ( ( ( rule__FilterObjectTypeRule__ObjectClassesAssignment_2 ) ) )
            // InternalTableDSL.g:3298:1: ( ( rule__FilterObjectTypeRule__ObjectClassesAssignment_2 ) )
            {
            // InternalTableDSL.g:3298:1: ( ( rule__FilterObjectTypeRule__ObjectClassesAssignment_2 ) )
            // InternalTableDSL.g:3299:2: ( rule__FilterObjectTypeRule__ObjectClassesAssignment_2 )
            {
             before(grammarAccess.getFilterObjectTypeRuleAccess().getObjectClassesAssignment_2()); 
            // InternalTableDSL.g:3300:2: ( rule__FilterObjectTypeRule__ObjectClassesAssignment_2 )
            // InternalTableDSL.g:3300:3: rule__FilterObjectTypeRule__ObjectClassesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FilterObjectTypeRule__ObjectClassesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFilterObjectTypeRuleAccess().getObjectClassesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterObjectTypeRule__Group__2__Impl"


    // $ANTLR start "rule__FilterObjectTypeRule__Group__3"
    // InternalTableDSL.g:3308:1: rule__FilterObjectTypeRule__Group__3 : rule__FilterObjectTypeRule__Group__3__Impl ;
    public final void rule__FilterObjectTypeRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3312:1: ( rule__FilterObjectTypeRule__Group__3__Impl )
            // InternalTableDSL.g:3313:2: rule__FilterObjectTypeRule__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilterObjectTypeRule__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterObjectTypeRule__Group__3"


    // $ANTLR start "rule__FilterObjectTypeRule__Group__3__Impl"
    // InternalTableDSL.g:3319:1: rule__FilterObjectTypeRule__Group__3__Impl : ( ( rule__FilterObjectTypeRule__Group_3__0 )* ) ;
    public final void rule__FilterObjectTypeRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3323:1: ( ( ( rule__FilterObjectTypeRule__Group_3__0 )* ) )
            // InternalTableDSL.g:3324:1: ( ( rule__FilterObjectTypeRule__Group_3__0 )* )
            {
            // InternalTableDSL.g:3324:1: ( ( rule__FilterObjectTypeRule__Group_3__0 )* )
            // InternalTableDSL.g:3325:2: ( rule__FilterObjectTypeRule__Group_3__0 )*
            {
             before(grammarAccess.getFilterObjectTypeRuleAccess().getGroup_3()); 
            // InternalTableDSL.g:3326:2: ( rule__FilterObjectTypeRule__Group_3__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==21) ) {
                    int LA28_2 = input.LA(2);

                    if ( (LA28_2==RULE_STRING) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // InternalTableDSL.g:3326:3: rule__FilterObjectTypeRule__Group_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__FilterObjectTypeRule__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getFilterObjectTypeRuleAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterObjectTypeRule__Group__3__Impl"


    // $ANTLR start "rule__FilterObjectTypeRule__Group_3__0"
    // InternalTableDSL.g:3335:1: rule__FilterObjectTypeRule__Group_3__0 : rule__FilterObjectTypeRule__Group_3__0__Impl rule__FilterObjectTypeRule__Group_3__1 ;
    public final void rule__FilterObjectTypeRule__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3339:1: ( rule__FilterObjectTypeRule__Group_3__0__Impl rule__FilterObjectTypeRule__Group_3__1 )
            // InternalTableDSL.g:3340:2: rule__FilterObjectTypeRule__Group_3__0__Impl rule__FilterObjectTypeRule__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__FilterObjectTypeRule__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterObjectTypeRule__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterObjectTypeRule__Group_3__0"


    // $ANTLR start "rule__FilterObjectTypeRule__Group_3__0__Impl"
    // InternalTableDSL.g:3347:1: rule__FilterObjectTypeRule__Group_3__0__Impl : ( ',' ) ;
    public final void rule__FilterObjectTypeRule__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3351:1: ( ( ',' ) )
            // InternalTableDSL.g:3352:1: ( ',' )
            {
            // InternalTableDSL.g:3352:1: ( ',' )
            // InternalTableDSL.g:3353:2: ','
            {
             before(grammarAccess.getFilterObjectTypeRuleAccess().getCommaKeyword_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFilterObjectTypeRuleAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterObjectTypeRule__Group_3__0__Impl"


    // $ANTLR start "rule__FilterObjectTypeRule__Group_3__1"
    // InternalTableDSL.g:3362:1: rule__FilterObjectTypeRule__Group_3__1 : rule__FilterObjectTypeRule__Group_3__1__Impl ;
    public final void rule__FilterObjectTypeRule__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3366:1: ( rule__FilterObjectTypeRule__Group_3__1__Impl )
            // InternalTableDSL.g:3367:2: rule__FilterObjectTypeRule__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilterObjectTypeRule__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterObjectTypeRule__Group_3__1"


    // $ANTLR start "rule__FilterObjectTypeRule__Group_3__1__Impl"
    // InternalTableDSL.g:3373:1: rule__FilterObjectTypeRule__Group_3__1__Impl : ( ( rule__FilterObjectTypeRule__ObjectClassesAssignment_3_1 ) ) ;
    public final void rule__FilterObjectTypeRule__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3377:1: ( ( ( rule__FilterObjectTypeRule__ObjectClassesAssignment_3_1 ) ) )
            // InternalTableDSL.g:3378:1: ( ( rule__FilterObjectTypeRule__ObjectClassesAssignment_3_1 ) )
            {
            // InternalTableDSL.g:3378:1: ( ( rule__FilterObjectTypeRule__ObjectClassesAssignment_3_1 ) )
            // InternalTableDSL.g:3379:2: ( rule__FilterObjectTypeRule__ObjectClassesAssignment_3_1 )
            {
             before(grammarAccess.getFilterObjectTypeRuleAccess().getObjectClassesAssignment_3_1()); 
            // InternalTableDSL.g:3380:2: ( rule__FilterObjectTypeRule__ObjectClassesAssignment_3_1 )
            // InternalTableDSL.g:3380:3: rule__FilterObjectTypeRule__ObjectClassesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__FilterObjectTypeRule__ObjectClassesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterObjectTypeRuleAccess().getObjectClassesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterObjectTypeRule__Group_3__1__Impl"


    // $ANTLR start "rule__Start__ActionsAssignment_0"
    // InternalTableDSL.g:3389:1: rule__Start__ActionsAssignment_0 : ( ruleCreateTable ) ;
    public final void rule__Start__ActionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3393:1: ( ( ruleCreateTable ) )
            // InternalTableDSL.g:3394:2: ( ruleCreateTable )
            {
            // InternalTableDSL.g:3394:2: ( ruleCreateTable )
            // InternalTableDSL.g:3395:3: ruleCreateTable
            {
             before(grammarAccess.getStartAccess().getActionsCreateTableParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCreateTable();

            state._fsp--;

             after(grammarAccess.getStartAccess().getActionsCreateTableParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Start__ActionsAssignment_0"


    // $ANTLR start "rule__Start__ActionsAssignment_1"
    // InternalTableDSL.g:3404:1: rule__Start__ActionsAssignment_1 : ( ruleTableAction ) ;
    public final void rule__Start__ActionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3408:1: ( ( ruleTableAction ) )
            // InternalTableDSL.g:3409:2: ( ruleTableAction )
            {
            // InternalTableDSL.g:3409:2: ( ruleTableAction )
            // InternalTableDSL.g:3410:3: ruleTableAction
            {
             before(grammarAccess.getStartAccess().getActionsTableActionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTableAction();

            state._fsp--;

             after(grammarAccess.getStartAccess().getActionsTableActionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Start__ActionsAssignment_1"


    // $ANTLR start "rule__TableInputPath__PathPatternsAssignment_0"
    // InternalTableDSL.g:3419:1: rule__TableInputPath__PathPatternsAssignment_0 : ( RULE_STRING ) ;
    public final void rule__TableInputPath__PathPatternsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3423:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3424:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3424:2: ( RULE_STRING )
            // InternalTableDSL.g:3425:3: RULE_STRING
            {
             before(grammarAccess.getTableInputPathAccess().getPathPatternsSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTableInputPathAccess().getPathPatternsSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableInputPath__PathPatternsAssignment_0"


    // $ANTLR start "rule__TableInputPath__PathPatternsAssignment_1_1"
    // InternalTableDSL.g:3434:1: rule__TableInputPath__PathPatternsAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__TableInputPath__PathPatternsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3438:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3439:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3439:2: ( RULE_STRING )
            // InternalTableDSL.g:3440:3: RULE_STRING
            {
             before(grammarAccess.getTableInputPathAccess().getPathPatternsSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTableInputPathAccess().getPathPatternsSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableInputPath__PathPatternsAssignment_1_1"


    // $ANTLR start "rule__Output__OutputPathsAssignment_2"
    // InternalTableDSL.g:3449:1: rule__Output__OutputPathsAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Output__OutputPathsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3453:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3454:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3454:2: ( RULE_STRING )
            // InternalTableDSL.g:3455:3: RULE_STRING
            {
             before(grammarAccess.getOutputAccess().getOutputPathsSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getOutputPathsSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__OutputPathsAssignment_2"


    // $ANTLR start "rule__Output__OutputPathsAssignment_3_1"
    // InternalTableDSL.g:3464:1: rule__Output__OutputPathsAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Output__OutputPathsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3468:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3469:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3469:2: ( RULE_STRING )
            // InternalTableDSL.g:3470:3: RULE_STRING
            {
             before(grammarAccess.getOutputAccess().getOutputPathsSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getOutputPathsSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__OutputPathsAssignment_3_1"


    // $ANTLR start "rule__Select__ColumnsPatternsAssignment_1"
    // InternalTableDSL.g:3479:1: rule__Select__ColumnsPatternsAssignment_1 : ( ruleColumnName ) ;
    public final void rule__Select__ColumnsPatternsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3483:1: ( ( ruleColumnName ) )
            // InternalTableDSL.g:3484:2: ( ruleColumnName )
            {
            // InternalTableDSL.g:3484:2: ( ruleColumnName )
            // InternalTableDSL.g:3485:3: ruleColumnName
            {
             before(grammarAccess.getSelectAccess().getColumnsPatternsColumnNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnName();

            state._fsp--;

             after(grammarAccess.getSelectAccess().getColumnsPatternsColumnNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__ColumnsPatternsAssignment_1"


    // $ANTLR start "rule__Select__ColumnPatternsAssignment_2_1"
    // InternalTableDSL.g:3494:1: rule__Select__ColumnPatternsAssignment_2_1 : ( ruleColumnName ) ;
    public final void rule__Select__ColumnPatternsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3498:1: ( ( ruleColumnName ) )
            // InternalTableDSL.g:3499:2: ( ruleColumnName )
            {
            // InternalTableDSL.g:3499:2: ( ruleColumnName )
            // InternalTableDSL.g:3500:3: ruleColumnName
            {
             before(grammarAccess.getSelectAccess().getColumnPatternsColumnNameParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnName();

            state._fsp--;

             after(grammarAccess.getSelectAccess().getColumnPatternsColumnNameParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__ColumnPatternsAssignment_2_1"


    // $ANTLR start "rule__RenameColumn__RenameTuplesAssignment_2"
    // InternalTableDSL.g:3509:1: rule__RenameColumn__RenameTuplesAssignment_2 : ( ruleRenameColumnPair ) ;
    public final void rule__RenameColumn__RenameTuplesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3513:1: ( ( ruleRenameColumnPair ) )
            // InternalTableDSL.g:3514:2: ( ruleRenameColumnPair )
            {
            // InternalTableDSL.g:3514:2: ( ruleRenameColumnPair )
            // InternalTableDSL.g:3515:3: ruleRenameColumnPair
            {
             before(grammarAccess.getRenameColumnAccess().getRenameTuplesRenameColumnPairParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRenameColumnPair();

            state._fsp--;

             after(grammarAccess.getRenameColumnAccess().getRenameTuplesRenameColumnPairParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumn__RenameTuplesAssignment_2"


    // $ANTLR start "rule__RenameColumnToPair__OldNameAssignment_0"
    // InternalTableDSL.g:3524:1: rule__RenameColumnToPair__OldNameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__RenameColumnToPair__OldNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3528:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3529:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3529:2: ( RULE_STRING )
            // InternalTableDSL.g:3530:3: RULE_STRING
            {
             before(grammarAccess.getRenameColumnToPairAccess().getOldNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRenameColumnToPairAccess().getOldNameSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnToPair__OldNameAssignment_0"


    // $ANTLR start "rule__RenameColumnToPair__NewNameAssignment_2"
    // InternalTableDSL.g:3539:1: rule__RenameColumnToPair__NewNameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__RenameColumnToPair__NewNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3543:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3544:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3544:2: ( RULE_STRING )
            // InternalTableDSL.g:3545:3: RULE_STRING
            {
             before(grammarAccess.getRenameColumnToPairAccess().getNewNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRenameColumnToPairAccess().getNewNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnToPair__NewNameAssignment_2"


    // $ANTLR start "rule__RenameColumnPrependPair__OldNameAssignment_0"
    // InternalTableDSL.g:3554:1: rule__RenameColumnPrependPair__OldNameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__RenameColumnPrependPair__OldNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3558:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3559:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3559:2: ( RULE_STRING )
            // InternalTableDSL.g:3560:3: RULE_STRING
            {
             before(grammarAccess.getRenameColumnPrependPairAccess().getOldNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRenameColumnPrependPairAccess().getOldNameSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnPrependPair__OldNameAssignment_0"


    // $ANTLR start "rule__RenameColumnPrependPair__PrefixAssignment_2"
    // InternalTableDSL.g:3569:1: rule__RenameColumnPrependPair__PrefixAssignment_2 : ( RULE_STRING ) ;
    public final void rule__RenameColumnPrependPair__PrefixAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3573:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3574:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3574:2: ( RULE_STRING )
            // InternalTableDSL.g:3575:3: RULE_STRING
            {
             before(grammarAccess.getRenameColumnPrependPairAccess().getPrefixSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRenameColumnPrependPairAccess().getPrefixSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnPrependPair__PrefixAssignment_2"


    // $ANTLR start "rule__RenameColumnAppendPair__OldNameAssignment_0"
    // InternalTableDSL.g:3584:1: rule__RenameColumnAppendPair__OldNameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__RenameColumnAppendPair__OldNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3588:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3589:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3589:2: ( RULE_STRING )
            // InternalTableDSL.g:3590:3: RULE_STRING
            {
             before(grammarAccess.getRenameColumnAppendPairAccess().getOldNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRenameColumnAppendPairAccess().getOldNameSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnAppendPair__OldNameAssignment_0"


    // $ANTLR start "rule__RenameColumnAppendPair__SuffixAssignment_2"
    // InternalTableDSL.g:3599:1: rule__RenameColumnAppendPair__SuffixAssignment_2 : ( RULE_STRING ) ;
    public final void rule__RenameColumnAppendPair__SuffixAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3603:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3604:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3604:2: ( RULE_STRING )
            // InternalTableDSL.g:3605:3: RULE_STRING
            {
             before(grammarAccess.getRenameColumnAppendPairAccess().getSuffixSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRenameColumnAppendPairAccess().getSuffixSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnAppendPair__SuffixAssignment_2"


    // $ANTLR start "rule__Extract__TargetsAssignment_1"
    // InternalTableDSL.g:3614:1: rule__Extract__TargetsAssignment_1 : ( ruleExtractColumnMapping ) ;
    public final void rule__Extract__TargetsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3618:1: ( ( ruleExtractColumnMapping ) )
            // InternalTableDSL.g:3619:2: ( ruleExtractColumnMapping )
            {
            // InternalTableDSL.g:3619:2: ( ruleExtractColumnMapping )
            // InternalTableDSL.g:3620:3: ruleExtractColumnMapping
            {
             before(grammarAccess.getExtractAccess().getTargetsExtractColumnMappingParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExtractColumnMapping();

            state._fsp--;

             after(grammarAccess.getExtractAccess().getTargetsExtractColumnMappingParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__TargetsAssignment_1"


    // $ANTLR start "rule__Extract__TargetsAssignment_2_1"
    // InternalTableDSL.g:3629:1: rule__Extract__TargetsAssignment_2_1 : ( ruleExtractColumnMapping ) ;
    public final void rule__Extract__TargetsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3633:1: ( ( ruleExtractColumnMapping ) )
            // InternalTableDSL.g:3634:2: ( ruleExtractColumnMapping )
            {
            // InternalTableDSL.g:3634:2: ( ruleExtractColumnMapping )
            // InternalTableDSL.g:3635:3: ruleExtractColumnMapping
            {
             before(grammarAccess.getExtractAccess().getTargetsExtractColumnMappingParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExtractColumnMapping();

            state._fsp--;

             after(grammarAccess.getExtractAccess().getTargetsExtractColumnMappingParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__TargetsAssignment_2_1"


    // $ANTLR start "rule__Extract__SourceColumnAssignment_4"
    // InternalTableDSL.g:3644:1: rule__Extract__SourceColumnAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Extract__SourceColumnAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3648:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3649:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3649:2: ( RULE_STRING )
            // InternalTableDSL.g:3650:3: RULE_STRING
            {
             before(grammarAccess.getExtractAccess().getSourceColumnSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExtractAccess().getSourceColumnSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__SourceColumnAssignment_4"


    // $ANTLR start "rule__Extract__SelectorAssignment_6"
    // InternalTableDSL.g:3659:1: rule__Extract__SelectorAssignment_6 : ( ruleSelector ) ;
    public final void rule__Extract__SelectorAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3663:1: ( ( ruleSelector ) )
            // InternalTableDSL.g:3664:2: ( ruleSelector )
            {
            // InternalTableDSL.g:3664:2: ( ruleSelector )
            // InternalTableDSL.g:3665:3: ruleSelector
            {
             before(grammarAccess.getExtractAccess().getSelectorSelectorParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getExtractAccess().getSelectorSelectorParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__SelectorAssignment_6"


    // $ANTLR start "rule__Extract__ComparatorAssignment_9"
    // InternalTableDSL.g:3674:1: rule__Extract__ComparatorAssignment_9 : ( ruleComparator ) ;
    public final void rule__Extract__ComparatorAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3678:1: ( ( ruleComparator ) )
            // InternalTableDSL.g:3679:2: ( ruleComparator )
            {
            // InternalTableDSL.g:3679:2: ( ruleComparator )
            // InternalTableDSL.g:3680:3: ruleComparator
            {
             before(grammarAccess.getExtractAccess().getComparatorComparatorParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleComparator();

            state._fsp--;

             after(grammarAccess.getExtractAccess().getComparatorComparatorParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__ComparatorAssignment_9"


    // $ANTLR start "rule__ExtractColumnMapping__TargetColumnAssignment_0"
    // InternalTableDSL.g:3689:1: rule__ExtractColumnMapping__TargetColumnAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ExtractColumnMapping__TargetColumnAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3693:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3694:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3694:2: ( RULE_STRING )
            // InternalTableDSL.g:3695:3: RULE_STRING
            {
             before(grammarAccess.getExtractColumnMappingAccess().getTargetColumnSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExtractColumnMappingAccess().getTargetColumnSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractColumnMapping__TargetColumnAssignment_0"


    // $ANTLR start "rule__ExtractColumnMapping__NewNameAssignment_1_1"
    // InternalTableDSL.g:3704:1: rule__ExtractColumnMapping__NewNameAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__ExtractColumnMapping__NewNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3708:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3709:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3709:2: ( RULE_STRING )
            // InternalTableDSL.g:3710:3: RULE_STRING
            {
             before(grammarAccess.getExtractColumnMappingAccess().getNewNameSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExtractColumnMappingAccess().getNewNameSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractColumnMapping__NewNameAssignment_1_1"


    // $ANTLR start "rule__KeySelector__KeyAssignment"
    // InternalTableDSL.g:3719:1: rule__KeySelector__KeyAssignment : ( RULE_SELECTOR_KEYWORDS ) ;
    public final void rule__KeySelector__KeyAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3723:1: ( ( RULE_SELECTOR_KEYWORDS ) )
            // InternalTableDSL.g:3724:2: ( RULE_SELECTOR_KEYWORDS )
            {
            // InternalTableDSL.g:3724:2: ( RULE_SELECTOR_KEYWORDS )
            // InternalTableDSL.g:3725:3: RULE_SELECTOR_KEYWORDS
            {
             before(grammarAccess.getKeySelectorAccess().getKeySELECTOR_KEYWORDSTerminalRuleCall_0()); 
            match(input,RULE_SELECTOR_KEYWORDS,FOLLOW_2); 
             after(grammarAccess.getKeySelectorAccess().getKeySELECTOR_KEYWORDSTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeySelector__KeyAssignment"


    // $ANTLR start "rule__TopNSelector__NAssignment_1"
    // InternalTableDSL.g:3734:1: rule__TopNSelector__NAssignment_1 : ( RULE_INT ) ;
    public final void rule__TopNSelector__NAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3738:1: ( ( RULE_INT ) )
            // InternalTableDSL.g:3739:2: ( RULE_INT )
            {
            // InternalTableDSL.g:3739:2: ( RULE_INT )
            // InternalTableDSL.g:3740:3: RULE_INT
            {
             before(grammarAccess.getTopNSelectorAccess().getNINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTopNSelectorAccess().getNINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopNSelector__NAssignment_1"


    // $ANTLR start "rule__Comparator__KeysAssignment_0"
    // InternalTableDSL.g:3749:1: rule__Comparator__KeysAssignment_0 : ( ruleColumnName ) ;
    public final void rule__Comparator__KeysAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3753:1: ( ( ruleColumnName ) )
            // InternalTableDSL.g:3754:2: ( ruleColumnName )
            {
            // InternalTableDSL.g:3754:2: ( ruleColumnName )
            // InternalTableDSL.g:3755:3: ruleColumnName
            {
             before(grammarAccess.getComparatorAccess().getKeysColumnNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnName();

            state._fsp--;

             after(grammarAccess.getComparatorAccess().getKeysColumnNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__KeysAssignment_0"


    // $ANTLR start "rule__Comparator__KeysAssignment_1_1"
    // InternalTableDSL.g:3764:1: rule__Comparator__KeysAssignment_1_1 : ( ruleColumnName ) ;
    public final void rule__Comparator__KeysAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3768:1: ( ( ruleColumnName ) )
            // InternalTableDSL.g:3769:2: ( ruleColumnName )
            {
            // InternalTableDSL.g:3769:2: ( ruleColumnName )
            // InternalTableDSL.g:3770:3: ruleColumnName
            {
             before(grammarAccess.getComparatorAccess().getKeysColumnNameParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnName();

            state._fsp--;

             after(grammarAccess.getComparatorAccess().getKeysColumnNameParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__KeysAssignment_1_1"


    // $ANTLR start "rule__SquashRows__ColumnsAssignment_3"
    // InternalTableDSL.g:3779:1: rule__SquashRows__ColumnsAssignment_3 : ( ruleColumnName ) ;
    public final void rule__SquashRows__ColumnsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3783:1: ( ( ruleColumnName ) )
            // InternalTableDSL.g:3784:2: ( ruleColumnName )
            {
            // InternalTableDSL.g:3784:2: ( ruleColumnName )
            // InternalTableDSL.g:3785:3: ruleColumnName
            {
             before(grammarAccess.getSquashRowsAccess().getColumnsColumnNameParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnName();

            state._fsp--;

             after(grammarAccess.getSquashRowsAccess().getColumnsColumnNameParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquashRows__ColumnsAssignment_3"


    // $ANTLR start "rule__SquashRows__ColumnsAssignment_4_1"
    // InternalTableDSL.g:3794:1: rule__SquashRows__ColumnsAssignment_4_1 : ( ruleColumnName ) ;
    public final void rule__SquashRows__ColumnsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3798:1: ( ( ruleColumnName ) )
            // InternalTableDSL.g:3799:2: ( ruleColumnName )
            {
            // InternalTableDSL.g:3799:2: ( ruleColumnName )
            // InternalTableDSL.g:3800:3: ruleColumnName
            {
             before(grammarAccess.getSquashRowsAccess().getColumnsColumnNameParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnName();

            state._fsp--;

             after(grammarAccess.getSquashRowsAccess().getColumnsColumnNameParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquashRows__ColumnsAssignment_4_1"


    // $ANTLR start "rule__Filter__DenylistAssignment_1"
    // InternalTableDSL.g:3809:1: rule__Filter__DenylistAssignment_1 : ( ruleFilterDenylist ) ;
    public final void rule__Filter__DenylistAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3813:1: ( ( ruleFilterDenylist ) )
            // InternalTableDSL.g:3814:2: ( ruleFilterDenylist )
            {
            // InternalTableDSL.g:3814:2: ( ruleFilterDenylist )
            // InternalTableDSL.g:3815:3: ruleFilterDenylist
            {
             before(grammarAccess.getFilterAccess().getDenylistFilterDenylistParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFilterDenylist();

            state._fsp--;

             after(grammarAccess.getFilterAccess().getDenylistFilterDenylistParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__DenylistAssignment_1"


    // $ANTLR start "rule__Filter__ExceptlistAssignment_2"
    // InternalTableDSL.g:3824:1: rule__Filter__ExceptlistAssignment_2 : ( ruleFilterExceptlist ) ;
    public final void rule__Filter__ExceptlistAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3828:1: ( ( ruleFilterExceptlist ) )
            // InternalTableDSL.g:3829:2: ( ruleFilterExceptlist )
            {
            // InternalTableDSL.g:3829:2: ( ruleFilterExceptlist )
            // InternalTableDSL.g:3830:3: ruleFilterExceptlist
            {
             before(grammarAccess.getFilterAccess().getExceptlistFilterExceptlistParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFilterExceptlist();

            state._fsp--;

             after(grammarAccess.getFilterAccess().getExceptlistFilterExceptlistParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__ExceptlistAssignment_2"


    // $ANTLR start "rule__FilterDenylist__DenylistAssignment_1"
    // InternalTableDSL.g:3839:1: rule__FilterDenylist__DenylistAssignment_1 : ( ruleFilterRule ) ;
    public final void rule__FilterDenylist__DenylistAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3843:1: ( ( ruleFilterRule ) )
            // InternalTableDSL.g:3844:2: ( ruleFilterRule )
            {
            // InternalTableDSL.g:3844:2: ( ruleFilterRule )
            // InternalTableDSL.g:3845:3: ruleFilterRule
            {
             before(grammarAccess.getFilterDenylistAccess().getDenylistFilterRuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFilterRule();

            state._fsp--;

             after(grammarAccess.getFilterDenylistAccess().getDenylistFilterRuleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDenylist__DenylistAssignment_1"


    // $ANTLR start "rule__FilterDenylist__DenylistAssignment_2_1"
    // InternalTableDSL.g:3854:1: rule__FilterDenylist__DenylistAssignment_2_1 : ( ruleFilterRule ) ;
    public final void rule__FilterDenylist__DenylistAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3858:1: ( ( ruleFilterRule ) )
            // InternalTableDSL.g:3859:2: ( ruleFilterRule )
            {
            // InternalTableDSL.g:3859:2: ( ruleFilterRule )
            // InternalTableDSL.g:3860:3: ruleFilterRule
            {
             before(grammarAccess.getFilterDenylistAccess().getDenylistFilterRuleParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFilterRule();

            state._fsp--;

             after(grammarAccess.getFilterDenylistAccess().getDenylistFilterRuleParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDenylist__DenylistAssignment_2_1"


    // $ANTLR start "rule__FilterExceptlist__ExceptlistAssignment_1"
    // InternalTableDSL.g:3869:1: rule__FilterExceptlist__ExceptlistAssignment_1 : ( ruleFilterRule ) ;
    public final void rule__FilterExceptlist__ExceptlistAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3873:1: ( ( ruleFilterRule ) )
            // InternalTableDSL.g:3874:2: ( ruleFilterRule )
            {
            // InternalTableDSL.g:3874:2: ( ruleFilterRule )
            // InternalTableDSL.g:3875:3: ruleFilterRule
            {
             before(grammarAccess.getFilterExceptlistAccess().getExceptlistFilterRuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFilterRule();

            state._fsp--;

             after(grammarAccess.getFilterExceptlistAccess().getExceptlistFilterRuleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterExceptlist__ExceptlistAssignment_1"


    // $ANTLR start "rule__FilterExceptlist__ExceptlistAssignment_2_1"
    // InternalTableDSL.g:3884:1: rule__FilterExceptlist__ExceptlistAssignment_2_1 : ( ruleFilterRule ) ;
    public final void rule__FilterExceptlist__ExceptlistAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3888:1: ( ( ruleFilterRule ) )
            // InternalTableDSL.g:3889:2: ( ruleFilterRule )
            {
            // InternalTableDSL.g:3889:2: ( ruleFilterRule )
            // InternalTableDSL.g:3890:3: ruleFilterRule
            {
             before(grammarAccess.getFilterExceptlistAccess().getExceptlistFilterRuleParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFilterRule();

            state._fsp--;

             after(grammarAccess.getFilterExceptlistAccess().getExceptlistFilterRuleParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterExceptlist__ExceptlistAssignment_2_1"


    // $ANTLR start "rule__FilterColumnRule__ColumnPatternsAssignment_1"
    // InternalTableDSL.g:3899:1: rule__FilterColumnRule__ColumnPatternsAssignment_1 : ( ruleColumnName ) ;
    public final void rule__FilterColumnRule__ColumnPatternsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3903:1: ( ( ruleColumnName ) )
            // InternalTableDSL.g:3904:2: ( ruleColumnName )
            {
            // InternalTableDSL.g:3904:2: ( ruleColumnName )
            // InternalTableDSL.g:3905:3: ruleColumnName
            {
             before(grammarAccess.getFilterColumnRuleAccess().getColumnPatternsColumnNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnName();

            state._fsp--;

             after(grammarAccess.getFilterColumnRuleAccess().getColumnPatternsColumnNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterColumnRule__ColumnPatternsAssignment_1"


    // $ANTLR start "rule__FilterColumnRule__ColumnPatternsAssignment_2_1"
    // InternalTableDSL.g:3914:1: rule__FilterColumnRule__ColumnPatternsAssignment_2_1 : ( ruleColumnName ) ;
    public final void rule__FilterColumnRule__ColumnPatternsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3918:1: ( ( ruleColumnName ) )
            // InternalTableDSL.g:3919:2: ( ruleColumnName )
            {
            // InternalTableDSL.g:3919:2: ( ruleColumnName )
            // InternalTableDSL.g:3920:3: ruleColumnName
            {
             before(grammarAccess.getFilterColumnRuleAccess().getColumnPatternsColumnNameParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnName();

            state._fsp--;

             after(grammarAccess.getFilterColumnRuleAccess().getColumnPatternsColumnNameParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterColumnRule__ColumnPatternsAssignment_2_1"


    // $ANTLR start "rule__FilterObjectTypeRule__ObjectClassesAssignment_2"
    // InternalTableDSL.g:3929:1: rule__FilterObjectTypeRule__ObjectClassesAssignment_2 : ( RULE_STRING ) ;
    public final void rule__FilterObjectTypeRule__ObjectClassesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3933:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3934:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3934:2: ( RULE_STRING )
            // InternalTableDSL.g:3935:3: RULE_STRING
            {
             before(grammarAccess.getFilterObjectTypeRuleAccess().getObjectClassesSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFilterObjectTypeRuleAccess().getObjectClassesSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterObjectTypeRule__ObjectClassesAssignment_2"


    // $ANTLR start "rule__FilterObjectTypeRule__ObjectClassesAssignment_3_1"
    // InternalTableDSL.g:3944:1: rule__FilterObjectTypeRule__ObjectClassesAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__FilterObjectTypeRule__ObjectClassesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3948:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3949:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3949:2: ( RULE_STRING )
            // InternalTableDSL.g:3950:3: RULE_STRING
            {
             before(grammarAccess.getFilterObjectTypeRuleAccess().getObjectClassesSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFilterObjectTypeRuleAccess().getObjectClassesSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterObjectTypeRule__ObjectClassesAssignment_3_1"


    // $ANTLR start "rule__ColumnName__ColumnNameAssignment"
    // InternalTableDSL.g:3959:1: rule__ColumnName__ColumnNameAssignment : ( ( rule__ColumnName__ColumnNameAlternatives_0 ) ) ;
    public final void rule__ColumnName__ColumnNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3963:1: ( ( ( rule__ColumnName__ColumnNameAlternatives_0 ) ) )
            // InternalTableDSL.g:3964:2: ( ( rule__ColumnName__ColumnNameAlternatives_0 ) )
            {
            // InternalTableDSL.g:3964:2: ( ( rule__ColumnName__ColumnNameAlternatives_0 ) )
            // InternalTableDSL.g:3965:3: ( rule__ColumnName__ColumnNameAlternatives_0 )
            {
             before(grammarAccess.getColumnNameAccess().getColumnNameAlternatives_0()); 
            // InternalTableDSL.g:3966:3: ( rule__ColumnName__ColumnNameAlternatives_0 )
            // InternalTableDSL.g:3966:4: rule__ColumnName__ColumnNameAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__ColumnName__ColumnNameAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getColumnNameAccess().getColumnNameAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnName__ColumnNameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000A13500000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000A13500002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002022L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000080L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000440000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000020L});

}