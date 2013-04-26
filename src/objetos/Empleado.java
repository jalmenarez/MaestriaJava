/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package objetos;

/**
 *
 * @author JAVA
 */
public class Empleado {

    private String nombre;
    private String apellido;
    private int edad;
    private double salario;

    public Empleado(){
        this.nombre = "";
        this.apellido = "";
        this.edad = -1;
        this.salario = -1;
    }

    public Empleado(String nombre,String apellido,int edad, double salario){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }

    public boolean subirSalario(int aumento){
        boolean resultado = false;
        //TODO: agregar alguna validacion antes de aumentar.
        this.salario += aumento;
        resultado = true;

        return resultado;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
