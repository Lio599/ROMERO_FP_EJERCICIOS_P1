// Autor: Jostin Williams Romero López
// Fecha: 28/10/2026
package com.mycompany.romero_jostin_tarea1;

import java.util.Scanner;
import java.util.Locale;

public class T1_P2_Par_Romero {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero entero: ");
        int numero = sc.nextInt();

        // La comparacion se imprime directamente, sin if.
        System.out.println(numero % 2 == 0);
        sc.close();
    }
}
