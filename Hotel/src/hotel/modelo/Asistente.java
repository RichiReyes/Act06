/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.modelo;

import java.util.ArrayList;

/**
 *
 * @author JM
 */
public class Asistente {
    private ArrayList<String> bitacora; 

    public Asistente() {
        bitacora = new ArrayList<String>(); 
    }

    public ArrayList<String> getBitacora() {
        return bitacora;
    }

    public void setBitacora(ArrayList<String> bitacora) {
        this.bitacora = bitacora;
    }
    
}
