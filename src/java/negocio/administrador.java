package negocio;

public class administrador {

    private int idAdministrador;
    private trabajador tra;
    private String usuario, clave;

    public administrador() {
    }

    public administrador(int idAdministrador, trabajador tra, String usuario, String clave) {
        this.idAdministrador = idAdministrador;
        this.tra = tra;
        this.usuario = usuario;
        this.clave = clave;
    }

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public trabajador getTra() {
        return tra;
    }

    public void setTra(trabajador tra) {
        this.tra = tra;
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
