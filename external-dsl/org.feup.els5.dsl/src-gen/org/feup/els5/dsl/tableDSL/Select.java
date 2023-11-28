/**
 * generated by Xtext 2.32.0
 */
package org.feup.els5.dsl.tableDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.feup.els5.dsl.tableDSL.Select#getColumnsPatterns <em>Columns Patterns</em>}</li>
 *   <li>{@link org.feup.els5.dsl.tableDSL.Select#getColumnPatterns <em>Column Patterns</em>}</li>
 * </ul>
 *
 * @see org.feup.els5.dsl.tableDSL.TableDSLPackage#getSelect()
 * @model
 * @generated
 */
public interface Select extends Operation
{
  /**
   * Returns the value of the '<em><b>Columns Patterns</b></em>' containment reference list.
   * The list contents are of type {@link org.feup.els5.dsl.tableDSL.ColumnName}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columns Patterns</em>' containment reference list.
   * @see org.feup.els5.dsl.tableDSL.TableDSLPackage#getSelect_ColumnsPatterns()
   * @model containment="true"
   * @generated
   */
  EList<ColumnName> getColumnsPatterns();

  /**
   * Returns the value of the '<em><b>Column Patterns</b></em>' containment reference list.
   * The list contents are of type {@link org.feup.els5.dsl.tableDSL.ColumnName}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column Patterns</em>' containment reference list.
   * @see org.feup.els5.dsl.tableDSL.TableDSLPackage#getSelect_ColumnPatterns()
   * @model containment="true"
   * @generated
   */
  EList<ColumnName> getColumnPatterns();

} // Select
