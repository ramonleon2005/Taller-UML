package modelos;

import java.time.LocalDateTime;

public class Tarea extends ActividadSumativa {
    private LocalDateTime fechaDePublicacion;

    public Tarea(String id, String titulo, LocalDateTime fechaDeEntrega,
                 float puntajeMaximo, String contenido, LocalDateTime fechaDePublicacion) {
        super(id, titulo, fechaDeEntrega, puntajeMaximo, contenido);
        this.fechaDePublicacion = fechaDePublicacion;
    }

    public LocalDateTime getFechaDePublicacion() { return fechaDePublicacion; }
}
