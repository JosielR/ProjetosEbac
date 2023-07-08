package Mod7_Tarefa_Classes;

import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {
        double altura, base;
        altura = 10.2;
        base = 5.6;
        double area = base*altura;
        System.out.println("A área do retângulo é:" + area);

        System.out.println("Agora calcule a área de um raio.");
        final double PI = 3.1456;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor do raio: ");
        double raio = input.nextDouble();
        double areaRaio = raio*raio*PI;

        System.out.println("A área do Raio é: "+ areaRaio);


    }
}
