package implementaciones;

import entidades.Accion;
import interfaces.IEstadisticas;
import lombok.Getter;
import lombok.Setter;

public class OperacionesInstancia implements IEstadisticas {
    
    @Getter 
    @Setter
    private Accion[] valoresInstancia;
    
    public void asignaValoresInstancia(){
        for (int i = 0; i < this.valoresInstancia.length; i++) {
            this.valoresInstancia[i]=new Accion(Math.random(),"Accion:"+i);
        }
    }
    
    public double valorMinimo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
