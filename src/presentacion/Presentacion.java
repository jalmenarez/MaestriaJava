/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package presentacion;

import servicios.Validacion;
import java.util.logging.Level;
import java.util.logging.Logger;
import objetos.Usuario;

/**
 *
 * @author java
 */
public class Presentacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario oU = new Usuario("Jalmenarez","123456");
        if(Validacion.isValidUser(oU)){
           System.out.println("El usuario "+oU.getUsuario()+" es un usuario valido!");
        }else {
           System.out.println("Ha ingresado un usuario invalido!");
        }
        oU = null;
        System.gc();
    }

    int getInt() throws Exception{
        throw new Exception("No se ha implementado");
    }

}
