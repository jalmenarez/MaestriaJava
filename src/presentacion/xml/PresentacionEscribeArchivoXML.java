package presentacion.xml;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.stream.XMLStreamException;
import servicios.ServicioStaxParserEscribeXML;

/**
 *
 * @author java
 */
public class PresentacionEscribeArchivoXML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            ServicioStaxParserEscribeXML parserEscribeArchivoXML=
                    new servicios.ServicioStaxParserEscribeXML();
            parserEscribeArchivoXML.setArchivoJuegos(".\\archivos\\listaJuegos2.xml");
            parserEscribeArchivoXML.grabarArchivo();
        } catch (XMLStreamException ex) {
            Logger.getLogger(PresentacionEscribeArchivoXML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PresentacionEscribeArchivoXML.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
