
package Modelo;

import java.time.LocalDate;


public class Reservas {
    private String nombre;
    private String correo;
    private int telefono;
    private LocalDate fecha;
    private int comensales;
    private String colorMantel;
    private String demandas;
    //constructor

    public Reservas(String nombre, String correo, int telefono, LocalDate fecha, int comensales, String colorMantel, String demandas) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.fecha = fecha;
        this.comensales = comensales;
        this.colorMantel = colorMantel;
        this.demandas = demandas;
    }
    //get-set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getComensales() {
        return comensales;
    }

    public void setComensales(int comensales) {
        this.comensales = comensales;
    }

    public String getColorMantel() {
        return colorMantel;
    }

    public void setColorMantel(String colorMantel) {
        this.colorMantel = colorMantel;
    }

    public String getDemandas() {
        return demandas;
    }

    public void setDemandas(String demandas) {
        this.demandas = demandas;
    }
    
}
