/**
 * generated by Xtext 2.26.0
 */
package dk.sdu.gms.dds.deviceDefinition.impl;

import dk.sdu.gms.dds.deviceDefinition.Color;
import dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionPackage;
import dk.sdu.gms.dds.deviceDefinition.Expression;
import dk.sdu.gms.dds.deviceDefinition.GraphLine;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.gms.dds.deviceDefinition.impl.GraphLineImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link dk.sdu.gms.dds.deviceDefinition.impl.GraphLineImpl#getLegend <em>Legend</em>}</li>
 *   <li>{@link dk.sdu.gms.dds.deviceDefinition.impl.GraphLineImpl#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphLineImpl extends MinimalEObjectImpl.Container implements GraphLine
{
  /**
   * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutput()
   * @generated
   * @ordered
   */
  protected Expression output;

  /**
   * The default value of the '{@link #getLegend() <em>Legend</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLegend()
   * @generated
   * @ordered
   */
  protected static final String LEGEND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLegend() <em>Legend</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLegend()
   * @generated
   * @ordered
   */
  protected String legend = LEGEND_EDEFAULT;

  /**
   * The cached value of the '{@link #getColor() <em>Color</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColor()
   * @generated
   * @ordered
   */
  protected Color color;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GraphLineImpl()
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
    return DeviceDefinitionPackage.Literals.GRAPH_LINE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getOutput()
  {
    return output;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOutput(Expression newOutput, NotificationChain msgs)
  {
    Expression oldOutput = output;
    output = newOutput;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeviceDefinitionPackage.GRAPH_LINE__OUTPUT, oldOutput, newOutput);
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
  public void setOutput(Expression newOutput)
  {
    if (newOutput != output)
    {
      NotificationChain msgs = null;
      if (output != null)
        msgs = ((InternalEObject)output).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeviceDefinitionPackage.GRAPH_LINE__OUTPUT, null, msgs);
      if (newOutput != null)
        msgs = ((InternalEObject)newOutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeviceDefinitionPackage.GRAPH_LINE__OUTPUT, null, msgs);
      msgs = basicSetOutput(newOutput, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeviceDefinitionPackage.GRAPH_LINE__OUTPUT, newOutput, newOutput));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLegend()
  {
    return legend;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLegend(String newLegend)
  {
    String oldLegend = legend;
    legend = newLegend;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeviceDefinitionPackage.GRAPH_LINE__LEGEND, oldLegend, legend));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Color getColor()
  {
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetColor(Color newColor, NotificationChain msgs)
  {
    Color oldColor = color;
    color = newColor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeviceDefinitionPackage.GRAPH_LINE__COLOR, oldColor, newColor);
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
  public void setColor(Color newColor)
  {
    if (newColor != color)
    {
      NotificationChain msgs = null;
      if (color != null)
        msgs = ((InternalEObject)color).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeviceDefinitionPackage.GRAPH_LINE__COLOR, null, msgs);
      if (newColor != null)
        msgs = ((InternalEObject)newColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeviceDefinitionPackage.GRAPH_LINE__COLOR, null, msgs);
      msgs = basicSetColor(newColor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeviceDefinitionPackage.GRAPH_LINE__COLOR, newColor, newColor));
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
      case DeviceDefinitionPackage.GRAPH_LINE__OUTPUT:
        return basicSetOutput(null, msgs);
      case DeviceDefinitionPackage.GRAPH_LINE__COLOR:
        return basicSetColor(null, msgs);
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
      case DeviceDefinitionPackage.GRAPH_LINE__OUTPUT:
        return getOutput();
      case DeviceDefinitionPackage.GRAPH_LINE__LEGEND:
        return getLegend();
      case DeviceDefinitionPackage.GRAPH_LINE__COLOR:
        return getColor();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DeviceDefinitionPackage.GRAPH_LINE__OUTPUT:
        setOutput((Expression)newValue);
        return;
      case DeviceDefinitionPackage.GRAPH_LINE__LEGEND:
        setLegend((String)newValue);
        return;
      case DeviceDefinitionPackage.GRAPH_LINE__COLOR:
        setColor((Color)newValue);
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
      case DeviceDefinitionPackage.GRAPH_LINE__OUTPUT:
        setOutput((Expression)null);
        return;
      case DeviceDefinitionPackage.GRAPH_LINE__LEGEND:
        setLegend(LEGEND_EDEFAULT);
        return;
      case DeviceDefinitionPackage.GRAPH_LINE__COLOR:
        setColor((Color)null);
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
      case DeviceDefinitionPackage.GRAPH_LINE__OUTPUT:
        return output != null;
      case DeviceDefinitionPackage.GRAPH_LINE__LEGEND:
        return LEGEND_EDEFAULT == null ? legend != null : !LEGEND_EDEFAULT.equals(legend);
      case DeviceDefinitionPackage.GRAPH_LINE__COLOR:
        return color != null;
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
    result.append(" (legend: ");
    result.append(legend);
    result.append(')');
    return result.toString();
  }

} //GraphLineImpl