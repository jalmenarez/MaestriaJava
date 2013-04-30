package excepciones;

public class ExcepcionLargoMinimoArray extends Exception {
    public ExcepcionLargoMinimoArray(String nombreClase,int cant){
        super("El array de tipo "+nombreClase+" no debe ser menor a "+cant+"elementos de largo.");
    }
}
