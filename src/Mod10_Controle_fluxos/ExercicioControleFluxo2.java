package Mod10_Controle_fluxos;
/**
 * @author Josiel Rocha
 * Exercício referente ao módulo 10. Média aritmética de 4 notas e resposta da situação do aluno diante da média obtida.
 */

import java.util.Scanner;

public class ExercicioControleFluxo2 {
    public static void main(String[] args) {
        System.out.println("Digite as suas notas a seguir.");
        System.out.println("Insira a sua primeira nota: ");
        Scanner s = new Scanner(System.in);
          double nota1 = s.nextDouble();

        System.out.println("Insira a sua segunda nota: ");
          double nota2 = s.nextDouble();

        System.out.println("Insira a sua terceira nota: ");
          double nota3 = s.nextDouble();

        System.out.println("Insira a sua quarta nota: ");
         double nota4 = s.nextDouble();

         double mediaNotas = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Média das notas: " + mediaNotas);
        if (mediaNotas >= 7) {
            System.out.println("Você está aprovado.");
        }else if (mediaNotas >= 5 && mediaNotas <= 6) {
            System.out.println("Você está de recuperação.");
        }else{
            System.out.println("Você está reprovado.");}
    }
}
