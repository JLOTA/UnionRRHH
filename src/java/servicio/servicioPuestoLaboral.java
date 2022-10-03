/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import negocio.area;
import negocio.horario;
import negocio.puestoLaboral;

/**
 *
 * @author usuario
 */
public interface servicioPuestoLaboral {
    public puestoLaboral nuevoPuestoLaboral();
    public String grabarPuestoLaboral(int idArea, int idHorario, String nom, String des);
    public puestoLaboral buscarPuestoLaboral(String nom);
    public String editarPuestoLaboral(int idArea, int idHorario, String nom, String des);
}
