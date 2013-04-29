package implementaciones;

import entidades.Accion;
import interfaces.IEstadisticas;
import lombok.Getter;
import lombok.Setter;

public class OperacionesInstancia implements IEstadisticas {
    
    @Getter 
    @Setter
    private Accion[] valoresInstancia;
    
    public OperacionesInstancia(int cant) {
        this.valoresInstancia = new Accion[cant];
    }

    public OperacionesInstancia() {
        
    }
    
    public void asignaValoresInstancia(){
        for (int i = 0; i < this.valoresInstancia.length; i++) {
            this.valoresInstancia[i]=new Accion(Math.random(),"Accion:"+i);
        }
    }
    
    public double valorMinimo() {
        double menorValor = this.valoresInstancia[0].getValorAccion();
        for (int i = 0; i < this.valoresInstancia.length; i++) {
            if(menorValor>this.valoresInstancia[i].getValorAccion())
                menorValor = this.valoresInstancia[i].getValorAccion();
        }
        return menorValor;
    }

}
