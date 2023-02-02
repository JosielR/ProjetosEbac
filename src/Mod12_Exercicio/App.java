package Mod12_Exercicio;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome e acrescente um hífen ao final, em seguida o seu sexo (F = Feminino, M = Masculino). Ex: Josiel - M");
        String input = scanner.nextLine();
        scanner.close();

        String[] cadastro = input.split(",|-"); // Utilizando o método split para dividir a string por vírgulas e hífens
        Map<String, String> nomesSexos = new HashMap<>(); // criando um mapa para armazenar os nomes e sexos
        String nome = "";

        // percorrendo o array de cadastro
        for (int i = 0; i < cadastro.length; i++) {
            if (i % 2 == 0) { // se o índice for par, é o nome
                nome = cadastro[i];
            } else { // se o índice for ímpar, é o sexo
                nomesSexos.put(nome, cadastro[i]); // adicionando o nome e o sexo ao mapa
            }
        }

        // imprimindo os valores
        for (Map.Entry<String, String> entry : nomesSexos.entrySet()) {
            System.out.println("Nome: " + entry.getKey() + ", Sexo: " + entry.getValue());
        }
    }
}

