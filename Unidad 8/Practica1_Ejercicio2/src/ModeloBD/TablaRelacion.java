/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import Modelo.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class TablaRelacion {
    Connection con;
    //constructor

    public TablaRelacion(Connection con) {
        this.con = con;
    }
    //get

    public Connection getCon() {
        return con;
    }
    
    public boolean Insertar(Persona p,Evento e) throws Exception{
        boolean r=false;
        String plantilla="INSERT INTO relacioneventopersona VALUES(?,?);";
        PreparedStatement ps=con.prepareStatement(plantilla);
        ps.setString(1,p.getDni());
        ps.setString(2,e.getNombre());
        
        int n=ps.executeUpdate();
        ps.close();
         if(n!=1)
            throw new Exception("La Relacion no se ha guardado");
        else
            r=true;
        return r;
    }
     public ArrayList getP(Evento e) throws Exception{
        String plantilla="SELECT * FROM relacioneventopersona WHERE lower(Nombre)=?;";
        PreparedStatement ps=con.prepareStatement(plantilla);
        ps.setString(1,e.getNombre());
        ResultSet resultado=ps.executeQuery();
       ArrayList <String> personas=new ArrayList();
        for(int x=0;resultado.next();x++){
            personas.add(resultado.getString(x));
        }
        return personas;
     }
    
}
