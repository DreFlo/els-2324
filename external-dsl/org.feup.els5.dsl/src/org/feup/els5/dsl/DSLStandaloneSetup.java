/*
 * generated by Xtext 2.32.0
 */
package org.feup.els5.dsl;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class DSLStandaloneSetup extends DSLStandaloneSetupGenerated {

	public static void doSetup() {
		new DSLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
