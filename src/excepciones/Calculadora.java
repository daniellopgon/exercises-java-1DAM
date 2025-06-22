package excepciones;

/*
Ejercicio 1: Manejo Básico de Excepciones (Nivel Fácil)
Descripción: Crea una clase llamada Calculadora con un método dividir que reciba dos números enteros y devuelva el resultado de la división.
Implementa el manejo de excepciones para capturar posibles divisiones por cero y mostrar un mensaje de error adecuado.

Requisitos:

Utilizar un bloque try-catch para manejar ArithmeticException.
Mostrar un mensaje como "Error: División por cero no permitida." cuando ocurra la excepción.
Objetivos:

Comprender cómo capturar y manejar una excepción específica.
Evitar que el programa se cierre abruptamente debido a una excepción no manejada.
 */

public class Calculadora {
    public static void main(String[] args) {
        double a = 12.6;
        double b = 23.8;

        System.out.println(" El resultado es: " + dividir(b, a));
        System.out.println(" Excepcion: " + dividir(10, 0));

    }

    static double dividir(double dividendo, double divisor) {
        if (divisor <= 0) {
            throw new ArithmeticException(" El divisor no puede ser 0 ");
        } else {
            return dividendo / divisor;
        }
    }
}
