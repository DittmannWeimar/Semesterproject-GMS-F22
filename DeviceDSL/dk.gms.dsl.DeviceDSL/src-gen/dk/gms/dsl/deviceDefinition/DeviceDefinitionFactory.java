/**
 * generated by Xtext 2.25.0
 */
package dk.gms.dsl.deviceDefinition;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dk.gms.dsl.deviceDefinition.DeviceDefinitionPackage
 * @generated
 */
public interface DeviceDefinitionFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DeviceDefinitionFactory eINSTANCE = dk.gms.dsl.deviceDefinition.impl.DeviceDefinitionFactoryImpl.init();

  /**
   * Returns a new object of class '<em>System</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>System</em>'.
   * @generated
   */
  System createSystem();

  /**
   * Returns a new object of class '<em>Graph</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Graph</em>'.
   * @generated
   */
  Graph createGraph();

  /**
   * Returns a new object of class '<em>Master</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Master</em>'.
   * @generated
   */
  Master createMaster();

  /**
   * Returns a new object of class '<em>Slave</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slave</em>'.
   * @generated
   */
  Slave createSlave();

  /**
   * Returns a new object of class '<em>Sensor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sensor</em>'.
   * @generated
   */
  Sensor createSensor();

  /**
   * Returns a new object of class '<em>Actuator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Actuator</em>'.
   * @generated
   */
  Actuator createActuator();

  /**
   * Returns a new object of class '<em>Setting</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Setting</em>'.
   * @generated
   */
  Setting createSetting();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DeviceDefinitionPackage getDeviceDefinitionPackage();

} //DeviceDefinitionFactory
