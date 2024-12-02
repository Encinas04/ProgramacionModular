package Tema3.Acti3;

import java.util.Scanner;

public class Utils {
    public static void main(String[]args){
    getTaxes();
    }
    public static double mines2kilometers(double millas){
        double kilometros= millas*1.60934;
        return kilometros;
    }
    public static double getTaxes(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Escriba los euros");
        double euros= scan.nextDouble();
        System.out.println("Escriba el porcentaje");
        double porcentaje= scan.nextDouble();
        double impuesto=euros*porcentaje;
        double truncado=Math.round(impuesto*100)/100.0;
        return truncado;
    }
    public static int getCoins(double euros){
        int moneda2euros=0;
        int moneda1euros=0;
        int moneda50cts=0;
        int moneda20cts=0;
        int moneda10cts=0;
        int moneda5cts=0;
        int moneda2cts=0;
        int moneda1cts=0;
        do {
            if (euros>2){
                moneda2euros++;
            }
        }while(euros==0);
        return (moneda2euros);
    }

}
