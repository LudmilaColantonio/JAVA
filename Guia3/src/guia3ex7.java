
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
public class guia3ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Realizar un programa que simule el funcionamiento de un dispositivo
         * RS232, este tipo de dispositivo lee cadenas enviadas por el usuario.
         * Las cadenas deben llegar con un formato fijo: tienen que ser de un
         * máximo de 5 caracteres de largo, el primer carácter tiene que ser X y
         * el último tiene que ser una O. Las secuencias leídas que respeten el
         * formato se consideran correctas, la secuencia especial “&&&&&” marca
         * el final de los envíos (llamémosla FDE), y toda secuencia distinta de
         * FDE, que no respete el formato se considera incorrecta. Al finalizar
         * el proceso, se imprime un informe indicando la cantidad de lecturas
         * correctas e incorrectas recibidas. Para resolver el ejercicio deberá
         * investigar cómo se utilizan las siguientes funciones de Java
         * Substring(), Length(), equals().
         */
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);
        String cadena;
        int i = 0;
        int j = 0;
        int num = 0;
        do {
            System.out.println(" Escriba la cadena a ingresar : ");
            cadena = leer.next();
                        
           if (cadena.equals("&&&&&")) {
                num = 2;
                break;
            }
           
            if (cadena.substring(4, 5).equalsIgnoreCase("o") && cadena.length() == 5 && cadena.substring(0, 1).equalsIgnoreCase("x")) {
                i++;
            } else {
                j++;
            }
            
        }while (num!=2);
        System.out.println(" La cantidad de cadenas validas fue de " + i);
            System.out.println(" La cantidad de cadenas erroneas fue de " + j);

    }
}
    
