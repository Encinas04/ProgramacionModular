package Tema3.Matrices;

import java.util.Random;
import java.util.Scanner;

public class atrapaLaMosca {
    public static void main(String[]args){
        int[][] matriz = new int[4][4];
        int eleccion1=0;
        int eleccion2=0;
        do {
            eleccion1=elegirPosicion(1);
            eleccion2=elegirPosicion(2);
            Random random = new Random();
            int moscaPosicion1 = random.nextInt(4);
            int moscaPosicion2=random.nextInt(4);
            matriz[moscaPosicion1][moscaPosicion2] = 1;
            solucion(matriz,eleccion1, eleccion2);
        }while(matriz[eleccion1][eleccion2]!=1);

    }
    public static int elegirPosicion(int posicion){
        Scanner scanner = new Scanner(System.in);
        int eleccion=0;
        do {
            System.out.println(posicion+" Ingrese el valor del 1 al 4");
            eleccion= scanner.nextInt()-1;
            if (eleccion<0||eleccion>3){
                System.out.println("El valor debe ser del numero 1 al 4");
            }
        }while(eleccion<0||eleccion>3);
        return eleccion;
    }
    public static void solucion( int[][] matriz, int eleccion1, int eleccion2){
        if (matriz[eleccion1][eleccion2]==1){
            System.out.println("¡¡Encontraste a la mosca!!");
        }else{
            System.out.println("Hs fallado!!");

        }
    }
}
