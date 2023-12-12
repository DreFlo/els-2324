/**
 * generated by Xtext 2.33.0
 */
package org.feup.els5.dsl.tableDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.feup.els5.dsl.tableDSL.Comparator;
import org.feup.els5.dsl.tableDSL.Extract;
import org.feup.els5.dsl.tableDSL.ExtractColumnMapping;
import org.feup.els5.dsl.tableDSL.Selector;
import org.feup.els5.dsl.tableDSL.TableDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.feup.els5.dsl.tableDSL.impl.ExtractImpl#getTargets <em>Targets</em>}</li>
 *   <li>{@link org.feup.els5.dsl.tableDSL.impl.ExtractImpl#getSourceColumn <em>Source Column</em>}</li>
 *   <li>{@link org.feup.els5.dsl.tableDSL.impl.ExtractImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.feup.els5.dsl.tableDSL.impl.ExtractImpl#getComparator <em>Comparator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtractImpl extends OperationImpl implements Extract
{
  /**
   * The cached value of the '{@link #getTargets() <em>Targets</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargets()
   * @generated
   * @ordered
   */
  protected EList<ExtractColumnMapping> targets;

  /**
   * The default value of the '{@link #getSourceColumn() <em>Source Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceColumn()
   * @generated
   * @ordered
   */
  protected static final String SOURCE_COLUMN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSourceColumn() <em>Source Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceColumn()
   * @generated
   * @ordered
   */
  protected String sourceColumn = SOURCE_COLUMN_EDEFAULT;

  /**
   * The cached value of the '{@link #getSelector() <em>Selector</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelector()
   * @generated
   * @ordered
   */
  protected Selector selector;

  /**
   * The cached value of the '{@link #getComparator() <em>Comparator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComparator()
   * @generated
   * @ordered
   */
  protected Comparator comparator;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExtractImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TableDSLPackage.Literals.EXTRACT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ExtractColumnMapping> getTargets()
  {
    if (targets == null)
    {
      targets = new EObjectContainmentEList<ExtractColumnMapping>(ExtractColumnMapping.class, this, TableDSLPackage.EXTRACT__TARGETS);
    }
    return targets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSourceColumn()
  {
    return sourceColumn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSourceColumn(String newSourceColumn)
  {
    String oldSourceColumn = sourceColumn;
    sourceColumn = newSourceColumn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TableDSLPackage.EXTRACT__SOURCE_COLUMN, oldSourceColumn, sourceColumn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Selector getSelector()
  {
    return selector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSelector(Selector newSelector, NotificationChain msgs)
  {
    Selector oldSelector = selector;
    selector = newSelector;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TableDSLPackage.EXTRACT__SELECTOR, oldSelector, newSelector);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSelector(Selector newSelector)
  {
    if (newSelector != selector)
    {
      NotificationChain msgs = null;
      if (selector != null)
        msgs = ((InternalEObject)selector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TableDSLPackage.EXTRACT__SELECTOR, null, msgs);
      if (newSelector != null)
        msgs = ((InternalEObject)newSelector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TableDSLPackage.EXTRACT__SELECTOR, null, msgs);
      msgs = basicSetSelector(newSelector, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TableDSLPackage.EXTRACT__SELECTOR, newSelector, newSelector));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Comparator getComparator()
  {
    return comparator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComparator(Comparator newComparator, NotificationChain msgs)
  {
    Comparator oldComparator = comparator;
    comparator = newComparator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TableDSLPackage.EXTRACT__COMPARATOR, oldComparator, newComparator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setComparator(Comparator newComparator)
  {
    if (newComparator != comparator)
    {
      NotificationChain msgs = null;
      if (comparator != null)
        msgs = ((InternalEObject)comparator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TableDSLPackage.EXTRACT__COMPARATOR, null, msgs);
      if (newComparator != null)
        msgs = ((InternalEObject)newComparator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TableDSLPackage.EXTRACT__COMPARATOR, null, msgs);
      msgs = basicSetComparator(newComparator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TableDSLPackage.EXTRACT__COMPARATOR, newComparator, newComparator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TableDSLPackage.EXTRACT__TARGETS:
        return ((InternalEList<?>)getTargets()).basicRemove(otherEnd, msgs);
      case TableDSLPackage.EXTRACT__SELECTOR:
        return basicSetSelector(null, msgs);
      case TableDSLPackage.EXTRACT__COMPARATOR:
        return basicSetComparator(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TableDSLPackage.EXTRACT__TARGETS:
        return getTargets();
      case TableDSLPackage.EXTRACT__SOURCE_COLUMN:
        return getSourceColumn();
      case TableDSLPackage.EXTRACT__SELECTOR:
        return getSelector();
      case TableDSLPackage.EXTRACT__COMPARATOR:
        return getComparator();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TableDSLPackage.EXTRACT__TARGETS:
        getTargets().clear();
        getTargets().addAll((Collection<? extends ExtractColumnMapping>)newValue);
        return;
      case TableDSLPackage.EXTRACT__SOURCE_COLUMN:
        setSourceColumn((String)newValue);
        return;
      case TableDSLPackage.EXTRACT__SELECTOR:
        setSelector((Selector)newValue);
        return;
      case TableDSLPackage.EXTRACT__COMPARATOR:
        setComparator((Comparator)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TableDSLPackage.EXTRACT__TARGETS:
        getTargets().clear();
        return;
      case TableDSLPackage.EXTRACT__SOURCE_COLUMN:
        setSourceColumn(SOURCE_COLUMN_EDEFAULT);
        return;
      case TableDSLPackage.EXTRACT__SELECTOR:
        setSelector((Selector)null);
        return;
      case TableDSLPackage.EXTRACT__COMPARATOR:
        setComparator((Comparator)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TableDSLPackage.EXTRACT__TARGETS:
        return targets != null && !targets.isEmpty();
      case TableDSLPackage.EXTRACT__SOURCE_COLUMN:
        return SOURCE_COLUMN_EDEFAULT == null ? sourceColumn != null : !SOURCE_COLUMN_EDEFAULT.equals(sourceColumn);
      case TableDSLPackage.EXTRACT__SELECTOR:
        return selector != null;
      case TableDSLPackage.EXTRACT__COMPARATOR:
        return comparator != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (sourceColumn: ");
    result.append(sourceColumn);
    result.append(')');
    return result.toString();
  }

} //ExtractImpl
