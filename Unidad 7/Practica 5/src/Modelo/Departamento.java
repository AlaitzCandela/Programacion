/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author 1GDAW07
 */
public class Departamento {
    private String labor;
    private int numdepartamento;
    private ArrayList<Empleado> listaEmpleados;
    //constructor

    public Departamento(String labor,  int departamento) {
        this.labor = labor;
        this.numdepartamento = departamento;
        this.listaEmpleados= listaEmpleados;
    }

    public Departamento() {
    }
    
    //get-set

    public String getLabor() {
        return labor;
    }

    public void setLabor(String labor) {
        this.labor = labor;
    }

  
    public int getNumdepartamento() {
        return numdepartamento;
    }

    public void setNumdepartamento(int departamento) {
        this.numdepartamento = departamento;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

   
    

    
}
