/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej16;

import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class Ej16 {

    /**
     * @param args the command line arguments
     */
    /*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido*/
    
    
    public static void main(String[] args) {
          Scanner leer = new Scanner (System.in);
          int cont = 0;
          
          System.out.println("Ingrese el tamaño del vector");
          int tamVect = leer.nextInt();
          
        int [] vector = new int [tamVect];
        
        for (int i = 0; i < tamVect; i++) {
            vector[i] = (int) (Math.random()*20);
        }
        
        for (int i = 0; i < tamVect; i++) {
            System.out.println(vector[i]);
        }
        
        System.out.println("\nIngrese un número a buscar");
        int numBuscar = leer.nextInt();
        
        //Aca buscamos el número
        
        for (int i = 0; i < tamVect; i++) {
            if(numBuscar==vector[i]){
                System.out.println("\nSe ha encontrado el número");
                cont = cont+1;
                System.out.println("La posición es: "+ i);
            }
           
        }
        
        
        
        if (cont>=2)
            {
                System.out.println("\nEl número estaba repetido");
            }
        else   {
            System.out.println("El número NO estaba repetido");
        }
        
        
    }
    
}
