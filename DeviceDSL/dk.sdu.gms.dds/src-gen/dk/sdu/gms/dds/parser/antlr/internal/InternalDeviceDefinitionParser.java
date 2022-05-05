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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_DECIMAL", "RULE_ID", "RULE_MAC", "RULE_INT", "RULE_HEXBYTE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'System'", "':'", "'wifi'", "'with'", "'password'", "'mqtt'", "'username'", "'and'", "'Graph'", "'category'", "'title'", "'x'", "'y'", "'line'", "'legend'", "'color'", "'('", "','", "')'", "'random'", "'Gateway'", "'mac'", "'Worker'", "'sleep'", "'for'", "'Sensor'", "'pins'", "'sample'", "'if'", "'adc'", "'dac'", "'in'", "'out'", "'second'", "'seconds'", "'minute'", "'minutes'", "'hour'", "'hours'", "'as'", "'mapping'", "'Actuator'", "'when'", "'on'", "'off'", "'run'", "'setting'", "'='", "'TRUE'", "'FALSE'", "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'or'", "'value'", "'call'", "'.'", "'->'", "'red'", "'green'", "'blue'", "'yellow'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int RULE_DECIMAL=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_MAC=7;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int RULE_HEXBYTE=9;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
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
    // InternalDeviceDefinition.g:72:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'System' otherlv_1= ':' otherlv_2= 'wifi' ( (lv_wifiSsid_3_0= RULE_STRING ) ) (otherlv_4= 'with' otherlv_5= 'password' ( (lv_wifiPassword_6_0= RULE_STRING ) ) )? otherlv_7= 'mqtt' ( (lv_mqttHost_8_0= RULE_STRING ) ) (otherlv_9= 'with' otherlv_10= 'username' ( (lv_mqttUsername_11_0= RULE_STRING ) ) otherlv_12= 'and' otherlv_13= 'password' ( (lv_mqttPassword_14_0= RULE_STRING ) ) )? ( (lv_gateway_15_0= ruleGateway ) ) ( (lv_graphs_16_0= ruleGraph ) )* ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_wifiSsid_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_wifiPassword_6_0=null;
        Token otherlv_7=null;
        Token lv_mqttHost_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_mqttUsername_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_mqttPassword_14_0=null;
        EObject lv_gateway_15_0 = null;

        EObject lv_graphs_16_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:78:2: ( (otherlv_0= 'System' otherlv_1= ':' otherlv_2= 'wifi' ( (lv_wifiSsid_3_0= RULE_STRING ) ) (otherlv_4= 'with' otherlv_5= 'password' ( (lv_wifiPassword_6_0= RULE_STRING ) ) )? otherlv_7= 'mqtt' ( (lv_mqttHost_8_0= RULE_STRING ) ) (otherlv_9= 'with' otherlv_10= 'username' ( (lv_mqttUsername_11_0= RULE_STRING ) ) otherlv_12= 'and' otherlv_13= 'password' ( (lv_mqttPassword_14_0= RULE_STRING ) ) )? ( (lv_gateway_15_0= ruleGateway ) ) ( (lv_graphs_16_0= ruleGraph ) )* ) )
            // InternalDeviceDefinition.g:79:2: (otherlv_0= 'System' otherlv_1= ':' otherlv_2= 'wifi' ( (lv_wifiSsid_3_0= RULE_STRING ) ) (otherlv_4= 'with' otherlv_5= 'password' ( (lv_wifiPassword_6_0= RULE_STRING ) ) )? otherlv_7= 'mqtt' ( (lv_mqttHost_8_0= RULE_STRING ) ) (otherlv_9= 'with' otherlv_10= 'username' ( (lv_mqttUsername_11_0= RULE_STRING ) ) otherlv_12= 'and' otherlv_13= 'password' ( (lv_mqttPassword_14_0= RULE_STRING ) ) )? ( (lv_gateway_15_0= ruleGateway ) ) ( (lv_graphs_16_0= ruleGraph ) )* )
            {
            // InternalDeviceDefinition.g:79:2: (otherlv_0= 'System' otherlv_1= ':' otherlv_2= 'wifi' ( (lv_wifiSsid_3_0= RULE_STRING ) ) (otherlv_4= 'with' otherlv_5= 'password' ( (lv_wifiPassword_6_0= RULE_STRING ) ) )? otherlv_7= 'mqtt' ( (lv_mqttHost_8_0= RULE_STRING ) ) (otherlv_9= 'with' otherlv_10= 'username' ( (lv_mqttUsername_11_0= RULE_STRING ) ) otherlv_12= 'and' otherlv_13= 'password' ( (lv_mqttPassword_14_0= RULE_STRING ) ) )? ( (lv_gateway_15_0= ruleGateway ) ) ( (lv_graphs_16_0= ruleGraph ) )* )
            // InternalDeviceDefinition.g:80:3: otherlv_0= 'System' otherlv_1= ':' otherlv_2= 'wifi' ( (lv_wifiSsid_3_0= RULE_STRING ) ) (otherlv_4= 'with' otherlv_5= 'password' ( (lv_wifiPassword_6_0= RULE_STRING ) ) )? otherlv_7= 'mqtt' ( (lv_mqttHost_8_0= RULE_STRING ) ) (otherlv_9= 'with' otherlv_10= 'username' ( (lv_mqttUsername_11_0= RULE_STRING ) ) otherlv_12= 'and' otherlv_13= 'password' ( (lv_mqttPassword_14_0= RULE_STRING ) ) )? ( (lv_gateway_15_0= ruleGateway ) ) ( (lv_graphs_16_0= ruleGraph ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getWifiKeyword_2());
            		
            // InternalDeviceDefinition.g:92:3: ( (lv_wifiSsid_3_0= RULE_STRING ) )
            // InternalDeviceDefinition.g:93:4: (lv_wifiSsid_3_0= RULE_STRING )
            {
            // InternalDeviceDefinition.g:93:4: (lv_wifiSsid_3_0= RULE_STRING )
            // InternalDeviceDefinition.g:94:5: lv_wifiSsid_3_0= RULE_STRING
            {
            lv_wifiSsid_3_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_wifiSsid_3_0, grammarAccess.getSystemAccess().getWifiSsidSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"wifiSsid",
            						lv_wifiSsid_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDeviceDefinition.g:110:3: (otherlv_4= 'with' otherlv_5= 'password' ( (lv_wifiPassword_6_0= RULE_STRING ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==17) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDeviceDefinition.g:111:4: otherlv_4= 'with' otherlv_5= 'password' ( (lv_wifiPassword_6_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getSystemAccess().getWithKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getSystemAccess().getPasswordKeyword_4_1());
                    			
                    // InternalDeviceDefinition.g:119:4: ( (lv_wifiPassword_6_0= RULE_STRING ) )
                    // InternalDeviceDefinition.g:120:5: (lv_wifiPassword_6_0= RULE_STRING )
                    {
                    // InternalDeviceDefinition.g:120:5: (lv_wifiPassword_6_0= RULE_STRING )
                    // InternalDeviceDefinition.g:121:6: lv_wifiPassword_6_0= RULE_STRING
                    {
                    lv_wifiPassword_6_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_wifiPassword_6_0, grammarAccess.getSystemAccess().getWifiPasswordSTRINGTerminalRuleCall_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSystemRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"wifiPassword",
                    							lv_wifiPassword_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getSystemAccess().getMqttKeyword_5());
            		
            // InternalDeviceDefinition.g:142:3: ( (lv_mqttHost_8_0= RULE_STRING ) )
            // InternalDeviceDefinition.g:143:4: (lv_mqttHost_8_0= RULE_STRING )
            {
            // InternalDeviceDefinition.g:143:4: (lv_mqttHost_8_0= RULE_STRING )
            // InternalDeviceDefinition.g:144:5: lv_mqttHost_8_0= RULE_STRING
            {
            lv_mqttHost_8_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_mqttHost_8_0, grammarAccess.getSystemAccess().getMqttHostSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"mqttHost",
            						lv_mqttHost_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDeviceDefinition.g:160:3: (otherlv_9= 'with' otherlv_10= 'username' ( (lv_mqttUsername_11_0= RULE_STRING ) ) otherlv_12= 'and' otherlv_13= 'password' ( (lv_mqttPassword_14_0= RULE_STRING ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDeviceDefinition.g:161:4: otherlv_9= 'with' otherlv_10= 'username' ( (lv_mqttUsername_11_0= RULE_STRING ) ) otherlv_12= 'and' otherlv_13= 'password' ( (lv_mqttPassword_14_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getSystemAccess().getWithKeyword_7_0());
                    			
                    otherlv_10=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getSystemAccess().getUsernameKeyword_7_1());
                    			
                    // InternalDeviceDefinition.g:169:4: ( (lv_mqttUsername_11_0= RULE_STRING ) )
                    // InternalDeviceDefinition.g:170:5: (lv_mqttUsername_11_0= RULE_STRING )
                    {
                    // InternalDeviceDefinition.g:170:5: (lv_mqttUsername_11_0= RULE_STRING )
                    // InternalDeviceDefinition.g:171:6: lv_mqttUsername_11_0= RULE_STRING
                    {
                    lv_mqttUsername_11_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    						newLeafNode(lv_mqttUsername_11_0, grammarAccess.getSystemAccess().getMqttUsernameSTRINGTerminalRuleCall_7_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSystemRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"mqttUsername",
                    							lv_mqttUsername_11_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,21,FOLLOW_7); 

                    				newLeafNode(otherlv_12, grammarAccess.getSystemAccess().getAndKeyword_7_3());
                    			
                    otherlv_13=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_13, grammarAccess.getSystemAccess().getPasswordKeyword_7_4());
                    			
                    // InternalDeviceDefinition.g:195:4: ( (lv_mqttPassword_14_0= RULE_STRING ) )
                    // InternalDeviceDefinition.g:196:5: (lv_mqttPassword_14_0= RULE_STRING )
                    {
                    // InternalDeviceDefinition.g:196:5: (lv_mqttPassword_14_0= RULE_STRING )
                    // InternalDeviceDefinition.g:197:6: lv_mqttPassword_14_0= RULE_STRING
                    {
                    lv_mqttPassword_14_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    						newLeafNode(lv_mqttPassword_14_0, grammarAccess.getSystemAccess().getMqttPasswordSTRINGTerminalRuleCall_7_5_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSystemRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"mqttPassword",
                    							lv_mqttPassword_14_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDeviceDefinition.g:214:3: ( (lv_gateway_15_0= ruleGateway ) )
            // InternalDeviceDefinition.g:215:4: (lv_gateway_15_0= ruleGateway )
            {
            // InternalDeviceDefinition.g:215:4: (lv_gateway_15_0= ruleGateway )
            // InternalDeviceDefinition.g:216:5: lv_gateway_15_0= ruleGateway
            {

            					newCompositeNode(grammarAccess.getSystemAccess().getGatewayGatewayParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_12);
            lv_gateway_15_0=ruleGateway();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemRule());
            					}
            					set(
            						current,
            						"gateway",
            						lv_gateway_15_0,
            						"dk.sdu.gms.dds.DeviceDefinition.Gateway");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDeviceDefinition.g:233:3: ( (lv_graphs_16_0= ruleGraph ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDeviceDefinition.g:234:4: (lv_graphs_16_0= ruleGraph )
            	    {
            	    // InternalDeviceDefinition.g:234:4: (lv_graphs_16_0= ruleGraph )
            	    // InternalDeviceDefinition.g:235:5: lv_graphs_16_0= ruleGraph
            	    {

            	    					newCompositeNode(grammarAccess.getSystemAccess().getGraphsGraphParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_graphs_16_0=ruleGraph();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"graphs",
            	    						lv_graphs_16_0,
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
    // InternalDeviceDefinition.g:256:1: entryRuleGraph returns [EObject current=null] : iv_ruleGraph= ruleGraph EOF ;
    public final EObject entryRuleGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraph = null;


        try {
            // InternalDeviceDefinition.g:256:46: (iv_ruleGraph= ruleGraph EOF )
            // InternalDeviceDefinition.g:257:2: iv_ruleGraph= ruleGraph EOF
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
    // InternalDeviceDefinition.g:263:1: ruleGraph returns [EObject current=null] : (otherlv_0= 'Graph' otherlv_1= ':' otherlv_2= 'category' ( (lv_category_3_0= RULE_STRING ) ) otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) otherlv_6= 'x' ( (lv_xlabel_7_0= RULE_STRING ) ) otherlv_8= 'y' ( (lv_ylabel_9_0= RULE_STRING ) ) ( (lv_lines_10_0= ruleGraphLine ) )+ ) ;
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
            // InternalDeviceDefinition.g:269:2: ( (otherlv_0= 'Graph' otherlv_1= ':' otherlv_2= 'category' ( (lv_category_3_0= RULE_STRING ) ) otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) otherlv_6= 'x' ( (lv_xlabel_7_0= RULE_STRING ) ) otherlv_8= 'y' ( (lv_ylabel_9_0= RULE_STRING ) ) ( (lv_lines_10_0= ruleGraphLine ) )+ ) )
            // InternalDeviceDefinition.g:270:2: (otherlv_0= 'Graph' otherlv_1= ':' otherlv_2= 'category' ( (lv_category_3_0= RULE_STRING ) ) otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) otherlv_6= 'x' ( (lv_xlabel_7_0= RULE_STRING ) ) otherlv_8= 'y' ( (lv_ylabel_9_0= RULE_STRING ) ) ( (lv_lines_10_0= ruleGraphLine ) )+ )
            {
            // InternalDeviceDefinition.g:270:2: (otherlv_0= 'Graph' otherlv_1= ':' otherlv_2= 'category' ( (lv_category_3_0= RULE_STRING ) ) otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) otherlv_6= 'x' ( (lv_xlabel_7_0= RULE_STRING ) ) otherlv_8= 'y' ( (lv_ylabel_9_0= RULE_STRING ) ) ( (lv_lines_10_0= ruleGraphLine ) )+ )
            // InternalDeviceDefinition.g:271:3: otherlv_0= 'Graph' otherlv_1= ':' otherlv_2= 'category' ( (lv_category_3_0= RULE_STRING ) ) otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) otherlv_6= 'x' ( (lv_xlabel_7_0= RULE_STRING ) ) otherlv_8= 'y' ( (lv_ylabel_9_0= RULE_STRING ) ) ( (lv_lines_10_0= ruleGraphLine ) )+
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphAccess().getGraphKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getGraphAccess().getCategoryKeyword_2());
            		
            // InternalDeviceDefinition.g:283:3: ( (lv_category_3_0= RULE_STRING ) )
            // InternalDeviceDefinition.g:284:4: (lv_category_3_0= RULE_STRING )
            {
            // InternalDeviceDefinition.g:284:4: (lv_category_3_0= RULE_STRING )
            // InternalDeviceDefinition.g:285:5: lv_category_3_0= RULE_STRING
            {
            lv_category_3_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

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

            otherlv_4=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getGraphAccess().getTitleKeyword_4());
            		
            // InternalDeviceDefinition.g:305:3: ( (lv_title_5_0= RULE_STRING ) )
            // InternalDeviceDefinition.g:306:4: (lv_title_5_0= RULE_STRING )
            {
            // InternalDeviceDefinition.g:306:4: (lv_title_5_0= RULE_STRING )
            // InternalDeviceDefinition.g:307:5: lv_title_5_0= RULE_STRING
            {
            lv_title_5_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

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

            otherlv_6=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getGraphAccess().getXKeyword_6());
            		
            // InternalDeviceDefinition.g:327:3: ( (lv_xlabel_7_0= RULE_STRING ) )
            // InternalDeviceDefinition.g:328:4: (lv_xlabel_7_0= RULE_STRING )
            {
            // InternalDeviceDefinition.g:328:4: (lv_xlabel_7_0= RULE_STRING )
            // InternalDeviceDefinition.g:329:5: lv_xlabel_7_0= RULE_STRING
            {
            lv_xlabel_7_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

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

            otherlv_8=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getGraphAccess().getYKeyword_8());
            		
            // InternalDeviceDefinition.g:349:3: ( (lv_ylabel_9_0= RULE_STRING ) )
            // InternalDeviceDefinition.g:350:4: (lv_ylabel_9_0= RULE_STRING )
            {
            // InternalDeviceDefinition.g:350:4: (lv_ylabel_9_0= RULE_STRING )
            // InternalDeviceDefinition.g:351:5: lv_ylabel_9_0= RULE_STRING
            {
            lv_ylabel_9_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

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

            // InternalDeviceDefinition.g:367:3: ( (lv_lines_10_0= ruleGraphLine ) )+
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
            	    // InternalDeviceDefinition.g:368:4: (lv_lines_10_0= ruleGraphLine )
            	    {
            	    // InternalDeviceDefinition.g:368:4: (lv_lines_10_0= ruleGraphLine )
            	    // InternalDeviceDefinition.g:369:5: lv_lines_10_0= ruleGraphLine
            	    {

            	    					newCompositeNode(grammarAccess.getGraphAccess().getLinesGraphLineParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_18);
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
    // InternalDeviceDefinition.g:390:1: entryRuleGraphLine returns [EObject current=null] : iv_ruleGraphLine= ruleGraphLine EOF ;
    public final EObject entryRuleGraphLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphLine = null;


        try {
            // InternalDeviceDefinition.g:390:50: (iv_ruleGraphLine= ruleGraphLine EOF )
            // InternalDeviceDefinition.g:391:2: iv_ruleGraphLine= ruleGraphLine EOF
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
    // InternalDeviceDefinition.g:397:1: ruleGraphLine returns [EObject current=null] : (otherlv_0= 'line' ( (lv_output_1_0= ruleExp ) ) (otherlv_2= 'legend' ( (lv_legend_3_0= RULE_STRING ) ) )? (otherlv_4= 'color' ( (lv_color_5_0= ruleColor ) ) )? ) ;
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
            // InternalDeviceDefinition.g:403:2: ( (otherlv_0= 'line' ( (lv_output_1_0= ruleExp ) ) (otherlv_2= 'legend' ( (lv_legend_3_0= RULE_STRING ) ) )? (otherlv_4= 'color' ( (lv_color_5_0= ruleColor ) ) )? ) )
            // InternalDeviceDefinition.g:404:2: (otherlv_0= 'line' ( (lv_output_1_0= ruleExp ) ) (otherlv_2= 'legend' ( (lv_legend_3_0= RULE_STRING ) ) )? (otherlv_4= 'color' ( (lv_color_5_0= ruleColor ) ) )? )
            {
            // InternalDeviceDefinition.g:404:2: (otherlv_0= 'line' ( (lv_output_1_0= ruleExp ) ) (otherlv_2= 'legend' ( (lv_legend_3_0= RULE_STRING ) ) )? (otherlv_4= 'color' ( (lv_color_5_0= ruleColor ) ) )? )
            // InternalDeviceDefinition.g:405:3: otherlv_0= 'line' ( (lv_output_1_0= ruleExp ) ) (otherlv_2= 'legend' ( (lv_legend_3_0= RULE_STRING ) ) )? (otherlv_4= 'color' ( (lv_color_5_0= ruleColor ) ) )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphLineAccess().getLineKeyword_0());
            		
            // InternalDeviceDefinition.g:409:3: ( (lv_output_1_0= ruleExp ) )
            // InternalDeviceDefinition.g:410:4: (lv_output_1_0= ruleExp )
            {
            // InternalDeviceDefinition.g:410:4: (lv_output_1_0= ruleExp )
            // InternalDeviceDefinition.g:411:5: lv_output_1_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getGraphLineAccess().getOutputExpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_output_1_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphLineRule());
            					}
            					set(
            						current,
            						"output",
            						lv_output_1_0,
            						"dk.sdu.gms.dds.DeviceDefinition.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDeviceDefinition.g:428:3: (otherlv_2= 'legend' ( (lv_legend_3_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==28) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDeviceDefinition.g:429:4: otherlv_2= 'legend' ( (lv_legend_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getGraphLineAccess().getLegendKeyword_2_0());
                    			
                    // InternalDeviceDefinition.g:433:4: ( (lv_legend_3_0= RULE_STRING ) )
                    // InternalDeviceDefinition.g:434:5: (lv_legend_3_0= RULE_STRING )
                    {
                    // InternalDeviceDefinition.g:434:5: (lv_legend_3_0= RULE_STRING )
                    // InternalDeviceDefinition.g:435:6: lv_legend_3_0= RULE_STRING
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

            // InternalDeviceDefinition.g:452:3: (otherlv_4= 'color' ( (lv_color_5_0= ruleColor ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDeviceDefinition.g:453:4: otherlv_4= 'color' ( (lv_color_5_0= ruleColor ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_22); 

                    				newLeafNode(otherlv_4, grammarAccess.getGraphLineAccess().getColorKeyword_3_0());
                    			
                    // InternalDeviceDefinition.g:457:4: ( (lv_color_5_0= ruleColor ) )
                    // InternalDeviceDefinition.g:458:5: (lv_color_5_0= ruleColor )
                    {
                    // InternalDeviceDefinition.g:458:5: (lv_color_5_0= ruleColor )
                    // InternalDeviceDefinition.g:459:6: lv_color_5_0= ruleColor
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
    // InternalDeviceDefinition.g:481:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // InternalDeviceDefinition.g:481:46: (iv_ruleColor= ruleColor EOF )
            // InternalDeviceDefinition.g:482:2: iv_ruleColor= ruleColor EOF
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
    // InternalDeviceDefinition.g:488:1: ruleColor returns [EObject current=null] : ( ( () otherlv_1= '(' ( (lv_red_2_0= RULE_DECIMAL ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_DECIMAL ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_DECIMAL ) ) otherlv_7= ')' ) | ( () ( (lv_preset_9_0= ruleColorPreset ) ) ) | ( () otherlv_11= 'random' ) ) ;
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
            // InternalDeviceDefinition.g:494:2: ( ( ( () otherlv_1= '(' ( (lv_red_2_0= RULE_DECIMAL ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_DECIMAL ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_DECIMAL ) ) otherlv_7= ')' ) | ( () ( (lv_preset_9_0= ruleColorPreset ) ) ) | ( () otherlv_11= 'random' ) ) )
            // InternalDeviceDefinition.g:495:2: ( ( () otherlv_1= '(' ( (lv_red_2_0= RULE_DECIMAL ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_DECIMAL ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_DECIMAL ) ) otherlv_7= ')' ) | ( () ( (lv_preset_9_0= ruleColorPreset ) ) ) | ( () otherlv_11= 'random' ) )
            {
            // InternalDeviceDefinition.g:495:2: ( ( () otherlv_1= '(' ( (lv_red_2_0= RULE_DECIMAL ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_DECIMAL ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_DECIMAL ) ) otherlv_7= ')' ) | ( () ( (lv_preset_9_0= ruleColorPreset ) ) ) | ( () otherlv_11= 'random' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt7=1;
                }
                break;
            case 79:
            case 80:
            case 81:
            case 82:
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
                    // InternalDeviceDefinition.g:496:3: ( () otherlv_1= '(' ( (lv_red_2_0= RULE_DECIMAL ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_DECIMAL ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_DECIMAL ) ) otherlv_7= ')' )
                    {
                    // InternalDeviceDefinition.g:496:3: ( () otherlv_1= '(' ( (lv_red_2_0= RULE_DECIMAL ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_DECIMAL ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_DECIMAL ) ) otherlv_7= ')' )
                    // InternalDeviceDefinition.g:497:4: () otherlv_1= '(' ( (lv_red_2_0= RULE_DECIMAL ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_DECIMAL ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_DECIMAL ) ) otherlv_7= ')'
                    {
                    // InternalDeviceDefinition.g:497:4: ()
                    // InternalDeviceDefinition.g:498:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getColorAccess().getRGBAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,30,FOLLOW_23); 

                    				newLeafNode(otherlv_1, grammarAccess.getColorAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalDeviceDefinition.g:508:4: ( (lv_red_2_0= RULE_DECIMAL ) )
                    // InternalDeviceDefinition.g:509:5: (lv_red_2_0= RULE_DECIMAL )
                    {
                    // InternalDeviceDefinition.g:509:5: (lv_red_2_0= RULE_DECIMAL )
                    // InternalDeviceDefinition.g:510:6: lv_red_2_0= RULE_DECIMAL
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
                    			
                    // InternalDeviceDefinition.g:530:4: ( (lv_green_4_0= RULE_DECIMAL ) )
                    // InternalDeviceDefinition.g:531:5: (lv_green_4_0= RULE_DECIMAL )
                    {
                    // InternalDeviceDefinition.g:531:5: (lv_green_4_0= RULE_DECIMAL )
                    // InternalDeviceDefinition.g:532:6: lv_green_4_0= RULE_DECIMAL
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
                    			
                    // InternalDeviceDefinition.g:552:4: ( (lv_blue_6_0= RULE_DECIMAL ) )
                    // InternalDeviceDefinition.g:553:5: (lv_blue_6_0= RULE_DECIMAL )
                    {
                    // InternalDeviceDefinition.g:553:5: (lv_blue_6_0= RULE_DECIMAL )
                    // InternalDeviceDefinition.g:554:6: lv_blue_6_0= RULE_DECIMAL
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
                    // InternalDeviceDefinition.g:576:3: ( () ( (lv_preset_9_0= ruleColorPreset ) ) )
                    {
                    // InternalDeviceDefinition.g:576:3: ( () ( (lv_preset_9_0= ruleColorPreset ) ) )
                    // InternalDeviceDefinition.g:577:4: () ( (lv_preset_9_0= ruleColorPreset ) )
                    {
                    // InternalDeviceDefinition.g:577:4: ()
                    // InternalDeviceDefinition.g:578:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getColorAccess().getPresetAction_1_0(),
                    						current);
                    				

                    }

                    // InternalDeviceDefinition.g:584:4: ( (lv_preset_9_0= ruleColorPreset ) )
                    // InternalDeviceDefinition.g:585:5: (lv_preset_9_0= ruleColorPreset )
                    {
                    // InternalDeviceDefinition.g:585:5: (lv_preset_9_0= ruleColorPreset )
                    // InternalDeviceDefinition.g:586:6: lv_preset_9_0= ruleColorPreset
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
                    // InternalDeviceDefinition.g:605:3: ( () otherlv_11= 'random' )
                    {
                    // InternalDeviceDefinition.g:605:3: ( () otherlv_11= 'random' )
                    // InternalDeviceDefinition.g:606:4: () otherlv_11= 'random'
                    {
                    // InternalDeviceDefinition.g:606:4: ()
                    // InternalDeviceDefinition.g:607:5: 
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
    // InternalDeviceDefinition.g:622:1: entryRuleGateway returns [EObject current=null] : iv_ruleGateway= ruleGateway EOF ;
    public final EObject entryRuleGateway() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGateway = null;


        try {
            // InternalDeviceDefinition.g:622:48: (iv_ruleGateway= ruleGateway EOF )
            // InternalDeviceDefinition.g:623:2: iv_ruleGateway= ruleGateway EOF
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
    // InternalDeviceDefinition.g:629:1: ruleGateway returns [EObject current=null] : (otherlv_0= 'Gateway' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'mac' ( (lv_mac_4_0= RULE_MAC ) ) ( (lv_workers_5_0= ruleWorker ) )+ ) ;
    public final EObject ruleGateway() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_mac_4_0=null;
        EObject lv_workers_5_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:635:2: ( (otherlv_0= 'Gateway' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'mac' ( (lv_mac_4_0= RULE_MAC ) ) ( (lv_workers_5_0= ruleWorker ) )+ ) )
            // InternalDeviceDefinition.g:636:2: (otherlv_0= 'Gateway' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'mac' ( (lv_mac_4_0= RULE_MAC ) ) ( (lv_workers_5_0= ruleWorker ) )+ )
            {
            // InternalDeviceDefinition.g:636:2: (otherlv_0= 'Gateway' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'mac' ( (lv_mac_4_0= RULE_MAC ) ) ( (lv_workers_5_0= ruleWorker ) )+ )
            // InternalDeviceDefinition.g:637:3: otherlv_0= 'Gateway' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'mac' ( (lv_mac_4_0= RULE_MAC ) ) ( (lv_workers_5_0= ruleWorker ) )+
            {
            otherlv_0=(Token)match(input,34,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getGatewayAccess().getGatewayKeyword_0());
            		
            // InternalDeviceDefinition.g:641:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDeviceDefinition.g:642:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:642:4: (lv_name_1_0= RULE_ID )
            // InternalDeviceDefinition.g:643:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getGatewayAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,35,FOLLOW_28); 

            			newLeafNode(otherlv_3, grammarAccess.getGatewayAccess().getMacKeyword_3());
            		
            // InternalDeviceDefinition.g:667:3: ( (lv_mac_4_0= RULE_MAC ) )
            // InternalDeviceDefinition.g:668:4: (lv_mac_4_0= RULE_MAC )
            {
            // InternalDeviceDefinition.g:668:4: (lv_mac_4_0= RULE_MAC )
            // InternalDeviceDefinition.g:669:5: lv_mac_4_0= RULE_MAC
            {
            lv_mac_4_0=(Token)match(input,RULE_MAC,FOLLOW_29); 

            					newLeafNode(lv_mac_4_0, grammarAccess.getGatewayAccess().getMacMACTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGatewayRule());
            					}
            					setWithLastConsumed(
            						current,
            						"mac",
            						lv_mac_4_0,
            						"dk.sdu.gms.dds.DeviceDefinition.MAC");
            				

            }


            }

            // InternalDeviceDefinition.g:685:3: ( (lv_workers_5_0= ruleWorker ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==36) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDeviceDefinition.g:686:4: (lv_workers_5_0= ruleWorker )
            	    {
            	    // InternalDeviceDefinition.g:686:4: (lv_workers_5_0= ruleWorker )
            	    // InternalDeviceDefinition.g:687:5: lv_workers_5_0= ruleWorker
            	    {

            	    					newCompositeNode(grammarAccess.getGatewayAccess().getWorkersWorkerParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_workers_5_0=ruleWorker();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGatewayRule());
            	    					}
            	    					add(
            	    						current,
            	    						"workers",
            	    						lv_workers_5_0,
            	    						"dk.sdu.gms.dds.DeviceDefinition.Worker");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
    // InternalDeviceDefinition.g:708:1: entryRuleWorker returns [EObject current=null] : iv_ruleWorker= ruleWorker EOF ;
    public final EObject entryRuleWorker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorker = null;


        try {
            // InternalDeviceDefinition.g:708:47: (iv_ruleWorker= ruleWorker EOF )
            // InternalDeviceDefinition.g:709:2: iv_ruleWorker= ruleWorker EOF
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
    // InternalDeviceDefinition.g:715:1: ruleWorker returns [EObject current=null] : (otherlv_0= 'Worker' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'mac' ( (lv_mac_4_0= RULE_MAC ) ) ) (otherlv_5= 'sleep' otherlv_6= 'for' ( (lv_sleepTime_7_0= RULE_INT ) ) ( (lv_timeUnit_8_0= ruleTimeUnit ) ) )? ( (lv_devices_9_0= ruleDevice ) )* ) ;
    public final EObject ruleWorker() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_mac_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_sleepTime_7_0=null;
        EObject lv_timeUnit_8_0 = null;

        EObject lv_devices_9_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:721:2: ( (otherlv_0= 'Worker' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'mac' ( (lv_mac_4_0= RULE_MAC ) ) ) (otherlv_5= 'sleep' otherlv_6= 'for' ( (lv_sleepTime_7_0= RULE_INT ) ) ( (lv_timeUnit_8_0= ruleTimeUnit ) ) )? ( (lv_devices_9_0= ruleDevice ) )* ) )
            // InternalDeviceDefinition.g:722:2: (otherlv_0= 'Worker' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'mac' ( (lv_mac_4_0= RULE_MAC ) ) ) (otherlv_5= 'sleep' otherlv_6= 'for' ( (lv_sleepTime_7_0= RULE_INT ) ) ( (lv_timeUnit_8_0= ruleTimeUnit ) ) )? ( (lv_devices_9_0= ruleDevice ) )* )
            {
            // InternalDeviceDefinition.g:722:2: (otherlv_0= 'Worker' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'mac' ( (lv_mac_4_0= RULE_MAC ) ) ) (otherlv_5= 'sleep' otherlv_6= 'for' ( (lv_sleepTime_7_0= RULE_INT ) ) ( (lv_timeUnit_8_0= ruleTimeUnit ) ) )? ( (lv_devices_9_0= ruleDevice ) )* )
            // InternalDeviceDefinition.g:723:3: otherlv_0= 'Worker' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'mac' ( (lv_mac_4_0= RULE_MAC ) ) ) (otherlv_5= 'sleep' otherlv_6= 'for' ( (lv_sleepTime_7_0= RULE_INT ) ) ( (lv_timeUnit_8_0= ruleTimeUnit ) ) )? ( (lv_devices_9_0= ruleDevice ) )*
            {
            otherlv_0=(Token)match(input,36,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkerAccess().getWorkerKeyword_0());
            		
            // InternalDeviceDefinition.g:727:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDeviceDefinition.g:728:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:728:4: (lv_name_1_0= RULE_ID )
            // InternalDeviceDefinition.g:729:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkerAccess().getColonKeyword_2());
            		
            // InternalDeviceDefinition.g:749:3: (otherlv_3= 'mac' ( (lv_mac_4_0= RULE_MAC ) ) )
            // InternalDeviceDefinition.g:750:4: otherlv_3= 'mac' ( (lv_mac_4_0= RULE_MAC ) )
            {
            otherlv_3=(Token)match(input,35,FOLLOW_28); 

            				newLeafNode(otherlv_3, grammarAccess.getWorkerAccess().getMacKeyword_3_0());
            			
            // InternalDeviceDefinition.g:754:4: ( (lv_mac_4_0= RULE_MAC ) )
            // InternalDeviceDefinition.g:755:5: (lv_mac_4_0= RULE_MAC )
            {
            // InternalDeviceDefinition.g:755:5: (lv_mac_4_0= RULE_MAC )
            // InternalDeviceDefinition.g:756:6: lv_mac_4_0= RULE_MAC
            {
            lv_mac_4_0=(Token)match(input,RULE_MAC,FOLLOW_31); 

            						newLeafNode(lv_mac_4_0, grammarAccess.getWorkerAccess().getMacMACTerminalRuleCall_3_1_0());
            					

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


            }

            // InternalDeviceDefinition.g:773:3: (otherlv_5= 'sleep' otherlv_6= 'for' ( (lv_sleepTime_7_0= RULE_INT ) ) ( (lv_timeUnit_8_0= ruleTimeUnit ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==37) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDeviceDefinition.g:774:4: otherlv_5= 'sleep' otherlv_6= 'for' ( (lv_sleepTime_7_0= RULE_INT ) ) ( (lv_timeUnit_8_0= ruleTimeUnit ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_32); 

                    				newLeafNode(otherlv_5, grammarAccess.getWorkerAccess().getSleepKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,38,FOLLOW_33); 

                    				newLeafNode(otherlv_6, grammarAccess.getWorkerAccess().getForKeyword_4_1());
                    			
                    // InternalDeviceDefinition.g:782:4: ( (lv_sleepTime_7_0= RULE_INT ) )
                    // InternalDeviceDefinition.g:783:5: (lv_sleepTime_7_0= RULE_INT )
                    {
                    // InternalDeviceDefinition.g:783:5: (lv_sleepTime_7_0= RULE_INT )
                    // InternalDeviceDefinition.g:784:6: lv_sleepTime_7_0= RULE_INT
                    {
                    lv_sleepTime_7_0=(Token)match(input,RULE_INT,FOLLOW_34); 

                    						newLeafNode(lv_sleepTime_7_0, grammarAccess.getWorkerAccess().getSleepTimeINTTerminalRuleCall_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWorkerRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"sleepTime",
                    							lv_sleepTime_7_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalDeviceDefinition.g:800:4: ( (lv_timeUnit_8_0= ruleTimeUnit ) )
                    // InternalDeviceDefinition.g:801:5: (lv_timeUnit_8_0= ruleTimeUnit )
                    {
                    // InternalDeviceDefinition.g:801:5: (lv_timeUnit_8_0= ruleTimeUnit )
                    // InternalDeviceDefinition.g:802:6: lv_timeUnit_8_0= ruleTimeUnit
                    {

                    						newCompositeNode(grammarAccess.getWorkerAccess().getTimeUnitTimeUnitParserRuleCall_4_3_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_timeUnit_8_0=ruleTimeUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWorkerRule());
                    						}
                    						set(
                    							current,
                    							"timeUnit",
                    							lv_timeUnit_8_0,
                    							"dk.sdu.gms.dds.DeviceDefinition.TimeUnit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDeviceDefinition.g:820:3: ( (lv_devices_9_0= ruleDevice ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==39||LA10_0==55) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDeviceDefinition.g:821:4: (lv_devices_9_0= ruleDevice )
            	    {
            	    // InternalDeviceDefinition.g:821:4: (lv_devices_9_0= ruleDevice )
            	    // InternalDeviceDefinition.g:822:5: lv_devices_9_0= ruleDevice
            	    {

            	    					newCompositeNode(grammarAccess.getWorkerAccess().getDevicesDeviceParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_35);
            	    lv_devices_9_0=ruleDevice();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWorkerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"devices",
            	    						lv_devices_9_0,
            	    						"dk.sdu.gms.dds.DeviceDefinition.Device");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalDeviceDefinition.g:843:1: entryRuleDevice returns [EObject current=null] : iv_ruleDevice= ruleDevice EOF ;
    public final EObject entryRuleDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevice = null;


        try {
            // InternalDeviceDefinition.g:843:47: (iv_ruleDevice= ruleDevice EOF )
            // InternalDeviceDefinition.g:844:2: iv_ruleDevice= ruleDevice EOF
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
    // InternalDeviceDefinition.g:850:1: ruleDevice returns [EObject current=null] : (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) ;
    public final EObject ruleDevice() throws RecognitionException {
        EObject current = null;

        EObject this_Sensor_0 = null;

        EObject this_Actuator_1 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:856:2: ( (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) )
            // InternalDeviceDefinition.g:857:2: (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator )
            {
            // InternalDeviceDefinition.g:857:2: (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==39) ) {
                alt11=1;
            }
            else if ( (LA11_0==55) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalDeviceDefinition.g:858:3: this_Sensor_0= ruleSensor
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
                    // InternalDeviceDefinition.g:867:3: this_Actuator_1= ruleActuator
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
    // InternalDeviceDefinition.g:879:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalDeviceDefinition.g:879:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalDeviceDefinition.g:880:2: iv_ruleSensor= ruleSensor EOF
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
    // InternalDeviceDefinition.g:886:1: ruleSensor returns [EObject current=null] : (otherlv_0= 'Sensor' ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= 'pins' ( (lv_pins_5_0= rulePin ) )* (otherlv_6= ',' ( (lv_pins_7_0= rulePin ) ) )* )? ( (lv_outputs_8_0= ruleSensorOutput ) )* ( (lv_settings_9_0= ruleSetting ) )* (otherlv_10= 'sample' otherlv_11= 'if' ( (lv_predicate_12_0= ruleExp ) ) )? ) ;
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
            // InternalDeviceDefinition.g:892:2: ( (otherlv_0= 'Sensor' ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= 'pins' ( (lv_pins_5_0= rulePin ) )* (otherlv_6= ',' ( (lv_pins_7_0= rulePin ) ) )* )? ( (lv_outputs_8_0= ruleSensorOutput ) )* ( (lv_settings_9_0= ruleSetting ) )* (otherlv_10= 'sample' otherlv_11= 'if' ( (lv_predicate_12_0= ruleExp ) ) )? ) )
            // InternalDeviceDefinition.g:893:2: (otherlv_0= 'Sensor' ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= 'pins' ( (lv_pins_5_0= rulePin ) )* (otherlv_6= ',' ( (lv_pins_7_0= rulePin ) ) )* )? ( (lv_outputs_8_0= ruleSensorOutput ) )* ( (lv_settings_9_0= ruleSetting ) )* (otherlv_10= 'sample' otherlv_11= 'if' ( (lv_predicate_12_0= ruleExp ) ) )? )
            {
            // InternalDeviceDefinition.g:893:2: (otherlv_0= 'Sensor' ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= 'pins' ( (lv_pins_5_0= rulePin ) )* (otherlv_6= ',' ( (lv_pins_7_0= rulePin ) ) )* )? ( (lv_outputs_8_0= ruleSensorOutput ) )* ( (lv_settings_9_0= ruleSetting ) )* (otherlv_10= 'sample' otherlv_11= 'if' ( (lv_predicate_12_0= ruleExp ) ) )? )
            // InternalDeviceDefinition.g:894:3: otherlv_0= 'Sensor' ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= 'pins' ( (lv_pins_5_0= rulePin ) )* (otherlv_6= ',' ( (lv_pins_7_0= rulePin ) ) )* )? ( (lv_outputs_8_0= ruleSensorOutput ) )* ( (lv_settings_9_0= ruleSetting ) )* (otherlv_10= 'sample' otherlv_11= 'if' ( (lv_predicate_12_0= ruleExp ) ) )?
            {
            otherlv_0=(Token)match(input,39,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorAccess().getSensorKeyword_0());
            		
            // InternalDeviceDefinition.g:898:3: ( (lv_type_1_0= RULE_ID ) )
            // InternalDeviceDefinition.g:899:4: (lv_type_1_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:899:4: (lv_type_1_0= RULE_ID )
            // InternalDeviceDefinition.g:900:5: lv_type_1_0= RULE_ID
            {
            lv_type_1_0=(Token)match(input,RULE_ID,FOLLOW_26); 

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

            // InternalDeviceDefinition.g:916:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDeviceDefinition.g:917:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:917:4: (lv_name_2_0= RULE_ID )
            // InternalDeviceDefinition.g:918:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_3); 

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

            otherlv_3=(Token)match(input,15,FOLLOW_36); 

            			newLeafNode(otherlv_3, grammarAccess.getSensorAccess().getColonKeyword_3());
            		
            // InternalDeviceDefinition.g:938:3: (otherlv_4= 'pins' ( (lv_pins_5_0= rulePin ) )* (otherlv_6= ',' ( (lv_pins_7_0= rulePin ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==40) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDeviceDefinition.g:939:4: otherlv_4= 'pins' ( (lv_pins_5_0= rulePin ) )* (otherlv_6= ',' ( (lv_pins_7_0= rulePin ) ) )*
                    {
                    otherlv_4=(Token)match(input,40,FOLLOW_37); 

                    				newLeafNode(otherlv_4, grammarAccess.getSensorAccess().getPinsKeyword_4_0());
                    			
                    // InternalDeviceDefinition.g:943:4: ( (lv_pins_5_0= rulePin ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==46) ) {
                            int LA12_2 = input.LA(2);

                            if ( (LA12_2==RULE_INT) ) {
                                alt12=1;
                            }


                        }
                        else if ( ((LA12_0>=43 && LA12_0<=45)) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalDeviceDefinition.g:944:5: (lv_pins_5_0= rulePin )
                    	    {
                    	    // InternalDeviceDefinition.g:944:5: (lv_pins_5_0= rulePin )
                    	    // InternalDeviceDefinition.g:945:6: lv_pins_5_0= rulePin
                    	    {

                    	    						newCompositeNode(grammarAccess.getSensorAccess().getPinsPinParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_37);
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
                    	    break loop12;
                        }
                    } while (true);

                    // InternalDeviceDefinition.g:962:4: (otherlv_6= ',' ( (lv_pins_7_0= rulePin ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==31) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalDeviceDefinition.g:963:5: otherlv_6= ',' ( (lv_pins_7_0= rulePin ) )
                    	    {
                    	    otherlv_6=(Token)match(input,31,FOLLOW_38); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getSensorAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalDeviceDefinition.g:967:5: ( (lv_pins_7_0= rulePin ) )
                    	    // InternalDeviceDefinition.g:968:6: (lv_pins_7_0= rulePin )
                    	    {
                    	    // InternalDeviceDefinition.g:968:6: (lv_pins_7_0= rulePin )
                    	    // InternalDeviceDefinition.g:969:7: lv_pins_7_0= rulePin
                    	    {

                    	    							newCompositeNode(grammarAccess.getSensorAccess().getPinsPinParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_39);
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
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalDeviceDefinition.g:988:3: ( (lv_outputs_8_0= ruleSensorOutput ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==46) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDeviceDefinition.g:989:4: (lv_outputs_8_0= ruleSensorOutput )
            	    {
            	    // InternalDeviceDefinition.g:989:4: (lv_outputs_8_0= ruleSensorOutput )
            	    // InternalDeviceDefinition.g:990:5: lv_outputs_8_0= ruleSensorOutput
            	    {

            	    					newCompositeNode(grammarAccess.getSensorAccess().getOutputsSensorOutputParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_40);
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
            	    break loop15;
                }
            } while (true);

            // InternalDeviceDefinition.g:1007:3: ( (lv_settings_9_0= ruleSetting ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==60) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDeviceDefinition.g:1008:4: (lv_settings_9_0= ruleSetting )
            	    {
            	    // InternalDeviceDefinition.g:1008:4: (lv_settings_9_0= ruleSetting )
            	    // InternalDeviceDefinition.g:1009:5: lv_settings_9_0= ruleSetting
            	    {

            	    					newCompositeNode(grammarAccess.getSensorAccess().getSettingsSettingParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_41);
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
            	    break loop16;
                }
            } while (true);

            // InternalDeviceDefinition.g:1026:3: (otherlv_10= 'sample' otherlv_11= 'if' ( (lv_predicate_12_0= ruleExp ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==41) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDeviceDefinition.g:1027:4: otherlv_10= 'sample' otherlv_11= 'if' ( (lv_predicate_12_0= ruleExp ) )
                    {
                    otherlv_10=(Token)match(input,41,FOLLOW_42); 

                    				newLeafNode(otherlv_10, grammarAccess.getSensorAccess().getSampleKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,42,FOLLOW_19); 

                    				newLeafNode(otherlv_11, grammarAccess.getSensorAccess().getIfKeyword_7_1());
                    			
                    // InternalDeviceDefinition.g:1035:4: ( (lv_predicate_12_0= ruleExp ) )
                    // InternalDeviceDefinition.g:1036:5: (lv_predicate_12_0= ruleExp )
                    {
                    // InternalDeviceDefinition.g:1036:5: (lv_predicate_12_0= ruleExp )
                    // InternalDeviceDefinition.g:1037:6: lv_predicate_12_0= ruleExp
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
    // InternalDeviceDefinition.g:1059:1: entryRulePin returns [EObject current=null] : iv_rulePin= rulePin EOF ;
    public final EObject entryRulePin() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePin = null;


        try {
            // InternalDeviceDefinition.g:1059:44: (iv_rulePin= rulePin EOF )
            // InternalDeviceDefinition.g:1060:2: iv_rulePin= rulePin EOF
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
    // InternalDeviceDefinition.g:1066:1: rulePin returns [EObject current=null] : ( ( (lv_type_0_0= rulePinType ) ) ( (lv_number_1_0= RULE_INT ) ) ) ;
    public final EObject rulePin() throws RecognitionException {
        EObject current = null;

        Token lv_number_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:1072:2: ( ( ( (lv_type_0_0= rulePinType ) ) ( (lv_number_1_0= RULE_INT ) ) ) )
            // InternalDeviceDefinition.g:1073:2: ( ( (lv_type_0_0= rulePinType ) ) ( (lv_number_1_0= RULE_INT ) ) )
            {
            // InternalDeviceDefinition.g:1073:2: ( ( (lv_type_0_0= rulePinType ) ) ( (lv_number_1_0= RULE_INT ) ) )
            // InternalDeviceDefinition.g:1074:3: ( (lv_type_0_0= rulePinType ) ) ( (lv_number_1_0= RULE_INT ) )
            {
            // InternalDeviceDefinition.g:1074:3: ( (lv_type_0_0= rulePinType ) )
            // InternalDeviceDefinition.g:1075:4: (lv_type_0_0= rulePinType )
            {
            // InternalDeviceDefinition.g:1075:4: (lv_type_0_0= rulePinType )
            // InternalDeviceDefinition.g:1076:5: lv_type_0_0= rulePinType
            {

            					newCompositeNode(grammarAccess.getPinAccess().getTypePinTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_33);
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

            // InternalDeviceDefinition.g:1093:3: ( (lv_number_1_0= RULE_INT ) )
            // InternalDeviceDefinition.g:1094:4: (lv_number_1_0= RULE_INT )
            {
            // InternalDeviceDefinition.g:1094:4: (lv_number_1_0= RULE_INT )
            // InternalDeviceDefinition.g:1095:5: lv_number_1_0= RULE_INT
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
    // InternalDeviceDefinition.g:1115:1: entryRulePinType returns [EObject current=null] : iv_rulePinType= rulePinType EOF ;
    public final EObject entryRulePinType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePinType = null;


        try {
            // InternalDeviceDefinition.g:1115:48: (iv_rulePinType= rulePinType EOF )
            // InternalDeviceDefinition.g:1116:2: iv_rulePinType= rulePinType EOF
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
    // InternalDeviceDefinition.g:1122:1: rulePinType returns [EObject current=null] : ( ( () otherlv_1= 'adc' ) | ( () otherlv_3= 'dac' ) | ( () otherlv_5= 'in' ) | ( () otherlv_7= 'out' ) ) ;
    public final EObject rulePinType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalDeviceDefinition.g:1128:2: ( ( ( () otherlv_1= 'adc' ) | ( () otherlv_3= 'dac' ) | ( () otherlv_5= 'in' ) | ( () otherlv_7= 'out' ) ) )
            // InternalDeviceDefinition.g:1129:2: ( ( () otherlv_1= 'adc' ) | ( () otherlv_3= 'dac' ) | ( () otherlv_5= 'in' ) | ( () otherlv_7= 'out' ) )
            {
            // InternalDeviceDefinition.g:1129:2: ( ( () otherlv_1= 'adc' ) | ( () otherlv_3= 'dac' ) | ( () otherlv_5= 'in' ) | ( () otherlv_7= 'out' ) )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt18=1;
                }
                break;
            case 44:
                {
                alt18=2;
                }
                break;
            case 45:
                {
                alt18=3;
                }
                break;
            case 46:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalDeviceDefinition.g:1130:3: ( () otherlv_1= 'adc' )
                    {
                    // InternalDeviceDefinition.g:1130:3: ( () otherlv_1= 'adc' )
                    // InternalDeviceDefinition.g:1131:4: () otherlv_1= 'adc'
                    {
                    // InternalDeviceDefinition.g:1131:4: ()
                    // InternalDeviceDefinition.g:1132:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPinTypeAccess().getADCAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,43,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getPinTypeAccess().getAdcKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDeviceDefinition.g:1144:3: ( () otherlv_3= 'dac' )
                    {
                    // InternalDeviceDefinition.g:1144:3: ( () otherlv_3= 'dac' )
                    // InternalDeviceDefinition.g:1145:4: () otherlv_3= 'dac'
                    {
                    // InternalDeviceDefinition.g:1145:4: ()
                    // InternalDeviceDefinition.g:1146:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPinTypeAccess().getDACAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,44,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getPinTypeAccess().getDacKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDeviceDefinition.g:1158:3: ( () otherlv_5= 'in' )
                    {
                    // InternalDeviceDefinition.g:1158:3: ( () otherlv_5= 'in' )
                    // InternalDeviceDefinition.g:1159:4: () otherlv_5= 'in'
                    {
                    // InternalDeviceDefinition.g:1159:4: ()
                    // InternalDeviceDefinition.g:1160:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPinTypeAccess().getGenericInAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,45,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getPinTypeAccess().getInKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDeviceDefinition.g:1172:3: ( () otherlv_7= 'out' )
                    {
                    // InternalDeviceDefinition.g:1172:3: ( () otherlv_7= 'out' )
                    // InternalDeviceDefinition.g:1173:4: () otherlv_7= 'out'
                    {
                    // InternalDeviceDefinition.g:1173:4: ()
                    // InternalDeviceDefinition.g:1174:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPinTypeAccess().getGenericOutAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,46,FOLLOW_2); 

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
    // InternalDeviceDefinition.g:1189:1: entryRuleTimeUnit returns [EObject current=null] : iv_ruleTimeUnit= ruleTimeUnit EOF ;
    public final EObject entryRuleTimeUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeUnit = null;


        try {
            // InternalDeviceDefinition.g:1189:49: (iv_ruleTimeUnit= ruleTimeUnit EOF )
            // InternalDeviceDefinition.g:1190:2: iv_ruleTimeUnit= ruleTimeUnit EOF
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
    // InternalDeviceDefinition.g:1196:1: ruleTimeUnit returns [EObject current=null] : ( ( () (otherlv_1= 'second' | otherlv_2= 'seconds' ) ) | ( () (otherlv_4= 'minute' | otherlv_5= 'minutes' ) ) | ( () (otherlv_7= 'hour' | otherlv_8= 'hours' ) ) ) ;
    public final EObject ruleTimeUnit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalDeviceDefinition.g:1202:2: ( ( ( () (otherlv_1= 'second' | otherlv_2= 'seconds' ) ) | ( () (otherlv_4= 'minute' | otherlv_5= 'minutes' ) ) | ( () (otherlv_7= 'hour' | otherlv_8= 'hours' ) ) ) )
            // InternalDeviceDefinition.g:1203:2: ( ( () (otherlv_1= 'second' | otherlv_2= 'seconds' ) ) | ( () (otherlv_4= 'minute' | otherlv_5= 'minutes' ) ) | ( () (otherlv_7= 'hour' | otherlv_8= 'hours' ) ) )
            {
            // InternalDeviceDefinition.g:1203:2: ( ( () (otherlv_1= 'second' | otherlv_2= 'seconds' ) ) | ( () (otherlv_4= 'minute' | otherlv_5= 'minutes' ) ) | ( () (otherlv_7= 'hour' | otherlv_8= 'hours' ) ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 47:
            case 48:
                {
                alt22=1;
                }
                break;
            case 49:
            case 50:
                {
                alt22=2;
                }
                break;
            case 51:
            case 52:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalDeviceDefinition.g:1204:3: ( () (otherlv_1= 'second' | otherlv_2= 'seconds' ) )
                    {
                    // InternalDeviceDefinition.g:1204:3: ( () (otherlv_1= 'second' | otherlv_2= 'seconds' ) )
                    // InternalDeviceDefinition.g:1205:4: () (otherlv_1= 'second' | otherlv_2= 'seconds' )
                    {
                    // InternalDeviceDefinition.g:1205:4: ()
                    // InternalDeviceDefinition.g:1206:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTimeUnitAccess().getSecondAction_0_0(),
                    						current);
                    				

                    }

                    // InternalDeviceDefinition.g:1212:4: (otherlv_1= 'second' | otherlv_2= 'seconds' )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==47) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==48) ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalDeviceDefinition.g:1213:5: otherlv_1= 'second'
                            {
                            otherlv_1=(Token)match(input,47,FOLLOW_2); 

                            					newLeafNode(otherlv_1, grammarAccess.getTimeUnitAccess().getSecondKeyword_0_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDeviceDefinition.g:1218:5: otherlv_2= 'seconds'
                            {
                            otherlv_2=(Token)match(input,48,FOLLOW_2); 

                            					newLeafNode(otherlv_2, grammarAccess.getTimeUnitAccess().getSecondsKeyword_0_1_1());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDeviceDefinition.g:1225:3: ( () (otherlv_4= 'minute' | otherlv_5= 'minutes' ) )
                    {
                    // InternalDeviceDefinition.g:1225:3: ( () (otherlv_4= 'minute' | otherlv_5= 'minutes' ) )
                    // InternalDeviceDefinition.g:1226:4: () (otherlv_4= 'minute' | otherlv_5= 'minutes' )
                    {
                    // InternalDeviceDefinition.g:1226:4: ()
                    // InternalDeviceDefinition.g:1227:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTimeUnitAccess().getMinuteAction_1_0(),
                    						current);
                    				

                    }

                    // InternalDeviceDefinition.g:1233:4: (otherlv_4= 'minute' | otherlv_5= 'minutes' )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==49) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==50) ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalDeviceDefinition.g:1234:5: otherlv_4= 'minute'
                            {
                            otherlv_4=(Token)match(input,49,FOLLOW_2); 

                            					newLeafNode(otherlv_4, grammarAccess.getTimeUnitAccess().getMinuteKeyword_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDeviceDefinition.g:1239:5: otherlv_5= 'minutes'
                            {
                            otherlv_5=(Token)match(input,50,FOLLOW_2); 

                            					newLeafNode(otherlv_5, grammarAccess.getTimeUnitAccess().getMinutesKeyword_1_1_1());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDeviceDefinition.g:1246:3: ( () (otherlv_7= 'hour' | otherlv_8= 'hours' ) )
                    {
                    // InternalDeviceDefinition.g:1246:3: ( () (otherlv_7= 'hour' | otherlv_8= 'hours' ) )
                    // InternalDeviceDefinition.g:1247:4: () (otherlv_7= 'hour' | otherlv_8= 'hours' )
                    {
                    // InternalDeviceDefinition.g:1247:4: ()
                    // InternalDeviceDefinition.g:1248:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTimeUnitAccess().getHourAction_2_0(),
                    						current);
                    				

                    }

                    // InternalDeviceDefinition.g:1254:4: (otherlv_7= 'hour' | otherlv_8= 'hours' )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==51) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==52) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalDeviceDefinition.g:1255:5: otherlv_7= 'hour'
                            {
                            otherlv_7=(Token)match(input,51,FOLLOW_2); 

                            					newLeafNode(otherlv_7, grammarAccess.getTimeUnitAccess().getHourKeyword_2_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDeviceDefinition.g:1260:5: otherlv_8= 'hours'
                            {
                            otherlv_8=(Token)match(input,52,FOLLOW_2); 

                            					newLeafNode(otherlv_8, grammarAccess.getTimeUnitAccess().getHoursKeyword_2_1_1());
                            				

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
    // InternalDeviceDefinition.g:1270:1: entryRuleSensorOutput returns [EObject current=null] : iv_ruleSensorOutput= ruleSensorOutput EOF ;
    public final EObject entryRuleSensorOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorOutput = null;


        try {
            // InternalDeviceDefinition.g:1270:53: (iv_ruleSensorOutput= ruleSensorOutput EOF )
            // InternalDeviceDefinition.g:1271:2: iv_ruleSensorOutput= ruleSensorOutput EOF
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
    // InternalDeviceDefinition.g:1277:1: ruleSensorOutput returns [EObject current=null] : (otherlv_0= 'out' ( (lv_output_1_0= RULE_STRING ) )? otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'with' otherlv_5= 'mapping' ( (lv_mapping_6_0= ruleExp ) ) )? ) ;
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
            // InternalDeviceDefinition.g:1283:2: ( (otherlv_0= 'out' ( (lv_output_1_0= RULE_STRING ) )? otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'with' otherlv_5= 'mapping' ( (lv_mapping_6_0= ruleExp ) ) )? ) )
            // InternalDeviceDefinition.g:1284:2: (otherlv_0= 'out' ( (lv_output_1_0= RULE_STRING ) )? otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'with' otherlv_5= 'mapping' ( (lv_mapping_6_0= ruleExp ) ) )? )
            {
            // InternalDeviceDefinition.g:1284:2: (otherlv_0= 'out' ( (lv_output_1_0= RULE_STRING ) )? otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'with' otherlv_5= 'mapping' ( (lv_mapping_6_0= ruleExp ) ) )? )
            // InternalDeviceDefinition.g:1285:3: otherlv_0= 'out' ( (lv_output_1_0= RULE_STRING ) )? otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'with' otherlv_5= 'mapping' ( (lv_mapping_6_0= ruleExp ) ) )?
            {
            otherlv_0=(Token)match(input,46,FOLLOW_43); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorOutputAccess().getOutKeyword_0());
            		
            // InternalDeviceDefinition.g:1289:3: ( (lv_output_1_0= RULE_STRING ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDeviceDefinition.g:1290:4: (lv_output_1_0= RULE_STRING )
                    {
                    // InternalDeviceDefinition.g:1290:4: (lv_output_1_0= RULE_STRING )
                    // InternalDeviceDefinition.g:1291:5: lv_output_1_0= RULE_STRING
                    {
                    lv_output_1_0=(Token)match(input,RULE_STRING,FOLLOW_44); 

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

            otherlv_2=(Token)match(input,53,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getSensorOutputAccess().getAsKeyword_2());
            		
            // InternalDeviceDefinition.g:1311:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalDeviceDefinition.g:1312:4: (lv_name_3_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:1312:4: (lv_name_3_0= RULE_ID )
            // InternalDeviceDefinition.g:1313:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_45); 

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

            // InternalDeviceDefinition.g:1329:3: (otherlv_4= 'with' otherlv_5= 'mapping' ( (lv_mapping_6_0= ruleExp ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==17) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDeviceDefinition.g:1330:4: otherlv_4= 'with' otherlv_5= 'mapping' ( (lv_mapping_6_0= ruleExp ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_46); 

                    				newLeafNode(otherlv_4, grammarAccess.getSensorOutputAccess().getWithKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,54,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getSensorOutputAccess().getMappingKeyword_4_1());
                    			
                    // InternalDeviceDefinition.g:1338:4: ( (lv_mapping_6_0= ruleExp ) )
                    // InternalDeviceDefinition.g:1339:5: (lv_mapping_6_0= ruleExp )
                    {
                    // InternalDeviceDefinition.g:1339:5: (lv_mapping_6_0= ruleExp )
                    // InternalDeviceDefinition.g:1340:6: lv_mapping_6_0= ruleExp
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
    // InternalDeviceDefinition.g:1362:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // InternalDeviceDefinition.g:1362:49: (iv_ruleActuator= ruleActuator EOF )
            // InternalDeviceDefinition.g:1363:2: iv_ruleActuator= ruleActuator EOF
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
    // InternalDeviceDefinition.g:1369:1: ruleActuator returns [EObject current=null] : (otherlv_0= 'Actuator' ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'pins' ( (lv_pins_5_0= rulePin ) )* (otherlv_6= ',' ( (lv_pins_7_0= rulePin ) ) )* ( (lv_settings_8_0= ruleSetting ) )* ( (lv_trigger_9_0= ruleTrigger ) ) ) ;
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
            // InternalDeviceDefinition.g:1375:2: ( (otherlv_0= 'Actuator' ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'pins' ( (lv_pins_5_0= rulePin ) )* (otherlv_6= ',' ( (lv_pins_7_0= rulePin ) ) )* ( (lv_settings_8_0= ruleSetting ) )* ( (lv_trigger_9_0= ruleTrigger ) ) ) )
            // InternalDeviceDefinition.g:1376:2: (otherlv_0= 'Actuator' ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'pins' ( (lv_pins_5_0= rulePin ) )* (otherlv_6= ',' ( (lv_pins_7_0= rulePin ) ) )* ( (lv_settings_8_0= ruleSetting ) )* ( (lv_trigger_9_0= ruleTrigger ) ) )
            {
            // InternalDeviceDefinition.g:1376:2: (otherlv_0= 'Actuator' ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'pins' ( (lv_pins_5_0= rulePin ) )* (otherlv_6= ',' ( (lv_pins_7_0= rulePin ) ) )* ( (lv_settings_8_0= ruleSetting ) )* ( (lv_trigger_9_0= ruleTrigger ) ) )
            // InternalDeviceDefinition.g:1377:3: otherlv_0= 'Actuator' ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'pins' ( (lv_pins_5_0= rulePin ) )* (otherlv_6= ',' ( (lv_pins_7_0= rulePin ) ) )* ( (lv_settings_8_0= ruleSetting ) )* ( (lv_trigger_9_0= ruleTrigger ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getActuatorAccess().getActuatorKeyword_0());
            		
            // InternalDeviceDefinition.g:1381:3: ( (lv_type_1_0= RULE_ID ) )
            // InternalDeviceDefinition.g:1382:4: (lv_type_1_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:1382:4: (lv_type_1_0= RULE_ID )
            // InternalDeviceDefinition.g:1383:5: lv_type_1_0= RULE_ID
            {
            lv_type_1_0=(Token)match(input,RULE_ID,FOLLOW_26); 

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

            // InternalDeviceDefinition.g:1399:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDeviceDefinition.g:1400:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:1400:4: (lv_name_2_0= RULE_ID )
            // InternalDeviceDefinition.g:1401:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_3); 

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

            otherlv_3=(Token)match(input,15,FOLLOW_47); 

            			newLeafNode(otherlv_3, grammarAccess.getActuatorAccess().getColonKeyword_3());
            		
            otherlv_4=(Token)match(input,40,FOLLOW_48); 

            			newLeafNode(otherlv_4, grammarAccess.getActuatorAccess().getPinsKeyword_4());
            		
            // InternalDeviceDefinition.g:1425:3: ( (lv_pins_5_0= rulePin ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=43 && LA25_0<=46)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalDeviceDefinition.g:1426:4: (lv_pins_5_0= rulePin )
            	    {
            	    // InternalDeviceDefinition.g:1426:4: (lv_pins_5_0= rulePin )
            	    // InternalDeviceDefinition.g:1427:5: lv_pins_5_0= rulePin
            	    {

            	    					newCompositeNode(grammarAccess.getActuatorAccess().getPinsPinParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_48);
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
            	    break loop25;
                }
            } while (true);

            // InternalDeviceDefinition.g:1444:3: (otherlv_6= ',' ( (lv_pins_7_0= rulePin ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==31) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalDeviceDefinition.g:1445:4: otherlv_6= ',' ( (lv_pins_7_0= rulePin ) )
            	    {
            	    otherlv_6=(Token)match(input,31,FOLLOW_38); 

            	    				newLeafNode(otherlv_6, grammarAccess.getActuatorAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalDeviceDefinition.g:1449:4: ( (lv_pins_7_0= rulePin ) )
            	    // InternalDeviceDefinition.g:1450:5: (lv_pins_7_0= rulePin )
            	    {
            	    // InternalDeviceDefinition.g:1450:5: (lv_pins_7_0= rulePin )
            	    // InternalDeviceDefinition.g:1451:6: lv_pins_7_0= rulePin
            	    {

            	    						newCompositeNode(grammarAccess.getActuatorAccess().getPinsPinParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_48);
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
            	    break loop26;
                }
            } while (true);

            // InternalDeviceDefinition.g:1469:3: ( (lv_settings_8_0= ruleSetting ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==60) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalDeviceDefinition.g:1470:4: (lv_settings_8_0= ruleSetting )
            	    {
            	    // InternalDeviceDefinition.g:1470:4: (lv_settings_8_0= ruleSetting )
            	    // InternalDeviceDefinition.g:1471:5: lv_settings_8_0= ruleSetting
            	    {

            	    					newCompositeNode(grammarAccess.getActuatorAccess().getSettingsSettingParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_48);
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
            	    break loop27;
                }
            } while (true);

            // InternalDeviceDefinition.g:1488:3: ( (lv_trigger_9_0= ruleTrigger ) )
            // InternalDeviceDefinition.g:1489:4: (lv_trigger_9_0= ruleTrigger )
            {
            // InternalDeviceDefinition.g:1489:4: (lv_trigger_9_0= ruleTrigger )
            // InternalDeviceDefinition.g:1490:5: lv_trigger_9_0= ruleTrigger
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
    // InternalDeviceDefinition.g:1511:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
    public final EObject entryRuleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigger = null;


        try {
            // InternalDeviceDefinition.g:1511:48: (iv_ruleTrigger= ruleTrigger EOF )
            // InternalDeviceDefinition.g:1512:2: iv_ruleTrigger= ruleTrigger EOF
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
    // InternalDeviceDefinition.g:1518:1: ruleTrigger returns [EObject current=null] : ( ( () otherlv_1= 'when' ( (lv_exp_2_0= ruleExp ) ) ) | ( () otherlv_4= 'on' ( (lv_onExp_5_0= ruleExp ) ) ( (otherlv_6= 'off' ( (lv_offExp_7_0= ruleExp ) ) ) | (otherlv_8= 'run' otherlv_9= 'for' ( (lv_time_10_0= RULE_INT ) ) ( (lv_unit_11_0= ruleTimeUnit ) ) ) ) ) ) ;
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
            // InternalDeviceDefinition.g:1524:2: ( ( ( () otherlv_1= 'when' ( (lv_exp_2_0= ruleExp ) ) ) | ( () otherlv_4= 'on' ( (lv_onExp_5_0= ruleExp ) ) ( (otherlv_6= 'off' ( (lv_offExp_7_0= ruleExp ) ) ) | (otherlv_8= 'run' otherlv_9= 'for' ( (lv_time_10_0= RULE_INT ) ) ( (lv_unit_11_0= ruleTimeUnit ) ) ) ) ) ) )
            // InternalDeviceDefinition.g:1525:2: ( ( () otherlv_1= 'when' ( (lv_exp_2_0= ruleExp ) ) ) | ( () otherlv_4= 'on' ( (lv_onExp_5_0= ruleExp ) ) ( (otherlv_6= 'off' ( (lv_offExp_7_0= ruleExp ) ) ) | (otherlv_8= 'run' otherlv_9= 'for' ( (lv_time_10_0= RULE_INT ) ) ( (lv_unit_11_0= ruleTimeUnit ) ) ) ) ) )
            {
            // InternalDeviceDefinition.g:1525:2: ( ( () otherlv_1= 'when' ( (lv_exp_2_0= ruleExp ) ) ) | ( () otherlv_4= 'on' ( (lv_onExp_5_0= ruleExp ) ) ( (otherlv_6= 'off' ( (lv_offExp_7_0= ruleExp ) ) ) | (otherlv_8= 'run' otherlv_9= 'for' ( (lv_time_10_0= RULE_INT ) ) ( (lv_unit_11_0= ruleTimeUnit ) ) ) ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==56) ) {
                alt29=1;
            }
            else if ( (LA29_0==57) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalDeviceDefinition.g:1526:3: ( () otherlv_1= 'when' ( (lv_exp_2_0= ruleExp ) ) )
                    {
                    // InternalDeviceDefinition.g:1526:3: ( () otherlv_1= 'when' ( (lv_exp_2_0= ruleExp ) ) )
                    // InternalDeviceDefinition.g:1527:4: () otherlv_1= 'when' ( (lv_exp_2_0= ruleExp ) )
                    {
                    // InternalDeviceDefinition.g:1527:4: ()
                    // InternalDeviceDefinition.g:1528:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTriggerAccess().getWhenAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,56,FOLLOW_19); 

                    				newLeafNode(otherlv_1, grammarAccess.getTriggerAccess().getWhenKeyword_0_1());
                    			
                    // InternalDeviceDefinition.g:1538:4: ( (lv_exp_2_0= ruleExp ) )
                    // InternalDeviceDefinition.g:1539:5: (lv_exp_2_0= ruleExp )
                    {
                    // InternalDeviceDefinition.g:1539:5: (lv_exp_2_0= ruleExp )
                    // InternalDeviceDefinition.g:1540:6: lv_exp_2_0= ruleExp
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
                    // InternalDeviceDefinition.g:1559:3: ( () otherlv_4= 'on' ( (lv_onExp_5_0= ruleExp ) ) ( (otherlv_6= 'off' ( (lv_offExp_7_0= ruleExp ) ) ) | (otherlv_8= 'run' otherlv_9= 'for' ( (lv_time_10_0= RULE_INT ) ) ( (lv_unit_11_0= ruleTimeUnit ) ) ) ) )
                    {
                    // InternalDeviceDefinition.g:1559:3: ( () otherlv_4= 'on' ( (lv_onExp_5_0= ruleExp ) ) ( (otherlv_6= 'off' ( (lv_offExp_7_0= ruleExp ) ) ) | (otherlv_8= 'run' otherlv_9= 'for' ( (lv_time_10_0= RULE_INT ) ) ( (lv_unit_11_0= ruleTimeUnit ) ) ) ) )
                    // InternalDeviceDefinition.g:1560:4: () otherlv_4= 'on' ( (lv_onExp_5_0= ruleExp ) ) ( (otherlv_6= 'off' ( (lv_offExp_7_0= ruleExp ) ) ) | (otherlv_8= 'run' otherlv_9= 'for' ( (lv_time_10_0= RULE_INT ) ) ( (lv_unit_11_0= ruleTimeUnit ) ) ) )
                    {
                    // InternalDeviceDefinition.g:1560:4: ()
                    // InternalDeviceDefinition.g:1561:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTriggerAccess().getOnOffAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,57,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getTriggerAccess().getOnKeyword_1_1());
                    			
                    // InternalDeviceDefinition.g:1571:4: ( (lv_onExp_5_0= ruleExp ) )
                    // InternalDeviceDefinition.g:1572:5: (lv_onExp_5_0= ruleExp )
                    {
                    // InternalDeviceDefinition.g:1572:5: (lv_onExp_5_0= ruleExp )
                    // InternalDeviceDefinition.g:1573:6: lv_onExp_5_0= ruleExp
                    {

                    						newCompositeNode(grammarAccess.getTriggerAccess().getOnExpExpParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_49);
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

                    // InternalDeviceDefinition.g:1590:4: ( (otherlv_6= 'off' ( (lv_offExp_7_0= ruleExp ) ) ) | (otherlv_8= 'run' otherlv_9= 'for' ( (lv_time_10_0= RULE_INT ) ) ( (lv_unit_11_0= ruleTimeUnit ) ) ) )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==58) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==59) ) {
                        alt28=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalDeviceDefinition.g:1591:5: (otherlv_6= 'off' ( (lv_offExp_7_0= ruleExp ) ) )
                            {
                            // InternalDeviceDefinition.g:1591:5: (otherlv_6= 'off' ( (lv_offExp_7_0= ruleExp ) ) )
                            // InternalDeviceDefinition.g:1592:6: otherlv_6= 'off' ( (lv_offExp_7_0= ruleExp ) )
                            {
                            otherlv_6=(Token)match(input,58,FOLLOW_19); 

                            						newLeafNode(otherlv_6, grammarAccess.getTriggerAccess().getOffKeyword_1_3_0_0());
                            					
                            // InternalDeviceDefinition.g:1596:6: ( (lv_offExp_7_0= ruleExp ) )
                            // InternalDeviceDefinition.g:1597:7: (lv_offExp_7_0= ruleExp )
                            {
                            // InternalDeviceDefinition.g:1597:7: (lv_offExp_7_0= ruleExp )
                            // InternalDeviceDefinition.g:1598:8: lv_offExp_7_0= ruleExp
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
                            // InternalDeviceDefinition.g:1617:5: (otherlv_8= 'run' otherlv_9= 'for' ( (lv_time_10_0= RULE_INT ) ) ( (lv_unit_11_0= ruleTimeUnit ) ) )
                            {
                            // InternalDeviceDefinition.g:1617:5: (otherlv_8= 'run' otherlv_9= 'for' ( (lv_time_10_0= RULE_INT ) ) ( (lv_unit_11_0= ruleTimeUnit ) ) )
                            // InternalDeviceDefinition.g:1618:6: otherlv_8= 'run' otherlv_9= 'for' ( (lv_time_10_0= RULE_INT ) ) ( (lv_unit_11_0= ruleTimeUnit ) )
                            {
                            otherlv_8=(Token)match(input,59,FOLLOW_32); 

                            						newLeafNode(otherlv_8, grammarAccess.getTriggerAccess().getRunKeyword_1_3_1_0());
                            					
                            otherlv_9=(Token)match(input,38,FOLLOW_33); 

                            						newLeafNode(otherlv_9, grammarAccess.getTriggerAccess().getForKeyword_1_3_1_1());
                            					
                            // InternalDeviceDefinition.g:1626:6: ( (lv_time_10_0= RULE_INT ) )
                            // InternalDeviceDefinition.g:1627:7: (lv_time_10_0= RULE_INT )
                            {
                            // InternalDeviceDefinition.g:1627:7: (lv_time_10_0= RULE_INT )
                            // InternalDeviceDefinition.g:1628:8: lv_time_10_0= RULE_INT
                            {
                            lv_time_10_0=(Token)match(input,RULE_INT,FOLLOW_34); 

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

                            // InternalDeviceDefinition.g:1644:6: ( (lv_unit_11_0= ruleTimeUnit ) )
                            // InternalDeviceDefinition.g:1645:7: (lv_unit_11_0= ruleTimeUnit )
                            {
                            // InternalDeviceDefinition.g:1645:7: (lv_unit_11_0= ruleTimeUnit )
                            // InternalDeviceDefinition.g:1646:8: lv_unit_11_0= ruleTimeUnit
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
    // InternalDeviceDefinition.g:1670:1: entryRuleSetting returns [EObject current=null] : iv_ruleSetting= ruleSetting EOF ;
    public final EObject entryRuleSetting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetting = null;


        try {
            // InternalDeviceDefinition.g:1670:48: (iv_ruleSetting= ruleSetting EOF )
            // InternalDeviceDefinition.g:1671:2: iv_ruleSetting= ruleSetting EOF
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
    // InternalDeviceDefinition.g:1677:1: ruleSetting returns [EObject current=null] : (otherlv_0= 'setting' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= rulePrimitive ) ) ) ;
    public final EObject ruleSetting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:1683:2: ( (otherlv_0= 'setting' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= rulePrimitive ) ) ) )
            // InternalDeviceDefinition.g:1684:2: (otherlv_0= 'setting' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= rulePrimitive ) ) )
            {
            // InternalDeviceDefinition.g:1684:2: (otherlv_0= 'setting' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= rulePrimitive ) ) )
            // InternalDeviceDefinition.g:1685:3: otherlv_0= 'setting' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= rulePrimitive ) )
            {
            otherlv_0=(Token)match(input,60,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getSettingAccess().getSettingKeyword_0());
            		
            // InternalDeviceDefinition.g:1689:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDeviceDefinition.g:1690:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:1690:4: (lv_name_1_0= RULE_ID )
            // InternalDeviceDefinition.g:1691:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_50); 

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

            otherlv_2=(Token)match(input,61,FOLLOW_51); 

            			newLeafNode(otherlv_2, grammarAccess.getSettingAccess().getEqualsSignKeyword_2());
            		
            // InternalDeviceDefinition.g:1711:3: ( (lv_value_3_0= rulePrimitive ) )
            // InternalDeviceDefinition.g:1712:4: (lv_value_3_0= rulePrimitive )
            {
            // InternalDeviceDefinition.g:1712:4: (lv_value_3_0= rulePrimitive )
            // InternalDeviceDefinition.g:1713:5: lv_value_3_0= rulePrimitive
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
    // InternalDeviceDefinition.g:1734:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // InternalDeviceDefinition.g:1734:50: (iv_rulePrimitive= rulePrimitive EOF )
            // InternalDeviceDefinition.g:1735:2: iv_rulePrimitive= rulePrimitive EOF
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
    // InternalDeviceDefinition.g:1741:1: rulePrimitive returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_DECIMAL ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () otherlv_5= 'TRUE' ) | ( () otherlv_7= 'FALSE' ) ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalDeviceDefinition.g:1747:2: ( ( ( () ( (lv_value_1_0= RULE_DECIMAL ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () otherlv_5= 'TRUE' ) | ( () otherlv_7= 'FALSE' ) ) )
            // InternalDeviceDefinition.g:1748:2: ( ( () ( (lv_value_1_0= RULE_DECIMAL ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () otherlv_5= 'TRUE' ) | ( () otherlv_7= 'FALSE' ) )
            {
            // InternalDeviceDefinition.g:1748:2: ( ( () ( (lv_value_1_0= RULE_DECIMAL ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () otherlv_5= 'TRUE' ) | ( () otherlv_7= 'FALSE' ) )
            int alt30=4;
            switch ( input.LA(1) ) {
            case RULE_DECIMAL:
                {
                alt30=1;
                }
                break;
            case RULE_INT:
                {
                alt30=2;
                }
                break;
            case 62:
                {
                alt30=3;
                }
                break;
            case 63:
                {
                alt30=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalDeviceDefinition.g:1749:3: ( () ( (lv_value_1_0= RULE_DECIMAL ) ) )
                    {
                    // InternalDeviceDefinition.g:1749:3: ( () ( (lv_value_1_0= RULE_DECIMAL ) ) )
                    // InternalDeviceDefinition.g:1750:4: () ( (lv_value_1_0= RULE_DECIMAL ) )
                    {
                    // InternalDeviceDefinition.g:1750:4: ()
                    // InternalDeviceDefinition.g:1751:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimitiveAccess().getDecimalPrimitiveAction_0_0(),
                    						current);
                    				

                    }

                    // InternalDeviceDefinition.g:1757:4: ( (lv_value_1_0= RULE_DECIMAL ) )
                    // InternalDeviceDefinition.g:1758:5: (lv_value_1_0= RULE_DECIMAL )
                    {
                    // InternalDeviceDefinition.g:1758:5: (lv_value_1_0= RULE_DECIMAL )
                    // InternalDeviceDefinition.g:1759:6: lv_value_1_0= RULE_DECIMAL
                    {
                    lv_value_1_0=(Token)match(input,RULE_DECIMAL,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getPrimitiveAccess().getValueDECIMALTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimitiveRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"dk.sdu.gms.dds.DeviceDefinition.DECIMAL");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDeviceDefinition.g:1777:3: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    {
                    // InternalDeviceDefinition.g:1777:3: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    // InternalDeviceDefinition.g:1778:4: () ( (lv_value_3_0= RULE_INT ) )
                    {
                    // InternalDeviceDefinition.g:1778:4: ()
                    // InternalDeviceDefinition.g:1779:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimitiveAccess().getIntPrimitiveAction_1_0(),
                    						current);
                    				

                    }

                    // InternalDeviceDefinition.g:1785:4: ( (lv_value_3_0= RULE_INT ) )
                    // InternalDeviceDefinition.g:1786:5: (lv_value_3_0= RULE_INT )
                    {
                    // InternalDeviceDefinition.g:1786:5: (lv_value_3_0= RULE_INT )
                    // InternalDeviceDefinition.g:1787:6: lv_value_3_0= RULE_INT
                    {
                    lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getPrimitiveAccess().getValueINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimitiveRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDeviceDefinition.g:1805:3: ( () otherlv_5= 'TRUE' )
                    {
                    // InternalDeviceDefinition.g:1805:3: ( () otherlv_5= 'TRUE' )
                    // InternalDeviceDefinition.g:1806:4: () otherlv_5= 'TRUE'
                    {
                    // InternalDeviceDefinition.g:1806:4: ()
                    // InternalDeviceDefinition.g:1807:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimitiveAccess().getBooleanTrueAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,62,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrimitiveAccess().getTRUEKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDeviceDefinition.g:1819:3: ( () otherlv_7= 'FALSE' )
                    {
                    // InternalDeviceDefinition.g:1819:3: ( () otherlv_7= 'FALSE' )
                    // InternalDeviceDefinition.g:1820:4: () otherlv_7= 'FALSE'
                    {
                    // InternalDeviceDefinition.g:1820:4: ()
                    // InternalDeviceDefinition.g:1821:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimitiveAccess().getBooleanFalseAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,63,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getPrimitiveAccess().getFALSEKeyword_3_1());
                    			

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
    // $ANTLR end "rulePrimitive"


    // $ANTLR start "entryRuleExp"
    // InternalDeviceDefinition.g:1836:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalDeviceDefinition.g:1836:44: (iv_ruleExp= ruleExp EOF )
            // InternalDeviceDefinition.g:1837:2: iv_ruleExp= ruleExp EOF
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
    // InternalDeviceDefinition.g:1843:1: ruleExp returns [EObject current=null] : (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Factor_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:1849:2: ( (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) )
            // InternalDeviceDefinition.g:1850:2: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            {
            // InternalDeviceDefinition.g:1850:2: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            // InternalDeviceDefinition.g:1851:3: this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_52);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDeviceDefinition.g:1859:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=64 && LA32_0<=65)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalDeviceDefinition.g:1860:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) )
            	    {
            	    // InternalDeviceDefinition.g:1860:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==64) ) {
            	        alt31=1;
            	    }
            	    else if ( (LA31_0==65) ) {
            	        alt31=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 31, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // InternalDeviceDefinition.g:1861:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalDeviceDefinition.g:1861:5: ( () otherlv_2= '+' )
            	            // InternalDeviceDefinition.g:1862:6: () otherlv_2= '+'
            	            {
            	            // InternalDeviceDefinition.g:1862:6: ()
            	            // InternalDeviceDefinition.g:1863:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,64,FOLLOW_19); 

            	            						newLeafNode(otherlv_2, grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDeviceDefinition.g:1875:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalDeviceDefinition.g:1875:5: ( () otherlv_4= '-' )
            	            // InternalDeviceDefinition.g:1876:6: () otherlv_4= '-'
            	            {
            	            // InternalDeviceDefinition.g:1876:6: ()
            	            // InternalDeviceDefinition.g:1877:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,65,FOLLOW_19); 

            	            						newLeafNode(otherlv_4, grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalDeviceDefinition.g:1889:4: ( (lv_right_5_0= ruleFactor ) )
            	    // InternalDeviceDefinition.g:1890:5: (lv_right_5_0= ruleFactor )
            	    {
            	    // InternalDeviceDefinition.g:1890:5: (lv_right_5_0= ruleFactor )
            	    // InternalDeviceDefinition.g:1891:6: lv_right_5_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_52);
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
            	    break loop32;
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
    // InternalDeviceDefinition.g:1913:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalDeviceDefinition.g:1913:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalDeviceDefinition.g:1914:2: iv_ruleFactor= ruleFactor EOF
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
    // InternalDeviceDefinition.g:1920:1: ruleFactor returns [EObject current=null] : (this_Compare_0= ruleCompare ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleCompare ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Compare_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:1926:2: ( (this_Compare_0= ruleCompare ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleCompare ) ) )* ) )
            // InternalDeviceDefinition.g:1927:2: (this_Compare_0= ruleCompare ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleCompare ) ) )* )
            {
            // InternalDeviceDefinition.g:1927:2: (this_Compare_0= ruleCompare ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleCompare ) ) )* )
            // InternalDeviceDefinition.g:1928:3: this_Compare_0= ruleCompare ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleCompare ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getCompareParserRuleCall_0());
            		
            pushFollow(FOLLOW_53);
            this_Compare_0=ruleCompare();

            state._fsp--;


            			current = this_Compare_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDeviceDefinition.g:1936:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleCompare ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=66 && LA34_0<=67)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalDeviceDefinition.g:1937:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleCompare ) )
            	    {
            	    // InternalDeviceDefinition.g:1937:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==66) ) {
            	        alt33=1;
            	    }
            	    else if ( (LA33_0==67) ) {
            	        alt33=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 33, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // InternalDeviceDefinition.g:1938:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalDeviceDefinition.g:1938:5: ( () otherlv_2= '*' )
            	            // InternalDeviceDefinition.g:1939:6: () otherlv_2= '*'
            	            {
            	            // InternalDeviceDefinition.g:1939:6: ()
            	            // InternalDeviceDefinition.g:1940:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,66,FOLLOW_19); 

            	            						newLeafNode(otherlv_2, grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDeviceDefinition.g:1952:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalDeviceDefinition.g:1952:5: ( () otherlv_4= '/' )
            	            // InternalDeviceDefinition.g:1953:6: () otherlv_4= '/'
            	            {
            	            // InternalDeviceDefinition.g:1953:6: ()
            	            // InternalDeviceDefinition.g:1954:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,67,FOLLOW_19); 

            	            						newLeafNode(otherlv_4, grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalDeviceDefinition.g:1966:4: ( (lv_right_5_0= ruleCompare ) )
            	    // InternalDeviceDefinition.g:1967:5: (lv_right_5_0= ruleCompare )
            	    {
            	    // InternalDeviceDefinition.g:1967:5: (lv_right_5_0= ruleCompare )
            	    // InternalDeviceDefinition.g:1968:6: lv_right_5_0= ruleCompare
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightCompareParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_53);
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
            	    break loop34;
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
    // InternalDeviceDefinition.g:1990:1: entryRuleCompare returns [EObject current=null] : iv_ruleCompare= ruleCompare EOF ;
    public final EObject entryRuleCompare() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompare = null;


        try {
            // InternalDeviceDefinition.g:1990:48: (iv_ruleCompare= ruleCompare EOF )
            // InternalDeviceDefinition.g:1991:2: iv_ruleCompare= ruleCompare EOF
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
    // InternalDeviceDefinition.g:1997:1: ruleCompare returns [EObject current=null] : (this_CompareOrEquals_0= ruleCompareOrEquals ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleCompareOrEquals ) ) )* ) ;
    public final EObject ruleCompare() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_CompareOrEquals_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:2003:2: ( (this_CompareOrEquals_0= ruleCompareOrEquals ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleCompareOrEquals ) ) )* ) )
            // InternalDeviceDefinition.g:2004:2: (this_CompareOrEquals_0= ruleCompareOrEquals ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleCompareOrEquals ) ) )* )
            {
            // InternalDeviceDefinition.g:2004:2: (this_CompareOrEquals_0= ruleCompareOrEquals ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleCompareOrEquals ) ) )* )
            // InternalDeviceDefinition.g:2005:3: this_CompareOrEquals_0= ruleCompareOrEquals ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleCompareOrEquals ) ) )*
            {

            			newCompositeNode(grammarAccess.getCompareAccess().getCompareOrEqualsParserRuleCall_0());
            		
            pushFollow(FOLLOW_54);
            this_CompareOrEquals_0=ruleCompareOrEquals();

            state._fsp--;


            			current = this_CompareOrEquals_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDeviceDefinition.g:2013:3: ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleCompareOrEquals ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=68 && LA36_0<=69)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalDeviceDefinition.g:2014:4: ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleCompareOrEquals ) )
            	    {
            	    // InternalDeviceDefinition.g:2014:4: ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) )
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
            	            // InternalDeviceDefinition.g:2015:5: ( () otherlv_2= '>' )
            	            {
            	            // InternalDeviceDefinition.g:2015:5: ( () otherlv_2= '>' )
            	            // InternalDeviceDefinition.g:2016:6: () otherlv_2= '>'
            	            {
            	            // InternalDeviceDefinition.g:2016:6: ()
            	            // InternalDeviceDefinition.g:2017:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getCompareAccess().getGreaterLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,68,FOLLOW_19); 

            	            						newLeafNode(otherlv_2, grammarAccess.getCompareAccess().getGreaterThanSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDeviceDefinition.g:2029:5: ( () otherlv_4= '<' )
            	            {
            	            // InternalDeviceDefinition.g:2029:5: ( () otherlv_4= '<' )
            	            // InternalDeviceDefinition.g:2030:6: () otherlv_4= '<'
            	            {
            	            // InternalDeviceDefinition.g:2030:6: ()
            	            // InternalDeviceDefinition.g:2031:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getCompareAccess().getLesserLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,69,FOLLOW_19); 

            	            						newLeafNode(otherlv_4, grammarAccess.getCompareAccess().getLessThanSignKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalDeviceDefinition.g:2043:4: ( (lv_right_5_0= ruleCompareOrEquals ) )
            	    // InternalDeviceDefinition.g:2044:5: (lv_right_5_0= ruleCompareOrEquals )
            	    {
            	    // InternalDeviceDefinition.g:2044:5: (lv_right_5_0= ruleCompareOrEquals )
            	    // InternalDeviceDefinition.g:2045:6: lv_right_5_0= ruleCompareOrEquals
            	    {

            	    						newCompositeNode(grammarAccess.getCompareAccess().getRightCompareOrEqualsParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_54);
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
            	    break loop36;
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
    // InternalDeviceDefinition.g:2067:1: entryRuleCompareOrEquals returns [EObject current=null] : iv_ruleCompareOrEquals= ruleCompareOrEquals EOF ;
    public final EObject entryRuleCompareOrEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOrEquals = null;


        try {
            // InternalDeviceDefinition.g:2067:56: (iv_ruleCompareOrEquals= ruleCompareOrEquals EOF )
            // InternalDeviceDefinition.g:2068:2: iv_ruleCompareOrEquals= ruleCompareOrEquals EOF
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
    // InternalDeviceDefinition.g:2074:1: ruleCompareOrEquals returns [EObject current=null] : (this_EqualsOrNotEquals_0= ruleEqualsOrNotEquals ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) ) ( (lv_right_5_0= ruleEqualsOrNotEquals ) ) )* ) ;
    public final EObject ruleCompareOrEquals() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_EqualsOrNotEquals_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:2080:2: ( (this_EqualsOrNotEquals_0= ruleEqualsOrNotEquals ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) ) ( (lv_right_5_0= ruleEqualsOrNotEquals ) ) )* ) )
            // InternalDeviceDefinition.g:2081:2: (this_EqualsOrNotEquals_0= ruleEqualsOrNotEquals ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) ) ( (lv_right_5_0= ruleEqualsOrNotEquals ) ) )* )
            {
            // InternalDeviceDefinition.g:2081:2: (this_EqualsOrNotEquals_0= ruleEqualsOrNotEquals ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) ) ( (lv_right_5_0= ruleEqualsOrNotEquals ) ) )* )
            // InternalDeviceDefinition.g:2082:3: this_EqualsOrNotEquals_0= ruleEqualsOrNotEquals ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) ) ( (lv_right_5_0= ruleEqualsOrNotEquals ) ) )*
            {

            			newCompositeNode(grammarAccess.getCompareOrEqualsAccess().getEqualsOrNotEqualsParserRuleCall_0());
            		
            pushFollow(FOLLOW_55);
            this_EqualsOrNotEquals_0=ruleEqualsOrNotEquals();

            state._fsp--;


            			current = this_EqualsOrNotEquals_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDeviceDefinition.g:2090:3: ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) ) ( (lv_right_5_0= ruleEqualsOrNotEquals ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=70 && LA38_0<=71)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalDeviceDefinition.g:2091:4: ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) ) ( (lv_right_5_0= ruleEqualsOrNotEquals ) )
            	    {
            	    // InternalDeviceDefinition.g:2091:4: ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) )
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==70) ) {
            	        alt37=1;
            	    }
            	    else if ( (LA37_0==71) ) {
            	        alt37=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 37, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // InternalDeviceDefinition.g:2092:5: ( () otherlv_2= '>=' )
            	            {
            	            // InternalDeviceDefinition.g:2092:5: ( () otherlv_2= '>=' )
            	            // InternalDeviceDefinition.g:2093:6: () otherlv_2= '>='
            	            {
            	            // InternalDeviceDefinition.g:2093:6: ()
            	            // InternalDeviceDefinition.g:2094:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getCompareOrEqualsAccess().getGreaterOrEqualsLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,70,FOLLOW_19); 

            	            						newLeafNode(otherlv_2, grammarAccess.getCompareOrEqualsAccess().getGreaterThanSignEqualsSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDeviceDefinition.g:2106:5: ( () otherlv_4= '<=' )
            	            {
            	            // InternalDeviceDefinition.g:2106:5: ( () otherlv_4= '<=' )
            	            // InternalDeviceDefinition.g:2107:6: () otherlv_4= '<='
            	            {
            	            // InternalDeviceDefinition.g:2107:6: ()
            	            // InternalDeviceDefinition.g:2108:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getCompareOrEqualsAccess().getLesserOrEqualsLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,71,FOLLOW_19); 

            	            						newLeafNode(otherlv_4, grammarAccess.getCompareOrEqualsAccess().getLessThanSignEqualsSignKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalDeviceDefinition.g:2120:4: ( (lv_right_5_0= ruleEqualsOrNotEquals ) )
            	    // InternalDeviceDefinition.g:2121:5: (lv_right_5_0= ruleEqualsOrNotEquals )
            	    {
            	    // InternalDeviceDefinition.g:2121:5: (lv_right_5_0= ruleEqualsOrNotEquals )
            	    // InternalDeviceDefinition.g:2122:6: lv_right_5_0= ruleEqualsOrNotEquals
            	    {

            	    						newCompositeNode(grammarAccess.getCompareOrEqualsAccess().getRightEqualsOrNotEqualsParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_55);
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
            	    break loop38;
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
    // InternalDeviceDefinition.g:2144:1: entryRuleEqualsOrNotEquals returns [EObject current=null] : iv_ruleEqualsOrNotEquals= ruleEqualsOrNotEquals EOF ;
    public final EObject entryRuleEqualsOrNotEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualsOrNotEquals = null;


        try {
            // InternalDeviceDefinition.g:2144:58: (iv_ruleEqualsOrNotEquals= ruleEqualsOrNotEquals EOF )
            // InternalDeviceDefinition.g:2145:2: iv_ruleEqualsOrNotEquals= ruleEqualsOrNotEquals EOF
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
    // InternalDeviceDefinition.g:2151:1: ruleEqualsOrNotEquals returns [EObject current=null] : (this_AndOr_0= ruleAndOr ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleAndOr ) ) )* ) ;
    public final EObject ruleEqualsOrNotEquals() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_AndOr_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:2157:2: ( (this_AndOr_0= ruleAndOr ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleAndOr ) ) )* ) )
            // InternalDeviceDefinition.g:2158:2: (this_AndOr_0= ruleAndOr ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleAndOr ) ) )* )
            {
            // InternalDeviceDefinition.g:2158:2: (this_AndOr_0= ruleAndOr ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleAndOr ) ) )* )
            // InternalDeviceDefinition.g:2159:3: this_AndOr_0= ruleAndOr ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleAndOr ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualsOrNotEqualsAccess().getAndOrParserRuleCall_0());
            		
            pushFollow(FOLLOW_56);
            this_AndOr_0=ruleAndOr();

            state._fsp--;


            			current = this_AndOr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDeviceDefinition.g:2167:3: ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleAndOr ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=72 && LA40_0<=73)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalDeviceDefinition.g:2168:4: ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleAndOr ) )
            	    {
            	    // InternalDeviceDefinition.g:2168:4: ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) )
            	    int alt39=2;
            	    int LA39_0 = input.LA(1);

            	    if ( (LA39_0==72) ) {
            	        alt39=1;
            	    }
            	    else if ( (LA39_0==73) ) {
            	        alt39=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 39, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt39) {
            	        case 1 :
            	            // InternalDeviceDefinition.g:2169:5: ( () otherlv_2= '==' )
            	            {
            	            // InternalDeviceDefinition.g:2169:5: ( () otherlv_2= '==' )
            	            // InternalDeviceDefinition.g:2170:6: () otherlv_2= '=='
            	            {
            	            // InternalDeviceDefinition.g:2170:6: ()
            	            // InternalDeviceDefinition.g:2171:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getEqualsOrNotEqualsAccess().getEqualsLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,72,FOLLOW_19); 

            	            						newLeafNode(otherlv_2, grammarAccess.getEqualsOrNotEqualsAccess().getEqualsSignEqualsSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDeviceDefinition.g:2183:5: ( () otherlv_4= '!=' )
            	            {
            	            // InternalDeviceDefinition.g:2183:5: ( () otherlv_4= '!=' )
            	            // InternalDeviceDefinition.g:2184:6: () otherlv_4= '!='
            	            {
            	            // InternalDeviceDefinition.g:2184:6: ()
            	            // InternalDeviceDefinition.g:2185:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getEqualsOrNotEqualsAccess().getNotEqualsLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,73,FOLLOW_19); 

            	            						newLeafNode(otherlv_4, grammarAccess.getEqualsOrNotEqualsAccess().getExclamationMarkEqualsSignKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalDeviceDefinition.g:2197:4: ( (lv_right_5_0= ruleAndOr ) )
            	    // InternalDeviceDefinition.g:2198:5: (lv_right_5_0= ruleAndOr )
            	    {
            	    // InternalDeviceDefinition.g:2198:5: (lv_right_5_0= ruleAndOr )
            	    // InternalDeviceDefinition.g:2199:6: lv_right_5_0= ruleAndOr
            	    {

            	    						newCompositeNode(grammarAccess.getEqualsOrNotEqualsAccess().getRightAndOrParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_56);
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
            	    break loop40;
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
    // InternalDeviceDefinition.g:2221:1: entryRuleAndOr returns [EObject current=null] : iv_ruleAndOr= ruleAndOr EOF ;
    public final EObject entryRuleAndOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndOr = null;


        try {
            // InternalDeviceDefinition.g:2221:46: (iv_ruleAndOr= ruleAndOr EOF )
            // InternalDeviceDefinition.g:2222:2: iv_ruleAndOr= ruleAndOr EOF
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
    // InternalDeviceDefinition.g:2228:1: ruleAndOr returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( ( () otherlv_2= 'and' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleAndOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Primary_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:2234:2: ( (this_Primary_0= rulePrimary ( ( ( () otherlv_2= 'and' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) )
            // InternalDeviceDefinition.g:2235:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= 'and' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            {
            // InternalDeviceDefinition.g:2235:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= 'and' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            // InternalDeviceDefinition.g:2236:3: this_Primary_0= rulePrimary ( ( ( () otherlv_2= 'and' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndOrAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_57);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDeviceDefinition.g:2244:3: ( ( ( () otherlv_2= 'and' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==21||LA42_0==74) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalDeviceDefinition.g:2245:4: ( ( () otherlv_2= 'and' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= rulePrimary ) )
            	    {
            	    // InternalDeviceDefinition.g:2245:4: ( ( () otherlv_2= 'and' ) | ( () otherlv_4= 'or' ) )
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==21) ) {
            	        alt41=1;
            	    }
            	    else if ( (LA41_0==74) ) {
            	        alt41=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 41, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // InternalDeviceDefinition.g:2246:5: ( () otherlv_2= 'and' )
            	            {
            	            // InternalDeviceDefinition.g:2246:5: ( () otherlv_2= 'and' )
            	            // InternalDeviceDefinition.g:2247:6: () otherlv_2= 'and'
            	            {
            	            // InternalDeviceDefinition.g:2247:6: ()
            	            // InternalDeviceDefinition.g:2248:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getAndOrAccess().getAndLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,21,FOLLOW_19); 

            	            						newLeafNode(otherlv_2, grammarAccess.getAndOrAccess().getAndKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDeviceDefinition.g:2260:5: ( () otherlv_4= 'or' )
            	            {
            	            // InternalDeviceDefinition.g:2260:5: ( () otherlv_4= 'or' )
            	            // InternalDeviceDefinition.g:2261:6: () otherlv_4= 'or'
            	            {
            	            // InternalDeviceDefinition.g:2261:6: ()
            	            // InternalDeviceDefinition.g:2262:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getAndOrAccess().getOrLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,74,FOLLOW_19); 

            	            						newLeafNode(otherlv_4, grammarAccess.getAndOrAccess().getOrKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalDeviceDefinition.g:2274:4: ( (lv_right_5_0= rulePrimary ) )
            	    // InternalDeviceDefinition.g:2275:5: (lv_right_5_0= rulePrimary )
            	    {
            	    // InternalDeviceDefinition.g:2275:5: (lv_right_5_0= rulePrimary )
            	    // InternalDeviceDefinition.g:2276:6: lv_right_5_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getAndOrAccess().getRightPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_57);
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
            	    break loop42;
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
    // InternalDeviceDefinition.g:2298:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalDeviceDefinition.g:2298:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalDeviceDefinition.g:2299:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalDeviceDefinition.g:2305:1: rulePrimary returns [EObject current=null] : (this_Primitive_0= rulePrimitive | this_Parenthesis_1= ruleParenthesis | this_VariableUse_2= ruleVariableUse | this_ExternalCall_3= ruleExternalCall | ( () otherlv_5= 'value' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        EObject this_Primitive_0 = null;

        EObject this_Parenthesis_1 = null;

        EObject this_VariableUse_2 = null;

        EObject this_ExternalCall_3 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:2311:2: ( (this_Primitive_0= rulePrimitive | this_Parenthesis_1= ruleParenthesis | this_VariableUse_2= ruleVariableUse | this_ExternalCall_3= ruleExternalCall | ( () otherlv_5= 'value' ) ) )
            // InternalDeviceDefinition.g:2312:2: (this_Primitive_0= rulePrimitive | this_Parenthesis_1= ruleParenthesis | this_VariableUse_2= ruleVariableUse | this_ExternalCall_3= ruleExternalCall | ( () otherlv_5= 'value' ) )
            {
            // InternalDeviceDefinition.g:2312:2: (this_Primitive_0= rulePrimitive | this_Parenthesis_1= ruleParenthesis | this_VariableUse_2= ruleVariableUse | this_ExternalCall_3= ruleExternalCall | ( () otherlv_5= 'value' ) )
            int alt43=5;
            switch ( input.LA(1) ) {
            case RULE_DECIMAL:
            case RULE_INT:
            case 62:
            case 63:
                {
                alt43=1;
                }
                break;
            case 30:
                {
                alt43=2;
                }
                break;
            case RULE_ID:
                {
                alt43=3;
                }
                break;
            case 76:
                {
                alt43=4;
                }
                break;
            case 75:
                {
                alt43=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalDeviceDefinition.g:2313:3: this_Primitive_0= rulePrimitive
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
                    // InternalDeviceDefinition.g:2322:3: this_Parenthesis_1= ruleParenthesis
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
                    // InternalDeviceDefinition.g:2331:3: this_VariableUse_2= ruleVariableUse
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
                    // InternalDeviceDefinition.g:2340:3: this_ExternalCall_3= ruleExternalCall
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
                    // InternalDeviceDefinition.g:2349:3: ( () otherlv_5= 'value' )
                    {
                    // InternalDeviceDefinition.g:2349:3: ( () otherlv_5= 'value' )
                    // InternalDeviceDefinition.g:2350:4: () otherlv_5= 'value'
                    {
                    // InternalDeviceDefinition.g:2350:4: ()
                    // InternalDeviceDefinition.g:2351:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getValueAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,75,FOLLOW_2); 

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
    // InternalDeviceDefinition.g:2366:1: entryRuleExternalCall returns [EObject current=null] : iv_ruleExternalCall= ruleExternalCall EOF ;
    public final EObject entryRuleExternalCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalCall = null;


        try {
            // InternalDeviceDefinition.g:2366:53: (iv_ruleExternalCall= ruleExternalCall EOF )
            // InternalDeviceDefinition.g:2367:2: iv_ruleExternalCall= ruleExternalCall EOF
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
    // InternalDeviceDefinition.g:2373:1: ruleExternalCall returns [EObject current=null] : (otherlv_0= 'call' ( (lv_func_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_args_3_0= ruleExp ) )? (otherlv_4= ',' ( (lv_args_5_0= ruleExp ) ) )* otherlv_6= ')' ) ;
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
            // InternalDeviceDefinition.g:2379:2: ( (otherlv_0= 'call' ( (lv_func_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_args_3_0= ruleExp ) )? (otherlv_4= ',' ( (lv_args_5_0= ruleExp ) ) )* otherlv_6= ')' ) )
            // InternalDeviceDefinition.g:2380:2: (otherlv_0= 'call' ( (lv_func_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_args_3_0= ruleExp ) )? (otherlv_4= ',' ( (lv_args_5_0= ruleExp ) ) )* otherlv_6= ')' )
            {
            // InternalDeviceDefinition.g:2380:2: (otherlv_0= 'call' ( (lv_func_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_args_3_0= ruleExp ) )? (otherlv_4= ',' ( (lv_args_5_0= ruleExp ) ) )* otherlv_6= ')' )
            // InternalDeviceDefinition.g:2381:3: otherlv_0= 'call' ( (lv_func_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_args_3_0= ruleExp ) )? (otherlv_4= ',' ( (lv_args_5_0= ruleExp ) ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,76,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalCallAccess().getCallKeyword_0());
            		
            // InternalDeviceDefinition.g:2385:3: ( (lv_func_1_0= RULE_ID ) )
            // InternalDeviceDefinition.g:2386:4: (lv_func_1_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:2386:4: (lv_func_1_0= RULE_ID )
            // InternalDeviceDefinition.g:2387:5: lv_func_1_0= RULE_ID
            {
            lv_func_1_0=(Token)match(input,RULE_ID,FOLLOW_58); 

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

            otherlv_2=(Token)match(input,30,FOLLOW_59); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalCallAccess().getLeftParenthesisKeyword_2());
            		
            // InternalDeviceDefinition.g:2407:3: ( (lv_args_3_0= ruleExp ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_DECIMAL && LA44_0<=RULE_ID)||LA44_0==RULE_INT||LA44_0==30||(LA44_0>=62 && LA44_0<=63)||(LA44_0>=75 && LA44_0<=76)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalDeviceDefinition.g:2408:4: (lv_args_3_0= ruleExp )
                    {
                    // InternalDeviceDefinition.g:2408:4: (lv_args_3_0= ruleExp )
                    // InternalDeviceDefinition.g:2409:5: lv_args_3_0= ruleExp
                    {

                    					newCompositeNode(grammarAccess.getExternalCallAccess().getArgsExpParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_60);
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

            // InternalDeviceDefinition.g:2426:3: (otherlv_4= ',' ( (lv_args_5_0= ruleExp ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==31) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalDeviceDefinition.g:2427:4: otherlv_4= ',' ( (lv_args_5_0= ruleExp ) )
            	    {
            	    otherlv_4=(Token)match(input,31,FOLLOW_19); 

            	    				newLeafNode(otherlv_4, grammarAccess.getExternalCallAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalDeviceDefinition.g:2431:4: ( (lv_args_5_0= ruleExp ) )
            	    // InternalDeviceDefinition.g:2432:5: (lv_args_5_0= ruleExp )
            	    {
            	    // InternalDeviceDefinition.g:2432:5: (lv_args_5_0= ruleExp )
            	    // InternalDeviceDefinition.g:2433:6: lv_args_5_0= ruleExp
            	    {

            	    						newCompositeNode(grammarAccess.getExternalCallAccess().getArgsExpParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_60);
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
            	    break loop45;
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
    // InternalDeviceDefinition.g:2459:1: entryRuleInternalVariableUse returns [EObject current=null] : iv_ruleInternalVariableUse= ruleInternalVariableUse EOF ;
    public final EObject entryRuleInternalVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalVariableUse = null;


        try {
            // InternalDeviceDefinition.g:2459:60: (iv_ruleInternalVariableUse= ruleInternalVariableUse EOF )
            // InternalDeviceDefinition.g:2460:2: iv_ruleInternalVariableUse= ruleInternalVariableUse EOF
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
    // InternalDeviceDefinition.g:2466:1: ruleInternalVariableUse returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleInternalVariableUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDeviceDefinition.g:2472:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalDeviceDefinition.g:2473:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalDeviceDefinition.g:2473:2: ( (otherlv_0= RULE_ID ) )
            // InternalDeviceDefinition.g:2474:3: (otherlv_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:2474:3: (otherlv_0= RULE_ID )
            // InternalDeviceDefinition.g:2475:4: otherlv_0= RULE_ID
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
    // InternalDeviceDefinition.g:2489:1: entryRuleExternalVariableUse returns [EObject current=null] : iv_ruleExternalVariableUse= ruleExternalVariableUse EOF ;
    public final EObject entryRuleExternalVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalVariableUse = null;


        try {
            // InternalDeviceDefinition.g:2489:60: (iv_ruleExternalVariableUse= ruleExternalVariableUse EOF )
            // InternalDeviceDefinition.g:2490:2: iv_ruleExternalVariableUse= ruleExternalVariableUse EOF
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
    // InternalDeviceDefinition.g:2496:1: ruleExternalVariableUse returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' | otherlv_2= '->' ) ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleExternalVariableUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDeviceDefinition.g:2502:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' | otherlv_2= '->' ) ( (otherlv_3= RULE_ID ) ) ) )
            // InternalDeviceDefinition.g:2503:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' | otherlv_2= '->' ) ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalDeviceDefinition.g:2503:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' | otherlv_2= '->' ) ( (otherlv_3= RULE_ID ) ) )
            // InternalDeviceDefinition.g:2504:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' | otherlv_2= '->' ) ( (otherlv_3= RULE_ID ) )
            {
            // InternalDeviceDefinition.g:2504:3: ( (otherlv_0= RULE_ID ) )
            // InternalDeviceDefinition.g:2505:4: (otherlv_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:2505:4: (otherlv_0= RULE_ID )
            // InternalDeviceDefinition.g:2506:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalVariableUseRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_61); 

            					newLeafNode(otherlv_0, grammarAccess.getExternalVariableUseAccess().getObjDeviceCrossReference_0_0());
            				

            }


            }

            // InternalDeviceDefinition.g:2517:3: (otherlv_1= '.' | otherlv_2= '->' )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==77) ) {
                alt46=1;
            }
            else if ( (LA46_0==78) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalDeviceDefinition.g:2518:4: otherlv_1= '.'
                    {
                    otherlv_1=(Token)match(input,77,FOLLOW_26); 

                    				newLeafNode(otherlv_1, grammarAccess.getExternalVariableUseAccess().getFullStopKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDeviceDefinition.g:2523:4: otherlv_2= '->'
                    {
                    otherlv_2=(Token)match(input,78,FOLLOW_26); 

                    				newLeafNode(otherlv_2, grammarAccess.getExternalVariableUseAccess().getHyphenMinusGreaterThanSignKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalDeviceDefinition.g:2528:3: ( (otherlv_3= RULE_ID ) )
            // InternalDeviceDefinition.g:2529:4: (otherlv_3= RULE_ID )
            {
            // InternalDeviceDefinition.g:2529:4: (otherlv_3= RULE_ID )
            // InternalDeviceDefinition.g:2530:5: otherlv_3= RULE_ID
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
    // InternalDeviceDefinition.g:2545:1: entryRuleGraphVariableUse returns [EObject current=null] : iv_ruleGraphVariableUse= ruleGraphVariableUse EOF ;
    public final EObject entryRuleGraphVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphVariableUse = null;


        try {
            // InternalDeviceDefinition.g:2545:57: (iv_ruleGraphVariableUse= ruleGraphVariableUse EOF )
            // InternalDeviceDefinition.g:2546:2: iv_ruleGraphVariableUse= ruleGraphVariableUse EOF
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
    // InternalDeviceDefinition.g:2552:1: ruleGraphVariableUse returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' | otherlv_2= '->' ) ( (otherlv_3= RULE_ID ) ) (otherlv_4= '.' | otherlv_5= '->' ) ( (otherlv_6= RULE_ID ) ) ) ;
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
            // InternalDeviceDefinition.g:2558:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' | otherlv_2= '->' ) ( (otherlv_3= RULE_ID ) ) (otherlv_4= '.' | otherlv_5= '->' ) ( (otherlv_6= RULE_ID ) ) ) )
            // InternalDeviceDefinition.g:2559:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' | otherlv_2= '->' ) ( (otherlv_3= RULE_ID ) ) (otherlv_4= '.' | otherlv_5= '->' ) ( (otherlv_6= RULE_ID ) ) )
            {
            // InternalDeviceDefinition.g:2559:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' | otherlv_2= '->' ) ( (otherlv_3= RULE_ID ) ) (otherlv_4= '.' | otherlv_5= '->' ) ( (otherlv_6= RULE_ID ) ) )
            // InternalDeviceDefinition.g:2560:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' | otherlv_2= '->' ) ( (otherlv_3= RULE_ID ) ) (otherlv_4= '.' | otherlv_5= '->' ) ( (otherlv_6= RULE_ID ) )
            {
            // InternalDeviceDefinition.g:2560:3: ( (otherlv_0= RULE_ID ) )
            // InternalDeviceDefinition.g:2561:4: (otherlv_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:2561:4: (otherlv_0= RULE_ID )
            // InternalDeviceDefinition.g:2562:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphVariableUseRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_61); 

            					newLeafNode(otherlv_0, grammarAccess.getGraphVariableUseAccess().getWorkerWorkerCrossReference_0_0());
            				

            }


            }

            // InternalDeviceDefinition.g:2573:3: (otherlv_1= '.' | otherlv_2= '->' )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==77) ) {
                alt47=1;
            }
            else if ( (LA47_0==78) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalDeviceDefinition.g:2574:4: otherlv_1= '.'
                    {
                    otherlv_1=(Token)match(input,77,FOLLOW_26); 

                    				newLeafNode(otherlv_1, grammarAccess.getGraphVariableUseAccess().getFullStopKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDeviceDefinition.g:2579:4: otherlv_2= '->'
                    {
                    otherlv_2=(Token)match(input,78,FOLLOW_26); 

                    				newLeafNode(otherlv_2, grammarAccess.getGraphVariableUseAccess().getHyphenMinusGreaterThanSignKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalDeviceDefinition.g:2584:3: ( (otherlv_3= RULE_ID ) )
            // InternalDeviceDefinition.g:2585:4: (otherlv_3= RULE_ID )
            {
            // InternalDeviceDefinition.g:2585:4: (otherlv_3= RULE_ID )
            // InternalDeviceDefinition.g:2586:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphVariableUseRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_61); 

            					newLeafNode(otherlv_3, grammarAccess.getGraphVariableUseAccess().getDeviceDeviceCrossReference_2_0());
            				

            }


            }

            // InternalDeviceDefinition.g:2597:3: (otherlv_4= '.' | otherlv_5= '->' )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==77) ) {
                alt48=1;
            }
            else if ( (LA48_0==78) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalDeviceDefinition.g:2598:4: otherlv_4= '.'
                    {
                    otherlv_4=(Token)match(input,77,FOLLOW_26); 

                    				newLeafNode(otherlv_4, grammarAccess.getGraphVariableUseAccess().getFullStopKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDeviceDefinition.g:2603:4: otherlv_5= '->'
                    {
                    otherlv_5=(Token)match(input,78,FOLLOW_26); 

                    				newLeafNode(otherlv_5, grammarAccess.getGraphVariableUseAccess().getHyphenMinusGreaterThanSignKeyword_3_1());
                    			

                    }
                    break;

            }

            // InternalDeviceDefinition.g:2608:3: ( (otherlv_6= RULE_ID ) )
            // InternalDeviceDefinition.g:2609:4: (otherlv_6= RULE_ID )
            {
            // InternalDeviceDefinition.g:2609:4: (otherlv_6= RULE_ID )
            // InternalDeviceDefinition.g:2610:5: otherlv_6= RULE_ID
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
    // InternalDeviceDefinition.g:2625:1: entryRuleVariableUse returns [EObject current=null] : iv_ruleVariableUse= ruleVariableUse EOF ;
    public final EObject entryRuleVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableUse = null;


        try {
            // InternalDeviceDefinition.g:2625:52: (iv_ruleVariableUse= ruleVariableUse EOF )
            // InternalDeviceDefinition.g:2626:2: iv_ruleVariableUse= ruleVariableUse EOF
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
    // InternalDeviceDefinition.g:2632:1: ruleVariableUse returns [EObject current=null] : (this_InternalVariableUse_0= ruleInternalVariableUse | this_ExternalVariableUse_1= ruleExternalVariableUse | this_GraphVariableUse_2= ruleGraphVariableUse ) ;
    public final EObject ruleVariableUse() throws RecognitionException {
        EObject current = null;

        EObject this_InternalVariableUse_0 = null;

        EObject this_ExternalVariableUse_1 = null;

        EObject this_GraphVariableUse_2 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:2638:2: ( (this_InternalVariableUse_0= ruleInternalVariableUse | this_ExternalVariableUse_1= ruleExternalVariableUse | this_GraphVariableUse_2= ruleGraphVariableUse ) )
            // InternalDeviceDefinition.g:2639:2: (this_InternalVariableUse_0= ruleInternalVariableUse | this_ExternalVariableUse_1= ruleExternalVariableUse | this_GraphVariableUse_2= ruleGraphVariableUse )
            {
            // InternalDeviceDefinition.g:2639:2: (this_InternalVariableUse_0= ruleInternalVariableUse | this_ExternalVariableUse_1= ruleExternalVariableUse | this_GraphVariableUse_2= ruleGraphVariableUse )
            int alt49=3;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case EOF:
                case 21:
                case 22:
                case 27:
                case 28:
                case 29:
                case 31:
                case 32:
                case 36:
                case 39:
                case 41:
                case 46:
                case 55:
                case 58:
                case 59:
                case 60:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                    {
                    alt49=1;
                    }
                    break;
                case 77:
                    {
                    int LA49_3 = input.LA(3);

                    if ( (LA49_3==RULE_ID) ) {
                        int LA49_5 = input.LA(4);

                        if ( (LA49_5==EOF||(LA49_5>=21 && LA49_5<=22)||(LA49_5>=27 && LA49_5<=29)||(LA49_5>=31 && LA49_5<=32)||LA49_5==36||LA49_5==39||LA49_5==41||LA49_5==46||LA49_5==55||(LA49_5>=58 && LA49_5<=60)||(LA49_5>=64 && LA49_5<=74)) ) {
                            alt49=2;
                        }
                        else if ( ((LA49_5>=77 && LA49_5<=78)) ) {
                            alt49=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 49, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 49, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 78:
                    {
                    int LA49_4 = input.LA(3);

                    if ( (LA49_4==RULE_ID) ) {
                        int LA49_5 = input.LA(4);

                        if ( (LA49_5==EOF||(LA49_5>=21 && LA49_5<=22)||(LA49_5>=27 && LA49_5<=29)||(LA49_5>=31 && LA49_5<=32)||LA49_5==36||LA49_5==39||LA49_5==41||LA49_5==46||LA49_5==55||(LA49_5>=58 && LA49_5<=60)||(LA49_5>=64 && LA49_5<=74)) ) {
                            alt49=2;
                        }
                        else if ( ((LA49_5>=77 && LA49_5<=78)) ) {
                            alt49=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 49, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 49, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalDeviceDefinition.g:2640:3: this_InternalVariableUse_0= ruleInternalVariableUse
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
                    // InternalDeviceDefinition.g:2649:3: this_ExternalVariableUse_1= ruleExternalVariableUse
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
                    // InternalDeviceDefinition.g:2658:3: this_GraphVariableUse_2= ruleGraphVariableUse
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
    // InternalDeviceDefinition.g:2670:1: entryRuleParenthesis returns [EObject current=null] : iv_ruleParenthesis= ruleParenthesis EOF ;
    public final EObject entryRuleParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesis = null;


        try {
            // InternalDeviceDefinition.g:2670:52: (iv_ruleParenthesis= ruleParenthesis EOF )
            // InternalDeviceDefinition.g:2671:2: iv_ruleParenthesis= ruleParenthesis EOF
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
    // InternalDeviceDefinition.g:2677:1: ruleParenthesis returns [EObject current=null] : (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' ) ;
    public final EObject ruleParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:2683:2: ( (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' ) )
            // InternalDeviceDefinition.g:2684:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' )
            {
            // InternalDeviceDefinition.g:2684:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' )
            // InternalDeviceDefinition.g:2685:3: otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0());
            		
            // InternalDeviceDefinition.g:2689:3: ( (lv_exp_1_0= ruleExp ) )
            // InternalDeviceDefinition.g:2690:4: (lv_exp_1_0= ruleExp )
            {
            // InternalDeviceDefinition.g:2690:4: (lv_exp_1_0= ruleExp )
            // InternalDeviceDefinition.g:2691:5: lv_exp_1_0= ruleExp
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
    // InternalDeviceDefinition.g:2716:1: ruleColorPreset returns [Enumerator current=null] : ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'green' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'yellow' ) ) ;
    public final Enumerator ruleColorPreset() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDeviceDefinition.g:2722:2: ( ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'green' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'yellow' ) ) )
            // InternalDeviceDefinition.g:2723:2: ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'green' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'yellow' ) )
            {
            // InternalDeviceDefinition.g:2723:2: ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'green' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'yellow' ) )
            int alt50=4;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt50=1;
                }
                break;
            case 80:
                {
                alt50=2;
                }
                break;
            case 81:
                {
                alt50=3;
                }
                break;
            case 82:
                {
                alt50=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalDeviceDefinition.g:2724:3: (enumLiteral_0= 'red' )
                    {
                    // InternalDeviceDefinition.g:2724:3: (enumLiteral_0= 'red' )
                    // InternalDeviceDefinition.g:2725:4: enumLiteral_0= 'red'
                    {
                    enumLiteral_0=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getColorPresetAccess().getRedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getColorPresetAccess().getRedEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDeviceDefinition.g:2732:3: (enumLiteral_1= 'green' )
                    {
                    // InternalDeviceDefinition.g:2732:3: (enumLiteral_1= 'green' )
                    // InternalDeviceDefinition.g:2733:4: enumLiteral_1= 'green'
                    {
                    enumLiteral_1=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getColorPresetAccess().getGreenEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getColorPresetAccess().getGreenEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDeviceDefinition.g:2740:3: (enumLiteral_2= 'blue' )
                    {
                    // InternalDeviceDefinition.g:2740:3: (enumLiteral_2= 'blue' )
                    // InternalDeviceDefinition.g:2741:4: enumLiteral_2= 'blue'
                    {
                    enumLiteral_2=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getColorPresetAccess().getBlueEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getColorPresetAccess().getBlueEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDeviceDefinition.g:2748:3: (enumLiteral_3= 'yellow' )
                    {
                    // InternalDeviceDefinition.g:2748:3: (enumLiteral_3= 'yellow' )
                    // InternalDeviceDefinition.g:2749:4: enumLiteral_3= 'yellow'
                    {
                    enumLiteral_3=(Token)match(input,82,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000400020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0xC000000040000160L,0x0000000000001800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000240000000L,0x0000000000078000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x008000A000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x001F800000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0080008000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x1000430000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x10007A0080000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000780000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x1000420080000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x1000420000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x1000020000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0020000000000010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x1300780080000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0xC000000000000120L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000030L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000200002L,0x0000000000000400L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0xC0000001C0000160L,0x0000000000001800L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});

}