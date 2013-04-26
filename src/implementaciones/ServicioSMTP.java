/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package implementaciones;

import interfaces.IOperaciones;
import lombok.Data;

/**
 *
 * @author java
 */

@Data
public class ServicioSMTP implements IOperaciones {
    
    private String nombreServidorSMTP;
    private String ipServidorSMTP;
    
    public ServicioSMTP(String nombreServidor,String ipServidor){
        this.nombreServidorSMTP=nombreServidor;
        this.ipServidorSMTP=ipServidor;
    }

    public String enviarMensaje(String mensaje) {
        return "Mensaje enviado al servidor SMTP " + this.nombreServidorSMTP;
    }
    
}
