package Tema3.Acti1;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);

       int numero=0;
        do {
            System.out.println("Escriba el munero entero de 1 a 10:");
            numero= scan.nextInt();
        }while(numero<1||numero>10);

            tablaMultiplicar(numero);

    }

    public static void tablaMultiplicar(int numero){
        System.out.println("La tabla de multiplicar es: ");
        for (int i=0;i!=11;i++){

            System.out.println(numero+" * "+i+" = "+numero*i);
        }
    }
}
