/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;
import negocio.puestoLaboral;
import persistencia.puestoLaboralDao;
import persistencia.puestoLaboralDaoImp;

/**
 *
 * @author usuario
 */
public class servicioPuestoLaboralImp implements servicioPuestoLaboral{

    private puestoLaboralDao pulDao;
    private puestoLaboral pu;

    public servicioPuestoLaboralImp() {
        pulDao=new puestoLaboralDaoImp();
    }

    @Override
    public puestoLaboral nuevoPuestoLaboral() {
        pu = new puestoLaboral(0, 0, 0, "", "");
        return pu;
    }



    @Override
    public puestoLaboral buscarPuestoLaboral(String nom) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String grabarPuestoLaboral(int idArea, int idHorario, String nom, String des) {
        pu = new puestoLaboral(0, idArea, idHorario, nom, des);
        return pulDao.grabarPuestoLaboral(pu);
    }

    @Override
    public String editarPuestoLaboral(int idArea, int idHorario, String nom, String des) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
