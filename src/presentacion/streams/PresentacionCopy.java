/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author java
 */
public class PresentacionCopy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String relativePath = ".\\archivos\\";
        File inputFile = new File(relativePath+"farrago.txt");
        File outputFile = new File(relativePath+"outagain.txt");
        FileReader in = new FileReader(inputFile);
        FileWriter out = new FileWriter(outputFile);
        int c;
        while((c=in.read())!=-1)
            out.write(c);
        in.close();
        out.close();
    }
}
