package modelos;

import java.util.ArrayList;
import java.util.List;

public class PersonalAcademico extends Usuario {
    protected List<Incidente> incidentes;

    public PersonalAcademico(String usuario, String contrasena, String nombre, String apellido) {
        super(usuario, contrasena, nombre, apellido);
        this.incidentes = new ArrayList<>();
    }

    public void reportarError(String email, String contenido) {
        Incidente incidente = new Incidente(incidentes.size() + 1,
                "Error reportado por " + email, contenido, "Tecnico", this);
        incidentes.add(incidente);
    }

    public void solicitarAsesoramientoDelSistema(String email, String contenido) {
        Incidente incidente = new Incidente(incidentes.size() + 1,
                "Asesoramiento solicitado por " + email, contenido, "Asesoramiento", this);
        incidentes.add(incidente);
    }

    public void comentarEnForo(Foro foro, String comentario) {
        foro.agregarComentario(comentario);
    }

    public List<Incidente> getIncidentes() { return incidentes; }
}
