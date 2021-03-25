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
    public void Consulta(String nombre) throws Exception{
    String plantilla="";   
     if(nombre.equals("Dni"))
         plantilla="SELECT * FROM cliente WHERE lower(dni)=?;";
     else
          if(nombre.equals("Nombre"))
                 plantilla="SELECT * FROM cliente WHERE lower(Nombre)=?;";
             else
                 if(nombre.equals("Apellido"))
                     plantilla="SELECT * FROM cliente WHERE lower(Apellido)=?;";
                 else
                     if(nombre.equals("Direccion"))
                         plantilla="SELECT * FROM cliente WHERE lower(Direccion)=?;";
                     else
                         if(nombre.equals("Telefono"))
                             plantilla="SELECT * FROM cliente WHERE lower(Telefono)=?;";
                         else
                             if(nombre.equals("Correo"))
                                 plantilla="SELECT * FROM cliente WHERE lower(Correo)=?;";
     
     PreparedStatement ps=con.prepareStatement(plantilla);
   
             
             
        
           
        
    }
    public ArrayList ConsultaGeneral () throws Exception{
        String plantilla="SELECT * FROM cliente;";
        PreparedStatement ps=con.prepareStatement(plantilla);
        ResultSet resultado=ps.executeQuery();
       Cliente c=new Cliente();
       ArrayList <Cliente> listaC=new ArrayList();
        while(resultado.next()){
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
}
