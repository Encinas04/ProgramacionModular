package Tema3.Arrays;

import java.util.Random;
import java.util.Scanner;

public class Buscaminas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tablero = new int[20];
        String[] mostrar= {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x",};
        colocarMinas(tablero);
        solucion(mostrar, tablero);
    }
    public static void colocarMinas(int[] tablero){
        Random rand=new Random();
        int mina=-1;
        for (int i=0;i<=6;i++){
            int posicionMina= rand.nextInt(tablero.length);
            if (tablero[posicionMina]==-1){
               i--;
            }else{
                tablero[posicionMina]=mina;
            }

        }

    }
    public static void solucion(String[] mostrar ,int[] tablero ){
        Scanner scan=new Scanner(System.in);
        int eleccion=0;
        int movimiento=0;
        while(movimiento<=14){
            System.out.println("vienvendio al Buscamina\n");
            System.out.println("Este es el tablero: ");
            for (int i=0; i<=mostrar.length;i++){
                System.out.print(mostrar[i]+" ");
            }
            System.out.println("Ingrese la  del 1 al 20: ");
            eleccion= scan.nextInt()-1;

            if (tablero[eleccion]==-1){
                System.out.println("Has perdido!!!!");
            }else{
                if (tablero[eleccion - 1] == -1 && tablero[eleccion + 1] == -1){
                    tablero[eleccion]=+2;
                } else if (tablero[eleccion-1]==-1) {
                    tablero[eleccion]=+1;
                } else if (tablero[eleccion+1]==-1) {
                    tablero[eleccion]=+1;
                }
            }
        }
    }


}