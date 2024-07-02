/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafionavideño.Controlador;

import desafionavideño.Modelo.Modelo;
import desafionavideño.Vista.Vista;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */

//EL CONTROLADOR SE VA A ENCARGAR DE UNIR AL MODELO CON LA VISTA HACIENDO DE INTERMEDIARIO ENTRE ELLOS 
// DE TAL MANERA QUE SE DESACOPLAN LAS RESPONSABILIDADES DE CADA PAQUETE,HACIENDO AL PATRON MVC FACIL DE MANTENER


public class Controlador {
    
    Modelo modelo;
    Vista vista;
    
    public Controlador(Modelo modelo,Vista vista){
        this.modelo = modelo;
        this.vista=vista;
        
    }
    
    
    
    //AL APRETAR PAPA NOEL
    public void apretarPapaNoel(){
        String figura = "PapaNoel";
        int cantidad = vista.getCantidadIngresada();
        String matriz[][] = modelo.generarMatriz();
        if(cantidad>0 && cantidad<16){
            
            int cantObtenida = modelo.determinarCantFiguras(figura,matriz);
            vista.setCantidad(cantidad);
            vista.setElegido(figura);
            vista.setEncontrados(cantObtenida);
            
            
            if(cantObtenida == cantidad){
                vista.setResultado("Acerto");
            }
            else{
                vista.setResultado("Fallo");
            }
            dibujarMatriz(matriz);
        }
        else{
            JOptionPane.showMessageDialog(vista, "Error numero ingresado fuera de rango");
        }                
    }
    
    
    
    //AL APRETAR ESTRELLA
    public void apretarEstrella(){
        String figura = "Estrella";
        int cantidad = vista.getCantidadIngresada();
        String matriz[][] = modelo.generarMatriz();
        if(cantidad>0 && cantidad<16){
            
            int cantObtenida = modelo.determinarCantFiguras(figura,matriz);
            vista.setCantidad(cantidad);
            vista.setElegido(figura);
            vista.setEncontrados(cantObtenida);
            
            
            if(cantObtenida == cantidad){
                vista.setResultado("Acerto");
            }
            else{
                vista.setResultado("Fallo");
            }
            dibujarMatriz(matriz);
        }
        else{
            JOptionPane.showMessageDialog(vista, "Error numero ingresado fuera de rango");
        }                
    }
    
    
    
    //AL APRETAR ARBOL
    public void apretarArbol(){
        String figura = "Arbol";
        int cantidad = vista.getCantidadIngresada();
        String matriz[][] = modelo.generarMatriz();
        if(cantidad>0 && cantidad<16){
            
            int cantObtenida = modelo.determinarCantFiguras(figura,matriz);
            vista.setCantidad(cantidad);
            vista.setElegido(figura);
            vista.setEncontrados(cantObtenida);
            
            
            if(cantObtenida == cantidad){
                vista.setResultado("Acerto");
            }
            else{
                vista.setResultado("Fallo");
            }
            dibujarMatriz(matriz);
        }
        else{
            JOptionPane.showMessageDialog(vista, "Error numero ingresado fuera de rango");
        }                
    }
    
    
    //AL APRETAR REGALO
    public void apretarRegalo(){
        String figura = "Regalo";
        int cantidad = vista.getCantidadIngresada();
        String matriz[][] = modelo.generarMatriz();
        if(cantidad>0 && cantidad<16){
            
            int cantObtenida = modelo.determinarCantFiguras(figura,matriz);
            vista.setCantidad(cantidad);
            vista.setElegido(figura);
            vista.setEncontrados(cantObtenida);
            
            
            if(cantObtenida == cantidad){
                vista.setResultado("Acerto");
            }
            else{
                vista.setResultado("Fallo");
            }
            dibujarMatriz(matriz);
        }
        else{
            JOptionPane.showMessageDialog(vista, "Error numero ingresado fuera de rango");
        }                
    }
    
    
    
    //DIBUJAR MATRIZ
    
    
    public void dibujarMatriz(String matriz[][]){
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                vista.setMatrizdibujo(vista.getMatrizdibujo() + matriz[i][j] + " ");
            }
            vista.setMatrizdibujo(vista.getMatrizdibujo() + "\n");
        }
        
    }
    
    
}
