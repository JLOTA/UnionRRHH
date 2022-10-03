/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentacion;

import negocio.horario;

/**
 *
 * @author usuario
 */
public class modeloHorario {

    private horario ho;
    private String msg = "";

    public modeloHorario(horario ho) {
        this.ho = ho;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getIdHorario() {
        return ho.getIdHorario();
    }

    public String getHorario() {
        return ho.getHorario();
    }

    public String getHoraInicio() {
        return ho.getHoraInicio();
    }

    public String getHoraFin() {
        return ho.getHoraFin();
    }

    public void setHo(horario ho) {
        this.ho = ho;
    }

}
