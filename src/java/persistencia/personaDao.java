
package persistencia;

import java.util.List;
import negocio.persona;

public interface personaDao {
    public String grabarPersona(persona per);
    public String editarPersona(persona per);
    public persona buscarPersona(String dni);
}
