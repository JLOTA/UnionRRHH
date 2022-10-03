/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author usuario
 */
public class asistencia {
    private int idAsistencia;
    private String horaIngreso, horaSalida, fecha,observacion;
    private boolean feriado;
    private trabajador idTrabajador;

    public asistencia() {
    }

    public asistencia(int idAsistencia, String horaIngreso, String horaSalida, String fecha, String observacion, boolean feriado, trabajador idTrabajador) {
        this.idAsistencia = idAsistencia;
        this.horaIngreso = horaIngreso;
        this.horaSalida = horaSalida;
        this.fecha = fecha;
        this.observacion = observacion;
        this.feriado = feriado;
        this.idTrabajador = idTrabajador;
    }

    public int getIdAsistencia() {
        return idAsistencia;
    }

    public void setIdAsistencia(int idAsistencia) {
        this.idAsistencia = idAsistencia;
    }

    public String getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(String horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public boolean isFeriado() {
        return feriado;
    }

    public void setFeriado(boolean feriado) {
        this.feriado = feriado;
    }

    public trabajador getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(trabajador idTrabajador) {
        this.idTrabajador = idTrabajador;
    }
    
}
