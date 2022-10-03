/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import negocio.horario;

/**
 *
 * @author usuario
 */
public interface servicioHorario {
    public horario nuevoHorario();
    public String grabarHorario(String hor, String horIni, String horFin);
    public horario buscarHorario(String hor);
    public String editarHorario(String hor, String horIni, String horFin);
    public List listarHorario();
}
