package excepciones;

public class ExcepcionLargoMinimoArray extends Exception {
    public ExcepcionLargoMinimoArray(String nombreClase){
        super("El array de tipo "+nombreClase+" no debe ser menor a 5 elementos de largo.");
    }
}
