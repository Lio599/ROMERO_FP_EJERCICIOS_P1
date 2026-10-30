// Autor: Jostin Williams Romero López
// Fecha: 28/10/2026
// NRC: 37712
package com.mycompany.romero_jostin_tarea2;

import java.util.Scanner;
import java.util.Locale;

public class T2_P6_Angulo_Romero {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Angulo en grados: ");
        double angulo = sc.nextDouble();
        if (!Double.isFinite(angulo) || angulo < 0) {
            System.out.println("Error: el angulo debe ser finito y no negativo.");
            sc.close();
            return;
        }

        if (angulo > 360) {
            angulo = angulo % 360;
        }

        String clasificacion;
        if (angulo == 0) {
            clasificacion = "Nulo";
        } else if (angulo < 90) {
            clasificacion = "Agudo";
        } else if (angulo == 90) {
            clasificacion = "Recto";
        } else if (angulo < 180) {
            clasificacion = "Obtuso";
        } else if (angulo == 180) {
            clasificacion = "Llano";
        } else if (angulo < 360) {
            clasificacion = "Concavo";
        } else {
            clasificacion = "Completo";
        }

        System.out.println("Angulo utilizado: " + angulo + " grados");
        System.out.println("Clasificacion: " + clasificacion);
        sc.close();
    }
}
