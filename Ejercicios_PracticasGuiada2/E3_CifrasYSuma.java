import java.util.Scanner;

public class E3_CifrasYSuma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        int numero = entrada.nextInt();

        numero = Math.abs(numero);

        int contadorCifras = 0;
        int sumaCifras = 0;
        int numeroTemporal = numero; // Variable auxiliar para procesar cifras.

        while (numeroTemporal != 0) {
            int digito = numeroTemporal % 10; // Residuo: última cifra.
            sumaCifras = sumaCifras + digito; // ACUMULADOR.
            contadorCifras++; // CONTADOR.
            numeroTemporal = numeroTemporal / 10; // Descarta la última cifra.
        }

        if (numero == 0) {
            contadorCifras = 1;
            sumaCifras = 0;
        }

        System.out.println("Cantidad de cifras: " + contadorCifras);
        System.out.println("Suma de las cifras: " + sumaCifras);

        entrada.close();
    }
}