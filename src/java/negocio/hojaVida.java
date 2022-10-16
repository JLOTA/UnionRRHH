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
    private int idHojaVida;
    private trabajador tra;
    private String detalle, adjunto;

    public hojaVida() {
    }

    public hojaVida(int idHojaVida, trabajador tra, String detalle, String adjunto) {
        this.idHojaVida = idHojaVida;
        this.tra = tra;
        this.detalle = detalle;
        this.adjunto = adjunto;
    }

    public int getIdHojaVida() {
        return idHojaVida;
    }

    public void setIdHojaVida(int idHojaVida) {
        this.idHojaVida = idHojaVida;
    }

    public trabajador getTra() {
        return tra;
    }

    public void setTra(trabajador tra) {
        this.tra = tra;
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
