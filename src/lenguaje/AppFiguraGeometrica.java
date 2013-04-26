/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lenguaje;

/**
 *
 * @author JAVA
 */
public class AppFiguraGeometrica {

     public static void main(String[] args){
        FiguraGeometrica oFG = new FiguraGeometrica();
        oFG.setRadio(3.2);
        oFG.calcularArea();
        //boolean sw = true == true;
        //System.out.println(sw);
        /*char ch1 = 'X';
        System.out.print(ch1+" --> ");
        System.out.println((int) ch1);*/
        System.out.println("El área es: " + oFG.getArea());
    }

}
