package presentacion.streams;

import entidades.Accion;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author Jose Almenarez
 */
public class PresentacionLeeDatosTokenizer {

    /**
     * Metodo main
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File inputFile = new File(".\\archivos","acciones.txt");
        FileReader in = new FileReader(inputFile);
        BufferedReader br = new BufferedReader(in);
        String s=null;
        String va=null;
        String na=null;
        while((s=br.readLine())!=null){
           StringTokenizer st = new StringTokenizer(s);
           while(st.hasMoreTokens()){
               va=st.nextToken();
               na=st.nextToken();
               Accion oA = new Accion(Double.parseDouble(va),na);
               System.out.println("Valor Accion: "+oA.getValorAccion() + "\nNombre Accion: " + oA.getNombreAccion()+"\n");
               oA = null;
               va = null;
               na = null;
           }
           st = null;
        }
    }
}
