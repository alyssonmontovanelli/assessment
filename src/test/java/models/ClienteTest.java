package models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void testGetNome() {
        Cliente cliente = new Cliente();
        cliente.setNome("João da Silva");
        assertEquals("João da Silva", cliente.getNome());
    }

    // Outros testes para getters e setters
}