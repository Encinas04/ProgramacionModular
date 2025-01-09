package Tema3.Juego;

import java.util.Scanner;

public class ProgramaJuego {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean acabar = false;
        int opccion = 6;
        int[] jugador1 = null;
        int[] jugador2 = null;

        while (!acabar) {
            mostrarMenu();
            opccion = scan.nextInt();
            switch (opccion) {
                case 1:
                    jugador1 = leerAtributosJugador("1");
                    jugador2 = leerAtributosJugador("2");
                    break;
                case 2:

                    break;
                case 3:
                    if (jugador1 != null && jugador2 != null) {
                        iniciarCombate(jugador1, jugador2);
                    } else {
                        System.out.println("Primero debes seleccionar los atributos de los personajes.");
                    }
                    break;
                case 4:
                    acabar = true;
                    break;
            }
        }

    }

    // Mostrar menú
    public static void mostrarMenu() {
        System.out.println("Presione 1 para seleccionar los atributos de los personajes.\n" +
                "Presione 2 para elegir personajes por defecto \n" +
                "Presione 3 para comenzar el juego \n" +
                "Presione 4 para finalizar el juego");
    }

    // Leer los atributos de un jugador
    public static int[] leerAtributosJugador(String jugador) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Seleccione los atributos del personaje " + jugador);

        int velocidad = obtenerAtributo("Velocidad");
        int ataque = obtenerAtributo("Ataque");
        int defensa = obtenerAtributo("Defensa");
        int vida = obtenerAtributo("Vida");

        int total = velocidad + ataque + defensa + vida;
        if (total < 4 || total > 500) {
            System.out.println("El total de puntos debe ser entre 4 y 500. Total actual: " + total);
            return leerAtributosJugador(jugador);  // Reintentar si no es válido
        }
        return new int[]{velocidad, ataque, defensa, vida};
    }

    // Función para obtener un atributo específico
    public static int obtenerAtributo(String nombre) {
        int atributo;
        Scanner scan=new Scanner(System.in);
        do {
            System.out.println("Seleccione su " + nombre + " (entre 1 y 200): ");
            atributo = scan.nextInt();
            if (atributo < 1 || atributo > 200) {
                System.out.println("Los valores deben ser entre 1 y 200.");
            }
        } while (atributo < 1 || atributo > 200);
        return atributo;
    }

    // Iniciar el combate
    public static void iniciarCombate(int[] jugador1, int[] jugador2) {
        Scanner scan = new Scanner(System.in);
        int turno = 1;

        while (jugador1[3] > 0 && jugador2[3] > 0) {
            System.out.println("Turno " + turno);
            mostrarVida(jugador1, jugador2);

            realizarAccion(jugador1, jugador2);
            if (jugador2[3] > 0) {
                realizarAccion(jugador2, jugador1);
            }

            turno++;
            if (jugador1[3] <= 0) {
                System.out.println("¡El jugador 2 ha ganado!");
                break;
            }
            if (jugador2[3] <= 0) {
                System.out.println("¡El jugador 1 ha ganado!");
                break;
            }
        }
    }

    // Mostrar la vida
    public static void mostrarVida(int[] jugador1, int[] jugador2) {
        System.out.println("Jugador 1 vida: " + jugador1[3]);
        System.out.println("Jugador 2 vida: " + jugador2[3]);
    }

    // Realizar acción
    public static void realizarAccion(int[] atacante, int[] defensor) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Jugador," +atacante+"elige tu acción:");
        System.out.println("1. Atacar");
        System.out.println("2. Curarse");
        int accion = scan.nextInt();
        if (accion == 1) {
            ejecutarAtaque(atacante, defensor);
        } else if (accion == 2) {
            curarse(atacante);
        }
    }

    // Ejecutar el ataque
    public static void ejecutarAtaque(int[] atacante, int[] defensor) {
        int daño = calcularDaño(atacante[1], defensor[2]);
        defensor[3] -= daño;
        if (defensor[3] < 0) {
            defensor[3] = 0;
        }
        System.out.println("Jugador con ataque " + atacante[1] + " inflige " + daño + " puntos de daño.");
    }

    // Calcular daño
    public static int calcularDaño(int ataque, int defensa) {
        double daño = (ataque * (ataque / 2.0)) / (defensa + 100);
        return Math.max((int) daño, 1);
    }

    // Curarse
    public static void curarse(int[] jugador) {
        int cantidadCurada = 20;
        jugador[3] += cantidadCurada;
        if (jugador[3] > 200) {
            jugador[3] = 200;
        }
        System.out.println("Jugador se cura " + cantidadCurada + " puntos de vida. Vida actual: " + jugador[3]);
    }
}
