package Tema3.Matrices;

import java.util.Arrays;
import java.util.Scanner;

public class MyMatrix {
    public static void main(String[]args){
        int[][] matriz={
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] matriz2= {
                {9, 8, 7},
                {6, 2, 4},
                {3, 2, 1}
        };
    }
    public static void impresionMatriz(int[][] matriz){
        System.out.println(Arrays.deepToString(matriz));
    }
    public static int maxMatriz(int[][] matriz){
        int max = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j=0;j<matriz[i].length;j++)
            if (matriz[i][j] > max) {
                max = matriz[i][j];
            }
        }
        return max;
    }
    public static int minMatriz(int[][] matriz){
        int min = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j=0;j<matriz[i].length;j++)
                if (matriz[i][j] < min) {
                    min = matriz[i][j];
                }
        }
        return min;
    }
    public static int mediaMatriz(int[][] matriz){
        int sum=0;
        int contador=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sum = sum + matriz[i][j];
                contador++;
            }
        }
        int solucion=sum/contador;
        return solucion;
    }
    public static boolean existeMatriz(int[][] matriz){
        Scanner scan=new Scanner(System.in);
        System.out.println("Ingrese el numero que desea comprobar: ");
        int numero= scan.nextInt();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
               if ( matriz[i][j]==numero){
                   return true;
               }
            }
        }
        return false;
    }
    public static int repetitivo(int[][] matriz){
        Scanner scan=new Scanner(System.in);
        System.out.println("Ingrese el numero que desea comprobar: ");
        int numero= scan.nextInt();
        int contador=0;
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[i].length;j++){
                if (numero==matriz[i][j]){
                    contador++;
                }
            }
        }
        return contador;
    }
    public static int[][] suma( int[][] matriz,  int[][] matriz2){
        int[][] suma=new int[3][3];
        for(int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[i].length;j++)
                suma[i][j]=(matriz[i][j])+(matriz2[i][j]);
        }
        return suma;
    }
    public static int[][] resta( int[][] matriz,  int[][] matriz2){
        int[][] resta=new int[3][3];
        for(int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[i].length;j++)
                resta[i][j]=(matriz[i][j])-(matriz2[i][j]);
        }
        return resta;
    }
    public static boolean matrizUnidad(int[][] matriz){
        for(int i=0;i<matriz.length;i++) {
            for (int j = 0; j < matriz[i].length; j++){
               if (i==j){
                   if (matriz[i][j]!=1){
                       return false;
                   }
               }else{
                   if (matriz[i][j]!=0){
                       return false;
                   }
               }

            }
         }
        return true;
    }

}


