package presentacion.jdbc;

import servicios.ServicioJDBC;

public class PresentacionJDBCFilms {
    
    public static void main(String[] args){
        ServicioJDBC oSerJDBC=new ServicioJDBC();
        oSerJDBC.conectaBD();
    }
            

}
