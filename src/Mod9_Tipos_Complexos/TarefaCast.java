package Mod9_Tipos_Complexos;

/**
 * @author Josiel Rocha
 * Exercício de fixação sobre tipos complexos e casting.
 */
public class TarefaCast {
    public static void main(String arg[]){
        // Cast implícito
        int num1 = 100;
        System.out.println(num1);

        Integer num2 = num1;
        System.out.println(num2);

        //Cast explícito
        long num3 = 54898732156l;
        System.out.println(num3);

        Short num4 = (short) num3;
        System.out.println(num4);
    }
}
