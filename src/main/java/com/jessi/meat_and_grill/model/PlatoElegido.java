package com.jessi.meat_and_grill.model;

import java.math.BigDecimal;
import java.util.List;

public class PlatoElegido {

    private Plato plato; // el plato elegido por el cliente, que incluye su nombre, descripción y precio base. además del insumo principal. Es una plantilla base de lo que contiene el plato, incluyendo las guarniciones que vienen incluidas en el precio del plato, pero el cliente puede elegir si quiere o no esas guarniciones.
    private List<Guarnicion> preferenciasGuarniciones; // puede ser null si no se elige ninguna guarnición, o puede aumentar a medida que se agregan más guarniciones o también retirar guarniciones. Vienen incluídas en el precio del plato, pero se pueden elegir o no.
    private List<Agregado> agregados; // puede ser null si no se elige ningún agregado, o puede aumentar a medida que se agregan más agregados o tambie retiran agregados. Cada agregado tiene un precio adicional que se suma al precio del plato.

    public PlatoElegido() {
    }

    public PlatoElegido(Plato plato, List<Guarnicion> preferenciasGuarniciones, List<Agregado> agregados) {
        this.plato = plato;
        this.preferenciasGuarniciones = preferenciasGuarniciones;
        this.agregados = agregados;
    }

    public Plato getPlato() {
        return plato;
    }

    public List<Guarnicion> getPreferenciasGuarniciones() {
        return preferenciasGuarniciones;
    }

    public void setPlato(Plato plato) {
        this.plato = plato;
    }

    public void setPreferenciasGuarniciones(List<Guarnicion> preferenciasGuarniciones) {
        this.preferenciasGuarniciones = preferenciasGuarniciones;
    }

    public List<Agregado> getAgregados() {
        return agregados;
    }

    public void setAgregados(List<Agregado> agregados) {
        this.agregados = agregados;
    }

    // MÉTODOS PARA AGREGADOS Y PRECIOS

    public BigDecimal getPrecioTotal() {
        BigDecimal precioTotal = plato.getPrecio(); // precio base del plato
        if (agregados != null) {
            for (Agregado agregado : agregados) {
                precioTotal = precioTotal.add(agregado.getPrecio()); // sumar el precio de cada agregado al total
            }
        }
        return precioTotal;
    }

    public void agregarAgregado(Agregado agregado) {
        this.agregados.add(agregado);
    }

    public void eliminarAgregado(Agregado agregado) {
        this.agregados.remove(agregado);
    }

    public void agregarGuarnicion(Guarnicion guarnicion) {
        this.preferenciasGuarniciones.add(guarnicion);
    }

    public void eliminarGuarnicion(Guarnicion guarnicion) {
        this.preferenciasGuarniciones.remove(guarnicion);
    }

}