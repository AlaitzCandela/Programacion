/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import java.sql.Connection;


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
    
    
}
