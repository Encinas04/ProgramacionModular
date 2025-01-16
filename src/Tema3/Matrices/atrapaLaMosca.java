import java.util.Random;
import java.util.Scanner;

public class atrapaLaMosca{
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[4][4];
        int eleccion1 = 0;
        int eleccion2 = 0;
        int moscaPosicion1 = random.nextInt(4);
        int moscaPosicion2 = random.nextInt(4);
        matriz[moscaPosicion1][moscaPosicion2] = 1;

        do {
            eleccion1 = elegirPosicion(1);
            eleccion2 = elegirPosicion(2);

            if (matriz[eleccion1][eleccion2] != 1) {
                System.out.println("Has fallado");
                if (esAdyacente(moscaPosicion1, moscaPosicion2, eleccion1, eleccion2)) {
                    System.out.println("La mosca se ha movido!");
                    moscaMueve(matriz, moscaPosicion1, moscaPosicion2);
                    moscaPosicion1 = random.nextInt(4);
                    moscaPosicion2 = random.nextInt(4);

                }
            }

        } while (matriz[eleccion1][eleccion2] != 1);

        System.out.println("¡¡Encontraste a la mosca!!");
    }

    public static int elegirPosicion(int posicion) {
        Scanner scanner = new Scanner(System.in);
        int eleccion = 0;
        do {
            System.out.println(posicion + " Ingrese el valor del 1 al 4");
            eleccion = scanner.nextInt() - 1;
            if (eleccion < 0 || eleccion > 3) {
                System.out.println("El valor debe ser del numero 1 al 4");
            }
        } while (eleccion < 0 || eleccion > 3);
        return eleccion;
    }


    public static boolean esAdyacente(int moscaPosicion1, int moscaPosicion2, int eleccion1, int eleccion2) {
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (moscaPosicion1 + i == eleccion1 && moscaPosicion2 + j == eleccion2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void moscaMueve(int[][] matriz, int moscaPosicion1, int moscaPosicion2) {
        Random random = new Random();
        int nuevaPosicion1 = random.nextInt(4);
        int nuevaPosicion2 = random.nextInt(4);

        matriz[moscaPosicion1][moscaPosicion2] = 0;
        matriz[nuevaPosicion1][nuevaPosicion2] = 1;
    }
}


