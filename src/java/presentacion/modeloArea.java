/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentacion;

import negocio.area;

/**
 *
 * @author usuario
 */
public class modeloArea {

    private area ar;
    private String msg = "";

    public modeloArea(area ar) {
        this.ar = ar;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getIdArea() {
        return ar.getIdArea();
    }

    public String getArea() {
        return ar.getArea();
    }

    public String getDescripcion() {
        return ar.getDescripcion();
    }

    public void setAr(area ar) {
        this.ar = ar;
    }
}
