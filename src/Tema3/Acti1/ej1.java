package Tema3.Acti1;

import java.util.Scanner;

public class ej1 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Introduce el numero: ");
        int num= scan.nextInt();

        int resultado=numberSign(num);

        if (resultado==0){
            System.out.println("El numero es "+resultado);
        } else if (resultado>0) {
            System.out.println("El numero es "+resultado);

        }else{
            System.out.println("El numero es "+resultado);
        }

    }

    public static int numberSign(int num){
        if(num==0){
            return 0;
        } else if (num>0) {
            return 1;
        }else{
            return -1;

        }
    }
}
