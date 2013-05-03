/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.streams;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author java
 */
public class PresentacionEscribeModoDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileOutputStream fos;
            fos = new FileOutputStream(".\\archivos\\salidadatos.dat");
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeInt(5);
            dos.flush();
            dos.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PresentacionEscribeModoDatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PresentacionEscribeModoDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
