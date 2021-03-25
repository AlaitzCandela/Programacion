/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import java.sql.Connection;
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
}
