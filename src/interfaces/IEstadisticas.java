package interfaces;

import excepciones.ExcepcionValorMinimo;

/**
 *
 * @author jalmenarez
 */
public interface IEstadisticas {
    
    public double valorMinimo() throws ExcepcionValorMinimo;
    
}
