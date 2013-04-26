/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lenguaje;

import java.lang.String;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author JAVA
 */
public class ContandoVocales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = "SUMAtra";
        List<String> vowels = new ArrayList<String>();
        vowels.add("a");vowels.add("e");vowels.add("i");
        vowels.add("o");vowels.add("u");
        //How to create Collection
        int vowelCount = 0;
        for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);
            if(vowels.contains(String.valueOf(letter).toLowerCase()))
                vowelCount++;
        }
        System.out.println(name + ", tiene "+vowelCount + " vocales");
    }
 
}
    
