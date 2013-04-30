package excepciones;

public class ExcepcionTimeOutServidor extends Exception {
    public ExcepcionTimeOutServidor(String nombreServidor){
        super("El servidor: "+nombreServidor+" no responde.");
    }
}
