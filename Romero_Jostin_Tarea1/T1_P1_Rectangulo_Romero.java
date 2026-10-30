// Autor: Jostin Williams Romero López
// Fecha: 28/10/2026
package com.mycompany.romero_jostin_tarea1;

import java.util.Scanner;
import java.util.Locale;

public class T1_P1_Rectangulo_Romero {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Base: ");
        double base = sc.nextDouble();
        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Perimetro: %.2f%n", perimetro);
        sc.close();
    }
}
