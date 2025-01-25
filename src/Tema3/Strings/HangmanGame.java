package Tema3.Strings;
import java.util.Scanner;

public class HangmanGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] estadosAhorcado = {
                " _______\n |     |\n       |\n       |\n       |\n       |\n     ___|___",
                " _______\n |     |\n O     |\n       |\n       |\n       |\n     ___|___",
                " _______\n |     |\n O     |\n |     |\n       |\n       |\n     ___|___",
                " _______\n |     |\n O     |\n |/    |\n       |\n       |\n     ___|___",
                " _______\n |     |\n O     |\n |/|   |\n       |\n       |\n     ___|___",
                " _______\n |     |\n O     |\n |/|\\  |\n       |\n       |\n     ___|___",
                " _______\n |     |\n O     |\n |/|\\  |\n /     |\n       |\n     ___|___",
                " _______\n |     |\n O     |\n |/|\\  |\n / \\   |\n       |\n     ___|___"
        };
        String palabra = pedirPalabra();

        String adivinanza = inicializarAdivinanza(palabra);

        jugar(palabra, adivinanza, estadosAhorcado);
    }

    // Función para pedir la palabra al usuario
    public static String pedirPalabra() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Primer usuario, ingresa la palabra secreta: ");
        String palabra = scanner.nextLine().toUpperCase();
        return palabra;
    }

    public static String inicializarAdivinanza(String palabra) {
        String adivinanza = "";
        for (int i = 0; i < palabra.length(); i++) {
            adivinanza += "_";
        }
        return adivinanza;
    }

    public static void jugar(String palabra, String adivinanza, String[] estadosAhorcado) {
        int intentosRestantes = 7;
        boolean juegoGanado = false;
        Scanner scanner = new Scanner(System.in);

        while (intentosRestantes > 0 && !juegoGanado) {
            mostrarEstado(adivinanza, intentosRestantes, estadosAhorcado);
            String entrada = pedirLetraOResolver();

            if (entrada.length() == 1 && Character.isLetter(entrada.charAt(0))) {
                char letraAdivinada = entrada.charAt(0);
                boolean letraEncontrada = false;
                String nuevaAdivinanza = "";

                // Verificar si la letra adivinada está en la palabra
                for (int i = 0; i < palabra.length(); i++) {
                    if (palabra.charAt(i) == letraAdivinada) {
                        nuevaAdivinanza += letraAdivinada;
                        letraEncontrada = true;
                    } else {
                        nuevaAdivinanza += adivinanza.charAt(i);
                    }
                }

                if (!letraEncontrada) {
                    System.out.println("Letra incorrecta.");
                    intentosRestantes--;
                } else {
                    System.out.println("¡Bien hecho! Has adivinado una letra.");
                    adivinanza = nuevaAdivinanza;
                }

                // Verificar si el juego ha sido ganado
                if (adivinanza.equals(palabra)) {
                    System.out.println("¡Felicidades! Has adivinado la palabra: " + palabra);
                    juegoGanado = true;
                }
            } else {
                System.out.println("Entrada no válida. Intenta con una letra.");
            }
        }

        // Si se queda sin intentos, se termina el juego
        if (!juegoGanado) {
            System.out.println(estadosAhorcado[7 - intentosRestantes]);
            System.out.println("¡Juego terminado! La palabra era: " + palabra);
        }
    }

    // Función para mostrar el estado del juego
    public static void mostrarEstado(String adivinanza, int intentosRestantes, String[] estadosAhorcado) {
        System.out.println("Palabra: " + adivinanza);
        System.out.println("Intentos restantes: " + intentosRestantes);
        System.out.println(estadosAhorcado[7 - intentosRestantes]);
    }

    // Función para pedir una letra
    public static String pedirLetraOResolver() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una letra: ");
        String letraFrase = scanner.nextLine().toUpperCase();
        return letraFrase;
    }
}
