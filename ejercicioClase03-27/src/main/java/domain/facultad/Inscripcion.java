package domain.facultad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Inscripcion {
    private List<Materia> materiasAInscribirse;
    private Alumno alumno;

    //Constructor
    public Inscripcion(){
        this.materiasAInscribirse = new ArrayList<>();
    }

    //GETTERS Y SETTERS

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public List<Materia> getMateriasAInscribirse() {
        return materiasAInscribirse;
    }

    public void SetMateriasAInscribirse(Materia ... materias) {
        Collections.addAll(this.materiasAInscribirse, materias);
    }

    //Metodos funcionales para la inscripcion

    public Boolean aprobada() {
        return materiasAInscribirse.stream().allMatch(materia -> this.alumno.aproboCorrelativas(materia));
    }

}
