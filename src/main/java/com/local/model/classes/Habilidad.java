package com.local.model.classes;

public class Habilidad {
    private String id_ninja;
    private String nombre;
    private String descripcion;

    public Habilidad() {
    }

    public Habilidad(String id_ninja, String nombre, String descripcion) {
        this.id_ninja = id_ninja;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getId_ninja() {
        return this.id_ninja;
    }

    public void setId_ninja(String id_ninja) {
        this.id_ninja = id_ninja;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "{" +
                " id_ninja='" + getId_ninja() + "'" +
                ", nombre='" + getNombre() + "'" +
                ", descripcion='" + getDescripcion() + "'" +
                "}";
    }

}
