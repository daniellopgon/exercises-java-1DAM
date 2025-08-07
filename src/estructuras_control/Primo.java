package estructuras_control;

/*
Muestra los números primos entre 1 y 100.
2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
31, 37, 41, 43, 47, 53, 59, 61, 67,
71, 73, 79, 83, 89, 97
 */

public class Primo {

    public static void main(String[] args) {

        boolean esPrimo = false;
        int primo;
        int contador;

        System.out.println("Los números primos del 1 al 100 son: ");

        for (int i = 2; i < 100; i++) {
            contador = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    esPrimo = true;
                    contador++;
                } else {
                    esPrimo = false;
                }
            }

            if (esPrimo && contador == 2) {
                primo = i;
                System.out.print(primo + " ");
            }
        }
    }
}
