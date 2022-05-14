/**
 * generated by Xtext 2.26.0
 */
package dk.sdu.gms.dds.deviceDefinition.impl;

import dk.sdu.gms.dds.deviceDefinition.Device;
import dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionPackage;
import dk.sdu.gms.dds.deviceDefinition.NumberPrimitive;
import dk.sdu.gms.dds.deviceDefinition.TimeUnit;
import dk.sdu.gms.dds.deviceDefinition.Worker;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Worker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.gms.dds.deviceDefinition.impl.WorkerImpl#getName <em>Name</em>}</li>
 *   <li>{@link dk.sdu.gms.dds.deviceDefinition.impl.WorkerImpl#getMac <em>Mac</em>}</li>
 *   <li>{@link dk.sdu.gms.dds.deviceDefinition.impl.WorkerImpl#getSleepTime <em>Sleep Time</em>}</li>
 *   <li>{@link dk.sdu.gms.dds.deviceDefinition.impl.WorkerImpl#getTimeUnit <em>Time Unit</em>}</li>
 *   <li>{@link dk.sdu.gms.dds.deviceDefinition.impl.WorkerImpl#getErrorLed <em>Error Led</em>}</li>
 *   <li>{@link dk.sdu.gms.dds.deviceDefinition.impl.WorkerImpl#getRetries <em>Retries</em>}</li>
 *   <li>{@link dk.sdu.gms.dds.deviceDefinition.impl.WorkerImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link dk.sdu.gms.dds.deviceDefinition.impl.WorkerImpl#getDelayTimeUnit <em>Delay Time Unit</em>}</li>
 *   <li>{@link dk.sdu.gms.dds.deviceDefinition.impl.WorkerImpl#getDevices <em>Devices</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkerImpl extends MinimalEObjectImpl.Container implements Worker
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getMac() <em>Mac</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMac()
   * @generated
   * @ordered
   */
  protected static final String MAC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMac() <em>Mac</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMac()
   * @generated
   * @ordered
   */
  protected String mac = MAC_EDEFAULT;

  /**
   * The cached value of the '{@link #getSleepTime() <em>Sleep Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSleepTime()
   * @generated
   * @ordered
   */
  protected NumberPrimitive sleepTime;

  /**
   * The cached value of the '{@link #getTimeUnit() <em>Time Unit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimeUnit()
   * @generated
   * @ordered
   */
  protected TimeUnit timeUnit;

  /**
   * The cached value of the '{@link #getErrorLed() <em>Error Led</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getErrorLed()
   * @generated
   * @ordered
   */
  protected EList<Integer> errorLed;

  /**
   * The cached value of the '{@link #getRetries() <em>Retries</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRetries()
   * @generated
   * @ordered
   */
  protected EList<Integer> retries;

  /**
   * The cached value of the '{@link #getDelay() <em>Delay</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelay()
   * @generated
   * @ordered
   */
  protected EList<NumberPrimitive> delay;

  /**
   * The cached value of the '{@link #getDelayTimeUnit() <em>Delay Time Unit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelayTimeUnit()
   * @generated
   * @ordered
   */
  protected TimeUnit delayTimeUnit;

  /**
   * The cached value of the '{@link #getDevices() <em>Devices</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDevices()
   * @generated
   * @ordered
   */
  protected EList<Device> devices;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WorkerImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DeviceDefinitionPackage.Literals.WORKER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeviceDefinitionPackage.WORKER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getMac()
  {
    return mac;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMac(String newMac)
  {
    String oldMac = mac;
    mac = newMac;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeviceDefinitionPackage.WORKER__MAC, oldMac, mac));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NumberPrimitive getSleepTime()
  {
    return sleepTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSleepTime(NumberPrimitive newSleepTime, NotificationChain msgs)
  {
    NumberPrimitive oldSleepTime = sleepTime;
    sleepTime = newSleepTime;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeviceDefinitionPackage.WORKER__SLEEP_TIME, oldSleepTime, newSleepTime);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSleepTime(NumberPrimitive newSleepTime)
  {
    if (newSleepTime != sleepTime)
    {
      NotificationChain msgs = null;
      if (sleepTime != null)
        msgs = ((InternalEObject)sleepTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeviceDefinitionPackage.WORKER__SLEEP_TIME, null, msgs);
      if (newSleepTime != null)
        msgs = ((InternalEObject)newSleepTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeviceDefinitionPackage.WORKER__SLEEP_TIME, null, msgs);
      msgs = basicSetSleepTime(newSleepTime, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeviceDefinitionPackage.WORKER__SLEEP_TIME, newSleepTime, newSleepTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TimeUnit getTimeUnit()
  {
    return timeUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTimeUnit(TimeUnit newTimeUnit, NotificationChain msgs)
  {
    TimeUnit oldTimeUnit = timeUnit;
    timeUnit = newTimeUnit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeviceDefinitionPackage.WORKER__TIME_UNIT, oldTimeUnit, newTimeUnit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTimeUnit(TimeUnit newTimeUnit)
  {
    if (newTimeUnit != timeUnit)
    {
      NotificationChain msgs = null;
      if (timeUnit != null)
        msgs = ((InternalEObject)timeUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeviceDefinitionPackage.WORKER__TIME_UNIT, null, msgs);
      if (newTimeUnit != null)
        msgs = ((InternalEObject)newTimeUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeviceDefinitionPackage.WORKER__TIME_UNIT, null, msgs);
      msgs = basicSetTimeUnit(newTimeUnit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeviceDefinitionPackage.WORKER__TIME_UNIT, newTimeUnit, newTimeUnit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Integer> getErrorLed()
  {
    if (errorLed == null)
    {
      errorLed = new EDataTypeEList<Integer>(Integer.class, this, DeviceDefinitionPackage.WORKER__ERROR_LED);
    }
    return errorLed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Integer> getRetries()
  {
    if (retries == null)
    {
      retries = new EDataTypeEList<Integer>(Integer.class, this, DeviceDefinitionPackage.WORKER__RETRIES);
    }
    return retries;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<NumberPrimitive> getDelay()
  {
    if (delay == null)
    {
      delay = new EObjectContainmentEList<NumberPrimitive>(NumberPrimitive.class, this, DeviceDefinitionPackage.WORKER__DELAY);
    }
    return delay;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TimeUnit getDelayTimeUnit()
  {
    return delayTimeUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDelayTimeUnit(TimeUnit newDelayTimeUnit, NotificationChain msgs)
  {
    TimeUnit oldDelayTimeUnit = delayTimeUnit;
    delayTimeUnit = newDelayTimeUnit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeviceDefinitionPackage.WORKER__DELAY_TIME_UNIT, oldDelayTimeUnit, newDelayTimeUnit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDelayTimeUnit(TimeUnit newDelayTimeUnit)
  {
    if (newDelayTimeUnit != delayTimeUnit)
    {
      NotificationChain msgs = null;
      if (delayTimeUnit != null)
        msgs = ((InternalEObject)delayTimeUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeviceDefinitionPackage.WORKER__DELAY_TIME_UNIT, null, msgs);
      if (newDelayTimeUnit != null)
        msgs = ((InternalEObject)newDelayTimeUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeviceDefinitionPackage.WORKER__DELAY_TIME_UNIT, null, msgs);
      msgs = basicSetDelayTimeUnit(newDelayTimeUnit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeviceDefinitionPackage.WORKER__DELAY_TIME_UNIT, newDelayTimeUnit, newDelayTimeUnit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Device> getDevices()
  {
    if (devices == null)
    {
      devices = new EObjectContainmentEList<Device>(Device.class, this, DeviceDefinitionPackage.WORKER__DEVICES);
    }
    return devices;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DeviceDefinitionPackage.WORKER__SLEEP_TIME:
        return basicSetSleepTime(null, msgs);
      case DeviceDefinitionPackage.WORKER__TIME_UNIT:
        return basicSetTimeUnit(null, msgs);
      case DeviceDefinitionPackage.WORKER__DELAY:
        return ((InternalEList<?>)getDelay()).basicRemove(otherEnd, msgs);
      case DeviceDefinitionPackage.WORKER__DELAY_TIME_UNIT:
        return basicSetDelayTimeUnit(null, msgs);
      case DeviceDefinitionPackage.WORKER__DEVICES:
        return ((InternalEList<?>)getDevices()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DeviceDefinitionPackage.WORKER__NAME:
        return getName();
      case DeviceDefinitionPackage.WORKER__MAC:
        return getMac();
      case DeviceDefinitionPackage.WORKER__SLEEP_TIME:
        return getSleepTime();
      case DeviceDefinitionPackage.WORKER__TIME_UNIT:
        return getTimeUnit();
      case DeviceDefinitionPackage.WORKER__ERROR_LED:
        return getErrorLed();
      case DeviceDefinitionPackage.WORKER__RETRIES:
        return getRetries();
      case DeviceDefinitionPackage.WORKER__DELAY:
        return getDelay();
      case DeviceDefinitionPackage.WORKER__DELAY_TIME_UNIT:
        return getDelayTimeUnit();
      case DeviceDefinitionPackage.WORKER__DEVICES:
        return getDevices();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DeviceDefinitionPackage.WORKER__NAME:
        setName((String)newValue);
        return;
      case DeviceDefinitionPackage.WORKER__MAC:
        setMac((String)newValue);
        return;
      case DeviceDefinitionPackage.WORKER__SLEEP_TIME:
        setSleepTime((NumberPrimitive)newValue);
        return;
      case DeviceDefinitionPackage.WORKER__TIME_UNIT:
        setTimeUnit((TimeUnit)newValue);
        return;
      case DeviceDefinitionPackage.WORKER__ERROR_LED:
        getErrorLed().clear();
        getErrorLed().addAll((Collection<? extends Integer>)newValue);
        return;
      case DeviceDefinitionPackage.WORKER__RETRIES:
        getRetries().clear();
        getRetries().addAll((Collection<? extends Integer>)newValue);
        return;
      case DeviceDefinitionPackage.WORKER__DELAY:
        getDelay().clear();
        getDelay().addAll((Collection<? extends NumberPrimitive>)newValue);
        return;
      case DeviceDefinitionPackage.WORKER__DELAY_TIME_UNIT:
        setDelayTimeUnit((TimeUnit)newValue);
        return;
      case DeviceDefinitionPackage.WORKER__DEVICES:
        getDevices().clear();
        getDevices().addAll((Collection<? extends Device>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DeviceDefinitionPackage.WORKER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DeviceDefinitionPackage.WORKER__MAC:
        setMac(MAC_EDEFAULT);
        return;
      case DeviceDefinitionPackage.WORKER__SLEEP_TIME:
        setSleepTime((NumberPrimitive)null);
        return;
      case DeviceDefinitionPackage.WORKER__TIME_UNIT:
        setTimeUnit((TimeUnit)null);
        return;
      case DeviceDefinitionPackage.WORKER__ERROR_LED:
        getErrorLed().clear();
        return;
      case DeviceDefinitionPackage.WORKER__RETRIES:
        getRetries().clear();
        return;
      case DeviceDefinitionPackage.WORKER__DELAY:
        getDelay().clear();
        return;
      case DeviceDefinitionPackage.WORKER__DELAY_TIME_UNIT:
        setDelayTimeUnit((TimeUnit)null);
        return;
      case DeviceDefinitionPackage.WORKER__DEVICES:
        getDevices().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DeviceDefinitionPackage.WORKER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DeviceDefinitionPackage.WORKER__MAC:
        return MAC_EDEFAULT == null ? mac != null : !MAC_EDEFAULT.equals(mac);
      case DeviceDefinitionPackage.WORKER__SLEEP_TIME:
        return sleepTime != null;
      case DeviceDefinitionPackage.WORKER__TIME_UNIT:
        return timeUnit != null;
      case DeviceDefinitionPackage.WORKER__ERROR_LED:
        return errorLed != null && !errorLed.isEmpty();
      case DeviceDefinitionPackage.WORKER__RETRIES:
        return retries != null && !retries.isEmpty();
      case DeviceDefinitionPackage.WORKER__DELAY:
        return delay != null && !delay.isEmpty();
      case DeviceDefinitionPackage.WORKER__DELAY_TIME_UNIT:
        return delayTimeUnit != null;
      case DeviceDefinitionPackage.WORKER__DEVICES:
        return devices != null && !devices.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", mac: ");
    result.append(mac);
    result.append(", errorLed: ");
    result.append(errorLed);
    result.append(", retries: ");
    result.append(retries);
    result.append(')');
    return result.toString();
  }

} //WorkerImpl
