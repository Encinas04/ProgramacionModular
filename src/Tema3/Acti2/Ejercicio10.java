package Tema3.Acti2;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);
        int elector=0;
        boolean salir=false;
        do{
            System.out.println("Seleccione una opción del menú:\n");
            System.out.println("1.Perímetro y el área de un círculo, cuadrado y rectángulo.");
            System.out.println("2.Verificar si un número es primo o no primo.");
            System.out.println("3.Calcular el número de dígitos de un número entero.");
            System.out.println("4.Calcular el número de dígitos pares de un número entero.");
            System.out.println("5.calcular el número de dígitos impares de un número entero.");
            System.out.println("6.calcular el factorial de un número.");
            System.out.println("7.Calcular el factorial de un número de manera recursiva.");
            System.out.println("8.Cuántas soluciones tiene una ecuación de segundo grado.");
            System.out.println("9.Suma los dígitos de un número entero.");
            System.out.println("10. Salir del programa.");
            elector= scan.nextInt();

            switch(elector){
                case 1:
                    boolean salirPerimetroArea=false;
                    do {
                        System.out.println("Seleccione una opccion:\n");
                        System.out.println("1.calcular el area y perimetro de un cuadrado");
                        System.out.println("2.calcular el area y perimetro de un circulo");
                        System.out.println("3.calcular el area y perimetro de un rectangulo");
                        System.out.println("4.Salir");
                        int calcular = scan.nextInt();

                        switch (calcular) {
                            case 1:
                                System.out.println("Inserte el lado del cuadrado:");
                                double ladoCuadrado= scan.nextDouble();
                                System.out.println("El perimetro del cuadrado es "+MyMath.squarePerimeter(ladoCuadrado));
                                System.out.println("El area del cuadrado es "+MyMath.squareArea(ladoCuadrado));
                                break;
                            case 2:
                                System.out.println("Inserte el radio del circulo:");
                                double radio= scan.nextDouble();

                                System.out.println("El perimetro del circulo es "+MyMath.circlePerimeter(radio));
                                System.out.println("El area del circulo es "+MyMath.circleArea(radio));
                                break;
                            case 3:
                                System.out.println("Inserte el largo del rectangulo:");
                                double largo= scan.nextDouble();
                                System.out.println("Inserte el ancho del rectangulo:");
                                double ancho= scan.nextDouble();
                                System.out.println("El perimetro del ractangulo es "+MyMath.rectanglePerimeter(largo,ancho));
                                System.out.println("El area del rectangulo es "+MyMath.rectangleArea(largo,ancho));
                                break;
                            case 4:
                                salirPerimetroArea=true;
                                break;
                            default:
                                System.out.println("Opccion no valida");
                        }
                    }while(salirPerimetroArea==false);

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    salir=true;
                    break;
                default:
                    System.out.println("Esa opccion no es correcta\n");
            }
        }while(salir==false);

    }
}
