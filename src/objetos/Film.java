package objetos;

public class Film {
    private long id;
    private String name;
    private String autor;
    
    public Film(){
        this.id = 0;
        this.name = "";
        this.autor = "";
    }

    public Film(long id, String name, String autor) {
        this.id = id;
        this.name = name;
        this.autor = autor;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    @Override
    public String toString(){
        StringBuilder sObj = new StringBuilder();
        sObj.append(" ID = ");
        sObj.append(this.id);
        sObj.append(", NAME = ");
        sObj.append(this.name);
        sObj.append(", AUTOR = ");
        sObj.append(this.autor);
        return sObj.toString();
    }
    
}
