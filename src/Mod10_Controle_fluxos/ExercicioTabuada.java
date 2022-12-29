package Mod10_Controle_fluxos;

import java.util.Scanner;

public class ExercicioTabuada {
    public static void main(String[] args) {
        tabuadaSimples();
    }

    private static void tabuadaSimples(){
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um número para gerar a tabuada: ");

        int num = s.nextInt();
        for(int i = 0; i<=10; i++){
            System.out.println(num + "x" + i + " = " + num*i);
        }
    }
}
