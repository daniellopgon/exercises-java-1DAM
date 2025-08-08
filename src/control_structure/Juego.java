package control_structure;

/*
Programa un juego que genere un número aleatorio y te permita introducir
números hasta que des con el adecuado.
El juego deberá indicarte si el número introducido es mayor o menor.
 */

import java.util.Random;
import java.util.Scanner;

public class Juego {


    public static void main(String[] args) {

        Random r = new Random();
        int num = r.nextInt(10);
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Introduce un número: ");
            numero = sc.nextInt();

            if (numero == num) {
                System.out.println("Acertaste");
            } else if (numero < num) {
                System.out.println("Demasiado bajo");
            } else {
                System.out.println("Demasiado alto");
            }

        } while (numero != num);
    }
}
