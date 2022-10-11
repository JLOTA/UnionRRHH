package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import negocio.*;
import persistencia.*;
import util.utilEmpresa;

@WebServlet(name = "control", urlPatterns = {"/control"})
public class control extends HttpServlet {

    daoAdministrador admDao = new daoAdministradorImp();
    administrador adm = new administrador();

    daoTrabajador traDao = new daoTrabajadorImp();
    trabajador tra = new trabajador();

    daoArea areDao = new daoAreaImp();
    area a = new area();
    int idAr = 0;

    daoHorario horDao = new daoHorarioImp();
    horario h = new horario();
    int idHo = 0;
    
    daoPuestoLaboral pulDao = new daoPuestoLaboralImp();
    puestoLaboral pl = new puestoLaboral();
    int idPu = 0;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String menu = request.getParameter("menu");
        String acc = request.getParameter("acc");

        if (menu.equals("inicio")) {
            request.getRequestDispatcher("inicio.jsp").forward(request, response);
        }
        if (menu.equals("trabajador")) {
            switch (acc) {
                case "listar":
                    break;
                case "agregar":
                    break;
                case "editar":
                    break;
                case "eliminar":
                    break;
                default:
                    throw new AssertionError();
            }
            request.getRequestDispatcher("trabajador.jsp").forward(request, response);
        }
        if (menu.equals("area")) {
            switch (acc) {
                case "listar":
                    List<area> lista = areDao.listar();
                    request.setAttribute("areas", lista);
                    break;
                case "Agregar":
                    String are = request.getParameter("are");
                    String des = request.getParameter("des");
                    a.setArea(are);
                    a.setDescripcion(des);
                    areDao.Registrar(a);
                    request.getRequestDispatcher("control?menu=area&acc=listar").forward(request, response);
                    break;
                case "editar":
                    idAr = Integer.parseInt(request.getParameter("id"));
                    area aa = areDao.leer(idAr);
                    request.setAttribute("area", aa);
                    request.getRequestDispatcher("control?menu=area&acc=listar").forward(request, response);
                    break;
                case "Actualizar":
                    String ar = request.getParameter("are");
                    String de = request.getParameter("des");
                    a.setArea(ar);
                    a.setDescripcion(de);
                    a.setIdArea(idAr);
                    areDao.actualizar(a);
                    request.getRequestDispatcher("control?menu=area&acc=listar").forward(request, response);
                    break;
                case "eliminar":
                    idAr = Integer.parseInt(request.getParameter("id"));
                    areDao.eliminar(idAr);
                    request.getRequestDispatcher("control?menu=area&acc=listar").forward(request, response);
                    break;
                default:
                    throw new AssertionError();
            }
            request.getRequestDispatcher("area.jsp").forward(request, response);
        }
        if (menu.equals("puestoLaboral")) {
            switch (acc) {
                case "listar":
                    List<area> areas = areDao.listar();
                    request.setAttribute("areas", areas);
                    List<utilEmpresa> lista = pulDao.listarFull();
                    request.setAttribute("puestos", lista);
                    break;
                case "Agregar":
                    int idAre = Integer.parseInt(request.getParameter("idAre"));
                    String pue = request.getParameter("pue");
                    String des = request.getParameter("des");
                    pl.setIdArea(idAre);
                    pl.setPuestoLaboral(pue);
                    pl.setDescripcion(des);
                    pulDao.Registrar(pl);
                    request.getRequestDispatcher("control?menu=puestoLaboral&acc=listar").forward(request, response);
                    break;
                case "editar":
                    idPu = Integer.parseInt(request.getParameter("id"));
                    puestoLaboral pp = pulDao.leer(idPu);
                    request.setAttribute("puesto", pp);
                    request.getRequestDispatcher("control?menu=puestoLaboral&acc=listar").forward(request, response);
                    break;
                case "Actualizar":
                    int idAres = Integer.parseInt(request.getParameter("idAre"));
                    String pu = request.getParameter("pue");
                    String de = request.getParameter("des");
                    pl.setIdArea(idAres);
                    pl.setPuestoLaboral(pu);
                    pl.setDescripcion(de);
                    pl.setIdPuestoLaboral(idPu);
                    pulDao.actualizar(pl);
                    request.getRequestDispatcher("control?menu=puestoLaboral&acc=listar").forward(request, response);
                    break;
                case "eliminar":
                    idPu = Integer.parseInt(request.getParameter("id"));
                    pulDao.eliminar(idPu);
                    request.getRequestDispatcher("control?menu=puestoLaboral&acc=listar").forward(request, response);
                    break;
                default:
                    throw new AssertionError();
            }
            request.getRequestDispatcher("puestoLaboral.jsp").forward(request, response);
        }
        if (menu.equals("estado")) {
            switch (acc) {
                case "listar":
                    break;
                case "agregar":
                    break;
                case "editar":
                    break;
                case "eliminar":
                    break;
                default:
                    throw new AssertionError();
            }
            request.getRequestDispatcher("estado.jsp").forward(request, response);
        }
        if (menu.equals("horario")) {
            switch (acc) {
                case "listar":
                    List<horario> lista = horDao.listar();
                    request.setAttribute("horarios", lista);
                    break;
                case "Agregar":
                    String hor = request.getParameter("hor");
                    String horIni = request.getParameter("horIni");
                    String horFin = request.getParameter("horFin");
                    h.setHorario(hor);
                    h.setHoraInicio(horIni);
                    h.setHoraFin(horFin);
                    horDao.Registrar(h);
                    request.getRequestDispatcher("control?menu=horario&acc=listar").forward(request, response);
                    break;
                case "editar":
                    idHo = Integer.parseInt(request.getParameter("id"));
                    horario hh = horDao.leer(idHo);
                    request.setAttribute("horario", hh);
                    request.getRequestDispatcher("control?menu=horario&acc=listar").forward(request, response);
                    break;
                case "Actualizar":
                    String ho = request.getParameter("hor");
                    String hoIni = request.getParameter("horIni");
                    String hoFin = request.getParameter("horFin");
                    h.setHorario(ho);
                    h.setHoraInicio(hoIni);
                    h.setHoraFin(hoFin);
                    h.setIdHorario(idHo);
                    horDao.actualizar(h);
                    request.getRequestDispatcher("control?menu=horario&acc=listar").forward(request, response);
                    break;
                case "eliminar":
                    idHo = Integer.parseInt(request.getParameter("id"));
                    horDao.eliminar(idHo);
                    request.getRequestDispatcher("control?menu=horario&acc=listar").forward(request, response);
                    break;
                default:
                    throw new AssertionError();
            }
            request.getRequestDispatcher("horario.jsp").forward(request, response);
        }
        if (menu.equals("contrato")) {
            switch (acc) {
                case "listar":
                    break;
                case "agregar":
                    break;
                case "editar":
                    break;
                case "eliminar":
                    break;
                default:
                    throw new AssertionError();
            }
            request.getRequestDispatcher("contrato.jsp").forward(request, response);
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
