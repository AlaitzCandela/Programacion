
package BaseDeDatos;

import java.sql.*;


public class BaseDatos {
    private Connection con;
    //constructor

    public BaseDatos() {
    }
    //get

    public Connection getCon() {
        return con;
    }
    
    //conectar con la BD
    public void Conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String bd="Practica1";
            String url="jdbc:mysql://localhost:3306/"+bd;
            String login="root";
            String password="usbw";
            con=DriverManager.getConnection(url, login, password);
        }
        catch(Exception e){
            System.out.println(e.getClass()+e.getMessage());
        }
    }
    //desconectar de la base de datos
    public void Desconectar(){
        try{
            con.close();
        }
        catch(Exception e){
            System.out.println(e.getClass()+e.getMessage());
        }
        
    }
    
}
