// Autor: Jostin Williams Romero López
// NRC: 37712 | Fecha: 28/10/2026


// Enunciado: Generar una tabla de multiplicar de 10 filas por 10 columnas.
package com.mycompany.romero_jostin_lab2;

import java.util.Locale;

public class Lab2_E1_Romero {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        // Cada fila completa sus diez columnas antes de avanzar.
        for (int fila = 1; fila <= 10; fila++) {
            for (int columna = 1; columna <= 10; columna++) {
                System.out.printf("%4d", fila * columna);
            }
            System.out.println();
        }
    }
}
