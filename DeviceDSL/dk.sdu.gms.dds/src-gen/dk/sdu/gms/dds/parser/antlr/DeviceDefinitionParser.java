/*
 * generated by Xtext 2.26.0
 */
package dk.sdu.gms.dds.parser.antlr;

import com.google.inject.Inject;
import dk.sdu.gms.dds.parser.antlr.internal.InternalDeviceDefinitionParser;
import dk.sdu.gms.dds.services.DeviceDefinitionGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class DeviceDefinitionParser extends AbstractAntlrParser {

	@Inject
	private DeviceDefinitionGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalDeviceDefinitionParser createParser(XtextTokenStream stream) {
		return new InternalDeviceDefinitionParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "System";
	}

	public DeviceDefinitionGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DeviceDefinitionGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
