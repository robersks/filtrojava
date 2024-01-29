package com.local.model.classes;

public class Mision {
    private int id;
    private String descripcion;
    private String rango;
    private String recompensa;

    public Mision() {
    }

    public Mision(int id, String descripcion, String rango, String recompensa) {
        this.id = id;
        this.descripcion = descripcion;
        this.rango = rango;
        this.recompensa = recompensa;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRango() {
        return this.rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getRecompensa() {
        return this.recompensa;
    }

    public void setRecompensa(String recompensa) {
        this.recompensa = recompensa;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", descripcion='" + getDescripcion() + "'" +
            ", rango='" + getRango() + "'" +
            ", recompensa='" + getRecompensa() + "'" +
            "}";
    }
}
