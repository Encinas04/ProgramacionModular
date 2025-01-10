package Tema3.Arrays;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class BuscarParejas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] animales = {"León", "Mandril", "Suricata", "Facóquero", "Elefante", "Cebra", "Jirafa", "Hipopótamo", "Rinoceronte", "Tigre","León", "Mandril", "Suricata", "Facóquero", "Elefante", "Cebra", "Jirafa", "Hipopótamo", "Rinoceronte", "Tigre"};
        String[] tablero = {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x",};
        boolean[] visibles = new boolean[20];
        aleatorio(animales);
        resultado(animales, visibles, tablero);

        aleatorio(animales);
    }

    public static void aleatorio(String[] animales){
        Random rand = new Random();
        for (int i =0;i< animales.length;i++){
            int j= rand.nextInt(animales.length);
            String temp=animales[i];
            animales[i]=animales[j];
            animales[j]=temp;
        }
    }


    public static void resultado(String[] animales, boolean[] visibles,String[] tablero){
        Scanner scanner = new Scanner(System.in);
        int numero1=-1;
        int numero2=-1;
        boolean acabarjuego=false;
        int parejaCount = 0;

        while(!acabarjuego){
            System.out.println("El tablero actual es=");
            for (int i=0;i<tablero.length;i++){
                System.out.print(tablero[i]+" ");
            }
            System.out.println("");
            System.out.println("escriba el primer numero del 1 al 20");
            numero1= scanner.nextInt()-1;
            System.out.println("Escriba el segundo numero del 1 al 20");
            numero2= scanner.nextInt()-1;

            if (animales[numero1].equals(animales[numero2])){
                System.out.println("ACERTASTE LA PAREJA!!");
                tablero[numero1]=animales[numero1];
                tablero[numero2]=animales[numero2];
                parejaCount++;
            }else{
                System.out.println("fallaste!!");
            }
           if (parejaCount==10){
               System.out.println("Felicidades, acabaste el juego");
               acabarjuego=true;
           }

        }


    }
}

