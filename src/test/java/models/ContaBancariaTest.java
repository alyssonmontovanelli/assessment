package models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaTest {

    @Test
    void testGetNumeroConta() {
        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroConta(123456);
        assertEquals(123456, conta.getNumeroConta());
    }
}