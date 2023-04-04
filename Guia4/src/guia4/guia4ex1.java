/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class guia4ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /** Crea una aplicación que le pida dos números al usuario y este pueda 
         * elegir entre sumar, restar, multiplicar y dividir. La aplicación debe
         * tener una función para cada operación matemática y deben devolver sus
         * resultados para imprimirlos en el main. 
         */
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println(" Escriba 2 numeros: ");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
    }
    
}
