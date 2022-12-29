package Mod10_Controle_fluxos;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Josiel Rocha
 */
public class ControleFluxosFor {
    public static void main(String arg[]) {
        for1();
        forInteger();
    }
        private static void for1(){
        for(int i = 0; i<=10; i++){
            System.out.println("Linha " + i);
        }
    }

        private static void forInteger(){
            List<Integer> valores = new ArrayList<>();
            for(int i = 0; i<=10; i++){
                System.out.println("Linha " + i);
                valores.add(i);
            }
            //Com esse for não sabemos quantos números a lista possui. Então vai rodar até acabar.
            for(Integer i: valores){
                System.out.println("Linha "+ i);
            }

            //For aprimorada. Versão lambda.
            valores.forEach(i-> System.out.println("Linha "+ i));
        }
}
