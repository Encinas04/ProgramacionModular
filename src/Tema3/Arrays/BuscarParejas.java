package Tema3.Arrays;

import java.util.Random;
import java.util.Scanner;

public class BuscarParejas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] animales = {"León", "Mandril", "Suricata", "Facóquero", "Elefante", "Cebra", "Jirafa", "Hipopótamo", "Rinoceronte", "Tigre"};
        String[] tablero = new String[20];
        boolean[] visibles = new boolean[20];
        int parejaCount = 10;
        Random rand = new Random();


        for (int i = 0; i < parejaCount; i++) {
            int animalIndex = rand.nextInt(animales.length);
            String animal = animales[animalIndex];


            int pos1, pos2;
            do {
                pos1 = rand.nextInt(20);
            } while (tablero[pos1] != null);
            tablero[pos1] = animal;

            do {
                pos2 = rand.nextInt(20);
            } while (tablero[pos2] != null);
            tablero[pos2] = animal;
        }

        while (true) {
            System.out.println("\nTablero actual (invisible = X):");
            mostrarTablero(tablero, visibles);

            System.out.println("\nSeleccione dos posiciones (1-20):");
            System.out.print("Primera posición: ");
            int pos1 = scanner.nextInt() - 1;
            System.out.print("Segunda posición: ");
            int pos2 = scanner.nextInt() - 1;

            if (pos1 < 0 || pos1 >= 20 || pos2 < 0 || pos2 >= 20 || pos1 == pos2) {
                System.out.println("Posiciones inválidas. Intente nuevamente.");
                continue;
            }

            if (tablero[pos1].equals(tablero[pos2])) {
                System.out.println("¡Pareja encontrada! " + tablero[pos1] + " en posiciones " + (pos1 + 1) + " y " + (pos2 + 1));
                visibles[pos1] = true;
                visibles[pos2] = true;
            } else {
                System.out.println("No es una pareja. Intente nuevamente.");
            }

            if (todasLasParejasDescubiertas(visibles)) {
                System.out.println("\n¡Felicidades, has encontrado todas las parejas!");
                break;
            }
        }
        scanner.close();
    }

    public static void mostrarTablero(String[] tablero, boolean[] visibles) {
        for (int i = 0; i < tablero.length; i++) {
            if (visibles[i]) {
                System.out.print(tablero[i] + " ");
            } else {
                System.out.print("X ");
            }
        }
        System.out.println();
    }

    public static boolean todasLasParejasDescubiertas(boolean[] visibles) {
        for (int i = 0; i < visibles.length; i++) {
            if (!visibles[i]) {
                return false;
            }
        }
        return true;
    }
}

