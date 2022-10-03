/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author usuario
 */
public class contrato {
    private int idContrato;
    private tipoContrato idTipoContrato;
    private String descripcion, fechaInicio, fechaFin;

    public contrato() {
    }

    public contrato(int idContrato, tipoContrato idTipoContrato, String descripcion, String fechaInicio, String fechaFin) {
        this.idContrato = idContrato;
        this.idTipoContrato = idTipoContrato;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public tipoContrato getIdTipoContrato() {
        return idTipoContrato;
    }

    public void setIdTipoContrato(tipoContrato idTipoContrato) {
        this.idTipoContrato = idTipoContrato;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
    
}
