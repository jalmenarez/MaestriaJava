package presentacion;

import implementaciones.ServicioSMTP;
import implementaciones.ServicioSOAP;

/**
 *
 * @author jalmenarez
 */
public class PresentacionServicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instanciar Servicio SMTP
        ServicioSMTP oSerSMTP = new ServicioSMTP("ZEUS","192.168.12.45");
        System.out.println("El servidor SMTP es: "+oSerSMTP.getNombreServidorSMTP());
        if(oSerSMTP.conectarServidorSMTP("ZEUS")){
            System.out.println(oSerSMTP.enviarMensaje("Hacia el SMTP"));
        }
        System.out.println();
        //Instanciar ServicioSOAP
        ServicioSOAP oSerSOAP = new ServicioSOAP("BigBlue","40.120.13.100");
        System.out.println("El servidor SMTP es: "+oSerSOAP.getNombreServidorWS());
        if(oSerSOAP.conectarServidorWS("BigBlue")){
            System.out.println(oSerSOAP.enviarMensaje("Hacia el SMTP"));
        }
        System.out.println();
    }
}
