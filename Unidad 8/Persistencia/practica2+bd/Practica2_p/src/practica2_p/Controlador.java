/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2_p;

import Modelo.BD.*;
import ModeloUML.*;
import Vista.*;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Persistence;
import javax.swing.JDialog;

/**
 *
 * @author Alaitzutzu
 */
public class Controlador {
//ModeloBD
    private static AbogadoJpaController abogadoBD;
    private static CasojuicioJpaController casoJuicioBD;
    private static ClienteJpaController clienteBD;
//ModeloUML
    private static Abogado ab;
    private static Casojuicio cj;
    private static Cliente c;
//vistas
    private static Vprincipal vp;
    private static Vista.Vabogado.ValtaAb altaAb;
    private static Vista.Vabogado.VbajaAb bajaAb;
    private static Vista.Vabogado.VmodificarAb modificarAb;
    private static Vista.Vabogado.VconsultaAb consultaAb;
            
    private static Vista.Vcliente.ValtaC altaC;
    private static Vista.Vcliente.VbajaC bajaC;
    private static Vista.Vcliente.VmodificarC modificarC;
    private static Vista.Vcliente.VconsultaC consultaC;
    
    private static Vista.VcasoJuicio.Valtacj altacj;
    private static Vista.VcasoJuicio.Vbajacj bajacj;
    private static Vista.VcasoJuicio.Vmodificarcj modificarcj;
    private static Vista.VcasoJuicio.Vconsultacj consultacj;
//ArrayList
    private static List <Abogado> listaAbogado;
    private static List <Cliente> listaClientes;
    private static List <Casojuicio> listaCasos;
    private static ArrayList <String> consulta;
//Array
    private static String [] datos;
    
    
    public static void main(String[] args) {
       abogadoBD=new AbogadoJpaController(Persistence.createEntityManagerFactory("Practica2_pPU"));
       casoJuicioBD= new CasojuicioJpaController (Persistence.createEntityManagerFactory("Practica2_pPU"));
       clienteBD= new ClienteJpaController(Persistence.createEntityManagerFactory("Practica2_pPU"));
       /**
        * Los pongo en el main no vaya a ser que quiera hacer alguna acción sin haber echo otra antes y me de un null pointer exception,es decir,
        * Imaginate que hago el new del abogado en dar alta abogado pero la siguiente vez que ejecute el programa quiera dar de baja el abogado
        * no tendre el new echo ya que lo he puesto para que se haga cuando se inserte el abogado en la base de datos*/
       ab=new Abogado();
       cj=new Casojuicio();
       c=new Cliente();
       
       vp=new Vprincipal();
       vp.setVisible(true);
    }
    //ABOGADO
    public static void ValtaAbogado(){
        altaAb=new Vista.Vabogado.ValtaAb(vp,true);
        altaAb.setVisible(true);
    }
    public static void AltaAbogado(String dni,String nombre,String apellido,String dir){
        ab.setDni(dni);
        ab.setNombre(nombre);
        ab.setApellido(apellido);
        ab.setDireccion(dir);
        try{
            abogadoBD.create(ab);
            /**
             * Una vez insertada el objeto abogado en la base de datos, borro los datos del objeto ab
             * para cuando la tenga que volver a usar los datos no se mezclen
             */
            ab.setDni("");
            ab.setNombre("");
            ab.setApellido("");
            ab.setDireccion("");
        }
        catch(Exception e){
            System.out.println(e.getMessage()+e.getClass());
        }
    }
    public static void VbajaAbogado(){
        bajaAb=new Vista.Vabogado.VbajaAb(vp, true);
        bajaAb.setVisible(true);
    }
    public static void BajaAbogado(String dni){
        try{
            abogadoBD.destroy(dni);
        }
         catch(Exception e){
            System.out.println(e.getMessage()+e.getClass());
        }
        
    }
    public static void VModificarAb(String dni){
       datos= new String [4];
        try{
           ab=abogadoBD.findAbogado(dni);
           datos[0]=ab.getDni();
           datos[1]=ab.getNombre();
           datos[2]=ab.getApellido();
           datos[3]=ab.getDireccion();
        }
         catch(Exception e){
            System.out.println(e.getMessage()+e.getClass());
        }
        modificarAb=new Vista.Vabogado.VmodificarAb(vp, true, datos);
        modificarAb.setVisible(true);
    }
    public static void ModificarAbogado(String [] AbogadoModificado){
        ab.setDni(AbogadoModificado[0]);
        ab.setNombre(AbogadoModificado[1]);
        ab.setApellido(AbogadoModificado[2]);
        ab.setDireccion(AbogadoModificado[3]);
        
         try{
            abogadoBD.edit(ab);
            ab.setDni("");
            ab.setNombre("");
            ab.setApellido("");
            ab.setDireccion("");
        }
         catch(Exception e){
            System.out.println(e.getMessage()+e.getClass());
        }
    }
    public static ArrayList ConsultaAb(){
        listaAbogado=new ArrayList();
     try{
        listaAbogado=abogadoBD.findAbogadoEntities();
     }
     catch(Exception e){
         System.out.println(e.getMessage());
     }
     consulta=new ArrayList();
      int x=0;
      for(x=0;x<listaAbogado.size();x++){
          consulta.add(listaAbogado.get(x).toString());
      }
        return consulta;
    }
    public static void VConsultaAb(){
        consultaAb=new Vista.Vabogado.VconsultaAb(vp, true);
        consultaAb.setVisible(true);
    }
    //CLIENTE
    public static void ValtaC(){
        altaC=new Vista.Vcliente.ValtaC(vp, true);
        altaC.setVisible(true);
    }
    public static void AltaCliente(String dni,String nombre,String apellido,String dir,int telef,String correo){
        c.setDni(dni);
        c.setNombre(nombre);
        c.setApellido(apellido);
        c.setDireccion(dir);
        c.setTelefono(telef);
        c.setCorreo(correo);
        
        try{
            clienteBD.create(c);
            c.setDni("");
            c.setNombre("");
            c.setApellido("");
            c.setDireccion("");
            c.setTelefono(Integer.parseInt(""));
            c.setCorreo("");
        }
        catch(Exception e){
         System.out.println(e.getMessage());
     }
    }
    public static void VbajaC(){
        bajaC=new Vista.Vcliente.VbajaC(vp, true);
        bajaC.setVisible(true);
    }
    public static void BajaCliente(String dni){
        try{
            clienteBD.destroy(dni);
        }
         catch(Exception e){
            System.out.println(e.getMessage()+e.getClass());
        }
    }
    public static ArrayList consultaCliente(){
        listaClientes=new ArrayList();
        consulta=new ArrayList();
         try{
           listaClientes=clienteBD.findClienteEntities();
           for(int x=0;x<listaClientes.size();x++){
               consulta.add(listaClientes.toString());
           }
        }
         catch(Exception e){
            System.out.println(e.getMessage()+e.getClass());
        }
        return consulta;
    }
    public static void VmodificarC(String dni){
        //Hago de nuevo el new del array datos porque nose si va a pasar por
        //modificar abogado y encima la capacidad es diferente
        datos=new String[6];
      
        try{
            c=clienteBD.findCliente(dni);
            datos[0]=c.getDni();
            datos[1]=c.getNombre();
            datos[2]=c.getApellido();
            datos[3]=c.getDireccion();
            datos[4]=Integer.toString(c.getTelefono());
            datos[5]=c.getCorreo();
            
        }
         catch(Exception e){
            System.out.println(e.getMessage()+e.getClass());
        }
        modificarC=new Vista.Vcliente.VmodificarC(vp, true,datos);
        modificarC.setVisible(true);
        
    }
    public static void ModificarCliente(ArrayList <String> ClienteModificado){
        c.setDni(ClienteModificado.get(0));
        c.setNombre(ClienteModificado.get(1));
        c.setApellido(ClienteModificado.get(2));
        c.setDireccion(ClienteModificado.get(3));
        c.setTelefono(Integer.parseInt(ClienteModificado.get(4)));
        c.setCorreo(ClienteModificado.get(5));
        try{
            clienteBD.edit(c);
        }
         catch(Exception e){
            System.out.println(e.getMessage()+e.getClass());
        }
    }
    public static void VconsultaC(){
        consultaC=new Vista.Vcliente.VconsultaC(vp, true);
        consultaC.setVisible(true);
    }
    //CASOS
    public static void Valtacj(){
        altacj=new Vista.VcasoJuicio.Valtacj(vp, true);
        altacj.setVisible(true);
    }
    public static ArrayList DatosCaso(){
        int nExp=(int)(Math.random()*1000);
       String numeroExpediente=Integer.toString(nExp);
       LocalDate fechaI=LocalDate.now();
       
      ArrayList <String> datosCaso=new ArrayList();
      datosCaso.add(numeroExpediente);
      datosCaso.add(fechaI.toString());
      
      return datosCaso;
    }
    public static void AltaCaso(int numExp,String fecha,String estado,String dniC,ArrayList DatosAbogados){
        cj.setNumExp(numExp);
        Date fechaInicio=Date.valueOf(LocalDate.parse(fecha));
        cj.setFechaInicio(fechaInicio);
        cj.setFechaFin(null);
        cj.setDniCliente(dniC);
        cj.setEstado(estado);
        for(int x=0;x<DatosAbogados.size();x++){
            ab.setDni(DatosAbogados.get(x).toString());
            listaAbogado.add(ab);
            ab.setDni("");
        }
        cj.setAbogadoList(listaAbogado);
        
        try{
            casoJuicioBD.create(cj);       
            cj.setNumExp(Integer.parseInt(""));
            cj.setDniCliente("");
            cj.setEstado("");
            cj.setFechaInicio(Date.valueOf(""));
            cj.setFechaFin(Date.valueOf(""));
            
            
        }
        catch(Exception e){
            System.out.println(e.getClass()+e.getMessage());
        }
    }
    public static void Vbajacj(){
        bajacj=new Vista.VcasoJuicio.Vbajacj(vp, true);
        bajacj.setVisible(true);
    }
    public static void BajaCaso(String numExp){
        try{
            casoJuicioBD.destroy(Integer.parseInt(numExp));
        }
        catch(Exception e){
            System.out.println(e.getClass()+e.getMessage());
        }
    }
    private static void Vmodificarcj(){
        modificarcj=new Vista.VcasoJuicio.Vmodificarcj(vp, true);
        modificarcj.setVisible(true);
    }
    public static void ModificarCaso(int numExp,String estado){
        cj.setNumExp(numExp);
        cj.setEstado(estado);
         try{
            casoJuicioBD.edit(cj);
        }
        catch(Exception e){
            System.out.println(e.getClass()+e.getMessage());
        }
    }
    public static void Vconsultacj(){
        consultacj=new Vista.VcasoJuicio.Vconsultacj(vp, true);
        consultacj.setVisible(true);
    }
    public static List ConsultaCasos(){
         listaCasos=new ArrayList();
        try{
           listaCasos=casoJuicioBD.findCasojuicioEntities();
           for(int x=0;x<listaCasos.size();x++){
               consulta.add(listaCasos.get(x).toString());
           }
        }
        catch(Exception e){
            System.out.println(e.getClass()+e.getMessage());
        }
        return listaCasos;
    }
    public static void Volver(JDialog jd ){
        jd.dispose();
    }
    public static void Salir(){
        System.exit(0);
    }
    
}
