
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.Date;
import java.util.Scanner;
import jdk.nashorn.internal.parser.Lexer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Usuario
 */
public class guia5extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Escriba un programa que averigüe si dos vectores de N enteros son
         * iguales (la comparación deberá detenerse en cuanto se detecte alguna
         * diferencia entre los elementos).
         */

        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Defina el tamaño de los vectores");
        int N = leer.nextInt();
        int[] vector = new int[N];
        int[] vector2 = new int[N];
        for (int i = 0; i < N; i++) {
            vector[i] = (int) (Math.random() * 10);
            vector2[i] = (int) (Math.random() * 10);
            
        }
        System.out.println("Vector 1:");
        for (int i = 0; i < N; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("");
        System.out.println("Vector 2:");
        for (int i = 0; i < N; i++) {
            System.out.print(vector2[i] + " ");
        }
        System.out.println("");
        iguales(vector, vector2);
    }

    public static void iguales(int vector[], int vector2[]) {
        int valid = 0;
        
            for (int i = 0; i < vector.length; i++) {
                if (vector[i] != vector2[i]) {
                    valid++;
                    System.out.println("Los vectores no son iguales");
                    break;
                }
            }
            
            
            
        
        if (valid == 0) {
            System.out.println("Los vectores son iguales");
        }
    }
}
