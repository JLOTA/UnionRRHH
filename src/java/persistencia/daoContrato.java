/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import java.util.List;
import negocio.contrato;
import negocio.tipoContrato;

/**
 *
 * @author usuario
 */
public interface daoContrato {
    public void RegistrarTipo(tipoContrato tipoContrato) throws Exception;
    public List<tipoContrato> listarTipo() throws Exception;
    public void actualizarTipo(tipoContrato tipoContrato) throws Exception;
    public tipoContrato leerTipo(int idTipo ) throws Exception;
    public void eliminarTipo(int idtipo) throws Exception;
    
    public void Registrar(contrato contrato) throws Exception;
    public List<contrato> listar() throws Exception;
    public void actualizar(contrato contrato) throws Exception;
    public contrato leer(int idContrato ) throws Exception;
    public void eliminar(int idContrato) throws Exception;
}
