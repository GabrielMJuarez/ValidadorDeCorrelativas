package org.example;

public class Main {
    public static void main(String[] args) {
        Materia m1 = new Materia("AyED","1");
        Materia m2 = new Materia("PdP","2");
        Materia m3 = new Materia("DDS","3");

        Alumno a1 = new Alumno("Gabriel",1609610);

        m3.agregarMateriaCorrelativa(m1);
        m3.agregarMateriaCorrelativa(m2);

        a1.agregarMateriaAprobada(m1);
        a1.agregarMateriaAprobada(m2);

        System.out.println("Correlativas de " + m3.getAsignatura() + ":");
        for (Materia correlativa : m3.getMateriasCorrelativas()) {
            System.out.println("- " + correlativa.getAsignatura());
        }

        Inscripcion inscripcion = new Inscripcion(a1,m3);

        if(inscripcion.aprobada()){
            System.out.println("Alumno " + a1.getNombreYApellido() + " Inscrito en DDS");
        }
        else{
            System.out.println("Alumno " + a1.getNombreYApellido() + " No inscrito en DDS");
        }

    }
}