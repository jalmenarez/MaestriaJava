
package presentacion;

import implementaciones.OperacionNumerica;

/**
 *
 * @author jalmenarez
 */
public class PresentacionOperacionesNumerica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] arregloDobles = new double[10];
        OperacionNumerica oOperNumerica = new OperacionNumerica();
        
        oOperNumerica.setValoresNumericos(arregloDobles);
        oOperNumerica.asignaValoresDouble();
        
        System.out.println("El valor minimo encontrado en el array de double es: "+ oOperNumerica.valorMinimo());
    }
}
