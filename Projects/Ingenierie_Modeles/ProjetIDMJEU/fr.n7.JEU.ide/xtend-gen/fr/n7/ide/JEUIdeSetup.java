/**
 * generated by Xtext 2.17.1
 */
package fr.n7.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import fr.n7.JEURuntimeModule;
import fr.n7.JEUStandaloneSetup;
import fr.n7.ide.JEUIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class JEUIdeSetup extends JEUStandaloneSetup {
  @Override
  public Injector createInjector() {
    JEURuntimeModule _jEURuntimeModule = new JEURuntimeModule();
    JEUIdeModule _jEUIdeModule = new JEUIdeModule();
    return Guice.createInjector(Modules2.mixin(_jEURuntimeModule, _jEUIdeModule));
  }
}
