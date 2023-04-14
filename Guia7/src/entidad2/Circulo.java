/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Circulo {
    private double radio;

    private Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
   public void crearCirculo() {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
       System.out.println("radio: ");
       radio = leer.nextDouble();
   } 
   
   public double areaCirculo() {
       double area = Math.PI*Math.pow(radio, 2);
       return area;
   } 
   
    public double perimetroCirculo() {
       double perimetro = Math.PI*radio;
       return perimetro;
   } 
}
