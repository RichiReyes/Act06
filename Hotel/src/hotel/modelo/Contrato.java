/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.modelo;

import java.util.Date;

/**
 *
 * @author JM
 */
public class Contrato {
    private int numero;
    private Date fechaIngreso;
    private int dias;
    private int costo;
    private int contacto;
    private Mascota datosMascota;
    
    public Contrato () {}
    
    public Contrato(int numero, Date fechaIngreso, int dias, int costo, String dueño, int contacto, Mascota datosMascota) {
        this.numero = numero;
        this.fechaIngreso = fechaIngreso;
        this.dias = dias;
        this.costo = costo;
        this.contacto = contacto;
        this.datosMascota = datosMascota;
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getContacto() {
        return contacto;
    }

    public void setContacto(int contacto) {
        this.contacto = contacto;
    }

    public Mascota getDatosMascota() {
        return datosMascota;
    }

    public void setDatosMascota(Mascota datosMascota) {
        this.datosMascota = datosMascota;
    }
    
    @Override
    public String toString() {
        return "Contrato{" + "numero=" + numero + ", fechaIngreso=" + fechaIngreso + ", dias=" + dias + ", costo=" + costo + ", contacto=" + contacto + ", datosMascota=" + datosMascota + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
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
        final Contrato other = (Contrato) obj;
        return this.numero == other.numero;
    }

}
