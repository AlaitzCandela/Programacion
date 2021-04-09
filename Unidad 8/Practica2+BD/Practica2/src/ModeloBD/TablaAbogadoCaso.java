/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import Modelo.Abogado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList; 

/**
 *
 * @author 1GDAW07
 */
public class TablaAbogadoCaso {
    Connection con;

    public TablaAbogadoCaso(Connection con) {
        this.con = con;
    }

    public Connection getCon() {
        return con;
    }
    
    public boolean Insertar(Abogado a,int numExp) throws Exception{
        String plantilla="INSERT INTO abogadocaso VALUES(?,?);";
        PreparedStatement ps=con.prepareStatement(plantilla);
         ps.setInt(1, numExp);
         ps.setString(2,a.getDni());
         int n=ps.executeUpdate();
        
        boolean insertarAbDni=false;
       
        if(n!=1)
            throw new Exception("La fila no ha sido insertada");
        else
            insertarAbDni=true;
        
        return insertarAbDni;
        
    }
}
