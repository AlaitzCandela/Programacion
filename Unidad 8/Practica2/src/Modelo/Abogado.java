
package Modelo;

import java.util.ArrayList;


public class Abogado {
    private String dni;
    private String nombre;
    private String apellido;
    private String direccion;
    private ArrayList <CasoJuicio> casoJuicio;
    
    //Constructor
    public Abogado(String dni, String nombre, String apellido, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    public Abogado(String dni, String nombre, String apellido, String direccion, ArrayList<CasoJuicio> casoJuicio) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.casoJuicio = casoJuicio;
    }

    public Abogado(String dni) {
        this.dni = dni;
    }
    
    
    //get-set

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<CasoJuicio> getCasoJuicio() {
        return casoJuicio;
    }

    public void setCasoJuicio(CasoJuicio c) {
        if(casoJuicio ==null){
            casoJuicio=new ArrayList();
        }
        casoJuicio.add(c);
        
    }
     public void EliminarCaso(CasoJuicio c){
        casoJuicio.remove(c);
    }
     //toString

    @Override
    public String toString() {
        return  "dni:" + dni + ",nombre:" + nombre + "apellido:" + apellido + "direccion:" + direccion + "casoJuicio:" + casoJuicio ;
    }
     
}
