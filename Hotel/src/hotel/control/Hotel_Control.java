/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.control;

import hotel.modelo.Alimento;
import hotel.modelo.Contrato;
import hotel.modelo.Gato;
import hotel.modelo.Mascota;
import hotel.modelo.Perro;
import hotel.modelo.Pez;
import hotel.modelo.Pájaro;
import java.util.Date;

/**
 *
 * @author JM
 */
public class Hotel_Control {
    
    private int cantidadMax;
    private ListaContratos contratos;
    private ListaMascotas mascotas;
    private InventarioDeAlimentos alimentos;
    private int horaComida;
    
    public boolean agregarMascota(Mascota unaMascota){
        return mascotas.agregarMascota(unaMascota);
    }
    
    public Mascota consultarMascota(String nombre, String dueño){
        return mascotas.consultarMascota(nombre, dueño);
    }
    
    public boolean eliminarMascota (String nombre, String dueño){
        return mascotas.eliminarMascota(nombre, dueño);
    }
    
    public boolean agregarContrato(int numero, Date fechaIngreso, int dias, String dueño, int contacto,
                                    String nombre, String tipoAlimento, int cantidad, int especie, String raza){
        
        String tipoEspecie;
        Mascota unaMascota=null;
        Alimento unAlimento;
        int costo=0;
        switch (especie){
            case 1:
                tipoEspecie = "perro";
                unAlimento = alimentos.consultarAlimento(tipoAlimento, tipoEspecie, raza);
                if (unAlimento == null)
                    return false;
                unaMascota = new Perro(unAlimento, cantidad, raza, nombre, dueño);
                costo = ((Perro)unaMascota).getCosto();
                break;
            case 2:
                tipoEspecie = "gato";
                unAlimento = alimentos.consultarAlimento(tipoAlimento, tipoEspecie, raza);
                if (unAlimento == null)
                    return false;
                unaMascota = new Gato(unAlimento, cantidad, raza, nombre, dueño);
                costo = ((Gato)unaMascota).getCosto();
                break;
            case 3:
                tipoEspecie = "pez";
                unAlimento = alimentos.consultarAlimento(tipoAlimento, tipoEspecie, raza);
                if (unAlimento == null)
                    return false;
                unaMascota = new Pez(unAlimento, cantidad, raza, nombre, dueño);
                costo = ((Pez)unaMascota).getCosto();
                break;
            case 4:
                tipoEspecie = "pájaro";
                unAlimento = alimentos.consultarAlimento(tipoAlimento, tipoEspecie, raza);
                if (unAlimento == null)
                    return false;
                unaMascota = new Pájaro(unAlimento, cantidad, raza, nombre, dueño);
                costo = ((Pájaro)unaMascota).getCosto();
                break;
            default:
                return false;
                
        }
        Contrato unContrato = new Contrato(numero, fechaIngreso, dias, costo, dueño, contacto, unaMascota);
        return contratos.agregarContrato(unContrato);
    }
    
    public Contrato consultarContrato(int numero){}
    
}
