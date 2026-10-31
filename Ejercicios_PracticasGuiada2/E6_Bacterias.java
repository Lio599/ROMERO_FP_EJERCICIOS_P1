public class E6_Bacterias {
    public static void main(String[] args) {
        final int INICIO = 100;
        final int LIMITE = 1_000_000;

        int poblacion = INICIO; // Cantidad actual de bacterias.
        int horas = 0; // CONTADOR de horas transcurridas.

        while (poblacion <= LIMITE) {
            poblacion = poblacion * 2; // Duplica la población en cada hora.
            horas = horas + 1; // Equivale a horas++.
        }

        System.out.println("Población inicial: " + INICIO + " bacterias");
        System.out.println("Supera 1 000 000 en: " + horas + " horas");
        System.out.println("Población final: " + poblacion);
    }
}