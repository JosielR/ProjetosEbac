package Mod10_Controle_fluxos;


public class ControleFluxoBreak {
    public static void main(String[] args) {
        for(int contador=1; contador<=100; contador ++){
            System.out.println("A repetição vai até: "+contador);
            if (contador==10)
                break;
        }
    }
}
