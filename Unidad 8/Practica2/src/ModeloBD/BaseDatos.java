
package ModeloBD;

import java.sql.Connection;
import java.sql.DriverManager;


public class BaseDatos {
    Connection con;
    
    //Constructor

    public BaseDatos() {
    }

    
    
    //get

    public Connection getCon() {
        return con;
    }
    //conectar
    public void ConectarCon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String bd="practica_2";
            String url="jdbc:mysql://localhost:3306/"+bd;
            String login="root";
            String passwd="usbw";
            con=DriverManager.getConnection(url, login, passwd);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void DesconectarCon(){
        try{
            con.close();
        }
       catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
