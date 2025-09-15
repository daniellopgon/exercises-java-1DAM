package exceptions;
/*
Exercise 3: Catching Multiple Exceptions (Medium Level)
Description: Create a class called DataProcessor with a processInput method that performs the following operations:

- Read a line of text from the console.
- Convert the read line to an integer.
- Divide 100 by the entered number.

Implement exception handling to catch possible errors that may occur during these operations, such as:

- IOException: If an error occurs when reading input from the console.
- NumberFormatException: If the input cannot be converted to an integer.
- ArithmeticException: If attempting to divide by zero.

Requirements:
- Use a try block that encompasses the mentioned operations.
- Implement multiple catch blocks to handle each type of exception specifically.
- Display clear and descriptive error messages for each caught exception.
- Add a finally block that prints a message indicating the process has finished, regardless of whether an exception occurred or not.

Objectives:
- Handle multiple specific exceptions in the same try-catch block.
- Understand the importance of catching specific exceptions to provide appropriate responses to different errors.
- Use the finally block to perform actions that should always execute, such as cleanup or final notifications.
 */

import java.util.Scanner;

public class DataProcessor {

    public void processInput() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            String input = scanner.nextLine();

            int number = Integer.parseInt(input);

            int result = 100 / number;

            System.out.println("Result of 100 divided by " + number + " is: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: Input is not a valid integer.");

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero not allowed.");

        } finally {
            System.out.println("Process finished.");
            scanner.close();
        }
    }

    public static void main(String[] args) {
        DataProcessor processor = new DataProcessor();
        processor.processInput();
    }
}