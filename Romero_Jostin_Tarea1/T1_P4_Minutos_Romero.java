// Autor: Jostin Williams Romero López
// Fecha: 28/10/2026
package com.mycompany.romero_jostin_tarea1;

import java.util.Scanner;
import java.util.Locale;

public class T1_P4_Minutos_Romero {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Minutos totales: ");
        int minutosTotales = sc.nextInt();

        int horas = minutosTotales / 60;
        int minutos = minutosTotales % 60;

        System.out.printf("%d min = %d h %d min%n",
                minutosTotales, horas, minutos);
        sc.close();
    }
}
