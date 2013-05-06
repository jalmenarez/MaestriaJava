package entidades;

public class Accion {
    private double valorAccion;
    private String nombreAccion;
    
    /**
     * Constructor por default.
     */
    public Accion(){
        
    }
    
    /**
     * El Constructor con dos parametros.
     * @param valorAccion
     * @param nombreAccion 
     */
    public Accion(double valorAccion, String nombreAccion) {
        this.valorAccion = valorAccion;
        this.nombreAccion = nombreAccion;
    }

    public double getValorAccion() {
        return this.valorAccion;
    }

    public String getNombreAccion() {
        return this.nombreAccion;
    }
    
}
