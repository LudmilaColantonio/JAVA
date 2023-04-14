/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Libro {

    
    public String isbn;
    public String nombre;
    public String autor;
    public int pag;
    
    public Libro(String isbn, String nombre, String autor, int pag) {
        this.isbn = isbn;
        this.nombre = nombre;
        this.autor = autor;
        this.pag = pag;
    }

    public Libro() {
    }
    
    public void LlenarDatos(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ISBN: ");
        isbn = leer.next();
        System.out.println("Titulo: ");
        nombre = leer.next();
        System.out.println("Autor: ");
        autor = leer.next();
        System.out.println("Cantidad de paginas: ");
        pag = leer.nextInt();
        
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", nombre=" + nombre + ", autor=" + autor + ", pag=" + pag + '}';
    }
    
    
    
    
}
