/*
 * generated by Xtext 2.25.0
 */
package dk.gms.dsl.ui.tests;

import com.google.inject.Injector;
import dk.gms.dsl.DeviceDSL.ui.internal.DeviceDSLActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class DeviceDefinitionUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return DeviceDSLActivator.getInstance().getInjector("dk.gms.dsl.DeviceDefinition");
	}

}
