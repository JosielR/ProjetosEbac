package Mod7;

public class PrimeiraClasse {
    public static void main(String[]args){
        System.out.println("Olá, Josiel!");
        Cliente cliente = new Cliente();
        cliente.cadastrarEndereco("Quadra 5 Conjunto G Casa 29");
        cliente.setCodigo(1);
        //cliente.imprimirEndereco();
        String end = cliente.retornarNomeCliente();
        System.out.println(end);
        System.out.println(cliente.getValorTotal());
    }
}
