
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Escriba un programa que lea 20 números. Si el número leído
 * es igual a cero se debe salir del bucle y mostrar el mensaje
 * "Se capturó el numero cero".  El programa deberá calcular y 
 * mostrar el resultado de la suma de los números leídos, pero 
 * si el número es negativo no debe sumarse. Nota: recordar el 
 * uso de la sentencia break.

 * @author Usuario
 */
public class ejguia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        int num, suma, cont;
        suma = 0;
        cont = 0;
        do {
        System.out.println ("Ingrese un numero");
        num = leer.nextInt();
        cont ++;
       
        if (num < 0) {
        continue; 
        }
        if (num == 0) {
        System.out.println ("Se capturo un cero");    
        break;
        }
        suma = suma + num;
        } while (cont < 20);
        System.out.println ("La suma de los numeros es " + suma);
    }
     
}
