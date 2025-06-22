package arrays.ahorcado;

import java.util.Scanner;

public class MainAhorcado {
    public static void main(String[] args) {
        Ahorcado juego = new Ahorcado();
        Scanner sc = new Scanner(System.in);

        int intentos = 6;

        while (intentos > 0) {
            juego.mostrarEstado();

            System.out.print("Elige una letra: ");
            char letra = sc.next().toLowerCase().charAt(0);

            if (juego.letraUsada(letra)) {
                System.out.println("Ya has usado esa letra.");
                continue;
            }

            boolean acierto = juego.adivinarLetra(letra);

            if (!acierto) {
                intentos--;
                System.out.println("Letra incorrecta. Intentos restantes: " + intentos);
            } else {
                System.out.println("¡Letra correcta!");
            }

            if (juego.palabraCompleta()) {
                juego.mostrarEstado();
                System.out.println("¡Felicidades! Has adivinado la palabra.");
                return;
            }
        }

        System.out.println("Te has quedado sin intentos. ¡Has perdido!");
    }
}
