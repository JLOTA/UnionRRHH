package negocio;
public class puestoLaboral {
    private int idPuestoLaboral;
    private area area;
    private String puestoLaboral, descripcion;

    public puestoLaboral() {
    }

    public puestoLaboral(int idPuestoLaboral, area area, String puestoLaboral, String descripcion) {
        this.idPuestoLaboral = idPuestoLaboral;
        this.area = area;
        this.puestoLaboral = puestoLaboral;
        this.descripcion = descripcion;
    }

    public int getIdPuestoLaboral() {
        return idPuestoLaboral;
    }

    public void setIdPuestoLaboral(int idPuestoLaboral) {
        this.idPuestoLaboral = idPuestoLaboral;
    }

    public area getArea() {
        return area;
    }

    public void setArea(area area) {
        this.area = area;
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

    }
