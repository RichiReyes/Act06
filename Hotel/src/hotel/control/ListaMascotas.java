/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.control;
import java.util.ArrayList; 

import hotel.modelo.Mascota;
import hotel.modelo.Perro;
import hotel.modelo.Gato;
import hotel.modelo.Pez;
import hotel.modelo.Pájaro;

/**
 *
 * @author JM
 */
//Aquí sería la gestión
public class ListaMascotas {
    private ArrayList <Mascota> lista;
    
    public ListaMascotas() {
        lista = new ArrayList<Mascota>();
    }
    
    public boolean agregarMascota(Mascota unaMascota){
        for (Mascota actual : lista){
            if (actual == unaMascota){
                return false;
            }
        }
        lista.add(unaMascota);
        return true;
    }
    
    public Mascota consultarMascota(String nombre, String dueño){
        for (Mascota actual : lista){
            if (actual.getNombre().equals(nombre) &&
                actual.getDueño().equals(dueño))
                return actual;
        }
        return null;
    }
    
    public boolean eliminarMascota(String nombre, String dueño){
        for (Mascota actual : lista){
            if (actual.getNombre().equals(nombre) &&
                actual.getDueño().equals(dueño)){
                lista.remove(actual);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Mascota> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Mascota> lista) {
        this.lista = lista;
    }
    
    
    
    
}
