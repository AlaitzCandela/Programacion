/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import Modelo.Cliente;
import java.util.Arrays;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author 1GDAW07
 */
public class TablaCliente {
    Connection con;
   
    //constructor

    public TablaCliente(Connection con) {
        this.con = con;
    }
    //get

    public Connection getCon() {
        return con;
    }
    
    public boolean Insertar(Cliente c) throws Exception{
        String plantilla="INSERT INTO cliente VALUES(?,?,?,?,?,?);";
       PreparedStatement ps=con.prepareStatement(plantilla);
        ps.setString(1, c.getDni());
        ps.setString(2, c.getNombre());
        ps.setString(3,c.getApellido());
        ps.setString(4, c.getDireccion());
        ps.setInt(5, c.getTelefono());
        ps.setString(6, c.getCorreo());
        
        boolean i=false;
        int n=ps.executeUpdate();
        if(n!=1)
            throw new Exception("Fila no insertada");
        else
            i=true;
       
        return i;
        
    }
    public boolean BorrarCliente(Cliente c) throws Exception{
        String plantilla="DELETE FROM cliente WHERE lower(dni)=?;";
        PreparedStatement ps=con.prepareStatement(plantilla);
        ps.setString(1, c.getDni());
        
        boolean d=false;
        int n=ps.executeUpdate();
        if(n!=1)
            throw new Exception("Fila no borrada");
        else
            d=true;
        
        return d;
    }
    public Cliente [] Consulta(String atributo,String dato) throws Exception{
    String plantilla="";   
     plantilla="SELECT * FROM cliente WHERE lower("+atributo+")=?;";
     PreparedStatement ps=con.prepareStatement(plantilla);
     ps.setString(1,dato);
     ResultSet resultado=ps.executeQuery();
       Cliente [] datos=new Cliente[1];
     while(resultado.next()){
         Cliente c=new Cliente();
         c.setDni(resultado.getString("Dni"));
             c.setNombre(resultado.getString("Nombre"));
             c.setApellido(resultado.getString("Apellido"));
             c.setDireccion(resultado.getString("Direccion"));
             c.setTelefono(resultado.getInt("Telefono"));
             c.setCorreo(resultado.getString("Correo"));
               datos[0]=c;
     }
            return datos;  
    }
     public Cliente [] ConsultaI(String atributo,int dato) throws Exception{
    String plantilla="";   
     plantilla="SELECT * FROM cliente WHERE lower("+atributo+")=?;";
     PreparedStatement ps=con.prepareStatement(plantilla);
     ps.setInt(1,dato);
     ResultSet resultado=ps.executeQuery();
       Cliente [] datos=new Cliente[1];
     while(resultado.next()){
           Cliente c=new Cliente();
         c.setDni(resultado.getString("Dni"));
             c.setNombre(resultado.getString("Nombre"));
             c.setApellido(resultado.getString("Apellido"));
             c.setDireccion(resultado.getString("Direccion"));
             c.setTelefono(resultado.getInt("Telefono"));
             c.setCorreo(resultado.getString("Correo"));
               datos[0]=c;
     }
            return datos;  
    }
    public ArrayList ConsultaGeneral () throws Exception{
        String plantilla="SELECT * FROM cliente;";
        PreparedStatement ps=con.prepareStatement(plantilla);
        ResultSet resultado=ps.executeQuery();
       ArrayList <Cliente> listaC=new ArrayList();
        while(resultado.next()){
            Cliente c=new Cliente();
             c.setDni(resultado.getString("Dni"));
             c.setNombre(resultado.getString("Nombre"));
             c.setApellido(resultado.getString("Apellido"));
             c.setDireccion(resultado.getString("Direccion"));
             c.setTelefono(resultado.getInt("Telefono"));
             c.setCorreo(resultado.getString("Correo"));
               listaC.add(c);
        }
        return listaC;
    }
    public boolean ModificarDatos(String [] l) throws Exception{
        String plantilla="UPDATE cliente SET Dni=?,Nombre=?,Apellido=?,Direccion=?,Telefono=?,Correo=? WHERE lower(dni)=?;";
        PreparedStatement ps=con.prepareStatement(plantilla);
        ps.setString(1, l[0]);
        ps.setString(2, l[1]);
        ps.setString(3, l[2]);
        ps.setString(4, l[3]);
        ps.setString(5, l[4]);
        ps.setString(6, l[5]);
        ps.setString(7, l[0]);
        
        boolean m=false;
        int n=ps.executeUpdate();
        if(n!=1)
            throw new Exception("La fila no ha sido modificada");
        else
            m=true;
        return m;
                    
        
    }
}
