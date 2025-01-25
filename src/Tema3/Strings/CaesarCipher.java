package Tema3.Strings;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el mensaje para cifrar (se convertirá automáticamente a mayúsculas):");
        String mensaje = scanner.nextLine();

        String mensajeCifrado = cifrar(mensaje);
        System.out.println("Mensaje cifrado: " + mensajeCifrado);

        String mensajeDescifrado = descifrar(mensajeCifrado);
        System.out.println("Mensaje descifrado: " + mensajeDescifrado);

    }
    public static String cifrar(String mensaje) {
        mensaje = mensaje.toUpperCase();
        String cifrado = "";

        for (int i = 0; i < mensaje.length(); i++) {
            char caracterActual = mensaje.charAt(i);

            if (caracterActual >= 'A' && caracterActual <= 'Z') {
                char nuevoCaracter = (char) (caracterActual + 1);
                if (nuevoCaracter > 'Z') {
                    nuevoCaracter = 'A';
                }
                cifrado += nuevoCaracter;
            } else if (caracterActual >= '0' && caracterActual <= '9') {
                char nuevoDigito = (char) (caracterActual + 1);
                if (nuevoDigito > '9') {
                    nuevoDigito = '0';
                }
                cifrado += nuevoDigito;
            } else {
                cifrado += caracterActual;
            }
        }

        return cifrado;
    }

    public static String descifrar(String mensaje) {
        String descifrado = "";

        for (int i = 0; i < mensaje.length(); i++) {
            char caracterActual = mensaje.charAt(i);

            if (caracterActual >= 'A' && caracterActual <= 'Z') {
                char nuevoCaracter = (char) (caracterActual - 1);
                if (nuevoCaracter < 'A') {
                    nuevoCaracter = 'Z';
                }
                descifrado += nuevoCaracter;
            } else if (caracterActual >= '0' && caracterActual <= '9') {
                char nuevoDigito = (char) (caracterActual - 1);
                if (nuevoDigito < '0') {
                    nuevoDigito = '9';
                }
                descifrado += nuevoDigito;
            } else {
                descifrado += caracterActual;
            }
        }

        return descifrado;
    }


}
