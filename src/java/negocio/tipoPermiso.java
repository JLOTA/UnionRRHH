/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author usuario
 */
public class tipoPermiso {
    private int idTipoPermiso;
    private String tipoPermiso, descripcion;

    public tipoPermiso() {
    }

    public tipoPermiso(int idTipoPermiso, String tipoPermiso, String descripcion) {
        this.idTipoPermiso = idTipoPermiso;
        this.tipoPermiso = tipoPermiso;
        this.descripcion = descripcion;
    }

    public int getIdTipoPermiso() {
        return idTipoPermiso;
    }

    public void setIdTipoPermiso(int idTipoPermiso) {
        this.idTipoPermiso = idTipoPermiso;
    }

    public String getTipoPermiso() {
        return tipoPermiso;
    }

    public void setTipoPermiso(String tipoPermiso) {
        this.tipoPermiso = tipoPermiso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
