/**
 * generated by Xtext 2.26.0
 */
package dk.sdu.gms.dds.deviceDefinition;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.gms.dds.deviceDefinition.Actuator#getSettings <em>Settings</em>}</li>
 *   <li>{@link dk.sdu.gms.dds.deviceDefinition.Actuator#getTrigger <em>Trigger</em>}</li>
 * </ul>
 *
 * @see dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionPackage#getActuator()
 * @model
 * @generated
 */
public interface Actuator extends Device
{
  /**
   * Returns the value of the '<em><b>Settings</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.gms.dds.deviceDefinition.Setting}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Settings</em>' containment reference list.
   * @see dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionPackage#getActuator_Settings()
   * @model containment="true"
   * @generated
   */
  EList<Setting> getSettings();

  /**
   * Returns the value of the '<em><b>Trigger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trigger</em>' containment reference.
   * @see #setTrigger(Trigger)
   * @see dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionPackage#getActuator_Trigger()
   * @model containment="true"
   * @generated
   */
  Trigger getTrigger();

  /**
   * Sets the value of the '{@link dk.sdu.gms.dds.deviceDefinition.Actuator#getTrigger <em>Trigger</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trigger</em>' containment reference.
   * @see #getTrigger()
   * @generated
   */
  void setTrigger(Trigger value);

} // Actuator
