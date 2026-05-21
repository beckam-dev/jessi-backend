package com.jessi.meat_and_grill.model;

import java.math.BigDecimal;

public class BebidaOpcion {

    private Long id;
    private Bebida bebida;
    private BebidaSize tamanio;
    private BigDecimal precio;

    public BebidaOpcion() {
    }

    public BebidaOpcion(Bebida bebida, BebidaSize tamanio, BigDecimal precio) {
        this.bebida = bebida;
        this.tamanio = tamanio;
        this.precio = precio;
    }

    public Long getId() {
        return id;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    public BebidaSize getTamanio() {
        return tamanio;
    }

    public void setTamanio(BebidaSize tamanio) {
        this.tamanio = tamanio;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

}
