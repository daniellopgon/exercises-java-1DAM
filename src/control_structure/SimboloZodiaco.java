package control_structure;

/*
Haz un programa que indique cual es tu simbolo del zodiaco.
Hazlo con switch
 */

import java.util.Scanner;

public class SimboloZodiaco {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu día de nacimiento: ");
        int dia = sc.nextInt();

        System.out.print("Introduce tu mes de nacimiento (1-12): ");
        int mes = sc.nextInt();

        String signo;

        switch (mes) {
            case 1:
                signo = (dia < 20) ? "Capricornio" : "Acuario";
                break;
            case 2:
                signo = (dia < 19) ? "Acuario" : "Piscis";
                break;
            case 3:
                signo = (dia < 21) ? "Piscis" : "Aries";
                break;
            case 4:
                signo = (dia < 20) ? "Aries" : "Tauro";
                break;
            case 5:
                signo = (dia < 21) ? "Tauro" : "Géminis";
                break;
            case 6:
                signo = (dia < 21) ? "Géminis" : "Cáncer";
                break;
            case 7:
                signo = (dia < 23) ? "Cáncer" : "Leo";
                break;
            case 8:
                signo = (dia < 23) ? "Leo" : "Virgo";
                break;
            case 9:
                signo = (dia < 23) ? "Virgo" : "Libra";
                break;
            case 10:
                signo = (dia < 23) ? "Libra" : "Escorpio";
                break;
            case 11:
                signo = (dia < 22) ? "Escorpio" : "Sagitario";
                break;
            case 12:
                signo = (dia < 22) ? "Sagitario" : "Capricornio";
                break;
            default:
                signo = "Mes inválido";
        }

        System.out.println("Tu signo del zodiaco es: " + signo);
    }
}
