
package Modelo;

import java.util.ArrayList;


public class Cliente {
    private String dni;
    private String nombre;
    private String apellido;
    private String  direccion;
    private int telefono;
    private String correo;
    private ArrayList <CasoJuicio> listaCasos;
            
    //Constructor

    public Cliente(String dni, String nombre, String apellido, String direccion, int telefono, String correo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    
    public Cliente(String dni, String nombre, String apellido, String direccion, int telefono, String correo, ArrayList<CasoJuicio> listaCasos) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.listaCasos = listaCasos;
    }

    public Cliente(String dni) {
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public ArrayList<CasoJuicio> getListaCasos() {
        return listaCasos;
    }

    public void setListaCasos(CasoJuicio c) {
        if(listaCasos ==null){
            listaCasos=new ArrayList();
        }
        listaCasos.add(c);
        
    }
    public void EliminarCaso(CasoJuicio c){
        listaCasos.remove(c);
    }
    //toString

    @Override
    public String toString() {
        return  "dni:" + dni + ", nombre:" + nombre + ", apellido:" + apellido + ", direccion:" + direccion + ", telefono:" + telefono + ", correo:" + correo + ", listaCasos:" + listaCasos ;
    }
    
}
