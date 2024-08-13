package com.mycompany.malosoloresg4.ChangePreventersDispensables;

public abstract class Producto {
    public String nombre;
    public double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double getPrecio() {
        
        return precio;
    }

    public abstract double calcularPrecioFinal();
}