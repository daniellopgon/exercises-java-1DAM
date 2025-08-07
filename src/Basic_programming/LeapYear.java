package Basic_programming;

/*
Make a program that finds out is a leap year.

"Leap year is divisible between four, except the year is secular".

The last year each century ended in 00, in whose case also has been divisible between four hundred.
*/

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el año:");
        int year = sc.nextInt();

        boolean leapYear = year % 400 == 0 || year % 4 == 0 || year % 100 != 0;

        if (leapYear){
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }

        sc.close();
    }

}
