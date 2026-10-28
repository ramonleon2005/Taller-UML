package modelos;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String id;
    private String nombre;
    private boolean estadoDisponible;

    // Asociaciones
    private List<Estudiante> estudiantesInscritos;
    private List<Estudiante> estudiantesEnEsperaDeInscripcion;
    private Profesor responsable;
    private List<Foro> foros;
    private List<ActividadSumativa> actividadesSumativas;

    public Curso(String id, String nombre, boolean estadoDisponible) {
        this.id = id;
        this.nombre = nombre;
        this.estadoDisponible = estadoDisponible;
        this.estudiantesInscritos = new ArrayList<>();
        this.estudiantesEnEsperaDeInscripcion = new ArrayList<>();
        this.foros = new ArrayList<>();
        this.actividadesSumativas = new ArrayList<>();
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public boolean isEstadoDisponible() { return estadoDisponible; }
    public Profesor getResponsable() { return responsable; }
    public void setResponsable(Profesor responsable) { this.responsable = responsable; }
    public List<Estudiante> getEstudiantesInscritos() { return estudiantesInscritos; }
    public List<Estudiante> getEstudiantesEnEsperaDeInscripcion() { return estudiantesEnEsperaDeInscripcion; }
    public List<Foro> getForos() { return foros; }
    public List<ActividadSumativa> getActividadesSumativas() { return actividadesSumativas; }
}
