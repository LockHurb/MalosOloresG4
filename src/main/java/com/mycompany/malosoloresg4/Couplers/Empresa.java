package com.mycompany.malosoloresg4.Couplers;

public class Empresa {
    private final Persona gerente;

    public Empresa(Persona gerente) {
        this.gerente = gerente;
    }

    public Persona getGerente() {
        return gerente;
    }
}
