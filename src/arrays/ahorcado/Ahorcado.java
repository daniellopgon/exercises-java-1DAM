package arrays.ahorcado;

import java.util.Random;

public class Ahorcado {

    private final String[] palabras = {"cabra", "vaca", "cerdo", "pollo", "gallina"};
    private char[] palabraSecreta;
    private char[] progreso;
    private char[] letrasUsadas;
    private int letrasUsadasCount;

    public Ahorcado() {
        Random r = new Random();
        String seleccionada = palabras[r.nextInt(palabras.length)];
        palabraSecreta = seleccionada.toCharArray();
        progreso = new char[palabraSecreta.length];
        letrasUsadas = new char[26]; // Asumimos un máximo de 26 letras únicas
        letrasUsadasCount = 0;

        for (int i = 0; i < progreso.length; i++) {
            progreso[i] = '_';
        }
    }

    public boolean letraUsada(char letra) {
        for (int i = 0; i < letrasUsadasCount; i++) {
            if (letrasUsadas[i] == letra) return true;
        }
        return false;
    }

    public boolean adivinarLetra(char letra) {
        boolean acierto = false;

        if (!letraUsada(letra)) {
            letrasUsadas[letrasUsadasCount++] = letra;

            for (int i = 0; i < palabraSecreta.length; i++) {
                if (palabraSecreta[i] == letra) {
                    progreso[i] = letra;
                    acierto = true;
                }
            }
        }

        return acierto;
    }

    public boolean palabraCompleta() {
        for (char c : progreso) {
            if (c == '_') return false;
        }
        return true;
    }

    public void mostrarEstado() {
        System.out.print("Palabra: ");
        for (char c : progreso) {
            System.out.print(c + " ");
        }
        System.out.print("\nLetras usadas: ");
        for (int i = 0; i < letrasUsadasCount; i++) {
            System.out.print(letrasUsadas[i] + " ");
        }
        System.out.println();
    }
}
