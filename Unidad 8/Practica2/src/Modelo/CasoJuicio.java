
package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;


public class CasoJuicio {
    private int numExp;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String estado;
    private ArrayList <Abogado> abogados;
    private Cliente c;
    
    //Constructor

    public CasoJuicio(int numExp, LocalDate fechaInicio, LocalDate fechaFin, String estado, ArrayList<Abogado> abogados, Cliente c) {
        this.numExp = numExp;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
        this.abogados = abogados;
        this.c = c;
    }
    
    //get-set

    public int getNumExp() {
        return numExp;
    }

    public void setNumExp(int numExp) {
        this.numExp = numExp;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<Abogado> getAbogados() {
        return abogados;
    }

    public void setAbogados(ArrayList<Abogado> abogados) {
        this.abogados = abogados;
    }

    public Cliente getC() {
        return c;
    }

    public void setC(Cliente c) {
        this.c = c;
    }
    
    
}
