
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
public class guia3ex8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Dibujar un cuadrado de N elementos por lado utilizando el carácter
         * “*”. Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá
         * dibujar lo siguiente:
         */
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println(" Escriba la medida del lado: ");
        num = leer.nextInt();
        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                System.out.print(" * ");
            }
            System.out.println();
          for (int j = 1; j <= num-2; j++){
                System.out.print(" * ");
                for (int k = 1; k<=num-2; k++){
                        System.out.print("   "); 
                }
                System.out.print(" * ");
                System.out.println();
          }
          for (int i = 1; i <= num; i++) {
                System.out.print(" * ");
            }
            System.out.println();

        }
        System.out.println();
    }
}
