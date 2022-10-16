package persistencia;

import java.sql.*;
import java.util.*;
import negocio.permiso;
import negocio.tipoPermiso;
import negocio.trabajador;

public class daoPermisoImp implements daoPermiso{

    @Override
    public void Registrar(permiso permiso) {
        Conexion con;
        Connection cn = null;
        Statement st = null;
        String sql;

        sql = "Insert Into permiso "
                + "Values(0, "
                + permiso.getTipPer().getIdTipoPermiso()+ ", "
                + permiso.getTra().getIdTrabajador()+ ", '"
                + permiso.getFecPer()+ "', '"
                + permiso.getAdjunto()+ "', '"
                + permiso.getDetalle()+ "')";

        con = new Conexion();
        try {

            cn = con.conectar();
            st = cn.createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println("persistencia.daoPermisoImp.Registrar()");
        } 
    }

    @Override
    public List<permiso> listar() {
        List<permiso> permisos = null;
        permiso p;
        Conexion con;
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "select * from permiso";

        con = new Conexion();
        try {
            cn = con.conectar();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            permisos = new ArrayList<>();
            while (rs.next() == true) {
                p = new permiso();
                p.setIdPermiso(rs.getInt("idPermiso"));
                tipoPermiso tipo = leerTipo(rs.getInt("idTipoPermiso"));
                p.setTipPer(tipo);
                daoTrabajador dt = new daoTrabajadorImp();
                trabajador tra = dt.leer(rs.getInt("idTrabajador"));
                p.setTra(tra);
                p.setFecPer(rs.getString("fechaPermiso"));
                p.setAdjunto(rs.getString("adjunto"));
                p.setDetalle(rs.getString("descripcion"));

                permisos.add(p);
            }
        } catch (Exception e) {
            System.out.println("persistencia.daoPermiso.listar()");
        } 
        return permisos;
    }

    @Override
    public void actualizar(permiso permiso) {
        Conexion con;
        Connection cn = null;
        Statement st = null;
        String sql;

        sql = "UPDATE permiso SET idTipoPermiso = "
                + permiso.getTipPer().getIdTipoPermiso()+ ", idTrabajador = "
                + permiso.getTra().getIdTrabajador()+ ", fechaPermiso = '"
                + permiso.getFecPer()+ "', adjunto = '"
                + permiso.getAdjunto()+ "', descripcion = '"
                + permiso.getDetalle()+ "' WHERE idPermiso = " + permiso.getIdPermiso();

        con = new Conexion();
        try {
            cn = con.conectar();
            st = cn.createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println("persistencia.daoPermisoImp.actualizar()");
        } 
    }

    @Override
    public permiso leer(int idPermiso) {
        permiso p = null;
        Conexion con;
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "SELECT * from permiso WHERE idPermiso = " + idPermiso;

        con = new Conexion();
        try {
            cn = con.conectar();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next() == true) {
                p = new permiso();
                p.setIdPermiso(rs.getInt("idPermiso"));
                tipoPermiso tipo = new tipoPermiso();
                tipo = leerTipo(rs.getInt("idTipoPermiso"));
                p.setTipPer(tipo);
                trabajador tra = new trabajador();
                daoTrabajador dt = new daoTrabajadorImp();
                tra = dt.leer(rs.getInt("idTrabajador"));
                p.setTra(tra);
                p.setFecPer(rs.getString("fechaPermiso"));
                p.setAdjunto(rs.getString("adjunto"));
                p.setDetalle(rs.getString("descripcion"));
            }
        } catch (Exception e) {
            System.out.println("persistencia.daoPermiso.leer()");
        } 
        return p;
    }

    @Override
    public void eliminar(int idPermiso) {
        Conexion con;
        Connection cn = null;
        Statement st = null;
        String sql;
        sql = "DELETE FROM permiso WHERE idPermiso=" + idPermiso;
        con = new Conexion();
        try {
            cn = con.conectar();
            st = cn.createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println("persistencia.daoPermisoImp.eliminar()");
        }
    }

    @Override
    public tipoPermiso leerTipo(int idTipo) {
        tipoPermiso hor = null;
        Conexion con;
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "SELECT * from tipoPermiso WHERE idTipoPermiso = " + idTipo;

        con = new Conexion();
        try {
            cn = con.conectar();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next() == true) {
                hor = new tipoPermiso();
                hor.setIdTipoPermiso(rs.getInt("idTipoPermiso"));
                hor.setTipoPermiso(rs.getString("tipoPermiso"));
                hor.setDescripcion(rs.getString("descripcion"));
            }
        } catch (Exception e) {
            System.out.println("persistencia.daoPermisoImp.leerTipo()");
        } 
        return hor;
    }

    @Override
    public List<tipoPermiso> listarTipo() {
        List<tipoPermiso> tipos = null;
        tipoPermiso p;
        Conexion con;
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "select * from tipoPermiso";

        con = new Conexion();
        try {
            cn = con.conectar();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            tipos = new ArrayList<>();
            while (rs.next() == true) {
                p = new tipoPermiso();
                p.setIdTipoPermiso(rs.getInt("idTipoPermiso"));
                p.setTipoPermiso(rs.getString("tipoPermiso"));
                p.setDescripcion(rs.getString("descripcion"));

                tipos.add(p);
            }
        } catch (Exception e) {
            System.out.println("persistencia.daoPermiso.listarTipo()");
        } 
        return tipos;
    }
    
}
