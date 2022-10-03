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
    public void Registrar(horario horario) throws Exception;

    public List<horario> listar() throws Exception;

    public void actualizar(horario horario) throws Exception;

    public horario leer(horario horario) throws Exception;
    public void eliminar(horario horario) throws Exception;
}
