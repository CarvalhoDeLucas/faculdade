package negocio;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AdicionaContaTest {

    @Test
    public void testAdicionaConta() {
        ContaCorrente contaCorrente = new ContaCorrente(1, 1000, true);
        List<ContaCorrente> contaCorrentes = new ArrayList<>();
        contaCorrentes.add(contaCorrente);

        GerenciadoraContas contas = new GerenciadoraContas(contaCorrentes);
        contas.adicionaConta(contaCorrente);

        assertEquals("Deve ter duas contas cadastrada", 2, contas.getContasDoBanco().size());
    }

}
