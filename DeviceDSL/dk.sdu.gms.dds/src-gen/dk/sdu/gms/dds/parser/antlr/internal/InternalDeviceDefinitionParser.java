package dk.sdu.gms.dds.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_MAC", "RULE_INT", "RULE_DECIMAL", "RULE_HEXBYTE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'System'", "':'", "'wifi'", "'with'", "'password'", "'mqtt'", "'username'", "'and'", "'Graph'", "'category'", "'title'", "'x'", "'y'", "'Gateway'", "'mac'", "'Worker'", "'sleep'", "'for'", "'Sensor'", "'pins'", "','", "'sample'", "'if'", "'graph'", "'adc'", "'dac'", "'in'", "'out'", "'second'", "'seconds'", "'minute'", "'minutes'", "'hour'", "'hours'", "'as'", "'mapping'", "'Actuator'", "'when'", "'on'", "'off'", "'run'", "'setting'", "'='", "'TRUE'", "'FALSE'", "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'or'", "'value'", "'call'", "'('", "')'", "'.'", "'->'"
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
    public static final int RULE_ID=5;
    public static final int RULE_DECIMAL=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
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
    public static final int RULE_MAC=6;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_HEXBYTE=9;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
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
    // InternalDeviceDefinition.g:64:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // InternalDeviceDefinition.g:64:47: (iv_ruleSystem= ruleSystem EOF )
            // InternalDeviceDefinition.g:65:2: iv_ruleSystem= ruleSystem EOF
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
    // InternalDeviceDefinition.g:71:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'System' otherlv_1= ':' otherlv_2= 'wifi' ( (lv_wifiSsid_3_0= RULE_STRING ) ) (otherlv_4= 'with' otherlv_5= 'password' ( (lv_wifiPassword_6_0= RULE_STRING ) ) )? otherlv_7= 'mqtt' ( (lv_mqttHost_8_0= RULE_STRING ) ) (otherlv_9= 'with' otherlv_10= 'username' ( (lv_mqttUsername_11_0= RULE_STRING ) ) otherlv_12= 'and' otherlv_13= 'password' ( (lv_mqttPassword_14_0= RULE_STRING ) ) )? ( (lv_gateway_15_0= ruleGateway ) ) ( (lv_graphs_16_0= ruleGraph ) )* ) ;
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
            // InternalDeviceDefinition.g:77:2: ( (otherlv_0= 'System' otherlv_1= ':' otherlv_2= 'wifi' ( (lv_wifiSsid_3_0= RULE_STRING ) ) (otherlv_4= 'with' otherlv_5= 'password' ( (lv_wifiPassword_6_0= RULE_STRING ) ) )? otherlv_7= 'mqtt' ( (lv_mqttHost_8_0= RULE_STRING ) ) (otherlv_9= 'with' otherlv_10= 'username' ( (lv_mqttUsername_11_0= RULE_STRING ) ) otherlv_12= 'and' otherlv_13= 'password' ( (lv_mqttPassword_14_0= RULE_STRING ) ) )? ( (lv_gateway_15_0= ruleGateway ) ) ( (lv_graphs_16_0= ruleGraph ) )* ) )
            // InternalDeviceDefinition.g:78:2: (otherlv_0= 'System' otherlv_1= ':' otherlv_2= 'wifi' ( (lv_wifiSsid_3_0= RULE_STRING ) ) (otherlv_4= 'with' otherlv_5= 'password' ( (lv_wifiPassword_6_0= RULE_STRING ) ) )? otherlv_7= 'mqtt' ( (lv_mqttHost_8_0= RULE_STRING ) ) (otherlv_9= 'with' otherlv_10= 'username' ( (lv_mqttUsername_11_0= RULE_STRING ) ) otherlv_12= 'and' otherlv_13= 'password' ( (lv_mqttPassword_14_0= RULE_STRING ) ) )? ( (lv_gateway_15_0= ruleGateway ) ) ( (lv_graphs_16_0= ruleGraph ) )* )
            {
            // InternalDeviceDefinition.g:78:2: (otherlv_0= 'System' otherlv_1= ':' otherlv_2= 'wifi' ( (lv_wifiSsid_3_0= RULE_STRING ) ) (otherlv_4= 'with' otherlv_5= 'password' ( (lv_wifiPassword_6_0= RULE_STRING ) ) )? otherlv_7= 'mqtt' ( (lv_mqttHost_8_0= RULE_STRING ) ) (otherlv_9= 'with' otherlv_10= 'username' ( (lv_mqttUsername_11_0= RULE_STRING ) ) otherlv_12= 'and' otherlv_13= 'password' ( (lv_mqttPassword_14_0= RULE_STRING ) ) )? ( (lv_gateway_15_0= ruleGateway ) ) ( (lv_graphs_16_0= ruleGraph ) )* )
            // InternalDeviceDefinition.g:79:3: otherlv_0= 'System' otherlv_1= ':' otherlv_2= 'wifi' ( (lv_wifiSsid_3_0= RULE_STRING ) ) (otherlv_4= 'with' otherlv_5= 'password' ( (lv_wifiPassword_6_0= RULE_STRING ) ) )? otherlv_7= 'mqtt' ( (lv_mqttHost_8_0= RULE_STRING ) ) (otherlv_9= 'with' otherlv_10= 'username' ( (lv_mqttUsername_11_0= RULE_STRING ) ) otherlv_12= 'and' otherlv_13= 'password' ( (lv_mqttPassword_14_0= RULE_STRING ) ) )? ( (lv_gateway_15_0= ruleGateway ) ) ( (lv_graphs_16_0= ruleGraph ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getWifiKeyword_2());
            		
            // InternalDeviceDefinition.g:91:3: ( (lv_wifiSsid_3_0= RULE_STRING ) )
            // InternalDeviceDefinition.g:92:4: (lv_wifiSsid_3_0= RULE_STRING )
            {
            // InternalDeviceDefinition.g:92:4: (lv_wifiSsid_3_0= RULE_STRING )
            // InternalDeviceDefinition.g:93:5: lv_wifiSsid_3_0= RULE_STRING
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

            // InternalDeviceDefinition.g:109:3: (otherlv_4= 'with' otherlv_5= 'password' ( (lv_wifiPassword_6_0= RULE_STRING ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==17) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDeviceDefinition.g:110:4: otherlv_4= 'with' otherlv_5= 'password' ( (lv_wifiPassword_6_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getSystemAccess().getWithKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getSystemAccess().getPasswordKeyword_4_1());
                    			
                    // InternalDeviceDefinition.g:118:4: ( (lv_wifiPassword_6_0= RULE_STRING ) )
                    // InternalDeviceDefinition.g:119:5: (lv_wifiPassword_6_0= RULE_STRING )
                    {
                    // InternalDeviceDefinition.g:119:5: (lv_wifiPassword_6_0= RULE_STRING )
                    // InternalDeviceDefinition.g:120:6: lv_wifiPassword_6_0= RULE_STRING
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
            		
            // InternalDeviceDefinition.g:141:3: ( (lv_mqttHost_8_0= RULE_STRING ) )
            // InternalDeviceDefinition.g:142:4: (lv_mqttHost_8_0= RULE_STRING )
            {
            // InternalDeviceDefinition.g:142:4: (lv_mqttHost_8_0= RULE_STRING )
            // InternalDeviceDefinition.g:143:5: lv_mqttHost_8_0= RULE_STRING
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

            // InternalDeviceDefinition.g:159:3: (otherlv_9= 'with' otherlv_10= 'username' ( (lv_mqttUsername_11_0= RULE_STRING ) ) otherlv_12= 'and' otherlv_13= 'password' ( (lv_mqttPassword_14_0= RULE_STRING ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDeviceDefinition.g:160:4: otherlv_9= 'with' otherlv_10= 'username' ( (lv_mqttUsername_11_0= RULE_STRING ) ) otherlv_12= 'and' otherlv_13= 'password' ( (lv_mqttPassword_14_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getSystemAccess().getWithKeyword_7_0());
                    			
                    otherlv_10=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getSystemAccess().getUsernameKeyword_7_1());
                    			
                    // InternalDeviceDefinition.g:168:4: ( (lv_mqttUsername_11_0= RULE_STRING ) )
                    // InternalDeviceDefinition.g:169:5: (lv_mqttUsername_11_0= RULE_STRING )
                    {
                    // InternalDeviceDefinition.g:169:5: (lv_mqttUsername_11_0= RULE_STRING )
                    // InternalDeviceDefinition.g:170:6: lv_mqttUsername_11_0= RULE_STRING
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
                    			
                    // InternalDeviceDefinition.g:194:4: ( (lv_mqttPassword_14_0= RULE_STRING ) )
                    // InternalDeviceDefinition.g:195:5: (lv_mqttPassword_14_0= RULE_STRING )
                    {
                    // InternalDeviceDefinition.g:195:5: (lv_mqttPassword_14_0= RULE_STRING )
                    // InternalDeviceDefinition.g:196:6: lv_mqttPassword_14_0= RULE_STRING
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

            // InternalDeviceDefinition.g:213:3: ( (lv_gateway_15_0= ruleGateway ) )
            // InternalDeviceDefinition.g:214:4: (lv_gateway_15_0= ruleGateway )
            {
            // InternalDeviceDefinition.g:214:4: (lv_gateway_15_0= ruleGateway )
            // InternalDeviceDefinition.g:215:5: lv_gateway_15_0= ruleGateway
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

            // InternalDeviceDefinition.g:232:3: ( (lv_graphs_16_0= ruleGraph ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDeviceDefinition.g:233:4: (lv_graphs_16_0= ruleGraph )
            	    {
            	    // InternalDeviceDefinition.g:233:4: (lv_graphs_16_0= ruleGraph )
            	    // InternalDeviceDefinition.g:234:5: lv_graphs_16_0= ruleGraph
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
    // InternalDeviceDefinition.g:255:1: entryRuleGraph returns [EObject current=null] : iv_ruleGraph= ruleGraph EOF ;
    public final EObject entryRuleGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraph = null;


        try {
            // InternalDeviceDefinition.g:255:46: (iv_ruleGraph= ruleGraph EOF )
            // InternalDeviceDefinition.g:256:2: iv_ruleGraph= ruleGraph EOF
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
    // InternalDeviceDefinition.g:262:1: ruleGraph returns [EObject current=null] : (otherlv_0= 'Graph' ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'category' ( (lv_category_5_0= RULE_STRING ) ) otherlv_6= 'title' ( (lv_title_7_0= RULE_STRING ) ) otherlv_8= 'x' ( (lv_xlabel_9_0= RULE_STRING ) ) otherlv_10= 'y' ( (lv_ylabel_11_0= RULE_STRING ) ) ) ;
    public final EObject ruleGraph() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_category_5_0=null;
        Token otherlv_6=null;
        Token lv_title_7_0=null;
        Token otherlv_8=null;
        Token lv_xlabel_9_0=null;
        Token otherlv_10=null;
        Token lv_ylabel_11_0=null;


        	enterRule();

        try {
            // InternalDeviceDefinition.g:268:2: ( (otherlv_0= 'Graph' ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'category' ( (lv_category_5_0= RULE_STRING ) ) otherlv_6= 'title' ( (lv_title_7_0= RULE_STRING ) ) otherlv_8= 'x' ( (lv_xlabel_9_0= RULE_STRING ) ) otherlv_10= 'y' ( (lv_ylabel_11_0= RULE_STRING ) ) ) )
            // InternalDeviceDefinition.g:269:2: (otherlv_0= 'Graph' ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'category' ( (lv_category_5_0= RULE_STRING ) ) otherlv_6= 'title' ( (lv_title_7_0= RULE_STRING ) ) otherlv_8= 'x' ( (lv_xlabel_9_0= RULE_STRING ) ) otherlv_10= 'y' ( (lv_ylabel_11_0= RULE_STRING ) ) )
            {
            // InternalDeviceDefinition.g:269:2: (otherlv_0= 'Graph' ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'category' ( (lv_category_5_0= RULE_STRING ) ) otherlv_6= 'title' ( (lv_title_7_0= RULE_STRING ) ) otherlv_8= 'x' ( (lv_xlabel_9_0= RULE_STRING ) ) otherlv_10= 'y' ( (lv_ylabel_11_0= RULE_STRING ) ) )
            // InternalDeviceDefinition.g:270:3: otherlv_0= 'Graph' ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'category' ( (lv_category_5_0= RULE_STRING ) ) otherlv_6= 'title' ( (lv_title_7_0= RULE_STRING ) ) otherlv_8= 'x' ( (lv_xlabel_9_0= RULE_STRING ) ) otherlv_10= 'y' ( (lv_ylabel_11_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphAccess().getGraphKeyword_0());
            		
            // InternalDeviceDefinition.g:274:3: ( (lv_type_1_0= RULE_ID ) )
            // InternalDeviceDefinition.g:275:4: (lv_type_1_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:275:4: (lv_type_1_0= RULE_ID )
            // InternalDeviceDefinition.g:276:5: lv_type_1_0= RULE_ID
            {
            lv_type_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_type_1_0, grammarAccess.getGraphAccess().getTypeIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDeviceDefinition.g:292:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDeviceDefinition.g:293:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:293:4: (lv_name_2_0= RULE_ID )
            // InternalDeviceDefinition.g:294:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_2_0, grammarAccess.getGraphAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getGraphAccess().getColonKeyword_3());
            		
            otherlv_4=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getGraphAccess().getCategoryKeyword_4());
            		
            // InternalDeviceDefinition.g:318:3: ( (lv_category_5_0= RULE_STRING ) )
            // InternalDeviceDefinition.g:319:4: (lv_category_5_0= RULE_STRING )
            {
            // InternalDeviceDefinition.g:319:4: (lv_category_5_0= RULE_STRING )
            // InternalDeviceDefinition.g:320:5: lv_category_5_0= RULE_STRING
            {
            lv_category_5_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_category_5_0, grammarAccess.getGraphAccess().getCategorySTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphRule());
            					}
            					setWithLastConsumed(
            						current,
            						"category",
            						lv_category_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getGraphAccess().getTitleKeyword_6());
            		
            // InternalDeviceDefinition.g:340:3: ( (lv_title_7_0= RULE_STRING ) )
            // InternalDeviceDefinition.g:341:4: (lv_title_7_0= RULE_STRING )
            {
            // InternalDeviceDefinition.g:341:4: (lv_title_7_0= RULE_STRING )
            // InternalDeviceDefinition.g:342:5: lv_title_7_0= RULE_STRING
            {
            lv_title_7_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_title_7_0, grammarAccess.getGraphAccess().getTitleSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getGraphAccess().getXKeyword_8());
            		
            // InternalDeviceDefinition.g:362:3: ( (lv_xlabel_9_0= RULE_STRING ) )
            // InternalDeviceDefinition.g:363:4: (lv_xlabel_9_0= RULE_STRING )
            {
            // InternalDeviceDefinition.g:363:4: (lv_xlabel_9_0= RULE_STRING )
            // InternalDeviceDefinition.g:364:5: lv_xlabel_9_0= RULE_STRING
            {
            lv_xlabel_9_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_xlabel_9_0, grammarAccess.getGraphAccess().getXlabelSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphRule());
            					}
            					setWithLastConsumed(
            						current,
            						"xlabel",
            						lv_xlabel_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_10=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_10, grammarAccess.getGraphAccess().getYKeyword_10());
            		
            // InternalDeviceDefinition.g:384:3: ( (lv_ylabel_11_0= RULE_STRING ) )
            // InternalDeviceDefinition.g:385:4: (lv_ylabel_11_0= RULE_STRING )
            {
            // InternalDeviceDefinition.g:385:4: (lv_ylabel_11_0= RULE_STRING )
            // InternalDeviceDefinition.g:386:5: lv_ylabel_11_0= RULE_STRING
            {
            lv_ylabel_11_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_ylabel_11_0, grammarAccess.getGraphAccess().getYlabelSTRINGTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ylabel",
            						lv_ylabel_11_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleGraph"


    // $ANTLR start "entryRuleGateway"
    // InternalDeviceDefinition.g:406:1: entryRuleGateway returns [EObject current=null] : iv_ruleGateway= ruleGateway EOF ;
    public final EObject entryRuleGateway() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGateway = null;


        try {
            // InternalDeviceDefinition.g:406:48: (iv_ruleGateway= ruleGateway EOF )
            // InternalDeviceDefinition.g:407:2: iv_ruleGateway= ruleGateway EOF
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
    // InternalDeviceDefinition.g:413:1: ruleGateway returns [EObject current=null] : (otherlv_0= 'Gateway' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'mac' ( (lv_mac_4_0= RULE_MAC ) ) ( (lv_workers_5_0= ruleWorker ) )+ ) ;
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
            // InternalDeviceDefinition.g:419:2: ( (otherlv_0= 'Gateway' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'mac' ( (lv_mac_4_0= RULE_MAC ) ) ( (lv_workers_5_0= ruleWorker ) )+ ) )
            // InternalDeviceDefinition.g:420:2: (otherlv_0= 'Gateway' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'mac' ( (lv_mac_4_0= RULE_MAC ) ) ( (lv_workers_5_0= ruleWorker ) )+ )
            {
            // InternalDeviceDefinition.g:420:2: (otherlv_0= 'Gateway' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'mac' ( (lv_mac_4_0= RULE_MAC ) ) ( (lv_workers_5_0= ruleWorker ) )+ )
            // InternalDeviceDefinition.g:421:3: otherlv_0= 'Gateway' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'mac' ( (lv_mac_4_0= RULE_MAC ) ) ( (lv_workers_5_0= ruleWorker ) )+
            {
            otherlv_0=(Token)match(input,27,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getGatewayAccess().getGatewayKeyword_0());
            		
            // InternalDeviceDefinition.g:425:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDeviceDefinition.g:426:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:426:4: (lv_name_1_0= RULE_ID )
            // InternalDeviceDefinition.g:427:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getGatewayAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getGatewayAccess().getMacKeyword_3());
            		
            // InternalDeviceDefinition.g:451:3: ( (lv_mac_4_0= RULE_MAC ) )
            // InternalDeviceDefinition.g:452:4: (lv_mac_4_0= RULE_MAC )
            {
            // InternalDeviceDefinition.g:452:4: (lv_mac_4_0= RULE_MAC )
            // InternalDeviceDefinition.g:453:5: lv_mac_4_0= RULE_MAC
            {
            lv_mac_4_0=(Token)match(input,RULE_MAC,FOLLOW_20); 

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

            // InternalDeviceDefinition.g:469:3: ( (lv_workers_5_0= ruleWorker ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==29) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDeviceDefinition.g:470:4: (lv_workers_5_0= ruleWorker )
            	    {
            	    // InternalDeviceDefinition.g:470:4: (lv_workers_5_0= ruleWorker )
            	    // InternalDeviceDefinition.g:471:5: lv_workers_5_0= ruleWorker
            	    {

            	    					newCompositeNode(grammarAccess.getGatewayAccess().getWorkersWorkerParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_21);
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
    // $ANTLR end "ruleGateway"


    // $ANTLR start "entryRuleWorker"
    // InternalDeviceDefinition.g:492:1: entryRuleWorker returns [EObject current=null] : iv_ruleWorker= ruleWorker EOF ;
    public final EObject entryRuleWorker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorker = null;


        try {
            // InternalDeviceDefinition.g:492:47: (iv_ruleWorker= ruleWorker EOF )
            // InternalDeviceDefinition.g:493:2: iv_ruleWorker= ruleWorker EOF
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
    // InternalDeviceDefinition.g:499:1: ruleWorker returns [EObject current=null] : (otherlv_0= 'Worker' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'mac' ( (lv_mac_4_0= RULE_MAC ) ) ) (otherlv_5= 'sleep' otherlv_6= 'for' ( (lv_sleepTime_7_0= RULE_INT ) ) ( (lv_timeUnit_8_0= ruleTimeUnit ) ) )? ( (lv_devices_9_0= ruleDevice ) )* ) ;
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
            // InternalDeviceDefinition.g:505:2: ( (otherlv_0= 'Worker' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'mac' ( (lv_mac_4_0= RULE_MAC ) ) ) (otherlv_5= 'sleep' otherlv_6= 'for' ( (lv_sleepTime_7_0= RULE_INT ) ) ( (lv_timeUnit_8_0= ruleTimeUnit ) ) )? ( (lv_devices_9_0= ruleDevice ) )* ) )
            // InternalDeviceDefinition.g:506:2: (otherlv_0= 'Worker' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'mac' ( (lv_mac_4_0= RULE_MAC ) ) ) (otherlv_5= 'sleep' otherlv_6= 'for' ( (lv_sleepTime_7_0= RULE_INT ) ) ( (lv_timeUnit_8_0= ruleTimeUnit ) ) )? ( (lv_devices_9_0= ruleDevice ) )* )
            {
            // InternalDeviceDefinition.g:506:2: (otherlv_0= 'Worker' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'mac' ( (lv_mac_4_0= RULE_MAC ) ) ) (otherlv_5= 'sleep' otherlv_6= 'for' ( (lv_sleepTime_7_0= RULE_INT ) ) ( (lv_timeUnit_8_0= ruleTimeUnit ) ) )? ( (lv_devices_9_0= ruleDevice ) )* )
            // InternalDeviceDefinition.g:507:3: otherlv_0= 'Worker' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'mac' ( (lv_mac_4_0= RULE_MAC ) ) ) (otherlv_5= 'sleep' otherlv_6= 'for' ( (lv_sleepTime_7_0= RULE_INT ) ) ( (lv_timeUnit_8_0= ruleTimeUnit ) ) )? ( (lv_devices_9_0= ruleDevice ) )*
            {
            otherlv_0=(Token)match(input,29,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkerAccess().getWorkerKeyword_0());
            		
            // InternalDeviceDefinition.g:511:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDeviceDefinition.g:512:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:512:4: (lv_name_1_0= RULE_ID )
            // InternalDeviceDefinition.g:513:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkerAccess().getColonKeyword_2());
            		
            // InternalDeviceDefinition.g:533:3: (otherlv_3= 'mac' ( (lv_mac_4_0= RULE_MAC ) ) )
            // InternalDeviceDefinition.g:534:4: otherlv_3= 'mac' ( (lv_mac_4_0= RULE_MAC ) )
            {
            otherlv_3=(Token)match(input,28,FOLLOW_19); 

            				newLeafNode(otherlv_3, grammarAccess.getWorkerAccess().getMacKeyword_3_0());
            			
            // InternalDeviceDefinition.g:538:4: ( (lv_mac_4_0= RULE_MAC ) )
            // InternalDeviceDefinition.g:539:5: (lv_mac_4_0= RULE_MAC )
            {
            // InternalDeviceDefinition.g:539:5: (lv_mac_4_0= RULE_MAC )
            // InternalDeviceDefinition.g:540:6: lv_mac_4_0= RULE_MAC
            {
            lv_mac_4_0=(Token)match(input,RULE_MAC,FOLLOW_22); 

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

            // InternalDeviceDefinition.g:557:3: (otherlv_5= 'sleep' otherlv_6= 'for' ( (lv_sleepTime_7_0= RULE_INT ) ) ( (lv_timeUnit_8_0= ruleTimeUnit ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==30) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDeviceDefinition.g:558:4: otherlv_5= 'sleep' otherlv_6= 'for' ( (lv_sleepTime_7_0= RULE_INT ) ) ( (lv_timeUnit_8_0= ruleTimeUnit ) )
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_23); 

                    				newLeafNode(otherlv_5, grammarAccess.getWorkerAccess().getSleepKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,31,FOLLOW_24); 

                    				newLeafNode(otherlv_6, grammarAccess.getWorkerAccess().getForKeyword_4_1());
                    			
                    // InternalDeviceDefinition.g:566:4: ( (lv_sleepTime_7_0= RULE_INT ) )
                    // InternalDeviceDefinition.g:567:5: (lv_sleepTime_7_0= RULE_INT )
                    {
                    // InternalDeviceDefinition.g:567:5: (lv_sleepTime_7_0= RULE_INT )
                    // InternalDeviceDefinition.g:568:6: lv_sleepTime_7_0= RULE_INT
                    {
                    lv_sleepTime_7_0=(Token)match(input,RULE_INT,FOLLOW_25); 

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

                    // InternalDeviceDefinition.g:584:4: ( (lv_timeUnit_8_0= ruleTimeUnit ) )
                    // InternalDeviceDefinition.g:585:5: (lv_timeUnit_8_0= ruleTimeUnit )
                    {
                    // InternalDeviceDefinition.g:585:5: (lv_timeUnit_8_0= ruleTimeUnit )
                    // InternalDeviceDefinition.g:586:6: lv_timeUnit_8_0= ruleTimeUnit
                    {

                    						newCompositeNode(grammarAccess.getWorkerAccess().getTimeUnitTimeUnitParserRuleCall_4_3_0());
                    					
                    pushFollow(FOLLOW_26);
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

            // InternalDeviceDefinition.g:604:3: ( (lv_devices_9_0= ruleDevice ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==32||LA6_0==50) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDeviceDefinition.g:605:4: (lv_devices_9_0= ruleDevice )
            	    {
            	    // InternalDeviceDefinition.g:605:4: (lv_devices_9_0= ruleDevice )
            	    // InternalDeviceDefinition.g:606:5: lv_devices_9_0= ruleDevice
            	    {

            	    					newCompositeNode(grammarAccess.getWorkerAccess().getDevicesDeviceParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_26);
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
            	    break loop6;
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
    // InternalDeviceDefinition.g:627:1: entryRuleDevice returns [EObject current=null] : iv_ruleDevice= ruleDevice EOF ;
    public final EObject entryRuleDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevice = null;


        try {
            // InternalDeviceDefinition.g:627:47: (iv_ruleDevice= ruleDevice EOF )
            // InternalDeviceDefinition.g:628:2: iv_ruleDevice= ruleDevice EOF
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
    // InternalDeviceDefinition.g:634:1: ruleDevice returns [EObject current=null] : (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) ;
    public final EObject ruleDevice() throws RecognitionException {
        EObject current = null;

        EObject this_Sensor_0 = null;

        EObject this_Actuator_1 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:640:2: ( (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) )
            // InternalDeviceDefinition.g:641:2: (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator )
            {
            // InternalDeviceDefinition.g:641:2: (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==32) ) {
                alt7=1;
            }
            else if ( (LA7_0==50) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDeviceDefinition.g:642:3: this_Sensor_0= ruleSensor
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
                    // InternalDeviceDefinition.g:651:3: this_Actuator_1= ruleActuator
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
    // InternalDeviceDefinition.g:663:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalDeviceDefinition.g:663:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalDeviceDefinition.g:664:2: iv_ruleSensor= ruleSensor EOF
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
    // InternalDeviceDefinition.g:670:1: ruleSensor returns [EObject current=null] : (otherlv_0= 'Sensor' ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= 'pins' ( (lv_pins_5_0= rulePin ) )* (otherlv_6= ',' ( (lv_pins_7_0= rulePin ) ) )* )? ( (lv_outputs_8_0= ruleSensorOutput ) )* ( (lv_settings_9_0= ruleSetting ) )* (otherlv_10= 'sample' otherlv_11= 'if' ( (lv_predicate_12_0= ruleExp ) ) )? (otherlv_13= 'graph' ( (otherlv_14= RULE_ID ) ) )? ) ;
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
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_pins_5_0 = null;

        EObject lv_pins_7_0 = null;

        EObject lv_outputs_8_0 = null;

        EObject lv_settings_9_0 = null;

        EObject lv_predicate_12_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:676:2: ( (otherlv_0= 'Sensor' ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= 'pins' ( (lv_pins_5_0= rulePin ) )* (otherlv_6= ',' ( (lv_pins_7_0= rulePin ) ) )* )? ( (lv_outputs_8_0= ruleSensorOutput ) )* ( (lv_settings_9_0= ruleSetting ) )* (otherlv_10= 'sample' otherlv_11= 'if' ( (lv_predicate_12_0= ruleExp ) ) )? (otherlv_13= 'graph' ( (otherlv_14= RULE_ID ) ) )? ) )
            // InternalDeviceDefinition.g:677:2: (otherlv_0= 'Sensor' ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= 'pins' ( (lv_pins_5_0= rulePin ) )* (otherlv_6= ',' ( (lv_pins_7_0= rulePin ) ) )* )? ( (lv_outputs_8_0= ruleSensorOutput ) )* ( (lv_settings_9_0= ruleSetting ) )* (otherlv_10= 'sample' otherlv_11= 'if' ( (lv_predicate_12_0= ruleExp ) ) )? (otherlv_13= 'graph' ( (otherlv_14= RULE_ID ) ) )? )
            {
            // InternalDeviceDefinition.g:677:2: (otherlv_0= 'Sensor' ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= 'pins' ( (lv_pins_5_0= rulePin ) )* (otherlv_6= ',' ( (lv_pins_7_0= rulePin ) ) )* )? ( (lv_outputs_8_0= ruleSensorOutput ) )* ( (lv_settings_9_0= ruleSetting ) )* (otherlv_10= 'sample' otherlv_11= 'if' ( (lv_predicate_12_0= ruleExp ) ) )? (otherlv_13= 'graph' ( (otherlv_14= RULE_ID ) ) )? )
            // InternalDeviceDefinition.g:678:3: otherlv_0= 'Sensor' ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' (otherlv_4= 'pins' ( (lv_pins_5_0= rulePin ) )* (otherlv_6= ',' ( (lv_pins_7_0= rulePin ) ) )* )? ( (lv_outputs_8_0= ruleSensorOutput ) )* ( (lv_settings_9_0= ruleSetting ) )* (otherlv_10= 'sample' otherlv_11= 'if' ( (lv_predicate_12_0= ruleExp ) ) )? (otherlv_13= 'graph' ( (otherlv_14= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorAccess().getSensorKeyword_0());
            		
            // InternalDeviceDefinition.g:682:3: ( (lv_type_1_0= RULE_ID ) )
            // InternalDeviceDefinition.g:683:4: (lv_type_1_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:683:4: (lv_type_1_0= RULE_ID )
            // InternalDeviceDefinition.g:684:5: lv_type_1_0= RULE_ID
            {
            lv_type_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            // InternalDeviceDefinition.g:700:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDeviceDefinition.g:701:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:701:4: (lv_name_2_0= RULE_ID )
            // InternalDeviceDefinition.g:702:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,15,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getSensorAccess().getColonKeyword_3());
            		
            // InternalDeviceDefinition.g:722:3: (otherlv_4= 'pins' ( (lv_pins_5_0= rulePin ) )* (otherlv_6= ',' ( (lv_pins_7_0= rulePin ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==33) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDeviceDefinition.g:723:4: otherlv_4= 'pins' ( (lv_pins_5_0= rulePin ) )* (otherlv_6= ',' ( (lv_pins_7_0= rulePin ) ) )*
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_28); 

                    				newLeafNode(otherlv_4, grammarAccess.getSensorAccess().getPinsKeyword_4_0());
                    			
                    // InternalDeviceDefinition.g:727:4: ( (lv_pins_5_0= rulePin ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==41) ) {
                            int LA8_2 = input.LA(2);

                            if ( (LA8_2==RULE_INT) ) {
                                alt8=1;
                            }


                        }
                        else if ( ((LA8_0>=38 && LA8_0<=40)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalDeviceDefinition.g:728:5: (lv_pins_5_0= rulePin )
                    	    {
                    	    // InternalDeviceDefinition.g:728:5: (lv_pins_5_0= rulePin )
                    	    // InternalDeviceDefinition.g:729:6: lv_pins_5_0= rulePin
                    	    {

                    	    						newCompositeNode(grammarAccess.getSensorAccess().getPinsPinParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_28);
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
                    	    break loop8;
                        }
                    } while (true);

                    // InternalDeviceDefinition.g:746:4: (otherlv_6= ',' ( (lv_pins_7_0= rulePin ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==34) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalDeviceDefinition.g:747:5: otherlv_6= ',' ( (lv_pins_7_0= rulePin ) )
                    	    {
                    	    otherlv_6=(Token)match(input,34,FOLLOW_29); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getSensorAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalDeviceDefinition.g:751:5: ( (lv_pins_7_0= rulePin ) )
                    	    // InternalDeviceDefinition.g:752:6: (lv_pins_7_0= rulePin )
                    	    {
                    	    // InternalDeviceDefinition.g:752:6: (lv_pins_7_0= rulePin )
                    	    // InternalDeviceDefinition.g:753:7: lv_pins_7_0= rulePin
                    	    {

                    	    							newCompositeNode(grammarAccess.getSensorAccess().getPinsPinParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_30);
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
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalDeviceDefinition.g:772:3: ( (lv_outputs_8_0= ruleSensorOutput ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==41) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDeviceDefinition.g:773:4: (lv_outputs_8_0= ruleSensorOutput )
            	    {
            	    // InternalDeviceDefinition.g:773:4: (lv_outputs_8_0= ruleSensorOutput )
            	    // InternalDeviceDefinition.g:774:5: lv_outputs_8_0= ruleSensorOutput
            	    {

            	    					newCompositeNode(grammarAccess.getSensorAccess().getOutputsSensorOutputParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_31);
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
            	    break loop11;
                }
            } while (true);

            // InternalDeviceDefinition.g:791:3: ( (lv_settings_9_0= ruleSetting ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==55) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDeviceDefinition.g:792:4: (lv_settings_9_0= ruleSetting )
            	    {
            	    // InternalDeviceDefinition.g:792:4: (lv_settings_9_0= ruleSetting )
            	    // InternalDeviceDefinition.g:793:5: lv_settings_9_0= ruleSetting
            	    {

            	    					newCompositeNode(grammarAccess.getSensorAccess().getSettingsSettingParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_32);
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
            	    break loop12;
                }
            } while (true);

            // InternalDeviceDefinition.g:810:3: (otherlv_10= 'sample' otherlv_11= 'if' ( (lv_predicate_12_0= ruleExp ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==35) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDeviceDefinition.g:811:4: otherlv_10= 'sample' otherlv_11= 'if' ( (lv_predicate_12_0= ruleExp ) )
                    {
                    otherlv_10=(Token)match(input,35,FOLLOW_33); 

                    				newLeafNode(otherlv_10, grammarAccess.getSensorAccess().getSampleKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,36,FOLLOW_34); 

                    				newLeafNode(otherlv_11, grammarAccess.getSensorAccess().getIfKeyword_7_1());
                    			
                    // InternalDeviceDefinition.g:819:4: ( (lv_predicate_12_0= ruleExp ) )
                    // InternalDeviceDefinition.g:820:5: (lv_predicate_12_0= ruleExp )
                    {
                    // InternalDeviceDefinition.g:820:5: (lv_predicate_12_0= ruleExp )
                    // InternalDeviceDefinition.g:821:6: lv_predicate_12_0= ruleExp
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getPredicateExpParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_35);
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

            // InternalDeviceDefinition.g:839:3: (otherlv_13= 'graph' ( (otherlv_14= RULE_ID ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==37) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDeviceDefinition.g:840:4: otherlv_13= 'graph' ( (otherlv_14= RULE_ID ) )
                    {
                    otherlv_13=(Token)match(input,37,FOLLOW_13); 

                    				newLeafNode(otherlv_13, grammarAccess.getSensorAccess().getGraphKeyword_8_0());
                    			
                    // InternalDeviceDefinition.g:844:4: ( (otherlv_14= RULE_ID ) )
                    // InternalDeviceDefinition.g:845:5: (otherlv_14= RULE_ID )
                    {
                    // InternalDeviceDefinition.g:845:5: (otherlv_14= RULE_ID )
                    // InternalDeviceDefinition.g:846:6: otherlv_14= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSensorRule());
                    						}
                    					
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_14, grammarAccess.getSensorAccess().getGraphGraphCrossReference_8_1_0());
                    					

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
    // InternalDeviceDefinition.g:862:1: entryRulePin returns [EObject current=null] : iv_rulePin= rulePin EOF ;
    public final EObject entryRulePin() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePin = null;


        try {
            // InternalDeviceDefinition.g:862:44: (iv_rulePin= rulePin EOF )
            // InternalDeviceDefinition.g:863:2: iv_rulePin= rulePin EOF
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
    // InternalDeviceDefinition.g:869:1: rulePin returns [EObject current=null] : ( ( (lv_type_0_0= rulePinType ) ) ( (lv_number_1_0= RULE_INT ) ) ) ;
    public final EObject rulePin() throws RecognitionException {
        EObject current = null;

        Token lv_number_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:875:2: ( ( ( (lv_type_0_0= rulePinType ) ) ( (lv_number_1_0= RULE_INT ) ) ) )
            // InternalDeviceDefinition.g:876:2: ( ( (lv_type_0_0= rulePinType ) ) ( (lv_number_1_0= RULE_INT ) ) )
            {
            // InternalDeviceDefinition.g:876:2: ( ( (lv_type_0_0= rulePinType ) ) ( (lv_number_1_0= RULE_INT ) ) )
            // InternalDeviceDefinition.g:877:3: ( (lv_type_0_0= rulePinType ) ) ( (lv_number_1_0= RULE_INT ) )
            {
            // InternalDeviceDefinition.g:877:3: ( (lv_type_0_0= rulePinType ) )
            // InternalDeviceDefinition.g:878:4: (lv_type_0_0= rulePinType )
            {
            // InternalDeviceDefinition.g:878:4: (lv_type_0_0= rulePinType )
            // InternalDeviceDefinition.g:879:5: lv_type_0_0= rulePinType
            {

            					newCompositeNode(grammarAccess.getPinAccess().getTypePinTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalDeviceDefinition.g:896:3: ( (lv_number_1_0= RULE_INT ) )
            // InternalDeviceDefinition.g:897:4: (lv_number_1_0= RULE_INT )
            {
            // InternalDeviceDefinition.g:897:4: (lv_number_1_0= RULE_INT )
            // InternalDeviceDefinition.g:898:5: lv_number_1_0= RULE_INT
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
    // InternalDeviceDefinition.g:918:1: entryRulePinType returns [EObject current=null] : iv_rulePinType= rulePinType EOF ;
    public final EObject entryRulePinType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePinType = null;


        try {
            // InternalDeviceDefinition.g:918:48: (iv_rulePinType= rulePinType EOF )
            // InternalDeviceDefinition.g:919:2: iv_rulePinType= rulePinType EOF
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
    // InternalDeviceDefinition.g:925:1: rulePinType returns [EObject current=null] : ( ( () otherlv_1= 'adc' ) | ( () otherlv_3= 'dac' ) | ( () otherlv_5= 'in' ) | ( () otherlv_7= 'out' ) ) ;
    public final EObject rulePinType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalDeviceDefinition.g:931:2: ( ( ( () otherlv_1= 'adc' ) | ( () otherlv_3= 'dac' ) | ( () otherlv_5= 'in' ) | ( () otherlv_7= 'out' ) ) )
            // InternalDeviceDefinition.g:932:2: ( ( () otherlv_1= 'adc' ) | ( () otherlv_3= 'dac' ) | ( () otherlv_5= 'in' ) | ( () otherlv_7= 'out' ) )
            {
            // InternalDeviceDefinition.g:932:2: ( ( () otherlv_1= 'adc' ) | ( () otherlv_3= 'dac' ) | ( () otherlv_5= 'in' ) | ( () otherlv_7= 'out' ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt15=1;
                }
                break;
            case 39:
                {
                alt15=2;
                }
                break;
            case 40:
                {
                alt15=3;
                }
                break;
            case 41:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalDeviceDefinition.g:933:3: ( () otherlv_1= 'adc' )
                    {
                    // InternalDeviceDefinition.g:933:3: ( () otherlv_1= 'adc' )
                    // InternalDeviceDefinition.g:934:4: () otherlv_1= 'adc'
                    {
                    // InternalDeviceDefinition.g:934:4: ()
                    // InternalDeviceDefinition.g:935:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPinTypeAccess().getADCAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getPinTypeAccess().getAdcKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDeviceDefinition.g:947:3: ( () otherlv_3= 'dac' )
                    {
                    // InternalDeviceDefinition.g:947:3: ( () otherlv_3= 'dac' )
                    // InternalDeviceDefinition.g:948:4: () otherlv_3= 'dac'
                    {
                    // InternalDeviceDefinition.g:948:4: ()
                    // InternalDeviceDefinition.g:949:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPinTypeAccess().getDACAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,39,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getPinTypeAccess().getDacKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDeviceDefinition.g:961:3: ( () otherlv_5= 'in' )
                    {
                    // InternalDeviceDefinition.g:961:3: ( () otherlv_5= 'in' )
                    // InternalDeviceDefinition.g:962:4: () otherlv_5= 'in'
                    {
                    // InternalDeviceDefinition.g:962:4: ()
                    // InternalDeviceDefinition.g:963:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPinTypeAccess().getGenericInAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,40,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getPinTypeAccess().getInKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDeviceDefinition.g:975:3: ( () otherlv_7= 'out' )
                    {
                    // InternalDeviceDefinition.g:975:3: ( () otherlv_7= 'out' )
                    // InternalDeviceDefinition.g:976:4: () otherlv_7= 'out'
                    {
                    // InternalDeviceDefinition.g:976:4: ()
                    // InternalDeviceDefinition.g:977:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPinTypeAccess().getGenericOutAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,41,FOLLOW_2); 

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
    // InternalDeviceDefinition.g:992:1: entryRuleTimeUnit returns [EObject current=null] : iv_ruleTimeUnit= ruleTimeUnit EOF ;
    public final EObject entryRuleTimeUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeUnit = null;


        try {
            // InternalDeviceDefinition.g:992:49: (iv_ruleTimeUnit= ruleTimeUnit EOF )
            // InternalDeviceDefinition.g:993:2: iv_ruleTimeUnit= ruleTimeUnit EOF
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
    // InternalDeviceDefinition.g:999:1: ruleTimeUnit returns [EObject current=null] : ( ( () (otherlv_1= 'second' | otherlv_2= 'seconds' ) ) | ( () (otherlv_4= 'minute' | otherlv_5= 'minutes' ) ) | ( () (otherlv_7= 'hour' | otherlv_8= 'hours' ) ) ) ;
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
            // InternalDeviceDefinition.g:1005:2: ( ( ( () (otherlv_1= 'second' | otherlv_2= 'seconds' ) ) | ( () (otherlv_4= 'minute' | otherlv_5= 'minutes' ) ) | ( () (otherlv_7= 'hour' | otherlv_8= 'hours' ) ) ) )
            // InternalDeviceDefinition.g:1006:2: ( ( () (otherlv_1= 'second' | otherlv_2= 'seconds' ) ) | ( () (otherlv_4= 'minute' | otherlv_5= 'minutes' ) ) | ( () (otherlv_7= 'hour' | otherlv_8= 'hours' ) ) )
            {
            // InternalDeviceDefinition.g:1006:2: ( ( () (otherlv_1= 'second' | otherlv_2= 'seconds' ) ) | ( () (otherlv_4= 'minute' | otherlv_5= 'minutes' ) ) | ( () (otherlv_7= 'hour' | otherlv_8= 'hours' ) ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 42:
            case 43:
                {
                alt19=1;
                }
                break;
            case 44:
            case 45:
                {
                alt19=2;
                }
                break;
            case 46:
            case 47:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalDeviceDefinition.g:1007:3: ( () (otherlv_1= 'second' | otherlv_2= 'seconds' ) )
                    {
                    // InternalDeviceDefinition.g:1007:3: ( () (otherlv_1= 'second' | otherlv_2= 'seconds' ) )
                    // InternalDeviceDefinition.g:1008:4: () (otherlv_1= 'second' | otherlv_2= 'seconds' )
                    {
                    // InternalDeviceDefinition.g:1008:4: ()
                    // InternalDeviceDefinition.g:1009:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTimeUnitAccess().getSecondAction_0_0(),
                    						current);
                    				

                    }

                    // InternalDeviceDefinition.g:1015:4: (otherlv_1= 'second' | otherlv_2= 'seconds' )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==42) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==43) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalDeviceDefinition.g:1016:5: otherlv_1= 'second'
                            {
                            otherlv_1=(Token)match(input,42,FOLLOW_2); 

                            					newLeafNode(otherlv_1, grammarAccess.getTimeUnitAccess().getSecondKeyword_0_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDeviceDefinition.g:1021:5: otherlv_2= 'seconds'
                            {
                            otherlv_2=(Token)match(input,43,FOLLOW_2); 

                            					newLeafNode(otherlv_2, grammarAccess.getTimeUnitAccess().getSecondsKeyword_0_1_1());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDeviceDefinition.g:1028:3: ( () (otherlv_4= 'minute' | otherlv_5= 'minutes' ) )
                    {
                    // InternalDeviceDefinition.g:1028:3: ( () (otherlv_4= 'minute' | otherlv_5= 'minutes' ) )
                    // InternalDeviceDefinition.g:1029:4: () (otherlv_4= 'minute' | otherlv_5= 'minutes' )
                    {
                    // InternalDeviceDefinition.g:1029:4: ()
                    // InternalDeviceDefinition.g:1030:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTimeUnitAccess().getMinuteAction_1_0(),
                    						current);
                    				

                    }

                    // InternalDeviceDefinition.g:1036:4: (otherlv_4= 'minute' | otherlv_5= 'minutes' )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==44) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==45) ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalDeviceDefinition.g:1037:5: otherlv_4= 'minute'
                            {
                            otherlv_4=(Token)match(input,44,FOLLOW_2); 

                            					newLeafNode(otherlv_4, grammarAccess.getTimeUnitAccess().getMinuteKeyword_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDeviceDefinition.g:1042:5: otherlv_5= 'minutes'
                            {
                            otherlv_5=(Token)match(input,45,FOLLOW_2); 

                            					newLeafNode(otherlv_5, grammarAccess.getTimeUnitAccess().getMinutesKeyword_1_1_1());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDeviceDefinition.g:1049:3: ( () (otherlv_7= 'hour' | otherlv_8= 'hours' ) )
                    {
                    // InternalDeviceDefinition.g:1049:3: ( () (otherlv_7= 'hour' | otherlv_8= 'hours' ) )
                    // InternalDeviceDefinition.g:1050:4: () (otherlv_7= 'hour' | otherlv_8= 'hours' )
                    {
                    // InternalDeviceDefinition.g:1050:4: ()
                    // InternalDeviceDefinition.g:1051:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTimeUnitAccess().getHourAction_2_0(),
                    						current);
                    				

                    }

                    // InternalDeviceDefinition.g:1057:4: (otherlv_7= 'hour' | otherlv_8= 'hours' )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==46) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==47) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalDeviceDefinition.g:1058:5: otherlv_7= 'hour'
                            {
                            otherlv_7=(Token)match(input,46,FOLLOW_2); 

                            					newLeafNode(otherlv_7, grammarAccess.getTimeUnitAccess().getHourKeyword_2_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDeviceDefinition.g:1063:5: otherlv_8= 'hours'
                            {
                            otherlv_8=(Token)match(input,47,FOLLOW_2); 

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
    // InternalDeviceDefinition.g:1073:1: entryRuleSensorOutput returns [EObject current=null] : iv_ruleSensorOutput= ruleSensorOutput EOF ;
    public final EObject entryRuleSensorOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorOutput = null;


        try {
            // InternalDeviceDefinition.g:1073:53: (iv_ruleSensorOutput= ruleSensorOutput EOF )
            // InternalDeviceDefinition.g:1074:2: iv_ruleSensorOutput= ruleSensorOutput EOF
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
    // InternalDeviceDefinition.g:1080:1: ruleSensorOutput returns [EObject current=null] : (otherlv_0= 'out' ( (lv_output_1_0= RULE_STRING ) )? otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'with' otherlv_5= 'mapping' ( (lv_mapping_6_0= ruleExp ) ) )? ) ;
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
            // InternalDeviceDefinition.g:1086:2: ( (otherlv_0= 'out' ( (lv_output_1_0= RULE_STRING ) )? otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'with' otherlv_5= 'mapping' ( (lv_mapping_6_0= ruleExp ) ) )? ) )
            // InternalDeviceDefinition.g:1087:2: (otherlv_0= 'out' ( (lv_output_1_0= RULE_STRING ) )? otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'with' otherlv_5= 'mapping' ( (lv_mapping_6_0= ruleExp ) ) )? )
            {
            // InternalDeviceDefinition.g:1087:2: (otherlv_0= 'out' ( (lv_output_1_0= RULE_STRING ) )? otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'with' otherlv_5= 'mapping' ( (lv_mapping_6_0= ruleExp ) ) )? )
            // InternalDeviceDefinition.g:1088:3: otherlv_0= 'out' ( (lv_output_1_0= RULE_STRING ) )? otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'with' otherlv_5= 'mapping' ( (lv_mapping_6_0= ruleExp ) ) )?
            {
            otherlv_0=(Token)match(input,41,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorOutputAccess().getOutKeyword_0());
            		
            // InternalDeviceDefinition.g:1092:3: ( (lv_output_1_0= RULE_STRING ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDeviceDefinition.g:1093:4: (lv_output_1_0= RULE_STRING )
                    {
                    // InternalDeviceDefinition.g:1093:4: (lv_output_1_0= RULE_STRING )
                    // InternalDeviceDefinition.g:1094:5: lv_output_1_0= RULE_STRING
                    {
                    lv_output_1_0=(Token)match(input,RULE_STRING,FOLLOW_37); 

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

            otherlv_2=(Token)match(input,48,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getSensorOutputAccess().getAsKeyword_2());
            		
            // InternalDeviceDefinition.g:1114:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalDeviceDefinition.g:1115:4: (lv_name_3_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:1115:4: (lv_name_3_0= RULE_ID )
            // InternalDeviceDefinition.g:1116:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_38); 

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

            // InternalDeviceDefinition.g:1132:3: (otherlv_4= 'with' otherlv_5= 'mapping' ( (lv_mapping_6_0= ruleExp ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==17) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDeviceDefinition.g:1133:4: otherlv_4= 'with' otherlv_5= 'mapping' ( (lv_mapping_6_0= ruleExp ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_39); 

                    				newLeafNode(otherlv_4, grammarAccess.getSensorOutputAccess().getWithKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,49,FOLLOW_34); 

                    				newLeafNode(otherlv_5, grammarAccess.getSensorOutputAccess().getMappingKeyword_4_1());
                    			
                    // InternalDeviceDefinition.g:1141:4: ( (lv_mapping_6_0= ruleExp ) )
                    // InternalDeviceDefinition.g:1142:5: (lv_mapping_6_0= ruleExp )
                    {
                    // InternalDeviceDefinition.g:1142:5: (lv_mapping_6_0= ruleExp )
                    // InternalDeviceDefinition.g:1143:6: lv_mapping_6_0= ruleExp
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
    // InternalDeviceDefinition.g:1165:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // InternalDeviceDefinition.g:1165:49: (iv_ruleActuator= ruleActuator EOF )
            // InternalDeviceDefinition.g:1166:2: iv_ruleActuator= ruleActuator EOF
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
    // InternalDeviceDefinition.g:1172:1: ruleActuator returns [EObject current=null] : (otherlv_0= 'Actuator' ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'pins' ( (lv_pins_5_0= rulePin ) )* (otherlv_6= ',' ( (lv_pins_7_0= rulePin ) ) )* ( (lv_settings_8_0= ruleSetting ) )* ( (lv_trigger_9_0= ruleTrigger ) ) ) ;
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
            // InternalDeviceDefinition.g:1178:2: ( (otherlv_0= 'Actuator' ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'pins' ( (lv_pins_5_0= rulePin ) )* (otherlv_6= ',' ( (lv_pins_7_0= rulePin ) ) )* ( (lv_settings_8_0= ruleSetting ) )* ( (lv_trigger_9_0= ruleTrigger ) ) ) )
            // InternalDeviceDefinition.g:1179:2: (otherlv_0= 'Actuator' ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'pins' ( (lv_pins_5_0= rulePin ) )* (otherlv_6= ',' ( (lv_pins_7_0= rulePin ) ) )* ( (lv_settings_8_0= ruleSetting ) )* ( (lv_trigger_9_0= ruleTrigger ) ) )
            {
            // InternalDeviceDefinition.g:1179:2: (otherlv_0= 'Actuator' ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'pins' ( (lv_pins_5_0= rulePin ) )* (otherlv_6= ',' ( (lv_pins_7_0= rulePin ) ) )* ( (lv_settings_8_0= ruleSetting ) )* ( (lv_trigger_9_0= ruleTrigger ) ) )
            // InternalDeviceDefinition.g:1180:3: otherlv_0= 'Actuator' ( (lv_type_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'pins' ( (lv_pins_5_0= rulePin ) )* (otherlv_6= ',' ( (lv_pins_7_0= rulePin ) ) )* ( (lv_settings_8_0= ruleSetting ) )* ( (lv_trigger_9_0= ruleTrigger ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getActuatorAccess().getActuatorKeyword_0());
            		
            // InternalDeviceDefinition.g:1184:3: ( (lv_type_1_0= RULE_ID ) )
            // InternalDeviceDefinition.g:1185:4: (lv_type_1_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:1185:4: (lv_type_1_0= RULE_ID )
            // InternalDeviceDefinition.g:1186:5: lv_type_1_0= RULE_ID
            {
            lv_type_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            // InternalDeviceDefinition.g:1202:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDeviceDefinition.g:1203:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:1203:4: (lv_name_2_0= RULE_ID )
            // InternalDeviceDefinition.g:1204:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,15,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getActuatorAccess().getColonKeyword_3());
            		
            otherlv_4=(Token)match(input,33,FOLLOW_41); 

            			newLeafNode(otherlv_4, grammarAccess.getActuatorAccess().getPinsKeyword_4());
            		
            // InternalDeviceDefinition.g:1228:3: ( (lv_pins_5_0= rulePin ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=38 && LA22_0<=41)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalDeviceDefinition.g:1229:4: (lv_pins_5_0= rulePin )
            	    {
            	    // InternalDeviceDefinition.g:1229:4: (lv_pins_5_0= rulePin )
            	    // InternalDeviceDefinition.g:1230:5: lv_pins_5_0= rulePin
            	    {

            	    					newCompositeNode(grammarAccess.getActuatorAccess().getPinsPinParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_41);
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
            	    break loop22;
                }
            } while (true);

            // InternalDeviceDefinition.g:1247:3: (otherlv_6= ',' ( (lv_pins_7_0= rulePin ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==34) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalDeviceDefinition.g:1248:4: otherlv_6= ',' ( (lv_pins_7_0= rulePin ) )
            	    {
            	    otherlv_6=(Token)match(input,34,FOLLOW_29); 

            	    				newLeafNode(otherlv_6, grammarAccess.getActuatorAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalDeviceDefinition.g:1252:4: ( (lv_pins_7_0= rulePin ) )
            	    // InternalDeviceDefinition.g:1253:5: (lv_pins_7_0= rulePin )
            	    {
            	    // InternalDeviceDefinition.g:1253:5: (lv_pins_7_0= rulePin )
            	    // InternalDeviceDefinition.g:1254:6: lv_pins_7_0= rulePin
            	    {

            	    						newCompositeNode(grammarAccess.getActuatorAccess().getPinsPinParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_41);
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
            	    break loop23;
                }
            } while (true);

            // InternalDeviceDefinition.g:1272:3: ( (lv_settings_8_0= ruleSetting ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==55) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalDeviceDefinition.g:1273:4: (lv_settings_8_0= ruleSetting )
            	    {
            	    // InternalDeviceDefinition.g:1273:4: (lv_settings_8_0= ruleSetting )
            	    // InternalDeviceDefinition.g:1274:5: lv_settings_8_0= ruleSetting
            	    {

            	    					newCompositeNode(grammarAccess.getActuatorAccess().getSettingsSettingParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_41);
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
            	    break loop24;
                }
            } while (true);

            // InternalDeviceDefinition.g:1291:3: ( (lv_trigger_9_0= ruleTrigger ) )
            // InternalDeviceDefinition.g:1292:4: (lv_trigger_9_0= ruleTrigger )
            {
            // InternalDeviceDefinition.g:1292:4: (lv_trigger_9_0= ruleTrigger )
            // InternalDeviceDefinition.g:1293:5: lv_trigger_9_0= ruleTrigger
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
    // InternalDeviceDefinition.g:1314:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
    public final EObject entryRuleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigger = null;


        try {
            // InternalDeviceDefinition.g:1314:48: (iv_ruleTrigger= ruleTrigger EOF )
            // InternalDeviceDefinition.g:1315:2: iv_ruleTrigger= ruleTrigger EOF
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
    // InternalDeviceDefinition.g:1321:1: ruleTrigger returns [EObject current=null] : ( ( () otherlv_1= 'when' ( (lv_exp_2_0= ruleExp ) ) ) | ( () otherlv_4= 'on' ( (lv_onExp_5_0= ruleExp ) ) ( (otherlv_6= 'off' ( (lv_offExp_7_0= ruleExp ) ) ) | (otherlv_8= 'run' otherlv_9= 'for' ( (lv_time_10_0= RULE_INT ) ) ( (lv_unit_11_0= ruleTimeUnit ) ) ) ) ) ) ;
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
            // InternalDeviceDefinition.g:1327:2: ( ( ( () otherlv_1= 'when' ( (lv_exp_2_0= ruleExp ) ) ) | ( () otherlv_4= 'on' ( (lv_onExp_5_0= ruleExp ) ) ( (otherlv_6= 'off' ( (lv_offExp_7_0= ruleExp ) ) ) | (otherlv_8= 'run' otherlv_9= 'for' ( (lv_time_10_0= RULE_INT ) ) ( (lv_unit_11_0= ruleTimeUnit ) ) ) ) ) ) )
            // InternalDeviceDefinition.g:1328:2: ( ( () otherlv_1= 'when' ( (lv_exp_2_0= ruleExp ) ) ) | ( () otherlv_4= 'on' ( (lv_onExp_5_0= ruleExp ) ) ( (otherlv_6= 'off' ( (lv_offExp_7_0= ruleExp ) ) ) | (otherlv_8= 'run' otherlv_9= 'for' ( (lv_time_10_0= RULE_INT ) ) ( (lv_unit_11_0= ruleTimeUnit ) ) ) ) ) )
            {
            // InternalDeviceDefinition.g:1328:2: ( ( () otherlv_1= 'when' ( (lv_exp_2_0= ruleExp ) ) ) | ( () otherlv_4= 'on' ( (lv_onExp_5_0= ruleExp ) ) ( (otherlv_6= 'off' ( (lv_offExp_7_0= ruleExp ) ) ) | (otherlv_8= 'run' otherlv_9= 'for' ( (lv_time_10_0= RULE_INT ) ) ( (lv_unit_11_0= ruleTimeUnit ) ) ) ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==51) ) {
                alt26=1;
            }
            else if ( (LA26_0==52) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalDeviceDefinition.g:1329:3: ( () otherlv_1= 'when' ( (lv_exp_2_0= ruleExp ) ) )
                    {
                    // InternalDeviceDefinition.g:1329:3: ( () otherlv_1= 'when' ( (lv_exp_2_0= ruleExp ) ) )
                    // InternalDeviceDefinition.g:1330:4: () otherlv_1= 'when' ( (lv_exp_2_0= ruleExp ) )
                    {
                    // InternalDeviceDefinition.g:1330:4: ()
                    // InternalDeviceDefinition.g:1331:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTriggerAccess().getWhenAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,51,FOLLOW_34); 

                    				newLeafNode(otherlv_1, grammarAccess.getTriggerAccess().getWhenKeyword_0_1());
                    			
                    // InternalDeviceDefinition.g:1341:4: ( (lv_exp_2_0= ruleExp ) )
                    // InternalDeviceDefinition.g:1342:5: (lv_exp_2_0= ruleExp )
                    {
                    // InternalDeviceDefinition.g:1342:5: (lv_exp_2_0= ruleExp )
                    // InternalDeviceDefinition.g:1343:6: lv_exp_2_0= ruleExp
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
                    // InternalDeviceDefinition.g:1362:3: ( () otherlv_4= 'on' ( (lv_onExp_5_0= ruleExp ) ) ( (otherlv_6= 'off' ( (lv_offExp_7_0= ruleExp ) ) ) | (otherlv_8= 'run' otherlv_9= 'for' ( (lv_time_10_0= RULE_INT ) ) ( (lv_unit_11_0= ruleTimeUnit ) ) ) ) )
                    {
                    // InternalDeviceDefinition.g:1362:3: ( () otherlv_4= 'on' ( (lv_onExp_5_0= ruleExp ) ) ( (otherlv_6= 'off' ( (lv_offExp_7_0= ruleExp ) ) ) | (otherlv_8= 'run' otherlv_9= 'for' ( (lv_time_10_0= RULE_INT ) ) ( (lv_unit_11_0= ruleTimeUnit ) ) ) ) )
                    // InternalDeviceDefinition.g:1363:4: () otherlv_4= 'on' ( (lv_onExp_5_0= ruleExp ) ) ( (otherlv_6= 'off' ( (lv_offExp_7_0= ruleExp ) ) ) | (otherlv_8= 'run' otherlv_9= 'for' ( (lv_time_10_0= RULE_INT ) ) ( (lv_unit_11_0= ruleTimeUnit ) ) ) )
                    {
                    // InternalDeviceDefinition.g:1363:4: ()
                    // InternalDeviceDefinition.g:1364:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTriggerAccess().getOnOffAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,52,FOLLOW_34); 

                    				newLeafNode(otherlv_4, grammarAccess.getTriggerAccess().getOnKeyword_1_1());
                    			
                    // InternalDeviceDefinition.g:1374:4: ( (lv_onExp_5_0= ruleExp ) )
                    // InternalDeviceDefinition.g:1375:5: (lv_onExp_5_0= ruleExp )
                    {
                    // InternalDeviceDefinition.g:1375:5: (lv_onExp_5_0= ruleExp )
                    // InternalDeviceDefinition.g:1376:6: lv_onExp_5_0= ruleExp
                    {

                    						newCompositeNode(grammarAccess.getTriggerAccess().getOnExpExpParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_42);
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

                    // InternalDeviceDefinition.g:1393:4: ( (otherlv_6= 'off' ( (lv_offExp_7_0= ruleExp ) ) ) | (otherlv_8= 'run' otherlv_9= 'for' ( (lv_time_10_0= RULE_INT ) ) ( (lv_unit_11_0= ruleTimeUnit ) ) ) )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==53) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==54) ) {
                        alt25=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalDeviceDefinition.g:1394:5: (otherlv_6= 'off' ( (lv_offExp_7_0= ruleExp ) ) )
                            {
                            // InternalDeviceDefinition.g:1394:5: (otherlv_6= 'off' ( (lv_offExp_7_0= ruleExp ) ) )
                            // InternalDeviceDefinition.g:1395:6: otherlv_6= 'off' ( (lv_offExp_7_0= ruleExp ) )
                            {
                            otherlv_6=(Token)match(input,53,FOLLOW_34); 

                            						newLeafNode(otherlv_6, grammarAccess.getTriggerAccess().getOffKeyword_1_3_0_0());
                            					
                            // InternalDeviceDefinition.g:1399:6: ( (lv_offExp_7_0= ruleExp ) )
                            // InternalDeviceDefinition.g:1400:7: (lv_offExp_7_0= ruleExp )
                            {
                            // InternalDeviceDefinition.g:1400:7: (lv_offExp_7_0= ruleExp )
                            // InternalDeviceDefinition.g:1401:8: lv_offExp_7_0= ruleExp
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
                            // InternalDeviceDefinition.g:1420:5: (otherlv_8= 'run' otherlv_9= 'for' ( (lv_time_10_0= RULE_INT ) ) ( (lv_unit_11_0= ruleTimeUnit ) ) )
                            {
                            // InternalDeviceDefinition.g:1420:5: (otherlv_8= 'run' otherlv_9= 'for' ( (lv_time_10_0= RULE_INT ) ) ( (lv_unit_11_0= ruleTimeUnit ) ) )
                            // InternalDeviceDefinition.g:1421:6: otherlv_8= 'run' otherlv_9= 'for' ( (lv_time_10_0= RULE_INT ) ) ( (lv_unit_11_0= ruleTimeUnit ) )
                            {
                            otherlv_8=(Token)match(input,54,FOLLOW_23); 

                            						newLeafNode(otherlv_8, grammarAccess.getTriggerAccess().getRunKeyword_1_3_1_0());
                            					
                            otherlv_9=(Token)match(input,31,FOLLOW_24); 

                            						newLeafNode(otherlv_9, grammarAccess.getTriggerAccess().getForKeyword_1_3_1_1());
                            					
                            // InternalDeviceDefinition.g:1429:6: ( (lv_time_10_0= RULE_INT ) )
                            // InternalDeviceDefinition.g:1430:7: (lv_time_10_0= RULE_INT )
                            {
                            // InternalDeviceDefinition.g:1430:7: (lv_time_10_0= RULE_INT )
                            // InternalDeviceDefinition.g:1431:8: lv_time_10_0= RULE_INT
                            {
                            lv_time_10_0=(Token)match(input,RULE_INT,FOLLOW_25); 

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

                            // InternalDeviceDefinition.g:1447:6: ( (lv_unit_11_0= ruleTimeUnit ) )
                            // InternalDeviceDefinition.g:1448:7: (lv_unit_11_0= ruleTimeUnit )
                            {
                            // InternalDeviceDefinition.g:1448:7: (lv_unit_11_0= ruleTimeUnit )
                            // InternalDeviceDefinition.g:1449:8: lv_unit_11_0= ruleTimeUnit
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
    // InternalDeviceDefinition.g:1473:1: entryRuleSetting returns [EObject current=null] : iv_ruleSetting= ruleSetting EOF ;
    public final EObject entryRuleSetting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetting = null;


        try {
            // InternalDeviceDefinition.g:1473:48: (iv_ruleSetting= ruleSetting EOF )
            // InternalDeviceDefinition.g:1474:2: iv_ruleSetting= ruleSetting EOF
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
    // InternalDeviceDefinition.g:1480:1: ruleSetting returns [EObject current=null] : (otherlv_0= 'setting' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= rulePrimitive ) ) ) ;
    public final EObject ruleSetting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:1486:2: ( (otherlv_0= 'setting' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= rulePrimitive ) ) ) )
            // InternalDeviceDefinition.g:1487:2: (otherlv_0= 'setting' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= rulePrimitive ) ) )
            {
            // InternalDeviceDefinition.g:1487:2: (otherlv_0= 'setting' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= rulePrimitive ) ) )
            // InternalDeviceDefinition.g:1488:3: otherlv_0= 'setting' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= rulePrimitive ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getSettingAccess().getSettingKeyword_0());
            		
            // InternalDeviceDefinition.g:1492:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDeviceDefinition.g:1493:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:1493:4: (lv_name_1_0= RULE_ID )
            // InternalDeviceDefinition.g:1494:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_43); 

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

            otherlv_2=(Token)match(input,56,FOLLOW_44); 

            			newLeafNode(otherlv_2, grammarAccess.getSettingAccess().getEqualsSignKeyword_2());
            		
            // InternalDeviceDefinition.g:1514:3: ( (lv_value_3_0= rulePrimitive ) )
            // InternalDeviceDefinition.g:1515:4: (lv_value_3_0= rulePrimitive )
            {
            // InternalDeviceDefinition.g:1515:4: (lv_value_3_0= rulePrimitive )
            // InternalDeviceDefinition.g:1516:5: lv_value_3_0= rulePrimitive
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
    // InternalDeviceDefinition.g:1537:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // InternalDeviceDefinition.g:1537:50: (iv_rulePrimitive= rulePrimitive EOF )
            // InternalDeviceDefinition.g:1538:2: iv_rulePrimitive= rulePrimitive EOF
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
    // InternalDeviceDefinition.g:1544:1: rulePrimitive returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_DECIMAL ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () otherlv_5= 'TRUE' ) | ( () otherlv_7= 'FALSE' ) ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalDeviceDefinition.g:1550:2: ( ( ( () ( (lv_value_1_0= RULE_DECIMAL ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () otherlv_5= 'TRUE' ) | ( () otherlv_7= 'FALSE' ) ) )
            // InternalDeviceDefinition.g:1551:2: ( ( () ( (lv_value_1_0= RULE_DECIMAL ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () otherlv_5= 'TRUE' ) | ( () otherlv_7= 'FALSE' ) )
            {
            // InternalDeviceDefinition.g:1551:2: ( ( () ( (lv_value_1_0= RULE_DECIMAL ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () otherlv_5= 'TRUE' ) | ( () otherlv_7= 'FALSE' ) )
            int alt27=4;
            switch ( input.LA(1) ) {
            case RULE_DECIMAL:
                {
                alt27=1;
                }
                break;
            case RULE_INT:
                {
                alt27=2;
                }
                break;
            case 57:
                {
                alt27=3;
                }
                break;
            case 58:
                {
                alt27=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalDeviceDefinition.g:1552:3: ( () ( (lv_value_1_0= RULE_DECIMAL ) ) )
                    {
                    // InternalDeviceDefinition.g:1552:3: ( () ( (lv_value_1_0= RULE_DECIMAL ) ) )
                    // InternalDeviceDefinition.g:1553:4: () ( (lv_value_1_0= RULE_DECIMAL ) )
                    {
                    // InternalDeviceDefinition.g:1553:4: ()
                    // InternalDeviceDefinition.g:1554:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimitiveAccess().getDecimalPrimitiveAction_0_0(),
                    						current);
                    				

                    }

                    // InternalDeviceDefinition.g:1560:4: ( (lv_value_1_0= RULE_DECIMAL ) )
                    // InternalDeviceDefinition.g:1561:5: (lv_value_1_0= RULE_DECIMAL )
                    {
                    // InternalDeviceDefinition.g:1561:5: (lv_value_1_0= RULE_DECIMAL )
                    // InternalDeviceDefinition.g:1562:6: lv_value_1_0= RULE_DECIMAL
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
                    // InternalDeviceDefinition.g:1580:3: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    {
                    // InternalDeviceDefinition.g:1580:3: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    // InternalDeviceDefinition.g:1581:4: () ( (lv_value_3_0= RULE_INT ) )
                    {
                    // InternalDeviceDefinition.g:1581:4: ()
                    // InternalDeviceDefinition.g:1582:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimitiveAccess().getIntPrimitiveAction_1_0(),
                    						current);
                    				

                    }

                    // InternalDeviceDefinition.g:1588:4: ( (lv_value_3_0= RULE_INT ) )
                    // InternalDeviceDefinition.g:1589:5: (lv_value_3_0= RULE_INT )
                    {
                    // InternalDeviceDefinition.g:1589:5: (lv_value_3_0= RULE_INT )
                    // InternalDeviceDefinition.g:1590:6: lv_value_3_0= RULE_INT
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
                    // InternalDeviceDefinition.g:1608:3: ( () otherlv_5= 'TRUE' )
                    {
                    // InternalDeviceDefinition.g:1608:3: ( () otherlv_5= 'TRUE' )
                    // InternalDeviceDefinition.g:1609:4: () otherlv_5= 'TRUE'
                    {
                    // InternalDeviceDefinition.g:1609:4: ()
                    // InternalDeviceDefinition.g:1610:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimitiveAccess().getBooleanTrueAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,57,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrimitiveAccess().getTRUEKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDeviceDefinition.g:1622:3: ( () otherlv_7= 'FALSE' )
                    {
                    // InternalDeviceDefinition.g:1622:3: ( () otherlv_7= 'FALSE' )
                    // InternalDeviceDefinition.g:1623:4: () otherlv_7= 'FALSE'
                    {
                    // InternalDeviceDefinition.g:1623:4: ()
                    // InternalDeviceDefinition.g:1624:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimitiveAccess().getBooleanFalseAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,58,FOLLOW_2); 

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
    // InternalDeviceDefinition.g:1639:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalDeviceDefinition.g:1639:44: (iv_ruleExp= ruleExp EOF )
            // InternalDeviceDefinition.g:1640:2: iv_ruleExp= ruleExp EOF
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
    // InternalDeviceDefinition.g:1646:1: ruleExp returns [EObject current=null] : (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Factor_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:1652:2: ( (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) )
            // InternalDeviceDefinition.g:1653:2: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            {
            // InternalDeviceDefinition.g:1653:2: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            // InternalDeviceDefinition.g:1654:3: this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_45);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDeviceDefinition.g:1662:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=59 && LA29_0<=60)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalDeviceDefinition.g:1663:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) )
            	    {
            	    // InternalDeviceDefinition.g:1663:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==59) ) {
            	        alt28=1;
            	    }
            	    else if ( (LA28_0==60) ) {
            	        alt28=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // InternalDeviceDefinition.g:1664:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalDeviceDefinition.g:1664:5: ( () otherlv_2= '+' )
            	            // InternalDeviceDefinition.g:1665:6: () otherlv_2= '+'
            	            {
            	            // InternalDeviceDefinition.g:1665:6: ()
            	            // InternalDeviceDefinition.g:1666:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,59,FOLLOW_34); 

            	            						newLeafNode(otherlv_2, grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDeviceDefinition.g:1678:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalDeviceDefinition.g:1678:5: ( () otherlv_4= '-' )
            	            // InternalDeviceDefinition.g:1679:6: () otherlv_4= '-'
            	            {
            	            // InternalDeviceDefinition.g:1679:6: ()
            	            // InternalDeviceDefinition.g:1680:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,60,FOLLOW_34); 

            	            						newLeafNode(otherlv_4, grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalDeviceDefinition.g:1692:4: ( (lv_right_5_0= ruleFactor ) )
            	    // InternalDeviceDefinition.g:1693:5: (lv_right_5_0= ruleFactor )
            	    {
            	    // InternalDeviceDefinition.g:1693:5: (lv_right_5_0= ruleFactor )
            	    // InternalDeviceDefinition.g:1694:6: lv_right_5_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_45);
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
            	    break loop29;
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
    // InternalDeviceDefinition.g:1716:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalDeviceDefinition.g:1716:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalDeviceDefinition.g:1717:2: iv_ruleFactor= ruleFactor EOF
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
    // InternalDeviceDefinition.g:1723:1: ruleFactor returns [EObject current=null] : (this_Compare_0= ruleCompare ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleCompare ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Compare_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:1729:2: ( (this_Compare_0= ruleCompare ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleCompare ) ) )* ) )
            // InternalDeviceDefinition.g:1730:2: (this_Compare_0= ruleCompare ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleCompare ) ) )* )
            {
            // InternalDeviceDefinition.g:1730:2: (this_Compare_0= ruleCompare ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleCompare ) ) )* )
            // InternalDeviceDefinition.g:1731:3: this_Compare_0= ruleCompare ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleCompare ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getCompareParserRuleCall_0());
            		
            pushFollow(FOLLOW_46);
            this_Compare_0=ruleCompare();

            state._fsp--;


            			current = this_Compare_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDeviceDefinition.g:1739:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleCompare ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=61 && LA31_0<=62)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalDeviceDefinition.g:1740:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleCompare ) )
            	    {
            	    // InternalDeviceDefinition.g:1740:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0==61) ) {
            	        alt30=1;
            	    }
            	    else if ( (LA30_0==62) ) {
            	        alt30=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 30, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // InternalDeviceDefinition.g:1741:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalDeviceDefinition.g:1741:5: ( () otherlv_2= '*' )
            	            // InternalDeviceDefinition.g:1742:6: () otherlv_2= '*'
            	            {
            	            // InternalDeviceDefinition.g:1742:6: ()
            	            // InternalDeviceDefinition.g:1743:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,61,FOLLOW_34); 

            	            						newLeafNode(otherlv_2, grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDeviceDefinition.g:1755:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalDeviceDefinition.g:1755:5: ( () otherlv_4= '/' )
            	            // InternalDeviceDefinition.g:1756:6: () otherlv_4= '/'
            	            {
            	            // InternalDeviceDefinition.g:1756:6: ()
            	            // InternalDeviceDefinition.g:1757:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,62,FOLLOW_34); 

            	            						newLeafNode(otherlv_4, grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalDeviceDefinition.g:1769:4: ( (lv_right_5_0= ruleCompare ) )
            	    // InternalDeviceDefinition.g:1770:5: (lv_right_5_0= ruleCompare )
            	    {
            	    // InternalDeviceDefinition.g:1770:5: (lv_right_5_0= ruleCompare )
            	    // InternalDeviceDefinition.g:1771:6: lv_right_5_0= ruleCompare
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightCompareParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_46);
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
            	    break loop31;
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
    // InternalDeviceDefinition.g:1793:1: entryRuleCompare returns [EObject current=null] : iv_ruleCompare= ruleCompare EOF ;
    public final EObject entryRuleCompare() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompare = null;


        try {
            // InternalDeviceDefinition.g:1793:48: (iv_ruleCompare= ruleCompare EOF )
            // InternalDeviceDefinition.g:1794:2: iv_ruleCompare= ruleCompare EOF
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
    // InternalDeviceDefinition.g:1800:1: ruleCompare returns [EObject current=null] : (this_CompareOrEquals_0= ruleCompareOrEquals ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleCompareOrEquals ) ) )* ) ;
    public final EObject ruleCompare() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_CompareOrEquals_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:1806:2: ( (this_CompareOrEquals_0= ruleCompareOrEquals ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleCompareOrEquals ) ) )* ) )
            // InternalDeviceDefinition.g:1807:2: (this_CompareOrEquals_0= ruleCompareOrEquals ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleCompareOrEquals ) ) )* )
            {
            // InternalDeviceDefinition.g:1807:2: (this_CompareOrEquals_0= ruleCompareOrEquals ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleCompareOrEquals ) ) )* )
            // InternalDeviceDefinition.g:1808:3: this_CompareOrEquals_0= ruleCompareOrEquals ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleCompareOrEquals ) ) )*
            {

            			newCompositeNode(grammarAccess.getCompareAccess().getCompareOrEqualsParserRuleCall_0());
            		
            pushFollow(FOLLOW_47);
            this_CompareOrEquals_0=ruleCompareOrEquals();

            state._fsp--;


            			current = this_CompareOrEquals_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDeviceDefinition.g:1816:3: ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleCompareOrEquals ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=63 && LA33_0<=64)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalDeviceDefinition.g:1817:4: ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleCompareOrEquals ) )
            	    {
            	    // InternalDeviceDefinition.g:1817:4: ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) )
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==63) ) {
            	        alt32=1;
            	    }
            	    else if ( (LA32_0==64) ) {
            	        alt32=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 32, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // InternalDeviceDefinition.g:1818:5: ( () otherlv_2= '>' )
            	            {
            	            // InternalDeviceDefinition.g:1818:5: ( () otherlv_2= '>' )
            	            // InternalDeviceDefinition.g:1819:6: () otherlv_2= '>'
            	            {
            	            // InternalDeviceDefinition.g:1819:6: ()
            	            // InternalDeviceDefinition.g:1820:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getCompareAccess().getGreaterLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,63,FOLLOW_34); 

            	            						newLeafNode(otherlv_2, grammarAccess.getCompareAccess().getGreaterThanSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDeviceDefinition.g:1832:5: ( () otherlv_4= '<' )
            	            {
            	            // InternalDeviceDefinition.g:1832:5: ( () otherlv_4= '<' )
            	            // InternalDeviceDefinition.g:1833:6: () otherlv_4= '<'
            	            {
            	            // InternalDeviceDefinition.g:1833:6: ()
            	            // InternalDeviceDefinition.g:1834:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getCompareAccess().getLesserLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,64,FOLLOW_34); 

            	            						newLeafNode(otherlv_4, grammarAccess.getCompareAccess().getLessThanSignKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalDeviceDefinition.g:1846:4: ( (lv_right_5_0= ruleCompareOrEquals ) )
            	    // InternalDeviceDefinition.g:1847:5: (lv_right_5_0= ruleCompareOrEquals )
            	    {
            	    // InternalDeviceDefinition.g:1847:5: (lv_right_5_0= ruleCompareOrEquals )
            	    // InternalDeviceDefinition.g:1848:6: lv_right_5_0= ruleCompareOrEquals
            	    {

            	    						newCompositeNode(grammarAccess.getCompareAccess().getRightCompareOrEqualsParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_47);
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
            	    break loop33;
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
    // InternalDeviceDefinition.g:1870:1: entryRuleCompareOrEquals returns [EObject current=null] : iv_ruleCompareOrEquals= ruleCompareOrEquals EOF ;
    public final EObject entryRuleCompareOrEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOrEquals = null;


        try {
            // InternalDeviceDefinition.g:1870:56: (iv_ruleCompareOrEquals= ruleCompareOrEquals EOF )
            // InternalDeviceDefinition.g:1871:2: iv_ruleCompareOrEquals= ruleCompareOrEquals EOF
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
    // InternalDeviceDefinition.g:1877:1: ruleCompareOrEquals returns [EObject current=null] : (this_EqualsOrNotEquals_0= ruleEqualsOrNotEquals ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) ) ( (lv_right_5_0= ruleEqualsOrNotEquals ) ) )* ) ;
    public final EObject ruleCompareOrEquals() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_EqualsOrNotEquals_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:1883:2: ( (this_EqualsOrNotEquals_0= ruleEqualsOrNotEquals ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) ) ( (lv_right_5_0= ruleEqualsOrNotEquals ) ) )* ) )
            // InternalDeviceDefinition.g:1884:2: (this_EqualsOrNotEquals_0= ruleEqualsOrNotEquals ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) ) ( (lv_right_5_0= ruleEqualsOrNotEquals ) ) )* )
            {
            // InternalDeviceDefinition.g:1884:2: (this_EqualsOrNotEquals_0= ruleEqualsOrNotEquals ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) ) ( (lv_right_5_0= ruleEqualsOrNotEquals ) ) )* )
            // InternalDeviceDefinition.g:1885:3: this_EqualsOrNotEquals_0= ruleEqualsOrNotEquals ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) ) ( (lv_right_5_0= ruleEqualsOrNotEquals ) ) )*
            {

            			newCompositeNode(grammarAccess.getCompareOrEqualsAccess().getEqualsOrNotEqualsParserRuleCall_0());
            		
            pushFollow(FOLLOW_48);
            this_EqualsOrNotEquals_0=ruleEqualsOrNotEquals();

            state._fsp--;


            			current = this_EqualsOrNotEquals_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDeviceDefinition.g:1893:3: ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) ) ( (lv_right_5_0= ruleEqualsOrNotEquals ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=65 && LA35_0<=66)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalDeviceDefinition.g:1894:4: ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) ) ( (lv_right_5_0= ruleEqualsOrNotEquals ) )
            	    {
            	    // InternalDeviceDefinition.g:1894:4: ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) )
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==65) ) {
            	        alt34=1;
            	    }
            	    else if ( (LA34_0==66) ) {
            	        alt34=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 34, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // InternalDeviceDefinition.g:1895:5: ( () otherlv_2= '>=' )
            	            {
            	            // InternalDeviceDefinition.g:1895:5: ( () otherlv_2= '>=' )
            	            // InternalDeviceDefinition.g:1896:6: () otherlv_2= '>='
            	            {
            	            // InternalDeviceDefinition.g:1896:6: ()
            	            // InternalDeviceDefinition.g:1897:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getCompareOrEqualsAccess().getGreaterOrEqualsLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,65,FOLLOW_34); 

            	            						newLeafNode(otherlv_2, grammarAccess.getCompareOrEqualsAccess().getGreaterThanSignEqualsSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDeviceDefinition.g:1909:5: ( () otherlv_4= '<=' )
            	            {
            	            // InternalDeviceDefinition.g:1909:5: ( () otherlv_4= '<=' )
            	            // InternalDeviceDefinition.g:1910:6: () otherlv_4= '<='
            	            {
            	            // InternalDeviceDefinition.g:1910:6: ()
            	            // InternalDeviceDefinition.g:1911:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getCompareOrEqualsAccess().getLesserOrEqualsLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,66,FOLLOW_34); 

            	            						newLeafNode(otherlv_4, grammarAccess.getCompareOrEqualsAccess().getLessThanSignEqualsSignKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalDeviceDefinition.g:1923:4: ( (lv_right_5_0= ruleEqualsOrNotEquals ) )
            	    // InternalDeviceDefinition.g:1924:5: (lv_right_5_0= ruleEqualsOrNotEquals )
            	    {
            	    // InternalDeviceDefinition.g:1924:5: (lv_right_5_0= ruleEqualsOrNotEquals )
            	    // InternalDeviceDefinition.g:1925:6: lv_right_5_0= ruleEqualsOrNotEquals
            	    {

            	    						newCompositeNode(grammarAccess.getCompareOrEqualsAccess().getRightEqualsOrNotEqualsParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_48);
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
            	    break loop35;
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
    // InternalDeviceDefinition.g:1947:1: entryRuleEqualsOrNotEquals returns [EObject current=null] : iv_ruleEqualsOrNotEquals= ruleEqualsOrNotEquals EOF ;
    public final EObject entryRuleEqualsOrNotEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualsOrNotEquals = null;


        try {
            // InternalDeviceDefinition.g:1947:58: (iv_ruleEqualsOrNotEquals= ruleEqualsOrNotEquals EOF )
            // InternalDeviceDefinition.g:1948:2: iv_ruleEqualsOrNotEquals= ruleEqualsOrNotEquals EOF
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
    // InternalDeviceDefinition.g:1954:1: ruleEqualsOrNotEquals returns [EObject current=null] : (this_AndOr_0= ruleAndOr ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleAndOr ) ) )* ) ;
    public final EObject ruleEqualsOrNotEquals() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_AndOr_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:1960:2: ( (this_AndOr_0= ruleAndOr ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleAndOr ) ) )* ) )
            // InternalDeviceDefinition.g:1961:2: (this_AndOr_0= ruleAndOr ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleAndOr ) ) )* )
            {
            // InternalDeviceDefinition.g:1961:2: (this_AndOr_0= ruleAndOr ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleAndOr ) ) )* )
            // InternalDeviceDefinition.g:1962:3: this_AndOr_0= ruleAndOr ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleAndOr ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualsOrNotEqualsAccess().getAndOrParserRuleCall_0());
            		
            pushFollow(FOLLOW_49);
            this_AndOr_0=ruleAndOr();

            state._fsp--;


            			current = this_AndOr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDeviceDefinition.g:1970:3: ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleAndOr ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=67 && LA37_0<=68)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalDeviceDefinition.g:1971:4: ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleAndOr ) )
            	    {
            	    // InternalDeviceDefinition.g:1971:4: ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) )
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==67) ) {
            	        alt36=1;
            	    }
            	    else if ( (LA36_0==68) ) {
            	        alt36=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 36, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // InternalDeviceDefinition.g:1972:5: ( () otherlv_2= '==' )
            	            {
            	            // InternalDeviceDefinition.g:1972:5: ( () otherlv_2= '==' )
            	            // InternalDeviceDefinition.g:1973:6: () otherlv_2= '=='
            	            {
            	            // InternalDeviceDefinition.g:1973:6: ()
            	            // InternalDeviceDefinition.g:1974:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getEqualsOrNotEqualsAccess().getEqualsLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,67,FOLLOW_34); 

            	            						newLeafNode(otherlv_2, grammarAccess.getEqualsOrNotEqualsAccess().getEqualsSignEqualsSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDeviceDefinition.g:1986:5: ( () otherlv_4= '!=' )
            	            {
            	            // InternalDeviceDefinition.g:1986:5: ( () otherlv_4= '!=' )
            	            // InternalDeviceDefinition.g:1987:6: () otherlv_4= '!='
            	            {
            	            // InternalDeviceDefinition.g:1987:6: ()
            	            // InternalDeviceDefinition.g:1988:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getEqualsOrNotEqualsAccess().getNotEqualsLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,68,FOLLOW_34); 

            	            						newLeafNode(otherlv_4, grammarAccess.getEqualsOrNotEqualsAccess().getExclamationMarkEqualsSignKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalDeviceDefinition.g:2000:4: ( (lv_right_5_0= ruleAndOr ) )
            	    // InternalDeviceDefinition.g:2001:5: (lv_right_5_0= ruleAndOr )
            	    {
            	    // InternalDeviceDefinition.g:2001:5: (lv_right_5_0= ruleAndOr )
            	    // InternalDeviceDefinition.g:2002:6: lv_right_5_0= ruleAndOr
            	    {

            	    						newCompositeNode(grammarAccess.getEqualsOrNotEqualsAccess().getRightAndOrParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_49);
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
            	    break loop37;
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
    // InternalDeviceDefinition.g:2024:1: entryRuleAndOr returns [EObject current=null] : iv_ruleAndOr= ruleAndOr EOF ;
    public final EObject entryRuleAndOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndOr = null;


        try {
            // InternalDeviceDefinition.g:2024:46: (iv_ruleAndOr= ruleAndOr EOF )
            // InternalDeviceDefinition.g:2025:2: iv_ruleAndOr= ruleAndOr EOF
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
    // InternalDeviceDefinition.g:2031:1: ruleAndOr returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( ( () otherlv_2= 'and' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleAndOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Primary_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:2037:2: ( (this_Primary_0= rulePrimary ( ( ( () otherlv_2= 'and' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) )
            // InternalDeviceDefinition.g:2038:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= 'and' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            {
            // InternalDeviceDefinition.g:2038:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= 'and' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            // InternalDeviceDefinition.g:2039:3: this_Primary_0= rulePrimary ( ( ( () otherlv_2= 'and' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndOrAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_50);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDeviceDefinition.g:2047:3: ( ( ( () otherlv_2= 'and' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==21||LA39_0==69) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalDeviceDefinition.g:2048:4: ( ( () otherlv_2= 'and' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= rulePrimary ) )
            	    {
            	    // InternalDeviceDefinition.g:2048:4: ( ( () otherlv_2= 'and' ) | ( () otherlv_4= 'or' ) )
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==21) ) {
            	        alt38=1;
            	    }
            	    else if ( (LA38_0==69) ) {
            	        alt38=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 38, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // InternalDeviceDefinition.g:2049:5: ( () otherlv_2= 'and' )
            	            {
            	            // InternalDeviceDefinition.g:2049:5: ( () otherlv_2= 'and' )
            	            // InternalDeviceDefinition.g:2050:6: () otherlv_2= 'and'
            	            {
            	            // InternalDeviceDefinition.g:2050:6: ()
            	            // InternalDeviceDefinition.g:2051:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getAndOrAccess().getAndLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,21,FOLLOW_34); 

            	            						newLeafNode(otherlv_2, grammarAccess.getAndOrAccess().getAndKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDeviceDefinition.g:2063:5: ( () otherlv_4= 'or' )
            	            {
            	            // InternalDeviceDefinition.g:2063:5: ( () otherlv_4= 'or' )
            	            // InternalDeviceDefinition.g:2064:6: () otherlv_4= 'or'
            	            {
            	            // InternalDeviceDefinition.g:2064:6: ()
            	            // InternalDeviceDefinition.g:2065:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getAndOrAccess().getOrLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,69,FOLLOW_34); 

            	            						newLeafNode(otherlv_4, grammarAccess.getAndOrAccess().getOrKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalDeviceDefinition.g:2077:4: ( (lv_right_5_0= rulePrimary ) )
            	    // InternalDeviceDefinition.g:2078:5: (lv_right_5_0= rulePrimary )
            	    {
            	    // InternalDeviceDefinition.g:2078:5: (lv_right_5_0= rulePrimary )
            	    // InternalDeviceDefinition.g:2079:6: lv_right_5_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getAndOrAccess().getRightPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_50);
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
    // $ANTLR end "ruleAndOr"


    // $ANTLR start "entryRulePrimary"
    // InternalDeviceDefinition.g:2101:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalDeviceDefinition.g:2101:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalDeviceDefinition.g:2102:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalDeviceDefinition.g:2108:1: rulePrimary returns [EObject current=null] : (this_Primitive_0= rulePrimitive | this_Parenthesis_1= ruleParenthesis | this_VariableUse_2= ruleVariableUse | this_ExternalCall_3= ruleExternalCall | ( () otherlv_5= 'value' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        EObject this_Primitive_0 = null;

        EObject this_Parenthesis_1 = null;

        EObject this_VariableUse_2 = null;

        EObject this_ExternalCall_3 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:2114:2: ( (this_Primitive_0= rulePrimitive | this_Parenthesis_1= ruleParenthesis | this_VariableUse_2= ruleVariableUse | this_ExternalCall_3= ruleExternalCall | ( () otherlv_5= 'value' ) ) )
            // InternalDeviceDefinition.g:2115:2: (this_Primitive_0= rulePrimitive | this_Parenthesis_1= ruleParenthesis | this_VariableUse_2= ruleVariableUse | this_ExternalCall_3= ruleExternalCall | ( () otherlv_5= 'value' ) )
            {
            // InternalDeviceDefinition.g:2115:2: (this_Primitive_0= rulePrimitive | this_Parenthesis_1= ruleParenthesis | this_VariableUse_2= ruleVariableUse | this_ExternalCall_3= ruleExternalCall | ( () otherlv_5= 'value' ) )
            int alt40=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_DECIMAL:
            case 57:
            case 58:
                {
                alt40=1;
                }
                break;
            case 72:
                {
                alt40=2;
                }
                break;
            case RULE_ID:
                {
                alt40=3;
                }
                break;
            case 71:
                {
                alt40=4;
                }
                break;
            case 70:
                {
                alt40=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalDeviceDefinition.g:2116:3: this_Primitive_0= rulePrimitive
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
                    // InternalDeviceDefinition.g:2125:3: this_Parenthesis_1= ruleParenthesis
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
                    // InternalDeviceDefinition.g:2134:3: this_VariableUse_2= ruleVariableUse
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
                    // InternalDeviceDefinition.g:2143:3: this_ExternalCall_3= ruleExternalCall
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
                    // InternalDeviceDefinition.g:2152:3: ( () otherlv_5= 'value' )
                    {
                    // InternalDeviceDefinition.g:2152:3: ( () otherlv_5= 'value' )
                    // InternalDeviceDefinition.g:2153:4: () otherlv_5= 'value'
                    {
                    // InternalDeviceDefinition.g:2153:4: ()
                    // InternalDeviceDefinition.g:2154:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getValueAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,70,FOLLOW_2); 

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
    // InternalDeviceDefinition.g:2169:1: entryRuleExternalCall returns [EObject current=null] : iv_ruleExternalCall= ruleExternalCall EOF ;
    public final EObject entryRuleExternalCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalCall = null;


        try {
            // InternalDeviceDefinition.g:2169:53: (iv_ruleExternalCall= ruleExternalCall EOF )
            // InternalDeviceDefinition.g:2170:2: iv_ruleExternalCall= ruleExternalCall EOF
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
    // InternalDeviceDefinition.g:2176:1: ruleExternalCall returns [EObject current=null] : (otherlv_0= 'call' ( (lv_func_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_args_3_0= ruleExp ) )? (otherlv_4= ',' ( (lv_args_5_0= ruleExp ) ) )* otherlv_6= ')' ) ;
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
            // InternalDeviceDefinition.g:2182:2: ( (otherlv_0= 'call' ( (lv_func_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_args_3_0= ruleExp ) )? (otherlv_4= ',' ( (lv_args_5_0= ruleExp ) ) )* otherlv_6= ')' ) )
            // InternalDeviceDefinition.g:2183:2: (otherlv_0= 'call' ( (lv_func_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_args_3_0= ruleExp ) )? (otherlv_4= ',' ( (lv_args_5_0= ruleExp ) ) )* otherlv_6= ')' )
            {
            // InternalDeviceDefinition.g:2183:2: (otherlv_0= 'call' ( (lv_func_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_args_3_0= ruleExp ) )? (otherlv_4= ',' ( (lv_args_5_0= ruleExp ) ) )* otherlv_6= ')' )
            // InternalDeviceDefinition.g:2184:3: otherlv_0= 'call' ( (lv_func_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_args_3_0= ruleExp ) )? (otherlv_4= ',' ( (lv_args_5_0= ruleExp ) ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalCallAccess().getCallKeyword_0());
            		
            // InternalDeviceDefinition.g:2188:3: ( (lv_func_1_0= RULE_ID ) )
            // InternalDeviceDefinition.g:2189:4: (lv_func_1_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:2189:4: (lv_func_1_0= RULE_ID )
            // InternalDeviceDefinition.g:2190:5: lv_func_1_0= RULE_ID
            {
            lv_func_1_0=(Token)match(input,RULE_ID,FOLLOW_51); 

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

            otherlv_2=(Token)match(input,72,FOLLOW_52); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalCallAccess().getLeftParenthesisKeyword_2());
            		
            // InternalDeviceDefinition.g:2210:3: ( (lv_args_3_0= ruleExp ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID||(LA41_0>=RULE_INT && LA41_0<=RULE_DECIMAL)||(LA41_0>=57 && LA41_0<=58)||(LA41_0>=70 && LA41_0<=72)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalDeviceDefinition.g:2211:4: (lv_args_3_0= ruleExp )
                    {
                    // InternalDeviceDefinition.g:2211:4: (lv_args_3_0= ruleExp )
                    // InternalDeviceDefinition.g:2212:5: lv_args_3_0= ruleExp
                    {

                    					newCompositeNode(grammarAccess.getExternalCallAccess().getArgsExpParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_53);
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

            // InternalDeviceDefinition.g:2229:3: (otherlv_4= ',' ( (lv_args_5_0= ruleExp ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==34) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalDeviceDefinition.g:2230:4: otherlv_4= ',' ( (lv_args_5_0= ruleExp ) )
            	    {
            	    otherlv_4=(Token)match(input,34,FOLLOW_34); 

            	    				newLeafNode(otherlv_4, grammarAccess.getExternalCallAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalDeviceDefinition.g:2234:4: ( (lv_args_5_0= ruleExp ) )
            	    // InternalDeviceDefinition.g:2235:5: (lv_args_5_0= ruleExp )
            	    {
            	    // InternalDeviceDefinition.g:2235:5: (lv_args_5_0= ruleExp )
            	    // InternalDeviceDefinition.g:2236:6: lv_args_5_0= ruleExp
            	    {

            	    						newCompositeNode(grammarAccess.getExternalCallAccess().getArgsExpParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_53);
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
            	    break loop42;
                }
            } while (true);

            otherlv_6=(Token)match(input,73,FOLLOW_2); 

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
    // InternalDeviceDefinition.g:2262:1: entryRuleInternalVariableUse returns [EObject current=null] : iv_ruleInternalVariableUse= ruleInternalVariableUse EOF ;
    public final EObject entryRuleInternalVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalVariableUse = null;


        try {
            // InternalDeviceDefinition.g:2262:60: (iv_ruleInternalVariableUse= ruleInternalVariableUse EOF )
            // InternalDeviceDefinition.g:2263:2: iv_ruleInternalVariableUse= ruleInternalVariableUse EOF
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
    // InternalDeviceDefinition.g:2269:1: ruleInternalVariableUse returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleInternalVariableUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDeviceDefinition.g:2275:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalDeviceDefinition.g:2276:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalDeviceDefinition.g:2276:2: ( (otherlv_0= RULE_ID ) )
            // InternalDeviceDefinition.g:2277:3: (otherlv_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:2277:3: (otherlv_0= RULE_ID )
            // InternalDeviceDefinition.g:2278:4: otherlv_0= RULE_ID
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
    // InternalDeviceDefinition.g:2292:1: entryRuleExternalVariableUse returns [EObject current=null] : iv_ruleExternalVariableUse= ruleExternalVariableUse EOF ;
    public final EObject entryRuleExternalVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalVariableUse = null;


        try {
            // InternalDeviceDefinition.g:2292:60: (iv_ruleExternalVariableUse= ruleExternalVariableUse EOF )
            // InternalDeviceDefinition.g:2293:2: iv_ruleExternalVariableUse= ruleExternalVariableUse EOF
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
    // InternalDeviceDefinition.g:2299:1: ruleExternalVariableUse returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' | otherlv_2= '->' ) ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleExternalVariableUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDeviceDefinition.g:2305:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' | otherlv_2= '->' ) ( (otherlv_3= RULE_ID ) ) ) )
            // InternalDeviceDefinition.g:2306:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' | otherlv_2= '->' ) ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalDeviceDefinition.g:2306:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' | otherlv_2= '->' ) ( (otherlv_3= RULE_ID ) ) )
            // InternalDeviceDefinition.g:2307:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' | otherlv_2= '->' ) ( (otherlv_3= RULE_ID ) )
            {
            // InternalDeviceDefinition.g:2307:3: ( (otherlv_0= RULE_ID ) )
            // InternalDeviceDefinition.g:2308:4: (otherlv_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:2308:4: (otherlv_0= RULE_ID )
            // InternalDeviceDefinition.g:2309:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalVariableUseRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_54); 

            					newLeafNode(otherlv_0, grammarAccess.getExternalVariableUseAccess().getObjDeviceCrossReference_0_0());
            				

            }


            }

            // InternalDeviceDefinition.g:2320:3: (otherlv_1= '.' | otherlv_2= '->' )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==74) ) {
                alt43=1;
            }
            else if ( (LA43_0==75) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalDeviceDefinition.g:2321:4: otherlv_1= '.'
                    {
                    otherlv_1=(Token)match(input,74,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getExternalVariableUseAccess().getFullStopKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDeviceDefinition.g:2326:4: otherlv_2= '->'
                    {
                    otherlv_2=(Token)match(input,75,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getExternalVariableUseAccess().getHyphenMinusGreaterThanSignKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalDeviceDefinition.g:2331:3: ( (otherlv_3= RULE_ID ) )
            // InternalDeviceDefinition.g:2332:4: (otherlv_3= RULE_ID )
            {
            // InternalDeviceDefinition.g:2332:4: (otherlv_3= RULE_ID )
            // InternalDeviceDefinition.g:2333:5: otherlv_3= RULE_ID
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


    // $ANTLR start "entryRuleVariableUse"
    // InternalDeviceDefinition.g:2348:1: entryRuleVariableUse returns [EObject current=null] : iv_ruleVariableUse= ruleVariableUse EOF ;
    public final EObject entryRuleVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableUse = null;


        try {
            // InternalDeviceDefinition.g:2348:52: (iv_ruleVariableUse= ruleVariableUse EOF )
            // InternalDeviceDefinition.g:2349:2: iv_ruleVariableUse= ruleVariableUse EOF
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
    // InternalDeviceDefinition.g:2355:1: ruleVariableUse returns [EObject current=null] : (this_InternalVariableUse_0= ruleInternalVariableUse | this_ExternalVariableUse_1= ruleExternalVariableUse ) ;
    public final EObject ruleVariableUse() throws RecognitionException {
        EObject current = null;

        EObject this_InternalVariableUse_0 = null;

        EObject this_ExternalVariableUse_1 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:2361:2: ( (this_InternalVariableUse_0= ruleInternalVariableUse | this_ExternalVariableUse_1= ruleExternalVariableUse ) )
            // InternalDeviceDefinition.g:2362:2: (this_InternalVariableUse_0= ruleInternalVariableUse | this_ExternalVariableUse_1= ruleExternalVariableUse )
            {
            // InternalDeviceDefinition.g:2362:2: (this_InternalVariableUse_0= ruleInternalVariableUse | this_ExternalVariableUse_1= ruleExternalVariableUse )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                int LA44_1 = input.LA(2);

                if ( ((LA44_1>=74 && LA44_1<=75)) ) {
                    alt44=2;
                }
                else if ( (LA44_1==EOF||(LA44_1>=21 && LA44_1<=22)||LA44_1==29||LA44_1==32||(LA44_1>=34 && LA44_1<=35)||LA44_1==37||LA44_1==41||LA44_1==50||(LA44_1>=53 && LA44_1<=55)||(LA44_1>=59 && LA44_1<=69)||LA44_1==73) ) {
                    alt44=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalDeviceDefinition.g:2363:3: this_InternalVariableUse_0= ruleInternalVariableUse
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
                    // InternalDeviceDefinition.g:2372:3: this_ExternalVariableUse_1= ruleExternalVariableUse
                    {

                    			newCompositeNode(grammarAccess.getVariableUseAccess().getExternalVariableUseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalVariableUse_1=ruleExternalVariableUse();

                    state._fsp--;


                    			current = this_ExternalVariableUse_1;
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
    // InternalDeviceDefinition.g:2384:1: entryRuleParenthesis returns [EObject current=null] : iv_ruleParenthesis= ruleParenthesis EOF ;
    public final EObject entryRuleParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesis = null;


        try {
            // InternalDeviceDefinition.g:2384:52: (iv_ruleParenthesis= ruleParenthesis EOF )
            // InternalDeviceDefinition.g:2385:2: iv_ruleParenthesis= ruleParenthesis EOF
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
    // InternalDeviceDefinition.g:2391:1: ruleParenthesis returns [EObject current=null] : (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' ) ;
    public final EObject ruleParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:2397:2: ( (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' ) )
            // InternalDeviceDefinition.g:2398:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' )
            {
            // InternalDeviceDefinition.g:2398:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' )
            // InternalDeviceDefinition.g:2399:3: otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0());
            		
            // InternalDeviceDefinition.g:2403:3: ( (lv_exp_1_0= ruleExp ) )
            // InternalDeviceDefinition.g:2404:4: (lv_exp_1_0= ruleExp )
            {
            // InternalDeviceDefinition.g:2404:4: (lv_exp_1_0= ruleExp )
            // InternalDeviceDefinition.g:2405:5: lv_exp_1_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_55);
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

            otherlv_2=(Token)match(input,73,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0004000140000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000FC0000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0004000100000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0080022A00000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x008003EC00000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000003C000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0080022C00000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0080022800000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0080002800000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x06000000000001A0L,0x00000000000001C0L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x009803C400000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0600000000000180L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000006L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000200002L,0x0000000000000020L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x06000004000001A0L,0x00000000000003C0L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});

}