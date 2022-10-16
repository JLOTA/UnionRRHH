/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author usuario
 */
public class pago {
    private int idPago;
    private tipoPago tipPag;
    private trabajador tra;
    private String fechaPago;
    private double sueldoBase, seguro, asignacionFamiliar;

    public pago() {
    }

    public pago(int idPago, tipoPago tipPag, trabajador tra, String fechaPago, double sueldoBase, double seguro, double asignacionFamiliar) {
        this.idPago = idPago;
        this.tipPag = tipPag;
        this.tra = tra;
        this.fechaPago = fechaPago;
        this.sueldoBase = sueldoBase;
        this.seguro = seguro;
        this.asignacionFamiliar = asignacionFamiliar;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public tipoPago getTipPag() {
        return tipPag;
    }

    public void setTipPag(tipoPago tipPag) {
        this.tipPag = tipPag;
    }

    public trabajador getTra() {
        return tra;
    }

    public void setTra(trabajador tra) {
        this.tra = tra;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getSeguro() {
        return seguro;
    }

    public void setSeguro(double seguro) {
        this.seguro = seguro;
    }

    public double getAsignacionFamiliar() {
        return asignacionFamiliar;
    }

    public void setAsignacionFamiliar(double asignacionFamiliar) {
        this.asignacionFamiliar = asignacionFamiliar;
    }

        
}
