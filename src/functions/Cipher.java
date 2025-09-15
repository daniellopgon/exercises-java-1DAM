package functions;

/*
Create two methods, one to encrypt() and another to decrypt() a character string.
These methods receive a String and return that String already encrypted or decrypted.
To encrypt a String, each letter is changed to the one that is two positions
ahead (a is changed to c), taking into account that the change is circular,
that is, z will be changed to b. The decryption process is the opposite.
Non-alphabetic characters will not register any change.
 */

public class Cipher {

    public static void main(String[] args) {
        String word = "zapato";

        System.out.println("The encrypted string is: " + encrypt(word));
        System.out.println("The decrypted string is: " + decrypt(encrypt(word)));
    }

    static String encrypt(String text) {
        char letter;
        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            letter = text.charAt(i);

            if (Character.isLetter(letter)) {
                if (Character.isLowerCase(letter)) {
                    if (letter == 'y') {
                        letter = 'a';
                    } else if (letter == 'z') {
                        letter = 'b';
                    } else {
                        letter = (char) (letter + 2);
                    }
                } else {
                    if (letter == 'Y') {
                        letter = 'A';
                    } else if (letter == 'Z') {
                        letter = 'B';
                    } else {
                        letter = (char) (letter + 2);
                    }
                }
            }
            encryptedText.append(letter);
        }
        return encryptedText.toString();
    }

    static String decrypt(String text) {
        char letter;
        StringBuilder decryptedText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            letter = text.charAt(i);

            if (Character.isLetter(letter)) {
                if (Character.isLowerCase(letter)) {
                    if (letter == 'a') {
                        letter = 'y';
                    } else if (letter == 'b') {
                        letter = 'z';
                    } else {
                        letter = (char) (letter - 2);
                    }
                } else {
                    if (letter == 'A') {
                        letter = 'Y';
                    } else if (letter == 'B') {
                        letter = 'Z';
                    } else {
                        letter = (char) (letter - 2);
                    }
                }
            }
            decryptedText.append(letter);
        }
        return decryptedText.toString();
    }
}