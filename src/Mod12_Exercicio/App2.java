package Mod12_Exercicio;

import java.util.Arrays;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os nomes separador por vírgula:");
        String input = sc.nextLine();
               sc.close();


        String [] cadastro = input.split(",");
        Arrays.sort(cadastro);
        for (int i = 0; i < cadastro.length; i++) {
            System.out.println(cadastro[i]);
        }
    }
}
