/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import modelo.DatosPrueba;
import vistaEscritorio.VistaMenu;

/**
 *
 * @author ecoitino
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DatosPrueba.cargar();
        new VistaMenu().setVisible(true);
    }
    
}
