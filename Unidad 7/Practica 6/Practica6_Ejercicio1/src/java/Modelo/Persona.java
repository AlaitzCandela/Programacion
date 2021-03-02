
package Modelo;


public class Persona {
    private String usuario;
    private String contraseña;
    //constructor

    public Persona(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
    //get-set

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
}
