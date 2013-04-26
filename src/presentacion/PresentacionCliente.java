/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package presentacion;

import objetos.Cliente;

/**
 *
 * @author java
 */
public class PresentacionCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cliente oC1 = new Cliente("23.684.031-K");
       oC1.setEdad(26);
       oC1.setEmail("jose.almenarez@gmail.com");
       oC1.setNacionalidad("colombiana");
       Cliente oC2 = new Cliente("23.684.032-K","Jose","Almenarez");
       oC2.setEdad(27);
       oC2.setEmail("jose@gmail.com");
       oC2.setNacionalidad("venezolana");
       System.out.println("Cliente 1: "+oC1.toString());
       System.out.println();
       System.out.println("Cliente 2: "+oC2.toString());
       System.out.println();
    }

}
