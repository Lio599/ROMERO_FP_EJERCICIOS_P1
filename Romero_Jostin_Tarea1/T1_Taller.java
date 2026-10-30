// Autor: Jostin Williams Romero López
// Fecha: 28/10/2026
package com.mycompany.romero_jostin_tarea1;

import java.util.Scanner;
import java.util.Locale;

public class T1_Taller {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int resultado1 = 5 + 7 / 2 * 3;
        double resultado2 = (5 + 7) / 2.0 * 3;
        int resultado3 = 17 % 4 + 2 * 3 - 1;
        int resultado4 = (int) 7.9 + 7 / 2;
        boolean resultado5 = 8 > 3 && 2 != 2 || !(5 < 1);
        int resultado6a = 'A' + 2;
        char resultado6b = (char) ('A' + 2);

        System.out.println("1: " + resultado1 + " (int)");
        System.out.println("2: " + resultado2 + " (double)");
        System.out.println("3: " + resultado3 + " (int)");
        System.out.println("4: " + resultado4 + " (int)");
        System.out.println("5: " + resultado5 + " (boolean)");
        System.out.println("6a: " + resultado6a + " (int)");
        System.out.println("6b: " + resultado6b + " (char)");
    }
}
