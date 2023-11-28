/*
 * generated by Xtext 2.32.0
 */
package org.feup.els5.dsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.feup.els5.dsl.ide.contentassist.antlr.internal.InternalTableDSLParser;
import org.feup.els5.dsl.services.TableDSLGrammarAccess;

public class TableDSLParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(TableDSLGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, TableDSLGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getTableActionAccess().getAlternatives_0(), "rule__TableAction__Alternatives_0");
			builder.put(grammarAccess.getOperationAccess().getAlternatives(), "rule__Operation__Alternatives");
			builder.put(grammarAccess.getRenameColumnPairAccess().getAlternatives(), "rule__RenameColumnPair__Alternatives");
			builder.put(grammarAccess.getSelectorAccess().getAlternatives(), "rule__Selector__Alternatives");
			builder.put(grammarAccess.getFilterRuleAccess().getAlternatives(), "rule__FilterRule__Alternatives");
			builder.put(grammarAccess.getColumnNameAccess().getColumnNameAlternatives_0(), "rule__ColumnName__ColumnNameAlternatives_0");
			builder.put(grammarAccess.getStartAccess().getGroup(), "rule__Start__Group__0");
			builder.put(grammarAccess.getCreateTableAccess().getGroup(), "rule__CreateTable__Group__0");
			builder.put(grammarAccess.getTableActionAccess().getGroup(), "rule__TableAction__Group__0");
			builder.put(grammarAccess.getLoadDataAccess().getGroup(), "rule__LoadData__Group__0");
			builder.put(grammarAccess.getTableInputPathAccess().getGroup(), "rule__TableInputPath__Group__0");
			builder.put(grammarAccess.getTableInputPathAccess().getGroup_1(), "rule__TableInputPath__Group_1__0");
			builder.put(grammarAccess.getOutputAccess().getGroup(), "rule__Output__Group__0");
			builder.put(grammarAccess.getOutputAccess().getGroup_3(), "rule__Output__Group_3__0");
			builder.put(grammarAccess.getSelectAccess().getGroup(), "rule__Select__Group__0");
			builder.put(grammarAccess.getSelectAccess().getGroup_2(), "rule__Select__Group_2__0");
			builder.put(grammarAccess.getRenameColumnAccess().getGroup(), "rule__RenameColumn__Group__0");
			builder.put(grammarAccess.getRenameColumnToPairAccess().getGroup(), "rule__RenameColumnToPair__Group__0");
			builder.put(grammarAccess.getRenameColumnPrependPairAccess().getGroup(), "rule__RenameColumnPrependPair__Group__0");
			builder.put(grammarAccess.getRenameColumnAppendPairAccess().getGroup(), "rule__RenameColumnAppendPair__Group__0");
			builder.put(grammarAccess.getExtractAccess().getGroup(), "rule__Extract__Group__0");
			builder.put(grammarAccess.getExtractAccess().getGroup_2(), "rule__Extract__Group_2__0");
			builder.put(grammarAccess.getSelectorAccess().getGroup_0(), "rule__Selector__Group_0__0");
			builder.put(grammarAccess.getSelectorAccess().getGroup_1(), "rule__Selector__Group_1__0");
			builder.put(grammarAccess.getSelectorAccess().getGroup_2(), "rule__Selector__Group_2__0");
			builder.put(grammarAccess.getSelectorAccess().getGroup_3(), "rule__Selector__Group_3__0");
			builder.put(grammarAccess.getComparatorAccess().getGroup(), "rule__Comparator__Group__0");
			builder.put(grammarAccess.getComparatorAccess().getGroup_1(), "rule__Comparator__Group_1__0");
			builder.put(grammarAccess.getSquashRowsAccess().getGroup(), "rule__SquashRows__Group__0");
			builder.put(grammarAccess.getSquashRowsAccess().getGroup_4(), "rule__SquashRows__Group_4__0");
			builder.put(grammarAccess.getFilterAccess().getGroup(), "rule__Filter__Group__0");
			builder.put(grammarAccess.getFilterDenylistAccess().getGroup(), "rule__FilterDenylist__Group__0");
			builder.put(grammarAccess.getFilterExceptlistAccess().getGroup(), "rule__FilterExceptlist__Group__0");
			builder.put(grammarAccess.getFilterObjectTypeRuleAccess().getGroup(), "rule__FilterObjectTypeRule__Group__0");
			builder.put(grammarAccess.getFilterColumnRuleAccess().getGroup(), "rule__FilterColumnRule__Group__0");
			builder.put(grammarAccess.getStartAccess().getActionsAssignment_0(), "rule__Start__ActionsAssignment_0");
			builder.put(grammarAccess.getStartAccess().getActionsAssignment_1(), "rule__Start__ActionsAssignment_1");
			builder.put(grammarAccess.getTableInputPathAccess().getPathPatternsAssignment_0(), "rule__TableInputPath__PathPatternsAssignment_0");
			builder.put(grammarAccess.getTableInputPathAccess().getPathPatternsAssignment_1_1(), "rule__TableInputPath__PathPatternsAssignment_1_1");
			builder.put(grammarAccess.getOutputAccess().getOutputPathsAssignment_2(), "rule__Output__OutputPathsAssignment_2");
			builder.put(grammarAccess.getOutputAccess().getOutputPathsAssignment_3_1(), "rule__Output__OutputPathsAssignment_3_1");
			builder.put(grammarAccess.getSelectAccess().getColumnsPatternsAssignment_1(), "rule__Select__ColumnsPatternsAssignment_1");
			builder.put(grammarAccess.getSelectAccess().getColumnPatternsAssignment_2_1(), "rule__Select__ColumnPatternsAssignment_2_1");
			builder.put(grammarAccess.getRenameColumnAccess().getRenameTuplesAssignment_2(), "rule__RenameColumn__RenameTuplesAssignment_2");
			builder.put(grammarAccess.getRenameColumnToPairAccess().getOldNameAssignment_0(), "rule__RenameColumnToPair__OldNameAssignment_0");
			builder.put(grammarAccess.getRenameColumnToPairAccess().getNewNameAssignment_2(), "rule__RenameColumnToPair__NewNameAssignment_2");
			builder.put(grammarAccess.getRenameColumnPrependPairAccess().getOldNameAssignment_0(), "rule__RenameColumnPrependPair__OldNameAssignment_0");
			builder.put(grammarAccess.getRenameColumnPrependPairAccess().getPrefixAssignment_2(), "rule__RenameColumnPrependPair__PrefixAssignment_2");
			builder.put(grammarAccess.getRenameColumnAppendPairAccess().getOldNameAssignment_0(), "rule__RenameColumnAppendPair__OldNameAssignment_0");
			builder.put(grammarAccess.getRenameColumnAppendPairAccess().getSuffixAssignment_2(), "rule__RenameColumnAppendPair__SuffixAssignment_2");
			builder.put(grammarAccess.getExtractAccess().getTargetColumnsAssignment_1(), "rule__Extract__TargetColumnsAssignment_1");
			builder.put(grammarAccess.getExtractAccess().getTargetColumnsAssignment_2_1(), "rule__Extract__TargetColumnsAssignment_2_1");
			builder.put(grammarAccess.getExtractAccess().getSourceColumnAssignment_4(), "rule__Extract__SourceColumnAssignment_4");
			builder.put(grammarAccess.getExtractAccess().getSelectorAssignment_6(), "rule__Extract__SelectorAssignment_6");
			builder.put(grammarAccess.getExtractAccess().getComparatorAssignment_9(), "rule__Extract__ComparatorAssignment_9");
			builder.put(grammarAccess.getSelectorAccess().getNAssignment_3_1(), "rule__Selector__NAssignment_3_1");
			builder.put(grammarAccess.getComparatorAccess().getKeysAssignment_0(), "rule__Comparator__KeysAssignment_0");
			builder.put(grammarAccess.getComparatorAccess().getKeysAssignment_1_1(), "rule__Comparator__KeysAssignment_1_1");
			builder.put(grammarAccess.getSquashRowsAccess().getColumnsAssignment_3(), "rule__SquashRows__ColumnsAssignment_3");
			builder.put(grammarAccess.getSquashRowsAccess().getColumnsAssignment_4_1(), "rule__SquashRows__ColumnsAssignment_4_1");
			builder.put(grammarAccess.getFilterAccess().getDenylistAssignment_1(), "rule__Filter__DenylistAssignment_1");
			builder.put(grammarAccess.getFilterAccess().getExceptlistAssignment_2(), "rule__Filter__ExceptlistAssignment_2");
			builder.put(grammarAccess.getFilterDenylistAccess().getDenylistAssignment_1(), "rule__FilterDenylist__DenylistAssignment_1");
			builder.put(grammarAccess.getFilterExceptlistAccess().getExceptlistAssignment_1(), "rule__FilterExceptlist__ExceptlistAssignment_1");
			builder.put(grammarAccess.getFilterObjectTypeRuleAccess().getColumnPatternAssignment_1(), "rule__FilterObjectTypeRule__ColumnPatternAssignment_1");
			builder.put(grammarAccess.getFilterColumnRuleAccess().getObjectClassAssignment_2(), "rule__FilterColumnRule__ObjectClassAssignment_2");
			builder.put(grammarAccess.getColumnNameAccess().getColumnNameAssignment(), "rule__ColumnName__ColumnNameAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private TableDSLGrammarAccess grammarAccess;

	@Override
	protected InternalTableDSLParser createParser() {
		InternalTableDSLParser result = new InternalTableDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public TableDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TableDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
