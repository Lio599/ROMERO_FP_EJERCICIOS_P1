// Autor: Jostin Williams Romero López
// NRC: 37712 | Fecha: 28/10/2026



// Enunciado: Procesar temperaturas hasta un centinela negativo y mostrar estadísticas.
package com.mycompany.romero_jostin_lab2;

import java.util.Scanner;
import java.util.Locale;

public class Lab2_E2_Romero {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int lecturas = 0;
        double suma = 0.0;
        double minimo = 0.0;
        double maximo = 0.0;

        System.out.print("Temperatura (negativo para terminar): ");
        double temperatura = sc.nextDouble();
        while (temperatura >= 0) {
            // La primera lectura válida establece los dos extremos.
            if (lecturas == 0) {
                minimo = temperatura;
                maximo = temperatura;
            } else {
                if (temperatura < minimo) minimo = temperatura;
                if (temperatura > maximo) maximo = temperatura;
            }
            suma += temperatura;
            lecturas++;
            System.out.print("Temperatura (negativo para terminar): ");
            temperatura = sc.nextDouble();
        }

        if (lecturas > 0) {
            double promedio = suma / lecturas;
            System.out.printf("Lecturas: %d%n", lecturas);
            System.out.printf("Promedio: %.2f%n", promedio);
            System.out.printf("Max: %.2f%nMin: %.2f%n", maximo, minimo);
        } else {
            System.out.println("No hubo lecturas validas.");
        }
        sc.close();
    }
}
