package presentacion;

import entidades.Accion;
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
        
        oOperInstancia.setValoresInstancia(arregloAcciones);
        oOperInstancia.asignaValoresInstancia();
     
        System.out.println("El valor minimo encontrado en el array de double es: "+ oOperInstancia.valorMinimo());
    }
}
