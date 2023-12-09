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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_COLUMN_NAME_KEYWORDS", "RULE_STRING", "RULE_OBJECT_TYPES", "RULE_ANY_OTHER", "RULE_SELECTOR_KEYWORDS", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'column'", "'columns'", "'object'", "'objects'", "'create'", "'table'", "'from'", "'load'", "','", "'output'", "'to'", "'select'", "'rename'", "'prepend'", "'append'", "'extract'", "'sort'", "'by'", "'as'", "'TOP'", "'squash'", "'rows'", "'filter'", "'deny'", "'except'", "'of'", "'reduce'"
    };
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


    // $ANTLR start "entryRuleReduce"
    // InternalTableDSL.g:703:1: entryRuleReduce : ruleReduce EOF ;
    public final void entryRuleReduce() throws RecognitionException {
        try {
            // InternalTableDSL.g:704:1: ( ruleReduce EOF )
            // InternalTableDSL.g:705:1: ruleReduce EOF
            {
             before(grammarAccess.getReduceRule()); 
            pushFollow(FOLLOW_1);
            ruleReduce();

            state._fsp--;

             after(grammarAccess.getReduceRule()); 
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
    // $ANTLR end "entryRuleReduce"


    // $ANTLR start "ruleReduce"
    // InternalTableDSL.g:712:1: ruleReduce : ( ( rule__Reduce__Group__0 ) ) ;
    public final void ruleReduce() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:716:2: ( ( ( rule__Reduce__Group__0 ) ) )
            // InternalTableDSL.g:717:2: ( ( rule__Reduce__Group__0 ) )
            {
            // InternalTableDSL.g:717:2: ( ( rule__Reduce__Group__0 ) )
            // InternalTableDSL.g:718:3: ( rule__Reduce__Group__0 )
            {
             before(grammarAccess.getReduceAccess().getGroup()); 
            // InternalTableDSL.g:719:3: ( rule__Reduce__Group__0 )
            // InternalTableDSL.g:719:4: rule__Reduce__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Reduce__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReduceAccess().getGroup()); 

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
    // $ANTLR end "ruleReduce"


    // $ANTLR start "entryRuleColumnName"
    // InternalTableDSL.g:728:1: entryRuleColumnName : ruleColumnName EOF ;
    public final void entryRuleColumnName() throws RecognitionException {
        try {
            // InternalTableDSL.g:729:1: ( ruleColumnName EOF )
            // InternalTableDSL.g:730:1: ruleColumnName EOF
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
    // InternalTableDSL.g:737:1: ruleColumnName : ( ( rule__ColumnName__ColumnNameAssignment ) ) ;
    public final void ruleColumnName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:741:2: ( ( ( rule__ColumnName__ColumnNameAssignment ) ) )
            // InternalTableDSL.g:742:2: ( ( rule__ColumnName__ColumnNameAssignment ) )
            {
            // InternalTableDSL.g:742:2: ( ( rule__ColumnName__ColumnNameAssignment ) )
            // InternalTableDSL.g:743:3: ( rule__ColumnName__ColumnNameAssignment )
            {
             before(grammarAccess.getColumnNameAccess().getColumnNameAssignment()); 
            // InternalTableDSL.g:744:3: ( rule__ColumnName__ColumnNameAssignment )
            // InternalTableDSL.g:744:4: rule__ColumnName__ColumnNameAssignment
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


    // $ANTLR start "entryRuleObjectTypeSelector"
    // InternalTableDSL.g:753:1: entryRuleObjectTypeSelector : ruleObjectTypeSelector EOF ;
    public final void entryRuleObjectTypeSelector() throws RecognitionException {
        try {
            // InternalTableDSL.g:754:1: ( ruleObjectTypeSelector EOF )
            // InternalTableDSL.g:755:1: ruleObjectTypeSelector EOF
            {
             before(grammarAccess.getObjectTypeSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleObjectTypeSelector();

            state._fsp--;

             after(grammarAccess.getObjectTypeSelectorRule()); 
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
    // $ANTLR end "entryRuleObjectTypeSelector"


    // $ANTLR start "ruleObjectTypeSelector"
    // InternalTableDSL.g:762:1: ruleObjectTypeSelector : ( ( rule__ObjectTypeSelector__ObjectTypeAssignment ) ) ;
    public final void ruleObjectTypeSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:766:2: ( ( ( rule__ObjectTypeSelector__ObjectTypeAssignment ) ) )
            // InternalTableDSL.g:767:2: ( ( rule__ObjectTypeSelector__ObjectTypeAssignment ) )
            {
            // InternalTableDSL.g:767:2: ( ( rule__ObjectTypeSelector__ObjectTypeAssignment ) )
            // InternalTableDSL.g:768:3: ( rule__ObjectTypeSelector__ObjectTypeAssignment )
            {
             before(grammarAccess.getObjectTypeSelectorAccess().getObjectTypeAssignment()); 
            // InternalTableDSL.g:769:3: ( rule__ObjectTypeSelector__ObjectTypeAssignment )
            // InternalTableDSL.g:769:4: rule__ObjectTypeSelector__ObjectTypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ObjectTypeSelector__ObjectTypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getObjectTypeSelectorAccess().getObjectTypeAssignment()); 

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
    // $ANTLR end "ruleObjectTypeSelector"


    // $ANTLR start "rule__TableAction__Alternatives_0"
    // InternalTableDSL.g:777:1: rule__TableAction__Alternatives_0 : ( ( ruleLoadData ) | ( ruleOperation ) | ( ruleOutput ) );
    public final void rule__TableAction__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:781:1: ( ( ruleLoadData ) | ( ruleOperation ) | ( ruleOutput ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt1=1;
                }
                break;
            case 25:
            case 26:
            case 29:
            case 34:
            case 36:
            case 40:
                {
                alt1=2;
                }
                break;
            case 23:
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
                    // InternalTableDSL.g:782:2: ( ruleLoadData )
                    {
                    // InternalTableDSL.g:782:2: ( ruleLoadData )
                    // InternalTableDSL.g:783:3: ruleLoadData
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
                    // InternalTableDSL.g:788:2: ( ruleOperation )
                    {
                    // InternalTableDSL.g:788:2: ( ruleOperation )
                    // InternalTableDSL.g:789:3: ruleOperation
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
                    // InternalTableDSL.g:794:2: ( ruleOutput )
                    {
                    // InternalTableDSL.g:794:2: ( ruleOutput )
                    // InternalTableDSL.g:795:3: ruleOutput
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
    // InternalTableDSL.g:804:1: rule__Operation__Alternatives : ( ( ruleSelect ) | ( ruleRenameColumn ) | ( ruleExtract ) | ( ruleSquashRows ) | ( ruleFilter ) | ( ruleReduce ) );
    public final void rule__Operation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:808:1: ( ( ruleSelect ) | ( ruleRenameColumn ) | ( ruleExtract ) | ( ruleSquashRows ) | ( ruleFilter ) | ( ruleReduce ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt2=1;
                }
                break;
            case 26:
                {
                alt2=2;
                }
                break;
            case 29:
                {
                alt2=3;
                }
                break;
            case 34:
                {
                alt2=4;
                }
                break;
            case 36:
                {
                alt2=5;
                }
                break;
            case 40:
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
                    // InternalTableDSL.g:809:2: ( ruleSelect )
                    {
                    // InternalTableDSL.g:809:2: ( ruleSelect )
                    // InternalTableDSL.g:810:3: ruleSelect
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
                    // InternalTableDSL.g:815:2: ( ruleRenameColumn )
                    {
                    // InternalTableDSL.g:815:2: ( ruleRenameColumn )
                    // InternalTableDSL.g:816:3: ruleRenameColumn
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
                    // InternalTableDSL.g:821:2: ( ruleExtract )
                    {
                    // InternalTableDSL.g:821:2: ( ruleExtract )
                    // InternalTableDSL.g:822:3: ruleExtract
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
                    // InternalTableDSL.g:827:2: ( ruleSquashRows )
                    {
                    // InternalTableDSL.g:827:2: ( ruleSquashRows )
                    // InternalTableDSL.g:828:3: ruleSquashRows
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
                    // InternalTableDSL.g:833:2: ( ruleFilter )
                    {
                    // InternalTableDSL.g:833:2: ( ruleFilter )
                    // InternalTableDSL.g:834:3: ruleFilter
                    {
                     before(grammarAccess.getOperationAccess().getFilterParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleFilter();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getFilterParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalTableDSL.g:839:2: ( ruleReduce )
                    {
                    // InternalTableDSL.g:839:2: ( ruleReduce )
                    // InternalTableDSL.g:840:3: ruleReduce
                    {
                     before(grammarAccess.getOperationAccess().getReduceParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleReduce();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getReduceParserRuleCall_5()); 

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
    // InternalTableDSL.g:849:1: rule__RenameColumnPair__Alternatives : ( ( ruleRenameColumnToPair ) | ( ruleRenameColumnAppendPair ) | ( ruleRenameColumnPrependPair ) );
    public final void rule__RenameColumnPair__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:853:1: ( ( ruleRenameColumnToPair ) | ( ruleRenameColumnAppendPair ) | ( ruleRenameColumnPrependPair ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                switch ( input.LA(2) ) {
                case 28:
                    {
                    alt3=2;
                    }
                    break;
                case 24:
                    {
                    alt3=1;
                    }
                    break;
                case 27:
                    {
                    alt3=3;
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
                    // InternalTableDSL.g:854:2: ( ruleRenameColumnToPair )
                    {
                    // InternalTableDSL.g:854:2: ( ruleRenameColumnToPair )
                    // InternalTableDSL.g:855:3: ruleRenameColumnToPair
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
                    // InternalTableDSL.g:860:2: ( ruleRenameColumnAppendPair )
                    {
                    // InternalTableDSL.g:860:2: ( ruleRenameColumnAppendPair )
                    // InternalTableDSL.g:861:3: ruleRenameColumnAppendPair
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
                    // InternalTableDSL.g:866:2: ( ruleRenameColumnPrependPair )
                    {
                    // InternalTableDSL.g:866:2: ( ruleRenameColumnPrependPair )
                    // InternalTableDSL.g:867:3: ruleRenameColumnPrependPair
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
    // InternalTableDSL.g:876:1: rule__Selector__Alternatives : ( ( ruleKeySelector ) | ( ruleTopNSelector ) );
    public final void rule__Selector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:880:1: ( ( ruleKeySelector ) | ( ruleTopNSelector ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_SELECTOR_KEYWORDS) ) {
                alt4=1;
            }
            else if ( (LA4_0==33) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTableDSL.g:881:2: ( ruleKeySelector )
                    {
                    // InternalTableDSL.g:881:2: ( ruleKeySelector )
                    // InternalTableDSL.g:882:3: ruleKeySelector
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
                    // InternalTableDSL.g:887:2: ( ruleTopNSelector )
                    {
                    // InternalTableDSL.g:887:2: ( ruleTopNSelector )
                    // InternalTableDSL.g:888:3: ruleTopNSelector
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
    // InternalTableDSL.g:897:1: rule__FilterRule__Alternatives : ( ( ruleFilterColumnRule ) | ( ruleFilterObjectTypeRule ) );
    public final void rule__FilterRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:901:1: ( ( ruleFilterColumnRule ) | ( ruleFilterObjectTypeRule ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=14 && LA5_0<=15)) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=16 && LA5_0<=17)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalTableDSL.g:902:2: ( ruleFilterColumnRule )
                    {
                    // InternalTableDSL.g:902:2: ( ruleFilterColumnRule )
                    // InternalTableDSL.g:903:3: ruleFilterColumnRule
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
                    // InternalTableDSL.g:908:2: ( ruleFilterObjectTypeRule )
                    {
                    // InternalTableDSL.g:908:2: ( ruleFilterObjectTypeRule )
                    // InternalTableDSL.g:909:3: ruleFilterObjectTypeRule
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
    // InternalTableDSL.g:918:1: rule__FilterColumnRule__Alternatives_0 : ( ( 'column' ) | ( 'columns' ) );
    public final void rule__FilterColumnRule__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:922:1: ( ( 'column' ) | ( 'columns' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            else if ( (LA6_0==15) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalTableDSL.g:923:2: ( 'column' )
                    {
                    // InternalTableDSL.g:923:2: ( 'column' )
                    // InternalTableDSL.g:924:3: 'column'
                    {
                     before(grammarAccess.getFilterColumnRuleAccess().getColumnKeyword_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getFilterColumnRuleAccess().getColumnKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTableDSL.g:929:2: ( 'columns' )
                    {
                    // InternalTableDSL.g:929:2: ( 'columns' )
                    // InternalTableDSL.g:930:3: 'columns'
                    {
                     before(grammarAccess.getFilterColumnRuleAccess().getColumnsKeyword_0_1()); 
                    match(input,15,FOLLOW_2); 
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
    // InternalTableDSL.g:939:1: rule__FilterObjectTypeRule__Alternatives_0 : ( ( 'object' ) | ( 'objects' ) );
    public final void rule__FilterObjectTypeRule__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:943:1: ( ( 'object' ) | ( 'objects' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            else if ( (LA7_0==17) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTableDSL.g:944:2: ( 'object' )
                    {
                    // InternalTableDSL.g:944:2: ( 'object' )
                    // InternalTableDSL.g:945:3: 'object'
                    {
                     before(grammarAccess.getFilterObjectTypeRuleAccess().getObjectKeyword_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getFilterObjectTypeRuleAccess().getObjectKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTableDSL.g:950:2: ( 'objects' )
                    {
                    // InternalTableDSL.g:950:2: ( 'objects' )
                    // InternalTableDSL.g:951:3: 'objects'
                    {
                     before(grammarAccess.getFilterObjectTypeRuleAccess().getObjectsKeyword_0_1()); 
                    match(input,17,FOLLOW_2); 
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
    // InternalTableDSL.g:960:1: rule__ColumnName__ColumnNameAlternatives_0 : ( ( RULE_COLUMN_NAME_KEYWORDS ) | ( RULE_STRING ) );
    public final void rule__ColumnName__ColumnNameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:964:1: ( ( RULE_COLUMN_NAME_KEYWORDS ) | ( RULE_STRING ) )
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
                    // InternalTableDSL.g:965:2: ( RULE_COLUMN_NAME_KEYWORDS )
                    {
                    // InternalTableDSL.g:965:2: ( RULE_COLUMN_NAME_KEYWORDS )
                    // InternalTableDSL.g:966:3: RULE_COLUMN_NAME_KEYWORDS
                    {
                     before(grammarAccess.getColumnNameAccess().getColumnNameCOLUMN_NAME_KEYWORDSTerminalRuleCall_0_0()); 
                    match(input,RULE_COLUMN_NAME_KEYWORDS,FOLLOW_2); 
                     after(grammarAccess.getColumnNameAccess().getColumnNameCOLUMN_NAME_KEYWORDSTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTableDSL.g:971:2: ( RULE_STRING )
                    {
                    // InternalTableDSL.g:971:2: ( RULE_STRING )
                    // InternalTableDSL.g:972:3: RULE_STRING
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


    // $ANTLR start "rule__ObjectTypeSelector__ObjectTypeAlternatives_0"
    // InternalTableDSL.g:981:1: rule__ObjectTypeSelector__ObjectTypeAlternatives_0 : ( ( RULE_OBJECT_TYPES ) | ( RULE_STRING ) );
    public final void rule__ObjectTypeSelector__ObjectTypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:985:1: ( ( RULE_OBJECT_TYPES ) | ( RULE_STRING ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_OBJECT_TYPES) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_STRING) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalTableDSL.g:986:2: ( RULE_OBJECT_TYPES )
                    {
                    // InternalTableDSL.g:986:2: ( RULE_OBJECT_TYPES )
                    // InternalTableDSL.g:987:3: RULE_OBJECT_TYPES
                    {
                     before(grammarAccess.getObjectTypeSelectorAccess().getObjectTypeOBJECT_TYPESTerminalRuleCall_0_0()); 
                    match(input,RULE_OBJECT_TYPES,FOLLOW_2); 
                     after(grammarAccess.getObjectTypeSelectorAccess().getObjectTypeOBJECT_TYPESTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTableDSL.g:992:2: ( RULE_STRING )
                    {
                    // InternalTableDSL.g:992:2: ( RULE_STRING )
                    // InternalTableDSL.g:993:3: RULE_STRING
                    {
                     before(grammarAccess.getObjectTypeSelectorAccess().getObjectTypeSTRINGTerminalRuleCall_0_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getObjectTypeSelectorAccess().getObjectTypeSTRINGTerminalRuleCall_0_1()); 

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
    // $ANTLR end "rule__ObjectTypeSelector__ObjectTypeAlternatives_0"


    // $ANTLR start "rule__Start__Group__0"
    // InternalTableDSL.g:1002:1: rule__Start__Group__0 : rule__Start__Group__0__Impl rule__Start__Group__1 ;
    public final void rule__Start__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1006:1: ( rule__Start__Group__0__Impl rule__Start__Group__1 )
            // InternalTableDSL.g:1007:2: rule__Start__Group__0__Impl rule__Start__Group__1
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
    // InternalTableDSL.g:1014:1: rule__Start__Group__0__Impl : ( ( rule__Start__ActionsAssignment_0 )? ) ;
    public final void rule__Start__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1018:1: ( ( ( rule__Start__ActionsAssignment_0 )? ) )
            // InternalTableDSL.g:1019:1: ( ( rule__Start__ActionsAssignment_0 )? )
            {
            // InternalTableDSL.g:1019:1: ( ( rule__Start__ActionsAssignment_0 )? )
            // InternalTableDSL.g:1020:2: ( rule__Start__ActionsAssignment_0 )?
            {
             before(grammarAccess.getStartAccess().getActionsAssignment_0()); 
            // InternalTableDSL.g:1021:2: ( rule__Start__ActionsAssignment_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=18 && LA10_0<=19)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTableDSL.g:1021:3: rule__Start__ActionsAssignment_0
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
    // InternalTableDSL.g:1029:1: rule__Start__Group__1 : rule__Start__Group__1__Impl ;
    public final void rule__Start__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1033:1: ( rule__Start__Group__1__Impl )
            // InternalTableDSL.g:1034:2: rule__Start__Group__1__Impl
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
    // InternalTableDSL.g:1040:1: rule__Start__Group__1__Impl : ( ( rule__Start__ActionsAssignment_1 )* ) ;
    public final void rule__Start__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1044:1: ( ( ( rule__Start__ActionsAssignment_1 )* ) )
            // InternalTableDSL.g:1045:1: ( ( rule__Start__ActionsAssignment_1 )* )
            {
            // InternalTableDSL.g:1045:1: ( ( rule__Start__ActionsAssignment_1 )* )
            // InternalTableDSL.g:1046:2: ( rule__Start__ActionsAssignment_1 )*
            {
             before(grammarAccess.getStartAccess().getActionsAssignment_1()); 
            // InternalTableDSL.g:1047:2: ( rule__Start__ActionsAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21||LA11_0==23||(LA11_0>=25 && LA11_0<=26)||LA11_0==29||LA11_0==34||LA11_0==36||LA11_0==40) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTableDSL.g:1047:3: rule__Start__ActionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Start__ActionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalTableDSL.g:1056:1: rule__CreateTable__Group__0 : rule__CreateTable__Group__0__Impl rule__CreateTable__Group__1 ;
    public final void rule__CreateTable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1060:1: ( rule__CreateTable__Group__0__Impl rule__CreateTable__Group__1 )
            // InternalTableDSL.g:1061:2: rule__CreateTable__Group__0__Impl rule__CreateTable__Group__1
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
    // InternalTableDSL.g:1068:1: rule__CreateTable__Group__0__Impl : ( ( 'create' )? ) ;
    public final void rule__CreateTable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1072:1: ( ( ( 'create' )? ) )
            // InternalTableDSL.g:1073:1: ( ( 'create' )? )
            {
            // InternalTableDSL.g:1073:1: ( ( 'create' )? )
            // InternalTableDSL.g:1074:2: ( 'create' )?
            {
             before(grammarAccess.getCreateTableAccess().getCreateKeyword_0()); 
            // InternalTableDSL.g:1075:2: ( 'create' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTableDSL.g:1075:3: 'create'
                    {
                    match(input,18,FOLLOW_2); 

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
    // InternalTableDSL.g:1083:1: rule__CreateTable__Group__1 : rule__CreateTable__Group__1__Impl rule__CreateTable__Group__2 ;
    public final void rule__CreateTable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1087:1: ( rule__CreateTable__Group__1__Impl rule__CreateTable__Group__2 )
            // InternalTableDSL.g:1088:2: rule__CreateTable__Group__1__Impl rule__CreateTable__Group__2
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
    // InternalTableDSL.g:1095:1: rule__CreateTable__Group__1__Impl : ( 'table' ) ;
    public final void rule__CreateTable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1099:1: ( ( 'table' ) )
            // InternalTableDSL.g:1100:1: ( 'table' )
            {
            // InternalTableDSL.g:1100:1: ( 'table' )
            // InternalTableDSL.g:1101:2: 'table'
            {
             before(grammarAccess.getCreateTableAccess().getTableKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalTableDSL.g:1110:1: rule__CreateTable__Group__2 : rule__CreateTable__Group__2__Impl rule__CreateTable__Group__3 ;
    public final void rule__CreateTable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1114:1: ( rule__CreateTable__Group__2__Impl rule__CreateTable__Group__3 )
            // InternalTableDSL.g:1115:2: rule__CreateTable__Group__2__Impl rule__CreateTable__Group__3
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
    // InternalTableDSL.g:1122:1: rule__CreateTable__Group__2__Impl : ( 'from' ) ;
    public final void rule__CreateTable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1126:1: ( ( 'from' ) )
            // InternalTableDSL.g:1127:1: ( 'from' )
            {
            // InternalTableDSL.g:1127:1: ( 'from' )
            // InternalTableDSL.g:1128:2: 'from'
            {
             before(grammarAccess.getCreateTableAccess().getFromKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalTableDSL.g:1137:1: rule__CreateTable__Group__3 : rule__CreateTable__Group__3__Impl rule__CreateTable__Group__4 ;
    public final void rule__CreateTable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1141:1: ( rule__CreateTable__Group__3__Impl rule__CreateTable__Group__4 )
            // InternalTableDSL.g:1142:2: rule__CreateTable__Group__3__Impl rule__CreateTable__Group__4
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
    // InternalTableDSL.g:1149:1: rule__CreateTable__Group__3__Impl : ( ruleTableInputPath ) ;
    public final void rule__CreateTable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1153:1: ( ( ruleTableInputPath ) )
            // InternalTableDSL.g:1154:1: ( ruleTableInputPath )
            {
            // InternalTableDSL.g:1154:1: ( ruleTableInputPath )
            // InternalTableDSL.g:1155:2: ruleTableInputPath
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
    // InternalTableDSL.g:1164:1: rule__CreateTable__Group__4 : rule__CreateTable__Group__4__Impl ;
    public final void rule__CreateTable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1168:1: ( rule__CreateTable__Group__4__Impl )
            // InternalTableDSL.g:1169:2: rule__CreateTable__Group__4__Impl
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
    // InternalTableDSL.g:1175:1: rule__CreateTable__Group__4__Impl : ( RULE_ANY_OTHER ) ;
    public final void rule__CreateTable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1179:1: ( ( RULE_ANY_OTHER ) )
            // InternalTableDSL.g:1180:1: ( RULE_ANY_OTHER )
            {
            // InternalTableDSL.g:1180:1: ( RULE_ANY_OTHER )
            // InternalTableDSL.g:1181:2: RULE_ANY_OTHER
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
    // InternalTableDSL.g:1191:1: rule__TableAction__Group__0 : rule__TableAction__Group__0__Impl rule__TableAction__Group__1 ;
    public final void rule__TableAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1195:1: ( rule__TableAction__Group__0__Impl rule__TableAction__Group__1 )
            // InternalTableDSL.g:1196:2: rule__TableAction__Group__0__Impl rule__TableAction__Group__1
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
    // InternalTableDSL.g:1203:1: rule__TableAction__Group__0__Impl : ( ( rule__TableAction__Alternatives_0 ) ) ;
    public final void rule__TableAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1207:1: ( ( ( rule__TableAction__Alternatives_0 ) ) )
            // InternalTableDSL.g:1208:1: ( ( rule__TableAction__Alternatives_0 ) )
            {
            // InternalTableDSL.g:1208:1: ( ( rule__TableAction__Alternatives_0 ) )
            // InternalTableDSL.g:1209:2: ( rule__TableAction__Alternatives_0 )
            {
             before(grammarAccess.getTableActionAccess().getAlternatives_0()); 
            // InternalTableDSL.g:1210:2: ( rule__TableAction__Alternatives_0 )
            // InternalTableDSL.g:1210:3: rule__TableAction__Alternatives_0
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
    // InternalTableDSL.g:1218:1: rule__TableAction__Group__1 : rule__TableAction__Group__1__Impl ;
    public final void rule__TableAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1222:1: ( rule__TableAction__Group__1__Impl )
            // InternalTableDSL.g:1223:2: rule__TableAction__Group__1__Impl
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
    // InternalTableDSL.g:1229:1: rule__TableAction__Group__1__Impl : ( RULE_ANY_OTHER ) ;
    public final void rule__TableAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1233:1: ( ( RULE_ANY_OTHER ) )
            // InternalTableDSL.g:1234:1: ( RULE_ANY_OTHER )
            {
            // InternalTableDSL.g:1234:1: ( RULE_ANY_OTHER )
            // InternalTableDSL.g:1235:2: RULE_ANY_OTHER
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
    // InternalTableDSL.g:1245:1: rule__LoadData__Group__0 : rule__LoadData__Group__0__Impl rule__LoadData__Group__1 ;
    public final void rule__LoadData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1249:1: ( rule__LoadData__Group__0__Impl rule__LoadData__Group__1 )
            // InternalTableDSL.g:1250:2: rule__LoadData__Group__0__Impl rule__LoadData__Group__1
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
    // InternalTableDSL.g:1257:1: rule__LoadData__Group__0__Impl : ( 'load' ) ;
    public final void rule__LoadData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1261:1: ( ( 'load' ) )
            // InternalTableDSL.g:1262:1: ( 'load' )
            {
            // InternalTableDSL.g:1262:1: ( 'load' )
            // InternalTableDSL.g:1263:2: 'load'
            {
             before(grammarAccess.getLoadDataAccess().getLoadKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalTableDSL.g:1272:1: rule__LoadData__Group__1 : rule__LoadData__Group__1__Impl ;
    public final void rule__LoadData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1276:1: ( rule__LoadData__Group__1__Impl )
            // InternalTableDSL.g:1277:2: rule__LoadData__Group__1__Impl
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
    // InternalTableDSL.g:1283:1: rule__LoadData__Group__1__Impl : ( ruleTableInputPath ) ;
    public final void rule__LoadData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1287:1: ( ( ruleTableInputPath ) )
            // InternalTableDSL.g:1288:1: ( ruleTableInputPath )
            {
            // InternalTableDSL.g:1288:1: ( ruleTableInputPath )
            // InternalTableDSL.g:1289:2: ruleTableInputPath
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
    // InternalTableDSL.g:1299:1: rule__TableInputPath__Group__0 : rule__TableInputPath__Group__0__Impl rule__TableInputPath__Group__1 ;
    public final void rule__TableInputPath__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1303:1: ( rule__TableInputPath__Group__0__Impl rule__TableInputPath__Group__1 )
            // InternalTableDSL.g:1304:2: rule__TableInputPath__Group__0__Impl rule__TableInputPath__Group__1
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
    // InternalTableDSL.g:1311:1: rule__TableInputPath__Group__0__Impl : ( ( rule__TableInputPath__PathPatternsAssignment_0 ) ) ;
    public final void rule__TableInputPath__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1315:1: ( ( ( rule__TableInputPath__PathPatternsAssignment_0 ) ) )
            // InternalTableDSL.g:1316:1: ( ( rule__TableInputPath__PathPatternsAssignment_0 ) )
            {
            // InternalTableDSL.g:1316:1: ( ( rule__TableInputPath__PathPatternsAssignment_0 ) )
            // InternalTableDSL.g:1317:2: ( rule__TableInputPath__PathPatternsAssignment_0 )
            {
             before(grammarAccess.getTableInputPathAccess().getPathPatternsAssignment_0()); 
            // InternalTableDSL.g:1318:2: ( rule__TableInputPath__PathPatternsAssignment_0 )
            // InternalTableDSL.g:1318:3: rule__TableInputPath__PathPatternsAssignment_0
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
    // InternalTableDSL.g:1326:1: rule__TableInputPath__Group__1 : rule__TableInputPath__Group__1__Impl ;
    public final void rule__TableInputPath__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1330:1: ( rule__TableInputPath__Group__1__Impl )
            // InternalTableDSL.g:1331:2: rule__TableInputPath__Group__1__Impl
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
    // InternalTableDSL.g:1337:1: rule__TableInputPath__Group__1__Impl : ( ( rule__TableInputPath__Group_1__0 )* ) ;
    public final void rule__TableInputPath__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1341:1: ( ( ( rule__TableInputPath__Group_1__0 )* ) )
            // InternalTableDSL.g:1342:1: ( ( rule__TableInputPath__Group_1__0 )* )
            {
            // InternalTableDSL.g:1342:1: ( ( rule__TableInputPath__Group_1__0 )* )
            // InternalTableDSL.g:1343:2: ( rule__TableInputPath__Group_1__0 )*
            {
             before(grammarAccess.getTableInputPathAccess().getGroup_1()); 
            // InternalTableDSL.g:1344:2: ( rule__TableInputPath__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==22) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTableDSL.g:1344:3: rule__TableInputPath__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__TableInputPath__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalTableDSL.g:1353:1: rule__TableInputPath__Group_1__0 : rule__TableInputPath__Group_1__0__Impl rule__TableInputPath__Group_1__1 ;
    public final void rule__TableInputPath__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1357:1: ( rule__TableInputPath__Group_1__0__Impl rule__TableInputPath__Group_1__1 )
            // InternalTableDSL.g:1358:2: rule__TableInputPath__Group_1__0__Impl rule__TableInputPath__Group_1__1
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
    // InternalTableDSL.g:1365:1: rule__TableInputPath__Group_1__0__Impl : ( ',' ) ;
    public final void rule__TableInputPath__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1369:1: ( ( ',' ) )
            // InternalTableDSL.g:1370:1: ( ',' )
            {
            // InternalTableDSL.g:1370:1: ( ',' )
            // InternalTableDSL.g:1371:2: ','
            {
             before(grammarAccess.getTableInputPathAccess().getCommaKeyword_1_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalTableDSL.g:1380:1: rule__TableInputPath__Group_1__1 : rule__TableInputPath__Group_1__1__Impl ;
    public final void rule__TableInputPath__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1384:1: ( rule__TableInputPath__Group_1__1__Impl )
            // InternalTableDSL.g:1385:2: rule__TableInputPath__Group_1__1__Impl
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
    // InternalTableDSL.g:1391:1: rule__TableInputPath__Group_1__1__Impl : ( ( rule__TableInputPath__PathPatternsAssignment_1_1 ) ) ;
    public final void rule__TableInputPath__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1395:1: ( ( ( rule__TableInputPath__PathPatternsAssignment_1_1 ) ) )
            // InternalTableDSL.g:1396:1: ( ( rule__TableInputPath__PathPatternsAssignment_1_1 ) )
            {
            // InternalTableDSL.g:1396:1: ( ( rule__TableInputPath__PathPatternsAssignment_1_1 ) )
            // InternalTableDSL.g:1397:2: ( rule__TableInputPath__PathPatternsAssignment_1_1 )
            {
             before(grammarAccess.getTableInputPathAccess().getPathPatternsAssignment_1_1()); 
            // InternalTableDSL.g:1398:2: ( rule__TableInputPath__PathPatternsAssignment_1_1 )
            // InternalTableDSL.g:1398:3: rule__TableInputPath__PathPatternsAssignment_1_1
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
    // InternalTableDSL.g:1407:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1411:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // InternalTableDSL.g:1412:2: rule__Output__Group__0__Impl rule__Output__Group__1
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
    // InternalTableDSL.g:1419:1: rule__Output__Group__0__Impl : ( 'output' ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1423:1: ( ( 'output' ) )
            // InternalTableDSL.g:1424:1: ( 'output' )
            {
            // InternalTableDSL.g:1424:1: ( 'output' )
            // InternalTableDSL.g:1425:2: 'output'
            {
             before(grammarAccess.getOutputAccess().getOutputKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalTableDSL.g:1434:1: rule__Output__Group__1 : rule__Output__Group__1__Impl rule__Output__Group__2 ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1438:1: ( rule__Output__Group__1__Impl rule__Output__Group__2 )
            // InternalTableDSL.g:1439:2: rule__Output__Group__1__Impl rule__Output__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalTableDSL.g:1446:1: rule__Output__Group__1__Impl : ( ( 'to' )? ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1450:1: ( ( ( 'to' )? ) )
            // InternalTableDSL.g:1451:1: ( ( 'to' )? )
            {
            // InternalTableDSL.g:1451:1: ( ( 'to' )? )
            // InternalTableDSL.g:1452:2: ( 'to' )?
            {
             before(grammarAccess.getOutputAccess().getToKeyword_1()); 
            // InternalTableDSL.g:1453:2: ( 'to' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTableDSL.g:1453:3: 'to'
                    {
                    match(input,24,FOLLOW_2); 

                    }
                    break;

            }

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
    // InternalTableDSL.g:1461:1: rule__Output__Group__2 : rule__Output__Group__2__Impl rule__Output__Group__3 ;
    public final void rule__Output__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1465:1: ( rule__Output__Group__2__Impl rule__Output__Group__3 )
            // InternalTableDSL.g:1466:2: rule__Output__Group__2__Impl rule__Output__Group__3
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
    // InternalTableDSL.g:1473:1: rule__Output__Group__2__Impl : ( ( rule__Output__OutputPathsAssignment_2 ) ) ;
    public final void rule__Output__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1477:1: ( ( ( rule__Output__OutputPathsAssignment_2 ) ) )
            // InternalTableDSL.g:1478:1: ( ( rule__Output__OutputPathsAssignment_2 ) )
            {
            // InternalTableDSL.g:1478:1: ( ( rule__Output__OutputPathsAssignment_2 ) )
            // InternalTableDSL.g:1479:2: ( rule__Output__OutputPathsAssignment_2 )
            {
             before(grammarAccess.getOutputAccess().getOutputPathsAssignment_2()); 
            // InternalTableDSL.g:1480:2: ( rule__Output__OutputPathsAssignment_2 )
            // InternalTableDSL.g:1480:3: rule__Output__OutputPathsAssignment_2
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
    // InternalTableDSL.g:1488:1: rule__Output__Group__3 : rule__Output__Group__3__Impl ;
    public final void rule__Output__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1492:1: ( rule__Output__Group__3__Impl )
            // InternalTableDSL.g:1493:2: rule__Output__Group__3__Impl
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
    // InternalTableDSL.g:1499:1: rule__Output__Group__3__Impl : ( ( rule__Output__Group_3__0 )* ) ;
    public final void rule__Output__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1503:1: ( ( ( rule__Output__Group_3__0 )* ) )
            // InternalTableDSL.g:1504:1: ( ( rule__Output__Group_3__0 )* )
            {
            // InternalTableDSL.g:1504:1: ( ( rule__Output__Group_3__0 )* )
            // InternalTableDSL.g:1505:2: ( rule__Output__Group_3__0 )*
            {
             before(grammarAccess.getOutputAccess().getGroup_3()); 
            // InternalTableDSL.g:1506:2: ( rule__Output__Group_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==22) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalTableDSL.g:1506:3: rule__Output__Group_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Output__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalTableDSL.g:1515:1: rule__Output__Group_3__0 : rule__Output__Group_3__0__Impl rule__Output__Group_3__1 ;
    public final void rule__Output__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1519:1: ( rule__Output__Group_3__0__Impl rule__Output__Group_3__1 )
            // InternalTableDSL.g:1520:2: rule__Output__Group_3__0__Impl rule__Output__Group_3__1
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
    // InternalTableDSL.g:1527:1: rule__Output__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Output__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1531:1: ( ( ',' ) )
            // InternalTableDSL.g:1532:1: ( ',' )
            {
            // InternalTableDSL.g:1532:1: ( ',' )
            // InternalTableDSL.g:1533:2: ','
            {
             before(grammarAccess.getOutputAccess().getCommaKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalTableDSL.g:1542:1: rule__Output__Group_3__1 : rule__Output__Group_3__1__Impl ;
    public final void rule__Output__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1546:1: ( rule__Output__Group_3__1__Impl )
            // InternalTableDSL.g:1547:2: rule__Output__Group_3__1__Impl
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
    // InternalTableDSL.g:1553:1: rule__Output__Group_3__1__Impl : ( ( rule__Output__OutputPathsAssignment_3_1 ) ) ;
    public final void rule__Output__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1557:1: ( ( ( rule__Output__OutputPathsAssignment_3_1 ) ) )
            // InternalTableDSL.g:1558:1: ( ( rule__Output__OutputPathsAssignment_3_1 ) )
            {
            // InternalTableDSL.g:1558:1: ( ( rule__Output__OutputPathsAssignment_3_1 ) )
            // InternalTableDSL.g:1559:2: ( rule__Output__OutputPathsAssignment_3_1 )
            {
             before(grammarAccess.getOutputAccess().getOutputPathsAssignment_3_1()); 
            // InternalTableDSL.g:1560:2: ( rule__Output__OutputPathsAssignment_3_1 )
            // InternalTableDSL.g:1560:3: rule__Output__OutputPathsAssignment_3_1
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
    // InternalTableDSL.g:1569:1: rule__Select__Group__0 : rule__Select__Group__0__Impl rule__Select__Group__1 ;
    public final void rule__Select__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1573:1: ( rule__Select__Group__0__Impl rule__Select__Group__1 )
            // InternalTableDSL.g:1574:2: rule__Select__Group__0__Impl rule__Select__Group__1
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
    // InternalTableDSL.g:1581:1: rule__Select__Group__0__Impl : ( 'select' ) ;
    public final void rule__Select__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1585:1: ( ( 'select' ) )
            // InternalTableDSL.g:1586:1: ( 'select' )
            {
            // InternalTableDSL.g:1586:1: ( 'select' )
            // InternalTableDSL.g:1587:2: 'select'
            {
             before(grammarAccess.getSelectAccess().getSelectKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalTableDSL.g:1596:1: rule__Select__Group__1 : rule__Select__Group__1__Impl rule__Select__Group__2 ;
    public final void rule__Select__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1600:1: ( rule__Select__Group__1__Impl rule__Select__Group__2 )
            // InternalTableDSL.g:1601:2: rule__Select__Group__1__Impl rule__Select__Group__2
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
    // InternalTableDSL.g:1608:1: rule__Select__Group__1__Impl : ( ( rule__Select__ColumnPatternsAssignment_1 ) ) ;
    public final void rule__Select__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1612:1: ( ( ( rule__Select__ColumnPatternsAssignment_1 ) ) )
            // InternalTableDSL.g:1613:1: ( ( rule__Select__ColumnPatternsAssignment_1 ) )
            {
            // InternalTableDSL.g:1613:1: ( ( rule__Select__ColumnPatternsAssignment_1 ) )
            // InternalTableDSL.g:1614:2: ( rule__Select__ColumnPatternsAssignment_1 )
            {
             before(grammarAccess.getSelectAccess().getColumnPatternsAssignment_1()); 
            // InternalTableDSL.g:1615:2: ( rule__Select__ColumnPatternsAssignment_1 )
            // InternalTableDSL.g:1615:3: rule__Select__ColumnPatternsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Select__ColumnPatternsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getColumnPatternsAssignment_1()); 

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
    // InternalTableDSL.g:1623:1: rule__Select__Group__2 : rule__Select__Group__2__Impl ;
    public final void rule__Select__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1627:1: ( rule__Select__Group__2__Impl )
            // InternalTableDSL.g:1628:2: rule__Select__Group__2__Impl
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
    // InternalTableDSL.g:1634:1: rule__Select__Group__2__Impl : ( ( rule__Select__Group_2__0 )* ) ;
    public final void rule__Select__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1638:1: ( ( ( rule__Select__Group_2__0 )* ) )
            // InternalTableDSL.g:1639:1: ( ( rule__Select__Group_2__0 )* )
            {
            // InternalTableDSL.g:1639:1: ( ( rule__Select__Group_2__0 )* )
            // InternalTableDSL.g:1640:2: ( rule__Select__Group_2__0 )*
            {
             before(grammarAccess.getSelectAccess().getGroup_2()); 
            // InternalTableDSL.g:1641:2: ( rule__Select__Group_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==22) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalTableDSL.g:1641:3: rule__Select__Group_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Select__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalTableDSL.g:1650:1: rule__Select__Group_2__0 : rule__Select__Group_2__0__Impl rule__Select__Group_2__1 ;
    public final void rule__Select__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1654:1: ( rule__Select__Group_2__0__Impl rule__Select__Group_2__1 )
            // InternalTableDSL.g:1655:2: rule__Select__Group_2__0__Impl rule__Select__Group_2__1
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
    // InternalTableDSL.g:1662:1: rule__Select__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Select__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1666:1: ( ( ',' ) )
            // InternalTableDSL.g:1667:1: ( ',' )
            {
            // InternalTableDSL.g:1667:1: ( ',' )
            // InternalTableDSL.g:1668:2: ','
            {
             before(grammarAccess.getSelectAccess().getCommaKeyword_2_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalTableDSL.g:1677:1: rule__Select__Group_2__1 : rule__Select__Group_2__1__Impl ;
    public final void rule__Select__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1681:1: ( rule__Select__Group_2__1__Impl )
            // InternalTableDSL.g:1682:2: rule__Select__Group_2__1__Impl
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
    // InternalTableDSL.g:1688:1: rule__Select__Group_2__1__Impl : ( ( rule__Select__ColumnPatternsAssignment_2_1 ) ) ;
    public final void rule__Select__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1692:1: ( ( ( rule__Select__ColumnPatternsAssignment_2_1 ) ) )
            // InternalTableDSL.g:1693:1: ( ( rule__Select__ColumnPatternsAssignment_2_1 ) )
            {
            // InternalTableDSL.g:1693:1: ( ( rule__Select__ColumnPatternsAssignment_2_1 ) )
            // InternalTableDSL.g:1694:2: ( rule__Select__ColumnPatternsAssignment_2_1 )
            {
             before(grammarAccess.getSelectAccess().getColumnPatternsAssignment_2_1()); 
            // InternalTableDSL.g:1695:2: ( rule__Select__ColumnPatternsAssignment_2_1 )
            // InternalTableDSL.g:1695:3: rule__Select__ColumnPatternsAssignment_2_1
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
    // InternalTableDSL.g:1704:1: rule__RenameColumn__Group__0 : rule__RenameColumn__Group__0__Impl rule__RenameColumn__Group__1 ;
    public final void rule__RenameColumn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1708:1: ( rule__RenameColumn__Group__0__Impl rule__RenameColumn__Group__1 )
            // InternalTableDSL.g:1709:2: rule__RenameColumn__Group__0__Impl rule__RenameColumn__Group__1
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
    // InternalTableDSL.g:1716:1: rule__RenameColumn__Group__0__Impl : ( 'rename' ) ;
    public final void rule__RenameColumn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1720:1: ( ( 'rename' ) )
            // InternalTableDSL.g:1721:1: ( 'rename' )
            {
            // InternalTableDSL.g:1721:1: ( 'rename' )
            // InternalTableDSL.g:1722:2: 'rename'
            {
             before(grammarAccess.getRenameColumnAccess().getRenameKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalTableDSL.g:1731:1: rule__RenameColumn__Group__1 : rule__RenameColumn__Group__1__Impl rule__RenameColumn__Group__2 ;
    public final void rule__RenameColumn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1735:1: ( rule__RenameColumn__Group__1__Impl rule__RenameColumn__Group__2 )
            // InternalTableDSL.g:1736:2: rule__RenameColumn__Group__1__Impl rule__RenameColumn__Group__2
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
    // InternalTableDSL.g:1743:1: rule__RenameColumn__Group__1__Impl : ( ( 'column' )? ) ;
    public final void rule__RenameColumn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1747:1: ( ( ( 'column' )? ) )
            // InternalTableDSL.g:1748:1: ( ( 'column' )? )
            {
            // InternalTableDSL.g:1748:1: ( ( 'column' )? )
            // InternalTableDSL.g:1749:2: ( 'column' )?
            {
             before(grammarAccess.getRenameColumnAccess().getColumnKeyword_1()); 
            // InternalTableDSL.g:1750:2: ( 'column' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==14) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalTableDSL.g:1750:3: 'column'
                    {
                    match(input,14,FOLLOW_2); 

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
    // InternalTableDSL.g:1758:1: rule__RenameColumn__Group__2 : rule__RenameColumn__Group__2__Impl rule__RenameColumn__Group__3 ;
    public final void rule__RenameColumn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1762:1: ( rule__RenameColumn__Group__2__Impl rule__RenameColumn__Group__3 )
            // InternalTableDSL.g:1763:2: rule__RenameColumn__Group__2__Impl rule__RenameColumn__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__RenameColumn__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenameColumn__Group__3();

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
    // InternalTableDSL.g:1770:1: rule__RenameColumn__Group__2__Impl : ( ( rule__RenameColumn__RenameTuplesAssignment_2 ) ) ;
    public final void rule__RenameColumn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1774:1: ( ( ( rule__RenameColumn__RenameTuplesAssignment_2 ) ) )
            // InternalTableDSL.g:1775:1: ( ( rule__RenameColumn__RenameTuplesAssignment_2 ) )
            {
            // InternalTableDSL.g:1775:1: ( ( rule__RenameColumn__RenameTuplesAssignment_2 ) )
            // InternalTableDSL.g:1776:2: ( rule__RenameColumn__RenameTuplesAssignment_2 )
            {
             before(grammarAccess.getRenameColumnAccess().getRenameTuplesAssignment_2()); 
            // InternalTableDSL.g:1777:2: ( rule__RenameColumn__RenameTuplesAssignment_2 )
            // InternalTableDSL.g:1777:3: rule__RenameColumn__RenameTuplesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RenameColumn__RenameTuplesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRenameColumnAccess().getRenameTuplesAssignment_2()); 

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


    // $ANTLR start "rule__RenameColumn__Group__3"
    // InternalTableDSL.g:1785:1: rule__RenameColumn__Group__3 : rule__RenameColumn__Group__3__Impl ;
    public final void rule__RenameColumn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1789:1: ( rule__RenameColumn__Group__3__Impl )
            // InternalTableDSL.g:1790:2: rule__RenameColumn__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RenameColumn__Group__3__Impl();

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
    // $ANTLR end "rule__RenameColumn__Group__3"


    // $ANTLR start "rule__RenameColumn__Group__3__Impl"
    // InternalTableDSL.g:1796:1: rule__RenameColumn__Group__3__Impl : ( ( rule__RenameColumn__Group_3__0 )* ) ;
    public final void rule__RenameColumn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1800:1: ( ( ( rule__RenameColumn__Group_3__0 )* ) )
            // InternalTableDSL.g:1801:1: ( ( rule__RenameColumn__Group_3__0 )* )
            {
            // InternalTableDSL.g:1801:1: ( ( rule__RenameColumn__Group_3__0 )* )
            // InternalTableDSL.g:1802:2: ( rule__RenameColumn__Group_3__0 )*
            {
             before(grammarAccess.getRenameColumnAccess().getGroup_3()); 
            // InternalTableDSL.g:1803:2: ( rule__RenameColumn__Group_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==22) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalTableDSL.g:1803:3: rule__RenameColumn__Group_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__RenameColumn__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getRenameColumnAccess().getGroup_3()); 

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
    // $ANTLR end "rule__RenameColumn__Group__3__Impl"


    // $ANTLR start "rule__RenameColumn__Group_3__0"
    // InternalTableDSL.g:1812:1: rule__RenameColumn__Group_3__0 : rule__RenameColumn__Group_3__0__Impl rule__RenameColumn__Group_3__1 ;
    public final void rule__RenameColumn__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1816:1: ( rule__RenameColumn__Group_3__0__Impl rule__RenameColumn__Group_3__1 )
            // InternalTableDSL.g:1817:2: rule__RenameColumn__Group_3__0__Impl rule__RenameColumn__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__RenameColumn__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenameColumn__Group_3__1();

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
    // $ANTLR end "rule__RenameColumn__Group_3__0"


    // $ANTLR start "rule__RenameColumn__Group_3__0__Impl"
    // InternalTableDSL.g:1824:1: rule__RenameColumn__Group_3__0__Impl : ( ',' ) ;
    public final void rule__RenameColumn__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1828:1: ( ( ',' ) )
            // InternalTableDSL.g:1829:1: ( ',' )
            {
            // InternalTableDSL.g:1829:1: ( ',' )
            // InternalTableDSL.g:1830:2: ','
            {
             before(grammarAccess.getRenameColumnAccess().getCommaKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRenameColumnAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__RenameColumn__Group_3__0__Impl"


    // $ANTLR start "rule__RenameColumn__Group_3__1"
    // InternalTableDSL.g:1839:1: rule__RenameColumn__Group_3__1 : rule__RenameColumn__Group_3__1__Impl ;
    public final void rule__RenameColumn__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1843:1: ( rule__RenameColumn__Group_3__1__Impl )
            // InternalTableDSL.g:1844:2: rule__RenameColumn__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RenameColumn__Group_3__1__Impl();

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
    // $ANTLR end "rule__RenameColumn__Group_3__1"


    // $ANTLR start "rule__RenameColumn__Group_3__1__Impl"
    // InternalTableDSL.g:1850:1: rule__RenameColumn__Group_3__1__Impl : ( ( rule__RenameColumn__RenameTuplesAssignment_3_1 ) ) ;
    public final void rule__RenameColumn__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1854:1: ( ( ( rule__RenameColumn__RenameTuplesAssignment_3_1 ) ) )
            // InternalTableDSL.g:1855:1: ( ( rule__RenameColumn__RenameTuplesAssignment_3_1 ) )
            {
            // InternalTableDSL.g:1855:1: ( ( rule__RenameColumn__RenameTuplesAssignment_3_1 ) )
            // InternalTableDSL.g:1856:2: ( rule__RenameColumn__RenameTuplesAssignment_3_1 )
            {
             before(grammarAccess.getRenameColumnAccess().getRenameTuplesAssignment_3_1()); 
            // InternalTableDSL.g:1857:2: ( rule__RenameColumn__RenameTuplesAssignment_3_1 )
            // InternalTableDSL.g:1857:3: rule__RenameColumn__RenameTuplesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RenameColumn__RenameTuplesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRenameColumnAccess().getRenameTuplesAssignment_3_1()); 

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
    // $ANTLR end "rule__RenameColumn__Group_3__1__Impl"


    // $ANTLR start "rule__RenameColumnToPair__Group__0"
    // InternalTableDSL.g:1866:1: rule__RenameColumnToPair__Group__0 : rule__RenameColumnToPair__Group__0__Impl rule__RenameColumnToPair__Group__1 ;
    public final void rule__RenameColumnToPair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1870:1: ( rule__RenameColumnToPair__Group__0__Impl rule__RenameColumnToPair__Group__1 )
            // InternalTableDSL.g:1871:2: rule__RenameColumnToPair__Group__0__Impl rule__RenameColumnToPair__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalTableDSL.g:1878:1: rule__RenameColumnToPair__Group__0__Impl : ( ( rule__RenameColumnToPair__OldNameAssignment_0 ) ) ;
    public final void rule__RenameColumnToPair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1882:1: ( ( ( rule__RenameColumnToPair__OldNameAssignment_0 ) ) )
            // InternalTableDSL.g:1883:1: ( ( rule__RenameColumnToPair__OldNameAssignment_0 ) )
            {
            // InternalTableDSL.g:1883:1: ( ( rule__RenameColumnToPair__OldNameAssignment_0 ) )
            // InternalTableDSL.g:1884:2: ( rule__RenameColumnToPair__OldNameAssignment_0 )
            {
             before(grammarAccess.getRenameColumnToPairAccess().getOldNameAssignment_0()); 
            // InternalTableDSL.g:1885:2: ( rule__RenameColumnToPair__OldNameAssignment_0 )
            // InternalTableDSL.g:1885:3: rule__RenameColumnToPair__OldNameAssignment_0
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
    // InternalTableDSL.g:1893:1: rule__RenameColumnToPair__Group__1 : rule__RenameColumnToPair__Group__1__Impl rule__RenameColumnToPair__Group__2 ;
    public final void rule__RenameColumnToPair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1897:1: ( rule__RenameColumnToPair__Group__1__Impl rule__RenameColumnToPair__Group__2 )
            // InternalTableDSL.g:1898:2: rule__RenameColumnToPair__Group__1__Impl rule__RenameColumnToPair__Group__2
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
    // InternalTableDSL.g:1905:1: rule__RenameColumnToPair__Group__1__Impl : ( 'to' ) ;
    public final void rule__RenameColumnToPair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1909:1: ( ( 'to' ) )
            // InternalTableDSL.g:1910:1: ( 'to' )
            {
            // InternalTableDSL.g:1910:1: ( 'to' )
            // InternalTableDSL.g:1911:2: 'to'
            {
             before(grammarAccess.getRenameColumnToPairAccess().getToKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalTableDSL.g:1920:1: rule__RenameColumnToPair__Group__2 : rule__RenameColumnToPair__Group__2__Impl ;
    public final void rule__RenameColumnToPair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1924:1: ( rule__RenameColumnToPair__Group__2__Impl )
            // InternalTableDSL.g:1925:2: rule__RenameColumnToPair__Group__2__Impl
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
    // InternalTableDSL.g:1931:1: rule__RenameColumnToPair__Group__2__Impl : ( ( rule__RenameColumnToPair__NewNameAssignment_2 ) ) ;
    public final void rule__RenameColumnToPair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1935:1: ( ( ( rule__RenameColumnToPair__NewNameAssignment_2 ) ) )
            // InternalTableDSL.g:1936:1: ( ( rule__RenameColumnToPair__NewNameAssignment_2 ) )
            {
            // InternalTableDSL.g:1936:1: ( ( rule__RenameColumnToPair__NewNameAssignment_2 ) )
            // InternalTableDSL.g:1937:2: ( rule__RenameColumnToPair__NewNameAssignment_2 )
            {
             before(grammarAccess.getRenameColumnToPairAccess().getNewNameAssignment_2()); 
            // InternalTableDSL.g:1938:2: ( rule__RenameColumnToPair__NewNameAssignment_2 )
            // InternalTableDSL.g:1938:3: rule__RenameColumnToPair__NewNameAssignment_2
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
    // InternalTableDSL.g:1947:1: rule__RenameColumnPrependPair__Group__0 : rule__RenameColumnPrependPair__Group__0__Impl rule__RenameColumnPrependPair__Group__1 ;
    public final void rule__RenameColumnPrependPair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1951:1: ( rule__RenameColumnPrependPair__Group__0__Impl rule__RenameColumnPrependPair__Group__1 )
            // InternalTableDSL.g:1952:2: rule__RenameColumnPrependPair__Group__0__Impl rule__RenameColumnPrependPair__Group__1
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
    // InternalTableDSL.g:1959:1: rule__RenameColumnPrependPair__Group__0__Impl : ( ( rule__RenameColumnPrependPair__OldNameAssignment_0 ) ) ;
    public final void rule__RenameColumnPrependPair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1963:1: ( ( ( rule__RenameColumnPrependPair__OldNameAssignment_0 ) ) )
            // InternalTableDSL.g:1964:1: ( ( rule__RenameColumnPrependPair__OldNameAssignment_0 ) )
            {
            // InternalTableDSL.g:1964:1: ( ( rule__RenameColumnPrependPair__OldNameAssignment_0 ) )
            // InternalTableDSL.g:1965:2: ( rule__RenameColumnPrependPair__OldNameAssignment_0 )
            {
             before(grammarAccess.getRenameColumnPrependPairAccess().getOldNameAssignment_0()); 
            // InternalTableDSL.g:1966:2: ( rule__RenameColumnPrependPair__OldNameAssignment_0 )
            // InternalTableDSL.g:1966:3: rule__RenameColumnPrependPair__OldNameAssignment_0
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
    // InternalTableDSL.g:1974:1: rule__RenameColumnPrependPair__Group__1 : rule__RenameColumnPrependPair__Group__1__Impl rule__RenameColumnPrependPair__Group__2 ;
    public final void rule__RenameColumnPrependPair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1978:1: ( rule__RenameColumnPrependPair__Group__1__Impl rule__RenameColumnPrependPair__Group__2 )
            // InternalTableDSL.g:1979:2: rule__RenameColumnPrependPair__Group__1__Impl rule__RenameColumnPrependPair__Group__2
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
    // InternalTableDSL.g:1986:1: rule__RenameColumnPrependPair__Group__1__Impl : ( 'prepend' ) ;
    public final void rule__RenameColumnPrependPair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1990:1: ( ( 'prepend' ) )
            // InternalTableDSL.g:1991:1: ( 'prepend' )
            {
            // InternalTableDSL.g:1991:1: ( 'prepend' )
            // InternalTableDSL.g:1992:2: 'prepend'
            {
             before(grammarAccess.getRenameColumnPrependPairAccess().getPrependKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalTableDSL.g:2001:1: rule__RenameColumnPrependPair__Group__2 : rule__RenameColumnPrependPair__Group__2__Impl ;
    public final void rule__RenameColumnPrependPair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2005:1: ( rule__RenameColumnPrependPair__Group__2__Impl )
            // InternalTableDSL.g:2006:2: rule__RenameColumnPrependPair__Group__2__Impl
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
    // InternalTableDSL.g:2012:1: rule__RenameColumnPrependPair__Group__2__Impl : ( ( rule__RenameColumnPrependPair__PrefixAssignment_2 ) ) ;
    public final void rule__RenameColumnPrependPair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2016:1: ( ( ( rule__RenameColumnPrependPair__PrefixAssignment_2 ) ) )
            // InternalTableDSL.g:2017:1: ( ( rule__RenameColumnPrependPair__PrefixAssignment_2 ) )
            {
            // InternalTableDSL.g:2017:1: ( ( rule__RenameColumnPrependPair__PrefixAssignment_2 ) )
            // InternalTableDSL.g:2018:2: ( rule__RenameColumnPrependPair__PrefixAssignment_2 )
            {
             before(grammarAccess.getRenameColumnPrependPairAccess().getPrefixAssignment_2()); 
            // InternalTableDSL.g:2019:2: ( rule__RenameColumnPrependPair__PrefixAssignment_2 )
            // InternalTableDSL.g:2019:3: rule__RenameColumnPrependPair__PrefixAssignment_2
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
    // InternalTableDSL.g:2028:1: rule__RenameColumnAppendPair__Group__0 : rule__RenameColumnAppendPair__Group__0__Impl rule__RenameColumnAppendPair__Group__1 ;
    public final void rule__RenameColumnAppendPair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2032:1: ( rule__RenameColumnAppendPair__Group__0__Impl rule__RenameColumnAppendPair__Group__1 )
            // InternalTableDSL.g:2033:2: rule__RenameColumnAppendPair__Group__0__Impl rule__RenameColumnAppendPair__Group__1
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
    // InternalTableDSL.g:2040:1: rule__RenameColumnAppendPair__Group__0__Impl : ( ( rule__RenameColumnAppendPair__OldNameAssignment_0 ) ) ;
    public final void rule__RenameColumnAppendPair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2044:1: ( ( ( rule__RenameColumnAppendPair__OldNameAssignment_0 ) ) )
            // InternalTableDSL.g:2045:1: ( ( rule__RenameColumnAppendPair__OldNameAssignment_0 ) )
            {
            // InternalTableDSL.g:2045:1: ( ( rule__RenameColumnAppendPair__OldNameAssignment_0 ) )
            // InternalTableDSL.g:2046:2: ( rule__RenameColumnAppendPair__OldNameAssignment_0 )
            {
             before(grammarAccess.getRenameColumnAppendPairAccess().getOldNameAssignment_0()); 
            // InternalTableDSL.g:2047:2: ( rule__RenameColumnAppendPair__OldNameAssignment_0 )
            // InternalTableDSL.g:2047:3: rule__RenameColumnAppendPair__OldNameAssignment_0
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
    // InternalTableDSL.g:2055:1: rule__RenameColumnAppendPair__Group__1 : rule__RenameColumnAppendPair__Group__1__Impl rule__RenameColumnAppendPair__Group__2 ;
    public final void rule__RenameColumnAppendPair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2059:1: ( rule__RenameColumnAppendPair__Group__1__Impl rule__RenameColumnAppendPair__Group__2 )
            // InternalTableDSL.g:2060:2: rule__RenameColumnAppendPair__Group__1__Impl rule__RenameColumnAppendPair__Group__2
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
    // InternalTableDSL.g:2067:1: rule__RenameColumnAppendPair__Group__1__Impl : ( 'append' ) ;
    public final void rule__RenameColumnAppendPair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2071:1: ( ( 'append' ) )
            // InternalTableDSL.g:2072:1: ( 'append' )
            {
            // InternalTableDSL.g:2072:1: ( 'append' )
            // InternalTableDSL.g:2073:2: 'append'
            {
             before(grammarAccess.getRenameColumnAppendPairAccess().getAppendKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalTableDSL.g:2082:1: rule__RenameColumnAppendPair__Group__2 : rule__RenameColumnAppendPair__Group__2__Impl ;
    public final void rule__RenameColumnAppendPair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2086:1: ( rule__RenameColumnAppendPair__Group__2__Impl )
            // InternalTableDSL.g:2087:2: rule__RenameColumnAppendPair__Group__2__Impl
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
    // InternalTableDSL.g:2093:1: rule__RenameColumnAppendPair__Group__2__Impl : ( ( rule__RenameColumnAppendPair__SuffixAssignment_2 ) ) ;
    public final void rule__RenameColumnAppendPair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2097:1: ( ( ( rule__RenameColumnAppendPair__SuffixAssignment_2 ) ) )
            // InternalTableDSL.g:2098:1: ( ( rule__RenameColumnAppendPair__SuffixAssignment_2 ) )
            {
            // InternalTableDSL.g:2098:1: ( ( rule__RenameColumnAppendPair__SuffixAssignment_2 ) )
            // InternalTableDSL.g:2099:2: ( rule__RenameColumnAppendPair__SuffixAssignment_2 )
            {
             before(grammarAccess.getRenameColumnAppendPairAccess().getSuffixAssignment_2()); 
            // InternalTableDSL.g:2100:2: ( rule__RenameColumnAppendPair__SuffixAssignment_2 )
            // InternalTableDSL.g:2100:3: rule__RenameColumnAppendPair__SuffixAssignment_2
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
    // InternalTableDSL.g:2109:1: rule__Extract__Group__0 : rule__Extract__Group__0__Impl rule__Extract__Group__1 ;
    public final void rule__Extract__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2113:1: ( rule__Extract__Group__0__Impl rule__Extract__Group__1 )
            // InternalTableDSL.g:2114:2: rule__Extract__Group__0__Impl rule__Extract__Group__1
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
    // InternalTableDSL.g:2121:1: rule__Extract__Group__0__Impl : ( 'extract' ) ;
    public final void rule__Extract__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2125:1: ( ( 'extract' ) )
            // InternalTableDSL.g:2126:1: ( 'extract' )
            {
            // InternalTableDSL.g:2126:1: ( 'extract' )
            // InternalTableDSL.g:2127:2: 'extract'
            {
             before(grammarAccess.getExtractAccess().getExtractKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalTableDSL.g:2136:1: rule__Extract__Group__1 : rule__Extract__Group__1__Impl rule__Extract__Group__2 ;
    public final void rule__Extract__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2140:1: ( rule__Extract__Group__1__Impl rule__Extract__Group__2 )
            // InternalTableDSL.g:2141:2: rule__Extract__Group__1__Impl rule__Extract__Group__2
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
    // InternalTableDSL.g:2148:1: rule__Extract__Group__1__Impl : ( ( rule__Extract__TargetsAssignment_1 ) ) ;
    public final void rule__Extract__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2152:1: ( ( ( rule__Extract__TargetsAssignment_1 ) ) )
            // InternalTableDSL.g:2153:1: ( ( rule__Extract__TargetsAssignment_1 ) )
            {
            // InternalTableDSL.g:2153:1: ( ( rule__Extract__TargetsAssignment_1 ) )
            // InternalTableDSL.g:2154:2: ( rule__Extract__TargetsAssignment_1 )
            {
             before(grammarAccess.getExtractAccess().getTargetsAssignment_1()); 
            // InternalTableDSL.g:2155:2: ( rule__Extract__TargetsAssignment_1 )
            // InternalTableDSL.g:2155:3: rule__Extract__TargetsAssignment_1
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
    // InternalTableDSL.g:2163:1: rule__Extract__Group__2 : rule__Extract__Group__2__Impl rule__Extract__Group__3 ;
    public final void rule__Extract__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2167:1: ( rule__Extract__Group__2__Impl rule__Extract__Group__3 )
            // InternalTableDSL.g:2168:2: rule__Extract__Group__2__Impl rule__Extract__Group__3
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
    // InternalTableDSL.g:2175:1: rule__Extract__Group__2__Impl : ( ( rule__Extract__Group_2__0 )* ) ;
    public final void rule__Extract__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2179:1: ( ( ( rule__Extract__Group_2__0 )* ) )
            // InternalTableDSL.g:2180:1: ( ( rule__Extract__Group_2__0 )* )
            {
            // InternalTableDSL.g:2180:1: ( ( rule__Extract__Group_2__0 )* )
            // InternalTableDSL.g:2181:2: ( rule__Extract__Group_2__0 )*
            {
             before(grammarAccess.getExtractAccess().getGroup_2()); 
            // InternalTableDSL.g:2182:2: ( rule__Extract__Group_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==22) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalTableDSL.g:2182:3: rule__Extract__Group_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Extract__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalTableDSL.g:2190:1: rule__Extract__Group__3 : rule__Extract__Group__3__Impl rule__Extract__Group__4 ;
    public final void rule__Extract__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2194:1: ( rule__Extract__Group__3__Impl rule__Extract__Group__4 )
            // InternalTableDSL.g:2195:2: rule__Extract__Group__3__Impl rule__Extract__Group__4
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
    // InternalTableDSL.g:2202:1: rule__Extract__Group__3__Impl : ( 'from' ) ;
    public final void rule__Extract__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2206:1: ( ( 'from' ) )
            // InternalTableDSL.g:2207:1: ( 'from' )
            {
            // InternalTableDSL.g:2207:1: ( 'from' )
            // InternalTableDSL.g:2208:2: 'from'
            {
             before(grammarAccess.getExtractAccess().getFromKeyword_3()); 
            match(input,20,FOLLOW_2); 
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
    // InternalTableDSL.g:2217:1: rule__Extract__Group__4 : rule__Extract__Group__4__Impl rule__Extract__Group__5 ;
    public final void rule__Extract__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2221:1: ( rule__Extract__Group__4__Impl rule__Extract__Group__5 )
            // InternalTableDSL.g:2222:2: rule__Extract__Group__4__Impl rule__Extract__Group__5
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
    // InternalTableDSL.g:2229:1: rule__Extract__Group__4__Impl : ( ( rule__Extract__SourceColumnAssignment_4 ) ) ;
    public final void rule__Extract__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2233:1: ( ( ( rule__Extract__SourceColumnAssignment_4 ) ) )
            // InternalTableDSL.g:2234:1: ( ( rule__Extract__SourceColumnAssignment_4 ) )
            {
            // InternalTableDSL.g:2234:1: ( ( rule__Extract__SourceColumnAssignment_4 ) )
            // InternalTableDSL.g:2235:2: ( rule__Extract__SourceColumnAssignment_4 )
            {
             before(grammarAccess.getExtractAccess().getSourceColumnAssignment_4()); 
            // InternalTableDSL.g:2236:2: ( rule__Extract__SourceColumnAssignment_4 )
            // InternalTableDSL.g:2236:3: rule__Extract__SourceColumnAssignment_4
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
    // InternalTableDSL.g:2244:1: rule__Extract__Group__5 : rule__Extract__Group__5__Impl rule__Extract__Group__6 ;
    public final void rule__Extract__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2248:1: ( rule__Extract__Group__5__Impl rule__Extract__Group__6 )
            // InternalTableDSL.g:2249:2: rule__Extract__Group__5__Impl rule__Extract__Group__6
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
    // InternalTableDSL.g:2256:1: rule__Extract__Group__5__Impl : ( 'select' ) ;
    public final void rule__Extract__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2260:1: ( ( 'select' ) )
            // InternalTableDSL.g:2261:1: ( 'select' )
            {
            // InternalTableDSL.g:2261:1: ( 'select' )
            // InternalTableDSL.g:2262:2: 'select'
            {
             before(grammarAccess.getExtractAccess().getSelectKeyword_5()); 
            match(input,25,FOLLOW_2); 
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
    // InternalTableDSL.g:2271:1: rule__Extract__Group__6 : rule__Extract__Group__6__Impl rule__Extract__Group__7 ;
    public final void rule__Extract__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2275:1: ( rule__Extract__Group__6__Impl rule__Extract__Group__7 )
            // InternalTableDSL.g:2276:2: rule__Extract__Group__6__Impl rule__Extract__Group__7
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
    // InternalTableDSL.g:2283:1: rule__Extract__Group__6__Impl : ( ( rule__Extract__SelectorAssignment_6 ) ) ;
    public final void rule__Extract__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2287:1: ( ( ( rule__Extract__SelectorAssignment_6 ) ) )
            // InternalTableDSL.g:2288:1: ( ( rule__Extract__SelectorAssignment_6 ) )
            {
            // InternalTableDSL.g:2288:1: ( ( rule__Extract__SelectorAssignment_6 ) )
            // InternalTableDSL.g:2289:2: ( rule__Extract__SelectorAssignment_6 )
            {
             before(grammarAccess.getExtractAccess().getSelectorAssignment_6()); 
            // InternalTableDSL.g:2290:2: ( rule__Extract__SelectorAssignment_6 )
            // InternalTableDSL.g:2290:3: rule__Extract__SelectorAssignment_6
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
    // InternalTableDSL.g:2298:1: rule__Extract__Group__7 : rule__Extract__Group__7__Impl rule__Extract__Group__8 ;
    public final void rule__Extract__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2302:1: ( rule__Extract__Group__7__Impl rule__Extract__Group__8 )
            // InternalTableDSL.g:2303:2: rule__Extract__Group__7__Impl rule__Extract__Group__8
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
    // InternalTableDSL.g:2310:1: rule__Extract__Group__7__Impl : ( 'sort' ) ;
    public final void rule__Extract__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2314:1: ( ( 'sort' ) )
            // InternalTableDSL.g:2315:1: ( 'sort' )
            {
            // InternalTableDSL.g:2315:1: ( 'sort' )
            // InternalTableDSL.g:2316:2: 'sort'
            {
             before(grammarAccess.getExtractAccess().getSortKeyword_7()); 
            match(input,30,FOLLOW_2); 
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
    // InternalTableDSL.g:2325:1: rule__Extract__Group__8 : rule__Extract__Group__8__Impl rule__Extract__Group__9 ;
    public final void rule__Extract__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2329:1: ( rule__Extract__Group__8__Impl rule__Extract__Group__9 )
            // InternalTableDSL.g:2330:2: rule__Extract__Group__8__Impl rule__Extract__Group__9
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
    // InternalTableDSL.g:2337:1: rule__Extract__Group__8__Impl : ( ( 'by' )? ) ;
    public final void rule__Extract__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2341:1: ( ( ( 'by' )? ) )
            // InternalTableDSL.g:2342:1: ( ( 'by' )? )
            {
            // InternalTableDSL.g:2342:1: ( ( 'by' )? )
            // InternalTableDSL.g:2343:2: ( 'by' )?
            {
             before(grammarAccess.getExtractAccess().getByKeyword_8()); 
            // InternalTableDSL.g:2344:2: ( 'by' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalTableDSL.g:2344:3: 'by'
                    {
                    match(input,31,FOLLOW_2); 

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
    // InternalTableDSL.g:2352:1: rule__Extract__Group__9 : rule__Extract__Group__9__Impl ;
    public final void rule__Extract__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2356:1: ( rule__Extract__Group__9__Impl )
            // InternalTableDSL.g:2357:2: rule__Extract__Group__9__Impl
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
    // InternalTableDSL.g:2363:1: rule__Extract__Group__9__Impl : ( ( rule__Extract__ComparatorAssignment_9 ) ) ;
    public final void rule__Extract__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2367:1: ( ( ( rule__Extract__ComparatorAssignment_9 ) ) )
            // InternalTableDSL.g:2368:1: ( ( rule__Extract__ComparatorAssignment_9 ) )
            {
            // InternalTableDSL.g:2368:1: ( ( rule__Extract__ComparatorAssignment_9 ) )
            // InternalTableDSL.g:2369:2: ( rule__Extract__ComparatorAssignment_9 )
            {
             before(grammarAccess.getExtractAccess().getComparatorAssignment_9()); 
            // InternalTableDSL.g:2370:2: ( rule__Extract__ComparatorAssignment_9 )
            // InternalTableDSL.g:2370:3: rule__Extract__ComparatorAssignment_9
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
    // InternalTableDSL.g:2379:1: rule__Extract__Group_2__0 : rule__Extract__Group_2__0__Impl rule__Extract__Group_2__1 ;
    public final void rule__Extract__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2383:1: ( rule__Extract__Group_2__0__Impl rule__Extract__Group_2__1 )
            // InternalTableDSL.g:2384:2: rule__Extract__Group_2__0__Impl rule__Extract__Group_2__1
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
    // InternalTableDSL.g:2391:1: rule__Extract__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Extract__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2395:1: ( ( ',' ) )
            // InternalTableDSL.g:2396:1: ( ',' )
            {
            // InternalTableDSL.g:2396:1: ( ',' )
            // InternalTableDSL.g:2397:2: ','
            {
             before(grammarAccess.getExtractAccess().getCommaKeyword_2_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalTableDSL.g:2406:1: rule__Extract__Group_2__1 : rule__Extract__Group_2__1__Impl ;
    public final void rule__Extract__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2410:1: ( rule__Extract__Group_2__1__Impl )
            // InternalTableDSL.g:2411:2: rule__Extract__Group_2__1__Impl
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
    // InternalTableDSL.g:2417:1: rule__Extract__Group_2__1__Impl : ( ( rule__Extract__TargetsAssignment_2_1 ) ) ;
    public final void rule__Extract__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2421:1: ( ( ( rule__Extract__TargetsAssignment_2_1 ) ) )
            // InternalTableDSL.g:2422:1: ( ( rule__Extract__TargetsAssignment_2_1 ) )
            {
            // InternalTableDSL.g:2422:1: ( ( rule__Extract__TargetsAssignment_2_1 ) )
            // InternalTableDSL.g:2423:2: ( rule__Extract__TargetsAssignment_2_1 )
            {
             before(grammarAccess.getExtractAccess().getTargetsAssignment_2_1()); 
            // InternalTableDSL.g:2424:2: ( rule__Extract__TargetsAssignment_2_1 )
            // InternalTableDSL.g:2424:3: rule__Extract__TargetsAssignment_2_1
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
    // InternalTableDSL.g:2433:1: rule__ExtractColumnMapping__Group__0 : rule__ExtractColumnMapping__Group__0__Impl rule__ExtractColumnMapping__Group__1 ;
    public final void rule__ExtractColumnMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2437:1: ( rule__ExtractColumnMapping__Group__0__Impl rule__ExtractColumnMapping__Group__1 )
            // InternalTableDSL.g:2438:2: rule__ExtractColumnMapping__Group__0__Impl rule__ExtractColumnMapping__Group__1
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
    // InternalTableDSL.g:2445:1: rule__ExtractColumnMapping__Group__0__Impl : ( ( rule__ExtractColumnMapping__TargetColumnAssignment_0 ) ) ;
    public final void rule__ExtractColumnMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2449:1: ( ( ( rule__ExtractColumnMapping__TargetColumnAssignment_0 ) ) )
            // InternalTableDSL.g:2450:1: ( ( rule__ExtractColumnMapping__TargetColumnAssignment_0 ) )
            {
            // InternalTableDSL.g:2450:1: ( ( rule__ExtractColumnMapping__TargetColumnAssignment_0 ) )
            // InternalTableDSL.g:2451:2: ( rule__ExtractColumnMapping__TargetColumnAssignment_0 )
            {
             before(grammarAccess.getExtractColumnMappingAccess().getTargetColumnAssignment_0()); 
            // InternalTableDSL.g:2452:2: ( rule__ExtractColumnMapping__TargetColumnAssignment_0 )
            // InternalTableDSL.g:2452:3: rule__ExtractColumnMapping__TargetColumnAssignment_0
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
    // InternalTableDSL.g:2460:1: rule__ExtractColumnMapping__Group__1 : rule__ExtractColumnMapping__Group__1__Impl ;
    public final void rule__ExtractColumnMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2464:1: ( rule__ExtractColumnMapping__Group__1__Impl )
            // InternalTableDSL.g:2465:2: rule__ExtractColumnMapping__Group__1__Impl
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
    // InternalTableDSL.g:2471:1: rule__ExtractColumnMapping__Group__1__Impl : ( ( rule__ExtractColumnMapping__Group_1__0 )? ) ;
    public final void rule__ExtractColumnMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2475:1: ( ( ( rule__ExtractColumnMapping__Group_1__0 )? ) )
            // InternalTableDSL.g:2476:1: ( ( rule__ExtractColumnMapping__Group_1__0 )? )
            {
            // InternalTableDSL.g:2476:1: ( ( rule__ExtractColumnMapping__Group_1__0 )? )
            // InternalTableDSL.g:2477:2: ( rule__ExtractColumnMapping__Group_1__0 )?
            {
             before(grammarAccess.getExtractColumnMappingAccess().getGroup_1()); 
            // InternalTableDSL.g:2478:2: ( rule__ExtractColumnMapping__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalTableDSL.g:2478:3: rule__ExtractColumnMapping__Group_1__0
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
    // InternalTableDSL.g:2487:1: rule__ExtractColumnMapping__Group_1__0 : rule__ExtractColumnMapping__Group_1__0__Impl rule__ExtractColumnMapping__Group_1__1 ;
    public final void rule__ExtractColumnMapping__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2491:1: ( rule__ExtractColumnMapping__Group_1__0__Impl rule__ExtractColumnMapping__Group_1__1 )
            // InternalTableDSL.g:2492:2: rule__ExtractColumnMapping__Group_1__0__Impl rule__ExtractColumnMapping__Group_1__1
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
    // InternalTableDSL.g:2499:1: rule__ExtractColumnMapping__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__ExtractColumnMapping__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2503:1: ( ( 'as' ) )
            // InternalTableDSL.g:2504:1: ( 'as' )
            {
            // InternalTableDSL.g:2504:1: ( 'as' )
            // InternalTableDSL.g:2505:2: 'as'
            {
             before(grammarAccess.getExtractColumnMappingAccess().getAsKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalTableDSL.g:2514:1: rule__ExtractColumnMapping__Group_1__1 : rule__ExtractColumnMapping__Group_1__1__Impl ;
    public final void rule__ExtractColumnMapping__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2518:1: ( rule__ExtractColumnMapping__Group_1__1__Impl )
            // InternalTableDSL.g:2519:2: rule__ExtractColumnMapping__Group_1__1__Impl
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
    // InternalTableDSL.g:2525:1: rule__ExtractColumnMapping__Group_1__1__Impl : ( ( rule__ExtractColumnMapping__NewNameAssignment_1_1 ) ) ;
    public final void rule__ExtractColumnMapping__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2529:1: ( ( ( rule__ExtractColumnMapping__NewNameAssignment_1_1 ) ) )
            // InternalTableDSL.g:2530:1: ( ( rule__ExtractColumnMapping__NewNameAssignment_1_1 ) )
            {
            // InternalTableDSL.g:2530:1: ( ( rule__ExtractColumnMapping__NewNameAssignment_1_1 ) )
            // InternalTableDSL.g:2531:2: ( rule__ExtractColumnMapping__NewNameAssignment_1_1 )
            {
             before(grammarAccess.getExtractColumnMappingAccess().getNewNameAssignment_1_1()); 
            // InternalTableDSL.g:2532:2: ( rule__ExtractColumnMapping__NewNameAssignment_1_1 )
            // InternalTableDSL.g:2532:3: rule__ExtractColumnMapping__NewNameAssignment_1_1
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
    // InternalTableDSL.g:2541:1: rule__TopNSelector__Group__0 : rule__TopNSelector__Group__0__Impl rule__TopNSelector__Group__1 ;
    public final void rule__TopNSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2545:1: ( rule__TopNSelector__Group__0__Impl rule__TopNSelector__Group__1 )
            // InternalTableDSL.g:2546:2: rule__TopNSelector__Group__0__Impl rule__TopNSelector__Group__1
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
    // InternalTableDSL.g:2553:1: rule__TopNSelector__Group__0__Impl : ( 'TOP' ) ;
    public final void rule__TopNSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2557:1: ( ( 'TOP' ) )
            // InternalTableDSL.g:2558:1: ( 'TOP' )
            {
            // InternalTableDSL.g:2558:1: ( 'TOP' )
            // InternalTableDSL.g:2559:2: 'TOP'
            {
             before(grammarAccess.getTopNSelectorAccess().getTOPKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalTableDSL.g:2568:1: rule__TopNSelector__Group__1 : rule__TopNSelector__Group__1__Impl ;
    public final void rule__TopNSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2572:1: ( rule__TopNSelector__Group__1__Impl )
            // InternalTableDSL.g:2573:2: rule__TopNSelector__Group__1__Impl
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
    // InternalTableDSL.g:2579:1: rule__TopNSelector__Group__1__Impl : ( ( rule__TopNSelector__NAssignment_1 ) ) ;
    public final void rule__TopNSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2583:1: ( ( ( rule__TopNSelector__NAssignment_1 ) ) )
            // InternalTableDSL.g:2584:1: ( ( rule__TopNSelector__NAssignment_1 ) )
            {
            // InternalTableDSL.g:2584:1: ( ( rule__TopNSelector__NAssignment_1 ) )
            // InternalTableDSL.g:2585:2: ( rule__TopNSelector__NAssignment_1 )
            {
             before(grammarAccess.getTopNSelectorAccess().getNAssignment_1()); 
            // InternalTableDSL.g:2586:2: ( rule__TopNSelector__NAssignment_1 )
            // InternalTableDSL.g:2586:3: rule__TopNSelector__NAssignment_1
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
    // InternalTableDSL.g:2595:1: rule__Comparator__Group__0 : rule__Comparator__Group__0__Impl rule__Comparator__Group__1 ;
    public final void rule__Comparator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2599:1: ( rule__Comparator__Group__0__Impl rule__Comparator__Group__1 )
            // InternalTableDSL.g:2600:2: rule__Comparator__Group__0__Impl rule__Comparator__Group__1
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
    // InternalTableDSL.g:2607:1: rule__Comparator__Group__0__Impl : ( ( rule__Comparator__KeysAssignment_0 ) ) ;
    public final void rule__Comparator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2611:1: ( ( ( rule__Comparator__KeysAssignment_0 ) ) )
            // InternalTableDSL.g:2612:1: ( ( rule__Comparator__KeysAssignment_0 ) )
            {
            // InternalTableDSL.g:2612:1: ( ( rule__Comparator__KeysAssignment_0 ) )
            // InternalTableDSL.g:2613:2: ( rule__Comparator__KeysAssignment_0 )
            {
             before(grammarAccess.getComparatorAccess().getKeysAssignment_0()); 
            // InternalTableDSL.g:2614:2: ( rule__Comparator__KeysAssignment_0 )
            // InternalTableDSL.g:2614:3: rule__Comparator__KeysAssignment_0
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
    // InternalTableDSL.g:2622:1: rule__Comparator__Group__1 : rule__Comparator__Group__1__Impl ;
    public final void rule__Comparator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2626:1: ( rule__Comparator__Group__1__Impl )
            // InternalTableDSL.g:2627:2: rule__Comparator__Group__1__Impl
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
    // InternalTableDSL.g:2633:1: rule__Comparator__Group__1__Impl : ( ( rule__Comparator__Group_1__0 )* ) ;
    public final void rule__Comparator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2637:1: ( ( ( rule__Comparator__Group_1__0 )* ) )
            // InternalTableDSL.g:2638:1: ( ( rule__Comparator__Group_1__0 )* )
            {
            // InternalTableDSL.g:2638:1: ( ( rule__Comparator__Group_1__0 )* )
            // InternalTableDSL.g:2639:2: ( rule__Comparator__Group_1__0 )*
            {
             before(grammarAccess.getComparatorAccess().getGroup_1()); 
            // InternalTableDSL.g:2640:2: ( rule__Comparator__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==22) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalTableDSL.g:2640:3: rule__Comparator__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Comparator__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalTableDSL.g:2649:1: rule__Comparator__Group_1__0 : rule__Comparator__Group_1__0__Impl rule__Comparator__Group_1__1 ;
    public final void rule__Comparator__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2653:1: ( rule__Comparator__Group_1__0__Impl rule__Comparator__Group_1__1 )
            // InternalTableDSL.g:2654:2: rule__Comparator__Group_1__0__Impl rule__Comparator__Group_1__1
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
    // InternalTableDSL.g:2661:1: rule__Comparator__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Comparator__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2665:1: ( ( ',' ) )
            // InternalTableDSL.g:2666:1: ( ',' )
            {
            // InternalTableDSL.g:2666:1: ( ',' )
            // InternalTableDSL.g:2667:2: ','
            {
             before(grammarAccess.getComparatorAccess().getCommaKeyword_1_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalTableDSL.g:2676:1: rule__Comparator__Group_1__1 : rule__Comparator__Group_1__1__Impl ;
    public final void rule__Comparator__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2680:1: ( rule__Comparator__Group_1__1__Impl )
            // InternalTableDSL.g:2681:2: rule__Comparator__Group_1__1__Impl
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
    // InternalTableDSL.g:2687:1: rule__Comparator__Group_1__1__Impl : ( ( rule__Comparator__KeysAssignment_1_1 ) ) ;
    public final void rule__Comparator__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2691:1: ( ( ( rule__Comparator__KeysAssignment_1_1 ) ) )
            // InternalTableDSL.g:2692:1: ( ( rule__Comparator__KeysAssignment_1_1 ) )
            {
            // InternalTableDSL.g:2692:1: ( ( rule__Comparator__KeysAssignment_1_1 ) )
            // InternalTableDSL.g:2693:2: ( rule__Comparator__KeysAssignment_1_1 )
            {
             before(grammarAccess.getComparatorAccess().getKeysAssignment_1_1()); 
            // InternalTableDSL.g:2694:2: ( rule__Comparator__KeysAssignment_1_1 )
            // InternalTableDSL.g:2694:3: rule__Comparator__KeysAssignment_1_1
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
    // InternalTableDSL.g:2703:1: rule__SquashRows__Group__0 : rule__SquashRows__Group__0__Impl rule__SquashRows__Group__1 ;
    public final void rule__SquashRows__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2707:1: ( rule__SquashRows__Group__0__Impl rule__SquashRows__Group__1 )
            // InternalTableDSL.g:2708:2: rule__SquashRows__Group__0__Impl rule__SquashRows__Group__1
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
    // InternalTableDSL.g:2715:1: rule__SquashRows__Group__0__Impl : ( 'squash' ) ;
    public final void rule__SquashRows__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2719:1: ( ( 'squash' ) )
            // InternalTableDSL.g:2720:1: ( 'squash' )
            {
            // InternalTableDSL.g:2720:1: ( 'squash' )
            // InternalTableDSL.g:2721:2: 'squash'
            {
             before(grammarAccess.getSquashRowsAccess().getSquashKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalTableDSL.g:2730:1: rule__SquashRows__Group__1 : rule__SquashRows__Group__1__Impl rule__SquashRows__Group__2 ;
    public final void rule__SquashRows__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2734:1: ( rule__SquashRows__Group__1__Impl rule__SquashRows__Group__2 )
            // InternalTableDSL.g:2735:2: rule__SquashRows__Group__1__Impl rule__SquashRows__Group__2
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
    // InternalTableDSL.g:2742:1: rule__SquashRows__Group__1__Impl : ( ( 'rows' )? ) ;
    public final void rule__SquashRows__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2746:1: ( ( ( 'rows' )? ) )
            // InternalTableDSL.g:2747:1: ( ( 'rows' )? )
            {
            // InternalTableDSL.g:2747:1: ( ( 'rows' )? )
            // InternalTableDSL.g:2748:2: ( 'rows' )?
            {
             before(grammarAccess.getSquashRowsAccess().getRowsKeyword_1()); 
            // InternalTableDSL.g:2749:2: ( 'rows' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==35) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalTableDSL.g:2749:3: 'rows'
                    {
                    match(input,35,FOLLOW_2); 

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
    // InternalTableDSL.g:2757:1: rule__SquashRows__Group__2 : rule__SquashRows__Group__2__Impl rule__SquashRows__Group__3 ;
    public final void rule__SquashRows__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2761:1: ( rule__SquashRows__Group__2__Impl rule__SquashRows__Group__3 )
            // InternalTableDSL.g:2762:2: rule__SquashRows__Group__2__Impl rule__SquashRows__Group__3
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
    // InternalTableDSL.g:2769:1: rule__SquashRows__Group__2__Impl : ( 'by' ) ;
    public final void rule__SquashRows__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2773:1: ( ( 'by' ) )
            // InternalTableDSL.g:2774:1: ( 'by' )
            {
            // InternalTableDSL.g:2774:1: ( 'by' )
            // InternalTableDSL.g:2775:2: 'by'
            {
             before(grammarAccess.getSquashRowsAccess().getByKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalTableDSL.g:2784:1: rule__SquashRows__Group__3 : rule__SquashRows__Group__3__Impl rule__SquashRows__Group__4 ;
    public final void rule__SquashRows__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2788:1: ( rule__SquashRows__Group__3__Impl rule__SquashRows__Group__4 )
            // InternalTableDSL.g:2789:2: rule__SquashRows__Group__3__Impl rule__SquashRows__Group__4
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
    // InternalTableDSL.g:2796:1: rule__SquashRows__Group__3__Impl : ( ( rule__SquashRows__ColumnsAssignment_3 ) ) ;
    public final void rule__SquashRows__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2800:1: ( ( ( rule__SquashRows__ColumnsAssignment_3 ) ) )
            // InternalTableDSL.g:2801:1: ( ( rule__SquashRows__ColumnsAssignment_3 ) )
            {
            // InternalTableDSL.g:2801:1: ( ( rule__SquashRows__ColumnsAssignment_3 ) )
            // InternalTableDSL.g:2802:2: ( rule__SquashRows__ColumnsAssignment_3 )
            {
             before(grammarAccess.getSquashRowsAccess().getColumnsAssignment_3()); 
            // InternalTableDSL.g:2803:2: ( rule__SquashRows__ColumnsAssignment_3 )
            // InternalTableDSL.g:2803:3: rule__SquashRows__ColumnsAssignment_3
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
    // InternalTableDSL.g:2811:1: rule__SquashRows__Group__4 : rule__SquashRows__Group__4__Impl ;
    public final void rule__SquashRows__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2815:1: ( rule__SquashRows__Group__4__Impl )
            // InternalTableDSL.g:2816:2: rule__SquashRows__Group__4__Impl
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
    // InternalTableDSL.g:2822:1: rule__SquashRows__Group__4__Impl : ( ( rule__SquashRows__Group_4__0 )* ) ;
    public final void rule__SquashRows__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2826:1: ( ( ( rule__SquashRows__Group_4__0 )* ) )
            // InternalTableDSL.g:2827:1: ( ( rule__SquashRows__Group_4__0 )* )
            {
            // InternalTableDSL.g:2827:1: ( ( rule__SquashRows__Group_4__0 )* )
            // InternalTableDSL.g:2828:2: ( rule__SquashRows__Group_4__0 )*
            {
             before(grammarAccess.getSquashRowsAccess().getGroup_4()); 
            // InternalTableDSL.g:2829:2: ( rule__SquashRows__Group_4__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==22) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalTableDSL.g:2829:3: rule__SquashRows__Group_4__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__SquashRows__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalTableDSL.g:2838:1: rule__SquashRows__Group_4__0 : rule__SquashRows__Group_4__0__Impl rule__SquashRows__Group_4__1 ;
    public final void rule__SquashRows__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2842:1: ( rule__SquashRows__Group_4__0__Impl rule__SquashRows__Group_4__1 )
            // InternalTableDSL.g:2843:2: rule__SquashRows__Group_4__0__Impl rule__SquashRows__Group_4__1
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
    // InternalTableDSL.g:2850:1: rule__SquashRows__Group_4__0__Impl : ( ',' ) ;
    public final void rule__SquashRows__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2854:1: ( ( ',' ) )
            // InternalTableDSL.g:2855:1: ( ',' )
            {
            // InternalTableDSL.g:2855:1: ( ',' )
            // InternalTableDSL.g:2856:2: ','
            {
             before(grammarAccess.getSquashRowsAccess().getCommaKeyword_4_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalTableDSL.g:2865:1: rule__SquashRows__Group_4__1 : rule__SquashRows__Group_4__1__Impl ;
    public final void rule__SquashRows__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2869:1: ( rule__SquashRows__Group_4__1__Impl )
            // InternalTableDSL.g:2870:2: rule__SquashRows__Group_4__1__Impl
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
    // InternalTableDSL.g:2876:1: rule__SquashRows__Group_4__1__Impl : ( ( rule__SquashRows__ColumnsAssignment_4_1 ) ) ;
    public final void rule__SquashRows__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2880:1: ( ( ( rule__SquashRows__ColumnsAssignment_4_1 ) ) )
            // InternalTableDSL.g:2881:1: ( ( rule__SquashRows__ColumnsAssignment_4_1 ) )
            {
            // InternalTableDSL.g:2881:1: ( ( rule__SquashRows__ColumnsAssignment_4_1 ) )
            // InternalTableDSL.g:2882:2: ( rule__SquashRows__ColumnsAssignment_4_1 )
            {
             before(grammarAccess.getSquashRowsAccess().getColumnsAssignment_4_1()); 
            // InternalTableDSL.g:2883:2: ( rule__SquashRows__ColumnsAssignment_4_1 )
            // InternalTableDSL.g:2883:3: rule__SquashRows__ColumnsAssignment_4_1
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
    // InternalTableDSL.g:2892:1: rule__Filter__Group__0 : rule__Filter__Group__0__Impl rule__Filter__Group__1 ;
    public final void rule__Filter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2896:1: ( rule__Filter__Group__0__Impl rule__Filter__Group__1 )
            // InternalTableDSL.g:2897:2: rule__Filter__Group__0__Impl rule__Filter__Group__1
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
    // InternalTableDSL.g:2904:1: rule__Filter__Group__0__Impl : ( 'filter' ) ;
    public final void rule__Filter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2908:1: ( ( 'filter' ) )
            // InternalTableDSL.g:2909:1: ( 'filter' )
            {
            // InternalTableDSL.g:2909:1: ( 'filter' )
            // InternalTableDSL.g:2910:2: 'filter'
            {
             before(grammarAccess.getFilterAccess().getFilterKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalTableDSL.g:2919:1: rule__Filter__Group__1 : rule__Filter__Group__1__Impl rule__Filter__Group__2 ;
    public final void rule__Filter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2923:1: ( rule__Filter__Group__1__Impl rule__Filter__Group__2 )
            // InternalTableDSL.g:2924:2: rule__Filter__Group__1__Impl rule__Filter__Group__2
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
    // InternalTableDSL.g:2931:1: rule__Filter__Group__1__Impl : ( ( rule__Filter__DenylistAssignment_1 ) ) ;
    public final void rule__Filter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2935:1: ( ( ( rule__Filter__DenylistAssignment_1 ) ) )
            // InternalTableDSL.g:2936:1: ( ( rule__Filter__DenylistAssignment_1 ) )
            {
            // InternalTableDSL.g:2936:1: ( ( rule__Filter__DenylistAssignment_1 ) )
            // InternalTableDSL.g:2937:2: ( rule__Filter__DenylistAssignment_1 )
            {
             before(grammarAccess.getFilterAccess().getDenylistAssignment_1()); 
            // InternalTableDSL.g:2938:2: ( rule__Filter__DenylistAssignment_1 )
            // InternalTableDSL.g:2938:3: rule__Filter__DenylistAssignment_1
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
    // InternalTableDSL.g:2946:1: rule__Filter__Group__2 : rule__Filter__Group__2__Impl ;
    public final void rule__Filter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2950:1: ( rule__Filter__Group__2__Impl )
            // InternalTableDSL.g:2951:2: rule__Filter__Group__2__Impl
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
    // InternalTableDSL.g:2957:1: rule__Filter__Group__2__Impl : ( ( rule__Filter__ExceptlistAssignment_2 )? ) ;
    public final void rule__Filter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2961:1: ( ( ( rule__Filter__ExceptlistAssignment_2 )? ) )
            // InternalTableDSL.g:2962:1: ( ( rule__Filter__ExceptlistAssignment_2 )? )
            {
            // InternalTableDSL.g:2962:1: ( ( rule__Filter__ExceptlistAssignment_2 )? )
            // InternalTableDSL.g:2963:2: ( rule__Filter__ExceptlistAssignment_2 )?
            {
             before(grammarAccess.getFilterAccess().getExceptlistAssignment_2()); 
            // InternalTableDSL.g:2964:2: ( rule__Filter__ExceptlistAssignment_2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==38) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalTableDSL.g:2964:3: rule__Filter__ExceptlistAssignment_2
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
    // InternalTableDSL.g:2973:1: rule__FilterDenylist__Group__0 : rule__FilterDenylist__Group__0__Impl rule__FilterDenylist__Group__1 ;
    public final void rule__FilterDenylist__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2977:1: ( rule__FilterDenylist__Group__0__Impl rule__FilterDenylist__Group__1 )
            // InternalTableDSL.g:2978:2: rule__FilterDenylist__Group__0__Impl rule__FilterDenylist__Group__1
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
    // InternalTableDSL.g:2985:1: rule__FilterDenylist__Group__0__Impl : ( 'deny' ) ;
    public final void rule__FilterDenylist__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:2989:1: ( ( 'deny' ) )
            // InternalTableDSL.g:2990:1: ( 'deny' )
            {
            // InternalTableDSL.g:2990:1: ( 'deny' )
            // InternalTableDSL.g:2991:2: 'deny'
            {
             before(grammarAccess.getFilterDenylistAccess().getDenyKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalTableDSL.g:3000:1: rule__FilterDenylist__Group__1 : rule__FilterDenylist__Group__1__Impl rule__FilterDenylist__Group__2 ;
    public final void rule__FilterDenylist__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3004:1: ( rule__FilterDenylist__Group__1__Impl rule__FilterDenylist__Group__2 )
            // InternalTableDSL.g:3005:2: rule__FilterDenylist__Group__1__Impl rule__FilterDenylist__Group__2
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
    // InternalTableDSL.g:3012:1: rule__FilterDenylist__Group__1__Impl : ( ( rule__FilterDenylist__DenylistAssignment_1 ) ) ;
    public final void rule__FilterDenylist__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3016:1: ( ( ( rule__FilterDenylist__DenylistAssignment_1 ) ) )
            // InternalTableDSL.g:3017:1: ( ( rule__FilterDenylist__DenylistAssignment_1 ) )
            {
            // InternalTableDSL.g:3017:1: ( ( rule__FilterDenylist__DenylistAssignment_1 ) )
            // InternalTableDSL.g:3018:2: ( rule__FilterDenylist__DenylistAssignment_1 )
            {
             before(grammarAccess.getFilterDenylistAccess().getDenylistAssignment_1()); 
            // InternalTableDSL.g:3019:2: ( rule__FilterDenylist__DenylistAssignment_1 )
            // InternalTableDSL.g:3019:3: rule__FilterDenylist__DenylistAssignment_1
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
    // InternalTableDSL.g:3027:1: rule__FilterDenylist__Group__2 : rule__FilterDenylist__Group__2__Impl ;
    public final void rule__FilterDenylist__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3031:1: ( rule__FilterDenylist__Group__2__Impl )
            // InternalTableDSL.g:3032:2: rule__FilterDenylist__Group__2__Impl
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
    // InternalTableDSL.g:3038:1: rule__FilterDenylist__Group__2__Impl : ( ( rule__FilterDenylist__Group_2__0 )* ) ;
    public final void rule__FilterDenylist__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3042:1: ( ( ( rule__FilterDenylist__Group_2__0 )* ) )
            // InternalTableDSL.g:3043:1: ( ( rule__FilterDenylist__Group_2__0 )* )
            {
            // InternalTableDSL.g:3043:1: ( ( rule__FilterDenylist__Group_2__0 )* )
            // InternalTableDSL.g:3044:2: ( rule__FilterDenylist__Group_2__0 )*
            {
             before(grammarAccess.getFilterDenylistAccess().getGroup_2()); 
            // InternalTableDSL.g:3045:2: ( rule__FilterDenylist__Group_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==22) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalTableDSL.g:3045:3: rule__FilterDenylist__Group_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__FilterDenylist__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalTableDSL.g:3054:1: rule__FilterDenylist__Group_2__0 : rule__FilterDenylist__Group_2__0__Impl rule__FilterDenylist__Group_2__1 ;
    public final void rule__FilterDenylist__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3058:1: ( rule__FilterDenylist__Group_2__0__Impl rule__FilterDenylist__Group_2__1 )
            // InternalTableDSL.g:3059:2: rule__FilterDenylist__Group_2__0__Impl rule__FilterDenylist__Group_2__1
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
    // InternalTableDSL.g:3066:1: rule__FilterDenylist__Group_2__0__Impl : ( ',' ) ;
    public final void rule__FilterDenylist__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3070:1: ( ( ',' ) )
            // InternalTableDSL.g:3071:1: ( ',' )
            {
            // InternalTableDSL.g:3071:1: ( ',' )
            // InternalTableDSL.g:3072:2: ','
            {
             before(grammarAccess.getFilterDenylistAccess().getCommaKeyword_2_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalTableDSL.g:3081:1: rule__FilterDenylist__Group_2__1 : rule__FilterDenylist__Group_2__1__Impl ;
    public final void rule__FilterDenylist__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3085:1: ( rule__FilterDenylist__Group_2__1__Impl )
            // InternalTableDSL.g:3086:2: rule__FilterDenylist__Group_2__1__Impl
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
    // InternalTableDSL.g:3092:1: rule__FilterDenylist__Group_2__1__Impl : ( ( rule__FilterDenylist__DenylistAssignment_2_1 ) ) ;
    public final void rule__FilterDenylist__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3096:1: ( ( ( rule__FilterDenylist__DenylistAssignment_2_1 ) ) )
            // InternalTableDSL.g:3097:1: ( ( rule__FilterDenylist__DenylistAssignment_2_1 ) )
            {
            // InternalTableDSL.g:3097:1: ( ( rule__FilterDenylist__DenylistAssignment_2_1 ) )
            // InternalTableDSL.g:3098:2: ( rule__FilterDenylist__DenylistAssignment_2_1 )
            {
             before(grammarAccess.getFilterDenylistAccess().getDenylistAssignment_2_1()); 
            // InternalTableDSL.g:3099:2: ( rule__FilterDenylist__DenylistAssignment_2_1 )
            // InternalTableDSL.g:3099:3: rule__FilterDenylist__DenylistAssignment_2_1
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
    // InternalTableDSL.g:3108:1: rule__FilterExceptlist__Group__0 : rule__FilterExceptlist__Group__0__Impl rule__FilterExceptlist__Group__1 ;
    public final void rule__FilterExceptlist__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3112:1: ( rule__FilterExceptlist__Group__0__Impl rule__FilterExceptlist__Group__1 )
            // InternalTableDSL.g:3113:2: rule__FilterExceptlist__Group__0__Impl rule__FilterExceptlist__Group__1
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
    // InternalTableDSL.g:3120:1: rule__FilterExceptlist__Group__0__Impl : ( 'except' ) ;
    public final void rule__FilterExceptlist__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3124:1: ( ( 'except' ) )
            // InternalTableDSL.g:3125:1: ( 'except' )
            {
            // InternalTableDSL.g:3125:1: ( 'except' )
            // InternalTableDSL.g:3126:2: 'except'
            {
             before(grammarAccess.getFilterExceptlistAccess().getExceptKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalTableDSL.g:3135:1: rule__FilterExceptlist__Group__1 : rule__FilterExceptlist__Group__1__Impl rule__FilterExceptlist__Group__2 ;
    public final void rule__FilterExceptlist__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3139:1: ( rule__FilterExceptlist__Group__1__Impl rule__FilterExceptlist__Group__2 )
            // InternalTableDSL.g:3140:2: rule__FilterExceptlist__Group__1__Impl rule__FilterExceptlist__Group__2
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
    // InternalTableDSL.g:3147:1: rule__FilterExceptlist__Group__1__Impl : ( ( rule__FilterExceptlist__ExceptlistAssignment_1 ) ) ;
    public final void rule__FilterExceptlist__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3151:1: ( ( ( rule__FilterExceptlist__ExceptlistAssignment_1 ) ) )
            // InternalTableDSL.g:3152:1: ( ( rule__FilterExceptlist__ExceptlistAssignment_1 ) )
            {
            // InternalTableDSL.g:3152:1: ( ( rule__FilterExceptlist__ExceptlistAssignment_1 ) )
            // InternalTableDSL.g:3153:2: ( rule__FilterExceptlist__ExceptlistAssignment_1 )
            {
             before(grammarAccess.getFilterExceptlistAccess().getExceptlistAssignment_1()); 
            // InternalTableDSL.g:3154:2: ( rule__FilterExceptlist__ExceptlistAssignment_1 )
            // InternalTableDSL.g:3154:3: rule__FilterExceptlist__ExceptlistAssignment_1
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
    // InternalTableDSL.g:3162:1: rule__FilterExceptlist__Group__2 : rule__FilterExceptlist__Group__2__Impl ;
    public final void rule__FilterExceptlist__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3166:1: ( rule__FilterExceptlist__Group__2__Impl )
            // InternalTableDSL.g:3167:2: rule__FilterExceptlist__Group__2__Impl
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
    // InternalTableDSL.g:3173:1: rule__FilterExceptlist__Group__2__Impl : ( ( rule__FilterExceptlist__Group_2__0 )* ) ;
    public final void rule__FilterExceptlist__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3177:1: ( ( ( rule__FilterExceptlist__Group_2__0 )* ) )
            // InternalTableDSL.g:3178:1: ( ( rule__FilterExceptlist__Group_2__0 )* )
            {
            // InternalTableDSL.g:3178:1: ( ( rule__FilterExceptlist__Group_2__0 )* )
            // InternalTableDSL.g:3179:2: ( rule__FilterExceptlist__Group_2__0 )*
            {
             before(grammarAccess.getFilterExceptlistAccess().getGroup_2()); 
            // InternalTableDSL.g:3180:2: ( rule__FilterExceptlist__Group_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==22) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalTableDSL.g:3180:3: rule__FilterExceptlist__Group_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__FilterExceptlist__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalTableDSL.g:3189:1: rule__FilterExceptlist__Group_2__0 : rule__FilterExceptlist__Group_2__0__Impl rule__FilterExceptlist__Group_2__1 ;
    public final void rule__FilterExceptlist__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3193:1: ( rule__FilterExceptlist__Group_2__0__Impl rule__FilterExceptlist__Group_2__1 )
            // InternalTableDSL.g:3194:2: rule__FilterExceptlist__Group_2__0__Impl rule__FilterExceptlist__Group_2__1
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
    // InternalTableDSL.g:3201:1: rule__FilterExceptlist__Group_2__0__Impl : ( ',' ) ;
    public final void rule__FilterExceptlist__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3205:1: ( ( ',' ) )
            // InternalTableDSL.g:3206:1: ( ',' )
            {
            // InternalTableDSL.g:3206:1: ( ',' )
            // InternalTableDSL.g:3207:2: ','
            {
             before(grammarAccess.getFilterExceptlistAccess().getCommaKeyword_2_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalTableDSL.g:3216:1: rule__FilterExceptlist__Group_2__1 : rule__FilterExceptlist__Group_2__1__Impl ;
    public final void rule__FilterExceptlist__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3220:1: ( rule__FilterExceptlist__Group_2__1__Impl )
            // InternalTableDSL.g:3221:2: rule__FilterExceptlist__Group_2__1__Impl
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
    // InternalTableDSL.g:3227:1: rule__FilterExceptlist__Group_2__1__Impl : ( ( rule__FilterExceptlist__ExceptlistAssignment_2_1 ) ) ;
    public final void rule__FilterExceptlist__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3231:1: ( ( ( rule__FilterExceptlist__ExceptlistAssignment_2_1 ) ) )
            // InternalTableDSL.g:3232:1: ( ( rule__FilterExceptlist__ExceptlistAssignment_2_1 ) )
            {
            // InternalTableDSL.g:3232:1: ( ( rule__FilterExceptlist__ExceptlistAssignment_2_1 ) )
            // InternalTableDSL.g:3233:2: ( rule__FilterExceptlist__ExceptlistAssignment_2_1 )
            {
             before(grammarAccess.getFilterExceptlistAccess().getExceptlistAssignment_2_1()); 
            // InternalTableDSL.g:3234:2: ( rule__FilterExceptlist__ExceptlistAssignment_2_1 )
            // InternalTableDSL.g:3234:3: rule__FilterExceptlist__ExceptlistAssignment_2_1
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
    // InternalTableDSL.g:3243:1: rule__FilterColumnRule__Group__0 : rule__FilterColumnRule__Group__0__Impl rule__FilterColumnRule__Group__1 ;
    public final void rule__FilterColumnRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3247:1: ( rule__FilterColumnRule__Group__0__Impl rule__FilterColumnRule__Group__1 )
            // InternalTableDSL.g:3248:2: rule__FilterColumnRule__Group__0__Impl rule__FilterColumnRule__Group__1
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
    // InternalTableDSL.g:3255:1: rule__FilterColumnRule__Group__0__Impl : ( ( rule__FilterColumnRule__Alternatives_0 ) ) ;
    public final void rule__FilterColumnRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3259:1: ( ( ( rule__FilterColumnRule__Alternatives_0 ) ) )
            // InternalTableDSL.g:3260:1: ( ( rule__FilterColumnRule__Alternatives_0 ) )
            {
            // InternalTableDSL.g:3260:1: ( ( rule__FilterColumnRule__Alternatives_0 ) )
            // InternalTableDSL.g:3261:2: ( rule__FilterColumnRule__Alternatives_0 )
            {
             before(grammarAccess.getFilterColumnRuleAccess().getAlternatives_0()); 
            // InternalTableDSL.g:3262:2: ( rule__FilterColumnRule__Alternatives_0 )
            // InternalTableDSL.g:3262:3: rule__FilterColumnRule__Alternatives_0
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
    // InternalTableDSL.g:3270:1: rule__FilterColumnRule__Group__1 : rule__FilterColumnRule__Group__1__Impl rule__FilterColumnRule__Group__2 ;
    public final void rule__FilterColumnRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3274:1: ( rule__FilterColumnRule__Group__1__Impl rule__FilterColumnRule__Group__2 )
            // InternalTableDSL.g:3275:2: rule__FilterColumnRule__Group__1__Impl rule__FilterColumnRule__Group__2
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
    // InternalTableDSL.g:3282:1: rule__FilterColumnRule__Group__1__Impl : ( ( rule__FilterColumnRule__ColumnPatternsAssignment_1 ) ) ;
    public final void rule__FilterColumnRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3286:1: ( ( ( rule__FilterColumnRule__ColumnPatternsAssignment_1 ) ) )
            // InternalTableDSL.g:3287:1: ( ( rule__FilterColumnRule__ColumnPatternsAssignment_1 ) )
            {
            // InternalTableDSL.g:3287:1: ( ( rule__FilterColumnRule__ColumnPatternsAssignment_1 ) )
            // InternalTableDSL.g:3288:2: ( rule__FilterColumnRule__ColumnPatternsAssignment_1 )
            {
             before(grammarAccess.getFilterColumnRuleAccess().getColumnPatternsAssignment_1()); 
            // InternalTableDSL.g:3289:2: ( rule__FilterColumnRule__ColumnPatternsAssignment_1 )
            // InternalTableDSL.g:3289:3: rule__FilterColumnRule__ColumnPatternsAssignment_1
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
    // InternalTableDSL.g:3297:1: rule__FilterColumnRule__Group__2 : rule__FilterColumnRule__Group__2__Impl ;
    public final void rule__FilterColumnRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3301:1: ( rule__FilterColumnRule__Group__2__Impl )
            // InternalTableDSL.g:3302:2: rule__FilterColumnRule__Group__2__Impl
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
    // InternalTableDSL.g:3308:1: rule__FilterColumnRule__Group__2__Impl : ( ( rule__FilterColumnRule__Group_2__0 )* ) ;
    public final void rule__FilterColumnRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3312:1: ( ( ( rule__FilterColumnRule__Group_2__0 )* ) )
            // InternalTableDSL.g:3313:1: ( ( rule__FilterColumnRule__Group_2__0 )* )
            {
            // InternalTableDSL.g:3313:1: ( ( rule__FilterColumnRule__Group_2__0 )* )
            // InternalTableDSL.g:3314:2: ( rule__FilterColumnRule__Group_2__0 )*
            {
             before(grammarAccess.getFilterColumnRuleAccess().getGroup_2()); 
            // InternalTableDSL.g:3315:2: ( rule__FilterColumnRule__Group_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==22) ) {
                    int LA28_2 = input.LA(2);

                    if ( ((LA28_2>=RULE_COLUMN_NAME_KEYWORDS && LA28_2<=RULE_STRING)) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // InternalTableDSL.g:3315:3: rule__FilterColumnRule__Group_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__FilterColumnRule__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalTableDSL.g:3324:1: rule__FilterColumnRule__Group_2__0 : rule__FilterColumnRule__Group_2__0__Impl rule__FilterColumnRule__Group_2__1 ;
    public final void rule__FilterColumnRule__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3328:1: ( rule__FilterColumnRule__Group_2__0__Impl rule__FilterColumnRule__Group_2__1 )
            // InternalTableDSL.g:3329:2: rule__FilterColumnRule__Group_2__0__Impl rule__FilterColumnRule__Group_2__1
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
    // InternalTableDSL.g:3336:1: rule__FilterColumnRule__Group_2__0__Impl : ( ',' ) ;
    public final void rule__FilterColumnRule__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3340:1: ( ( ',' ) )
            // InternalTableDSL.g:3341:1: ( ',' )
            {
            // InternalTableDSL.g:3341:1: ( ',' )
            // InternalTableDSL.g:3342:2: ','
            {
             before(grammarAccess.getFilterColumnRuleAccess().getCommaKeyword_2_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalTableDSL.g:3351:1: rule__FilterColumnRule__Group_2__1 : rule__FilterColumnRule__Group_2__1__Impl ;
    public final void rule__FilterColumnRule__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3355:1: ( rule__FilterColumnRule__Group_2__1__Impl )
            // InternalTableDSL.g:3356:2: rule__FilterColumnRule__Group_2__1__Impl
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
    // InternalTableDSL.g:3362:1: rule__FilterColumnRule__Group_2__1__Impl : ( ( rule__FilterColumnRule__ColumnPatternsAssignment_2_1 ) ) ;
    public final void rule__FilterColumnRule__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3366:1: ( ( ( rule__FilterColumnRule__ColumnPatternsAssignment_2_1 ) ) )
            // InternalTableDSL.g:3367:1: ( ( rule__FilterColumnRule__ColumnPatternsAssignment_2_1 ) )
            {
            // InternalTableDSL.g:3367:1: ( ( rule__FilterColumnRule__ColumnPatternsAssignment_2_1 ) )
            // InternalTableDSL.g:3368:2: ( rule__FilterColumnRule__ColumnPatternsAssignment_2_1 )
            {
             before(grammarAccess.getFilterColumnRuleAccess().getColumnPatternsAssignment_2_1()); 
            // InternalTableDSL.g:3369:2: ( rule__FilterColumnRule__ColumnPatternsAssignment_2_1 )
            // InternalTableDSL.g:3369:3: rule__FilterColumnRule__ColumnPatternsAssignment_2_1
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
    // InternalTableDSL.g:3378:1: rule__FilterObjectTypeRule__Group__0 : rule__FilterObjectTypeRule__Group__0__Impl rule__FilterObjectTypeRule__Group__1 ;
    public final void rule__FilterObjectTypeRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3382:1: ( rule__FilterObjectTypeRule__Group__0__Impl rule__FilterObjectTypeRule__Group__1 )
            // InternalTableDSL.g:3383:2: rule__FilterObjectTypeRule__Group__0__Impl rule__FilterObjectTypeRule__Group__1
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
    // InternalTableDSL.g:3390:1: rule__FilterObjectTypeRule__Group__0__Impl : ( ( rule__FilterObjectTypeRule__Alternatives_0 ) ) ;
    public final void rule__FilterObjectTypeRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3394:1: ( ( ( rule__FilterObjectTypeRule__Alternatives_0 ) ) )
            // InternalTableDSL.g:3395:1: ( ( rule__FilterObjectTypeRule__Alternatives_0 ) )
            {
            // InternalTableDSL.g:3395:1: ( ( rule__FilterObjectTypeRule__Alternatives_0 ) )
            // InternalTableDSL.g:3396:2: ( rule__FilterObjectTypeRule__Alternatives_0 )
            {
             before(grammarAccess.getFilterObjectTypeRuleAccess().getAlternatives_0()); 
            // InternalTableDSL.g:3397:2: ( rule__FilterObjectTypeRule__Alternatives_0 )
            // InternalTableDSL.g:3397:3: rule__FilterObjectTypeRule__Alternatives_0
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
    // InternalTableDSL.g:3405:1: rule__FilterObjectTypeRule__Group__1 : rule__FilterObjectTypeRule__Group__1__Impl rule__FilterObjectTypeRule__Group__2 ;
    public final void rule__FilterObjectTypeRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3409:1: ( rule__FilterObjectTypeRule__Group__1__Impl rule__FilterObjectTypeRule__Group__2 )
            // InternalTableDSL.g:3410:2: rule__FilterObjectTypeRule__Group__1__Impl rule__FilterObjectTypeRule__Group__2
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
    // InternalTableDSL.g:3417:1: rule__FilterObjectTypeRule__Group__1__Impl : ( ( 'of' )? ) ;
    public final void rule__FilterObjectTypeRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3421:1: ( ( ( 'of' )? ) )
            // InternalTableDSL.g:3422:1: ( ( 'of' )? )
            {
            // InternalTableDSL.g:3422:1: ( ( 'of' )? )
            // InternalTableDSL.g:3423:2: ( 'of' )?
            {
             before(grammarAccess.getFilterObjectTypeRuleAccess().getOfKeyword_1()); 
            // InternalTableDSL.g:3424:2: ( 'of' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==39) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalTableDSL.g:3424:3: 'of'
                    {
                    match(input,39,FOLLOW_2); 

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
    // InternalTableDSL.g:3432:1: rule__FilterObjectTypeRule__Group__2 : rule__FilterObjectTypeRule__Group__2__Impl rule__FilterObjectTypeRule__Group__3 ;
    public final void rule__FilterObjectTypeRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3436:1: ( rule__FilterObjectTypeRule__Group__2__Impl rule__FilterObjectTypeRule__Group__3 )
            // InternalTableDSL.g:3437:2: rule__FilterObjectTypeRule__Group__2__Impl rule__FilterObjectTypeRule__Group__3
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
    // InternalTableDSL.g:3444:1: rule__FilterObjectTypeRule__Group__2__Impl : ( ( rule__FilterObjectTypeRule__ObjectClassesAssignment_2 ) ) ;
    public final void rule__FilterObjectTypeRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3448:1: ( ( ( rule__FilterObjectTypeRule__ObjectClassesAssignment_2 ) ) )
            // InternalTableDSL.g:3449:1: ( ( rule__FilterObjectTypeRule__ObjectClassesAssignment_2 ) )
            {
            // InternalTableDSL.g:3449:1: ( ( rule__FilterObjectTypeRule__ObjectClassesAssignment_2 ) )
            // InternalTableDSL.g:3450:2: ( rule__FilterObjectTypeRule__ObjectClassesAssignment_2 )
            {
             before(grammarAccess.getFilterObjectTypeRuleAccess().getObjectClassesAssignment_2()); 
            // InternalTableDSL.g:3451:2: ( rule__FilterObjectTypeRule__ObjectClassesAssignment_2 )
            // InternalTableDSL.g:3451:3: rule__FilterObjectTypeRule__ObjectClassesAssignment_2
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
    // InternalTableDSL.g:3459:1: rule__FilterObjectTypeRule__Group__3 : rule__FilterObjectTypeRule__Group__3__Impl ;
    public final void rule__FilterObjectTypeRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3463:1: ( rule__FilterObjectTypeRule__Group__3__Impl )
            // InternalTableDSL.g:3464:2: rule__FilterObjectTypeRule__Group__3__Impl
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
    // InternalTableDSL.g:3470:1: rule__FilterObjectTypeRule__Group__3__Impl : ( ( rule__FilterObjectTypeRule__Group_3__0 )* ) ;
    public final void rule__FilterObjectTypeRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3474:1: ( ( ( rule__FilterObjectTypeRule__Group_3__0 )* ) )
            // InternalTableDSL.g:3475:1: ( ( rule__FilterObjectTypeRule__Group_3__0 )* )
            {
            // InternalTableDSL.g:3475:1: ( ( rule__FilterObjectTypeRule__Group_3__0 )* )
            // InternalTableDSL.g:3476:2: ( rule__FilterObjectTypeRule__Group_3__0 )*
            {
             before(grammarAccess.getFilterObjectTypeRuleAccess().getGroup_3()); 
            // InternalTableDSL.g:3477:2: ( rule__FilterObjectTypeRule__Group_3__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==22) ) {
                    int LA30_2 = input.LA(2);

                    if ( ((LA30_2>=RULE_STRING && LA30_2<=RULE_OBJECT_TYPES)) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // InternalTableDSL.g:3477:3: rule__FilterObjectTypeRule__Group_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__FilterObjectTypeRule__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalTableDSL.g:3486:1: rule__FilterObjectTypeRule__Group_3__0 : rule__FilterObjectTypeRule__Group_3__0__Impl rule__FilterObjectTypeRule__Group_3__1 ;
    public final void rule__FilterObjectTypeRule__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3490:1: ( rule__FilterObjectTypeRule__Group_3__0__Impl rule__FilterObjectTypeRule__Group_3__1 )
            // InternalTableDSL.g:3491:2: rule__FilterObjectTypeRule__Group_3__0__Impl rule__FilterObjectTypeRule__Group_3__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalTableDSL.g:3498:1: rule__FilterObjectTypeRule__Group_3__0__Impl : ( ',' ) ;
    public final void rule__FilterObjectTypeRule__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3502:1: ( ( ',' ) )
            // InternalTableDSL.g:3503:1: ( ',' )
            {
            // InternalTableDSL.g:3503:1: ( ',' )
            // InternalTableDSL.g:3504:2: ','
            {
             before(grammarAccess.getFilterObjectTypeRuleAccess().getCommaKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalTableDSL.g:3513:1: rule__FilterObjectTypeRule__Group_3__1 : rule__FilterObjectTypeRule__Group_3__1__Impl ;
    public final void rule__FilterObjectTypeRule__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3517:1: ( rule__FilterObjectTypeRule__Group_3__1__Impl )
            // InternalTableDSL.g:3518:2: rule__FilterObjectTypeRule__Group_3__1__Impl
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
    // InternalTableDSL.g:3524:1: rule__FilterObjectTypeRule__Group_3__1__Impl : ( ( rule__FilterObjectTypeRule__ObjectClassesAssignment_3_1 ) ) ;
    public final void rule__FilterObjectTypeRule__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3528:1: ( ( ( rule__FilterObjectTypeRule__ObjectClassesAssignment_3_1 ) ) )
            // InternalTableDSL.g:3529:1: ( ( rule__FilterObjectTypeRule__ObjectClassesAssignment_3_1 ) )
            {
            // InternalTableDSL.g:3529:1: ( ( rule__FilterObjectTypeRule__ObjectClassesAssignment_3_1 ) )
            // InternalTableDSL.g:3530:2: ( rule__FilterObjectTypeRule__ObjectClassesAssignment_3_1 )
            {
             before(grammarAccess.getFilterObjectTypeRuleAccess().getObjectClassesAssignment_3_1()); 
            // InternalTableDSL.g:3531:2: ( rule__FilterObjectTypeRule__ObjectClassesAssignment_3_1 )
            // InternalTableDSL.g:3531:3: rule__FilterObjectTypeRule__ObjectClassesAssignment_3_1
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


    // $ANTLR start "rule__Reduce__Group__0"
    // InternalTableDSL.g:3540:1: rule__Reduce__Group__0 : rule__Reduce__Group__0__Impl rule__Reduce__Group__1 ;
    public final void rule__Reduce__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3544:1: ( rule__Reduce__Group__0__Impl rule__Reduce__Group__1 )
            // InternalTableDSL.g:3545:2: rule__Reduce__Group__0__Impl rule__Reduce__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Reduce__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reduce__Group__1();

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
    // $ANTLR end "rule__Reduce__Group__0"


    // $ANTLR start "rule__Reduce__Group__0__Impl"
    // InternalTableDSL.g:3552:1: rule__Reduce__Group__0__Impl : ( 'reduce' ) ;
    public final void rule__Reduce__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3556:1: ( ( 'reduce' ) )
            // InternalTableDSL.g:3557:1: ( 'reduce' )
            {
            // InternalTableDSL.g:3557:1: ( 'reduce' )
            // InternalTableDSL.g:3558:2: 'reduce'
            {
             before(grammarAccess.getReduceAccess().getReduceKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getReduceAccess().getReduceKeyword_0()); 

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
    // $ANTLR end "rule__Reduce__Group__0__Impl"


    // $ANTLR start "rule__Reduce__Group__1"
    // InternalTableDSL.g:3567:1: rule__Reduce__Group__1 : rule__Reduce__Group__1__Impl rule__Reduce__Group__2 ;
    public final void rule__Reduce__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3571:1: ( rule__Reduce__Group__1__Impl rule__Reduce__Group__2 )
            // InternalTableDSL.g:3572:2: rule__Reduce__Group__1__Impl rule__Reduce__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__Reduce__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reduce__Group__2();

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
    // $ANTLR end "rule__Reduce__Group__1"


    // $ANTLR start "rule__Reduce__Group__1__Impl"
    // InternalTableDSL.g:3579:1: rule__Reduce__Group__1__Impl : ( ( rule__Reduce__ObjectClassAssignment_1 ) ) ;
    public final void rule__Reduce__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3583:1: ( ( ( rule__Reduce__ObjectClassAssignment_1 ) ) )
            // InternalTableDSL.g:3584:1: ( ( rule__Reduce__ObjectClassAssignment_1 ) )
            {
            // InternalTableDSL.g:3584:1: ( ( rule__Reduce__ObjectClassAssignment_1 ) )
            // InternalTableDSL.g:3585:2: ( rule__Reduce__ObjectClassAssignment_1 )
            {
             before(grammarAccess.getReduceAccess().getObjectClassAssignment_1()); 
            // InternalTableDSL.g:3586:2: ( rule__Reduce__ObjectClassAssignment_1 )
            // InternalTableDSL.g:3586:3: rule__Reduce__ObjectClassAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Reduce__ObjectClassAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReduceAccess().getObjectClassAssignment_1()); 

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
    // $ANTLR end "rule__Reduce__Group__1__Impl"


    // $ANTLR start "rule__Reduce__Group__2"
    // InternalTableDSL.g:3594:1: rule__Reduce__Group__2 : rule__Reduce__Group__2__Impl rule__Reduce__Group__3 ;
    public final void rule__Reduce__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3598:1: ( rule__Reduce__Group__2__Impl rule__Reduce__Group__3 )
            // InternalTableDSL.g:3599:2: rule__Reduce__Group__2__Impl rule__Reduce__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__Reduce__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reduce__Group__3();

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
    // $ANTLR end "rule__Reduce__Group__2"


    // $ANTLR start "rule__Reduce__Group__2__Impl"
    // InternalTableDSL.g:3606:1: rule__Reduce__Group__2__Impl : ( ( 'to' )? ) ;
    public final void rule__Reduce__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3610:1: ( ( ( 'to' )? ) )
            // InternalTableDSL.g:3611:1: ( ( 'to' )? )
            {
            // InternalTableDSL.g:3611:1: ( ( 'to' )? )
            // InternalTableDSL.g:3612:2: ( 'to' )?
            {
             before(grammarAccess.getReduceAccess().getToKeyword_2()); 
            // InternalTableDSL.g:3613:2: ( 'to' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==24) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalTableDSL.g:3613:3: 'to'
                    {
                    match(input,24,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getReduceAccess().getToKeyword_2()); 

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
    // $ANTLR end "rule__Reduce__Group__2__Impl"


    // $ANTLR start "rule__Reduce__Group__3"
    // InternalTableDSL.g:3621:1: rule__Reduce__Group__3 : rule__Reduce__Group__3__Impl rule__Reduce__Group__4 ;
    public final void rule__Reduce__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3625:1: ( rule__Reduce__Group__3__Impl rule__Reduce__Group__4 )
            // InternalTableDSL.g:3626:2: rule__Reduce__Group__3__Impl rule__Reduce__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Reduce__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reduce__Group__4();

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
    // $ANTLR end "rule__Reduce__Group__3"


    // $ANTLR start "rule__Reduce__Group__3__Impl"
    // InternalTableDSL.g:3633:1: rule__Reduce__Group__3__Impl : ( ( rule__Reduce__FunctionsAssignment_3 ) ) ;
    public final void rule__Reduce__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3637:1: ( ( ( rule__Reduce__FunctionsAssignment_3 ) ) )
            // InternalTableDSL.g:3638:1: ( ( rule__Reduce__FunctionsAssignment_3 ) )
            {
            // InternalTableDSL.g:3638:1: ( ( rule__Reduce__FunctionsAssignment_3 ) )
            // InternalTableDSL.g:3639:2: ( rule__Reduce__FunctionsAssignment_3 )
            {
             before(grammarAccess.getReduceAccess().getFunctionsAssignment_3()); 
            // InternalTableDSL.g:3640:2: ( rule__Reduce__FunctionsAssignment_3 )
            // InternalTableDSL.g:3640:3: rule__Reduce__FunctionsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Reduce__FunctionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReduceAccess().getFunctionsAssignment_3()); 

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
    // $ANTLR end "rule__Reduce__Group__3__Impl"


    // $ANTLR start "rule__Reduce__Group__4"
    // InternalTableDSL.g:3648:1: rule__Reduce__Group__4 : rule__Reduce__Group__4__Impl ;
    public final void rule__Reduce__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3652:1: ( rule__Reduce__Group__4__Impl )
            // InternalTableDSL.g:3653:2: rule__Reduce__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reduce__Group__4__Impl();

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
    // $ANTLR end "rule__Reduce__Group__4"


    // $ANTLR start "rule__Reduce__Group__4__Impl"
    // InternalTableDSL.g:3659:1: rule__Reduce__Group__4__Impl : ( ( rule__Reduce__Group_4__0 )* ) ;
    public final void rule__Reduce__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3663:1: ( ( ( rule__Reduce__Group_4__0 )* ) )
            // InternalTableDSL.g:3664:1: ( ( rule__Reduce__Group_4__0 )* )
            {
            // InternalTableDSL.g:3664:1: ( ( rule__Reduce__Group_4__0 )* )
            // InternalTableDSL.g:3665:2: ( rule__Reduce__Group_4__0 )*
            {
             before(grammarAccess.getReduceAccess().getGroup_4()); 
            // InternalTableDSL.g:3666:2: ( rule__Reduce__Group_4__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==22) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalTableDSL.g:3666:3: rule__Reduce__Group_4__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Reduce__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getReduceAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Reduce__Group__4__Impl"


    // $ANTLR start "rule__Reduce__Group_4__0"
    // InternalTableDSL.g:3675:1: rule__Reduce__Group_4__0 : rule__Reduce__Group_4__0__Impl rule__Reduce__Group_4__1 ;
    public final void rule__Reduce__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3679:1: ( rule__Reduce__Group_4__0__Impl rule__Reduce__Group_4__1 )
            // InternalTableDSL.g:3680:2: rule__Reduce__Group_4__0__Impl rule__Reduce__Group_4__1
            {
            pushFollow(FOLLOW_30);
            rule__Reduce__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reduce__Group_4__1();

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
    // $ANTLR end "rule__Reduce__Group_4__0"


    // $ANTLR start "rule__Reduce__Group_4__0__Impl"
    // InternalTableDSL.g:3687:1: rule__Reduce__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Reduce__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3691:1: ( ( ',' ) )
            // InternalTableDSL.g:3692:1: ( ',' )
            {
            // InternalTableDSL.g:3692:1: ( ',' )
            // InternalTableDSL.g:3693:2: ','
            {
             before(grammarAccess.getReduceAccess().getCommaKeyword_4_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getReduceAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__Reduce__Group_4__0__Impl"


    // $ANTLR start "rule__Reduce__Group_4__1"
    // InternalTableDSL.g:3702:1: rule__Reduce__Group_4__1 : rule__Reduce__Group_4__1__Impl ;
    public final void rule__Reduce__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3706:1: ( rule__Reduce__Group_4__1__Impl )
            // InternalTableDSL.g:3707:2: rule__Reduce__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reduce__Group_4__1__Impl();

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
    // $ANTLR end "rule__Reduce__Group_4__1"


    // $ANTLR start "rule__Reduce__Group_4__1__Impl"
    // InternalTableDSL.g:3713:1: rule__Reduce__Group_4__1__Impl : ( ( rule__Reduce__FunctionsAssignment_4_1 ) ) ;
    public final void rule__Reduce__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3717:1: ( ( ( rule__Reduce__FunctionsAssignment_4_1 ) ) )
            // InternalTableDSL.g:3718:1: ( ( rule__Reduce__FunctionsAssignment_4_1 ) )
            {
            // InternalTableDSL.g:3718:1: ( ( rule__Reduce__FunctionsAssignment_4_1 ) )
            // InternalTableDSL.g:3719:2: ( rule__Reduce__FunctionsAssignment_4_1 )
            {
             before(grammarAccess.getReduceAccess().getFunctionsAssignment_4_1()); 
            // InternalTableDSL.g:3720:2: ( rule__Reduce__FunctionsAssignment_4_1 )
            // InternalTableDSL.g:3720:3: rule__Reduce__FunctionsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Reduce__FunctionsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getReduceAccess().getFunctionsAssignment_4_1()); 

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
    // $ANTLR end "rule__Reduce__Group_4__1__Impl"


    // $ANTLR start "rule__Start__ActionsAssignment_0"
    // InternalTableDSL.g:3729:1: rule__Start__ActionsAssignment_0 : ( ruleCreateTable ) ;
    public final void rule__Start__ActionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3733:1: ( ( ruleCreateTable ) )
            // InternalTableDSL.g:3734:2: ( ruleCreateTable )
            {
            // InternalTableDSL.g:3734:2: ( ruleCreateTable )
            // InternalTableDSL.g:3735:3: ruleCreateTable
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
    // InternalTableDSL.g:3744:1: rule__Start__ActionsAssignment_1 : ( ruleTableAction ) ;
    public final void rule__Start__ActionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3748:1: ( ( ruleTableAction ) )
            // InternalTableDSL.g:3749:2: ( ruleTableAction )
            {
            // InternalTableDSL.g:3749:2: ( ruleTableAction )
            // InternalTableDSL.g:3750:3: ruleTableAction
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
    // InternalTableDSL.g:3759:1: rule__TableInputPath__PathPatternsAssignment_0 : ( RULE_STRING ) ;
    public final void rule__TableInputPath__PathPatternsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3763:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3764:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3764:2: ( RULE_STRING )
            // InternalTableDSL.g:3765:3: RULE_STRING
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
    // InternalTableDSL.g:3774:1: rule__TableInputPath__PathPatternsAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__TableInputPath__PathPatternsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3778:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3779:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3779:2: ( RULE_STRING )
            // InternalTableDSL.g:3780:3: RULE_STRING
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
    // InternalTableDSL.g:3789:1: rule__Output__OutputPathsAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Output__OutputPathsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3793:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3794:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3794:2: ( RULE_STRING )
            // InternalTableDSL.g:3795:3: RULE_STRING
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
    // InternalTableDSL.g:3804:1: rule__Output__OutputPathsAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Output__OutputPathsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3808:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3809:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3809:2: ( RULE_STRING )
            // InternalTableDSL.g:3810:3: RULE_STRING
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


    // $ANTLR start "rule__Select__ColumnPatternsAssignment_1"
    // InternalTableDSL.g:3819:1: rule__Select__ColumnPatternsAssignment_1 : ( ruleColumnName ) ;
    public final void rule__Select__ColumnPatternsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3823:1: ( ( ruleColumnName ) )
            // InternalTableDSL.g:3824:2: ( ruleColumnName )
            {
            // InternalTableDSL.g:3824:2: ( ruleColumnName )
            // InternalTableDSL.g:3825:3: ruleColumnName
            {
             before(grammarAccess.getSelectAccess().getColumnPatternsColumnNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnName();

            state._fsp--;

             after(grammarAccess.getSelectAccess().getColumnPatternsColumnNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Select__ColumnPatternsAssignment_1"


    // $ANTLR start "rule__Select__ColumnPatternsAssignment_2_1"
    // InternalTableDSL.g:3834:1: rule__Select__ColumnPatternsAssignment_2_1 : ( ruleColumnName ) ;
    public final void rule__Select__ColumnPatternsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3838:1: ( ( ruleColumnName ) )
            // InternalTableDSL.g:3839:2: ( ruleColumnName )
            {
            // InternalTableDSL.g:3839:2: ( ruleColumnName )
            // InternalTableDSL.g:3840:3: ruleColumnName
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
    // InternalTableDSL.g:3849:1: rule__RenameColumn__RenameTuplesAssignment_2 : ( ruleRenameColumnPair ) ;
    public final void rule__RenameColumn__RenameTuplesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3853:1: ( ( ruleRenameColumnPair ) )
            // InternalTableDSL.g:3854:2: ( ruleRenameColumnPair )
            {
            // InternalTableDSL.g:3854:2: ( ruleRenameColumnPair )
            // InternalTableDSL.g:3855:3: ruleRenameColumnPair
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


    // $ANTLR start "rule__RenameColumn__RenameTuplesAssignment_3_1"
    // InternalTableDSL.g:3864:1: rule__RenameColumn__RenameTuplesAssignment_3_1 : ( ruleRenameColumnPair ) ;
    public final void rule__RenameColumn__RenameTuplesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3868:1: ( ( ruleRenameColumnPair ) )
            // InternalTableDSL.g:3869:2: ( ruleRenameColumnPair )
            {
            // InternalTableDSL.g:3869:2: ( ruleRenameColumnPair )
            // InternalTableDSL.g:3870:3: ruleRenameColumnPair
            {
             before(grammarAccess.getRenameColumnAccess().getRenameTuplesRenameColumnPairParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRenameColumnPair();

            state._fsp--;

             after(grammarAccess.getRenameColumnAccess().getRenameTuplesRenameColumnPairParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__RenameColumn__RenameTuplesAssignment_3_1"


    // $ANTLR start "rule__RenameColumnToPair__OldNameAssignment_0"
    // InternalTableDSL.g:3879:1: rule__RenameColumnToPair__OldNameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__RenameColumnToPair__OldNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3883:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3884:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3884:2: ( RULE_STRING )
            // InternalTableDSL.g:3885:3: RULE_STRING
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
    // InternalTableDSL.g:3894:1: rule__RenameColumnToPair__NewNameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__RenameColumnToPair__NewNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3898:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3899:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3899:2: ( RULE_STRING )
            // InternalTableDSL.g:3900:3: RULE_STRING
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
    // InternalTableDSL.g:3909:1: rule__RenameColumnPrependPair__OldNameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__RenameColumnPrependPair__OldNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3913:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3914:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3914:2: ( RULE_STRING )
            // InternalTableDSL.g:3915:3: RULE_STRING
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
    // InternalTableDSL.g:3924:1: rule__RenameColumnPrependPair__PrefixAssignment_2 : ( RULE_STRING ) ;
    public final void rule__RenameColumnPrependPair__PrefixAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3928:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3929:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3929:2: ( RULE_STRING )
            // InternalTableDSL.g:3930:3: RULE_STRING
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
    // InternalTableDSL.g:3939:1: rule__RenameColumnAppendPair__OldNameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__RenameColumnAppendPair__OldNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3943:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3944:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3944:2: ( RULE_STRING )
            // InternalTableDSL.g:3945:3: RULE_STRING
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
    // InternalTableDSL.g:3954:1: rule__RenameColumnAppendPair__SuffixAssignment_2 : ( RULE_STRING ) ;
    public final void rule__RenameColumnAppendPair__SuffixAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3958:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:3959:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:3959:2: ( RULE_STRING )
            // InternalTableDSL.g:3960:3: RULE_STRING
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
    // InternalTableDSL.g:3969:1: rule__Extract__TargetsAssignment_1 : ( ruleExtractColumnMapping ) ;
    public final void rule__Extract__TargetsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3973:1: ( ( ruleExtractColumnMapping ) )
            // InternalTableDSL.g:3974:2: ( ruleExtractColumnMapping )
            {
            // InternalTableDSL.g:3974:2: ( ruleExtractColumnMapping )
            // InternalTableDSL.g:3975:3: ruleExtractColumnMapping
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
    // InternalTableDSL.g:3984:1: rule__Extract__TargetsAssignment_2_1 : ( ruleExtractColumnMapping ) ;
    public final void rule__Extract__TargetsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:3988:1: ( ( ruleExtractColumnMapping ) )
            // InternalTableDSL.g:3989:2: ( ruleExtractColumnMapping )
            {
            // InternalTableDSL.g:3989:2: ( ruleExtractColumnMapping )
            // InternalTableDSL.g:3990:3: ruleExtractColumnMapping
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
    // InternalTableDSL.g:3999:1: rule__Extract__SourceColumnAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Extract__SourceColumnAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:4003:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:4004:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:4004:2: ( RULE_STRING )
            // InternalTableDSL.g:4005:3: RULE_STRING
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
    // InternalTableDSL.g:4014:1: rule__Extract__SelectorAssignment_6 : ( ruleSelector ) ;
    public final void rule__Extract__SelectorAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:4018:1: ( ( ruleSelector ) )
            // InternalTableDSL.g:4019:2: ( ruleSelector )
            {
            // InternalTableDSL.g:4019:2: ( ruleSelector )
            // InternalTableDSL.g:4020:3: ruleSelector
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
    // InternalTableDSL.g:4029:1: rule__Extract__ComparatorAssignment_9 : ( ruleComparator ) ;
    public final void rule__Extract__ComparatorAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:4033:1: ( ( ruleComparator ) )
            // InternalTableDSL.g:4034:2: ( ruleComparator )
            {
            // InternalTableDSL.g:4034:2: ( ruleComparator )
            // InternalTableDSL.g:4035:3: ruleComparator
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
    // InternalTableDSL.g:4044:1: rule__ExtractColumnMapping__TargetColumnAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ExtractColumnMapping__TargetColumnAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:4048:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:4049:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:4049:2: ( RULE_STRING )
            // InternalTableDSL.g:4050:3: RULE_STRING
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
    // InternalTableDSL.g:4059:1: rule__ExtractColumnMapping__NewNameAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__ExtractColumnMapping__NewNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:4063:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:4064:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:4064:2: ( RULE_STRING )
            // InternalTableDSL.g:4065:3: RULE_STRING
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
    // InternalTableDSL.g:4074:1: rule__KeySelector__KeyAssignment : ( RULE_SELECTOR_KEYWORDS ) ;
    public final void rule__KeySelector__KeyAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:4078:1: ( ( RULE_SELECTOR_KEYWORDS ) )
            // InternalTableDSL.g:4079:2: ( RULE_SELECTOR_KEYWORDS )
            {
            // InternalTableDSL.g:4079:2: ( RULE_SELECTOR_KEYWORDS )
            // InternalTableDSL.g:4080:3: RULE_SELECTOR_KEYWORDS
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
    // InternalTableDSL.g:4089:1: rule__TopNSelector__NAssignment_1 : ( RULE_INT ) ;
    public final void rule__TopNSelector__NAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:4093:1: ( ( RULE_INT ) )
            // InternalTableDSL.g:4094:2: ( RULE_INT )
            {
            // InternalTableDSL.g:4094:2: ( RULE_INT )
            // InternalTableDSL.g:4095:3: RULE_INT
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
    // InternalTableDSL.g:4104:1: rule__Comparator__KeysAssignment_0 : ( ruleColumnName ) ;
    public final void rule__Comparator__KeysAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:4108:1: ( ( ruleColumnName ) )
            // InternalTableDSL.g:4109:2: ( ruleColumnName )
            {
            // InternalTableDSL.g:4109:2: ( ruleColumnName )
            // InternalTableDSL.g:4110:3: ruleColumnName
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
    // InternalTableDSL.g:4119:1: rule__Comparator__KeysAssignment_1_1 : ( ruleColumnName ) ;
    public final void rule__Comparator__KeysAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:4123:1: ( ( ruleColumnName ) )
            // InternalTableDSL.g:4124:2: ( ruleColumnName )
            {
            // InternalTableDSL.g:4124:2: ( ruleColumnName )
            // InternalTableDSL.g:4125:3: ruleColumnName
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
    // InternalTableDSL.g:4134:1: rule__SquashRows__ColumnsAssignment_3 : ( ruleColumnName ) ;
    public final void rule__SquashRows__ColumnsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:4138:1: ( ( ruleColumnName ) )
            // InternalTableDSL.g:4139:2: ( ruleColumnName )
            {
            // InternalTableDSL.g:4139:2: ( ruleColumnName )
            // InternalTableDSL.g:4140:3: ruleColumnName
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
    // InternalTableDSL.g:4149:1: rule__SquashRows__ColumnsAssignment_4_1 : ( ruleColumnName ) ;
    public final void rule__SquashRows__ColumnsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:4153:1: ( ( ruleColumnName ) )
            // InternalTableDSL.g:4154:2: ( ruleColumnName )
            {
            // InternalTableDSL.g:4154:2: ( ruleColumnName )
            // InternalTableDSL.g:4155:3: ruleColumnName
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
    // InternalTableDSL.g:4164:1: rule__Filter__DenylistAssignment_1 : ( ruleFilterDenylist ) ;
    public final void rule__Filter__DenylistAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:4168:1: ( ( ruleFilterDenylist ) )
            // InternalTableDSL.g:4169:2: ( ruleFilterDenylist )
            {
            // InternalTableDSL.g:4169:2: ( ruleFilterDenylist )
            // InternalTableDSL.g:4170:3: ruleFilterDenylist
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
    // InternalTableDSL.g:4179:1: rule__Filter__ExceptlistAssignment_2 : ( ruleFilterExceptlist ) ;
    public final void rule__Filter__ExceptlistAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:4183:1: ( ( ruleFilterExceptlist ) )
            // InternalTableDSL.g:4184:2: ( ruleFilterExceptlist )
            {
            // InternalTableDSL.g:4184:2: ( ruleFilterExceptlist )
            // InternalTableDSL.g:4185:3: ruleFilterExceptlist
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
    // InternalTableDSL.g:4194:1: rule__FilterDenylist__DenylistAssignment_1 : ( ruleFilterRule ) ;
    public final void rule__FilterDenylist__DenylistAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:4198:1: ( ( ruleFilterRule ) )
            // InternalTableDSL.g:4199:2: ( ruleFilterRule )
            {
            // InternalTableDSL.g:4199:2: ( ruleFilterRule )
            // InternalTableDSL.g:4200:3: ruleFilterRule
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
    // InternalTableDSL.g:4209:1: rule__FilterDenylist__DenylistAssignment_2_1 : ( ruleFilterRule ) ;
    public final void rule__FilterDenylist__DenylistAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:4213:1: ( ( ruleFilterRule ) )
            // InternalTableDSL.g:4214:2: ( ruleFilterRule )
            {
            // InternalTableDSL.g:4214:2: ( ruleFilterRule )
            // InternalTableDSL.g:4215:3: ruleFilterRule
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
    // InternalTableDSL.g:4224:1: rule__FilterExceptlist__ExceptlistAssignment_1 : ( ruleFilterRule ) ;
    public final void rule__FilterExceptlist__ExceptlistAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:4228:1: ( ( ruleFilterRule ) )
            // InternalTableDSL.g:4229:2: ( ruleFilterRule )
            {
            // InternalTableDSL.g:4229:2: ( ruleFilterRule )
            // InternalTableDSL.g:4230:3: ruleFilterRule
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
    // InternalTableDSL.g:4239:1: rule__FilterExceptlist__ExceptlistAssignment_2_1 : ( ruleFilterRule ) ;
    public final void rule__FilterExceptlist__ExceptlistAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:4243:1: ( ( ruleFilterRule ) )
            // InternalTableDSL.g:4244:2: ( ruleFilterRule )
            {
            // InternalTableDSL.g:4244:2: ( ruleFilterRule )
            // InternalTableDSL.g:4245:3: ruleFilterRule
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
    // InternalTableDSL.g:4254:1: rule__FilterColumnRule__ColumnPatternsAssignment_1 : ( ruleColumnName ) ;
    public final void rule__FilterColumnRule__ColumnPatternsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:4258:1: ( ( ruleColumnName ) )
            // InternalTableDSL.g:4259:2: ( ruleColumnName )
            {
            // InternalTableDSL.g:4259:2: ( ruleColumnName )
            // InternalTableDSL.g:4260:3: ruleColumnName
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
    // InternalTableDSL.g:4269:1: rule__FilterColumnRule__ColumnPatternsAssignment_2_1 : ( ruleColumnName ) ;
    public final void rule__FilterColumnRule__ColumnPatternsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:4273:1: ( ( ruleColumnName ) )
            // InternalTableDSL.g:4274:2: ( ruleColumnName )
            {
            // InternalTableDSL.g:4274:2: ( ruleColumnName )
            // InternalTableDSL.g:4275:3: ruleColumnName
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
    // InternalTableDSL.g:4284:1: rule__FilterObjectTypeRule__ObjectClassesAssignment_2 : ( ruleObjectTypeSelector ) ;
    public final void rule__FilterObjectTypeRule__ObjectClassesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:4288:1: ( ( ruleObjectTypeSelector ) )
            // InternalTableDSL.g:4289:2: ( ruleObjectTypeSelector )
            {
            // InternalTableDSL.g:4289:2: ( ruleObjectTypeSelector )
            // InternalTableDSL.g:4290:3: ruleObjectTypeSelector
            {
             before(grammarAccess.getFilterObjectTypeRuleAccess().getObjectClassesObjectTypeSelectorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleObjectTypeSelector();

            state._fsp--;

             after(grammarAccess.getFilterObjectTypeRuleAccess().getObjectClassesObjectTypeSelectorParserRuleCall_2_0()); 

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
    // InternalTableDSL.g:4299:1: rule__FilterObjectTypeRule__ObjectClassesAssignment_3_1 : ( ruleObjectTypeSelector ) ;
    public final void rule__FilterObjectTypeRule__ObjectClassesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:4303:1: ( ( ruleObjectTypeSelector ) )
            // InternalTableDSL.g:4304:2: ( ruleObjectTypeSelector )
            {
            // InternalTableDSL.g:4304:2: ( ruleObjectTypeSelector )
            // InternalTableDSL.g:4305:3: ruleObjectTypeSelector
            {
             before(grammarAccess.getFilterObjectTypeRuleAccess().getObjectClassesObjectTypeSelectorParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleObjectTypeSelector();

            state._fsp--;

             after(grammarAccess.getFilterObjectTypeRuleAccess().getObjectClassesObjectTypeSelectorParserRuleCall_3_1_0()); 

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


    // $ANTLR start "rule__Reduce__ObjectClassAssignment_1"
    // InternalTableDSL.g:4314:1: rule__Reduce__ObjectClassAssignment_1 : ( ruleObjectTypeSelector ) ;
    public final void rule__Reduce__ObjectClassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:4318:1: ( ( ruleObjectTypeSelector ) )
            // InternalTableDSL.g:4319:2: ( ruleObjectTypeSelector )
            {
            // InternalTableDSL.g:4319:2: ( ruleObjectTypeSelector )
            // InternalTableDSL.g:4320:3: ruleObjectTypeSelector
            {
             before(grammarAccess.getReduceAccess().getObjectClassObjectTypeSelectorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleObjectTypeSelector();

            state._fsp--;

             after(grammarAccess.getReduceAccess().getObjectClassObjectTypeSelectorParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Reduce__ObjectClassAssignment_1"


    // $ANTLR start "rule__Reduce__FunctionsAssignment_3"
    // InternalTableDSL.g:4329:1: rule__Reduce__FunctionsAssignment_3 : ( RULE_SELECTOR_KEYWORDS ) ;
    public final void rule__Reduce__FunctionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:4333:1: ( ( RULE_SELECTOR_KEYWORDS ) )
            // InternalTableDSL.g:4334:2: ( RULE_SELECTOR_KEYWORDS )
            {
            // InternalTableDSL.g:4334:2: ( RULE_SELECTOR_KEYWORDS )
            // InternalTableDSL.g:4335:3: RULE_SELECTOR_KEYWORDS
            {
             before(grammarAccess.getReduceAccess().getFunctionsSELECTOR_KEYWORDSTerminalRuleCall_3_0()); 
            match(input,RULE_SELECTOR_KEYWORDS,FOLLOW_2); 
             after(grammarAccess.getReduceAccess().getFunctionsSELECTOR_KEYWORDSTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Reduce__FunctionsAssignment_3"


    // $ANTLR start "rule__Reduce__FunctionsAssignment_4_1"
    // InternalTableDSL.g:4344:1: rule__Reduce__FunctionsAssignment_4_1 : ( RULE_SELECTOR_KEYWORDS ) ;
    public final void rule__Reduce__FunctionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:4348:1: ( ( RULE_SELECTOR_KEYWORDS ) )
            // InternalTableDSL.g:4349:2: ( RULE_SELECTOR_KEYWORDS )
            {
            // InternalTableDSL.g:4349:2: ( RULE_SELECTOR_KEYWORDS )
            // InternalTableDSL.g:4350:3: RULE_SELECTOR_KEYWORDS
            {
             before(grammarAccess.getReduceAccess().getFunctionsSELECTOR_KEYWORDSTerminalRuleCall_4_1_0()); 
            match(input,RULE_SELECTOR_KEYWORDS,FOLLOW_2); 
             after(grammarAccess.getReduceAccess().getFunctionsSELECTOR_KEYWORDSTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Reduce__FunctionsAssignment_4_1"


    // $ANTLR start "rule__ColumnName__ColumnNameAssignment"
    // InternalTableDSL.g:4359:1: rule__ColumnName__ColumnNameAssignment : ( ( rule__ColumnName__ColumnNameAlternatives_0 ) ) ;
    public final void rule__ColumnName__ColumnNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:4363:1: ( ( ( rule__ColumnName__ColumnNameAlternatives_0 ) ) )
            // InternalTableDSL.g:4364:2: ( ( rule__ColumnName__ColumnNameAlternatives_0 ) )
            {
            // InternalTableDSL.g:4364:2: ( ( rule__ColumnName__ColumnNameAlternatives_0 ) )
            // InternalTableDSL.g:4365:3: ( rule__ColumnName__ColumnNameAlternatives_0 )
            {
             before(grammarAccess.getColumnNameAccess().getColumnNameAlternatives_0()); 
            // InternalTableDSL.g:4366:3: ( rule__ColumnName__ColumnNameAlternatives_0 )
            // InternalTableDSL.g:4366:4: rule__ColumnName__ColumnNameAlternatives_0
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


    // $ANTLR start "rule__ObjectTypeSelector__ObjectTypeAssignment"
    // InternalTableDSL.g:4374:1: rule__ObjectTypeSelector__ObjectTypeAssignment : ( ( rule__ObjectTypeSelector__ObjectTypeAlternatives_0 ) ) ;
    public final void rule__ObjectTypeSelector__ObjectTypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:4378:1: ( ( ( rule__ObjectTypeSelector__ObjectTypeAlternatives_0 ) ) )
            // InternalTableDSL.g:4379:2: ( ( rule__ObjectTypeSelector__ObjectTypeAlternatives_0 ) )
            {
            // InternalTableDSL.g:4379:2: ( ( rule__ObjectTypeSelector__ObjectTypeAlternatives_0 ) )
            // InternalTableDSL.g:4380:3: ( rule__ObjectTypeSelector__ObjectTypeAlternatives_0 )
            {
             before(grammarAccess.getObjectTypeSelectorAccess().getObjectTypeAlternatives_0()); 
            // InternalTableDSL.g:4381:3: ( rule__ObjectTypeSelector__ObjectTypeAlternatives_0 )
            // InternalTableDSL.g:4381:4: rule__ObjectTypeSelector__ObjectTypeAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectTypeSelector__ObjectTypeAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getObjectTypeSelectorAccess().getObjectTypeAlternatives_0()); 

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
    // $ANTLR end "rule__ObjectTypeSelector__ObjectTypeAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000011426A00000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000011426A00002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200000100L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000880000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000060L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000001000100L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000100L});

}