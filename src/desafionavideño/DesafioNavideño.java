/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafionavideño;

import desafionavideño.Controlador.Controlador;
import desafionavideño.Modelo.Modelo;
import desafionavideño.Vista.Vista;

/**
 *
 * @author Usuario
 */
public class DesafioNavideño {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo,vista);
        vista.setControlador(controlador);
        
        
        
    }
    
    
}
