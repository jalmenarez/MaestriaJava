package implementaciones;

import entidades.Accion;
import excepciones.ExcepcionLargoMinimoArray;
import excepciones.ExcepcionValorMinimo;
import interfaces.IEstadisticas;
import lombok.Getter;

public class OperacionesInstancia implements IEstadisticas {
    
    @Getter 
    private Accion[] valoresInstancia;
    
    public OperacionesInstancia(int cant) {
        this.valoresInstancia = new Accion[cant];
    }

    public OperacionesInstancia() {
        
    }

    public void setValoresInstancia(Accion[] valoresInstancia) throws ExcepcionLargoMinimoArray {
        if (valoresInstancia.length<5)
            throw new ExcepcionLargoMinimoArray("Accion",5);
        
        this.valoresInstancia = valoresInstancia;
    }
    
    public void asignaValoresInstancia(){
        for (int i = 0; i < this.valoresInstancia.length; i++) {
            this.valoresInstancia[i]=new Accion(Math.random(),"Accion:"+i);
        }
    }
    
    public double valorMinimo() throws ExcepcionValorMinimo {
        double menorValor = this.valoresInstancia[0].getValorAccion();
        for (int i = 0; i < this.valoresInstancia.length; i++) {
            if(menorValor>this.valoresInstancia[i].getValorAccion())
                menorValor = this.valoresInstancia[i].getValorAccion();
        }
        
        if(menorValor<0.5)
            throw new ExcepcionValorMinimo("0.5");
        
        return menorValor;
    }

}
