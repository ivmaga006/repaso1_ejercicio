package org.example;


import java.util.List;

/**
 * @author Iván Marín Gayete
 * @version 1.0
 */

public class ClienteUtils {
    public static void showClients(List<Cliente> clientes) {
        System.out.println("LISTADO DE CLIENTES:");
        for (int i = 0; i <= clientes.size(); i++) {
            Cliente c = new Cliente();
            c = clientes.get(i);
            System.out.println(c.getId() + ", " + c.getNombre() + ", " + c.getApellidos() + ", " +c.getEdad());

        }
    }
    public static Integer getClientsQuantity(List<Cliente> clientes) {
        return clientes.size();
    }
}

