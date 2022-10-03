/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;
import negocio.familiar;

public interface familiarDao {
    public String grabarFamiliar(familiar fam);
    public String editarFamiliar(familiar fam);
    public familiar buscarFamiliar(String dni);
}
