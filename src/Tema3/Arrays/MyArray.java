package Tema3.Arrays;


import java.util.Scanner;

public class MyArray {
    public static void main(String[] args) {
        // Crear objeto Scanner
        Scanner scanner = new Scanner(System.in);

        int[] numeracion1 = null;
        int[] numeracion2 = null;
        boolean acabar = true;

        System.out.println("Primero, ingrese los dos arrays.");

        // Ingresar los dos arrays
        System.out.println("Ingrese los elementos para el Array 1 (6 elementos):");
        numeracion1 = ingresarArray(scanner);

        System.out.println("Ingrese los elementos para el Array 2 (6 elementos):");
        numeracion2 = ingresarArray(scanner);

        // Invertir Array 1 como ejemplo
        invertirTabla(numeracion1);

        while (acabar == true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Imprimir Array 1");
            System.out.println("2. Imprimir Array 2");
            System.out.println("3. Obtener el máximo de Array 1");
            System.out.println("4. Obtener el máximo de Array 2");
            System.out.println("5. Obtener el mínimo de Array 1");
            System.out.println("6. Obtener el mínimo de Array 2");
            System.out.println("7. Calcular la media de Array 1");
            System.out.println("8. Calcular la media de Array 2");
            System.out.println("9. Comprobar si un elemento existe en Array 1");
            System.out.println("10. Comprobar si un elemento existe en Array 2");
            System.out.println("11. Sumar los dos arrays");
            System.out.println("12. Restar los dos arrays");
            System.out.println("13. Producto escalar de los dos arrays");
            System.out.println("14. Invertir el orden de Array 1");
            System.out.println("15. Invertir el orden de Array 2");
            System.out.println("16. Verificar si Array 1 es capicúa");
            System.out.println("17. Verificar si Array 2 es capicúa");
            System.out.println("18. Salir");
            System.out.print("Seleccione una opción (1-18): ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Array 1:");
                    imprimirArray(numeracion1);
                    break;
                case 2:
                    System.out.println("Array 2:");
                    imprimirArray(numeracion2);
                    break;
                case 3:
                    System.out.println("Máximo de Array 1: " + maximo(numeracion1));
                    break;
                case 4:
                    System.out.println("Máximo de Array 2: " + maximo(numeracion2));
                    break;
                case 5:
                    System.out.println("Mínimo de Array 1: " + minimo(numeracion1));
                    break;
                case 6:
                    System.out.println("Mínimo de Array 2: " + minimo(numeracion2));
                    break;
                case 7:
                    System.out.println("Media de Array 1: " + media(numeracion1));
                    break;
                case 8:
                    System.out.println("Media de Array 2: " + media(numeracion2));
                    break;
                case 9:
                    if (existe(numeracion1, scanner)) {
                        System.out.println("El número existe en Array 1.");
                    } else {
                        System.out.println("El número no existe en Array 1.");
                    }
                    break;
                case 10:
                    if (existe(numeracion2, scanner)) {
                        System.out.println("El número existe en Array 2.");
                    } else {
                        System.out.println("El número no existe en Array 2.");
                    }
                    break;
                case 11:
                    int[] resultadoSuma = sumaVectores(numeracion1, numeracion2);
                    System.out.println("Suma de Arrays:");
                    imprimirArray(resultadoSuma);
                    break;
                case 12:
                    int[] resultadoResta = restaVectores(numeracion1, numeracion2);
                    System.out.println("Resta de Arrays:");
                    imprimirArray(resultadoResta);
                    break;
                case 13:
                    int producto = productoEscalar(numeracion1, numeracion2);
                    System.out.println("Producto escalar: " + producto);
                    break;
                case 14:
                    System.out.println("Invertir Array 1:");
                    invertirTabla(numeracion1);
                    break;
                case 15:
                    System.out.println("Invertir Array 2:");
                    invertirTabla(numeracion2);
                    break;
                case 16:
                    if (esCapicua(numeracion1)) {
                        System.out.println("Array 1 es capicúa.");
                    } else {
                        System.out.println("Array 1 no es capicúa.");
                    }
                    break;
                case 17:
                    if (esCapicua(numeracion2)) {
                        System.out.println("Array 2 es capicúa.");
                    } else {
                        System.out.println("Array 2 no es capicúa.");
                    }
                    break;
                case 18:
                    System.out.println("Saliendo...");
                    acabar = false;  // Para salir del while
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }

        scanner.close(); // Cerrar el scanner al final
    }

    // Función para ingresar un array
    public static int[] ingresarArray(Scanner scanner) {
        int[] array = new int[6]; // Tamaño fijo de 6 elementos

        for (int i = 0; i < 6; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    //  Procedimiento para imprimir un array
    public static void imprimirArray(int[] numeracion) {
        for (int i = 0; i < numeracion.length; i++) {
            System.out.println(numeracion[i]);
        }
    }

    // Función para obtener el máximo de un array
    public static int maximo(int[] numeracion) {
        int maximo = numeracion[0];
        for (int i = 1; i < numeracion.length; i++) {
            if (numeracion[i] > maximo) {
                maximo = numeracion[i];
            }
        }
        return maximo;
    }

    // Función para obtener el mínimo de un array
    public static int minimo(int[] numeracion) {
        int minimo = numeracion[0];
        for (int i = 1; i < numeracion.length; i++) {
            if (numeracion[i] < minimo) {
                minimo = numeracion[i];
            }
        }
        return minimo;
    }

    // Función para calcular la media (promedio) entre el máximo y el mínimo
    public static int media(int[] numeracion) {
        int min = minimo(numeracion);
        int max = maximo(numeracion);
        return (min + max) / 2;
    }

    // Función para comprobar si un número existe en un array
    public static boolean existe(int[] numeracion, Scanner scan) {
        System.out.print("Inserte el número que desea comprobar: ");
        int numero = scan.nextInt();
        for (int i = 0; i < numeracion.length; i++) {
            if (numero == numeracion[i]) {
                return true;
            }
        }
        return false;
    }

    // Función para sumar dos arrays
    public static int[] sumaVectores(int[] numeracion1, int[] numeracion2) {
        int[] resultado = new int[numeracion1.length];
        for (int i = 0; i < numeracion1.length; i++) {
            resultado[i] = numeracion1[i] + numeracion2[i];
        }
        return resultado;
    }

    // Función para restar dos arrays
    public static int[] restaVectores(int[] numeracion1, int[] numeracion2) {
        int[] resultado = new int[numeracion1.length];
        for (int i = 0; i < numeracion1.length; i++) {
            resultado[i] = numeracion2[i] - numeracion1[i];
        }
        return resultado;
    }

    // Función para calcular el producto escalar de dos arrays
    public static int productoEscalar(int[] numeracion1, int[] numeracion2) {
        int total = 0;
        for (int i = 0; i < numeracion1.length; i++) {
            total += numeracion1[i] * numeracion2[i];
        }
        return total;
    }

    // Procedimiento para invertir el orden de los elementos en un array
    public static void invertirTabla(int[] numeracion) {
        int inicio = 0;
        int fin = numeracion.length - 1;
        while (inicio < fin) {
            int temp = numeracion[inicio];
            numeracion[inicio] = numeracion[fin];
            numeracion[fin] = temp;
            inicio++;
            fin--;
        }
        imprimirArray(numeracion);
    }

    // Función para comprobar si un array es capicúa
    public static boolean esCapicua(int[] numeracion) {
        int inicio = 0;
        int fin = numeracion.length - 1;
        while (inicio < fin) {
            if (numeracion[inicio] != numeracion[fin]) {
                return false;
            }
            inicio++;
            fin--;
        }
        return true;
    }
}
