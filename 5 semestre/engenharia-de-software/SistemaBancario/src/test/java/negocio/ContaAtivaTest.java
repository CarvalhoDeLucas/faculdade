package negocio;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ContaAtivaTest {

    @Test
    public void testContaAtiva() {
        ContaCorrente contaCorrente = new ContaCorrente(1, 1000, true);
        List<ContaCorrente> contaCorrentes = new ArrayList<>();
        contaCorrentes.add(contaCorrente);

        GerenciadoraContas contas = new GerenciadoraContas(contaCorrentes);

        assertEquals("A conta deve estar ativa", true, contas.contaAtiva(1));
    }

    @Test
    public void testContaAtivaFalse() {
        ContaCorrente contaCorrente = new ContaCorrente(1, 1000, true);
        List<ContaCorrente> contaCorrentes = new ArrayList<>();
        contaCorrentes.add(contaCorrente);

        GerenciadoraContas contas = new GerenciadoraContas(contaCorrentes);

        assertEquals("Deve retornar false", false, contas.contaAtiva(2));
    }

}
