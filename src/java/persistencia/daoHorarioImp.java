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
    public void Registrar(horario horario) throws Exception {
        Conexion con;
        Connection cn = null;
        Statement st = null;
        String sql;

        sql = "Insert Into Horario (idHorario, horario, horaInicio, horaFin) "
                + "Values(0, '"
                + horario.getHorario() + "', "
                + horario.getHoraInicio() + ", "
                + horario.getHoraFin() + ")";

        con = new Conexion();
        try {

            cn = con.conectar();
            st = cn.createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            if (st != null && st.isClosed() == false) {
                st.close();
            }
            st = null;
            if (cn != null && cn.isClosed() == false) {
                cn.close();
            }
            cn = null;
        }
    }

    @Override
    public List<horario> listar() throws Exception {
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
            throw e;
        } finally {
            if (rs != null && rs.isClosed() == false) {
                rs.close();
            }
            rs = null;
            if (st != null && st.isClosed() == false) {
                st.close();
            }
            st = null;
            if (cn != null && cn.isClosed() == false) {
                cn.close();
            }
            cn = null;
        }
        return horarios;
    }

    @Override
    public void actualizar(horario horario) throws Exception {
        Conexion con;
        Connection cn = null;
        Statement st = null;
        String sql;

        sql = "UPDATE Horario SET horario = '"
                + horario.getHorario()+ "', horaInicio = '"
                + horario.getHoraInicio()+ "', horaFin = "
                + horario.getHoraFin()+ "' WHERE ID_Producto = " + horario.getIdHorario();

        con = new Conexion();
        try {
            cn = con.conectar();
            st = cn.createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            if (st != null && st.isClosed() == false) {
                st.close();
            }
            st = null;
            if (cn != null && cn.isClosed() == false) {
                cn.close();
            }
            cn = null;
        }
    }

    @Override
    public horario leer(horario horario) throws Exception {
        horario hor = null;
        Conexion con;
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "SELECT * from horario WHERE idHorario = " + horario.getIdHorario();

        con = new Conexion();
        try {
            cn = con.conectar();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next() == true) {
                hor = new horario();
                hor.setIdHorario(horario.getIdHorario());
                hor.setHorario(rs.getString("horario"));
                hor.setHoraInicio(rs.getString("horaInicio"));
                hor.setHoraFin(rs.getString("horaFin"));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if (rs != null && rs.isClosed() == false) {
                rs.close();
            }
            rs = null;
            if (st != null && st.isClosed() == false) {
                st.close();
            }
            st = null;
            if (cn != null && cn.isClosed() == false) {
                cn.close();
            }
            cn = null;
        }
        return hor;
    }

    @Override
    public void eliminar(horario horario) throws Exception {
        Conexion con;
        Connection cn = null;
        Statement st = null;
        String sql;
        sql = "DELETE FROM horario WHERE idHorario=" + horario.getIdHorario();
        con = new Conexion();
        try {
            cn = con.conectar();
            st = cn.createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            throw e;
        }
    }

}
