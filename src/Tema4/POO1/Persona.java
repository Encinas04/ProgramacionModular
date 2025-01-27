package Tema4.POO1;
import java.util.Scanner;

public class Persona {
    private static final String dni="38695820A";
    private String nombre;
    private String apellidos;
    private int edad;
    private int adultAge;
    private int retiredAge;

    public Persona(String dni,String nombre, String apellidos,int edad){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad=edad;
    }

    public String getDni(){
        return dni;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellidos(){
        return apellidos;
    }
    public int getEdad(){
        return edad;
    }
    public void setNombre(String nombre) {
        if (apellidos.length() > 0) {
            this.nombre = nombre;
        } else {
            System.out.println("El nombre no pueden estar vacío.");
        }
    }
    public void setApellidos(String apellidos) {
        if (apellidos.length() > 0) {
            this.apellidos = apellidos;
        } else {
            System.out.println("Los apellidos no pueden estar vacíos.");
        }
    }
    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce los datos de la primera persona:");
        System.out.print("DNI: ");
        String dni1 = scanner.nextLine();
        System.out.print("Nombre: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Apellidos: ");
        String apellidos1 = scanner.nextLine();
        System.out.print("Edad: ");
        int edad1 = scanner.nextInt();

        scanner.nextLine();
        Persona persona1 = new Persona(dni1, nombre1, apellidos1, edad1);


        System.out.println("\nIntroduce los datos de la segunda persona:");
        System.out.print("DNI: ");
        String dni2 = scanner.nextLine();
        System.out.print("Nombre: ");
        String nombre2 = scanner.nextLine();
        System.out.print("Apellidos: ");
        String apellidos2 = scanner.nextLine();
        System.out.print("Edad: ");
        int edad2 = scanner.nextInt();


        Persona persona2 = new Persona(dni2, nombre2, apellidos2, edad2);


        System.out.println("\nInformación de la primera persona:");
        persona1.imprimirDatos();
        System.out.println("Es mayor de edad?");
        System.out.println(persona1.isAdult());
        System.out.println("Esta retirado?");
        System.out.println(persona1.isRetired());

        System.out.println("\nInformación de la segunda persona:");
        persona2.imprimirDatos();
        System.out.println("Es mayor de edad?");
        System.out.println(persona2.isAdult());
        System.out.println("Esta retirado?");
        System.out.println(persona2.isRetired());
    }
    public void imprimirDatos(){
        System.out.println(dni);
        System.out.println(nombre);
        System.out.println(apellidos);
        System.out.println(edad);
    }

    public boolean isAdult(){
        if (edad>=18){
            return true;
        }else {
            return false;
        }
    }
    public boolean isRetired(){
        if (edad>65){
            return true;
        }else {
            return false;
        }
    }
    public int ageDiference(int edadEscrita){
        int resultado;
        if (edadEscrita>=edad){
            resultado=edadEscrita-edad;
        }else {
            resultado=edad-edadEscrita;
        }
        return resultado;
    }

    public void chekDni(){
        if (dni.length()<9||dni.length()>9){
            System.out.println("El dni es muy corto");

        }else{
            char ultimoCaracter=dni.charAt(dni.length()-1);
            if (ultimoCaracter == 'A' || ultimoCaracter == 'B' || ultimoCaracter == 'C' ||
                    ultimoCaracter == 'D' || ultimoCaracter == 'E' || ultimoCaracter == 'F' ||
                    ultimoCaracter == 'G' || ultimoCaracter == 'H' || ultimoCaracter == 'I' ||
                    ultimoCaracter == 'J' || ultimoCaracter == 'K' || ultimoCaracter == 'L' ||
                    ultimoCaracter == 'M' || ultimoCaracter == 'N' || ultimoCaracter == 'O' ||
                    ultimoCaracter == 'P' || ultimoCaracter == 'Q' || ultimoCaracter == 'R' ||
                    ultimoCaracter == 'S' || ultimoCaracter == 'T' || ultimoCaracter == 'U' ||
                    ultimoCaracter == 'V' || ultimoCaracter == 'W' || ultimoCaracter == 'X' ||
                    ultimoCaracter == 'Y' || ultimoCaracter == 'Z') {
                System.out.println("El dni es correcto");
            } else {
                System.out.println("El DNI no termina con una letra del abecedario.");
            }
        }
    }


}
