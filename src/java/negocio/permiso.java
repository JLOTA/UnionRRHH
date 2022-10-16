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
    private tipoPermiso tipPer;
    private trabajador tra;
    private String fecPer, adjunto, detalle;

    public permiso() {
    }

    public permiso(int idPermiso, tipoPermiso tipPer, trabajador tra, String fecPer, String adjunto, String detalle) {
        this.idPermiso = idPermiso;
        this.tipPer = tipPer;
        this.tra = tra;
        this.fecPer = fecPer;
        this.adjunto = adjunto;
        this.detalle = detalle;
    }

    public int getIdPermiso() {
        return idPermiso;
    }

    public void setIdPermiso(int idPermiso) {
        this.idPermiso = idPermiso;
    }

    public tipoPermiso getTipPer() {
        return tipPer;
    }

    public void setTipPer(tipoPermiso tipPer) {
        this.tipPer = tipPer;
    }

    public trabajador getTra() {
        return tra;
    }

    public void setTra(trabajador tra) {
        this.tra = tra;
    }

    public String getFecPer() {
        return fecPer;
    }

    public void setFecPer(String fecPer) {
        this.fecPer = fecPer;
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