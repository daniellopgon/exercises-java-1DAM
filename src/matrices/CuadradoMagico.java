package matrices;

/*
Comprobar si un array de 5x5 es un cuadro mágico.
Se considera un cuadro mágico aquel en el que las filas, las columnas y
las diagonales suman igual.
 */

import java.util.Random;

public class CuadradoMagico {
    public static void main(String[] args) {
        Random r = new Random();
        int[][] prueba = new int[5][5];

        for (int i = 0; i < prueba.length; i++) {
            for (int j = 0; j < prueba.length; j++) {
                prueba[i][j] = r.nextInt(10);
            }
        }

        imprimirMatriz(prueba);

        if (cuadradoMagico(prueba)) {
            System.out.println(" Es un cuadrado mágico ");
        } else {
            System.out.println(" No es un cuadrado mágico ");
        }

    }

    static boolean cuadradoMagico(int[][] matriz) {
        int filas = sumaFilas(matriz);
        int columnas = sumaColumnas(matriz);
        int diagonales = sumaDiagonales(matriz);

        return diagonales == filas && columnas == diagonales;

    }

    static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int sumaFilas(int[][] matriz) {
        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[0][i];
        }

        return suma;

    }

    static int sumaColumnas(int[][] matriz) {
        int suma = 0;

        for (int i = 0; i < matriz[0].length; i++) {
            suma += matriz[i][0];
        }

        return suma;
    }

    static int sumaDiagonales(int[][] matriz) {
        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == j) {
                    suma += matriz[i][j];
                }
            }
        }

        return suma;
    }
}
