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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDeviceDefinitionParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'System'", "':'", "'Graph'", "'type'", "'category'", "'title'", "'xlabel'", "'ylabel'", "'Master'", "'bluetooth'", "'Slave'", "'Sensor'", "'pins'", "'('", "','", "')'", "'graph'", "'Actuator'", "'Setting'", "'default'", "'Line'", "'BoxPlot'", "'Histogram'", "'Moisture'", "'Temperature'", "'HumidityAndTemperature'", "'AirHumidity'", "'CO2'", "'Light'", "'LED'", "'WaterPump'"
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
    // InternalDeviceDefinition.g:72:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_master_3_0= ruleMaster ) ) ( (lv_graphs_4_0= ruleGraph ) )* ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_master_3_0 = null;

        EObject lv_graphs_4_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:78:2: ( (otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_master_3_0= ruleMaster ) ) ( (lv_graphs_4_0= ruleGraph ) )* ) )
            // InternalDeviceDefinition.g:79:2: (otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_master_3_0= ruleMaster ) ) ( (lv_graphs_4_0= ruleGraph ) )* )
            {
            // InternalDeviceDefinition.g:79:2: (otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_master_3_0= ruleMaster ) ) ( (lv_graphs_4_0= ruleGraph ) )* )
            // InternalDeviceDefinition.g:80:3: otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_master_3_0= ruleMaster ) ) ( (lv_graphs_4_0= ruleGraph ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getColonKeyword_2());
            		
            // InternalDeviceDefinition.g:106:3: ( (lv_master_3_0= ruleMaster ) )
            // InternalDeviceDefinition.g:107:4: (lv_master_3_0= ruleMaster )
            {
            // InternalDeviceDefinition.g:107:4: (lv_master_3_0= ruleMaster )
            // InternalDeviceDefinition.g:108:5: lv_master_3_0= ruleMaster
            {

            					newCompositeNode(grammarAccess.getSystemAccess().getMasterMasterParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_master_3_0=ruleMaster();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemRule());
            					}
            					set(
            						current,
            						"master",
            						lv_master_3_0,
            						"dk.gms.dsl.DeviceDefinition.Master");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDeviceDefinition.g:125:3: ( (lv_graphs_4_0= ruleGraph ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
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
            	    						"dk.gms.dsl.DeviceDefinition.Graph");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // InternalDeviceDefinition.g:155:1: ruleGraph returns [EObject current=null] : (otherlv_0= 'Graph' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'type' ( (lv_type_4_0= ruleGraphType ) ) otherlv_5= 'category' ( (lv_category_6_0= RULE_STRING ) ) otherlv_7= 'title' ( (lv_title_8_0= RULE_STRING ) ) otherlv_9= 'xlabel' ( (lv_xlabel_10_0= RULE_STRING ) ) otherlv_11= 'ylabel' ( (lv_ylabel_12_0= RULE_STRING ) ) ) ;
    public final EObject ruleGraph() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_category_6_0=null;
        Token otherlv_7=null;
        Token lv_title_8_0=null;
        Token otherlv_9=null;
        Token lv_xlabel_10_0=null;
        Token otherlv_11=null;
        Token lv_ylabel_12_0=null;
        Enumerator lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:161:2: ( (otherlv_0= 'Graph' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'type' ( (lv_type_4_0= ruleGraphType ) ) otherlv_5= 'category' ( (lv_category_6_0= RULE_STRING ) ) otherlv_7= 'title' ( (lv_title_8_0= RULE_STRING ) ) otherlv_9= 'xlabel' ( (lv_xlabel_10_0= RULE_STRING ) ) otherlv_11= 'ylabel' ( (lv_ylabel_12_0= RULE_STRING ) ) ) )
            // InternalDeviceDefinition.g:162:2: (otherlv_0= 'Graph' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'type' ( (lv_type_4_0= ruleGraphType ) ) otherlv_5= 'category' ( (lv_category_6_0= RULE_STRING ) ) otherlv_7= 'title' ( (lv_title_8_0= RULE_STRING ) ) otherlv_9= 'xlabel' ( (lv_xlabel_10_0= RULE_STRING ) ) otherlv_11= 'ylabel' ( (lv_ylabel_12_0= RULE_STRING ) ) )
            {
            // InternalDeviceDefinition.g:162:2: (otherlv_0= 'Graph' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'type' ( (lv_type_4_0= ruleGraphType ) ) otherlv_5= 'category' ( (lv_category_6_0= RULE_STRING ) ) otherlv_7= 'title' ( (lv_title_8_0= RULE_STRING ) ) otherlv_9= 'xlabel' ( (lv_xlabel_10_0= RULE_STRING ) ) otherlv_11= 'ylabel' ( (lv_ylabel_12_0= RULE_STRING ) ) )
            // InternalDeviceDefinition.g:163:3: otherlv_0= 'Graph' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'type' ( (lv_type_4_0= ruleGraphType ) ) otherlv_5= 'category' ( (lv_category_6_0= RULE_STRING ) ) otherlv_7= 'title' ( (lv_title_8_0= RULE_STRING ) ) otherlv_9= 'xlabel' ( (lv_xlabel_10_0= RULE_STRING ) ) otherlv_11= 'ylabel' ( (lv_ylabel_12_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphAccess().getGraphKeyword_0());
            		
            // InternalDeviceDefinition.g:167:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDeviceDefinition.g:168:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:168:4: (lv_name_1_0= RULE_ID )
            // InternalDeviceDefinition.g:169:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGraphAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getGraphAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getGraphAccess().getTypeKeyword_3());
            		
            // InternalDeviceDefinition.g:193:3: ( (lv_type_4_0= ruleGraphType ) )
            // InternalDeviceDefinition.g:194:4: (lv_type_4_0= ruleGraphType )
            {
            // InternalDeviceDefinition.g:194:4: (lv_type_4_0= ruleGraphType )
            // InternalDeviceDefinition.g:195:5: lv_type_4_0= ruleGraphType
            {

            					newCompositeNode(grammarAccess.getGraphAccess().getTypeGraphTypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_type_4_0=ruleGraphType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"dk.gms.dsl.DeviceDefinition.GraphType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getGraphAccess().getCategoryKeyword_5());
            		
            // InternalDeviceDefinition.g:216:3: ( (lv_category_6_0= RULE_STRING ) )
            // InternalDeviceDefinition.g:217:4: (lv_category_6_0= RULE_STRING )
            {
            // InternalDeviceDefinition.g:217:4: (lv_category_6_0= RULE_STRING )
            // InternalDeviceDefinition.g:218:5: lv_category_6_0= RULE_STRING
            {
            lv_category_6_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_category_6_0, grammarAccess.getGraphAccess().getCategorySTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphRule());
            					}
            					setWithLastConsumed(
            						current,
            						"category",
            						lv_category_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getGraphAccess().getTitleKeyword_7());
            		
            // InternalDeviceDefinition.g:238:3: ( (lv_title_8_0= RULE_STRING ) )
            // InternalDeviceDefinition.g:239:4: (lv_title_8_0= RULE_STRING )
            {
            // InternalDeviceDefinition.g:239:4: (lv_title_8_0= RULE_STRING )
            // InternalDeviceDefinition.g:240:5: lv_title_8_0= RULE_STRING
            {
            lv_title_8_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_title_8_0, grammarAccess.getGraphAccess().getTitleSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getGraphAccess().getXlabelKeyword_9());
            		
            // InternalDeviceDefinition.g:260:3: ( (lv_xlabel_10_0= RULE_STRING ) )
            // InternalDeviceDefinition.g:261:4: (lv_xlabel_10_0= RULE_STRING )
            {
            // InternalDeviceDefinition.g:261:4: (lv_xlabel_10_0= RULE_STRING )
            // InternalDeviceDefinition.g:262:5: lv_xlabel_10_0= RULE_STRING
            {
            lv_xlabel_10_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_xlabel_10_0, grammarAccess.getGraphAccess().getXlabelSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphRule());
            					}
            					setWithLastConsumed(
            						current,
            						"xlabel",
            						lv_xlabel_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_11=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_11, grammarAccess.getGraphAccess().getYlabelKeyword_11());
            		
            // InternalDeviceDefinition.g:282:3: ( (lv_ylabel_12_0= RULE_STRING ) )
            // InternalDeviceDefinition.g:283:4: (lv_ylabel_12_0= RULE_STRING )
            {
            // InternalDeviceDefinition.g:283:4: (lv_ylabel_12_0= RULE_STRING )
            // InternalDeviceDefinition.g:284:5: lv_ylabel_12_0= RULE_STRING
            {
            lv_ylabel_12_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_ylabel_12_0, grammarAccess.getGraphAccess().getYlabelSTRINGTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ylabel",
            						lv_ylabel_12_0,
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


    // $ANTLR start "entryRuleMaster"
    // InternalDeviceDefinition.g:304:1: entryRuleMaster returns [EObject current=null] : iv_ruleMaster= ruleMaster EOF ;
    public final EObject entryRuleMaster() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaster = null;


        try {
            // InternalDeviceDefinition.g:304:47: (iv_ruleMaster= ruleMaster EOF )
            // InternalDeviceDefinition.g:305:2: iv_ruleMaster= ruleMaster EOF
            {
             newCompositeNode(grammarAccess.getMasterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaster=ruleMaster();

            state._fsp--;

             current =iv_ruleMaster; 
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
    // $ANTLR end "entryRuleMaster"


    // $ANTLR start "ruleMaster"
    // InternalDeviceDefinition.g:311:1: ruleMaster returns [EObject current=null] : (otherlv_0= 'Master' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'bluetooth' ( (lv_bluetoothName_4_0= RULE_STRING ) ) ( (lv_slaves_5_0= ruleSlave ) )+ ) ;
    public final EObject ruleMaster() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_bluetoothName_4_0=null;
        EObject lv_slaves_5_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:317:2: ( (otherlv_0= 'Master' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'bluetooth' ( (lv_bluetoothName_4_0= RULE_STRING ) ) ( (lv_slaves_5_0= ruleSlave ) )+ ) )
            // InternalDeviceDefinition.g:318:2: (otherlv_0= 'Master' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'bluetooth' ( (lv_bluetoothName_4_0= RULE_STRING ) ) ( (lv_slaves_5_0= ruleSlave ) )+ )
            {
            // InternalDeviceDefinition.g:318:2: (otherlv_0= 'Master' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'bluetooth' ( (lv_bluetoothName_4_0= RULE_STRING ) ) ( (lv_slaves_5_0= ruleSlave ) )+ )
            // InternalDeviceDefinition.g:319:3: otherlv_0= 'Master' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'bluetooth' ( (lv_bluetoothName_4_0= RULE_STRING ) ) ( (lv_slaves_5_0= ruleSlave ) )+
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMasterAccess().getMasterKeyword_0());
            		
            // InternalDeviceDefinition.g:323:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDeviceDefinition.g:324:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:324:4: (lv_name_1_0= RULE_ID )
            // InternalDeviceDefinition.g:325:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMasterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMasterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getMasterAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getMasterAccess().getBluetoothKeyword_3());
            		
            // InternalDeviceDefinition.g:349:3: ( (lv_bluetoothName_4_0= RULE_STRING ) )
            // InternalDeviceDefinition.g:350:4: (lv_bluetoothName_4_0= RULE_STRING )
            {
            // InternalDeviceDefinition.g:350:4: (lv_bluetoothName_4_0= RULE_STRING )
            // InternalDeviceDefinition.g:351:5: lv_bluetoothName_4_0= RULE_STRING
            {
            lv_bluetoothName_4_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_bluetoothName_4_0, grammarAccess.getMasterAccess().getBluetoothNameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMasterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"bluetoothName",
            						lv_bluetoothName_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDeviceDefinition.g:367:3: ( (lv_slaves_5_0= ruleSlave ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==21) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDeviceDefinition.g:368:4: (lv_slaves_5_0= ruleSlave )
            	    {
            	    // InternalDeviceDefinition.g:368:4: (lv_slaves_5_0= ruleSlave )
            	    // InternalDeviceDefinition.g:369:5: lv_slaves_5_0= ruleSlave
            	    {

            	    					newCompositeNode(grammarAccess.getMasterAccess().getSlavesSlaveParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_slaves_5_0=ruleSlave();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMasterRule());
            	    					}
            	    					add(
            	    						current,
            	    						"slaves",
            	    						lv_slaves_5_0,
            	    						"dk.gms.dsl.DeviceDefinition.Slave");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // $ANTLR end "ruleMaster"


    // $ANTLR start "entryRuleSlave"
    // InternalDeviceDefinition.g:390:1: entryRuleSlave returns [EObject current=null] : iv_ruleSlave= ruleSlave EOF ;
    public final EObject entryRuleSlave() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlave = null;


        try {
            // InternalDeviceDefinition.g:390:46: (iv_ruleSlave= ruleSlave EOF )
            // InternalDeviceDefinition.g:391:2: iv_ruleSlave= ruleSlave EOF
            {
             newCompositeNode(grammarAccess.getSlaveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSlave=ruleSlave();

            state._fsp--;

             current =iv_ruleSlave; 
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
    // $ANTLR end "entryRuleSlave"


    // $ANTLR start "ruleSlave"
    // InternalDeviceDefinition.g:397:1: ruleSlave returns [EObject current=null] : (otherlv_0= 'Slave' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'bluetooth' ( (lv_bluetoothName_4_0= RULE_STRING ) ) ( ( (lv_devices_5_1= ruleSensor | lv_devices_5_2= ruleActuator ) ) )* ) ;
    public final EObject ruleSlave() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_bluetoothName_4_0=null;
        EObject lv_devices_5_1 = null;

        EObject lv_devices_5_2 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:403:2: ( (otherlv_0= 'Slave' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'bluetooth' ( (lv_bluetoothName_4_0= RULE_STRING ) ) ( ( (lv_devices_5_1= ruleSensor | lv_devices_5_2= ruleActuator ) ) )* ) )
            // InternalDeviceDefinition.g:404:2: (otherlv_0= 'Slave' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'bluetooth' ( (lv_bluetoothName_4_0= RULE_STRING ) ) ( ( (lv_devices_5_1= ruleSensor | lv_devices_5_2= ruleActuator ) ) )* )
            {
            // InternalDeviceDefinition.g:404:2: (otherlv_0= 'Slave' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'bluetooth' ( (lv_bluetoothName_4_0= RULE_STRING ) ) ( ( (lv_devices_5_1= ruleSensor | lv_devices_5_2= ruleActuator ) ) )* )
            // InternalDeviceDefinition.g:405:3: otherlv_0= 'Slave' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'bluetooth' ( (lv_bluetoothName_4_0= RULE_STRING ) ) ( ( (lv_devices_5_1= ruleSensor | lv_devices_5_2= ruleActuator ) ) )*
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSlaveAccess().getSlaveKeyword_0());
            		
            // InternalDeviceDefinition.g:409:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDeviceDefinition.g:410:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:410:4: (lv_name_1_0= RULE_ID )
            // InternalDeviceDefinition.g:411:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSlaveAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSlaveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getSlaveAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getSlaveAccess().getBluetoothKeyword_3());
            		
            // InternalDeviceDefinition.g:435:3: ( (lv_bluetoothName_4_0= RULE_STRING ) )
            // InternalDeviceDefinition.g:436:4: (lv_bluetoothName_4_0= RULE_STRING )
            {
            // InternalDeviceDefinition.g:436:4: (lv_bluetoothName_4_0= RULE_STRING )
            // InternalDeviceDefinition.g:437:5: lv_bluetoothName_4_0= RULE_STRING
            {
            lv_bluetoothName_4_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_bluetoothName_4_0, grammarAccess.getSlaveAccess().getBluetoothNameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSlaveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"bluetoothName",
            						lv_bluetoothName_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDeviceDefinition.g:453:3: ( ( (lv_devices_5_1= ruleSensor | lv_devices_5_2= ruleActuator ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22||LA4_0==28) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDeviceDefinition.g:454:4: ( (lv_devices_5_1= ruleSensor | lv_devices_5_2= ruleActuator ) )
            	    {
            	    // InternalDeviceDefinition.g:454:4: ( (lv_devices_5_1= ruleSensor | lv_devices_5_2= ruleActuator ) )
            	    // InternalDeviceDefinition.g:455:5: (lv_devices_5_1= ruleSensor | lv_devices_5_2= ruleActuator )
            	    {
            	    // InternalDeviceDefinition.g:455:5: (lv_devices_5_1= ruleSensor | lv_devices_5_2= ruleActuator )
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==22) ) {
            	        alt3=1;
            	    }
            	    else if ( (LA3_0==28) ) {
            	        alt3=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalDeviceDefinition.g:456:6: lv_devices_5_1= ruleSensor
            	            {

            	            						newCompositeNode(grammarAccess.getSlaveAccess().getDevicesSensorParserRuleCall_5_0_0());
            	            					
            	            pushFollow(FOLLOW_17);
            	            lv_devices_5_1=ruleSensor();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getSlaveRule());
            	            						}
            	            						add(
            	            							current,
            	            							"devices",
            	            							lv_devices_5_1,
            	            							"dk.gms.dsl.DeviceDefinition.Sensor");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalDeviceDefinition.g:472:6: lv_devices_5_2= ruleActuator
            	            {

            	            						newCompositeNode(grammarAccess.getSlaveAccess().getDevicesActuatorParserRuleCall_5_0_1());
            	            					
            	            pushFollow(FOLLOW_17);
            	            lv_devices_5_2=ruleActuator();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getSlaveRule());
            	            						}
            	            						add(
            	            							current,
            	            							"devices",
            	            							lv_devices_5_2,
            	            							"dk.gms.dsl.DeviceDefinition.Actuator");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleSlave"


    // $ANTLR start "entryRuleSensor"
    // InternalDeviceDefinition.g:494:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalDeviceDefinition.g:494:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalDeviceDefinition.g:495:2: iv_ruleSensor= ruleSensor EOF
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
    // InternalDeviceDefinition.g:501:1: ruleSensor returns [EObject current=null] : (otherlv_0= 'Sensor' ( (lv_type_1_0= ruleSensorType ) ) otherlv_2= ':' otherlv_3= 'pins' otherlv_4= '(' ( (lv_pins_5_0= RULE_INT ) )* (otherlv_6= ',' ( (lv_pins_7_0= RULE_INT ) ) )* otherlv_8= ')' otherlv_9= 'graph' ( (otherlv_10= RULE_ID ) ) ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_pins_5_0=null;
        Token otherlv_6=null;
        Token lv_pins_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:507:2: ( (otherlv_0= 'Sensor' ( (lv_type_1_0= ruleSensorType ) ) otherlv_2= ':' otherlv_3= 'pins' otherlv_4= '(' ( (lv_pins_5_0= RULE_INT ) )* (otherlv_6= ',' ( (lv_pins_7_0= RULE_INT ) ) )* otherlv_8= ')' otherlv_9= 'graph' ( (otherlv_10= RULE_ID ) ) ) )
            // InternalDeviceDefinition.g:508:2: (otherlv_0= 'Sensor' ( (lv_type_1_0= ruleSensorType ) ) otherlv_2= ':' otherlv_3= 'pins' otherlv_4= '(' ( (lv_pins_5_0= RULE_INT ) )* (otherlv_6= ',' ( (lv_pins_7_0= RULE_INT ) ) )* otherlv_8= ')' otherlv_9= 'graph' ( (otherlv_10= RULE_ID ) ) )
            {
            // InternalDeviceDefinition.g:508:2: (otherlv_0= 'Sensor' ( (lv_type_1_0= ruleSensorType ) ) otherlv_2= ':' otherlv_3= 'pins' otherlv_4= '(' ( (lv_pins_5_0= RULE_INT ) )* (otherlv_6= ',' ( (lv_pins_7_0= RULE_INT ) ) )* otherlv_8= ')' otherlv_9= 'graph' ( (otherlv_10= RULE_ID ) ) )
            // InternalDeviceDefinition.g:509:3: otherlv_0= 'Sensor' ( (lv_type_1_0= ruleSensorType ) ) otherlv_2= ':' otherlv_3= 'pins' otherlv_4= '(' ( (lv_pins_5_0= RULE_INT ) )* (otherlv_6= ',' ( (lv_pins_7_0= RULE_INT ) ) )* otherlv_8= ')' otherlv_9= 'graph' ( (otherlv_10= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorAccess().getSensorKeyword_0());
            		
            // InternalDeviceDefinition.g:513:3: ( (lv_type_1_0= ruleSensorType ) )
            // InternalDeviceDefinition.g:514:4: (lv_type_1_0= ruleSensorType )
            {
            // InternalDeviceDefinition.g:514:4: (lv_type_1_0= ruleSensorType )
            // InternalDeviceDefinition.g:515:5: lv_type_1_0= ruleSensorType
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getTypeSensorTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_type_1_0=ruleSensorType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"dk.gms.dsl.DeviceDefinition.SensorType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getSensorAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getSensorAccess().getPinsKeyword_3());
            		
            otherlv_4=(Token)match(input,24,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getSensorAccess().getLeftParenthesisKeyword_4());
            		
            // InternalDeviceDefinition.g:544:3: ( (lv_pins_5_0= RULE_INT ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_INT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDeviceDefinition.g:545:4: (lv_pins_5_0= RULE_INT )
            	    {
            	    // InternalDeviceDefinition.g:545:4: (lv_pins_5_0= RULE_INT )
            	    // InternalDeviceDefinition.g:546:5: lv_pins_5_0= RULE_INT
            	    {
            	    lv_pins_5_0=(Token)match(input,RULE_INT,FOLLOW_21); 

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
            	    break loop5;
                }
            } while (true);

            // InternalDeviceDefinition.g:562:3: (otherlv_6= ',' ( (lv_pins_7_0= RULE_INT ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDeviceDefinition.g:563:4: otherlv_6= ',' ( (lv_pins_7_0= RULE_INT ) )
            	    {
            	    otherlv_6=(Token)match(input,25,FOLLOW_22); 

            	    				newLeafNode(otherlv_6, grammarAccess.getSensorAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalDeviceDefinition.g:567:4: ( (lv_pins_7_0= RULE_INT ) )
            	    // InternalDeviceDefinition.g:568:5: (lv_pins_7_0= RULE_INT )
            	    {
            	    // InternalDeviceDefinition.g:568:5: (lv_pins_7_0= RULE_INT )
            	    // InternalDeviceDefinition.g:569:6: lv_pins_7_0= RULE_INT
            	    {
            	    lv_pins_7_0=(Token)match(input,RULE_INT,FOLLOW_23); 

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
            	    break loop6;
                }
            } while (true);

            otherlv_8=(Token)match(input,26,FOLLOW_24); 

            			newLeafNode(otherlv_8, grammarAccess.getSensorAccess().getRightParenthesisKeyword_7());
            		
            otherlv_9=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getSensorAccess().getGraphKeyword_8());
            		
            // InternalDeviceDefinition.g:594:3: ( (otherlv_10= RULE_ID ) )
            // InternalDeviceDefinition.g:595:4: (otherlv_10= RULE_ID )
            {
            // InternalDeviceDefinition.g:595:4: (otherlv_10= RULE_ID )
            // InternalDeviceDefinition.g:596:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensorRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_10, grammarAccess.getSensorAccess().getGraphGraphCrossReference_9_0());
            				

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
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleActuator"
    // InternalDeviceDefinition.g:611:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // InternalDeviceDefinition.g:611:49: (iv_ruleActuator= ruleActuator EOF )
            // InternalDeviceDefinition.g:612:2: iv_ruleActuator= ruleActuator EOF
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
    // InternalDeviceDefinition.g:618:1: ruleActuator returns [EObject current=null] : (otherlv_0= 'Actuator' ( (lv_type_1_0= ruleActuatorType ) ) otherlv_2= ':' otherlv_3= 'pins' otherlv_4= '(' ( (lv_pins_5_0= RULE_INT ) )* (otherlv_6= ',' ( (lv_pins_7_0= RULE_INT ) ) )* otherlv_8= ')' ( (lv_settings_9_0= ruleSetting ) )* ) ;
    public final EObject ruleActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_pins_5_0=null;
        Token otherlv_6=null;
        Token lv_pins_7_0=null;
        Token otherlv_8=null;
        Enumerator lv_type_1_0 = null;

        EObject lv_settings_9_0 = null;



        	enterRule();

        try {
            // InternalDeviceDefinition.g:624:2: ( (otherlv_0= 'Actuator' ( (lv_type_1_0= ruleActuatorType ) ) otherlv_2= ':' otherlv_3= 'pins' otherlv_4= '(' ( (lv_pins_5_0= RULE_INT ) )* (otherlv_6= ',' ( (lv_pins_7_0= RULE_INT ) ) )* otherlv_8= ')' ( (lv_settings_9_0= ruleSetting ) )* ) )
            // InternalDeviceDefinition.g:625:2: (otherlv_0= 'Actuator' ( (lv_type_1_0= ruleActuatorType ) ) otherlv_2= ':' otherlv_3= 'pins' otherlv_4= '(' ( (lv_pins_5_0= RULE_INT ) )* (otherlv_6= ',' ( (lv_pins_7_0= RULE_INT ) ) )* otherlv_8= ')' ( (lv_settings_9_0= ruleSetting ) )* )
            {
            // InternalDeviceDefinition.g:625:2: (otherlv_0= 'Actuator' ( (lv_type_1_0= ruleActuatorType ) ) otherlv_2= ':' otherlv_3= 'pins' otherlv_4= '(' ( (lv_pins_5_0= RULE_INT ) )* (otherlv_6= ',' ( (lv_pins_7_0= RULE_INT ) ) )* otherlv_8= ')' ( (lv_settings_9_0= ruleSetting ) )* )
            // InternalDeviceDefinition.g:626:3: otherlv_0= 'Actuator' ( (lv_type_1_0= ruleActuatorType ) ) otherlv_2= ':' otherlv_3= 'pins' otherlv_4= '(' ( (lv_pins_5_0= RULE_INT ) )* (otherlv_6= ',' ( (lv_pins_7_0= RULE_INT ) ) )* otherlv_8= ')' ( (lv_settings_9_0= ruleSetting ) )*
            {
            otherlv_0=(Token)match(input,28,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getActuatorAccess().getActuatorKeyword_0());
            		
            // InternalDeviceDefinition.g:630:3: ( (lv_type_1_0= ruleActuatorType ) )
            // InternalDeviceDefinition.g:631:4: (lv_type_1_0= ruleActuatorType )
            {
            // InternalDeviceDefinition.g:631:4: (lv_type_1_0= ruleActuatorType )
            // InternalDeviceDefinition.g:632:5: lv_type_1_0= ruleActuatorType
            {

            					newCompositeNode(grammarAccess.getActuatorAccess().getTypeActuatorTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_type_1_0=ruleActuatorType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActuatorRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"dk.gms.dsl.DeviceDefinition.ActuatorType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getActuatorAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getActuatorAccess().getPinsKeyword_3());
            		
            otherlv_4=(Token)match(input,24,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getActuatorAccess().getLeftParenthesisKeyword_4());
            		
            // InternalDeviceDefinition.g:661:3: ( (lv_pins_5_0= RULE_INT ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_INT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDeviceDefinition.g:662:4: (lv_pins_5_0= RULE_INT )
            	    {
            	    // InternalDeviceDefinition.g:662:4: (lv_pins_5_0= RULE_INT )
            	    // InternalDeviceDefinition.g:663:5: lv_pins_5_0= RULE_INT
            	    {
            	    lv_pins_5_0=(Token)match(input,RULE_INT,FOLLOW_21); 

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
            	    break loop7;
                }
            } while (true);

            // InternalDeviceDefinition.g:679:3: (otherlv_6= ',' ( (lv_pins_7_0= RULE_INT ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDeviceDefinition.g:680:4: otherlv_6= ',' ( (lv_pins_7_0= RULE_INT ) )
            	    {
            	    otherlv_6=(Token)match(input,25,FOLLOW_22); 

            	    				newLeafNode(otherlv_6, grammarAccess.getActuatorAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalDeviceDefinition.g:684:4: ( (lv_pins_7_0= RULE_INT ) )
            	    // InternalDeviceDefinition.g:685:5: (lv_pins_7_0= RULE_INT )
            	    {
            	    // InternalDeviceDefinition.g:685:5: (lv_pins_7_0= RULE_INT )
            	    // InternalDeviceDefinition.g:686:6: lv_pins_7_0= RULE_INT
            	    {
            	    lv_pins_7_0=(Token)match(input,RULE_INT,FOLLOW_23); 

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
            	    break loop8;
                }
            } while (true);

            otherlv_8=(Token)match(input,26,FOLLOW_26); 

            			newLeafNode(otherlv_8, grammarAccess.getActuatorAccess().getRightParenthesisKeyword_7());
            		
            // InternalDeviceDefinition.g:707:3: ( (lv_settings_9_0= ruleSetting ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==29) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDeviceDefinition.g:708:4: (lv_settings_9_0= ruleSetting )
            	    {
            	    // InternalDeviceDefinition.g:708:4: (lv_settings_9_0= ruleSetting )
            	    // InternalDeviceDefinition.g:709:5: lv_settings_9_0= ruleSetting
            	    {

            	    					newCompositeNode(grammarAccess.getActuatorAccess().getSettingsSettingParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_settings_9_0=ruleSetting();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActuatorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"settings",
            	    						lv_settings_9_0,
            	    						"dk.gms.dsl.DeviceDefinition.Setting");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleActuator"


    // $ANTLR start "entryRuleSetting"
    // InternalDeviceDefinition.g:730:1: entryRuleSetting returns [EObject current=null] : iv_ruleSetting= ruleSetting EOF ;
    public final EObject entryRuleSetting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetting = null;


        try {
            // InternalDeviceDefinition.g:730:48: (iv_ruleSetting= ruleSetting EOF )
            // InternalDeviceDefinition.g:731:2: iv_ruleSetting= ruleSetting EOF
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
    // InternalDeviceDefinition.g:737:1: ruleSetting returns [EObject current=null] : (otherlv_0= 'Setting' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'default' ( (lv_value_4_0= RULE_INT ) ) ) ;
    public final EObject ruleSetting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;


        	enterRule();

        try {
            // InternalDeviceDefinition.g:743:2: ( (otherlv_0= 'Setting' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'default' ( (lv_value_4_0= RULE_INT ) ) ) )
            // InternalDeviceDefinition.g:744:2: (otherlv_0= 'Setting' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'default' ( (lv_value_4_0= RULE_INT ) ) )
            {
            // InternalDeviceDefinition.g:744:2: (otherlv_0= 'Setting' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'default' ( (lv_value_4_0= RULE_INT ) ) )
            // InternalDeviceDefinition.g:745:3: otherlv_0= 'Setting' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'default' ( (lv_value_4_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSettingAccess().getSettingKeyword_0());
            		
            // InternalDeviceDefinition.g:749:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDeviceDefinition.g:750:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDeviceDefinition.g:750:4: (lv_name_1_0= RULE_ID )
            // InternalDeviceDefinition.g:751:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getSettingAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,30,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getSettingAccess().getDefaultKeyword_3());
            		
            // InternalDeviceDefinition.g:775:3: ( (lv_value_4_0= RULE_INT ) )
            // InternalDeviceDefinition.g:776:4: (lv_value_4_0= RULE_INT )
            {
            // InternalDeviceDefinition.g:776:4: (lv_value_4_0= RULE_INT )
            // InternalDeviceDefinition.g:777:5: lv_value_4_0= RULE_INT
            {
            lv_value_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_4_0, grammarAccess.getSettingAccess().getValueINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSettingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_4_0,
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
    // $ANTLR end "ruleSetting"


    // $ANTLR start "ruleGraphType"
    // InternalDeviceDefinition.g:797:1: ruleGraphType returns [Enumerator current=null] : ( (enumLiteral_0= 'Line' ) | (enumLiteral_1= 'BoxPlot' ) | (enumLiteral_2= 'Histogram' ) ) ;
    public final Enumerator ruleGraphType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDeviceDefinition.g:803:2: ( ( (enumLiteral_0= 'Line' ) | (enumLiteral_1= 'BoxPlot' ) | (enumLiteral_2= 'Histogram' ) ) )
            // InternalDeviceDefinition.g:804:2: ( (enumLiteral_0= 'Line' ) | (enumLiteral_1= 'BoxPlot' ) | (enumLiteral_2= 'Histogram' ) )
            {
            // InternalDeviceDefinition.g:804:2: ( (enumLiteral_0= 'Line' ) | (enumLiteral_1= 'BoxPlot' ) | (enumLiteral_2= 'Histogram' ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt10=1;
                }
                break;
            case 32:
                {
                alt10=2;
                }
                break;
            case 33:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalDeviceDefinition.g:805:3: (enumLiteral_0= 'Line' )
                    {
                    // InternalDeviceDefinition.g:805:3: (enumLiteral_0= 'Line' )
                    // InternalDeviceDefinition.g:806:4: enumLiteral_0= 'Line'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getGraphTypeAccess().getLineEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getGraphTypeAccess().getLineEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDeviceDefinition.g:813:3: (enumLiteral_1= 'BoxPlot' )
                    {
                    // InternalDeviceDefinition.g:813:3: (enumLiteral_1= 'BoxPlot' )
                    // InternalDeviceDefinition.g:814:4: enumLiteral_1= 'BoxPlot'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getGraphTypeAccess().getBoxPlotEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getGraphTypeAccess().getBoxPlotEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDeviceDefinition.g:821:3: (enumLiteral_2= 'Histogram' )
                    {
                    // InternalDeviceDefinition.g:821:3: (enumLiteral_2= 'Histogram' )
                    // InternalDeviceDefinition.g:822:4: enumLiteral_2= 'Histogram'
                    {
                    enumLiteral_2=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getGraphTypeAccess().getHistogramEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getGraphTypeAccess().getHistogramEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleGraphType"


    // $ANTLR start "ruleSensorType"
    // InternalDeviceDefinition.g:832:1: ruleSensorType returns [Enumerator current=null] : ( (enumLiteral_0= 'Moisture' ) | (enumLiteral_1= 'Temperature' ) | (enumLiteral_2= 'HumidityAndTemperature' ) | (enumLiteral_3= 'AirHumidity' ) | (enumLiteral_4= 'CO2' ) | (enumLiteral_5= 'Light' ) ) ;
    public final Enumerator ruleSensorType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalDeviceDefinition.g:838:2: ( ( (enumLiteral_0= 'Moisture' ) | (enumLiteral_1= 'Temperature' ) | (enumLiteral_2= 'HumidityAndTemperature' ) | (enumLiteral_3= 'AirHumidity' ) | (enumLiteral_4= 'CO2' ) | (enumLiteral_5= 'Light' ) ) )
            // InternalDeviceDefinition.g:839:2: ( (enumLiteral_0= 'Moisture' ) | (enumLiteral_1= 'Temperature' ) | (enumLiteral_2= 'HumidityAndTemperature' ) | (enumLiteral_3= 'AirHumidity' ) | (enumLiteral_4= 'CO2' ) | (enumLiteral_5= 'Light' ) )
            {
            // InternalDeviceDefinition.g:839:2: ( (enumLiteral_0= 'Moisture' ) | (enumLiteral_1= 'Temperature' ) | (enumLiteral_2= 'HumidityAndTemperature' ) | (enumLiteral_3= 'AirHumidity' ) | (enumLiteral_4= 'CO2' ) | (enumLiteral_5= 'Light' ) )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt11=1;
                }
                break;
            case 35:
                {
                alt11=2;
                }
                break;
            case 36:
                {
                alt11=3;
                }
                break;
            case 37:
                {
                alt11=4;
                }
                break;
            case 38:
                {
                alt11=5;
                }
                break;
            case 39:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalDeviceDefinition.g:840:3: (enumLiteral_0= 'Moisture' )
                    {
                    // InternalDeviceDefinition.g:840:3: (enumLiteral_0= 'Moisture' )
                    // InternalDeviceDefinition.g:841:4: enumLiteral_0= 'Moisture'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getMoistureEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSensorTypeAccess().getMoistureEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDeviceDefinition.g:848:3: (enumLiteral_1= 'Temperature' )
                    {
                    // InternalDeviceDefinition.g:848:3: (enumLiteral_1= 'Temperature' )
                    // InternalDeviceDefinition.g:849:4: enumLiteral_1= 'Temperature'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getTemperatureEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSensorTypeAccess().getTemperatureEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDeviceDefinition.g:856:3: (enumLiteral_2= 'HumidityAndTemperature' )
                    {
                    // InternalDeviceDefinition.g:856:3: (enumLiteral_2= 'HumidityAndTemperature' )
                    // InternalDeviceDefinition.g:857:4: enumLiteral_2= 'HumidityAndTemperature'
                    {
                    enumLiteral_2=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getHumidityAndTemperatureEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSensorTypeAccess().getHumidityAndTemperatureEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDeviceDefinition.g:864:3: (enumLiteral_3= 'AirHumidity' )
                    {
                    // InternalDeviceDefinition.g:864:3: (enumLiteral_3= 'AirHumidity' )
                    // InternalDeviceDefinition.g:865:4: enumLiteral_3= 'AirHumidity'
                    {
                    enumLiteral_3=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getAirHumidityEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSensorTypeAccess().getAirHumidityEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDeviceDefinition.g:872:3: (enumLiteral_4= 'CO2' )
                    {
                    // InternalDeviceDefinition.g:872:3: (enumLiteral_4= 'CO2' )
                    // InternalDeviceDefinition.g:873:4: enumLiteral_4= 'CO2'
                    {
                    enumLiteral_4=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getCO2EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getSensorTypeAccess().getCO2EnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDeviceDefinition.g:880:3: (enumLiteral_5= 'Light' )
                    {
                    // InternalDeviceDefinition.g:880:3: (enumLiteral_5= 'Light' )
                    // InternalDeviceDefinition.g:881:4: enumLiteral_5= 'Light'
                    {
                    enumLiteral_5=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getLightEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getSensorTypeAccess().getLightEnumLiteralDeclaration_5());
                    			

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
    // $ANTLR end "ruleSensorType"


    // $ANTLR start "ruleActuatorType"
    // InternalDeviceDefinition.g:891:1: ruleActuatorType returns [Enumerator current=null] : ( (enumLiteral_0= 'LED' ) | (enumLiteral_1= 'WaterPump' ) ) ;
    public final Enumerator ruleActuatorType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDeviceDefinition.g:897:2: ( ( (enumLiteral_0= 'LED' ) | (enumLiteral_1= 'WaterPump' ) ) )
            // InternalDeviceDefinition.g:898:2: ( (enumLiteral_0= 'LED' ) | (enumLiteral_1= 'WaterPump' ) )
            {
            // InternalDeviceDefinition.g:898:2: ( (enumLiteral_0= 'LED' ) | (enumLiteral_1= 'WaterPump' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==40) ) {
                alt12=1;
            }
            else if ( (LA12_0==41) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalDeviceDefinition.g:899:3: (enumLiteral_0= 'LED' )
                    {
                    // InternalDeviceDefinition.g:899:3: (enumLiteral_0= 'LED' )
                    // InternalDeviceDefinition.g:900:4: enumLiteral_0= 'LED'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getActuatorTypeAccess().getLEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActuatorTypeAccess().getLEDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDeviceDefinition.g:907:3: (enumLiteral_1= 'WaterPump' )
                    {
                    // InternalDeviceDefinition.g:907:3: (enumLiteral_1= 'WaterPump' )
                    // InternalDeviceDefinition.g:908:4: enumLiteral_1= 'WaterPump'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getActuatorTypeAccess().getWaterPumpEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActuatorTypeAccess().getWaterPumpEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleActuatorType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010400002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000FC00000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000006000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});

}