/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entextra4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Cuenta {

    public double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    public String titular;

    public Cuenta() {
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public void retirarDinero() {
        Scanner leer = new Scanner(System.in);
        saldo = 1000;
       
        do {
        System.out.println("Su saldo es: " + saldo + "\nIngrese el monto a retirar ");
        double num = leer.nextDouble();   
            if ( num > saldo ) {
                System.out.println("Ingrese un monto menor o igual a " +saldo);
            }else saldo -= num;
        } while (saldo > 0);
    }

}
