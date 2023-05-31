package negocio;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RemoveClienteTest {

    @Test
    public void testRemoveCliente() {
        Cliente cliente = new Cliente(1, "Lucas Eduardo", 22, "lucas@gmail.com", 1, true);
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente);

        GerenciadoraClientes gerenciadoraClientes = new GerenciadoraClientes(clientes);

        assertEquals("Deve retornar true da exclusao", true, gerenciadoraClientes.removeCliente(1));
    }

    @Test
    public void testRemoveClienteFalse() {
        Cliente cliente = new Cliente(1, "Lucas Eduardo", 22, "lucas@gmail.com", 1, true);
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente);

        GerenciadoraClientes gerenciadoraClientes = new GerenciadoraClientes(clientes);

        assertEquals("Deve retornar false da exclusao", false, gerenciadoraClientes.removeCliente(2));
    }

}
