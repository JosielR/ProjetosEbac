package Mod13_Exemplo_Agregacao;

public class Produto {
    private String nome;
    //Usamos o método setter para dar visibilidade à nome em outras classes, uma vez que ela foi definidaa como privada.
    public void setNome(String nome) {
        this.nome = nome;
    }
    //Usando o print dessa forma temos mais controle
    public void exibirNome(){
        System.out.println("Nome do produto: " + nome);
    }

    public static void main(String[] args) {
        //Nota: setNome e exibirNome foram setados antes. Agora ao iniciar o programa com o método main, definimos nomeProduto como um novo produto para a classe Produto.
        Produto nomeProduto = new Produto();
        nomeProduto.setNome("Copo");
        nomeProduto.exibirNome();

    }
}



