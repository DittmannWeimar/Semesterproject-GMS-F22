/**
 * generated by Xtext 2.26.0
 */
package dk.sdu.gms.dds.deviceDefinition;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.gms.dds.deviceDefinition.Sensor#getSampleRate <em>Sample Rate</em>}</li>
 *   <li>{@link dk.sdu.gms.dds.deviceDefinition.Sensor#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link dk.sdu.gms.dds.deviceDefinition.Sensor#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link dk.sdu.gms.dds.deviceDefinition.Sensor#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link dk.sdu.gms.dds.deviceDefinition.Sensor#getGraph <em>Graph</em>}</li>
 * </ul>
 *
 * @see dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionPackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends Device
{
  /**
   * Returns the value of the '<em><b>Sample Rate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sample Rate</em>' containment reference.
   * @see #setSampleRate(Primitive)
   * @see dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionPackage#getSensor_SampleRate()
   * @model containment="true"
   * @generated
   */
  Primitive getSampleRate();

  /**
   * Sets the value of the '{@link dk.sdu.gms.dds.deviceDefinition.Sensor#getSampleRate <em>Sample Rate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sample Rate</em>' containment reference.
   * @see #getSampleRate()
   * @generated
   */
  void setSampleRate(Primitive value);

  /**
   * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.gms.dds.deviceDefinition.SensorOutput}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outputs</em>' containment reference list.
   * @see dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionPackage#getSensor_Outputs()
   * @model containment="true"
   * @generated
   */
  EList<SensorOutput> getOutputs();

  /**
   * Returns the value of the '<em><b>Behavior</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.gms.dds.deviceDefinition.SampleBehavior}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Behavior</em>' containment reference list.
   * @see dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionPackage#getSensor_Behavior()
   * @model containment="true"
   * @generated
   */
  EList<SampleBehavior> getBehavior();

  /**
   * Returns the value of the '<em><b>Predicate</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.gms.dds.deviceDefinition.Expression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predicate</em>' containment reference list.
   * @see dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionPackage#getSensor_Predicate()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getPredicate();

  /**
   * Returns the value of the '<em><b>Graph</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Graph</em>' reference.
   * @see #setGraph(Graph)
   * @see dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionPackage#getSensor_Graph()
   * @model
   * @generated
   */
  Graph getGraph();

  /**
   * Sets the value of the '{@link dk.sdu.gms.dds.deviceDefinition.Sensor#getGraph <em>Graph</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Graph</em>' reference.
   * @see #getGraph()
   * @generated
   */
  void setGraph(Graph value);

} // Sensor
