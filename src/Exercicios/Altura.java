package Exercicios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Josiel Rocha
 *  Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. Fazer um algoritmo que calcule e escreva:
 * a. a maior e a menor altura do grupo;
 * b. média de altura dos homens;
 * c. o número de mulheres.
 */
public class Altura {
    public static void main(String[] args) {

        ArrayList<Integer>alturas = new ArrayList<>();
        ArrayList<String>sexos = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua altura em cm:");

        for(int i=1; i<=4; i++) {
            System.out.println("Pessoa " + i + ": ");
            String alturaInput = input.nextLine();

            if (alturaInput.equals("Fim.")) {
                break;
            }

            int altura = Integer.parseInt(alturaInput);
            alturas.add(altura);


            System.out.println("Digite seu sexo(M ou F): ");
            String sexo = input.nextLine();
            sexos.add(sexo);
        }
            input.close();

        for (int i=0; i< alturas.size();i++){
            int altura = alturas.get(i);
            String sexo = sexos.get(i);
            System.out.println("Altura: "+altura+ ", Sexo: "+sexo +".");
        }

        System.out.println("Agora vamos realizar uma média entre as alturas: ");
        int mediaAlturas = altura/4;

    }
}
