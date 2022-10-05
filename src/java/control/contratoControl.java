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
import negocio.contrato;
import persistencia.daoContrato;
import persistencia.daoContratoImp;

/**
 *
 * @author usuario
 */
@WebServlet(name = "contratoControl", urlPatterns = {"/contratoControl"})
public class contratoControl extends HttpServlet {

    String listarContrato = "vistaContrato/contratoListar.jsp";
    String agregarContrato = "vistaContrato/contratoAgregar.jsp";
    String editarContrato = "vistaContrato/contratoEditar.jsp";

    contrato h = new contrato();
    daoContrato daoAr = new daoContratoImp();
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
            out.println("<title>Servlet contratoControl</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet contratoControl at " + request.getContextPath() + "</h1>");
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
        if (action.equalsIgnoreCase("contratoListar")) {
            acceso = listarContrato;
        } else if (action.equalsIgnoreCase("contratoAgregar")) {
            acceso = agregarContrato;
        } else if (action.equalsIgnoreCase("Registrar Contrato")) {
            int idTi=Integer.parseInt(request.getParameter("idAr"));
            String des = request.getParameter("des");
            String fecIni = request.getParameter("fecIni");
            String fecFin = request.getParameter("fecFin");
            h.setIdTipoContrato(idTi);
            h.setDescripcion(des);
            h.setFechaInicio(fecIni);
            h.setFechaFin(fecFin);
            try {
                daoAr.Registrar(h);

            } catch (Exception ex) {
                Logger.getLogger(horarioControl.class.getName()).log(Level.SEVERE, null, ex);
            }
            acceso = listarContrato;
        }
        else if(action.equalsIgnoreCase("contratoEditar")){
            request.setAttribute("idPul", request.getParameter("id"));
            acceso=editarContrato;
        }
        else if(action.equalsIgnoreCase("Actualizar Contrato")){
            int id=Integer.parseInt(request.getParameter("idPul"));
            int idTi=Integer.parseInt(request.getParameter("idAr"));
            String des = request.getParameter("des");
            String fecIni = request.getParameter("fecIni");
            String fecFin = request.getParameter("fecFin");
            h.setIdContrato(id);
            h.setIdTipoContrato(idTi);
            h.setDescripcion(des);
            h.setFechaInicio(fecIni);
            h.setFechaFin(fecFin);
            try {
                daoAr.actualizar(h);
            } catch (Exception ex) {
                Logger.getLogger(horarioControl.class.getName()).log(Level.SEVERE, null, ex);
            }
            acceso=listarContrato;
        }
        else if(action.equalsIgnoreCase("contratoEliminar")){
        int id=Integer.parseInt(request.getParameter("id"));
        h.setIdContrato(id);
            try {
                daoAr.eliminar(id);
            } catch (Exception ex) {
                Logger.getLogger(horarioControl.class.getName()).log(Level.SEVERE, null, ex);
            }
        acceso=listarContrato;
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
