package dk.sdu.gms.dds.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDeviceDefinitionLexer extends Lexer {
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

    public InternalDeviceDefinitionLexer() {;} 
    public InternalDeviceDefinitionLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDeviceDefinitionLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalDeviceDefinition.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:11:7: ( 'second' )
            // InternalDeviceDefinition.g:11:9: 'second'
            {
            match("second"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:12:7: ( 'seconds' )
            // InternalDeviceDefinition.g:12:9: 'seconds'
            {
            match("seconds"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:13:7: ( 'minute' )
            // InternalDeviceDefinition.g:13:9: 'minute'
            {
            match("minute"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:14:7: ( 'minutes' )
            // InternalDeviceDefinition.g:14:9: 'minutes'
            {
            match("minutes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:15:7: ( 'hour' )
            // InternalDeviceDefinition.g:15:9: 'hour'
            {
            match("hour"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:16:7: ( 'hours' )
            // InternalDeviceDefinition.g:16:9: 'hours'
            {
            match("hours"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:17:7: ( '.' )
            // InternalDeviceDefinition.g:17:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:18:7: ( '->' )
            // InternalDeviceDefinition.g:18:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:19:7: ( 'red' )
            // InternalDeviceDefinition.g:19:9: 'red'
            {
            match("red"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:20:7: ( 'green' )
            // InternalDeviceDefinition.g:20:9: 'green'
            {
            match("green"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:21:7: ( 'blue' )
            // InternalDeviceDefinition.g:21:9: 'blue'
            {
            match("blue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:22:7: ( 'yellow' )
            // InternalDeviceDefinition.g:22:9: 'yellow'
            {
            match("yellow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:23:7: ( 'System' )
            // InternalDeviceDefinition.g:23:9: 'System'
            {
            match("System"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:24:7: ( ':' )
            // InternalDeviceDefinition.g:24:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:25:7: ( 'wifi' )
            // InternalDeviceDefinition.g:25:9: 'wifi'
            {
            match("wifi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:26:7: ( 'mqtt' )
            // InternalDeviceDefinition.g:26:9: 'mqtt'
            {
            match("mqtt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:27:7: ( 'with' )
            // InternalDeviceDefinition.g:27:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:28:7: ( 'password' )
            // InternalDeviceDefinition.g:28:9: 'password'
            {
            match("password"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:29:7: ( 'username' )
            // InternalDeviceDefinition.g:29:9: 'username'
            {
            match("username"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:30:7: ( 'and' )
            // InternalDeviceDefinition.g:30:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:31:7: ( 'Graph' )
            // InternalDeviceDefinition.g:31:9: 'Graph'
            {
            match("Graph"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:32:7: ( 'category' )
            // InternalDeviceDefinition.g:32:9: 'category'
            {
            match("category"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:33:7: ( 'title' )
            // InternalDeviceDefinition.g:33:9: 'title'
            {
            match("title"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:34:7: ( 'x' )
            // InternalDeviceDefinition.g:34:9: 'x'
            {
            match('x'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:35:7: ( 'y' )
            // InternalDeviceDefinition.g:35:9: 'y'
            {
            match('y'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:36:7: ( 'line' )
            // InternalDeviceDefinition.g:36:9: 'line'
            {
            match("line"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:37:7: ( 'legend' )
            // InternalDeviceDefinition.g:37:9: 'legend'
            {
            match("legend"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:38:7: ( 'color' )
            // InternalDeviceDefinition.g:38:9: 'color'
            {
            match("color"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:39:7: ( '(' )
            // InternalDeviceDefinition.g:39:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:40:7: ( ',' )
            // InternalDeviceDefinition.g:40:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:41:7: ( ')' )
            // InternalDeviceDefinition.g:41:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:42:7: ( 'random' )
            // InternalDeviceDefinition.g:42:9: 'random'
            {
            match("random"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:43:7: ( 'Gateway' )
            // InternalDeviceDefinition.g:43:9: 'Gateway'
            {
            match("Gateway"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:44:7: ( 'mac' )
            // InternalDeviceDefinition.g:44:9: 'mac'
            {
            match("mac"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:45:7: ( 'Worker' )
            // InternalDeviceDefinition.g:45:9: 'Worker'
            {
            match("Worker"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:46:7: ( 'sleep' )
            // InternalDeviceDefinition.g:46:9: 'sleep'
            {
            match("sleep"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:47:7: ( 'for' )
            // InternalDeviceDefinition.g:47:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:48:7: ( 'Sensor' )
            // InternalDeviceDefinition.g:48:9: 'Sensor'
            {
            match("Sensor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:49:7: ( 'pins' )
            // InternalDeviceDefinition.g:49:9: 'pins'
            {
            match("pins"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:50:7: ( 'sample' )
            // InternalDeviceDefinition.g:50:9: 'sample'
            {
            match("sample"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:51:7: ( 'if' )
            // InternalDeviceDefinition.g:51:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:52:7: ( 'adc' )
            // InternalDeviceDefinition.g:52:9: 'adc'
            {
            match("adc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:53:7: ( 'dac' )
            // InternalDeviceDefinition.g:53:9: 'dac'
            {
            match("dac"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:54:7: ( 'in' )
            // InternalDeviceDefinition.g:54:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:55:7: ( 'out' )
            // InternalDeviceDefinition.g:55:9: 'out'
            {
            match("out"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:56:7: ( 'as' )
            // InternalDeviceDefinition.g:56:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:57:7: ( 'mapping' )
            // InternalDeviceDefinition.g:57:9: 'mapping'
            {
            match("mapping"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:58:7: ( 'Actuator' )
            // InternalDeviceDefinition.g:58:9: 'Actuator'
            {
            match("Actuator"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:59:7: ( 'when' )
            // InternalDeviceDefinition.g:59:9: 'when'
            {
            match("when"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:60:7: ( 'on' )
            // InternalDeviceDefinition.g:60:9: 'on'
            {
            match("on"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:61:7: ( 'off' )
            // InternalDeviceDefinition.g:61:9: 'off'
            {
            match("off"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:62:7: ( 'run' )
            // InternalDeviceDefinition.g:62:9: 'run'
            {
            match("run"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:63:7: ( 'setting' )
            // InternalDeviceDefinition.g:63:9: 'setting'
            {
            match("setting"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:64:7: ( '=' )
            // InternalDeviceDefinition.g:64:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:65:7: ( 'TRUE' )
            // InternalDeviceDefinition.g:65:9: 'TRUE'
            {
            match("TRUE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:66:7: ( 'FALSE' )
            // InternalDeviceDefinition.g:66:9: 'FALSE'
            {
            match("FALSE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:67:7: ( '+' )
            // InternalDeviceDefinition.g:67:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:68:7: ( '-' )
            // InternalDeviceDefinition.g:68:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:69:7: ( '*' )
            // InternalDeviceDefinition.g:69:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:70:7: ( '/' )
            // InternalDeviceDefinition.g:70:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:71:7: ( '>' )
            // InternalDeviceDefinition.g:71:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:72:7: ( '<' )
            // InternalDeviceDefinition.g:72:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:73:7: ( '>=' )
            // InternalDeviceDefinition.g:73:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:74:7: ( '<=' )
            // InternalDeviceDefinition.g:74:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:75:7: ( '==' )
            // InternalDeviceDefinition.g:75:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:76:7: ( '!=' )
            // InternalDeviceDefinition.g:76:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:77:7: ( 'or' )
            // InternalDeviceDefinition.g:77:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:78:7: ( 'value' )
            // InternalDeviceDefinition.g:78:9: 'value'
            {
            match("value"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:79:7: ( 'call' )
            // InternalDeviceDefinition.g:79:9: 'call'
            {
            match("call"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "RULE_MAC"
    public final void mRULE_MAC() throws RecognitionException {
        try {
            int _type = RULE_MAC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:8166:10: ( RULE_HEXBYTE ':' RULE_HEXBYTE ':' RULE_HEXBYTE ':' RULE_HEXBYTE ':' RULE_HEXBYTE ':' RULE_HEXBYTE )
            // InternalDeviceDefinition.g:8166:12: RULE_HEXBYTE ':' RULE_HEXBYTE ':' RULE_HEXBYTE ':' RULE_HEXBYTE ':' RULE_HEXBYTE ':' RULE_HEXBYTE
            {
            mRULE_HEXBYTE(); 
            match(':'); 
            mRULE_HEXBYTE(); 
            match(':'); 
            mRULE_HEXBYTE(); 
            match(':'); 
            mRULE_HEXBYTE(); 
            match(':'); 
            mRULE_HEXBYTE(); 
            match(':'); 
            mRULE_HEXBYTE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MAC"

    // $ANTLR start "RULE_HEXBYTE"
    public final void mRULE_HEXBYTE() throws RecognitionException {
        try {
            // InternalDeviceDefinition.g:8168:23: ( ( '0' .. '9' | 'A' .. 'F' ) ( '0' .. '9' | 'A' .. 'F' ) )
            // InternalDeviceDefinition.g:8168:25: ( '0' .. '9' | 'A' .. 'F' ) ( '0' .. '9' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEXBYTE"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:8170:14: ( ( '-' )? RULE_INT ( '.' RULE_INT )+ )
            // InternalDeviceDefinition.g:8170:16: ( '-' )? RULE_INT ( '.' RULE_INT )+
            {
            // InternalDeviceDefinition.g:8170:16: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDeviceDefinition.g:8170:16: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            mRULE_INT(); 
            // InternalDeviceDefinition.g:8170:30: ( '.' RULE_INT )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='.') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDeviceDefinition.g:8170:31: '.' RULE_INT
            	    {
            	    match('.'); 
            	    mRULE_INT(); 

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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:8172:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalDeviceDefinition.g:8172:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalDeviceDefinition.g:8172:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDeviceDefinition.g:8172:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalDeviceDefinition.g:8172:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDeviceDefinition.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:8174:10: ( ( '0' .. '9' )+ )
            // InternalDeviceDefinition.g:8174:12: ( '0' .. '9' )+
            {
            // InternalDeviceDefinition.g:8174:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDeviceDefinition.g:8174:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:8176:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalDeviceDefinition.g:8176:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalDeviceDefinition.g:8176:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalDeviceDefinition.g:8176:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalDeviceDefinition.g:8176:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalDeviceDefinition.g:8176:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDeviceDefinition.g:8176:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalDeviceDefinition.g:8176:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalDeviceDefinition.g:8176:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalDeviceDefinition.g:8176:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDeviceDefinition.g:8176:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:8178:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalDeviceDefinition.g:8178:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalDeviceDefinition.g:8178:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDeviceDefinition.g:8178:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:8180:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalDeviceDefinition.g:8180:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalDeviceDefinition.g:8180:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDeviceDefinition.g:8180:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalDeviceDefinition.g:8180:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDeviceDefinition.g:8180:41: ( '\\r' )? '\\n'
                    {
                    // InternalDeviceDefinition.g:8180:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalDeviceDefinition.g:8180:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:8182:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalDeviceDefinition.g:8182:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalDeviceDefinition.g:8182:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDeviceDefinition.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceDefinition.g:8184:16: ( . )
            // InternalDeviceDefinition.g:8184:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalDeviceDefinition.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | RULE_MAC | RULE_DECIMAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=78;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalDeviceDefinition.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalDeviceDefinition.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalDeviceDefinition.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalDeviceDefinition.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalDeviceDefinition.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalDeviceDefinition.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalDeviceDefinition.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalDeviceDefinition.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalDeviceDefinition.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalDeviceDefinition.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalDeviceDefinition.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalDeviceDefinition.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalDeviceDefinition.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalDeviceDefinition.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalDeviceDefinition.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalDeviceDefinition.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalDeviceDefinition.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalDeviceDefinition.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalDeviceDefinition.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalDeviceDefinition.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalDeviceDefinition.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalDeviceDefinition.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalDeviceDefinition.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalDeviceDefinition.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalDeviceDefinition.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // InternalDeviceDefinition.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // InternalDeviceDefinition.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // InternalDeviceDefinition.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // InternalDeviceDefinition.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // InternalDeviceDefinition.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // InternalDeviceDefinition.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // InternalDeviceDefinition.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // InternalDeviceDefinition.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // InternalDeviceDefinition.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // InternalDeviceDefinition.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // InternalDeviceDefinition.g:1:220: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // InternalDeviceDefinition.g:1:226: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // InternalDeviceDefinition.g:1:232: T__51
                {
                mT__51(); 

                }
                break;
            case 39 :
                // InternalDeviceDefinition.g:1:238: T__52
                {
                mT__52(); 

                }
                break;
            case 40 :
                // InternalDeviceDefinition.g:1:244: T__53
                {
                mT__53(); 

                }
                break;
            case 41 :
                // InternalDeviceDefinition.g:1:250: T__54
                {
                mT__54(); 

                }
                break;
            case 42 :
                // InternalDeviceDefinition.g:1:256: T__55
                {
                mT__55(); 

                }
                break;
            case 43 :
                // InternalDeviceDefinition.g:1:262: T__56
                {
                mT__56(); 

                }
                break;
            case 44 :
                // InternalDeviceDefinition.g:1:268: T__57
                {
                mT__57(); 

                }
                break;
            case 45 :
                // InternalDeviceDefinition.g:1:274: T__58
                {
                mT__58(); 

                }
                break;
            case 46 :
                // InternalDeviceDefinition.g:1:280: T__59
                {
                mT__59(); 

                }
                break;
            case 47 :
                // InternalDeviceDefinition.g:1:286: T__60
                {
                mT__60(); 

                }
                break;
            case 48 :
                // InternalDeviceDefinition.g:1:292: T__61
                {
                mT__61(); 

                }
                break;
            case 49 :
                // InternalDeviceDefinition.g:1:298: T__62
                {
                mT__62(); 

                }
                break;
            case 50 :
                // InternalDeviceDefinition.g:1:304: T__63
                {
                mT__63(); 

                }
                break;
            case 51 :
                // InternalDeviceDefinition.g:1:310: T__64
                {
                mT__64(); 

                }
                break;
            case 52 :
                // InternalDeviceDefinition.g:1:316: T__65
                {
                mT__65(); 

                }
                break;
            case 53 :
                // InternalDeviceDefinition.g:1:322: T__66
                {
                mT__66(); 

                }
                break;
            case 54 :
                // InternalDeviceDefinition.g:1:328: T__67
                {
                mT__67(); 

                }
                break;
            case 55 :
                // InternalDeviceDefinition.g:1:334: T__68
                {
                mT__68(); 

                }
                break;
            case 56 :
                // InternalDeviceDefinition.g:1:340: T__69
                {
                mT__69(); 

                }
                break;
            case 57 :
                // InternalDeviceDefinition.g:1:346: T__70
                {
                mT__70(); 

                }
                break;
            case 58 :
                // InternalDeviceDefinition.g:1:352: T__71
                {
                mT__71(); 

                }
                break;
            case 59 :
                // InternalDeviceDefinition.g:1:358: T__72
                {
                mT__72(); 

                }
                break;
            case 60 :
                // InternalDeviceDefinition.g:1:364: T__73
                {
                mT__73(); 

                }
                break;
            case 61 :
                // InternalDeviceDefinition.g:1:370: T__74
                {
                mT__74(); 

                }
                break;
            case 62 :
                // InternalDeviceDefinition.g:1:376: T__75
                {
                mT__75(); 

                }
                break;
            case 63 :
                // InternalDeviceDefinition.g:1:382: T__76
                {
                mT__76(); 

                }
                break;
            case 64 :
                // InternalDeviceDefinition.g:1:388: T__77
                {
                mT__77(); 

                }
                break;
            case 65 :
                // InternalDeviceDefinition.g:1:394: T__78
                {
                mT__78(); 

                }
                break;
            case 66 :
                // InternalDeviceDefinition.g:1:400: T__79
                {
                mT__79(); 

                }
                break;
            case 67 :
                // InternalDeviceDefinition.g:1:406: T__80
                {
                mT__80(); 

                }
                break;
            case 68 :
                // InternalDeviceDefinition.g:1:412: T__81
                {
                mT__81(); 

                }
                break;
            case 69 :
                // InternalDeviceDefinition.g:1:418: T__82
                {
                mT__82(); 

                }
                break;
            case 70 :
                // InternalDeviceDefinition.g:1:424: RULE_MAC
                {
                mRULE_MAC(); 

                }
                break;
            case 71 :
                // InternalDeviceDefinition.g:1:433: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 72 :
                // InternalDeviceDefinition.g:1:446: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 73 :
                // InternalDeviceDefinition.g:1:454: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 74 :
                // InternalDeviceDefinition.g:1:463: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 75 :
                // InternalDeviceDefinition.g:1:475: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 76 :
                // InternalDeviceDefinition.g:1:491: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 77 :
                // InternalDeviceDefinition.g:1:507: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 78 :
                // InternalDeviceDefinition.g:1:515: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\3\63\1\uffff\1\72\3\63\1\102\1\63\1\uffff\7\63\1\123\1\63\3\uffff\6\63\1\145\2\63\2\uffff\1\154\1\156\1\160\1\57\1\63\1\164\1\63\1\57\1\uffff\2\57\2\uffff\3\63\1\uffff\4\63\4\uffff\6\63\1\uffff\2\63\1\uffff\7\63\1\u0091\5\63\1\uffff\2\63\3\uffff\2\63\1\u009c\1\u009d\2\63\1\u00a0\1\63\1\u00a2\2\63\2\uffff\2\63\12\uffff\1\63\1\164\4\uffff\6\63\1\u00ae\2\63\1\u00b1\1\63\1\u00b3\13\63\1\u00bf\1\u00c0\1\uffff\11\63\1\u00ca\2\uffff\1\u00cb\1\u00cc\1\uffff\1\u00cd\1\uffff\4\63\1\164\5\63\1\u00d7\1\uffff\1\63\1\u00da\1\uffff\1\63\1\uffff\1\63\1\u00dd\3\63\1\u00e1\1\u00e2\1\u00e3\1\63\1\u00e5\1\63\2\uffff\3\63\1\u00ea\2\63\1\u00ed\2\63\4\uffff\1\63\1\u00f1\4\63\1\u00f6\2\63\1\uffff\1\63\1\u00fa\1\uffff\1\63\1\u00fc\1\uffff\3\63\3\uffff\1\63\1\uffff\1\63\1\u0102\2\63\1\uffff\1\u0105\1\u0106\1\uffff\3\63\1\uffff\1\u010a\1\u010b\1\u010d\1\63\1\uffff\1\u010f\1\u0111\1\63\1\uffff\1\u0113\1\uffff\1\u0114\1\u0115\1\u0116\2\63\1\uffff\2\63\2\uffff\1\u011b\1\u011c\1\63\2\uffff\1\u011e\1\uffff\1\u011f\1\uffff\1\u0120\1\uffff\1\u0121\4\uffff\2\63\1\u0124\1\63\2\uffff\1\63\4\uffff\1\u0127\1\u0128\1\uffff\1\u0129\1\u012a\4\uffff";
    static final String DFA14_eofS =
        "\u012b\uffff";
    static final String DFA14_minS =
        "\1\0\2\141\1\157\1\uffff\1\60\1\141\1\162\1\154\1\60\1\145\1\uffff\1\150\1\141\1\163\1\144\2\141\1\151\1\60\1\145\3\uffff\2\157\1\146\1\141\1\146\1\60\1\75\1\122\1\60\2\uffff\1\52\3\75\1\141\1\56\1\60\1\101\1\uffff\2\0\2\uffff\1\143\1\145\1\155\1\uffff\1\156\1\164\1\143\1\165\4\uffff\1\144\2\156\1\145\1\165\1\154\1\uffff\1\163\1\156\1\uffff\1\146\1\145\1\163\1\156\1\145\1\144\1\143\1\60\1\141\1\164\2\154\1\164\1\uffff\1\156\1\147\3\uffff\2\162\2\60\1\143\1\164\1\60\1\146\1\60\1\164\1\72\2\uffff\1\125\1\72\12\uffff\1\154\1\56\4\uffff\1\157\1\164\1\145\1\160\1\165\1\164\1\60\1\160\1\162\1\60\1\144\1\60\2\145\1\154\1\164\1\163\1\151\1\150\1\156\2\163\1\162\2\60\1\uffff\1\160\2\145\1\154\1\157\1\154\2\145\1\153\1\60\2\uffff\2\60\1\uffff\1\60\1\uffff\1\165\1\105\1\123\1\165\1\56\1\156\1\151\1\160\1\154\1\164\1\60\1\uffff\1\151\1\60\1\uffff\1\157\1\uffff\1\156\1\60\1\157\1\145\1\157\3\60\1\167\1\60\1\156\2\uffff\1\150\1\167\1\147\1\60\1\162\1\145\1\60\1\156\1\145\4\uffff\1\141\1\60\1\105\1\145\1\144\1\156\1\60\2\145\1\uffff\1\156\1\60\1\uffff\1\155\1\60\1\uffff\1\167\1\155\1\162\3\uffff\1\157\1\uffff\1\141\1\60\1\141\1\157\1\uffff\2\60\1\uffff\1\144\1\162\1\164\1\uffff\3\60\1\147\1\uffff\2\60\1\147\1\uffff\1\60\1\uffff\3\60\1\162\1\155\1\uffff\1\171\1\162\2\uffff\2\60\1\157\2\uffff\1\60\1\uffff\1\60\1\uffff\1\60\1\uffff\1\60\4\uffff\1\144\1\145\1\60\1\171\2\uffff\1\162\4\uffff\2\60\1\uffff\2\60\4\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\154\1\161\1\157\1\uffff\1\76\1\165\1\162\1\154\1\172\1\171\1\uffff\2\151\2\163\1\162\1\157\1\151\1\172\1\151\3\uffff\2\157\1\156\1\141\1\165\1\143\1\75\1\122\1\106\2\uffff\1\57\3\75\1\141\2\106\1\172\1\uffff\2\uffff\2\uffff\1\164\1\145\1\155\1\uffff\1\156\1\164\1\160\1\165\4\uffff\1\144\2\156\1\145\1\165\1\154\1\uffff\1\163\1\156\1\uffff\1\164\1\145\1\163\1\156\1\145\1\144\1\143\1\172\1\141\2\164\1\154\1\164\1\uffff\1\156\1\147\3\uffff\2\162\2\172\1\143\1\164\1\172\1\146\1\172\1\164\1\72\2\uffff\1\125\1\114\12\uffff\1\154\1\72\4\uffff\1\157\1\164\1\145\1\160\1\165\1\164\1\172\1\160\1\162\1\172\1\144\1\172\2\145\1\154\1\164\1\163\1\151\1\150\1\156\2\163\1\162\2\172\1\uffff\1\160\2\145\1\154\1\157\1\154\2\145\1\153\1\172\2\uffff\2\172\1\uffff\1\172\1\uffff\1\165\1\105\1\123\1\165\1\71\1\156\1\151\1\160\1\154\1\164\1\172\1\uffff\1\151\1\172\1\uffff\1\157\1\uffff\1\156\1\172\1\157\1\145\1\157\3\172\1\167\1\172\1\156\2\uffff\1\150\1\167\1\147\1\172\1\162\1\145\1\172\1\156\1\145\4\uffff\1\141\1\172\1\105\1\145\1\144\1\156\1\172\2\145\1\uffff\1\156\1\172\1\uffff\1\155\1\172\1\uffff\1\167\1\155\1\162\3\uffff\1\157\1\uffff\1\141\1\172\1\141\1\157\1\uffff\2\172\1\uffff\1\144\1\162\1\164\1\uffff\3\172\1\147\1\uffff\2\172\1\147\1\uffff\1\172\1\uffff\3\172\1\162\1\155\1\uffff\1\171\1\162\2\uffff\2\172\1\157\2\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\172\4\uffff\1\144\1\145\1\172\1\171\2\uffff\1\162\4\uffff\2\172\1\uffff\2\172\4\uffff";
    static final String DFA14_acceptS =
        "\4\uffff\1\7\6\uffff\1\16\11\uffff\1\35\1\36\1\37\11\uffff\1\71\1\73\10\uffff\1\110\2\uffff\1\115\1\116\3\uffff\1\110\4\uffff\1\7\1\10\1\72\1\107\6\uffff\1\31\2\uffff\1\16\15\uffff\1\30\2\uffff\1\35\1\36\1\37\13\uffff\1\101\1\66\2\uffff\1\71\1\73\1\113\1\114\1\74\1\77\1\75\1\100\1\76\1\102\2\uffff\1\111\1\106\1\112\1\115\31\uffff\1\56\12\uffff\1\51\1\54\2\uffff\1\62\1\uffff\1\103\13\uffff\1\42\2\uffff\1\11\1\uffff\1\64\13\uffff\1\24\1\52\11\uffff\1\45\1\53\1\55\1\63\11\uffff\1\20\2\uffff\1\5\2\uffff\1\13\3\uffff\1\17\1\21\1\61\1\uffff\1\47\4\uffff\1\105\2\uffff\1\32\3\uffff\1\67\4\uffff\1\44\3\uffff\1\6\1\uffff\1\12\5\uffff\1\25\2\uffff\1\34\1\27\3\uffff\1\70\1\104\1\uffff\1\1\1\uffff\1\50\1\uffff\1\3\1\uffff\1\40\1\14\1\15\1\46\4\uffff\1\33\1\43\1\uffff\1\2\1\65\1\4\1\57\2\uffff\1\41\2\uffff\1\22\1\23\1\26\1\60";
    static final String DFA14_specialS =
        "\1\2\53\uffff\1\0\1\1\u00fd\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\57\2\56\2\57\1\56\22\57\1\56\1\46\1\54\4\57\1\55\1\25\1\27\1\42\1\41\1\26\1\5\1\4\1\43\12\50\1\13\1\57\1\45\1\36\1\44\2\57\1\35\4\51\1\40\1\20\13\53\1\12\1\37\2\53\1\30\3\53\3\57\1\52\1\53\1\57\1\17\1\10\1\21\1\33\1\53\1\31\1\7\1\3\1\32\2\53\1\24\1\2\1\53\1\34\1\15\1\53\1\6\1\1\1\22\1\16\1\47\1\14\1\23\1\11\1\53\uff85\57",
            "\1\62\3\uffff\1\60\6\uffff\1\61",
            "\1\66\7\uffff\1\64\7\uffff\1\65",
            "\1\67",
            "",
            "\12\73\4\uffff\1\71",
            "\1\75\3\uffff\1\74\17\uffff\1\76",
            "\1\77",
            "\1\100",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\101\25\63",
            "\1\104\23\uffff\1\103",
            "",
            "\1\107\1\106",
            "\1\110\7\uffff\1\111",
            "\1\112",
            "\1\114\11\uffff\1\113\4\uffff\1\115",
            "\1\117\20\uffff\1\116",
            "\1\120\15\uffff\1\121",
            "\1\122",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\125\3\uffff\1\124",
            "",
            "",
            "",
            "\1\131",
            "\1\132",
            "\1\133\7\uffff\1\134",
            "\1\135",
            "\1\140\7\uffff\1\137\3\uffff\1\141\2\uffff\1\136",
            "\12\143\7\uffff\6\143\34\uffff\1\142",
            "\1\144",
            "\1\146",
            "\12\143\7\uffff\1\147\5\143",
            "",
            "",
            "\1\152\4\uffff\1\153",
            "\1\155",
            "\1\157",
            "\1\161",
            "\1\162",
            "\1\73\1\uffff\12\163\7\uffff\6\165",
            "\12\143\7\uffff\6\143",
            "\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\0\166",
            "\0\166",
            "",
            "",
            "\1\170\20\uffff\1\171",
            "\1\172",
            "\1\173",
            "",
            "\1\174",
            "\1\175",
            "\1\176\14\uffff\1\177",
            "\1\u0080",
            "",
            "",
            "",
            "",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "",
            "\1\u0087",
            "\1\u0088",
            "",
            "\1\u0089\15\uffff\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0092",
            "\1\u0093",
            "\1\u0095\7\uffff\1\u0094",
            "\1\u0096",
            "\1\u0097",
            "",
            "\1\u0098",
            "\1\u0099",
            "",
            "",
            "",
            "\1\u009a",
            "\1\u009b",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u009e",
            "\1\u009f",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00a1",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00a3",
            "\1\165",
            "",
            "",
            "\1\u00a4",
            "\1\165\21\uffff\1\u00a5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a6",
            "\1\73\1\uffff\12\u00a7\1\165",
            "",
            "",
            "",
            "",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00af",
            "\1\u00b0",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00b2",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\73\1\uffff\12\u00a7",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u00d8",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\22\63\1\u00d9\7\63",
            "",
            "\1\u00db",
            "",
            "\1\u00dc",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00e4",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00e6",
            "",
            "",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00eb",
            "\1\u00ec",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00ee",
            "\1\u00ef",
            "",
            "",
            "",
            "",
            "\1\u00f0",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00f7",
            "\1\u00f8",
            "",
            "\1\u00f9",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u00fb",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "",
            "",
            "",
            "\1\u0100",
            "",
            "\1\u0101",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0103",
            "\1\u0104",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\22\63\1\u010c\7\63",
            "\1\u010e",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\22\63\1\u0110\7\63",
            "\1\u0112",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0117",
            "\1\u0118",
            "",
            "\1\u0119",
            "\1\u011a",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u011d",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "",
            "",
            "\1\u0122",
            "\1\u0123",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0125",
            "",
            "",
            "\1\u0126",
            "",
            "",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | RULE_MAC | RULE_DECIMAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_44 = input.LA(1);

                        s = -1;
                        if ( ((LA14_44>='\u0000' && LA14_44<='\uFFFF')) ) {s = 118;}

                        else s = 47;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_45 = input.LA(1);

                        s = -1;
                        if ( ((LA14_45>='\u0000' && LA14_45<='\uFFFF')) ) {s = 118;}

                        else s = 47;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='s') ) {s = 1;}

                        else if ( (LA14_0=='m') ) {s = 2;}

                        else if ( (LA14_0=='h') ) {s = 3;}

                        else if ( (LA14_0=='.') ) {s = 4;}

                        else if ( (LA14_0=='-') ) {s = 5;}

                        else if ( (LA14_0=='r') ) {s = 6;}

                        else if ( (LA14_0=='g') ) {s = 7;}

                        else if ( (LA14_0=='b') ) {s = 8;}

                        else if ( (LA14_0=='y') ) {s = 9;}

                        else if ( (LA14_0=='S') ) {s = 10;}

                        else if ( (LA14_0==':') ) {s = 11;}

                        else if ( (LA14_0=='w') ) {s = 12;}

                        else if ( (LA14_0=='p') ) {s = 13;}

                        else if ( (LA14_0=='u') ) {s = 14;}

                        else if ( (LA14_0=='a') ) {s = 15;}

                        else if ( (LA14_0=='G') ) {s = 16;}

                        else if ( (LA14_0=='c') ) {s = 17;}

                        else if ( (LA14_0=='t') ) {s = 18;}

                        else if ( (LA14_0=='x') ) {s = 19;}

                        else if ( (LA14_0=='l') ) {s = 20;}

                        else if ( (LA14_0=='(') ) {s = 21;}

                        else if ( (LA14_0==',') ) {s = 22;}

                        else if ( (LA14_0==')') ) {s = 23;}

                        else if ( (LA14_0=='W') ) {s = 24;}

                        else if ( (LA14_0=='f') ) {s = 25;}

                        else if ( (LA14_0=='i') ) {s = 26;}

                        else if ( (LA14_0=='d') ) {s = 27;}

                        else if ( (LA14_0=='o') ) {s = 28;}

                        else if ( (LA14_0=='A') ) {s = 29;}

                        else if ( (LA14_0=='=') ) {s = 30;}

                        else if ( (LA14_0=='T') ) {s = 31;}

                        else if ( (LA14_0=='F') ) {s = 32;}

                        else if ( (LA14_0=='+') ) {s = 33;}

                        else if ( (LA14_0=='*') ) {s = 34;}

                        else if ( (LA14_0=='/') ) {s = 35;}

                        else if ( (LA14_0=='>') ) {s = 36;}

                        else if ( (LA14_0=='<') ) {s = 37;}

                        else if ( (LA14_0=='!') ) {s = 38;}

                        else if ( (LA14_0=='v') ) {s = 39;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 40;}

                        else if ( ((LA14_0>='B' && LA14_0<='E')) ) {s = 41;}

                        else if ( (LA14_0=='^') ) {s = 42;}

                        else if ( ((LA14_0>='H' && LA14_0<='R')||(LA14_0>='U' && LA14_0<='V')||(LA14_0>='X' && LA14_0<='Z')||LA14_0=='_'||LA14_0=='e'||(LA14_0>='j' && LA14_0<='k')||LA14_0=='n'||LA14_0=='q'||LA14_0=='z') ) {s = 43;}

                        else if ( (LA14_0=='\"') ) {s = 44;}

                        else if ( (LA14_0=='\'') ) {s = 45;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 46;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||(LA14_0>='#' && LA14_0<='&')||LA14_0==';'||(LA14_0>='?' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\uFFFF')) ) {s = 47;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}