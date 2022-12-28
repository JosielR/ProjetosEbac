package Mod9_Tipos_Complexos;

/**
 * @author Josiel Rocha
 * Estudo de Casting Implícito e Explícito.
 * O Casting é um recurso para poder converter um valor para outro.
 * Exemplo: int para short
 * O boolean não pode ser moldado para nenhum outro tipo.
 * Nenhum outro tipo pode ser moldado para char.
 */
public class Casting {

    //Casting Explícito.
    //A atenção é crucial nesse tipo de conversão, pois, quando se converte um número muito grande para um menor pode gerar um número totalmente diferente.
    public static void main(String arg[]){

    int num1 = 10;
    System.out.println(num1);
    short num2 = (short) num1;
    System.out.println(num2);

    long num3 = 5555555555555l;
    System.out.println(num3);
    int num4 = (int) num3;
    System.out.println(num4);
    }

    //Casting Implícito.
    // É feito quando temos um tipo menor para um maior. int para long, por exemplo.
    int idade =10;
    long idade2 = idade;


}
