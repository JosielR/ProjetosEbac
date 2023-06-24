package Mod12_Exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();

        while (true) {
            System.out.print("Digite o nome da pessoa (ou 'sair' para encerrar): ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite o sexo da pessoa (M/F): ");
            String sexo = scanner.nextLine();

            if (sexo.equalsIgnoreCase("M")) {
                masculino.add(nome);
            } else if (sexo.equalsIgnoreCase("F")) {
                feminino.add(nome);
            } else {
                System.out.println("Sexo inválido! Digite M para masculino ou F para feminino.");
            }
        }

        System.out.println("------ Grupo Masculino -----");
        for (String nome : masculino) {
            System.out.println(nome);
        }

        System.out.println("------ Grupo Feminino ------");
        for (String nome : feminino) {
            System.out.println(nome);
        }
    }
}

