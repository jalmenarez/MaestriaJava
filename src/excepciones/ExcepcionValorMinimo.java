package excepciones;

public class ExcepcionValorMinimo extends Exception {
    public ExcepcionValorMinimo(String value){
        super("El valor minimo no debe ser menor a "+value);
    }
}
