package control_structure;

/*
Create a program that prints whether a number is capicua or not.

Use a 10,000 limit and nested if-else structures.
 */

import java.util.Scanner;

public class PalindromicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número: ");
        int number = sc.nextInt();

        boolean capicua = false;

        if (number >= 10 && number < 10000) {
            int original = number;
            int reversed = 0;

            while (number > 0) {
                reversed = reversed * 10 + number % 10;
                number = number / 10;
            }

            capicua = (original == reversed);
        }

        System.out.println("Es capicua: " + capicua);

        sc.close();
    }

}



