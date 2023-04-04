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
public class guia4ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Crea una aplicación que a través de una función nos convierta una
         * cantidad de euros introducida por teclado a otra moneda, estas pueden
         * ser a dólares, yenes o libras. La función tendrá como parámetros, la
         * cantidad de euros y la moneda a convertir que será una cadena, este
         * no devolverá ningún valor y mostrará un mensaje indicando el cambio
         * (void). El cambio de divisas es: 0.86 libras es un 1 € 1.28611 $ es
         * un 1 € 129.852 yenes es un 1 €
         */
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el monto en euros: ");
        double euro = leer.nextDouble();
        String moneda;
        System.out.println("A que moneda lo quiere convertir? (dolar / yen / libra)");
        moneda = leer.next();
            
        convertir(moneda, euro);

        
    }

    public static void convertir(String moneda, double euro) {
        Scanner leer = new Scanner(System.in);  
        int contador;
        do {
        contador = 0;
        switch (moneda) {
            case "yen":
                System.out.println(euro + " euros equivalen a " + (euro * 129.852) + " yenes");
                break;
            case "libra":
                System.out.println(euro + " euros equivalen a " + (euro * 0.86) + " libras");
                break;
            case "dolar":
                System.out.println(euro + " euros equivalen a " + (euro * 1.28611) + " dolares");
                break;
            default:
                System.out.println("Ingrese una moneda correcta (dolar / yen / libra)");
                moneda = leer.next();
                contador ++;
         
        }
        } while (contador != 0);
    }
}
