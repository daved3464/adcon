/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maria.brand
 */
public class Usuario {
    
    private String Nombre;
    private String Cedula;
    private String userName;
    private String Password;
    private String tipoUsuario;

    public Usuario(String nombre, String cedula, String username, String password) {
        this.Nombre = nombre;
        this.Cedula = cedula;
        this.userName = username;
        this.Password = password;
        tipoUsuario = this.getClass().getSimpleName();
    }
    
    public Boolean ValidarCredenciales(String username, String password){        
        return this.userName.equals(username) && this.Password.equals(password);              
    }
        
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String cedula) {
        this.Cedula = cedula;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }
    
    public String toString(){
       return "Nombre: " + this.Nombre+", C.C: " + this.Cedula; 
    }
    
}
