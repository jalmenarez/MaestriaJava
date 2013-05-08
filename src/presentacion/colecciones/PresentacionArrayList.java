package presentacion.colecciones;

import entidades.Accion;
import java.util.ArrayList;
import java.util.Iterator;

public class PresentacionArrayList {
    public static void main(String[] arg){
        ArrayList<Accion> listaDeAcciones=new ArrayList<Accion>();
        listaDeAcciones.add(new Accion(5,"a1"));
        listaDeAcciones.add(new Accion(6,"a2"));
        listaDeAcciones.add(new Accion(7,"a3"));
        for( Accion oA : listaDeAcciones){
            System.out.println(oA.getNombreAccion()+" --- "+oA.getValorAccion());
        }
        System.out.println(" ");
        Iterator<Accion> itListaAcciones = listaDeAcciones.iterator();
        while(itListaAcciones.hasNext()){
            Accion oA = itListaAcciones.next();
            System.out.println(oA.getNombreAccion()+" --- "+oA.getValorAccion());
        }
    }
}
