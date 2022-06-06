/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Conexion;
import modelo.Fachada;
import modelo.Mesa;
import modelo.Mozo;
import modelo.Producto;
import modelo.RestaurantException;
import modelo.Transferencia;
import static modelo.Transferencia.eventos.nuevaTranferencia;
import observador.Observable;
import observador.Observador;
import vistaEscritorio.VistaMozo;

/**
 *
 * @author ecoitino
 */
public class ControladorMozo implements Observador {

    private VistaMozo vistaMozo;
    private Conexion conexion;
    private Mozo modelo;
    private Mesa mesaSeleccionada;

    public ControladorMozo(VistaMozo vista, Conexion conexion) {
        this.vistaMozo = vista;
        this.conexion = conexion;
        this.modelo = (Mozo)conexion.getUsuario();
        this.modelo.agregarObservador(this);
        inicializarVista();
    }

    private void inicializarVista() {
        vistaMozo.setLocationRelativeTo(null);
        vistaMozo.mostrarNombreUsuario(conexion.getUsuario().getNombreCompleto());
        vistaMozo.mostrarMesas(modelo.getMesas());
        vistaMozo.mostrarProductosConStock(Fachada.getInstancia().obtenerProductosConStock());
        cargarDatosMesaSeleccionada(modelo.getMesas().get(0));
    }
    
    public void cargarDatosMesaSeleccionada(Mesa mesa) {
        this.mesaSeleccionada = mesa;
        vistaMozo.mostrarLabelMesa(mesa.getNumero());
        vistaMozo.mostrarDatosServicio(mesa.getServicio().getItemsServicio());
        vistaMozo.mostrarTotalServicio(mesaSeleccionada.getServicio().obtenerMontoTotalServicio());
    }
    
    public void abrirMesa() {
        try{
            String msg = mesaSeleccionada.abrirMesa();
            vistaMozo.mostrarMensaje(msg);
        }catch(RestaurantException e){
            vistaMozo.mostrarMensaje(e.getMessage());
        }
    }
    
    public void cerrarMesa(){
        try{
            if(!mesaSeleccionada.estaCerrada("La mesa no está abierta")){
                vistaMozo.llamarVentanaCerrarMesa(mesaSeleccionada.getServicio());
            }
        }catch(RestaurantException e){
            vistaMozo.mostrarMensaje(e.getMessage());
        }        
    }

    public void agregarProducto(Producto producto, String descripcion, String cantidad) {
        try {
            if(!mesaSeleccionada.estaCerrada("La mesa está cerrada") && mesaSeleccionada.agregarItemAServicio(producto, descripcion, cantidad)) {
                accionesItemAgregado();
            }
        } catch (RestaurantException e) {
            vistaMozo.mostrarMensaje(e.getMessage());
        }
    }
    
    private void accionesItemAgregado() {
        vistaMozo.mostrarDatosServicio(mesaSeleccionada.getServicio().getItemsServicio());
        vistaMozo.mostrarProductosConStock(Fachada.getInstancia().obtenerProductosConStock());
        vistaMozo.limpiarInputProducto();
        vistaMozo.mostrarTotalServicio(mesaSeleccionada.getServicio().obtenerMontoTotalServicio());
    }

    public void logout() {
        try {
            Fachada.getInstancia().logoutConexion(conexion);
        } catch (RestaurantException e) {
            vistaMozo.mostrarMensaje(e.getMessage());
        }
    }

    @Override
    public void actualizar(Object evento, Observable origen) {
        if(evento.equals(Transferencia.eventos.nuevaTranferencia)) {
            System.out.println("LLEGO NUEVA TRANSFERENCIA !!!");
        }
    }

    public void transferirMesa() {
        vistaMozo.llamarVentanaTransferencia(mesaSeleccionada);
    }

}
