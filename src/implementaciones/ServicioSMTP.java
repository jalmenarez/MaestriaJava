/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package implementaciones;

import interfaces.IOperaciones;

/**
 *
 * @author java
 */

public class ServicioSMTP implements IOperaciones {
    
    private String nombreServidorSMTP;
    private String ipServidorSMTP;
    
    public ServicioSMTP(String nombreServidor,String ipServidor){
        this.nombreServidorSMTP=nombreServidor;
        this.ipServidorSMTP=ipServidor;
    }

    public String enviarMensaje(String mensaje) {
        return "Mensaje: " + mensaje + ", se ha enviado al servidor SMTP " + this.nombreServidorSMTP;
    }
    
    public boolean conectarServidorSMTP(String serverName){
        return serverName.equals("ZEUS");
    }

    public String getNombreServidorSMTP() {
        return this.nombreServidorSMTP;
    }
    
}
