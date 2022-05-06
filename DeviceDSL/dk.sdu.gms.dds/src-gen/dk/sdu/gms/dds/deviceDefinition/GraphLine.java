/**
 * generated by Xtext 2.26.0
 */
package dk.sdu.gms.dds.deviceDefinition;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.gms.dds.deviceDefinition.GraphLine#getOutput <em>Output</em>}</li>
 *   <li>{@link dk.sdu.gms.dds.deviceDefinition.GraphLine#getLegend <em>Legend</em>}</li>
 *   <li>{@link dk.sdu.gms.dds.deviceDefinition.GraphLine#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionPackage#getGraphLine()
 * @model
 * @generated
 */
public interface GraphLine extends EObject
{
  /**
   * Returns the value of the '<em><b>Output</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output</em>' containment reference.
   * @see #setOutput(Expression)
   * @see dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionPackage#getGraphLine_Output()
   * @model containment="true"
   * @generated
   */
  Expression getOutput();

  /**
   * Sets the value of the '{@link dk.sdu.gms.dds.deviceDefinition.GraphLine#getOutput <em>Output</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Output</em>' containment reference.
   * @see #getOutput()
   * @generated
   */
  void setOutput(Expression value);

  /**
   * Returns the value of the '<em><b>Legend</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Legend</em>' attribute.
   * @see #setLegend(String)
   * @see dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionPackage#getGraphLine_Legend()
   * @model
   * @generated
   */
  String getLegend();

  /**
   * Sets the value of the '{@link dk.sdu.gms.dds.deviceDefinition.GraphLine#getLegend <em>Legend</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Legend</em>' attribute.
   * @see #getLegend()
   * @generated
   */
  void setLegend(String value);

  /**
   * Returns the value of the '<em><b>Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color</em>' containment reference.
   * @see #setColor(Color)
   * @see dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionPackage#getGraphLine_Color()
   * @model containment="true"
   * @generated
   */
  Color getColor();

  /**
   * Sets the value of the '{@link dk.sdu.gms.dds.deviceDefinition.GraphLine#getColor <em>Color</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color</em>' containment reference.
   * @see #getColor()
   * @generated
   */
  void setColor(Color value);

} // GraphLine