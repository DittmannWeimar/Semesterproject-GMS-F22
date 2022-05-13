/**
 * generated by Xtext 2.26.0
 */
package dk.sdu.gms.dds.deviceDefinition.impl;

import dk.sdu.gms.dds.deviceDefinition.ADC;
import dk.sdu.gms.dds.deviceDefinition.Actuator;
import dk.sdu.gms.dds.deviceDefinition.And;
import dk.sdu.gms.dds.deviceDefinition.Binding;
import dk.sdu.gms.dds.deviceDefinition.BooleanFalse;
import dk.sdu.gms.dds.deviceDefinition.BooleanTrue;
import dk.sdu.gms.dds.deviceDefinition.Color;
import dk.sdu.gms.dds.deviceDefinition.ColorPreset;
import dk.sdu.gms.dds.deviceDefinition.DAC;
import dk.sdu.gms.dds.deviceDefinition.DecimalPrimitive;
import dk.sdu.gms.dds.deviceDefinition.Device;
import dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionFactory;
import dk.sdu.gms.dds.deviceDefinition.DeviceDefinitionPackage;
import dk.sdu.gms.dds.deviceDefinition.Div;
import dk.sdu.gms.dds.deviceDefinition.Equals;
import dk.sdu.gms.dds.deviceDefinition.Expression;
import dk.sdu.gms.dds.deviceDefinition.ExternalCall;
import dk.sdu.gms.dds.deviceDefinition.ExternalVariableUse;
import dk.sdu.gms.dds.deviceDefinition.Gateway;
import dk.sdu.gms.dds.deviceDefinition.GenericIn;
import dk.sdu.gms.dds.deviceDefinition.GenericOut;
import dk.sdu.gms.dds.deviceDefinition.Graph;
import dk.sdu.gms.dds.deviceDefinition.GraphLine;
import dk.sdu.gms.dds.deviceDefinition.GraphVariableUse;
import dk.sdu.gms.dds.deviceDefinition.Greater;
import dk.sdu.gms.dds.deviceDefinition.GreaterOrEquals;
import dk.sdu.gms.dds.deviceDefinition.Hour;
import dk.sdu.gms.dds.deviceDefinition.IntPrimitive;
import dk.sdu.gms.dds.deviceDefinition.InternalVariableUse;
import dk.sdu.gms.dds.deviceDefinition.Lesser;
import dk.sdu.gms.dds.deviceDefinition.LesserOrEquals;
import dk.sdu.gms.dds.deviceDefinition.Millisecond;
import dk.sdu.gms.dds.deviceDefinition.Minus;
import dk.sdu.gms.dds.deviceDefinition.Minute;
import dk.sdu.gms.dds.deviceDefinition.Mult;
import dk.sdu.gms.dds.deviceDefinition.NotEquals;
import dk.sdu.gms.dds.deviceDefinition.NumberPrimitive;
import dk.sdu.gms.dds.deviceDefinition.OnOff;
import dk.sdu.gms.dds.deviceDefinition.Or;
import dk.sdu.gms.dds.deviceDefinition.Parenthesis;
import dk.sdu.gms.dds.deviceDefinition.Pin;
import dk.sdu.gms.dds.deviceDefinition.PinType;
import dk.sdu.gms.dds.deviceDefinition.Plus;
import dk.sdu.gms.dds.deviceDefinition.Preset;
import dk.sdu.gms.dds.deviceDefinition.Primitive;
import dk.sdu.gms.dds.deviceDefinition.RGB;
import dk.sdu.gms.dds.deviceDefinition.Random;
import dk.sdu.gms.dds.deviceDefinition.Second;
import dk.sdu.gms.dds.deviceDefinition.Sensor;
import dk.sdu.gms.dds.deviceDefinition.SensorOutput;
import dk.sdu.gms.dds.deviceDefinition.Setting;
import dk.sdu.gms.dds.deviceDefinition.TimeUnit;
import dk.sdu.gms.dds.deviceDefinition.Trigger;
import dk.sdu.gms.dds.deviceDefinition.Value;
import dk.sdu.gms.dds.deviceDefinition.VariableUse;
import dk.sdu.gms.dds.deviceDefinition.When;
import dk.sdu.gms.dds.deviceDefinition.Worker;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeviceDefinitionFactoryImpl extends EFactoryImpl implements DeviceDefinitionFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DeviceDefinitionFactory init()
  {
    try
    {
      DeviceDefinitionFactory theDeviceDefinitionFactory = (DeviceDefinitionFactory)EPackage.Registry.INSTANCE.getEFactory(DeviceDefinitionPackage.eNS_URI);
      if (theDeviceDefinitionFactory != null)
      {
        return theDeviceDefinitionFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DeviceDefinitionFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeviceDefinitionFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DeviceDefinitionPackage.SYSTEM: return createSystem();
      case DeviceDefinitionPackage.GRAPH: return createGraph();
      case DeviceDefinitionPackage.GRAPH_LINE: return createGraphLine();
      case DeviceDefinitionPackage.COLOR: return createColor();
      case DeviceDefinitionPackage.GATEWAY: return createGateway();
      case DeviceDefinitionPackage.WORKER: return createWorker();
      case DeviceDefinitionPackage.DEVICE: return createDevice();
      case DeviceDefinitionPackage.SENSOR: return createSensor();
      case DeviceDefinitionPackage.PIN: return createPin();
      case DeviceDefinitionPackage.PIN_TYPE: return createPinType();
      case DeviceDefinitionPackage.TIME_UNIT: return createTimeUnit();
      case DeviceDefinitionPackage.BINDING: return createBinding();
      case DeviceDefinitionPackage.SENSOR_OUTPUT: return createSensorOutput();
      case DeviceDefinitionPackage.ACTUATOR: return createActuator();
      case DeviceDefinitionPackage.TRIGGER: return createTrigger();
      case DeviceDefinitionPackage.SETTING: return createSetting();
      case DeviceDefinitionPackage.PRIMITIVE: return createPrimitive();
      case DeviceDefinitionPackage.NUMBER_PRIMITIVE: return createNumberPrimitive();
      case DeviceDefinitionPackage.EXPRESSION: return createExpression();
      case DeviceDefinitionPackage.EXTERNAL_CALL: return createExternalCall();
      case DeviceDefinitionPackage.INTERNAL_VARIABLE_USE: return createInternalVariableUse();
      case DeviceDefinitionPackage.EXTERNAL_VARIABLE_USE: return createExternalVariableUse();
      case DeviceDefinitionPackage.GRAPH_VARIABLE_USE: return createGraphVariableUse();
      case DeviceDefinitionPackage.VARIABLE_USE: return createVariableUse();
      case DeviceDefinitionPackage.PARENTHESIS: return createParenthesis();
      case DeviceDefinitionPackage.RGB: return createRGB();
      case DeviceDefinitionPackage.PRESET: return createPreset();
      case DeviceDefinitionPackage.RANDOM: return createRandom();
      case DeviceDefinitionPackage.ADC: return createADC();
      case DeviceDefinitionPackage.DAC: return createDAC();
      case DeviceDefinitionPackage.GENERIC_IN: return createGenericIn();
      case DeviceDefinitionPackage.GENERIC_OUT: return createGenericOut();
      case DeviceDefinitionPackage.MILLISECOND: return createMillisecond();
      case DeviceDefinitionPackage.SECOND: return createSecond();
      case DeviceDefinitionPackage.MINUTE: return createMinute();
      case DeviceDefinitionPackage.HOUR: return createHour();
      case DeviceDefinitionPackage.WHEN: return createWhen();
      case DeviceDefinitionPackage.ON_OFF: return createOnOff();
      case DeviceDefinitionPackage.BOOLEAN_TRUE: return createBooleanTrue();
      case DeviceDefinitionPackage.BOOLEAN_FALSE: return createBooleanFalse();
      case DeviceDefinitionPackage.INT_PRIMITIVE: return createIntPrimitive();
      case DeviceDefinitionPackage.DECIMAL_PRIMITIVE: return createDecimalPrimitive();
      case DeviceDefinitionPackage.PLUS: return createPlus();
      case DeviceDefinitionPackage.MINUS: return createMinus();
      case DeviceDefinitionPackage.MULT: return createMult();
      case DeviceDefinitionPackage.DIV: return createDiv();
      case DeviceDefinitionPackage.GREATER: return createGreater();
      case DeviceDefinitionPackage.LESSER: return createLesser();
      case DeviceDefinitionPackage.GREATER_OR_EQUALS: return createGreaterOrEquals();
      case DeviceDefinitionPackage.LESSER_OR_EQUALS: return createLesserOrEquals();
      case DeviceDefinitionPackage.EQUALS: return createEquals();
      case DeviceDefinitionPackage.NOT_EQUALS: return createNotEquals();
      case DeviceDefinitionPackage.AND: return createAnd();
      case DeviceDefinitionPackage.OR: return createOr();
      case DeviceDefinitionPackage.VALUE: return createValue();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case DeviceDefinitionPackage.COLOR_PRESET:
        return createColorPresetFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case DeviceDefinitionPackage.COLOR_PRESET:
        return convertColorPresetToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public dk.sdu.gms.dds.deviceDefinition.System createSystem()
  {
    SystemImpl system = new SystemImpl();
    return system;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Graph createGraph()
  {
    GraphImpl graph = new GraphImpl();
    return graph;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GraphLine createGraphLine()
  {
    GraphLineImpl graphLine = new GraphLineImpl();
    return graphLine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Color createColor()
  {
    ColorImpl color = new ColorImpl();
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Gateway createGateway()
  {
    GatewayImpl gateway = new GatewayImpl();
    return gateway;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Worker createWorker()
  {
    WorkerImpl worker = new WorkerImpl();
    return worker;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Device createDevice()
  {
    DeviceImpl device = new DeviceImpl();
    return device;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Sensor createSensor()
  {
    SensorImpl sensor = new SensorImpl();
    return sensor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Pin createPin()
  {
    PinImpl pin = new PinImpl();
    return pin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PinType createPinType()
  {
    PinTypeImpl pinType = new PinTypeImpl();
    return pinType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TimeUnit createTimeUnit()
  {
    TimeUnitImpl timeUnit = new TimeUnitImpl();
    return timeUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Binding createBinding()
  {
    BindingImpl binding = new BindingImpl();
    return binding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SensorOutput createSensorOutput()
  {
    SensorOutputImpl sensorOutput = new SensorOutputImpl();
    return sensorOutput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Actuator createActuator()
  {
    ActuatorImpl actuator = new ActuatorImpl();
    return actuator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Trigger createTrigger()
  {
    TriggerImpl trigger = new TriggerImpl();
    return trigger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Setting createSetting()
  {
    SettingImpl setting = new SettingImpl();
    return setting;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Primitive createPrimitive()
  {
    PrimitiveImpl primitive = new PrimitiveImpl();
    return primitive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NumberPrimitive createNumberPrimitive()
  {
    NumberPrimitiveImpl numberPrimitive = new NumberPrimitiveImpl();
    return numberPrimitive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExternalCall createExternalCall()
  {
    ExternalCallImpl externalCall = new ExternalCallImpl();
    return externalCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InternalVariableUse createInternalVariableUse()
  {
    InternalVariableUseImpl internalVariableUse = new InternalVariableUseImpl();
    return internalVariableUse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExternalVariableUse createExternalVariableUse()
  {
    ExternalVariableUseImpl externalVariableUse = new ExternalVariableUseImpl();
    return externalVariableUse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GraphVariableUse createGraphVariableUse()
  {
    GraphVariableUseImpl graphVariableUse = new GraphVariableUseImpl();
    return graphVariableUse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VariableUse createVariableUse()
  {
    VariableUseImpl variableUse = new VariableUseImpl();
    return variableUse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Parenthesis createParenthesis()
  {
    ParenthesisImpl parenthesis = new ParenthesisImpl();
    return parenthesis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RGB createRGB()
  {
    RGBImpl rgb = new RGBImpl();
    return rgb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Preset createPreset()
  {
    PresetImpl preset = new PresetImpl();
    return preset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Random createRandom()
  {
    RandomImpl random = new RandomImpl();
    return random;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ADC createADC()
  {
    ADCImpl adc = new ADCImpl();
    return adc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DAC createDAC()
  {
    DACImpl dac = new DACImpl();
    return dac;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GenericIn createGenericIn()
  {
    GenericInImpl genericIn = new GenericInImpl();
    return genericIn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GenericOut createGenericOut()
  {
    GenericOutImpl genericOut = new GenericOutImpl();
    return genericOut;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Millisecond createMillisecond()
  {
    MillisecondImpl millisecond = new MillisecondImpl();
    return millisecond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Second createSecond()
  {
    SecondImpl second = new SecondImpl();
    return second;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Minute createMinute()
  {
    MinuteImpl minute = new MinuteImpl();
    return minute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Hour createHour()
  {
    HourImpl hour = new HourImpl();
    return hour;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public When createWhen()
  {
    WhenImpl when = new WhenImpl();
    return when;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OnOff createOnOff()
  {
    OnOffImpl onOff = new OnOffImpl();
    return onOff;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BooleanTrue createBooleanTrue()
  {
    BooleanTrueImpl booleanTrue = new BooleanTrueImpl();
    return booleanTrue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BooleanFalse createBooleanFalse()
  {
    BooleanFalseImpl booleanFalse = new BooleanFalseImpl();
    return booleanFalse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IntPrimitive createIntPrimitive()
  {
    IntPrimitiveImpl intPrimitive = new IntPrimitiveImpl();
    return intPrimitive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DecimalPrimitive createDecimalPrimitive()
  {
    DecimalPrimitiveImpl decimalPrimitive = new DecimalPrimitiveImpl();
    return decimalPrimitive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Mult createMult()
  {
    MultImpl mult = new MultImpl();
    return mult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Div createDiv()
  {
    DivImpl div = new DivImpl();
    return div;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Greater createGreater()
  {
    GreaterImpl greater = new GreaterImpl();
    return greater;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Lesser createLesser()
  {
    LesserImpl lesser = new LesserImpl();
    return lesser;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GreaterOrEquals createGreaterOrEquals()
  {
    GreaterOrEqualsImpl greaterOrEquals = new GreaterOrEqualsImpl();
    return greaterOrEquals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LesserOrEquals createLesserOrEquals()
  {
    LesserOrEqualsImpl lesserOrEquals = new LesserOrEqualsImpl();
    return lesserOrEquals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Equals createEquals()
  {
    EqualsImpl equals = new EqualsImpl();
    return equals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotEquals createNotEquals()
  {
    NotEqualsImpl notEquals = new NotEqualsImpl();
    return notEquals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public And createAnd()
  {
    AndImpl and = new AndImpl();
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Or createOr()
  {
    OrImpl or = new OrImpl();
    return or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorPreset createColorPresetFromString(EDataType eDataType, String initialValue)
  {
    ColorPreset result = ColorPreset.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertColorPresetToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DeviceDefinitionPackage getDeviceDefinitionPackage()
  {
    return (DeviceDefinitionPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DeviceDefinitionPackage getPackage()
  {
    return DeviceDefinitionPackage.eINSTANCE;
  }

} //DeviceDefinitionFactoryImpl
