/**
 * generated by Xtext 2.26.0
 */
package dk.sdu.gms.dds.deviceDefinition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Worker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.gms.dds.deviceDefinition.Worker#getName <em>Name</em>}</li>
 *   <li>{@link dk.sdu.gms.dds.deviceDefinition.Worker#getMac <em>Mac</em>}</li>
 *   <li>{@link dk.sdu.gms.dds.deviceDefinition.Worker#getSleepTime <em>Sleep Time</em>}</li>
 *   <li>{@link dk.sdu.gms.dds.deviceDefinition.Worker#getTimeUnit <em>Time Unit</em>}</li>
 *   <li>{@link dk.sdu.gms.dds.deviceDefinition.Worker#getErrorLed <em>Error Led</em>}</li>
 *   <li>{@link dk.sdu.gms.dds.deviceDefinition.Worker#getRetries <em>Retries</em>}</li>
 *   <li>{@link dk.sdu.gms.dds.deviceDefinition.Worker#getDelay <em>Delay</em>}</li>
 *   <li>{@link dk.sdu.gms.dds.deviceDefinition.Worker#getDelayTimeUnit <em>Delay Time Unit</em>}</li>
 *   <li>{@link dk.sdu.gms.dds.deviceDefinition.Worker#getDevices <em>Devices</em>}</li>
 * </ul>
 *
 * @see dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionPackage#getWorker()
 * @model
 * @generated
 */
public interface Worker extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionPackage#getWorker_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link dk.sdu.gms.dds.deviceDefinition.Worker#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Mac</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mac</em>' attribute.
   * @see #setMac(String)
   * @see dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionPackage#getWorker_Mac()
   * @model
   * @generated
   */
  String getMac();

  /**
   * Sets the value of the '{@link dk.sdu.gms.dds.deviceDefinition.Worker#getMac <em>Mac</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mac</em>' attribute.
   * @see #getMac()
   * @generated
   */
  void setMac(String value);

  /**
   * Returns the value of the '<em><b>Sleep Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sleep Time</em>' containment reference.
   * @see #setSleepTime(NumberPrimitive)
   * @see dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionPackage#getWorker_SleepTime()
   * @model containment="true"
   * @generated
   */
  NumberPrimitive getSleepTime();

  /**
   * Sets the value of the '{@link dk.sdu.gms.dds.deviceDefinition.Worker#getSleepTime <em>Sleep Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sleep Time</em>' containment reference.
   * @see #getSleepTime()
   * @generated
   */
  void setSleepTime(NumberPrimitive value);

  /**
   * Returns the value of the '<em><b>Time Unit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time Unit</em>' containment reference.
   * @see #setTimeUnit(TimeUnit)
   * @see dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionPackage#getWorker_TimeUnit()
   * @model containment="true"
   * @generated
   */
  TimeUnit getTimeUnit();

  /**
   * Sets the value of the '{@link dk.sdu.gms.dds.deviceDefinition.Worker#getTimeUnit <em>Time Unit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time Unit</em>' containment reference.
   * @see #getTimeUnit()
   * @generated
   */
  void setTimeUnit(TimeUnit value);

  /**
   * Returns the value of the '<em><b>Error Led</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Error Led</em>' attribute list.
   * @see dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionPackage#getWorker_ErrorLed()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getErrorLed();

  /**
   * Returns the value of the '<em><b>Retries</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Retries</em>' attribute list.
   * @see dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionPackage#getWorker_Retries()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getRetries();

  /**
   * Returns the value of the '<em><b>Delay</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.gms.dds.deviceDefinition.NumberPrimitive}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delay</em>' containment reference list.
   * @see dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionPackage#getWorker_Delay()
   * @model containment="true"
   * @generated
   */
  EList<NumberPrimitive> getDelay();

  /**
   * Returns the value of the '<em><b>Delay Time Unit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delay Time Unit</em>' containment reference.
   * @see #setDelayTimeUnit(TimeUnit)
   * @see dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionPackage#getWorker_DelayTimeUnit()
   * @model containment="true"
   * @generated
   */
  TimeUnit getDelayTimeUnit();

  /**
   * Sets the value of the '{@link dk.sdu.gms.dds.deviceDefinition.Worker#getDelayTimeUnit <em>Delay Time Unit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delay Time Unit</em>' containment reference.
   * @see #getDelayTimeUnit()
   * @generated
   */
  void setDelayTimeUnit(TimeUnit value);

  /**
   * Returns the value of the '<em><b>Devices</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.gms.dds.deviceDefinition.Device}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Devices</em>' containment reference list.
   * @see dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionPackage#getWorker_Devices()
   * @model containment="true"
   * @generated
   */
  EList<Device> getDevices();

} // Worker
