
package BaseDeDatos;

import Modelo.Persona;
import java.sql.*;
import java.util.ArrayList;

public class TablaPersona {
    private Connection con;
    
    //constructor

    public TablaPersona(Connection con) {
        this.con = con;
    }
    //insertar
    public void Insertar(Persona p)throws Exception{
        String plantilla="INSERT INTO personas VALUES(?,?,?,?);";
        PreparedStatement ps=con.prepareStatement(plantilla);
        ps.setString(1,p.getNombre());
        ps.setInt(2,p.getEdad());
        ps.setString(3,p.getProfesion());
        ps.setInt(4,p.getTelefono());
        
        int n=ps.executeUpdate();
        ps.close();
        if(n !=1){
            throw new Exception("El numero de filas actualizadas no es 1");
        }
    }
    //consultar datos de una persona
    public Persona ConsultarDatos(Persona p) throws Exception{
        String plantilla="SELECT * FROM personas WHERE lower(nombre)=?;";
        PreparedStatement ps=con.prepareStatement(plantilla);
        ResultSet resultado=ps.executeQuery();
        while(resultado.next()){
             p=new Persona();
             p.setNombre(resultado.getString("Nombre"));
             p.setEdad(resultado.getInt("Edad"));
             p.setProfesion(resultado.getString("Profesion"));
             p.setTelefono(resultado.getInt("Telefono"));
               
        }
        return p;
    }
    //consultar Todas las personas
    public ArrayList<Persona> Consultar(Persona p) throws Exception{
        ArrayList<Persona> lista=new ArrayList();
        String plantilla="SELECT * FROM personas;";
        PreparedStatement ps=con.prepareStatement(plantilla);
        ResultSet resultado=ps.executeQuery();
        while(resultado.next()){
            p=new Persona();
            p.setNombre(resultado.getString("Nombre"));
             p.setEdad(resultado.getInt("Edad"));
             p.setProfesion(resultado.getString("Profesion"));
             p.setTelefono(resultado.getInt("Telefono"));
             
             lista.add(p);
        }
       
        return lista;
    }
    
    
}
