/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import Modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author 1GDAW07
 */
public class TablaCliente {
    Connection con;
   
    //constructor

    public TablaCliente(Connection con) {
        this.con = con;
    }
    //get

    public Connection getCon() {
        return con;
    }
    
    public boolean Insertar(Cliente c) throws Exception{
        String plantilla="INSERT INTO cliente VALUES(?,?,?,?,?,?);";
       PreparedStatement ps=con.prepareStatement(plantilla);
        ps.setString(1, c.getDni());
        ps.setString(2, c.getNombre());
        ps.setString(3,c.getApellido());
        ps.setString(4, c.getDireccion());
        ps.setInt(5, c.getTelefono());
        ps.setString(6, c.getCorreo());
        
        boolean i=false;
        int n=ps.executeUpdate();
        if(n!=1)
            throw new Exception("Fila no insertada");
        else
            i=true;
       
        return i;
        
    }
    public boolean BorrarCliente(Cliente c) throws Exception{
        String plantilla="DELETE * FROM cliente WHERE lower(dni)=?;";
        PreparedStatement ps=con.prepareStatement(plantilla);
        
        
    }
}
