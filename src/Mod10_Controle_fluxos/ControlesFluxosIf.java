package Mod10_Controle_fluxos;

import java.util.Scanner;

/**
 * @author Josiel Rocha
 * Controles de fluxos.
 */
public class ControlesFluxosIf {
    public static void main(String arg []) {
        ifElse();
        scannerIdade();
        scannerAltura();
        scannerNumero();
    }
        private static void ifElse(){
        int result=2;
        if (result>1 && result <5){
            System.out.println("Resultado está entre 2 e 4.");
        }else if (result >= 5 && result <8){
            System.out.println("Resultado maior ou igual a 5 e menor que 8.");
        }else {
            System.out.println("Resultado diferente dos anteriores.");
        }
    }

        private static void scannerIdade(){
            Scanner s = new Scanner(System.in);
            System.out.println("Digite a sua idade: ");
            int idade = s.nextInt();
            System.out.println("Você tem " +idade+ " anos.");
        }

        private static void scannerAltura(){
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = s.nextLine();

        System.out.println("\nDigite a sua altura: ");
        double altura = s.nextDouble();

        System.out.println(nome + " tem "+ altura + " de altura.");
        }

        private static void scannerNumero(){
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int result = s.nextInt();
        if(result == 1){
            System.out.println("Número igual a 1.");
        } else if (result >1){
            System.out.println("Número maior que 1.");
        } else {
            System.out.println("Número menor que 1.");
        }
        }
}
