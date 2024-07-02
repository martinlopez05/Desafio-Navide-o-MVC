/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafionavideño.Modelo;

import static java.lang.Math.random;
import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Modelo {
    String figuras[] = {"PapaNoel","Arbol","Estrella","Regalo"};
    
    
    String matriz[][]  = new String[4][4];
    
    
    
    
    public String[][] generarMatriz(){
        Random random = new Random();
        for(int i=0;i<4;i++){
            for(int j=0; j<4;j++){
                matriz[i][j]=figuras[random.nextInt(figuras.length)];
            }
        }
        
        return matriz;
        
    }
    
    
    public int determinarCantFiguras(String figura,String matriz[][]){
        int cantEncontrada = 0;
        
        for(int i=0; i<4;i++){
            for(int j=0;j<4;j++){
                if(matriz[i][j].equals(figura)){
                    cantEncontrada++;
                }
            }
        }
        
        return cantEncontrada;
    }
    
    
}
