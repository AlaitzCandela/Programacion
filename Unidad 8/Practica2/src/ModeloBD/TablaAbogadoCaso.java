/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import java.sql.Connection;
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
    
    public void Insertar(ArrayList listaAbogado,String dni){
        String plantilla="INSERT INTO abogadocaso VALUES(?,?);";
        PreparedStatement ps
    }
}
