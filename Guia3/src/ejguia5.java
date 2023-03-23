
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
 * el número ingresado seguido de tantos asteriscos como indique su valor. Por
 * ejemplo: 5 ***** 3 *** 11 *********** 2
 *
 **
 * @author Usuario
 */
public class ejguia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num;

        for (int i = 1; i <= 4; i++) {
            System.out.println("Ingrese un numero entre 1 y 20");
            num = leer.nextInt();
            if (num >= 1 && num <= 20) {
                System.out.print(num + " ");

                for (int j = 1; j <= num; j++) {
                    System.out.print("*");
                } System.out.println(" ");
            } else {
                while (num < 1 || num > 20) {
                    System.out.println("Ingrese un numero entre 1 y 20");
                    num = leer.nextInt();
                }
              System.out.print(num + " ");
              for (int j = 1; j <= num; j++) {
                    System.out.print("*");
                } System.out.println(" ");
            }
        }  
       
    }
}
