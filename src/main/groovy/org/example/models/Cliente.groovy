package org.example.models

import org.example.IBuilder

class Cliente {
    String nombre
    String apellido
    Direccion direccion
    List<Telefono> telefono = new ArrayList<>()

    Cliente() {

    }

    Cliente(String nombre, String apellido, Direccion direccion, List<Telefono> telefono) {
        this.nombre = nombre
        this.apellido = apellido
        this.direccion = direccion
        this.telefono = telefono
    }

    static class ClienteBuilder implements IBuilder {
        String nombre
        String apellido
        Direccion direccion
        List<Telefono> telefono

        ClienteBuilder() {
        }

        ClienteBuilder setNombre(String nombre) {
            this.nombre = nombre
            return this
        }

        ClienteBuilder setApellido(String apellido) {
            this.apellido = apellido
            return this
        }

        ClienteBuilder setDireccion(Direccion direccion) {
            this.direccion = direccion
            return this
        }

        ClienteBuilder setDireccion(String direccion, String ciudad, String pais) {
            this.direccion = new Direccion(direccion, ciudad, pais)
            return this
        }

        ClienteBuilder setTelefono(Telefono telefono) {
            this.telefono = telefono
            return this
        }
        ClienteBuilder setTelefono(String numero, String ext, String tipo) {
            this.telefono.add(new Telefono(numero, ext, tipo))
            return this
        }

        @Override
        Cliente build() {
            return new Cliente(nombre, apellido, direccion, telefono)
        }
    }


    String obtenerNombreCompleto() {
        return "${nombre} ${apellido}"
    }
}