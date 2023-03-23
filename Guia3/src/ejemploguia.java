
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Implementar un programa que le pida dos números enteros al usuario 
 * y determine si ambos o alguno de ellos es mayor a 25.
 * @author Usuario
 */
public class ejemploguia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        int num1, num2;
        System.out.println ("Ingrese un numero");
        num1 = leer.nextInt();
        System.out.println ("Ingrese otro numero");
        num2 = leer.nextInt();
        if (num1>25 && num2>25) { 
        System.out.println ("Ambos numeros son mayores a 25");
        } else if (num1>25) {
        System.out.println (num1 + " es mayor a 25"); 
        } else if (num2>25) {
            System.out.println (num2 + " es mayor a 25");
        } else {System.out.println ("Ninguno de los numeros es mayor a 25");
        }
        }
        }
        
    
