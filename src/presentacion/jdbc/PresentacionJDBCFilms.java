package presentacion.jdbc;

import servicios.ServicioJDBCFilms;

public class PresentacionJDBCFilms {
    
    public static void main(String[] args){
        ServicioJDBCFilms oSerJDBC=new ServicioJDBCFilms();
        //Conecta a la base de datos
        oSerJDBC.conectaBD();
        /*if(oSerJDBC.agregarNuevoFilm(2, "La Odisea 2", "Prometeo 2")){
         System.out.println("Se agregó el registro!");
        }else{
         System.out.println("No se agregó el registro!");   
        }*/
        String[] film = oSerJDBC.getFilmByID(1);
        System.out.println("Film: "+film[0]);
        System.out.println("Film Name: "+film[1]);
        System.out.println("Film Autor: "+film[2]);      
        //Desconecta de la bade de datos
        oSerJDBC.desconectaBD();
    }
            

}
