/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author usuario
 */
public class puestoLaboral {
    private int idPuestoLaboral;
    private int idArea;
    private String puestoLaboral, descripcion;

    public puestoLaboral() {
    }

    public puestoLaboral(int idPuestoLaboral, int idArea, String puestoLaboral, String descripcion) {
        this.idPuestoLaboral = idPuestoLaboral;
        this.idArea = idArea;
        this.puestoLaboral = puestoLaboral;
        this.descripcion = descripcion;
    }

    public int getIdPuestoLaboral() {
        return idPuestoLaboral;
    }

    public void setIdPuestoLaboral(int idPuestoLaboral) {
        this.idPuestoLaboral = idPuestoLaboral;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public String getPuestoLaboral() {
        return puestoLaboral;
    }

    public void setPuestoLaboral(String puestoLaboral) {
        this.puestoLaboral = puestoLaboral;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
