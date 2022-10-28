/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.modelo;

/**
 *
 * @author JM
 */
public class Pez extends Mascota{
    
    private static int costo = 50; 
    
    public Pez () {}

    public Pez(String nombre, String dueño, Alimento tipoAlimento, int cantidad) {
        super(nombre, dueño, tipoAlimento, cantidad);
    }

    public Pez(Alimento tipoAlimento, int cantidad, String raza, String nombre, String dueño) {
        super(tipoAlimento, cantidad, raza, nombre, dueño);
    }

    public int getCosto() {
        return costo;
    }
    

    
    @Override
    public String toString() {
        return super.toString() ;
    }
}
