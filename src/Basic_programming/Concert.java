package Basic_programming;

/*
Make a program that gives how many seconds span a concert, and calculate how many hours, minuts and seconds.

For example :

How many seconds span the concert? 8479

It is equivalent to: 2:21:19
 */

import java.util.Scanner;

public class Concert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número de segundos: ");
        int seconds = sc.nextInt();

        int hours = seconds / 3600;
        int minutes = seconds % 3600 / 60;
        int realSeconds = seconds % 3600 % 60;

        System.out.println(hours + ":" + minutes + ":" + realSeconds);

        sc.close();

    }
}
