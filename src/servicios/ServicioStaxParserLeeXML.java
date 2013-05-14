package servicios;

import entidades.Juego;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class ServicioStaxParserLeeXML {
    static final String JUEGO="juego";
    static final String LANZAMIENTO="lanzamiento";
    static final String NOMBRE="nombre";
    static final String CONSOLA="consola";
    
    public List<Juego> leeJuegos(String archivoJuegos){
        InputStream in = null;
        List<Juego> juegos = null;
        try {
            juegos=new ArrayList<Juego>();
            XMLInputFactory inputFactory=XMLInputFactory.newInstance();
            in = new FileInputStream(archivoJuegos);
            //Crear un eventReader
            XMLEventReader eventReader=inputFactory.createXMLEventReader(in);
            Juego oJuego = null;
            //Leer archivo XML
            while(eventReader.hasNext()){
                XMLEvent evento=eventReader.nextEvent();
                if(evento.isStartElement()){
                    StartElement elementoInicio=evento.asStartElement();
                    if(elementoInicio.getName().getLocalPart() == JUEGO){
                        oJuego=new Juego();
                        Iterator<Attribute> atributos=elementoInicio.getAttributes();
                        while(atributos.hasNext()){
                            Attribute atributo=atributos.next();
                            if(atributo.getName().getLocalPart().equals(LANZAMIENTO)){
                                oJuego.setLanzamiento(atributo.getValue());
                            }
                        }
                    }
                }
                if(evento.isStartElement()){
                    if(evento.asStartElement().getName().getLocalPart().equals(NOMBRE)){
                        evento=eventReader.nextEvent();
                        oJuego.setNombre(evento.asCharacters().getData());
                        continue;
                    }
                    if(evento.asStartElement().getName().getLocalPart().equals(CONSOLA)){
                        evento=eventReader.nextEvent();
                        oJuego.setConsola(evento.asCharacters().getData());
                        continue;
                    }
                }
                if(evento.isEndElement()){
                    EndElement elementoFinal = evento.asEndElement();
                    if(elementoFinal.getName().getLocalPart()==JUEGO){
                        juegos.add(oJuego);
                    }
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ServicioStaxParserLeeXML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (XMLStreamException ex) {
            Logger.getLogger(ServicioStaxParserLeeXML.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                in.close();
            } catch (IOException ex) {
                Logger.getLogger(ServicioStaxParserLeeXML.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return juegos;
    }
    
}
