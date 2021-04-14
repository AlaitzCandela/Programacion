
package practica1_ejercicio2_p;

import Modelo.BD.*;
import Modelo.UML.*;
import Vista.*;
import javax.persistence.Persistence;
import javax.swing.JDialog;


public class Controlador {
//BD
    public static PersonaJpaController personaBD;
    public static EventoJpaController eventoBD;
    public static EmpresaJpaController empresaBD;
//ModeloUML
    public static Persona p;
    public static Evento ev;
    public static Empresa em;
//Vistas
    public static Vprincipal vp;
    public static Valta va;
    public static Vbaja vb;
    public static Vmodificar vm;
    public static Vinscripcion vi;
    public static Vlistado vl;
    
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
    public static void VBaja(){
        vb=new Vbaja(vp,true);
        vb.setVisible(true);
    }
    public static void VModificar(){
        vm=new Vmodificar(vp,true);
        vm.setVisible(true);
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
