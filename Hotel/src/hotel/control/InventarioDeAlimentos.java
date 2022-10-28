/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.control;

import hotel.modelo.Alimento;
import java.util.ArrayList;

/**
 *
 * @author JM
 */
public class InventarioDeAlimentos {
    private ArrayList <Alimento> lista;

    public InventarioDeAlimentos() {
        lista = new ArrayList<Alimento>();
    }

    public boolean agregarAlimento(Alimento unAlimento) { 
        for (Alimento a : lista) {
            if (a.getNombre().equalsIgnoreCase(unAlimento.getNombre()))
                return false; 
        }
        lista.add(unAlimento);
        return true; 
    }
    
    public Alimento consultarAlimento(String nombre, String especie, String raza){ 
        for (Alimento a : lista) {
            if (a.getNombre().equalsIgnoreCase(nombre) && 
                a.getRaza().equalsIgnoreCase(raza) &&
                a.getEspecie().equalsIgnoreCase(especie))
                return a; 
        }
        return null; 
    } 
    
    public boolean eliminarAlimento(String nombre, String especie, String raza){ 
        for (Alimento a : lista) {
            if (a.getNombre().equalsIgnoreCase(nombre) && 
                a.getRaza().equalsIgnoreCase(raza) &&
                a.getEspecie().equalsIgnoreCase(especie)) {
                lista.remove(a);
                return true; 
            }
        }
        return false; 
    } 
    
    public boolean agregarAlimento(int cant, String nombre, String especie, String raza) { 
        for (Alimento a : lista) {
            if (a.getNombre().equalsIgnoreCase(nombre) && 
                a.getRaza().equalsIgnoreCase(raza) &&
                a.getEspecie().equalsIgnoreCase(especie)) {
                return a.agregarAlimento(cant); 
            }
                
        }
        return false; 
    } 
    
    public boolean quitarAlimento(int cant, String nombre, String especie, String raza) { 
        for (Alimento a : lista) {
            if (a.getNombre().equalsIgnoreCase(nombre) && 
                a.getRaza().equalsIgnoreCase(raza) &&
                a.getEspecie().equalsIgnoreCase(especie)) {
                return a.quitarAlimento(cant);
            }                
        }
        return false; 
    } 
    
    public ArrayList<Alimento> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Alimento> lista) {
        this.lista = lista;
    }
    
    
}
