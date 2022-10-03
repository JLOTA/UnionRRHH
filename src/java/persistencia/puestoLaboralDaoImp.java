/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.util.ArrayList;
import java.util.List;
import negocio.area;
import negocio.horario;
import negocio.puestoLaboral;

/**
 *
 * @author usuario
 */
public class puestoLaboralDaoImp implements puestoLaboralDao{

    @Override
    public String grabarPuestoLaboral(puestoLaboral pul) {
        String sql = "insert into puestoLaboral values (0, '"+pul.getIdArea()+"','"+pul.getIdHorario()+"','"+pul.getPuestoLaboral()+"','"+pul.getDescripcion()+"')";
        return Operacion.ejecutar(sql);
    }

    @Override
    public String editarPuestoLaboral(puestoLaboral pul) {
        String sql = "update puestolaboral set puestoLaboral = '"+pul.getPuestoLaboral()+"', idArea = '"+pul.getIdArea()+"', idHorario = '"+pul.getIdHorario()+"', descripcion = '"+pul.getDescripcion()+"' where idPuestoLaboral = "+pul.getIdPuestoLaboral()+" ";
        return Operacion.ejecutar(sql);
    }

    @Override
    public String borrarPuestoLaboral(puestoLaboral pul) {
        String sql = "delete from puestoLaboral where idPuestoLaboral = "+pul.getIdPuestoLaboral()+" ";
        return Operacion.ejecutar(sql);
    }

    @Override
    public puestoLaboral buscarPuestoLaboral(String pul) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List listarPuestoLaboral() {
        List lis = new ArrayList();
        String sql = "select * from puestoLaboral";
        List lista = Operacion.listar(sql);
        if (lista != null) {
            for (int i = 0; i < lista.size(); i++) {
                Object[] fil = (Object[]) lista.get(i);
                puestoLaboral pul = new puestoLaboral();
                pul.setIdPuestoLaboral((int) fil[0]);
                pul.setIdArea((int) fil[1]);
                pul.setIdHorario((int) fil[2]);
                pul.setPuestoLaboral(fil[3].toString());
                pul.setDescripcion(fil[4].toString());
                lis.add(pul);
            }
            return lis;
        }
        return null;
    }
}
