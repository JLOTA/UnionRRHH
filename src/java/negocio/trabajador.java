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
    private persona idPersona;
    private puestoLaboral idPuestoLaboral;
    private contrato idContrato;
    private String telefono, correo;

    public trabajador() {
    }

    public trabajador(int idTrabajador, persona idPersona, puestoLaboral idPuestoLaboral, contrato idContrato, String telefono, String correo) {
        this.idTrabajador = idTrabajador;
        this.idPersona = idPersona;
        this.idPuestoLaboral = idPuestoLaboral;
        this.idContrato = idContrato;
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public persona getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(persona idPersona) {
        this.idPersona = idPersona;
    }

    public puestoLaboral getIdPuestoLaboral() {
        return idPuestoLaboral;
    }

    public void setIdPuestoLaboral(puestoLaboral idPuestoLaboral) {
        this.idPuestoLaboral = idPuestoLaboral;
    }

    public contrato getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(contrato idContrato) {
        this.idContrato = idContrato;
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
    
}
