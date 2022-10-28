/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.modelo;

import java.util.Objects;

/**
 *
 * @author JM
 */
public abstract class Mascota {    
    protected String nombre;
    protected String raza;
    protected String dueño;
    protected Alimento tipoAlimento;
    protected int cantidad;
    
    public Mascota() {}
   
    public Mascota(String nombre, String dueño, Alimento tipoAlimento, int cantidad) {
        this.nombre = nombre;
        this.dueño = dueño;
        this.tipoAlimento = tipoAlimento;
        this.cantidad = cantidad;
    }
    
    public Mascota(Alimento tipoAlimento, int cantidad, String raza, String nombre, String dueño) {
        this.nombre = nombre;
        this.raza = raza;
        this.dueño = dueño;
        this.tipoAlimento = tipoAlimento;
        this.cantidad = cantidad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public Alimento getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(Alimento tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    @Override
    public String toString() {
        if (raza == null)
            return "Mascota " + nombre + ", Datos de la mascota: \nDueño: " + dueño + "\nAlimento: " + tipoAlimento + cantidad + " de alimento.\n";
        else 
            return "Mascota " + nombre + ", raza : " + raza + ", Datos de la mascota: \nDueño: " + dueño + "\nAlimento: " + tipoAlimento + cantidad + " de alimento.\n";
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Mascota other = (Mascota) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.dueño, other.dueño);
    }   
}
