/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_ejercicio1_p;

import ModeloBD.PersonaJpaController;
import ModeloUML.Persona;
import Vista.*;
import javax.persistence.Persistence;
import javax.swing.JDialog;

/**
 *
 * @author 1GDAW07
 */
public class Controlador {
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
        PersonaJpaController personaBD;
        personaBD= new PersonaJpaController(Persistence.createEntityManagerFactory("Practica1_Ejercicio1_PPU"));
        vp=new Vprincipal();
        vp.setVisible(true);
        
    }
    public static void VInsertar(){
        vi=new Vinsertar(vp,true);
        vi.setVisible(true);
    }
    public static void VConsultarDatos(String nombre){
        vc=new VConsulta(vp,true);
        vc.setVisible(true);
    }
    public static void VConsulta(){
         vc=new VConsulta(vp,true);
        vc.setVisible(true);
    }
    public static void Volver(JDialog jd){
        jd.dispose();
    }
    public static void Salir(){
        System.exit(0);
    }
    
}
