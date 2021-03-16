
package ModeloBD;

import java.sql.Connection;


public class TablaPersona {
    Connection con;

    public TablaPersona(Connection con) {
        this.con = con;
    }
    
    //get

    public Connection getCon() {
        return con;
    }
    
}
