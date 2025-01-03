package Tema3.Arrays;

import java.util.Random;
import java.util.Scanner;

public class Buscaminas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tablero = new int[20];
        boolean[] visible = new boolean[20];
        int minas = 6;
        int casillasReveladas = 0;

        colocarMinas(tablero, minas);
        rellenarTablero(tablero);

        System.out.println("Bienvenido al juego Buscaminas!");
        while (casillasReveladas < 14) {
            imprimirTablero(tablero, visible);
            System.out.print("Elija una posición (0-19) para abrir: ");
            int posicion = scanner.nextInt();

            if (posicion < 0 || posicion >= 20) {
                System.out.println("Posición no válida, intente de nuevo.");
                continue;
            }

            if (tablero[posicion] == -1) {
                System.out.println("¡Perdiste! Seleccionaste una mina.");
                break;
            } else {
                visible[posicion] = true;
                casillasReveladas++;

                if (casillasReveladas == 14) {
                    System.out.println("¡Felicidades! Has ganado el juego.");
                }
            }
        }

        imprimirTablero(tablero, new boolean[20]);
        scanner.close();
    }

    public static void colocarMinas(int[] tablero, int minas) {
        Random rand = new Random();
        for (int i = 0; i < minas; i++) {
            int minaPos;
            do {
                minaPos = rand.nextInt(20);
            } while (tablero[minaPos] == -1);
            tablero[minaPos] = -1;
        }
    }

    public static void rellenarTablero(int[] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            if (tablero[i] != -1) {
                int minasCercanas = 0;

                if (i > 0 && tablero[i - 1] == -1) minasCercanas++;
                if (i < 19 && tablero[i + 1] == -1) minasCercanas++;
                tablero[i] = minasCercanas;
            }
        }
    }

    public static void imprimirTablero(int[] tablero, boolean[] visible) {
        for (int i = 0; i < tablero.length; i++) {
            if (visible[i]) {
                if (tablero[i] == -1) {
                    System.out.print("* ");
                } else {
                    System.out.print(tablero[i] + " ");
                }
            } else {
                System.out.print("? ");
            }
        }
        System.out.println();
    }
}

