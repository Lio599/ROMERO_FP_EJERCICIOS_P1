// Autor: Jostin Williams Romero López
// Fecha: 28/10/2026
// NRC: 37712
package com.mycompany.romero_jostin_tarea2;

import java.util.Scanner;
import java.util.Locale;

public class T2_P2_Descuento_Romero {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        final double PRECIO_SACO = 8.50;
        final double IVA = 0.15;
        final double DESCUENTO_MEDIO = 0.05;
        final double DESCUENTO_ALTO = 0.10;

        System.out.print("Cantidad de sacos: ");
        int sacos = sc.nextInt();
        if (sacos <= 0) {
            System.out.println("Error: la cantidad debe ser mayor que cero.");
            sc.close();
            return;
        }

        double tasaDescuento;
        if (sacos <= 20) {
            tasaDescuento = 0.0;
        } else if (sacos <= 50) {
            tasaDescuento = DESCUENTO_MEDIO;
        } else {
            tasaDescuento = DESCUENTO_ALTO;
        }

        double subtotal = sacos * PRECIO_SACO;
        double descuento = subtotal * tasaDescuento;
        double neto = subtotal - descuento;
        double valorIva = neto * IVA;
        double total = neto + valorIva;

        System.out.printf("Descuento aplicado: %.0f%%%n", tasaDescuento * 100);
        System.out.printf("%-24s%12.2f%n", "Subtotal", subtotal);
        System.out.printf("%-24s%12.2f%n", "Descuento", descuento);
        System.out.printf("%-24s%12.2f%n", "Subtotal con descuento", neto);
        System.out.printf("%-24s%12.2f%n", "IVA 15%", valorIva);
        System.out.printf("%-24s%12.2f%n", "TOTAL", total);
        sc.close();
    }
}
