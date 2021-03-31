/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import Modelo.CasoJuicio;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author 1GDAW07
 */
public class TablaCasoJuicio {
    Connection con;

    public TablaCasoJuicio(Connection con) {
        this.con = con;
    }

    public Connection getCon() {
        return con;
    }
    public boolean NumExpediente(int num) throws Exception {
        String plantilla="SELECT DniCliente FROM casojuicio WHERE lower(NumExpediente)=?;";
        PreparedStatement ps=con.prepareStatement(plantilla);
        ps.setInt(1,num);
        
        boolean Nexpediente=false;
        ResultSet resultado=ps.executeQuery();
       
        if(resultado.next())
            Nexpediente=false;
        else
            Nexpediente=true;
        
        return Nexpediente;
    }
    public boolean Insertar(CasoJuicio cj) throws Exception{
        boolean insertar=false;
        String plantilla="INSERT INTO casojuicio VALUES(?,?,?,?,?);";
        PreparedStatement ps=con.prepareStatement(plantilla);
       Date fechaI=Date.valueOf(cj.getFechaInicio());
       
        
        ps.setInt(1, cj.getNumExp());
        ps.setDate(2,fechaI);
        ps.setDate(3, null);
        ps.setString(4, cj.getEstado().toString());
        ps.setString(5, cj.getC().getDni());
        
        int n=ps.executeUpdate();
        if(n!=1)
            throw new Exception ("La fila CasoJuicio no ha sido insertada");
        else
            insertar=true;
        return insertar;
    }
}
