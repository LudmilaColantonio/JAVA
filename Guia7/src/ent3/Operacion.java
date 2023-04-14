/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ent3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Operacion {

    private double num1, num2;

    public Operacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operacion() {
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void crearOperacion() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Numero 1: ");
        num1 = leer.nextDouble();
        System.out.println("Numero 2: ");
        num2 = leer.nextDouble();
    }

    public double sumar() {
        return num1 + num2;
    }

    public double restar() {
        return num1 - num2;
    }

    public double multiplicar() {
        if (num1 == 0 || num2 == 0) {
            System.out.println("Error, ha ingresado un cero");
            return 0;
        } else {
            return num1 * num2;
        }
    }

    public double dividir() {
        if (num1 == 0 || num2 == 0) {
            System.out.println("Error, ha ingresado un cero");
            return 0;
        } else {
            return num1 / num2;
        }

    }

    @Override
    public String toString() {
        return "Operacion{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }

}
