package negocio;

public class administrador {
    private int idAdministrador, idTrabajador;
    private String usuario, clave;

    public administrador() {
    }

    public administrador(int idAdministrador, int idTrabajador, String usuario, String clave) {
        this.idAdministrador = idAdministrador;
        this.idTrabajador = idTrabajador;
        this.usuario = usuario;
        this.clave = clave;
    }

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
}
