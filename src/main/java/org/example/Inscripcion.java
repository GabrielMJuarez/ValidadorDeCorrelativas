package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Inscripcion {
    private Alumno alumno;
    private Materia materiaAInscribir;

    public Inscripcion(Alumno alumno, Materia materiaAInscribir) {
        this.alumno = alumno;
        this.materiaAInscribir = materiaAInscribir;
    }
/*
    public void setAlumno (Alumno alumno){
        this.alumno = alumno;
    }

    public void setMateriaAInscribir(Materia materiaAInscribir) {
        this.materiaAInscribir = materiaAInscribir;
    }

    public Alumno getAlumno() {
        return this.alumno;
    }

    public Materia getMateriaAInscribir() {
        return this.materiaAInscribir;
    }
*/
    public boolean aprobada() {
        return cumpleCorrelativas(this.alumno,this.materiaAInscribir);
    }

    private boolean cumpleCorrelativas(Alumno alumno,Materia materia) {
        return alumno.getMateriasAprobadas().containsAll(materia.getMateriasCorrelativas());
    }
}
