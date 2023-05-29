package negocio;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GerenciadoraClientesTest {

    @Test
    public void testGetClientesDoBanco() {
        Cliente cliente = new Cliente(1, "Lucas Eduardo", 22, "lucas@gmail.com", 1, true);
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente);

        GerenciadoraClientes gerenciadoraClientes = new GerenciadoraClientes(clientes);

        assertEquals("Deve retornar um cliente", 1, gerenciadoraClientes.getClientesDoBanco().size());
    }

    @Test
    public void testPesquisaCliente() {
        Cliente cliente = new Cliente(1, "Lucas Eduardo", 22, "lucas@gmail.com", 1, true);
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente);

        GerenciadoraClientes gerenciadoraClientes = new GerenciadoraClientes(clientes);

        assertEquals("Os clientes devem ser iguais", cliente, gerenciadoraClientes.pesquisaCliente(1));
    }

    @Test
    public void testAdicionaCliente() {
        Cliente cliente = new Cliente(1, "Lucas Eduardo", 22, "lucas@gmail.com", 1, true);
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente);

        GerenciadoraClientes gerenciadoraClientes = new GerenciadoraClientes(clientes);
        gerenciadoraClientes.adicionaCliente(cliente);

        assertEquals("Deve retornar dois clientes", 2, gerenciadoraClientes.getClientesDoBanco().size());
    }

    @Test
    public void testRemoveCliente() {
        Cliente cliente = new Cliente(1, "Lucas Eduardo", 22, "lucas@gmail.com", 1, true);
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente);

        GerenciadoraClientes gerenciadoraClientes = new GerenciadoraClientes(clientes);

        assertEquals("Deve retornar true da exclusao", true, gerenciadoraClientes.removeCliente(1));
    }

    @Test
    public void testClienteAtivo() {
        Cliente cliente = new Cliente(1, "Lucas Eduardo", 22, "lucas@gmail.com", 1, true);
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente);

        GerenciadoraClientes gerenciadoraClientes = new GerenciadoraClientes(clientes);

        assertEquals("O cliente deve estar ativo", true, gerenciadoraClientes.clienteAtivo(1));
    }

    @Test
    public void testLimpa() {
        Cliente cliente = new Cliente(1, "Lucas Eduardo", 22, "lucas@gmail.com", 1, true);
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente);

        GerenciadoraClientes gerenciadoraClientes = new GerenciadoraClientes(clientes);
        gerenciadoraClientes.limpa();

        assertEquals("Nao deve ter nenhum cliente cadastrado", 0, gerenciadoraClientes.getClientesDoBanco().size());
    }

    @Test()
    public void testValidaIdade() throws IdadeNaoPermitidaException {
        Cliente cliente = new Cliente(1, "Lucas Eduardo", 22, "lucas@gmail.com", 1, true);
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente);

        GerenciadoraClientes gerenciadoraClientes = new GerenciadoraClientes(clientes);

        assertEquals("O deve estar com a idade apropriada", true, gerenciadoraClientes.validaIdade(cliente.getIdade()));
    }

}