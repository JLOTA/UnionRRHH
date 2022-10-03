/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author usuario
 */
public class trabajador {
    private int idTrabajador, idPuestoLaboral, idContrato,idHorario, idEstado;
    private String dni, nombres, apePat, apeMat, fecNac, telefono, correo, direccion;

    public trabajador() {
    }

    public trabajador(int idTrabajador, int idPuestoLaboral, int idContrato, int idHorario, int idEstado, String dni, String nombres, String apePat, String apeMat, String fecNac, String telefono, String correo, String direccion) {
        this.idTrabajador = idTrabajador;
        this.idPuestoLaboral = idPuestoLaboral;
        this.idContrato = idContrato;
        this.idHorario = idHorario;
        this.idEstado = idEstado;
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

    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
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
