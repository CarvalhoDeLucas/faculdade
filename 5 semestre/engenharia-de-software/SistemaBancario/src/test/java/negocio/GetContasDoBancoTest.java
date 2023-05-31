package negocio;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GetContasDoBancoTest {

    @Test
    public void testGetContasDoBanco() {
        ContaCorrente contaCorrente = new ContaCorrente(1, 1000, true);
        List<ContaCorrente> contaCorrentes = new ArrayList<>();
        contaCorrentes.add(contaCorrente);

        GerenciadoraContas contas = new GerenciadoraContas(contaCorrentes);

        assertEquals("Deve ter uma conta cadastrada", 1, contas.getContasDoBanco().size());
    }

}
