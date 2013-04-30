package presentacion;

import excepciones.ExcepcionTimeOutServidor;
import servicios.ServicioConexion;

/**
 *
 * @author java
 */
public class PresentacionManejoExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioConexion oSC = new ServicioConexion();
        try {
        oSC.conectarServidor("Zeus");
        System.out.println("Conexion exitosa.");
        }catch(ExcepcionTimeOutServidor e){
            System.out.println(e.getMessage());
        }        
    }
}
