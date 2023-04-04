
import com.sun.org.apache.xml.internal.utils.XMLCharacterRecognizer;
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
public class guia5ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**Realice un programa que compruebe si una matriz dada es antisimétrica
         * . Se dice que una matriz A es antisimétrica cuando ésta es igual a su
         * propia traspuesta, pero cambiada de signo. Es decir, A es 
         * antisimétrica si A = -AT. La matriz traspuesta de una matriz A se 
         * denota por AT y se obtiene cambiando sus filas por columnas 
         * (o viceversa).
         */

        // TODO code application logic here 
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la medida de la matriz");
         int N = leer.nextInt();
         int [][] matriz= new int [N][N];
         for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j < matriz.length; j++) {
                 System.out.println("Ingrese el valor de la matriz [" + i + "][" + j + "]");
                matriz[i][j] = leer.nextInt();
             }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
              System.out.print(" " + matriz[i][j] + " ");  
            }
            System.out.println(" "); 
        }
        System.out.println(" ");
        
        int [][]matriz2 = new int [N][N];
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                System.out.println("Ingrese el valor de la matriz 2 [" + i + "][" + j + "]");
                matriz2[i][j] = leer.nextInt(); 
            }
        }
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
              System.out.print(" " + matriz2[i][j] + " ");  
            }
            System.out.println(" "); 
        }
        anti(matriz, matriz2);
        
    }
     public static void anti(int [][] matriz, int [][] matriz2){
         int cont = 0;
         for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j < matriz.length; j++) {
                 if (matriz[i][j] == -1*matriz2[j][i]) {
                     cont++;
                 }
                     
                 }
    
             }
          if (cont == matriz.length){
             System.out.println("Las matrices son antisimetricas");
         } else {System.out.println("Las matrices no son antisimetricas");
         }
             
         }
        
}
