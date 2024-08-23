package org.example.controllers

import org.example.models.Producto
import org.example.views.ProductoVIew

class ProductoController {

    private Producto model

    void comprarProducto(Producto producto) {
        println "${nombre} compró ${producto.nombre}"
    }

    void actualizarVista() {
        String informacionProducto = model.obtenerInformacion()
    }

    void actualizarProducto(String nombre, double precio) {
        model.nombre = nombre
        model.precio = precio
    }

}
