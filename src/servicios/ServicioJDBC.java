package servicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServicioJDBC {
    private Connection conn;

    public ServicioJDBC() {
        this.conn = null;
    }
    
    public Connection getConn() {
        return conn;
    }
    
    /**
     * Funcion para conectarse con la base de datos.
     * -Busca y carga el driver para Java DB. 
     * -Conecta con la base de datos.
     */
    public void conectaBD(){
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            String stringC = "jdbc:derby://localhost:1527/maestria";
            this.conn=DriverManager.getConnection(stringC, "root", "12345");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServicioJDBC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ServicioJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void desconectaBD(){
        try {
            this.conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ServicioJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
