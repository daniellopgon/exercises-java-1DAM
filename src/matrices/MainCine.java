package matrices;

import java.util.Scanner;

public class MainCine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        EntradasCine cine = new EntradasCine();
        int fila = 0;

        while (fila != 10) {
            cine.mostrar();

            System.out.print("Introduce fila (1-10, 0 para salir): ");
            fila = scanner.nextInt();

            System.out.print("¿Cuántas entradas quieres? ");
            int cantidad = scanner.nextInt();

            boolean vendido = cine.venderEntradas(fila, cantidad);

            if (vendido) {
                System.out.println("¡Entradas vendidas!");
            } else {
                System.out.println("No hay suficientes asientos juntos en esa fila.");
            }
        }

        scanner.close();
    }
}
