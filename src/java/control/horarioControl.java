/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package control;

import com.sun.corba.se.spi.protocol.RequestDispatcherDefault;
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
import negocio.horario;
import persistencia.daoHorario;
import persistencia.daoHorarioImp;

/**
 *
 * @author usuario
 */
@WebServlet(name = "horarioControl", urlPatterns = {"/horarioControl"})
public class horarioControl extends HttpServlet {

    String listarHorario = "vistaHorario/horarioListar.jsp";
    String agregarHorario = "vistaHorario/horarioAgregar.jsp";
    String editarHorario = "vistaHorario/horarioEditar.jsp";

    horario h = new horario();
    daoHorario daoHo = new daoHorarioImp();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet horarioControl</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet horarioControl at " + request.getContextPath() + "</h1>");
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
        if (action.equalsIgnoreCase("horarioListar")) {
            acceso = listarHorario;
        } else if (action.equalsIgnoreCase("horarioAgregar")) {
            acceso = agregarHorario;
        } else if (action.equalsIgnoreCase("Registrar Horario")) {
            String hor = request.getParameter("ho");
            String horIni = request.getParameter("horIni");
            String horFin = request.getParameter("horFin");
            h.setHorario(hor);
            h.setHoraInicio(horIni);
            h.setHoraFin(horFin);
            try {
                daoHo.Registrar(h);

            } catch (Exception ex) {
                Logger.getLogger(horarioControl.class.getName()).log(Level.SEVERE, null, ex);
            }
            acceso = listarHorario;
        }
        else if(action.equalsIgnoreCase("horarioEditar")){
            request.setAttribute("idHor", request.getParameter("id"));
            acceso=editarHorario;
        }
        else if(action.equalsIgnoreCase("Actualizar Horario")){
            int id=Integer.parseInt(request.getParameter("idHor"));
            String hor=request.getParameter("ho");
            String horIni = request.getParameter("horIni");
            String horFin = request.getParameter("horFin");
            h.setIdHorario(id);
            h.setHorario(hor);
            h.setHoraInicio(horIni);
            h.setHoraFin(horFin);
            try {
                daoHo.actualizar(h);
            } catch (Exception ex) {
                Logger.getLogger(horarioControl.class.getName()).log(Level.SEVERE, null, ex);
            }
            acceso=listarHorario;
        }
        else if(action.equalsIgnoreCase("horarioEliminar")){
        int id=Integer.parseInt(request.getParameter("id"));
        h.setIdHorario(id);
            try {
                daoHo.eliminar(id);
            } catch (Exception ex) {
                Logger.getLogger(horarioControl.class.getName()).log(Level.SEVERE, null, ex);
            }
        acceso=listarHorario;
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
