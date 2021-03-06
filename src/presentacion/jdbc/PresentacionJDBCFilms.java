package presentacion.jdbc;

import java.util.List;
import objetos.Film;
import servicios.ServicioJDBCFilms;

public class PresentacionJDBCFilms {
    
    public static void main(String[] args){
        ServicioJDBCFilms oSerJDBC=new ServicioJDBCFilms();
        //Conecta a la base de datos
        oSerJDBC.conectaBD();
        if(args.length == 3) {
            if(oSerJDBC.agregarNuevoFilm(Integer.parseInt(args[0]), args[1], args[2])){
                System.out.println("Se agregó el registro!");
            }else{
                System.out.println("No se agregó el registro!");   
            }
        }
        Film oFilm = oSerJDBC.getFilmByID(3);
        System.out.println("Film 3: "+oFilm.toString());
        oFilm=null;
        System.out.println("[All Films]");
        List<Film> films = oSerJDBC.getAllFilms();
        if(!films.isEmpty()){           
             for (int i = 0; i < films.size(); i++) {   
              System.out.println("Film "+i+": "+films.get(i).toString());  
            }
        }
        films=null;
        //Desconecta de la bade de datos
        oSerJDBC.desconectaBD();
        oSerJDBC=null;
    }
            

}
