/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lenguaje;

/**
 *
 * @author JAVA
 */
public class FiguraGeometrica {
    private double radio;
    private double area;

    public FiguraGeometrica(){
       this.area = 0;
       this.radio = 0;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void calcularArea(){
        this.area = Math.pow(radio, 2) * Math.PI;
    }

    public double getArea(){
        return this.area;
    }

}
