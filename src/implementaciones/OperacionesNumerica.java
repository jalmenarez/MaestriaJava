package implementaciones;

import interfaces.IEstadisticas;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author jalmenarez
 */
public class OperacionesNumerica implements IEstadisticas {
    
    @Getter 
    @Setter 
    private double[] valoresNumericos;

    public OperacionesNumerica(int cant) {
        this.valoresNumericos = new double[cant];
    }
    
    /**
     * Constructor por default.
     */
    public OperacionesNumerica() {
        
    }
    
    public void asignaValoresDouble(){
        for(int i=0;i<this.valoresNumericos.length;i++){
            this.valoresNumericos[i]=Math.random();
        }
    }
    
    /**
     * Funcion que calcula el valor minimo del vector de la clase.
     * @return El valor minimo.
     */
    public double valorMinimo() {
        double menorValor = this.valoresNumericos[0];
        for (int i = 0; i < this.valoresNumericos.length; i++) {
            if(menorValor>this.valoresNumericos[i])
                menorValor = this.valoresNumericos[i];
        }
        return menorValor;
    }

}
