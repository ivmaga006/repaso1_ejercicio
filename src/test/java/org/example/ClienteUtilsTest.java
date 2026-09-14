package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Iván Marín Gayete
 * @version 1.0
 */
class ClienteUtilsTest {

    private List<Cliente> c = new ArrayList<>();

    @BeforeEach
    void setUp() {

        c.add(0, new Cliente(1L, "Paco", "Fernandez", 32));
        c.add(1, new Cliente(2L, "Alfonso", "Gonzalez", 47));
        c.add(2, new Cliente(3L, "Rodrigo", "Garcia", 20));
        c.add(3, new Cliente(4L, "Carlos", "Montesinos", 18));
    }

    @Test
    void showClients() {
    }

    @Test
    void getClientsQuantity() {
        assertEquals(4, c.size());
    }
}
