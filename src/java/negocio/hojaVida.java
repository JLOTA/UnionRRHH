/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author usuario
 */
public class hojaVida {
    private int idHojaVida, idTrabajador;
    private String detalle, adjunto;

    public hojaVida() {
    }

    public hojaVida(int idHojaVida, int idTrabajador, String detalle, String adjunto) {
        this.idHojaVida = idHojaVida;
        this.idTrabajador = idTrabajador;
        this.detalle = detalle;
        this.adjunto = adjunto;
    }

    public int getIdHojaVida() {
        return idHojaVida;
    }

    public void setIdHojaVida(int idHojaVida) {
        this.idHojaVida = idHojaVida;
    }

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getAdjunto() {
        return adjunto;
    }

    public void setAdjunto(String adjunto) {
        this.adjunto = adjunto;
    }

    
}
