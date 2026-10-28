package modelos;

public class Administrador extends Usuario {

    public Administrador(String usuario, String contrasena, String nombre, String apellido) {
        super(usuario, contrasena, nombre, apellido);
    }

    public void crearUsuarioConRol(String usuario, String contrasena) {
        System.out.println("Usuario creado con rol: " + usuario);
    }

    public void asignarPermiso(String usuario) {
        System.out.println("Permiso asignado a: " + usuario);
    }

    public void actualizarSoftware() {
        System.out.println("Software de la plataforma actualizado");
    }

    public void asignarResponsable(Curso curso, Profesor responsable) {
        curso.setResponsable(responsable);
        responsable.getCursosACargo().add(curso);
    }
}
