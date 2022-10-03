/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author usuario
 */
public class tipoFamiliar {
    private int idTipoFamiliar;
    private String tipoFamiliar;

    public tipoFamiliar() {
    }

    public tipoFamiliar(int idTipoFamiliar, String tipoFamiliar) {
        this.idTipoFamiliar = idTipoFamiliar;
        this.tipoFamiliar = tipoFamiliar;
    }

    public int getIdTipoFamiliar() {
        return idTipoFamiliar;
    }

    public void setIdTipoFamiliar(int idTipoFamiliar) {
        this.idTipoFamiliar = idTipoFamiliar;
    }

    public String getTipoFamiliar() {
        return tipoFamiliar;
    }

    public void setTipoFamiliar(String tipoFamiliar) {
        this.tipoFamiliar = tipoFamiliar;
    }
}
