package Mod7_Tarefa_Classes;

import java.util.Scanner;

public class OperadorResto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira um valor em gramas:");

        int gramas = input.nextInt();
        int kilos = gramas/1000;
        gramas = gramas%1000;
        System.out.println("Seu peso em gramas é: "+ gramas+"g");
        System.out.println("Seu peso em kilos é: "+ kilos+"Kg");
    }
}
