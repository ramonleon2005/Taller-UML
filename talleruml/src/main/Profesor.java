package modelos;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends PersonalAcademico {
    private List<Curso> cursosACargo;

    public Profesor(String usuario, String contrasena, String nombre, String apellido) {
        super(usuario, contrasena, nombre, apellido);
        this.cursosACargo = new ArrayList<>();
    }

    public void cargarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa) {
        curso.getActividadesSumativas().add(actividadSumativa);
    }

    public void calificarActividadSumativa(Curso curso, Estudiante estudiante, ActividadSumativa actividadSumativa) {
        System.out.println("Calificada '" + actividadSumativa.getTitulo()
                + "' de " + estudiante.getNombre() + " en " + curso.getNombre());
    }

    public void aceptarInscripcion(Curso curso, String usuarioEstudiante) {
        Estudiante encontrado = null;
        for (Estudiante e : curso.getEstudiantesEnEsperaDeInscripcion()) {
            if (e.getUsuario().equals(usuarioEstudiante)) {
                encontrado = e;
            }
        }
        if (encontrado != null) {
            curso.getEstudiantesEnEsperaDeInscripcion().remove(encontrado);
            curso.getEstudiantesInscritos().add(encontrado);
            encontrado.getCursos().add(curso);
        }
    }

    public void crearNuevoForo(Foro foro) {
        // el curso del profesor recibe el foro (se usa el primer curso a cargo)
        if (!cursosACargo.isEmpty()) {
            cursosACargo.get(0).getForos().add(foro);
        }
    }

    public List<Curso> getCursosACargo() { return cursosACargo; }
}
