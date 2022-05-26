/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.gms.dds.deviceDefinition;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lesser Or Equals</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.gms.dds.deviceDefinition.LesserOrEquals#getLeft <em>Left</em>}</li>
 *   <li>{@link dk.sdu.gms.dds.deviceDefinition.LesserOrEquals#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionPackage#getLesserOrEquals()
 * @model
 * @generated
 */
public interface LesserOrEquals extends Expression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Expression)
   * @see dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionPackage#getLesserOrEquals_Left()
   * @model containment="true"
   * @generated
   */
  Expression getLeft();

  /**
   * Sets the value of the '{@link dk.sdu.gms.dds.deviceDefinition.LesserOrEquals#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Expression)
   * @see dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionPackage#getLesserOrEquals_Right()
   * @model containment="true"
   * @generated
   */
  Expression getRight();

  /**
   * Sets the value of the '{@link dk.sdu.gms.dds.deviceDefinition.LesserOrEquals#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expression value);

} // LesserOrEquals
