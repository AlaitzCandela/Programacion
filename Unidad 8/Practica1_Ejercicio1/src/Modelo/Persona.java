
package Modelo;


public class Persona {
    private String nombre;
    private int edad;
    private String profesion;
    private int telefono;
    //constructores

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
     
    public Persona(String nombre, int edad, String profesion, int telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.profesion = profesion;
        this.telefono = telefono;
    }
    //get-set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    //to-string

    @Override
    public String toString() {
        return  "Nombre=" + nombre + "\n"
                + " Edad=" + edad + "\n"
                + "Profesion=" + profesion + "\n "
                + "Telefono=" + telefono ;
    }
    
}
