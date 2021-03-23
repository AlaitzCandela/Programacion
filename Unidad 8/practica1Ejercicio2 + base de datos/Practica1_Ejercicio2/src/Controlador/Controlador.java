/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Empresa;
import Modelo.Evento;
import Modelo.Persona;
import ModeloBD.*;
import Vista.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author 1GDAW07
 */
public class Controlador {
private static Vprincipal vp;
private static Valta va;
private static Vcancelar vc;
private static Vmodificar vm;
private static Vinscribir vi;
private static Vlistado vl;

private static BaseDatos bd;
private static TablaEventos te;
private static TablaPersona tp;
private static TablaRelacion tr;
private static TablaEmpresa tem;

private static Evento ev;
    
    public static void main(String[] args) {
        try{
            bd=new BaseDatos();
            bd.ConectarCon();
            tem=new TablaEmpresa(bd.getCon());
            te=new TablaEventos(bd.getCon());
            tp=new TablaPersona(bd.getCon());
            vp=new Vprincipal();
            vp.setVisible(true);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void Alta(){
        va=new Valta(vp,true);
        va.setVisible(true);
    }
    public static boolean Insertar(String n,String l,LocalDate f,LocalTime hi,LocalTime hf,int a){
        boolean evento=true;
        ev=new Evento(n,l,f,hi,hf,a);
        boolean t=true;
         try{
            t=te.GuardarEvento(ev);
        }
        catch(Exception e){
            System.out.println(e.getClass()+e.getMessage());
        }
         if(t==true)
             evento=true;
         else
            evento=false;
       return evento;
    }
    public static void Cancelar(){
        vc=new Vcancelar(vp,true);
        vc.setVisible(true);
        
    }
    public static boolean Borrar(String n){
       boolean borrar=true,borrado=true;
        Evento b=new Evento(n);
        try{
      borrar=te.CancelarEvento(b);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        if(borrar==true)
            borrado=true;
        else
            borrado=false;
        return borrado;
    }
    public static void Modificar() throws Exception{
        vm=new Vmodificar(vp,true);
        vm.setVisible(true);
    }
    
    public static void Eventos(JComboBox eventos) throws Exception{
        ArrayList<Evento>nombres= new ArrayList();
        nombres=te.ConsultarDatos();
        int x=0;
        for(x=0;x<nombres.size();x++){
            eventos.addItem(nombres.get(x).getNombre());
        }
        
    }
    public static ArrayList ListaEvento(){
        ArrayList<String>nombres= new ArrayList();
        try{
            nombres=te.ConsultarDatosNom();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return nombres;
    }
    public static ArrayList Consultar(String n){
       Evento evento = new Evento(n);
       Evento event = new Evento(n);
        try{
            event=te.Consultar(evento);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        ArrayList <String> DatosEvento=new ArrayList();
        DatosEvento.add(event.getNombre());
        DatosEvento.add(event.getLugar());
        DatosEvento.add((event.getFecha()).toString());
        DatosEvento.add((event.getHoraInicio()).toString());
        DatosEvento.add((event.getHoraFinal()).toString());
        DatosEvento.add(Integer.toString(event.getAforo()));
             
        
        return DatosEvento;
    }
    public static boolean Update(String n,String l,String f,String hi,String hf,String a){
        LocalDate fecha=LocalDate.parse(f);
        LocalTime horaI=LocalTime.parse(hi);
        LocalTime horaF=LocalTime.parse(hf);
        int aforo=Integer.parseInt(a);
        Evento e1=new Evento(n,l,fecha,horaI,horaF,aforo);
        boolean mod=false;
        try{
            mod=te.Modificar(e1);
            mod=true;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return mod;
    }
    public static void VentanaInscribir(){
        vi=new Vinscribir(vp,true);
        vi.setVisible(true);
    }
    public static boolean InsertarPEE(String nEmpresa,String nDireccion,String nNif,String nom,String a,String d,String nEv) throws Exception{
        boolean  in=false;
        Evento event=new Evento(nEv);
        Empresa em=new Empresa(nEmpresa,nNif,nDireccion);
        Persona p=new Persona(nom,a,d,em);
        boolean re=false;
        boolean ie=false;
            try{
               
                ie=tem.InsertarEmpresa(em);
                if(ie == true){
                    in=tp.Insertar(p,em);
                }
                else
                    System.out.println("Elemento empresa no insertada en la tabla empresa");
                
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }

            Evento evento=new Evento();
            try{
                evento=te.Consultar(event);
               if(in==true){
                   re=tr.Insertar(p,evento);
               }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        return in;
    }
    public static void Listado(){
        vl=new Vlistado(vp,true);
        vl.setVisible(true);
    }
    public static ArrayList GetPersonas(String nombre){
        Evento n=new Evento(nombre);
        ArrayList <String> Personas=new ArrayList();
        try{
            Personas=tr.getP(n);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return Personas;
    }
    public static void Volver(String n){
        if(n.equals("va")){
            va.dispose();
        }
        else
            if(n.equals("vc")){
                vc.dispose();
            }
            else
                if(n.equals("vm"))
                     vm.dispose();
                else
                    if(n.equals("vi"))
                        vi.dispose();
                    else
                        vl.dispose();
    }
    public static void Salir(){
        System.exit(0);
    }
}
