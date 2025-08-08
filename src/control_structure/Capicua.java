package control_structure;

/*
Realiza un programa que te indique si un número es capicúa o no,solo hasta 10.000.
Hay que diseñarlo con if else anidados.
 */

public class Capicua {

    public static void main(String[] args) {

        int num = 101;
        int cifra1 = num % 10;
        int cifra2 = (num / 10) % 10;
        int cifra3 = (num / 100) % 10;
        int cifra4 = (num / 1000) % 10;

        if (num < 10000 && num >= 1000) {
            if (cifra1 == cifra4) {
                System.out.println(" El número es capicúa ");
            } else {
                System.out.println(" El número no es capicúa ");
            }
        } else {
            if (num < 1000 && num >= 100) {
                if (cifra1 == cifra3) {
                    System.out.println(" El número es capicúa ");
                } else {
                    System.out.println(" El número no es capicúa ");
                }
            } else {
                if (num < 100 && num >= 10) {
                    if (cifra1 == cifra2) {
                        System.out.println(" El número es capicúa ");
                    } else {
                        System.out.println(" El número no es capicúa ");
                    }
                } else {
                    System.out.println(" El número es mayor de 9999, indica un número menor ");
                }
            }
        }
    }
}



