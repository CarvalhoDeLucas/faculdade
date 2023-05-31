package negocio;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ValidaIdadeTest {

    @Test()
    public void testValidaIdade() throws IdadeNaoPermitidaException {
        Cliente cliente = new Cliente(1, "Lucas Eduardo", 22, "lucas@gmail.com", 1, true);
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente);

        GerenciadoraClientes gerenciadoraClientes = new GerenciadoraClientes(clientes);

        assertEquals("O deve estar com a idade apropriada", true, gerenciadoraClientes.validaIdade(cliente.getIdade()));
    }

    @Test(expected = IdadeNaoPermitidaException.class)
    public void testValidaIdadeError() throws IdadeNaoPermitidaException {
        Cliente cliente = new Cliente(1, "Lucas Eduardo", 10, "lucas@gmail.com", 1, true);
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente);

        GerenciadoraClientes gerenciadoraClientes = new GerenciadoraClientes(clientes);

        gerenciadoraClientes.validaIdade(cliente.getIdade());
    }

}
