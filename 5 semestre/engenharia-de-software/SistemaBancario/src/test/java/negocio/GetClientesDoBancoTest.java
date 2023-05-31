package negocio;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GetClientesDoBancoTest {

    @Test
    public void testGetClientesDoBanco() {
        Cliente cliente = new Cliente(1, "Lucas Eduardo", 22, "lucas@gmail.com", 1, true);
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente);

        GerenciadoraClientes gerenciadoraClientes = new GerenciadoraClientes(clientes);

        assertEquals("Deve retornar um cliente", 1, gerenciadoraClientes.getClientesDoBanco().size());
    }

}
