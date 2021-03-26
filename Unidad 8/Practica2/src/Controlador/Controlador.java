
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
    private static VmodificacionC vmc;

    public static void main(String[] args) {
       try{
           bd=new BaseDatos();
            bd.ConectarCon();
            tc=new TablaCliente(bd.getCon());
            tcj=new TablaCasoJuicio(bd.getCon());
            ta=new TablaAbogado(bd.getCon());
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
    public static boolean BajaCliente(String dni){
        boolean d=false;
        c= new Cliente(dni);
        try{
            d=tc.BorrarCliente(c);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return d;
    }
    public static void VentanaModificacionCliente(String dni){
        c=new Cliente(dni);
        String[]l=new String[6];
        try{
            l=tc.Consulta(c);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        vmc=new VmodificacionC(vp,true,l);
        vmc.setVisible(true);
    }
    public static String Consulta(){
     ArrayList <Cliente> lista=new ArrayList();
     try{
        lista=tc.ConsultaGeneral();
     }
     catch(Exception e){
         System.out.println(e.getMessage());
     }
      String listaC="";
      int x=0;
      for(x=0;x<lista.size();x++){
          listaC+=lista.get(x).toString();
      }
        return listaC;
    }
    public static boolean ModificarDatos(String [] l){
        boolean m=false;
        try{
            m=tc.ModificarDatos(l);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return m;
    }
    public static void ConsultaClienteS(String nombreB,String dato){}
    public static void ConsultaClienteI(String nombreB,int dato){}
    public static void Volver(JDialog jd){
        jd.dispose();
    }
}

