/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author usuario
 */
public class vacaciones {

    private int idVacaciones;
    private trabajador tra;
    private String fechaInicio, fechaFin;

    public vacaciones() {
    }

    public vacaciones(int idVacaciones, trabajador tra, String fechaInicio, String fechaFin) {
        this.idVacaciones = idVacaciones;
        this.tra = tra;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public int getIdVacaciones() {
        return idVacaciones;
    }

    public void setIdVacaciones(int idVacaciones) {
        this.idVacaciones = idVacaciones;
    }

    public trabajador getTra() {
        return tra;
    }

    public void setTra(trabajador tra) {
        this.tra = tra;
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
