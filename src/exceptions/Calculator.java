package exceptions;

/*
Exercise 1: Basic Exception Handling (Easy Level)
Description: Create a class called Calculator with a divide method that receives two integers and returns the result of the division.
Implement exception handling to catch possible divisions by zero and display an appropriate error message.

Requirements:
- Use a try-catch block to handle ArithmeticException.
- Display a message like "Error: Division by zero not allowed." when the exception occurs.

Objectives:
- Understand how to catch and handle a specific exception.
- Prevent the program from closing abruptly due to an unhandled exception.
 */

public class Calculator {
    public static void main(String[] args) {
        double a = 12.6;
        double b = 23.8;

        try {
            System.out.println("The result is: " + divide(b, a));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("Exception test: " + divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero not allowed.");
        }
    }

    static double divide(double dividend, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Divisor cannot be zero");
        } else {
            return dividend / divisor;
        }
    }
}