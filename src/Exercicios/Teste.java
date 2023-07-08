package Exercicios;
import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        ArrayList<Integer> alturas = new ArrayList<>();
        ArrayList<String> sexos = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua altura em cm:");

        for (int i = 0; i < 4; i++) {
            System.out.print("Pessoa " + (i+1) + ": ");
            String alturaInput = input.nextLine();

            if (alturaInput.equals("fim")) {
                break;
            }

            int altura = Integer.parseInt(alturaInput);
            alturas.add(altura);

            System.out.print("Digite o sexo (M ou F): ");
            String sexo = input.nextLine();
            sexos.add(sexo);
        }

        input.close();

        // Imprimir os dados armazenados
        for (int i = 0; i < alturas.size(); i++) {
            int altura = alturas.get(i);
            String sexo = sexos.get(i);
            System.out.println("Altura: " + altura + " cm, Sexo: " + sexo);
        }
    }
}
