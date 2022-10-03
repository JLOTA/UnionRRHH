/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentacion;

import negocio.puestoLaboral;

/**
 *
 * @author usuario
 */
public class modeloPuestoLaboral {

    private puestoLaboral pul;
    private String msg = "";

    public modeloPuestoLaboral(puestoLaboral pul) {
        this.pul = pul;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getPuestoLaboral() {
        return pul.getPuestoLaboral();
    }

    public int getIdPuestoLaboral() {
        return pul.getIdPuestoLaboral();
    }

    public int getIdArea() {
        return pul.getIdArea();
    }

    public int getIdHorario() {
        return pul.getIdHorario();
    }

    public String getDescripcion() {
        return pul.getDescripcion();
    }

    public void setPul(puestoLaboral pul) {
        this.pul = pul;
    }

}
