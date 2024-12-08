package Tema3.Acti2;

import static java.lang.Math.PI;

public class MyMath {
    public static void main(String[]args){

    }

    public static double squarePerimeter(double ladoCuadrado){
        double perimetro=4*ladoCuadrado;
        return perimetro;
    }
    public static double squareArea(double ladoCuadrado){
        double area=ladoCuadrado*ladoCuadrado;
        return area;
    }
    public static double rectanglePerimeter(double largo, double ancho){
    double perimetro=2*(largo+ancho);
    return perimetro;
    }
    public static double rectangleArea(double largo, double ancho){
    double area=largo*ancho;
    return area;
    }
    public static double circlePerimeter(double radio){
    double perimetro=2*PI*radio;
    return perimetro;
    }
    public static double circleArea(double radio){
    double area=PI*4*4;
    return area;
    }
    public static boolean siPrimo(int num){
        if(num<=1){
            return false;
        } else {
            for (int i=2; i<num;i++){
                if (num%i==0){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean noPrimo(int num){
        if(num<=1){
            return true;
        } else {
            for (int i=2; i<num;i++){
                if (num%i==0){
                    return true;
                }
            }
        }
        return false;
    }
    public static int numDigitos(int num){
        int i=0;
        if (num==0){
            return 1;
        }
        for(i=0;num>0;i++){
            num=num/10;
        }
        return i;
    }
    public static int numPares(int num){
        int digitoPar=0;
        if (num==0){
            return 1;
        }
       while(num>0){
            num=num/10;

            if (num%2==0){
                digitoPar++;
            }
        }
        return digitoPar ;
    }
    public static int numImpares(int num){
        int digitoImpar=0;
        if (num==0){
            return 0;
        }
        while(num>0){
            num=num/10;

            if (num%2!=0){
                digitoImpar++;
            }
        }
        return digitoImpar ;
    }
    public static int factorial(int num){
        int total=1;
        for(int i = 1; i<=num; i++){
            total=total*i;
        }
        return total;
    }
    public static int factorialRecursiva(int num){
        int total=1;
        for(int i = num; i>=1; i--){
            total=total*i;
        }
        return total;
    }
    public static int solucionesSegundoGrado(int a, int b, int c) {
        int D = (b * b) - (4 * a * c);
        if (D > 0) {
            return 2;
        } else if (D == 0) {
            return 1;
        } else {
            return 0;
        }
    }
    public static int sumDigitos(int num){
        int sum=0;
        while(num>0){
            sum=sum+num%10;
            num=num/10;
        }
        return sum;
    }

}
