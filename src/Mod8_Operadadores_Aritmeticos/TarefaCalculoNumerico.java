package Mod8_Operadadores_Aritmeticos;

/**
 * @author Josiel Rocha
 * Atividade referente ao módulo 8 Operadores Aritméticos.
 * A Classe a seguir irá incluir 4 notas, cada nota representa o desempenho de um determinado aluno.
 * A nota varia de 0 a 10. A partir disso será realizado a média aritmética das notas obtidas pelos alunos.
 */
public class TarefaCalculoNumerico {

    public static void main(String arg[]){
        calculoNumerico();
    }

    /**
     * Os números usados foram todos do tipo ponto flutuante (double), não sendo necessário utilizar variáveis como a do tipo long.
     * A escolha se deu porque com o uso do tipo inteiro o resultado não traria precisão no resultado.
     */
    private static void calculoNumerico(){
        double nota1=7;
        double nota2=6;
        double nota3=9;
        double nota4=5;

        /** Criação de uma variável, mediaNotas, que guarde o valor resultante do cálculo.
         * As notas dentro do parêntese seram executadas antes, questão de ordem, e após a soma das mesmas a divisão será iniciada.
          */
        double mediaNotas= (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Média das notas: "+mediaNotas);


    }
}
