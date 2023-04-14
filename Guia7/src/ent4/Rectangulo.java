/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ent4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Rectangulo {

    private double lado1, lado2;

    public Rectangulo() {
    }

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public void crearRectangulo() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese las medidas de los lados del rectangulo");
        lado1 = leer.nextDouble();
        lado2 = leer.nextDouble();
    }

    public void calcular_area() {
        double area = lado1 * lado2;
        System.out.println("El area es " + area);
    }

    public void calcular_perimetro() {
        double perimetro = 2 * (lado1 + lado2);
        System.out.println("El perimetro es " + perimetro);
    }
    
    public void asteriscos() {
        for (int i = 0; i < lado1; i++) {
          System.out.print(" * ");
        }
        System.out.println("");
        
        for (int i = 0; i < lado2-2; i++) {
          System.out.print(" * ");   
            for (int j = 0; j < lado1-2; j++) {
             System.out.print("   ");   
            }
           System.out.print(" * "); 
           System.out.println("");
        }
        for (int i = 0; i < lado1; i++) {
          System.out.print(" * ");
        }
        System.out.println("");
       
            }
}
