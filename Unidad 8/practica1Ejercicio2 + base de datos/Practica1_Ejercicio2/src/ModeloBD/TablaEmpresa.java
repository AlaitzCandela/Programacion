/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import java.sql.Connection;

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
        
        
        
        
}