package Mod13_HashMap_Colecao;

import java.util.HashMap;

public class CursoJava {
    public static void main(String[] args) {
        //Coleção declarada e instanciada no new Hashmap
        HashMap<Integer,String> carros = new HashMap<Integer,String>();

        //Para adicionar objetos à minha coleção Hashmap "carros":
        carros.put(0, "Civic");
        carros.put(1,"Polo");
        carros.put(2,"Gol");
        carros.put(3,"Uno");
        carros.put(4,"HB20");
        carros.put(5,"Azera");
        carros.put(6,"Celta");

        System.out.println(carros);
       // System.out.println(carros.get(2));


        //O laço "for" é usado quando você sabe a quantidade de elementos na coleção ou quando você precisa acessar os elementos por meio de um índice. Ele possui a seguinte sintaxe:
        //for (inicialização; condição; iteração) {
        // código a ser executado
        //}
        for(int i=0; i<carros.size(); i++)
        System.out.println("Veículo: " + carros.get(i));

        //"for each" (laço "for" aprimorado): O laço "for each" é usado quando você deseja percorrer todos os elementos de uma coleção sem precisar de um índice explícito. Ele é especialmente útil quando você não precisa modificar ou acessar o índice de cada elemento. A sintaxe é a seguinte:
        //for (tipo elemento : coleção) {
        // código a ser executado
        //}

        for(Integer numero: carros.keySet()){
            System.out.println("Cheve: " + numero);
        }
        int chaveDesejada = 2;
        String valorAssociado = carros.get(chaveDesejada);
        System.out.println("Valor associado à chave: " + chaveDesejada + "-" + valorAssociado);
    }
}
