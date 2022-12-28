package Mod9_Tipos_Complexos;

/**
 * @author Josiel Rocha
 * Estudo de tipos complexos de variáveis, Wrappers.
 * Wrappers são objetos e possuem mais métodos que os seus correspondentes primitivos.
 */
public class WrapperExemplos {

        private Integer codigo;
        private String endereco;
        private String nome;

        //No wrapper Long, após declarar a variável é necessário acrescentar a letra l no final.
        private Long codigoMaior = 12345678l;
        private Boolean status = false;

        //Como o Wrapper Long, o Float também precisa que seja acrescentado a letra f no final.
        private Float valorDecimal = 10.15f;
        private Character letra = 'a';

        public static void main(String arg[]){
                Long cpf = Long.valueOf(1234564);
        }


}
