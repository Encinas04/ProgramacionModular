package Tema3.Strings;

public class MyString {
    public static void main(String[]args){
        String cadena="paquito elcocas";
        String cadena2="pacopaquito";
        System.out.println(contarPalabras(cadena));
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
    public static int contarPalabras(String cadena) {
        String[] palabras = cadena.trim().split("\\s+");
        return palabras.length;
    }
    public static String formatearTelefono(String telefono) {
        String prefijo = telefono.substring(0, 3);
        String parte1 = telefono.substring(3, 6);
        String parte2 = telefono.substring(6);
        String resultado=( prefijo+"-"+parte1+"-"+parte2);
        return resultado;
    }


        public static void mostrarHistogramaVocales(String cadena) {
            cadena = cadena.toLowerCase();
            int[] frecuencias = new int[5];
            for (int i = 0; i < cadena.length(); i++) {
                char c = cadena.charAt(i);
                switch (c) {
                    case 'a':
                        frecuencias[0]++;
                        break;
                    case 'e':
                        frecuencias[1]++;
                        break;
                    case 'i':
                        frecuencias[2]++;
                        break;
                    case 'o':
                        frecuencias[3]++;
                        break;
                    case 'u':
                        frecuencias[4]++;
                        break;
                    default:
                        break;
                }
            }
            System.out.println("a " + frecuencias[0] + " " + "*".repeat(frecuencias[0]));
            System.out.println("e " + frecuencias[1] + " " + "*".repeat(frecuencias[1]));
            System.out.println("i " + frecuencias[2] + " " + "*".repeat(frecuencias[2]));
            System.out.println("o " + frecuencias[3] + " " + "*".repeat(frecuencias[3]));
            System.out.println("u " + frecuencias[4] + " " + "*".repeat(frecuencias[4]));
        }


}
