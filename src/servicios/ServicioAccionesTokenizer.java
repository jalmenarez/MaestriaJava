package servicios;

import entidades.Accion;
import excepciones.ExcepcionLargoMinimoArray;
import excepciones.ExcepcionValorMinimo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import implementaciones.OperacionesInstancia;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServicioAccionesTokenizer {
    private String nombreArchivo;
    private int numeroAcciones;
    private Accion[] arrayAcciones;
    
    public ServicioAccionesTokenizer(){
        this(null,0);
    }
    
    public ServicioAccionesTokenizer(String nombreArchivo,int numeroAcciones){
        this.nombreArchivo=nombreArchivo;
        this.numeroAcciones=numeroAcciones;
    }

    public String getNombreArchivo() {
        return this.nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public int getNumeroAcciones() {
        return this.numeroAcciones;
    }

    public void setNumeroAcciones(int numeroAcciones) {
        this.numeroAcciones = numeroAcciones;
    }
    
    public boolean creaArrayAcciones(){
        boolean result=false;
        try {
        File inputFile = new File(".\\archivos",this.getNombreArchivo());        
        FileReader in = new FileReader(inputFile);
        BufferedReader br = new BufferedReader(in);
        String s=null;
        String va=null;
        String na=null;
        int contador = 0;
        this.arrayAcciones = new Accion[this.numeroAcciones];
        while((s=br.readLine()) != null  && contador<this.numeroAcciones){
           StringTokenizer st = new StringTokenizer(s);
           while(st.hasMoreTokens()){
               va=st.nextToken();
               na=st.nextToken();
               Accion oA = new Accion(Double.parseDouble(va),na);
               this.arrayAcciones[contador]=oA;
               oA = null;
               va = null;
               na = null;
           }
           st = null;
           contador++;
        }
        result = true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ServicioAccionesTokenizer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ServicioAccionesTokenizer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    public double calcularValorMinimo() {
        double result = -1;
        try{
        OperacionesInstancia oOI = new OperacionesInstancia(this.numeroAcciones);
        oOI.setValoresInstancia(this.arrayAcciones);
        result = oOI.valorMinimo();
        }catch(ExcepcionLargoMinimoArray elma){
          Logger.getLogger(ServicioAccionesTokenizer.class.getName()).log(Level.SEVERE, null, elma); 
        }catch(ExcepcionValorMinimo evm){
          Logger.getLogger(ServicioAccionesTokenizer.class.getName()).log(Level.SEVERE, null, evm);   
        }
        return result;
    }
}
