/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import Modelo.*;
import java.sql.Connection;
import java.sql.PreparedStatement;


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
    
}
