/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package presentacion;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servicio.servicioHorario;
import servicio.servicioHorarioImp;

/**
 *
 * @author usuario
 */
@WebServlet(name = "controlHorario", urlPatterns = {"/controlHorario"})
public class controlHorario extends HttpServlet {

    private servicioHorario serHo;
    private modeloHorario modHo;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acc = request.getParameter("acc");
        if (acc.equals("Horarios") || acc.equals("Nuevo")) {
            serHo = new servicioHorarioImp();
            modHo = new modeloHorario(serHo.nuevoHorario());
            request.getSession().setAttribute("modHo", modHo);
        }
        if (acc.equals("Grabar")) {
            String hor = request.getParameter("hor");
            String horIni = request.getParameter("horIni");
            String horFin = request.getParameter("horFin");
            String msg = serHo.grabarHorario(hor, horIni, horFin);
            modHo.getMsg();
        }
        response.sendRedirect("vistaHorario.jsp");
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
        processRequest(request, response);
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
