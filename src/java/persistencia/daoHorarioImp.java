/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import negocio.horario;

/**
 *
 * @author usuario
 */
public class daoHorarioImp implements daoHorario {

    @Override
    public void Registrar(horario horario) {
        Conexion con;
        Connection cn = null;
        Statement st = null;
        String sql;

        sql = "Insert Into Horario (idHorario, horario, horaInicio, horaFin) "
                + "Values(0, '"
                + horario.getHorario() + "', '"
                + horario.getHoraInicio() + "', '"
                + horario.getHoraFin() + "')";

        con = new Conexion();
        try {

            cn = con.conectar();
            st = cn.createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println("persistencia.daoHorarioImp.Registrar()");;
        } 
    }

    @Override
    public List<horario> listar(){
        List<horario> horarios = null;
        horario hor;
        Conexion con;
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "select * from Horario";

        con = new Conexion();
        try {
            cn = con.conectar();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            horarios = new ArrayList<>();
            while (rs.next() == true) {
                hor = new horario();
                hor.setIdHorario(rs.getInt("idHorario"));
                hor.setHorario(rs.getString("horario"));
                hor.setHoraInicio(rs.getString("horaInicio"));
                hor.setHoraFin(rs.getString("horaFin"));

                horarios.add(hor);
            }
        } catch (Exception e) {
            System.out.println("persistencia.daoHorarioImp.listar()");
        } 
        return horarios;
    }

    @Override
    public void actualizar(horario horario) {
        Conexion con;
        Connection cn = null;
        Statement st = null;
        String sql;

        sql = "UPDATE Horario SET horario = '"
                + horario.getHorario()+ "', horaInicio = '"
                + horario.getHoraInicio()+ "', horaFin = '"
                + horario.getHoraFin()+ "' WHERE idHorario = " + horario.getIdHorario();

        con = new Conexion();
        try {
            cn = con.conectar();
            st = cn.createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println("persistencia.daoHorarioImp.actualizar()");;
        }
    }

    @Override
    public horario leer(int idHorario) {
        horario hor = null;
        Conexion con;
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "SELECT * from horario WHERE idHorario = " + idHorario;

        con = new Conexion();
        try {
            cn = con.conectar();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next() == true) {
                hor = new horario();
                hor.setIdHorario(rs.getInt("idHorario"));
                hor.setHorario(rs.getString("horario"));
                hor.setHoraInicio(rs.getString("horaInicio"));
                hor.setHoraFin(rs.getString("horaFin"));
            }
        } catch (Exception e) {
            System.out.println("persistencia.daoHorarioImp.leer()");
        }
        return hor;
    }

    @Override
    public void eliminar(int idHorario) {
        Conexion con;
        Connection cn = null;
        Statement st = null;
        String sql;
        sql = "DELETE FROM horario WHERE idHorario=" + idHorario;
        con = new Conexion();
        try {
            cn = con.conectar();
            st = cn.createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println("persistencia.daoHorarioImp.eliminar()");
        }
    }

}
