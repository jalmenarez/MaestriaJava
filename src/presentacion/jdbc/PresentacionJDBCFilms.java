package presentacion.jdbc;

import servicios.ServicioJDBC;

public class PresentacionJDBCFilms {
    
    public static void main(String[] args){
        ServicioJDBC oSerJDBC=new ServicioJDBC();
        //Conecta a la base de datos
        oSerJDBC.conectaBD();
        //Desconecta de la bade de datos
        oSerJDBC.desconectaBD();
    }
            

}
