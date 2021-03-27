 
package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;


public class CasoJuicio {
    private int numExp;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private EstadoCaso estado;
    private ArrayList <Abogado> abogados;
    private Cliente c;
    
    //Constructor

    public CasoJuicio(int numExp, LocalDate fechaInicio, LocalDate fechaFin, EstadoCaso estado, ArrayList<Abogado> abogados, Cliente c) {
        this.numExp = numExp;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
        this.abogados = abogados;
        this.c = c;
    }

    public CasoJuicio() {
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

    public EstadoCaso getEstado() {
        return estado;
    }

    public void setEstado(EstadoCaso estado) {
        this.estado = estado;
    }

    public ArrayList<Abogado> getAbogados() {
        return abogados;
    }

    public void setAbogados(Abogado a) {
        if(abogados==null){
            abogados=new ArrayList();
        }
        abogados.add(a);
        
    }

    public Cliente getC() {
        return c;
    }

    public void setC(Cliente c) {
        this.c = c;
    }
    public void EliminarAbogado(Abogado a){
        abogados.remove(a);
    
    }
    //toString

    @Override
    public String toString() {
        return  "numExp:" + numExp + ", fechaInicio:" + fechaInicio + ", fechaFin:" + fechaFin + ", estado:" + estado + ", abogados:" + abogados + ", caso:" + c ;
    }
    
}
