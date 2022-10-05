/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import java.util.List;
import negocio.area;

/**
 *
 * @author usuario
 */
public interface daoArea {
    public void Registrar(area area) throws Exception;
    public List<area> listar() throws Exception;
    public void actualizar(area area) throws Exception;
    public area leer(int idArea ) throws Exception;
    public void eliminar(int idArea) throws Exception;
}
