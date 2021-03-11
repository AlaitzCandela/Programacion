
package practica1_ejercicio1;

import BaseDeDatos.*;
import Modelo.Persona;
import Vista.*;
import java.util.ArrayList;


public class Controlador {
private static BaseDatos bd;
private static TablaPersona tp;

private static Persona p=new Persona();

private static ArrayList lista=new ArrayList();

private static Vprincipal vp=new Vprincipal();
private static Vinsertar vi=new Vinsertar(vp,true);
private static Vconsulta vc;
private static VconsultaTotal vct;

    
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
    public static void ConsultarDatos(String n)throws Exception{
       Persona persona=new Persona();
       persona=new Persona(n);
       p=tp.ConsultarDatos(persona);
       String datos=p.toString();
       vc=new Vconsulta(vp,true,datos);
       vc.setVisible(true);
        
    }
    public static void Consulta() throws Exception{
        lista=tp.Consultar();
        vct=new VconsultaTotal(vp,true,lista);
        
        vct.setVisible(true);
    }
    public static void Volver(String n){
        if(n.equals("vi"))
            vi.dispose();
        else
            if(n.equals("vc"))
                vc.dispose();
            else
                vct.dispose();
    }
    public static void Salir(){
        System.exit(0);
    }
    
}
