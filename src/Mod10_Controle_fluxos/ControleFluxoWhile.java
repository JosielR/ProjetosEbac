package Mod10_Controle_fluxos;

public class ControleFluxoWhile {

        public static void main(String[] args) {
            countWhile();
            countWhileDo();

        }
        private static void countWhile(){
            int countWhile = 0;
            while (countWhile <= 2) {
                System.out.println("Repetição nr: " + countWhile);

                //Sem o countWhile++ a repetição ficaria infinita.
                countWhile++;
            }
        }

        private static void countWhileDo(){
            int countWhileDo=0;
            do {
                System.out.println("Repetição nr: " + countWhileDo);
                countWhileDo++;
            } while (countWhileDo < 2);
        }

    }
