package util;

public class utilTrabajador {

    private int idTrabajador, idPuestoLaboral;
    private String puestoLaboral;
    private int idContrato;
    private String contrato;
    private int idHorario;
    private String horario;
    private int idEstado;
    private String estado;
    private String dni, nombres, apePat, apeMat, fecNac, telefono, correo, direccion;

    public utilTrabajador() {
    }

    public utilTrabajador(int idTrabajador, int idPuestoLaboral, String puestoLaboral, int idContrato, String contrato, int idHorario, String horario, int idEstado, String estado, String dni, String nombres, String apePat, String apeMat, String fecNac, String telefono, String correo, String direccion) {
        this.idTrabajador = idTrabajador;
        this.idPuestoLaboral = idPuestoLaboral;
        this.puestoLaboral = puestoLaboral;
        this.idContrato = idContrato;
        this.contrato = contrato;
        this.idHorario = idHorario;
        this.horario = horario;
        this.idEstado = idEstado;
        this.estado = estado;
        this.dni = dni;
        this.nombres = nombres;
        this.apePat = apePat;
        this.apeMat = apeMat;
        this.fecNac = fecNac;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public int getIdPuestoLaboral() {
        return idPuestoLaboral;
    }

    public void setIdPuestoLaboral(int idPuestoLaboral) {
        this.idPuestoLaboral = idPuestoLaboral;
    }

    public String getPuestoLaboral() {
        return puestoLaboral;
    }

    public void setPuestoLaboral(String puestoLaboral) {
        this.puestoLaboral = puestoLaboral;
    }

    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApePat() {
        return apePat;
    }

    public void setApePat(String apePat) {
        this.apePat = apePat;
    }

    public String getApeMat() {
        return apeMat;
    }

    public void setApeMat(String apeMat) {
        this.apeMat = apeMat;
    }

    public String getFecNac() {
        return fecNac;
    }

    public void setFecNac(String fecNac) {
        this.fecNac = fecNac;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
