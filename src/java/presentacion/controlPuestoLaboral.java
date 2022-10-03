package presentacion;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servicio.servicioPuestoLaboral;
import servicio.servicioPuestoLaboralImp;

@WebServlet(name = "controlPuestoLaboral", urlPatterns = {"/controlPuestoLaboral"})
public class controlPuestoLaboral extends HttpServlet {

    private servicioPuestoLaboral serPu;
    private modeloPuestoLaboral modPu;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acc = request.getParameter("acc");
        if (acc.equals("Puestos Laborales") || acc.equals("Nuevo")) {
            serPu = new servicioPuestoLaboralImp();
            modPu = new modeloPuestoLaboral(serPu.nuevoPuestoLaboral());
            request.getSession().setAttribute("modPu", modPu);
        }
        if (acc.equals("Grabar")) {
            int idAr = Integer.parseInt(request.getParameter("idAr"));
            int idHo = Integer.parseInt(request.getParameter("idHo"));
            String nom = request.getParameter("nom");
            String des = request.getParameter("des");
            String msg = serPu.grabarPuestoLaboral(idAr, idHo, nom, des);
            modPu.getMsg();
        }
        response.sendRedirect("vistaPuestoLaboral.jsp");
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
