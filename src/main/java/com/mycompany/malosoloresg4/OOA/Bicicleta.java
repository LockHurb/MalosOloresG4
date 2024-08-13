/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zahid
 */

package com.mycompany.malosoloresg4.OOA;

public class Bicicleta extends Vehiculo{
    private String modelo;
    private int numeroDeMarchas;

    public Bicicleta(String numeroRegistro, double velocidad, String modelo, int numeroDeMarchas) {
        super(numeroRegistro, velocidad);
        this.modelo = modelo;
        this.numeroDeMarchas = numeroDeMarchas;
    }

    public void cambiarMarcha(int nuevaMarcha) {
        if (nuevaMarcha <= numeroDeMarchas) {
            System.out.println("Cambiando a la marcha " + nuevaMarcha);
        } else {
            System.out.println("Marcha inválida");
        }
    }

    public int obtenerVelocidadMaxima() {
        return numeroDeMarchas * 5; // Supongamos que cada marcha agrega 5 km/h
    }
}
