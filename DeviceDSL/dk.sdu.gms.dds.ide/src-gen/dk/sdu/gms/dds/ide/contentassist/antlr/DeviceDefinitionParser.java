/*
 * generated by Xtext 2.26.0
 */
package dk.sdu.gms.dds.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import dk.sdu.gms.dds.ide.contentassist.antlr.internal.InternalDeviceDefinitionParser;
import dk.sdu.gms.dds.services.DeviceDefinitionGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class DeviceDefinitionParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(DeviceDefinitionGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, DeviceDefinitionGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getColorAccess().getAlternatives(), "rule__Color__Alternatives");
			builder.put(grammarAccess.getDeviceAccess().getAlternatives(), "rule__Device__Alternatives");
			builder.put(grammarAccess.getPinTypeAccess().getAlternatives(), "rule__PinType__Alternatives");
			builder.put(grammarAccess.getTimeUnitAccess().getAlternatives(), "rule__TimeUnit__Alternatives");
			builder.put(grammarAccess.getTimeUnitAccess().getAlternatives_0_1(), "rule__TimeUnit__Alternatives_0_1");
			builder.put(grammarAccess.getTimeUnitAccess().getAlternatives_1_1(), "rule__TimeUnit__Alternatives_1_1");
			builder.put(grammarAccess.getTimeUnitAccess().getAlternatives_2_1(), "rule__TimeUnit__Alternatives_2_1");
			builder.put(grammarAccess.getTimeUnitAccess().getAlternatives_3_1(), "rule__TimeUnit__Alternatives_3_1");
			builder.put(grammarAccess.getBindingAccess().getAlternatives(), "rule__Binding__Alternatives");
			builder.put(grammarAccess.getTriggerAccess().getAlternatives(), "rule__Trigger__Alternatives");
			builder.put(grammarAccess.getTriggerAccess().getAlternatives_1_3(), "rule__Trigger__Alternatives_1_3");
			builder.put(grammarAccess.getPrimitiveAccess().getAlternatives(), "rule__Primitive__Alternatives");
			builder.put(grammarAccess.getNumberPrimitiveAccess().getAlternatives(), "rule__NumberPrimitive__Alternatives");
			builder.put(grammarAccess.getExpAccess().getAlternatives_1_0(), "rule__Exp__Alternatives_1_0");
			builder.put(grammarAccess.getFactorAccess().getAlternatives_1_0(), "rule__Factor__Alternatives_1_0");
			builder.put(grammarAccess.getCompareAccess().getAlternatives_1_0(), "rule__Compare__Alternatives_1_0");
			builder.put(grammarAccess.getCompareOrEqualsAccess().getAlternatives_1_0(), "rule__CompareOrEquals__Alternatives_1_0");
			builder.put(grammarAccess.getEqualsOrNotEqualsAccess().getAlternatives_1_0(), "rule__EqualsOrNotEquals__Alternatives_1_0");
			builder.put(grammarAccess.getAndOrAccess().getAlternatives_1_0(), "rule__AndOr__Alternatives_1_0");
			builder.put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
			builder.put(grammarAccess.getExternalVariableUseAccess().getAlternatives_1(), "rule__ExternalVariableUse__Alternatives_1");
			builder.put(grammarAccess.getGraphVariableUseAccess().getAlternatives_1(), "rule__GraphVariableUse__Alternatives_1");
			builder.put(grammarAccess.getGraphVariableUseAccess().getAlternatives_3(), "rule__GraphVariableUse__Alternatives_3");
			builder.put(grammarAccess.getVariableUseAccess().getAlternatives(), "rule__VariableUse__Alternatives");
			builder.put(grammarAccess.getColorPresetAccess().getAlternatives(), "rule__ColorPreset__Alternatives");
			builder.put(grammarAccess.getSystemAccess().getGroup(), "rule__System__Group__0");
			builder.put(grammarAccess.getSystemAccess().getGroup_5(), "rule__System__Group_5__0");
			builder.put(grammarAccess.getSystemAccess().getGroup_8(), "rule__System__Group_8__0");
			builder.put(grammarAccess.getGraphAccess().getGroup(), "rule__Graph__Group__0");
			builder.put(grammarAccess.getGraphLineAccess().getGroup(), "rule__GraphLine__Group__0");
			builder.put(grammarAccess.getGraphLineAccess().getGroup_2(), "rule__GraphLine__Group_2__0");
			builder.put(grammarAccess.getGraphLineAccess().getGroup_3(), "rule__GraphLine__Group_3__0");
			builder.put(grammarAccess.getColorAccess().getGroup_0(), "rule__Color__Group_0__0");
			builder.put(grammarAccess.getColorAccess().getGroup_1(), "rule__Color__Group_1__0");
			builder.put(grammarAccess.getColorAccess().getGroup_2(), "rule__Color__Group_2__0");
			builder.put(grammarAccess.getGatewayAccess().getGroup(), "rule__Gateway__Group__0");
			builder.put(grammarAccess.getGatewayAccess().getGroup_7(), "rule__Gateway__Group_7__0");
			builder.put(grammarAccess.getGatewayAccess().getGroup_8(), "rule__Gateway__Group_8__0");
			builder.put(grammarAccess.getWorkerAccess().getGroup(), "rule__Worker__Group__0");
			builder.put(grammarAccess.getWorkerAccess().getGroup_9(), "rule__Worker__Group_9__0");
			builder.put(grammarAccess.getWorkerAccess().getGroup_10(), "rule__Worker__Group_10__0");
			builder.put(grammarAccess.getSensorAccess().getGroup(), "rule__Sensor__Group__0");
			builder.put(grammarAccess.getSensorAccess().getGroup_4(), "rule__Sensor__Group_4__0");
			builder.put(grammarAccess.getSensorAccess().getGroup_4_2(), "rule__Sensor__Group_4_2__0");
			builder.put(grammarAccess.getSensorAccess().getGroup_7(), "rule__Sensor__Group_7__0");
			builder.put(grammarAccess.getPinAccess().getGroup(), "rule__Pin__Group__0");
			builder.put(grammarAccess.getPinTypeAccess().getGroup_0(), "rule__PinType__Group_0__0");
			builder.put(grammarAccess.getPinTypeAccess().getGroup_1(), "rule__PinType__Group_1__0");
			builder.put(grammarAccess.getPinTypeAccess().getGroup_2(), "rule__PinType__Group_2__0");
			builder.put(grammarAccess.getPinTypeAccess().getGroup_3(), "rule__PinType__Group_3__0");
			builder.put(grammarAccess.getTimeUnitAccess().getGroup_0(), "rule__TimeUnit__Group_0__0");
			builder.put(grammarAccess.getTimeUnitAccess().getGroup_1(), "rule__TimeUnit__Group_1__0");
			builder.put(grammarAccess.getTimeUnitAccess().getGroup_2(), "rule__TimeUnit__Group_2__0");
			builder.put(grammarAccess.getTimeUnitAccess().getGroup_3(), "rule__TimeUnit__Group_3__0");
			builder.put(grammarAccess.getSensorOutputAccess().getGroup(), "rule__SensorOutput__Group__0");
			builder.put(grammarAccess.getSensorOutputAccess().getGroup_4(), "rule__SensorOutput__Group_4__0");
			builder.put(grammarAccess.getActuatorAccess().getGroup(), "rule__Actuator__Group__0");
			builder.put(grammarAccess.getActuatorAccess().getGroup_6(), "rule__Actuator__Group_6__0");
			builder.put(grammarAccess.getTriggerAccess().getGroup_0(), "rule__Trigger__Group_0__0");
			builder.put(grammarAccess.getTriggerAccess().getGroup_1(), "rule__Trigger__Group_1__0");
			builder.put(grammarAccess.getTriggerAccess().getGroup_1_3_0(), "rule__Trigger__Group_1_3_0__0");
			builder.put(grammarAccess.getTriggerAccess().getGroup_1_3_1(), "rule__Trigger__Group_1_3_1__0");
			builder.put(grammarAccess.getSettingAccess().getGroup(), "rule__Setting__Group__0");
			builder.put(grammarAccess.getPrimitiveAccess().getGroup_0(), "rule__Primitive__Group_0__0");
			builder.put(grammarAccess.getPrimitiveAccess().getGroup_1(), "rule__Primitive__Group_1__0");
			builder.put(grammarAccess.getNumberPrimitiveAccess().getGroup_0(), "rule__NumberPrimitive__Group_0__0");
			builder.put(grammarAccess.getNumberPrimitiveAccess().getGroup_1(), "rule__NumberPrimitive__Group_1__0");
			builder.put(grammarAccess.getExpAccess().getGroup(), "rule__Exp__Group__0");
			builder.put(grammarAccess.getExpAccess().getGroup_1(), "rule__Exp__Group_1__0");
			builder.put(grammarAccess.getExpAccess().getGroup_1_0_0(), "rule__Exp__Group_1_0_0__0");
			builder.put(grammarAccess.getExpAccess().getGroup_1_0_1(), "rule__Exp__Group_1_0_1__0");
			builder.put(grammarAccess.getFactorAccess().getGroup(), "rule__Factor__Group__0");
			builder.put(grammarAccess.getFactorAccess().getGroup_1(), "rule__Factor__Group_1__0");
			builder.put(grammarAccess.getFactorAccess().getGroup_1_0_0(), "rule__Factor__Group_1_0_0__0");
			builder.put(grammarAccess.getFactorAccess().getGroup_1_0_1(), "rule__Factor__Group_1_0_1__0");
			builder.put(grammarAccess.getCompareAccess().getGroup(), "rule__Compare__Group__0");
			builder.put(grammarAccess.getCompareAccess().getGroup_1(), "rule__Compare__Group_1__0");
			builder.put(grammarAccess.getCompareAccess().getGroup_1_0_0(), "rule__Compare__Group_1_0_0__0");
			builder.put(grammarAccess.getCompareAccess().getGroup_1_0_1(), "rule__Compare__Group_1_0_1__0");
			builder.put(grammarAccess.getCompareOrEqualsAccess().getGroup(), "rule__CompareOrEquals__Group__0");
			builder.put(grammarAccess.getCompareOrEqualsAccess().getGroup_1(), "rule__CompareOrEquals__Group_1__0");
			builder.put(grammarAccess.getCompareOrEqualsAccess().getGroup_1_0_0(), "rule__CompareOrEquals__Group_1_0_0__0");
			builder.put(grammarAccess.getCompareOrEqualsAccess().getGroup_1_0_1(), "rule__CompareOrEquals__Group_1_0_1__0");
			builder.put(grammarAccess.getEqualsOrNotEqualsAccess().getGroup(), "rule__EqualsOrNotEquals__Group__0");
			builder.put(grammarAccess.getEqualsOrNotEqualsAccess().getGroup_1(), "rule__EqualsOrNotEquals__Group_1__0");
			builder.put(grammarAccess.getEqualsOrNotEqualsAccess().getGroup_1_0_0(), "rule__EqualsOrNotEquals__Group_1_0_0__0");
			builder.put(grammarAccess.getEqualsOrNotEqualsAccess().getGroup_1_0_1(), "rule__EqualsOrNotEquals__Group_1_0_1__0");
			builder.put(grammarAccess.getAndOrAccess().getGroup(), "rule__AndOr__Group__0");
			builder.put(grammarAccess.getAndOrAccess().getGroup_1(), "rule__AndOr__Group_1__0");
			builder.put(grammarAccess.getAndOrAccess().getGroup_1_0_0(), "rule__AndOr__Group_1_0_0__0");
			builder.put(grammarAccess.getAndOrAccess().getGroup_1_0_1(), "rule__AndOr__Group_1_0_1__0");
			builder.put(grammarAccess.getPrimaryAccess().getGroup_4(), "rule__Primary__Group_4__0");
			builder.put(grammarAccess.getExternalCallAccess().getGroup(), "rule__ExternalCall__Group__0");
			builder.put(grammarAccess.getExternalCallAccess().getGroup_4(), "rule__ExternalCall__Group_4__0");
			builder.put(grammarAccess.getExternalVariableUseAccess().getGroup(), "rule__ExternalVariableUse__Group__0");
			builder.put(grammarAccess.getGraphVariableUseAccess().getGroup(), "rule__GraphVariableUse__Group__0");
			builder.put(grammarAccess.getParenthesisAccess().getGroup(), "rule__Parenthesis__Group__0");
			builder.put(grammarAccess.getSystemAccess().getNameAssignment_1(), "rule__System__NameAssignment_1");
			builder.put(grammarAccess.getSystemAccess().getWifiSsidAssignment_4(), "rule__System__WifiSsidAssignment_4");
			builder.put(grammarAccess.getSystemAccess().getWifiPasswordAssignment_5_2(), "rule__System__WifiPasswordAssignment_5_2");
			builder.put(grammarAccess.getSystemAccess().getMqttHostAssignment_7(), "rule__System__MqttHostAssignment_7");
			builder.put(grammarAccess.getSystemAccess().getMqttUsernameAssignment_8_2(), "rule__System__MqttUsernameAssignment_8_2");
			builder.put(grammarAccess.getSystemAccess().getMqttPasswordAssignment_8_5(), "rule__System__MqttPasswordAssignment_8_5");
			builder.put(grammarAccess.getSystemAccess().getGatewayAssignment_9(), "rule__System__GatewayAssignment_9");
			builder.put(grammarAccess.getSystemAccess().getGraphsAssignment_10(), "rule__System__GraphsAssignment_10");
			builder.put(grammarAccess.getGraphAccess().getCategoryAssignment_3(), "rule__Graph__CategoryAssignment_3");
			builder.put(grammarAccess.getGraphAccess().getTitleAssignment_5(), "rule__Graph__TitleAssignment_5");
			builder.put(grammarAccess.getGraphAccess().getXlabelAssignment_7(), "rule__Graph__XlabelAssignment_7");
			builder.put(grammarAccess.getGraphAccess().getYlabelAssignment_9(), "rule__Graph__YlabelAssignment_9");
			builder.put(grammarAccess.getGraphAccess().getLinesAssignment_10(), "rule__Graph__LinesAssignment_10");
			builder.put(grammarAccess.getGraphLineAccess().getOutputAssignment_1(), "rule__GraphLine__OutputAssignment_1");
			builder.put(grammarAccess.getGraphLineAccess().getLegendAssignment_2_1(), "rule__GraphLine__LegendAssignment_2_1");
			builder.put(grammarAccess.getGraphLineAccess().getColorAssignment_3_1(), "rule__GraphLine__ColorAssignment_3_1");
			builder.put(grammarAccess.getColorAccess().getRedAssignment_0_2(), "rule__Color__RedAssignment_0_2");
			builder.put(grammarAccess.getColorAccess().getGreenAssignment_0_4(), "rule__Color__GreenAssignment_0_4");
			builder.put(grammarAccess.getColorAccess().getBlueAssignment_0_6(), "rule__Color__BlueAssignment_0_6");
			builder.put(grammarAccess.getColorAccess().getPresetAssignment_1_1(), "rule__Color__PresetAssignment_1_1");
			builder.put(grammarAccess.getGatewayAccess().getNameAssignment_1(), "rule__Gateway__NameAssignment_1");
			builder.put(grammarAccess.getGatewayAccess().getMacAssignment_4(), "rule__Gateway__MacAssignment_4");
			builder.put(grammarAccess.getGatewayAccess().getChannelAssignment_6(), "rule__Gateway__ChannelAssignment_6");
			builder.put(grammarAccess.getGatewayAccess().getErrorLedAssignment_7_2(), "rule__Gateway__ErrorLedAssignment_7_2");
			builder.put(grammarAccess.getGatewayAccess().getRetriesAssignment_8_1(), "rule__Gateway__RetriesAssignment_8_1");
			builder.put(grammarAccess.getGatewayAccess().getDelayAssignment_8_4(), "rule__Gateway__DelayAssignment_8_4");
			builder.put(grammarAccess.getGatewayAccess().getDelayTimeUnitAssignment_8_5(), "rule__Gateway__DelayTimeUnitAssignment_8_5");
			builder.put(grammarAccess.getGatewayAccess().getWorkersAssignment_9(), "rule__Gateway__WorkersAssignment_9");
			builder.put(grammarAccess.getWorkerAccess().getNameAssignment_1(), "rule__Worker__NameAssignment_1");
			builder.put(grammarAccess.getWorkerAccess().getMacAssignment_4(), "rule__Worker__MacAssignment_4");
			builder.put(grammarAccess.getWorkerAccess().getSleepTimeAssignment_7(), "rule__Worker__SleepTimeAssignment_7");
			builder.put(grammarAccess.getWorkerAccess().getTimeUnitAssignment_8(), "rule__Worker__TimeUnitAssignment_8");
			builder.put(grammarAccess.getWorkerAccess().getErrorLedAssignment_9_2(), "rule__Worker__ErrorLedAssignment_9_2");
			builder.put(grammarAccess.getWorkerAccess().getRetriesAssignment_10_1(), "rule__Worker__RetriesAssignment_10_1");
			builder.put(grammarAccess.getWorkerAccess().getDelayAssignment_10_4(), "rule__Worker__DelayAssignment_10_4");
			builder.put(grammarAccess.getWorkerAccess().getDelayTimeUnitAssignment_10_5(), "rule__Worker__DelayTimeUnitAssignment_10_5");
			builder.put(grammarAccess.getWorkerAccess().getDevicesAssignment_11(), "rule__Worker__DevicesAssignment_11");
			builder.put(grammarAccess.getSensorAccess().getTypeAssignment_1(), "rule__Sensor__TypeAssignment_1");
			builder.put(grammarAccess.getSensorAccess().getNameAssignment_2(), "rule__Sensor__NameAssignment_2");
			builder.put(grammarAccess.getSensorAccess().getPinsAssignment_4_1(), "rule__Sensor__PinsAssignment_4_1");
			builder.put(grammarAccess.getSensorAccess().getPinsAssignment_4_2_1(), "rule__Sensor__PinsAssignment_4_2_1");
			builder.put(grammarAccess.getSensorAccess().getOutputsAssignment_5(), "rule__Sensor__OutputsAssignment_5");
			builder.put(grammarAccess.getSensorAccess().getSettingsAssignment_6(), "rule__Sensor__SettingsAssignment_6");
			builder.put(grammarAccess.getSensorAccess().getPredicateAssignment_7_2(), "rule__Sensor__PredicateAssignment_7_2");
			builder.put(grammarAccess.getPinAccess().getTypeAssignment_0(), "rule__Pin__TypeAssignment_0");
			builder.put(grammarAccess.getPinAccess().getNumberAssignment_1(), "rule__Pin__NumberAssignment_1");
			builder.put(grammarAccess.getSensorOutputAccess().getOutputAssignment_1(), "rule__SensorOutput__OutputAssignment_1");
			builder.put(grammarAccess.getSensorOutputAccess().getNameAssignment_3(), "rule__SensorOutput__NameAssignment_3");
			builder.put(grammarAccess.getSensorOutputAccess().getMappingAssignment_4_2(), "rule__SensorOutput__MappingAssignment_4_2");
			builder.put(grammarAccess.getActuatorAccess().getTypeAssignment_1(), "rule__Actuator__TypeAssignment_1");
			builder.put(grammarAccess.getActuatorAccess().getNameAssignment_2(), "rule__Actuator__NameAssignment_2");
			builder.put(grammarAccess.getActuatorAccess().getPinsAssignment_5(), "rule__Actuator__PinsAssignment_5");
			builder.put(grammarAccess.getActuatorAccess().getPinsAssignment_6_1(), "rule__Actuator__PinsAssignment_6_1");
			builder.put(grammarAccess.getActuatorAccess().getSettingsAssignment_7(), "rule__Actuator__SettingsAssignment_7");
			builder.put(grammarAccess.getActuatorAccess().getTriggerAssignment_8(), "rule__Actuator__TriggerAssignment_8");
			builder.put(grammarAccess.getTriggerAccess().getExpAssignment_0_2(), "rule__Trigger__ExpAssignment_0_2");
			builder.put(grammarAccess.getTriggerAccess().getOnExpAssignment_1_2(), "rule__Trigger__OnExpAssignment_1_2");
			builder.put(grammarAccess.getTriggerAccess().getOffExpAssignment_1_3_0_1(), "rule__Trigger__OffExpAssignment_1_3_0_1");
			builder.put(grammarAccess.getTriggerAccess().getTimeAssignment_1_3_1_2(), "rule__Trigger__TimeAssignment_1_3_1_2");
			builder.put(grammarAccess.getTriggerAccess().getUnitAssignment_1_3_1_3(), "rule__Trigger__UnitAssignment_1_3_1_3");
			builder.put(grammarAccess.getSettingAccess().getNameAssignment_1(), "rule__Setting__NameAssignment_1");
			builder.put(grammarAccess.getSettingAccess().getValueAssignment_3(), "rule__Setting__ValueAssignment_3");
			builder.put(grammarAccess.getNumberPrimitiveAccess().getValueAssignment_0_1(), "rule__NumberPrimitive__ValueAssignment_0_1");
			builder.put(grammarAccess.getNumberPrimitiveAccess().getValueAssignment_1_1(), "rule__NumberPrimitive__ValueAssignment_1_1");
			builder.put(grammarAccess.getExpAccess().getRightAssignment_1_1(), "rule__Exp__RightAssignment_1_1");
			builder.put(grammarAccess.getFactorAccess().getRightAssignment_1_1(), "rule__Factor__RightAssignment_1_1");
			builder.put(grammarAccess.getCompareAccess().getRightAssignment_1_1(), "rule__Compare__RightAssignment_1_1");
			builder.put(grammarAccess.getCompareOrEqualsAccess().getRightAssignment_1_1(), "rule__CompareOrEquals__RightAssignment_1_1");
			builder.put(grammarAccess.getEqualsOrNotEqualsAccess().getRightAssignment_1_1(), "rule__EqualsOrNotEquals__RightAssignment_1_1");
			builder.put(grammarAccess.getAndOrAccess().getRightAssignment_1_1(), "rule__AndOr__RightAssignment_1_1");
			builder.put(grammarAccess.getExternalCallAccess().getFuncAssignment_1(), "rule__ExternalCall__FuncAssignment_1");
			builder.put(grammarAccess.getExternalCallAccess().getArgsAssignment_3(), "rule__ExternalCall__ArgsAssignment_3");
			builder.put(grammarAccess.getExternalCallAccess().getArgsAssignment_4_1(), "rule__ExternalCall__ArgsAssignment_4_1");
			builder.put(grammarAccess.getInternalVariableUseAccess().getRefAssignment(), "rule__InternalVariableUse__RefAssignment");
			builder.put(grammarAccess.getExternalVariableUseAccess().getObjAssignment_0(), "rule__ExternalVariableUse__ObjAssignment_0");
			builder.put(grammarAccess.getExternalVariableUseAccess().getRefAssignment_2(), "rule__ExternalVariableUse__RefAssignment_2");
			builder.put(grammarAccess.getGraphVariableUseAccess().getWorkerAssignment_0(), "rule__GraphVariableUse__WorkerAssignment_0");
			builder.put(grammarAccess.getGraphVariableUseAccess().getDeviceAssignment_2(), "rule__GraphVariableUse__DeviceAssignment_2");
			builder.put(grammarAccess.getGraphVariableUseAccess().getRefAssignment_4(), "rule__GraphVariableUse__RefAssignment_4");
			builder.put(grammarAccess.getParenthesisAccess().getExpAssignment_1(), "rule__Parenthesis__ExpAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private DeviceDefinitionGrammarAccess grammarAccess;

	@Override
	protected InternalDeviceDefinitionParser createParser() {
		InternalDeviceDefinitionParser result = new InternalDeviceDefinitionParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public DeviceDefinitionGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DeviceDefinitionGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
