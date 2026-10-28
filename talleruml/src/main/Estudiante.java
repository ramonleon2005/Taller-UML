package modelos;

import java.util.ArrayList;
import java.util.List;

public class Estudiante extends PersonalAcademico {
    private List<Curso> cursos;

    public Estudiante(String usuario, String contrasena, String nombre, String apellido) {
        super(usuario, contrasena, nombre, apellido);
        this.cursos = new ArrayList<>();
    }

    public void solicitarInscripcionCurso(Curso curso) {
        curso.getEstudiantesEnEsperaDeInscripcion().add(this);
    }

    public void realizarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa) {
        if (curso.getEstudiantesInscritos().contains(this)
                && curso.getActividadesSumativas().contains(actividadSumativa)) {
            System.out.println(nombre + " realizo: " + actividadSumativa.getTitulo());
        }
    }

    public List<Curso> getCursos() { return cursos; }
}
