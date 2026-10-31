import java.util.Scanner;

public class E2_Factorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;

        // do-while: solicita un número nuevamente si es negativo.
        do {
            System.out.print("Ingresa n (debe ser ≥ 0): ");
            n = entrada.nextInt();
            if (n < 0) {
                System.out.println("Error: Valor inválido. Intenta de nuevo.");
            }
        } while (n < 0);

        // ACUMULADOR: producto sucesivo de los enteros desde 2 hasta n.
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial = factorial * i; // Equivale a factorial *= i.
        }

        System.out.println(n + "! = " + factorial);

        if (n >= 13) {
            System.out.println("Advertencia: 13! en adelante se acerca al límite de almacenamiento");
        }
        if (n >= 20) {
            System.out.println("Advertencia: 20! excede el límite de tipo int");
        }

        entrada.close();
    }
}