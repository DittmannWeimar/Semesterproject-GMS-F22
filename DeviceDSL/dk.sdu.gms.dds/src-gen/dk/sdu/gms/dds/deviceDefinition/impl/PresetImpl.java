/**
 * generated by Xtext 2.26.0
 */
package dk.sdu.gms.dds.deviceDefinition.impl;

import dk.sdu.gms.dds.deviceDefinition.ColorPreset;
import dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionPackage;
import dk.sdu.gms.dds.deviceDefinition.Preset;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Preset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.gms.dds.deviceDefinition.impl.PresetImpl#getPreset <em>Preset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PresetImpl extends ColorImpl implements Preset
{
  /**
   * The default value of the '{@link #getPreset() <em>Preset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreset()
   * @generated
   * @ordered
   */
  protected static final ColorPreset PRESET_EDEFAULT = ColorPreset.RED;

  /**
   * The cached value of the '{@link #getPreset() <em>Preset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreset()
   * @generated
   * @ordered
   */
  protected ColorPreset preset = PRESET_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PresetImpl()
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
    return DeviceDefinitionPackage.Literals.PRESET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ColorPreset getPreset()
  {
    return preset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPreset(ColorPreset newPreset)
  {
    ColorPreset oldPreset = preset;
    preset = newPreset == null ? PRESET_EDEFAULT : newPreset;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeviceDefinitionPackage.PRESET__PRESET, oldPreset, preset));
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
      case DeviceDefinitionPackage.PRESET__PRESET:
        return getPreset();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DeviceDefinitionPackage.PRESET__PRESET:
        setPreset((ColorPreset)newValue);
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
      case DeviceDefinitionPackage.PRESET__PRESET:
        setPreset(PRESET_EDEFAULT);
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
      case DeviceDefinitionPackage.PRESET__PRESET:
        return preset != PRESET_EDEFAULT;
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
    result.append(" (preset: ");
    result.append(preset);
    result.append(')');
    return result.toString();
  }

} //PresetImpl
