package modelos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Incidente {
    protected int id;
    protected LocalDateTime fechaReportado;
    protected String estado;
    protected String titulo;
    protected String descripcion;
    protected List<String> logActualizaciones;
    protected LocalDateTime fechaCerrado;
    protected String tipo;

    // Asociaciones
    protected SoporteTecnico responsable;
    protected PersonalAcademico beneficiario;

    public Incidente(int id, String titulo, String descripcion, String tipo, PersonalAcademico beneficiario) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.beneficiario = beneficiario;
        this.fechaReportado = LocalDateTime.now();
        this.estado = "Abierto";
        this.logActualizaciones = new ArrayList<>();
    }

    public void actualizarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        logActualizaciones.add(LocalDateTime.now() + " - " + nuevoEstado);
    }

    public void cerrar() {
        this.fechaCerrado = LocalDateTime.now();
    }

    public int getId() { return id; }
    public String getEstado() { return estado; }
    public PersonalAcademico getBeneficiario() { return beneficiario; }
    public SoporteTecnico getResponsable() { return responsable; }
    public void setResponsable(SoporteTecnico responsable) { this.responsable = responsable; }
}
