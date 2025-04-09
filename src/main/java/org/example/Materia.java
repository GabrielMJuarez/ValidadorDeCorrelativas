package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter

@Setter

public class Materia {
    private String asignatura;
    private String curso;
    private List<Materia> materiasCorrelativas;

    public Materia(String asignatura, String curso) {
        this.asignatura = asignatura;
        this.curso = curso;
        this.materiasCorrelativas = new ArrayList<Materia>();
    }

    public void agregarMateriaCorrelativa(Materia materiaCorrelativa) {
        this.materiasCorrelativas.add(materiaCorrelativa);
    }

    /*
    public List<Materia> getMateriasCorrelativas() {
        return this.materiasCorrelativas;
    }

    public String getAsignatura() {
        return this.asignatura;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    */
}