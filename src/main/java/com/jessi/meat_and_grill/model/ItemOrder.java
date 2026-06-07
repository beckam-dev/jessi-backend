package com.jessi.meat_and_grill.model;

public class ItemOrder {

    private BebidaOpcion bebida; // Puede ser null si se seleccionó una comida
    private PlatoElegido plato; // Puede ser null si se seleccionó una bebida

    public ItemOrder(BebidaOpcion bebida) {
        this.bebida = bebida;
        this.plato = null; // No se seleccionó una comida
    }

    public ItemOrder(PlatoElegido plato) {
        this.plato = plato;
        this.bebida = null; // No se seleccionó una bebida
    }

}