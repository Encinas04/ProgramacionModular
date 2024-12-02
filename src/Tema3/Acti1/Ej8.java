package Tema3.Acti1;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Ingrese un dia(1-31)");
            int dia= scan.nextInt();

            System.out.println("Ingrese un mes(1-12)");
            int mes= scan.nextInt();

        System.out.println("Ingrese un año");
        int año= scan.nextInt();
        if (diaTrue(dia,mes,año)&&mesTrue(mes)&&añoTrue(año)){
            System.out.println("Fecha valida");
        }else{
            System.out.println("Fecha invalida");
        }

    }

    public static boolean diaTrue(int dia, int mes, int año){
       switch(mes){

           case 1,3,5,7,8,10,12:
               if (dia>=1&&dia<=31){
                   return true;
               }else{
                   return false;
               }

           case 4,6,9,11:
               if(dia>=1&&dia<=30){
                   return true;
               }else {
                   return false;
               }
           case 2:
               if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)){
                   if (dia>=1&&dia<=29){
                       return true;
                   }else{
                       return false;
                   }
               }else{
                   if (dia>=1&&dia<=28){
                       return true;
                   }else{
                       return false;
                   }
               }


           default:
               return false;

       }


    }
    public static boolean mesTrue(int mes){
     if (mes>=1&&mes<=12){
         return true;
     }else {
         return false;
     }

    }
    public static boolean añoTrue(int año){
        if (año>0){
            return true;
        }else{
            return false;
        }
    }

}
