/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.modelo;

/**
 *
 * @author JM
 */
public class Alimento {
    private String nombre; 
    private String especie; 
    private String raza; 
    private int cantidadAlimento; 

    public Alimento(String nombre, String especie, String raza, int cantidadAlimento) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.cantidadAlimento = cantidadAlimento;
    }

    public boolean agregarAlimento(int cant) {
        if (cant < 0) 
            return false; 
        cantidadAlimento += cant; 
        return true; 
    }
    
    public boolean quitarAlimento(int cant) {
        if (cant < 0 || cant > cantidadAlimento) 
            return false; 
        cantidadAlimento -= cant; 
        return true; 
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getCantidadAlimento() {
        return cantidadAlimento;
    }

    public void setCantidadAlimento(int cantidadAlimento) {
        this.cantidadAlimento = cantidadAlimento;
    }
    
    
    
}
