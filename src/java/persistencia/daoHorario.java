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
public interface daoHorario {
    public void Registrar(horario horario);
    public List<horario> listar();
    public void actualizar(horario horario);
    public horario leer(int idHorario );
    public void eliminar(int idHorario);
}
