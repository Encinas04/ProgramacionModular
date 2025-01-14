package Tema3.Arrays;

import java.util.Random;
import java.util.Scanner;

public class AtrapaLaMosca {

    public static void main(String[] args) {
        int[] array = inicializarJuego();

        Scanner scanner = new Scanner(System.in);
        boolean juegoActivo = true;

        while (juegoActivo) {
            System.out.println("Bienvenido al juego 'Atrapa a la Mosca'");
            System.out.println("Adivina en qué posición está la mosca (1-15):");

            int posicionJugador = pedirPosicion(scanner);

            if (array[posicionJugador] == 1) {
                System.out.println("¡Felicidades! ¡Has atrapado a la mosca!");
                juegoActivo = false;
            } else {
                System.out.println("¡No has atrapado a la mosca!");

                if ((posicionJugador > 0 && array[posicionJugador - 1] == 1) ||
                        (posicionJugador < 14 && array[posicionJugador + 1] == 1)) {
                    moverMosca(array);
                    System.out.println("La mosca se ha movido.");
                }
            }
        }
    }

    public static int[] inicializarJuego() {
        int[] array = new int[15];
        Random random = new Random();
        int moscaPosicion = random.nextInt(15);
        array[moscaPosicion] = 1;
        return array;
    }

    public static int pedirPosicion(Scanner scanner) {
        int posicionJugador = -1;
        boolean posicionValida = false;
        while (!posicionValida) {
            posicionJugador = scanner.nextInt() - 1;

            if (posicionJugador >= 0 && posicionJugador < 15) {
                posicionValida = true;
            } else {
                System.out.println("Posición inválida. Debes elegir un número entre 1 y 15.");
            }
        }
        return posicionJugador;
    }

    public static void moverMosca(int[] array) {
        Random random = new Random();
        int moscaPosicion = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                moscaPosicion = i;
                break;
            }
        }
        int nuevaPosicion;
        do {
            nuevaPosicion = random.nextInt(15);
        } while (nuevaPosicion == moscaPosicion);
        array[moscaPosicion] = 0;
        array[nuevaPosicion] = 1;
    }

}
