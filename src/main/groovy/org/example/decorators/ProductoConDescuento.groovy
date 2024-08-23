package org.example.decorators

import org.example.models.Producto

class ProductoConDescuento extends ProductoDecorator{
    double descuentoPorcentaje

    ProductoConDescuento(Producto producto, double descuentoPorcentaje) {
        super(producto)
        this.descuentoPorcentaje = descuentoPorcentaje
    }

    @Override
    double obtenerPrecio() {
        return producto.obtenerPrecio() * (1 - descuentoPorcentaje / 100)
    }

    @Override
    String descripcion() {
        return "${producto.descripcion()} con ${descuentoPorcentaje}% de descuento"
    }
}
