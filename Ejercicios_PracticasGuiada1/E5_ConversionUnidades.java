import java.util.Scanner;

public class E5_ConversionUnidades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PIES_POR_METRO = 3.28084;
        final double LIBRAS_POR_KILOGRAMO = 2.20462;

        // ENTRADA: menú de opciones mediante condicionales (sin switch).
        System.out.println("=== CONVERSOR DE UNIDADES ===");
        System.out.println("1) Metros → Pies");
        System.out.println("2) Kilogramos → Libras");
        System.out.println("3) Celsius → Fahrenheit");
        System.out.print("Elige una opción (1-3): ");
        int opcion = scanner.nextInt();

        // PROCESO Y SALIDA: else if evita anidar bloques innecesariamente.
        if (opcion == 1) {
            System.out.print("Valor en metros: ");
            double metros = scanner.nextDouble();
            double pies = metros * PIES_POR_METRO;
            System.out.printf("%.2f m = %.2f pies%n", metros, pies);
        } else if (opcion == 2) {
            System.out.print("Valor en kg: ");
            double kg = scanner.nextDouble();
            double libras = kg * LIBRAS_POR_KILOGRAMO;
            System.out.printf("%.2f kg = %.2f lb%n", kg, libras);
        } else if (opcion == 3) {
            System.out.print("Valor en °C: ");
            double celsius = scanner.nextDouble();
            // La expresión equivale a (celsius * 1.8) + 32.
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.printf("%.2f °C = %.2f °F%n", celsius, fahrenheit);
        } else {
            System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}
