package excepciones;

public class ExcepcionLargoMinimoArray extends Exception {
    public ExcepcionLargoMinimoArray(String nombreClase){
        super("El array de "+nombreClase+" no debe ser menor a 5 elementos de largo.");
    }
}
