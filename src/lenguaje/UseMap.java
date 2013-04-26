/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lenguaje;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author JAVA
 */
public class UseMap {
   
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Map catalog;
         catalog = new TreeMap();
         catalog.put("CS101", "Intro Java Programming");
         catalog.put("CS301", "Database Design");
         catalog.put("CS413", "Software");

         if(catalog.containsKey("CS101")){
             System.out.println("We teach Java this semester");
         }else {
             System.out.println("No Java courses this semester");
         }
    }

}
