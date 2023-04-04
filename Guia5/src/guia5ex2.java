
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
public class guia5ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**Realizar un algoritmo que llene un 
         * vector de tamaño N con valores 
         * aleatorios y le pida al usuario un 
         * número a buscar en el vector. El 
         * programa mostrará dónde se encuentra 
         * el numero y si se encuentra repetido
         */

        // TODO code application logic here
        System.out.println("Definir tamaño del vector");
        Scanner leer = new Scanner(System.in);
        int N = leer.nextInt();
        int[] aleatorios = new int[N];
        for (int i=0; i<N; i++){
            aleatorios[i] = (int) (Math.random() * 100);
            System.out.println(aleatorios[i]);             
        }
        System.out.println("Elija el numero a buscar");
        int buscar = leer.nextInt();
        int cont = 0;
        for (int i = 0; i < N; i++) {
            if(aleatorios[i] == buscar) {
                System.out.println(buscar + " se encuentra en la posicion " + (i+1));
                cont++;
        }
            
    }
        if (cont==0) {
                System.out.println("No se encontro el numero buscado en el vector");
            }
    
}
}
