package excepciones;

public class ExcepcionValorMinimo extends Exception {
    public ExcepcionValorMinimo(){
        super("El valor minimo no debe ser menor a 0.05");
    }
}
