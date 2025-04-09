package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionsTest {

    @Test
    @DisplayName("Inscripción aprobada, cuando el alumno tiene todas las correlativas aprobadas")
    public void inscripcionAprobada(){
        Materia m1 = new Materia("AyED","1");
        Materia m2 = new Materia("PdP","2");
        Materia m3 = new Materia("DDS","3");

        Alumno a1 = new Alumno("Gabriel",1609610);

        m3.agregarMateriaCorrelativa(m1);
        m3.agregarMateriaCorrelativa(m2);

        a1.agregarMateriaAprobada(m1);
        a1.agregarMateriaAprobada(m2);

        Inscripcion inscripcion = new Inscripcion(a1,m3);

        /*Assertions.assertEquals("Gabriel",a1.getNombreYApellido());*/
        Assertions.assertTrue(inscripcion.aprobada());
    }

    @Test
    @DisplayName("Inscripción rechazada, cuando falta una materia correlativa")
    public void inscripcionRechazadaPorCorrelativa() {
        Materia m1 = new Materia("AyED", "1");
        Materia m2 = new Materia("PdP", "2");
        Materia m3 = new Materia("DDS", "3");

        m3.agregarMateriaCorrelativa(m1);
        m3.agregarMateriaCorrelativa(m2);

        Alumno alumno = new Alumno("Naomi", 123456);
        alumno.agregarMateriaAprobada(m1); // SOLO aprobó AyED

        Inscripcion inscripcion = new Inscripcion(alumno, m3);

        Assertions.assertFalse(inscripcion.aprobada());
    }

    @Test
    @DisplayName("Inscripción aprobada, cuando la materia no tiene correlativas")
    public void inscripcionSinCorrelativas() {
        Materia m1 = new Materia("Intro a la Ingeniería", "1");

        Alumno alumno = new Alumno("Martín", 654321);

        Inscripcion inscripcion = new Inscripcion(alumno, m1);

        Assertions.assertTrue(inscripcion.aprobada());
    }
}