import java.util.Scanner;

public class E4_ClasificaTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ENTRADA: longitud de los tres lados.
        System.out.println("=== Clasificación de Triángulo ===");
        System.out.print("Primer lado: ");
        double l1 = sc.nextDouble();
        System.out.print("Segundo lado: ");
        double l2 = sc.nextDouble();
        System.out.print("Tercer lado: ");
        double l3 = sc.nextDouble();

        // Comprobación de los lados, tienen que ser positivos.
        if (l1 <= 0 || l2 <= 0 || l3 <= 0) {
            System.out.println("Los lados deben ser mayores que cero.");
        } else if (l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1) {
            // Desigualdad triangular: la suma de dos lados supera el tercero.
            if (l1 == l2 && l2 == l3) {
                System.out.println("Triángulo Equilatero");
            } else if (l1 == l2 || l1 == l3 || l2 == l3) {
                System.out.println("Triángulo Isósceles");
            } else {
                System.out.println("Triángulo Escaleno");
            }
        } else {
            System.out.println("No forman un triángulo válido.");
        }

        sc.close();
    }
}
