package entidades;

import lombok.Data;

@Data
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
    
}
