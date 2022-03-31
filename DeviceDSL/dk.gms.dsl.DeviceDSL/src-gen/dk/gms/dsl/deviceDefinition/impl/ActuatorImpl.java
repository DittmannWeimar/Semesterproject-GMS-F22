/**
 * generated by Xtext 2.25.0
 */
package dk.gms.dsl.deviceDefinition.impl;

import dk.gms.dsl.deviceDefinition.Actuator;
import dk.gms.dsl.deviceDefinition.ActuatorType;
import dk.gms.dsl.deviceDefinition.DeviceDefinitionPackage;
import dk.gms.dsl.deviceDefinition.Setting;

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
 * An implementation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.gms.dsl.deviceDefinition.impl.ActuatorImpl#getType <em>Type</em>}</li>
 *   <li>{@link dk.gms.dsl.deviceDefinition.impl.ActuatorImpl#getPins <em>Pins</em>}</li>
 *   <li>{@link dk.gms.dsl.deviceDefinition.impl.ActuatorImpl#getSettings <em>Settings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActuatorImpl extends MinimalEObjectImpl.Container implements Actuator
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final ActuatorType TYPE_EDEFAULT = ActuatorType.LED;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected ActuatorType type = TYPE_EDEFAULT;

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
  protected ActuatorImpl()
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
    return DeviceDefinitionPackage.Literals.ACTUATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ActuatorType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(ActuatorType newType)
  {
    ActuatorType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeviceDefinitionPackage.ACTUATOR__TYPE, oldType, type));
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
      pins = new EDataTypeEList<Integer>(Integer.class, this, DeviceDefinitionPackage.ACTUATOR__PINS);
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
      settings = new EObjectContainmentEList<Setting>(Setting.class, this, DeviceDefinitionPackage.ACTUATOR__SETTINGS);
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
      case DeviceDefinitionPackage.ACTUATOR__SETTINGS:
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
      case DeviceDefinitionPackage.ACTUATOR__TYPE:
        return getType();
      case DeviceDefinitionPackage.ACTUATOR__PINS:
        return getPins();
      case DeviceDefinitionPackage.ACTUATOR__SETTINGS:
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
      case DeviceDefinitionPackage.ACTUATOR__TYPE:
        setType((ActuatorType)newValue);
        return;
      case DeviceDefinitionPackage.ACTUATOR__PINS:
        getPins().clear();
        getPins().addAll((Collection<? extends Integer>)newValue);
        return;
      case DeviceDefinitionPackage.ACTUATOR__SETTINGS:
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
      case DeviceDefinitionPackage.ACTUATOR__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case DeviceDefinitionPackage.ACTUATOR__PINS:
        getPins().clear();
        return;
      case DeviceDefinitionPackage.ACTUATOR__SETTINGS:
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
      case DeviceDefinitionPackage.ACTUATOR__TYPE:
        return type != TYPE_EDEFAULT;
      case DeviceDefinitionPackage.ACTUATOR__PINS:
        return pins != null && !pins.isEmpty();
      case DeviceDefinitionPackage.ACTUATOR__SETTINGS:
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
    result.append(", pins: ");
    result.append(pins);
    result.append(')');
    return result.toString();
  }

} //ActuatorImpl
