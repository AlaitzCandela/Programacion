
package ModeloBD;

import Modelo.Empresa;
import Modelo.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class TablaPersona {
    Connection con;

    public TablaPersona(Connection con) {
        this.con = con;
    }
    
    //get

    public Connection getCon() {
        return con;
    }
    
    public boolean Insertar(Persona p,Empresa e)throws Exception{
        boolean ip=false;
             String plantillaPersona="INSERT INTO persona VALUES(?,?,?,?);";
             PreparedStatement ps=con.prepareStatement(plantillaPersona);
             ps.setString(1,p.getNombre());
             ps.setString(2,p.getApellido());
             ps.setString(3,p.getDni());
             ps.setString(4,e.getNif());
             
             
             int n=ps.executeUpdate();
             ps.close();
             if(n!=1)
                 throw new Exception("Persona no insertada");
             else
                 ip=true;
        
       return ip;
        
    }
    
    
}
