/*
 * Nombre completo: Jostin Williams Romero López
 * NRC: 37712
 * Fecha: 28/10/2026
 * Enunciado: Desglosar un tiempo total en segundos en horas, minutos y segundos.
 */

import java.util.Locale;
import java.util.Scanner;

public class Lab1_E2_Romero {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Entrada: un numero entero de segundos no negativo.
        System.out.print("Ingrese el tiempo total en segundos: ");
        int tiempoTotal = sc.nextInt();

        // Proceso: separar las horas y desglosar el tiempo restante.
        int horas = tiempoTotal / 3600;
        int minutos = (tiempoTotal % 3600) / 60;
        int segundos = tiempoTotal % 60;

        // Salida
        System.out.printf("%d s = %d h %d min %d s%n",
                tiempoTotal, horas, minutos, segundos);

        sc.close();
    }
}
