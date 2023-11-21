/**
 * generated by Xtext 2.32.0
 */
package org.feup.els5.dsl.tableDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Squash Rows</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.feup.els5.dsl.tableDSL.SquashRows#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see org.feup.els5.dsl.tableDSL.TableDSLPackage#getSquashRows()
 * @model
 * @generated
 */
public interface SquashRows extends Operation
{
  /**
   * Returns the value of the '<em><b>Columns</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columns</em>' attribute list.
   * @see org.feup.els5.dsl.tableDSL.TableDSLPackage#getSquashRows_Columns()
   * @model unique="false"
   * @generated
   */
  EList<String> getColumns();

} // SquashRows
