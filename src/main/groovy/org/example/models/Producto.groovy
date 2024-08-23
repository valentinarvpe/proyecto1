package org.example.models
class Producto {
    String codigo
    String nombre
    BigDecimal precio

    Producto(String codigo, String nombre, BigDecimal precio) {
        this.codigo = codigo
        this.nombre = nombre
        this.precio = precio
    }

    String obtenerDescripcion() {
        return "${nombre}, Precio: \$${precio}"
    }

    double obtenerPrecio() {
        return precio
    }

    String descripcion() {
        return nombre
    }
}
