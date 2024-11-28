package Tema3;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[]args){

        Scanner scan=new Scanner(System.in);
        int numero=-1;

        do {

           System.out.println("Escriba el numero positivo");
            numero= scan.nextInt();

            if (primo(numero)==true){
                System.out.println("El numero es primo");
            }else {
                System.out.println("El numero no es primo");
            }

       }while(numero!=0);



    }
    public static boolean primo(int numero){

       for (int i=2;i<=numero;i++){
           if (numero%i==0){
               return false;
           }else{
               return true;
           }
       }
        return false;

    }
}
