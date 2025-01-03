package Tema3.Arrays;

import java.util.Random;
import java.util.Scanner;

public class AtrapaLaMosca {
    public static void main(String[] args) {
        int[] array = new int[15];
        Random random = new Random();
        int moscaPosicion = random.nextInt(15);
        array[moscaPosicion] = 1;

        Scanner scanner = new Scanner(System.in);

        boolean juegoActivo = true;
        while (juegoActivo) {
            System.out.println("Bienvenido al juego 'Atrapa a la Mosca'");
            System.out.println("Adivina en qué posición está la mosca (1-15):");

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

            if (array[posicionJugador] == 1) {
                System.out.println("¡Felicidades! ¡Has atrapado a la mosca!");
                juegoActivo = false;
            } else {
                System.out.println("¡No has atrapado a la mosca!");

                if ((posicionJugador > 0 && array[posicionJugador - 1] == 1) ||
                        (posicionJugador < 14 && array[posicionJugador + 1] == 1)) {
                    int nuevaPosicion = random.nextInt(15);

                    array[moscaPosicion] = 0;

                    moscaPosicion = nuevaPosicion;

                    array[moscaPosicion] = 1;

                    System.out.println("La mosca se ha movido.");
                }
            }
        }

    }
}
