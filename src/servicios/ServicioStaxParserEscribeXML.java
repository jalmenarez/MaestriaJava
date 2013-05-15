package servicios;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import objetos.Film;

public class ServicioStaxParserEscribeXML {
    private String archivoJuegos;
    private String archivoFilms;
    
    public void setArchivoJuegos(String archivoJuegos){
        this.archivoJuegos=archivoJuegos;
    }
    
    public void setArchivoFilms(String archivoFilms){
        this.archivoFilms=archivoFilms;
    }
    
    public void grabarArchivo(List<Film> films) throws XMLStreamException, FileNotFoundException{
        XMLOutputFactory outputFactory=XMLOutputFactory.newInstance();
        //Crear un XMLEventWriter
        XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(
                new FileOutputStream(archivoFilms));
        
        XMLEventFactory eventFactory = XMLEventFactory.newInstance();
        
        XMLEvent fin = eventFactory.createDTD("\n");
        XMLEvent tab = eventFactory.createDTD("\t");
        StartDocument inicioDocumento = eventFactory.createStartDocument();
        eventWriter.add(inicioDocumento);
        StartElement elementoRoot = eventFactory.createStartElement("", "", "films");
        eventWriter.add(fin);
        eventWriter.add(elementoRoot);
        eventWriter.add(fin);
        for(Film oFilm : films){
            StartElement elementoInicio = eventFactory.createStartElement("", "", "film");
            eventWriter.add(tab);
            eventWriter.add(elementoInicio);
            eventWriter.add(fin);
            creaNodo(eventWriter,"name",oFilm.getName());
            creaNodo(eventWriter,"autor",oFilm.getAutor());
            eventWriter.add(tab);
            eventWriter.add(eventFactory.createEndElement("", "","film"));           
            eventWriter.add(fin);
        }
        eventWriter.add(eventFactory.createEndElement("", "","films"));
        eventWriter.add(fin);
        eventWriter.add(eventFactory.createEndDocument());
        eventWriter.close();
    }
    
    public void grabarArchivo() throws XMLStreamException, FileNotFoundException{
        XMLOutputFactory outputFactory=XMLOutputFactory.newInstance();
        //Crear un XMLEventWriter
        XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(
                new FileOutputStream(archivoJuegos));
        
        XMLEventFactory eventFactory = XMLEventFactory.newInstance();
        
        XMLEvent fin = eventFactory.createDTD("\n");
        StartDocument inicioDocumento = eventFactory.createStartDocument();
        eventWriter.add(inicioDocumento);
        
        StartElement elementoInicio = eventFactory.createStartElement("", "", "juego");
        
        eventWriter.add(elementoInicio);
        eventWriter.add(fin);
        
        creaNodo(eventWriter,"nombre","Halo 4");
        creaNodo(eventWriter,"consola","XBox");
        creaNodo(eventWriter,"lanzamiento","Febrero 2012");
        
        eventWriter.add(eventFactory.createEndElement("", "","juego"));
        eventWriter.add(fin);
        eventWriter.add(eventFactory.createEndDocument());
        eventWriter.close();
    }
    
     static void creaNodo(XMLEventWriter eventWriter,String nombre,String valor) throws XMLStreamException{
        XMLEventFactory eventFactory = XMLEventFactory.newInstance();
        XMLEvent fin = eventFactory.createDTD("\n");
        XMLEvent tab = eventFactory.createDTD("\t");
        
        StartElement elementoInicio = eventFactory.createStartElement("", "", nombre);
        eventWriter.add(tab);
        eventWriter.add(tab);
        eventWriter.add(elementoInicio);
        
        Characters caracteres = eventFactory.createCharacters(valor);
        eventWriter.add(caracteres);
        
        EndElement elementoFinal = eventFactory.createEndElement("", "",nombre);
        eventWriter.add(elementoFinal);
        
        eventWriter.add(fin);
    }
    
    

}
