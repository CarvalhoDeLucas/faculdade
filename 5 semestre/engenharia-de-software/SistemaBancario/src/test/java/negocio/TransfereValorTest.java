package negocio;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TransfereValorTest {

    @Test
    public void testTransfereValor() {
        ContaCorrente contaCorrente1 = new ContaCorrente(1, 1000, true);
        ContaCorrente contaCorrente2 = new ContaCorrente(2, 1000, true);
        List<ContaCorrente> contaCorrentes = new ArrayList<>();
        contaCorrentes.add(contaCorrente1);
        contaCorrentes.add(contaCorrente2);

        GerenciadoraContas contas = new GerenciadoraContas(contaCorrentes);

        assertEquals("Deve retornar true", true, contas.transfereValor(1, 500, 2));
    }

    @Test
    public void testTransfereValorFalse() {
        ContaCorrente contaCorrente1 = new ContaCorrente(1, 1000, true);
        ContaCorrente contaCorrente2 = new ContaCorrente(2, 1000, true);
        List<ContaCorrente> contaCorrentes = new ArrayList<>();
        contaCorrentes.add(contaCorrente1);
        contaCorrentes.add(contaCorrente2);

        GerenciadoraContas contas = new GerenciadoraContas(contaCorrentes);

        assertEquals("Deve retornar false", false, contas.transfereValor(1, 1500, 2));
    }

}
