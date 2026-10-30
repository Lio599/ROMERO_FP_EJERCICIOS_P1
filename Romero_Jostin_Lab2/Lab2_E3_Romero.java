// Autor: Jostin Williams Romero López
// NRC: 37712 | Fecha: 28/10/2026



// Enunciado: Adivinar un número aleatorio de 1 a 100 en un máximo de siete intentos.
package com.mycompany.romero_jostin_lab2;

import java.util.Scanner;
import java.util.Random;
import java.util.Locale;

public class Lab2_E3_Romero {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random azar = new Random();
        int numeroSecreto = azar.nextInt(100) + 1;
        int intentos = 0;
        boolean acerto = false;

        // Solo las propuestas dentro del rango consumen un intento.
        do {
            System.out.printf("Intento %d de 7 (1-100): ", intentos + 1);
            int propuesta = sc.nextInt();
            if (propuesta < 1 || propuesta > 100) {
                System.out.println("Ingrese un entero entre 1 y 100.");
            } else {
                intentos++;
                if (propuesta == numeroSecreto) {
                    acerto = true;
                } else if (propuesta < numeroSecreto) {
                    System.out.println("Mas alto.");
                } else {
                    System.out.println("Mas bajo.");
                }
            }
        } while (!acerto && intentos < 7);

        if (acerto) {
            System.out.printf("Acertaste en %d intento(s).%n", intentos);
        } else {
            System.out.printf("Agotaste los 7 intentos. El numero era %d.%n",
                    numeroSecreto);
        }
        sc.close();
    }
}
