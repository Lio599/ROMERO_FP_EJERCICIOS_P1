// Autor: Jostin Williams Romero López
// NRC: 37712 | Fecha: 28/10/2026


//Validar un tamaño impar positivo y dibujar un rombo de asteriscos.
package com.mycompany.romero_jostin_lab2;

import java.util.Scanner;
import java.util.Locale;

public class Lab2_E4_Romero {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int tamano;
        do {
            System.out.print("Tamano impar y positivo: ");
            tamano = sc.nextInt();
            if (tamano <= 0 || tamano % 2 == 0) {
                System.out.println("Error: ingrese un impar positivo.");
            }
        } while (tamano <= 0 || tamano % 2 == 0);

        int mitad = tamano / 2;
        // La parte superior incluye la fila central.
        for (int fila = 0; fila <= mitad; fila++) {
            for (int espacio = 0; espacio < mitad - fila; espacio++) {
                System.out.print(" ");
            }
            for (int estrella = 0; estrella < 2 * fila + 1; estrella++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Se empieza una fila antes del centro para no duplicarlo.
        for (int fila = mitad - 1; fila >= 0; fila--) {
            for (int espacio = 0; espacio < mitad - fila; espacio++) {
                System.out.print(" ");
            }
            for (int estrella = 0; estrella < 2 * fila + 1; estrella++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
