/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controlador;

/**
 *
 * @author ecoitino
 */
public interface VistaLoginInterface {
    
    public void login(String nombreUsuario, String password);
    
    public void llamarProximoCasoUso(Object obj);
    
    public void mostrarError(String msg);
    
    public void cerrar();
              
}
