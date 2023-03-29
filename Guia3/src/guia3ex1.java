
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
public class guia3ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Crear un programa que dado un número determine si es par o impar.
         */
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero entero");
        num = leer.nextInt();
        if (num % 2 == 0) {
            System.out.println("El numero es par");  
        }
        else { 
                    System.out.println("El numero es impar");
        }
    }
}
