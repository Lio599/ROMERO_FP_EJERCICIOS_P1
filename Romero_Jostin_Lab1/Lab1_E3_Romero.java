/*
 * Nombre completo: Jostin Williams Romero López
 * NRC: 37712
 * Fecha: 28/10/2026
 * Enunciado: Sumar las cifras de un entero de cuatro cifras, invertirlo
 * y determinar si es par.
 */

import java.util.Locale;
import java.util.Scanner;

public class Lab1_E3_Romero {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Entrada: un entero entre 1000 y 9999.
        System.out.print("Ingrese un entero positivo de cuatro cifras: ");
        int numero = sc.nextInt();

        // Proceso: extraer las cifras segun su posicion.
        int millares = numero / 1000;
        int centenas = (numero / 100) % 10;
        int decenas = (numero / 10) % 10;
        int unidades = numero % 10;

        int sumaCifras = millares + centenas + decenas + unidades;
        int invertido = unidades * 1000 + decenas * 100
                + centenas * 10 + millares;
        boolean esPar = numero % 2 == 0;

        // Salida: el invertido es un entero, por lo que no conserva ceros iniciales.
        System.out.printf("Suma de cifras: %d%n", sumaCifras);
        System.out.printf("Invertido: %d%n", invertido);
        System.out.printf("Es par: %b%n", esPar);

        sc.close();
    }
}
