import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Escribe la edad");
        int edad= scan.nextInt();
        boolean mayor=isAdult(edad);
        if (mayor==true){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }

        System.out.println("Di un numero");
        int num= scan.nextInt();

        int resultado= ej1.numberSign(num);

        if (resultado==0){
            System.out.println("El numero es "+resultado);
        } else if (resultado>0) {
            System.out.println("El numero es "+resultado);

        }else{
            System.out.println("El numero es "+resultado);
        }
    }


    public static boolean isAdult(int edad){
        if (edad>=18){
            return true;
        }else{
            return false;
        }
    }
}
