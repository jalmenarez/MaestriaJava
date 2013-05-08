/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.colecciones;

import entidades.Accion;
import java.util.Enumeration;
import java.util.Stack;

/**
 *
 * @author java
 */
public class PresentacionStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack<Accion> stAcciones=new Stack<Accion>();
        stAcciones.push(new Accion(20.1,"acc201"));
        stAcciones.push(new Accion(20.2,"acc202"));
        stAcciones.push(new Accion(20.3,"acc203"));
        Enumeration<Accion> enumAcciones=stAcciones.elements();
        while(enumAcciones.hasMoreElements()){
            Accion oA=enumAcciones.nextElement();
            System.out.println(oA.getNombreAccion()+"-----"+oA.getValorAccion());
        }
        System.out.println(" Elementos del stack: "+stAcciones.toString());
        System.out.println(" Elementos top: "+stAcciones.peek().toString());
        System.out.println(" Sacar un elementos del stack: "+stAcciones.pop().toString());
        System.out.println(" Elementos del stack despues del pop: "+stAcciones.toString());
    }
}
