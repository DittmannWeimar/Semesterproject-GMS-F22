/*
 * generated by Xtext 2.26.0
 */
package dk.sdu.gms.dds


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class DeviceDefinitionStandaloneSetup extends DeviceDefinitionStandaloneSetupGenerated {

	def static void doSetup() {
		new DeviceDefinitionStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}