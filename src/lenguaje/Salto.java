/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lenguaje;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JAVA
 */
public class Salto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=0;
        String nombre[] = {"Ana","Belen","Juan"};
        String nombre_buscado = "Juan";
        boolean encontrado = false;
        while(i<nombre.length){
            if(nombre[i].equals(nombre_buscado)){
                System.out.println(nombre_buscado + " está en la posición "+(i+1));
                encontrado = true;
                break;
            }
            i++;
        }
        if(!encontrado){
            System.out.println("No encontrado");
        }
        
    }

}
