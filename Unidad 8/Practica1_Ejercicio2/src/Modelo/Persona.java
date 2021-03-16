
package Modelo;

import java.util.ArrayList;

public class Persona {
   private String nombre;
   private String apellido;
   private String dni;
   private String nombreEmpresa;
   private ArrayList <Evento> eventos;
   
   //Constructor

    public Persona(String nombre, String apellido, String dni, String nombreEmpresa, ArrayList<Evento> eventos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nombreEmpresa = nombreEmpresa;
        this.eventos = eventos;
    }

    public Persona() {
    }

    public Persona(String nombre, ArrayList<Evento> eventos) {
        this.nombre = nombre;
        this.eventos = eventos;
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

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
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
        return "Nombre=" + nombre + ", Apellido=" + apellido + ", Dni=" + dni + ", NombreEmpresa=" + nombreEmpresa + ", Eventos=" + eventos ;
    }
    
   
}
