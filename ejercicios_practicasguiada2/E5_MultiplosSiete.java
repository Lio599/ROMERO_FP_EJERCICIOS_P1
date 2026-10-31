public class E5_MultiplosSiete {
    public static void main(String[] args) {
        int contador = 0; // Contador de números divisibles entre siete.

        System.out.println("Múltiplos de 7 entre 1 y 100:");

        for (int numero = 1; numero <= 100; numero++) {
            // El operador % obtiene el residuo de la división.
            if (numero % 7 == 0) {
                System.out.print(numero + " ");
                contador = contador + 1;
            }
        }

        System.out.println("\nCantidad total: " + contador);
    }
}