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
    public void RegistrarTipo(tipoContrato tipoContrato);
    public List<tipoContrato> listarTipo();
    public void actualizarTipo(tipoContrato tipoContrato);
    public tipoContrato leerTipo(int idTipo );
    public void eliminarTipo(int idtipo);
    
    public void Registrar(contrato contrato);
    public List<contrato> listar();
    public void actualizar(contrato contrato);
    public contrato leer(int idContrato );
    public void eliminar(int idContrato);
}
