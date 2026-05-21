package com.jessi.meat_and_grill.model;

public class BebidaSize {

    private Long id;
    private String tamanio;

    public BebidaSize() {
    }

    public BebidaSize(String tamanio) {
        this.tamanio = tamanio;
    }

    public Long getId() {
        return id;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

}
