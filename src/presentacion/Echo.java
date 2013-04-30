/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package presentacion;

/**
 *
 * @author JAVA
 */
public class Echo {

    public static void main(String[] args){
        System.out.println("Length: "+args.length);
        for ( int i = 0; i < args.length; i++) {
            try {
            System.out.print( "" + args[i]);
            } catch( ArrayIndexOutOfBoundsException e) {
                System.out.println("Error= "+e.toString());
            }
        }
        System.out.println();
    }

}
