/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_ejercicio1_p;

import ModeloBD.PersonaJpaController;
import ModeloUML.Persona;
import Vista.*;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Persistence;
import javax.swing.JDialog;

/**
 *
 * @author 1GDAW07
 */
public class Controlador {
//BD
    public static PersonaJpaController personaBD;
//Persona
    public static Persona p;
//Vista
    public static Vprincipal vp;
   public static Vinsertar vi;
    public static VConsulta vc;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        personaBD= new PersonaJpaController(Persistence.createEntityManagerFactory("Practica1_Ejercicio1_PPU"));
        vp=new Vprincipal();
        vp.setVisible(true);
        
    }
    public static void VInsertar(){
        vi=new Vinsertar(vp,true);
        vi.setVisible(true);
    }
    public static void Insertar(String nombre,int edad,String profesion,int telefono){
        p=new Persona(nombre,edad,profesion,telefono);
        try{
             personaBD.create(p);
        }
        catch(Exception e){
           System.out.println(e.getClass()+e.getMessage());     
        }
    }
    public static void VConsultarDatos(String nombre){
        String datos;
        datos=ConsultarDatosPersona(nombre);
        vc=new VConsulta(vp,true,datos);
        vc.setVisible(true);
        
       
    }
    public static String ConsultarDatosPersona(String nombre){
        p=new Persona(nombre);
        Persona datospersona=new Persona();
        try{
            datospersona=personaBD.findPersona(nombre);
        }
        catch(Exception e){
           System.out.println(e.getClass()+e.getMessage());     
        }
        String datos=datospersona.toString();
        return datos;
    }
    public static void VConsulta(){
        List <Persona> listaPersonas=new ArrayList();
        String datos="";
         try{
             listaPersonas=personaBD.findPersonaEntities();
             for(int x=0;x<listaPersonas.size();x++){
                 datos+=listaPersonas.get(x).toString()+"\n";
             }
        }
        catch(Exception e){
           System.out.println(e.getClass()+e.getMessage());     
        }
        
        vc=new VConsulta(vp,true,datos);
        vc.setVisible(true);
    }
    public static void Volver(JDialog jd){
        jd.dispose();
    }
    public static void Salir(){
        System.exit(0);
    }
    
}
