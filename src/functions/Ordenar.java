package functions;

/*
Haz programa que ordene alfabéticamente las letras de una frase.
El programa debe pedir por teclado una frase y escribirla con las letras ordenadas.
Ejemplo: Tecleando la palabra “hola”
Escribirá “ahlo”
El trabajo de ordenar la frase lo realizará un método llamado ordenar()
al que se le pasará la frase y la retornará ordenada. Este método realizará
el trabajo de la siguiente manera:
Repetir tantas veces como letras tenga la frase
{
Obtener la letra menor
Añadir esa letra al resultado
Eliminar la letra de la frase original
}
El proceso de obtener la letra menor lo realizará un método llamado
obtenerLetraMenor() al que se le pasa la frase y nos da la letra mas pequeña.
Asimismo el trabajo de eliminar la letra de la frase original lo realizará
otro método llamado eliminarLetra() al que se le pasa la frase y la letra a
eliminar y nos da como resultado la frase modificada.
 */

import java.util.Scanner;

public class Ordenar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase:");
        String frase = sc.nextLine();

        String resultado = ordenar(frase);
        System.out.println("Frase ordenada: " + resultado);

        sc.close();
    }

    static String ordenar(String frase) {
        String resultado = "";

        while (!frase.isEmpty()) {

            char letraMenor = obtenerLetraMenor(frase);

            resultado += letraMenor;

            frase = eliminarLetra(frase, letraMenor);
        }

        return resultado;
    }

    static char obtenerLetraMenor(String frase) {
        char menor = frase.charAt(0);

        for (int i = 1; i < frase.length(); i++) {
            if (frase.charAt(i) < menor) {
                menor = frase.charAt(i);
            }
        }

        return menor;
    }

    static String eliminarLetra(String frase, char letra) {
        StringBuilder sb = new StringBuilder();
        boolean letraEliminada = false;

        for (int i = 0; i < frase.length(); i++) {
            if (!letraEliminada && frase.charAt(i) == letra) {

                letraEliminada = true;
            } else {
                sb.append(frase.charAt(i));
            }
        }

        return sb.toString();
    }
}

