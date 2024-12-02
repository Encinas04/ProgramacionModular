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
}
