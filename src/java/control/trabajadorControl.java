/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import negocio.trabajador;
import persistencia.daoTrabajador;
import persistencia.daoTrabajadorImp;

/**
 *
 * @author usuario
 */
@WebServlet(name = "trabajadorControl", urlPatterns = {"/trabajadorControl"})
public class trabajadorControl extends HttpServlet {

    String listarTrabajador = "vistaTrabajador/trabajadorListar.jsp";
    String agregarTrabajador = "vistaTrabajador/trabajadorAgregar.jsp";
    String editarTrabajador = "vistaTrabajador/trabajadorEditar.jsp";
    trabajador h = new trabajador();
    daoTrabajador daoTra = new daoTrabajadorImp();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet trabajadorControl</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet trabajadorControl at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acceso = "";
        String action = request.getParameter("accion");
        if (action.equalsIgnoreCase("trabajadorListar")) {
            acceso = listarTrabajador;
        } else if (action.equalsIgnoreCase("trabajadorAgregar")) {
            acceso = agregarTrabajador;
        } else if (action.equalsIgnoreCase("Registrar Trabajador")) {
            int idPul=Integer.parseInt(request.getParameter("idPul"));
            int idCon=Integer.parseInt(request.getParameter("idCon"));
            int idHor=Integer.parseInt(request.getParameter("idHor"));
            int idEst=Integer.parseInt(request.getParameter("idEst"));
            String dni = request.getParameter("dni");
            String nom = request.getParameter("nom");
            String apePat = request.getParameter("apePat");
            String apeMat = request.getParameter("apeMat");
            String fecNac = request.getParameter("fecNac");
            String tel = request.getParameter("tel");
            String cor = request.getParameter("cor");
            String dir = request.getParameter("dir");
            
            h.setIdPuestoLaboral(idPul);
            h.setIdContrato(idCon);
            h.setIdHorario(idHor);
            h.setIdEstado(idEst);
            h.setDni(dni);
            h.setNombres(nom);
            h.setApePat(apePat);
            h.setApeMat(apeMat);
            h.setFecNac(fecNac);
            h.setTelefono(tel);
            h.setCorreo(cor);
            h.setDireccion(dir);
            try {
                daoTra.Registrar(h);

            } catch (Exception ex) {
                Logger.getLogger(horarioControl.class.getName()).log(Level.SEVERE, null, ex);
            }
            acceso = listarTrabajador;
        }
        else if(action.equalsIgnoreCase("trabajadorEditar")){
            request.setAttribute("idPul", request.getParameter("id"));
            acceso=editarTrabajador;
        }
        else if(action.equalsIgnoreCase("Actualizar Trabajador")){
            int idTra=Integer.parseInt(request.getParameter("idTra"));
            int idPul=Integer.parseInt(request.getParameter("idPul"));
            int idCon=Integer.parseInt(request.getParameter("idCon"));
            int idHor=Integer.parseInt(request.getParameter("idHor"));
            int idEst=Integer.parseInt(request.getParameter("idEst"));
            String dni = request.getParameter("dni");
            String nom = request.getParameter("nom");
            String apePat = request.getParameter("apePat");
            String apeMat = request.getParameter("apeMat");
            String fecNac = request.getParameter("fecNac");
            String tel = request.getParameter("tel");
            String cor = request.getParameter("cor");
            String dir = request.getParameter("dir");
            
            h.setIdTrabajador(idTra);
            h.setIdPuestoLaboral(idPul);
            h.setIdContrato(idCon);
            h.setIdHorario(idHor);
            h.setIdEstado(idEst);
            h.setDni(dni);
            h.setNombres(nom);
            h.setApePat(apePat);
            h.setApeMat(apeMat);
            h.setFecNac(fecNac);
            h.setTelefono(tel);
            h.setCorreo(cor);
            h.setDireccion(dir);
            try {
                daoTra.actualizar(h);
            } catch (Exception ex) {
                Logger.getLogger(horarioControl.class.getName()).log(Level.SEVERE, null, ex);
            }
            acceso=listarTrabajador;
        }
        else if(action.equalsIgnoreCase("trabajadorEliminar")){
        int id=Integer.parseInt(request.getParameter("id"));
        h.setIdPuestoLaboral(id);
            try {
                daoTra.eliminar(id);
            } catch (Exception ex) {
                Logger.getLogger(horarioControl.class.getName()).log(Level.SEVERE, null, ex);
            }
        acceso=listarTrabajador;
        }

        RequestDispatcher vista = request.getRequestDispatcher(acceso);
        vista.forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
