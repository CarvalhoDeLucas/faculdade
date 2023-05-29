package negocio;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        negocio.GerenciadoraClientesTest.class,
        negocio.GerenciadoraContasTest.class
})
public class TesteRegressao {}
