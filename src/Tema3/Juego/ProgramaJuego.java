package Tema3.Juego;

import java.util.Scanner;

public class ProgramaJuego {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        boolean acabar= false;
        int opccion=6;
        while (acabar==false){
            System.out.println("Presione 1 para seleccionar los atributos de los personajes.\n" +
                    "Presione 2 para elegir personajes por defecto \n" +
                    "Presione 3 para comenzar el juego \n" +
                    "Presione 4 para finalizar el juego");

            opccion = scan.nextInt();

            switch (opccion){
                case 1:
                    int elegirJugador=0;
                    do{
                        System.out.println("Elija el personaje que desea poner los atributos:" +
                                "(1) jugador" +
                                "(2) jugador");
                        elegirJugador= scan.nextInt();

                    }while(elegirJugador!=1 && elegirJugador!=2);



                    break;
                case 2:
                    
                    break;
                case 3:
                    break;
                case 4:
                    acabar=true;
                    break;
            }

        }
    }

}
