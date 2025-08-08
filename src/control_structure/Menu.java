package control_structure;

/*
Realiza un menú de una calculadora sencilla.
 */

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Introduce dos números: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int opcion = 0;

        while (opcion != 5) {
            System.out.println("""
                    Introduce una opción:
                    1-Sumar
                    2-Restar
                    3-Multiplicar
                    4-Dividir
                    5-Salir
                    """);

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(num1 + num2);
                    break;
                case 2:
                    System.out.println(num1 - num2);
                    break;
                case 3:
                    System.out.println(num1 * num2);
                    break;
                case 4:
                    System.out.println(num1 / num2);
                    break;
                case 5:
                    System.out.println(" Saliendo ");
                    break;
                default:
                    System.out.println(" Introduce la opción correcta ");

            }
        }
    }
}
