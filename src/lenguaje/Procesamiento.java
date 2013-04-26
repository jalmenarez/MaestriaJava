/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lenguaje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author JAVA
 */
public class Procesamiento {

    /**
     * @param args the command line arguments
     */
    //{System.out.println("Hola");}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Texto a procesar: ");
        String input = sc.next();        
        /*String a = "\"";
        System.out.println(a);*/
        StringBuffer tempStringBuffer = new StringBuffer(input);
        List<String> vowels = new ArrayList<String>(Arrays.asList("a","e","i","o","u"));
        for (int i = 0; i < tempStringBuffer.length(); i++) {
            if(vowels.contains(String.valueOf(tempStringBuffer.charAt(i)).toLowerCase()))
                tempStringBuffer.setCharAt(i,'X');
        }
        System.out.println(tempStringBuffer);
    }

}
