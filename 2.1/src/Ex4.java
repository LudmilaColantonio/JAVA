
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Dada una cantidad de grados centígrados se debe 
 * mostrar su equivalente en grados Fahrenheit. 
 * La fórmula correspondiente es: 
 * F = 32 + (9 * C / 5).
 * @author Usuario
 */
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        double cent, faren;
        System.out.println ("Ingrese la temperatura en grados centigrados");
        cent = leer.nextDouble();
        faren = 32 + (9 * cent / 5);
        System.out.println ("La temperatura en grados farenheit es " + faren);        
    }
    
}
