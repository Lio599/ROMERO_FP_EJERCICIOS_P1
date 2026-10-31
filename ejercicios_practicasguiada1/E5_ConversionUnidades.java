import java.util.Scanner;

public class E5_ConversionUnidades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double piesMetro = 3.28084;
        final double librasKilo = 2.20462;

        // ENTRADA: menú de opciones mediante condicionales (sin switch).
        System.out.println("=== CONVERSOR DE UNIDADES ===");
        System.out.println("1) Metros a Pies");
        System.out.println("2) Kilogramos a Libras");
        System.out.println("3) Celsius a Fahrenheit");
        System.out.print("Escribe una opción (1-3): ");
        int opcion = sc.nextInt();

        // PROCESO Y SALIDA: else if evita anidar bloques innecesariamente.
        if (opcion == 1) {
            System.out.print("Valor en metros: ");
            double metros = sc.nextDouble();
            double pies = metros * piesMetro;
            System.out.printf("%.2f m = %.2f pies%n", metros, pies);
        } else if (opcion == 2) {
            System.out.print("Valor en kilogramo: ");
            double kg = sc.nextDouble();
            double libras = kg * librasKilo;
            System.out.printf("%.2f kg = %.2f lb%n", kg, libras);
        } else if (opcion == 3) {
            System.out.print("Valor en °C: ");
            double celsius = sc.nextDouble();
            // La expresión equivale a (celsius * 1.8) + 32.
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.printf("%.2f °C = %.2f °F%n", celsius, fahrenheit);
        } else {
            System.out.println("Opción invalida.");
        }

        sc.close();
    }
}
