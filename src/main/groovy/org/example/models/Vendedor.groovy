package org.example.models

class Vendedor {
    String nombre
    String apellido

    private static Vendedor instance

    private Vendedor() {
        // Constructor privado para evitar la instanciación externa
    }

    static Vendedor getInstance() {
        if (instance == null) {
            instance = new Vendedor()
        }
        return instance
    }

    String obtenerNombreCompleto() {
        return "${nombre} ${apellido}"
    }

    String venderProducto(Cliente cliente, Producto producto) {
        return "${obtenerNombreCompleto()} vendió ${producto.obtenerDescripcion()} a ${cliente.obtenerNombreCompleto()}"
    }
}
