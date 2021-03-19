
package Modelo;

import java.util.ArrayList;

public class Persona {
   private String nombre;
   private String apellido;
   private String dni;
   private ArrayList <Evento> eventos;
   private Empresa e;
   
   //Constructor

    public Persona(String nombre, String apellido, String dni, ArrayList<Evento> eventos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.eventos = eventos;
    }

    public Persona() {
    }

    public Persona(String nombre, ArrayList<Evento> eventos) {
        this.nombre = nombre;
        this.eventos = eventos;
    }

    public Persona(String nombre, String apellido, String dni, Empresa e) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.e = e;
    }
    
   //Get-set

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
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

   
    public ArrayList<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(ArrayList<Evento> eventos) {
        this.eventos = eventos;
    }
    //to-string

    @Override
    public String toString() {
        return "Nombre=" + nombre + ", Apellido=" + apellido + ", Dni=" + dni +  ", Eventos=" + eventos ;
    }
    
   
}
