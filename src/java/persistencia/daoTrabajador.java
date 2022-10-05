/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import java.util.List;
import negocio.trabajador;

/**
 *
 * @author usuario
 */
public interface daoTrabajador {
    public void Registrar(trabajador trabajador) throws Exception;
    public List<trabajador> listar() throws Exception;
    public void actualizar(trabajador trabajador) throws Exception;
    public trabajador leer(int idTrabajador ) throws Exception;
    public void eliminar(int idTrabajador) throws Exception;
}
