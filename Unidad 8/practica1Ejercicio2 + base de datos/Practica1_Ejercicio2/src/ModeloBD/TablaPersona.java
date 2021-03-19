
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
        
        boolean ie=false;
        ie=InsertarEmpresa(e);
        if(ie==true){
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
        }
       return ip;
        
    }
    public boolean InsertarEmpresa(Empresa e) throws Exception{
        BaseDatos bd=new BaseDatos();
        TablaEmpresa te=new TablaEmpresa(bd.getCon());
       
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
