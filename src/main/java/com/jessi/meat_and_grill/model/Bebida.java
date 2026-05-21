package com.jessi.meat_and_grill.model;

public class Bebida {

    private Long id;
    private String nombre;

    public Bebida() {
    }

    public Bebida(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
