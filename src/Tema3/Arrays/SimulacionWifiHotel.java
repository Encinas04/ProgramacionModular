package Tema3.Arrays;

import java.util.Scanner;

public class SimulacionWifiHotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] habitaciones = new int[20];
        int habitacion = -1;
        int potencia = -1;

        while (habitacion < 0 || habitacion >= 20 || potencia < 1 || potencia > 6) {
            System.out.println("Selecciona la habitación donde instalar el router (1-20): ");
            habitacion = scanner.nextInt() - 1;
            System.out.println("Selecciona la potencia del router (1-6): ");
            potencia = scanner.nextInt();

            if (habitacion < 0 || habitacion >= 20 || potencia < 1 || potencia > 6) {
                System.out.println("Entrada inválida. Asegúrese de que la habitación esté entre 1 y 20 y la potencia entre 1 y 6.");
            }
        }

        for (int i = 0; i < 20; i++) {
            habitaciones[i] = 0;
        }

        habitaciones[habitacion] = potencia;

        for (int i = 1; i <= potencia; i++) {
            if (habitacion - i >= 0) {
                habitaciones[habitacion - i] = potencia - i;
            }
            if (habitacion + i < 20) {
                habitaciones[habitacion + i] = potencia - i;
            }
        }

        System.out.println("\nEstado de la señal en las habitaciones:");

        for (int i = 0; i < habitaciones.length; i++) {
            System.out.print(habitaciones[i] + " ");
        }

    }
}

