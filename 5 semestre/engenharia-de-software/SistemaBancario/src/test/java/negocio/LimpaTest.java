package negocio;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LimpaTest {

    @Test
    public void testLimpa() {
        Cliente cliente = new Cliente(1, "Lucas Eduardo", 22, "lucas@gmail.com", 1, true);
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente);

        GerenciadoraClientes gerenciadoraClientes = new GerenciadoraClientes(clientes);
        gerenciadoraClientes.limpa();

        assertEquals("Nao deve ter nenhum cliente cadastrado", 0, gerenciadoraClientes.getClientesDoBanco().size());
    }

}
