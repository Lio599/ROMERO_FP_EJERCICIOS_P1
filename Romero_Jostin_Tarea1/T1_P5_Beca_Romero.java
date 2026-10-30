// Autor: Jostin Williams Romero López
// Fecha: 28/10/2026
package com.mycompany.romero_jostin_tarea1;

import java.util.Scanner;
import java.util.Locale;

public class T1_P5_Beca_Romero {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Edad: ");
        int edad = sc.nextInt();
        System.out.print("Promedio: ");
        double promedio = sc.nextDouble();

        // Las dos condiciones deben cumplirse a la vez.
        System.out.println(edad <= 25 && promedio >= 8.5);
        sc.close();
    }
}
