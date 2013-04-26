/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package objetos;

/**
 *
 * @author JAVA
 */
public class Gerente extends Empleado {

    private double bono;

    public Gerente(){
        super();
        this.bono = 0;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }
    
}
