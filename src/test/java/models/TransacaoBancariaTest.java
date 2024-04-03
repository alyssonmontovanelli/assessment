package models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

class TransacaoBancariaTest {

    @Test
    void testGetData() {
        TransacaoBancaria transacao = new TransacaoBancaria();
        Date data = new Date();
        transacao.setData(data);
        assertEquals(data, transacao.getData());
    }

    // Outros testes para getters e setters
}