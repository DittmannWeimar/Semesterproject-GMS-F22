package dk.gms.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import dk.gms.dsl.services.DeviceDefinitionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDeviceDefinitionParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Line'", "'BoxPlot'", "'Histogram'", "'Moisture'", "'Temperature'", "'HumidityAndTemperature'", "'AirHumidity'", "'CO2'", "'Light'", "'LED'", "'WaterPump'", "'System'", "':'", "'Graph'", "'type'", "'category'", "'title'", "'xlabel'", "'ylabel'", "'Master'", "'bluetooth'", "'Slave'", "'Sensor'", "'pins'", "'('", "')'", "'graph'", "','", "'Actuator'", "'Setting'", "'default'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDeviceDefinitionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDeviceDefinitionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDeviceDefinitionParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDeviceDefinition.g"; }


    	private DeviceDefinitionGrammarAccess grammarAccess;

    	public void setGrammarAccess(DeviceDefinitionGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleSystem"
    // InternalDeviceDefinition.g:53:1: entryRuleSystem : ruleSystem EOF ;
    public final void entryRuleSystem() throws RecognitionException {
        try {
            // InternalDeviceDefinition.g:54:1: ( ruleSystem EOF )
            // InternalDeviceDefinition.g:55:1: ruleSystem EOF
            {
             before(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_1);
            ruleSystem();

            state._fsp--;

             after(grammarAccess.getSystemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalDeviceDefinition.g:62:1: ruleSystem : ( ( rule__System__Group__0 ) ) ;
    public final void ruleSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:66:2: ( ( ( rule__System__Group__0 ) ) )
            // InternalDeviceDefinition.g:67:2: ( ( rule__System__Group__0 ) )
            {
            // InternalDeviceDefinition.g:67:2: ( ( rule__System__Group__0 ) )
            // InternalDeviceDefinition.g:68:3: ( rule__System__Group__0 )
            {
             before(grammarAccess.getSystemAccess().getGroup()); 
            // InternalDeviceDefinition.g:69:3: ( rule__System__Group__0 )
            // InternalDeviceDefinition.g:69:4: rule__System__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__System__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleGraph"
    // InternalDeviceDefinition.g:78:1: entryRuleGraph : ruleGraph EOF ;
    public final void entryRuleGraph() throws RecognitionException {
        try {
            // InternalDeviceDefinition.g:79:1: ( ruleGraph EOF )
            // InternalDeviceDefinition.g:80:1: ruleGraph EOF
            {
             before(grammarAccess.getGraphRule()); 
            pushFollow(FOLLOW_1);
            ruleGraph();

            state._fsp--;

             after(grammarAccess.getGraphRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraph"


    // $ANTLR start "ruleGraph"
    // InternalDeviceDefinition.g:87:1: ruleGraph : ( ( rule__Graph__Group__0 ) ) ;
    public final void ruleGraph() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:91:2: ( ( ( rule__Graph__Group__0 ) ) )
            // InternalDeviceDefinition.g:92:2: ( ( rule__Graph__Group__0 ) )
            {
            // InternalDeviceDefinition.g:92:2: ( ( rule__Graph__Group__0 ) )
            // InternalDeviceDefinition.g:93:3: ( rule__Graph__Group__0 )
            {
             before(grammarAccess.getGraphAccess().getGroup()); 
            // InternalDeviceDefinition.g:94:3: ( rule__Graph__Group__0 )
            // InternalDeviceDefinition.g:94:4: rule__Graph__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Graph__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraph"


    // $ANTLR start "entryRuleMaster"
    // InternalDeviceDefinition.g:103:1: entryRuleMaster : ruleMaster EOF ;
    public final void entryRuleMaster() throws RecognitionException {
        try {
            // InternalDeviceDefinition.g:104:1: ( ruleMaster EOF )
            // InternalDeviceDefinition.g:105:1: ruleMaster EOF
            {
             before(grammarAccess.getMasterRule()); 
            pushFollow(FOLLOW_1);
            ruleMaster();

            state._fsp--;

             after(grammarAccess.getMasterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMaster"


    // $ANTLR start "ruleMaster"
    // InternalDeviceDefinition.g:112:1: ruleMaster : ( ( rule__Master__Group__0 ) ) ;
    public final void ruleMaster() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:116:2: ( ( ( rule__Master__Group__0 ) ) )
            // InternalDeviceDefinition.g:117:2: ( ( rule__Master__Group__0 ) )
            {
            // InternalDeviceDefinition.g:117:2: ( ( rule__Master__Group__0 ) )
            // InternalDeviceDefinition.g:118:3: ( rule__Master__Group__0 )
            {
             before(grammarAccess.getMasterAccess().getGroup()); 
            // InternalDeviceDefinition.g:119:3: ( rule__Master__Group__0 )
            // InternalDeviceDefinition.g:119:4: rule__Master__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Master__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMasterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMaster"


    // $ANTLR start "entryRuleSlave"
    // InternalDeviceDefinition.g:128:1: entryRuleSlave : ruleSlave EOF ;
    public final void entryRuleSlave() throws RecognitionException {
        try {
            // InternalDeviceDefinition.g:129:1: ( ruleSlave EOF )
            // InternalDeviceDefinition.g:130:1: ruleSlave EOF
            {
             before(grammarAccess.getSlaveRule()); 
            pushFollow(FOLLOW_1);
            ruleSlave();

            state._fsp--;

             after(grammarAccess.getSlaveRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSlave"


    // $ANTLR start "ruleSlave"
    // InternalDeviceDefinition.g:137:1: ruleSlave : ( ( rule__Slave__Group__0 ) ) ;
    public final void ruleSlave() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:141:2: ( ( ( rule__Slave__Group__0 ) ) )
            // InternalDeviceDefinition.g:142:2: ( ( rule__Slave__Group__0 ) )
            {
            // InternalDeviceDefinition.g:142:2: ( ( rule__Slave__Group__0 ) )
            // InternalDeviceDefinition.g:143:3: ( rule__Slave__Group__0 )
            {
             before(grammarAccess.getSlaveAccess().getGroup()); 
            // InternalDeviceDefinition.g:144:3: ( rule__Slave__Group__0 )
            // InternalDeviceDefinition.g:144:4: rule__Slave__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Slave__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSlaveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSlave"


    // $ANTLR start "entryRuleSensor"
    // InternalDeviceDefinition.g:153:1: entryRuleSensor : ruleSensor EOF ;
    public final void entryRuleSensor() throws RecognitionException {
        try {
            // InternalDeviceDefinition.g:154:1: ( ruleSensor EOF )
            // InternalDeviceDefinition.g:155:1: ruleSensor EOF
            {
             before(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getSensorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalDeviceDefinition.g:162:1: ruleSensor : ( ( rule__Sensor__Group__0 ) ) ;
    public final void ruleSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:166:2: ( ( ( rule__Sensor__Group__0 ) ) )
            // InternalDeviceDefinition.g:167:2: ( ( rule__Sensor__Group__0 ) )
            {
            // InternalDeviceDefinition.g:167:2: ( ( rule__Sensor__Group__0 ) )
            // InternalDeviceDefinition.g:168:3: ( rule__Sensor__Group__0 )
            {
             before(grammarAccess.getSensorAccess().getGroup()); 
            // InternalDeviceDefinition.g:169:3: ( rule__Sensor__Group__0 )
            // InternalDeviceDefinition.g:169:4: rule__Sensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleActuator"
    // InternalDeviceDefinition.g:178:1: entryRuleActuator : ruleActuator EOF ;
    public final void entryRuleActuator() throws RecognitionException {
        try {
            // InternalDeviceDefinition.g:179:1: ( ruleActuator EOF )
            // InternalDeviceDefinition.g:180:1: ruleActuator EOF
            {
             before(grammarAccess.getActuatorRule()); 
            pushFollow(FOLLOW_1);
            ruleActuator();

            state._fsp--;

             after(grammarAccess.getActuatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActuator"


    // $ANTLR start "ruleActuator"
    // InternalDeviceDefinition.g:187:1: ruleActuator : ( ( rule__Actuator__Group__0 ) ) ;
    public final void ruleActuator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:191:2: ( ( ( rule__Actuator__Group__0 ) ) )
            // InternalDeviceDefinition.g:192:2: ( ( rule__Actuator__Group__0 ) )
            {
            // InternalDeviceDefinition.g:192:2: ( ( rule__Actuator__Group__0 ) )
            // InternalDeviceDefinition.g:193:3: ( rule__Actuator__Group__0 )
            {
             before(grammarAccess.getActuatorAccess().getGroup()); 
            // InternalDeviceDefinition.g:194:3: ( rule__Actuator__Group__0 )
            // InternalDeviceDefinition.g:194:4: rule__Actuator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Actuator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActuatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActuator"


    // $ANTLR start "entryRuleSetting"
    // InternalDeviceDefinition.g:203:1: entryRuleSetting : ruleSetting EOF ;
    public final void entryRuleSetting() throws RecognitionException {
        try {
            // InternalDeviceDefinition.g:204:1: ( ruleSetting EOF )
            // InternalDeviceDefinition.g:205:1: ruleSetting EOF
            {
             before(grammarAccess.getSettingRule()); 
            pushFollow(FOLLOW_1);
            ruleSetting();

            state._fsp--;

             after(grammarAccess.getSettingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSetting"


    // $ANTLR start "ruleSetting"
    // InternalDeviceDefinition.g:212:1: ruleSetting : ( ( rule__Setting__Group__0 ) ) ;
    public final void ruleSetting() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:216:2: ( ( ( rule__Setting__Group__0 ) ) )
            // InternalDeviceDefinition.g:217:2: ( ( rule__Setting__Group__0 ) )
            {
            // InternalDeviceDefinition.g:217:2: ( ( rule__Setting__Group__0 ) )
            // InternalDeviceDefinition.g:218:3: ( rule__Setting__Group__0 )
            {
             before(grammarAccess.getSettingAccess().getGroup()); 
            // InternalDeviceDefinition.g:219:3: ( rule__Setting__Group__0 )
            // InternalDeviceDefinition.g:219:4: rule__Setting__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Setting__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSettingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSetting"


    // $ANTLR start "ruleGraphType"
    // InternalDeviceDefinition.g:228:1: ruleGraphType : ( ( rule__GraphType__Alternatives ) ) ;
    public final void ruleGraphType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:232:1: ( ( ( rule__GraphType__Alternatives ) ) )
            // InternalDeviceDefinition.g:233:2: ( ( rule__GraphType__Alternatives ) )
            {
            // InternalDeviceDefinition.g:233:2: ( ( rule__GraphType__Alternatives ) )
            // InternalDeviceDefinition.g:234:3: ( rule__GraphType__Alternatives )
            {
             before(grammarAccess.getGraphTypeAccess().getAlternatives()); 
            // InternalDeviceDefinition.g:235:3: ( rule__GraphType__Alternatives )
            // InternalDeviceDefinition.g:235:4: rule__GraphType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GraphType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGraphTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphType"


    // $ANTLR start "ruleSensorType"
    // InternalDeviceDefinition.g:244:1: ruleSensorType : ( ( rule__SensorType__Alternatives ) ) ;
    public final void ruleSensorType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:248:1: ( ( ( rule__SensorType__Alternatives ) ) )
            // InternalDeviceDefinition.g:249:2: ( ( rule__SensorType__Alternatives ) )
            {
            // InternalDeviceDefinition.g:249:2: ( ( rule__SensorType__Alternatives ) )
            // InternalDeviceDefinition.g:250:3: ( rule__SensorType__Alternatives )
            {
             before(grammarAccess.getSensorTypeAccess().getAlternatives()); 
            // InternalDeviceDefinition.g:251:3: ( rule__SensorType__Alternatives )
            // InternalDeviceDefinition.g:251:4: rule__SensorType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SensorType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSensorTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensorType"


    // $ANTLR start "ruleActuatorType"
    // InternalDeviceDefinition.g:260:1: ruleActuatorType : ( ( rule__ActuatorType__Alternatives ) ) ;
    public final void ruleActuatorType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:264:1: ( ( ( rule__ActuatorType__Alternatives ) ) )
            // InternalDeviceDefinition.g:265:2: ( ( rule__ActuatorType__Alternatives ) )
            {
            // InternalDeviceDefinition.g:265:2: ( ( rule__ActuatorType__Alternatives ) )
            // InternalDeviceDefinition.g:266:3: ( rule__ActuatorType__Alternatives )
            {
             before(grammarAccess.getActuatorTypeAccess().getAlternatives()); 
            // InternalDeviceDefinition.g:267:3: ( rule__ActuatorType__Alternatives )
            // InternalDeviceDefinition.g:267:4: rule__ActuatorType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ActuatorType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActuatorTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActuatorType"


    // $ANTLR start "rule__Slave__DevicesAlternatives_5_0"
    // InternalDeviceDefinition.g:275:1: rule__Slave__DevicesAlternatives_5_0 : ( ( ruleSensor ) | ( ruleActuator ) );
    public final void rule__Slave__DevicesAlternatives_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:279:1: ( ( ruleSensor ) | ( ruleActuator ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==33) ) {
                alt1=1;
            }
            else if ( (LA1_0==39) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDeviceDefinition.g:280:2: ( ruleSensor )
                    {
                    // InternalDeviceDefinition.g:280:2: ( ruleSensor )
                    // InternalDeviceDefinition.g:281:3: ruleSensor
                    {
                     before(grammarAccess.getSlaveAccess().getDevicesSensorParserRuleCall_5_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSensor();

                    state._fsp--;

                     after(grammarAccess.getSlaveAccess().getDevicesSensorParserRuleCall_5_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDeviceDefinition.g:286:2: ( ruleActuator )
                    {
                    // InternalDeviceDefinition.g:286:2: ( ruleActuator )
                    // InternalDeviceDefinition.g:287:3: ruleActuator
                    {
                     before(grammarAccess.getSlaveAccess().getDevicesActuatorParserRuleCall_5_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleActuator();

                    state._fsp--;

                     after(grammarAccess.getSlaveAccess().getDevicesActuatorParserRuleCall_5_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slave__DevicesAlternatives_5_0"


    // $ANTLR start "rule__GraphType__Alternatives"
    // InternalDeviceDefinition.g:296:1: rule__GraphType__Alternatives : ( ( ( 'Line' ) ) | ( ( 'BoxPlot' ) ) | ( ( 'Histogram' ) ) );
    public final void rule__GraphType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:300:1: ( ( ( 'Line' ) ) | ( ( 'BoxPlot' ) ) | ( ( 'Histogram' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDeviceDefinition.g:301:2: ( ( 'Line' ) )
                    {
                    // InternalDeviceDefinition.g:301:2: ( ( 'Line' ) )
                    // InternalDeviceDefinition.g:302:3: ( 'Line' )
                    {
                     before(grammarAccess.getGraphTypeAccess().getLineEnumLiteralDeclaration_0()); 
                    // InternalDeviceDefinition.g:303:3: ( 'Line' )
                    // InternalDeviceDefinition.g:303:4: 'Line'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getGraphTypeAccess().getLineEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDeviceDefinition.g:307:2: ( ( 'BoxPlot' ) )
                    {
                    // InternalDeviceDefinition.g:307:2: ( ( 'BoxPlot' ) )
                    // InternalDeviceDefinition.g:308:3: ( 'BoxPlot' )
                    {
                     before(grammarAccess.getGraphTypeAccess().getBoxPlotEnumLiteralDeclaration_1()); 
                    // InternalDeviceDefinition.g:309:3: ( 'BoxPlot' )
                    // InternalDeviceDefinition.g:309:4: 'BoxPlot'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getGraphTypeAccess().getBoxPlotEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDeviceDefinition.g:313:2: ( ( 'Histogram' ) )
                    {
                    // InternalDeviceDefinition.g:313:2: ( ( 'Histogram' ) )
                    // InternalDeviceDefinition.g:314:3: ( 'Histogram' )
                    {
                     before(grammarAccess.getGraphTypeAccess().getHistogramEnumLiteralDeclaration_2()); 
                    // InternalDeviceDefinition.g:315:3: ( 'Histogram' )
                    // InternalDeviceDefinition.g:315:4: 'Histogram'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getGraphTypeAccess().getHistogramEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphType__Alternatives"


    // $ANTLR start "rule__SensorType__Alternatives"
    // InternalDeviceDefinition.g:323:1: rule__SensorType__Alternatives : ( ( ( 'Moisture' ) ) | ( ( 'Temperature' ) ) | ( ( 'HumidityAndTemperature' ) ) | ( ( 'AirHumidity' ) ) | ( ( 'CO2' ) ) | ( ( 'Light' ) ) );
    public final void rule__SensorType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:327:1: ( ( ( 'Moisture' ) ) | ( ( 'Temperature' ) ) | ( ( 'HumidityAndTemperature' ) ) | ( ( 'AirHumidity' ) ) | ( ( 'CO2' ) ) | ( ( 'Light' ) ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            case 17:
                {
                alt3=4;
                }
                break;
            case 18:
                {
                alt3=5;
                }
                break;
            case 19:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDeviceDefinition.g:328:2: ( ( 'Moisture' ) )
                    {
                    // InternalDeviceDefinition.g:328:2: ( ( 'Moisture' ) )
                    // InternalDeviceDefinition.g:329:3: ( 'Moisture' )
                    {
                     before(grammarAccess.getSensorTypeAccess().getMoistureEnumLiteralDeclaration_0()); 
                    // InternalDeviceDefinition.g:330:3: ( 'Moisture' )
                    // InternalDeviceDefinition.g:330:4: 'Moisture'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getSensorTypeAccess().getMoistureEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDeviceDefinition.g:334:2: ( ( 'Temperature' ) )
                    {
                    // InternalDeviceDefinition.g:334:2: ( ( 'Temperature' ) )
                    // InternalDeviceDefinition.g:335:3: ( 'Temperature' )
                    {
                     before(grammarAccess.getSensorTypeAccess().getTemperatureEnumLiteralDeclaration_1()); 
                    // InternalDeviceDefinition.g:336:3: ( 'Temperature' )
                    // InternalDeviceDefinition.g:336:4: 'Temperature'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getSensorTypeAccess().getTemperatureEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDeviceDefinition.g:340:2: ( ( 'HumidityAndTemperature' ) )
                    {
                    // InternalDeviceDefinition.g:340:2: ( ( 'HumidityAndTemperature' ) )
                    // InternalDeviceDefinition.g:341:3: ( 'HumidityAndTemperature' )
                    {
                     before(grammarAccess.getSensorTypeAccess().getHumidityAndTemperatureEnumLiteralDeclaration_2()); 
                    // InternalDeviceDefinition.g:342:3: ( 'HumidityAndTemperature' )
                    // InternalDeviceDefinition.g:342:4: 'HumidityAndTemperature'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getSensorTypeAccess().getHumidityAndTemperatureEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDeviceDefinition.g:346:2: ( ( 'AirHumidity' ) )
                    {
                    // InternalDeviceDefinition.g:346:2: ( ( 'AirHumidity' ) )
                    // InternalDeviceDefinition.g:347:3: ( 'AirHumidity' )
                    {
                     before(grammarAccess.getSensorTypeAccess().getAirHumidityEnumLiteralDeclaration_3()); 
                    // InternalDeviceDefinition.g:348:3: ( 'AirHumidity' )
                    // InternalDeviceDefinition.g:348:4: 'AirHumidity'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getSensorTypeAccess().getAirHumidityEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDeviceDefinition.g:352:2: ( ( 'CO2' ) )
                    {
                    // InternalDeviceDefinition.g:352:2: ( ( 'CO2' ) )
                    // InternalDeviceDefinition.g:353:3: ( 'CO2' )
                    {
                     before(grammarAccess.getSensorTypeAccess().getCO2EnumLiteralDeclaration_4()); 
                    // InternalDeviceDefinition.g:354:3: ( 'CO2' )
                    // InternalDeviceDefinition.g:354:4: 'CO2'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getSensorTypeAccess().getCO2EnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDeviceDefinition.g:358:2: ( ( 'Light' ) )
                    {
                    // InternalDeviceDefinition.g:358:2: ( ( 'Light' ) )
                    // InternalDeviceDefinition.g:359:3: ( 'Light' )
                    {
                     before(grammarAccess.getSensorTypeAccess().getLightEnumLiteralDeclaration_5()); 
                    // InternalDeviceDefinition.g:360:3: ( 'Light' )
                    // InternalDeviceDefinition.g:360:4: 'Light'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getSensorTypeAccess().getLightEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorType__Alternatives"


    // $ANTLR start "rule__ActuatorType__Alternatives"
    // InternalDeviceDefinition.g:368:1: rule__ActuatorType__Alternatives : ( ( ( 'LED' ) ) | ( ( 'WaterPump' ) ) );
    public final void rule__ActuatorType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:372:1: ( ( ( 'LED' ) ) | ( ( 'WaterPump' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            else if ( (LA4_0==21) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDeviceDefinition.g:373:2: ( ( 'LED' ) )
                    {
                    // InternalDeviceDefinition.g:373:2: ( ( 'LED' ) )
                    // InternalDeviceDefinition.g:374:3: ( 'LED' )
                    {
                     before(grammarAccess.getActuatorTypeAccess().getLEDEnumLiteralDeclaration_0()); 
                    // InternalDeviceDefinition.g:375:3: ( 'LED' )
                    // InternalDeviceDefinition.g:375:4: 'LED'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getActuatorTypeAccess().getLEDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDeviceDefinition.g:379:2: ( ( 'WaterPump' ) )
                    {
                    // InternalDeviceDefinition.g:379:2: ( ( 'WaterPump' ) )
                    // InternalDeviceDefinition.g:380:3: ( 'WaterPump' )
                    {
                     before(grammarAccess.getActuatorTypeAccess().getWaterPumpEnumLiteralDeclaration_1()); 
                    // InternalDeviceDefinition.g:381:3: ( 'WaterPump' )
                    // InternalDeviceDefinition.g:381:4: 'WaterPump'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getActuatorTypeAccess().getWaterPumpEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorType__Alternatives"


    // $ANTLR start "rule__System__Group__0"
    // InternalDeviceDefinition.g:389:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:393:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // InternalDeviceDefinition.g:394:2: rule__System__Group__0__Impl rule__System__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__System__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__0"


    // $ANTLR start "rule__System__Group__0__Impl"
    // InternalDeviceDefinition.g:401:1: rule__System__Group__0__Impl : ( 'System' ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:405:1: ( ( 'System' ) )
            // InternalDeviceDefinition.g:406:1: ( 'System' )
            {
            // InternalDeviceDefinition.g:406:1: ( 'System' )
            // InternalDeviceDefinition.g:407:2: 'System'
            {
             before(grammarAccess.getSystemAccess().getSystemKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getSystemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__0__Impl"


    // $ANTLR start "rule__System__Group__1"
    // InternalDeviceDefinition.g:416:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:420:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // InternalDeviceDefinition.g:421:2: rule__System__Group__1__Impl rule__System__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__System__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__1"


    // $ANTLR start "rule__System__Group__1__Impl"
    // InternalDeviceDefinition.g:428:1: rule__System__Group__1__Impl : ( ( rule__System__NameAssignment_1 ) ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:432:1: ( ( ( rule__System__NameAssignment_1 ) ) )
            // InternalDeviceDefinition.g:433:1: ( ( rule__System__NameAssignment_1 ) )
            {
            // InternalDeviceDefinition.g:433:1: ( ( rule__System__NameAssignment_1 ) )
            // InternalDeviceDefinition.g:434:2: ( rule__System__NameAssignment_1 )
            {
             before(grammarAccess.getSystemAccess().getNameAssignment_1()); 
            // InternalDeviceDefinition.g:435:2: ( rule__System__NameAssignment_1 )
            // InternalDeviceDefinition.g:435:3: rule__System__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__System__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__1__Impl"


    // $ANTLR start "rule__System__Group__2"
    // InternalDeviceDefinition.g:443:1: rule__System__Group__2 : rule__System__Group__2__Impl rule__System__Group__3 ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:447:1: ( rule__System__Group__2__Impl rule__System__Group__3 )
            // InternalDeviceDefinition.g:448:2: rule__System__Group__2__Impl rule__System__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__System__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__2"


    // $ANTLR start "rule__System__Group__2__Impl"
    // InternalDeviceDefinition.g:455:1: rule__System__Group__2__Impl : ( ':' ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:459:1: ( ( ':' ) )
            // InternalDeviceDefinition.g:460:1: ( ':' )
            {
            // InternalDeviceDefinition.g:460:1: ( ':' )
            // InternalDeviceDefinition.g:461:2: ':'
            {
             before(grammarAccess.getSystemAccess().getColonKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__2__Impl"


    // $ANTLR start "rule__System__Group__3"
    // InternalDeviceDefinition.g:470:1: rule__System__Group__3 : rule__System__Group__3__Impl rule__System__Group__4 ;
    public final void rule__System__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:474:1: ( rule__System__Group__3__Impl rule__System__Group__4 )
            // InternalDeviceDefinition.g:475:2: rule__System__Group__3__Impl rule__System__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__System__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__3"


    // $ANTLR start "rule__System__Group__3__Impl"
    // InternalDeviceDefinition.g:482:1: rule__System__Group__3__Impl : ( ( rule__System__MasterAssignment_3 ) ) ;
    public final void rule__System__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:486:1: ( ( ( rule__System__MasterAssignment_3 ) ) )
            // InternalDeviceDefinition.g:487:1: ( ( rule__System__MasterAssignment_3 ) )
            {
            // InternalDeviceDefinition.g:487:1: ( ( rule__System__MasterAssignment_3 ) )
            // InternalDeviceDefinition.g:488:2: ( rule__System__MasterAssignment_3 )
            {
             before(grammarAccess.getSystemAccess().getMasterAssignment_3()); 
            // InternalDeviceDefinition.g:489:2: ( rule__System__MasterAssignment_3 )
            // InternalDeviceDefinition.g:489:3: rule__System__MasterAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__System__MasterAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getMasterAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__3__Impl"


    // $ANTLR start "rule__System__Group__4"
    // InternalDeviceDefinition.g:497:1: rule__System__Group__4 : rule__System__Group__4__Impl ;
    public final void rule__System__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:501:1: ( rule__System__Group__4__Impl )
            // InternalDeviceDefinition.g:502:2: rule__System__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__4"


    // $ANTLR start "rule__System__Group__4__Impl"
    // InternalDeviceDefinition.g:508:1: rule__System__Group__4__Impl : ( ( rule__System__GraphsAssignment_4 )* ) ;
    public final void rule__System__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:512:1: ( ( ( rule__System__GraphsAssignment_4 )* ) )
            // InternalDeviceDefinition.g:513:1: ( ( rule__System__GraphsAssignment_4 )* )
            {
            // InternalDeviceDefinition.g:513:1: ( ( rule__System__GraphsAssignment_4 )* )
            // InternalDeviceDefinition.g:514:2: ( rule__System__GraphsAssignment_4 )*
            {
             before(grammarAccess.getSystemAccess().getGraphsAssignment_4()); 
            // InternalDeviceDefinition.g:515:2: ( rule__System__GraphsAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==24) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDeviceDefinition.g:515:3: rule__System__GraphsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__System__GraphsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSystemAccess().getGraphsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__4__Impl"


    // $ANTLR start "rule__Graph__Group__0"
    // InternalDeviceDefinition.g:524:1: rule__Graph__Group__0 : rule__Graph__Group__0__Impl rule__Graph__Group__1 ;
    public final void rule__Graph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:528:1: ( rule__Graph__Group__0__Impl rule__Graph__Group__1 )
            // InternalDeviceDefinition.g:529:2: rule__Graph__Group__0__Impl rule__Graph__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Graph__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__0"


    // $ANTLR start "rule__Graph__Group__0__Impl"
    // InternalDeviceDefinition.g:536:1: rule__Graph__Group__0__Impl : ( 'Graph' ) ;
    public final void rule__Graph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:540:1: ( ( 'Graph' ) )
            // InternalDeviceDefinition.g:541:1: ( 'Graph' )
            {
            // InternalDeviceDefinition.g:541:1: ( 'Graph' )
            // InternalDeviceDefinition.g:542:2: 'Graph'
            {
             before(grammarAccess.getGraphAccess().getGraphKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getGraphAccess().getGraphKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__0__Impl"


    // $ANTLR start "rule__Graph__Group__1"
    // InternalDeviceDefinition.g:551:1: rule__Graph__Group__1 : rule__Graph__Group__1__Impl rule__Graph__Group__2 ;
    public final void rule__Graph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:555:1: ( rule__Graph__Group__1__Impl rule__Graph__Group__2 )
            // InternalDeviceDefinition.g:556:2: rule__Graph__Group__1__Impl rule__Graph__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Graph__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__1"


    // $ANTLR start "rule__Graph__Group__1__Impl"
    // InternalDeviceDefinition.g:563:1: rule__Graph__Group__1__Impl : ( ( rule__Graph__NameAssignment_1 ) ) ;
    public final void rule__Graph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:567:1: ( ( ( rule__Graph__NameAssignment_1 ) ) )
            // InternalDeviceDefinition.g:568:1: ( ( rule__Graph__NameAssignment_1 ) )
            {
            // InternalDeviceDefinition.g:568:1: ( ( rule__Graph__NameAssignment_1 ) )
            // InternalDeviceDefinition.g:569:2: ( rule__Graph__NameAssignment_1 )
            {
             before(grammarAccess.getGraphAccess().getNameAssignment_1()); 
            // InternalDeviceDefinition.g:570:2: ( rule__Graph__NameAssignment_1 )
            // InternalDeviceDefinition.g:570:3: rule__Graph__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Graph__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGraphAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__1__Impl"


    // $ANTLR start "rule__Graph__Group__2"
    // InternalDeviceDefinition.g:578:1: rule__Graph__Group__2 : rule__Graph__Group__2__Impl rule__Graph__Group__3 ;
    public final void rule__Graph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:582:1: ( rule__Graph__Group__2__Impl rule__Graph__Group__3 )
            // InternalDeviceDefinition.g:583:2: rule__Graph__Group__2__Impl rule__Graph__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Graph__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__2"


    // $ANTLR start "rule__Graph__Group__2__Impl"
    // InternalDeviceDefinition.g:590:1: rule__Graph__Group__2__Impl : ( ':' ) ;
    public final void rule__Graph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:594:1: ( ( ':' ) )
            // InternalDeviceDefinition.g:595:1: ( ':' )
            {
            // InternalDeviceDefinition.g:595:1: ( ':' )
            // InternalDeviceDefinition.g:596:2: ':'
            {
             before(grammarAccess.getGraphAccess().getColonKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGraphAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__2__Impl"


    // $ANTLR start "rule__Graph__Group__3"
    // InternalDeviceDefinition.g:605:1: rule__Graph__Group__3 : rule__Graph__Group__3__Impl rule__Graph__Group__4 ;
    public final void rule__Graph__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:609:1: ( rule__Graph__Group__3__Impl rule__Graph__Group__4 )
            // InternalDeviceDefinition.g:610:2: rule__Graph__Group__3__Impl rule__Graph__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Graph__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__3"


    // $ANTLR start "rule__Graph__Group__3__Impl"
    // InternalDeviceDefinition.g:617:1: rule__Graph__Group__3__Impl : ( 'type' ) ;
    public final void rule__Graph__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:621:1: ( ( 'type' ) )
            // InternalDeviceDefinition.g:622:1: ( 'type' )
            {
            // InternalDeviceDefinition.g:622:1: ( 'type' )
            // InternalDeviceDefinition.g:623:2: 'type'
            {
             before(grammarAccess.getGraphAccess().getTypeKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getGraphAccess().getTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__3__Impl"


    // $ANTLR start "rule__Graph__Group__4"
    // InternalDeviceDefinition.g:632:1: rule__Graph__Group__4 : rule__Graph__Group__4__Impl rule__Graph__Group__5 ;
    public final void rule__Graph__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:636:1: ( rule__Graph__Group__4__Impl rule__Graph__Group__5 )
            // InternalDeviceDefinition.g:637:2: rule__Graph__Group__4__Impl rule__Graph__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Graph__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__4"


    // $ANTLR start "rule__Graph__Group__4__Impl"
    // InternalDeviceDefinition.g:644:1: rule__Graph__Group__4__Impl : ( ( rule__Graph__TypeAssignment_4 ) ) ;
    public final void rule__Graph__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:648:1: ( ( ( rule__Graph__TypeAssignment_4 ) ) )
            // InternalDeviceDefinition.g:649:1: ( ( rule__Graph__TypeAssignment_4 ) )
            {
            // InternalDeviceDefinition.g:649:1: ( ( rule__Graph__TypeAssignment_4 ) )
            // InternalDeviceDefinition.g:650:2: ( rule__Graph__TypeAssignment_4 )
            {
             before(grammarAccess.getGraphAccess().getTypeAssignment_4()); 
            // InternalDeviceDefinition.g:651:2: ( rule__Graph__TypeAssignment_4 )
            // InternalDeviceDefinition.g:651:3: rule__Graph__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Graph__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGraphAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__4__Impl"


    // $ANTLR start "rule__Graph__Group__5"
    // InternalDeviceDefinition.g:659:1: rule__Graph__Group__5 : rule__Graph__Group__5__Impl rule__Graph__Group__6 ;
    public final void rule__Graph__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:663:1: ( rule__Graph__Group__5__Impl rule__Graph__Group__6 )
            // InternalDeviceDefinition.g:664:2: rule__Graph__Group__5__Impl rule__Graph__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Graph__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__5"


    // $ANTLR start "rule__Graph__Group__5__Impl"
    // InternalDeviceDefinition.g:671:1: rule__Graph__Group__5__Impl : ( 'category' ) ;
    public final void rule__Graph__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:675:1: ( ( 'category' ) )
            // InternalDeviceDefinition.g:676:1: ( 'category' )
            {
            // InternalDeviceDefinition.g:676:1: ( 'category' )
            // InternalDeviceDefinition.g:677:2: 'category'
            {
             before(grammarAccess.getGraphAccess().getCategoryKeyword_5()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getGraphAccess().getCategoryKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__5__Impl"


    // $ANTLR start "rule__Graph__Group__6"
    // InternalDeviceDefinition.g:686:1: rule__Graph__Group__6 : rule__Graph__Group__6__Impl rule__Graph__Group__7 ;
    public final void rule__Graph__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:690:1: ( rule__Graph__Group__6__Impl rule__Graph__Group__7 )
            // InternalDeviceDefinition.g:691:2: rule__Graph__Group__6__Impl rule__Graph__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__Graph__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__6"


    // $ANTLR start "rule__Graph__Group__6__Impl"
    // InternalDeviceDefinition.g:698:1: rule__Graph__Group__6__Impl : ( ( rule__Graph__CategoryAssignment_6 ) ) ;
    public final void rule__Graph__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:702:1: ( ( ( rule__Graph__CategoryAssignment_6 ) ) )
            // InternalDeviceDefinition.g:703:1: ( ( rule__Graph__CategoryAssignment_6 ) )
            {
            // InternalDeviceDefinition.g:703:1: ( ( rule__Graph__CategoryAssignment_6 ) )
            // InternalDeviceDefinition.g:704:2: ( rule__Graph__CategoryAssignment_6 )
            {
             before(grammarAccess.getGraphAccess().getCategoryAssignment_6()); 
            // InternalDeviceDefinition.g:705:2: ( rule__Graph__CategoryAssignment_6 )
            // InternalDeviceDefinition.g:705:3: rule__Graph__CategoryAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Graph__CategoryAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getGraphAccess().getCategoryAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__6__Impl"


    // $ANTLR start "rule__Graph__Group__7"
    // InternalDeviceDefinition.g:713:1: rule__Graph__Group__7 : rule__Graph__Group__7__Impl rule__Graph__Group__8 ;
    public final void rule__Graph__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:717:1: ( rule__Graph__Group__7__Impl rule__Graph__Group__8 )
            // InternalDeviceDefinition.g:718:2: rule__Graph__Group__7__Impl rule__Graph__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__Graph__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__7"


    // $ANTLR start "rule__Graph__Group__7__Impl"
    // InternalDeviceDefinition.g:725:1: rule__Graph__Group__7__Impl : ( 'title' ) ;
    public final void rule__Graph__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:729:1: ( ( 'title' ) )
            // InternalDeviceDefinition.g:730:1: ( 'title' )
            {
            // InternalDeviceDefinition.g:730:1: ( 'title' )
            // InternalDeviceDefinition.g:731:2: 'title'
            {
             before(grammarAccess.getGraphAccess().getTitleKeyword_7()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getGraphAccess().getTitleKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__7__Impl"


    // $ANTLR start "rule__Graph__Group__8"
    // InternalDeviceDefinition.g:740:1: rule__Graph__Group__8 : rule__Graph__Group__8__Impl rule__Graph__Group__9 ;
    public final void rule__Graph__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:744:1: ( rule__Graph__Group__8__Impl rule__Graph__Group__9 )
            // InternalDeviceDefinition.g:745:2: rule__Graph__Group__8__Impl rule__Graph__Group__9
            {
            pushFollow(FOLLOW_13);
            rule__Graph__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__8"


    // $ANTLR start "rule__Graph__Group__8__Impl"
    // InternalDeviceDefinition.g:752:1: rule__Graph__Group__8__Impl : ( ( rule__Graph__TitleAssignment_8 ) ) ;
    public final void rule__Graph__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:756:1: ( ( ( rule__Graph__TitleAssignment_8 ) ) )
            // InternalDeviceDefinition.g:757:1: ( ( rule__Graph__TitleAssignment_8 ) )
            {
            // InternalDeviceDefinition.g:757:1: ( ( rule__Graph__TitleAssignment_8 ) )
            // InternalDeviceDefinition.g:758:2: ( rule__Graph__TitleAssignment_8 )
            {
             before(grammarAccess.getGraphAccess().getTitleAssignment_8()); 
            // InternalDeviceDefinition.g:759:2: ( rule__Graph__TitleAssignment_8 )
            // InternalDeviceDefinition.g:759:3: rule__Graph__TitleAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Graph__TitleAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getGraphAccess().getTitleAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__8__Impl"


    // $ANTLR start "rule__Graph__Group__9"
    // InternalDeviceDefinition.g:767:1: rule__Graph__Group__9 : rule__Graph__Group__9__Impl rule__Graph__Group__10 ;
    public final void rule__Graph__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:771:1: ( rule__Graph__Group__9__Impl rule__Graph__Group__10 )
            // InternalDeviceDefinition.g:772:2: rule__Graph__Group__9__Impl rule__Graph__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__Graph__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__9"


    // $ANTLR start "rule__Graph__Group__9__Impl"
    // InternalDeviceDefinition.g:779:1: rule__Graph__Group__9__Impl : ( 'xlabel' ) ;
    public final void rule__Graph__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:783:1: ( ( 'xlabel' ) )
            // InternalDeviceDefinition.g:784:1: ( 'xlabel' )
            {
            // InternalDeviceDefinition.g:784:1: ( 'xlabel' )
            // InternalDeviceDefinition.g:785:2: 'xlabel'
            {
             before(grammarAccess.getGraphAccess().getXlabelKeyword_9()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getGraphAccess().getXlabelKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__9__Impl"


    // $ANTLR start "rule__Graph__Group__10"
    // InternalDeviceDefinition.g:794:1: rule__Graph__Group__10 : rule__Graph__Group__10__Impl rule__Graph__Group__11 ;
    public final void rule__Graph__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:798:1: ( rule__Graph__Group__10__Impl rule__Graph__Group__11 )
            // InternalDeviceDefinition.g:799:2: rule__Graph__Group__10__Impl rule__Graph__Group__11
            {
            pushFollow(FOLLOW_14);
            rule__Graph__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__10"


    // $ANTLR start "rule__Graph__Group__10__Impl"
    // InternalDeviceDefinition.g:806:1: rule__Graph__Group__10__Impl : ( ( rule__Graph__XlabelAssignment_10 ) ) ;
    public final void rule__Graph__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:810:1: ( ( ( rule__Graph__XlabelAssignment_10 ) ) )
            // InternalDeviceDefinition.g:811:1: ( ( rule__Graph__XlabelAssignment_10 ) )
            {
            // InternalDeviceDefinition.g:811:1: ( ( rule__Graph__XlabelAssignment_10 ) )
            // InternalDeviceDefinition.g:812:2: ( rule__Graph__XlabelAssignment_10 )
            {
             before(grammarAccess.getGraphAccess().getXlabelAssignment_10()); 
            // InternalDeviceDefinition.g:813:2: ( rule__Graph__XlabelAssignment_10 )
            // InternalDeviceDefinition.g:813:3: rule__Graph__XlabelAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Graph__XlabelAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getGraphAccess().getXlabelAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__10__Impl"


    // $ANTLR start "rule__Graph__Group__11"
    // InternalDeviceDefinition.g:821:1: rule__Graph__Group__11 : rule__Graph__Group__11__Impl rule__Graph__Group__12 ;
    public final void rule__Graph__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:825:1: ( rule__Graph__Group__11__Impl rule__Graph__Group__12 )
            // InternalDeviceDefinition.g:826:2: rule__Graph__Group__11__Impl rule__Graph__Group__12
            {
            pushFollow(FOLLOW_11);
            rule__Graph__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__11"


    // $ANTLR start "rule__Graph__Group__11__Impl"
    // InternalDeviceDefinition.g:833:1: rule__Graph__Group__11__Impl : ( 'ylabel' ) ;
    public final void rule__Graph__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:837:1: ( ( 'ylabel' ) )
            // InternalDeviceDefinition.g:838:1: ( 'ylabel' )
            {
            // InternalDeviceDefinition.g:838:1: ( 'ylabel' )
            // InternalDeviceDefinition.g:839:2: 'ylabel'
            {
             before(grammarAccess.getGraphAccess().getYlabelKeyword_11()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getGraphAccess().getYlabelKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__11__Impl"


    // $ANTLR start "rule__Graph__Group__12"
    // InternalDeviceDefinition.g:848:1: rule__Graph__Group__12 : rule__Graph__Group__12__Impl ;
    public final void rule__Graph__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:852:1: ( rule__Graph__Group__12__Impl )
            // InternalDeviceDefinition.g:853:2: rule__Graph__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Graph__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__12"


    // $ANTLR start "rule__Graph__Group__12__Impl"
    // InternalDeviceDefinition.g:859:1: rule__Graph__Group__12__Impl : ( ( rule__Graph__YlabelAssignment_12 ) ) ;
    public final void rule__Graph__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:863:1: ( ( ( rule__Graph__YlabelAssignment_12 ) ) )
            // InternalDeviceDefinition.g:864:1: ( ( rule__Graph__YlabelAssignment_12 ) )
            {
            // InternalDeviceDefinition.g:864:1: ( ( rule__Graph__YlabelAssignment_12 ) )
            // InternalDeviceDefinition.g:865:2: ( rule__Graph__YlabelAssignment_12 )
            {
             before(grammarAccess.getGraphAccess().getYlabelAssignment_12()); 
            // InternalDeviceDefinition.g:866:2: ( rule__Graph__YlabelAssignment_12 )
            // InternalDeviceDefinition.g:866:3: rule__Graph__YlabelAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Graph__YlabelAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getGraphAccess().getYlabelAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__12__Impl"


    // $ANTLR start "rule__Master__Group__0"
    // InternalDeviceDefinition.g:875:1: rule__Master__Group__0 : rule__Master__Group__0__Impl rule__Master__Group__1 ;
    public final void rule__Master__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:879:1: ( rule__Master__Group__0__Impl rule__Master__Group__1 )
            // InternalDeviceDefinition.g:880:2: rule__Master__Group__0__Impl rule__Master__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Master__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Master__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Master__Group__0"


    // $ANTLR start "rule__Master__Group__0__Impl"
    // InternalDeviceDefinition.g:887:1: rule__Master__Group__0__Impl : ( 'Master' ) ;
    public final void rule__Master__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:891:1: ( ( 'Master' ) )
            // InternalDeviceDefinition.g:892:1: ( 'Master' )
            {
            // InternalDeviceDefinition.g:892:1: ( 'Master' )
            // InternalDeviceDefinition.g:893:2: 'Master'
            {
             before(grammarAccess.getMasterAccess().getMasterKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMasterAccess().getMasterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Master__Group__0__Impl"


    // $ANTLR start "rule__Master__Group__1"
    // InternalDeviceDefinition.g:902:1: rule__Master__Group__1 : rule__Master__Group__1__Impl rule__Master__Group__2 ;
    public final void rule__Master__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:906:1: ( rule__Master__Group__1__Impl rule__Master__Group__2 )
            // InternalDeviceDefinition.g:907:2: rule__Master__Group__1__Impl rule__Master__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Master__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Master__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Master__Group__1"


    // $ANTLR start "rule__Master__Group__1__Impl"
    // InternalDeviceDefinition.g:914:1: rule__Master__Group__1__Impl : ( ( rule__Master__NameAssignment_1 ) ) ;
    public final void rule__Master__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:918:1: ( ( ( rule__Master__NameAssignment_1 ) ) )
            // InternalDeviceDefinition.g:919:1: ( ( rule__Master__NameAssignment_1 ) )
            {
            // InternalDeviceDefinition.g:919:1: ( ( rule__Master__NameAssignment_1 ) )
            // InternalDeviceDefinition.g:920:2: ( rule__Master__NameAssignment_1 )
            {
             before(grammarAccess.getMasterAccess().getNameAssignment_1()); 
            // InternalDeviceDefinition.g:921:2: ( rule__Master__NameAssignment_1 )
            // InternalDeviceDefinition.g:921:3: rule__Master__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Master__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMasterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Master__Group__1__Impl"


    // $ANTLR start "rule__Master__Group__2"
    // InternalDeviceDefinition.g:929:1: rule__Master__Group__2 : rule__Master__Group__2__Impl rule__Master__Group__3 ;
    public final void rule__Master__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:933:1: ( rule__Master__Group__2__Impl rule__Master__Group__3 )
            // InternalDeviceDefinition.g:934:2: rule__Master__Group__2__Impl rule__Master__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Master__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Master__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Master__Group__2"


    // $ANTLR start "rule__Master__Group__2__Impl"
    // InternalDeviceDefinition.g:941:1: rule__Master__Group__2__Impl : ( ':' ) ;
    public final void rule__Master__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:945:1: ( ( ':' ) )
            // InternalDeviceDefinition.g:946:1: ( ':' )
            {
            // InternalDeviceDefinition.g:946:1: ( ':' )
            // InternalDeviceDefinition.g:947:2: ':'
            {
             before(grammarAccess.getMasterAccess().getColonKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMasterAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Master__Group__2__Impl"


    // $ANTLR start "rule__Master__Group__3"
    // InternalDeviceDefinition.g:956:1: rule__Master__Group__3 : rule__Master__Group__3__Impl rule__Master__Group__4 ;
    public final void rule__Master__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:960:1: ( rule__Master__Group__3__Impl rule__Master__Group__4 )
            // InternalDeviceDefinition.g:961:2: rule__Master__Group__3__Impl rule__Master__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Master__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Master__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Master__Group__3"


    // $ANTLR start "rule__Master__Group__3__Impl"
    // InternalDeviceDefinition.g:968:1: rule__Master__Group__3__Impl : ( 'bluetooth' ) ;
    public final void rule__Master__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:972:1: ( ( 'bluetooth' ) )
            // InternalDeviceDefinition.g:973:1: ( 'bluetooth' )
            {
            // InternalDeviceDefinition.g:973:1: ( 'bluetooth' )
            // InternalDeviceDefinition.g:974:2: 'bluetooth'
            {
             before(grammarAccess.getMasterAccess().getBluetoothKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMasterAccess().getBluetoothKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Master__Group__3__Impl"


    // $ANTLR start "rule__Master__Group__4"
    // InternalDeviceDefinition.g:983:1: rule__Master__Group__4 : rule__Master__Group__4__Impl rule__Master__Group__5 ;
    public final void rule__Master__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:987:1: ( rule__Master__Group__4__Impl rule__Master__Group__5 )
            // InternalDeviceDefinition.g:988:2: rule__Master__Group__4__Impl rule__Master__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Master__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Master__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Master__Group__4"


    // $ANTLR start "rule__Master__Group__4__Impl"
    // InternalDeviceDefinition.g:995:1: rule__Master__Group__4__Impl : ( ( rule__Master__BluetoothNameAssignment_4 ) ) ;
    public final void rule__Master__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:999:1: ( ( ( rule__Master__BluetoothNameAssignment_4 ) ) )
            // InternalDeviceDefinition.g:1000:1: ( ( rule__Master__BluetoothNameAssignment_4 ) )
            {
            // InternalDeviceDefinition.g:1000:1: ( ( rule__Master__BluetoothNameAssignment_4 ) )
            // InternalDeviceDefinition.g:1001:2: ( rule__Master__BluetoothNameAssignment_4 )
            {
             before(grammarAccess.getMasterAccess().getBluetoothNameAssignment_4()); 
            // InternalDeviceDefinition.g:1002:2: ( rule__Master__BluetoothNameAssignment_4 )
            // InternalDeviceDefinition.g:1002:3: rule__Master__BluetoothNameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Master__BluetoothNameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMasterAccess().getBluetoothNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Master__Group__4__Impl"


    // $ANTLR start "rule__Master__Group__5"
    // InternalDeviceDefinition.g:1010:1: rule__Master__Group__5 : rule__Master__Group__5__Impl ;
    public final void rule__Master__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1014:1: ( rule__Master__Group__5__Impl )
            // InternalDeviceDefinition.g:1015:2: rule__Master__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Master__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Master__Group__5"


    // $ANTLR start "rule__Master__Group__5__Impl"
    // InternalDeviceDefinition.g:1021:1: rule__Master__Group__5__Impl : ( ( ( rule__Master__SlavesAssignment_5 ) ) ( ( rule__Master__SlavesAssignment_5 )* ) ) ;
    public final void rule__Master__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1025:1: ( ( ( ( rule__Master__SlavesAssignment_5 ) ) ( ( rule__Master__SlavesAssignment_5 )* ) ) )
            // InternalDeviceDefinition.g:1026:1: ( ( ( rule__Master__SlavesAssignment_5 ) ) ( ( rule__Master__SlavesAssignment_5 )* ) )
            {
            // InternalDeviceDefinition.g:1026:1: ( ( ( rule__Master__SlavesAssignment_5 ) ) ( ( rule__Master__SlavesAssignment_5 )* ) )
            // InternalDeviceDefinition.g:1027:2: ( ( rule__Master__SlavesAssignment_5 ) ) ( ( rule__Master__SlavesAssignment_5 )* )
            {
            // InternalDeviceDefinition.g:1027:2: ( ( rule__Master__SlavesAssignment_5 ) )
            // InternalDeviceDefinition.g:1028:3: ( rule__Master__SlavesAssignment_5 )
            {
             before(grammarAccess.getMasterAccess().getSlavesAssignment_5()); 
            // InternalDeviceDefinition.g:1029:3: ( rule__Master__SlavesAssignment_5 )
            // InternalDeviceDefinition.g:1029:4: rule__Master__SlavesAssignment_5
            {
            pushFollow(FOLLOW_17);
            rule__Master__SlavesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMasterAccess().getSlavesAssignment_5()); 

            }

            // InternalDeviceDefinition.g:1032:2: ( ( rule__Master__SlavesAssignment_5 )* )
            // InternalDeviceDefinition.g:1033:3: ( rule__Master__SlavesAssignment_5 )*
            {
             before(grammarAccess.getMasterAccess().getSlavesAssignment_5()); 
            // InternalDeviceDefinition.g:1034:3: ( rule__Master__SlavesAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==32) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDeviceDefinition.g:1034:4: rule__Master__SlavesAssignment_5
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Master__SlavesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getMasterAccess().getSlavesAssignment_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Master__Group__5__Impl"


    // $ANTLR start "rule__Slave__Group__0"
    // InternalDeviceDefinition.g:1044:1: rule__Slave__Group__0 : rule__Slave__Group__0__Impl rule__Slave__Group__1 ;
    public final void rule__Slave__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1048:1: ( rule__Slave__Group__0__Impl rule__Slave__Group__1 )
            // InternalDeviceDefinition.g:1049:2: rule__Slave__Group__0__Impl rule__Slave__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Slave__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Slave__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slave__Group__0"


    // $ANTLR start "rule__Slave__Group__0__Impl"
    // InternalDeviceDefinition.g:1056:1: rule__Slave__Group__0__Impl : ( 'Slave' ) ;
    public final void rule__Slave__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1060:1: ( ( 'Slave' ) )
            // InternalDeviceDefinition.g:1061:1: ( 'Slave' )
            {
            // InternalDeviceDefinition.g:1061:1: ( 'Slave' )
            // InternalDeviceDefinition.g:1062:2: 'Slave'
            {
             before(grammarAccess.getSlaveAccess().getSlaveKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSlaveAccess().getSlaveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slave__Group__0__Impl"


    // $ANTLR start "rule__Slave__Group__1"
    // InternalDeviceDefinition.g:1071:1: rule__Slave__Group__1 : rule__Slave__Group__1__Impl rule__Slave__Group__2 ;
    public final void rule__Slave__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1075:1: ( rule__Slave__Group__1__Impl rule__Slave__Group__2 )
            // InternalDeviceDefinition.g:1076:2: rule__Slave__Group__1__Impl rule__Slave__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Slave__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Slave__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slave__Group__1"


    // $ANTLR start "rule__Slave__Group__1__Impl"
    // InternalDeviceDefinition.g:1083:1: rule__Slave__Group__1__Impl : ( ( rule__Slave__NameAssignment_1 ) ) ;
    public final void rule__Slave__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1087:1: ( ( ( rule__Slave__NameAssignment_1 ) ) )
            // InternalDeviceDefinition.g:1088:1: ( ( rule__Slave__NameAssignment_1 ) )
            {
            // InternalDeviceDefinition.g:1088:1: ( ( rule__Slave__NameAssignment_1 ) )
            // InternalDeviceDefinition.g:1089:2: ( rule__Slave__NameAssignment_1 )
            {
             before(grammarAccess.getSlaveAccess().getNameAssignment_1()); 
            // InternalDeviceDefinition.g:1090:2: ( rule__Slave__NameAssignment_1 )
            // InternalDeviceDefinition.g:1090:3: rule__Slave__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Slave__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSlaveAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slave__Group__1__Impl"


    // $ANTLR start "rule__Slave__Group__2"
    // InternalDeviceDefinition.g:1098:1: rule__Slave__Group__2 : rule__Slave__Group__2__Impl rule__Slave__Group__3 ;
    public final void rule__Slave__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1102:1: ( rule__Slave__Group__2__Impl rule__Slave__Group__3 )
            // InternalDeviceDefinition.g:1103:2: rule__Slave__Group__2__Impl rule__Slave__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Slave__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Slave__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slave__Group__2"


    // $ANTLR start "rule__Slave__Group__2__Impl"
    // InternalDeviceDefinition.g:1110:1: rule__Slave__Group__2__Impl : ( ':' ) ;
    public final void rule__Slave__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1114:1: ( ( ':' ) )
            // InternalDeviceDefinition.g:1115:1: ( ':' )
            {
            // InternalDeviceDefinition.g:1115:1: ( ':' )
            // InternalDeviceDefinition.g:1116:2: ':'
            {
             before(grammarAccess.getSlaveAccess().getColonKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSlaveAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slave__Group__2__Impl"


    // $ANTLR start "rule__Slave__Group__3"
    // InternalDeviceDefinition.g:1125:1: rule__Slave__Group__3 : rule__Slave__Group__3__Impl rule__Slave__Group__4 ;
    public final void rule__Slave__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1129:1: ( rule__Slave__Group__3__Impl rule__Slave__Group__4 )
            // InternalDeviceDefinition.g:1130:2: rule__Slave__Group__3__Impl rule__Slave__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Slave__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Slave__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slave__Group__3"


    // $ANTLR start "rule__Slave__Group__3__Impl"
    // InternalDeviceDefinition.g:1137:1: rule__Slave__Group__3__Impl : ( 'bluetooth' ) ;
    public final void rule__Slave__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1141:1: ( ( 'bluetooth' ) )
            // InternalDeviceDefinition.g:1142:1: ( 'bluetooth' )
            {
            // InternalDeviceDefinition.g:1142:1: ( 'bluetooth' )
            // InternalDeviceDefinition.g:1143:2: 'bluetooth'
            {
             before(grammarAccess.getSlaveAccess().getBluetoothKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSlaveAccess().getBluetoothKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slave__Group__3__Impl"


    // $ANTLR start "rule__Slave__Group__4"
    // InternalDeviceDefinition.g:1152:1: rule__Slave__Group__4 : rule__Slave__Group__4__Impl rule__Slave__Group__5 ;
    public final void rule__Slave__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1156:1: ( rule__Slave__Group__4__Impl rule__Slave__Group__5 )
            // InternalDeviceDefinition.g:1157:2: rule__Slave__Group__4__Impl rule__Slave__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Slave__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Slave__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slave__Group__4"


    // $ANTLR start "rule__Slave__Group__4__Impl"
    // InternalDeviceDefinition.g:1164:1: rule__Slave__Group__4__Impl : ( ( rule__Slave__BluetoothNameAssignment_4 ) ) ;
    public final void rule__Slave__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1168:1: ( ( ( rule__Slave__BluetoothNameAssignment_4 ) ) )
            // InternalDeviceDefinition.g:1169:1: ( ( rule__Slave__BluetoothNameAssignment_4 ) )
            {
            // InternalDeviceDefinition.g:1169:1: ( ( rule__Slave__BluetoothNameAssignment_4 ) )
            // InternalDeviceDefinition.g:1170:2: ( rule__Slave__BluetoothNameAssignment_4 )
            {
             before(grammarAccess.getSlaveAccess().getBluetoothNameAssignment_4()); 
            // InternalDeviceDefinition.g:1171:2: ( rule__Slave__BluetoothNameAssignment_4 )
            // InternalDeviceDefinition.g:1171:3: rule__Slave__BluetoothNameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Slave__BluetoothNameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSlaveAccess().getBluetoothNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slave__Group__4__Impl"


    // $ANTLR start "rule__Slave__Group__5"
    // InternalDeviceDefinition.g:1179:1: rule__Slave__Group__5 : rule__Slave__Group__5__Impl ;
    public final void rule__Slave__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1183:1: ( rule__Slave__Group__5__Impl )
            // InternalDeviceDefinition.g:1184:2: rule__Slave__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Slave__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slave__Group__5"


    // $ANTLR start "rule__Slave__Group__5__Impl"
    // InternalDeviceDefinition.g:1190:1: rule__Slave__Group__5__Impl : ( ( rule__Slave__DevicesAssignment_5 )* ) ;
    public final void rule__Slave__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1194:1: ( ( ( rule__Slave__DevicesAssignment_5 )* ) )
            // InternalDeviceDefinition.g:1195:1: ( ( rule__Slave__DevicesAssignment_5 )* )
            {
            // InternalDeviceDefinition.g:1195:1: ( ( rule__Slave__DevicesAssignment_5 )* )
            // InternalDeviceDefinition.g:1196:2: ( rule__Slave__DevicesAssignment_5 )*
            {
             before(grammarAccess.getSlaveAccess().getDevicesAssignment_5()); 
            // InternalDeviceDefinition.g:1197:2: ( rule__Slave__DevicesAssignment_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==33||LA7_0==39) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDeviceDefinition.g:1197:3: rule__Slave__DevicesAssignment_5
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Slave__DevicesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSlaveAccess().getDevicesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slave__Group__5__Impl"


    // $ANTLR start "rule__Sensor__Group__0"
    // InternalDeviceDefinition.g:1206:1: rule__Sensor__Group__0 : rule__Sensor__Group__0__Impl rule__Sensor__Group__1 ;
    public final void rule__Sensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1210:1: ( rule__Sensor__Group__0__Impl rule__Sensor__Group__1 )
            // InternalDeviceDefinition.g:1211:2: rule__Sensor__Group__0__Impl rule__Sensor__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Sensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__0"


    // $ANTLR start "rule__Sensor__Group__0__Impl"
    // InternalDeviceDefinition.g:1218:1: rule__Sensor__Group__0__Impl : ( 'Sensor' ) ;
    public final void rule__Sensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1222:1: ( ( 'Sensor' ) )
            // InternalDeviceDefinition.g:1223:1: ( 'Sensor' )
            {
            // InternalDeviceDefinition.g:1223:1: ( 'Sensor' )
            // InternalDeviceDefinition.g:1224:2: 'Sensor'
            {
             before(grammarAccess.getSensorAccess().getSensorKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getSensorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__0__Impl"


    // $ANTLR start "rule__Sensor__Group__1"
    // InternalDeviceDefinition.g:1233:1: rule__Sensor__Group__1 : rule__Sensor__Group__1__Impl rule__Sensor__Group__2 ;
    public final void rule__Sensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1237:1: ( rule__Sensor__Group__1__Impl rule__Sensor__Group__2 )
            // InternalDeviceDefinition.g:1238:2: rule__Sensor__Group__1__Impl rule__Sensor__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Sensor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__1"


    // $ANTLR start "rule__Sensor__Group__1__Impl"
    // InternalDeviceDefinition.g:1245:1: rule__Sensor__Group__1__Impl : ( ( rule__Sensor__TypeAssignment_1 ) ) ;
    public final void rule__Sensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1249:1: ( ( ( rule__Sensor__TypeAssignment_1 ) ) )
            // InternalDeviceDefinition.g:1250:1: ( ( rule__Sensor__TypeAssignment_1 ) )
            {
            // InternalDeviceDefinition.g:1250:1: ( ( rule__Sensor__TypeAssignment_1 ) )
            // InternalDeviceDefinition.g:1251:2: ( rule__Sensor__TypeAssignment_1 )
            {
             before(grammarAccess.getSensorAccess().getTypeAssignment_1()); 
            // InternalDeviceDefinition.g:1252:2: ( rule__Sensor__TypeAssignment_1 )
            // InternalDeviceDefinition.g:1252:3: rule__Sensor__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__1__Impl"


    // $ANTLR start "rule__Sensor__Group__2"
    // InternalDeviceDefinition.g:1260:1: rule__Sensor__Group__2 : rule__Sensor__Group__2__Impl rule__Sensor__Group__3 ;
    public final void rule__Sensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1264:1: ( rule__Sensor__Group__2__Impl rule__Sensor__Group__3 )
            // InternalDeviceDefinition.g:1265:2: rule__Sensor__Group__2__Impl rule__Sensor__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Sensor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__2"


    // $ANTLR start "rule__Sensor__Group__2__Impl"
    // InternalDeviceDefinition.g:1272:1: rule__Sensor__Group__2__Impl : ( ':' ) ;
    public final void rule__Sensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1276:1: ( ( ':' ) )
            // InternalDeviceDefinition.g:1277:1: ( ':' )
            {
            // InternalDeviceDefinition.g:1277:1: ( ':' )
            // InternalDeviceDefinition.g:1278:2: ':'
            {
             before(grammarAccess.getSensorAccess().getColonKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__2__Impl"


    // $ANTLR start "rule__Sensor__Group__3"
    // InternalDeviceDefinition.g:1287:1: rule__Sensor__Group__3 : rule__Sensor__Group__3__Impl rule__Sensor__Group__4 ;
    public final void rule__Sensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1291:1: ( rule__Sensor__Group__3__Impl rule__Sensor__Group__4 )
            // InternalDeviceDefinition.g:1292:2: rule__Sensor__Group__3__Impl rule__Sensor__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Sensor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__3"


    // $ANTLR start "rule__Sensor__Group__3__Impl"
    // InternalDeviceDefinition.g:1299:1: rule__Sensor__Group__3__Impl : ( 'pins' ) ;
    public final void rule__Sensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1303:1: ( ( 'pins' ) )
            // InternalDeviceDefinition.g:1304:1: ( 'pins' )
            {
            // InternalDeviceDefinition.g:1304:1: ( 'pins' )
            // InternalDeviceDefinition.g:1305:2: 'pins'
            {
             before(grammarAccess.getSensorAccess().getPinsKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getPinsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__3__Impl"


    // $ANTLR start "rule__Sensor__Group__4"
    // InternalDeviceDefinition.g:1314:1: rule__Sensor__Group__4 : rule__Sensor__Group__4__Impl rule__Sensor__Group__5 ;
    public final void rule__Sensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1318:1: ( rule__Sensor__Group__4__Impl rule__Sensor__Group__5 )
            // InternalDeviceDefinition.g:1319:2: rule__Sensor__Group__4__Impl rule__Sensor__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Sensor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__4"


    // $ANTLR start "rule__Sensor__Group__4__Impl"
    // InternalDeviceDefinition.g:1326:1: rule__Sensor__Group__4__Impl : ( '(' ) ;
    public final void rule__Sensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1330:1: ( ( '(' ) )
            // InternalDeviceDefinition.g:1331:1: ( '(' )
            {
            // InternalDeviceDefinition.g:1331:1: ( '(' )
            // InternalDeviceDefinition.g:1332:2: '('
            {
             before(grammarAccess.getSensorAccess().getLeftParenthesisKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__4__Impl"


    // $ANTLR start "rule__Sensor__Group__5"
    // InternalDeviceDefinition.g:1341:1: rule__Sensor__Group__5 : rule__Sensor__Group__5__Impl rule__Sensor__Group__6 ;
    public final void rule__Sensor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1345:1: ( rule__Sensor__Group__5__Impl rule__Sensor__Group__6 )
            // InternalDeviceDefinition.g:1346:2: rule__Sensor__Group__5__Impl rule__Sensor__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Sensor__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__5"


    // $ANTLR start "rule__Sensor__Group__5__Impl"
    // InternalDeviceDefinition.g:1353:1: rule__Sensor__Group__5__Impl : ( ( rule__Sensor__PinsAssignment_5 )* ) ;
    public final void rule__Sensor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1357:1: ( ( ( rule__Sensor__PinsAssignment_5 )* ) )
            // InternalDeviceDefinition.g:1358:1: ( ( rule__Sensor__PinsAssignment_5 )* )
            {
            // InternalDeviceDefinition.g:1358:1: ( ( rule__Sensor__PinsAssignment_5 )* )
            // InternalDeviceDefinition.g:1359:2: ( rule__Sensor__PinsAssignment_5 )*
            {
             before(grammarAccess.getSensorAccess().getPinsAssignment_5()); 
            // InternalDeviceDefinition.g:1360:2: ( rule__Sensor__PinsAssignment_5 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_INT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDeviceDefinition.g:1360:3: rule__Sensor__PinsAssignment_5
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Sensor__PinsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSensorAccess().getPinsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__5__Impl"


    // $ANTLR start "rule__Sensor__Group__6"
    // InternalDeviceDefinition.g:1368:1: rule__Sensor__Group__6 : rule__Sensor__Group__6__Impl rule__Sensor__Group__7 ;
    public final void rule__Sensor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1372:1: ( rule__Sensor__Group__6__Impl rule__Sensor__Group__7 )
            // InternalDeviceDefinition.g:1373:2: rule__Sensor__Group__6__Impl rule__Sensor__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__Sensor__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__6"


    // $ANTLR start "rule__Sensor__Group__6__Impl"
    // InternalDeviceDefinition.g:1380:1: rule__Sensor__Group__6__Impl : ( ( rule__Sensor__Group_6__0 )* ) ;
    public final void rule__Sensor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1384:1: ( ( ( rule__Sensor__Group_6__0 )* ) )
            // InternalDeviceDefinition.g:1385:1: ( ( rule__Sensor__Group_6__0 )* )
            {
            // InternalDeviceDefinition.g:1385:1: ( ( rule__Sensor__Group_6__0 )* )
            // InternalDeviceDefinition.g:1386:2: ( rule__Sensor__Group_6__0 )*
            {
             before(grammarAccess.getSensorAccess().getGroup_6()); 
            // InternalDeviceDefinition.g:1387:2: ( rule__Sensor__Group_6__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==38) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDeviceDefinition.g:1387:3: rule__Sensor__Group_6__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Sensor__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSensorAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__6__Impl"


    // $ANTLR start "rule__Sensor__Group__7"
    // InternalDeviceDefinition.g:1395:1: rule__Sensor__Group__7 : rule__Sensor__Group__7__Impl rule__Sensor__Group__8 ;
    public final void rule__Sensor__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1399:1: ( rule__Sensor__Group__7__Impl rule__Sensor__Group__8 )
            // InternalDeviceDefinition.g:1400:2: rule__Sensor__Group__7__Impl rule__Sensor__Group__8
            {
            pushFollow(FOLLOW_26);
            rule__Sensor__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__7"


    // $ANTLR start "rule__Sensor__Group__7__Impl"
    // InternalDeviceDefinition.g:1407:1: rule__Sensor__Group__7__Impl : ( ')' ) ;
    public final void rule__Sensor__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1411:1: ( ( ')' ) )
            // InternalDeviceDefinition.g:1412:1: ( ')' )
            {
            // InternalDeviceDefinition.g:1412:1: ( ')' )
            // InternalDeviceDefinition.g:1413:2: ')'
            {
             before(grammarAccess.getSensorAccess().getRightParenthesisKeyword_7()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__7__Impl"


    // $ANTLR start "rule__Sensor__Group__8"
    // InternalDeviceDefinition.g:1422:1: rule__Sensor__Group__8 : rule__Sensor__Group__8__Impl rule__Sensor__Group__9 ;
    public final void rule__Sensor__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1426:1: ( rule__Sensor__Group__8__Impl rule__Sensor__Group__9 )
            // InternalDeviceDefinition.g:1427:2: rule__Sensor__Group__8__Impl rule__Sensor__Group__9
            {
            pushFollow(FOLLOW_3);
            rule__Sensor__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__8"


    // $ANTLR start "rule__Sensor__Group__8__Impl"
    // InternalDeviceDefinition.g:1434:1: rule__Sensor__Group__8__Impl : ( 'graph' ) ;
    public final void rule__Sensor__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1438:1: ( ( 'graph' ) )
            // InternalDeviceDefinition.g:1439:1: ( 'graph' )
            {
            // InternalDeviceDefinition.g:1439:1: ( 'graph' )
            // InternalDeviceDefinition.g:1440:2: 'graph'
            {
             before(grammarAccess.getSensorAccess().getGraphKeyword_8()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getGraphKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__8__Impl"


    // $ANTLR start "rule__Sensor__Group__9"
    // InternalDeviceDefinition.g:1449:1: rule__Sensor__Group__9 : rule__Sensor__Group__9__Impl ;
    public final void rule__Sensor__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1453:1: ( rule__Sensor__Group__9__Impl )
            // InternalDeviceDefinition.g:1454:2: rule__Sensor__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__9"


    // $ANTLR start "rule__Sensor__Group__9__Impl"
    // InternalDeviceDefinition.g:1460:1: rule__Sensor__Group__9__Impl : ( ( rule__Sensor__GraphAssignment_9 ) ) ;
    public final void rule__Sensor__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1464:1: ( ( ( rule__Sensor__GraphAssignment_9 ) ) )
            // InternalDeviceDefinition.g:1465:1: ( ( rule__Sensor__GraphAssignment_9 ) )
            {
            // InternalDeviceDefinition.g:1465:1: ( ( rule__Sensor__GraphAssignment_9 ) )
            // InternalDeviceDefinition.g:1466:2: ( rule__Sensor__GraphAssignment_9 )
            {
             before(grammarAccess.getSensorAccess().getGraphAssignment_9()); 
            // InternalDeviceDefinition.g:1467:2: ( rule__Sensor__GraphAssignment_9 )
            // InternalDeviceDefinition.g:1467:3: rule__Sensor__GraphAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__GraphAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getGraphAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__9__Impl"


    // $ANTLR start "rule__Sensor__Group_6__0"
    // InternalDeviceDefinition.g:1476:1: rule__Sensor__Group_6__0 : rule__Sensor__Group_6__0__Impl rule__Sensor__Group_6__1 ;
    public final void rule__Sensor__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1480:1: ( rule__Sensor__Group_6__0__Impl rule__Sensor__Group_6__1 )
            // InternalDeviceDefinition.g:1481:2: rule__Sensor__Group_6__0__Impl rule__Sensor__Group_6__1
            {
            pushFollow(FOLLOW_27);
            rule__Sensor__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_6__0"


    // $ANTLR start "rule__Sensor__Group_6__0__Impl"
    // InternalDeviceDefinition.g:1488:1: rule__Sensor__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Sensor__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1492:1: ( ( ',' ) )
            // InternalDeviceDefinition.g:1493:1: ( ',' )
            {
            // InternalDeviceDefinition.g:1493:1: ( ',' )
            // InternalDeviceDefinition.g:1494:2: ','
            {
             before(grammarAccess.getSensorAccess().getCommaKeyword_6_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_6__0__Impl"


    // $ANTLR start "rule__Sensor__Group_6__1"
    // InternalDeviceDefinition.g:1503:1: rule__Sensor__Group_6__1 : rule__Sensor__Group_6__1__Impl ;
    public final void rule__Sensor__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1507:1: ( rule__Sensor__Group_6__1__Impl )
            // InternalDeviceDefinition.g:1508:2: rule__Sensor__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_6__1"


    // $ANTLR start "rule__Sensor__Group_6__1__Impl"
    // InternalDeviceDefinition.g:1514:1: rule__Sensor__Group_6__1__Impl : ( ( rule__Sensor__PinsAssignment_6_1 ) ) ;
    public final void rule__Sensor__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1518:1: ( ( ( rule__Sensor__PinsAssignment_6_1 ) ) )
            // InternalDeviceDefinition.g:1519:1: ( ( rule__Sensor__PinsAssignment_6_1 ) )
            {
            // InternalDeviceDefinition.g:1519:1: ( ( rule__Sensor__PinsAssignment_6_1 ) )
            // InternalDeviceDefinition.g:1520:2: ( rule__Sensor__PinsAssignment_6_1 )
            {
             before(grammarAccess.getSensorAccess().getPinsAssignment_6_1()); 
            // InternalDeviceDefinition.g:1521:2: ( rule__Sensor__PinsAssignment_6_1 )
            // InternalDeviceDefinition.g:1521:3: rule__Sensor__PinsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__PinsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getPinsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_6__1__Impl"


    // $ANTLR start "rule__Actuator__Group__0"
    // InternalDeviceDefinition.g:1530:1: rule__Actuator__Group__0 : rule__Actuator__Group__0__Impl rule__Actuator__Group__1 ;
    public final void rule__Actuator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1534:1: ( rule__Actuator__Group__0__Impl rule__Actuator__Group__1 )
            // InternalDeviceDefinition.g:1535:2: rule__Actuator__Group__0__Impl rule__Actuator__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Actuator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actuator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__0"


    // $ANTLR start "rule__Actuator__Group__0__Impl"
    // InternalDeviceDefinition.g:1542:1: rule__Actuator__Group__0__Impl : ( 'Actuator' ) ;
    public final void rule__Actuator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1546:1: ( ( 'Actuator' ) )
            // InternalDeviceDefinition.g:1547:1: ( 'Actuator' )
            {
            // InternalDeviceDefinition.g:1547:1: ( 'Actuator' )
            // InternalDeviceDefinition.g:1548:2: 'Actuator'
            {
             before(grammarAccess.getActuatorAccess().getActuatorKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getActuatorAccess().getActuatorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__0__Impl"


    // $ANTLR start "rule__Actuator__Group__1"
    // InternalDeviceDefinition.g:1557:1: rule__Actuator__Group__1 : rule__Actuator__Group__1__Impl rule__Actuator__Group__2 ;
    public final void rule__Actuator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1561:1: ( rule__Actuator__Group__1__Impl rule__Actuator__Group__2 )
            // InternalDeviceDefinition.g:1562:2: rule__Actuator__Group__1__Impl rule__Actuator__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Actuator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actuator__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__1"


    // $ANTLR start "rule__Actuator__Group__1__Impl"
    // InternalDeviceDefinition.g:1569:1: rule__Actuator__Group__1__Impl : ( ( rule__Actuator__TypeAssignment_1 ) ) ;
    public final void rule__Actuator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1573:1: ( ( ( rule__Actuator__TypeAssignment_1 ) ) )
            // InternalDeviceDefinition.g:1574:1: ( ( rule__Actuator__TypeAssignment_1 ) )
            {
            // InternalDeviceDefinition.g:1574:1: ( ( rule__Actuator__TypeAssignment_1 ) )
            // InternalDeviceDefinition.g:1575:2: ( rule__Actuator__TypeAssignment_1 )
            {
             before(grammarAccess.getActuatorAccess().getTypeAssignment_1()); 
            // InternalDeviceDefinition.g:1576:2: ( rule__Actuator__TypeAssignment_1 )
            // InternalDeviceDefinition.g:1576:3: rule__Actuator__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Actuator__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActuatorAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__1__Impl"


    // $ANTLR start "rule__Actuator__Group__2"
    // InternalDeviceDefinition.g:1584:1: rule__Actuator__Group__2 : rule__Actuator__Group__2__Impl rule__Actuator__Group__3 ;
    public final void rule__Actuator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1588:1: ( rule__Actuator__Group__2__Impl rule__Actuator__Group__3 )
            // InternalDeviceDefinition.g:1589:2: rule__Actuator__Group__2__Impl rule__Actuator__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Actuator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actuator__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__2"


    // $ANTLR start "rule__Actuator__Group__2__Impl"
    // InternalDeviceDefinition.g:1596:1: rule__Actuator__Group__2__Impl : ( ':' ) ;
    public final void rule__Actuator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1600:1: ( ( ':' ) )
            // InternalDeviceDefinition.g:1601:1: ( ':' )
            {
            // InternalDeviceDefinition.g:1601:1: ( ':' )
            // InternalDeviceDefinition.g:1602:2: ':'
            {
             before(grammarAccess.getActuatorAccess().getColonKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getActuatorAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__2__Impl"


    // $ANTLR start "rule__Actuator__Group__3"
    // InternalDeviceDefinition.g:1611:1: rule__Actuator__Group__3 : rule__Actuator__Group__3__Impl rule__Actuator__Group__4 ;
    public final void rule__Actuator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1615:1: ( rule__Actuator__Group__3__Impl rule__Actuator__Group__4 )
            // InternalDeviceDefinition.g:1616:2: rule__Actuator__Group__3__Impl rule__Actuator__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Actuator__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actuator__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__3"


    // $ANTLR start "rule__Actuator__Group__3__Impl"
    // InternalDeviceDefinition.g:1623:1: rule__Actuator__Group__3__Impl : ( 'pins' ) ;
    public final void rule__Actuator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1627:1: ( ( 'pins' ) )
            // InternalDeviceDefinition.g:1628:1: ( 'pins' )
            {
            // InternalDeviceDefinition.g:1628:1: ( 'pins' )
            // InternalDeviceDefinition.g:1629:2: 'pins'
            {
             before(grammarAccess.getActuatorAccess().getPinsKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getActuatorAccess().getPinsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__3__Impl"


    // $ANTLR start "rule__Actuator__Group__4"
    // InternalDeviceDefinition.g:1638:1: rule__Actuator__Group__4 : rule__Actuator__Group__4__Impl rule__Actuator__Group__5 ;
    public final void rule__Actuator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1642:1: ( rule__Actuator__Group__4__Impl rule__Actuator__Group__5 )
            // InternalDeviceDefinition.g:1643:2: rule__Actuator__Group__4__Impl rule__Actuator__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Actuator__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actuator__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__4"


    // $ANTLR start "rule__Actuator__Group__4__Impl"
    // InternalDeviceDefinition.g:1650:1: rule__Actuator__Group__4__Impl : ( '(' ) ;
    public final void rule__Actuator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1654:1: ( ( '(' ) )
            // InternalDeviceDefinition.g:1655:1: ( '(' )
            {
            // InternalDeviceDefinition.g:1655:1: ( '(' )
            // InternalDeviceDefinition.g:1656:2: '('
            {
             before(grammarAccess.getActuatorAccess().getLeftParenthesisKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getActuatorAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__4__Impl"


    // $ANTLR start "rule__Actuator__Group__5"
    // InternalDeviceDefinition.g:1665:1: rule__Actuator__Group__5 : rule__Actuator__Group__5__Impl rule__Actuator__Group__6 ;
    public final void rule__Actuator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1669:1: ( rule__Actuator__Group__5__Impl rule__Actuator__Group__6 )
            // InternalDeviceDefinition.g:1670:2: rule__Actuator__Group__5__Impl rule__Actuator__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Actuator__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actuator__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__5"


    // $ANTLR start "rule__Actuator__Group__5__Impl"
    // InternalDeviceDefinition.g:1677:1: rule__Actuator__Group__5__Impl : ( ( rule__Actuator__PinsAssignment_5 )* ) ;
    public final void rule__Actuator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1681:1: ( ( ( rule__Actuator__PinsAssignment_5 )* ) )
            // InternalDeviceDefinition.g:1682:1: ( ( rule__Actuator__PinsAssignment_5 )* )
            {
            // InternalDeviceDefinition.g:1682:1: ( ( rule__Actuator__PinsAssignment_5 )* )
            // InternalDeviceDefinition.g:1683:2: ( rule__Actuator__PinsAssignment_5 )*
            {
             before(grammarAccess.getActuatorAccess().getPinsAssignment_5()); 
            // InternalDeviceDefinition.g:1684:2: ( rule__Actuator__PinsAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_INT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDeviceDefinition.g:1684:3: rule__Actuator__PinsAssignment_5
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Actuator__PinsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getActuatorAccess().getPinsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__5__Impl"


    // $ANTLR start "rule__Actuator__Group__6"
    // InternalDeviceDefinition.g:1692:1: rule__Actuator__Group__6 : rule__Actuator__Group__6__Impl rule__Actuator__Group__7 ;
    public final void rule__Actuator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1696:1: ( rule__Actuator__Group__6__Impl rule__Actuator__Group__7 )
            // InternalDeviceDefinition.g:1697:2: rule__Actuator__Group__6__Impl rule__Actuator__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__Actuator__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actuator__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__6"


    // $ANTLR start "rule__Actuator__Group__6__Impl"
    // InternalDeviceDefinition.g:1704:1: rule__Actuator__Group__6__Impl : ( ( rule__Actuator__Group_6__0 )* ) ;
    public final void rule__Actuator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1708:1: ( ( ( rule__Actuator__Group_6__0 )* ) )
            // InternalDeviceDefinition.g:1709:1: ( ( rule__Actuator__Group_6__0 )* )
            {
            // InternalDeviceDefinition.g:1709:1: ( ( rule__Actuator__Group_6__0 )* )
            // InternalDeviceDefinition.g:1710:2: ( rule__Actuator__Group_6__0 )*
            {
             before(grammarAccess.getActuatorAccess().getGroup_6()); 
            // InternalDeviceDefinition.g:1711:2: ( rule__Actuator__Group_6__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==38) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDeviceDefinition.g:1711:3: rule__Actuator__Group_6__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Actuator__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getActuatorAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__6__Impl"


    // $ANTLR start "rule__Actuator__Group__7"
    // InternalDeviceDefinition.g:1719:1: rule__Actuator__Group__7 : rule__Actuator__Group__7__Impl rule__Actuator__Group__8 ;
    public final void rule__Actuator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1723:1: ( rule__Actuator__Group__7__Impl rule__Actuator__Group__8 )
            // InternalDeviceDefinition.g:1724:2: rule__Actuator__Group__7__Impl rule__Actuator__Group__8
            {
            pushFollow(FOLLOW_29);
            rule__Actuator__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actuator__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__7"


    // $ANTLR start "rule__Actuator__Group__7__Impl"
    // InternalDeviceDefinition.g:1731:1: rule__Actuator__Group__7__Impl : ( ')' ) ;
    public final void rule__Actuator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1735:1: ( ( ')' ) )
            // InternalDeviceDefinition.g:1736:1: ( ')' )
            {
            // InternalDeviceDefinition.g:1736:1: ( ')' )
            // InternalDeviceDefinition.g:1737:2: ')'
            {
             before(grammarAccess.getActuatorAccess().getRightParenthesisKeyword_7()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getActuatorAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__7__Impl"


    // $ANTLR start "rule__Actuator__Group__8"
    // InternalDeviceDefinition.g:1746:1: rule__Actuator__Group__8 : rule__Actuator__Group__8__Impl ;
    public final void rule__Actuator__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1750:1: ( rule__Actuator__Group__8__Impl )
            // InternalDeviceDefinition.g:1751:2: rule__Actuator__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actuator__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__8"


    // $ANTLR start "rule__Actuator__Group__8__Impl"
    // InternalDeviceDefinition.g:1757:1: rule__Actuator__Group__8__Impl : ( ( rule__Actuator__SettingsAssignment_8 )* ) ;
    public final void rule__Actuator__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1761:1: ( ( ( rule__Actuator__SettingsAssignment_8 )* ) )
            // InternalDeviceDefinition.g:1762:1: ( ( rule__Actuator__SettingsAssignment_8 )* )
            {
            // InternalDeviceDefinition.g:1762:1: ( ( rule__Actuator__SettingsAssignment_8 )* )
            // InternalDeviceDefinition.g:1763:2: ( rule__Actuator__SettingsAssignment_8 )*
            {
             before(grammarAccess.getActuatorAccess().getSettingsAssignment_8()); 
            // InternalDeviceDefinition.g:1764:2: ( rule__Actuator__SettingsAssignment_8 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==40) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDeviceDefinition.g:1764:3: rule__Actuator__SettingsAssignment_8
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Actuator__SettingsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getActuatorAccess().getSettingsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__8__Impl"


    // $ANTLR start "rule__Actuator__Group_6__0"
    // InternalDeviceDefinition.g:1773:1: rule__Actuator__Group_6__0 : rule__Actuator__Group_6__0__Impl rule__Actuator__Group_6__1 ;
    public final void rule__Actuator__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1777:1: ( rule__Actuator__Group_6__0__Impl rule__Actuator__Group_6__1 )
            // InternalDeviceDefinition.g:1778:2: rule__Actuator__Group_6__0__Impl rule__Actuator__Group_6__1
            {
            pushFollow(FOLLOW_27);
            rule__Actuator__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actuator__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group_6__0"


    // $ANTLR start "rule__Actuator__Group_6__0__Impl"
    // InternalDeviceDefinition.g:1785:1: rule__Actuator__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Actuator__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1789:1: ( ( ',' ) )
            // InternalDeviceDefinition.g:1790:1: ( ',' )
            {
            // InternalDeviceDefinition.g:1790:1: ( ',' )
            // InternalDeviceDefinition.g:1791:2: ','
            {
             before(grammarAccess.getActuatorAccess().getCommaKeyword_6_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getActuatorAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group_6__0__Impl"


    // $ANTLR start "rule__Actuator__Group_6__1"
    // InternalDeviceDefinition.g:1800:1: rule__Actuator__Group_6__1 : rule__Actuator__Group_6__1__Impl ;
    public final void rule__Actuator__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1804:1: ( rule__Actuator__Group_6__1__Impl )
            // InternalDeviceDefinition.g:1805:2: rule__Actuator__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actuator__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group_6__1"


    // $ANTLR start "rule__Actuator__Group_6__1__Impl"
    // InternalDeviceDefinition.g:1811:1: rule__Actuator__Group_6__1__Impl : ( ( rule__Actuator__PinsAssignment_6_1 ) ) ;
    public final void rule__Actuator__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1815:1: ( ( ( rule__Actuator__PinsAssignment_6_1 ) ) )
            // InternalDeviceDefinition.g:1816:1: ( ( rule__Actuator__PinsAssignment_6_1 ) )
            {
            // InternalDeviceDefinition.g:1816:1: ( ( rule__Actuator__PinsAssignment_6_1 ) )
            // InternalDeviceDefinition.g:1817:2: ( rule__Actuator__PinsAssignment_6_1 )
            {
             before(grammarAccess.getActuatorAccess().getPinsAssignment_6_1()); 
            // InternalDeviceDefinition.g:1818:2: ( rule__Actuator__PinsAssignment_6_1 )
            // InternalDeviceDefinition.g:1818:3: rule__Actuator__PinsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Actuator__PinsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getActuatorAccess().getPinsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group_6__1__Impl"


    // $ANTLR start "rule__Setting__Group__0"
    // InternalDeviceDefinition.g:1827:1: rule__Setting__Group__0 : rule__Setting__Group__0__Impl rule__Setting__Group__1 ;
    public final void rule__Setting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1831:1: ( rule__Setting__Group__0__Impl rule__Setting__Group__1 )
            // InternalDeviceDefinition.g:1832:2: rule__Setting__Group__0__Impl rule__Setting__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Setting__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Setting__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__0"


    // $ANTLR start "rule__Setting__Group__0__Impl"
    // InternalDeviceDefinition.g:1839:1: rule__Setting__Group__0__Impl : ( 'Setting' ) ;
    public final void rule__Setting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1843:1: ( ( 'Setting' ) )
            // InternalDeviceDefinition.g:1844:1: ( 'Setting' )
            {
            // InternalDeviceDefinition.g:1844:1: ( 'Setting' )
            // InternalDeviceDefinition.g:1845:2: 'Setting'
            {
             before(grammarAccess.getSettingAccess().getSettingKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSettingAccess().getSettingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__0__Impl"


    // $ANTLR start "rule__Setting__Group__1"
    // InternalDeviceDefinition.g:1854:1: rule__Setting__Group__1 : rule__Setting__Group__1__Impl rule__Setting__Group__2 ;
    public final void rule__Setting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1858:1: ( rule__Setting__Group__1__Impl rule__Setting__Group__2 )
            // InternalDeviceDefinition.g:1859:2: rule__Setting__Group__1__Impl rule__Setting__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Setting__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Setting__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__1"


    // $ANTLR start "rule__Setting__Group__1__Impl"
    // InternalDeviceDefinition.g:1866:1: rule__Setting__Group__1__Impl : ( ( rule__Setting__NameAssignment_1 ) ) ;
    public final void rule__Setting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1870:1: ( ( ( rule__Setting__NameAssignment_1 ) ) )
            // InternalDeviceDefinition.g:1871:1: ( ( rule__Setting__NameAssignment_1 ) )
            {
            // InternalDeviceDefinition.g:1871:1: ( ( rule__Setting__NameAssignment_1 ) )
            // InternalDeviceDefinition.g:1872:2: ( rule__Setting__NameAssignment_1 )
            {
             before(grammarAccess.getSettingAccess().getNameAssignment_1()); 
            // InternalDeviceDefinition.g:1873:2: ( rule__Setting__NameAssignment_1 )
            // InternalDeviceDefinition.g:1873:3: rule__Setting__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Setting__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSettingAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__1__Impl"


    // $ANTLR start "rule__Setting__Group__2"
    // InternalDeviceDefinition.g:1881:1: rule__Setting__Group__2 : rule__Setting__Group__2__Impl rule__Setting__Group__3 ;
    public final void rule__Setting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1885:1: ( rule__Setting__Group__2__Impl rule__Setting__Group__3 )
            // InternalDeviceDefinition.g:1886:2: rule__Setting__Group__2__Impl rule__Setting__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__Setting__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Setting__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__2"


    // $ANTLR start "rule__Setting__Group__2__Impl"
    // InternalDeviceDefinition.g:1893:1: rule__Setting__Group__2__Impl : ( ':' ) ;
    public final void rule__Setting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1897:1: ( ( ':' ) )
            // InternalDeviceDefinition.g:1898:1: ( ':' )
            {
            // InternalDeviceDefinition.g:1898:1: ( ':' )
            // InternalDeviceDefinition.g:1899:2: ':'
            {
             before(grammarAccess.getSettingAccess().getColonKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSettingAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__2__Impl"


    // $ANTLR start "rule__Setting__Group__3"
    // InternalDeviceDefinition.g:1908:1: rule__Setting__Group__3 : rule__Setting__Group__3__Impl rule__Setting__Group__4 ;
    public final void rule__Setting__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1912:1: ( rule__Setting__Group__3__Impl rule__Setting__Group__4 )
            // InternalDeviceDefinition.g:1913:2: rule__Setting__Group__3__Impl rule__Setting__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__Setting__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Setting__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__3"


    // $ANTLR start "rule__Setting__Group__3__Impl"
    // InternalDeviceDefinition.g:1920:1: rule__Setting__Group__3__Impl : ( 'default' ) ;
    public final void rule__Setting__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1924:1: ( ( 'default' ) )
            // InternalDeviceDefinition.g:1925:1: ( 'default' )
            {
            // InternalDeviceDefinition.g:1925:1: ( 'default' )
            // InternalDeviceDefinition.g:1926:2: 'default'
            {
             before(grammarAccess.getSettingAccess().getDefaultKeyword_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSettingAccess().getDefaultKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__3__Impl"


    // $ANTLR start "rule__Setting__Group__4"
    // InternalDeviceDefinition.g:1935:1: rule__Setting__Group__4 : rule__Setting__Group__4__Impl ;
    public final void rule__Setting__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1939:1: ( rule__Setting__Group__4__Impl )
            // InternalDeviceDefinition.g:1940:2: rule__Setting__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Setting__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__4"


    // $ANTLR start "rule__Setting__Group__4__Impl"
    // InternalDeviceDefinition.g:1946:1: rule__Setting__Group__4__Impl : ( ( rule__Setting__ValueAssignment_4 ) ) ;
    public final void rule__Setting__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1950:1: ( ( ( rule__Setting__ValueAssignment_4 ) ) )
            // InternalDeviceDefinition.g:1951:1: ( ( rule__Setting__ValueAssignment_4 ) )
            {
            // InternalDeviceDefinition.g:1951:1: ( ( rule__Setting__ValueAssignment_4 ) )
            // InternalDeviceDefinition.g:1952:2: ( rule__Setting__ValueAssignment_4 )
            {
             before(grammarAccess.getSettingAccess().getValueAssignment_4()); 
            // InternalDeviceDefinition.g:1953:2: ( rule__Setting__ValueAssignment_4 )
            // InternalDeviceDefinition.g:1953:3: rule__Setting__ValueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Setting__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSettingAccess().getValueAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__4__Impl"


    // $ANTLR start "rule__System__NameAssignment_1"
    // InternalDeviceDefinition.g:1962:1: rule__System__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__System__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1966:1: ( ( RULE_ID ) )
            // InternalDeviceDefinition.g:1967:2: ( RULE_ID )
            {
            // InternalDeviceDefinition.g:1967:2: ( RULE_ID )
            // InternalDeviceDefinition.g:1968:3: RULE_ID
            {
             before(grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__NameAssignment_1"


    // $ANTLR start "rule__System__MasterAssignment_3"
    // InternalDeviceDefinition.g:1977:1: rule__System__MasterAssignment_3 : ( ruleMaster ) ;
    public final void rule__System__MasterAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1981:1: ( ( ruleMaster ) )
            // InternalDeviceDefinition.g:1982:2: ( ruleMaster )
            {
            // InternalDeviceDefinition.g:1982:2: ( ruleMaster )
            // InternalDeviceDefinition.g:1983:3: ruleMaster
            {
             before(grammarAccess.getSystemAccess().getMasterMasterParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMaster();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getMasterMasterParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__MasterAssignment_3"


    // $ANTLR start "rule__System__GraphsAssignment_4"
    // InternalDeviceDefinition.g:1992:1: rule__System__GraphsAssignment_4 : ( ruleGraph ) ;
    public final void rule__System__GraphsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:1996:1: ( ( ruleGraph ) )
            // InternalDeviceDefinition.g:1997:2: ( ruleGraph )
            {
            // InternalDeviceDefinition.g:1997:2: ( ruleGraph )
            // InternalDeviceDefinition.g:1998:3: ruleGraph
            {
             before(grammarAccess.getSystemAccess().getGraphsGraphParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleGraph();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getGraphsGraphParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__GraphsAssignment_4"


    // $ANTLR start "rule__Graph__NameAssignment_1"
    // InternalDeviceDefinition.g:2007:1: rule__Graph__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Graph__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:2011:1: ( ( RULE_ID ) )
            // InternalDeviceDefinition.g:2012:2: ( RULE_ID )
            {
            // InternalDeviceDefinition.g:2012:2: ( RULE_ID )
            // InternalDeviceDefinition.g:2013:3: RULE_ID
            {
             before(grammarAccess.getGraphAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGraphAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__NameAssignment_1"


    // $ANTLR start "rule__Graph__TypeAssignment_4"
    // InternalDeviceDefinition.g:2022:1: rule__Graph__TypeAssignment_4 : ( ruleGraphType ) ;
    public final void rule__Graph__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:2026:1: ( ( ruleGraphType ) )
            // InternalDeviceDefinition.g:2027:2: ( ruleGraphType )
            {
            // InternalDeviceDefinition.g:2027:2: ( ruleGraphType )
            // InternalDeviceDefinition.g:2028:3: ruleGraphType
            {
             before(grammarAccess.getGraphAccess().getTypeGraphTypeEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphType();

            state._fsp--;

             after(grammarAccess.getGraphAccess().getTypeGraphTypeEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__TypeAssignment_4"


    // $ANTLR start "rule__Graph__CategoryAssignment_6"
    // InternalDeviceDefinition.g:2037:1: rule__Graph__CategoryAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Graph__CategoryAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:2041:1: ( ( RULE_STRING ) )
            // InternalDeviceDefinition.g:2042:2: ( RULE_STRING )
            {
            // InternalDeviceDefinition.g:2042:2: ( RULE_STRING )
            // InternalDeviceDefinition.g:2043:3: RULE_STRING
            {
             before(grammarAccess.getGraphAccess().getCategorySTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGraphAccess().getCategorySTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__CategoryAssignment_6"


    // $ANTLR start "rule__Graph__TitleAssignment_8"
    // InternalDeviceDefinition.g:2052:1: rule__Graph__TitleAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Graph__TitleAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:2056:1: ( ( RULE_STRING ) )
            // InternalDeviceDefinition.g:2057:2: ( RULE_STRING )
            {
            // InternalDeviceDefinition.g:2057:2: ( RULE_STRING )
            // InternalDeviceDefinition.g:2058:3: RULE_STRING
            {
             before(grammarAccess.getGraphAccess().getTitleSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGraphAccess().getTitleSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__TitleAssignment_8"


    // $ANTLR start "rule__Graph__XlabelAssignment_10"
    // InternalDeviceDefinition.g:2067:1: rule__Graph__XlabelAssignment_10 : ( RULE_STRING ) ;
    public final void rule__Graph__XlabelAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:2071:1: ( ( RULE_STRING ) )
            // InternalDeviceDefinition.g:2072:2: ( RULE_STRING )
            {
            // InternalDeviceDefinition.g:2072:2: ( RULE_STRING )
            // InternalDeviceDefinition.g:2073:3: RULE_STRING
            {
             before(grammarAccess.getGraphAccess().getXlabelSTRINGTerminalRuleCall_10_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGraphAccess().getXlabelSTRINGTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__XlabelAssignment_10"


    // $ANTLR start "rule__Graph__YlabelAssignment_12"
    // InternalDeviceDefinition.g:2082:1: rule__Graph__YlabelAssignment_12 : ( RULE_STRING ) ;
    public final void rule__Graph__YlabelAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:2086:1: ( ( RULE_STRING ) )
            // InternalDeviceDefinition.g:2087:2: ( RULE_STRING )
            {
            // InternalDeviceDefinition.g:2087:2: ( RULE_STRING )
            // InternalDeviceDefinition.g:2088:3: RULE_STRING
            {
             before(grammarAccess.getGraphAccess().getYlabelSTRINGTerminalRuleCall_12_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGraphAccess().getYlabelSTRINGTerminalRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__YlabelAssignment_12"


    // $ANTLR start "rule__Master__NameAssignment_1"
    // InternalDeviceDefinition.g:2097:1: rule__Master__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Master__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:2101:1: ( ( RULE_ID ) )
            // InternalDeviceDefinition.g:2102:2: ( RULE_ID )
            {
            // InternalDeviceDefinition.g:2102:2: ( RULE_ID )
            // InternalDeviceDefinition.g:2103:3: RULE_ID
            {
             before(grammarAccess.getMasterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMasterAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Master__NameAssignment_1"


    // $ANTLR start "rule__Master__BluetoothNameAssignment_4"
    // InternalDeviceDefinition.g:2112:1: rule__Master__BluetoothNameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Master__BluetoothNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:2116:1: ( ( RULE_STRING ) )
            // InternalDeviceDefinition.g:2117:2: ( RULE_STRING )
            {
            // InternalDeviceDefinition.g:2117:2: ( RULE_STRING )
            // InternalDeviceDefinition.g:2118:3: RULE_STRING
            {
             before(grammarAccess.getMasterAccess().getBluetoothNameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMasterAccess().getBluetoothNameSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Master__BluetoothNameAssignment_4"


    // $ANTLR start "rule__Master__SlavesAssignment_5"
    // InternalDeviceDefinition.g:2127:1: rule__Master__SlavesAssignment_5 : ( ruleSlave ) ;
    public final void rule__Master__SlavesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:2131:1: ( ( ruleSlave ) )
            // InternalDeviceDefinition.g:2132:2: ( ruleSlave )
            {
            // InternalDeviceDefinition.g:2132:2: ( ruleSlave )
            // InternalDeviceDefinition.g:2133:3: ruleSlave
            {
             before(grammarAccess.getMasterAccess().getSlavesSlaveParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSlave();

            state._fsp--;

             after(grammarAccess.getMasterAccess().getSlavesSlaveParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Master__SlavesAssignment_5"


    // $ANTLR start "rule__Slave__NameAssignment_1"
    // InternalDeviceDefinition.g:2142:1: rule__Slave__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Slave__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:2146:1: ( ( RULE_ID ) )
            // InternalDeviceDefinition.g:2147:2: ( RULE_ID )
            {
            // InternalDeviceDefinition.g:2147:2: ( RULE_ID )
            // InternalDeviceDefinition.g:2148:3: RULE_ID
            {
             before(grammarAccess.getSlaveAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSlaveAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slave__NameAssignment_1"


    // $ANTLR start "rule__Slave__BluetoothNameAssignment_4"
    // InternalDeviceDefinition.g:2157:1: rule__Slave__BluetoothNameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Slave__BluetoothNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:2161:1: ( ( RULE_STRING ) )
            // InternalDeviceDefinition.g:2162:2: ( RULE_STRING )
            {
            // InternalDeviceDefinition.g:2162:2: ( RULE_STRING )
            // InternalDeviceDefinition.g:2163:3: RULE_STRING
            {
             before(grammarAccess.getSlaveAccess().getBluetoothNameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSlaveAccess().getBluetoothNameSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slave__BluetoothNameAssignment_4"


    // $ANTLR start "rule__Slave__DevicesAssignment_5"
    // InternalDeviceDefinition.g:2172:1: rule__Slave__DevicesAssignment_5 : ( ( rule__Slave__DevicesAlternatives_5_0 ) ) ;
    public final void rule__Slave__DevicesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:2176:1: ( ( ( rule__Slave__DevicesAlternatives_5_0 ) ) )
            // InternalDeviceDefinition.g:2177:2: ( ( rule__Slave__DevicesAlternatives_5_0 ) )
            {
            // InternalDeviceDefinition.g:2177:2: ( ( rule__Slave__DevicesAlternatives_5_0 ) )
            // InternalDeviceDefinition.g:2178:3: ( rule__Slave__DevicesAlternatives_5_0 )
            {
             before(grammarAccess.getSlaveAccess().getDevicesAlternatives_5_0()); 
            // InternalDeviceDefinition.g:2179:3: ( rule__Slave__DevicesAlternatives_5_0 )
            // InternalDeviceDefinition.g:2179:4: rule__Slave__DevicesAlternatives_5_0
            {
            pushFollow(FOLLOW_2);
            rule__Slave__DevicesAlternatives_5_0();

            state._fsp--;


            }

             after(grammarAccess.getSlaveAccess().getDevicesAlternatives_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slave__DevicesAssignment_5"


    // $ANTLR start "rule__Sensor__TypeAssignment_1"
    // InternalDeviceDefinition.g:2187:1: rule__Sensor__TypeAssignment_1 : ( ruleSensorType ) ;
    public final void rule__Sensor__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:2191:1: ( ( ruleSensorType ) )
            // InternalDeviceDefinition.g:2192:2: ( ruleSensorType )
            {
            // InternalDeviceDefinition.g:2192:2: ( ruleSensorType )
            // InternalDeviceDefinition.g:2193:3: ruleSensorType
            {
             before(grammarAccess.getSensorAccess().getTypeSensorTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensorType();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getTypeSensorTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__TypeAssignment_1"


    // $ANTLR start "rule__Sensor__PinsAssignment_5"
    // InternalDeviceDefinition.g:2202:1: rule__Sensor__PinsAssignment_5 : ( RULE_INT ) ;
    public final void rule__Sensor__PinsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:2206:1: ( ( RULE_INT ) )
            // InternalDeviceDefinition.g:2207:2: ( RULE_INT )
            {
            // InternalDeviceDefinition.g:2207:2: ( RULE_INT )
            // InternalDeviceDefinition.g:2208:3: RULE_INT
            {
             before(grammarAccess.getSensorAccess().getPinsINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getPinsINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__PinsAssignment_5"


    // $ANTLR start "rule__Sensor__PinsAssignment_6_1"
    // InternalDeviceDefinition.g:2217:1: rule__Sensor__PinsAssignment_6_1 : ( RULE_INT ) ;
    public final void rule__Sensor__PinsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:2221:1: ( ( RULE_INT ) )
            // InternalDeviceDefinition.g:2222:2: ( RULE_INT )
            {
            // InternalDeviceDefinition.g:2222:2: ( RULE_INT )
            // InternalDeviceDefinition.g:2223:3: RULE_INT
            {
             before(grammarAccess.getSensorAccess().getPinsINTTerminalRuleCall_6_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getPinsINTTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__PinsAssignment_6_1"


    // $ANTLR start "rule__Sensor__GraphAssignment_9"
    // InternalDeviceDefinition.g:2232:1: rule__Sensor__GraphAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__Sensor__GraphAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:2236:1: ( ( ( RULE_ID ) ) )
            // InternalDeviceDefinition.g:2237:2: ( ( RULE_ID ) )
            {
            // InternalDeviceDefinition.g:2237:2: ( ( RULE_ID ) )
            // InternalDeviceDefinition.g:2238:3: ( RULE_ID )
            {
             before(grammarAccess.getSensorAccess().getGraphGraphCrossReference_9_0()); 
            // InternalDeviceDefinition.g:2239:3: ( RULE_ID )
            // InternalDeviceDefinition.g:2240:4: RULE_ID
            {
             before(grammarAccess.getSensorAccess().getGraphGraphIDTerminalRuleCall_9_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getGraphGraphIDTerminalRuleCall_9_0_1()); 

            }

             after(grammarAccess.getSensorAccess().getGraphGraphCrossReference_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__GraphAssignment_9"


    // $ANTLR start "rule__Actuator__TypeAssignment_1"
    // InternalDeviceDefinition.g:2251:1: rule__Actuator__TypeAssignment_1 : ( ruleActuatorType ) ;
    public final void rule__Actuator__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:2255:1: ( ( ruleActuatorType ) )
            // InternalDeviceDefinition.g:2256:2: ( ruleActuatorType )
            {
            // InternalDeviceDefinition.g:2256:2: ( ruleActuatorType )
            // InternalDeviceDefinition.g:2257:3: ruleActuatorType
            {
             before(grammarAccess.getActuatorAccess().getTypeActuatorTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActuatorType();

            state._fsp--;

             after(grammarAccess.getActuatorAccess().getTypeActuatorTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__TypeAssignment_1"


    // $ANTLR start "rule__Actuator__PinsAssignment_5"
    // InternalDeviceDefinition.g:2266:1: rule__Actuator__PinsAssignment_5 : ( RULE_INT ) ;
    public final void rule__Actuator__PinsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:2270:1: ( ( RULE_INT ) )
            // InternalDeviceDefinition.g:2271:2: ( RULE_INT )
            {
            // InternalDeviceDefinition.g:2271:2: ( RULE_INT )
            // InternalDeviceDefinition.g:2272:3: RULE_INT
            {
             before(grammarAccess.getActuatorAccess().getPinsINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getActuatorAccess().getPinsINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__PinsAssignment_5"


    // $ANTLR start "rule__Actuator__PinsAssignment_6_1"
    // InternalDeviceDefinition.g:2281:1: rule__Actuator__PinsAssignment_6_1 : ( RULE_INT ) ;
    public final void rule__Actuator__PinsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:2285:1: ( ( RULE_INT ) )
            // InternalDeviceDefinition.g:2286:2: ( RULE_INT )
            {
            // InternalDeviceDefinition.g:2286:2: ( RULE_INT )
            // InternalDeviceDefinition.g:2287:3: RULE_INT
            {
             before(grammarAccess.getActuatorAccess().getPinsINTTerminalRuleCall_6_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getActuatorAccess().getPinsINTTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__PinsAssignment_6_1"


    // $ANTLR start "rule__Actuator__SettingsAssignment_8"
    // InternalDeviceDefinition.g:2296:1: rule__Actuator__SettingsAssignment_8 : ( ruleSetting ) ;
    public final void rule__Actuator__SettingsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:2300:1: ( ( ruleSetting ) )
            // InternalDeviceDefinition.g:2301:2: ( ruleSetting )
            {
            // InternalDeviceDefinition.g:2301:2: ( ruleSetting )
            // InternalDeviceDefinition.g:2302:3: ruleSetting
            {
             before(grammarAccess.getActuatorAccess().getSettingsSettingParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleSetting();

            state._fsp--;

             after(grammarAccess.getActuatorAccess().getSettingsSettingParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__SettingsAssignment_8"


    // $ANTLR start "rule__Setting__NameAssignment_1"
    // InternalDeviceDefinition.g:2311:1: rule__Setting__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Setting__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:2315:1: ( ( RULE_ID ) )
            // InternalDeviceDefinition.g:2316:2: ( RULE_ID )
            {
            // InternalDeviceDefinition.g:2316:2: ( RULE_ID )
            // InternalDeviceDefinition.g:2317:3: RULE_ID
            {
             before(grammarAccess.getSettingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSettingAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__NameAssignment_1"


    // $ANTLR start "rule__Setting__ValueAssignment_4"
    // InternalDeviceDefinition.g:2326:1: rule__Setting__ValueAssignment_4 : ( RULE_INT ) ;
    public final void rule__Setting__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceDefinition.g:2330:1: ( ( RULE_INT ) )
            // InternalDeviceDefinition.g:2331:2: ( RULE_INT )
            {
            // InternalDeviceDefinition.g:2331:2: ( RULE_INT )
            // InternalDeviceDefinition.g:2332:3: RULE_INT
            {
             before(grammarAccess.getSettingAccess().getValueINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSettingAccess().getValueINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__ValueAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000008200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000008200000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000000FC000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000005000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000000000L});

}