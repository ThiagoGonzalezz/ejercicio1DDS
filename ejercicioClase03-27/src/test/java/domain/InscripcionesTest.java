package domain;

import domain.facultad.Alumno;
import domain.facultad.Inscripcion;
import domain.facultad.Materia;
import org.junit.Assert;
import org.junit.Test;


public class InscripcionesTest {

    Materia pdeP = new Materia();
    Materia aDS = new Materia();
    Materia fisicaI = new Materia();

    Materia  disenioDeSistemas = new Materia();

    Materia fisicaII = new Materia();

    Inscripcion inscripcion = new Inscripcion();

    @Test
    public void inscripcionAprobadaCumpleCorr() {

        Alumno alumnoAprobador = new Alumno();
        alumnoAprobador.setMateriasAprobadas(pdeP, aDS, fisicaI);

        disenioDeSistemas.agregarCorrelativas(pdeP, aDS);
        fisicaII.agregarCorrelativas(fisicaI);
        inscripcion.SetMateriasAInscribirse(disenioDeSistemas, fisicaII);
        inscripcion.setAlumno(alumnoAprobador);

        Assert.assertTrue(inscripcion.aprobada());
    }

    @Test
    public void inscripcionDesaprobadaNoCumpleCorr() {
        Alumno alumnoNoTanAprobador = new Alumno();
        alumnoNoTanAprobador.setMateriasAprobadas(pdeP, fisicaI);

        disenioDeSistemas.agregarCorrelativas(pdeP, aDS);
        fisicaII.agregarCorrelativas(fisicaI);
        inscripcion.SetMateriasAInscribirse(disenioDeSistemas, fisicaII);
        inscripcion.setAlumno(alumnoNoTanAprobador);

        Assert.assertFalse(inscripcion.aprobada());
    }
}
