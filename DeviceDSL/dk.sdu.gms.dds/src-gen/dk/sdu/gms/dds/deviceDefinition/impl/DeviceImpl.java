/**
 * generated by Xtext 2.26.0
 */
package dk.sdu.gms.dds.deviceDefinition.impl;

import dk.sdu.gms.dds.deviceDefinition.Device;
import dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionPackage;
import dk.sdu.gms.dds.deviceDefinition.Setting;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.gms.dds.deviceDefinition.impl.DeviceImpl#getType <em>Type</em>}</li>
 *   <li>{@link dk.sdu.gms.dds.deviceDefinition.impl.DeviceImpl#getName <em>Name</em>}</li>
 *   <li>{@link dk.sdu.gms.dds.deviceDefinition.impl.DeviceImpl#getPins <em>Pins</em>}</li>
 *   <li>{@link dk.sdu.gms.dds.deviceDefinition.impl.DeviceImpl#getSettings <em>Settings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceImpl extends MinimalEObjectImpl.Container implements Device
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

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
   * The cached value of the '{@link #getPins() <em>Pins</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPins()
   * @generated
   * @ordered
   */
  protected EList<Integer> pins;

  /**
   * The cached value of the '{@link #getSettings() <em>Settings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSettings()
   * @generated
   * @ordered
   */
  protected EList<Setting> settings;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeviceImpl()
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
    return DeviceDefinitionPackage.Literals.DEVICE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeviceDefinitionPackage.DEVICE__TYPE, oldType, type));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DeviceDefinitionPackage.DEVICE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Integer> getPins()
  {
    if (pins == null)
    {
      pins = new EDataTypeEList<Integer>(Integer.class, this, DeviceDefinitionPackage.DEVICE__PINS);
    }
    return pins;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Setting> getSettings()
  {
    if (settings == null)
    {
      settings = new EObjectContainmentEList<Setting>(Setting.class, this, DeviceDefinitionPackage.DEVICE__SETTINGS);
    }
    return settings;
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
      case DeviceDefinitionPackage.DEVICE__SETTINGS:
        return ((InternalEList<?>)getSettings()).basicRemove(otherEnd, msgs);
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
      case DeviceDefinitionPackage.DEVICE__TYPE:
        return getType();
      case DeviceDefinitionPackage.DEVICE__NAME:
        return getName();
      case DeviceDefinitionPackage.DEVICE__PINS:
        return getPins();
      case DeviceDefinitionPackage.DEVICE__SETTINGS:
        return getSettings();
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
      case DeviceDefinitionPackage.DEVICE__TYPE:
        setType((String)newValue);
        return;
      case DeviceDefinitionPackage.DEVICE__NAME:
        setName((String)newValue);
        return;
      case DeviceDefinitionPackage.DEVICE__PINS:
        getPins().clear();
        getPins().addAll((Collection<? extends Integer>)newValue);
        return;
      case DeviceDefinitionPackage.DEVICE__SETTINGS:
        getSettings().clear();
        getSettings().addAll((Collection<? extends Setting>)newValue);
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
      case DeviceDefinitionPackage.DEVICE__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case DeviceDefinitionPackage.DEVICE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DeviceDefinitionPackage.DEVICE__PINS:
        getPins().clear();
        return;
      case DeviceDefinitionPackage.DEVICE__SETTINGS:
        getSettings().clear();
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
      case DeviceDefinitionPackage.DEVICE__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case DeviceDefinitionPackage.DEVICE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DeviceDefinitionPackage.DEVICE__PINS:
        return pins != null && !pins.isEmpty();
      case DeviceDefinitionPackage.DEVICE__SETTINGS:
        return settings != null && !settings.isEmpty();
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
    result.append(" (type: ");
    result.append(type);
    result.append(", name: ");
    result.append(name);
    result.append(", pins: ");
    result.append(pins);
    result.append(')');
    return result.toString();
  }

} //DeviceImpl
