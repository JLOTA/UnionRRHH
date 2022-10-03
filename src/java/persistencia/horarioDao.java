/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import java.util.List;
import negocio.horario;

/**
 *
 * @author usuario
 */
public interface horarioDao {
    public String grabarHorario(horario hor);
    public String editarHorario(horario hor);
    public List listarHorario();
    public horario buscarHorario(String hor);
}
