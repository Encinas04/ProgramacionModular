package Tema3.Strings;
import java.util.Scanner;

public class Lingo {

    public static void main(String[] args) {
        String palabraSecreta = "PESOS";
        int intentosMaximos = 5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al juego del Lingo!");
        System.out.println("Tienes que adivinar una palabra de 5 letras.");

        int intentosRealizados = 0;
        boolean juegoTerminado = false;

        while (intentosRealizados < intentosMaximos && !juegoTerminado) {
            System.out.print("Intento " + (intentosRealizados + 1) + "/" + intentosMaximos + ": Ingresa una palabra de 5 letras: ");
            String palabraIntento = scanner.nextLine().toUpperCase();


            if (palabraIntento.length() != 5) {
                System.out.println("La palabra debe tener 5 letras. Intenta de nuevo.");
            } else {

                String resultado = obtenerResultado(palabraSecreta, palabraIntento);
                System.out.println("Resultado: " + resultado);

                if (palabraIntento.equals(palabraSecreta)) {
                    System.out.println("¡Felicidades! Has adivinado la palabra secreta: " + palabraSecreta);
                    juegoTerminado = true;
                } else {
                    intentosRealizados++;
                }
            }
            if (intentosRealizados == intentosMaximos && !juegoTerminado) {
                System.out.println("¡Juego terminado! La palabra secreta era: " + palabraSecreta);
            }
        }

    }

    // Función que compara la palabra secreta con la palabra introducida por el jugador
    public static String obtenerResultado(String palabraSecreta, String palabraIntento) {
        String resultado = "";
        for (int i = 0; i < palabraSecreta.length(); i++) {
            char letraIntento = palabraIntento.charAt(i);
            char letraSecreta = palabraSecreta.charAt(i);

            if (letraIntento == letraSecreta) {
                resultado += letraIntento;
            } else if (esLetraEnPalabra(letraIntento, palabraSecreta)) {
                resultado += '*';
            } else {
                resultado += '-';
            }
        }
        return resultado;
    }
    // Función para verificar si una letra está presente en la palabra secreta
    public static boolean esLetraEnPalabra(char letra, String palabraSecreta) {
        for (int i = 0; i < palabraSecreta.length(); i++) {
            if (letra == palabraSecreta.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
