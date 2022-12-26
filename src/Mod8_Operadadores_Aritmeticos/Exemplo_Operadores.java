package Mod8_Operadadores_Aritmeticos;

/** Operadores aritméticos
 * Primeiro deve-se declarar uma classe. Exemplo: public class Exemplo_Operadores
 *
 * Depois deve-se criar um método principal para atribuir valores, por exemplo, as operações:
 * public static void main(Strings[]args){
 * operacoesAritmeticas();
 * operacoesAtribuicoes();
 * operacoesIncrementoDecremento();
 *
 * private static void operacoesAritmeticas(){
 *     int num1 = 10;
 * }
 *
 **/
public class Exemplo_Operadores{
    public static void main(String[] arg) {
        operacoesIncrementoDecremento();
        operacoesAritmeticas();
        operacoesRelacionais();
        operadoresLogicos();
    }

    /**
     * Operadores de incremento e decremento
     * ++ ou -- acrescentam +1 ou -1
     */
    private static void operacoesIncrementoDecremento() {
        int num1 = 2;
        int num2 = 3;
        num1++;
        System.out.println(num1++);
    }

    /**
     * Operadores Aritméticos
     * Possuem duas ordens. 1ª ordem: + e -. 2ª ordem / e *
     */
    private static void operacoesAritmeticas() {

        int num1 = 10;
        int num2 = 20;

        int num3 = num1 + num2;

        System.out.println(num3);
    }

    /**
     * Operadores Relacionais
     * Muito utilizados em booleans e outros métodos como for, por exemplo.
     * <, <=, >, >=, ==, !=
     */
    private static void operacoesRelacionais() {
        int num1 = 50;
        int num2 = 60;

        boolean isMaior = num1 > num2;
        System.out.println("isMaior: " + isMaior);

        boolean isMenor = num1 < num2;
        System.out.println("isMenor: " + isMenor);

        boolean isDiferente = num1 != num2;
        System.out.println("isDiferente: " + isDiferente);

    }

    /** Operadores Lógicos
     * São eles: && (and), || (ou) e ! (not).
     * No caso de usar ||, a primeira condição a ser análisada irá dar o resultado. Se a primeira condição for falsa ele irá executar a segunda condição.
     */
    private static void operadoresLogicos(){
        int num1 = 10;
        int num2 = 5;
        System.out.println(num1+num2);

        boolean isMaiorIgual = num2 >= num1;
        System.out.println("isMaiorIgual: "+ isMaiorIgual);

        boolean isDentro10 = num1 > 1 && num1 <=10;
        //1...10
        System.out.println("isDentro10: "+ isDentro10);
    }
}
