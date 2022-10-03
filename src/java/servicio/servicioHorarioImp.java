/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import negocio.horario;
import persistencia.horarioDao;
import persistencia.horarioDaoImp;

/**
 *
 * @author usuario
 */
public class servicioHorarioImp implements servicioHorario{

    private horarioDao horDao;
    private horario ho;

    public servicioHorarioImp() {
        horDao = new horarioDaoImp();
    }
    
    @Override
    public horario nuevoHorario() {
        ho = new horario(0, "", "", "");
        return ho;
    }

    @Override
    public String grabarHorario(String hor, String horIni, String horFin) {
        ho = new horario(0, hor, horIni, horFin);
        return horDao.grabarHorario(ho);
    }

    @Override
    public horario buscarHorario(String hor) {
        ho = horDao.buscarHorario(hor);
        if (ho!=null) {
            return ho;
        }
        return null;
    }

    @Override
    public String editarHorario(String hor, String horIni, String horFin) {
        ho = new horario(0, hor, horIni, horFin);
        return horDao.editarHorario(ho);
    }

    @Override
    public List listarHorario() {
        List lis = new ArrayList();
        for (int i = 0; i < horDao.listarHorario().size(); i++) {
            horario hor = (horario) horDao.listarHorario().get(i);
            Object[] fil = new Object[3];
            fil[0] = hor.getIdHorario();
            fil[1] = hor.getHorario();
            fil[2] = hor.getHoraInicio();
            fil[3] = hor.getHoraFin();
            lis.add(fil);
        }
        return lis;
    }
    
}
