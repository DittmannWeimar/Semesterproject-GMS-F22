/*
 * generated by Xtext 2.25.0
 */
grammar InternalDeviceDefinition;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package dk.gms.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package dk.gms.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.gms.dsl.services.DeviceDefinitionGrammarAccess;

}

@parser::members {

 	private DeviceDefinitionGrammarAccess grammarAccess;

    public InternalDeviceDefinitionParser(TokenStream input, DeviceDefinitionGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "System";
   	}

   	@Override
   	protected DeviceDefinitionGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleSystem
entryRuleSystem returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSystemRule()); }
	iv_ruleSystem=ruleSystem
	{ $current=$iv_ruleSystem.current; }
	EOF;

// Rule System
ruleSystem returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='System'
		{
			newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSystemRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSystemAccess().getMasterMasterParserRuleCall_3_0());
				}
				lv_master_3_0=ruleMaster
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSystemRule());
					}
					set(
						$current,
						"master",
						lv_master_3_0,
						"dk.gms.dsl.DeviceDefinition.Master");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getSystemAccess().getGraphsGraphParserRuleCall_4_0());
				}
				lv_graphs_4_0=ruleGraph
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSystemRule());
					}
					add(
						$current,
						"graphs",
						lv_graphs_4_0,
						"dk.gms.dsl.DeviceDefinition.Graph");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleGraph
entryRuleGraph returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGraphRule()); }
	iv_ruleGraph=ruleGraph
	{ $current=$iv_ruleGraph.current; }
	EOF;

// Rule Graph
ruleGraph returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Graph'
		{
			newLeafNode(otherlv_0, grammarAccess.getGraphAccess().getGraphKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getGraphAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGraphRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getGraphAccess().getColonKeyword_2());
		}
		otherlv_3='type'
		{
			newLeafNode(otherlv_3, grammarAccess.getGraphAccess().getTypeKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGraphAccess().getTypeGraphTypeEnumRuleCall_4_0());
				}
				lv_type_4_0=ruleGraphType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGraphRule());
					}
					set(
						$current,
						"type",
						lv_type_4_0,
						"dk.gms.dsl.DeviceDefinition.GraphType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='category'
		{
			newLeafNode(otherlv_5, grammarAccess.getGraphAccess().getCategoryKeyword_5());
		}
		(
			(
				lv_category_6_0=RULE_STRING
				{
					newLeafNode(lv_category_6_0, grammarAccess.getGraphAccess().getCategorySTRINGTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGraphRule());
					}
					setWithLastConsumed(
						$current,
						"category",
						lv_category_6_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_7='title'
		{
			newLeafNode(otherlv_7, grammarAccess.getGraphAccess().getTitleKeyword_7());
		}
		(
			(
				lv_title_8_0=RULE_STRING
				{
					newLeafNode(lv_title_8_0, grammarAccess.getGraphAccess().getTitleSTRINGTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGraphRule());
					}
					setWithLastConsumed(
						$current,
						"title",
						lv_title_8_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_9='xlabel'
		{
			newLeafNode(otherlv_9, grammarAccess.getGraphAccess().getXlabelKeyword_9());
		}
		(
			(
				lv_xlabel_10_0=RULE_STRING
				{
					newLeafNode(lv_xlabel_10_0, grammarAccess.getGraphAccess().getXlabelSTRINGTerminalRuleCall_10_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGraphRule());
					}
					setWithLastConsumed(
						$current,
						"xlabel",
						lv_xlabel_10_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_11='ylabel'
		{
			newLeafNode(otherlv_11, grammarAccess.getGraphAccess().getYlabelKeyword_11());
		}
		(
			(
				lv_ylabel_12_0=RULE_STRING
				{
					newLeafNode(lv_ylabel_12_0, grammarAccess.getGraphAccess().getYlabelSTRINGTerminalRuleCall_12_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGraphRule());
					}
					setWithLastConsumed(
						$current,
						"ylabel",
						lv_ylabel_12_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleMaster
entryRuleMaster returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMasterRule()); }
	iv_ruleMaster=ruleMaster
	{ $current=$iv_ruleMaster.current; }
	EOF;

// Rule Master
ruleMaster returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Master'
		{
			newLeafNode(otherlv_0, grammarAccess.getMasterAccess().getMasterKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getMasterAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMasterRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getMasterAccess().getColonKeyword_2());
		}
		otherlv_3='bluetooth'
		{
			newLeafNode(otherlv_3, grammarAccess.getMasterAccess().getBluetoothKeyword_3());
		}
		(
			(
				lv_bluetoothName_4_0=RULE_STRING
				{
					newLeafNode(lv_bluetoothName_4_0, grammarAccess.getMasterAccess().getBluetoothNameSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMasterRule());
					}
					setWithLastConsumed(
						$current,
						"bluetoothName",
						lv_bluetoothName_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getMasterAccess().getSlavesSlaveParserRuleCall_5_0());
				}
				lv_slaves_5_0=ruleSlave
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMasterRule());
					}
					add(
						$current,
						"slaves",
						lv_slaves_5_0,
						"dk.gms.dsl.DeviceDefinition.Slave");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleSlave
entryRuleSlave returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSlaveRule()); }
	iv_ruleSlave=ruleSlave
	{ $current=$iv_ruleSlave.current; }
	EOF;

// Rule Slave
ruleSlave returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Slave'
		{
			newLeafNode(otherlv_0, grammarAccess.getSlaveAccess().getSlaveKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getSlaveAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSlaveRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getSlaveAccess().getColonKeyword_2());
		}
		otherlv_3='bluetooth'
		{
			newLeafNode(otherlv_3, grammarAccess.getSlaveAccess().getBluetoothKeyword_3());
		}
		(
			(
				lv_bluetoothName_4_0=RULE_STRING
				{
					newLeafNode(lv_bluetoothName_4_0, grammarAccess.getSlaveAccess().getBluetoothNameSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSlaveRule());
					}
					setWithLastConsumed(
						$current,
						"bluetoothName",
						lv_bluetoothName_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getSlaveAccess().getDevicesSensorParserRuleCall_5_0_0());
					}
					lv_devices_5_1=ruleSensor
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlaveRule());
						}
						add(
							$current,
							"devices",
							lv_devices_5_1,
							"dk.gms.dsl.DeviceDefinition.Sensor");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getSlaveAccess().getDevicesActuatorParserRuleCall_5_0_1());
					}
					lv_devices_5_2=ruleActuator
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSlaveRule());
						}
						add(
							$current,
							"devices",
							lv_devices_5_2,
							"dk.gms.dsl.DeviceDefinition.Actuator");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleSensor
entryRuleSensor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSensorRule()); }
	iv_ruleSensor=ruleSensor
	{ $current=$iv_ruleSensor.current; }
	EOF;

// Rule Sensor
ruleSensor returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Sensor'
		{
			newLeafNode(otherlv_0, grammarAccess.getSensorAccess().getSensorKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSensorAccess().getTypeSensorTypeEnumRuleCall_1_0());
				}
				lv_type_1_0=ruleSensorType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSensorRule());
					}
					set(
						$current,
						"type",
						lv_type_1_0,
						"dk.gms.dsl.DeviceDefinition.SensorType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getSensorAccess().getColonKeyword_2());
		}
		otherlv_3='pins'
		{
			newLeafNode(otherlv_3, grammarAccess.getSensorAccess().getPinsKeyword_3());
		}
		otherlv_4='('
		{
			newLeafNode(otherlv_4, grammarAccess.getSensorAccess().getLeftParenthesisKeyword_4());
		}
		(
			(
				lv_pins_5_0=RULE_INT
				{
					newLeafNode(lv_pins_5_0, grammarAccess.getSensorAccess().getPinsINTTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSensorRule());
					}
					addWithLastConsumed(
						$current,
						"pins",
						lv_pins_5_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)*
		(
			otherlv_6=','
			{
				newLeafNode(otherlv_6, grammarAccess.getSensorAccess().getCommaKeyword_6_0());
			}
			(
				(
					lv_pins_7_0=RULE_INT
					{
						newLeafNode(lv_pins_7_0, grammarAccess.getSensorAccess().getPinsINTTerminalRuleCall_6_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSensorRule());
						}
						addWithLastConsumed(
							$current,
							"pins",
							lv_pins_7_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
		)*
		otherlv_8=')'
		{
			newLeafNode(otherlv_8, grammarAccess.getSensorAccess().getRightParenthesisKeyword_7());
		}
		otherlv_9='graph'
		{
			newLeafNode(otherlv_9, grammarAccess.getSensorAccess().getGraphKeyword_8());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSensorRule());
					}
				}
				otherlv_10=RULE_ID
				{
					newLeafNode(otherlv_10, grammarAccess.getSensorAccess().getGraphGraphCrossReference_9_0());
				}
			)
		)
	)
;

// Entry rule entryRuleActuator
entryRuleActuator returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActuatorRule()); }
	iv_ruleActuator=ruleActuator
	{ $current=$iv_ruleActuator.current; }
	EOF;

// Rule Actuator
ruleActuator returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Actuator'
		{
			newLeafNode(otherlv_0, grammarAccess.getActuatorAccess().getActuatorKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getActuatorAccess().getTypeActuatorTypeEnumRuleCall_1_0());
				}
				lv_type_1_0=ruleActuatorType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getActuatorRule());
					}
					set(
						$current,
						"type",
						lv_type_1_0,
						"dk.gms.dsl.DeviceDefinition.ActuatorType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getActuatorAccess().getColonKeyword_2());
		}
		otherlv_3='pins'
		{
			newLeafNode(otherlv_3, grammarAccess.getActuatorAccess().getPinsKeyword_3());
		}
		otherlv_4='('
		{
			newLeafNode(otherlv_4, grammarAccess.getActuatorAccess().getLeftParenthesisKeyword_4());
		}
		(
			(
				lv_pins_5_0=RULE_INT
				{
					newLeafNode(lv_pins_5_0, grammarAccess.getActuatorAccess().getPinsINTTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getActuatorRule());
					}
					addWithLastConsumed(
						$current,
						"pins",
						lv_pins_5_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)*
		(
			otherlv_6=','
			{
				newLeafNode(otherlv_6, grammarAccess.getActuatorAccess().getCommaKeyword_6_0());
			}
			(
				(
					lv_pins_7_0=RULE_INT
					{
						newLeafNode(lv_pins_7_0, grammarAccess.getActuatorAccess().getPinsINTTerminalRuleCall_6_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getActuatorRule());
						}
						addWithLastConsumed(
							$current,
							"pins",
							lv_pins_7_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
		)*
		otherlv_8=')'
		{
			newLeafNode(otherlv_8, grammarAccess.getActuatorAccess().getRightParenthesisKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getActuatorAccess().getSettingsSettingParserRuleCall_8_0());
				}
				lv_settings_9_0=ruleSetting
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getActuatorRule());
					}
					add(
						$current,
						"settings",
						lv_settings_9_0,
						"dk.gms.dsl.DeviceDefinition.Setting");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleSetting
entryRuleSetting returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSettingRule()); }
	iv_ruleSetting=ruleSetting
	{ $current=$iv_ruleSetting.current; }
	EOF;

// Rule Setting
ruleSetting returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Setting'
		{
			newLeafNode(otherlv_0, grammarAccess.getSettingAccess().getSettingKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getSettingAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSettingRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getSettingAccess().getColonKeyword_2());
		}
		otherlv_3='default'
		{
			newLeafNode(otherlv_3, grammarAccess.getSettingAccess().getDefaultKeyword_3());
		}
		(
			(
				lv_value_4_0=RULE_INT
				{
					newLeafNode(lv_value_4_0, grammarAccess.getSettingAccess().getValueINTTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSettingRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_4_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Rule GraphType
ruleGraphType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='Line'
			{
				$current = grammarAccess.getGraphTypeAccess().getLineEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGraphTypeAccess().getLineEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='BoxPlot'
			{
				$current = grammarAccess.getGraphTypeAccess().getBoxPlotEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGraphTypeAccess().getBoxPlotEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='Histogram'
			{
				$current = grammarAccess.getGraphTypeAccess().getHistogramEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getGraphTypeAccess().getHistogramEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule SensorType
ruleSensorType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='Moisture'
			{
				$current = grammarAccess.getSensorTypeAccess().getMoistureEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getSensorTypeAccess().getMoistureEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='Temperature'
			{
				$current = grammarAccess.getSensorTypeAccess().getTemperatureEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getSensorTypeAccess().getTemperatureEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='HumidityAndTemperature'
			{
				$current = grammarAccess.getSensorTypeAccess().getHumidityAndTemperatureEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getSensorTypeAccess().getHumidityAndTemperatureEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='AirHumidity'
			{
				$current = grammarAccess.getSensorTypeAccess().getAirHumidityEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getSensorTypeAccess().getAirHumidityEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='CO2'
			{
				$current = grammarAccess.getSensorTypeAccess().getCO2EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getSensorTypeAccess().getCO2EnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='Light'
			{
				$current = grammarAccess.getSensorTypeAccess().getLightEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getSensorTypeAccess().getLightEnumLiteralDeclaration_5());
			}
		)
	)
;

// Rule ActuatorType
ruleActuatorType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='LED'
			{
				$current = grammarAccess.getActuatorTypeAccess().getLEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getActuatorTypeAccess().getLEDEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='WaterPump'
			{
				$current = grammarAccess.getActuatorTypeAccess().getWaterPumpEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getActuatorTypeAccess().getWaterPumpEnumLiteralDeclaration_1());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
