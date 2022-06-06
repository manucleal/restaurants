/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author faustoperillo
 */
public abstract class TipoCliente {
    
    private String nombre;
    private String nombreBeneficio;

    public TipoCliente(String nombre, String nombreBeneficio) {
        this.nombre = nombre;
        this.nombreBeneficio = nombreBeneficio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreBeneficio() {
        return nombreBeneficio;
    }
    
    public abstract void obtenerBeneficio();
    
}
