package modelo;

import exceptions.RestaurantException;
import java.util.ArrayList;
import observador.Observable;

public class UnidadProcesadora extends Observable {
    
    private String nombre;
    private ArrayList<ItemServicio> itemsServicio = new ArrayList<>();
    private ArrayList<Gestor> gestores = new ArrayList();
    private ArrayList<ItemServicio> itemsSinSerTomados = new ArrayList<>();
    
    public enum eventos{nuevoItem};

    public UnidadProcesadora(String nombre) {
        this.nombre = nombre.toUpperCase();
    }

    public String getNombre() {
        return nombre;
    }        

    public ArrayList<ItemServicio> getItemsServicio() {
        return itemsServicio;
    }

    public ArrayList<Gestor> getGestores() {
        return gestores;
    }

    public ArrayList<ItemServicio> getItemsSinSerTomados() {
        return itemsSinSerTomados;
    }

    public void agregarGestor(Gestor gestor)throws RestaurantException{
        if(gestor == null) throw new RestaurantException("No se puede agregar un gestor null a unidad procesadora");
        if(gestores.contains(gestor)) throw new RestaurantException("El gestor ya se encuentra en la unidad -" + nombre+"-");
        gestores.add(gestor);
        //gestor.agregarProcesadora(this);
    }
    
    public void agregarItem(ItemServicio item) throws RestaurantException {
        if(item == null) throw new RestaurantException("No se puede agregar un item null a unidad procesadora");
        itemsServicio.add(item);
        itemsSinSerTomados.add(item);
        avisar(eventos.nuevoItem);
    }
    
    @Override
    public String toString(){
        return nombre;
    }    
}
