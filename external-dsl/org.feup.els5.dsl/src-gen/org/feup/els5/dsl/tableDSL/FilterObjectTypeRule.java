/**
 * generated by Xtext 2.32.0
 */
package org.feup.els5.dsl.tableDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Object Type Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.feup.els5.dsl.tableDSL.FilterObjectTypeRule#getObjectClasses <em>Object Classes</em>}</li>
 * </ul>
 *
 * @see org.feup.els5.dsl.tableDSL.TableDSLPackage#getFilterObjectTypeRule()
 * @model
 * @generated
 */
public interface FilterObjectTypeRule extends FilterRule
{
  /**
   * Returns the value of the '<em><b>Object Classes</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Classes</em>' attribute list.
   * @see org.feup.els5.dsl.tableDSL.TableDSLPackage#getFilterObjectTypeRule_ObjectClasses()
   * @model unique="false"
   * @generated
   */
  EList<String> getObjectClasses();

} // FilterObjectTypeRule
