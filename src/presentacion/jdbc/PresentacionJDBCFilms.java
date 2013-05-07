package presentacion.jdbc;

import servicios.ServicioJDBCFilms;

public class PresentacionJDBCFilms {
    
    public static void main(String[] args){
        ServicioJDBCFilms oSerJDBC=new ServicioJDBCFilms();
        //Conecta a la base de datos
        oSerJDBC.conectaBD();
        if(oSerJDBC.agregarNuevoFilm(1, "La Odisea", "Prometeo")){
         System.out.println("Se agregó el registro!");
        }else{
         System.out.println("No se agregó el registro!");   
        }
        
        //Desconecta de la bade de datos
        oSerJDBC.desconectaBD();
    }
            

}
