package com.jessi.meat_and_grill.model;

import java.util.List;

// clase acompañamiento del plato, no contienen precio, ya viene incluido dentro del plato
public class Guarnicion {
    
    private Long id;
    private String nombre; // nombre en común de ciertos Insumo los cuales son electivos según la preferencia del cliente
    // ejemplo : "papa".
    private List<Insumo> opciones; // opciones disponibles a elección del cliente puede ser una sola o múltiple
    // ejemplo : "papa sanchochada" / "papa frita"
    
    public Guarnicion() {
    }

    public Guarnicion(Long id, String nombre, List<Insumo> opciones) {
        this.id = id;
        this.nombre = nombre;
        this.opciones = opciones;
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

    public List<Insumo> getOpciones() {
        return opciones;
    }

    public void setOpciones(List<Insumo> opciones) {
        this.opciones = opciones;
    }

}
