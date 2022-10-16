package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import negocio.*;
import persistencia.*;

@WebServlet(name = "validar", urlPatterns = {"/validar"})
public class validar extends HttpServlet {

    daoAdministrador admDao = new daoAdministradorImp();
    administrador adm = new administrador();
    
    daoTrabajador traDao = new daoTrabajadorImp();
    trabajador tra = new trabajador();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet validar</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet validar at " + request.getContextPath() + "</h1>");
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
        String acc = request.getParameter("acc");
        if (acc.equalsIgnoreCase("Ingresar")) {
            String usu = request.getParameter("usu");
            String pas = request.getParameter("pas");
            try {
                adm = admDao.validar(usu, pas);
                if (adm.getUsuario() != null) {
                    tra = traDao.leer(adm.getTra().getIdTrabajador());
                    request.setAttribute("administrador", adm);
                    request.setAttribute("trabajador", tra);
                    request.getRequestDispatcher("control?menu=inicio").forward(request, response);
                }
            } catch (Exception ex) {
                request.getRequestDispatcher("index.jsp").forward(request, response);
                Logger.getLogger(validar.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
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
