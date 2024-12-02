package Tema3.Acti1;

public class Ej6 {
    public static void main(String[]args){
        Multiplicaciones();
    }

    public static void Multiplicaciones(){
        for(int i=0;i!=11;i++){
            for (int num2=0;num2!=11;num2++){
                System.out.println(i+" * "+num2+"="+i*num2);
            }
            System.out.println("\n");
        }
    }
}
