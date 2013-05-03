/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.streams;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author java
 */
public class PresentacionLeeMododatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(".\\archivos\\salidadatos.dat");
            DataInputStream dis = new DataInputStream(fis);
            int entero = dis.readInt();
            dis.close();
            fis.close();
            System.out.println(entero);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PresentacionLeeMododatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PresentacionLeeMododatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
