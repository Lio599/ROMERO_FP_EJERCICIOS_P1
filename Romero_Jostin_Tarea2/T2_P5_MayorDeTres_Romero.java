// Autor: Jostin Williams Romero López
// Fecha: 28/10/2026
// NRC: 37712
package com.mycompany.romero_jostin_tarea2;

import java.util.Scanner;
import java.util.Locale;

public class T2_P5_MayorDeTres_Romero {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese tres numeros distintos: ");
        double numero1 = sc.nextDouble();
        double numero2 = sc.nextDouble();
        double numero3 = sc.nextDouble();

        if (!Double.isFinite(numero1) || !Double.isFinite(numero2)
                || !Double.isFinite(numero3)) {
            System.out.println("Error: ingrese tres numeros finitos.");
            sc.close();
            return;
        }
        if (numero1 == numero2 || numero1 == numero3 || numero2 == numero3) {
            System.out.println("Error: los tres numeros deben ser distintos.");
            sc.close();
            return;
        }

        double mayor;
        double medio;
        double menor;
        if (numero1 > numero2 && numero1 > numero3) {
            mayor = numero1;
            if (numero2 > numero3) {
                medio = numero2;
                menor = numero3;
            } else {
                medio = numero3;
                menor = numero2;
            }
        } else if (numero2 > numero1 && numero2 > numero3) {
            mayor = numero2;
            if (numero1 > numero3) {
                medio = numero1;
                menor = numero3;
            } else {
                medio = numero3;
                menor = numero1;
            }
        } else {
            mayor = numero3;
            if (numero1 > numero2) {
                medio = numero1;
                menor = numero2;
            } else {
                medio = numero2;
                menor = numero1;
            }
        }

        System.out.println("Mayor a menor: " + mayor + " > " + medio + " > " + menor);
        sc.close();
    }
}
