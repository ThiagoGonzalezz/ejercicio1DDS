package domain.facultad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alumno {
    private Integer legajo;
    private String nombre;
    private List<Materia> materiasAprobadas;

    //Constructor
    public Alumno(){
        this.materiasAprobadas = new ArrayList<>();
    }

    //GETTERS Y SETTERS

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(Materia ... materias) {
        Collections.addAll(this.materiasAprobadas, materias);
    }

    //Metodos funcionales para la inscripcion

    public Boolean aproboCorrelativas(Materia materia) {
        return this.materiasAprobadas.containsAll(materia.getCorrelativas());
    }
}
