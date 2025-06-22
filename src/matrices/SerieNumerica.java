package matrices;

/*
Dado una matriz de 5x5, realizar un algoritmo que lo rellene como en la figura:
0 1 2 3 4
1 2 3 4 3
2 3 4 3 2
3 4 3 2 1
4 3 2 1 0
 */

public class SerieNumerica {
    public static void main(String[] args) {
        int[][] prueba = new int[5][5];
        rellenarMatriz(prueba);
        imprimirMatriz(prueba);
    }

    static int[][] rellenarMatriz(int[][] matriz) {

        int num;

        for (int i = 0; i < matriz.length; i++) {
            num = i;
            int fin = matriz.length - i;
            for (int j = 0; j <= matriz.length; j++) {
                if (j < fin) {
                    matriz[i][j] = num;
                    num++;
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            int inicio = matriz.length - i;
            num = matriz.length - 2;
            for (int j = 0; j < matriz.length; j++) {
                if (j >= inicio) {
                    matriz[i][j] = num;
                    num--;
                }
            }
        }
        return matriz;
    }

    static void imprimirMatriz(int[][] matriz) {

        for (int[] array : matriz) {
            for (int valor : array) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
