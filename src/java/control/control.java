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
import util.*;

@WebServlet(name = "control", urlPatterns = {"/control"})
public class control extends HttpServlet {

    daoAdministrador admDao = new daoAdministradorImp();
    administrador adm = new administrador();

    daoTrabajador traDao = new daoTrabajadorImp();
    trabajador t = new trabajador();
    int idTr = 0;

    daoArea areDao = new daoAreaImp();
    area a = new area();
    int idAr = 0;
    
    daoContrato conDao = new daoContratoImp();
    contrato c = new contrato();
    int idCo = 0;

    daoHorario horDao = new daoHorarioImp();
    horario h = new horario();
    int idHo = 0;
    
    daoEstado estDao = new daoEstadoImp();
    estado e = new estado();
    int idEs = 0;
    
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
                    List<puestoLaboral> puestos = pulDao.listar();
                    request.setAttribute("puestos", puestos);
                    List<horario> horarios = horDao.listar();
                    request.setAttribute("horarios", horarios);
                    List<contrato> contratos = conDao.listar();
                    request.setAttribute("contratos", contratos);
                    List<estado> estados = estDao.listar();
                    request.setAttribute("estados", estados);
                    List<utilTrabajador> lista = traDao.listarFull();
                    request.setAttribute("trabajadores", lista);
                    break;
                case "Agregar":
                    int idPue = Integer.parseInt(request.getParameter("idPue"));
                    int idCon = Integer.parseInt(request.getParameter("idCon"));
                    int idHor = Integer.parseInt(request.getParameter("idHor"));
                    //int idEst = Integer.parseInt(request.getParameter("idEst"));
                    
                    String dni = request.getParameter("dni");
                    String nom = request.getParameter("nom");
                    String apePat = request.getParameter("apePat");
                    String apeMat = request.getParameter("apeMat");
                    String fecNac = request.getParameter("fecNac");
                    String tel = request.getParameter("tel");
                    String cor = request.getParameter("cor");
                    String dir = request.getParameter("dir");
                    
                    t.setIdContrato(idCon);
                    t.setIdEstado(2);
                    t.setIdHorario(idHor);
                    t.setIdPuestoLaboral(idPue);
                    t.setDni(dni);
                    t.setNombres(nom);
                    t.setApePat(apePat);
                    t.setApeMat(apeMat);
                    t.setFecNac(fecNac);
                    t.setCorreo(cor);
                    t.setTelefono(tel);
                    t.setDireccion(dir);
                    traDao.Registrar(t);
                    request.getRequestDispatcher("control?menu=trabajador&acc=listar").forward(request, response);
                    break;
                case "editar":
                    idTr = Integer.parseInt(request.getParameter("id"));
                    trabajador tt = traDao.leer(idTr);
                    request.setAttribute("trabajador", tt);
                    request.getRequestDispatcher("control?menu=trabajador&acc=listar").forward(request, response);
                    break;
                case "Actualizar":
                    int iPue = Integer.parseInt(request.getParameter("idPue"));
                    int iCon = Integer.parseInt(request.getParameter("idCon"));
                    int iHor = Integer.parseInt(request.getParameter("idHor"));
                    //int iEst = Integer.parseInt(request.getParameter("idEst"));
                    
                    String dn = request.getParameter("dni");
                    String no = request.getParameter("nom");
                    String apPat = request.getParameter("apePat");
                    String apMat = request.getParameter("apeMat");
                    String feNac = request.getParameter("fecNac");
                    String te = request.getParameter("tel");
                    String co = request.getParameter("cor");
                    String di = request.getParameter("dir");
                    
                    t.setIdContrato(iCon);
                    t.setIdEstado(2);
                    t.setIdHorario(iHor);
                    t.setIdPuestoLaboral(iPue);
                    t.setDni(dn);
                    t.setNombres(no);
                    t.setApePat(apPat);
                    t.setApeMat(apMat);
                    t.setFecNac(feNac);
                    t.setCorreo(co);
                    t.setTelefono(te);
                    t.setDireccion(di);
                    t.setIdTrabajador(idTr);
                    traDao.actualizar(t);
                    request.getRequestDispatcher("control?menu=trabajador&acc=listar").forward(request, response);
                    break;
                case "eliminar":
                    idTr = Integer.parseInt(request.getParameter("id"));
                    traDao.eliminar(idTr);
                    request.getRequestDispatcher("control?menu=trabajador&acc=listar").forward(request, response);
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
                    List<tipoContrato> tipos = conDao.listarTipo();
                    request.setAttribute("tipos", tipos);
                    List<utilContrato> lista = conDao.listarFull();
                    request.setAttribute("contratos", lista);
                    break;
                case "Agregar":
                    int idTip = Integer.parseInt(request.getParameter("idTip"));
                    String des = request.getParameter("des");
                    String fecIni = request.getParameter("fecIni");
                    String fecFin = request.getParameter("fecFin");
                    c.setIdTipoContrato(idTip);
                    c.setDescripcion(des);
                    c.setFechaInicio(fecIni);
                    c.setFechaFin(fecFin);
                    conDao.Registrar(c);
                    request.getRequestDispatcher("control?menu=contrato&acc=listar").forward(request, response);
                    break;
                case "editar":
                    idCo = Integer.parseInt(request.getParameter("id"));
                    contrato cc = conDao.leer(idCo);
                    request.setAttribute("contrato", cc);
                    request.getRequestDispatcher("control?menu=contrato&acc=listar").forward(request, response);
                    break;
                case "Actualizar":
                    int iTip = Integer.parseInt(request.getParameter("idTip"));
                    String de = request.getParameter("des");
                    String feIni = request.getParameter("fecIni");
                    String feFin = request.getParameter("fecFin");
                    c.setIdTipoContrato(iTip);
                    c.setDescripcion(de);
                    c.setFechaInicio(feIni);
                    c.setFechaFin(feFin);
                    c.setIdContrato(idCo);
                    conDao.actualizar(c);
                    request.getRequestDispatcher("control?menu=contrato&acc=listar").forward(request, response);
                    break;
                case "eliminar":
                    idCo = Integer.parseInt(request.getParameter("id"));
                    conDao.eliminar(idCo);
                    request.getRequestDispatcher("control?menu=contrato&acc=listar").forward(request, response);
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
