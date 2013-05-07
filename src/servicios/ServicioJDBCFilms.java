package servicios;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServicioJDBCFilms extends ServicioJDBC {

    public ServicioJDBCFilms() {
        super();
    }
    
    public boolean agregarNuevoFilm(int idFilm,String nombreFilm,String directorFilm){
        boolean result = false;
        try {
            String sql = String.format("INSERT INTO APP.FILMS VALUES(%d,'%s','%s')", 
                                       idFilm,nombreFilm,directorFilm);
            Statement pstAgregaFilm =  super.getConn().createStatement();
            result = pstAgregaFilm.execute(sql);          
            pstAgregaFilm.close();
            return result; 
        } catch (SQLException ex) {
            Logger.getLogger(ServicioJDBCFilms.class.getName()).log(Level.SEVERE, null, ex);
            return result;
        }
    }
    
}
