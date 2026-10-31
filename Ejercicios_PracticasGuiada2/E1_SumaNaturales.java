import java.util.Scanner;

public class E1_SumaNaturales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa el valor de n: ");
        int n = entrada.nextInt();

        if (n < 1) {
            System.out.println("n debe ser mayor o igual a 1");
            entrada.close();
            return;
        }

        // ACUMULADOR: guarda el total calculado por el ciclo.
        int sumaCiclo = 0;
        for (int numero = 1; numero <= n; numero++) {
            // Suma acumulada (equivalente a sumaCiclo += numero).
            sumaCiclo = sumaCiclo + numero;
        }

        // Comparación con la fórmula de la suma de los n naturales.
        int sumaFormula = n * (n + 1) / 2;

        System.out.println("Suma con ciclo: " + sumaCiclo);
        System.out.println("Suma con fórmula n(n+1)/2: " + sumaFormula);

        if (sumaCiclo == sumaFormula) {
            System.out.println(" Resultados coinciden");
        } else {
            System.out.println(" Hay diferencia");
        }

        entrada.close();
    }
}