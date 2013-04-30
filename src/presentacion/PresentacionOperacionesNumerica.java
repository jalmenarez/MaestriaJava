
package presentacion;

import excepciones.ExcepcionLargoMinimoArray;
import excepciones.ExcepcionValorMinimo;
import implementaciones.OperacionesNumerica;

/**
 *
 * @author jalmenarez
 */
public class PresentacionOperacionesNumerica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] arregloDobles = new double[5];
        OperacionesNumerica oOperNumerica = new OperacionesNumerica();
        try {
        oOperNumerica.setValoresNumericos(arregloDobles);
        oOperNumerica.asignaValoresDouble();
        System.out.println("El valor minimo encontrado en el array de double es: "+ oOperNumerica.valorMinimo());
        }catch(ExcepcionLargoMinimoArray e){
        System.out.println(e.getMessage());
        } catch (ExcepcionValorMinimo e) {
        System.out.println(e.getMessage());
        }    
    }
}
