package excepciones;
/*
Ejercicio 3: Capturar Excepciones Múltiples (Nivel Medio)
Descripción: Crea una clase llamada ProcesadorDatos con un método procesarEntrada que realice las siguientes operaciones:

Leer una línea de texto desde la consola.

Convertir la línea leída a un número entero.
Dividir 100 por el número ingresado.
Implementa el manejo de excepciones para capturar posibles errores que puedan ocurrir durante estas operaciones, como:

IOException: Si ocurre un error al leer la entrada de la consola.
NumberFormatException: Si la entrada no se puede convertir a un número entero.
ArithmeticException: Si se intenta dividir por cero.
Requisitos:

Utilizar un bloque try que englobe las operaciones mencionadas.
Implementar múltiples bloques catch para manejar cada tipo de excepción de forma específica.
Mostrar mensajes de error claros y descriptivos para cada excepción capturada.
Añadir un bloque finally que imprima un mensaje indicando que el proceso ha finalizado, independientemente de si ocurrió una excepción o no.
Objetivos:

Manejar múltiples excepciones específicas en un mismo bloque try-catch.
Entender la importancia de capturar excepciones específicas para proporcionar respuestas adecuadas a diferentes errores.
Utilizar el bloque finally para realizar acciones que deben ejecutarse siempre, como limpieza o notificaciones finales.
 */


import java.util.Scanner;

public class ProcesadorDatos {

    public void procesarEntrada() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Introduce un número entero: ");
            String entrada = scanner.nextLine();

            int numero = Integer.parseInt(entrada);

            int resultado = 100 / numero;

            System.out.println("Resultado de 100 dividido entre " + numero + " es: " + resultado);

        } catch (NumberFormatException e) {
            System.out.println("Error: La entrada no es un número entero válido.");

        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero no permitida.");

        } finally {
            System.out.println("Proceso finalizado.");
            scanner.close();
        }
    }

    public static void main(String[] args) {
        ProcesadorDatos procesador = new ProcesadorDatos();
        procesador.procesarEntrada();
    }
}

