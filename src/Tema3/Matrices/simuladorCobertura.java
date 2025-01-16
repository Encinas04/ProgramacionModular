package Tema3.Matrices;

import java.util.Scanner;

    public class simuladorCobertura{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int filas = 12;
            int columnas = 5;
            int[][] hotel = new int[filas][columnas];

            int planta = -1;
            int habitacion = -1;
            int potencia = -1;

            while (planta < 0 || planta >= filas || habitacion < 0 || habitacion >= columnas || potencia < 1 || potencia > 5) {
                System.out.println("Selecciona la planta donde instalar el router (1-12): ");
                planta = scanner.nextInt() - 1;
                System.out.println("Selecciona la habitación donde instalar el router (1-5): ");
                habitacion = scanner.nextInt() - 1;
                System.out.println("Selecciona la potencia del router (1-6): ");
                potencia = scanner.nextInt();
                if (planta < 0 || planta >= filas || habitacion < 0 || habitacion >= columnas || potencia < 1 || potencia > 5) {
                    System.out.println("Entrada inválida. Asegúrese de que la planta esté entre 1 y 12, la habitación entre 1 y 5, y la potencia entre 1 y 6.");
                }
            }

            colocarRouter(hotel, planta, habitacion, potencia);

            System.out.println("\nEstado de la señal en las habitaciones:");
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.print(hotel[i][j] + " ");
                }
                System.out.println();
            }
        }

        public static void colocarRouter(int[][] hotel, int planta, int habitacion, int potencia) {
            for (int i = 0; i < hotel.length; i++) {
                for (int j = 0; j < hotel[i].length; j++) {
                    hotel[i][j] = 0;
                }
            }

            hotel[planta][habitacion] = potencia;

            for (int i = 1; i <= potencia; i++) {
                if (planta - i >= 0) {
                    if (habitacion - i >= 0) hotel[planta - i][habitacion - i] = potencia - i;
                    if (habitacion + i < hotel[0].length) hotel[planta - i][habitacion + i] = potencia - i;
                    hotel[planta - i][habitacion] = potencia - i;
                }
                if (planta + i < hotel.length) {
                    if (habitacion - i >= 0) hotel[planta + i][habitacion - i] = potencia - i;
                    if (habitacion + i < hotel[0].length) hotel[planta + i][habitacion + i] = potencia - i;
                    hotel[planta + i][habitacion] = potencia - i;
                }

                if (habitacion - i >= 0) hotel[planta][habitacion - i] = potencia - i;
                if (habitacion + i < hotel[0].length) hotel[planta][habitacion + i] = potencia - i;
            }
        }
    }
