package Tema3.Strings;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[]args) {
        Scanner scan=new Scanner(System.in);
    System.out.println("Ingrese la frase");
        String texto= scan.next();
        encrypt(texto);

    }
    public static String encrypt(String texto){

        for (int i=0;i<texto.length();i++){
            char caracter=texto.charAt(i);
            caracter+=1;
        }
return "";

    }
}
