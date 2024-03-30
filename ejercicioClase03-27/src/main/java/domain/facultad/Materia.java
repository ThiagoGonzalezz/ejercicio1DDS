package domain.facultad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Materia {
    private String nombre;
    private Integer codMateria;
    private List<Materia> correlativas;

    //Constructor
    public Materia() {
        this.correlativas = new ArrayList<>();
    }

    //GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCodMateria() {
        return codMateria;
    }

    public void setCodMateria(Integer codMateria) {
        this.codMateria = codMateria;
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void agregarCorrelativas(Materia ... materias) {
        Collections.addAll(this.correlativas, materias);
    }
}
