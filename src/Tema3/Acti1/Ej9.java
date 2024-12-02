package Tema3.Acti1;

import java.util.Scanner;

public class Ej9 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Ingrese el caracter");
        String caracter=scan.next();
        System.out.println("Ingrese el numero de lineas");
        int lineas= scan.nextInt();
        piramide(caracter,lineas);

    }
    public static void piramide(String caracter, int lineas){
        for (int i=0; i<=lineas;i++ ){
            for (int j = 0; j < lineas - i +5; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
}
