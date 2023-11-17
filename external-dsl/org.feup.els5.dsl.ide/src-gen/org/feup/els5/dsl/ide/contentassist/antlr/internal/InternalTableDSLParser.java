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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SEP", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'create'", "'table'", "'from'", "'load'", "'output'", "'to'", "'select'", "'rename'", "'extract'", "'squash'", "'rows'", "'by'", "'filter'"
    };
    public static final int RULE_SEP=4;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=7;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
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
    // InternalTableDSL.g:112:1: ruleTableAction : ( ( rule__TableAction__Alternatives ) ) ;
    public final void ruleTableAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:116:2: ( ( ( rule__TableAction__Alternatives ) ) )
            // InternalTableDSL.g:117:2: ( ( rule__TableAction__Alternatives ) )
            {
            // InternalTableDSL.g:117:2: ( ( rule__TableAction__Alternatives ) )
            // InternalTableDSL.g:118:3: ( rule__TableAction__Alternatives )
            {
             before(grammarAccess.getTableActionAccess().getAlternatives()); 
            // InternalTableDSL.g:119:3: ( rule__TableAction__Alternatives )
            // InternalTableDSL.g:119:4: rule__TableAction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TableAction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTableActionAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalTableDSL.g:162:1: ruleTableInputPath : ( ( ( rule__TableInputPath__PathPatternsAssignment ) ) ( ( rule__TableInputPath__PathPatternsAssignment )* ) ) ;
    public final void ruleTableInputPath() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:166:2: ( ( ( ( rule__TableInputPath__PathPatternsAssignment ) ) ( ( rule__TableInputPath__PathPatternsAssignment )* ) ) )
            // InternalTableDSL.g:167:2: ( ( ( rule__TableInputPath__PathPatternsAssignment ) ) ( ( rule__TableInputPath__PathPatternsAssignment )* ) )
            {
            // InternalTableDSL.g:167:2: ( ( ( rule__TableInputPath__PathPatternsAssignment ) ) ( ( rule__TableInputPath__PathPatternsAssignment )* ) )
            // InternalTableDSL.g:168:3: ( ( rule__TableInputPath__PathPatternsAssignment ) ) ( ( rule__TableInputPath__PathPatternsAssignment )* )
            {
            // InternalTableDSL.g:168:3: ( ( rule__TableInputPath__PathPatternsAssignment ) )
            // InternalTableDSL.g:169:4: ( rule__TableInputPath__PathPatternsAssignment )
            {
             before(grammarAccess.getTableInputPathAccess().getPathPatternsAssignment()); 
            // InternalTableDSL.g:170:4: ( rule__TableInputPath__PathPatternsAssignment )
            // InternalTableDSL.g:170:5: rule__TableInputPath__PathPatternsAssignment
            {
            pushFollow(FOLLOW_3);
            rule__TableInputPath__PathPatternsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTableInputPathAccess().getPathPatternsAssignment()); 

            }

            // InternalTableDSL.g:173:3: ( ( rule__TableInputPath__PathPatternsAssignment )* )
            // InternalTableDSL.g:174:4: ( rule__TableInputPath__PathPatternsAssignment )*
            {
             before(grammarAccess.getTableInputPathAccess().getPathPatternsAssignment()); 
            // InternalTableDSL.g:175:4: ( rule__TableInputPath__PathPatternsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_STRING) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTableDSL.g:175:5: rule__TableInputPath__PathPatternsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__TableInputPath__PathPatternsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getTableInputPathAccess().getPathPatternsAssignment()); 

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
    // $ANTLR end "ruleTableInputPath"


    // $ANTLR start "entryRuleOutput"
    // InternalTableDSL.g:185:1: entryRuleOutput : ruleOutput EOF ;
    public final void entryRuleOutput() throws RecognitionException {
        try {
            // InternalTableDSL.g:186:1: ( ruleOutput EOF )
            // InternalTableDSL.g:187:1: ruleOutput EOF
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
    // InternalTableDSL.g:194:1: ruleOutput : ( ( rule__Output__Group__0 ) ) ;
    public final void ruleOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:198:2: ( ( ( rule__Output__Group__0 ) ) )
            // InternalTableDSL.g:199:2: ( ( rule__Output__Group__0 ) )
            {
            // InternalTableDSL.g:199:2: ( ( rule__Output__Group__0 ) )
            // InternalTableDSL.g:200:3: ( rule__Output__Group__0 )
            {
             before(grammarAccess.getOutputAccess().getGroup()); 
            // InternalTableDSL.g:201:3: ( rule__Output__Group__0 )
            // InternalTableDSL.g:201:4: rule__Output__Group__0
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
    // InternalTableDSL.g:210:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalTableDSL.g:211:1: ( ruleOperation EOF )
            // InternalTableDSL.g:212:1: ruleOperation EOF
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
    // InternalTableDSL.g:219:1: ruleOperation : ( ( rule__Operation__Alternatives ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:223:2: ( ( ( rule__Operation__Alternatives ) ) )
            // InternalTableDSL.g:224:2: ( ( rule__Operation__Alternatives ) )
            {
            // InternalTableDSL.g:224:2: ( ( rule__Operation__Alternatives ) )
            // InternalTableDSL.g:225:3: ( rule__Operation__Alternatives )
            {
             before(grammarAccess.getOperationAccess().getAlternatives()); 
            // InternalTableDSL.g:226:3: ( rule__Operation__Alternatives )
            // InternalTableDSL.g:226:4: rule__Operation__Alternatives
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
    // InternalTableDSL.g:235:1: entryRuleSelect : ruleSelect EOF ;
    public final void entryRuleSelect() throws RecognitionException {
        try {
            // InternalTableDSL.g:236:1: ( ruleSelect EOF )
            // InternalTableDSL.g:237:1: ruleSelect EOF
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
    // InternalTableDSL.g:244:1: ruleSelect : ( ( rule__Select__Group__0 ) ) ;
    public final void ruleSelect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:248:2: ( ( ( rule__Select__Group__0 ) ) )
            // InternalTableDSL.g:249:2: ( ( rule__Select__Group__0 ) )
            {
            // InternalTableDSL.g:249:2: ( ( rule__Select__Group__0 ) )
            // InternalTableDSL.g:250:3: ( rule__Select__Group__0 )
            {
             before(grammarAccess.getSelectAccess().getGroup()); 
            // InternalTableDSL.g:251:3: ( rule__Select__Group__0 )
            // InternalTableDSL.g:251:4: rule__Select__Group__0
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
    // InternalTableDSL.g:260:1: entryRuleRenameColumn : ruleRenameColumn EOF ;
    public final void entryRuleRenameColumn() throws RecognitionException {
        try {
            // InternalTableDSL.g:261:1: ( ruleRenameColumn EOF )
            // InternalTableDSL.g:262:1: ruleRenameColumn EOF
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
    // InternalTableDSL.g:269:1: ruleRenameColumn : ( ( rule__RenameColumn__Group__0 ) ) ;
    public final void ruleRenameColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:273:2: ( ( ( rule__RenameColumn__Group__0 ) ) )
            // InternalTableDSL.g:274:2: ( ( rule__RenameColumn__Group__0 ) )
            {
            // InternalTableDSL.g:274:2: ( ( rule__RenameColumn__Group__0 ) )
            // InternalTableDSL.g:275:3: ( rule__RenameColumn__Group__0 )
            {
             before(grammarAccess.getRenameColumnAccess().getGroup()); 
            // InternalTableDSL.g:276:3: ( rule__RenameColumn__Group__0 )
            // InternalTableDSL.g:276:4: rule__RenameColumn__Group__0
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


    // $ANTLR start "entryRuleExtract"
    // InternalTableDSL.g:285:1: entryRuleExtract : ruleExtract EOF ;
    public final void entryRuleExtract() throws RecognitionException {
        try {
            // InternalTableDSL.g:286:1: ( ruleExtract EOF )
            // InternalTableDSL.g:287:1: ruleExtract EOF
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
    // InternalTableDSL.g:294:1: ruleExtract : ( ( rule__Extract__Group__0 ) ) ;
    public final void ruleExtract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:298:2: ( ( ( rule__Extract__Group__0 ) ) )
            // InternalTableDSL.g:299:2: ( ( rule__Extract__Group__0 ) )
            {
            // InternalTableDSL.g:299:2: ( ( rule__Extract__Group__0 ) )
            // InternalTableDSL.g:300:3: ( rule__Extract__Group__0 )
            {
             before(grammarAccess.getExtractAccess().getGroup()); 
            // InternalTableDSL.g:301:3: ( rule__Extract__Group__0 )
            // InternalTableDSL.g:301:4: rule__Extract__Group__0
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


    // $ANTLR start "entryRuleSquashRows"
    // InternalTableDSL.g:310:1: entryRuleSquashRows : ruleSquashRows EOF ;
    public final void entryRuleSquashRows() throws RecognitionException {
        try {
            // InternalTableDSL.g:311:1: ( ruleSquashRows EOF )
            // InternalTableDSL.g:312:1: ruleSquashRows EOF
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
    // InternalTableDSL.g:319:1: ruleSquashRows : ( ( rule__SquashRows__Group__0 ) ) ;
    public final void ruleSquashRows() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:323:2: ( ( ( rule__SquashRows__Group__0 ) ) )
            // InternalTableDSL.g:324:2: ( ( rule__SquashRows__Group__0 ) )
            {
            // InternalTableDSL.g:324:2: ( ( rule__SquashRows__Group__0 ) )
            // InternalTableDSL.g:325:3: ( rule__SquashRows__Group__0 )
            {
             before(grammarAccess.getSquashRowsAccess().getGroup()); 
            // InternalTableDSL.g:326:3: ( rule__SquashRows__Group__0 )
            // InternalTableDSL.g:326:4: rule__SquashRows__Group__0
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
    // InternalTableDSL.g:335:1: entryRuleFilter : ruleFilter EOF ;
    public final void entryRuleFilter() throws RecognitionException {
        try {
            // InternalTableDSL.g:336:1: ( ruleFilter EOF )
            // InternalTableDSL.g:337:1: ruleFilter EOF
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
    // InternalTableDSL.g:344:1: ruleFilter : ( ( rule__Filter__Group__0 ) ) ;
    public final void ruleFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:348:2: ( ( ( rule__Filter__Group__0 ) ) )
            // InternalTableDSL.g:349:2: ( ( rule__Filter__Group__0 ) )
            {
            // InternalTableDSL.g:349:2: ( ( rule__Filter__Group__0 ) )
            // InternalTableDSL.g:350:3: ( rule__Filter__Group__0 )
            {
             before(grammarAccess.getFilterAccess().getGroup()); 
            // InternalTableDSL.g:351:3: ( rule__Filter__Group__0 )
            // InternalTableDSL.g:351:4: rule__Filter__Group__0
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


    // $ANTLR start "rule__TableAction__Alternatives"
    // InternalTableDSL.g:359:1: rule__TableAction__Alternatives : ( ( ruleLoadData ) | ( ruleOperation ) | ( ( rule__TableAction__Group_2__0 ) ) );
    public final void rule__TableAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:363:1: ( ( ruleLoadData ) | ( ruleOperation ) | ( ( rule__TableAction__Group_2__0 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 24:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalTableDSL.g:364:2: ( ruleLoadData )
                    {
                    // InternalTableDSL.g:364:2: ( ruleLoadData )
                    // InternalTableDSL.g:365:3: ruleLoadData
                    {
                     before(grammarAccess.getTableActionAccess().getLoadDataParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLoadData();

                    state._fsp--;

                     after(grammarAccess.getTableActionAccess().getLoadDataParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTableDSL.g:370:2: ( ruleOperation )
                    {
                    // InternalTableDSL.g:370:2: ( ruleOperation )
                    // InternalTableDSL.g:371:3: ruleOperation
                    {
                     before(grammarAccess.getTableActionAccess().getOperationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOperation();

                    state._fsp--;

                     after(grammarAccess.getTableActionAccess().getOperationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTableDSL.g:376:2: ( ( rule__TableAction__Group_2__0 ) )
                    {
                    // InternalTableDSL.g:376:2: ( ( rule__TableAction__Group_2__0 ) )
                    // InternalTableDSL.g:377:3: ( rule__TableAction__Group_2__0 )
                    {
                     before(grammarAccess.getTableActionAccess().getGroup_2()); 
                    // InternalTableDSL.g:378:3: ( rule__TableAction__Group_2__0 )
                    // InternalTableDSL.g:378:4: rule__TableAction__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TableAction__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTableActionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__TableAction__Alternatives"


    // $ANTLR start "rule__Operation__Alternatives"
    // InternalTableDSL.g:386:1: rule__Operation__Alternatives : ( ( ruleSelect ) | ( ruleRenameColumn ) | ( ruleExtract ) | ( ruleSquashRows ) | ( ruleFilter ) );
    public final void rule__Operation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:390:1: ( ( ruleSelect ) | ( ruleRenameColumn ) | ( ruleExtract ) | ( ruleSquashRows ) | ( ruleFilter ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt3=1;
                }
                break;
            case 19:
                {
                alt3=2;
                }
                break;
            case 20:
                {
                alt3=3;
                }
                break;
            case 21:
                {
                alt3=4;
                }
                break;
            case 24:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalTableDSL.g:391:2: ( ruleSelect )
                    {
                    // InternalTableDSL.g:391:2: ( ruleSelect )
                    // InternalTableDSL.g:392:3: ruleSelect
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
                    // InternalTableDSL.g:397:2: ( ruleRenameColumn )
                    {
                    // InternalTableDSL.g:397:2: ( ruleRenameColumn )
                    // InternalTableDSL.g:398:3: ruleRenameColumn
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
                    // InternalTableDSL.g:403:2: ( ruleExtract )
                    {
                    // InternalTableDSL.g:403:2: ( ruleExtract )
                    // InternalTableDSL.g:404:3: ruleExtract
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
                    // InternalTableDSL.g:409:2: ( ruleSquashRows )
                    {
                    // InternalTableDSL.g:409:2: ( ruleSquashRows )
                    // InternalTableDSL.g:410:3: ruleSquashRows
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
                    // InternalTableDSL.g:415:2: ( ruleFilter )
                    {
                    // InternalTableDSL.g:415:2: ( ruleFilter )
                    // InternalTableDSL.g:416:3: ruleFilter
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


    // $ANTLR start "rule__Start__Group__0"
    // InternalTableDSL.g:425:1: rule__Start__Group__0 : rule__Start__Group__0__Impl rule__Start__Group__1 ;
    public final void rule__Start__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:429:1: ( rule__Start__Group__0__Impl rule__Start__Group__1 )
            // InternalTableDSL.g:430:2: rule__Start__Group__0__Impl rule__Start__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalTableDSL.g:437:1: rule__Start__Group__0__Impl : ( ( rule__Start__ActionsAssignment_0 )? ) ;
    public final void rule__Start__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:441:1: ( ( ( rule__Start__ActionsAssignment_0 )? ) )
            // InternalTableDSL.g:442:1: ( ( rule__Start__ActionsAssignment_0 )? )
            {
            // InternalTableDSL.g:442:1: ( ( rule__Start__ActionsAssignment_0 )? )
            // InternalTableDSL.g:443:2: ( rule__Start__ActionsAssignment_0 )?
            {
             before(grammarAccess.getStartAccess().getActionsAssignment_0()); 
            // InternalTableDSL.g:444:2: ( rule__Start__ActionsAssignment_0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=12 && LA4_0<=13)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTableDSL.g:444:3: rule__Start__ActionsAssignment_0
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
    // InternalTableDSL.g:452:1: rule__Start__Group__1 : rule__Start__Group__1__Impl ;
    public final void rule__Start__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:456:1: ( rule__Start__Group__1__Impl )
            // InternalTableDSL.g:457:2: rule__Start__Group__1__Impl
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
    // InternalTableDSL.g:463:1: rule__Start__Group__1__Impl : ( ( rule__Start__ActionsAssignment_1 )* ) ;
    public final void rule__Start__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:467:1: ( ( ( rule__Start__ActionsAssignment_1 )* ) )
            // InternalTableDSL.g:468:1: ( ( rule__Start__ActionsAssignment_1 )* )
            {
            // InternalTableDSL.g:468:1: ( ( rule__Start__ActionsAssignment_1 )* )
            // InternalTableDSL.g:469:2: ( rule__Start__ActionsAssignment_1 )*
            {
             before(grammarAccess.getStartAccess().getActionsAssignment_1()); 
            // InternalTableDSL.g:470:2: ( rule__Start__ActionsAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=15 && LA5_0<=16)||(LA5_0>=18 && LA5_0<=21)||LA5_0==24) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTableDSL.g:470:3: rule__Start__ActionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Start__ActionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalTableDSL.g:479:1: rule__CreateTable__Group__0 : rule__CreateTable__Group__0__Impl rule__CreateTable__Group__1 ;
    public final void rule__CreateTable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:483:1: ( rule__CreateTable__Group__0__Impl rule__CreateTable__Group__1 )
            // InternalTableDSL.g:484:2: rule__CreateTable__Group__0__Impl rule__CreateTable__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalTableDSL.g:491:1: rule__CreateTable__Group__0__Impl : ( ( 'create' )? ) ;
    public final void rule__CreateTable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:495:1: ( ( ( 'create' )? ) )
            // InternalTableDSL.g:496:1: ( ( 'create' )? )
            {
            // InternalTableDSL.g:496:1: ( ( 'create' )? )
            // InternalTableDSL.g:497:2: ( 'create' )?
            {
             before(grammarAccess.getCreateTableAccess().getCreateKeyword_0()); 
            // InternalTableDSL.g:498:2: ( 'create' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTableDSL.g:498:3: 'create'
                    {
                    match(input,12,FOLLOW_2); 

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
    // InternalTableDSL.g:506:1: rule__CreateTable__Group__1 : rule__CreateTable__Group__1__Impl rule__CreateTable__Group__2 ;
    public final void rule__CreateTable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:510:1: ( rule__CreateTable__Group__1__Impl rule__CreateTable__Group__2 )
            // InternalTableDSL.g:511:2: rule__CreateTable__Group__1__Impl rule__CreateTable__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalTableDSL.g:518:1: rule__CreateTable__Group__1__Impl : ( 'table' ) ;
    public final void rule__CreateTable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:522:1: ( ( 'table' ) )
            // InternalTableDSL.g:523:1: ( 'table' )
            {
            // InternalTableDSL.g:523:1: ( 'table' )
            // InternalTableDSL.g:524:2: 'table'
            {
             before(grammarAccess.getCreateTableAccess().getTableKeyword_1()); 
            match(input,13,FOLLOW_2); 
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
    // InternalTableDSL.g:533:1: rule__CreateTable__Group__2 : rule__CreateTable__Group__2__Impl rule__CreateTable__Group__3 ;
    public final void rule__CreateTable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:537:1: ( rule__CreateTable__Group__2__Impl rule__CreateTable__Group__3 )
            // InternalTableDSL.g:538:2: rule__CreateTable__Group__2__Impl rule__CreateTable__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalTableDSL.g:545:1: rule__CreateTable__Group__2__Impl : ( 'from' ) ;
    public final void rule__CreateTable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:549:1: ( ( 'from' ) )
            // InternalTableDSL.g:550:1: ( 'from' )
            {
            // InternalTableDSL.g:550:1: ( 'from' )
            // InternalTableDSL.g:551:2: 'from'
            {
             before(grammarAccess.getCreateTableAccess().getFromKeyword_2()); 
            match(input,14,FOLLOW_2); 
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
    // InternalTableDSL.g:560:1: rule__CreateTable__Group__3 : rule__CreateTable__Group__3__Impl rule__CreateTable__Group__4 ;
    public final void rule__CreateTable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:564:1: ( rule__CreateTable__Group__3__Impl rule__CreateTable__Group__4 )
            // InternalTableDSL.g:565:2: rule__CreateTable__Group__3__Impl rule__CreateTable__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalTableDSL.g:572:1: rule__CreateTable__Group__3__Impl : ( ruleTableInputPath ) ;
    public final void rule__CreateTable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:576:1: ( ( ruleTableInputPath ) )
            // InternalTableDSL.g:577:1: ( ruleTableInputPath )
            {
            // InternalTableDSL.g:577:1: ( ruleTableInputPath )
            // InternalTableDSL.g:578:2: ruleTableInputPath
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
    // InternalTableDSL.g:587:1: rule__CreateTable__Group__4 : rule__CreateTable__Group__4__Impl ;
    public final void rule__CreateTable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:591:1: ( rule__CreateTable__Group__4__Impl )
            // InternalTableDSL.g:592:2: rule__CreateTable__Group__4__Impl
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
    // InternalTableDSL.g:598:1: rule__CreateTable__Group__4__Impl : ( RULE_SEP ) ;
    public final void rule__CreateTable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:602:1: ( ( RULE_SEP ) )
            // InternalTableDSL.g:603:1: ( RULE_SEP )
            {
            // InternalTableDSL.g:603:1: ( RULE_SEP )
            // InternalTableDSL.g:604:2: RULE_SEP
            {
             before(grammarAccess.getCreateTableAccess().getSEPTerminalRuleCall_4()); 
            match(input,RULE_SEP,FOLLOW_2); 
             after(grammarAccess.getCreateTableAccess().getSEPTerminalRuleCall_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__TableAction__Group_2__0"
    // InternalTableDSL.g:614:1: rule__TableAction__Group_2__0 : rule__TableAction__Group_2__0__Impl rule__TableAction__Group_2__1 ;
    public final void rule__TableAction__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:618:1: ( rule__TableAction__Group_2__0__Impl rule__TableAction__Group_2__1 )
            // InternalTableDSL.g:619:2: rule__TableAction__Group_2__0__Impl rule__TableAction__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__TableAction__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableAction__Group_2__1();

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
    // $ANTLR end "rule__TableAction__Group_2__0"


    // $ANTLR start "rule__TableAction__Group_2__0__Impl"
    // InternalTableDSL.g:626:1: rule__TableAction__Group_2__0__Impl : ( ruleOutput ) ;
    public final void rule__TableAction__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:630:1: ( ( ruleOutput ) )
            // InternalTableDSL.g:631:1: ( ruleOutput )
            {
            // InternalTableDSL.g:631:1: ( ruleOutput )
            // InternalTableDSL.g:632:2: ruleOutput
            {
             before(grammarAccess.getTableActionAccess().getOutputParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOutput();

            state._fsp--;

             after(grammarAccess.getTableActionAccess().getOutputParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableAction__Group_2__0__Impl"


    // $ANTLR start "rule__TableAction__Group_2__1"
    // InternalTableDSL.g:641:1: rule__TableAction__Group_2__1 : rule__TableAction__Group_2__1__Impl ;
    public final void rule__TableAction__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:645:1: ( rule__TableAction__Group_2__1__Impl )
            // InternalTableDSL.g:646:2: rule__TableAction__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableAction__Group_2__1__Impl();

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
    // $ANTLR end "rule__TableAction__Group_2__1"


    // $ANTLR start "rule__TableAction__Group_2__1__Impl"
    // InternalTableDSL.g:652:1: rule__TableAction__Group_2__1__Impl : ( RULE_SEP ) ;
    public final void rule__TableAction__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:656:1: ( ( RULE_SEP ) )
            // InternalTableDSL.g:657:1: ( RULE_SEP )
            {
            // InternalTableDSL.g:657:1: ( RULE_SEP )
            // InternalTableDSL.g:658:2: RULE_SEP
            {
             before(grammarAccess.getTableActionAccess().getSEPTerminalRuleCall_2_1()); 
            match(input,RULE_SEP,FOLLOW_2); 
             after(grammarAccess.getTableActionAccess().getSEPTerminalRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableAction__Group_2__1__Impl"


    // $ANTLR start "rule__LoadData__Group__0"
    // InternalTableDSL.g:668:1: rule__LoadData__Group__0 : rule__LoadData__Group__0__Impl rule__LoadData__Group__1 ;
    public final void rule__LoadData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:672:1: ( rule__LoadData__Group__0__Impl rule__LoadData__Group__1 )
            // InternalTableDSL.g:673:2: rule__LoadData__Group__0__Impl rule__LoadData__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalTableDSL.g:680:1: rule__LoadData__Group__0__Impl : ( 'load' ) ;
    public final void rule__LoadData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:684:1: ( ( 'load' ) )
            // InternalTableDSL.g:685:1: ( 'load' )
            {
            // InternalTableDSL.g:685:1: ( 'load' )
            // InternalTableDSL.g:686:2: 'load'
            {
             before(grammarAccess.getLoadDataAccess().getLoadKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalTableDSL.g:695:1: rule__LoadData__Group__1 : rule__LoadData__Group__1__Impl ;
    public final void rule__LoadData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:699:1: ( rule__LoadData__Group__1__Impl )
            // InternalTableDSL.g:700:2: rule__LoadData__Group__1__Impl
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
    // InternalTableDSL.g:706:1: rule__LoadData__Group__1__Impl : ( ruleTableInputPath ) ;
    public final void rule__LoadData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:710:1: ( ( ruleTableInputPath ) )
            // InternalTableDSL.g:711:1: ( ruleTableInputPath )
            {
            // InternalTableDSL.g:711:1: ( ruleTableInputPath )
            // InternalTableDSL.g:712:2: ruleTableInputPath
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


    // $ANTLR start "rule__Output__Group__0"
    // InternalTableDSL.g:722:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:726:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // InternalTableDSL.g:727:2: rule__Output__Group__0__Impl rule__Output__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalTableDSL.g:734:1: rule__Output__Group__0__Impl : ( 'output' ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:738:1: ( ( 'output' ) )
            // InternalTableDSL.g:739:1: ( 'output' )
            {
            // InternalTableDSL.g:739:1: ( 'output' )
            // InternalTableDSL.g:740:2: 'output'
            {
             before(grammarAccess.getOutputAccess().getOutputKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalTableDSL.g:749:1: rule__Output__Group__1 : rule__Output__Group__1__Impl rule__Output__Group__2 ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:753:1: ( rule__Output__Group__1__Impl rule__Output__Group__2 )
            // InternalTableDSL.g:754:2: rule__Output__Group__1__Impl rule__Output__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalTableDSL.g:761:1: rule__Output__Group__1__Impl : ( 'to' ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:765:1: ( ( 'to' ) )
            // InternalTableDSL.g:766:1: ( 'to' )
            {
            // InternalTableDSL.g:766:1: ( 'to' )
            // InternalTableDSL.g:767:2: 'to'
            {
             before(grammarAccess.getOutputAccess().getToKeyword_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalTableDSL.g:776:1: rule__Output__Group__2 : rule__Output__Group__2__Impl ;
    public final void rule__Output__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:780:1: ( rule__Output__Group__2__Impl )
            // InternalTableDSL.g:781:2: rule__Output__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group__2__Impl();

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
    // InternalTableDSL.g:787:1: rule__Output__Group__2__Impl : ( ( rule__Output__OutputPathAssignment_2 ) ) ;
    public final void rule__Output__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:791:1: ( ( ( rule__Output__OutputPathAssignment_2 ) ) )
            // InternalTableDSL.g:792:1: ( ( rule__Output__OutputPathAssignment_2 ) )
            {
            // InternalTableDSL.g:792:1: ( ( rule__Output__OutputPathAssignment_2 ) )
            // InternalTableDSL.g:793:2: ( rule__Output__OutputPathAssignment_2 )
            {
             before(grammarAccess.getOutputAccess().getOutputPathAssignment_2()); 
            // InternalTableDSL.g:794:2: ( rule__Output__OutputPathAssignment_2 )
            // InternalTableDSL.g:794:3: rule__Output__OutputPathAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Output__OutputPathAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getOutputPathAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Select__Group__0"
    // InternalTableDSL.g:803:1: rule__Select__Group__0 : rule__Select__Group__0__Impl rule__Select__Group__1 ;
    public final void rule__Select__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:807:1: ( rule__Select__Group__0__Impl rule__Select__Group__1 )
            // InternalTableDSL.g:808:2: rule__Select__Group__0__Impl rule__Select__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalTableDSL.g:815:1: rule__Select__Group__0__Impl : ( 'select' ) ;
    public final void rule__Select__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:819:1: ( ( 'select' ) )
            // InternalTableDSL.g:820:1: ( 'select' )
            {
            // InternalTableDSL.g:820:1: ( 'select' )
            // InternalTableDSL.g:821:2: 'select'
            {
             before(grammarAccess.getSelectAccess().getSelectKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalTableDSL.g:830:1: rule__Select__Group__1 : rule__Select__Group__1__Impl ;
    public final void rule__Select__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:834:1: ( rule__Select__Group__1__Impl )
            // InternalTableDSL.g:835:2: rule__Select__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group__1__Impl();

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
    // InternalTableDSL.g:841:1: rule__Select__Group__1__Impl : ( ( ( rule__Select__ColumnsAssignment_1 ) ) ( ( rule__Select__ColumnsAssignment_1 )* ) ) ;
    public final void rule__Select__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:845:1: ( ( ( ( rule__Select__ColumnsAssignment_1 ) ) ( ( rule__Select__ColumnsAssignment_1 )* ) ) )
            // InternalTableDSL.g:846:1: ( ( ( rule__Select__ColumnsAssignment_1 ) ) ( ( rule__Select__ColumnsAssignment_1 )* ) )
            {
            // InternalTableDSL.g:846:1: ( ( ( rule__Select__ColumnsAssignment_1 ) ) ( ( rule__Select__ColumnsAssignment_1 )* ) )
            // InternalTableDSL.g:847:2: ( ( rule__Select__ColumnsAssignment_1 ) ) ( ( rule__Select__ColumnsAssignment_1 )* )
            {
            // InternalTableDSL.g:847:2: ( ( rule__Select__ColumnsAssignment_1 ) )
            // InternalTableDSL.g:848:3: ( rule__Select__ColumnsAssignment_1 )
            {
             before(grammarAccess.getSelectAccess().getColumnsAssignment_1()); 
            // InternalTableDSL.g:849:3: ( rule__Select__ColumnsAssignment_1 )
            // InternalTableDSL.g:849:4: rule__Select__ColumnsAssignment_1
            {
            pushFollow(FOLLOW_3);
            rule__Select__ColumnsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getColumnsAssignment_1()); 

            }

            // InternalTableDSL.g:852:2: ( ( rule__Select__ColumnsAssignment_1 )* )
            // InternalTableDSL.g:853:3: ( rule__Select__ColumnsAssignment_1 )*
            {
             before(grammarAccess.getSelectAccess().getColumnsAssignment_1()); 
            // InternalTableDSL.g:854:3: ( rule__Select__ColumnsAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_STRING) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTableDSL.g:854:4: rule__Select__ColumnsAssignment_1
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Select__ColumnsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSelectAccess().getColumnsAssignment_1()); 

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
    // $ANTLR end "rule__Select__Group__1__Impl"


    // $ANTLR start "rule__RenameColumn__Group__0"
    // InternalTableDSL.g:864:1: rule__RenameColumn__Group__0 : rule__RenameColumn__Group__0__Impl rule__RenameColumn__Group__1 ;
    public final void rule__RenameColumn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:868:1: ( rule__RenameColumn__Group__0__Impl rule__RenameColumn__Group__1 )
            // InternalTableDSL.g:869:2: rule__RenameColumn__Group__0__Impl rule__RenameColumn__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalTableDSL.g:876:1: rule__RenameColumn__Group__0__Impl : ( 'rename' ) ;
    public final void rule__RenameColumn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:880:1: ( ( 'rename' ) )
            // InternalTableDSL.g:881:1: ( 'rename' )
            {
            // InternalTableDSL.g:881:1: ( 'rename' )
            // InternalTableDSL.g:882:2: 'rename'
            {
             before(grammarAccess.getRenameColumnAccess().getRenameKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalTableDSL.g:891:1: rule__RenameColumn__Group__1 : rule__RenameColumn__Group__1__Impl rule__RenameColumn__Group__2 ;
    public final void rule__RenameColumn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:895:1: ( rule__RenameColumn__Group__1__Impl rule__RenameColumn__Group__2 )
            // InternalTableDSL.g:896:2: rule__RenameColumn__Group__1__Impl rule__RenameColumn__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalTableDSL.g:903:1: rule__RenameColumn__Group__1__Impl : ( ( rule__RenameColumn__OldNameAssignment_1 ) ) ;
    public final void rule__RenameColumn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:907:1: ( ( ( rule__RenameColumn__OldNameAssignment_1 ) ) )
            // InternalTableDSL.g:908:1: ( ( rule__RenameColumn__OldNameAssignment_1 ) )
            {
            // InternalTableDSL.g:908:1: ( ( rule__RenameColumn__OldNameAssignment_1 ) )
            // InternalTableDSL.g:909:2: ( rule__RenameColumn__OldNameAssignment_1 )
            {
             before(grammarAccess.getRenameColumnAccess().getOldNameAssignment_1()); 
            // InternalTableDSL.g:910:2: ( rule__RenameColumn__OldNameAssignment_1 )
            // InternalTableDSL.g:910:3: rule__RenameColumn__OldNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RenameColumn__OldNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRenameColumnAccess().getOldNameAssignment_1()); 

            }


            }

        }
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
    // InternalTableDSL.g:918:1: rule__RenameColumn__Group__2 : rule__RenameColumn__Group__2__Impl rule__RenameColumn__Group__3 ;
    public final void rule__RenameColumn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:922:1: ( rule__RenameColumn__Group__2__Impl rule__RenameColumn__Group__3 )
            // InternalTableDSL.g:923:2: rule__RenameColumn__Group__2__Impl rule__RenameColumn__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalTableDSL.g:930:1: rule__RenameColumn__Group__2__Impl : ( 'to' ) ;
    public final void rule__RenameColumn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:934:1: ( ( 'to' ) )
            // InternalTableDSL.g:935:1: ( 'to' )
            {
            // InternalTableDSL.g:935:1: ( 'to' )
            // InternalTableDSL.g:936:2: 'to'
            {
             before(grammarAccess.getRenameColumnAccess().getToKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRenameColumnAccess().getToKeyword_2()); 

            }


            }

        }
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
    // InternalTableDSL.g:945:1: rule__RenameColumn__Group__3 : rule__RenameColumn__Group__3__Impl ;
    public final void rule__RenameColumn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:949:1: ( rule__RenameColumn__Group__3__Impl )
            // InternalTableDSL.g:950:2: rule__RenameColumn__Group__3__Impl
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
    // InternalTableDSL.g:956:1: rule__RenameColumn__Group__3__Impl : ( ( rule__RenameColumn__NewNameAssignment_3 ) ) ;
    public final void rule__RenameColumn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:960:1: ( ( ( rule__RenameColumn__NewNameAssignment_3 ) ) )
            // InternalTableDSL.g:961:1: ( ( rule__RenameColumn__NewNameAssignment_3 ) )
            {
            // InternalTableDSL.g:961:1: ( ( rule__RenameColumn__NewNameAssignment_3 ) )
            // InternalTableDSL.g:962:2: ( rule__RenameColumn__NewNameAssignment_3 )
            {
             before(grammarAccess.getRenameColumnAccess().getNewNameAssignment_3()); 
            // InternalTableDSL.g:963:2: ( rule__RenameColumn__NewNameAssignment_3 )
            // InternalTableDSL.g:963:3: rule__RenameColumn__NewNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RenameColumn__NewNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRenameColumnAccess().getNewNameAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Extract__Group__0"
    // InternalTableDSL.g:972:1: rule__Extract__Group__0 : rule__Extract__Group__0__Impl rule__Extract__Group__1 ;
    public final void rule__Extract__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:976:1: ( rule__Extract__Group__0__Impl rule__Extract__Group__1 )
            // InternalTableDSL.g:977:2: rule__Extract__Group__0__Impl rule__Extract__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalTableDSL.g:984:1: rule__Extract__Group__0__Impl : ( 'extract' ) ;
    public final void rule__Extract__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:988:1: ( ( 'extract' ) )
            // InternalTableDSL.g:989:1: ( 'extract' )
            {
            // InternalTableDSL.g:989:1: ( 'extract' )
            // InternalTableDSL.g:990:2: 'extract'
            {
             before(grammarAccess.getExtractAccess().getExtractKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalTableDSL.g:999:1: rule__Extract__Group__1 : rule__Extract__Group__1__Impl ;
    public final void rule__Extract__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1003:1: ( rule__Extract__Group__1__Impl )
            // InternalTableDSL.g:1004:2: rule__Extract__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Extract__Group__1__Impl();

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
    // InternalTableDSL.g:1010:1: rule__Extract__Group__1__Impl : ( ( rule__Extract__PlaceholderAssignment_1 ) ) ;
    public final void rule__Extract__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1014:1: ( ( ( rule__Extract__PlaceholderAssignment_1 ) ) )
            // InternalTableDSL.g:1015:1: ( ( rule__Extract__PlaceholderAssignment_1 ) )
            {
            // InternalTableDSL.g:1015:1: ( ( rule__Extract__PlaceholderAssignment_1 ) )
            // InternalTableDSL.g:1016:2: ( rule__Extract__PlaceholderAssignment_1 )
            {
             before(grammarAccess.getExtractAccess().getPlaceholderAssignment_1()); 
            // InternalTableDSL.g:1017:2: ( rule__Extract__PlaceholderAssignment_1 )
            // InternalTableDSL.g:1017:3: rule__Extract__PlaceholderAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Extract__PlaceholderAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExtractAccess().getPlaceholderAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__SquashRows__Group__0"
    // InternalTableDSL.g:1026:1: rule__SquashRows__Group__0 : rule__SquashRows__Group__0__Impl rule__SquashRows__Group__1 ;
    public final void rule__SquashRows__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1030:1: ( rule__SquashRows__Group__0__Impl rule__SquashRows__Group__1 )
            // InternalTableDSL.g:1031:2: rule__SquashRows__Group__0__Impl rule__SquashRows__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalTableDSL.g:1038:1: rule__SquashRows__Group__0__Impl : ( 'squash' ) ;
    public final void rule__SquashRows__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1042:1: ( ( 'squash' ) )
            // InternalTableDSL.g:1043:1: ( 'squash' )
            {
            // InternalTableDSL.g:1043:1: ( 'squash' )
            // InternalTableDSL.g:1044:2: 'squash'
            {
             before(grammarAccess.getSquashRowsAccess().getSquashKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalTableDSL.g:1053:1: rule__SquashRows__Group__1 : rule__SquashRows__Group__1__Impl rule__SquashRows__Group__2 ;
    public final void rule__SquashRows__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1057:1: ( rule__SquashRows__Group__1__Impl rule__SquashRows__Group__2 )
            // InternalTableDSL.g:1058:2: rule__SquashRows__Group__1__Impl rule__SquashRows__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalTableDSL.g:1065:1: rule__SquashRows__Group__1__Impl : ( 'rows' ) ;
    public final void rule__SquashRows__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1069:1: ( ( 'rows' ) )
            // InternalTableDSL.g:1070:1: ( 'rows' )
            {
            // InternalTableDSL.g:1070:1: ( 'rows' )
            // InternalTableDSL.g:1071:2: 'rows'
            {
             before(grammarAccess.getSquashRowsAccess().getRowsKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalTableDSL.g:1080:1: rule__SquashRows__Group__2 : rule__SquashRows__Group__2__Impl rule__SquashRows__Group__3 ;
    public final void rule__SquashRows__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1084:1: ( rule__SquashRows__Group__2__Impl rule__SquashRows__Group__3 )
            // InternalTableDSL.g:1085:2: rule__SquashRows__Group__2__Impl rule__SquashRows__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalTableDSL.g:1092:1: rule__SquashRows__Group__2__Impl : ( 'by' ) ;
    public final void rule__SquashRows__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1096:1: ( ( 'by' ) )
            // InternalTableDSL.g:1097:1: ( 'by' )
            {
            // InternalTableDSL.g:1097:1: ( 'by' )
            // InternalTableDSL.g:1098:2: 'by'
            {
             before(grammarAccess.getSquashRowsAccess().getByKeyword_2()); 
            match(input,23,FOLLOW_2); 
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
    // InternalTableDSL.g:1107:1: rule__SquashRows__Group__3 : rule__SquashRows__Group__3__Impl ;
    public final void rule__SquashRows__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1111:1: ( rule__SquashRows__Group__3__Impl )
            // InternalTableDSL.g:1112:2: rule__SquashRows__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SquashRows__Group__3__Impl();

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
    // InternalTableDSL.g:1118:1: rule__SquashRows__Group__3__Impl : ( ( rule__SquashRows__ColumnAssignment_3 ) ) ;
    public final void rule__SquashRows__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1122:1: ( ( ( rule__SquashRows__ColumnAssignment_3 ) ) )
            // InternalTableDSL.g:1123:1: ( ( rule__SquashRows__ColumnAssignment_3 ) )
            {
            // InternalTableDSL.g:1123:1: ( ( rule__SquashRows__ColumnAssignment_3 ) )
            // InternalTableDSL.g:1124:2: ( rule__SquashRows__ColumnAssignment_3 )
            {
             before(grammarAccess.getSquashRowsAccess().getColumnAssignment_3()); 
            // InternalTableDSL.g:1125:2: ( rule__SquashRows__ColumnAssignment_3 )
            // InternalTableDSL.g:1125:3: rule__SquashRows__ColumnAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SquashRows__ColumnAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSquashRowsAccess().getColumnAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Filter__Group__0"
    // InternalTableDSL.g:1134:1: rule__Filter__Group__0 : rule__Filter__Group__0__Impl rule__Filter__Group__1 ;
    public final void rule__Filter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1138:1: ( rule__Filter__Group__0__Impl rule__Filter__Group__1 )
            // InternalTableDSL.g:1139:2: rule__Filter__Group__0__Impl rule__Filter__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalTableDSL.g:1146:1: rule__Filter__Group__0__Impl : ( 'filter' ) ;
    public final void rule__Filter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1150:1: ( ( 'filter' ) )
            // InternalTableDSL.g:1151:1: ( 'filter' )
            {
            // InternalTableDSL.g:1151:1: ( 'filter' )
            // InternalTableDSL.g:1152:2: 'filter'
            {
             before(grammarAccess.getFilterAccess().getFilterKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalTableDSL.g:1161:1: rule__Filter__Group__1 : rule__Filter__Group__1__Impl rule__Filter__Group__2 ;
    public final void rule__Filter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1165:1: ( rule__Filter__Group__1__Impl rule__Filter__Group__2 )
            // InternalTableDSL.g:1166:2: rule__Filter__Group__1__Impl rule__Filter__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalTableDSL.g:1173:1: rule__Filter__Group__1__Impl : ( 'by' ) ;
    public final void rule__Filter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1177:1: ( ( 'by' ) )
            // InternalTableDSL.g:1178:1: ( 'by' )
            {
            // InternalTableDSL.g:1178:1: ( 'by' )
            // InternalTableDSL.g:1179:2: 'by'
            {
             before(grammarAccess.getFilterAccess().getByKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getByKeyword_1()); 

            }


            }

        }
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
    // InternalTableDSL.g:1188:1: rule__Filter__Group__2 : rule__Filter__Group__2__Impl ;
    public final void rule__Filter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1192:1: ( rule__Filter__Group__2__Impl )
            // InternalTableDSL.g:1193:2: rule__Filter__Group__2__Impl
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
    // InternalTableDSL.g:1199:1: rule__Filter__Group__2__Impl : ( ( rule__Filter__PlaceholderAssignment_2 ) ) ;
    public final void rule__Filter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1203:1: ( ( ( rule__Filter__PlaceholderAssignment_2 ) ) )
            // InternalTableDSL.g:1204:1: ( ( rule__Filter__PlaceholderAssignment_2 ) )
            {
            // InternalTableDSL.g:1204:1: ( ( rule__Filter__PlaceholderAssignment_2 ) )
            // InternalTableDSL.g:1205:2: ( rule__Filter__PlaceholderAssignment_2 )
            {
             before(grammarAccess.getFilterAccess().getPlaceholderAssignment_2()); 
            // InternalTableDSL.g:1206:2: ( rule__Filter__PlaceholderAssignment_2 )
            // InternalTableDSL.g:1206:3: rule__Filter__PlaceholderAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Filter__PlaceholderAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFilterAccess().getPlaceholderAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Start__ActionsAssignment_0"
    // InternalTableDSL.g:1215:1: rule__Start__ActionsAssignment_0 : ( ruleCreateTable ) ;
    public final void rule__Start__ActionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1219:1: ( ( ruleCreateTable ) )
            // InternalTableDSL.g:1220:2: ( ruleCreateTable )
            {
            // InternalTableDSL.g:1220:2: ( ruleCreateTable )
            // InternalTableDSL.g:1221:3: ruleCreateTable
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
    // InternalTableDSL.g:1230:1: rule__Start__ActionsAssignment_1 : ( ruleTableAction ) ;
    public final void rule__Start__ActionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1234:1: ( ( ruleTableAction ) )
            // InternalTableDSL.g:1235:2: ( ruleTableAction )
            {
            // InternalTableDSL.g:1235:2: ( ruleTableAction )
            // InternalTableDSL.g:1236:3: ruleTableAction
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


    // $ANTLR start "rule__TableInputPath__PathPatternsAssignment"
    // InternalTableDSL.g:1245:1: rule__TableInputPath__PathPatternsAssignment : ( RULE_STRING ) ;
    public final void rule__TableInputPath__PathPatternsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1249:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:1250:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:1250:2: ( RULE_STRING )
            // InternalTableDSL.g:1251:3: RULE_STRING
            {
             before(grammarAccess.getTableInputPathAccess().getPathPatternsSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTableInputPathAccess().getPathPatternsSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableInputPath__PathPatternsAssignment"


    // $ANTLR start "rule__Output__OutputPathAssignment_2"
    // InternalTableDSL.g:1260:1: rule__Output__OutputPathAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Output__OutputPathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1264:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:1265:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:1265:2: ( RULE_STRING )
            // InternalTableDSL.g:1266:3: RULE_STRING
            {
             before(grammarAccess.getOutputAccess().getOutputPathSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getOutputPathSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__OutputPathAssignment_2"


    // $ANTLR start "rule__Select__ColumnsAssignment_1"
    // InternalTableDSL.g:1275:1: rule__Select__ColumnsAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Select__ColumnsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1279:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:1280:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:1280:2: ( RULE_STRING )
            // InternalTableDSL.g:1281:3: RULE_STRING
            {
             before(grammarAccess.getSelectAccess().getColumnsSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getColumnsSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__ColumnsAssignment_1"


    // $ANTLR start "rule__RenameColumn__OldNameAssignment_1"
    // InternalTableDSL.g:1290:1: rule__RenameColumn__OldNameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__RenameColumn__OldNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1294:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:1295:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:1295:2: ( RULE_STRING )
            // InternalTableDSL.g:1296:3: RULE_STRING
            {
             before(grammarAccess.getRenameColumnAccess().getOldNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRenameColumnAccess().getOldNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumn__OldNameAssignment_1"


    // $ANTLR start "rule__RenameColumn__NewNameAssignment_3"
    // InternalTableDSL.g:1305:1: rule__RenameColumn__NewNameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__RenameColumn__NewNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1309:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:1310:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:1310:2: ( RULE_STRING )
            // InternalTableDSL.g:1311:3: RULE_STRING
            {
             before(grammarAccess.getRenameColumnAccess().getNewNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRenameColumnAccess().getNewNameSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumn__NewNameAssignment_3"


    // $ANTLR start "rule__Extract__PlaceholderAssignment_1"
    // InternalTableDSL.g:1320:1: rule__Extract__PlaceholderAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Extract__PlaceholderAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1324:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:1325:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:1325:2: ( RULE_STRING )
            // InternalTableDSL.g:1326:3: RULE_STRING
            {
             before(grammarAccess.getExtractAccess().getPlaceholderSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExtractAccess().getPlaceholderSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extract__PlaceholderAssignment_1"


    // $ANTLR start "rule__SquashRows__ColumnAssignment_3"
    // InternalTableDSL.g:1335:1: rule__SquashRows__ColumnAssignment_3 : ( RULE_STRING ) ;
    public final void rule__SquashRows__ColumnAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1339:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:1340:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:1340:2: ( RULE_STRING )
            // InternalTableDSL.g:1341:3: RULE_STRING
            {
             before(grammarAccess.getSquashRowsAccess().getColumnSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSquashRowsAccess().getColumnSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SquashRows__ColumnAssignment_3"


    // $ANTLR start "rule__Filter__PlaceholderAssignment_2"
    // InternalTableDSL.g:1350:1: rule__Filter__PlaceholderAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Filter__PlaceholderAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTableDSL.g:1354:1: ( ( RULE_STRING ) )
            // InternalTableDSL.g:1355:2: ( RULE_STRING )
            {
            // InternalTableDSL.g:1355:2: ( RULE_STRING )
            // InternalTableDSL.g:1356:3: RULE_STRING
            {
             before(grammarAccess.getFilterAccess().getPlaceholderSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getPlaceholderSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__PlaceholderAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000013D8000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000013D8002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});

}