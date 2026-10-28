package modelos;

public class Usuario {
    protected String usuario;
    protected String contrasena;
    protected String nombre;
    protected String apellido;

    public Usuario(String usuario, String contrasena, String nombre, String apellido) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public boolean logIn() {
        return usuario != null && contrasena != null;
    }

    public boolean logOut() {
        return true;
    }

    public String getUsuario() { return usuario; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
}
