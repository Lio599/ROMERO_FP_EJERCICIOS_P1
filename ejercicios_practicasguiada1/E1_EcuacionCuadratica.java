import java.util.Scanner;

public class E1_EcuacionCuadratica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ENTRADA: coeficientes de ax^2 + bx + c = 0.
        System.out.println("=== Ecuación Cuadrática ax² + bx + c = 0 ===");
        System.out.print("Ingresa a: ");
        double a = sc.nextDouble();
        System.out.print("Ingresa b: ");
        double b = sc.nextDouble();
        System.out.print("Ingresa c: ");
        double c = sc.nextDouble();

        // VALIDACIÓN: si a = 0, la ecuación no es de segundo grado.
        if (a == 0) {
            System.out.println("El valor de 'a' no puede ser 0, no es ecuación de segundo grado.");
        } else {
            // PROCESO: el discriminante determina la cantidad de raíces reales.
            double discriminante = (b * b) - (4 * a * c);

            if (discriminante > 0) {
                // Dos raíces reales diferentes (fórmula general).
                double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("Dos raíces reales distintas:");
                System.out.println("x1 = " + raiz1);
                System.out.println("x2 = " + raiz2);
            } else if (discriminante == 0) {
                // Una raíz real doble.
                double raizDoble = -b / (2 * a);
                System.out.println("Raíz doble: x = " + raizDoble);
            } else {
                // Discriminante negativo: no hay raíces reales.
                System.out.println("Sin raíces reales");
            }
        }

        sc.close();
    }
}
