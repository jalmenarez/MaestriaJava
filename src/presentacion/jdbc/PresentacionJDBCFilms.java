package presentacion.jdbc;

import objetos.Film;
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
        Film oFilm = oSerJDBC.getFilmByID(1);
        System.out.println("Film: "+oFilm.toString());     
        //Desconecta de la bade de datos
        oSerJDBC.desconectaBD();
    }
            

}
