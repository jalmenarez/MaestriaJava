package servicios;

import excepciones.ExcepcionTimeOutServidor;

public class ServicioConexion {
    
    public ServicioConexion(){
        
    }
    
    public void conectarServidor(String nombreServer) throws ExcepcionTimeOutServidor {
        int conexionExitosa;
        conexionExitosa = 0;
        if(conexionExitosa==0){
            throw new ExcepcionTimeOutServidor("Zeus");
        }
    }

}
