/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import Controlador.Controlador;
import Modelo.CasoJuicio;
import Modelo.Cliente;
import Modelo.EstadoCaso;
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
    public boolean Delete(String numExp) throws Exception{
        String plantilla="DELETE FROM casojuicio WHERE lower(NumExpediente)=?;";
        PreparedStatement ps=con.prepareStatement(plantilla);
        ps.setString(1, numExp);
        int n=ps.executeUpdate();
       boolean delete=false;
        if(n!=1)
            throw new Exception("Fila no borrada");
        else
            delete=true;
        return delete;
    }
    public ArrayList <CasoJuicio> Select() throws Exception{
        String plantilla="SELECT* FROM casojuicio";
        PreparedStatement ps=con.prepareStatement(plantilla);
        ResultSet resultado=ps.executeQuery();
       
        ArrayList <CasoJuicio> listaCasos=new ArrayList();
        while(resultado.next()){
             CasoJuicio cj=new CasoJuicio();
            cj.setNumExp(resultado.getInt("NumExpediente"));
            cj.setFechaInicio(resultado.getDate("FechaInicio").toLocalDate());
            cj.setEstado(EstadoCaso.valueOf(resultado.getString("Estado")));
            cj.setC(Controlador.getCliente(resultado.getString("DniCliente")));
            listaCasos.add(cj);
            
        }
        return listaCasos;
    }
    public boolean Update(CasoJuicio cj) throws Exception{
        String plantilla="UPDATE casojuicio SET Estado=? WHERE NumExpediente=?;";
        PreparedStatement ps=con.prepareStatement(plantilla);
        ps.setString(1, cj.getEstado().toString());
        ps.setInt(2,cj.getNumExp());
        
        boolean update=false;
        int n=ps.executeUpdate();
        if(n!=1)
            throw new Exception ("Fila no actualizada");
        else
            update=true;
        return update;
    }
}
