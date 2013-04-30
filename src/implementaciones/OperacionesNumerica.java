package implementaciones;

import excepciones.ExcepcionLargoMinimoArray;
import excepciones.ExcepcionValorMinimo;
import interfaces.IEstadisticas;
import lombok.Getter;

/**
 * 
 * @author jalmenarez
 */
public class OperacionesNumerica implements IEstadisticas {
    
    @Getter  
    private double[] valoresNumericos;

    public OperacionesNumerica(int cant) {
        this.valoresNumericos = new double[cant];
    }
    
    /**
     * Constructor por default.
     */
    public OperacionesNumerica() {
        
    }

    public void setValoresNumericos(double[] valoresNumericos) throws ExcepcionLargoMinimoArray {
        if (valoresNumericos.length<5)
            throw new ExcepcionLargoMinimoArray("double");
        
        this.valoresNumericos = valoresNumericos;
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
    public double valorMinimo() throws ExcepcionValorMinimo {
        double menorValor = this.valoresNumericos[0];     
        for (int i = 0; i < this.valoresNumericos.length; i++) {
            if(menorValor>this.valoresNumericos[i])
                menorValor = this.valoresNumericos[i];
        }
        
        if(menorValor<0.5)
            throw new ExcepcionValorMinimo("0.5");
        
        return menorValor;
    }

}
