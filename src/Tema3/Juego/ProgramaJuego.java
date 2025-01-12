package Tema3.Juego;

import java.util.Scanner;

public class ProgramaJuego {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenido al juego, pulse enter para comenzar");
        scan.nextLine();

        float[] personaje1 = {2, 0, 0, 0, 0};
        float[] personaje2 = {2, 0, 0, 0, 0};

        int opcion = 0;
        while (opcion != 4) {
            System.out.println("MENU:");
            System.out.println("Presione 1 para seleccionar los atributos de los personajes.\n" +
                    "Presione 2 para elegir personajes por defecto \n" +
                    "Presione 3 para comenzar el juego \n" +
                    "Presione 4 para cerrar el juego");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Configurando atributos para Personaje 1:");
                    configurarAtributos(personaje1);
                    System.out.println("Configurando atributos para Personaje 2:");
                    configurarAtributos(personaje2);
                    break;
                case 2:
                    elegirPersonajesPorDefecto(personaje1, personaje2);
                    break;
                case 3:
                    batalla(personaje1, personaje2);
                    break;
                case 4:
                    System.out.println("Saliendo del juego...");
                    break;
            }
        }
    }

    public static void configurarAtributos(float[] personaje) {
        Scanner scan = new Scanner(System.in);
        float totalPuntos = 500;

        boolean velocidadValida = false;
        while (!velocidadValida) {
            System.out.print("Velocidad (entre 1 y 200): ");
            personaje[1] = scan.nextFloat();
            if (validarRango(personaje[1])) {
                velocidadValida = true;
            } else {
                System.out.println("El valor de velocidad debe estar entre 1 y 200. Inténtalo de nuevo.");
            }
        }

        boolean ataqueValido = false;
        while (!ataqueValido) {
            System.out.print("Ataque (entre 1 y 200): ");
            personaje[2] = scan.nextFloat();
            if (validarRango(personaje[2])) {
                ataqueValido = true;
            } else {
                System.out.println("El valor de ataque debe estar entre 1 y 200. Inténtalo de nuevo.");
            }
        }

        boolean defensaValida = false;
        while (!defensaValida) {
            System.out.print("Defensa (entre 1 y 200): ");
            personaje[3] = scan.nextFloat();
            if (validarRango(personaje[3])) {
                defensaValida = true;
            } else {
                System.out.println("El valor de defensa debe estar entre 1 y 200. Inténtalo de nuevo.");
            }
        }

        boolean vidaValida = false;
        while (!vidaValida) {
            System.out.print("Vida (entre 1 y 200): ");
            personaje[4] = scan.nextFloat();
            if (validarRango(personaje[4])) {
                vidaValida = true;
            } else {
                System.out.println("El valor de vida debe estar entre 1 y 200. Inténtalo de nuevo.");
            }
        }

        while ((personaje[1] + personaje[2] + personaje[3] + personaje[4]) > totalPuntos) {
            System.out.println("La suma total de los atributos excede los " + totalPuntos + " puntos. Reconfigura los valores:");
            configurarAtributos(personaje);
        }

        System.out.println("Atributos configurados correctamente: Velocidad=" + personaje[1] +
                ", Ataque=" + personaje[2] + ", Defensa=" + personaje[3] + ", Vida=" + personaje[4]);
    }

    public static boolean validarRango(float atributo) {
        if (atributo >= 1 && atributo <= 200) {
            return true;
        } else {
            return false;
        }
    }

    public static void batalla(float[] personaje1, float[] personaje2) {
        System.out.println("¡Comienza la batalla!");
        Scanner scan = new Scanner(System.in);
        boolean batallaActiva = true;
        int ronda = 1;

        while (batallaActiva) {
            System.out.println("\nRonda " + ronda);

            System.out.println("Turno del Personaje 1");
            System.out.println("¿Qué desea hacer?\n1. Atacar\n2. Curarse");

            mostrarBarraVida(personaje1, true);

            int accion1 = scan.nextInt();

            if (accion1 == 1) {
                System.out.println("El Personaje 1 ataca!");
                personaje2[4] = atacar(personaje1[2], personaje2[3], personaje2[4]);
            } else if (accion1 == 2) {
                if (personaje1[0] > 0) {
                    System.out.println("El Personaje 1 se cura!");
                    personaje1[4] = curarse(personaje1[4]);
                    personaje1[0]--;
                    System.out.println("Pociones restantes: " + (int) personaje1[0]);
                } else {
                    System.out.println("¡No te quedan pociones!");
                }
            }

            if (personaje2[4] <= 0) {
                System.out.println("¡El Personaje 2 ha sido derrotado!");
                batallaActiva = false;
            } else {
                System.out.println("Turno del Personaje 2");
                System.out.println("¿Qué desea hacer?\n1. Atacar\n2. Curarse");

                mostrarBarraVida(personaje2, true);

                int accion2 = scan.nextInt();

                if (accion2 == 1) {
                    System.out.println("El Personaje 2 ataca!");
                    personaje1[4] = atacar(personaje2[2], personaje1[3], personaje1[4]);
                } else if (accion2 == 2) {
                    if (personaje2[0] > 0) {
                        System.out.println("El Personaje 2 se cura!");
                        personaje2[4] = curarse(personaje2[4]);
                        personaje2[0]--;
                        System.out.println("Pociones restantes: " + (int) personaje2[0]);
                    } else {
                        System.out.println("¡No te quedan pociones!");
                    }
                }

                if (personaje1[4] <= 0) {
                    System.out.println("¡El Personaje 1 ha sido derrotado!");
                    batallaActiva = false;
                }
            }

            ronda++;
        }
    }

    public static void mostrarBarraVida(float[] personaje, boolean esTurnoDelJugador) {
        if (!esTurnoDelJugador) return;

        int longitudBarra = 30;
        float porcentajeVida = personaje[4] / 200 * 100;

        int cantidadCorazones = (int) (porcentajeVida / 100 * longitudBarra);

        String barraDeVida = "♥\uFE0F".repeat(cantidadCorazones) + "─".repeat(longitudBarra - cantidadCorazones);

        System.out.println("Vida del personaje: [" + barraDeVida + "] " + (int) porcentajeVida + "%");
    }

    public static float atacar(float ataque, float defensa, float vida) {
        float constante = 50.0f;
        float daño = ataque * (1 - defensa / (defensa + constante));

        if (daño < 0) {
            daño = 0;
        }

        vida -= daño;

        System.out.println("Ataque: " + ataque + ", Defensa enemiga: " + defensa + ", Daño calculado: " + daño);
        System.out.println("Vida restante: " + vida);

        return vida;
    }

    public static float curarse(float vida) {
        float curacion = 20;
        vida += curacion;
        System.out.println("Vida restaurada en " + curacion + " puntos. Vida actual: " + vida);
        return vida;
    }

    public static void elegirPersonajesPorDefecto(float[] personaje1, float[] personaje2) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Elige el primer personaje:");
        System.out.println("1. Guerrero (Pociones: 3, Velocidad: 50, Ataque: 150, Defensa: 100, Vida: 200)");
        System.out.println("2. Arquero (Pociones: 2, Velocidad: 100, Ataque: 120, Defensa: 80, Vida: 180)");
        System.out.println("3. Hechicero (Pociones: 5, Velocidad: 30, Ataque: 170, Defensa: 60, Vida: 150)");
        int opcion1 = scan.nextInt();

        switch (opcion1) {
            case 1:
                personaje1[0] = 3; personaje1[1] = 50; personaje1[2] = 150; personaje1[3] = 100; personaje1[4] = 200;
                break;
            case 2:
                personaje1[0] = 2; personaje1[1] = 100; personaje1[2] = 120; personaje1[3] = 80; personaje1[4] = 180;
                break;
            case 3:
                personaje1[0] = 5; personaje1[1] = 30; personaje1[2] = 170; personaje1[3] = 60; personaje1[4] = 150;
                break;
        }

        System.out.println("Elige el segundo personaje:");
        System.out.println("1. Guerrero (Pociones: 3, Velocidad: 50, Ataque: 150, Defensa: 100, Vida: 200)");
        System.out.println("2. Arquero (Pociones: 2, Velocidad: 100, Ataque: 120, Defensa: 80, Vida: 180)");
        System.out.println("3. Hechicero (Pociones: 5, Velocidad: 30, Ataque: 170, Defensa: 60, Vida: 150)");
        int opcion2 = scan.nextInt();

        switch (opcion2) {
            case 1:
                personaje2[0] = 3; personaje2[1] = 50; personaje2[2] = 150; personaje2[3] = 100; personaje2[4] = 200;
                break;
            case 2:
                personaje2[0] = 2; personaje2[1] = 100; personaje2[2] = 120; personaje2[3] = 80; personaje2[4] = 180;
                break;
            case 3:
                personaje2[0] = 5; personaje2[1] = 30; personaje2[2] = 170; personaje2[3] = 60; personaje2[4] = 150;
                break;
        }
    }
}
