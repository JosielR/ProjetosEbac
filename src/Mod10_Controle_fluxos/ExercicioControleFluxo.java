package Mod10_Controle_fluxos;

import java.util.Scanner;

public class ExercicioControleFluxo {
    public static void main(String arg[]) {
        calculoNota();
    }

    private static void calculoNota() {
        double nota1 = 7;
        double nota2 = 6;
        double nota3 = 9;
        double nota4 = 5;

        double mediaNotas = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Média das notas: " + mediaNotas);
        if (mediaNotas >= 7) {
            System.out.println("Você está aprovado.");
        }
        else if (mediaNotas >= 5 && mediaNotas <7) {
            System.out.println("Você está de recuperação.");
        } else {
            System.out.println("Você está reprovado.");
        }
    }
}