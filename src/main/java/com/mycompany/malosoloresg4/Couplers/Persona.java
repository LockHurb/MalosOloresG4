package com.mycompany.malosoloresg4.Couplers;

public class Persona {
    private String nombre;
    private Direccion direccion;

    public Persona(String nombre, Direccion direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
