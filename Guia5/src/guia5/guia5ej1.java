/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class guia5ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**Crea un vector llamado ‘Equipo’ cuya 
         * dimensión sea la cantidad de compañeros 
         * de equipo y define su tipo de dato de 
         * tal manera que te permita alojar sus 
         * nombres más adelante.
         * Utilizando un Bucle for, aloja en el 
         * vector Equipo, los nombres de tus 
         * compañeros de equipo
         */
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String[] equipo = new String [4];
        System.out.println("Ingrese los nombres del equipo");
        for (int i = 0; i < equipo.length; i++ ){
            equipo[i]=leer.nextLine();
        }
        for (String equipo1 : equipo) {
            System.out.print(equipo1);
            System.out.print(" ");
        }
    }
    
}
