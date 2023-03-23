
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

/**Escribir un programa que pida tu nombre, 
 * lo guarde en una variable y lo muestre por pantalla.
 * @author Usuario
 */
public class NewMain2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner leer = new Scanner (System.in);
     String nombre;
     System.out.println ("Ingrese su nombre");
     nombre = leer.nextLine();
     System.out.println ("Su nombre es " + nombre);
     
    }
    
}
