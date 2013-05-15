package servicios;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import objetos.Film;

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
            pstAgregaFilm.execute(sql);
            result = true;
            pstAgregaFilm.close();
            return result; 
        } catch (SQLException ex) {
            Logger.getLogger(ServicioJDBCFilms.class.getName()).log(Level.SEVERE, null, ex);
            return result;
        }
    }
    
    private Film getFirstFilm(){
         Film oFilm=new Film(); 
         try {
            String sqlSeleccionaFilm = 
            String.format("SELECT IDFILM,NOMBREFILM,DIRECTORFILM FROM APP.FILMS ");
            Statement stSeleccionaFilm = super.getConn().createStatement();
            ResultSet rsFilm = stSeleccionaFilm.executeQuery(sqlSeleccionaFilm);
            if(rsFilm.next()){   
                oFilm.setId(rsFilm.getLong("IDFILM"));
                oFilm.setName(rsFilm.getString("NOMBREFILM"));
                oFilm.setAutor(rsFilm.getString("DIRECTORFILM"));
            }
            rsFilm.close();
            stSeleccionaFilm.close();
        } catch (SQLException ex) {
            Logger.getLogger(ServicioJDBCFilms.class.getName()).log(Level.SEVERE, null, ex);
        }
         return oFilm;
    }
    
    public Film getFilmByID(int idFilm){
        Film oFilm=new Film();
        try {
            String sqlSeleccionaFilmPorID = 
                   String.format("SELECT IDFILM,NOMBREFILM,DIRECTORFILM FROM APP.FILMS "
                               + " WHERE IDFILM = %d ", 
                                       idFilm);
            Statement stSeleccionaFilmPorID = super.getConn().createStatement();
            ResultSet rsFilm = stSeleccionaFilmPorID.executeQuery(sqlSeleccionaFilmPorID);
            if(rsFilm.next()){   
                oFilm.setId(rsFilm.getLong("IDFILM"));
                oFilm.setName(rsFilm.getString("NOMBREFILM"));
                oFilm.setAutor(rsFilm.getString("DIRECTORFILM"));
            }
            rsFilm.close();
            stSeleccionaFilmPorID.close();
        } catch (SQLException ex) {
            Logger.getLogger(ServicioJDBCFilms.class.getName()).log(Level.SEVERE, null, ex);
        }
        return oFilm;
    }
    
    public boolean deleteFilmByID(int idFilm){
        boolean result = false;
        try {    
            String sqlBorrarFilmPorID = 
                       String.format("DELETE FROM APP.FILMS "
                                   + " WHERE IDFILM = %d ", 
                                           idFilm);
            Statement pstDeleteFilm =  super.getConn().createStatement();
                pstDeleteFilm.execute(sqlBorrarFilmPorID);
                result = true;
                pstDeleteFilm.close();
        } catch (SQLException ex) {
            Logger.getLogger(ServicioJDBCFilms.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    public List<Film> getAllFilms(){
        List<Film> films = new ArrayList<Film>();
        try { 
            String sqlSeleccionaFilms = 
                       String.format("SELECT IDFILM,NOMBREFILM,DIRECTORFILM FROM APP.FILMS ");
                Statement stSeleccionaFilms = super.getConn().createStatement();
                ResultSet rsFilms = stSeleccionaFilms.executeQuery(sqlSeleccionaFilms);
                while(rsFilms.next()){  
                    Film oFilm = new Film();
                    oFilm.setId(rsFilms.getLong("IDFILM"));
                    oFilm.setName(rsFilms.getString("NOMBREFILM"));
                    oFilm.setAutor(rsFilms.getString("DIRECTORFILM"));
                    films.add(oFilm);
                    oFilm=null;
                }
                rsFilms.close();
                stSeleccionaFilms.close();
        } catch (SQLException ex) {
            Logger.getLogger(ServicioJDBCFilms.class.getName()).log(Level.SEVERE, null, ex);
        }
        return films;
    }
    
    public void crearArhivoXML(String archivo){
        try {
            XMLOutputFactory outputFactory=XMLOutputFactory.newInstance();
             //Crear un XMLEventWriter
            XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(
                     new FileOutputStream(archivo));
             
            XMLEventFactory eventFactory = XMLEventFactory.newInstance();
             
            XMLEvent fin = eventFactory.createDTD("\n");
            XMLEvent tab = eventFactory.createDTD("\t");
            StartDocument inicioDocumento = eventFactory.createStartDocument();
            eventWriter.add(inicioDocumento);
            StartElement elementoRoot = eventFactory.createStartElement("", "", "films");
            eventWriter.add(fin);
            eventWriter.add(elementoRoot);           
            eventWriter.add(fin);
                 
                 Film oFilm = getFirstFilm();   
                 StartElement elementoInicio = eventFactory.createStartElement("", "", "film");
                 eventWriter.add(tab);
                 eventWriter.add(elementoInicio);
                 eventWriter.add(fin); 
                 ServicioStaxParserEscribeXML.creaNodo(eventWriter,"name",oFilm.getName());
                 ServicioStaxParserEscribeXML.creaNodo(eventWriter,"autor",oFilm.getAutor());
                 eventWriter.add(tab);
                 eventWriter.add(eventFactory.createEndElement("", "","film"));           
                 eventWriter.add(fin);
             
             eventWriter.add(eventFactory.createEndElement("", "","films"));
             eventWriter.add(fin);
             eventWriter.add(eventFactory.createEndDocument());
             eventWriter.close();
        } catch (XMLStreamException ex) {
            Logger.getLogger(ServicioJDBCFilms.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ServicioJDBCFilms.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
}
