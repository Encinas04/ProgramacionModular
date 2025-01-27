package Tema4.POO1;

public class Reloj {
    private int hora;
    private int minuto;
    private int segundo;
    private boolean horas12=false;

    public Reloj(){
        this.hora=0;
        this.minuto=0;
        this.segundo=0;
        this.horas12=false;
    }
    public Reloj(int hora, int minuto, int segundo){
        this.hora=hora;
        this.minuto=minuto;
        this.segundo=segundo;
        this.horas12=false;
    }
    public int getHora(){
        return hora;

    }

    public void setHora(int hora){
        if (!horas12) {
            if (hora >= 0 && hora <= 23) {
                this.hora = hora;
            } else {
                System.out.println("Hora no válida para formato de 24 horas.");
            }
        } else {
            if (hora >= 0 && hora <= 12) {
                this.hora = hora;
            } else {
                System.out.println("Hora no válida para formato de 12 horas.");
            }
        }
    }
    public int getMinuto(){
        return minuto;
    }

    public void setMinuto(int minuto){
        if (minuto>=0&& minuto<=59){
            this.minuto=minuto;
        }else{
            System.out.println("Minutos no validos, por favor ingrese de 0 a 59 minutos");
        }
    }
    public int getSegundo(){
        return segundo;
    }
    public void setSegundo(int segundo){
        if (segundo>=0&& segundo<=59){
            this.segundo=segundo;
        }else{
            System.out.println("Segundos no validos, por favor ingrese de 0 a 59 segundos");
        }
    }


    public String toString() {
        if (!horas12){
            return hora + ":" + minuto + ":" + segundo;
        }else{
            if (hora<=12){
                return hora + ":" + minuto + ":" + segundo;
            }else{
                return (hora-12)+":"+minuto+":"+segundo;
            }
        }


    }

    public void mostrarHora(){
        System.out.println(this);

    }
}
