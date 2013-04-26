/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package objetos;

import java.util.Locale;

/**
 *
 * @author java
 */
public class Cliente {

    private String rut;
    private String firstName;
    private String lastName;
    private String email;
    private int edad;
    private String nacionalidad;
    private Locale locale;

    public Cliente(){
        
    }

    public Cliente(String rut) {
        this.rut = rut;
    }

    public Cliente(String rut, String firstName, String lastName) {
        this.rut = rut;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getCompleteName(){
        return this.getFirstName()+" "+this.getLastName();
    }

    @Override
    public String toString(){
        StringBuilder response = new StringBuilder();
        response.append("\n{\n");
        response.append(" rut = ");
        response.append(this.rut);
        response.append(", ");
        response.append(" firstName = ");
        response.append(this.firstName);
        response.append(", ");
         response.append(" lastName = ");
        response.append(this.lastName);
        response.append(", \n");
         response.append(" e-mail = ");
        response.append(this.email);
        response.append(", ");
         response.append(" edad = ");
        response.append(this.edad);
        response.append(", \n");
         response.append(" nacionalidad = ");
        response.append(this.nacionalidad);
        response.append("\n}");
        return response.toString();
    }

}
