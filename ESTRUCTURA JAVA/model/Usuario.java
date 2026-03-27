package model;


        public class Usuario {

    private int idUsuario;
    private String primerNombre;
    private String apellido;
    private String correo;
    private String telefono;
    private Rol rol;

    public Usuario() {}

    public Usuario(int idUsuario, String primerNombre, String apellido, String correo, String telefono, Rol rol) {
        this.idUsuario = idUsuario;
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.rol = rol;
    }

    public int getIdUsuario() { return idUsuario; }
    public void setIdUsuario(int idUsuario) { this.idUsuario = idUsuario; }

    public String getPrimerNombre() { return primerNombre; }
    public void setPrimerNombre(String primerNombre) { this.primerNombre = primerNombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public Rol getRol() { return rol; }
    public void setRol(Rol rol) { this.rol = rol; }
}
    


