package modelos;

import java.util.ArrayList;
import java.util.List;

public class SoporteTecnico extends Usuario {
    protected List<Incidente> incidentes;

    public SoporteTecnico(String usuario, String contrasena, String nombre, String apellido) {
        super(usuario, contrasena, nombre, apellido);
        this.incidentes = new ArrayList<>();
    }

    public void brindarAsistencia(Usuario usuario) {
        System.out.println("Brindando asistencia a: " + usuario.getUsuario());
    }

    public void resolverProblemaTecnico(Usuario usuario) {
        for (Incidente i : incidentes) {
            if (i.getBeneficiario() == usuario) {
                i.actualizarEstado("Resuelto");
                i.cerrar();
            }
        }
    }

    public void derivarProblemaDeGestion(Administrador administrador) {
        System.out.println("Problema derivado al administrador: " + administrador.getUsuario());
    }

    public List<Incidente> getIncidentes() { return incidentes; }
}
