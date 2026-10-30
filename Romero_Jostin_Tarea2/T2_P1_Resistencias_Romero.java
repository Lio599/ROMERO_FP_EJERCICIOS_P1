// Autor: Jostin Williams Romero López
// Fecha: 28/10/2026
// NRC: 37712
package com.mycompany.romero_jostin_tarea2;

import java.util.Scanner;
import java.util.Locale;

public class T2_P1_Resistencias_Romero {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Primera resistencia (ohmios): ");
        double resistencia1 = sc.nextDouble();
        System.out.print("Segunda resistencia (ohmios): ");
        double resistencia2 = sc.nextDouble();

        if (!Double.isFinite(resistencia1) || !Double.isFinite(resistencia2)
                || resistencia1 <= 0 || resistencia2 <= 0) {
            System.out.println("Error: las resistencias deben ser positivas y finitas.");
            sc.close();
            return;
        }

        System.out.print("Conexion en serie (S) o paralelo (P): ");
        char conexion = sc.next().charAt(0);
        double equivalente;

        switch (conexion) {
            case 'S':
            case 's':
                equivalente = resistencia1 + resistencia2;
                break;
            case 'P':
            case 'p':
                equivalente = (resistencia1 * resistencia2)
                        / (resistencia1 + resistencia2);
                break;
            default:
                System.out.println("Error: la conexion debe ser S o P.");
                sc.close();
                return;
        }

        System.out.printf("Resistencia equivalente: %.2f ohmios%n", equivalente);
        sc.close();
    }
}
