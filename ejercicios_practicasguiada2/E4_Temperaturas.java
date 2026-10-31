import java.util.Scanner;

public class E4_Temperaturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double mayor = Double.NEGATIVE_INFINITY;
        double menor = Double.POSITIVE_INFINITY;
        double suma = 0; // ACUMULADOR de temperaturas válidas.
        int cantidad = 0; // CONTADOR de entradas válidas.

        System.out.println("Ingresa temperaturas. Escribe -99 para terminar:");

        while (true) {
            System.out.print("Temperatura: ");
            double temperatura = sc.nextDouble();

            // CENTINELA: -99 termina la lectura y no se suma.
            if (temperatura == -99) {
                break;
            }

            if (temperatura > mayor) {
                mayor = temperatura;
            }
            if (temperatura < menor) {
                menor = temperatura;
            }
            suma = suma + temperatura;
            cantidad++;
        }

        if (cantidad == 0) {
            System.out.println("No ingresaste ninguna temperatura");
        } else {
            double promedio = suma / cantidad;
            System.out.println("Mayor temperatura: " + mayor);
            System.out.println("Menor temperatura: " + menor);
            System.out.printf("Promedio: %.2f%n", promedio);
        }

        sc.close();
    }
}