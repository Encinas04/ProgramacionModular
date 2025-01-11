package Tema3.Arrays;


import java.util.Scanner;

public class MyArray {



    public static void main(String[] args) {


        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Array por defecto
        int[] array2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}; // Segundo array por defecto
        menu(array, array2);
    }
    public static void menu(int[] array, int[] array2){
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu:");
            System.out.println("1. Imprimir vector");
            System.out.println("2. Ver el máximo del vector");
            System.out.println("3. Ver el mínimo del vector");
            System.out.println("4. Ver la media del vector");
            System.out.println("5. Ver si un elemento existe en el vector");
            System.out.println("6. Sumar dos vectores");
            System.out.println("7. Restar dos vectores");
            System.out.println("8. Producto escalar de dos vectores");
            System.out.println("9. Invertir un vector");
            System.out.println("10. Invertir un vector (in-place)");
            System.out.println("11. Ver si un vector es capicúa");
            System.out.println("12. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    imprimirArray(array);
                    break;

                case 2:
                    System.out.println("El máximo del vector es: " + maximo(array));
                    break;

                case 3:
                    System.out.println("El mínimo del vector es: " + minimo(array));
                    break;

                case 4:
                    System.out.println("La media del vector es: " + media(array));
                    break;

                case 5:
                    System.out.println("Introduzca el elemento a buscar:");
                    int elemento = scanner.nextInt();
                    if (existeElemento(array, elemento)) {
                        System.out.println("El elemento existe en el vector.");
                    } else {
                        System.out.println("El elemento no existe en el vector.");
                    }
                    break;

                case 6:
                    int[] suma = sumaVectores(array, array2);
                    imprimirArray(suma);
                    break;

                case 7:
                    int[] resta = restaVectores(array, array2);
                    imprimirArray(resta);
                    break;

                case 8:
                    int producto = productoEscalar(array, array2);
                    System.out.println("El producto escalar es: " + producto);
                    break;

                case 9:
                    int[] invertido = invertirArray(array);
                    imprimirArray(invertido);
                    break;

                case 10:
                    invertirArrayInPlace(array);
                    imprimirArray(array);
                    break;

                case 11:
                    if (esCapicua(array)) {
                        System.out.println("El vector es capicúa.");
                    } else {
                        System.out.println("El vector no es capicúa.");
                    }
                    break;

                case 12:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 12);
    }
    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int maximo(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int minimo(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static double media(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return (double) suma / array.length;
    }

    public static boolean existeElemento(int[] array, int elemento) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elemento) {
                return true;
            }
        }
        return false;
    }

    public static int[] sumaVectores(int[] array1, int[] array2) {
        int[] resultado = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            resultado[i] = array1[i] + array2[i];
        }
        return resultado;
    }

    public static int[] restaVectores(int[] array1, int[] array2) {
        int[] resultado = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            resultado[i] = array1[i] - array2[i];
        }
        return resultado;
    }

    public static int productoEscalar(int[] array1, int[] array2) {
        int resultado = 0;
        for (int i = 0; i < array1.length; i++) {
            resultado += array1[i] * array2[i];
        }
        return resultado;
    }

    public static int[] invertirArray(int[] array) {
        int[] arrayInvertido = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayInvertido[i] = array[array.length - 1 - i];
        }
        return arrayInvertido;
    }

    public static void invertirArrayInPlace(int[] array) {
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    public static boolean esCapicua(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}

