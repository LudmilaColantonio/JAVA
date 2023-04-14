
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
public class guia5extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**Realizar un algoritmo que calcule la suma de todos los elementos de 
         * un vector de tamaño N, con los valores ingresados por el usuario.
         */
        // TODO code application logic here]
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Definir la longitud del vector: ");
        int N = leer.nextInt();
        
        int[] vector = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese el valor de la posicion " +(i+1));
            vector[i]=leer.nextInt();
            
        }
        for (int i = 0; i < N; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("");
        suma(vector);
        
    }
    public static void suma(int vector[]){
    int suma = 0;
        for (int i = 0; i < vector.length; i++) {
            suma += vector[i];
        }
        System.out.println("La suma del vector es " +suma);
            
        }
}
