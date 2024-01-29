package com.local.model.classes;

public class Misionninja {
    private String id_ninja;
    private int id_mision;
    private String fechainicio;
    private String fechafin;

    public Misionninja() {
    }

    public Misionninja(String id_ninja, int id_mision, String fechainicio, String fechafin) {
        this.id_ninja = id_ninja;
        this.id_mision = id_mision;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
    }

    public String getId_ninja() {
        return this.id_ninja;
    }

    public void setId_ninja(String id_ninja) {
        this.id_ninja = id_ninja;
    }

    public int getId_mision() {
        return this.id_mision;
    }

    public void setId_mision(int id_mision) {
        this.id_mision = id_mision;
    }

    public String getFechainicio() {
        return this.fechainicio;
    }

    public void setFechainicio(String fechainicio) {
        this.fechainicio = fechainicio;
    }

    public String getFechafin() {
        return this.fechafin;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }

    @Override
    public String toString() {
        return "{" +
            " id_ninja='" + getId_ninja() + "'" +
            ", id_mision='" + getId_mision() + "'" +
            ", fechainicio='" + getFechainicio() + "'" +
            ", fechafin='" + getFechafin() + "'" +
            "}";
    }
}
