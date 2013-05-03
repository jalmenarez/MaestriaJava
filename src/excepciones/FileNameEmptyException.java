package excepciones;

public class FileNameEmptyException extends Exception {
     public FileNameEmptyException(){
        super("El nombre del archivo no puede estar vacio.");
    }
}
