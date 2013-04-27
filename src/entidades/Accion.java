package entidades;

import lombok.Data;

@Data
public class Accion {
    private double valorAccion;
    private String nombreAccion;

    public Accion(double valorAccion, String nombreAccion) {
        this.valorAccion = valorAccion;
        this.nombreAccion = nombreAccion;
    }
    
}
