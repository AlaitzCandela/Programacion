
package practica1_ejercicio2_p;

import Modelo.BD.*;
import Modelo.UML.*;
import Vista.*;
import java.sql.Date;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.persistence.Persistence;
import javax.swing.JComboBox;
import javax.swing.JDialog;


public class Controlador {
//BD
    private static PersonaJpaController personaBD;
    private static EventoJpaController eventoBD;
    private static EmpresaJpaController empresaBD;
//ModeloUML
    private static Persona p;
    private static Evento ev;
    private static Empresa em;
//Vistas
    private static Vprincipal vp;
    private static Valta va;
    private static Vbaja vb;
    private static Vmodificar vm;
    private static Vinscripcion vi;
    private static Vlistado vl;
//ArrayList
    private static ArrayList <String> DatosEvento;
    private static List <Evento> Eventos;
    
    public static void main(String[] args) {
        try{
            //crear el modelo de la base de datos
            personaBD= new PersonaJpaController(Persistence.createEntityManagerFactory("Practica1_Ejercicio2_PPU"));
            eventoBD=new EventoJpaController(Persistence.createEntityManagerFactory("Practica1_Ejercicio2_PPU"));
            empresaBD=new EmpresaJpaController(Persistence.createEntityManagerFactory("Practica1_Ejercicio2_PPU"));
            
            //crear y visualizar la primera ventana
            vp=new Vprincipal();
            vp.setVisible(true);
        }
        catch(Exception e){
            System.out.println(e.getClass()+e.getMessage());
        }
    }
    public static void VAlta(){
        va=new Valta(vp,true);
        va.setVisible(true);
    }
    public static boolean Insertar(String nombreEvento,String lugar,LocalDate fecha,LocalTime horaInicio,LocalTime horaFin,int aforo){
        Date fechaEvento=Date.valueOf(fecha.toString());
        Time horaI=Time.valueOf(horaInicio);
        Time horaF=Time.valueOf(horaFin);
        ev=new Evento(nombreEvento,lugar,fechaEvento,horaI,horaF,aforo);
        boolean insertar=true;
        try{
            eventoBD.create(ev);
        }
        catch(Exception e){
            System.out.println(e.getClass()+e.getMessage());
            insertar=false;
        }
        return insertar;
    }
    public static void VBaja(){
        vb=new Vbaja(vp,true);
        vb.setVisible(true);
    }
    public static boolean Borrar(String nombreEvento){
        boolean borrar=true;
        ev.setNombre(nombreEvento);
        try{
            eventoBD.destroy(nombreEvento);
            borrar=true;
        }
         catch(Exception e){
            System.out.println(e.getClass()+e.getMessage());
            borrar=false;
        }
        return borrar;
    }
    public static void VModificar(){
        vm=new Vmodificar(vp,true);
        vm.setVisible(true);
    }
    public static void Update (String nombreEvento,String lugar,String fecha,String horaInicio,String horaFin,String aforo ){
        try{
            
            //fechaEv=Fecha(fecha);
            DateFormat formato=new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy",Locale.US); 
            java.util.Date fechaEvento=formato.parse(fecha);
            
            DateTimeFormatter formatoHora=DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss zzz yyyy",Locale.US);
            LocalTime horaIn=LocalTime.parse(horaInicio,formatoHora);
            Time horaI=Time.valueOf(horaIn);
            LocalTime horaFi=LocalTime.parse(horaFin,formatoHora);
            Time horaF=Time.valueOf(horaFi);
            
            int aforoEvento=Integer.parseInt(aforo);
            
            ev.setNombre(nombreEvento);
            ev.setLugar(lugar);
            ev.setFecha(fechaEvento);
            ev.setHoraInicio(horaI);
            ev.setHoraFin(horaF);
            ev.setAforo(aforoEvento);
        
            eventoBD.edit(ev);
        }
        catch(Exception e){
            System.out.println(e.getClass()+e.getMessage());
            
        }
        
    }
    /*public static String Fecha(String f){
       
       String mes=f.substring(5,7);
       int m=0;
       String dia=f.substring(9,10);
       String año=f.substring(12,15);
       switch(mes){
           case 1:
               if(mes.equals("Jan"))
                   m=1;
       }
       String fecha="dia/mes/año";
       return fecha;
      
    }*/
    public static void Eventos(JComboBox eventos){
        Eventos=new ArrayList();
        try{
            Eventos=eventoBD.findEventoEntities();
            for(int x=0;x<Eventos.size();x++){
                eventos.addItem(Eventos.get(x).getNombre());
            }
        }
        catch(Exception e){
            System.out.println(e.getClass()+e.getMessage());
        }
    }
    public static ArrayList Consultar(String nombreE){
        DatosEvento=new ArrayList();
        try{
            ev=eventoBD.findEvento(nombreE);
            String f=ev.getFecha().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().toString(); 
            String hi=ev.getHoraInicio().toInstant().atZone(ZoneId.systemDefault()).toLocalTime().toString();
            String hf=ev.getHoraFin().toInstant().atZone(ZoneId.systemDefault()).toLocalTime().toString();
            DatosEvento.add(ev.getNombre());
            DatosEvento.add(ev.getLugar());
            DatosEvento.add(f);
            DatosEvento.add(hi);
            DatosEvento.add(hf);
            DatosEvento.add(Integer.toString(ev.getAforo()));
        }
        catch(Exception e){
            System.out.println(e.getClass()+e.getMessage());
            
        }
        return DatosEvento ;
    }
    public static void VInscripccion(){
        vi=new Vinscripcion(vp,true);
        vi.setVisible(true);
    }
    public static void Listado(){
        vl=new Vlistado(vp,true);
        vl.setVisible(true);
    }
    public static void Volver(JDialog jd){
        jd.dispose();
    }
    public static void Salir(){
        System.exit(0);
    }
}
