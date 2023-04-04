
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
public class guia5ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**Recorrer un vector de N enteros 
         * contabilizando cuántos números 
         * son de 1 dígito, cuántos de 2 dígitos, 
         * etcétera (hasta 5 dígitos).
         */
        // TODO code application logic here
        System.out.println("Definir tamaño del vector");
        Scanner leer = new Scanner(System.in);
        int N = leer.nextInt();
        int[] vector = new int[N];
        for (int i=0; i<N; i++){
            vector[i] = (int) (Math.random() * 99999);
            System.out.println(vector[i]);             
        }
        
    }
    public static void digitos(int vector){
        
        
    }
    
}
