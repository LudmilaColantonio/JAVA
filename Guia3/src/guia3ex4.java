
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class guia3ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /** Escriba un programa que pida una frase o palabra y valide 
         * si la primera letra de esa frase es una ‘A’. Si la primera 
         * letra es una ‘A’, se deberá de imprimir un mensaje por 
         * pantalla que diga “CORRECTO”, en caso contrario, se deberá 
         * imprimir “INCORRECTO”. Nota: investigar la función Substring 
         * y equals() de Java.
         */
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println(" Escriba la frase a ingresar: ");
        frase = leer.nextLine();
        if (frase.substring(0, 1).equalsIgnoreCase("a")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");

        }
    }
    
}
