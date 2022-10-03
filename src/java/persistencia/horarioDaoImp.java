/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.util.ArrayList;
import java.util.List;
import negocio.horario;

/**
 *
 * @author usuario
 */
public class horarioDaoImp implements horarioDao{

    @Override
    public String grabarHorario(horario hor) {
        String sql = "insert into horario values (0, '"+hor.getHorario()+"','"+hor.getHoraInicio()+"','"+hor.getHoraFin()+"')";
        return Operacion.ejecutar(sql);
    }

    @Override
    public String editarHorario(horario hor) {
        String sql = "update horario set horario = '"+hor.getHorario()+"'where idHorario = "+hor.getIdHorario()+" ";
        return Operacion.ejecutar(sql);
    }

    @Override
    public List listarHorario() {
        List lis = new ArrayList();
        String sql = "select * from horario";
        List lista = Operacion.listar(sql);
        if (lista!=null) {
            for (int i = 0; i < lista.size(); i++) {
                Object[] fil = (Object[]) lista.get(i);
                horario hor = new horario();
                hor.setIdHorario((int) fil[0]);
                hor.setHorario(fil[1].toString());
                hor.setHoraInicio(fil[2].toString());
                hor.setHoraFin(fil[3].toString());
                lis.add(hor);
            }
            return lis;
        }
        return null;
    }

    @Override
    public horario buscarHorario(String hor) {
        String sql = "select * from horario where horario = '" + hor + "'";
        Object[] fila = Operacion.buscar(sql);
        if (fila != null) {
            horario ho = new horario();
            ho.setIdHorario((int) fila[0]);
            ho.setHorario(fila[1].toString());
            ho.setHoraInicio(fila[2].toString());
            ho.setHoraFin(fila[3].toString());
            return ho;
        }
        return null;
    }
    
}
