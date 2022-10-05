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
import negocio.estado;
import persistencia.daoEstado;
import persistencia.daoEstadoImp;

/**
 *
 * @author usuario
 */
@WebServlet(name = "estadoControl", urlPatterns = {"/estadoControl"})
public class estadoControl extends HttpServlet {

    String listarEstado = "vistaEstado/estadoListar.jsp";
    String agregarEstado = "vistaEstado/estadoAgregar.jsp";
    String editarEstado = "vistaEstado/estadoEditar.jsp";

    estado h = new estado();
    daoEstado daoAr = new daoEstadoImp();
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
            out.println("<title>Servlet estadoControl</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet estadoControl at " + request.getContextPath() + "</h1>");
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
        if (action.equalsIgnoreCase("estadoListar")) {
            acceso = listarEstado;
        } else if (action.equalsIgnoreCase("estadoAgregar")) {
            acceso = agregarEstado;
        } else if (action.equalsIgnoreCase("Registrar Estado")) {
            String ar = request.getParameter("ar");
            String des = request.getParameter("des");
            h.setEstado(ar);
            h.setDescripcion(des);
            try {
                daoAr.Registrar(h);

            } catch (Exception ex) {
                Logger.getLogger(horarioControl.class.getName()).log(Level.SEVERE, null, ex);
            }
            acceso = listarEstado;
        } else if (action.equalsIgnoreCase("estadoEditar")) {
            request.setAttribute("idAr", request.getParameter("id"));
            acceso = editarEstado;
        } else if (action.equalsIgnoreCase("Actualizar Estado")) {
            int id = Integer.parseInt(request.getParameter("idAr"));
            String ar = request.getParameter("ar");
            String des = request.getParameter("des");
            h.setIdEstado(id);
            h.setEstado(ar);
            h.setDescripcion(des);
            try {
                daoAr.actualizar(h);
            } catch (Exception ex) {
                Logger.getLogger(horarioControl.class.getName()).log(Level.SEVERE, null, ex);
            }
            acceso = listarEstado;
        } else if (action.equalsIgnoreCase("estadoEliminar")) {
            int id = Integer.parseInt(request.getParameter("id"));
            h.setIdEstado(id);
            try {
                daoAr.eliminar(id);
            } catch (Exception ex) {
                Logger.getLogger(horarioControl.class.getName()).log(Level.SEVERE, null, ex);
            }
            acceso = listarEstado;
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
