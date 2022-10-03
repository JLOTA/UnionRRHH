/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author usuario
 */
public class familiar {
    private int idFamiliar, idTipoFamiliar, idTrabajador;
    private String dni, nombres, apePat, apeMat, fecNac;

    public familiar() {
    }

    public familiar(int idFamiliar, int idTipoFamiliar, int idTrabajador, String dni, String nombres, String apePat, String apeMat, String fecNac) {
        this.idFamiliar = idFamiliar;
        this.idTipoFamiliar = idTipoFamiliar;
        this.idTrabajador = idTrabajador;
        this.dni = dni;
        this.nombres = nombres;
        this.apePat = apePat;
        this.apeMat = apeMat;
        this.fecNac = fecNac;
    }

    public int getIdFamiliar() {
        return idFamiliar;
    }

    public void setIdFamiliar(int idFamiliar) {
        this.idFamiliar = idFamiliar;
    }

    public int getIdTipoFamiliar() {
        return idTipoFamiliar;
    }

    public void setIdTipoFamiliar(int idTipoFamiliar) {
        this.idTipoFamiliar = idTipoFamiliar;
    }

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApePat() {
        return apePat;
    }

    public void setApePat(String apePat) {
        this.apePat = apePat;
    }

    public String getApeMat() {
        return apeMat;
    }

    public void setApeMat(String apeMat) {
        this.apeMat = apeMat;
    }

    public String getFecNac() {
        return fecNac;
    }

    public void setFecNac(String fecNac) {
        this.fecNac = fecNac;
    }
    
    
}
