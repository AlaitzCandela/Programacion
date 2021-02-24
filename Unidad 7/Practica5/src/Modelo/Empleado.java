
package Modelo;

import java.time.LocalDate;


public class Empleado {
    private String nombre;
    private String apellidos;
    private int NSS;
    private String DNI;
    private String sexo;
    private String estado;
    private int telefono;
    private String direccion;
    private int numempleado;
    private LocalDate fechaAlta;
    private Contrato c;
    private Departamento d;
    private Usuarios u;
    
    //constructor

    public Empleado(String nombre, String apellidos, int NSS, String DNI, String sexo, String estado, int telefono, String direccion, int numempleado,LocalDate fechaAlta,Contrato c,Departamento d,Usuarios u) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NSS = NSS;
        this.DNI = DNI;
        this.sexo = sexo;
        this.estado = estado;
        this.telefono = telefono;
        this.direccion = direccion;
        this.numempleado= numempleado;
        this.fechaAlta= fechaAlta;
        this.c= c;
        this.d=d;
        this.u=u;
    }
    //get-set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNSS() {
        return NSS;
    }

    public void setNSS(int NSS) {
        this.NSS = NSS;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumempleado() {
        return numempleado;
    }

    public void setNumempleado(int numempleado) {
        this.numempleado = numempleado;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Contrato getC() {
        return c;
    }

    public void setC(Contrato c) {
        this.c = c;
    }

    public Departamento getD() {
        return d;
    }

    public void setD(Departamento d) {
        this.d = d;
    }

    public Usuarios getU() {
        return u;
    }

    public void setU(Usuarios u) {
        this.u = u;
    }
    
   
    
    
}
