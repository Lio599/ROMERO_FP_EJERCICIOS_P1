/*
 * Nombre completo: Jostin Williams Romero López
 * NRC: 37712
 * Fecha: 28/10/2026
 * Enunciado: Leer un producto, su cantidad y precio unitario, y calcular
 * una factura con subtotal, IVA del 15 % y total.
 */

import java.util.Locale;
import java.util.Scanner;

public class Lab1_E4_Romero {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        final double IVA = 0.15;

        // Entrada: leer primero la linea completa para conservar los espacios.
        System.out.print("Ingrese el nombre del producto: ");
        String producto = sc.nextLine();
        System.out.print("Ingrese la cantidad: ");
        int cantidad = sc.nextInt();
        System.out.print("Ingrese el precio unitario: ");
        double precioUnitario = sc.nextDouble();

        // Proceso: aplicar el IVA al subtotal, sin redondear antes de sumar.
        double subtotal = cantidad * precioUnitario;
        double valorIva = subtotal * IVA;
        double total = subtotal + valorIva;

        // Salida: importes alineados con dos decimales.
        System.out.println("\nFACTURA");
        System.out.println("Producto: " + producto);
        System.out.printf("Cantidad: %d%n", cantidad);
        System.out.printf("%-25s%10.2f%n", "Precio unitario", precioUnitario);
        System.out.printf("%-25s%10.2f%n", "Subtotal", subtotal);
        System.out.printf("%-25s%10.2f%n", "IVA 15%", valorIva);
        System.out.printf("%-25s%10.2f%n", "TOTAL", total);

        sc.close();
    }
}
