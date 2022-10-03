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
    private int idHorario;
    private String puestoLaboral, descripcion;

    public puestoLaboral() {
    }

    public puestoLaboral(int idPuestoLaboral, int idArea, int idHorario, String puestoLaboral, String descripcion) {
        this.idPuestoLaboral = idPuestoLaboral;
        this.idArea = idArea;
        this.idHorario = idHorario;
        this.puestoLaboral = puestoLaboral;
        this.descripcion = descripcion;
    }



    public String getPuestoLaboral() {
        return puestoLaboral;
    }

    public void setPuestoLaboral(String puestoLaboral) {
        this.puestoLaboral = puestoLaboral;
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

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }





    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
