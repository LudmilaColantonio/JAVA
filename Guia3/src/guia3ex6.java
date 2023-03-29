
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
public class guia3ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        /** Realizar un programa que pida dos números enteros 
         * positivos por teclado y muestre por pantalla el siguiente menú:
         * El usuario deberá elegir una opción y el programa deberá mostrar 
         * el resultado por pantalla y luego volver al menú. El programa 
         * deberá ejecutarse hasta que se elija la opción 5. 
         * Tener en cuenta que, si el usuario selecciona la opción 5, 
         * en vez de salir del programa directamente, se debe mostrar el 
         * siguiente mensaje de confirmación: ¿Está seguro que desea salir 
         * del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se 
         * sale del programa, caso contrario se vuelve a mostrar el menú.
         */
        
        Scanner leer=new Scanner (System.in);
        System.out.println(" Escriba dos numeros enteros positivos : ");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int opcion;
        int salida=0;
        String op;
        do {
        System.out.println(" \n1 Suma \n2 Resta \n3 multiplicar \n4 Dividir \n5 Salir");
        opcion = leer.nextInt();
        switch (opcion){
            case 1: System.out.println(" La suma es: " + (num1+num2));
            break;
            case 2: System.out.println(" La resta es : " + (num1-num2));
            break;
            case 3: System.out.println(" La multiplicacion es : " + (num1*num2));
            break;
            case 4: System.out.println(" La division es " + (num1/num2));
            break;
            case 5: System.out.println(" Salir ");
                System.out.println("¿ Esta seguro que desea salir del programa (S/N)?");
                op = leer.next();
                System.out.println(op);
                if (op.equalsIgnoreCase("s")) { salida=9;}
            break;
                        }
            } while ( salida!=9);

    }
    
}
