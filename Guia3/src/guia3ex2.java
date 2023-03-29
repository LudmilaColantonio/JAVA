
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
public class guia3ex2 {

    /**
     * @param args the command line arguments] Crear un programa que pida una
     * frase y si esa frase es igual a “eureka” el programa pondrá un mensaje de
     * Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar la
     * función equals() en Java.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println(" Escriba la frase a ingresar : ");
        frase = leer.next();
        if (frase.equalsIgnoreCase("eureka")) {
            System.out.println("La frase es correcta");
        } else {
            System.out.println("La frase es incorrecta");

        }

    }
}
