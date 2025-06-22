package funciones;

/*
Haz un método llamado esVocal(), al que se le pasa como parámetro un carácter
y retorna un valor true en caso de que el carácter sea una vocal, y un valor false en caso contrario.
 */

public class Vocal {

    public static void main(String[] args) {

        char prueba = 'a';

        if (esVocal(prueba)) {
            System.out.println("Es una vocal");
        } else {
            System.out.println("No es una vocal");
        }

    }

    static boolean esVocal(char caracter) {

        if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' ||
                caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U') {
            return true;
        } else {
            return false;
        }
    }
}
