/*
 * generated by Xtext 2.25.0
 */
package dk.sdu.gms.dds.ui.tests;

import com.google.inject.Injector;
import dk.sdu.gms.dds.ui.internal.DdsActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class DeviceDefinitionUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return DdsActivator.getInstance().getInjector("dk.sdu.gms.dds.DeviceDefinition");
	}

}
