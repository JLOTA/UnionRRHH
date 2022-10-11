/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import java.util.List;
import negocio.administrador;

/**
 *
 * @author usuario
 */
public interface daoAdministrador {
    public administrador validar(String usuario, String clave) throws Exception;
    public void Registrar(administrador administrador) throws Exception;
    public List<administrador> listar() throws Exception;
    public void actualizar(administrador administrador) throws Exception;
    public administrador leer(int idAdministrador ) throws Exception;
    public void eliminar(int idAdministrador) throws Exception;
    
}
