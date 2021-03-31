
package Controlador;

import Modelo.*;
import ModeloBD.*;
import VCasoJuicio.*;
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
    private static TablaAbogadoCaso tac;
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
    private static Vopciones vo;
    private static VconsultaC vcc;
    private static ValtaCaso vaCaso;
    private static VbajaCaso vbCaso;
    
    
    
    public static void main(String[] args) {
       try{
           bd=new BaseDatos();
            bd.ConectarCon();
            tc=new TablaCliente(bd.getCon());
            tcj=new TablaCasoJuicio(bd.getCon());
            ta=new TablaAbogado(bd.getCon());
            tac=new TablaAbogadoCaso(bd.getCon());
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
    public static void Abogado(String d,String n,String ap,String di){
       boolean iAbogado=false,abogado=false;
       Abogado [] ab=new Abogado[4];
        a=new Abogado(d,n,ap,di);
        String nom="Dni";
        
        try{
                ab=ta.Consulta(nom,d);
                if(ab[0]==null){
                    iAbogado=ta.Insertar(a);
                    abogado=true;
                }
        }
        catch(Exception e){
               System.out.println(e.getMessage());
         }
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
        String nombre="Dni";
        String [] datos=new String[6];
        Cliente[]l=new Cliente[1];
        try{
            l=tc.Consulta(nombre,dni);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
       datos[0]=l[0].getDni();
       datos[1]=l[0].getNombre();
       datos[2]=l[0].getApellido();
       datos[3]=l[0].getDireccion();
       datos[4]=Integer.toString(l[0].getTelefono());
       datos[5]=l[0].getCorreo();
       
        vmc=new VmodificacionC(vp,true,datos);
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
    public static void VentanaOpciones(){
        vo=new Vopciones(vp,true);
        vo.setVisible(true);
    }
    public static void ConsultaClienteS(String nombreB,String dato){
        Cliente [] opc=new Cliente[1];
        
        try{
            opc=tc.Consulta(nombreB,dato);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        String d=opc[0].toString();
        VentanaConsulta(d);
    }
    public static void ConsultaClienteI(String nombreB,int dato){
           Cliente [] opc=new Cliente[1];
        
        try{
            opc=tc.ConsultaI(nombreB,dato);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        String d=opc[0].toString();
        VentanaConsulta(d);
    }
    public static void VentanaConsulta(String d){
        vcc=new VconsultaC(vp,true,d);
        vcc.setVisible(true);
    }
    public static void VentanaAltaCaso(){
        vaCaso=new ValtaCaso(vp,true);
        vaCaso.setVisible(true);
    }
    public static ArrayList <String> DatosCaso(){
       int nExp=(int)(Math.random()*1000);
       String numeroExpediente=Integer.toString(nExp);
       LocalDate fechaI=LocalDate.now();
       String fechaInicio=fechaI.toString();
       
       ArrayList <Abogado> listaAbogado=new ArrayList();
       try{
           listaAbogado=ta.ConsultaGeneral();
       }
       catch(Exception e){
           System.out.println(e.getMessage());
         }
       
        ArrayList <String> DatosCaso=new ArrayList();
       DatosCaso.add(fechaInicio);
       DatosCaso.add(numeroExpediente);
       for(int x=0;x<listaAbogado.size();x++){
            DatosCaso.add(listaAbogado.get(x).toString());
        }
       return DatosCaso;
       
    }
    public static void AbogadoCaso(ArrayList AbogadoSeleccionado,String dni){
        try{
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static boolean AltaCaso(String numExp,String fechaInicio, String dni,String estado){
        c=new Cliente();
        c.setDni(dni);
        cj=new CasoJuicio();
        cj.setNumExp(Integer.parseInt(numExp));
        cj.setFechaInicio(LocalDate.parse(fechaInicio));
        cj.setEstado(EstadoCaso.TRAMITADO);
        cj.setC(c);
        cj.setFechaFin(null);
        
        boolean insertar=false;
        try{
            insertar=tcj.Insertar(cj);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return insertar;
        
    }
    public static void VentanaBajaCaso(){
        vbCaso=new VbajaCaso(vp,true);
        vbCaso.setVisible(true);
    }  
    public static void Volver(JDialog jd){
        jd.dispose();
    }
    public static void Salir(){
        System.exit(0);
    }
}

