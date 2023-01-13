package Mod11_ArrayList;
/**
 * @author Josiel Rocha
 */
import Mod11_ArrayListDomain.ArrayListAluno;
import Mod11_ArrayListDomain.ArrayListCompNota;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListAlunoIst {
    public static void main(String[] args) {
        //Métodos criados. A inicialização se dá pelo primeiro método declarado.
        listaSimplesOrdenadaComparatorExterna();
    }
    private static void listaSimplesOrdenadaComparatorExterna(){
        System.out.println("**** Lista simples ordenada externa **** ");

        //Definimos uma nova lista com esse padrão.
        List<ArrayListAluno> lista = new ArrayList<ArrayListAluno>();

        //Chamamos esse método de outra classe (ArrayListAluno) onde as variáveis nome, idade e nota já estão instanciadas e declaradas com os métodos Getter and Setter.
        ArrayListAluno a = new ArrayListAluno("Josiel Rocha",27, 9.5);
        ArrayListAluno b = new ArrayListAluno("Vitor Hugo", 21, 8.5);
        ArrayListAluno c = new ArrayListAluno("Maria Eduarda", 15, 9.0);

        //Adiciona os dados ArrayList para variável que declaramos.
        lista.add(a);
        lista.add(b);
        lista.add(c);

        /**Comando para remover e verificar intens em uma lista:
        *lista.remove(0);
        *boolean contem = lista.contains("Josiel Rocha");
         */
        System.out.println("Lista sem ordenação" + lista);
        //Collections.sort() dá a possibilidade de ordernar a sua lista. Para isso é necessário que na Classe ArrayListAluno o CompareTo tenha sido feito.
        Collections.sort(lista);
        System.out.println("Lista com ordenação" + lista);

        //Para alterar a ordem basta ir no Compareble e trocar a ordem dos alunos. O2 e O1 ao invés de O1 e O2.
        ArrayListCompNota ComparaNota = new ArrayListCompNota();
        Collections.sort(lista);
        System.out.println("Lista com notas em ordem: " + lista);

    }
}
