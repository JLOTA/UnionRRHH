/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author usuario
 */
public class permiso {
    private int idPermiso;
    private tipoPermiso idTipoPermiso;
    private trabajador idTrabajador;
    private String fechaPermiso, adjunto, detalle;

    public permiso() {
    }

    public permiso(int idPermiso, tipoPermiso idTipoPermiso, trabajador idTrabajador, String fechaPermiso, String adjunto, String detalle) {
        this.idPermiso = idPermiso;
        this.idTipoPermiso = idTipoPermiso;
        this.idTrabajador = idTrabajador;
        this.fechaPermiso = fechaPermiso;
        this.adjunto = adjunto;
        this.detalle = detalle;
    }

    public int getIdPermiso() {
        return idPermiso;
    }

    public void setIdPermiso(int idPermiso) {
        this.idPermiso = idPermiso;
    }

    public tipoPermiso getIdTipoPermiso() {
        return idTipoPermiso;
    }

    public void setIdTipoPermiso(tipoPermiso idTipoPermiso) {
        this.idTipoPermiso = idTipoPermiso;
    }

    public trabajador getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(trabajador idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public String getFechaPermiso() {
        return fechaPermiso;
    }

    public void setFechaPermiso(String fechaPermiso) {
        this.fechaPermiso = fechaPermiso;
    }

    public String getAdjunto() {
        return adjunto;
    }

    public void setAdjunto(String adjunto) {
        this.adjunto = adjunto;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    
}
