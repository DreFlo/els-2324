/**
 * generated by Xtext 2.33.0
 */
package org.feup.els5.dsl.tableDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.feup.els5.dsl.tableDSL.Output#getOutputPaths <em>Output Paths</em>}</li>
 * </ul>
 *
 * @see org.feup.els5.dsl.tableDSL.TableDSLPackage#getOutput()
 * @model
 * @generated
 */
public interface Output extends TableAction
{
  /**
   * Returns the value of the '<em><b>Output Paths</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output Paths</em>' attribute list.
   * @see org.feup.els5.dsl.tableDSL.TableDSLPackage#getOutput_OutputPaths()
   * @model unique="false"
   * @generated
   */
  EList<String> getOutputPaths();

} // Output
