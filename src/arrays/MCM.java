package arrays;

/*
2520 es el menor número que puede ser dividido por cada uno de los números del 1 al 10 sin dejar resto.
¿Cuál es el menor número positivo que es divisible sin dejar resto por todos los números del 1 al 20?
 */

public class MCM {
    public static void main(String[] args) {

        long resultado = 1;

        for (int i = 2; i <= 20; i++) {
            resultado = MCM(i, resultado);
        }

        System.out.println(" El número es " + resultado);
    }


    static long MCM(long a, long b) {

        return a * b / MCD(a, b);
    }

    static long MCD(long a, long b) {

        long temp;

        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
