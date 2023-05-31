package negocio;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PesquisaContaTest {

    @Test
    public void testPesquisaConta() {
        ContaCorrente contaCorrente = new ContaCorrente(1, 1000, true);
        List<ContaCorrente> contaCorrentes = new ArrayList<>();
        contaCorrentes.add(contaCorrente);

        GerenciadoraContas contas = new GerenciadoraContas(contaCorrentes);

        assertEquals("As contas devem ser iguais", contaCorrente, contas.pesquisaConta(1));
    }

    @Test
    public void testPesquisaContaNull() {
        ContaCorrente contaCorrente = new ContaCorrente(1, 1000, true);
        List<ContaCorrente> contaCorrentes = new ArrayList<>();
        contaCorrentes.add(contaCorrente);

        GerenciadoraContas contas = new GerenciadoraContas(contaCorrentes);

        assertEquals("Deve retornar null", null, contas.pesquisaConta(2));
    }

}
