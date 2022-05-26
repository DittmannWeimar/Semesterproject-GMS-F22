/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.gms.dds.deviceDefinition;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.gms.dds.deviceDefinition.ExternalCall#getFunc <em>Func</em>}</li>
 *   <li>{@link dk.sdu.gms.dds.deviceDefinition.ExternalCall#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionPackage#getExternalCall()
 * @model
 * @generated
 */
public interface ExternalCall extends Expression
{
  /**
   * Returns the value of the '<em><b>Func</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Func</em>' attribute.
   * @see #setFunc(String)
   * @see dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionPackage#getExternalCall_Func()
   * @model
   * @generated
   */
  String getFunc();

  /**
   * Sets the value of the '{@link dk.sdu.gms.dds.deviceDefinition.ExternalCall#getFunc <em>Func</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Func</em>' attribute.
   * @see #getFunc()
   * @generated
   */
  void setFunc(String value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.gms.dds.deviceDefinition.Expression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionPackage#getExternalCall_Args()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getArgs();

} // ExternalCall
