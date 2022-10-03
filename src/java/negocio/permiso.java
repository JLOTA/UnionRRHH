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
    private int idPermiso, idTipoPermiso, idTrabajador;
    private String fechaPermiso, adjunto, detalle;

    public permiso() {
    }

    public permiso(int idPermiso, int idTipoPermiso, int idTrabajador, String fechaPermiso, String adjunto, String detalle) {
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

    public int getIdTipoPermiso() {
        return idTipoPermiso;
    }

    public void setIdTipoPermiso(int idTipoPermiso) {
        this.idTipoPermiso = idTipoPermiso;
    }

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
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
