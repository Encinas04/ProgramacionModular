package Tema3.Acti1;

import java.util.Scanner;

public class Ej10 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        String opccion="0";
        boolean acabar=false;
        do{
            opcciones();
            opccion= scan.next();
            switch (opccion){
                case "a":
                    System.out.println("Ingrese el numero: ");
                    int num= scan.nextInt();
                    System.out.println(ej1.numberSign(num));
                    break;
                case "b":
                    System.out.println("Ingrese la edad: ");
                    int edad= scan.nextInt();
                    boolean esmayor= Ej2.isAdult(edad);
                    if (esmayor==true){
                        System.out.println("Es mayor de edad\n");
                }else{
                        System.out.println("Es menor de edad\n");
                    }
                    break;
                case "c":
                    System.out.println("Inserte el radio");
                    int radius= scan.nextInt();
                    System.out.println("El perimetro es "+ ej3.calculateCirclePerimeter(radius));
                    System.out.println("El area es "+ej3.calculateCircleArea(radius)+"\n");
                    break;
                case "d":
                    System.out.println("ingrese el precio: ");
                    double precio= scan.nextDouble();
                    System.out.println("En dolares es"+ ej4.euro2dollar(precio)+"\n");

                    System.out.println("En euros es "+ej4.dollar2euro(precio)+"\n");

                    break;
                case "e":
                    System.out.println("Escribe el numero: ");
                    int numero= scan.nextInt();
                    Ej5.tablaMultiplicar(numero);
                    break;
                case "f":
                    System.out.println("La tabla de multiplicar del 1 al 10 es: ");
                    Ej6.Multiplicaciones();
                    break;
                case "g":
                    System.out.println("Escribe el numero: ");
                    int numeroPrimo= scan.nextInt();
                    boolean numeroPrimoSi=Ej7.primo(numeroPrimo);

                    if (numeroPrimoSi==true){
                        System.out.println("El numero es primo\n");
                    }else {
                        System.out.println("El numero no es primo\n");
                    }

                    break;
                case "h":
                    System.out.println("Ingrese un dia(1-31)");
                    int dia= scan.nextInt();

                    System.out.println("Ingrese un mes(1-12)");
                    int mes= scan.nextInt();

                    System.out.println("Ingrese un año");
                    int año= scan.nextInt();
                    boolean fechaValida=Ej8.diaTrue(dia,mes, año);
                    if (fechaValida==true){
                        System.out.println("Fecha valida");
                    }else{
                        System.out.println("Fecha invalida");
                    }
                    break;
                case "i":
                    System.out.println("Ingrese el caracter");
                    String caracter=scan.next();
                    System.out.println("Ingrese el numero de lineas");
                    int lineas= scan.nextInt();
                    Ej9.piramide(caracter,lineas);

                    break;
                case "j":
                    acabar=true;
                    break;

            }
        }while(acabar==false);

    }
    public static void opcciones(){

        System.out.println("a) Muestra el signo de un número introducido por el usuario");
        System.out.println("b) Indica si el usuario es mayor de edad o no.");
        System.out.println("c) Calcula el área y perímetro de un círculo.");
        System.out.println("d) Conversor de euros a dólares y de dólares a euros");
        System.out.println("e) Mostrar tabla de multiplicar de un número.");
        System.out.println("f) Mostrar tablas de multiplicar del 1 al 10.");
        System.out.println("g) Comprobador de números primos.");
        System.out.println("h) Comprobador de fechas.");
        System.out.println("i) Dibujar triángulos.");
        System.out.println("j) Acabar programa");



    }
}
