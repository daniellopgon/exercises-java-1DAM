package matrices;

public class EntradasCine {

    int filas = 10;
    int columnas = 12;
    char[][] asientos;

    public EntradasCine() {
        asientos = new char[filas][columnas];
        inicializar();
    }

    public void inicializar() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                asientos[i][j] = '_';
            }
        }
    }

    public void mostrar() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(asientos[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean venderEntradas(int fila, int cantidad) {

        int contador = 0;
        int inicio = 0;

        for (int columna = 0; columna < asientos[0].length; columna++) {
            if (asientos[fila][columna] != 'X') {
                if (contador == 0) {
                    inicio = columna;
                }
                contador++;
                if (contador == cantidad) {
                    for (int i = inicio; i < inicio + cantidad; i++) {
                        asientos[fila][i] = 'X';
                    }
                    return true;
                }
            } else {
                contador = 0;
            }
        }
        return false;
    }

}
