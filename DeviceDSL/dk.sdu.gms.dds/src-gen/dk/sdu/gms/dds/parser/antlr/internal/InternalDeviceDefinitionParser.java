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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_MAC", "RULE_INT", "RULE_DECIMAL", "RULE_HEXBYTE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'System'", "':'", "'Graph'", "'category'", "'title'", "'x'", "'y'", "'Gateway'", "'mac'", "'Worker'", "'sleep'", "'for'", "'broadcast'", "'Sensor'", "'pins'", "','", "'rate'", "'behavior'", "'sample'", "'if'", "'graph'", "'('", "')'", "'second'", "'seconds'", "'minute'", "'minutes'", "'hour'", "'hours'", "'import'", "'out'", "'as'", "'with'", "'mapping'", "'Actuator'", "'trigger'", "'on'", "'setting'", "'='", "'TRUE'", "'FALSE'", "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'and'", "'or'", "'call'", "'.'", "'->'"
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
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=5;
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
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
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
    // InternalDeviceDefinition.g:71:1: ruleSystem returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'System' otherlv_2= ':' ( (lv_gateway_3_0= ruleGateway ) ) ( (lv_graphs_4_0= ruleGraph ) )* ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_imports_0_0 = null;

        EObject lv_gateway_3_0 = null;

        EObject lv_graphs_4_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:77:2: ( ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'System' otherlv_2= ':' ( (lv_gateway_3_0= ruleGateway ) ) ( (lv_graphs_4_0= ruleGraph ) )* ) )
            // InternalDeviceDefinition.g:78:2: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'System' otherlv_2= ':' ( (lv_gateway_3_0= ruleGateway ) ) ( (lv_graphs_4_0= ruleGraph ) )* )
            {
            // InternalDeviceDefinition.g:78:2: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'System' otherlv_2= ':' ( (lv_gateway_3_0= ruleGateway ) ) ( (lv_graphs_4_0= ruleGraph ) )* )
            // InternalDeviceDefinition.g:79:3: ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'System' otherlv_2= ':' ( (lv_gateway_3_0= ruleGateway ) ) ( (lv_graphs_4_0= ruleGraph ) )*
            {
            // InternalDeviceDefinition.g:79:3: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==43) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDeviceDefinition.g:80:4: (lv_imports_0_0= ruleImport )
            	    {
            	    // InternalDeviceDefinition.g:80:4: (lv_imports_0_0= ruleImport )
            	    // InternalDeviceDefinition.g:81:5: lv_imports_0_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getSystemAccess().getImportsImportParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_0_0,
            	    						"dk.sdu.gms.dds.DeviceDefinition.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_1=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemAccess().getSystemKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getColonKeyword_2());
            		
            // InternalDeviceDefinition.g:106:3: ( (lv_gateway_3_0= ruleGateway ) )
            // InternalDeviceDefinition.g:107:4: (lv_gateway_3_0= ruleGateway )
            {
            // InternalDeviceDefinition.g:107:4: (lv_gateway_3_0= ruleGateway )
            // InternalDeviceDefinition.g:108:5: lv_gateway_3_0= ruleGateway
            {

            					newCompositeNode(grammarAccess.getSystemAccess().getGatewayGatewayParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_gateway_3_0=ruleGateway();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemRule());
            					}
            					set(
            						current,
            						"gateway",
            						lv_gateway_3_0,
            						"dk.sdu.gms.dds.DeviceDefinition.Gateway");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDeviceDefinition.g:125:3: ( (lv_graphs_4_0= ruleGraph ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDeviceDefinition.g:126:4: (lv_graphs_4_0= ruleGraph )
            	    {
            	    // InternalDeviceDefinition.g:126:4: (lv_graphs_4_0= ruleGraph )
            	    // InternalDeviceDefinition.g:127:5: lv_graphs_4_0= ruleGraph
            	    {

            	    					newCompositeNode(grammarAccess.getSystemAccess().getGraphsGraphParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_graphs_4_0=ruleGraph();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"graphs",
            	    						lv_graphs_4_0,
            	    						"dk.sdu.gms.dds.DeviceDefinition.Graph");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // InternalDeviceDefinition.g:148:1: entryRuleGraph returns [EObject current=null] : iv_ruleGraph= ruleGraph EOF ;
    public final EObject entryRuleGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraph = null;


        try {
            // InternalDeviceDefinition.g:148:46: (iv_ruleGraph= ruleGraph EOF )
            // InternalDeviceDefinition.g:149:2: iv_ruleGraph= ruleGraph EOF
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
    // InternalDeviceDefinition.g:155:1: ruleGraph returns [EObject current=null] : (otherlv_0= 'Graph' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'category' ( (lv_category_5_0= RULE_STRING ) ) otherlv_6= 'title' ( (lv_title_7_0= RULE_STRING ) ) otherlv_8= 'x' ( (lv_xlabel_9_0= RULE_STRING ) ) otherlv_10= 'y' ( (lv_ylabel_11_0= RULE_STRING ) ) ) ;
    public final EObject ruleGraph() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
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
            // InternalDeviceDefinition.g:161:2: ( (otherlv_0= 'Graph' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'category' ( (lv_category_5_0= RULE_STRING ) ) otherlv_6= 'title' ( (lv_title_7_0= RULE_STRING ) ) otherlv_8= 'x' ( (lv_xlabel_9_0= RULE_STRING ) ) otherlv_10= 'y' ( (lv_ylabel_11_0= RULE_STRING ) ) ) )
            // InternalDeviceDefinition.g:162:2: (otherlv_0= 'Graph' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'category' ( (lv_category_5_0= RULE_STRING ) ) otherlv_6= 'title' ( (lv_title_7_0= RULE_STRING ) ) otherlv_8= 'x' ( (lv_xlabel_9_0= RULE_STRING ) ) otherlv_10= 'y' ( (lv_ylabel_11_0= RULE_STRING ) ) )
            {
            // InternalDeviceDefinition.g:162:2: (otherlv_0= 'Graph' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'category' ( (lv_category_5_0= RULE_STRING ) ) otherlv_6= 'title' ( (lv_title_7_0= RULE_STRING ) ) otherlv_8= 'x' ( (lv_xlabel_9_0= RULE_STRING ) ) otherlv_10= 'y' ( (lv_ylabel_11_0= RULE_STRING ) ) )
            // InternalDeviceDefinition.g:163:3: otherlv_0= 'Graph' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'category' ( (lv_category_5_0= RULE_STRING ) ) otherlv_6= 'title' ( (lv_title_7_0= RULE_STRING ) ) otherlv_8= 'x' ( (lv_xlabel_9_0= RULE_STRING ) ) otherlv_10= 'y' ( (lv_ylabel_11_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphAccess().getGraphKeyword_0());
            		
            // InternalDeviceDefinition.g:167:3: ( (otherlv_1= RULE_ID ) )
            // InternalDeviceDefinition.g:168:4: (otherlv_1= RULE_ID )
            {
            // InternalDeviceDefinition.g:168:4: (otherlv_1= RULE_ID )
            // InternalDeviceDefinition.g:169:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_1, grammarAccess.getGraphAccess().getTypeImportCrossReference_1_0());
            				

            }


            }

            // InternalDeviceDefinition.g:180:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDeviceDefinition.g:181:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:181:4: (lv_name_2_0= RULE_ID )
            // InternalDeviceDefinition.g:182:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

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

            otherlv_3=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getGraphAccess().getColonKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getGraphAccess().getCategoryKeyword_4());
            		
            // InternalDeviceDefinition.g:206:3: ( (lv_category_5_0= RULE_STRING ) )
            // InternalDeviceDefinition.g:207:4: (lv_category_5_0= RULE_STRING )
            {
            // InternalDeviceDefinition.g:207:4: (lv_category_5_0= RULE_STRING )
            // InternalDeviceDefinition.g:208:5: lv_category_5_0= RULE_STRING
            {
            lv_category_5_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

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

            otherlv_6=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getGraphAccess().getTitleKeyword_6());
            		
            // InternalDeviceDefinition.g:228:3: ( (lv_title_7_0= RULE_STRING ) )
            // InternalDeviceDefinition.g:229:4: (lv_title_7_0= RULE_STRING )
            {
            // InternalDeviceDefinition.g:229:4: (lv_title_7_0= RULE_STRING )
            // InternalDeviceDefinition.g:230:5: lv_title_7_0= RULE_STRING
            {
            lv_title_7_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

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

            otherlv_8=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getGraphAccess().getXKeyword_8());
            		
            // InternalDeviceDefinition.g:250:3: ( (lv_xlabel_9_0= RULE_STRING ) )
            // InternalDeviceDefinition.g:251:4: (lv_xlabel_9_0= RULE_STRING )
            {
            // InternalDeviceDefinition.g:251:4: (lv_xlabel_9_0= RULE_STRING )
            // InternalDeviceDefinition.g:252:5: lv_xlabel_9_0= RULE_STRING
            {
            lv_xlabel_9_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

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

            otherlv_10=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_10, grammarAccess.getGraphAccess().getYKeyword_10());
            		
            // InternalDeviceDefinition.g:272:3: ( (lv_ylabel_11_0= RULE_STRING ) )
            // InternalDeviceDefinition.g:273:4: (lv_ylabel_11_0= RULE_STRING )
            {
            // InternalDeviceDefinition.g:273:4: (lv_ylabel_11_0= RULE_STRING )
            // InternalDeviceDefinition.g:274:5: lv_ylabel_11_0= RULE_STRING
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
    // InternalDeviceDefinition.g:294:1: entryRuleGateway returns [EObject current=null] : iv_ruleGateway= ruleGateway EOF ;
    public final EObject entryRuleGateway() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGateway = null;


        try {
            // InternalDeviceDefinition.g:294:48: (iv_ruleGateway= ruleGateway EOF )
            // InternalDeviceDefinition.g:295:2: iv_ruleGateway= ruleGateway EOF
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
    // InternalDeviceDefinition.g:301:1: ruleGateway returns [EObject current=null] : (otherlv_0= 'Gateway' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'mac' ( (lv_mac_4_0= RULE_MAC ) ) ( (lv_workers_5_0= ruleWorker ) )+ ) ;
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
            // InternalDeviceDefinition.g:307:2: ( (otherlv_0= 'Gateway' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'mac' ( (lv_mac_4_0= RULE_MAC ) ) ( (lv_workers_5_0= ruleWorker ) )+ ) )
            // InternalDeviceDefinition.g:308:2: (otherlv_0= 'Gateway' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'mac' ( (lv_mac_4_0= RULE_MAC ) ) ( (lv_workers_5_0= ruleWorker ) )+ )
            {
            // InternalDeviceDefinition.g:308:2: (otherlv_0= 'Gateway' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'mac' ( (lv_mac_4_0= RULE_MAC ) ) ( (lv_workers_5_0= ruleWorker ) )+ )
            // InternalDeviceDefinition.g:309:3: otherlv_0= 'Gateway' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'mac' ( (lv_mac_4_0= RULE_MAC ) ) ( (lv_workers_5_0= ruleWorker ) )+
            {
            otherlv_0=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getGatewayAccess().getGatewayKeyword_0());
            		
            // InternalDeviceDefinition.g:313:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDeviceDefinition.g:314:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:314:4: (lv_name_1_0= RULE_ID )
            // InternalDeviceDefinition.g:315:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getGatewayAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getGatewayAccess().getMacKeyword_3());
            		
            // InternalDeviceDefinition.g:339:3: ( (lv_mac_4_0= RULE_MAC ) )
            // InternalDeviceDefinition.g:340:4: (lv_mac_4_0= RULE_MAC )
            {
            // InternalDeviceDefinition.g:340:4: (lv_mac_4_0= RULE_MAC )
            // InternalDeviceDefinition.g:341:5: lv_mac_4_0= RULE_MAC
            {
            lv_mac_4_0=(Token)match(input,RULE_MAC,FOLLOW_15); 

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

            // InternalDeviceDefinition.g:357:3: ( (lv_workers_5_0= ruleWorker ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==23) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDeviceDefinition.g:358:4: (lv_workers_5_0= ruleWorker )
            	    {
            	    // InternalDeviceDefinition.g:358:4: (lv_workers_5_0= ruleWorker )
            	    // InternalDeviceDefinition.g:359:5: lv_workers_5_0= ruleWorker
            	    {

            	    					newCompositeNode(grammarAccess.getGatewayAccess().getWorkersWorkerParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_16);
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
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
    // InternalDeviceDefinition.g:380:1: entryRuleWorker returns [EObject current=null] : iv_ruleWorker= ruleWorker EOF ;
    public final EObject entryRuleWorker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorker = null;


        try {
            // InternalDeviceDefinition.g:380:47: (iv_ruleWorker= ruleWorker EOF )
            // InternalDeviceDefinition.g:381:2: iv_ruleWorker= ruleWorker EOF
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
    // InternalDeviceDefinition.g:387:1: ruleWorker returns [EObject current=null] : (otherlv_0= 'Worker' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'mac' ( (lv_mac_4_0= RULE_MAC ) ) (otherlv_5= 'sleep' otherlv_6= 'for' ( (lv_sleepTime_7_0= RULE_INT ) ) ( (lv_timeUnit_8_0= ruleTimeUnit ) ) )? (otherlv_9= 'broadcast' otherlv_10= 'for' ( (lv_broadcastTime_11_0= RULE_INT ) ) ( (lv_timeUnit_12_0= ruleTimeUnit ) ) )? ( (lv_devices_13_0= ruleDevice ) )* ) ;
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
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_broadcastTime_11_0=null;
        EObject lv_timeUnit_8_0 = null;

        EObject lv_timeUnit_12_0 = null;

        EObject lv_devices_13_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:393:2: ( (otherlv_0= 'Worker' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'mac' ( (lv_mac_4_0= RULE_MAC ) ) (otherlv_5= 'sleep' otherlv_6= 'for' ( (lv_sleepTime_7_0= RULE_INT ) ) ( (lv_timeUnit_8_0= ruleTimeUnit ) ) )? (otherlv_9= 'broadcast' otherlv_10= 'for' ( (lv_broadcastTime_11_0= RULE_INT ) ) ( (lv_timeUnit_12_0= ruleTimeUnit ) ) )? ( (lv_devices_13_0= ruleDevice ) )* ) )
            // InternalDeviceDefinition.g:394:2: (otherlv_0= 'Worker' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'mac' ( (lv_mac_4_0= RULE_MAC ) ) (otherlv_5= 'sleep' otherlv_6= 'for' ( (lv_sleepTime_7_0= RULE_INT ) ) ( (lv_timeUnit_8_0= ruleTimeUnit ) ) )? (otherlv_9= 'broadcast' otherlv_10= 'for' ( (lv_broadcastTime_11_0= RULE_INT ) ) ( (lv_timeUnit_12_0= ruleTimeUnit ) ) )? ( (lv_devices_13_0= ruleDevice ) )* )
            {
            // InternalDeviceDefinition.g:394:2: (otherlv_0= 'Worker' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'mac' ( (lv_mac_4_0= RULE_MAC ) ) (otherlv_5= 'sleep' otherlv_6= 'for' ( (lv_sleepTime_7_0= RULE_INT ) ) ( (lv_timeUnit_8_0= ruleTimeUnit ) ) )? (otherlv_9= 'broadcast' otherlv_10= 'for' ( (lv_broadcastTime_11_0= RULE_INT ) ) ( (lv_timeUnit_12_0= ruleTimeUnit ) ) )? ( (lv_devices_13_0= ruleDevice ) )* )
            // InternalDeviceDefinition.g:395:3: otherlv_0= 'Worker' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'mac' ( (lv_mac_4_0= RULE_MAC ) ) (otherlv_5= 'sleep' otherlv_6= 'for' ( (lv_sleepTime_7_0= RULE_INT ) ) ( (lv_timeUnit_8_0= ruleTimeUnit ) ) )? (otherlv_9= 'broadcast' otherlv_10= 'for' ( (lv_broadcastTime_11_0= RULE_INT ) ) ( (lv_timeUnit_12_0= ruleTimeUnit ) ) )? ( (lv_devices_13_0= ruleDevice ) )*
            {
            otherlv_0=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkerAccess().getWorkerKeyword_0());
            		
            // InternalDeviceDefinition.g:399:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDeviceDefinition.g:400:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:400:4: (lv_name_1_0= RULE_ID )
            // InternalDeviceDefinition.g:401:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkerAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getWorkerAccess().getMacKeyword_3());
            		
            // InternalDeviceDefinition.g:425:3: ( (lv_mac_4_0= RULE_MAC ) )
            // InternalDeviceDefinition.g:426:4: (lv_mac_4_0= RULE_MAC )
            {
            // InternalDeviceDefinition.g:426:4: (lv_mac_4_0= RULE_MAC )
            // InternalDeviceDefinition.g:427:5: lv_mac_4_0= RULE_MAC
            {
            lv_mac_4_0=(Token)match(input,RULE_MAC,FOLLOW_17); 

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

            // InternalDeviceDefinition.g:443:3: (otherlv_5= 'sleep' otherlv_6= 'for' ( (lv_sleepTime_7_0= RULE_INT ) ) ( (lv_timeUnit_8_0= ruleTimeUnit ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDeviceDefinition.g:444:4: otherlv_5= 'sleep' otherlv_6= 'for' ( (lv_sleepTime_7_0= RULE_INT ) ) ( (lv_timeUnit_8_0= ruleTimeUnit ) )
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_18); 

                    				newLeafNode(otherlv_5, grammarAccess.getWorkerAccess().getSleepKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,25,FOLLOW_19); 

                    				newLeafNode(otherlv_6, grammarAccess.getWorkerAccess().getForKeyword_5_1());
                    			
                    // InternalDeviceDefinition.g:452:4: ( (lv_sleepTime_7_0= RULE_INT ) )
                    // InternalDeviceDefinition.g:453:5: (lv_sleepTime_7_0= RULE_INT )
                    {
                    // InternalDeviceDefinition.g:453:5: (lv_sleepTime_7_0= RULE_INT )
                    // InternalDeviceDefinition.g:454:6: lv_sleepTime_7_0= RULE_INT
                    {
                    lv_sleepTime_7_0=(Token)match(input,RULE_INT,FOLLOW_20); 

                    						newLeafNode(lv_sleepTime_7_0, grammarAccess.getWorkerAccess().getSleepTimeINTTerminalRuleCall_5_2_0());
                    					

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

                    // InternalDeviceDefinition.g:470:4: ( (lv_timeUnit_8_0= ruleTimeUnit ) )
                    // InternalDeviceDefinition.g:471:5: (lv_timeUnit_8_0= ruleTimeUnit )
                    {
                    // InternalDeviceDefinition.g:471:5: (lv_timeUnit_8_0= ruleTimeUnit )
                    // InternalDeviceDefinition.g:472:6: lv_timeUnit_8_0= ruleTimeUnit
                    {

                    						newCompositeNode(grammarAccess.getWorkerAccess().getTimeUnitTimeUnitParserRuleCall_5_3_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_timeUnit_8_0=ruleTimeUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWorkerRule());
                    						}
                    						add(
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

            // InternalDeviceDefinition.g:490:3: (otherlv_9= 'broadcast' otherlv_10= 'for' ( (lv_broadcastTime_11_0= RULE_INT ) ) ( (lv_timeUnit_12_0= ruleTimeUnit ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDeviceDefinition.g:491:4: otherlv_9= 'broadcast' otherlv_10= 'for' ( (lv_broadcastTime_11_0= RULE_INT ) ) ( (lv_timeUnit_12_0= ruleTimeUnit ) )
                    {
                    otherlv_9=(Token)match(input,26,FOLLOW_18); 

                    				newLeafNode(otherlv_9, grammarAccess.getWorkerAccess().getBroadcastKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,25,FOLLOW_19); 

                    				newLeafNode(otherlv_10, grammarAccess.getWorkerAccess().getForKeyword_6_1());
                    			
                    // InternalDeviceDefinition.g:499:4: ( (lv_broadcastTime_11_0= RULE_INT ) )
                    // InternalDeviceDefinition.g:500:5: (lv_broadcastTime_11_0= RULE_INT )
                    {
                    // InternalDeviceDefinition.g:500:5: (lv_broadcastTime_11_0= RULE_INT )
                    // InternalDeviceDefinition.g:501:6: lv_broadcastTime_11_0= RULE_INT
                    {
                    lv_broadcastTime_11_0=(Token)match(input,RULE_INT,FOLLOW_20); 

                    						newLeafNode(lv_broadcastTime_11_0, grammarAccess.getWorkerAccess().getBroadcastTimeINTTerminalRuleCall_6_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWorkerRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"broadcastTime",
                    							lv_broadcastTime_11_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalDeviceDefinition.g:517:4: ( (lv_timeUnit_12_0= ruleTimeUnit ) )
                    // InternalDeviceDefinition.g:518:5: (lv_timeUnit_12_0= ruleTimeUnit )
                    {
                    // InternalDeviceDefinition.g:518:5: (lv_timeUnit_12_0= ruleTimeUnit )
                    // InternalDeviceDefinition.g:519:6: lv_timeUnit_12_0= ruleTimeUnit
                    {

                    						newCompositeNode(grammarAccess.getWorkerAccess().getTimeUnitTimeUnitParserRuleCall_6_3_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_timeUnit_12_0=ruleTimeUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWorkerRule());
                    						}
                    						add(
                    							current,
                    							"timeUnit",
                    							lv_timeUnit_12_0,
                    							"dk.sdu.gms.dds.DeviceDefinition.TimeUnit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDeviceDefinition.g:537:3: ( (lv_devices_13_0= ruleDevice ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==27||LA6_0==48) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDeviceDefinition.g:538:4: (lv_devices_13_0= ruleDevice )
            	    {
            	    // InternalDeviceDefinition.g:538:4: (lv_devices_13_0= ruleDevice )
            	    // InternalDeviceDefinition.g:539:5: lv_devices_13_0= ruleDevice
            	    {

            	    					newCompositeNode(grammarAccess.getWorkerAccess().getDevicesDeviceParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_devices_13_0=ruleDevice();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWorkerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"devices",
            	    						lv_devices_13_0,
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
    // InternalDeviceDefinition.g:560:1: entryRuleDevice returns [EObject current=null] : iv_ruleDevice= ruleDevice EOF ;
    public final EObject entryRuleDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevice = null;


        try {
            // InternalDeviceDefinition.g:560:47: (iv_ruleDevice= ruleDevice EOF )
            // InternalDeviceDefinition.g:561:2: iv_ruleDevice= ruleDevice EOF
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
    // InternalDeviceDefinition.g:567:1: ruleDevice returns [EObject current=null] : (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) ;
    public final EObject ruleDevice() throws RecognitionException {
        EObject current = null;

        EObject this_Sensor_0 = null;

        EObject this_Actuator_1 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:573:2: ( (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) )
            // InternalDeviceDefinition.g:574:2: (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator )
            {
            // InternalDeviceDefinition.g:574:2: (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            else if ( (LA7_0==48) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDeviceDefinition.g:575:3: this_Sensor_0= ruleSensor
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
                    // InternalDeviceDefinition.g:584:3: this_Actuator_1= ruleActuator
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
    // InternalDeviceDefinition.g:596:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalDeviceDefinition.g:596:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalDeviceDefinition.g:597:2: iv_ruleSensor= ruleSensor EOF
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
    // InternalDeviceDefinition.g:603:1: ruleSensor returns [EObject current=null] : (otherlv_0= 'Sensor' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' otherlv_4= 'pins' ( (lv_pins_5_0= RULE_INT ) )* (otherlv_6= ',' ( (lv_pins_7_0= RULE_INT ) ) )* otherlv_8= 'rate' ( (lv_sampleRate_9_0= rulePrimitive ) ) ( (lv_outputs_10_0= ruleSensorOutput ) )* (otherlv_11= 'behavior' ( (lv_behavior_12_0= ruleSampleBehavior ) ) )? (otherlv_13= 'sample' otherlv_14= 'if' ( (lv_predicate_15_0= ruleExp ) ) )? (otherlv_16= 'graph' ( (otherlv_17= RULE_ID ) ) )? ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_pins_5_0=null;
        Token otherlv_6=null;
        Token lv_pins_7_0=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_sampleRate_9_0 = null;

        EObject lv_outputs_10_0 = null;

        EObject lv_behavior_12_0 = null;

        EObject lv_predicate_15_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:609:2: ( (otherlv_0= 'Sensor' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' otherlv_4= 'pins' ( (lv_pins_5_0= RULE_INT ) )* (otherlv_6= ',' ( (lv_pins_7_0= RULE_INT ) ) )* otherlv_8= 'rate' ( (lv_sampleRate_9_0= rulePrimitive ) ) ( (lv_outputs_10_0= ruleSensorOutput ) )* (otherlv_11= 'behavior' ( (lv_behavior_12_0= ruleSampleBehavior ) ) )? (otherlv_13= 'sample' otherlv_14= 'if' ( (lv_predicate_15_0= ruleExp ) ) )? (otherlv_16= 'graph' ( (otherlv_17= RULE_ID ) ) )? ) )
            // InternalDeviceDefinition.g:610:2: (otherlv_0= 'Sensor' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' otherlv_4= 'pins' ( (lv_pins_5_0= RULE_INT ) )* (otherlv_6= ',' ( (lv_pins_7_0= RULE_INT ) ) )* otherlv_8= 'rate' ( (lv_sampleRate_9_0= rulePrimitive ) ) ( (lv_outputs_10_0= ruleSensorOutput ) )* (otherlv_11= 'behavior' ( (lv_behavior_12_0= ruleSampleBehavior ) ) )? (otherlv_13= 'sample' otherlv_14= 'if' ( (lv_predicate_15_0= ruleExp ) ) )? (otherlv_16= 'graph' ( (otherlv_17= RULE_ID ) ) )? )
            {
            // InternalDeviceDefinition.g:610:2: (otherlv_0= 'Sensor' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' otherlv_4= 'pins' ( (lv_pins_5_0= RULE_INT ) )* (otherlv_6= ',' ( (lv_pins_7_0= RULE_INT ) ) )* otherlv_8= 'rate' ( (lv_sampleRate_9_0= rulePrimitive ) ) ( (lv_outputs_10_0= ruleSensorOutput ) )* (otherlv_11= 'behavior' ( (lv_behavior_12_0= ruleSampleBehavior ) ) )? (otherlv_13= 'sample' otherlv_14= 'if' ( (lv_predicate_15_0= ruleExp ) ) )? (otherlv_16= 'graph' ( (otherlv_17= RULE_ID ) ) )? )
            // InternalDeviceDefinition.g:611:3: otherlv_0= 'Sensor' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' otherlv_4= 'pins' ( (lv_pins_5_0= RULE_INT ) )* (otherlv_6= ',' ( (lv_pins_7_0= RULE_INT ) ) )* otherlv_8= 'rate' ( (lv_sampleRate_9_0= rulePrimitive ) ) ( (lv_outputs_10_0= ruleSensorOutput ) )* (otherlv_11= 'behavior' ( (lv_behavior_12_0= ruleSampleBehavior ) ) )? (otherlv_13= 'sample' otherlv_14= 'if' ( (lv_predicate_15_0= ruleExp ) ) )? (otherlv_16= 'graph' ( (otherlv_17= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorAccess().getSensorKeyword_0());
            		
            // InternalDeviceDefinition.g:615:3: ( (otherlv_1= RULE_ID ) )
            // InternalDeviceDefinition.g:616:4: (otherlv_1= RULE_ID )
            {
            // InternalDeviceDefinition.g:616:4: (otherlv_1= RULE_ID )
            // InternalDeviceDefinition.g:617:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensorRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_1, grammarAccess.getSensorAccess().getTypeImportCrossReference_1_0());
            				

            }


            }

            // InternalDeviceDefinition.g:628:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDeviceDefinition.g:629:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalDeviceDefinition.g:629:4: (lv_name_2_0= RULE_ID )
                    // InternalDeviceDefinition.g:630:5: lv_name_2_0= RULE_ID
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
                    break;

            }

            otherlv_3=(Token)match(input,15,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getSensorAccess().getColonKeyword_3());
            		
            otherlv_4=(Token)match(input,28,FOLLOW_25); 

            			newLeafNode(otherlv_4, grammarAccess.getSensorAccess().getPinsKeyword_4());
            		
            // InternalDeviceDefinition.g:654:3: ( (lv_pins_5_0= RULE_INT ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_INT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDeviceDefinition.g:655:4: (lv_pins_5_0= RULE_INT )
            	    {
            	    // InternalDeviceDefinition.g:655:4: (lv_pins_5_0= RULE_INT )
            	    // InternalDeviceDefinition.g:656:5: lv_pins_5_0= RULE_INT
            	    {
            	    lv_pins_5_0=(Token)match(input,RULE_INT,FOLLOW_25); 

            	    					newLeafNode(lv_pins_5_0, grammarAccess.getSensorAccess().getPinsINTTerminalRuleCall_5_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getSensorRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"pins",
            	    						lv_pins_5_0,
            	    						"org.eclipse.xtext.common.Terminals.INT");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalDeviceDefinition.g:672:3: (otherlv_6= ',' ( (lv_pins_7_0= RULE_INT ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==29) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDeviceDefinition.g:673:4: otherlv_6= ',' ( (lv_pins_7_0= RULE_INT ) )
            	    {
            	    otherlv_6=(Token)match(input,29,FOLLOW_19); 

            	    				newLeafNode(otherlv_6, grammarAccess.getSensorAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalDeviceDefinition.g:677:4: ( (lv_pins_7_0= RULE_INT ) )
            	    // InternalDeviceDefinition.g:678:5: (lv_pins_7_0= RULE_INT )
            	    {
            	    // InternalDeviceDefinition.g:678:5: (lv_pins_7_0= RULE_INT )
            	    // InternalDeviceDefinition.g:679:6: lv_pins_7_0= RULE_INT
            	    {
            	    lv_pins_7_0=(Token)match(input,RULE_INT,FOLLOW_26); 

            	    						newLeafNode(lv_pins_7_0, grammarAccess.getSensorAccess().getPinsINTTerminalRuleCall_6_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSensorRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"pins",
            	    							lv_pins_7_0,
            	    							"org.eclipse.xtext.common.Terminals.INT");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_8=(Token)match(input,30,FOLLOW_27); 

            			newLeafNode(otherlv_8, grammarAccess.getSensorAccess().getRateKeyword_7());
            		
            // InternalDeviceDefinition.g:700:3: ( (lv_sampleRate_9_0= rulePrimitive ) )
            // InternalDeviceDefinition.g:701:4: (lv_sampleRate_9_0= rulePrimitive )
            {
            // InternalDeviceDefinition.g:701:4: (lv_sampleRate_9_0= rulePrimitive )
            // InternalDeviceDefinition.g:702:5: lv_sampleRate_9_0= rulePrimitive
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getSampleRatePrimitiveParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_28);
            lv_sampleRate_9_0=rulePrimitive();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"sampleRate",
            						lv_sampleRate_9_0,
            						"dk.sdu.gms.dds.DeviceDefinition.Primitive");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDeviceDefinition.g:719:3: ( (lv_outputs_10_0= ruleSensorOutput ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==44) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDeviceDefinition.g:720:4: (lv_outputs_10_0= ruleSensorOutput )
            	    {
            	    // InternalDeviceDefinition.g:720:4: (lv_outputs_10_0= ruleSensorOutput )
            	    // InternalDeviceDefinition.g:721:5: lv_outputs_10_0= ruleSensorOutput
            	    {

            	    					newCompositeNode(grammarAccess.getSensorAccess().getOutputsSensorOutputParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_outputs_10_0=ruleSensorOutput();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSensorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"outputs",
            	    						lv_outputs_10_0,
            	    						"dk.sdu.gms.dds.DeviceDefinition.SensorOutput");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalDeviceDefinition.g:738:3: (otherlv_11= 'behavior' ( (lv_behavior_12_0= ruleSampleBehavior ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDeviceDefinition.g:739:4: otherlv_11= 'behavior' ( (lv_behavior_12_0= ruleSampleBehavior ) )
                    {
                    otherlv_11=(Token)match(input,31,FOLLOW_7); 

                    				newLeafNode(otherlv_11, grammarAccess.getSensorAccess().getBehaviorKeyword_10_0());
                    			
                    // InternalDeviceDefinition.g:743:4: ( (lv_behavior_12_0= ruleSampleBehavior ) )
                    // InternalDeviceDefinition.g:744:5: (lv_behavior_12_0= ruleSampleBehavior )
                    {
                    // InternalDeviceDefinition.g:744:5: (lv_behavior_12_0= ruleSampleBehavior )
                    // InternalDeviceDefinition.g:745:6: lv_behavior_12_0= ruleSampleBehavior
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getBehaviorSampleBehaviorParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_behavior_12_0=ruleSampleBehavior();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						add(
                    							current,
                    							"behavior",
                    							lv_behavior_12_0,
                    							"dk.sdu.gms.dds.DeviceDefinition.SampleBehavior");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDeviceDefinition.g:763:3: (otherlv_13= 'sample' otherlv_14= 'if' ( (lv_predicate_15_0= ruleExp ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDeviceDefinition.g:764:4: otherlv_13= 'sample' otherlv_14= 'if' ( (lv_predicate_15_0= ruleExp ) )
                    {
                    otherlv_13=(Token)match(input,32,FOLLOW_30); 

                    				newLeafNode(otherlv_13, grammarAccess.getSensorAccess().getSampleKeyword_11_0());
                    			
                    otherlv_14=(Token)match(input,33,FOLLOW_31); 

                    				newLeafNode(otherlv_14, grammarAccess.getSensorAccess().getIfKeyword_11_1());
                    			
                    // InternalDeviceDefinition.g:772:4: ( (lv_predicate_15_0= ruleExp ) )
                    // InternalDeviceDefinition.g:773:5: (lv_predicate_15_0= ruleExp )
                    {
                    // InternalDeviceDefinition.g:773:5: (lv_predicate_15_0= ruleExp )
                    // InternalDeviceDefinition.g:774:6: lv_predicate_15_0= ruleExp
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getPredicateExpParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_predicate_15_0=ruleExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						add(
                    							current,
                    							"predicate",
                    							lv_predicate_15_0,
                    							"dk.sdu.gms.dds.DeviceDefinition.Exp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDeviceDefinition.g:792:3: (otherlv_16= 'graph' ( (otherlv_17= RULE_ID ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDeviceDefinition.g:793:4: otherlv_16= 'graph' ( (otherlv_17= RULE_ID ) )
                    {
                    otherlv_16=(Token)match(input,34,FOLLOW_7); 

                    				newLeafNode(otherlv_16, grammarAccess.getSensorAccess().getGraphKeyword_12_0());
                    			
                    // InternalDeviceDefinition.g:797:4: ( (otherlv_17= RULE_ID ) )
                    // InternalDeviceDefinition.g:798:5: (otherlv_17= RULE_ID )
                    {
                    // InternalDeviceDefinition.g:798:5: (otherlv_17= RULE_ID )
                    // InternalDeviceDefinition.g:799:6: otherlv_17= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSensorRule());
                    						}
                    					
                    otherlv_17=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_17, grammarAccess.getSensorAccess().getGraphGraphCrossReference_12_1_0());
                    					

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


    // $ANTLR start "entryRuleSampleBehavior"
    // InternalDeviceDefinition.g:815:1: entryRuleSampleBehavior returns [EObject current=null] : iv_ruleSampleBehavior= ruleSampleBehavior EOF ;
    public final EObject entryRuleSampleBehavior() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSampleBehavior = null;


        try {
            // InternalDeviceDefinition.g:815:55: (iv_ruleSampleBehavior= ruleSampleBehavior EOF )
            // InternalDeviceDefinition.g:816:2: iv_ruleSampleBehavior= ruleSampleBehavior EOF
            {
             newCompositeNode(grammarAccess.getSampleBehaviorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSampleBehavior=ruleSampleBehavior();

            state._fsp--;

             current =iv_ruleSampleBehavior; 
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
    // $ANTLR end "entryRuleSampleBehavior"


    // $ANTLR start "ruleSampleBehavior"
    // InternalDeviceDefinition.g:822:1: ruleSampleBehavior returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= rulePrimary ) )* (otherlv_3= ',' ( (lv_pins_4_0= rulePrimary ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleSampleBehavior() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_args_2_0 = null;

        EObject lv_pins_4_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:828:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= rulePrimary ) )* (otherlv_3= ',' ( (lv_pins_4_0= rulePrimary ) ) )* otherlv_5= ')' ) )
            // InternalDeviceDefinition.g:829:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= rulePrimary ) )* (otherlv_3= ',' ( (lv_pins_4_0= rulePrimary ) ) )* otherlv_5= ')' )
            {
            // InternalDeviceDefinition.g:829:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= rulePrimary ) )* (otherlv_3= ',' ( (lv_pins_4_0= rulePrimary ) ) )* otherlv_5= ')' )
            // InternalDeviceDefinition.g:830:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= rulePrimary ) )* (otherlv_3= ',' ( (lv_pins_4_0= rulePrimary ) ) )* otherlv_5= ')'
            {
            // InternalDeviceDefinition.g:830:3: ( (otherlv_0= RULE_ID ) )
            // InternalDeviceDefinition.g:831:4: (otherlv_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:831:4: (otherlv_0= RULE_ID )
            // InternalDeviceDefinition.g:832:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSampleBehaviorRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(otherlv_0, grammarAccess.getSampleBehaviorAccess().getTypeImportCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getSampleBehaviorAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDeviceDefinition.g:847:3: ( (lv_args_2_0= rulePrimary ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||(LA15_0>=RULE_INT && LA15_0<=RULE_DECIMAL)||LA15_0==35||(LA15_0>=53 && LA15_0<=54)||LA15_0==67) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDeviceDefinition.g:848:4: (lv_args_2_0= rulePrimary )
            	    {
            	    // InternalDeviceDefinition.g:848:4: (lv_args_2_0= rulePrimary )
            	    // InternalDeviceDefinition.g:849:5: lv_args_2_0= rulePrimary
            	    {

            	    					newCompositeNode(grammarAccess.getSampleBehaviorAccess().getArgsPrimaryParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_34);
            	    lv_args_2_0=rulePrimary();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSampleBehaviorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"args",
            	    						lv_args_2_0,
            	    						"dk.sdu.gms.dds.DeviceDefinition.Primary");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalDeviceDefinition.g:866:3: (otherlv_3= ',' ( (lv_pins_4_0= rulePrimary ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==29) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDeviceDefinition.g:867:4: otherlv_3= ',' ( (lv_pins_4_0= rulePrimary ) )
            	    {
            	    otherlv_3=(Token)match(input,29,FOLLOW_31); 

            	    				newLeafNode(otherlv_3, grammarAccess.getSampleBehaviorAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalDeviceDefinition.g:871:4: ( (lv_pins_4_0= rulePrimary ) )
            	    // InternalDeviceDefinition.g:872:5: (lv_pins_4_0= rulePrimary )
            	    {
            	    // InternalDeviceDefinition.g:872:5: (lv_pins_4_0= rulePrimary )
            	    // InternalDeviceDefinition.g:873:6: lv_pins_4_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getSampleBehaviorAccess().getPinsPrimaryParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_35);
            	    lv_pins_4_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSampleBehaviorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"pins",
            	    							lv_pins_4_0,
            	    							"dk.sdu.gms.dds.DeviceDefinition.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_5=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSampleBehaviorAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleSampleBehavior"


    // $ANTLR start "entryRuleTimeUnit"
    // InternalDeviceDefinition.g:899:1: entryRuleTimeUnit returns [EObject current=null] : iv_ruleTimeUnit= ruleTimeUnit EOF ;
    public final EObject entryRuleTimeUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeUnit = null;


        try {
            // InternalDeviceDefinition.g:899:49: (iv_ruleTimeUnit= ruleTimeUnit EOF )
            // InternalDeviceDefinition.g:900:2: iv_ruleTimeUnit= ruleTimeUnit EOF
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
    // InternalDeviceDefinition.g:906:1: ruleTimeUnit returns [EObject current=null] : ( ( () (otherlv_1= 'second' | otherlv_2= 'seconds' ) ) | ( () (otherlv_4= 'minute' | otherlv_5= 'minutes' ) ) | ( () (otherlv_7= 'hour' | otherlv_8= 'hours' ) ) ) ;
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
            // InternalDeviceDefinition.g:912:2: ( ( ( () (otherlv_1= 'second' | otherlv_2= 'seconds' ) ) | ( () (otherlv_4= 'minute' | otherlv_5= 'minutes' ) ) | ( () (otherlv_7= 'hour' | otherlv_8= 'hours' ) ) ) )
            // InternalDeviceDefinition.g:913:2: ( ( () (otherlv_1= 'second' | otherlv_2= 'seconds' ) ) | ( () (otherlv_4= 'minute' | otherlv_5= 'minutes' ) ) | ( () (otherlv_7= 'hour' | otherlv_8= 'hours' ) ) )
            {
            // InternalDeviceDefinition.g:913:2: ( ( () (otherlv_1= 'second' | otherlv_2= 'seconds' ) ) | ( () (otherlv_4= 'minute' | otherlv_5= 'minutes' ) ) | ( () (otherlv_7= 'hour' | otherlv_8= 'hours' ) ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 37:
            case 38:
                {
                alt20=1;
                }
                break;
            case 39:
            case 40:
                {
                alt20=2;
                }
                break;
            case 41:
            case 42:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalDeviceDefinition.g:914:3: ( () (otherlv_1= 'second' | otherlv_2= 'seconds' ) )
                    {
                    // InternalDeviceDefinition.g:914:3: ( () (otherlv_1= 'second' | otherlv_2= 'seconds' ) )
                    // InternalDeviceDefinition.g:915:4: () (otherlv_1= 'second' | otherlv_2= 'seconds' )
                    {
                    // InternalDeviceDefinition.g:915:4: ()
                    // InternalDeviceDefinition.g:916:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTimeUnitAccess().getSecondAction_0_0(),
                    						current);
                    				

                    }

                    // InternalDeviceDefinition.g:922:4: (otherlv_1= 'second' | otherlv_2= 'seconds' )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==37) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==38) ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalDeviceDefinition.g:923:5: otherlv_1= 'second'
                            {
                            otherlv_1=(Token)match(input,37,FOLLOW_2); 

                            					newLeafNode(otherlv_1, grammarAccess.getTimeUnitAccess().getSecondKeyword_0_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDeviceDefinition.g:928:5: otherlv_2= 'seconds'
                            {
                            otherlv_2=(Token)match(input,38,FOLLOW_2); 

                            					newLeafNode(otherlv_2, grammarAccess.getTimeUnitAccess().getSecondsKeyword_0_1_1());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDeviceDefinition.g:935:3: ( () (otherlv_4= 'minute' | otherlv_5= 'minutes' ) )
                    {
                    // InternalDeviceDefinition.g:935:3: ( () (otherlv_4= 'minute' | otherlv_5= 'minutes' ) )
                    // InternalDeviceDefinition.g:936:4: () (otherlv_4= 'minute' | otherlv_5= 'minutes' )
                    {
                    // InternalDeviceDefinition.g:936:4: ()
                    // InternalDeviceDefinition.g:937:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTimeUnitAccess().getMinuteAction_1_0(),
                    						current);
                    				

                    }

                    // InternalDeviceDefinition.g:943:4: (otherlv_4= 'minute' | otherlv_5= 'minutes' )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==39) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==40) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalDeviceDefinition.g:944:5: otherlv_4= 'minute'
                            {
                            otherlv_4=(Token)match(input,39,FOLLOW_2); 

                            					newLeafNode(otherlv_4, grammarAccess.getTimeUnitAccess().getMinuteKeyword_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDeviceDefinition.g:949:5: otherlv_5= 'minutes'
                            {
                            otherlv_5=(Token)match(input,40,FOLLOW_2); 

                            					newLeafNode(otherlv_5, grammarAccess.getTimeUnitAccess().getMinutesKeyword_1_1_1());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDeviceDefinition.g:956:3: ( () (otherlv_7= 'hour' | otherlv_8= 'hours' ) )
                    {
                    // InternalDeviceDefinition.g:956:3: ( () (otherlv_7= 'hour' | otherlv_8= 'hours' ) )
                    // InternalDeviceDefinition.g:957:4: () (otherlv_7= 'hour' | otherlv_8= 'hours' )
                    {
                    // InternalDeviceDefinition.g:957:4: ()
                    // InternalDeviceDefinition.g:958:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTimeUnitAccess().getHourAction_2_0(),
                    						current);
                    				

                    }

                    // InternalDeviceDefinition.g:964:4: (otherlv_7= 'hour' | otherlv_8= 'hours' )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==41) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==42) ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalDeviceDefinition.g:965:5: otherlv_7= 'hour'
                            {
                            otherlv_7=(Token)match(input,41,FOLLOW_2); 

                            					newLeafNode(otherlv_7, grammarAccess.getTimeUnitAccess().getHourKeyword_2_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDeviceDefinition.g:970:5: otherlv_8= 'hours'
                            {
                            otherlv_8=(Token)match(input,42,FOLLOW_2); 

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


    // $ANTLR start "entryRuleBinding"
    // InternalDeviceDefinition.g:980:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // InternalDeviceDefinition.g:980:48: (iv_ruleBinding= ruleBinding EOF )
            // InternalDeviceDefinition.g:981:2: iv_ruleBinding= ruleBinding EOF
            {
             newCompositeNode(grammarAccess.getBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinding=ruleBinding();

            state._fsp--;

             current =iv_ruleBinding; 
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
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // InternalDeviceDefinition.g:987:1: ruleBinding returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDeviceDefinition.g:993:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalDeviceDefinition.g:994:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalDeviceDefinition.g:994:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDeviceDefinition.g:995:3: (lv_name_0_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:995:3: (lv_name_0_0= RULE_ID )
            // InternalDeviceDefinition.g:996:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getBindingAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBindingRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleImport"
    // InternalDeviceDefinition.g:1015:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalDeviceDefinition.g:1015:47: (iv_ruleImport= ruleImport EOF )
            // InternalDeviceDefinition.g:1016:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalDeviceDefinition.g:1022:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDeviceDefinition.g:1028:2: ( (otherlv_0= 'import' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalDeviceDefinition.g:1029:2: (otherlv_0= 'import' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalDeviceDefinition.g:1029:2: (otherlv_0= 'import' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalDeviceDefinition.g:1030:3: otherlv_0= 'import' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalDeviceDefinition.g:1034:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDeviceDefinition.g:1035:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:1035:4: (lv_name_1_0= RULE_ID )
            // InternalDeviceDefinition.g:1036:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getImportAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleSensorOutput"
    // InternalDeviceDefinition.g:1056:1: entryRuleSensorOutput returns [EObject current=null] : iv_ruleSensorOutput= ruleSensorOutput EOF ;
    public final EObject entryRuleSensorOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorOutput = null;


        try {
            // InternalDeviceDefinition.g:1056:53: (iv_ruleSensorOutput= ruleSensorOutput EOF )
            // InternalDeviceDefinition.g:1057:2: iv_ruleSensorOutput= ruleSensorOutput EOF
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
    // InternalDeviceDefinition.g:1063:1: ruleSensorOutput returns [EObject current=null] : (otherlv_0= 'out' ( (lv_output_1_0= RULE_STRING ) )? otherlv_2= 'as' ( (lv_binding_3_0= ruleBinding ) ) (otherlv_4= 'with' otherlv_5= 'mapping' ( (lv_mapping_6_0= ruleExp ) ) )? ) ;
    public final EObject ruleSensorOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_output_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_binding_3_0 = null;

        EObject lv_mapping_6_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:1069:2: ( (otherlv_0= 'out' ( (lv_output_1_0= RULE_STRING ) )? otherlv_2= 'as' ( (lv_binding_3_0= ruleBinding ) ) (otherlv_4= 'with' otherlv_5= 'mapping' ( (lv_mapping_6_0= ruleExp ) ) )? ) )
            // InternalDeviceDefinition.g:1070:2: (otherlv_0= 'out' ( (lv_output_1_0= RULE_STRING ) )? otherlv_2= 'as' ( (lv_binding_3_0= ruleBinding ) ) (otherlv_4= 'with' otherlv_5= 'mapping' ( (lv_mapping_6_0= ruleExp ) ) )? )
            {
            // InternalDeviceDefinition.g:1070:2: (otherlv_0= 'out' ( (lv_output_1_0= RULE_STRING ) )? otherlv_2= 'as' ( (lv_binding_3_0= ruleBinding ) ) (otherlv_4= 'with' otherlv_5= 'mapping' ( (lv_mapping_6_0= ruleExp ) ) )? )
            // InternalDeviceDefinition.g:1071:3: otherlv_0= 'out' ( (lv_output_1_0= RULE_STRING ) )? otherlv_2= 'as' ( (lv_binding_3_0= ruleBinding ) ) (otherlv_4= 'with' otherlv_5= 'mapping' ( (lv_mapping_6_0= ruleExp ) ) )?
            {
            otherlv_0=(Token)match(input,44,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorOutputAccess().getOutKeyword_0());
            		
            // InternalDeviceDefinition.g:1075:3: ( (lv_output_1_0= RULE_STRING ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDeviceDefinition.g:1076:4: (lv_output_1_0= RULE_STRING )
                    {
                    // InternalDeviceDefinition.g:1076:4: (lv_output_1_0= RULE_STRING )
                    // InternalDeviceDefinition.g:1077:5: lv_output_1_0= RULE_STRING
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

            otherlv_2=(Token)match(input,45,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getSensorOutputAccess().getAsKeyword_2());
            		
            // InternalDeviceDefinition.g:1097:3: ( (lv_binding_3_0= ruleBinding ) )
            // InternalDeviceDefinition.g:1098:4: (lv_binding_3_0= ruleBinding )
            {
            // InternalDeviceDefinition.g:1098:4: (lv_binding_3_0= ruleBinding )
            // InternalDeviceDefinition.g:1099:5: lv_binding_3_0= ruleBinding
            {

            					newCompositeNode(grammarAccess.getSensorOutputAccess().getBindingBindingParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_38);
            lv_binding_3_0=ruleBinding();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorOutputRule());
            					}
            					set(
            						current,
            						"binding",
            						lv_binding_3_0,
            						"dk.sdu.gms.dds.DeviceDefinition.Binding");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDeviceDefinition.g:1116:3: (otherlv_4= 'with' otherlv_5= 'mapping' ( (lv_mapping_6_0= ruleExp ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==46) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDeviceDefinition.g:1117:4: otherlv_4= 'with' otherlv_5= 'mapping' ( (lv_mapping_6_0= ruleExp ) )
                    {
                    otherlv_4=(Token)match(input,46,FOLLOW_39); 

                    				newLeafNode(otherlv_4, grammarAccess.getSensorOutputAccess().getWithKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,47,FOLLOW_31); 

                    				newLeafNode(otherlv_5, grammarAccess.getSensorOutputAccess().getMappingKeyword_4_1());
                    			
                    // InternalDeviceDefinition.g:1125:4: ( (lv_mapping_6_0= ruleExp ) )
                    // InternalDeviceDefinition.g:1126:5: (lv_mapping_6_0= ruleExp )
                    {
                    // InternalDeviceDefinition.g:1126:5: (lv_mapping_6_0= ruleExp )
                    // InternalDeviceDefinition.g:1127:6: lv_mapping_6_0= ruleExp
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
    // InternalDeviceDefinition.g:1149:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // InternalDeviceDefinition.g:1149:49: (iv_ruleActuator= ruleActuator EOF )
            // InternalDeviceDefinition.g:1150:2: iv_ruleActuator= ruleActuator EOF
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
    // InternalDeviceDefinition.g:1156:1: ruleActuator returns [EObject current=null] : (otherlv_0= 'Actuator' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' otherlv_4= 'pins' ( (lv_pins_5_0= RULE_INT ) )* (otherlv_6= ',' ( (lv_pins_7_0= RULE_INT ) ) )* ( (lv_settings_8_0= ruleSetting ) )* otherlv_9= 'trigger' otherlv_10= 'on' ( (lv_exp_11_0= ruleExp ) ) ) ;
    public final EObject ruleActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_pins_5_0=null;
        Token otherlv_6=null;
        Token lv_pins_7_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_settings_8_0 = null;

        EObject lv_exp_11_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:1162:2: ( (otherlv_0= 'Actuator' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' otherlv_4= 'pins' ( (lv_pins_5_0= RULE_INT ) )* (otherlv_6= ',' ( (lv_pins_7_0= RULE_INT ) ) )* ( (lv_settings_8_0= ruleSetting ) )* otherlv_9= 'trigger' otherlv_10= 'on' ( (lv_exp_11_0= ruleExp ) ) ) )
            // InternalDeviceDefinition.g:1163:2: (otherlv_0= 'Actuator' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' otherlv_4= 'pins' ( (lv_pins_5_0= RULE_INT ) )* (otherlv_6= ',' ( (lv_pins_7_0= RULE_INT ) ) )* ( (lv_settings_8_0= ruleSetting ) )* otherlv_9= 'trigger' otherlv_10= 'on' ( (lv_exp_11_0= ruleExp ) ) )
            {
            // InternalDeviceDefinition.g:1163:2: (otherlv_0= 'Actuator' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' otherlv_4= 'pins' ( (lv_pins_5_0= RULE_INT ) )* (otherlv_6= ',' ( (lv_pins_7_0= RULE_INT ) ) )* ( (lv_settings_8_0= ruleSetting ) )* otherlv_9= 'trigger' otherlv_10= 'on' ( (lv_exp_11_0= ruleExp ) ) )
            // InternalDeviceDefinition.g:1164:3: otherlv_0= 'Actuator' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' otherlv_4= 'pins' ( (lv_pins_5_0= RULE_INT ) )* (otherlv_6= ',' ( (lv_pins_7_0= RULE_INT ) ) )* ( (lv_settings_8_0= ruleSetting ) )* otherlv_9= 'trigger' otherlv_10= 'on' ( (lv_exp_11_0= ruleExp ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getActuatorAccess().getActuatorKeyword_0());
            		
            // InternalDeviceDefinition.g:1168:3: ( (otherlv_1= RULE_ID ) )
            // InternalDeviceDefinition.g:1169:4: (otherlv_1= RULE_ID )
            {
            // InternalDeviceDefinition.g:1169:4: (otherlv_1= RULE_ID )
            // InternalDeviceDefinition.g:1170:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActuatorRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_1, grammarAccess.getActuatorAccess().getTypeImportCrossReference_1_0());
            				

            }


            }

            // InternalDeviceDefinition.g:1181:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDeviceDefinition.g:1182:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalDeviceDefinition.g:1182:4: (lv_name_2_0= RULE_ID )
                    // InternalDeviceDefinition.g:1183:5: lv_name_2_0= RULE_ID
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
                    break;

            }

            otherlv_3=(Token)match(input,15,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getActuatorAccess().getColonKeyword_3());
            		
            otherlv_4=(Token)match(input,28,FOLLOW_40); 

            			newLeafNode(otherlv_4, grammarAccess.getActuatorAccess().getPinsKeyword_4());
            		
            // InternalDeviceDefinition.g:1207:3: ( (lv_pins_5_0= RULE_INT ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_INT) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalDeviceDefinition.g:1208:4: (lv_pins_5_0= RULE_INT )
            	    {
            	    // InternalDeviceDefinition.g:1208:4: (lv_pins_5_0= RULE_INT )
            	    // InternalDeviceDefinition.g:1209:5: lv_pins_5_0= RULE_INT
            	    {
            	    lv_pins_5_0=(Token)match(input,RULE_INT,FOLLOW_40); 

            	    					newLeafNode(lv_pins_5_0, grammarAccess.getActuatorAccess().getPinsINTTerminalRuleCall_5_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getActuatorRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"pins",
            	    						lv_pins_5_0,
            	    						"org.eclipse.xtext.common.Terminals.INT");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // InternalDeviceDefinition.g:1225:3: (otherlv_6= ',' ( (lv_pins_7_0= RULE_INT ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==29) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalDeviceDefinition.g:1226:4: otherlv_6= ',' ( (lv_pins_7_0= RULE_INT ) )
            	    {
            	    otherlv_6=(Token)match(input,29,FOLLOW_19); 

            	    				newLeafNode(otherlv_6, grammarAccess.getActuatorAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalDeviceDefinition.g:1230:4: ( (lv_pins_7_0= RULE_INT ) )
            	    // InternalDeviceDefinition.g:1231:5: (lv_pins_7_0= RULE_INT )
            	    {
            	    // InternalDeviceDefinition.g:1231:5: (lv_pins_7_0= RULE_INT )
            	    // InternalDeviceDefinition.g:1232:6: lv_pins_7_0= RULE_INT
            	    {
            	    lv_pins_7_0=(Token)match(input,RULE_INT,FOLLOW_41); 

            	    						newLeafNode(lv_pins_7_0, grammarAccess.getActuatorAccess().getPinsINTTerminalRuleCall_6_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getActuatorRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"pins",
            	    							lv_pins_7_0,
            	    							"org.eclipse.xtext.common.Terminals.INT");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // InternalDeviceDefinition.g:1249:3: ( (lv_settings_8_0= ruleSetting ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==51) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalDeviceDefinition.g:1250:4: (lv_settings_8_0= ruleSetting )
            	    {
            	    // InternalDeviceDefinition.g:1250:4: (lv_settings_8_0= ruleSetting )
            	    // InternalDeviceDefinition.g:1251:5: lv_settings_8_0= ruleSetting
            	    {

            	    					newCompositeNode(grammarAccess.getActuatorAccess().getSettingsSettingParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_42);
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
            	    break loop26;
                }
            } while (true);

            otherlv_9=(Token)match(input,49,FOLLOW_43); 

            			newLeafNode(otherlv_9, grammarAccess.getActuatorAccess().getTriggerKeyword_8());
            		
            otherlv_10=(Token)match(input,50,FOLLOW_31); 

            			newLeafNode(otherlv_10, grammarAccess.getActuatorAccess().getOnKeyword_9());
            		
            // InternalDeviceDefinition.g:1276:3: ( (lv_exp_11_0= ruleExp ) )
            // InternalDeviceDefinition.g:1277:4: (lv_exp_11_0= ruleExp )
            {
            // InternalDeviceDefinition.g:1277:4: (lv_exp_11_0= ruleExp )
            // InternalDeviceDefinition.g:1278:5: lv_exp_11_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getActuatorAccess().getExpExpParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_11_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActuatorRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_11_0,
            						"dk.sdu.gms.dds.DeviceDefinition.Exp");
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


    // $ANTLR start "entryRuleSetting"
    // InternalDeviceDefinition.g:1299:1: entryRuleSetting returns [EObject current=null] : iv_ruleSetting= ruleSetting EOF ;
    public final EObject entryRuleSetting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetting = null;


        try {
            // InternalDeviceDefinition.g:1299:48: (iv_ruleSetting= ruleSetting EOF )
            // InternalDeviceDefinition.g:1300:2: iv_ruleSetting= ruleSetting EOF
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
    // InternalDeviceDefinition.g:1306:1: ruleSetting returns [EObject current=null] : (otherlv_0= 'setting' ( (lv_binding_1_0= ruleBinding ) ) otherlv_2= '=' ( (lv_value_3_0= rulePrimitive ) ) ) ;
    public final EObject ruleSetting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_binding_1_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:1312:2: ( (otherlv_0= 'setting' ( (lv_binding_1_0= ruleBinding ) ) otherlv_2= '=' ( (lv_value_3_0= rulePrimitive ) ) ) )
            // InternalDeviceDefinition.g:1313:2: (otherlv_0= 'setting' ( (lv_binding_1_0= ruleBinding ) ) otherlv_2= '=' ( (lv_value_3_0= rulePrimitive ) ) )
            {
            // InternalDeviceDefinition.g:1313:2: (otherlv_0= 'setting' ( (lv_binding_1_0= ruleBinding ) ) otherlv_2= '=' ( (lv_value_3_0= rulePrimitive ) ) )
            // InternalDeviceDefinition.g:1314:3: otherlv_0= 'setting' ( (lv_binding_1_0= ruleBinding ) ) otherlv_2= '=' ( (lv_value_3_0= rulePrimitive ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getSettingAccess().getSettingKeyword_0());
            		
            // InternalDeviceDefinition.g:1318:3: ( (lv_binding_1_0= ruleBinding ) )
            // InternalDeviceDefinition.g:1319:4: (lv_binding_1_0= ruleBinding )
            {
            // InternalDeviceDefinition.g:1319:4: (lv_binding_1_0= ruleBinding )
            // InternalDeviceDefinition.g:1320:5: lv_binding_1_0= ruleBinding
            {

            					newCompositeNode(grammarAccess.getSettingAccess().getBindingBindingParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_44);
            lv_binding_1_0=ruleBinding();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSettingRule());
            					}
            					set(
            						current,
            						"binding",
            						lv_binding_1_0,
            						"dk.sdu.gms.dds.DeviceDefinition.Binding");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,52,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getSettingAccess().getEqualsSignKeyword_2());
            		
            // InternalDeviceDefinition.g:1341:3: ( (lv_value_3_0= rulePrimitive ) )
            // InternalDeviceDefinition.g:1342:4: (lv_value_3_0= rulePrimitive )
            {
            // InternalDeviceDefinition.g:1342:4: (lv_value_3_0= rulePrimitive )
            // InternalDeviceDefinition.g:1343:5: lv_value_3_0= rulePrimitive
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
    // InternalDeviceDefinition.g:1364:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // InternalDeviceDefinition.g:1364:50: (iv_rulePrimitive= rulePrimitive EOF )
            // InternalDeviceDefinition.g:1365:2: iv_rulePrimitive= rulePrimitive EOF
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
    // InternalDeviceDefinition.g:1371:1: rulePrimitive returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_DECIMAL ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () otherlv_5= 'TRUE' ) | ( () otherlv_7= 'FALSE' ) ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalDeviceDefinition.g:1377:2: ( ( ( () ( (lv_value_1_0= RULE_DECIMAL ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () otherlv_5= 'TRUE' ) | ( () otherlv_7= 'FALSE' ) ) )
            // InternalDeviceDefinition.g:1378:2: ( ( () ( (lv_value_1_0= RULE_DECIMAL ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () otherlv_5= 'TRUE' ) | ( () otherlv_7= 'FALSE' ) )
            {
            // InternalDeviceDefinition.g:1378:2: ( ( () ( (lv_value_1_0= RULE_DECIMAL ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () otherlv_5= 'TRUE' ) | ( () otherlv_7= 'FALSE' ) )
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
            case 53:
                {
                alt27=3;
                }
                break;
            case 54:
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
                    // InternalDeviceDefinition.g:1379:3: ( () ( (lv_value_1_0= RULE_DECIMAL ) ) )
                    {
                    // InternalDeviceDefinition.g:1379:3: ( () ( (lv_value_1_0= RULE_DECIMAL ) ) )
                    // InternalDeviceDefinition.g:1380:4: () ( (lv_value_1_0= RULE_DECIMAL ) )
                    {
                    // InternalDeviceDefinition.g:1380:4: ()
                    // InternalDeviceDefinition.g:1381:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimitiveAccess().getDecimalPrimitiveAction_0_0(),
                    						current);
                    				

                    }

                    // InternalDeviceDefinition.g:1387:4: ( (lv_value_1_0= RULE_DECIMAL ) )
                    // InternalDeviceDefinition.g:1388:5: (lv_value_1_0= RULE_DECIMAL )
                    {
                    // InternalDeviceDefinition.g:1388:5: (lv_value_1_0= RULE_DECIMAL )
                    // InternalDeviceDefinition.g:1389:6: lv_value_1_0= RULE_DECIMAL
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
                    // InternalDeviceDefinition.g:1407:3: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    {
                    // InternalDeviceDefinition.g:1407:3: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    // InternalDeviceDefinition.g:1408:4: () ( (lv_value_3_0= RULE_INT ) )
                    {
                    // InternalDeviceDefinition.g:1408:4: ()
                    // InternalDeviceDefinition.g:1409:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimitiveAccess().getIntPrimitiveAction_1_0(),
                    						current);
                    				

                    }

                    // InternalDeviceDefinition.g:1415:4: ( (lv_value_3_0= RULE_INT ) )
                    // InternalDeviceDefinition.g:1416:5: (lv_value_3_0= RULE_INT )
                    {
                    // InternalDeviceDefinition.g:1416:5: (lv_value_3_0= RULE_INT )
                    // InternalDeviceDefinition.g:1417:6: lv_value_3_0= RULE_INT
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
                    // InternalDeviceDefinition.g:1435:3: ( () otherlv_5= 'TRUE' )
                    {
                    // InternalDeviceDefinition.g:1435:3: ( () otherlv_5= 'TRUE' )
                    // InternalDeviceDefinition.g:1436:4: () otherlv_5= 'TRUE'
                    {
                    // InternalDeviceDefinition.g:1436:4: ()
                    // InternalDeviceDefinition.g:1437:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimitiveAccess().getBooleanTrueAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,53,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrimitiveAccess().getTRUEKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDeviceDefinition.g:1449:3: ( () otherlv_7= 'FALSE' )
                    {
                    // InternalDeviceDefinition.g:1449:3: ( () otherlv_7= 'FALSE' )
                    // InternalDeviceDefinition.g:1450:4: () otherlv_7= 'FALSE'
                    {
                    // InternalDeviceDefinition.g:1450:4: ()
                    // InternalDeviceDefinition.g:1451:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimitiveAccess().getBooleanFalseAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,54,FOLLOW_2); 

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
    // InternalDeviceDefinition.g:1466:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalDeviceDefinition.g:1466:44: (iv_ruleExp= ruleExp EOF )
            // InternalDeviceDefinition.g:1467:2: iv_ruleExp= ruleExp EOF
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
    // InternalDeviceDefinition.g:1473:1: ruleExp returns [EObject current=null] : (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Factor_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:1479:2: ( (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) )
            // InternalDeviceDefinition.g:1480:2: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            {
            // InternalDeviceDefinition.g:1480:2: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            // InternalDeviceDefinition.g:1481:3: this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_45);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDeviceDefinition.g:1489:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=55 && LA29_0<=56)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalDeviceDefinition.g:1490:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) )
            	    {
            	    // InternalDeviceDefinition.g:1490:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==55) ) {
            	        alt28=1;
            	    }
            	    else if ( (LA28_0==56) ) {
            	        alt28=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // InternalDeviceDefinition.g:1491:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalDeviceDefinition.g:1491:5: ( () otherlv_2= '+' )
            	            // InternalDeviceDefinition.g:1492:6: () otherlv_2= '+'
            	            {
            	            // InternalDeviceDefinition.g:1492:6: ()
            	            // InternalDeviceDefinition.g:1493:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,55,FOLLOW_31); 

            	            						newLeafNode(otherlv_2, grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDeviceDefinition.g:1505:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalDeviceDefinition.g:1505:5: ( () otherlv_4= '-' )
            	            // InternalDeviceDefinition.g:1506:6: () otherlv_4= '-'
            	            {
            	            // InternalDeviceDefinition.g:1506:6: ()
            	            // InternalDeviceDefinition.g:1507:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,56,FOLLOW_31); 

            	            						newLeafNode(otherlv_4, grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalDeviceDefinition.g:1519:4: ( (lv_right_5_0= ruleFactor ) )
            	    // InternalDeviceDefinition.g:1520:5: (lv_right_5_0= ruleFactor )
            	    {
            	    // InternalDeviceDefinition.g:1520:5: (lv_right_5_0= ruleFactor )
            	    // InternalDeviceDefinition.g:1521:6: lv_right_5_0= ruleFactor
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
    // InternalDeviceDefinition.g:1543:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalDeviceDefinition.g:1543:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalDeviceDefinition.g:1544:2: iv_ruleFactor= ruleFactor EOF
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
    // InternalDeviceDefinition.g:1550:1: ruleFactor returns [EObject current=null] : (this_Compare_0= ruleCompare ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleCompare ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Compare_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:1556:2: ( (this_Compare_0= ruleCompare ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleCompare ) ) )* ) )
            // InternalDeviceDefinition.g:1557:2: (this_Compare_0= ruleCompare ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleCompare ) ) )* )
            {
            // InternalDeviceDefinition.g:1557:2: (this_Compare_0= ruleCompare ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleCompare ) ) )* )
            // InternalDeviceDefinition.g:1558:3: this_Compare_0= ruleCompare ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleCompare ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getCompareParserRuleCall_0());
            		
            pushFollow(FOLLOW_46);
            this_Compare_0=ruleCompare();

            state._fsp--;


            			current = this_Compare_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDeviceDefinition.g:1566:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleCompare ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=57 && LA31_0<=58)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalDeviceDefinition.g:1567:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleCompare ) )
            	    {
            	    // InternalDeviceDefinition.g:1567:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0==57) ) {
            	        alt30=1;
            	    }
            	    else if ( (LA30_0==58) ) {
            	        alt30=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 30, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // InternalDeviceDefinition.g:1568:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalDeviceDefinition.g:1568:5: ( () otherlv_2= '*' )
            	            // InternalDeviceDefinition.g:1569:6: () otherlv_2= '*'
            	            {
            	            // InternalDeviceDefinition.g:1569:6: ()
            	            // InternalDeviceDefinition.g:1570:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,57,FOLLOW_31); 

            	            						newLeafNode(otherlv_2, grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDeviceDefinition.g:1582:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalDeviceDefinition.g:1582:5: ( () otherlv_4= '/' )
            	            // InternalDeviceDefinition.g:1583:6: () otherlv_4= '/'
            	            {
            	            // InternalDeviceDefinition.g:1583:6: ()
            	            // InternalDeviceDefinition.g:1584:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,58,FOLLOW_31); 

            	            						newLeafNode(otherlv_4, grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalDeviceDefinition.g:1596:4: ( (lv_right_5_0= ruleCompare ) )
            	    // InternalDeviceDefinition.g:1597:5: (lv_right_5_0= ruleCompare )
            	    {
            	    // InternalDeviceDefinition.g:1597:5: (lv_right_5_0= ruleCompare )
            	    // InternalDeviceDefinition.g:1598:6: lv_right_5_0= ruleCompare
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
    // InternalDeviceDefinition.g:1620:1: entryRuleCompare returns [EObject current=null] : iv_ruleCompare= ruleCompare EOF ;
    public final EObject entryRuleCompare() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompare = null;


        try {
            // InternalDeviceDefinition.g:1620:48: (iv_ruleCompare= ruleCompare EOF )
            // InternalDeviceDefinition.g:1621:2: iv_ruleCompare= ruleCompare EOF
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
    // InternalDeviceDefinition.g:1627:1: ruleCompare returns [EObject current=null] : (this_CompareOrEquals_0= ruleCompareOrEquals ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleCompareOrEquals ) ) )* ) ;
    public final EObject ruleCompare() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_CompareOrEquals_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:1633:2: ( (this_CompareOrEquals_0= ruleCompareOrEquals ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleCompareOrEquals ) ) )* ) )
            // InternalDeviceDefinition.g:1634:2: (this_CompareOrEquals_0= ruleCompareOrEquals ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleCompareOrEquals ) ) )* )
            {
            // InternalDeviceDefinition.g:1634:2: (this_CompareOrEquals_0= ruleCompareOrEquals ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleCompareOrEquals ) ) )* )
            // InternalDeviceDefinition.g:1635:3: this_CompareOrEquals_0= ruleCompareOrEquals ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleCompareOrEquals ) ) )*
            {

            			newCompositeNode(grammarAccess.getCompareAccess().getCompareOrEqualsParserRuleCall_0());
            		
            pushFollow(FOLLOW_47);
            this_CompareOrEquals_0=ruleCompareOrEquals();

            state._fsp--;


            			current = this_CompareOrEquals_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDeviceDefinition.g:1643:3: ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleCompareOrEquals ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=59 && LA33_0<=60)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalDeviceDefinition.g:1644:4: ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleCompareOrEquals ) )
            	    {
            	    // InternalDeviceDefinition.g:1644:4: ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) )
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==59) ) {
            	        alt32=1;
            	    }
            	    else if ( (LA32_0==60) ) {
            	        alt32=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 32, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // InternalDeviceDefinition.g:1645:5: ( () otherlv_2= '>' )
            	            {
            	            // InternalDeviceDefinition.g:1645:5: ( () otherlv_2= '>' )
            	            // InternalDeviceDefinition.g:1646:6: () otherlv_2= '>'
            	            {
            	            // InternalDeviceDefinition.g:1646:6: ()
            	            // InternalDeviceDefinition.g:1647:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getCompareAccess().getGreaterLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,59,FOLLOW_31); 

            	            						newLeafNode(otherlv_2, grammarAccess.getCompareAccess().getGreaterThanSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDeviceDefinition.g:1659:5: ( () otherlv_4= '<' )
            	            {
            	            // InternalDeviceDefinition.g:1659:5: ( () otherlv_4= '<' )
            	            // InternalDeviceDefinition.g:1660:6: () otherlv_4= '<'
            	            {
            	            // InternalDeviceDefinition.g:1660:6: ()
            	            // InternalDeviceDefinition.g:1661:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getCompareAccess().getLesserLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,60,FOLLOW_31); 

            	            						newLeafNode(otherlv_4, grammarAccess.getCompareAccess().getLessThanSignKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalDeviceDefinition.g:1673:4: ( (lv_right_5_0= ruleCompareOrEquals ) )
            	    // InternalDeviceDefinition.g:1674:5: (lv_right_5_0= ruleCompareOrEquals )
            	    {
            	    // InternalDeviceDefinition.g:1674:5: (lv_right_5_0= ruleCompareOrEquals )
            	    // InternalDeviceDefinition.g:1675:6: lv_right_5_0= ruleCompareOrEquals
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
    // InternalDeviceDefinition.g:1697:1: entryRuleCompareOrEquals returns [EObject current=null] : iv_ruleCompareOrEquals= ruleCompareOrEquals EOF ;
    public final EObject entryRuleCompareOrEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOrEquals = null;


        try {
            // InternalDeviceDefinition.g:1697:56: (iv_ruleCompareOrEquals= ruleCompareOrEquals EOF )
            // InternalDeviceDefinition.g:1698:2: iv_ruleCompareOrEquals= ruleCompareOrEquals EOF
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
    // InternalDeviceDefinition.g:1704:1: ruleCompareOrEquals returns [EObject current=null] : (this_EqualsOrNotEquals_0= ruleEqualsOrNotEquals ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) ) ( (lv_right_5_0= ruleEqualsOrNotEquals ) ) )* ) ;
    public final EObject ruleCompareOrEquals() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_EqualsOrNotEquals_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:1710:2: ( (this_EqualsOrNotEquals_0= ruleEqualsOrNotEquals ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) ) ( (lv_right_5_0= ruleEqualsOrNotEquals ) ) )* ) )
            // InternalDeviceDefinition.g:1711:2: (this_EqualsOrNotEquals_0= ruleEqualsOrNotEquals ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) ) ( (lv_right_5_0= ruleEqualsOrNotEquals ) ) )* )
            {
            // InternalDeviceDefinition.g:1711:2: (this_EqualsOrNotEquals_0= ruleEqualsOrNotEquals ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) ) ( (lv_right_5_0= ruleEqualsOrNotEquals ) ) )* )
            // InternalDeviceDefinition.g:1712:3: this_EqualsOrNotEquals_0= ruleEqualsOrNotEquals ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) ) ( (lv_right_5_0= ruleEqualsOrNotEquals ) ) )*
            {

            			newCompositeNode(grammarAccess.getCompareOrEqualsAccess().getEqualsOrNotEqualsParserRuleCall_0());
            		
            pushFollow(FOLLOW_48);
            this_EqualsOrNotEquals_0=ruleEqualsOrNotEquals();

            state._fsp--;


            			current = this_EqualsOrNotEquals_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDeviceDefinition.g:1720:3: ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) ) ( (lv_right_5_0= ruleEqualsOrNotEquals ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=61 && LA35_0<=62)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalDeviceDefinition.g:1721:4: ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) ) ( (lv_right_5_0= ruleEqualsOrNotEquals ) )
            	    {
            	    // InternalDeviceDefinition.g:1721:4: ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) )
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==61) ) {
            	        alt34=1;
            	    }
            	    else if ( (LA34_0==62) ) {
            	        alt34=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 34, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // InternalDeviceDefinition.g:1722:5: ( () otherlv_2= '>=' )
            	            {
            	            // InternalDeviceDefinition.g:1722:5: ( () otherlv_2= '>=' )
            	            // InternalDeviceDefinition.g:1723:6: () otherlv_2= '>='
            	            {
            	            // InternalDeviceDefinition.g:1723:6: ()
            	            // InternalDeviceDefinition.g:1724:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getCompareOrEqualsAccess().getGreaterOrEqualsLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,61,FOLLOW_31); 

            	            						newLeafNode(otherlv_2, grammarAccess.getCompareOrEqualsAccess().getGreaterThanSignEqualsSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDeviceDefinition.g:1736:5: ( () otherlv_4= '<=' )
            	            {
            	            // InternalDeviceDefinition.g:1736:5: ( () otherlv_4= '<=' )
            	            // InternalDeviceDefinition.g:1737:6: () otherlv_4= '<='
            	            {
            	            // InternalDeviceDefinition.g:1737:6: ()
            	            // InternalDeviceDefinition.g:1738:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getCompareOrEqualsAccess().getLesserOrEqualsLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,62,FOLLOW_31); 

            	            						newLeafNode(otherlv_4, grammarAccess.getCompareOrEqualsAccess().getLessThanSignEqualsSignKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalDeviceDefinition.g:1750:4: ( (lv_right_5_0= ruleEqualsOrNotEquals ) )
            	    // InternalDeviceDefinition.g:1751:5: (lv_right_5_0= ruleEqualsOrNotEquals )
            	    {
            	    // InternalDeviceDefinition.g:1751:5: (lv_right_5_0= ruleEqualsOrNotEquals )
            	    // InternalDeviceDefinition.g:1752:6: lv_right_5_0= ruleEqualsOrNotEquals
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
    // InternalDeviceDefinition.g:1774:1: entryRuleEqualsOrNotEquals returns [EObject current=null] : iv_ruleEqualsOrNotEquals= ruleEqualsOrNotEquals EOF ;
    public final EObject entryRuleEqualsOrNotEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualsOrNotEquals = null;


        try {
            // InternalDeviceDefinition.g:1774:58: (iv_ruleEqualsOrNotEquals= ruleEqualsOrNotEquals EOF )
            // InternalDeviceDefinition.g:1775:2: iv_ruleEqualsOrNotEquals= ruleEqualsOrNotEquals EOF
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
    // InternalDeviceDefinition.g:1781:1: ruleEqualsOrNotEquals returns [EObject current=null] : (this_AndOr_0= ruleAndOr ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleAndOr ) ) )* ) ;
    public final EObject ruleEqualsOrNotEquals() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_AndOr_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:1787:2: ( (this_AndOr_0= ruleAndOr ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleAndOr ) ) )* ) )
            // InternalDeviceDefinition.g:1788:2: (this_AndOr_0= ruleAndOr ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleAndOr ) ) )* )
            {
            // InternalDeviceDefinition.g:1788:2: (this_AndOr_0= ruleAndOr ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleAndOr ) ) )* )
            // InternalDeviceDefinition.g:1789:3: this_AndOr_0= ruleAndOr ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleAndOr ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualsOrNotEqualsAccess().getAndOrParserRuleCall_0());
            		
            pushFollow(FOLLOW_49);
            this_AndOr_0=ruleAndOr();

            state._fsp--;


            			current = this_AndOr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDeviceDefinition.g:1797:3: ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleAndOr ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=63 && LA37_0<=64)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalDeviceDefinition.g:1798:4: ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleAndOr ) )
            	    {
            	    // InternalDeviceDefinition.g:1798:4: ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) )
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==63) ) {
            	        alt36=1;
            	    }
            	    else if ( (LA36_0==64) ) {
            	        alt36=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 36, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // InternalDeviceDefinition.g:1799:5: ( () otherlv_2= '==' )
            	            {
            	            // InternalDeviceDefinition.g:1799:5: ( () otherlv_2= '==' )
            	            // InternalDeviceDefinition.g:1800:6: () otherlv_2= '=='
            	            {
            	            // InternalDeviceDefinition.g:1800:6: ()
            	            // InternalDeviceDefinition.g:1801:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getEqualsOrNotEqualsAccess().getEqualsLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,63,FOLLOW_31); 

            	            						newLeafNode(otherlv_2, grammarAccess.getEqualsOrNotEqualsAccess().getEqualsSignEqualsSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDeviceDefinition.g:1813:5: ( () otherlv_4= '!=' )
            	            {
            	            // InternalDeviceDefinition.g:1813:5: ( () otherlv_4= '!=' )
            	            // InternalDeviceDefinition.g:1814:6: () otherlv_4= '!='
            	            {
            	            // InternalDeviceDefinition.g:1814:6: ()
            	            // InternalDeviceDefinition.g:1815:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getEqualsOrNotEqualsAccess().getNotEqualsLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,64,FOLLOW_31); 

            	            						newLeafNode(otherlv_4, grammarAccess.getEqualsOrNotEqualsAccess().getExclamationMarkEqualsSignKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalDeviceDefinition.g:1827:4: ( (lv_right_5_0= ruleAndOr ) )
            	    // InternalDeviceDefinition.g:1828:5: (lv_right_5_0= ruleAndOr )
            	    {
            	    // InternalDeviceDefinition.g:1828:5: (lv_right_5_0= ruleAndOr )
            	    // InternalDeviceDefinition.g:1829:6: lv_right_5_0= ruleAndOr
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
    // InternalDeviceDefinition.g:1851:1: entryRuleAndOr returns [EObject current=null] : iv_ruleAndOr= ruleAndOr EOF ;
    public final EObject entryRuleAndOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndOr = null;


        try {
            // InternalDeviceDefinition.g:1851:46: (iv_ruleAndOr= ruleAndOr EOF )
            // InternalDeviceDefinition.g:1852:2: iv_ruleAndOr= ruleAndOr EOF
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
    // InternalDeviceDefinition.g:1858:1: ruleAndOr returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( ( () otherlv_2= 'and' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleAndOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Primary_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:1864:2: ( (this_Primary_0= rulePrimary ( ( ( () otherlv_2= 'and' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) )
            // InternalDeviceDefinition.g:1865:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= 'and' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            {
            // InternalDeviceDefinition.g:1865:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= 'and' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            // InternalDeviceDefinition.g:1866:3: this_Primary_0= rulePrimary ( ( ( () otherlv_2= 'and' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndOrAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_50);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDeviceDefinition.g:1874:3: ( ( ( () otherlv_2= 'and' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=65 && LA39_0<=66)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalDeviceDefinition.g:1875:4: ( ( () otherlv_2= 'and' ) | ( () otherlv_4= 'or' ) ) ( (lv_right_5_0= rulePrimary ) )
            	    {
            	    // InternalDeviceDefinition.g:1875:4: ( ( () otherlv_2= 'and' ) | ( () otherlv_4= 'or' ) )
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==65) ) {
            	        alt38=1;
            	    }
            	    else if ( (LA38_0==66) ) {
            	        alt38=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 38, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // InternalDeviceDefinition.g:1876:5: ( () otherlv_2= 'and' )
            	            {
            	            // InternalDeviceDefinition.g:1876:5: ( () otherlv_2= 'and' )
            	            // InternalDeviceDefinition.g:1877:6: () otherlv_2= 'and'
            	            {
            	            // InternalDeviceDefinition.g:1877:6: ()
            	            // InternalDeviceDefinition.g:1878:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getAndOrAccess().getAndLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,65,FOLLOW_31); 

            	            						newLeafNode(otherlv_2, grammarAccess.getAndOrAccess().getAndKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDeviceDefinition.g:1890:5: ( () otherlv_4= 'or' )
            	            {
            	            // InternalDeviceDefinition.g:1890:5: ( () otherlv_4= 'or' )
            	            // InternalDeviceDefinition.g:1891:6: () otherlv_4= 'or'
            	            {
            	            // InternalDeviceDefinition.g:1891:6: ()
            	            // InternalDeviceDefinition.g:1892:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getAndOrAccess().getOrLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,66,FOLLOW_31); 

            	            						newLeafNode(otherlv_4, grammarAccess.getAndOrAccess().getOrKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalDeviceDefinition.g:1904:4: ( (lv_right_5_0= rulePrimary ) )
            	    // InternalDeviceDefinition.g:1905:5: (lv_right_5_0= rulePrimary )
            	    {
            	    // InternalDeviceDefinition.g:1905:5: (lv_right_5_0= rulePrimary )
            	    // InternalDeviceDefinition.g:1906:6: lv_right_5_0= rulePrimary
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
    // InternalDeviceDefinition.g:1928:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalDeviceDefinition.g:1928:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalDeviceDefinition.g:1929:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalDeviceDefinition.g:1935:1: rulePrimary returns [EObject current=null] : (this_Primitive_0= rulePrimitive | this_Parenthesis_1= ruleParenthesis | this_VariableUse_2= ruleVariableUse | this_ExternalCall_3= ruleExternalCall ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        EObject this_Primitive_0 = null;

        EObject this_Parenthesis_1 = null;

        EObject this_VariableUse_2 = null;

        EObject this_ExternalCall_3 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:1941:2: ( (this_Primitive_0= rulePrimitive | this_Parenthesis_1= ruleParenthesis | this_VariableUse_2= ruleVariableUse | this_ExternalCall_3= ruleExternalCall ) )
            // InternalDeviceDefinition.g:1942:2: (this_Primitive_0= rulePrimitive | this_Parenthesis_1= ruleParenthesis | this_VariableUse_2= ruleVariableUse | this_ExternalCall_3= ruleExternalCall )
            {
            // InternalDeviceDefinition.g:1942:2: (this_Primitive_0= rulePrimitive | this_Parenthesis_1= ruleParenthesis | this_VariableUse_2= ruleVariableUse | this_ExternalCall_3= ruleExternalCall )
            int alt40=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_DECIMAL:
            case 53:
            case 54:
                {
                alt40=1;
                }
                break;
            case 35:
                {
                alt40=2;
                }
                break;
            case RULE_ID:
                {
                alt40=3;
                }
                break;
            case 67:
                {
                alt40=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalDeviceDefinition.g:1943:3: this_Primitive_0= rulePrimitive
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
                    // InternalDeviceDefinition.g:1952:3: this_Parenthesis_1= ruleParenthesis
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
                    // InternalDeviceDefinition.g:1961:3: this_VariableUse_2= ruleVariableUse
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
                    // InternalDeviceDefinition.g:1970:3: this_ExternalCall_3= ruleExternalCall
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getExternalCallParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalCall_3=ruleExternalCall();

                    state._fsp--;


                    			current = this_ExternalCall_3;
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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleExternalCall"
    // InternalDeviceDefinition.g:1982:1: entryRuleExternalCall returns [EObject current=null] : iv_ruleExternalCall= ruleExternalCall EOF ;
    public final EObject entryRuleExternalCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalCall = null;


        try {
            // InternalDeviceDefinition.g:1982:53: (iv_ruleExternalCall= ruleExternalCall EOF )
            // InternalDeviceDefinition.g:1983:2: iv_ruleExternalCall= ruleExternalCall EOF
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
    // InternalDeviceDefinition.g:1989:1: ruleExternalCall returns [EObject current=null] : (otherlv_0= 'call' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_args_3_0= ruleExp ) )? (otherlv_4= ',' ( (lv_args_5_0= ruleExp ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleExternalCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_args_3_0 = null;

        EObject lv_args_5_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:1995:2: ( (otherlv_0= 'call' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_args_3_0= ruleExp ) )? (otherlv_4= ',' ( (lv_args_5_0= ruleExp ) ) )* otherlv_6= ')' ) )
            // InternalDeviceDefinition.g:1996:2: (otherlv_0= 'call' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_args_3_0= ruleExp ) )? (otherlv_4= ',' ( (lv_args_5_0= ruleExp ) ) )* otherlv_6= ')' )
            {
            // InternalDeviceDefinition.g:1996:2: (otherlv_0= 'call' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_args_3_0= ruleExp ) )? (otherlv_4= ',' ( (lv_args_5_0= ruleExp ) ) )* otherlv_6= ')' )
            // InternalDeviceDefinition.g:1997:3: otherlv_0= 'call' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_args_3_0= ruleExp ) )? (otherlv_4= ',' ( (lv_args_5_0= ruleExp ) ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalCallAccess().getCallKeyword_0());
            		
            // InternalDeviceDefinition.g:2001:3: ( (otherlv_1= RULE_ID ) )
            // InternalDeviceDefinition.g:2002:4: (otherlv_1= RULE_ID )
            {
            // InternalDeviceDefinition.g:2002:4: (otherlv_1= RULE_ID )
            // InternalDeviceDefinition.g:2003:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalCallRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(otherlv_1, grammarAccess.getExternalCallAccess().getFuncImportCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalCallAccess().getLeftParenthesisKeyword_2());
            		
            // InternalDeviceDefinition.g:2018:3: ( (lv_args_3_0= ruleExp ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID||(LA41_0>=RULE_INT && LA41_0<=RULE_DECIMAL)||LA41_0==35||(LA41_0>=53 && LA41_0<=54)||LA41_0==67) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalDeviceDefinition.g:2019:4: (lv_args_3_0= ruleExp )
                    {
                    // InternalDeviceDefinition.g:2019:4: (lv_args_3_0= ruleExp )
                    // InternalDeviceDefinition.g:2020:5: lv_args_3_0= ruleExp
                    {

                    					newCompositeNode(grammarAccess.getExternalCallAccess().getArgsExpParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_35);
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

            // InternalDeviceDefinition.g:2037:3: (otherlv_4= ',' ( (lv_args_5_0= ruleExp ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==29) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalDeviceDefinition.g:2038:4: otherlv_4= ',' ( (lv_args_5_0= ruleExp ) )
            	    {
            	    otherlv_4=(Token)match(input,29,FOLLOW_31); 

            	    				newLeafNode(otherlv_4, grammarAccess.getExternalCallAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalDeviceDefinition.g:2042:4: ( (lv_args_5_0= ruleExp ) )
            	    // InternalDeviceDefinition.g:2043:5: (lv_args_5_0= ruleExp )
            	    {
            	    // InternalDeviceDefinition.g:2043:5: (lv_args_5_0= ruleExp )
            	    // InternalDeviceDefinition.g:2044:6: lv_args_5_0= ruleExp
            	    {

            	    						newCompositeNode(grammarAccess.getExternalCallAccess().getArgsExpParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_35);
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

            otherlv_6=(Token)match(input,36,FOLLOW_2); 

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
    // InternalDeviceDefinition.g:2070:1: entryRuleInternalVariableUse returns [EObject current=null] : iv_ruleInternalVariableUse= ruleInternalVariableUse EOF ;
    public final EObject entryRuleInternalVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalVariableUse = null;


        try {
            // InternalDeviceDefinition.g:2070:60: (iv_ruleInternalVariableUse= ruleInternalVariableUse EOF )
            // InternalDeviceDefinition.g:2071:2: iv_ruleInternalVariableUse= ruleInternalVariableUse EOF
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
    // InternalDeviceDefinition.g:2077:1: ruleInternalVariableUse returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleInternalVariableUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDeviceDefinition.g:2083:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalDeviceDefinition.g:2084:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalDeviceDefinition.g:2084:2: ( (otherlv_0= RULE_ID ) )
            // InternalDeviceDefinition.g:2085:3: (otherlv_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:2085:3: (otherlv_0= RULE_ID )
            // InternalDeviceDefinition.g:2086:4: otherlv_0= RULE_ID
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
    // InternalDeviceDefinition.g:2100:1: entryRuleExternalVariableUse returns [EObject current=null] : iv_ruleExternalVariableUse= ruleExternalVariableUse EOF ;
    public final EObject entryRuleExternalVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalVariableUse = null;


        try {
            // InternalDeviceDefinition.g:2100:60: (iv_ruleExternalVariableUse= ruleExternalVariableUse EOF )
            // InternalDeviceDefinition.g:2101:2: iv_ruleExternalVariableUse= ruleExternalVariableUse EOF
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
    // InternalDeviceDefinition.g:2107:1: ruleExternalVariableUse returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' | otherlv_2= '->' ) ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleExternalVariableUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDeviceDefinition.g:2113:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' | otherlv_2= '->' ) ( (otherlv_3= RULE_ID ) ) ) )
            // InternalDeviceDefinition.g:2114:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' | otherlv_2= '->' ) ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalDeviceDefinition.g:2114:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' | otherlv_2= '->' ) ( (otherlv_3= RULE_ID ) ) )
            // InternalDeviceDefinition.g:2115:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' | otherlv_2= '->' ) ( (otherlv_3= RULE_ID ) )
            {
            // InternalDeviceDefinition.g:2115:3: ( (otherlv_0= RULE_ID ) )
            // InternalDeviceDefinition.g:2116:4: (otherlv_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:2116:4: (otherlv_0= RULE_ID )
            // InternalDeviceDefinition.g:2117:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalVariableUseRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_51); 

            					newLeafNode(otherlv_0, grammarAccess.getExternalVariableUseAccess().getObjDeviceCrossReference_0_0());
            				

            }


            }

            // InternalDeviceDefinition.g:2128:3: (otherlv_1= '.' | otherlv_2= '->' )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==68) ) {
                alt43=1;
            }
            else if ( (LA43_0==69) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalDeviceDefinition.g:2129:4: otherlv_1= '.'
                    {
                    otherlv_1=(Token)match(input,68,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getExternalVariableUseAccess().getFullStopKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDeviceDefinition.g:2134:4: otherlv_2= '->'
                    {
                    otherlv_2=(Token)match(input,69,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getExternalVariableUseAccess().getHyphenMinusGreaterThanSignKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalDeviceDefinition.g:2139:3: ( (otherlv_3= RULE_ID ) )
            // InternalDeviceDefinition.g:2140:4: (otherlv_3= RULE_ID )
            {
            // InternalDeviceDefinition.g:2140:4: (otherlv_3= RULE_ID )
            // InternalDeviceDefinition.g:2141:5: otherlv_3= RULE_ID
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
    // InternalDeviceDefinition.g:2156:1: entryRuleVariableUse returns [EObject current=null] : iv_ruleVariableUse= ruleVariableUse EOF ;
    public final EObject entryRuleVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableUse = null;


        try {
            // InternalDeviceDefinition.g:2156:52: (iv_ruleVariableUse= ruleVariableUse EOF )
            // InternalDeviceDefinition.g:2157:2: iv_ruleVariableUse= ruleVariableUse EOF
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
    // InternalDeviceDefinition.g:2163:1: ruleVariableUse returns [EObject current=null] : (this_InternalVariableUse_0= ruleInternalVariableUse | this_ExternalVariableUse_1= ruleExternalVariableUse ) ;
    public final EObject ruleVariableUse() throws RecognitionException {
        EObject current = null;

        EObject this_InternalVariableUse_0 = null;

        EObject this_ExternalVariableUse_1 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:2169:2: ( (this_InternalVariableUse_0= ruleInternalVariableUse | this_ExternalVariableUse_1= ruleExternalVariableUse ) )
            // InternalDeviceDefinition.g:2170:2: (this_InternalVariableUse_0= ruleInternalVariableUse | this_ExternalVariableUse_1= ruleExternalVariableUse )
            {
            // InternalDeviceDefinition.g:2170:2: (this_InternalVariableUse_0= ruleInternalVariableUse | this_ExternalVariableUse_1= ruleExternalVariableUse )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==EOF||LA44_1==RULE_ID||(LA44_1>=RULE_INT && LA44_1<=RULE_DECIMAL)||LA44_1==16||LA44_1==23||LA44_1==27||LA44_1==29||(LA44_1>=31 && LA44_1<=32)||(LA44_1>=34 && LA44_1<=36)||LA44_1==44||LA44_1==48||(LA44_1>=53 && LA44_1<=67)) ) {
                    alt44=1;
                }
                else if ( ((LA44_1>=68 && LA44_1<=69)) ) {
                    alt44=2;
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
                    // InternalDeviceDefinition.g:2171:3: this_InternalVariableUse_0= ruleInternalVariableUse
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
                    // InternalDeviceDefinition.g:2180:3: this_ExternalVariableUse_1= ruleExternalVariableUse
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
    // InternalDeviceDefinition.g:2192:1: entryRuleParenthesis returns [EObject current=null] : iv_ruleParenthesis= ruleParenthesis EOF ;
    public final EObject entryRuleParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesis = null;


        try {
            // InternalDeviceDefinition.g:2192:52: (iv_ruleParenthesis= ruleParenthesis EOF )
            // InternalDeviceDefinition.g:2193:2: iv_ruleParenthesis= ruleParenthesis EOF
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
    // InternalDeviceDefinition.g:2199:1: ruleParenthesis returns [EObject current=null] : (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' ) ;
    public final EObject ruleParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:2205:2: ( (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' ) )
            // InternalDeviceDefinition.g:2206:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' )
            {
            // InternalDeviceDefinition.g:2206:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' )
            // InternalDeviceDefinition.g:2207:3: otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0());
            		
            // InternalDeviceDefinition.g:2211:3: ( (lv_exp_1_0= ruleExp ) )
            // InternalDeviceDefinition.g:2212:4: (lv_exp_1_0= ruleExp )
            {
            // InternalDeviceDefinition.g:2212:4: (lv_exp_1_0= ruleExp )
            // InternalDeviceDefinition.g:2213:5: lv_exp_1_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_52);
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

            otherlv_2=(Token)match(input,36,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000080000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000100000D000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000007E000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000100000C000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0001000008000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000060000080L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0060000000000180L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000100580000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000500000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0060000800000190L,0x0000000000000008L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0060001820000190L,0x0000000000000008L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001020000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000200000000020L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x000A000020000080L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x000A000020000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x000A000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0600000000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000006L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000001000000000L});

}