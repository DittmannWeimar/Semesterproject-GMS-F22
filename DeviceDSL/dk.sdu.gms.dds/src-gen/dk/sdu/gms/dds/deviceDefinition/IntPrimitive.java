/**
 * generated by Xtext 2.26.0
 */
package dk.sdu.gms.dds.deviceDefinition;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int Primitive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.gms.dds.deviceDefinition.IntPrimitive#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionPackage#getIntPrimitive()
 * @model
 * @generated
 */
public interface IntPrimitive extends NumberPrimitive
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionPackage#getIntPrimitive_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link dk.sdu.gms.dds.deviceDefinition.IntPrimitive#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // IntPrimitive
