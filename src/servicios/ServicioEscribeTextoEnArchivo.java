package servicios;

import excepciones.FileNameEmptyException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
//import java.util.logging.Level;
//import java.util.logging.Logger;

public class ServicioEscribeTextoEnArchivo {
    
    private String nombreArchivo;
    
    public ServicioEscribeTextoEnArchivo(){
        
    }
    
    public ServicioEscribeTextoEnArchivo(String nombreArchivo){
        this.nombreArchivo = nombreArchivo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }
    
    public boolean escribirTexto(String texto) {
        boolean sw;
        FileOutputStream fos;
        PrintWriter pw;
        try {
        
        if(this.nombreArchivo.length()==0)
            throw new FileNameEmptyException();
        
        fos = new FileOutputStream(".\\archivos\\"+this.nombreArchivo);
        pw = new PrintWriter(fos);
        pw.println(texto);
        pw.flush();
        pw.close();
        fos.close();
        sw = true;
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(ServicioEscribeTextoEnArchivo.class.getName()).log(Level.SEVERE, null, ex);
            sw = false;
        } catch (IOException ex) {
            //Logger.getLogger(ServicioEscribeTextoEnArchivo.class.getName()).log(Level.SEVERE, null, ex);
            sw = false;
        } catch (FileNameEmptyException ex) {
            //Logger.getLogger(ServicioEscribeTextoEnArchivo.class.getName()).log(Level.SEVERE, null, ex);
            sw = false;
        }
        return sw;
    }
    
}
