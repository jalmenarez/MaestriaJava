package presentacion.xml;

import entidades.Juego;
import java.util.List;
import servicios.ServicioStaxParserLeeXML;

public class PresentacionLeeArchivoXML {
    public static void main(String[] a){
        ServicioStaxParserLeeXML parseLeeXML = new ServicioStaxParserLeeXML();
        List<Juego> listaJuegos=parseLeeXML.leeJuegos(".//archivos//listaJuegos.xml");
        for(Juego oJuego: listaJuegos){
            System.out.println(oJuego);
        }
    }
}
