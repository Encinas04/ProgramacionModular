import java.util.Scanner;

public class ej3 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
            System.out.println("Inserte un radio mayor a 0");
            int radio= scan.nextInt();
        boolean radiosi=validRadius(radio);

        System.out.println("El Perimetro del circulo es "+calculateCirclePerimeter(radio));
        System.out.println("El area del circulo es "+calculateCircleArea(radio));
    }

    public static boolean validRadius(int radius){
        if (radius>0){
            return true;
        }else{
            return false;
        }
    }
    public static double calculateCirclePerimeter(int radius){
        return 2*3.14*radius;
    }
    public static double calculateCircleArea(int radius){
        return 3.14*(5*5);
    }

}
