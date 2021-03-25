
package Controlador;

import Modelo.*;
import ModeloBD.*;
import VCliente.*;
import Vista.*;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JDialog;


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
    private static VbajaC vbc;

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
    public static boolean AltaCliente(String dni,String nom,String ap,String dir,int telef,String correo ){
        tc=new TablaCliente(bd.getCon());
        tcj=new TablaCasoJuicio(bd.getCon());
        c=new Cliente(dni,nom,ap,dir,telef,correo);
        boolean i=false;
        int num=0;
        num=ComprobarNumExpediente();
        
        cj.setNumExp(num);
        cj.setFechaInicio(LocalDate.now());
        LocalDate fechaF=LocalDate.now().plusMonths(2);
        cj.setFechaFin(fechaF);
        cj.setEstado(EstadoCaso.TRAMITADO);
        cj.setC(c);
        
        ArrayList <CasoJuicio> casoJ=new ArrayList();
        casoJ.add(cj);
        
        Cliente c1=new Cliente(dni,nom,ap,dir,telef,correo,casoJ);
        
        try{
            i=tc.Insertar(c);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return i;
    }
    public static int ComprobarNumExpediente(){
        boolean Nexp=false;
        int r=0;
        while(Nexp==false){
            r=(int)(Math.random()*1000);
            try{
                 Nexp=tcj.NumExpediente(r);
                }
            catch(Exception e){
            System.out.println(e.getMessage());
            }
        }
        return r;
    }
    public static void VentanaBajaCliente(){
        vbc=new VbajaC(vp,true);
        vbc.setVisible(true);
    }
    public static void BajaCliente(String dni){
        c= new Cliente(dni);
        
    }
    public static void Volver(JDialog jd){
        jd.dispose();
    }
}

