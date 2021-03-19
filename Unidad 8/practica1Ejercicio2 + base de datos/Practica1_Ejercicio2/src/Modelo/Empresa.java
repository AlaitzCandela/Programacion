/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author 1GDAW07
 */
public class Empresa {
    private String nombreEmpresa;
    private String nif;
    private String direccion;
    
    //constructor

    public Empresa(String nombreEmpresa, String nif, String direccion) {
        this.nombreEmpresa = nombreEmpresa;
        this.nif = nif;
        this.direccion = direccion;
    }

    public Empresa() {
    }
     //get-set

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
