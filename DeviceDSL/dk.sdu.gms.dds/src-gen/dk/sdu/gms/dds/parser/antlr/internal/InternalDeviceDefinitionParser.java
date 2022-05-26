package dk.sdu.gms.dds.parser.antlr.internal;

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
import dk.sdu.gms.dds.services.DeviceDefinitionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDeviceDefinitionParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_DECIMAL", "RULE_MAC", "RULE_INT", "RULE_HEXBYTE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'System'", "':'", "'wifi'", "'with'", "'password'", "'mqtt'", "'username'", "'and'", "'Graph'", "'category'", "'title'", "'x'", "'y'", "'line'", "'legend'", "'color'", "'('", "','", "')'", "'random'", "'Gateway'", "'mac'", "'channel'", "'error'", "'light'", "'retries'", "'delay'", "'Worker'", "'preferred gateway'", "'sleep'", "'for'", "'Sensor'", "'pins'", "'sample'", "'if'", "'adc'", "'dac'", "'in'", "'out'", "'millisecond'", "'milliseconds'", "'ms'", "'second'", "'seconds'", "'s'", "'minute'", "'minutes'", "'m'", "'hour'", "'hours'", "'h'", "'as'", "'mapping'", "'Actuator'", "'when'", "'on'", "'off'", "'run'", "'setting'", "'='", "'TRUE'", "'FALSE'", "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'or'", "'value'", "'call'", "'.'", "'->'", "'red'", "'green'", "'blue'", "'yellow'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=8;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_MAC=7;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_HEXBYTE=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int RULE_DECIMAL=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

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




    // $ANTLR start "entryRuleSystem"
    // InternalDeviceDefinition.g:65:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // InternalDeviceDefinition.g:65:47: (iv_ruleSystem= ruleSystem EOF )
            // InternalDeviceDefinition.g:66:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalDeviceDefinition.g:72:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'wifi' ( (lv_wifiSsid_4_0= RULE_STRING ) ) (otherlv_5= 'with' otherlv_6= 'password' ( (lv_wifiPassword_7_0= RULE_STRING ) ) )? otherlv_8= 'mqtt' ( (lv_mqttHost_9_0= RULE_STRING ) ) (otherlv_10= 'with' otherlv_11= 'username' ( (lv_mqttUsername_12_0= RULE_STRING ) ) otherlv_13= 'and' otherlv_14= 'password' ( (lv_mqttPassword_15_0= RULE_STRING ) ) )? ( (lv_gateway_16_0= ruleGateway ) ) ( (lv_graphs_17_0= ruleGraph ) )* ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_wifiSsid_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_wifiPassword_7_0=null;
        Token otherlv_8=null;
        Token lv_mqttHost_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_mqttUsername_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_mqttPassword_15_0=null;
        EObject lv_gateway_16_0 = null;

        EObject lv_graphs_17_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:78:2: ( (otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'wifi' ( (lv_wifiSsid_4_0= RULE_STRING ) ) (otherlv_5= 'with' otherlv_6= 'password' ( (lv_wifiPassword_7_0= RULE_STRING ) ) )? otherlv_8= 'mqtt' ( (lv_mqttHost_9_0= RULE_STRING ) ) (otherlv_10= 'with' otherlv_11= 'username' ( (lv_mqttUsername_12_0= RULE_STRING ) ) otherlv_13= 'and' otherlv_14= 'password' ( (lv_mqttPassword_15_0= RULE_STRING ) ) )? ( (lv_gateway_16_0= ruleGateway ) ) ( (lv_graphs_17_0= ruleGraph ) )* ) )
            // InternalDeviceDefinition.g:79:2: (otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'wifi' ( (lv_wifiSsid_4_0= RULE_STRING ) ) (otherlv_5= 'with' otherlv_6= 'password' ( (lv_wifiPassword_7_0= RULE_STRING ) ) )? otherlv_8= 'mqtt' ( (lv_mqttHost_9_0= RULE_STRING ) ) (otherlv_10= 'with' otherlv_11= 'username' ( (lv_mqttUsername_12_0= RULE_STRING ) ) otherlv_13= 'and' otherlv_14= 'password' ( (lv_mqttPassword_15_0= RULE_STRING ) ) )? ( (lv_gateway_16_0= ruleGateway ) ) ( (lv_graphs_17_0= ruleGraph ) )* )
            {
            // InternalDeviceDefinition.g:79:2: (otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'wifi' ( (lv_wifiSsid_4_0= RULE_STRING ) ) (otherlv_5= 'with' otherlv_6= 'password' ( (lv_wifiPassword_7_0= RULE_STRING ) ) )? otherlv_8= 'mqtt' ( (lv_mqttHost_9_0= RULE_STRING ) ) (otherlv_10= 'with' otherlv_11= 'username' ( (lv_mqttUsername_12_0= RULE_STRING ) ) otherlv_13= 'and' otherlv_14= 'password' ( (lv_mqttPassword_15_0= RULE_STRING ) ) )? ( (lv_gateway_16_0= ruleGateway ) ) ( (lv_graphs_17_0= ruleGraph ) )* )
            // InternalDeviceDefinition.g:80:3: otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'wifi' ( (lv_wifiSsid_4_0= RULE_STRING ) ) (otherlv_5= 'with' otherlv_6= 'password' ( (lv_wifiPassword_7_0= RULE_STRING ) ) )? otherlv_8= 'mqtt' ( (lv_mqttHost_9_0= RULE_STRING ) ) (otherlv_10= 'with' otherlv_11= 'username' ( (lv_mqttUsername_12_0= RULE_STRING ) ) otherlv_13= 'and' otherlv_14= 'password' ( (lv_mqttPassword_15_0= RULE_STRING ) ) )? ( (lv_gateway_16_0= ruleGateway ) ) ( (lv_graphs_17_0= ruleGraph ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
            		
            // InternalDeviceDefinition.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDeviceDefinition.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalDeviceDefinition.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getSystemAccess().getWifiKeyword_3());
            		
            // InternalDeviceDefinition.g:110:3: ( (lv_wifiSsid_4_0= RULE_STRING ) )
            // InternalDeviceDefinition.g:111:4: (lv_wifiSsid_4_0= RULE_STRING )
            {
            // InternalDeviceDefinition.g:111:4: (lv_wifiSsid_4_0= RULE_STRING )
            // InternalDeviceDefinition.g:112:5: lv_wifiSsid_4_0= RULE_STRING
            {
            lv_wifiSsid_4_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_wifiSsid_4_0, grammarAccess.getSystemAccess().getWifiSsidSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"wifiSsid",
            						lv_wifiSsid_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDeviceDefinition.g:128:3: (otherlv_5= 'with' otherlv_6= 'password' ( (lv_wifiPassword_7_0= RULE_STRING ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==17) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDeviceDefinition.g:129:4: otherlv_5= 'with' otherlv_6= 'password' ( (lv_wifiPassword_7_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getSystemAccess().getWithKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getSystemAccess().getPasswordKeyword_5_1());
                    			
                    // InternalDeviceDefinition.g:137:4: ( (lv_wifiPassword_7_0= RULE_STRING ) )
                    // InternalDeviceDefinition.g:138:5: (lv_wifiPassword_7_0= RULE_STRING )
                    {
                    // InternalDeviceDefinition.g:138:5: (lv_wifiPassword_7_0= RULE_STRING )
                    // InternalDeviceDefinition.g:139:6: lv_wifiPassword_7_0= RULE_STRING
                    {
                    lv_wifiPassword_7_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    						newLeafNode(lv_wifiPassword_7_0, grammarAccess.getSystemAccess().getWifiPasswordSTRINGTerminalRuleCall_5_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSystemRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"wifiPassword",
                    							lv_wifiPassword_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getSystemAccess().getMqttKeyword_6());
            		
            // InternalDeviceDefinition.g:160:3: ( (lv_mqttHost_9_0= RULE_STRING ) )
            // InternalDeviceDefinition.g:161:4: (lv_mqttHost_9_0= RULE_STRING )
            {
            // InternalDeviceDefinition.g:161:4: (lv_mqttHost_9_0= RULE_STRING )
            // InternalDeviceDefinition.g:162:5: lv_mqttHost_9_0= RULE_STRING
            {
            lv_mqttHost_9_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_mqttHost_9_0, grammarAccess.getSystemAccess().getMqttHostSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"mqttHost",
            						lv_mqttHost_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDeviceDefinition.g:178:3: (otherlv_10= 'with' otherlv_11= 'username' ( (lv_mqttUsername_12_0= RULE_STRING ) ) otherlv_13= 'and' otherlv_14= 'password' ( (lv_mqttPassword_15_0= RULE_STRING ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDeviceDefinition.g:179:4: otherlv_10= 'with' otherlv_11= 'username' ( (lv_mqttUsername_12_0= RULE_STRING ) ) otherlv_13= 'and' otherlv_14= 'password' ( (lv_mqttPassword_15_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_10, grammarAccess.getSystemAccess().getWithKeyword_8_0());
                    			
                    otherlv_11=(Token)match(input,20,FOLLOW_6); 

                    				newLeafNode(otherlv_11, grammarAccess.getSystemAccess().getUsernameKeyword_8_1());
                    			
                    // InternalDeviceDefinition.g:187:4: ( (lv_mqttUsername_12_0= RULE_STRING ) )
                    // InternalDeviceDefinition.g:188:5: (lv_mqttUsername_12_0= RULE_STRING )
                    {
                    // InternalDeviceDefinition.g:188:5: (lv_mqttUsername_12_0= RULE_STRING )
                    // InternalDeviceDefinition.g:189:6: lv_mqttUsername_12_0= RULE_STRING
                    {
                    lv_mqttUsername_12_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

                    						newLeafNode(lv_mqttUsername_12_0, grammarAccess.getSystemAccess().getMqttUsernameSTRINGTerminalRuleCall_8_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSystemRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"mqttUsername",
                    							lv_mqttUsername_12_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,21,FOLLOW_8); 

                    				newLeafNode(otherlv_13, grammarAccess.getSystemAccess().getAndKeyword_8_3());
                    			
                    otherlv_14=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_14, grammarAccess.getSystemAccess().getPasswordKeyword_8_4());
                    			
                    // InternalDeviceDefinition.g:213:4: ( (lv_mqttPassword_15_0= RULE_STRING ) )
                    // InternalDeviceDefinition.g:214:5: (lv_mqttPassword_15_0= RULE_STRING )
                    {
                    // InternalDeviceDefinition.g:214:5: (lv_mqttPassword_15_0= RULE_STRING )
                    // InternalDeviceDefinition.g:215:6: lv_mqttPassword_15_0= RULE_STRING
                    {
                    lv_mqttPassword_15_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

                    						newLeafNode(lv_mqttPassword_15_0, grammarAccess.getSystemAccess().getMqttPasswordSTRINGTerminalRuleCall_8_5_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSystemRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"mqttPassword",
                    							lv_mqttPassword_15_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDeviceDefinition.g:232:3: ( (lv_gateway_16_0= ruleGateway ) )
            // InternalDeviceDefinition.g:233:4: (lv_gateway_16_0= ruleGateway )
            {
            // InternalDeviceDefinition.g:233:4: (lv_gateway_16_0= ruleGateway )
            // InternalDeviceDefinition.g:234:5: lv_gateway_16_0= ruleGateway
            {

            					newCompositeNode(grammarAccess.getSystemAccess().getGatewayGatewayParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_13);
            lv_gateway_16_0=ruleGateway();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemRule());
            					}
            					set(
            						current,
            						"gateway",
            						lv_gateway_16_0,
            						"dk.sdu.gms.dds.DeviceDefinition.Gateway");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDeviceDefinition.g:251:3: ( (lv_graphs_17_0= ruleGraph ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDeviceDefinition.g:252:4: (lv_graphs_17_0= ruleGraph )
            	    {
            	    // InternalDeviceDefinition.g:252:4: (lv_graphs_17_0= ruleGraph )
            	    // InternalDeviceDefinition.g:253:5: lv_graphs_17_0= ruleGraph
            	    {

            	    					newCompositeNode(grammarAccess.getSystemAccess().getGraphsGraphParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_graphs_17_0=ruleGraph();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"graphs",
            	    						lv_graphs_17_0,
            	    						"dk.sdu.gms.dds.DeviceDefinition.Graph");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleGraph"
    // InternalDeviceDefinition.g:274:1: entryRuleGraph returns [EObject current=null] : iv_ruleGraph= ruleGraph EOF ;
    public final EObject entryRuleGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraph = null;


        try {
            // InternalDeviceDefinition.g:274:46: (iv_ruleGraph= ruleGraph EOF )
            // InternalDeviceDefinition.g:275:2: iv_ruleGraph= ruleGraph EOF
            {
             newCompositeNode(grammarAccess.getGraphRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraph=ruleGraph();

            state._fsp--;

             current =iv_ruleGraph; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGraph"


    // $ANTLR start "ruleGraph"
    // InternalDeviceDefinition.g:281:1: ruleGraph returns [EObject current=null] : (otherlv_0= 'Graph' otherlv_1= ':' otherlv_2= 'category' ( (lv_category_3_0= RULE_STRING ) ) otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) otherlv_6= 'x' ( (lv_xlabel_7_0= RULE_STRING ) ) otherlv_8= 'y' ( (lv_ylabel_9_0= RULE_STRING ) ) ( (lv_lines_10_0= ruleGraphLine ) )+ ) ;
    public final EObject ruleGraph() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_category_3_0=null;
        Token otherlv_4=null;
        Token lv_title_5_0=null;
        Token otherlv_6=null;
        Token lv_xlabel_7_0=null;
        Token otherlv_8=null;
        Token lv_ylabel_9_0=null;
        EObject lv_lines_10_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:287:2: ( (otherlv_0= 'Graph' otherlv_1= ':' otherlv_2= 'category' ( (lv_category_3_0= RULE_STRING ) ) otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) otherlv_6= 'x' ( (lv_xlabel_7_0= RULE_STRING ) ) otherlv_8= 'y' ( (lv_ylabel_9_0= RULE_STRING ) ) ( (lv_lines_10_0= ruleGraphLine ) )+ ) )
            // InternalDeviceDefinition.g:288:2: (otherlv_0= 'Graph' otherlv_1= ':' otherlv_2= 'category' ( (lv_category_3_0= RULE_STRING ) ) otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) otherlv_6= 'x' ( (lv_xlabel_7_0= RULE_STRING ) ) otherlv_8= 'y' ( (lv_ylabel_9_0= RULE_STRING ) ) ( (lv_lines_10_0= ruleGraphLine ) )+ )
            {
            // InternalDeviceDefinition.g:288:2: (otherlv_0= 'Graph' otherlv_1= ':' otherlv_2= 'category' ( (lv_category_3_0= RULE_STRING ) ) otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) otherlv_6= 'x' ( (lv_xlabel_7_0= RULE_STRING ) ) otherlv_8= 'y' ( (lv_ylabel_9_0= RULE_STRING ) ) ( (lv_lines_10_0= ruleGraphLine ) )+ )
            // InternalDeviceDefinition.g:289:3: otherlv_0= 'Graph' otherlv_1= ':' otherlv_2= 'category' ( (lv_category_3_0= RULE_STRING ) ) otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) otherlv_6= 'x' ( (lv_xlabel_7_0= RULE_STRING ) ) otherlv_8= 'y' ( (lv_ylabel_9_0= RULE_STRING ) ) ( (lv_lines_10_0= ruleGraphLine ) )+
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphAccess().getGraphKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getGraphAccess().getCategoryKeyword_2());
            		
            // InternalDeviceDefinition.g:301:3: ( (lv_category_3_0= RULE_STRING ) )
            // InternalDeviceDefinition.g:302:4: (lv_category_3_0= RULE_STRING )
            {
            // InternalDeviceDefinition.g:302:4: (lv_category_3_0= RULE_STRING )
            // InternalDeviceDefinition.g:303:5: lv_category_3_0= RULE_STRING
            {
            lv_category_3_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_category_3_0, grammarAccess.getGraphAccess().getCategorySTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphRule());
            					}
            					setWithLastConsumed(
            						current,
            						"category",
            						lv_category_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getGraphAccess().getTitleKeyword_4());
            		
            // InternalDeviceDefinition.g:323:3: ( (lv_title_5_0= RULE_STRING ) )
            // InternalDeviceDefinition.g:324:4: (lv_title_5_0= RULE_STRING )
            {
            // InternalDeviceDefinition.g:324:4: (lv_title_5_0= RULE_STRING )
            // InternalDeviceDefinition.g:325:5: lv_title_5_0= RULE_STRING
            {
            lv_title_5_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_title_5_0, grammarAccess.getGraphAccess().getTitleSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getGraphAccess().getXKeyword_6());
            		
            // InternalDeviceDefinition.g:345:3: ( (lv_xlabel_7_0= RULE_STRING ) )
            // InternalDeviceDefinition.g:346:4: (lv_xlabel_7_0= RULE_STRING )
            {
            // InternalDeviceDefinition.g:346:4: (lv_xlabel_7_0= RULE_STRING )
            // InternalDeviceDefinition.g:347:5: lv_xlabel_7_0= RULE_STRING
            {
            lv_xlabel_7_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_xlabel_7_0, grammarAccess.getGraphAccess().getXlabelSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphRule());
            					}
            					setWithLastConsumed(
            						current,
            						"xlabel",
            						lv_xlabel_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getGraphAccess().getYKeyword_8());
            		
            // InternalDeviceDefinition.g:367:3: ( (lv_ylabel_9_0= RULE_STRING ) )
            // InternalDeviceDefinition.g:368:4: (lv_ylabel_9_0= RULE_STRING )
            {
            // InternalDeviceDefinition.g:368:4: (lv_ylabel_9_0= RULE_STRING )
            // InternalDeviceDefinition.g:369:5: lv_ylabel_9_0= RULE_STRING
            {
            lv_ylabel_9_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_ylabel_9_0, grammarAccess.getGraphAccess().getYlabelSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ylabel",
            						lv_ylabel_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDeviceDefinition.g:385:3: ( (lv_lines_10_0= ruleGraphLine ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==27) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDeviceDefinition.g:386:4: (lv_lines_10_0= ruleGraphLine )
            	    {
            	    // InternalDeviceDefinition.g:386:4: (lv_lines_10_0= ruleGraphLine )
            	    // InternalDeviceDefinition.g:387:5: lv_lines_10_0= ruleGraphLine
            	    {

            	    					newCompositeNode(grammarAccess.getGraphAccess().getLinesGraphLineParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_lines_10_0=ruleGraphLine();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGraphRule());
            	    					}
            	    					add(
            	    						current,
            	    						"lines",
            	    						lv_lines_10_0,
            	    						"dk.sdu.gms.dds.DeviceDefinition.GraphLine");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGraph"


    // $ANTLR start "entryRuleGraphLine"
    // InternalDeviceDefinition.g:408:1: entryRuleGraphLine returns [EObject current=null] : iv_ruleGraphLine= ruleGraphLine EOF ;
    public final EObject entryRuleGraphLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphLine = null;


        try {
            // InternalDeviceDefinition.g:408:50: (iv_ruleGraphLine= ruleGraphLine EOF )
            // InternalDeviceDefinition.g:409:2: iv_ruleGraphLine= ruleGraphLine EOF
            {
             newCompositeNode(grammarAccess.getGraphLineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphLine=ruleGraphLine();

            state._fsp--;

             current =iv_ruleGraphLine; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGraphLine"


    // $ANTLR start "ruleGraphLine"
    // InternalDeviceDefinition.g:415:1: ruleGraphLine returns [EObject current=null] : (otherlv_0= 'line' ( (lv_output_1_0= ruleGraphVariableUse ) ) (otherlv_2= 'legend' ( (lv_legend_3_0= RULE_STRING ) ) )? (otherlv_4= 'color' ( (lv_color_5_0= ruleColor ) ) )? ) ;
    public final EObject ruleGraphLine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_legend_3_0=null;
        Token otherlv_4=null;
        EObject lv_output_1_0 = null;

        EObject lv_color_5_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:421:2: ( (otherlv_0= 'line' ( (lv_output_1_0= ruleGraphVariableUse ) ) (otherlv_2= 'legend' ( (lv_legend_3_0= RULE_STRING ) ) )? (otherlv_4= 'color' ( (lv_color_5_0= ruleColor ) ) )? ) )
            // InternalDeviceDefinition.g:422:2: (otherlv_0= 'line' ( (lv_output_1_0= ruleGraphVariableUse ) ) (otherlv_2= 'legend' ( (lv_legend_3_0= RULE_STRING ) ) )? (otherlv_4= 'color' ( (lv_color_5_0= ruleColor ) ) )? )
            {
            // InternalDeviceDefinition.g:422:2: (otherlv_0= 'line' ( (lv_output_1_0= ruleGraphVariableUse ) ) (otherlv_2= 'legend' ( (lv_legend_3_0= RULE_STRING ) ) )? (otherlv_4= 'color' ( (lv_color_5_0= ruleColor ) ) )? )
            // InternalDeviceDefinition.g:423:3: otherlv_0= 'line' ( (lv_output_1_0= ruleGraphVariableUse ) ) (otherlv_2= 'legend' ( (lv_legend_3_0= RULE_STRING ) ) )? (otherlv_4= 'color' ( (lv_color_5_0= ruleColor ) ) )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphLineAccess().getLineKeyword_0());
            		
            // InternalDeviceDefinition.g:427:3: ( (lv_output_1_0= ruleGraphVariableUse ) )
            // InternalDeviceDefinition.g:428:4: (lv_output_1_0= ruleGraphVariableUse )
            {
            // InternalDeviceDefinition.g:428:4: (lv_output_1_0= ruleGraphVariableUse )
            // InternalDeviceDefinition.g:429:5: lv_output_1_0= ruleGraphVariableUse
            {

            					newCompositeNode(grammarAccess.getGraphLineAccess().getOutputGraphVariableUseParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_output_1_0=ruleGraphVariableUse();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphLineRule());
            					}
            					set(
            						current,
            						"output",
            						lv_output_1_0,
            						"dk.sdu.gms.dds.DeviceDefinition.GraphVariableUse");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDeviceDefinition.g:446:3: (otherlv_2= 'legend' ( (lv_legend_3_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==28) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDeviceDefinition.g:447:4: otherlv_2= 'legend' ( (lv_legend_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getGraphLineAccess().getLegendKeyword_2_0());
                    			
                    // InternalDeviceDefinition.g:451:4: ( (lv_legend_3_0= RULE_STRING ) )
                    // InternalDeviceDefinition.g:452:5: (lv_legend_3_0= RULE_STRING )
                    {
                    // InternalDeviceDefinition.g:452:5: (lv_legend_3_0= RULE_STRING )
                    // InternalDeviceDefinition.g:453:6: lv_legend_3_0= RULE_STRING
                    {
                    lv_legend_3_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

                    						newLeafNode(lv_legend_3_0, grammarAccess.getGraphLineAccess().getLegendSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGraphLineRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"legend",
                    							lv_legend_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDeviceDefinition.g:470:3: (otherlv_4= 'color' ( (lv_color_5_0= ruleColor ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDeviceDefinition.g:471:4: otherlv_4= 'color' ( (lv_color_5_0= ruleColor ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_22); 

                    				newLeafNode(otherlv_4, grammarAccess.getGraphLineAccess().getColorKeyword_3_0());
                    			
                    // InternalDeviceDefinition.g:475:4: ( (lv_color_5_0= ruleColor ) )
                    // InternalDeviceDefinition.g:476:5: (lv_color_5_0= ruleColor )
                    {
                    // InternalDeviceDefinition.g:476:5: (lv_color_5_0= ruleColor )
                    // InternalDeviceDefinition.g:477:6: lv_color_5_0= ruleColor
                    {

                    						newCompositeNode(grammarAccess.getGraphLineAccess().getColorColorParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_color_5_0=ruleColor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGraphLineRule());
                    						}
                    						set(
                    							current,
                    							"color",
                    							lv_color_5_0,
                    							"dk.sdu.gms.dds.DeviceDefinition.Color");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGraphLine"


    // $ANTLR start "entryRuleColor"
    // InternalDeviceDefinition.g:499:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // InternalDeviceDefinition.g:499:46: (iv_ruleColor= ruleColor EOF )
            // InternalDeviceDefinition.g:500:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalDeviceDefinition.g:506:1: ruleColor returns [EObject current=null] : ( ( () otherlv_1= '(' ( (lv_red_2_0= RULE_DECIMAL ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_DECIMAL ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_DECIMAL ) ) otherlv_7= ')' ) | ( () ( (lv_preset_9_0= ruleColorPreset ) ) ) | ( () otherlv_11= 'random' ) ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_red_2_0=null;
        Token otherlv_3=null;
        Token lv_green_4_0=null;
        Token otherlv_5=null;
        Token lv_blue_6_0=null;
        Token otherlv_7=null;
        Token otherlv_11=null;
        Enumerator lv_preset_9_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:512:2: ( ( ( () otherlv_1= '(' ( (lv_red_2_0= RULE_DECIMAL ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_DECIMAL ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_DECIMAL ) ) otherlv_7= ')' ) | ( () ( (lv_preset_9_0= ruleColorPreset ) ) ) | ( () otherlv_11= 'random' ) ) )
            // InternalDeviceDefinition.g:513:2: ( ( () otherlv_1= '(' ( (lv_red_2_0= RULE_DECIMAL ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_DECIMAL ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_DECIMAL ) ) otherlv_7= ')' ) | ( () ( (lv_preset_9_0= ruleColorPreset ) ) ) | ( () otherlv_11= 'random' ) )
            {
            // InternalDeviceDefinition.g:513:2: ( ( () otherlv_1= '(' ( (lv_red_2_0= RULE_DECIMAL ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_DECIMAL ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_DECIMAL ) ) otherlv_7= ')' ) | ( () ( (lv_preset_9_0= ruleColorPreset ) ) ) | ( () otherlv_11= 'random' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt7=1;
                }
                break;
            case 91:
            case 92:
            case 93:
            case 94:
                {
                alt7=2;
                }
                break;
            case 33:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalDeviceDefinition.g:514:3: ( () otherlv_1= '(' ( (lv_red_2_0= RULE_DECIMAL ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_DECIMAL ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_DECIMAL ) ) otherlv_7= ')' )
                    {
                    // InternalDeviceDefinition.g:514:3: ( () otherlv_1= '(' ( (lv_red_2_0= RULE_DECIMAL ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_DECIMAL ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_DECIMAL ) ) otherlv_7= ')' )
                    // InternalDeviceDefinition.g:515:4: () otherlv_1= '(' ( (lv_red_2_0= RULE_DECIMAL ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_DECIMAL ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_DECIMAL ) ) otherlv_7= ')'
                    {
                    // InternalDeviceDefinition.g:515:4: ()
                    // InternalDeviceDefinition.g:516:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getColorAccess().getRGBAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,30,FOLLOW_23); 

                    				newLeafNode(otherlv_1, grammarAccess.getColorAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalDeviceDefinition.g:526:4: ( (lv_red_2_0= RULE_DECIMAL ) )
                    // InternalDeviceDefinition.g:527:5: (lv_red_2_0= RULE_DECIMAL )
                    {
                    // InternalDeviceDefinition.g:527:5: (lv_red_2_0= RULE_DECIMAL )
                    // InternalDeviceDefinition.g:528:6: lv_red_2_0= RULE_DECIMAL
                    {
                    lv_red_2_0=(Token)match(input,RULE_DECIMAL,FOLLOW_24); 

                    						newLeafNode(lv_red_2_0, grammarAccess.getColorAccess().getRedDECIMALTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColorRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"red",
                    							lv_red_2_0,
                    							"dk.sdu.gms.dds.DeviceDefinition.DECIMAL");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,31,FOLLOW_23); 

                    				newLeafNode(otherlv_3, grammarAccess.getColorAccess().getCommaKeyword_0_3());
                    			
                    // InternalDeviceDefinition.g:548:4: ( (lv_green_4_0= RULE_DECIMAL ) )
                    // InternalDeviceDefinition.g:549:5: (lv_green_4_0= RULE_DECIMAL )
                    {
                    // InternalDeviceDefinition.g:549:5: (lv_green_4_0= RULE_DECIMAL )
                    // InternalDeviceDefinition.g:550:6: lv_green_4_0= RULE_DECIMAL
                    {
                    lv_green_4_0=(Token)match(input,RULE_DECIMAL,FOLLOW_24); 

                    						newLeafNode(lv_green_4_0, grammarAccess.getColorAccess().getGreenDECIMALTerminalRuleCall_0_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColorRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"green",
                    							lv_green_4_0,
                    							"dk.sdu.gms.dds.DeviceDefinition.DECIMAL");
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,31,FOLLOW_23); 

                    				newLeafNode(otherlv_5, grammarAccess.getColorAccess().getCommaKeyword_0_5());
                    			
                    // InternalDeviceDefinition.g:570:4: ( (lv_blue_6_0= RULE_DECIMAL ) )
                    // InternalDeviceDefinition.g:571:5: (lv_blue_6_0= RULE_DECIMAL )
                    {
                    // InternalDeviceDefinition.g:571:5: (lv_blue_6_0= RULE_DECIMAL )
                    // InternalDeviceDefinition.g:572:6: lv_blue_6_0= RULE_DECIMAL
                    {
                    lv_blue_6_0=(Token)match(input,RULE_DECIMAL,FOLLOW_25); 

                    						newLeafNode(lv_blue_6_0, grammarAccess.getColorAccess().getBlueDECIMALTerminalRuleCall_0_6_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColorRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"blue",
                    							lv_blue_6_0,
                    							"dk.sdu.gms.dds.DeviceDefinition.DECIMAL");
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getColorAccess().getRightParenthesisKeyword_0_7());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDeviceDefinition.g:594:3: ( () ( (lv_preset_9_0= ruleColorPreset ) ) )
                    {
                    // InternalDeviceDefinition.g:594:3: ( () ( (lv_preset_9_0= ruleColorPreset ) ) )
                    // InternalDeviceDefinition.g:595:4: () ( (lv_preset_9_0= ruleColorPreset ) )
                    {
                    // InternalDeviceDefinition.g:595:4: ()
                    // InternalDeviceDefinition.g:596:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getColorAccess().getPresetAction_1_0(),
                    						current);
                    				

                    }

                    // InternalDeviceDefinition.g:602:4: ( (lv_preset_9_0= ruleColorPreset ) )
                    // InternalDeviceDefinition.g:603:5: (lv_preset_9_0= ruleColorPreset )
                    {
                    // InternalDeviceDefinition.g:603:5: (lv_preset_9_0= ruleColorPreset )
                    // InternalDeviceDefinition.g:604:6: lv_preset_9_0= ruleColorPreset
                    {

                    						newCompositeNode(grammarAccess.getColorAccess().getPresetColorPresetEnumRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_preset_9_0=ruleColorPreset();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColorRule());
                    						}
                    						set(
                    							current,
                    							"preset",
                    							lv_preset_9_0,
                    							"dk.sdu.gms.dds.DeviceDefinition.ColorPreset");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDeviceDefinition.g:623:3: ( () otherlv_11= 'random' )
                    {
                    // InternalDeviceDefinition.g:623:3: ( () otherlv_11= 'random' )
                    // InternalDeviceDefinition.g:624:4: () otherlv_11= 'random'
                    {
                    // InternalDeviceDefinition.g:624:4: ()
                    // InternalDeviceDefinition.g:625:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getColorAccess().getRandomAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_11=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getColorAccess().getRandomKeyword_2_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleGateway"
    // InternalDeviceDefinition.g:640:1: entryRuleGateway returns [EObject current=null] : iv_ruleGateway= ruleGateway EOF ;
    public final EObject entryRuleGateway() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGateway = null;


        try {
            // InternalDeviceDefinition.g:640:48: (iv_ruleGateway= ruleGateway EOF )
            // InternalDeviceDefinition.g:641:2: iv_ruleGateway= ruleGateway EOF
            {
             newCompositeNode(grammarAccess.getGatewayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGateway=ruleGateway();

            state._fsp--;

             current =iv_ruleGateway; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGateway"


    // $ANTLR start "ruleGateway"
    // InternalDeviceDefinition.g:647:1: ruleGateway returns [EObject current=null] : (otherlv_0= 'Gateway' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'mac' ( (lv_mac_4_0= RULE_MAC ) ) (otherlv_5= ',' ( (lv_mac_6_0= RULE_MAC ) ) )* otherlv_7= 'channel' ( (lv_channel_8_0= RULE_INT ) ) (otherlv_9= 'error' otherlv_10= 'light' ( (lv_errorLed_11_0= RULE_INT ) ) )? (otherlv_12= 'retries' ( (lv_retries_13_0= RULE_INT ) ) otherlv_14= 'with' otherlv_15= 'delay' ( (lv_delay_16_0= ruleNumberPrimitive ) ) ( (lv_delayTimeUnit_17_0= ruleTimeUnit ) ) )? ( (lv_workers_18_0= ruleWorker ) )+ ) ;
    public final EObject ruleGateway() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_mac_4_0=null;
        Token otherlv_5=null;
        Token lv_mac_6_0=null;
        Token otherlv_7=null;
        Token lv_channel_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_errorLed_11_0=null;
        Token otherlv_12=null;
        Token lv_retries_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_delay_16_0 = null;

        EObject lv_delayTimeUnit_17_0 = null;

        EObject lv_workers_18_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:653:2: ( (otherlv_0= 'Gateway' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'mac' ( (lv_mac_4_0= RULE_MAC ) ) (otherlv_5= ',' ( (lv_mac_6_0= RULE_MAC ) ) )* otherlv_7= 'channel' ( (lv_channel_8_0= RULE_INT ) ) (otherlv_9= 'error' otherlv_10= 'light' ( (lv_errorLed_11_0= RULE_INT ) ) )? (otherlv_12= 'retries' ( (lv_retries_13_0= RULE_INT ) ) otherlv_14= 'with' otherlv_15= 'delay' ( (lv_delay_16_0= ruleNumberPrimitive ) ) ( (lv_delayTimeUnit_17_0= ruleTimeUnit ) ) )? ( (lv_workers_18_0= ruleWorker ) )+ ) )
            // InternalDeviceDefinition.g:654:2: (otherlv_0= 'Gateway' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'mac' ( (lv_mac_4_0= RULE_MAC ) ) (otherlv_5= ',' ( (lv_mac_6_0= RULE_MAC ) ) )* otherlv_7= 'channel' ( (lv_channel_8_0= RULE_INT ) ) (otherlv_9= 'error' otherlv_10= 'light' ( (lv_errorLed_11_0= RULE_INT ) ) )? (otherlv_12= 'retries' ( (lv_retries_13_0= RULE_INT ) ) otherlv_14= 'with' otherlv_15= 'delay' ( (lv_delay_16_0= ruleNumberPrimitive ) ) ( (lv_delayTimeUnit_17_0= ruleTimeUnit ) ) )? ( (lv_workers_18_0= ruleWorker ) )+ )
            {
            // InternalDeviceDefinition.g:654:2: (otherlv_0= 'Gateway' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'mac' ( (lv_mac_4_0= RULE_MAC ) ) (otherlv_5= ',' ( (lv_mac_6_0= RULE_MAC ) ) )* otherlv_7= 'channel' ( (lv_channel_8_0= RULE_INT ) ) (otherlv_9= 'error' otherlv_10= 'light' ( (lv_errorLed_11_0= RULE_INT ) ) )? (otherlv_12= 'retries' ( (lv_retries_13_0= RULE_INT ) ) otherlv_14= 'with' otherlv_15= 'delay' ( (lv_delay_16_0= ruleNumberPrimitive ) ) ( (lv_delayTimeUnit_17_0= ruleTimeUnit ) ) )? ( (lv_workers_18_0= ruleWorker ) )+ )
            // InternalDeviceDefinition.g:655:3: otherlv_0= 'Gateway' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'mac' ( (lv_mac_4_0= RULE_MAC ) ) (otherlv_5= ',' ( (lv_mac_6_0= RULE_MAC ) ) )* otherlv_7= 'channel' ( (lv_channel_8_0= RULE_INT ) ) (otherlv_9= 'error' otherlv_10= 'light' ( (lv_errorLed_11_0= RULE_INT ) ) )? (otherlv_12= 'retries' ( (lv_retries_13_0= RULE_INT ) ) otherlv_14= 'with' otherlv_15= 'delay' ( (lv_delay_16_0= ruleNumberPrimitive ) ) ( (lv_delayTimeUnit_17_0= ruleTimeUnit ) ) )? ( (lv_workers_18_0= ruleWorker ) )+
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGatewayAccess().getGatewayKeyword_0());
            		
            // InternalDeviceDefinition.g:659:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDeviceDefinition.g:660:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:660:4: (lv_name_1_0= RULE_ID )
            // InternalDeviceDefinition.g:661:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGatewayAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGatewayRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getGatewayAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,35,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getGatewayAccess().getMacKeyword_3());
            		
            // InternalDeviceDefinition.g:685:3: ( (lv_mac_4_0= RULE_MAC ) )
            // InternalDeviceDefinition.g:686:4: (lv_mac_4_0= RULE_MAC )
            {
            // InternalDeviceDefinition.g:686:4: (lv_mac_4_0= RULE_MAC )
            // InternalDeviceDefinition.g:687:5: lv_mac_4_0= RULE_MAC
            {
            lv_mac_4_0=(Token)match(input,RULE_MAC,FOLLOW_28); 

            					newLeafNode(lv_mac_4_0, grammarAccess.getGatewayAccess().getMacMACTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGatewayRule());
            					}
            					addWithLastConsumed(
            						current,
            						"mac",
            						lv_mac_4_0,
            						"dk.sdu.gms.dds.DeviceDefinition.MAC");
            				

            }


            }

            // InternalDeviceDefinition.g:703:3: (otherlv_5= ',' ( (lv_mac_6_0= RULE_MAC ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==31) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDeviceDefinition.g:704:4: otherlv_5= ',' ( (lv_mac_6_0= RULE_MAC ) )
            	    {
            	    otherlv_5=(Token)match(input,31,FOLLOW_27); 

            	    				newLeafNode(otherlv_5, grammarAccess.getGatewayAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalDeviceDefinition.g:708:4: ( (lv_mac_6_0= RULE_MAC ) )
            	    // InternalDeviceDefinition.g:709:5: (lv_mac_6_0= RULE_MAC )
            	    {
            	    // InternalDeviceDefinition.g:709:5: (lv_mac_6_0= RULE_MAC )
            	    // InternalDeviceDefinition.g:710:6: lv_mac_6_0= RULE_MAC
            	    {
            	    lv_mac_6_0=(Token)match(input,RULE_MAC,FOLLOW_28); 

            	    						newLeafNode(lv_mac_6_0, grammarAccess.getGatewayAccess().getMacMACTerminalRuleCall_5_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getGatewayRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"mac",
            	    							lv_mac_6_0,
            	    							"dk.sdu.gms.dds.DeviceDefinition.MAC");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_7=(Token)match(input,36,FOLLOW_29); 

            			newLeafNode(otherlv_7, grammarAccess.getGatewayAccess().getChannelKeyword_6());
            		
            // InternalDeviceDefinition.g:731:3: ( (lv_channel_8_0= RULE_INT ) )
            // InternalDeviceDefinition.g:732:4: (lv_channel_8_0= RULE_INT )
            {
            // InternalDeviceDefinition.g:732:4: (lv_channel_8_0= RULE_INT )
            // InternalDeviceDefinition.g:733:5: lv_channel_8_0= RULE_INT
            {
            lv_channel_8_0=(Token)match(input,RULE_INT,FOLLOW_30); 

            					newLeafNode(lv_channel_8_0, grammarAccess.getGatewayAccess().getChannelINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGatewayRule());
            					}
            					setWithLastConsumed(
            						current,
            						"channel",
            						lv_channel_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalDeviceDefinition.g:749:3: (otherlv_9= 'error' otherlv_10= 'light' ( (lv_errorLed_11_0= RULE_INT ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==37) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDeviceDefinition.g:750:4: otherlv_9= 'error' otherlv_10= 'light' ( (lv_errorLed_11_0= RULE_INT ) )
                    {
                    otherlv_9=(Token)match(input,37,FOLLOW_31); 

                    				newLeafNode(otherlv_9, grammarAccess.getGatewayAccess().getErrorKeyword_8_0());
                    			
                    otherlv_10=(Token)match(input,38,FOLLOW_29); 

                    				newLeafNode(otherlv_10, grammarAccess.getGatewayAccess().getLightKeyword_8_1());
                    			
                    // InternalDeviceDefinition.g:758:4: ( (lv_errorLed_11_0= RULE_INT ) )
                    // InternalDeviceDefinition.g:759:5: (lv_errorLed_11_0= RULE_INT )
                    {
                    // InternalDeviceDefinition.g:759:5: (lv_errorLed_11_0= RULE_INT )
                    // InternalDeviceDefinition.g:760:6: lv_errorLed_11_0= RULE_INT
                    {
                    lv_errorLed_11_0=(Token)match(input,RULE_INT,FOLLOW_30); 

                    						newLeafNode(lv_errorLed_11_0, grammarAccess.getGatewayAccess().getErrorLedINTTerminalRuleCall_8_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGatewayRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"errorLed",
                    							lv_errorLed_11_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDeviceDefinition.g:777:3: (otherlv_12= 'retries' ( (lv_retries_13_0= RULE_INT ) ) otherlv_14= 'with' otherlv_15= 'delay' ( (lv_delay_16_0= ruleNumberPrimitive ) ) ( (lv_delayTimeUnit_17_0= ruleTimeUnit ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==39) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDeviceDefinition.g:778:4: otherlv_12= 'retries' ( (lv_retries_13_0= RULE_INT ) ) otherlv_14= 'with' otherlv_15= 'delay' ( (lv_delay_16_0= ruleNumberPrimitive ) ) ( (lv_delayTimeUnit_17_0= ruleTimeUnit ) )
                    {
                    otherlv_12=(Token)match(input,39,FOLLOW_29); 

                    				newLeafNode(otherlv_12, grammarAccess.getGatewayAccess().getRetriesKeyword_9_0());
                    			
                    // InternalDeviceDefinition.g:782:4: ( (lv_retries_13_0= RULE_INT ) )
                    // InternalDeviceDefinition.g:783:5: (lv_retries_13_0= RULE_INT )
                    {
                    // InternalDeviceDefinition.g:783:5: (lv_retries_13_0= RULE_INT )
                    // InternalDeviceDefinition.g:784:6: lv_retries_13_0= RULE_INT
                    {
                    lv_retries_13_0=(Token)match(input,RULE_INT,FOLLOW_32); 

                    						newLeafNode(lv_retries_13_0, grammarAccess.getGatewayAccess().getRetriesINTTerminalRuleCall_9_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGatewayRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"retries",
                    							lv_retries_13_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,17,FOLLOW_33); 

                    				newLeafNode(otherlv_14, grammarAccess.getGatewayAccess().getWithKeyword_9_2());
                    			
                    otherlv_15=(Token)match(input,40,FOLLOW_34); 

                    				newLeafNode(otherlv_15, grammarAccess.getGatewayAccess().getDelayKeyword_9_3());
                    			
                    // InternalDeviceDefinition.g:808:4: ( (lv_delay_16_0= ruleNumberPrimitive ) )
                    // InternalDeviceDefinition.g:809:5: (lv_delay_16_0= ruleNumberPrimitive )
                    {
                    // InternalDeviceDefinition.g:809:5: (lv_delay_16_0= ruleNumberPrimitive )
                    // InternalDeviceDefinition.g:810:6: lv_delay_16_0= ruleNumberPrimitive
                    {

                    						newCompositeNode(grammarAccess.getGatewayAccess().getDelayNumberPrimitiveParserRuleCall_9_4_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_delay_16_0=ruleNumberPrimitive();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGatewayRule());
                    						}
                    						add(
                    							current,
                    							"delay",
                    							lv_delay_16_0,
                    							"dk.sdu.gms.dds.DeviceDefinition.NumberPrimitive");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDeviceDefinition.g:827:4: ( (lv_delayTimeUnit_17_0= ruleTimeUnit ) )
                    // InternalDeviceDefinition.g:828:5: (lv_delayTimeUnit_17_0= ruleTimeUnit )
                    {
                    // InternalDeviceDefinition.g:828:5: (lv_delayTimeUnit_17_0= ruleTimeUnit )
                    // InternalDeviceDefinition.g:829:6: lv_delayTimeUnit_17_0= ruleTimeUnit
                    {

                    						newCompositeNode(grammarAccess.getGatewayAccess().getDelayTimeUnitTimeUnitParserRuleCall_9_5_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_delayTimeUnit_17_0=ruleTimeUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGatewayRule());
                    						}
                    						set(
                    							current,
                    							"delayTimeUnit",
                    							lv_delayTimeUnit_17_0,
                    							"dk.sdu.gms.dds.DeviceDefinition.TimeUnit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDeviceDefinition.g:847:3: ( (lv_workers_18_0= ruleWorker ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==41) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDeviceDefinition.g:848:4: (lv_workers_18_0= ruleWorker )
            	    {
            	    // InternalDeviceDefinition.g:848:4: (lv_workers_18_0= ruleWorker )
            	    // InternalDeviceDefinition.g:849:5: lv_workers_18_0= ruleWorker
            	    {

            	    					newCompositeNode(grammarAccess.getGatewayAccess().getWorkersWorkerParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_36);
            	    lv_workers_18_0=ruleWorker();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGatewayRule());
            	    					}
            	    					add(
            	    						current,
            	    						"workers",
            	    						lv_workers_18_0,
            	    						"dk.sdu.gms.dds.DeviceDefinition.Worker");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGateway"


    // $ANTLR start "entryRuleWorker"
    // InternalDeviceDefinition.g:870:1: entryRuleWorker returns [EObject current=null] : iv_ruleWorker= ruleWorker EOF ;
    public final EObject entryRuleWorker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorker = null;


        try {
            // InternalDeviceDefinition.g:870:47: (iv_ruleWorker= ruleWorker EOF )
            // InternalDeviceDefinition.g:871:2: iv_ruleWorker= ruleWorker EOF
            {
             newCompositeNode(grammarAccess.getWorkerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorker=ruleWorker();

            state._fsp--;

             current =iv_ruleWorker; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorker"


    // $ANTLR start "ruleWorker"
    // InternalDeviceDefinition.g:877:1: ruleWorker returns [EObject current=null] : (otherlv_0= 'Worker' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'mac' ( (lv_mac_4_0= RULE_MAC ) ) (otherlv_5= 'preferred gateway' ( (lv_preferred_6_0= RULE_INT ) ) )? otherlv_7= 'sleep' otherlv_8= 'for' ( (lv_sleepTime_9_0= ruleNumberPrimitive ) ) ( (lv_timeUnit_10_0= ruleTimeUnit ) ) (otherlv_11= 'error' otherlv_12= 'light' ( (lv_errorLed_13_0= RULE_INT ) ) )? (otherlv_14= 'retries' ( (lv_retries_15_0= RULE_INT ) ) otherlv_16= 'with' otherlv_17= 'delay' ( (lv_delay_18_0= ruleNumberPrimitive ) ) ( (lv_delayTimeUnit_19_0= ruleTimeUnit ) ) )? ( (lv_devices_20_0= ruleDevice ) )* ) ;
    public final EObject ruleWorker() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_mac_4_0=null;
        Token otherlv_5=null;
        Token lv_preferred_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_errorLed_13_0=null;
        Token otherlv_14=null;
        Token lv_retries_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_sleepTime_9_0 = null;

        EObject lv_timeUnit_10_0 = null;

        EObject lv_delay_18_0 = null;

        EObject lv_delayTimeUnit_19_0 = null;

        EObject lv_devices_20_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:883:2: ( (otherlv_0= 'Worker' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'mac' ( (lv_mac_4_0= RULE_MAC ) ) (otherlv_5= 'preferred gateway' ( (lv_preferred_6_0= RULE_INT ) ) )? otherlv_7= 'sleep' otherlv_8= 'for' ( (lv_sleepTime_9_0= ruleNumberPrimitive ) ) ( (lv_timeUnit_10_0= ruleTimeUnit ) ) (otherlv_11= 'error' otherlv_12= 'light' ( (lv_errorLed_13_0= RULE_INT ) ) )? (otherlv_14= 'retries' ( (lv_retries_15_0= RULE_INT ) ) otherlv_16= 'with' otherlv_17= 'delay' ( (lv_delay_18_0= ruleNumberPrimitive ) ) ( (lv_delayTimeUnit_19_0= ruleTimeUnit ) ) )? ( (lv_devices_20_0= ruleDevice ) )* ) )
            // InternalDeviceDefinition.g:884:2: (otherlv_0= 'Worker' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'mac' ( (lv_mac_4_0= RULE_MAC ) ) (otherlv_5= 'preferred gateway' ( (lv_preferred_6_0= RULE_INT ) ) )? otherlv_7= 'sleep' otherlv_8= 'for' ( (lv_sleepTime_9_0= ruleNumberPrimitive ) ) ( (lv_timeUnit_10_0= ruleTimeUnit ) ) (otherlv_11= 'error' otherlv_12= 'light' ( (lv_errorLed_13_0= RULE_INT ) ) )? (otherlv_14= 'retries' ( (lv_retries_15_0= RULE_INT ) ) otherlv_16= 'with' otherlv_17= 'delay' ( (lv_delay_18_0= ruleNumberPrimitive ) ) ( (lv_delayTimeUnit_19_0= ruleTimeUnit ) ) )? ( (lv_devices_20_0= ruleDevice ) )* )
            {
            // InternalDeviceDefinition.g:884:2: (otherlv_0= 'Worker' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'mac' ( (lv_mac_4_0= RULE_MAC ) ) (otherlv_5= 'preferred gateway' ( (lv_preferred_6_0= RULE_INT ) ) )? otherlv_7= 'sleep' otherlv_8= 'for' ( (lv_sleepTime_9_0= ruleNumberPrimitive ) ) ( (lv_timeUnit_10_0= ruleTimeUnit ) ) (otherlv_11= 'error' otherlv_12= 'light' ( (lv_errorLed_13_0= RULE_INT ) ) )? (otherlv_14= 'retries' ( (lv_retries_15_0= RULE_INT ) ) otherlv_16= 'with' otherlv_17= 'delay' ( (lv_delay_18_0= ruleNumberPrimitive ) ) ( (lv_delayTimeUnit_19_0= ruleTimeUnit ) ) )? ( (lv_devices_20_0= ruleDevice ) )* )
            // InternalDeviceDefinition.g:885:3: otherlv_0= 'Worker' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'mac' ( (lv_mac_4_0= RULE_MAC ) ) (otherlv_5= 'preferred gateway' ( (lv_preferred_6_0= RULE_INT ) ) )? otherlv_7= 'sleep' otherlv_8= 'for' ( (lv_sleepTime_9_0= ruleNumberPrimitive ) ) ( (lv_timeUnit_10_0= ruleTimeUnit ) ) (otherlv_11= 'error' otherlv_12= 'light' ( (lv_errorLed_13_0= RULE_INT ) ) )? (otherlv_14= 'retries' ( (lv_retries_15_0= RULE_INT ) ) otherlv_16= 'with' otherlv_17= 'delay' ( (lv_delay_18_0= ruleNumberPrimitive ) ) ( (lv_delayTimeUnit_19_0= ruleTimeUnit ) ) )? ( (lv_devices_20_0= ruleDevice ) )*
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkerAccess().getWorkerKeyword_0());
            		
            // InternalDeviceDefinition.g:889:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDeviceDefinition.g:890:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:890:4: (lv_name_1_0= RULE_ID )
            // InternalDeviceDefinition.g:891:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getWorkerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkerAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,35,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getWorkerAccess().getMacKeyword_3());
            		
            // InternalDeviceDefinition.g:915:3: ( (lv_mac_4_0= RULE_MAC ) )
            // InternalDeviceDefinition.g:916:4: (lv_mac_4_0= RULE_MAC )
            {
            // InternalDeviceDefinition.g:916:4: (lv_mac_4_0= RULE_MAC )
            // InternalDeviceDefinition.g:917:5: lv_mac_4_0= RULE_MAC
            {
            lv_mac_4_0=(Token)match(input,RULE_MAC,FOLLOW_37); 

            					newLeafNode(lv_mac_4_0, grammarAccess.getWorkerAccess().getMacMACTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"mac",
            						lv_mac_4_0,
            						"dk.sdu.gms.dds.DeviceDefinition.MAC");
            				

            }


            }

            // InternalDeviceDefinition.g:933:3: (otherlv_5= 'preferred gateway' ( (lv_preferred_6_0= RULE_INT ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==42) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDeviceDefinition.g:934:4: otherlv_5= 'preferred gateway' ( (lv_preferred_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,42,FOLLOW_29); 

                    				newLeafNode(otherlv_5, grammarAccess.getWorkerAccess().getPreferredGatewayKeyword_5_0());
                    			
                    // InternalDeviceDefinition.g:938:4: ( (lv_preferred_6_0= RULE_INT ) )
                    // InternalDeviceDefinition.g:939:5: (lv_preferred_6_0= RULE_INT )
                    {
                    // InternalDeviceDefinition.g:939:5: (lv_preferred_6_0= RULE_INT )
                    // InternalDeviceDefinition.g:940:6: lv_preferred_6_0= RULE_INT
                    {
                    lv_preferred_6_0=(Token)match(input,RULE_INT,FOLLOW_38); 

                    						newLeafNode(lv_preferred_6_0, grammarAccess.getWorkerAccess().getPreferredINTTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWorkerRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"preferred",
                    							lv_preferred_6_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,43,FOLLOW_39); 

            			newLeafNode(otherlv_7, grammarAccess.getWorkerAccess().getSleepKeyword_6());
            		
            otherlv_8=(Token)match(input,44,FOLLOW_34); 

            			newLeafNode(otherlv_8, grammarAccess.getWorkerAccess().getForKeyword_7());
            		
            // InternalDeviceDefinition.g:965:3: ( (lv_sleepTime_9_0= ruleNumberPrimitive ) )
            // InternalDeviceDefinition.g:966:4: (lv_sleepTime_9_0= ruleNumberPrimitive )
            {
            // InternalDeviceDefinition.g:966:4: (lv_sleepTime_9_0= ruleNumberPrimitive )
            // InternalDeviceDefinition.g:967:5: lv_sleepTime_9_0= ruleNumberPrimitive
            {

            					newCompositeNode(grammarAccess.getWorkerAccess().getSleepTimeNumberPrimitiveParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_35);
            lv_sleepTime_9_0=ruleNumberPrimitive();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorkerRule());
            					}
            					set(
            						current,
            						"sleepTime",
            						lv_sleepTime_9_0,
            						"dk.sdu.gms.dds.DeviceDefinition.NumberPrimitive");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDeviceDefinition.g:984:3: ( (lv_timeUnit_10_0= ruleTimeUnit ) )
            // InternalDeviceDefinition.g:985:4: (lv_timeUnit_10_0= ruleTimeUnit )
            {
            // InternalDeviceDefinition.g:985:4: (lv_timeUnit_10_0= ruleTimeUnit )
            // InternalDeviceDefinition.g:986:5: lv_timeUnit_10_0= ruleTimeUnit
            {

            					newCompositeNode(grammarAccess.getWorkerAccess().getTimeUnitTimeUnitParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_40);
            lv_timeUnit_10_0=ruleTimeUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorkerRule());
            					}
            					set(
            						current,
            						"timeUnit",
            						lv_timeUnit_10_0,
            						"dk.sdu.gms.dds.DeviceDefinition.TimeUnit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDeviceDefinition.g:1003:3: (otherlv_11= 'error' otherlv_12= 'light' ( (lv_errorLed_13_0= RULE_INT ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==37) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDeviceDefinition.g:1004:4: otherlv_11= 'error' otherlv_12= 'light' ( (lv_errorLed_13_0= RULE_INT ) )
                    {
                    otherlv_11=(Token)match(input,37,FOLLOW_31); 

                    				newLeafNode(otherlv_11, grammarAccess.getWorkerAccess().getErrorKeyword_10_0());
                    			
                    otherlv_12=(Token)match(input,38,FOLLOW_29); 

                    				newLeafNode(otherlv_12, grammarAccess.getWorkerAccess().getLightKeyword_10_1());
                    			
                    // InternalDeviceDefinition.g:1012:4: ( (lv_errorLed_13_0= RULE_INT ) )
                    // InternalDeviceDefinition.g:1013:5: (lv_errorLed_13_0= RULE_INT )
                    {
                    // InternalDeviceDefinition.g:1013:5: (lv_errorLed_13_0= RULE_INT )
                    // InternalDeviceDefinition.g:1014:6: lv_errorLed_13_0= RULE_INT
                    {
                    lv_errorLed_13_0=(Token)match(input,RULE_INT,FOLLOW_41); 

                    						newLeafNode(lv_errorLed_13_0, grammarAccess.getWorkerAccess().getErrorLedINTTerminalRuleCall_10_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWorkerRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"errorLed",
                    							lv_errorLed_13_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDeviceDefinition.g:1031:3: (otherlv_14= 'retries' ( (lv_retries_15_0= RULE_INT ) ) otherlv_16= 'with' otherlv_17= 'delay' ( (lv_delay_18_0= ruleNumberPrimitive ) ) ( (lv_delayTimeUnit_19_0= ruleTimeUnit ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==39) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDeviceDefinition.g:1032:4: otherlv_14= 'retries' ( (lv_retries_15_0= RULE_INT ) ) otherlv_16= 'with' otherlv_17= 'delay' ( (lv_delay_18_0= ruleNumberPrimitive ) ) ( (lv_delayTimeUnit_19_0= ruleTimeUnit ) )
                    {
                    otherlv_14=(Token)match(input,39,FOLLOW_29); 

                    				newLeafNode(otherlv_14, grammarAccess.getWorkerAccess().getRetriesKeyword_11_0());
                    			
                    // InternalDeviceDefinition.g:1036:4: ( (lv_retries_15_0= RULE_INT ) )
                    // InternalDeviceDefinition.g:1037:5: (lv_retries_15_0= RULE_INT )
                    {
                    // InternalDeviceDefinition.g:1037:5: (lv_retries_15_0= RULE_INT )
                    // InternalDeviceDefinition.g:1038:6: lv_retries_15_0= RULE_INT
                    {
                    lv_retries_15_0=(Token)match(input,RULE_INT,FOLLOW_32); 

                    						newLeafNode(lv_retries_15_0, grammarAccess.getWorkerAccess().getRetriesINTTerminalRuleCall_11_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWorkerRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"retries",
                    							lv_retries_15_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,17,FOLLOW_33); 

                    				newLeafNode(otherlv_16, grammarAccess.getWorkerAccess().getWithKeyword_11_2());
                    			
                    otherlv_17=(Token)match(input,40,FOLLOW_34); 

                    				newLeafNode(otherlv_17, grammarAccess.getWorkerAccess().getDelayKeyword_11_3());
                    			
                    // InternalDeviceDefinition.g:1062:4: ( (lv_delay_18_0= ruleNumberPrimitive ) )
                    // InternalDeviceDefinition.g:1063:5: (lv_delay_18_0= ruleNumberPrimitive )
                    {
                    // InternalDeviceDefinition.g:1063:5: (lv_delay_18_0= ruleNumberPrimitive )
                    // InternalDeviceDefinition.g:1064:6: lv_delay_18_0= ruleNumberPrimitive
                    {

                    						newCompositeNode(grammarAccess.getWorkerAccess().getDelayNumberPrimitiveParserRuleCall_11_4_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_delay_18_0=ruleNumberPrimitive();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWorkerRule());
                    						}
                    						add(
                    							current,
                    							"delay",
                    							lv_delay_18_0,
                    							"dk.sdu.gms.dds.DeviceDefinition.NumberPrimitive");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDeviceDefinition.g:1081:4: ( (lv_delayTimeUnit_19_0= ruleTimeUnit ) )
                    // InternalDeviceDefinition.g:1082:5: (lv_delayTimeUnit_19_0= ruleTimeUnit )
                    {
                    // InternalDeviceDefinition.g:1082:5: (lv_delayTimeUnit_19_0= ruleTimeUnit )
                    // InternalDeviceDefinition.g:1083:6: lv_delayTimeUnit_19_0= ruleTimeUnit
                    {

                    						newCompositeNode(grammarAccess.getWorkerAccess().getDelayTimeUnitTimeUnitParserRuleCall_11_5_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_delayTimeUnit_19_0=ruleTimeUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWorkerRule());
                    						}
                    						set(
                    							current,
                    							"delayTimeUnit",
                    							lv_delayTimeUnit_19_0,
                    							"dk.sdu.gms.dds.DeviceDefinition.TimeUnit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDeviceDefinition.g:1101:3: ( (lv_devices_20_0= ruleDevice ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==45||LA15_0==67) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDeviceDefinition.g:1102:4: (lv_devices_20_0= ruleDevice )
            	    {
            	    // InternalDeviceDefinition.g:1102:4: (lv_devices_20_0= ruleDevice )
            	    // InternalDeviceDefinition.g:1103:5: lv_devices_20_0= ruleDevice
            	    {

            	    					newCompositeNode(grammarAccess.getWorkerAccess().getDevicesDeviceParserRuleCall_12_0());
            	    				
            	    pushFollow(FOLLOW_42);
            	    lv_devices_20_0=ruleDevice();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWorkerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"devices",
            	    						lv_devices_20_0,
            	    						"dk.sdu.gms.dds.DeviceDefinition.Device");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorker"


    // $ANTLR start "entryRuleDevice"
    // InternalDeviceDefinition.g:1124:1: entryRuleDevice returns [EObject current=null] : iv_ruleDevice= ruleDevice EOF ;
    public final EObject entryRuleDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevice = null;


        try {
            // InternalDeviceDefinition.g:1124:47: (iv_ruleDevice= ruleDevice EOF )
            // InternalDeviceDefinition.g:1125:2: iv_ruleDevice= ruleDevice EOF
            {
             newCompositeNode(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDevice=ruleDevice();

            state._fsp--;

             current =iv_ruleDevice; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDevice"


    // $ANTLR start "ruleDevice"
    // InternalDeviceDefinition.g:1131:1: ruleDevice returns [EObject current=null] : (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) ;
    public final EObject ruleDevice() throws RecognitionException {
        EObject current = null;

        EObject this_Sensor_0 = null;

        EObject this_Actuator_1 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:1137:2: ( (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) )
            // InternalDeviceDefinition.g:1138:2: (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator )
            {
            // InternalDeviceDefinition.g:1138:2: (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==45) ) {
                alt16=1;
            }
            else if ( (LA16_0==67) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalDeviceDefinition.g:1139:3: this_Sensor_0= ruleSensor
                    {

                    			newCompositeNode(grammarAccess.getDeviceAccess().getSensorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sensor_0=ruleSensor();

                    state._fsp--;


                    			current = this_Sensor_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDeviceDefinition.g:1148:3: this_Actuator_1= ruleActuator
                    {

                    			newCompositeNode(grammarAccess.getDeviceAccess().getActuatorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Actuator_1=ruleActuator();

                    state._fsp--;


                    			current = this_Actuator_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDevice"


    // $ANTLR start "entryRuleSensor"
    // InternalDeviceDefinition.g:1160:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalDeviceDefinition.g:1160:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalDeviceDefinition.g:1161:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalDeviceDefinition.g:1167:1: ruleSensor returns [EObject current=null] : (otherlv_0= 'Sensor' ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= 'pins' ( (lv_pins_5_0= rulePin ) )* (otherlv_6= ',' ( (lv_pins_7_0= rulePin ) ) )* )? ( (lv_outputs_8_0= ruleSensorOutput ) )* ( (lv_settings_9_0= ruleSetting ) )* (otherlv_10= 'sample' otherlv_11= 'if' ( (lv_predicate_12_0= ruleExp ) ) )? ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_pins_5_0 = null;

        EObject lv_pins_7_0 = null;

        EObject lv_outputs_8_0 = null;

        EObject lv_settings_9_0 = null;

        EObject lv_predicate_12_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:1173:2: ( (otherlv_0= 'Sensor' ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= 'pins' ( (lv_pins_5_0= rulePin ) )* (otherlv_6= ',' ( (lv_pins_7_0= rulePin ) ) )* )? ( (lv_outputs_8_0= ruleSensorOutput ) )* ( (lv_settings_9_0= ruleSetting ) )* (otherlv_10= 'sample' otherlv_11= 'if' ( (lv_predicate_12_0= ruleExp ) ) )? ) )
            // InternalDeviceDefinition.g:1174:2: (otherlv_0= 'Sensor' ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= 'pins' ( (lv_pins_5_0= rulePin ) )* (otherlv_6= ',' ( (lv_pins_7_0= rulePin ) ) )* )? ( (lv_outputs_8_0= ruleSensorOutput ) )* ( (lv_settings_9_0= ruleSetting ) )* (otherlv_10= 'sample' otherlv_11= 'if' ( (lv_predicate_12_0= ruleExp ) ) )? )
            {
            // InternalDeviceDefinition.g:1174:2: (otherlv_0= 'Sensor' ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= 'pins' ( (lv_pins_5_0= rulePin ) )* (otherlv_6= ',' ( (lv_pins_7_0= rulePin ) ) )* )? ( (lv_outputs_8_0= ruleSensorOutput ) )* ( (lv_settings_9_0= ruleSetting ) )* (otherlv_10= 'sample' otherlv_11= 'if' ( (lv_predicate_12_0= ruleExp ) ) )? )
            // InternalDeviceDefinition.g:1175:3: otherlv_0= 'Sensor' ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= 'pins' ( (lv_pins_5_0= rulePin ) )* (otherlv_6= ',' ( (lv_pins_7_0= rulePin ) ) )* )? ( (lv_outputs_8_0= ruleSensorOutput ) )* ( (lv_settings_9_0= ruleSetting ) )* (otherlv_10= 'sample' otherlv_11= 'if' ( (lv_predicate_12_0= ruleExp ) ) )?
            {
            otherlv_0=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorAccess().getSensorKeyword_0());
            		
            // InternalDeviceDefinition.g:1179:3: ( (lv_type_1_0= RULE_ID ) )
            // InternalDeviceDefinition.g:1180:4: (lv_type_1_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:1180:4: (lv_type_1_0= RULE_ID )
            // InternalDeviceDefinition.g:1181:5: lv_type_1_0= RULE_ID
            {
            lv_type_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_type_1_0, grammarAccess.getSensorAccess().getTypeIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDeviceDefinition.g:1197:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDeviceDefinition.g:1198:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:1198:4: (lv_name_2_0= RULE_ID )
            // InternalDeviceDefinition.g:1199:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSensorAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_43); 

            			newLeafNode(otherlv_3, grammarAccess.getSensorAccess().getColonKeyword_3());
            		
            // InternalDeviceDefinition.g:1219:3: (otherlv_4= 'pins' ( (lv_pins_5_0= rulePin ) )* (otherlv_6= ',' ( (lv_pins_7_0= rulePin ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==46) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDeviceDefinition.g:1220:4: otherlv_4= 'pins' ( (lv_pins_5_0= rulePin ) )* (otherlv_6= ',' ( (lv_pins_7_0= rulePin ) ) )*
                    {
                    otherlv_4=(Token)match(input,46,FOLLOW_44); 

                    				newLeafNode(otherlv_4, grammarAccess.getSensorAccess().getPinsKeyword_4_0());
                    			
                    // InternalDeviceDefinition.g:1224:4: ( (lv_pins_5_0= rulePin ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==52) ) {
                            int LA17_2 = input.LA(2);

                            if ( (LA17_2==RULE_INT) ) {
                                alt17=1;
                            }


                        }
                        else if ( ((LA17_0>=49 && LA17_0<=51)) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalDeviceDefinition.g:1225:5: (lv_pins_5_0= rulePin )
                    	    {
                    	    // InternalDeviceDefinition.g:1225:5: (lv_pins_5_0= rulePin )
                    	    // InternalDeviceDefinition.g:1226:6: lv_pins_5_0= rulePin
                    	    {

                    	    						newCompositeNode(grammarAccess.getSensorAccess().getPinsPinParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_44);
                    	    lv_pins_5_0=rulePin();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"pins",
                    	    							lv_pins_5_0,
                    	    							"dk.sdu.gms.dds.DeviceDefinition.Pin");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    // InternalDeviceDefinition.g:1243:4: (otherlv_6= ',' ( (lv_pins_7_0= rulePin ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==31) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalDeviceDefinition.g:1244:5: otherlv_6= ',' ( (lv_pins_7_0= rulePin ) )
                    	    {
                    	    otherlv_6=(Token)match(input,31,FOLLOW_45); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getSensorAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalDeviceDefinition.g:1248:5: ( (lv_pins_7_0= rulePin ) )
                    	    // InternalDeviceDefinition.g:1249:6: (lv_pins_7_0= rulePin )
                    	    {
                    	    // InternalDeviceDefinition.g:1249:6: (lv_pins_7_0= rulePin )
                    	    // InternalDeviceDefinition.g:1250:7: lv_pins_7_0= rulePin
                    	    {

                    	    							newCompositeNode(grammarAccess.getSensorAccess().getPinsPinParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_46);
                    	    lv_pins_7_0=rulePin();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSensorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"pins",
                    	    								lv_pins_7_0,
                    	    								"dk.sdu.gms.dds.DeviceDefinition.Pin");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalDeviceDefinition.g:1269:3: ( (lv_outputs_8_0= ruleSensorOutput ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==52) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalDeviceDefinition.g:1270:4: (lv_outputs_8_0= ruleSensorOutput )
            	    {
            	    // InternalDeviceDefinition.g:1270:4: (lv_outputs_8_0= ruleSensorOutput )
            	    // InternalDeviceDefinition.g:1271:5: lv_outputs_8_0= ruleSensorOutput
            	    {

            	    					newCompositeNode(grammarAccess.getSensorAccess().getOutputsSensorOutputParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_47);
            	    lv_outputs_8_0=ruleSensorOutput();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSensorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"outputs",
            	    						lv_outputs_8_0,
            	    						"dk.sdu.gms.dds.DeviceDefinition.SensorOutput");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // InternalDeviceDefinition.g:1288:3: ( (lv_settings_9_0= ruleSetting ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==72) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDeviceDefinition.g:1289:4: (lv_settings_9_0= ruleSetting )
            	    {
            	    // InternalDeviceDefinition.g:1289:4: (lv_settings_9_0= ruleSetting )
            	    // InternalDeviceDefinition.g:1290:5: lv_settings_9_0= ruleSetting
            	    {

            	    					newCompositeNode(grammarAccess.getSensorAccess().getSettingsSettingParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_48);
            	    lv_settings_9_0=ruleSetting();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSensorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"settings",
            	    						lv_settings_9_0,
            	    						"dk.sdu.gms.dds.DeviceDefinition.Setting");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // InternalDeviceDefinition.g:1307:3: (otherlv_10= 'sample' otherlv_11= 'if' ( (lv_predicate_12_0= ruleExp ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==47) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDeviceDefinition.g:1308:4: otherlv_10= 'sample' otherlv_11= 'if' ( (lv_predicate_12_0= ruleExp ) )
                    {
                    otherlv_10=(Token)match(input,47,FOLLOW_49); 

                    				newLeafNode(otherlv_10, grammarAccess.getSensorAccess().getSampleKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,48,FOLLOW_50); 

                    				newLeafNode(otherlv_11, grammarAccess.getSensorAccess().getIfKeyword_7_1());
                    			
                    // InternalDeviceDefinition.g:1316:4: ( (lv_predicate_12_0= ruleExp ) )
                    // InternalDeviceDefinition.g:1317:5: (lv_predicate_12_0= ruleExp )
                    {
                    // InternalDeviceDefinition.g:1317:5: (lv_predicate_12_0= ruleExp )
                    // InternalDeviceDefinition.g:1318:6: lv_predicate_12_0= ruleExp
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getPredicateExpParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_predicate_12_0=ruleExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						add(
                    							current,
                    							"predicate",
                    							lv_predicate_12_0,
                    							"dk.sdu.gms.dds.DeviceDefinition.Exp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRulePin"
    // InternalDeviceDefinition.g:1340:1: entryRulePin returns [EObject current=null] : iv_rulePin= rulePin EOF ;
    public final EObject entryRulePin() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePin = null;


        try {
            // InternalDeviceDefinition.g:1340:44: (iv_rulePin= rulePin EOF )
            // InternalDeviceDefinition.g:1341:2: iv_rulePin= rulePin EOF
            {
             newCompositeNode(grammarAccess.getPinRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePin=rulePin();

            state._fsp--;

             current =iv_rulePin; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePin"


    // $ANTLR start "rulePin"
    // InternalDeviceDefinition.g:1347:1: rulePin returns [EObject current=null] : ( ( (lv_type_0_0= rulePinType ) ) ( (lv_number_1_0= RULE_INT ) ) ) ;
    public final EObject rulePin() throws RecognitionException {
        EObject current = null;

        Token lv_number_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:1353:2: ( ( ( (lv_type_0_0= rulePinType ) ) ( (lv_number_1_0= RULE_INT ) ) ) )
            // InternalDeviceDefinition.g:1354:2: ( ( (lv_type_0_0= rulePinType ) ) ( (lv_number_1_0= RULE_INT ) ) )
            {
            // InternalDeviceDefinition.g:1354:2: ( ( (lv_type_0_0= rulePinType ) ) ( (lv_number_1_0= RULE_INT ) ) )
            // InternalDeviceDefinition.g:1355:3: ( (lv_type_0_0= rulePinType ) ) ( (lv_number_1_0= RULE_INT ) )
            {
            // InternalDeviceDefinition.g:1355:3: ( (lv_type_0_0= rulePinType ) )
            // InternalDeviceDefinition.g:1356:4: (lv_type_0_0= rulePinType )
            {
            // InternalDeviceDefinition.g:1356:4: (lv_type_0_0= rulePinType )
            // InternalDeviceDefinition.g:1357:5: lv_type_0_0= rulePinType
            {

            					newCompositeNode(grammarAccess.getPinAccess().getTypePinTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_29);
            lv_type_0_0=rulePinType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPinRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"dk.sdu.gms.dds.DeviceDefinition.PinType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDeviceDefinition.g:1374:3: ( (lv_number_1_0= RULE_INT ) )
            // InternalDeviceDefinition.g:1375:4: (lv_number_1_0= RULE_INT )
            {
            // InternalDeviceDefinition.g:1375:4: (lv_number_1_0= RULE_INT )
            // InternalDeviceDefinition.g:1376:5: lv_number_1_0= RULE_INT
            {
            lv_number_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_number_1_0, grammarAccess.getPinAccess().getNumberINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPinRule());
            					}
            					setWithLastConsumed(
            						current,
            						"number",
            						lv_number_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePin"


    // $ANTLR start "entryRulePinType"
    // InternalDeviceDefinition.g:1396:1: entryRulePinType returns [EObject current=null] : iv_rulePinType= rulePinType EOF ;
    public final EObject entryRulePinType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePinType = null;


        try {
            // InternalDeviceDefinition.g:1396:48: (iv_rulePinType= rulePinType EOF )
            // InternalDeviceDefinition.g:1397:2: iv_rulePinType= rulePinType EOF
            {
             newCompositeNode(grammarAccess.getPinTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePinType=rulePinType();

            state._fsp--;

             current =iv_rulePinType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePinType"


    // $ANTLR start "rulePinType"
    // InternalDeviceDefinition.g:1403:1: rulePinType returns [EObject current=null] : ( ( () otherlv_1= 'adc' ) | ( () otherlv_3= 'dac' ) | ( () otherlv_5= 'in' ) | ( () otherlv_7= 'out' ) ) ;
    public final EObject rulePinType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalDeviceDefinition.g:1409:2: ( ( ( () otherlv_1= 'adc' ) | ( () otherlv_3= 'dac' ) | ( () otherlv_5= 'in' ) | ( () otherlv_7= 'out' ) ) )
            // InternalDeviceDefinition.g:1410:2: ( ( () otherlv_1= 'adc' ) | ( () otherlv_3= 'dac' ) | ( () otherlv_5= 'in' ) | ( () otherlv_7= 'out' ) )
            {
            // InternalDeviceDefinition.g:1410:2: ( ( () otherlv_1= 'adc' ) | ( () otherlv_3= 'dac' ) | ( () otherlv_5= 'in' ) | ( () otherlv_7= 'out' ) )
            int alt23=4;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt23=1;
                }
                break;
            case 50:
                {
                alt23=2;
                }
                break;
            case 51:
                {
                alt23=3;
                }
                break;
            case 52:
                {
                alt23=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalDeviceDefinition.g:1411:3: ( () otherlv_1= 'adc' )
                    {
                    // InternalDeviceDefinition.g:1411:3: ( () otherlv_1= 'adc' )
                    // InternalDeviceDefinition.g:1412:4: () otherlv_1= 'adc'
                    {
                    // InternalDeviceDefinition.g:1412:4: ()
                    // InternalDeviceDefinition.g:1413:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPinTypeAccess().getADCAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,49,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getPinTypeAccess().getAdcKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDeviceDefinition.g:1425:3: ( () otherlv_3= 'dac' )
                    {
                    // InternalDeviceDefinition.g:1425:3: ( () otherlv_3= 'dac' )
                    // InternalDeviceDefinition.g:1426:4: () otherlv_3= 'dac'
                    {
                    // InternalDeviceDefinition.g:1426:4: ()
                    // InternalDeviceDefinition.g:1427:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPinTypeAccess().getDACAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,50,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getPinTypeAccess().getDacKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDeviceDefinition.g:1439:3: ( () otherlv_5= 'in' )
                    {
                    // InternalDeviceDefinition.g:1439:3: ( () otherlv_5= 'in' )
                    // InternalDeviceDefinition.g:1440:4: () otherlv_5= 'in'
                    {
                    // InternalDeviceDefinition.g:1440:4: ()
                    // InternalDeviceDefinition.g:1441:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPinTypeAccess().getGenericInAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,51,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getPinTypeAccess().getInKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDeviceDefinition.g:1453:3: ( () otherlv_7= 'out' )
                    {
                    // InternalDeviceDefinition.g:1453:3: ( () otherlv_7= 'out' )
                    // InternalDeviceDefinition.g:1454:4: () otherlv_7= 'out'
                    {
                    // InternalDeviceDefinition.g:1454:4: ()
                    // InternalDeviceDefinition.g:1455:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPinTypeAccess().getGenericOutAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,52,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getPinTypeAccess().getOutKeyword_3_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePinType"


    // $ANTLR start "entryRuleTimeUnit"
    // InternalDeviceDefinition.g:1470:1: entryRuleTimeUnit returns [EObject current=null] : iv_ruleTimeUnit= ruleTimeUnit EOF ;
    public final EObject entryRuleTimeUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeUnit = null;


        try {
            // InternalDeviceDefinition.g:1470:49: (iv_ruleTimeUnit= ruleTimeUnit EOF )
            // InternalDeviceDefinition.g:1471:2: iv_ruleTimeUnit= ruleTimeUnit EOF
            {
             newCompositeNode(grammarAccess.getTimeUnitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeUnit=ruleTimeUnit();

            state._fsp--;

             current =iv_ruleTimeUnit; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeUnit"


    // $ANTLR start "ruleTimeUnit"
    // InternalDeviceDefinition.g:1477:1: ruleTimeUnit returns [EObject current=null] : ( ( () (otherlv_1= 'millisecond' | otherlv_2= 'milliseconds' | otherlv_3= 'ms' ) ) | ( () (otherlv_5= 'second' | otherlv_6= 'seconds' | otherlv_7= 's' ) ) | ( () (otherlv_9= 'minute' | otherlv_10= 'minutes' | otherlv_11= 'm' ) ) | ( () (otherlv_13= 'hour' | otherlv_14= 'hours' | otherlv_15= 'h' ) ) ) ;
    public final EObject ruleTimeUnit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;


        	enterRule();

        try {
            // InternalDeviceDefinition.g:1483:2: ( ( ( () (otherlv_1= 'millisecond' | otherlv_2= 'milliseconds' | otherlv_3= 'ms' ) ) | ( () (otherlv_5= 'second' | otherlv_6= 'seconds' | otherlv_7= 's' ) ) | ( () (otherlv_9= 'minute' | otherlv_10= 'minutes' | otherlv_11= 'm' ) ) | ( () (otherlv_13= 'hour' | otherlv_14= 'hours' | otherlv_15= 'h' ) ) ) )
            // InternalDeviceDefinition.g:1484:2: ( ( () (otherlv_1= 'millisecond' | otherlv_2= 'milliseconds' | otherlv_3= 'ms' ) ) | ( () (otherlv_5= 'second' | otherlv_6= 'seconds' | otherlv_7= 's' ) ) | ( () (otherlv_9= 'minute' | otherlv_10= 'minutes' | otherlv_11= 'm' ) ) | ( () (otherlv_13= 'hour' | otherlv_14= 'hours' | otherlv_15= 'h' ) ) )
            {
            // InternalDeviceDefinition.g:1484:2: ( ( () (otherlv_1= 'millisecond' | otherlv_2= 'milliseconds' | otherlv_3= 'ms' ) ) | ( () (otherlv_5= 'second' | otherlv_6= 'seconds' | otherlv_7= 's' ) ) | ( () (otherlv_9= 'minute' | otherlv_10= 'minutes' | otherlv_11= 'm' ) ) | ( () (otherlv_13= 'hour' | otherlv_14= 'hours' | otherlv_15= 'h' ) ) )
            int alt28=4;
            switch ( input.LA(1) ) {
            case 53:
            case 54:
            case 55:
                {
                alt28=1;
                }
                break;
            case 56:
            case 57:
            case 58:
                {
                alt28=2;
                }
                break;
            case 59:
            case 60:
            case 61:
                {
                alt28=3;
                }
                break;
            case 62:
            case 63:
            case 64:
                {
                alt28=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalDeviceDefinition.g:1485:3: ( () (otherlv_1= 'millisecond' | otherlv_2= 'milliseconds' | otherlv_3= 'ms' ) )
                    {
                    // InternalDeviceDefinition.g:1485:3: ( () (otherlv_1= 'millisecond' | otherlv_2= 'milliseconds' | otherlv_3= 'ms' ) )
                    // InternalDeviceDefinition.g:1486:4: () (otherlv_1= 'millisecond' | otherlv_2= 'milliseconds' | otherlv_3= 'ms' )
                    {
                    // InternalDeviceDefinition.g:1486:4: ()
                    // InternalDeviceDefinition.g:1487:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTimeUnitAccess().getMillisecondAction_0_0(),
                    						current);
                    				

                    }

                    // InternalDeviceDefinition.g:1493:4: (otherlv_1= 'millisecond' | otherlv_2= 'milliseconds' | otherlv_3= 'ms' )
                    int alt24=3;
                    switch ( input.LA(1) ) {
                    case 53:
                        {
                        alt24=1;
                        }
                        break;
                    case 54:
                        {
                        alt24=2;
                        }
                        break;
                    case 55:
                        {
                        alt24=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }

                    switch (alt24) {
                        case 1 :
                            // InternalDeviceDefinition.g:1494:5: otherlv_1= 'millisecond'
                            {
                            otherlv_1=(Token)match(input,53,FOLLOW_2); 

                            					newLeafNode(otherlv_1, grammarAccess.getTimeUnitAccess().getMillisecondKeyword_0_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDeviceDefinition.g:1499:5: otherlv_2= 'milliseconds'
                            {
                            otherlv_2=(Token)match(input,54,FOLLOW_2); 

                            					newLeafNode(otherlv_2, grammarAccess.getTimeUnitAccess().getMillisecondsKeyword_0_1_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalDeviceDefinition.g:1504:5: otherlv_3= 'ms'
                            {
                            otherlv_3=(Token)match(input,55,FOLLOW_2); 

                            					newLeafNode(otherlv_3, grammarAccess.getTimeUnitAccess().getMsKeyword_0_1_2());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDeviceDefinition.g:1511:3: ( () (otherlv_5= 'second' | otherlv_6= 'seconds' | otherlv_7= 's' ) )
                    {
                    // InternalDeviceDefinition.g:1511:3: ( () (otherlv_5= 'second' | otherlv_6= 'seconds' | otherlv_7= 's' ) )
                    // InternalDeviceDefinition.g:1512:4: () (otherlv_5= 'second' | otherlv_6= 'seconds' | otherlv_7= 's' )
                    {
                    // InternalDeviceDefinition.g:1512:4: ()
                    // InternalDeviceDefinition.g:1513:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTimeUnitAccess().getSecondAction_1_0(),
                    						current);
                    				

                    }

                    // InternalDeviceDefinition.g:1519:4: (otherlv_5= 'second' | otherlv_6= 'seconds' | otherlv_7= 's' )
                    int alt25=3;
                    switch ( input.LA(1) ) {
                    case 56:
                        {
                        alt25=1;
                        }
                        break;
                    case 57:
                        {
                        alt25=2;
                        }
                        break;
                    case 58:
                        {
                        alt25=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }

                    switch (alt25) {
                        case 1 :
                            // InternalDeviceDefinition.g:1520:5: otherlv_5= 'second'
                            {
                            otherlv_5=(Token)match(input,56,FOLLOW_2); 

                            					newLeafNode(otherlv_5, grammarAccess.getTimeUnitAccess().getSecondKeyword_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDeviceDefinition.g:1525:5: otherlv_6= 'seconds'
                            {
                            otherlv_6=(Token)match(input,57,FOLLOW_2); 

                            					newLeafNode(otherlv_6, grammarAccess.getTimeUnitAccess().getSecondsKeyword_1_1_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalDeviceDefinition.g:1530:5: otherlv_7= 's'
                            {
                            otherlv_7=(Token)match(input,58,FOLLOW_2); 

                            					newLeafNode(otherlv_7, grammarAccess.getTimeUnitAccess().getSKeyword_1_1_2());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDeviceDefinition.g:1537:3: ( () (otherlv_9= 'minute' | otherlv_10= 'minutes' | otherlv_11= 'm' ) )
                    {
                    // InternalDeviceDefinition.g:1537:3: ( () (otherlv_9= 'minute' | otherlv_10= 'minutes' | otherlv_11= 'm' ) )
                    // InternalDeviceDefinition.g:1538:4: () (otherlv_9= 'minute' | otherlv_10= 'minutes' | otherlv_11= 'm' )
                    {
                    // InternalDeviceDefinition.g:1538:4: ()
                    // InternalDeviceDefinition.g:1539:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTimeUnitAccess().getMinuteAction_2_0(),
                    						current);
                    				

                    }

                    // InternalDeviceDefinition.g:1545:4: (otherlv_9= 'minute' | otherlv_10= 'minutes' | otherlv_11= 'm' )
                    int alt26=3;
                    switch ( input.LA(1) ) {
                    case 59:
                        {
                        alt26=1;
                        }
                        break;
                    case 60:
                        {
                        alt26=2;
                        }
                        break;
                    case 61:
                        {
                        alt26=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;
                    }

                    switch (alt26) {
                        case 1 :
                            // InternalDeviceDefinition.g:1546:5: otherlv_9= 'minute'
                            {
                            otherlv_9=(Token)match(input,59,FOLLOW_2); 

                            					newLeafNode(otherlv_9, grammarAccess.getTimeUnitAccess().getMinuteKeyword_2_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDeviceDefinition.g:1551:5: otherlv_10= 'minutes'
                            {
                            otherlv_10=(Token)match(input,60,FOLLOW_2); 

                            					newLeafNode(otherlv_10, grammarAccess.getTimeUnitAccess().getMinutesKeyword_2_1_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalDeviceDefinition.g:1556:5: otherlv_11= 'm'
                            {
                            otherlv_11=(Token)match(input,61,FOLLOW_2); 

                            					newLeafNode(otherlv_11, grammarAccess.getTimeUnitAccess().getMKeyword_2_1_2());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDeviceDefinition.g:1563:3: ( () (otherlv_13= 'hour' | otherlv_14= 'hours' | otherlv_15= 'h' ) )
                    {
                    // InternalDeviceDefinition.g:1563:3: ( () (otherlv_13= 'hour' | otherlv_14= 'hours' | otherlv_15= 'h' ) )
                    // InternalDeviceDefinition.g:1564:4: () (otherlv_13= 'hour' | otherlv_14= 'hours' | otherlv_15= 'h' )
                    {
                    // InternalDeviceDefinition.g:1564:4: ()
                    // InternalDeviceDefinition.g:1565:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTimeUnitAccess().getHourAction_3_0(),
                    						current);
                    				

                    }

                    // InternalDeviceDefinition.g:1571:4: (otherlv_13= 'hour' | otherlv_14= 'hours' | otherlv_15= 'h' )
                    int alt27=3;
                    switch ( input.LA(1) ) {
                    case 62:
                        {
                        alt27=1;
                        }
                        break;
                    case 63:
                        {
                        alt27=2;
                        }
                        break;
                    case 64:
                        {
                        alt27=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;
                    }

                    switch (alt27) {
                        case 1 :
                            // InternalDeviceDefinition.g:1572:5: otherlv_13= 'hour'
                            {
                            otherlv_13=(Token)match(input,62,FOLLOW_2); 

                            					newLeafNode(otherlv_13, grammarAccess.getTimeUnitAccess().getHourKeyword_3_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDeviceDefinition.g:1577:5: otherlv_14= 'hours'
                            {
                            otherlv_14=(Token)match(input,63,FOLLOW_2); 

                            					newLeafNode(otherlv_14, grammarAccess.getTimeUnitAccess().getHoursKeyword_3_1_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalDeviceDefinition.g:1582:5: otherlv_15= 'h'
                            {
                            otherlv_15=(Token)match(input,64,FOLLOW_2); 

                            					newLeafNode(otherlv_15, grammarAccess.getTimeUnitAccess().getHKeyword_3_1_2());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeUnit"


    // $ANTLR start "entryRuleSensorOutput"
    // InternalDeviceDefinition.g:1592:1: entryRuleSensorOutput returns [EObject current=null] : iv_ruleSensorOutput= ruleSensorOutput EOF ;
    public final EObject entryRuleSensorOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorOutput = null;


        try {
            // InternalDeviceDefinition.g:1592:53: (iv_ruleSensorOutput= ruleSensorOutput EOF )
            // InternalDeviceDefinition.g:1593:2: iv_ruleSensorOutput= ruleSensorOutput EOF
            {
             newCompositeNode(grammarAccess.getSensorOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensorOutput=ruleSensorOutput();

            state._fsp--;

             current =iv_ruleSensorOutput; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensorOutput"


    // $ANTLR start "ruleSensorOutput"
    // InternalDeviceDefinition.g:1599:1: ruleSensorOutput returns [EObject current=null] : (otherlv_0= 'out' ( (lv_output_1_0= RULE_STRING ) )? otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'with' otherlv_5= 'mapping' ( (lv_mapping_6_0= ruleExp ) ) )? ) ;
    public final EObject ruleSensorOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_output_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_mapping_6_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:1605:2: ( (otherlv_0= 'out' ( (lv_output_1_0= RULE_STRING ) )? otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'with' otherlv_5= 'mapping' ( (lv_mapping_6_0= ruleExp ) ) )? ) )
            // InternalDeviceDefinition.g:1606:2: (otherlv_0= 'out' ( (lv_output_1_0= RULE_STRING ) )? otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'with' otherlv_5= 'mapping' ( (lv_mapping_6_0= ruleExp ) ) )? )
            {
            // InternalDeviceDefinition.g:1606:2: (otherlv_0= 'out' ( (lv_output_1_0= RULE_STRING ) )? otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'with' otherlv_5= 'mapping' ( (lv_mapping_6_0= ruleExp ) ) )? )
            // InternalDeviceDefinition.g:1607:3: otherlv_0= 'out' ( (lv_output_1_0= RULE_STRING ) )? otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'with' otherlv_5= 'mapping' ( (lv_mapping_6_0= ruleExp ) ) )?
            {
            otherlv_0=(Token)match(input,52,FOLLOW_51); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorOutputAccess().getOutKeyword_0());
            		
            // InternalDeviceDefinition.g:1611:3: ( (lv_output_1_0= RULE_STRING ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDeviceDefinition.g:1612:4: (lv_output_1_0= RULE_STRING )
                    {
                    // InternalDeviceDefinition.g:1612:4: (lv_output_1_0= RULE_STRING )
                    // InternalDeviceDefinition.g:1613:5: lv_output_1_0= RULE_STRING
                    {
                    lv_output_1_0=(Token)match(input,RULE_STRING,FOLLOW_52); 

                    					newLeafNode(lv_output_1_0, grammarAccess.getSensorOutputAccess().getOutputSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSensorOutputRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"output",
                    						lv_output_1_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,65,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getSensorOutputAccess().getAsKeyword_2());
            		
            // InternalDeviceDefinition.g:1633:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalDeviceDefinition.g:1634:4: (lv_name_3_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:1634:4: (lv_name_3_0= RULE_ID )
            // InternalDeviceDefinition.g:1635:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_53); 

            					newLeafNode(lv_name_3_0, grammarAccess.getSensorOutputAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensorOutputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDeviceDefinition.g:1651:3: (otherlv_4= 'with' otherlv_5= 'mapping' ( (lv_mapping_6_0= ruleExp ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==17) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDeviceDefinition.g:1652:4: otherlv_4= 'with' otherlv_5= 'mapping' ( (lv_mapping_6_0= ruleExp ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_54); 

                    				newLeafNode(otherlv_4, grammarAccess.getSensorOutputAccess().getWithKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,66,FOLLOW_50); 

                    				newLeafNode(otherlv_5, grammarAccess.getSensorOutputAccess().getMappingKeyword_4_1());
                    			
                    // InternalDeviceDefinition.g:1660:4: ( (lv_mapping_6_0= ruleExp ) )
                    // InternalDeviceDefinition.g:1661:5: (lv_mapping_6_0= ruleExp )
                    {
                    // InternalDeviceDefinition.g:1661:5: (lv_mapping_6_0= ruleExp )
                    // InternalDeviceDefinition.g:1662:6: lv_mapping_6_0= ruleExp
                    {

                    						newCompositeNode(grammarAccess.getSensorOutputAccess().getMappingExpParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_mapping_6_0=ruleExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorOutputRule());
                    						}
                    						set(
                    							current,
                    							"mapping",
                    							lv_mapping_6_0,
                    							"dk.sdu.gms.dds.DeviceDefinition.Exp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensorOutput"


    // $ANTLR start "entryRuleActuator"
    // InternalDeviceDefinition.g:1684:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // InternalDeviceDefinition.g:1684:49: (iv_ruleActuator= ruleActuator EOF )
            // InternalDeviceDefinition.g:1685:2: iv_ruleActuator= ruleActuator EOF
            {
             newCompositeNode(grammarAccess.getActuatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActuator=ruleActuator();

            state._fsp--;

             current =iv_ruleActuator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActuator"


    // $ANTLR start "ruleActuator"
    // InternalDeviceDefinition.g:1691:1: ruleActuator returns [EObject current=null] : (otherlv_0= 'Actuator' ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'pins' ( (lv_pins_5_0= rulePin ) )* (otherlv_6= ',' ( (lv_pins_7_0= rulePin ) ) )* ( (lv_settings_8_0= ruleSetting ) )* ( (lv_trigger_9_0= ruleTrigger ) ) ) ;
    public final EObject ruleActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_pins_5_0 = null;

        EObject lv_pins_7_0 = null;

        EObject lv_settings_8_0 = null;

        EObject lv_trigger_9_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:1697:2: ( (otherlv_0= 'Actuator' ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'pins' ( (lv_pins_5_0= rulePin ) )* (otherlv_6= ',' ( (lv_pins_7_0= rulePin ) ) )* ( (lv_settings_8_0= ruleSetting ) )* ( (lv_trigger_9_0= ruleTrigger ) ) ) )
            // InternalDeviceDefinition.g:1698:2: (otherlv_0= 'Actuator' ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'pins' ( (lv_pins_5_0= rulePin ) )* (otherlv_6= ',' ( (lv_pins_7_0= rulePin ) ) )* ( (lv_settings_8_0= ruleSetting ) )* ( (lv_trigger_9_0= ruleTrigger ) ) )
            {
            // InternalDeviceDefinition.g:1698:2: (otherlv_0= 'Actuator' ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'pins' ( (lv_pins_5_0= rulePin ) )* (otherlv_6= ',' ( (lv_pins_7_0= rulePin ) ) )* ( (lv_settings_8_0= ruleSetting ) )* ( (lv_trigger_9_0= ruleTrigger ) ) )
            // InternalDeviceDefinition.g:1699:3: otherlv_0= 'Actuator' ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'pins' ( (lv_pins_5_0= rulePin ) )* (otherlv_6= ',' ( (lv_pins_7_0= rulePin ) ) )* ( (lv_settings_8_0= ruleSetting ) )* ( (lv_trigger_9_0= ruleTrigger ) )
            {
            otherlv_0=(Token)match(input,67,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActuatorAccess().getActuatorKeyword_0());
            		
            // InternalDeviceDefinition.g:1703:3: ( (lv_type_1_0= RULE_ID ) )
            // InternalDeviceDefinition.g:1704:4: (lv_type_1_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:1704:4: (lv_type_1_0= RULE_ID )
            // InternalDeviceDefinition.g:1705:5: lv_type_1_0= RULE_ID
            {
            lv_type_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_type_1_0, grammarAccess.getActuatorAccess().getTypeIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActuatorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDeviceDefinition.g:1721:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDeviceDefinition.g:1722:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:1722:4: (lv_name_2_0= RULE_ID )
            // InternalDeviceDefinition.g:1723:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getActuatorAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActuatorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_55); 

            			newLeafNode(otherlv_3, grammarAccess.getActuatorAccess().getColonKeyword_3());
            		
            otherlv_4=(Token)match(input,46,FOLLOW_56); 

            			newLeafNode(otherlv_4, grammarAccess.getActuatorAccess().getPinsKeyword_4());
            		
            // InternalDeviceDefinition.g:1747:3: ( (lv_pins_5_0= rulePin ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=49 && LA31_0<=52)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalDeviceDefinition.g:1748:4: (lv_pins_5_0= rulePin )
            	    {
            	    // InternalDeviceDefinition.g:1748:4: (lv_pins_5_0= rulePin )
            	    // InternalDeviceDefinition.g:1749:5: lv_pins_5_0= rulePin
            	    {

            	    					newCompositeNode(grammarAccess.getActuatorAccess().getPinsPinParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_56);
            	    lv_pins_5_0=rulePin();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActuatorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"pins",
            	    						lv_pins_5_0,
            	    						"dk.sdu.gms.dds.DeviceDefinition.Pin");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // InternalDeviceDefinition.g:1766:3: (otherlv_6= ',' ( (lv_pins_7_0= rulePin ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==31) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalDeviceDefinition.g:1767:4: otherlv_6= ',' ( (lv_pins_7_0= rulePin ) )
            	    {
            	    otherlv_6=(Token)match(input,31,FOLLOW_45); 

            	    				newLeafNode(otherlv_6, grammarAccess.getActuatorAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalDeviceDefinition.g:1771:4: ( (lv_pins_7_0= rulePin ) )
            	    // InternalDeviceDefinition.g:1772:5: (lv_pins_7_0= rulePin )
            	    {
            	    // InternalDeviceDefinition.g:1772:5: (lv_pins_7_0= rulePin )
            	    // InternalDeviceDefinition.g:1773:6: lv_pins_7_0= rulePin
            	    {

            	    						newCompositeNode(grammarAccess.getActuatorAccess().getPinsPinParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_56);
            	    lv_pins_7_0=rulePin();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getActuatorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"pins",
            	    							lv_pins_7_0,
            	    							"dk.sdu.gms.dds.DeviceDefinition.Pin");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            // InternalDeviceDefinition.g:1791:3: ( (lv_settings_8_0= ruleSetting ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==72) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalDeviceDefinition.g:1792:4: (lv_settings_8_0= ruleSetting )
            	    {
            	    // InternalDeviceDefinition.g:1792:4: (lv_settings_8_0= ruleSetting )
            	    // InternalDeviceDefinition.g:1793:5: lv_settings_8_0= ruleSetting
            	    {

            	    					newCompositeNode(grammarAccess.getActuatorAccess().getSettingsSettingParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_56);
            	    lv_settings_8_0=ruleSetting();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActuatorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"settings",
            	    						lv_settings_8_0,
            	    						"dk.sdu.gms.dds.DeviceDefinition.Setting");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // InternalDeviceDefinition.g:1810:3: ( (lv_trigger_9_0= ruleTrigger ) )
            // InternalDeviceDefinition.g:1811:4: (lv_trigger_9_0= ruleTrigger )
            {
            // InternalDeviceDefinition.g:1811:4: (lv_trigger_9_0= ruleTrigger )
            // InternalDeviceDefinition.g:1812:5: lv_trigger_9_0= ruleTrigger
            {

            					newCompositeNode(grammarAccess.getActuatorAccess().getTriggerTriggerParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_trigger_9_0=ruleTrigger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActuatorRule());
            					}
            					set(
            						current,
            						"trigger",
            						lv_trigger_9_0,
            						"dk.sdu.gms.dds.DeviceDefinition.Trigger");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActuator"


    // $ANTLR start "entryRuleTrigger"
    // InternalDeviceDefinition.g:1833:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
    public final EObject entryRuleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigger = null;


        try {
            // InternalDeviceDefinition.g:1833:48: (iv_ruleTrigger= ruleTrigger EOF )
            // InternalDeviceDefinition.g:1834:2: iv_ruleTrigger= ruleTrigger EOF
            {
             newCompositeNode(grammarAccess.getTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrigger=ruleTrigger();

            state._fsp--;

             current =iv_ruleTrigger; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrigger"


    // $ANTLR start "ruleTrigger"
    // InternalDeviceDefinition.g:1840:1: ruleTrigger returns [EObject current=null] : ( ( () otherlv_1= 'when' ( (lv_exp_2_0= ruleExp ) ) ) | ( () otherlv_4= 'on' ( (lv_onExp_5_0= ruleExp ) ) ( (otherlv_6= 'off' ( (lv_offExp_7_0= ruleExp ) ) ) | (otherlv_8= 'run' otherlv_9= 'for' ( (lv_time_10_0= RULE_INT ) ) ( (lv_unit_11_0= ruleTimeUnit ) ) ) ) ) ) ;
    public final EObject ruleTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_time_10_0=null;
        EObject lv_exp_2_0 = null;

        EObject lv_onExp_5_0 = null;

        EObject lv_offExp_7_0 = null;

        EObject lv_unit_11_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:1846:2: ( ( ( () otherlv_1= 'when' ( (lv_exp_2_0= ruleExp ) ) ) | ( () otherlv_4= 'on' ( (lv_onExp_5_0= ruleExp ) ) ( (otherlv_6= 'off' ( (lv_offExp_7_0= ruleExp ) ) ) | (otherlv_8= 'run' otherlv_9= 'for' ( (lv_time_10_0= RULE_INT ) ) ( (lv_unit_11_0= ruleTimeUnit ) ) ) ) ) ) )
            // InternalDeviceDefinition.g:1847:2: ( ( () otherlv_1= 'when' ( (lv_exp_2_0= ruleExp ) ) ) | ( () otherlv_4= 'on' ( (lv_onExp_5_0= ruleExp ) ) ( (otherlv_6= 'off' ( (lv_offExp_7_0= ruleExp ) ) ) | (otherlv_8= 'run' otherlv_9= 'for' ( (lv_time_10_0= RULE_INT ) ) ( (lv_unit_11_0= ruleTimeUnit ) ) ) ) ) )
            {
            // InternalDeviceDefinition.g:1847:2: ( ( () otherlv_1= 'when' ( (lv_exp_2_0= ruleExp ) ) ) | ( () otherlv_4= 'on' ( (lv_onExp_5_0= ruleExp ) ) ( (otherlv_6= 'off' ( (lv_offExp_7_0= ruleExp ) ) ) | (otherlv_8= 'run' otherlv_9= 'for' ( (lv_time_10_0= RULE_INT ) ) ( (lv_unit_11_0= ruleTimeUnit ) ) ) ) ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==68) ) {
                alt35=1;
            }
            else if ( (LA35_0==69) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalDeviceDefinition.g:1848:3: ( () otherlv_1= 'when' ( (lv_exp_2_0= ruleExp ) ) )
                    {
                    // InternalDeviceDefinition.g:1848:3: ( () otherlv_1= 'when' ( (lv_exp_2_0= ruleExp ) ) )
                    // InternalDeviceDefinition.g:1849:4: () otherlv_1= 'when' ( (lv_exp_2_0= ruleExp ) )
                    {
                    // InternalDeviceDefinition.g:1849:4: ()
                    // InternalDeviceDefinition.g:1850:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTriggerAccess().getWhenAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,68,FOLLOW_50); 

                    				newLeafNode(otherlv_1, grammarAccess.getTriggerAccess().getWhenKeyword_0_1());
                    			
                    // InternalDeviceDefinition.g:1860:4: ( (lv_exp_2_0= ruleExp ) )
                    // InternalDeviceDefinition.g:1861:5: (lv_exp_2_0= ruleExp )
                    {
                    // InternalDeviceDefinition.g:1861:5: (lv_exp_2_0= ruleExp )
                    // InternalDeviceDefinition.g:1862:6: lv_exp_2_0= ruleExp
                    {

                    						newCompositeNode(grammarAccess.getTriggerAccess().getExpExpParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_exp_2_0=ruleExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTriggerRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_2_0,
                    							"dk.sdu.gms.dds.DeviceDefinition.Exp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDeviceDefinition.g:1881:3: ( () otherlv_4= 'on' ( (lv_onExp_5_0= ruleExp ) ) ( (otherlv_6= 'off' ( (lv_offExp_7_0= ruleExp ) ) ) | (otherlv_8= 'run' otherlv_9= 'for' ( (lv_time_10_0= RULE_INT ) ) ( (lv_unit_11_0= ruleTimeUnit ) ) ) ) )
                    {
                    // InternalDeviceDefinition.g:1881:3: ( () otherlv_4= 'on' ( (lv_onExp_5_0= ruleExp ) ) ( (otherlv_6= 'off' ( (lv_offExp_7_0= ruleExp ) ) ) | (otherlv_8= 'run' otherlv_9= 'for' ( (lv_time_10_0= RULE_INT ) ) ( (lv_unit_11_0= ruleTimeUnit ) ) ) ) )
                    // InternalDeviceDefinition.g:1882:4: () otherlv_4= 'on' ( (lv_onExp_5_0= ruleExp ) ) ( (otherlv_6= 'off' ( (lv_offExp_7_0= ruleExp ) ) ) | (otherlv_8= 'run' otherlv_9= 'for' ( (lv_time_10_0= RULE_INT ) ) ( (lv_unit_11_0= ruleTimeUnit ) ) ) )
                    {
                    // InternalDeviceDefinition.g:1882:4: ()
                    // InternalDeviceDefinition.g:1883:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTriggerAccess().getOnOffAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,69,FOLLOW_50); 

                    				newLeafNode(otherlv_4, grammarAccess.getTriggerAccess().getOnKeyword_1_1());
                    			
                    // InternalDeviceDefinition.g:1893:4: ( (lv_onExp_5_0= ruleExp ) )
                    // InternalDeviceDefinition.g:1894:5: (lv_onExp_5_0= ruleExp )
                    {
                    // InternalDeviceDefinition.g:1894:5: (lv_onExp_5_0= ruleExp )
                    // InternalDeviceDefinition.g:1895:6: lv_onExp_5_0= ruleExp
                    {

                    						newCompositeNode(grammarAccess.getTriggerAccess().getOnExpExpParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_57);
                    lv_onExp_5_0=ruleExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTriggerRule());
                    						}
                    						set(
                    							current,
                    							"onExp",
                    							lv_onExp_5_0,
                    							"dk.sdu.gms.dds.DeviceDefinition.Exp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDeviceDefinition.g:1912:4: ( (otherlv_6= 'off' ( (lv_offExp_7_0= ruleExp ) ) ) | (otherlv_8= 'run' otherlv_9= 'for' ( (lv_time_10_0= RULE_INT ) ) ( (lv_unit_11_0= ruleTimeUnit ) ) ) )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==70) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==71) ) {
                        alt34=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalDeviceDefinition.g:1913:5: (otherlv_6= 'off' ( (lv_offExp_7_0= ruleExp ) ) )
                            {
                            // InternalDeviceDefinition.g:1913:5: (otherlv_6= 'off' ( (lv_offExp_7_0= ruleExp ) ) )
                            // InternalDeviceDefinition.g:1914:6: otherlv_6= 'off' ( (lv_offExp_7_0= ruleExp ) )
                            {
                            otherlv_6=(Token)match(input,70,FOLLOW_50); 

                            						newLeafNode(otherlv_6, grammarAccess.getTriggerAccess().getOffKeyword_1_3_0_0());
                            					
                            // InternalDeviceDefinition.g:1918:6: ( (lv_offExp_7_0= ruleExp ) )
                            // InternalDeviceDefinition.g:1919:7: (lv_offExp_7_0= ruleExp )
                            {
                            // InternalDeviceDefinition.g:1919:7: (lv_offExp_7_0= ruleExp )
                            // InternalDeviceDefinition.g:1920:8: lv_offExp_7_0= ruleExp
                            {

                            								newCompositeNode(grammarAccess.getTriggerAccess().getOffExpExpParserRuleCall_1_3_0_1_0());
                            							
                            pushFollow(FOLLOW_2);
                            lv_offExp_7_0=ruleExp();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getTriggerRule());
                            								}
                            								set(
                            									current,
                            									"offExp",
                            									lv_offExp_7_0,
                            									"dk.sdu.gms.dds.DeviceDefinition.Exp");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalDeviceDefinition.g:1939:5: (otherlv_8= 'run' otherlv_9= 'for' ( (lv_time_10_0= RULE_INT ) ) ( (lv_unit_11_0= ruleTimeUnit ) ) )
                            {
                            // InternalDeviceDefinition.g:1939:5: (otherlv_8= 'run' otherlv_9= 'for' ( (lv_time_10_0= RULE_INT ) ) ( (lv_unit_11_0= ruleTimeUnit ) ) )
                            // InternalDeviceDefinition.g:1940:6: otherlv_8= 'run' otherlv_9= 'for' ( (lv_time_10_0= RULE_INT ) ) ( (lv_unit_11_0= ruleTimeUnit ) )
                            {
                            otherlv_8=(Token)match(input,71,FOLLOW_39); 

                            						newLeafNode(otherlv_8, grammarAccess.getTriggerAccess().getRunKeyword_1_3_1_0());
                            					
                            otherlv_9=(Token)match(input,44,FOLLOW_29); 

                            						newLeafNode(otherlv_9, grammarAccess.getTriggerAccess().getForKeyword_1_3_1_1());
                            					
                            // InternalDeviceDefinition.g:1948:6: ( (lv_time_10_0= RULE_INT ) )
                            // InternalDeviceDefinition.g:1949:7: (lv_time_10_0= RULE_INT )
                            {
                            // InternalDeviceDefinition.g:1949:7: (lv_time_10_0= RULE_INT )
                            // InternalDeviceDefinition.g:1950:8: lv_time_10_0= RULE_INT
                            {
                            lv_time_10_0=(Token)match(input,RULE_INT,FOLLOW_35); 

                            								newLeafNode(lv_time_10_0, grammarAccess.getTriggerAccess().getTimeINTTerminalRuleCall_1_3_1_2_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getTriggerRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"time",
                            									lv_time_10_0,
                            									"org.eclipse.xtext.common.Terminals.INT");
                            							

                            }


                            }

                            // InternalDeviceDefinition.g:1966:6: ( (lv_unit_11_0= ruleTimeUnit ) )
                            // InternalDeviceDefinition.g:1967:7: (lv_unit_11_0= ruleTimeUnit )
                            {
                            // InternalDeviceDefinition.g:1967:7: (lv_unit_11_0= ruleTimeUnit )
                            // InternalDeviceDefinition.g:1968:8: lv_unit_11_0= ruleTimeUnit
                            {

                            								newCompositeNode(grammarAccess.getTriggerAccess().getUnitTimeUnitParserRuleCall_1_3_1_3_0());
                            							
                            pushFollow(FOLLOW_2);
                            lv_unit_11_0=ruleTimeUnit();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getTriggerRule());
                            								}
                            								set(
                            									current,
                            									"unit",
                            									lv_unit_11_0,
                            									"dk.sdu.gms.dds.DeviceDefinition.TimeUnit");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrigger"


    // $ANTLR start "entryRuleSetting"
    // InternalDeviceDefinition.g:1992:1: entryRuleSetting returns [EObject current=null] : iv_ruleSetting= ruleSetting EOF ;
    public final EObject entryRuleSetting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetting = null;


        try {
            // InternalDeviceDefinition.g:1992:48: (iv_ruleSetting= ruleSetting EOF )
            // InternalDeviceDefinition.g:1993:2: iv_ruleSetting= ruleSetting EOF
            {
             newCompositeNode(grammarAccess.getSettingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetting=ruleSetting();

            state._fsp--;

             current =iv_ruleSetting; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetting"


    // $ANTLR start "ruleSetting"
    // InternalDeviceDefinition.g:1999:1: ruleSetting returns [EObject current=null] : (otherlv_0= 'setting' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= rulePrimitive ) ) ) ;
    public final EObject ruleSetting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:2005:2: ( (otherlv_0= 'setting' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= rulePrimitive ) ) ) )
            // InternalDeviceDefinition.g:2006:2: (otherlv_0= 'setting' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= rulePrimitive ) ) )
            {
            // InternalDeviceDefinition.g:2006:2: (otherlv_0= 'setting' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= rulePrimitive ) ) )
            // InternalDeviceDefinition.g:2007:3: otherlv_0= 'setting' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= rulePrimitive ) )
            {
            otherlv_0=(Token)match(input,72,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSettingAccess().getSettingKeyword_0());
            		
            // InternalDeviceDefinition.g:2011:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDeviceDefinition.g:2012:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:2012:4: (lv_name_1_0= RULE_ID )
            // InternalDeviceDefinition.g:2013:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_58); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSettingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSettingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,73,FOLLOW_59); 

            			newLeafNode(otherlv_2, grammarAccess.getSettingAccess().getEqualsSignKeyword_2());
            		
            // InternalDeviceDefinition.g:2033:3: ( (lv_value_3_0= rulePrimitive ) )
            // InternalDeviceDefinition.g:2034:4: (lv_value_3_0= rulePrimitive )
            {
            // InternalDeviceDefinition.g:2034:4: (lv_value_3_0= rulePrimitive )
            // InternalDeviceDefinition.g:2035:5: lv_value_3_0= rulePrimitive
            {

            					newCompositeNode(grammarAccess.getSettingAccess().getValuePrimitiveParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=rulePrimitive();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSettingRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"dk.sdu.gms.dds.DeviceDefinition.Primitive");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSetting"


    // $ANTLR start "entryRulePrimitive"
    // InternalDeviceDefinition.g:2056:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // InternalDeviceDefinition.g:2056:50: (iv_rulePrimitive= rulePrimitive EOF )
            // InternalDeviceDefinition.g:2057:2: iv_rulePrimitive= rulePrimitive EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitive=rulePrimitive();

            state._fsp--;

             current =iv_rulePrimitive; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitive"


    // $ANTLR start "rulePrimitive"
    // InternalDeviceDefinition.g:2063:1: rulePrimitive returns [EObject current=null] : ( ( () otherlv_1= 'TRUE' ) | ( () otherlv_3= 'FALSE' ) | this_NumberPrimitive_4= ruleNumberPrimitive ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_NumberPrimitive_4 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:2069:2: ( ( ( () otherlv_1= 'TRUE' ) | ( () otherlv_3= 'FALSE' ) | this_NumberPrimitive_4= ruleNumberPrimitive ) )
            // InternalDeviceDefinition.g:2070:2: ( ( () otherlv_1= 'TRUE' ) | ( () otherlv_3= 'FALSE' ) | this_NumberPrimitive_4= ruleNumberPrimitive )
            {
            // InternalDeviceDefinition.g:2070:2: ( ( () otherlv_1= 'TRUE' ) | ( () otherlv_3= 'FALSE' ) | this_NumberPrimitive_4= ruleNumberPrimitive )
            int alt36=3;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt36=1;
                }
                break;
            case 75:
                {
                alt36=2;
                }
                break;
            case RULE_DECIMAL:
            case RULE_INT:
                {
                alt36=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalDeviceDefinition.g:2071:3: ( () otherlv_1= 'TRUE' )
                    {
                    // InternalDeviceDefinition.g:2071:3: ( () otherlv_1= 'TRUE' )
                    // InternalDeviceDefinition.g:2072:4: () otherlv_1= 'TRUE'
                    {
                    // InternalDeviceDefinition.g:2072:4: ()
                    // InternalDeviceDefinition.g:2073:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimitiveAccess().getBooleanTrueAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,74,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimitiveAccess().getTRUEKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDeviceDefinition.g:2085:3: ( () otherlv_3= 'FALSE' )
                    {
                    // InternalDeviceDefinition.g:2085:3: ( () otherlv_3= 'FALSE' )
                    // InternalDeviceDefinition.g:2086:4: () otherlv_3= 'FALSE'
                    {
                    // InternalDeviceDefinition.g:2086:4: ()
                    // InternalDeviceDefinition.g:2087:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimitiveAccess().getBooleanFalseAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,75,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimitiveAccess().getFALSEKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDeviceDefinition.g:2099:3: this_NumberPrimitive_4= ruleNumberPrimitive
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveAccess().getNumberPrimitiveParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberPrimitive_4=ruleNumberPrimitive();

                    state._fsp--;


                    			current = this_NumberPrimitive_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitive"


    // $ANTLR start "entryRuleNumberPrimitive"
    // InternalDeviceDefinition.g:2111:1: entryRuleNumberPrimitive returns [EObject current=null] : iv_ruleNumberPrimitive= ruleNumberPrimitive EOF ;
    public final EObject entryRuleNumberPrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberPrimitive = null;


        try {
            // InternalDeviceDefinition.g:2111:56: (iv_ruleNumberPrimitive= ruleNumberPrimitive EOF )
            // InternalDeviceDefinition.g:2112:2: iv_ruleNumberPrimitive= ruleNumberPrimitive EOF
            {
             newCompositeNode(grammarAccess.getNumberPrimitiveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberPrimitive=ruleNumberPrimitive();

            state._fsp--;

             current =iv_ruleNumberPrimitive; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberPrimitive"


    // $ANTLR start "ruleNumberPrimitive"
    // InternalDeviceDefinition.g:2118:1: ruleNumberPrimitive returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_DECIMAL ) ) ) ) ;
    public final EObject ruleNumberPrimitive() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalDeviceDefinition.g:2124:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_DECIMAL ) ) ) ) )
            // InternalDeviceDefinition.g:2125:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_DECIMAL ) ) ) )
            {
            // InternalDeviceDefinition.g:2125:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_DECIMAL ) ) ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_INT) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_DECIMAL) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalDeviceDefinition.g:2126:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalDeviceDefinition.g:2126:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalDeviceDefinition.g:2127:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalDeviceDefinition.g:2127:4: ()
                    // InternalDeviceDefinition.g:2128:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNumberPrimitiveAccess().getIntPrimitiveAction_0_0(),
                    						current);
                    				

                    }

                    // InternalDeviceDefinition.g:2134:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalDeviceDefinition.g:2135:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalDeviceDefinition.g:2135:5: (lv_value_1_0= RULE_INT )
                    // InternalDeviceDefinition.g:2136:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getNumberPrimitiveAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNumberPrimitiveRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDeviceDefinition.g:2154:3: ( () ( (lv_value_3_0= RULE_DECIMAL ) ) )
                    {
                    // InternalDeviceDefinition.g:2154:3: ( () ( (lv_value_3_0= RULE_DECIMAL ) ) )
                    // InternalDeviceDefinition.g:2155:4: () ( (lv_value_3_0= RULE_DECIMAL ) )
                    {
                    // InternalDeviceDefinition.g:2155:4: ()
                    // InternalDeviceDefinition.g:2156:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNumberPrimitiveAccess().getDecimalPrimitiveAction_1_0(),
                    						current);
                    				

                    }

                    // InternalDeviceDefinition.g:2162:4: ( (lv_value_3_0= RULE_DECIMAL ) )
                    // InternalDeviceDefinition.g:2163:5: (lv_value_3_0= RULE_DECIMAL )
                    {
                    // InternalDeviceDefinition.g:2163:5: (lv_value_3_0= RULE_DECIMAL )
                    // InternalDeviceDefinition.g:2164:6: lv_value_3_0= RULE_DECIMAL
                    {
                    lv_value_3_0=(Token)match(input,RULE_DECIMAL,FOLLOW_2); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getNumberPrimitiveAccess().getValueDECIMALTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNumberPrimitiveRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"dk.sdu.gms.dds.DeviceDefinition.DECIMAL");
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberPrimitive"


    // $ANTLR start "entryRuleExp"
    // InternalDeviceDefinition.g:2185:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalDeviceDefinition.g:2185:44: (iv_ruleExp= ruleExp EOF )
            // InternalDeviceDefinition.g:2186:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalDeviceDefinition.g:2192:1: ruleExp returns [EObject current=null] : (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Factor_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:2198:2: ( (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) )
            // InternalDeviceDefinition.g:2199:2: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            {
            // InternalDeviceDefinition.g:2199:2: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            // InternalDeviceDefinition.g:2200:3: this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_60);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDeviceDefinition.g:2208:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=76 && LA39_0<=77)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalDeviceDefinition.g:2209:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) )
            	    {
            	    // InternalDeviceDefinition.g:2209:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==76) ) {
            	        alt38=1;
            	    }
            	    else if ( (LA38_0==77) ) {
            	        alt38=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 38, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // InternalDeviceDefinition.g:2210:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalDeviceDefinition.g:2210:5: ( () otherlv_2= '+' )
            	            // InternalDeviceDefinition.g:2211:6: () otherlv_2= '+'
            	            {
            	            // InternalDeviceDefinition.g:2211:6: ()
            	            // InternalDeviceDefinition.g:2212:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,76,FOLLOW_50); 

            	            						newLeafNode(otherlv_2, grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDeviceDefinition.g:2224:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalDeviceDefinition.g:2224:5: ( () otherlv_4= '-' )
            	            // InternalDeviceDefinition.g:2225:6: () otherlv_4= '-'
            	            {
            	            // InternalDeviceDefinition.g:2225:6: ()
            	            // InternalDeviceDefinition.g:2226:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,77,FOLLOW_50); 

            	            						newLeafNode(otherlv_4, grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalDeviceDefinition.g:2238:4: ( (lv_right_5_0= ruleFactor ) )
            	    // InternalDeviceDefinition.g:2239:5: (lv_right_5_0= ruleFactor )
            	    {
            	    // InternalDeviceDefinition.g:2239:5: (lv_right_5_0= ruleFactor )
            	    // InternalDeviceDefinition.g:2240:6: lv_right_5_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_60);
            	    lv_right_5_0=ruleFactor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.gms.dds.DeviceDefinition.Factor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleFactor"
    // InternalDeviceDefinition.g:2262:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalDeviceDefinition.g:2262:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalDeviceDefinition.g:2263:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalDeviceDefinition.g:2269:1: ruleFactor returns [EObject current=null] : (this_Compare_0= ruleCompare ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleCompare ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Compare_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:2275:2: ( (this_Compare_0= ruleCompare ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleCompare ) ) )* ) )
            // InternalDeviceDefinition.g:2276:2: (this_Compare_0= ruleCompare ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleCompare ) ) )* )
            {
            // InternalDeviceDefinition.g:2276:2: (this_Compare_0= ruleCompare ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleCompare ) ) )* )
            // InternalDeviceDefinition.g:2277:3: this_Compare_0= ruleCompare ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleCompare ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getCompareParserRuleCall_0());
            		
            pushFollow(FOLLOW_61);
            this_Compare_0=ruleCompare();

            state._fsp--;


            			current = this_Compare_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDeviceDefinition.g:2285:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleCompare ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=78 && LA41_0<=79)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalDeviceDefinition.g:2286:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleCompare ) )
            	    {
            	    // InternalDeviceDefinition.g:2286:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==78) ) {
            	        alt40=1;
            	    }
            	    else if ( (LA40_0==79) ) {
            	        alt40=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 40, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // InternalDeviceDefinition.g:2287:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalDeviceDefinition.g:2287:5: ( () otherlv_2= '*' )
            	            // InternalDeviceDefinition.g:2288:6: () otherlv_2= '*'
            	            {
            	            // InternalDeviceDefinition.g:2288:6: ()
            	            // InternalDeviceDefinition.g:2289:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,78,FOLLOW_50); 

            	            						newLeafNode(otherlv_2, grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDeviceDefinition.g:2301:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalDeviceDefinition.g:2301:5: ( () otherlv_4= '/' )
            	            // InternalDeviceDefinition.g:2302:6: () otherlv_4= '/'
            	            {
            	            // InternalDeviceDefinition.g:2302:6: ()
            	            // InternalDeviceDefinition.g:2303:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,79,FOLLOW_50); 

            	            						newLeafNode(otherlv_4, grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalDeviceDefinition.g:2315:4: ( (lv_right_5_0= ruleCompare ) )
            	    // InternalDeviceDefinition.g:2316:5: (lv_right_5_0= ruleCompare )
            	    {
            	    // InternalDeviceDefinition.g:2316:5: (lv_right_5_0= ruleCompare )
            	    // InternalDeviceDefinition.g:2317:6: lv_right_5_0= ruleCompare
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightCompareParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_61);
            	    lv_right_5_0=ruleCompare();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFactorRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.gms.dds.DeviceDefinition.Compare");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleCompare"
    // InternalDeviceDefinition.g:2339:1: entryRuleCompare returns [EObject current=null] : iv_ruleCompare= ruleCompare EOF ;
    public final EObject entryRuleCompare() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompare = null;


        try {
            // InternalDeviceDefinition.g:2339:48: (iv_ruleCompare= ruleCompare EOF )
            // InternalDeviceDefinition.g:2340:2: iv_ruleCompare= ruleCompare EOF
            {
             newCompositeNode(grammarAccess.getCompareRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompare=ruleCompare();

            state._fsp--;

             current =iv_ruleCompare; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompare"


    // $ANTLR start "ruleCompare"
    // InternalDeviceDefinition.g:2346:1: ruleCompare returns [EObject current=null] : (this_CompareOrEquals_0= ruleCompareOrEquals ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleCompareOrEquals ) ) )* ) ;
    public final EObject ruleCompare() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_CompareOrEquals_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:2352:2: ( (this_CompareOrEquals_0= ruleCompareOrEquals ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleCompareOrEquals ) ) )* ) )
            // InternalDeviceDefinition.g:2353:2: (this_CompareOrEquals_0= ruleCompareOrEquals ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleCompareOrEquals ) ) )* )
            {
            // InternalDeviceDefinition.g:2353:2: (this_CompareOrEquals_0= ruleCompareOrEquals ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleCompareOrEquals ) ) )* )
            // InternalDeviceDefinition.g:2354:3: this_CompareOrEquals_0= ruleCompareOrEquals ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleCompareOrEquals ) ) )*
            {

            			newCompositeNode(grammarAccess.getCompareAccess().getCompareOrEqualsParserRuleCall_0());
            		
            pushFollow(FOLLOW_62);
            this_CompareOrEquals_0=ruleCompareOrEquals();

            state._fsp--;


            			current = this_CompareOrEquals_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDeviceDefinition.g:2362:3: ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleCompareOrEquals ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=80 && LA43_0<=81)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalDeviceDefinition.g:2363:4: ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleCompareOrEquals ) )
            	    {
            	    // InternalDeviceDefinition.g:2363:4: ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) )
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==80) ) {
            	        alt42=1;
            	    }
            	    else if ( (LA42_0==81) ) {
            	        alt42=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 42, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // InternalDeviceDefinition.g:2364:5: ( () otherlv_2= '>' )
            	            {
            	            // InternalDeviceDefinition.g:2364:5: ( () otherlv_2= '>' )
            	            // InternalDeviceDefinition.g:2365:6: () otherlv_2= '>'
            	            {
            	            // InternalDeviceDefinition.g:2365:6: ()
            	            // InternalDeviceDefinition.g:2366:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getCompareAccess().getGreaterLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,80,FOLLOW_50); 

            	            						newLeafNode(otherlv_2, grammarAccess.getCompareAccess().getGreaterThanSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDeviceDefinition.g:2378:5: ( () otherlv_4= '<' )
            	            {
            	            // InternalDeviceDefinition.g:2378:5: ( () otherlv_4= '<' )
            	            // InternalDeviceDefinition.g:2379:6: () otherlv_4= '<'
            	            {
            	            // InternalDeviceDefinition.g:2379:6: ()
            	            // InternalDeviceDefinition.g:2380:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getCompareAccess().getLesserLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,81,FOLLOW_50); 

            	            						newLeafNode(otherlv_4, grammarAccess.getCompareAccess().getLessThanSignKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalDeviceDefinition.g:2392:4: ( (lv_right_5_0= ruleCompareOrEquals ) )
            	    // InternalDeviceDefinition.g:2393:5: (lv_right_5_0= ruleCompareOrEquals )
            	    {
            	    // InternalDeviceDefinition.g:2393:5: (lv_right_5_0= ruleCompareOrEquals )
            	    // InternalDeviceDefinition.g:2394:6: lv_right_5_0= ruleCompareOrEquals
            	    {

            	    						newCompositeNode(grammarAccess.getCompareAccess().getRightCompareOrEqualsParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_62);
            	    lv_right_5_0=ruleCompareOrEquals();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompareRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.gms.dds.DeviceDefinition.CompareOrEquals");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompare"


    // $ANTLR start "entryRuleCompareOrEquals"
    // InternalDeviceDefinition.g:2416:1: entryRuleCompareOrEquals returns [EObject current=null] : iv_ruleCompareOrEquals= ruleCompareOrEquals EOF ;
    public final EObject entryRuleCompareOrEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOrEquals = null;


        try {
            // InternalDeviceDefinition.g:2416:56: (iv_ruleCompareOrEquals= ruleCompareOrEquals EOF )
            // InternalDeviceDefinition.g:2417:2: iv_ruleCompareOrEquals= ruleCompareOrEquals EOF
            {
             newCompositeNode(grammarAccess.getCompareOrEqualsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompareOrEquals=ruleCompareOrEquals();

            state._fsp--;

             current =iv_ruleCompareOrEquals; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompareOrEquals"


    // $ANTLR start "ruleCompareOrEquals"
    // InternalDeviceDefinition.g:2423:1: ruleCompareOrEquals returns [EObject current=null] : (this_EqualsOrNotEquals_0= ruleEqualsOrNotEquals ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) ) ( (lv_right_5_0= ruleEqualsOrNotEquals ) ) )* ) ;
    public final EObject ruleCompareOrEquals() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_EqualsOrNotEquals_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:2429:2: ( (this_EqualsOrNotEquals_0= ruleEqualsOrNotEquals ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) ) ( (lv_right_5_0= ruleEqualsOrNotEquals ) ) )* ) )
            // InternalDeviceDefinition.g:2430:2: (this_EqualsOrNotEquals_0= ruleEqualsOrNotEquals ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) ) ( (lv_right_5_0= ruleEqualsOrNotEquals ) ) )* )
            {
            // InternalDeviceDefinition.g:2430:2: (this_EqualsOrNotEquals_0= ruleEqualsOrNotEquals ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) ) ( (lv_right_5_0= ruleEqualsOrNotEquals ) ) )* )
            // InternalDeviceDefinition.g:2431:3: this_EqualsOrNotEquals_0= ruleEqualsOrNotEquals ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) ) ( (lv_right_5_0= ruleEqualsOrNotEquals ) ) )*
            {

            			newCompositeNode(grammarAccess.getCompareOrEqualsAccess().getEqualsOrNotEqualsParserRuleCall_0());
            		
            pushFollow(FOLLOW_63);
            this_EqualsOrNotEquals_0=ruleEqualsOrNotEquals();

            state._fsp--;


            			current = this_EqualsOrNotEquals_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDeviceDefinition.g:2439:3: ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) ) ( (lv_right_5_0= ruleEqualsOrNotEquals ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=82 && LA45_0<=83)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalDeviceDefinition.g:2440:4: ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) ) ( (lv_right_5_0= ruleEqualsOrNotEquals ) )
            	    {
            	    // InternalDeviceDefinition.g:2440:4: ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) )
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==82) ) {
            	        alt44=1;
            	    }
            	    else if ( (LA44_0==83) ) {
            	        alt44=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 44, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // InternalDeviceDefinition.g:2441:5: ( () otherlv_2= '>=' )
            	            {
            	            // InternalDeviceDefinition.g:2441:5: ( () otherlv_2= '>=' )
            	            // InternalDeviceDefinition.g:2442:6: () otherlv_2= '>='
            	            {
            	            // InternalDeviceDefinition.g:2442:6: ()
            	            // InternalDeviceDefinition.g:2443:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getCompareOrEqualsAccess().getGreaterOrEqualsLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,82,FOLLOW_50); 

            	            						newLeafNode(otherlv_2, grammarAccess.getCompareOrEqualsAccess().getGreaterThanSignEqualsSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDeviceDefinition.g:2455:5: ( () otherlv_4= '<=' )
            	            {
            	            // InternalDeviceDefinition.g:2455:5: ( () otherlv_4= '<=' )
            	            // InternalDeviceDefinition.g:2456:6: () otherlv_4= '<='
            	            {
            	            // InternalDeviceDefinition.g:2456:6: ()
            	            // InternalDeviceDefinition.g:2457:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getCompareOrEqualsAccess().getLesserOrEqualsLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,83,FOLLOW_50); 

            	            						newLeafNode(otherlv_4, grammarAccess.getCompareOrEqualsAccess().getLessThanSignEqualsSignKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalDeviceDefinition.g:2469:4: ( (lv_right_5_0= ruleEqualsOrNotEquals ) )
            	    // InternalDeviceDefinition.g:2470:5: (lv_right_5_0= ruleEqualsOrNotEquals )
            	    {
            	    // InternalDeviceDefinition.g:2470:5: (lv_right_5_0= ruleEqualsOrNotEquals )
            	    // InternalDeviceDefinition.g:2471:6: lv_right_5_0= ruleEqualsOrNotEquals
            	    {

            	    						newCompositeNode(grammarAccess.getCompareOrEqualsAccess().getRightEqualsOrNotEqualsParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_63);
            	    lv_right_5_0=ruleEqualsOrNotEquals();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompareOrEqualsRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.gms.dds.DeviceDefinition.EqualsOrNotEquals");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompareOrEquals"


    // $ANTLR start "entryRuleEqualsOrNotEquals"
    // InternalDeviceDefinition.g:2493:1: entryRuleEqualsOrNotEquals returns [EObject current=null] : iv_ruleEqualsOrNotEquals= ruleEqualsOrNotEquals EOF ;
    public final EObject entryRuleEqualsOrNotEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualsOrNotEquals = null;


        try {
            // InternalDeviceDefinition.g:2493:58: (iv_ruleEqualsOrNotEquals= ruleEqualsOrNotEquals EOF )
            // InternalDeviceDefinition.g:2494:2: iv_ruleEqualsOrNotEquals= ruleEqualsOrNotEquals EOF
            {
             newCompositeNode(grammarAccess.getEqualsOrNotEqualsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqualsOrNotEquals=ruleEqualsOrNotEquals();

            state._fsp--;

             current =iv_ruleEqualsOrNotEquals; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEqualsOrNotEquals"


    // $ANTLR start "ruleEqualsOrNotEquals"
    // InternalDeviceDefinition.g:2500:1: ruleEqualsOrNotEquals returns [EObject current=null] : (this_AndOr_0= ruleAndOr ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleAndOr ) ) )* ) ;
    public final EObject ruleEqualsOrNotEquals() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_AndOr_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:2506:2: ( (this_AndOr_0= ruleAndOr ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleAndOr ) ) )* ) )
            // InternalDeviceDefinition.g:2507:2: (this_AndOr_0= ruleAndOr ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleAndOr ) ) )* )
            {
            // InternalDeviceDefinition.g:2507:2: (this_AndOr_0= ruleAndOr ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleAndOr ) ) )* )
            // InternalDeviceDefinition.g:2508:3: this_AndOr_0= ruleAndOr ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleAndOr ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualsOrNotEqualsAccess().getAndOrParserRuleCall_0());
            		
            pushFollow(FOLLOW_64);
            this_AndOr_0=ruleAndOr();

            state._fsp--;


            			current = this_AndOr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDeviceDefinition.g:2516:3: ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleAndOr ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=84 && LA47_0<=85)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalDeviceDefinition.g:2517:4: ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleAndOr ) )
            	    {
            	    // InternalDeviceDefinition.g:2517:4: ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) )
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==84) ) {
            	        alt46=1;
            	    }
            	    else if ( (LA46_0==85) ) {
            	        alt46=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 46, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // InternalDeviceDefinition.g:2518:5: ( () otherlv_2= '==' )
            	            {
            	            // InternalDeviceDefinition.g:2518:5: ( () otherlv_2= '==' )
            	            // InternalDeviceDefinition.g:2519:6: () otherlv_2= '=='
            	            {
            	            // InternalDeviceDefinition.g:2519:6: ()
            	            // InternalDeviceDefinition.g:2520:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getEqualsOrNotEqualsAccess().getEqualsLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,84,FOLLOW_50); 

            	            						newLeafNode(otherlv_2, grammarAccess.getEqualsOrNotEqualsAccess().getEqualsSignEqualsSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDeviceDefinition.g:2532:5: ( () otherlv_4= '!=' )
            	            {
            	            // InternalDeviceDefinition.g:2532:5: ( () otherlv_4= '!=' )
            	            // InternalDeviceDefinition.g:2533:6: () otherlv_4= '!='
            	            {
            	            // InternalDeviceDefinition.g:2533:6: ()
            	            // InternalDeviceDefinition.g:2534:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getEqualsOrNotEqualsAccess().getNotEqualsLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,85,FOLLOW_50); 

            	            						newLeafNode(otherlv_4, grammarAccess.getEqualsOrNotEqualsAccess().getExclamationMarkEqualsSignKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalDeviceDefinition.g:2546:4: ( (lv_right_5_0= ruleAndOr ) )
            	    // InternalDeviceDefinition.g:2547:5: (lv_right_5_0= ruleAndOr )
            	    {
            	    // InternalDeviceDefinition.g:2547:5: (lv_right_5_0= ruleAndOr )
            	    // InternalDeviceDefinition.g:2548:6: lv_right_5_0= ruleAndOr
            	    {

            	    						newCompositeNode(grammarAccess.getEqualsOrNotEqualsAccess().getRightAndOrParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_64);
            	    lv_right_5_0=ruleAndOr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqualsOrNotEqualsRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.gms.dds.DeviceDefinition.AndOr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqualsOrNotEquals"


    // $ANTLR start "entryRuleAndOr"
    // InternalDeviceDefinition.g:2570:1: entryRuleAndOr returns [EObject current=null] : iv_ruleAndOr= ruleAndOr EOF ;
    public final EObject entryRuleAndOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndOr = null;


        try {
            // InternalDeviceDefinition.g:2570:46: (iv_ruleAndOr= ruleAndOr EOF )
            // InternalDeviceDefinition.g:2571:2: iv_ruleAndOr= ruleAndOr EOF
            {
             newCompositeNode(grammarAccess.getAndOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndOr=ruleAndOr();

            state._fsp--;

             current =iv_ruleAndOr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndOr"


    // $ANTLR start "ruleAndOr"
    // InternalDeviceDefinition.g:2577:1: ruleAndOr returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( ( () otherlv_2= 'and' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleAndOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Primary_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:2583:2: ( (this_Primary_0= rulePrimary ( ( ( () otherlv_2= 'and' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) )
            // InternalDeviceDefinition.g:2584:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= 'and' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            {
            // InternalDeviceDefinition.g:2584:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= 'and' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            // InternalDeviceDefinition.g:2585:3: this_Primary_0= rulePrimary ( ( ( () otherlv_2= 'and' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndOrAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_65);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDeviceDefinition.g:2593:3: ( ( ( () otherlv_2= 'and' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==21||LA49_0==86) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalDeviceDefinition.g:2594:4: ( ( () otherlv_2= 'and' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= rulePrimary ) )
            	    {
            	    // InternalDeviceDefinition.g:2594:4: ( ( () otherlv_2= 'and' ) | ( () otherlv_4= 'or' ) )
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( (LA48_0==21) ) {
            	        alt48=1;
            	    }
            	    else if ( (LA48_0==86) ) {
            	        alt48=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 48, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // InternalDeviceDefinition.g:2595:5: ( () otherlv_2= 'and' )
            	            {
            	            // InternalDeviceDefinition.g:2595:5: ( () otherlv_2= 'and' )
            	            // InternalDeviceDefinition.g:2596:6: () otherlv_2= 'and'
            	            {
            	            // InternalDeviceDefinition.g:2596:6: ()
            	            // InternalDeviceDefinition.g:2597:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getAndOrAccess().getAndLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,21,FOLLOW_50); 

            	            						newLeafNode(otherlv_2, grammarAccess.getAndOrAccess().getAndKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDeviceDefinition.g:2609:5: ( () otherlv_4= 'or' )
            	            {
            	            // InternalDeviceDefinition.g:2609:5: ( () otherlv_4= 'or' )
            	            // InternalDeviceDefinition.g:2610:6: () otherlv_4= 'or'
            	            {
            	            // InternalDeviceDefinition.g:2610:6: ()
            	            // InternalDeviceDefinition.g:2611:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getAndOrAccess().getOrLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,86,FOLLOW_50); 

            	            						newLeafNode(otherlv_4, grammarAccess.getAndOrAccess().getOrKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalDeviceDefinition.g:2623:4: ( (lv_right_5_0= rulePrimary ) )
            	    // InternalDeviceDefinition.g:2624:5: (lv_right_5_0= rulePrimary )
            	    {
            	    // InternalDeviceDefinition.g:2624:5: (lv_right_5_0= rulePrimary )
            	    // InternalDeviceDefinition.g:2625:6: lv_right_5_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getAndOrAccess().getRightPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_65);
            	    lv_right_5_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndOrRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.gms.dds.DeviceDefinition.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndOr"


    // $ANTLR start "entryRulePrimary"
    // InternalDeviceDefinition.g:2647:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalDeviceDefinition.g:2647:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalDeviceDefinition.g:2648:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalDeviceDefinition.g:2654:1: rulePrimary returns [EObject current=null] : (this_Primitive_0= rulePrimitive | this_Parenthesis_1= ruleParenthesis | this_VariableUse_2= ruleVariableUse | this_ExternalCall_3= ruleExternalCall | ( () otherlv_5= 'value' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        EObject this_Primitive_0 = null;

        EObject this_Parenthesis_1 = null;

        EObject this_VariableUse_2 = null;

        EObject this_ExternalCall_3 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:2660:2: ( (this_Primitive_0= rulePrimitive | this_Parenthesis_1= ruleParenthesis | this_VariableUse_2= ruleVariableUse | this_ExternalCall_3= ruleExternalCall | ( () otherlv_5= 'value' ) ) )
            // InternalDeviceDefinition.g:2661:2: (this_Primitive_0= rulePrimitive | this_Parenthesis_1= ruleParenthesis | this_VariableUse_2= ruleVariableUse | this_ExternalCall_3= ruleExternalCall | ( () otherlv_5= 'value' ) )
            {
            // InternalDeviceDefinition.g:2661:2: (this_Primitive_0= rulePrimitive | this_Parenthesis_1= ruleParenthesis | this_VariableUse_2= ruleVariableUse | this_ExternalCall_3= ruleExternalCall | ( () otherlv_5= 'value' ) )
            int alt50=5;
            switch ( input.LA(1) ) {
            case RULE_DECIMAL:
            case RULE_INT:
            case 74:
            case 75:
                {
                alt50=1;
                }
                break;
            case 30:
                {
                alt50=2;
                }
                break;
            case RULE_ID:
                {
                alt50=3;
                }
                break;
            case 88:
                {
                alt50=4;
                }
                break;
            case 87:
                {
                alt50=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalDeviceDefinition.g:2662:3: this_Primitive_0= rulePrimitive
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getPrimitiveParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Primitive_0=rulePrimitive();

                    state._fsp--;


                    			current = this_Primitive_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDeviceDefinition.g:2671:3: this_Parenthesis_1= ruleParenthesis
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parenthesis_1=ruleParenthesis();

                    state._fsp--;


                    			current = this_Parenthesis_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDeviceDefinition.g:2680:3: this_VariableUse_2= ruleVariableUse
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableUse_2=ruleVariableUse();

                    state._fsp--;


                    			current = this_VariableUse_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDeviceDefinition.g:2689:3: this_ExternalCall_3= ruleExternalCall
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getExternalCallParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalCall_3=ruleExternalCall();

                    state._fsp--;


                    			current = this_ExternalCall_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDeviceDefinition.g:2698:3: ( () otherlv_5= 'value' )
                    {
                    // InternalDeviceDefinition.g:2698:3: ( () otherlv_5= 'value' )
                    // InternalDeviceDefinition.g:2699:4: () otherlv_5= 'value'
                    {
                    // InternalDeviceDefinition.g:2699:4: ()
                    // InternalDeviceDefinition.g:2700:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getValueAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,87,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getValueKeyword_4_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleExternalCall"
    // InternalDeviceDefinition.g:2715:1: entryRuleExternalCall returns [EObject current=null] : iv_ruleExternalCall= ruleExternalCall EOF ;
    public final EObject entryRuleExternalCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalCall = null;


        try {
            // InternalDeviceDefinition.g:2715:53: (iv_ruleExternalCall= ruleExternalCall EOF )
            // InternalDeviceDefinition.g:2716:2: iv_ruleExternalCall= ruleExternalCall EOF
            {
             newCompositeNode(grammarAccess.getExternalCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalCall=ruleExternalCall();

            state._fsp--;

             current =iv_ruleExternalCall; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalCall"


    // $ANTLR start "ruleExternalCall"
    // InternalDeviceDefinition.g:2722:1: ruleExternalCall returns [EObject current=null] : (otherlv_0= 'call' ( (lv_func_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_args_3_0= ruleExp ) )? (otherlv_4= ',' ( (lv_args_5_0= ruleExp ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleExternalCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_func_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_args_3_0 = null;

        EObject lv_args_5_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:2728:2: ( (otherlv_0= 'call' ( (lv_func_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_args_3_0= ruleExp ) )? (otherlv_4= ',' ( (lv_args_5_0= ruleExp ) ) )* otherlv_6= ')' ) )
            // InternalDeviceDefinition.g:2729:2: (otherlv_0= 'call' ( (lv_func_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_args_3_0= ruleExp ) )? (otherlv_4= ',' ( (lv_args_5_0= ruleExp ) ) )* otherlv_6= ')' )
            {
            // InternalDeviceDefinition.g:2729:2: (otherlv_0= 'call' ( (lv_func_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_args_3_0= ruleExp ) )? (otherlv_4= ',' ( (lv_args_5_0= ruleExp ) ) )* otherlv_6= ')' )
            // InternalDeviceDefinition.g:2730:3: otherlv_0= 'call' ( (lv_func_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_args_3_0= ruleExp ) )? (otherlv_4= ',' ( (lv_args_5_0= ruleExp ) ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,88,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalCallAccess().getCallKeyword_0());
            		
            // InternalDeviceDefinition.g:2734:3: ( (lv_func_1_0= RULE_ID ) )
            // InternalDeviceDefinition.g:2735:4: (lv_func_1_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:2735:4: (lv_func_1_0= RULE_ID )
            // InternalDeviceDefinition.g:2736:5: lv_func_1_0= RULE_ID
            {
            lv_func_1_0=(Token)match(input,RULE_ID,FOLLOW_66); 

            					newLeafNode(lv_func_1_0, grammarAccess.getExternalCallAccess().getFuncIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalCallRule());
            					}
            					setWithLastConsumed(
            						current,
            						"func",
            						lv_func_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_67); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalCallAccess().getLeftParenthesisKeyword_2());
            		
            // InternalDeviceDefinition.g:2756:3: ( (lv_args_3_0= ruleExp ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID||LA51_0==RULE_DECIMAL||LA51_0==RULE_INT||LA51_0==30||(LA51_0>=74 && LA51_0<=75)||(LA51_0>=87 && LA51_0<=88)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalDeviceDefinition.g:2757:4: (lv_args_3_0= ruleExp )
                    {
                    // InternalDeviceDefinition.g:2757:4: (lv_args_3_0= ruleExp )
                    // InternalDeviceDefinition.g:2758:5: lv_args_3_0= ruleExp
                    {

                    					newCompositeNode(grammarAccess.getExternalCallAccess().getArgsExpParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_68);
                    lv_args_3_0=ruleExp();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExternalCallRule());
                    					}
                    					add(
                    						current,
                    						"args",
                    						lv_args_3_0,
                    						"dk.sdu.gms.dds.DeviceDefinition.Exp");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDeviceDefinition.g:2775:3: (otherlv_4= ',' ( (lv_args_5_0= ruleExp ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==31) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalDeviceDefinition.g:2776:4: otherlv_4= ',' ( (lv_args_5_0= ruleExp ) )
            	    {
            	    otherlv_4=(Token)match(input,31,FOLLOW_50); 

            	    				newLeafNode(otherlv_4, grammarAccess.getExternalCallAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalDeviceDefinition.g:2780:4: ( (lv_args_5_0= ruleExp ) )
            	    // InternalDeviceDefinition.g:2781:5: (lv_args_5_0= ruleExp )
            	    {
            	    // InternalDeviceDefinition.g:2781:5: (lv_args_5_0= ruleExp )
            	    // InternalDeviceDefinition.g:2782:6: lv_args_5_0= ruleExp
            	    {

            	    						newCompositeNode(grammarAccess.getExternalCallAccess().getArgsExpParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_68);
            	    lv_args_5_0=ruleExp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExternalCallRule());
            	    						}
            	    						add(
            	    							current,
            	    							"args",
            	    							lv_args_5_0,
            	    							"dk.sdu.gms.dds.DeviceDefinition.Exp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            otherlv_6=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getExternalCallAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalCall"


    // $ANTLR start "entryRuleInternalVariableUse"
    // InternalDeviceDefinition.g:2808:1: entryRuleInternalVariableUse returns [EObject current=null] : iv_ruleInternalVariableUse= ruleInternalVariableUse EOF ;
    public final EObject entryRuleInternalVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalVariableUse = null;


        try {
            // InternalDeviceDefinition.g:2808:60: (iv_ruleInternalVariableUse= ruleInternalVariableUse EOF )
            // InternalDeviceDefinition.g:2809:2: iv_ruleInternalVariableUse= ruleInternalVariableUse EOF
            {
             newCompositeNode(grammarAccess.getInternalVariableUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInternalVariableUse=ruleInternalVariableUse();

            state._fsp--;

             current =iv_ruleInternalVariableUse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInternalVariableUse"


    // $ANTLR start "ruleInternalVariableUse"
    // InternalDeviceDefinition.g:2815:1: ruleInternalVariableUse returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleInternalVariableUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDeviceDefinition.g:2821:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalDeviceDefinition.g:2822:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalDeviceDefinition.g:2822:2: ( (otherlv_0= RULE_ID ) )
            // InternalDeviceDefinition.g:2823:3: (otherlv_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:2823:3: (otherlv_0= RULE_ID )
            // InternalDeviceDefinition.g:2824:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getInternalVariableUseRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getInternalVariableUseAccess().getRefBindingCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInternalVariableUse"


    // $ANTLR start "entryRuleExternalVariableUse"
    // InternalDeviceDefinition.g:2838:1: entryRuleExternalVariableUse returns [EObject current=null] : iv_ruleExternalVariableUse= ruleExternalVariableUse EOF ;
    public final EObject entryRuleExternalVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalVariableUse = null;


        try {
            // InternalDeviceDefinition.g:2838:60: (iv_ruleExternalVariableUse= ruleExternalVariableUse EOF )
            // InternalDeviceDefinition.g:2839:2: iv_ruleExternalVariableUse= ruleExternalVariableUse EOF
            {
             newCompositeNode(grammarAccess.getExternalVariableUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalVariableUse=ruleExternalVariableUse();

            state._fsp--;

             current =iv_ruleExternalVariableUse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalVariableUse"


    // $ANTLR start "ruleExternalVariableUse"
    // InternalDeviceDefinition.g:2845:1: ruleExternalVariableUse returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' | otherlv_2= '->' ) ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleExternalVariableUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDeviceDefinition.g:2851:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' | otherlv_2= '->' ) ( (otherlv_3= RULE_ID ) ) ) )
            // InternalDeviceDefinition.g:2852:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' | otherlv_2= '->' ) ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalDeviceDefinition.g:2852:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' | otherlv_2= '->' ) ( (otherlv_3= RULE_ID ) ) )
            // InternalDeviceDefinition.g:2853:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' | otherlv_2= '->' ) ( (otherlv_3= RULE_ID ) )
            {
            // InternalDeviceDefinition.g:2853:3: ( (otherlv_0= RULE_ID ) )
            // InternalDeviceDefinition.g:2854:4: (otherlv_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:2854:4: (otherlv_0= RULE_ID )
            // InternalDeviceDefinition.g:2855:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalVariableUseRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_69); 

            					newLeafNode(otherlv_0, grammarAccess.getExternalVariableUseAccess().getObjDeviceCrossReference_0_0());
            				

            }


            }

            // InternalDeviceDefinition.g:2866:3: (otherlv_1= '.' | otherlv_2= '->' )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==89) ) {
                alt53=1;
            }
            else if ( (LA53_0==90) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalDeviceDefinition.g:2867:4: otherlv_1= '.'
                    {
                    otherlv_1=(Token)match(input,89,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getExternalVariableUseAccess().getFullStopKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDeviceDefinition.g:2872:4: otherlv_2= '->'
                    {
                    otherlv_2=(Token)match(input,90,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getExternalVariableUseAccess().getHyphenMinusGreaterThanSignKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalDeviceDefinition.g:2877:3: ( (otherlv_3= RULE_ID ) )
            // InternalDeviceDefinition.g:2878:4: (otherlv_3= RULE_ID )
            {
            // InternalDeviceDefinition.g:2878:4: (otherlv_3= RULE_ID )
            // InternalDeviceDefinition.g:2879:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalVariableUseRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getExternalVariableUseAccess().getRefBindingCrossReference_2_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalVariableUse"


    // $ANTLR start "entryRuleGraphVariableUse"
    // InternalDeviceDefinition.g:2894:1: entryRuleGraphVariableUse returns [EObject current=null] : iv_ruleGraphVariableUse= ruleGraphVariableUse EOF ;
    public final EObject entryRuleGraphVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphVariableUse = null;


        try {
            // InternalDeviceDefinition.g:2894:57: (iv_ruleGraphVariableUse= ruleGraphVariableUse EOF )
            // InternalDeviceDefinition.g:2895:2: iv_ruleGraphVariableUse= ruleGraphVariableUse EOF
            {
             newCompositeNode(grammarAccess.getGraphVariableUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphVariableUse=ruleGraphVariableUse();

            state._fsp--;

             current =iv_ruleGraphVariableUse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGraphVariableUse"


    // $ANTLR start "ruleGraphVariableUse"
    // InternalDeviceDefinition.g:2901:1: ruleGraphVariableUse returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' | otherlv_2= '->' ) ( (otherlv_3= RULE_ID ) ) (otherlv_4= '.' | otherlv_5= '->' ) ( (otherlv_6= RULE_ID ) ) ) ;
    public final EObject ruleGraphVariableUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalDeviceDefinition.g:2907:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' | otherlv_2= '->' ) ( (otherlv_3= RULE_ID ) ) (otherlv_4= '.' | otherlv_5= '->' ) ( (otherlv_6= RULE_ID ) ) ) )
            // InternalDeviceDefinition.g:2908:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' | otherlv_2= '->' ) ( (otherlv_3= RULE_ID ) ) (otherlv_4= '.' | otherlv_5= '->' ) ( (otherlv_6= RULE_ID ) ) )
            {
            // InternalDeviceDefinition.g:2908:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' | otherlv_2= '->' ) ( (otherlv_3= RULE_ID ) ) (otherlv_4= '.' | otherlv_5= '->' ) ( (otherlv_6= RULE_ID ) ) )
            // InternalDeviceDefinition.g:2909:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' | otherlv_2= '->' ) ( (otherlv_3= RULE_ID ) ) (otherlv_4= '.' | otherlv_5= '->' ) ( (otherlv_6= RULE_ID ) )
            {
            // InternalDeviceDefinition.g:2909:3: ( (otherlv_0= RULE_ID ) )
            // InternalDeviceDefinition.g:2910:4: (otherlv_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:2910:4: (otherlv_0= RULE_ID )
            // InternalDeviceDefinition.g:2911:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphVariableUseRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_69); 

            					newLeafNode(otherlv_0, grammarAccess.getGraphVariableUseAccess().getWorkerWorkerCrossReference_0_0());
            				

            }


            }

            // InternalDeviceDefinition.g:2922:3: (otherlv_1= '.' | otherlv_2= '->' )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==89) ) {
                alt54=1;
            }
            else if ( (LA54_0==90) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalDeviceDefinition.g:2923:4: otherlv_1= '.'
                    {
                    otherlv_1=(Token)match(input,89,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getGraphVariableUseAccess().getFullStopKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDeviceDefinition.g:2928:4: otherlv_2= '->'
                    {
                    otherlv_2=(Token)match(input,90,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getGraphVariableUseAccess().getHyphenMinusGreaterThanSignKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalDeviceDefinition.g:2933:3: ( (otherlv_3= RULE_ID ) )
            // InternalDeviceDefinition.g:2934:4: (otherlv_3= RULE_ID )
            {
            // InternalDeviceDefinition.g:2934:4: (otherlv_3= RULE_ID )
            // InternalDeviceDefinition.g:2935:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphVariableUseRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_69); 

            					newLeafNode(otherlv_3, grammarAccess.getGraphVariableUseAccess().getDeviceDeviceCrossReference_2_0());
            				

            }


            }

            // InternalDeviceDefinition.g:2946:3: (otherlv_4= '.' | otherlv_5= '->' )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==89) ) {
                alt55=1;
            }
            else if ( (LA55_0==90) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalDeviceDefinition.g:2947:4: otherlv_4= '.'
                    {
                    otherlv_4=(Token)match(input,89,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getGraphVariableUseAccess().getFullStopKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDeviceDefinition.g:2952:4: otherlv_5= '->'
                    {
                    otherlv_5=(Token)match(input,90,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getGraphVariableUseAccess().getHyphenMinusGreaterThanSignKeyword_3_1());
                    			

                    }
                    break;

            }

            // InternalDeviceDefinition.g:2957:3: ( (otherlv_6= RULE_ID ) )
            // InternalDeviceDefinition.g:2958:4: (otherlv_6= RULE_ID )
            {
            // InternalDeviceDefinition.g:2958:4: (otherlv_6= RULE_ID )
            // InternalDeviceDefinition.g:2959:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphVariableUseRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_6, grammarAccess.getGraphVariableUseAccess().getRefBindingCrossReference_4_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGraphVariableUse"


    // $ANTLR start "entryRuleVariableUse"
    // InternalDeviceDefinition.g:2974:1: entryRuleVariableUse returns [EObject current=null] : iv_ruleVariableUse= ruleVariableUse EOF ;
    public final EObject entryRuleVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableUse = null;


        try {
            // InternalDeviceDefinition.g:2974:52: (iv_ruleVariableUse= ruleVariableUse EOF )
            // InternalDeviceDefinition.g:2975:2: iv_ruleVariableUse= ruleVariableUse EOF
            {
             newCompositeNode(grammarAccess.getVariableUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableUse=ruleVariableUse();

            state._fsp--;

             current =iv_ruleVariableUse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableUse"


    // $ANTLR start "ruleVariableUse"
    // InternalDeviceDefinition.g:2981:1: ruleVariableUse returns [EObject current=null] : (this_InternalVariableUse_0= ruleInternalVariableUse | this_ExternalVariableUse_1= ruleExternalVariableUse | this_GraphVariableUse_2= ruleGraphVariableUse ) ;
    public final EObject ruleVariableUse() throws RecognitionException {
        EObject current = null;

        EObject this_InternalVariableUse_0 = null;

        EObject this_ExternalVariableUse_1 = null;

        EObject this_GraphVariableUse_2 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:2987:2: ( (this_InternalVariableUse_0= ruleInternalVariableUse | this_ExternalVariableUse_1= ruleExternalVariableUse | this_GraphVariableUse_2= ruleGraphVariableUse ) )
            // InternalDeviceDefinition.g:2988:2: (this_InternalVariableUse_0= ruleInternalVariableUse | this_ExternalVariableUse_1= ruleExternalVariableUse | this_GraphVariableUse_2= ruleGraphVariableUse )
            {
            // InternalDeviceDefinition.g:2988:2: (this_InternalVariableUse_0= ruleInternalVariableUse | this_ExternalVariableUse_1= ruleExternalVariableUse | this_GraphVariableUse_2= ruleGraphVariableUse )
            int alt56=3;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 89:
                    {
                    int LA56_2 = input.LA(3);

                    if ( (LA56_2==RULE_ID) ) {
                        int LA56_5 = input.LA(4);

                        if ( ((LA56_5>=89 && LA56_5<=90)) ) {
                            alt56=3;
                        }
                        else if ( (LA56_5==EOF||(LA56_5>=21 && LA56_5<=22)||(LA56_5>=31 && LA56_5<=32)||LA56_5==41||LA56_5==45||LA56_5==47||LA56_5==52||LA56_5==67||(LA56_5>=70 && LA56_5<=72)||(LA56_5>=76 && LA56_5<=86)) ) {
                            alt56=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 56, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 56, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 90:
                    {
                    int LA56_3 = input.LA(3);

                    if ( (LA56_3==RULE_ID) ) {
                        int LA56_5 = input.LA(4);

                        if ( ((LA56_5>=89 && LA56_5<=90)) ) {
                            alt56=3;
                        }
                        else if ( (LA56_5==EOF||(LA56_5>=21 && LA56_5<=22)||(LA56_5>=31 && LA56_5<=32)||LA56_5==41||LA56_5==45||LA56_5==47||LA56_5==52||LA56_5==67||(LA56_5>=70 && LA56_5<=72)||(LA56_5>=76 && LA56_5<=86)) ) {
                            alt56=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 56, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 56, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case 21:
                case 22:
                case 31:
                case 32:
                case 41:
                case 45:
                case 47:
                case 52:
                case 67:
                case 70:
                case 71:
                case 72:
                case 76:
                case 77:
                case 78:
                case 79:
                case 80:
                case 81:
                case 82:
                case 83:
                case 84:
                case 85:
                case 86:
                    {
                    alt56=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalDeviceDefinition.g:2989:3: this_InternalVariableUse_0= ruleInternalVariableUse
                    {

                    			newCompositeNode(grammarAccess.getVariableUseAccess().getInternalVariableUseParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_InternalVariableUse_0=ruleInternalVariableUse();

                    state._fsp--;


                    			current = this_InternalVariableUse_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDeviceDefinition.g:2998:3: this_ExternalVariableUse_1= ruleExternalVariableUse
                    {

                    			newCompositeNode(grammarAccess.getVariableUseAccess().getExternalVariableUseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalVariableUse_1=ruleExternalVariableUse();

                    state._fsp--;


                    			current = this_ExternalVariableUse_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDeviceDefinition.g:3007:3: this_GraphVariableUse_2= ruleGraphVariableUse
                    {

                    			newCompositeNode(grammarAccess.getVariableUseAccess().getGraphVariableUseParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphVariableUse_2=ruleGraphVariableUse();

                    state._fsp--;


                    			current = this_GraphVariableUse_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableUse"


    // $ANTLR start "entryRuleParenthesis"
    // InternalDeviceDefinition.g:3019:1: entryRuleParenthesis returns [EObject current=null] : iv_ruleParenthesis= ruleParenthesis EOF ;
    public final EObject entryRuleParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesis = null;


        try {
            // InternalDeviceDefinition.g:3019:52: (iv_ruleParenthesis= ruleParenthesis EOF )
            // InternalDeviceDefinition.g:3020:2: iv_ruleParenthesis= ruleParenthesis EOF
            {
             newCompositeNode(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParenthesis=ruleParenthesis();

            state._fsp--;

             current =iv_ruleParenthesis; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalDeviceDefinition.g:3026:1: ruleParenthesis returns [EObject current=null] : (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' ) ;
    public final EObject ruleParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:3032:2: ( (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' ) )
            // InternalDeviceDefinition.g:3033:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' )
            {
            // InternalDeviceDefinition.g:3033:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' )
            // InternalDeviceDefinition.g:3034:3: otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_50); 

            			newLeafNode(otherlv_0, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0());
            		
            // InternalDeviceDefinition.g:3038:3: ( (lv_exp_1_0= ruleExp ) )
            // InternalDeviceDefinition.g:3039:4: (lv_exp_1_0= ruleExp )
            {
            // InternalDeviceDefinition.g:3039:4: (lv_exp_1_0= ruleExp )
            // InternalDeviceDefinition.g:3040:5: lv_exp_1_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
            lv_exp_1_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParenthesisRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_1_0,
            						"dk.sdu.gms.dds.DeviceDefinition.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "ruleColorPreset"
    // InternalDeviceDefinition.g:3065:1: ruleColorPreset returns [Enumerator current=null] : ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'green' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'yellow' ) ) ;
    public final Enumerator ruleColorPreset() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDeviceDefinition.g:3071:2: ( ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'green' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'yellow' ) ) )
            // InternalDeviceDefinition.g:3072:2: ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'green' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'yellow' ) )
            {
            // InternalDeviceDefinition.g:3072:2: ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'green' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'yellow' ) )
            int alt57=4;
            switch ( input.LA(1) ) {
            case 91:
                {
                alt57=1;
                }
                break;
            case 92:
                {
                alt57=2;
                }
                break;
            case 93:
                {
                alt57=3;
                }
                break;
            case 94:
                {
                alt57=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalDeviceDefinition.g:3073:3: (enumLiteral_0= 'red' )
                    {
                    // InternalDeviceDefinition.g:3073:3: (enumLiteral_0= 'red' )
                    // InternalDeviceDefinition.g:3074:4: enumLiteral_0= 'red'
                    {
                    enumLiteral_0=(Token)match(input,91,FOLLOW_2); 

                    				current = grammarAccess.getColorPresetAccess().getRedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getColorPresetAccess().getRedEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDeviceDefinition.g:3081:3: (enumLiteral_1= 'green' )
                    {
                    // InternalDeviceDefinition.g:3081:3: (enumLiteral_1= 'green' )
                    // InternalDeviceDefinition.g:3082:4: enumLiteral_1= 'green'
                    {
                    enumLiteral_1=(Token)match(input,92,FOLLOW_2); 

                    				current = grammarAccess.getColorPresetAccess().getGreenEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getColorPresetAccess().getGreenEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDeviceDefinition.g:3089:3: (enumLiteral_2= 'blue' )
                    {
                    // InternalDeviceDefinition.g:3089:3: (enumLiteral_2= 'blue' )
                    // InternalDeviceDefinition.g:3090:4: enumLiteral_2= 'blue'
                    {
                    enumLiteral_2=(Token)match(input,93,FOLLOW_2); 

                    				current = grammarAccess.getColorPresetAccess().getBlueEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getColorPresetAccess().getBlueEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDeviceDefinition.g:3097:3: (enumLiteral_3= 'yellow' )
                    {
                    // InternalDeviceDefinition.g:3097:3: (enumLiteral_3= 'yellow' )
                    // InternalDeviceDefinition.g:3098:4: enumLiteral_3= 'yellow'
                    {
                    enumLiteral_3=(Token)match(input,94,FOLLOW_2); 

                    				current = grammarAccess.getColorPresetAccess().getYellowEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getColorPresetAccess().getYellowEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColorPreset"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000400020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000240000000L,0x0000000078000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000002A000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0xFFE0000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000002A000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x000020A000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000208000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000200000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0010C00000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x001E800080000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x001E000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0010800080000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0010800000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000800000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000040000150L,0x0000000001800C00L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x001E000080000000L,0x0000000000000130L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000140L,0x0000000000000C00L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000002L,0x000000000000C000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000002L,0x00000000000C0000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000002L,0x0000000000300000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000200002L,0x0000000000400000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x00000001C0000150L,0x0000000001800C00L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000006000000L});

}