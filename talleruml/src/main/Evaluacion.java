package modelos;

import java.time.LocalDateTime;

public class Evaluacion extends ActividadSumativa {
    private int limiteDeTiempo;

    public Evaluacion(String id, String titulo, LocalDateTime fechaDeEntrega,
                      float puntajeMaximo, String contenido, int limiteDeTiempo) {
        super(id, titulo, fechaDeEntrega, puntajeMaximo, contenido);
        this.limiteDeTiempo = limiteDeTiempo;
    }

    public int getLimiteDeTiempo() { return limiteDeTiempo; }
}
