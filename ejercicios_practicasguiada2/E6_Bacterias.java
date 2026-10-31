public class E6_Bacterias {
    public static void main(String[] args) {
        final int inicio = 100;
        final int limite = 1_000_000;

        int poblacion = inicio; // Cantidad actual de bacterias.
        int horas = 0; // Contador de horas transcurridas

        while (poblacion <= limite) {
            poblacion = poblacion * 2; // Duplica la población en cada hora.
            horas = horas + 1; // Equivale a horas++.
        }

        System.out.println("Población inicial: " + inicio + " bacterias");
        System.out.println("Supera 1000000 en: " + horas + " horas");
        System.out.println("Población final: " + poblacion);
    }
}