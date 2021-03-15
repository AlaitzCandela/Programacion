
package ModeloBD;

import Modelo.Evento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Time;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;





public class TablaEventos {
    Connection con;

    public TablaEventos(Connection con) {
        this.con = con;
    }

    public Connection getCon() {
        return con;
    }
    
    
    public boolean GuardarEvento(Evento e) throws Exception{
        String plantilla="INSERT INTO eventos VALUES(?,?,?,?,?,?);";
        PreparedStatement ps=con.prepareStatement(plantilla);
        Date date = Date.valueOf(e.getFecha());
        Time t1=Time.valueOf(e.getHoraInicio());
        Time t2=Time.valueOf(e.getHoraFinal());
        ps.setString(1,e.getNombre());
        ps.setString(2,e.getLugar());
        ps.setDate(3,date);
        ps.setTime(4,t1);
        ps.setTime(5,t2);
        ps.setInt(6,(e.getAforo()));
        
        int n=ps.executeUpdate();
        ps.close();
       
        boolean guardar=true;
        if(n!=1)
            throw new Exception("La fila no ha sido guardada");
        else
           guardar=true;
        
           return guardar;
        
    }
    public boolean CancelarEvento(Evento e) throws Exception{
        String plantilla="DELETE FROM eventos WHERE lower(Nombre)=?;";
        PreparedStatement ps=con.prepareStatement(plantilla);
        ps.setString(1, e.getNombre());
        int n=ps.executeUpdate();
        boolean borrar;
        if(n!=1)
            throw new Exception("La fila no ha sido guardada");
        else
           borrar =true;
        
           return borrar;
    }
    public Evento Consultar(Evento e) throws Exception{
        String plantilla="SELECT * FROM eventos WHERE lower(Nombre)=?;";
        PreparedStatement ps=con.prepareStatement(plantilla);
        ps.setString(1,e.getNombre());
        ResultSet resultado=ps.executeQuery();
        while(resultado.next()){
            e=new Evento();
            e.setNombre(resultado.getString("Nombre"));
            e.setLugar(resultado.getString("Lugar"));
            e.setFecha(resultado.getDate("Fecha").toLocalDate());
            e.setHoraInicio(resultado.getTime("HoraInicio").toLocalTime());
            e.setHoraFinal(resultado.getTime("HoraFin").toLocalTime());
            e.setAforo(resultado.getInt(Integer.parseInt("Aforo")));
            
        }
        return e;
        
    }
    public ArrayList<Evento> ConsultarDatos() throws Exception{
        String plantilla="SELECT * FROM eventos ;";
        PreparedStatement ps=con.prepareStatement(plantilla);
        ResultSet resultado=ps.executeQuery();
        ArrayList <Evento> eventos=new ArrayList();
        while(resultado.next()){
            Evento ev=new Evento();
            ev.setNombre(resultado.getString("Nombre"));
            eventos.add(ev);
            
        }
        return eventos;
        
    }
    public void Modificar() throws Exception{
        String plantilla="UPDATE eventos (Lugar,Fecha,HoraInicio,HoraFinal,Aforo) VALUES=(?,?,?,?,?);";
        PreparedStatement ps=con.prepareStatement(plantilla);
        
    }
    
}
