/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author zahid
 */

 package com.mycompany.malosoloresg4.OOA;

public class Carro extends Vehiculo{
    private String licensePlate;
    private double fuelLevel;

    public Carro(String numeroRegistro, double velocidad, String licensePlate, double fuelLevel) {
        super(numeroRegistro, velocidad);
        this.licensePlate = licensePlate;
        this.fuelLevel = fuelLevel;
    }

    public void refuel(double amount) {
        this.fuelLevel += amount;
    }

    public double getRemainingRange() {
        return fuelLevel * 15; // Supongamos que 1 unidad de combustible permite 15 km
    }
}

