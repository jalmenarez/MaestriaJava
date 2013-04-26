/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package objetos;

/**
 *
 * @author java
 */
public class Usuario {

    private String usuario;
    private String password;

    public Usuario(){
        this.usuario = "";
        this.password = "";
    }

    public Usuario(String usuario,String password){
        this.usuario = usuario;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public boolean equals(Object obj) {
        Usuario u = (Usuario) obj;
        if ((u.getUsuario().equalsIgnoreCase(this.usuario)) && (u.getPassword() == this.password))
         return true;
        else
         return false;      
     }



}
