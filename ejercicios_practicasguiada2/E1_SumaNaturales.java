import java.util.Scanner;

public class E1_SumaNaturales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el valor de n: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("n debe ser mayor o igual a 1");
            sc.close();
            return;
        }

        // ACUMULADOR: guarda el total calculado por el ciclo.
        int sumaCiclo = 0;
        for (int numero = 1; numero <= n; numero++) {
            // Suma acumulada (equivalente a sumaCiclo += numero).
            sumaCiclo = sumaCiclo + numero;
        }

        // Comparación con la fórmula de la suma de los n naturales.
        int sumaNatural = n * (n + 1) / 2;

        System.out.println("Suma con ciclo: " + sumaCiclo);
        System.out.println("Suma n(n+1)/2: " + sumaNatural);

        if (sumaCiclo == sumaNatural) {
            System.out.println(" Resultados coinciden");
        } else {
            System.out.println(" Hay diferencia");
        }

        sc.close();
    }
}