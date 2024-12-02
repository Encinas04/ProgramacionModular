package Tema3.Acti1;

import java.util.Scanner;

public class ej4 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int elige=0;
        do {
        System.out.println("Que desea hacer: ");
        showMenu();
        elige= scan.nextInt();
        double dinero=0;
        double resultado=0;

            switch(elige){
                case 1:
                    System.out.println("Ingrese los euros");
                    dinero= scan.nextDouble();
                    resultado=euro2dollar(dinero);
                    System.out.println("Los euros que has puesto en dolares son: "+resultado);
                    break;
                case 2:
                    System.out.println("Ingrese los dolares");
                    dinero= scan.nextDouble();
                    resultado=dollar2euro(dinero);
                    System.out.println("Los dolares que has puesto en euros son: "+resultado);
                    break;
            }
        }while(elige!=3);

    }//cosas

    public static void showMenu(){
        System.out.println("Pulse 1 para pasar de euro a dolar ");
        System.out.println("Pulse 2 para pasar de dolar a euro");
        System.out.println("Pulse 3 para salir");
    }
    public static double euro2dollar(double dinero){
        return dinero*1.05;
    }
    public static double dollar2euro(double dinero){
        return dinero*0.95;
    }
}
