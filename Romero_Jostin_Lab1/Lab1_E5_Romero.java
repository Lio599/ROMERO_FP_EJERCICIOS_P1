/*
 * Nombre completo: Jostin Williams Romero López
 * NRC: 37712
 * Fecha: 28/10/2026
 * Enunciado: Evaluar las cuatro expresiones de la guia y mostrar los
 * resultados para compararlos con el calculo manual.
 */

import java.util.Locale;

public class Lab1_E5_Romero {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int a = 9, b = 4;

        // Proceso: conservar los operadores y tipos de las expresiones originales.
        int resultado1 = a / b + a % b * 2;
        boolean resultado2 = 10 - 3 * 2 > 3 && 5 % 2 == 1;
        double resultado3 = (double) 7 / 2 + 7 / 2;
        boolean resultado4 = !(4 >= 4) || 2 * 3 != 6;

        // Salida: comparar estos valores con la evaluacion hecha a mano.
        System.out.printf("%-36s%12s%n", "Expresion", "Resultado");
        System.out.printf("%-36s%12d%n", "a / b + a % b * 2", resultado1);
        System.out.printf("%-36s%12b%n", "10 - 3 * 2 > 3 && 5 % 2 == 1", resultado2);
        System.out.printf("%-36s%12.1f%n", "(double) 7 / 2 + 7 / 2", resultado3);
        System.out.printf("%-36s%12b%n", "!(4 >= 4) || 2 * 3 != 6", resultado4);
    }
}
