package estructuras_control;

/*
Mostrar los N primeros términos de la serie de Fibonacci. N se definirá como una variable.
Por ejemplo 10: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
 */

public class Fibonacci {

    public static void main(String[] args) {

        int n = 10;
        int ultimo = 1;
        int penultimo = 0;

        for (int i = 0; i < n; i++) {

            if (i == 0) {
                System.out.print(i + " ");
            } else if (i == 1) {
                System.out.print(i + " ");
            } else {
                int siguiente = ultimo + penultimo;
                penultimo = ultimo;
                ultimo = siguiente;

                System.out.print(siguiente + " ");
            }
        }
    }
}
