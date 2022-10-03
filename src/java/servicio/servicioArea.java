package servicio;

import negocio.area;

public interface servicioArea {
    public area nuevaArea();
    public String grabarArea(String are, String des);
    public area buscarArea(String are);
    public String editarArea(String are, String des);
}
