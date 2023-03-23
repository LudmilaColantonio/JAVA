
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Escribir un programa que lea un número entero 
 * por teclado y muestre por pantalla el doble, 
 * el triple y la raíz cuadrada de ese número. 
 * Nota: investigar la función Math.sqrt()
 * @author Usuario
 */
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        double num;
        System.out.println ("Ingrese un numero");
        num = leer.nextDouble();
        System.out.println ("El doble es " + num*2);
        System.out.println ("El triple es " + num*3);
        System.out.println ("La raiz es " + Math.sqrt(num));
        // TODO code application logic here
    }
    
}
