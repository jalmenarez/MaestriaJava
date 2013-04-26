/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package servicios;

import objetos.Usuario;

/**
 *
 * @author java
 */
public class Validacion {

     private static Usuario u2 = new Usuario("jalmenarez","123456");
     public int i;

     Validacion(String username, String password) throws Exception{

     }

     Validacion() throws Exception {
        //throw new Exception("No se debe contruir un objeto vacio");
     }

     public static boolean isValidUser(Usuario u1){
        return u1.equals(u2);
     }

}
