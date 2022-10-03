/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import negocio.area;
import persistencia.areaDao;
import persistencia.areaDaoImp;

/**
 *
 * @author usuario
 */
public class servicioAreaImp implements servicioArea{

    private areaDao areDao;
    private area ar;

    public servicioAreaImp() {
        areDao = new areaDaoImp();
    }
    
    @Override
    public area nuevaArea() {
        ar = new area(0,"","");
        return ar;
    }

    @Override
    public String grabarArea(String are, String des) {
        ar = new area(0, are, des);
        return areDao.grabarArea(ar);
    }

    @Override
    public area buscarArea(String are) {
        ar = areDao.buscarArea(are);
        if (ar!=null) {
            return ar;
        }
        return null;
    }

    @Override
    public String editarArea(String are, String des) {
        ar = new area(0, are, des);
        return areDao.editarArea(ar);
    }
    
}
