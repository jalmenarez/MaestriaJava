package entidades;

public class Juego {
    
    private String nombre;
    private String consola;
    private String lanzamiento;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the consola
     */
    public String getConsola() {
        return consola;
    }

    /**
     * @param consola the consola to set
     */
    public void setConsola(String consola) {
        this.consola = consola;
    }

    /**
     * @return the lanzamiento
     */
    public String getLanzamiento() {
        return lanzamiento;
    }

    /**
     * @param lanzamiento the lanzamiento to set
     */
    public void setLanzamiento(String lanzamiento) {
        this.lanzamiento = lanzamiento;
    }
    
    @Override
    public String toString(){
       return "juego["+this.nombre+" , consola: "+this.consola+", lanzamiento: "+this.lanzamiento+"]";  
    }
}
