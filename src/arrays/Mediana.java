package arrays;

/*
Haz un programa que calcule la mediana de una serie númerica
 */


public class Mediana {
    public static void main(String[] args) {

        int[] serie = {12, 23, 4, 6, 21, 11};
        int[] ordenado = ordenacion(serie);
        System.out.println(" La mediana es: " + mediana(ordenado));

    }

    static double mediana(int[] serie) {
        int n = serie.length;
        if (n % 2 == 0) {
            return (serie[n / 2 - 1] + serie[n / 2]) / 2.0;
        } else {
            return serie[n / 2];
        }
    }

    static int[] ordenacion(int[] serie) {

        int[] ordenado = new int[serie.length];
        int min;
        int indice = 0;

        for (int i = 0; i < serie.length; i++) {
            min = serie[i];
            for (int j = 0; j < serie.length; j++) {
                if (serie[j] <= min) {
                    min = serie[j];
                    indice = j;
                }
            }
            ordenado[i] = min;
            serie[indice] = 100;
        }
        return ordenado;
    }
}
