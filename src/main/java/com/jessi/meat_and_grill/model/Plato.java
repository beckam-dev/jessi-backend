package com.jessi.meat_and_grill.model;

import java.math.BigDecimal;
import java.util.List;

// clase base de un plato, solo funciona de referencia para obtener los valores de un plato predeterminado. Es un elemento de un catálogo o en este caso menú.
public class Plato {

    private Long id;
    private String nombre;
    private Insumo insumoPrincipal; // insumo principal, pedido inamovible, obligatorio.
    private List<Guarnicion> guarniciones; // guarniciones predeterminadas incluídas dentro del plato.
    private BigDecimal precio; // precio del plato (precio fijo, no cambia si se el cliente decide no llevar
                               // alguna o ninguna)

    public Plato() {
    }

    public Plato(Long id, String nombre, Insumo insumoPrincipal, List<Guarnicion> guarniciones, BigDecimal precio) {
        this.id = id;
        this.nombre = nombre;
        this.insumoPrincipal = insumoPrincipal;
        this.guarniciones = guarniciones;
        this.precio = precio;
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

    public Insumo getInsumoPrincipal() {
        return insumoPrincipal;
    }

    public void setInsumoPrincipal(Insumo insumoPrincipal) {
        this.insumoPrincipal = insumoPrincipal;
    }

    public List<Guarnicion> getGuarniciones() {
        return guarniciones;
    }

    public void setGuarniciones(List<Guarnicion> guarniciones) {
        this.guarniciones = guarniciones;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

}
