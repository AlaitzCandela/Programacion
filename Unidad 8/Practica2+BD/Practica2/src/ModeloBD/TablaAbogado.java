/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import Modelo.Abogado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author 1GDAW07
 */
public class TablaAbogado {
    Connection con;

    public TablaAbogado(Connection con) {
        this.con = con;
    }

    public Connection getCon() {
        return con;
    }
    public boolean Insertar(Abogado a) throws Exception{
        String plantilla="INSERT INTO abogado VALUES(?,?,?,?);";
        PreparedStatement ps=con.prepareStatement(plantilla);
        ps.setString(1, a.getDni());
        ps.setString(2,a.getNombre());
        ps.setString(3,a.getApellido());
        ps.setString(4,a.getDireccion());
        
        boolean Iabogado=false;
        int n=ps.executeUpdate();
        if(n!=1)
            throw new Exception("Fila no insertada");
        else
            Iabogado=true;     
        return Iabogado;
    }
    public boolean Borrar(Abogado a) throws Exception{
        String plantilla="DELETE FROM abogado WHERE lower(dni)=?;";
        PreparedStatement ps=con.prepareStatement(plantilla);
        ps.setString(1, a.getDni());
        
        boolean d=false;
        int n=ps.executeUpdate();
        if(n!=1)
            throw new Exception("Fila no borrada");
        else
            d=true;
        
        return d;
    }
    public Abogado [] Consulta(String atributo,String dato) throws Exception{
    String plantilla="";   
     plantilla="SELECT * FROM abogado WHERE lower("+atributo+")=?;";
     PreparedStatement ps=con.prepareStatement(plantilla);
     ps.setString(1,dato);
     ResultSet resultado=ps.executeQuery();
      
       Abogado [] datos=new Abogado[1];
     while(resultado.next()){
         Abogado a=new Abogado();
         a.setDni(resultado.getString("Dni"));
             a.setNombre(resultado.getString("Nombre"));
             a.setApellido(resultado.getString("Apellido"));
             a.setDireccion(resultado.getString("Direccion"));
               datos[0]=a;
     }
            return datos;  
    }
     public Abogado [] ConsultaI(String atributo,int dato) throws Exception{
    String plantilla="";   
     plantilla="SELECT * FROM abogado WHERE lower("+atributo+")=?;";
     PreparedStatement ps=con.prepareStatement(plantilla);
     ps.setInt(1,dato);
     ResultSet resultado=ps.executeQuery();
      
       Abogado [] datos=new Abogado[1];
     while(resultado.next()){
         Abogado a=new Abogado();
         a.setDni(resultado.getString("Dni"));
             a.setNombre(resultado.getString("Nombre"));
             a.setApellido(resultado.getString("Apellido"));
             a.setDireccion(resultado.getString("Direccion"));
               datos[0]=a;
     }
            return datos;  
    }
    public ArrayList ConsultaGeneral () throws Exception{
        String plantilla="SELECT * FROM abogado;";
        PreparedStatement ps=con.prepareStatement(plantilla);
        ResultSet resultado=ps.executeQuery();
       
       ArrayList <Abogado> listaA=new ArrayList();
        while(resultado.next()){
            Abogado a=new Abogado ();
             a.setDni(resultado.getString("Dni"));
             a.setNombre(resultado.getString("Nombre"));
             a.setApellido(resultado.getString("Apellido"));
             a.setDireccion(resultado.getString("Direccion"));
               listaA.add(a);
        }
        return listaA;
    }
  
    public boolean ModificarDatos(String [] l) throws Exception{
        String plantilla="UPDATE abogado SET Dni=?,Nombre=?,Apellido=?,Direccion=? WHERE lower(dni)=?;";
        PreparedStatement ps=con.prepareStatement(plantilla);
        ps.setString(1, l[0]);
        ps.setString(2, l[1]);
        ps.setString(3, l[2]);
        ps.setString(4, l[3]);
        ps.setString(5, l[0]);
        
        boolean m=false;
        int n=ps.executeUpdate();
        if(n!=1)
            throw new Exception("La fila no ha sido modificada");
        else
            m=true;
        return m;
                    
        
    }
}
