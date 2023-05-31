package negocio;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ClienteAtivoTest {

    @Test
    public void testClienteAtivo() {
        Cliente cliente = new Cliente(1, "Lucas Eduardo", 22, "lucas@gmail.com", 1, true);
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente);

        GerenciadoraClientes gerenciadoraClientes = new GerenciadoraClientes(clientes);

        assertEquals("O cliente deve estar ativo", true, gerenciadoraClientes.clienteAtivo(1));
    }

    @Test
    public void testClienteAtivoFalse() {
        Cliente cliente = new Cliente(1, "Lucas Eduardo", 22, "lucas@gmail.com", 1, true);
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente);

        GerenciadoraClientes gerenciadoraClientes = new GerenciadoraClientes(clientes);

        assertEquals("Deve retornar false", false, gerenciadoraClientes.clienteAtivo(2));
    }

}
