package Mod7_Tarefa_Classes;

public class UnixTime {
    public static void main(String[] args) {
        long totalMilissegundos = System.currentTimeMillis()-10800000;
        long totalSegundos = totalMilissegundos/1000;
        long segundosAtual = totalSegundos % 60;
        long totalMinutos = totalSegundos/60;
        long minutoAtual = totalMinutos % 60;
        long totaHoras = totalMinutos/60;
        long horasAtual = totaHoras % 24;

        System.out.println(horasAtual +":" + minutoAtual +":" + segundosAtual);
    }
}
