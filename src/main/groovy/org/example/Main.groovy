package org.example

import org.example.Utils.TimeStampingLogger
import org.example.Utils.UpperLogger
import org.example.config.Conexionbd
import org.example.decorators.ProductoConDescuento
import org.example.models.Cliente
import org.example.models.Logger
import org.example.models.Producto
import org.example.models.Vendedor

static void main(String[] args) {
    //Solicita los datos de entrada al cliente
    println "** Bienvenido al sistema de ventas **"
    println "Ingrese su nombre:"
    def nombre = System.in.newReader().readLine()
    println "Ingrese su apellido:"
    def apellido = System.in.newReader().readLine()

    try {
        Producto producto = new Producto("PROM01","LAPTOP", 231111)
        if (producto.codigo.startsWith("PROM")) {
            Producto descuento = new ProductoConDescuento(producto, 10)
            producto.precio = descuento.obtenerPrecio()
        }
        Cliente cliente = new Cliente.ClienteBuilder()
                .setNombre(nombre)
                .setApellido(apellido)
                .build()

        /* Obtener la única instancia de Vendedor (Singleton)
        ** En este caso vamos a aplicarlo asi ya que el vendedor sera
        ** el mismo para este caso
         */
        Vendedor vendedor = Vendedor.instance
        vendedor.nombre = "VENDDOR"
        vendedor.apellido = "PRINCIPAL"

        // Para el decorator
        def logger = new TimeStampingLogger(new UpperLogger(new Logger()))
        logger.log(vendedor.venderProducto(cliente, producto))


    } catch (Exception ex) {
        ex.printStackTrace()
    }
}