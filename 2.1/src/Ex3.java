
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Escribir un programa que pida una frase y la muestre 
 * toda en mayúsculas y después toda en minúsculas. 
 * Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 * @author Usuario
 */
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner leer = new Scanner (System.in);
     String frase;
     System.out.println ("Ingrese una frase");
     frase = leer.nextLine();
     System.out.println ("Frase en mayusuculas " + toUpperCase(frase));
     System.out.println ("Frase en minusculas " + toLowerCase(frase));
    }
    
}
