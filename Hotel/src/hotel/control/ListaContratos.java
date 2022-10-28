/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.control;
import java.util.ArrayList; 

import hotel.modelo.Contrato;
/**
 *
 * @author JM
 *///Agregar la gestión
public class ListaContratos {
    private ArrayList <Contrato> lista;
    
    public boolean agregarContrato(Contrato unContrato){
        for (Contrato actual:lista){
            if (actual == unContrato){
                return false;
            }
        }
        lista.add(unContrato);
        return true;
    }
    
    public Contrato consultarContrato(int unNumero){
        for (Contrato actual : lista){
            if (actual.getNumero()==unNumero){
                return actual;
            }
        }
        return null;
    }
    
    public ListaContratos() {
        lista = new ArrayList<Contrato>();
    }
    
    public ArrayList<Contrato> getLista() {
        return lista;
    }
}
