package Mod11_ArrayList;
/**
 * @author Josiel Rocha
 */

import java.util.ArrayList;
import java.util.List;


public class ArraListExemplo {
    public static void main(String[] args) {
        ArrayListSimples();
        ArrayListNumeros();
    }

    private static void ArrayListSimples() {
        System.out.println("Exemplo de ArrayList simples.");
        List<String> listaNome= new ArrayList<String>();
        listaNome.add("Josiel Rocha");
        listaNome.add("Filho do Bill");
        listaNome.add("Thiago Jhonatan");
        System.out.println("Usuários cadastrado: " + listaNome);
    }
    private static void ArrayListNumeros(){
        System.out.println("Exemplo de ArrayList números.");
        List<Integer>listaNumeros = new ArrayList<>();
        listaNumeros.add(1);
        listaNumeros.add(23);
        listaNumeros.add(65);
        System.out.println("Números cadastrados: " + listaNumeros);

    }
}