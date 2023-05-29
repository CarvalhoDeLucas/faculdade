package negocio;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GerenciadoraContasTest {

    @Test
    public void testAdicionaConta() {
        ContaCorrente contaCorrente = new ContaCorrente(1, 1000, true);
        List<ContaCorrente> contaCorrentes = new ArrayList<>();
        contaCorrentes.add(contaCorrente);

        GerenciadoraContas contas = new GerenciadoraContas(contaCorrentes);
        contas.adicionaConta(contaCorrente);

        assertEquals("Deve ter duas contas cadastrada", 2, contas.getContasDoBanco().size());
    }

    @Test
    public void testGetContasDoBanco() {
        ContaCorrente contaCorrente = new ContaCorrente(1, 1000, true);
        List<ContaCorrente> contaCorrentes = new ArrayList<>();
        contaCorrentes.add(contaCorrente);

        GerenciadoraContas contas = new GerenciadoraContas(contaCorrentes);

        assertEquals("Deve ter uma conta cadastrada", 1, contas.getContasDoBanco().size());
    }

    @Test
    public void testPesquisaConta() {
        ContaCorrente contaCorrente = new ContaCorrente(1, 1000, true);
        List<ContaCorrente> contaCorrentes = new ArrayList<>();
        contaCorrentes.add(contaCorrente);

        GerenciadoraContas contas = new GerenciadoraContas(contaCorrentes);

        assertEquals("As contas devem ser iguais", contaCorrente, contas.pesquisaConta(1));
    }

    @Test
    public void testRemoveConta() {
        ContaCorrente contaCorrente = new ContaCorrente(1, 1000, true);
        List<ContaCorrente> contaCorrentes = new ArrayList<>();
        contaCorrentes.add(contaCorrente);

        GerenciadoraContas contas = new GerenciadoraContas(contaCorrentes);
        contas.removeConta(1);

        assertEquals("Nao deve ter nenhuma conta cadastrada", 0, contas.getContasDoBanco().size());
    }

    @Test
    public void testContaAtiva() {
        ContaCorrente contaCorrente = new ContaCorrente(1, 1000, true);
        List<ContaCorrente> contaCorrentes = new ArrayList<>();
        contaCorrentes.add(contaCorrente);

        GerenciadoraContas contas = new GerenciadoraContas(contaCorrentes);

        assertEquals("A conta deve estar ativa", true, contas.contaAtiva(1));
    }

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

}