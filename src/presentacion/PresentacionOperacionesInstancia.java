package presentacion;

import entidades.Accion;
import excepciones.ExcepcionLargoMinimoArray;
import excepciones.ExcepcionValorMinimo;
import implementaciones.OperacionesInstancia;

/**
 *
 * @author java
 */
public class PresentacionOperacionesInstancia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Accion[] arregloAcciones = new Accion[10];
        OperacionesInstancia oOperInstancia = new OperacionesInstancia();
        try{
        oOperInstancia.setValoresInstancia(arregloAcciones);
        oOperInstancia.asignaValoresInstancia(); 
        System.out.println("El valor minimo encontrado en el array de double es: "+ oOperInstancia.valorMinimo());
        } catch (ExcepcionLargoMinimoArray ex) {
            System.out.println(ex.getMessage());
        } catch (ExcepcionValorMinimo ex) {
            System.out.println(ex.getMessage());
        }finally{
            System.out.println("Se ejecuta siempre!!!");
        }
    }
}
