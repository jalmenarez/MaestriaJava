/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.xml;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.stream.XMLStreamException;
import objetos.Film;
import servicios.ServicioJDBCFilms;
import servicios.ServicioStaxParserEscribeXML;
/**
 *
 * @author java
 */
public class PresentacionEscribeArchivoXMLFromJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            ServicioJDBCFilms oSerJDBC=new ServicioJDBCFilms();
            //Conecta a la base de datos
            oSerJDBC.conectaBD();
            List<Film> films = oSerJDBC.getAllFilms();
            ServicioStaxParserEscribeXML oSerXML=new ServicioStaxParserEscribeXML();      
            oSerXML.setArchivoFilms(".\\archivos\\listaFilms.xml");
            oSerXML.grabarArchivo(films);
            oSerJDBC.crearArhivoXML(".\\archivos\\film01.xml");
            films=null;
            //Desconecta de la bade de datos
            oSerJDBC.desconectaBD();
            oSerJDBC=null;
        } catch (XMLStreamException ex) {
            Logger.getLogger(PresentacionEscribeArchivoXMLFromJDBC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PresentacionEscribeArchivoXMLFromJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
