package com.jessi.meat_and_grill.model;

// unidad mínima para la elaboración de clases compuestas en la lógica de los platos.
public class Insumo {

    private Long id;
    private String nombre;

    public Insumo() {
    }

    public Insumo(Long id, String nombre) {
        this.id = id;
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
