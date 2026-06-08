package com.jessi.meat_and_grill.model;

import java.math.BigDecimal;

public class BebidaElegida {

    private BebidaOpcion bebida;
    private int cantidad;

    public BebidaElegida() {
    }

    public BebidaElegida(BebidaOpcion bebida, int cantidad) {
        this.bebida = bebida;
        this.cantidad = cantidad;
    }

    public BebidaOpcion getBebida() {
        return bebida;
    }

    public int getCantidad() {
        return cantidad;
    }

    public BigDecimal calcularPrecio() {
        return bebida.getPrecio().multiply(BigDecimal.valueOf(cantidad));
    }

    public void aumentarCantidad(int cantidad) {
        this.cantidad += cantidad;
    }

    public void disminuirCantidad(int cantidad) {
        if (this.cantidad - cantidad > 0) {
            this.cantidad -= cantidad;
        }
    }

}
