/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.streams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author java
 */
public class PresentacionEscribeFicheroModoTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream(".\\archivos\\salidatexto.txt");
            PrintWriter pw = new PrintWriter(fos);
            pw.println("Imprimimos una cadena y un entero: "+5);
            pw.flush();
            pw.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PresentacionEscribeFicheroModoTexto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PresentacionEscribeFicheroModoTexto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            
        }
    }
}
