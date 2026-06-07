package com.jessi.meat_and_grill.model;

import java.math.BigDecimal;

// clase compuesta por la clase insumo. Son insumos agregables al plato base, cada una con su precio propio.
public class Agregado {

    private Insumo insumo;
    private BigDecimal precio;

    public Agregado() {
    }

    public Agregado(Insumo insumo, BigDecimal precio) {
        this.insumo = insumo;
        this.precio = precio;
    }

    public Insumo getInsumo() {
        return insumo;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
    
}
