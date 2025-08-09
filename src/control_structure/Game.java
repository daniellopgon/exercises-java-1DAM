package control_structure;

/*
Create a game that generates a random number and allows you to input a number to guess it.

The game should indicate whether the number is too high or too low.
 */

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random r = new Random();
        int random = r.nextInt(1, 20);

        System.out.println("Introduce un número, entre (1,20): ");
        int number = sc.nextInt();

        if (number > 20 || number < 1) {
            System.out.println("Introduce un número, entre (1,20): ");
        } else if (number < random) {
            System.out.println("Demasiado bajo");
        } else if (number > random) {
            System.out.println("Demasiado alto");
        } else {
            System.out.println("Acertaste");
        }

        while (random != number) {
            System.out.println("Introduce un número, entre (1,20): ");
            number = sc.nextInt();

            if (number > 20 || number < 1) {
                System.out.println("Introduce un número, entre (1,20): ");
            } else if (number < random) {
                System.out.println("Demasiado bajo");
            } else if (number > random) {
                System.out.println("Demasiado alto");
            } else {
                System.out.println("Acertaste");
            }
        }

        sc.close();
    }

}
