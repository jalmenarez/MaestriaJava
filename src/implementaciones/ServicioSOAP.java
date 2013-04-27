package implementaciones;

import interfaces.IOperaciones;
import lombok.Data;

@Data
public class ServicioSOAP implements IOperaciones {
    private String nombreServidorWS;
    private String ipServidorWS;

    public ServicioSOAP(String nombreServidorWS, String ipServidorWS) {
        this.nombreServidorWS = nombreServidorWS;
        this.ipServidorWS = ipServidorWS;
    }

    public String enviarMensaje(String mensaje) {
        return "Mensaje enviado desde el servicio SOAP " + this.nombreServidorWS;
    }

    public boolean conectarServidorWS(String serverName) {
        return serverName.equals("BigBlue");
    }
    
}
