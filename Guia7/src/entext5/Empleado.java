/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entext5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Empleado {
    private String nombre;
    private int edad;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void calcular_aumento() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre ");
        nombre = leer.next();
        System.out.println("Ingrese su edad ");
        edad = leer.nextInt();
        System.out.println("Ingrese su salario ");
        salario = leer.nextDouble();
        if (edad > 18 && edad <= 30) {
            System.out.println("Su salario con el aumento salarial correspondiente es " + salario*1.05);
        }else if (edad > 30) System.out.println("Su salario con el aumento salarial correspondiente es " + salario*1.1);
    }
    
}
