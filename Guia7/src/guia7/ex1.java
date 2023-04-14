/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;

import entidad1.Libro;

/**
 *
 * @author Usuario
 */
public class ex1 {

    /**
     * @param args the command line arguments
     */
    /**
     * Crear una clase llamada Libro que contenga los siguientes atributos:
     * ISBN, Título, Autor, Número de páginas, y un constructor con todos los
     * atributos pasados por parámetro y un constructor vacío. Crear un método
     * para cargar un libro pidiendo los datos al usuario y luego informar
     * mediante otro método el número de ISBN, el título, el autor del libro y
     * el número de páginas.
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro l1 = new Libro();
        l1.LlenarDatos();
        System.out.println(l1.toString());

        Libro l2 = new Libro("4568964", "abc hsoij", "hasj jaskd", 456);
        System.out.println(l2.toString());

    }

}
