package modelos;

public class Foro {
    private String id;
    private String tematica;
    private int numeroDeComentarios;

    public Foro(String id, String tematica) {
        this.id = id;
        this.tematica = tematica;
        this.numeroDeComentarios = 0;
    }

    public void agregarComentario(String comentario) {
        numeroDeComentarios++;
    }

    public String getId() { return id; }
    public String getTematica() { return tematica; }
    public int getNumeroDeComentarios() { return numeroDeComentarios; }
}
