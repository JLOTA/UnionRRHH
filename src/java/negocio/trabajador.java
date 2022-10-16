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
    private int idTrabajador;
    private puestoLaboral pueLab;
    private contrato con;
    private horario hor;
    private estado est;
    private String dni, nombres, apePat, apeMat, fecNac, telefono, correo, direccion;

    public trabajador() {
    }

    public trabajador(int idTrabajador, puestoLaboral pueLab, contrato con, horario hor, estado est, String dni, String nombres, String apePat, String apeMat, String fecNac, String telefono, String correo, String direccion) {
        this.idTrabajador = idTrabajador;
        this.pueLab = pueLab;
        this.con = con;
        this.hor = hor;
        this.est = est;
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

    public puestoLaboral getPueLab() {
        return pueLab;
    }

    public void setPueLab(puestoLaboral pueLab) {
        this.pueLab = pueLab;
    }

    public contrato getCon() {
        return con;
    }

    public void setCon(contrato con) {
        this.con = con;
    }

    public horario getHor() {
        return hor;
    }

    public void setHor(horario hor) {
        this.hor = hor;
    }

    public estado getEst() {
        return est;
    }

    public void setEst(estado est) {
        this.est = est;
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
