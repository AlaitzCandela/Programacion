/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Evento;
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

private static BaseDatos bd;
private static TablaEventos te;

private static Evento ev;
    
    public static void main(String[] args) {
        try{
            bd=new BaseDatos();
            bd.ConectarCon();
            te=new TablaEventos(bd.getCon());
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
    public static void Volver(String n){
        if(n.equals("va")){
            va.dispose();
        }
        else
            if(n.equals("vc")){
                vc.dispose();
            }
    }
    public static void Eventos(JComboBox eventos) throws Exception{
        ArrayList<Evento>nombres= new ArrayList();
        nombres=te.ConsultarDatos();
        int x=0;
        for(x=0;x<nombres.size();x++){
            eventos.addItem(nombres.get(x).getNombre());
        }
        
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
    public static void Update(String l,String f,String hi,String hf,String a){}
}
