
package Controlador;

import Modelo.*;
import ModeloBD.*;
import VCliente.*;
import Vista.*;
import java.time.LocalDate;
import java.util.ArrayList;


public class Controlador {
//tablas
    private static TablaAbogado ta;
    private static TablaCasoJuicio tcj;
    private static TablaCliente tc;
//base
    private static BaseDatos bd;
//Modelo
    private static Abogado a;
    private static CasoJuicio cj;
    private static Cliente c;
//ventanas
    private static VistaPrincipal vp;
    private static ValtaC vac;

    public static void main(String[] args) {
       try{
            bd=new BaseDatos();
            bd.ConectarCon();
            vp=new VistaPrincipal();
            vp.setVisible(true);
       }
       catch(Exception e){
           System.out.println(e.getMessage());
       }
    }  
    public static void VentanaAltaCliente(){
        vac=new ValtaC(vp,true);
        vac.setVisible(true);
    }
    public static void LlenarArrayListAbogado(String d,String n,String ap,String di){
        a=new Abogado(d,n,ap,di);
        cj=new CasoJuicio();
        cj.setAbogados(a);
        
    }
    public static void AltaCliente(String dni,String nom,String ap,String dir,int telef,String correo ){
        c=new Cliente(dni,nom,ap,dir,telef,correo);
        
        cj.setNumExp(0000);
        cj.setFechaInicio(LocalDate.now());
        LocalDate fechaF=LocalDate.now().plusMonths(2);
        cj.setFechaFin(fechaF);
        cj.setEstado(EstadoCaso.TRAMITADO);
        cj.setC(c);
        
        ArrayList <CasoJuicio> casoJ=new ArrayList();
        casoJ.add(cj);
        
        Cliente c1=new Cliente(dni,nom,ap,dir,telef,correo,casoJ);
        
        
    }
}

