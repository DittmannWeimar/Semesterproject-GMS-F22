/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.gms.dds.deviceDefinition;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.gms.dds.deviceDefinition.VariableUse#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionPackage#getVariableUse()
 * @model
 * @generated
 */
public interface VariableUse extends Expression
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(Binding)
   * @see dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionPackage#getVariableUse_Ref()
   * @model
   * @generated
   */
  Binding getRef();

  /**
   * Sets the value of the '{@link dk.sdu.gms.dds.deviceDefinition.VariableUse#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(Binding value);

} // VariableUse
