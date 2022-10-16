package persistencia;

import java.sql.*;
import java.util.List;
import negocio.administrador;
import negocio.trabajador;

public class daoAdministradorImp implements daoAdministrador {

    @Override
    public administrador validar(String usuario, String clave) {
        administrador adm = null;
        Conexion con;
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;

        String sql = "select * from administrador where usuario='" + usuario
                + "' and clave='" + clave + "'";
        con = new Conexion();
        try {
            cn = con.conectar();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next() == true) {
                adm = new administrador();
                adm.setIdAdministrador(rs.getInt("idAdministrador"));
                daoTrabajador dt= new daoTrabajadorImp();
                trabajador tt= dt.leer(rs.getInt("idTrabajador"));
                adm.setTra(tt);
                adm.setUsuario(rs.getString("usuario"));
                adm.setClave(rs.getString("clave"));
            }
        } catch (Exception e) {
            System.out.println("persistencia.daoAdministradorImp.validar()");
        }
        return adm;
    }

    @Override
    public void Registrar(administrador administrador) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<administrador> listar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void actualizar(administrador administrador) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public administrador leer(int idAdministrador) {
        administrador adm = null;
        Conexion con;
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "SELECT * from administrador WHERE idAdministrador = " + idAdministrador;

        con = new Conexion();
        try {
            cn = con.conectar();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next() == true) {
                adm = new administrador();
                adm.setIdAdministrador(rs.getInt("idAdministrador"));
                daoTrabajador dt= new daoTrabajadorImp();
                trabajador tt= dt.leer(rs.getInt("idTrabajador"));
                adm.setTra(tt);
                adm.setUsuario(rs.getString("usuario"));
                adm.setClave(rs.getString("clave"));
            }
        } catch (Exception e) {
            System.out.println("persistencia.daoAdministradorImp.leer()");
        } 
        return adm;
    }

    @Override
    public void eliminar(int idAdministrador) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
