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
public class g4ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /**
         * Escribir un programa que procese una secuencia de caracteres
         * ingresada por teclado y terminada en punto, y luego codifique la
         * palabra o frase ingresada de la siguiente manera: cada vocal se
         * reemplaza por el carácter que se indica en la tabla y el resto de los
         * caracteres (incluyendo a las vocales acentuadas) se mantienen sin
         * cambios. a=@ e=# i=$ 0=% u=* Realice un subprograma que reciba una
         * secuencia de caracteres y retorne la codificación correspondiente.
         * Utilice la estructura “según” para la transformación.
         */
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba una frase");
        
        String frase = leer.nextLine().toLowerCase();
        cambiarFrase(frase);

    }

    public static String cambiarFrase(String frase) {
        String frase2 = " ";

        for (int i = 0; i < frase.length(); i++) {
            switch (frase.substring(i, i + 1)) {
                case "a":
                    frase2 += "@";
                    break;
                case "e":
                    frase2 += "#";
                    break;
                case "i":
                    frase2 += "$";
                    break;
                case "o":
                    frase2 += "%";
                    break;
                case "u":
                    frase2 += "*";
                    break;
                default:
                    frase2 += frase.substring(i, i + 1);

            }
        }
        System.out.println(frase2);
        return null;

    }
}

  
