package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter

@Setter

public class Alumno {
    private String nombreYApellido;
    private int legajo;
    private List<Materia> materiasAprobadas;

    public Alumno(String nombreYApellido, int legajo) {
        this.nombreYApellido = nombreYApellido;
        this.legajo = legajo;
        this.materiasAprobadas = new ArrayList<Materia>();
    }
    public void agregarMateriaAprobada(Materia materiaAprobada) {
        this.materiasAprobadas.add(materiaAprobada);
    }

    /*
    public String getNombreYApellido() {
        return this.nombreYApellido;
    }

    public void setNombreYApellido(String nombreYApellido) {
        this.nombreYApellido = nombreYApellido;
    }

    public int getLegajo() {
        return this.legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setMateriaAprobada(Materia materiaAprobada) {
        this.materiasAprobadas.add(materiaAprobada);
    }

    public List<Materia> getMateriasAprobadas() {
        return this.materiasAprobadas;
    }
    */
}
