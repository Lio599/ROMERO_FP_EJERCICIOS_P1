/*
 * Nombre completo: Jostin Williams Romero López
 * NRC: 37712
 * Fecha: 28/10/2026
 * Enunciado: Convertir una temperatura Celsius a Fahrenheit y Kelvin.
 */

import java.util.Locale;
import java.util.Scanner;

public class Lab1_E1_Romero {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Entrada
        System.out.print("Ingrese la temperatura en Celsius: ");
        double celsius = sc.nextDouble();

        // Proceso: la division real conserva la parte decimal de 9/5.
        double fahrenheit = celsius * (9.0 / 5.0) + 32;
        double kelvin = celsius + 273.15;

        // Salida: dos columnas alineadas y dos decimales.
        System.out.printf("%-12s%10.2f%n", "Celsius", celsius);
        System.out.printf("%-12s%10.2f%n", "Fahrenheit", fahrenheit);
        System.out.printf("%-12s%10.2f%n", "Kelvin", kelvin);

        sc.close();
    }
}
