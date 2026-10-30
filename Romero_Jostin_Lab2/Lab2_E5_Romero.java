// Autor: Jostin Williams Romero López
// NRC: 37712 | Fecha: 28/10/2026


//Construir un cajero con saldo inicial 500, menú y validaciones.
package com.mycompany.romero_jostin_lab2;

import java.util.Scanner;
import java.util.Locale;

public class Lab2_E5_Romero {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double saldo = 500.0;
        int opcion;
        do {
            System.out.println("\n1) Consultar  2) Depositar  3) Retirar  0) Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.printf("Saldo: $%.2f%n", saldo);
                    break;
                case 2:
                    System.out.print("Monto a depositar: ");
                    double deposito = sc.nextDouble();
                    if (!Double.isFinite(deposito) || deposito <= 0) {
                        System.out.println("Monto invalido.");
                    } else if (!Double.isFinite(saldo + deposito)) {
                        System.out.println("Monto fuera de rango.");
                    } else {
                        saldo += deposito;
                        System.out.println("Deposito aceptado.");
                    }
                    break;
                case 3:
                    System.out.print("Monto a retirar: ");
                    double retiro = sc.nextDouble();
                    if (!Double.isFinite(retiro) || retiro <= 0) {
                        System.out.println("Monto invalido.");
                    } else if (retiro > saldo) {
                        System.out.println("Fondos insuficientes.");
                    } else {
                        saldo -= retiro;
                        System.out.println("Retiro aceptado.");
                    }
                    break;
                case 0:
                    System.out.println("Fin del programa.");
                    break;
                default:
                    System.out.println("Opcion invalida.");
                    break;
            }
        } while (opcion != 0);
        sc.close();
    }
}
