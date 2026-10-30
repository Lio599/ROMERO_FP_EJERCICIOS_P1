// Autor: Jostin Williams Romero López
// Fecha: 28/10/2026
// NRC: 37712
package com.mycompany.romero_jostin_tarea2;

import java.util.Scanner;
import java.util.Locale;

public class T2_P3_NotaFinal_Romero {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Primera nota (0 a 20): ");
        double nota1 = sc.nextDouble();
        System.out.print("Segunda nota (0 a 20): ");
        double nota2 = sc.nextDouble();
        System.out.print("Tercera nota (0 a 20): ");
        double nota3 = sc.nextDouble();

        if (!Double.isFinite(nota1) || !Double.isFinite(nota2)
                || !Double.isFinite(nota3) || nota1 < 0 || nota1 > 20
                || nota2 < 0 || nota2 > 20 || nota3 < 0 || nota3 > 20) {
            System.out.println("Error: las notas deben estar entre 0 y 20.");
            sc.close();
            return;
        }

        double promedio = (nota1 + nota2 + nota3) / 3.0;
        String estado;
        if (promedio >= 14) {
            estado = "Aprobado";
        } else if (promedio >= 9) {
            estado = "Supletorio";
        } else {
            estado = "Reprobado";
        }

        System.out.println("Promedio: " + promedio);
        System.out.println("Estado: " + estado);
        sc.close();
    }
}
