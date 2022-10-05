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
import negocio.puestoLaboral;
import persistencia.daoPuestoLaboral;
import persistencia.daoPuestoLaboralImp;

/**
 *
 * @author usuario
 */
@WebServlet(name = "puestoLaboralControl", urlPatterns = {"/puestoLaboralControl"})
public class puestoLaboralControl extends HttpServlet {

    String listarPuestoLaboral = "vistaPuestoLaboral/puestoLaboralListar.jsp";
    String agregarPuestoLaboral = "vistaPuestoLaboral/puestoLaboralAgregar.jsp";
    String editarPuestoLaboral = "vistaPuestoLaboral/puestoLaboralEditar.jsp";

    puestoLaboral h = new puestoLaboral();
    daoPuestoLaboral daoAr = new daoPuestoLaboralImp();
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
            out.println("<title>Servlet puestoLaboralControl</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet puestoLaboralControl at " + request.getContextPath() + "</h1>");
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
        if (action.equalsIgnoreCase("puestoLaboralListar")) {
            acceso = listarPuestoLaboral;
        } else if (action.equalsIgnoreCase("puestoLaboralAgregar")) {
            acceso = agregarPuestoLaboral;
        } else if (action.equalsIgnoreCase("Registrar Cargo")) {
            int idAr=Integer.parseInt(request.getParameter("idAr"));
            String car = request.getParameter("car");
            String des = request.getParameter("des");
            h.setIdArea(idAr);
            h.setPuestoLaboral(car);
            h.setDescripcion(des);
            try {
                daoAr.Registrar(h);

            } catch (Exception ex) {
                Logger.getLogger(horarioControl.class.getName()).log(Level.SEVERE, null, ex);
            }
            acceso = listarPuestoLaboral;
        }
        else if(action.equalsIgnoreCase("puestoLaboralEditar")){
            request.setAttribute("idPul", request.getParameter("id"));
            acceso=editarPuestoLaboral;
        }
        else if(action.equalsIgnoreCase("Actualizar Cargo")){
            int idPul=Integer.parseInt(request.getParameter("idPul"));
            int idAr=Integer.parseInt(request.getParameter("idAr"));
            String car = request.getParameter("car");
            String des = request.getParameter("des");
            h.setIdPuestoLaboral(idPul);
            h.setIdArea(idAr);
            h.setPuestoLaboral(car);
            h.setDescripcion(des);
            try {
                daoAr.actualizar(h);
            } catch (Exception ex) {
                Logger.getLogger(horarioControl.class.getName()).log(Level.SEVERE, null, ex);
            }
            acceso=listarPuestoLaboral;
        }
        else if(action.equalsIgnoreCase("puestoLaboralEliminar")){
        int id=Integer.parseInt(request.getParameter("id"));
        h.setIdPuestoLaboral(id);
            try {
                daoAr.eliminar(id);
            } catch (Exception ex) {
                Logger.getLogger(horarioControl.class.getName()).log(Level.SEVERE, null, ex);
            }
        acceso=listarPuestoLaboral;
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
