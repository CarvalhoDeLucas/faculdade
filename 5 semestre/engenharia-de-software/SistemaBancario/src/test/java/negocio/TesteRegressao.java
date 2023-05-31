package negocio;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AdicionaContaTest.class,
        AdicionaClienteTest.class,
        ClienteAtivoTest.class,
        ContaAtivaTest.class,
        GetContasDoBancoTest.class,
        GetClientesDoBancoTest.class,
        LimpaTest.class,
        PesquisaContaTest.class,
        PesquisaClienteTest.class,
        RemoveContaTest.class,
        RemoveClienteTest.class,
        TransfereValorTest.class,
        ValidaIdadeTest.class
})
public class TesteRegressao {}
