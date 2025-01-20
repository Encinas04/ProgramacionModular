package Tema3.Strings;

public class MyString {
    public static void main(String[]args){
        String cadena="paquito elcocas";
        String cadena2="pacopaquito";
        System.out.println(vocales(cadena));
    }
    public static String invertir(String cadena){
        String invertido="";
        for (int i=cadena.length()-1;i>=0;i--){
            invertido=invertido+cadena.charAt(i);
        }
        invertido=invertido.toUpperCase();
        return invertido;
    }
    public static String vocales(String cadena){
        String vocales="";
        String vocal="aeiou";
        for (int i=0;i<cadena.length();i++){
            if (vocal.indexOf(cadena.charAt(i))!=-1){
                vocales+=cadena.charAt(i);
            }
        }
        return vocales;
    }

    public static String largo( String cadena){
        String largo="";
        String[] palabra =cadena.split(" ");
        for (int i=0;i<palabra.length;i++){
            if (palabra[i].length()>largo.length()){
                largo=palabra[i];
            }
        }
        return largo;
    }
    public static int contiene(String cadena, String cadena2){
        int contador=0;
        int indice=0;
        while((indice=cadena.indexOf(cadena2,indice))!=1){
            contador++;
            indice+=cadena2.length();
        }
        return contador;
    }



}
