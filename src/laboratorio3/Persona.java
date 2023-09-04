/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio3;

/**
 *
 * @author ESTUDIANTE
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String Dni;

    public Persona(String nombre, String apellido, String Dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Dni = Dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }
    
    
    
}    
