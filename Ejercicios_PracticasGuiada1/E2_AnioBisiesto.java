import java.util.Scanner;

public class E2_AnioBisiesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ENTRADA: año que se desea evaluar.
        System.out.println("=== Verificar Año Bisiesto ===");
        System.out.print("Ingresa el año: ");
        int anio = scanner.nextInt();

        if (anio <= 0) {
            System.out.println("Ingresa un año válido (mayor que cero).");
        } else if (anio % 400 == 0) {
            // Los múltiplos de 400 sí son bisiestos (por ejemplo, 2000).
            System.out.println("El año " + anio + " SÍ es bisiesto.");
        } else if (anio % 4 == 0 && anio % 100 != 0) {
            // Múltiplo de 4, pero no de 100 (por ejemplo, 2024).
            System.out.println("El año " + anio + " SÍ es bisiesto.");
        } else {
            // Los múltiplos de 100 que no son de 400 no son bisiestos.
            System.out.println("El año " + anio + " NO es bisiesto.");
        }

        scanner.close();
    }
}
