/*
 * generated by Xtext 2.17.1
 */
package fr.n7.ui.tests;

import com.google.inject.Injector;
import fr.n7.JEU.ui.internal.JEUActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class JEUUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return JEUActivator.getInstance().getInjector("fr.n7.JEU");
	}

}
