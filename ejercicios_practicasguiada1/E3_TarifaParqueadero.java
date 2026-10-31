import java.util.Scanner;

public class E3_TarifaParqueadero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double primeraHora = 1.00;
        final double horaAdicional = 0.50;
        final double diario = 6.00;

        // ENTRADA: se permiten fracciones de hora, como en la práctica original.
        System.out.println("=== Tarifa de Parqueadero ===");
        System.out.print("Horas de permanencia: ");
        double horas = sc.nextDouble();

        if (horas < 1 || horas > 24) {
            System.out.println("Ingresa un valor de permanencia entre 1 y 24 horas.");
        } else {
            // PROCESO: $1 la primera hora y $0.50 por cada hora adicional.
            double total;
            if (horas <= 1) {
                total = primeraHora;
            } else {
                total = primeraHora + (horas - 1) * horaAdicional;
            }

            // El cobro no puede superar el tope diario.
            if (total > diario) {
                total = diario;
            }

            // SALIDA: printf muestra el total con dos decimales.
            System.out.printf("Total a pagar: $%.2f%n", total);
        }

        sc.close();
    }
}
