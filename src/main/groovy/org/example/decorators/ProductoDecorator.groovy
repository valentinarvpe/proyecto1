package org.example.decorators

import org.example.models.Producto

class ProductoDecorator extends Producto {
        protected Producto producto

        ProductoDecorator(Producto producto) {
            super(producto.codigo, producto.nombre, producto.precio)
            this.producto = producto
        }

        @Override
        double obtenerPrecio() {
            return producto.obtenerPrecio()
        }

        @Override
        String descripcion() {
            return producto.descripcion()
        }
}
