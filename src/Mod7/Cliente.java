package Mod7;

public class Cliente {
    private int codigo;
    private String endereco;
    private String nome;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void cadastrarEndereco(String endereco){
        this.endereco=endereco;
    }

    public void imprimirEndereco(){
        System.out.println(this.endereco);
    }
    public String retornarNomeCliente(){
        return "Endereço do Josiel";
    }
    public int getValorTotal(){return 20;}
}
