/**
 * generated by Xtext 2.32.0
 */
package org.feup.els5.dsl.tableDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.feup.els5.dsl.tableDSL.TableDSLPackage
 * @generated
 */
public interface TableDSLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TableDSLFactory eINSTANCE = org.feup.els5.dsl.tableDSL.impl.TableDSLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Start</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Start</em>'.
   * @generated
   */
  Start createStart();

  /**
   * Returns a new object of class '<em>Create Table</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Create Table</em>'.
   * @generated
   */
  CreateTable createCreateTable();

  /**
   * Returns a new object of class '<em>Table Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table Action</em>'.
   * @generated
   */
  TableAction createTableAction();

  /**
   * Returns a new object of class '<em>Load Data</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Load Data</em>'.
   * @generated
   */
  LoadData createLoadData();

  /**
   * Returns a new object of class '<em>Table Input Path</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table Input Path</em>'.
   * @generated
   */
  TableInputPath createTableInputPath();

  /**
   * Returns a new object of class '<em>Output</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Output</em>'.
   * @generated
   */
  Output createOutput();

  /**
   * Returns a new object of class '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation</em>'.
   * @generated
   */
  Operation createOperation();

  /**
   * Returns a new object of class '<em>Select</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Select</em>'.
   * @generated
   */
  Select createSelect();

  /**
   * Returns a new object of class '<em>Rename Column</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rename Column</em>'.
   * @generated
   */
  RenameColumn createRenameColumn();

  /**
   * Returns a new object of class '<em>Rename Column Pair</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rename Column Pair</em>'.
   * @generated
   */
  RenameColumnPair createRenameColumnPair();

  /**
   * Returns a new object of class '<em>Rename Column To Pair</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rename Column To Pair</em>'.
   * @generated
   */
  RenameColumnToPair createRenameColumnToPair();

  /**
   * Returns a new object of class '<em>Rename Column Prepend Pair</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rename Column Prepend Pair</em>'.
   * @generated
   */
  RenameColumnPrependPair createRenameColumnPrependPair();

  /**
   * Returns a new object of class '<em>Rename Column Append Pair</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rename Column Append Pair</em>'.
   * @generated
   */
  RenameColumnAppendPair createRenameColumnAppendPair();

  /**
   * Returns a new object of class '<em>Rename Column Replace Pair</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rename Column Replace Pair</em>'.
   * @generated
   */
  RenameColumnReplacePair createRenameColumnReplacePair();

  /**
   * Returns a new object of class '<em>Extract</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extract</em>'.
   * @generated
   */
  Extract createExtract();

  /**
   * Returns a new object of class '<em>Extract Column Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extract Column Mapping</em>'.
   * @generated
   */
  ExtractColumnMapping createExtractColumnMapping();

  /**
   * Returns a new object of class '<em>Selector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Selector</em>'.
   * @generated
   */
  Selector createSelector();

  /**
   * Returns a new object of class '<em>Key Selector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Key Selector</em>'.
   * @generated
   */
  KeySelector createKeySelector();

  /**
   * Returns a new object of class '<em>Top NSelector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Top NSelector</em>'.
   * @generated
   */
  TopNSelector createTopNSelector();

  /**
   * Returns a new object of class '<em>Comparator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comparator</em>'.
   * @generated
   */
  Comparator createComparator();

  /**
   * Returns a new object of class '<em>Squash Rows</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Squash Rows</em>'.
   * @generated
   */
  SquashRows createSquashRows();

  /**
   * Returns a new object of class '<em>Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Filter</em>'.
   * @generated
   */
  Filter createFilter();

  /**
   * Returns a new object of class '<em>Filter Denylist</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Filter Denylist</em>'.
   * @generated
   */
  FilterDenylist createFilterDenylist();

  /**
   * Returns a new object of class '<em>Filter Exceptlist</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Filter Exceptlist</em>'.
   * @generated
   */
  FilterExceptlist createFilterExceptlist();

  /**
   * Returns a new object of class '<em>Filter Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Filter Rule</em>'.
   * @generated
   */
  FilterRule createFilterRule();

  /**
   * Returns a new object of class '<em>Filter Column Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Filter Column Rule</em>'.
   * @generated
   */
  FilterColumnRule createFilterColumnRule();

  /**
   * Returns a new object of class '<em>Filter Object Type Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Filter Object Type Rule</em>'.
   * @generated
   */
  FilterObjectTypeRule createFilterObjectTypeRule();

  /**
   * Returns a new object of class '<em>Reduce</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reduce</em>'.
   * @generated
   */
  Reduce createReduce();

  /**
   * Returns a new object of class '<em>Column Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Column Name</em>'.
   * @generated
   */
  ColumnName createColumnName();

  /**
   * Returns a new object of class '<em>Object Type Selector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Type Selector</em>'.
   * @generated
   */
  ObjectTypeSelector createObjectTypeSelector();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  TableDSLPackage getTableDSLPackage();

} //TableDSLFactory
