package util;

public class utilEmpresa {
    private int idPuestoLaboral;
    private int idArea;
    private String puestoLaboral, descripcion, area;

    public utilEmpresa() {
    }

    public utilEmpresa(int idPuestoLaboral, int idArea, String puestoLaboral, String descripcion, String area) {
        this.idPuestoLaboral = idPuestoLaboral;
        this.idArea = idArea;
        this.puestoLaboral = puestoLaboral;
        this.descripcion = descripcion;
        this.area = area;
    }

    public int getIdPuestoLaboral() {
        return idPuestoLaboral;
    }

    public void setIdPuestoLaboral(int idPuestoLaboral) {
        this.idPuestoLaboral = idPuestoLaboral;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public String getPuestoLaboral() {
        return puestoLaboral;
    }

    public void setPuestoLaboral(String puestoLaboral) {
        this.puestoLaboral = puestoLaboral;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    
}
