/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author juanl
 */
public class Administrador {
    //Atributos
    private String usuario;
    private String contraseña;
    
    
    //Constructor
    public Administrador(){
        this.usuario="admin";
        this.contraseña="12345";
    }
    
    
    //Setters
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
    //Getters
    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }
    
    
}
