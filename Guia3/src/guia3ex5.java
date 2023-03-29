
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
public class guia3ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner (System.in);
        System.out.println(" Escriba el numero maximo : ");
        int num = leer.nextInt();
        int suma = 0;
        int acumulador;
        do{
            System.out.println("Ingrese el numero a sumar. ");
            acumulador = leer.nextInt();
            suma += acumulador;
        }while(suma<num);
        System.out.println(" La suma total fue : " + suma);
    }
    
}
