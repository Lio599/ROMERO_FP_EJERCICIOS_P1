import java.util.Scanner;

public class E4_ClasificaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ENTRADA: longitud de los tres lados.
        System.out.println("=== Clasificación de Triángulo ===");
        System.out.print("Lado 1: ");
        double l1 = scanner.nextDouble();
        System.out.print("Lado 2: ");
        double l2 = scanner.nextDouble();
        System.out.print("Lado 3: ");
        double l3 = scanner.nextDouble();

        // Validación previa de Ejercicio4.java: los lados deben ser positivos.
        if (l1 <= 0 || l2 <= 0 || l3 <= 0) {
            System.out.println("Los lados deben ser mayores que cero.");
        } else if (l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1) {
            // Desigualdad triangular: la suma de dos lados supera el tercero.
            if (l1 == l2 && l2 == l3) {
                System.out.println("Triángulo EQUILÁTERO");
            } else if (l1 == l2 || l1 == l3 || l2 == l3) {
                System.out.println("Triángulo ISÓSCELES");
            } else {
                System.out.println("Triángulo ESCALENO");
            }
        } else {
            System.out.println("NO forman un triángulo válido.");
        }

        scanner.close();
    }
}
