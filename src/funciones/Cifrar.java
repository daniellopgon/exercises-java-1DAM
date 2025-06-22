package funciones;

/*
Haz dos métodos, una para cifrar() y otro para descifrar() una cadena de caracteres.
Estos métodos reciben un String y retornan ese String ya cifrado o descifrado.
Para hacer el cifrado de un String, se cambia cada letra por la que está dos puestos
mas adelante( la a se cambia por la c), teniendo en cuenta que el cambio es circular,
es decir, la z se cambiará por la b. El proceso de descifrado es el contrario.
Los caracteres que no sean alfabéticos no registrarán ningún cambio.
 */

public class Cifrar {

    public static void main(String[] args) {

        String palabra = "zapato";

        System.out.println("La cadena es: " + cifrar(palabra));
        System.out.println("La cadena descifrada es: " + descifrar(cifrar(palabra)));

    }

    static String cifrar(String cadena) {

        char letra;
        StringBuilder cadenaCifrada = new StringBuilder();

        for (int i = 0; i < cadena.length(); i++) {
            letra = cadena.charAt(i);

            if (letra == 'z') {
                letra = 'b';
                cadenaCifrada.append(letra);
            } else if (letra == 'y') {
                letra = 'a';
                cadenaCifrada.append(letra);
            } else {
                letra = (char) (letra + 2);

                cadenaCifrada.append(letra);
            }
        }
        return cadenaCifrada.toString();
    }

    static String descifrar(String cadena) {

        char letra;
        StringBuilder cadenaDesCifrada = new StringBuilder();

        for (int i = 0; i < cadena.length(); i++) {
            letra = cadena.charAt(i);

            if (letra == 'a') {
                letra = 'x';
                cadenaDesCifrada.append(letra);
            } else if (letra == 'b') {
                letra = 'z';
                cadenaDesCifrada.append(letra);
            } else {
                letra = (char) (letra - 2);

                cadenaDesCifrada.append(letra);
            }
        }
        return cadenaDesCifrada.toString();
    }
}
