
package Modelo;

import java.time.LocalDate;


public class Contrato {
    private String tipo;
    
    
    //constructor

    public Contrato(String tipo) {
        this.tipo = tipo;
        
    }

    public Contrato() {
    }
    
    //get-set

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   
   
    
}
