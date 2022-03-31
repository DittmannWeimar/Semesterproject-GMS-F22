/**
 * generated by Xtext 2.25.0
 */
package dk.gms.dsl.deviceDefinition.impl;

import dk.gms.dsl.deviceDefinition.DeviceDefinitionPackage;
import dk.gms.dsl.deviceDefinition.Graph;
import dk.gms.dsl.deviceDefinition.Master;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.gms.dsl.deviceDefinition.impl.SystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link dk.gms.dsl.deviceDefinition.impl.SystemImpl#getMaster <em>Master</em>}</li>
 *   <li>{@link dk.gms.dsl.deviceDefinition.impl.SystemImpl#getGraphs <em>Graphs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends MinimalEObjectImpl.Container implements dk.gms.dsl.deviceDefinition.System
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getMaster() <em>Master</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaster()
   * @generated
   * @ordered
   */
  protected Master master;

  /**
   * The cached value of the '{@link #getGraphs() <em>Graphs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGraphs()
   * @generated
   * @ordered
   */
  protected EList<Graph> graphs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SystemImpl()
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
    return DeviceDefinitionPackage.Literals.SYSTEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeviceDefinitionPackage.SYSTEM__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Master getMaster()
  {
    return master;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMaster(Master newMaster, NotificationChain msgs)
  {
    Master oldMaster = master;
    master = newMaster;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeviceDefinitionPackage.SYSTEM__MASTER, oldMaster, newMaster);
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
  public void setMaster(Master newMaster)
  {
    if (newMaster != master)
    {
      NotificationChain msgs = null;
      if (master != null)
        msgs = ((InternalEObject)master).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeviceDefinitionPackage.SYSTEM__MASTER, null, msgs);
      if (newMaster != null)
        msgs = ((InternalEObject)newMaster).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeviceDefinitionPackage.SYSTEM__MASTER, null, msgs);
      msgs = basicSetMaster(newMaster, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeviceDefinitionPackage.SYSTEM__MASTER, newMaster, newMaster));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Graph> getGraphs()
  {
    if (graphs == null)
    {
      graphs = new EObjectContainmentEList<Graph>(Graph.class, this, DeviceDefinitionPackage.SYSTEM__GRAPHS);
    }
    return graphs;
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
      case DeviceDefinitionPackage.SYSTEM__MASTER:
        return basicSetMaster(null, msgs);
      case DeviceDefinitionPackage.SYSTEM__GRAPHS:
        return ((InternalEList<?>)getGraphs()).basicRemove(otherEnd, msgs);
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
      case DeviceDefinitionPackage.SYSTEM__NAME:
        return getName();
      case DeviceDefinitionPackage.SYSTEM__MASTER:
        return getMaster();
      case DeviceDefinitionPackage.SYSTEM__GRAPHS:
        return getGraphs();
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
      case DeviceDefinitionPackage.SYSTEM__NAME:
        setName((String)newValue);
        return;
      case DeviceDefinitionPackage.SYSTEM__MASTER:
        setMaster((Master)newValue);
        return;
      case DeviceDefinitionPackage.SYSTEM__GRAPHS:
        getGraphs().clear();
        getGraphs().addAll((Collection<? extends Graph>)newValue);
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
      case DeviceDefinitionPackage.SYSTEM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DeviceDefinitionPackage.SYSTEM__MASTER:
        setMaster((Master)null);
        return;
      case DeviceDefinitionPackage.SYSTEM__GRAPHS:
        getGraphs().clear();
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
      case DeviceDefinitionPackage.SYSTEM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DeviceDefinitionPackage.SYSTEM__MASTER:
        return master != null;
      case DeviceDefinitionPackage.SYSTEM__GRAPHS:
        return graphs != null && !graphs.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //SystemImpl
