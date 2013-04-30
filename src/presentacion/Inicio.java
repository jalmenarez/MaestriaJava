/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package presentacion;

import objetos.Empleado;
import objetos.Gerente;

/**
 *
 * @author JAVA
 */
public class Inicio {

    public static void main(String[] args){

        Empleado oEmp = new Empleado();

        oEmp.setNombre("Julio");
        oEmp.setApellido("Perez");
        oEmp.setSalario(100);
        oEmp.setEdad(20);

        System.out.println("Empleado: "+oEmp.getNombre()+" "+oEmp.getApellido());
        System.out.println("Salario: "+oEmp.getSalario());
        
        oEmp.subirSalario(200);
        System.out.println("Nuevo salario: "+oEmp.getSalario());

        System.out.println();
        Gerente oGen = new Gerente();
        oGen.setNombre("Julio");
        oGen.setBono(100);
        System.out.println("Nombre: "+oGen.getNombre()+" - Bono: "+oGen.getBono());
    }

}
