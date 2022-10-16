/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.sql.*;
import java.util.*;
import jdk.nashorn.internal.runtime.regexp.joni.EncodingHelper;
import negocio.contrato;
import negocio.estado;
import negocio.horario;
import negocio.puestoLaboral;
import negocio.trabajador;
import util.utilTrabajador;

/**
 *
 * @author usuario
 */
public class daoTrabajadorImp implements daoTrabajador{
    @Override
    public void Registrar(trabajador trabajador){
        Conexion con;
        Connection cn = null;
        Statement st = null;
        String sql;

        sql = "Insert Into trabajador "
                + "Values(0, '"
                + trabajador.getPueLab().getIdPuestoLaboral()+ "', '"
                + trabajador.getCon().getIdContrato()+ "', '"
                + trabajador.getHor().getIdHorario()+ "', '"
                + trabajador.getEst().getIdEstado()+ "', '"
                + trabajador.getDni()+ "', '"
                + trabajador.getNombres()+ "', '"
                + trabajador.getApePat()+ "', '"
                + trabajador.getApeMat()+ "', '"
                + trabajador.getFecNac()+ "', '"
                + trabajador.getTelefono()+ "', '"
                + trabajador.getCorreo()+ "', '"
                + trabajador.getDireccion()+ "')";

        con = new Conexion();
        try {

            cn = con.conectar();
            st = cn.createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println("persistencia.daoTrabajadorImp.Registrar()");
        }
    }

    @Override
    public List<trabajador> listar() {
        List<trabajador> trabajadores = null;
        trabajador hor;
        Conexion con;
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "select * from trabajador";

        con = new Conexion();
        try {
            cn = con.conectar();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            trabajadores = new ArrayList<>();
            while (rs.next() == true) {
                hor = new trabajador();
                hor.setIdTrabajador(rs.getInt("idTrabajador"));
                daoPuestoLaboral dpl = new daoPuestoLaboralImp();
                puestoLaboral pp = dpl.leer(rs.getInt("idPuestoLaboral"));
                hor.setPueLab(pp);
                daoContrato dc = new daoContratoImp();
                contrato cc= dc.leer(rs.getInt("idContrato"));
                hor.setCon(cc);
                daoHorario dh = new daoHorarioImp();
                horario hh=dh.leer(rs.getInt("idHorario"));
                hor.setHor(hh);
                daoEstado de = new daoEstadoImp();
                estado ee= de.leer(rs.getInt("idEstado"));
                hor.setEst(ee);
                hor.setDni(rs.getString("dni"));
                hor.setNombres(rs.getString("nombres"));
                hor.setApePat(rs.getString("apellidoPaterno"));
                hor.setApeMat(rs.getString("apellidoMaterno"));
                hor.setFecNac(rs.getString("fechaNacimiento"));
                hor.setTelefono(rs.getString("telefono"));
                hor.setCorreo(rs.getString("correo"));
                hor.setDireccion(rs.getString("direccion"));

                trabajadores.add(hor);
            }
        } catch (Exception e) {
            System.out.println("persistencia.daoTrabajadorImp.listar()");
        } 
        return trabajadores;
    }

    @Override
    public void actualizar(trabajador trabajador){
        Conexion con;
        Connection cn = null;
        Statement st = null;
        String sql;

        sql = "UPDATE trabajador SET idPuestoLaboral = "
                + trabajador.getPueLab().getIdPuestoLaboral()+ ", idContrato = "
                + trabajador.getCon().getIdContrato()+ ", idHorario = "
                + trabajador.getHor().getIdHorario()+ ", idEstado = "
                + trabajador.getEst().getIdEstado()+ ", dni = '"
                + trabajador.getDni()+ "', nombres = '"
                + trabajador.getNombres()+ "', apellidoPaterno = '"
                + trabajador.getApePat()+ "', apellidoMaterno = '"
                + trabajador.getApeMat()+ "', fechaNacimiento = '"
                + trabajador.getFecNac()+ "', telefono = '"
                + trabajador.getTelefono()+ "', correo = '"
                + trabajador.getCorreo()+ "', direccion = '"
                + trabajador.getDireccion()+ "' WHERE idTrabajador = " + trabajador.getIdTrabajador();

        con = new Conexion();
        try {
            cn = con.conectar();
            st = cn.createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println("persistencia.daoTrabajadorImp.actualizar()");
        } 
    }

    @Override
    public trabajador leer(int idTrabajador){
        trabajador hor = null;
        Conexion con;
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "SELECT * from trabajador WHERE idTrabajador = " + idTrabajador;

        con = new Conexion();
        try {
            cn = con.conectar();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next() == true) {
                hor=new trabajador();
                hor.setIdTrabajador(rs.getInt("idTrabajador"));
                daoPuestoLaboral dpl = new daoPuestoLaboralImp();
                puestoLaboral pp = dpl.leer(rs.getInt("idPuestoLaboral"));
                hor.setPueLab(pp);
                daoContrato dc = new daoContratoImp();
                contrato cc= dc.leer(rs.getInt("idContrato"));
                hor.setCon(cc);
                daoHorario dh = new daoHorarioImp();
                horario hh=dh.leer(rs.getInt("idHorario"));
                hor.setHor(hh);
                daoEstado de = new daoEstadoImp();
                estado ee= de.leer(rs.getInt("idEstado"));
                hor.setEst(ee);
                hor.setDni(rs.getString("dni"));
                hor.setNombres(rs.getString("nombres"));
                hor.setApePat(rs.getString("apellidoPaterno"));
                hor.setApeMat(rs.getString("apellidoMaterno"));
                hor.setFecNac(rs.getString("fechaNacimiento"));
                hor.setTelefono(rs.getString("telefono"));
                hor.setCorreo(rs.getString("correo"));
                hor.setDireccion(rs.getString("direccion"));
            }
        } catch (Exception e) {
            System.out.println("persistencia.daoTrabajadorImp.leer()");
        } 
        return hor;
    }

    @Override
    public void eliminar(int idTrabajador){
        Conexion con;
        Connection cn = null;
        Statement st = null;
        String sql;
        sql = "DELETE FROM trabajador WHERE idTrabajador=" + idTrabajador;
        con = new Conexion();
        try {
            cn = con.conectar();
            st = cn.createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println("persistencia.daoTrabajadorImp.eliminar()");
        }
    }

    @Override
    public List<utilTrabajador> listarFull() {
        List<utilTrabajador> trabajadores = null;
        utilTrabajador hor;
        Conexion con;
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "SELECT t.idTrabajador, t.idPuestoLaboral, pl.puestoLaboral, t.idContrato, c.descripcion, t.idHorario, h.horario, t.idEstado, e.estado, t.dni, t.nombres, t.apellidoPaterno, t.apellidoMaterno, t.fechaNacimiento, t.telefono, t.correo, t.direccion FROM trabajador t \n" +
"inner join puestolaboral pl on t.idPuestoLaboral = pl.idPuestoLaboral \n" +
"inner join contrato c on t.idContrato = c.idContrato\n" +
"inner join horario h on t.idHorario = h.idHorario\n" +
"inner join estado e on t.idEstado = e.idEstado\n" +
"order by t.idTrabajador";

        con = new Conexion();
        try {
            cn = con.conectar();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            trabajadores = new ArrayList<>();
            while (rs.next() == true) {
                hor = new utilTrabajador();
                hor.setIdTrabajador(rs.getInt("idTrabajador"));
                hor.setIdPuestoLaboral(rs.getInt("idPuestoLaboral"));
                hor.setPuestoLaboral(rs.getString("puestoLaboral"));
                hor.setIdContrato(rs.getInt("idContrato"));
                hor.setContrato(rs.getString("descripcion"));
                hor.setIdHorario(rs.getInt("idHorario"));
                hor.setHorario(rs.getString("horario"));
                hor.setIdEstado(rs.getInt("idEstado"));
                hor.setEstado(rs.getString("estado"));
                hor.setDni(rs.getString("dni"));
                hor.setNombres(rs.getString("nombres"));
                hor.setApePat(rs.getString("apellidoPaterno"));
                hor.setApeMat(rs.getString("apellidoMaterno"));
                hor.setFecNac(rs.getString("fechaNacimiento"));
                hor.setTelefono(rs.getString("telefono"));
                hor.setCorreo(rs.getString("correo"));
                hor.setDireccion(rs.getString("direccion"));

                trabajadores.add(hor);
            }
        } catch (Exception e) {
            System.out.println("persistencia.daoTrabajadorImp.listarFull()");
        } 
        return trabajadores;
    }
    
}
