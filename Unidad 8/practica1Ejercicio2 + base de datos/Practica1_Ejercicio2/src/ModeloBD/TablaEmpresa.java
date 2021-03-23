/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import Modelo.Empresa;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author 1GDAW07
 */
public class TablaEmpresa {
        Connection con;

    public TablaEmpresa(Connection con) {
        this.con = con;
    }

    public Connection getCon() {
        return con;
    }
     public boolean InsertarEmpresa(Empresa e) throws Exception{
        
        String plantillaEmpresa="INSERT INTO empresa VALUES(?,?,?);";
        PreparedStatement ps= con.prepareStatement(plantillaEmpresa);
        ps.setString(1,e.getNombreEmpresa());
        ps.setString(2,e.getDireccion());
        ps.setString(3,e.getNif());
        
        boolean ie=false;
        int n=ps.executeUpdate();
        ps.close();
        if(n!=1)
            throw new Exception("Fila no insertada");
        else ie=true;
        return ie;
    }   
        
        
        
}
