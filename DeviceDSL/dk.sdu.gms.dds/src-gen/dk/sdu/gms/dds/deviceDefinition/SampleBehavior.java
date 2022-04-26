/**
 * generated by Xtext 2.26.0
 */
package dk.sdu.gms.dds.deviceDefinition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sample Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.gms.dds.deviceDefinition.SampleBehavior#getType <em>Type</em>}</li>
 *   <li>{@link dk.sdu.gms.dds.deviceDefinition.SampleBehavior#getArgs <em>Args</em>}</li>
 *   <li>{@link dk.sdu.gms.dds.deviceDefinition.SampleBehavior#getPins <em>Pins</em>}</li>
 * </ul>
 *
 * @see dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionPackage#getSampleBehavior()
 * @model
 * @generated
 */
public interface SampleBehavior extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Import)
   * @see dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionPackage#getSampleBehavior_Type()
   * @model
   * @generated
   */
  Import getType();

  /**
   * Sets the value of the '{@link dk.sdu.gms.dds.deviceDefinition.SampleBehavior#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Import value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.gms.dds.deviceDefinition.Expression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionPackage#getSampleBehavior_Args()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getArgs();

  /**
   * Returns the value of the '<em><b>Pins</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.gms.dds.deviceDefinition.Expression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pins</em>' containment reference list.
   * @see dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionPackage#getSampleBehavior_Pins()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getPins();

} // SampleBehavior
