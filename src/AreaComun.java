/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maria.brand
 */
public class AreaComun {
    String Nombre;
    Boolean Disponible;
    

    public AreaComun(String nombre, String estado) {
        this.Nombre = nombre;
        this.Disponible = true;
        
    }

    public String getNombreAC() {
        return Nombre;
    }

    public void setNombreAC(String nombre) {
        this.Nombre = nombre;
    }

    public Boolean getEstado() {
        return true;
    }

    public void setEstado(Boolean estado) {
        this.Disponible = estado;
    }
    
    public String toString(){
       return this.Nombre+" , " + this.Disponible; 
    }

    
    
}
