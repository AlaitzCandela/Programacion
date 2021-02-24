
package practica5;

import Modelo.*;
import Vista.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;



public class Controlador {
    private static Vgestion vg=new Vgestion();
private static ArrayList <Empleado>empleados=new ArrayList();
private static ArrayList <Departamento>departamentos=new ArrayList();
private static ArrayList <Contrato>contratos =new ArrayList();
private static ArrayList <Usuarios> usuarios=new ArrayList();
private static int p=0;
private static String n;
private static String a;
private static VAlta va=new VAlta();
    public static void main(String[] args) {
     Datos();
        
      vg.setVisible(true);
      
    }
    public static void Datos(){
        //usuarios
        Usuarios u1=new Usuarios("AlaitzCandela","12345678A");
        Usuarios u2=new Usuarios("MariaRamirez","54723892M");
        usuarios.add(u1);
        usuarios.add(u2);
        //contratos
        Contrato c1=new Contrato("Indefinido");
        Contrato c2=new Contrato("Temporal");
        Contrato c3=new Contrato("Por obra");
        Contrato c4=new Contrato("Eventual");
        Contrato c5=new Contrato("Interinidad");
        Contrato c6=new Contrato("Relevo");
        Contrato c7=new Contrato("Formación y aprendizaje");
        Contrato c8=new Contrato("Practicas");
        contratos.add(c1);
        contratos.add(c2);
        contratos.add(c3);
        contratos.add(c4);
        contratos.add(c5);
        contratos.add(c6);
        contratos.add(c7);
        contratos.add(c8);
        
        //departamentos
        Departamento d1=new Departamento("Programador",1);
        Departamento d2=new Departamento("Contador",2);
        Departamento d3=new Departamento("Administrador",3);
        departamentos.add(d1);
        departamentos.add(d2);
        departamentos.add(d3);

        //empleados
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Empleado e1=new Empleado("Alaitz","Candela Murelaga",8742,"58047174G","F","Soltero",111111111,"avd 8 de marzo",0000,LocalDate.parse("01/09/2010",formatter),c1,d1,u1);
        Empleado e2 =new Empleado("Maria","Ramirez Redondo",7284,"63826482J","F","Casado",739546382,"calle andalucia 23",1234,LocalDate.parse("09/09/2005",formatter),c3,d2,u2);
       
        empleados.add(e1);
        empleados.add(e2);
        
    }
 
    public static boolean Usuario(String usuario){
        boolean u=true;
        
        int x=0;
        for(x=0;x< empleados.size()&&!usuario.equals(empleados.get(x).getU().getUsuario());x++){}
        if(x!=empleados.size()){
            u=true;
            p=x;
        }
        else{
            u=false;
        }
        
        return u;
    }
    public static boolean Contraseña(String contraseña){
       boolean c=true;
        if(contraseña.equals(empleados.get(p).getU().getContraseña())){
            c=true;
        }
        else{
            c=false;
        }
        return c;
    }
    public static void Inicio(){
        vg.dispose();
        Vinicio vi=new Vinicio();
        vi.setVisible(true);
    }
    public static void TipoContrato(JComboBox CBtipoContrato){
        int x=0;
        for(x=0;x<contratos.size();x++){
            CBtipoContrato.addItem(contratos.get(x).getTipo());
        }
    }
    public static void Departamento(JComboBox CBdepartamento){
        int x=0;
        for(x=0;x<departamentos.size();x++){
            CBdepartamento.addItem(departamentos.get(x).getNumdepartamento());
        }
    }
    public static boolean Numemple(int n){
       int x=0;
       boolean s=true;        
       for(x=0;x<empleados.size()&&n!=empleados.get(x).getNumempleado();x++){}
        if(x!=empleados.size()){
            s=true;
        }
        else{
            s=false;
        }
        return s;
    }
   public static boolean TenDatos(String dni,int nss,String nombre, String apellidos,int telefono,String sexo,String estado,String tipoContrato,int departamento, LocalDate fechaAlta, int numempleado,String dir){
       boolean añadir=true;
       int tamaño=0;
       Usuarios u=new Usuarios();
       Contrato c=new Contrato();
       Departamento d= new Departamento();
       n=nombre;
       a=apellidos;
       tamaño=empleados.size();
       int x=0;
       for(x=0;x<contratos.size()&& !tipoContrato.equals(contratos.get(x));x++){}
       if(x!=contratos.size()){
           c=contratos.get(x);
       }
        for(x=0;x<departamentos.size()&& departamento!=departamentos.get(x).getNumdepartamento();x++){}
       if(x!=contratos.size()){
           d=departamentos.get(x);
       }
       Empleado e=new Empleado(nombre,apellidos,nss,dni,sexo,estado,telefono,dir,numempleado,fechaAlta,c,d,u);
       empleados.add(e);
       if(empleados.size()>tamaño){
           añadir=true;
       }
       else{
           añadir=false;
       }
       return añadir;
   }
  public static Usuarios CrearUsuario(){
        int c=0;
        int cont=0;
        int x=0;
        String letra=" ";
        for(x=0;x<8;x++){
           c=(int)(Math.random()*10);
           cont+=c;
        }
        for(int y=0;y<1;y++){
            letra=Character.toString(n.charAt(0));
        }
        
        String usuario=n+a;
        String contraseña= cont+letra;
        Usuarios u= new Usuarios(usuario,contraseña);
        usuarios.add(u);
        return u;
    }
  public static void AceptarAlta(){
      va.dispose();
      Vinicio vi=new Vinicio();
      vi.setVisible(true);
  }
  public static ArrayList Empleados(){
      return empleados;
      
  }
  public static boolean DarBaja(Empleado objeto, int p){
      boolean z=true;
      Usuarios u= new  Usuarios();
       u=empleados.get(p).getU();
       usuarios.remove(u);
       empleados.remove(objeto);
      
      return z;
  }
  public static ArrayList TenContrato(String c){
      int x=0;
      ArrayList <Empleado> e=new ArrayList();
      for(x=0;x<contratos.size() && !c.equals(empleados.get(x).getC().getTipo());x++){
          if(c.equals(empleados.get(x).getC().getTipo())){
             e.add(empleados.get(x));
          }
      }
      return e;
  }
  public static ArrayList TenDepartamento(int d){
      int x=0;
      ArrayList <Empleado> dep=new ArrayList();
      for(x=0;x<contratos.size() && d!=(empleados.get(x).getD().getNumdepartamento());x++){
          if(d==(empleados.get(x).getD().getNumdepartamento())){
             dep.add(empleados.get(x));
          }
      }
      return dep;
  }
  public static ArrayList GetDatos(int p){
      ArrayList e=new ArrayList();
      e.add(empleados.get(p));
      return e;
  }
  public static void Salir(){
        System.exit(0);
    }
    
}
