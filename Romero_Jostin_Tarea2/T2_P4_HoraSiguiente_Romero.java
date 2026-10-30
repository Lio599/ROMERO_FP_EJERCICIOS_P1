// Autor: Jostin Williams Romero López
// Fecha: 28/10/2026
// NRC: 37712
package com.mycompany.romero_jostin_tarea2;

import java.util.Scanner;
import java.util.Locale;

public class T2_P4_HoraSiguiente_Romero {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese hora, minuto y segundo (hh mm ss): ");
        int hora = sc.nextInt();
        int minuto = sc.nextInt();
        int segundo = sc.nextInt();

        if (hora < 0 || hora > 23 || minuto < 0 || minuto > 59
                || segundo < 0 || segundo > 59) {
            System.out.println("Error: hora 0-23; minuto y segundo 0-59.");
            sc.close();
            return;
        }

        segundo++;
        if (segundo == 60) {
            segundo = 0;
            minuto++;
        }
        if (minuto == 60) {
            minuto = 0;
            hora++;
        }
        if (hora == 24) {
            hora = 0;
        }

        System.out.printf("Hora siguiente: %02d:%02d:%02d%n",
                hora, minuto, segundo);
        sc.close();
    }
}

