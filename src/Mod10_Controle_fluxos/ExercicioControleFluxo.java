package Mod10_Controle_fluxos;

import java.util.Scanner;

public class ExercicioControleFluxo {
    public static void main(String arg[]){

        calculoNota();
        calculoNota2();
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
        if (mediaNotas == 5) {
        System.out.println("Você está de recuperação.");
        } else{
        System.out.println("Você está reprovado.");
        }
    }

      private static void calculoNota2() {
          Scanner s = new Scanner(System.in);

          double nota1 = s.nextDouble();
          System.out.println("Insira a sua primeira nota: ");
          double nota2 = s.nextDouble();
          System.out.println("Insira a sua segunda nota: ");
          double nota3 = s.nextDouble();
          System.out.println("Insira a sua terceira nota: ");
          double nota4 = s.nextDouble();
          System.out.println("Insira a sua quarta nota: ");

          double mediaNotas = (nota1 + nota2 + nota3 + nota4) / 4;
          System.out.println("Média das notas: " + mediaNotas);
                if (mediaNotas >= 7) {
                    System.out.println("Você está aprovado.");
                }
                if (mediaNotas == 5) {
                    System.out.println("Você está de recuperação.");
                } else{
                    System.out.println("Você está reprovado.");
                }
            }
        }