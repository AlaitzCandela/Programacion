
package practica1_ejercicio1;

import BaseDeDatos.*;
import Modelo.Persona;
import Vista.*;


public class Controlador {
private static BaseDatos bd;
private static TablaPersona tp;

private static Persona p=new Persona();

private static Vprincipal vp=new Vprincipal();
private static Vinsertar vi=new Vinsertar(vp,true);
private static Vconsulta vc=new Vconsulta(vp,true);
    
    public static void main(String[] args) {
       try{
           bd=new BaseDatos();
           bd.Conectar();
           tp=new TablaPersona(bd.getCon());
           vp.setVisible(true);
       }
       catch(Exception e){
           bd.Desconectar();
           System.out.println(e.getClass()+e.getMessage());
       }
        
    }
    public static void Insertar(){
        vi.setVisible(true);
    }
    public static void Registro(String nombre,int edad,String profesion, int telefono) throws Exception{
       p=new Persona(nombre,edad,profesion,telefono);
       tp.Insertar(p);
      
       
    }
    public static void ConsultarDatos(){
        vc.setVisible(true);
    }
    public static void Consulta(){
        vc.setVisible(true);
    }
    public static void Volver(String n){
        if(n.equals("vi"))
            vi.dispose();
        else
            vc.dispose();
    }
    public static void Salir(){
        System.exit(0);
    }
    
}
