package Mod13_Exercicio;
/**
 * @author Josiel Rocha
 * Classe abstrata, ou seja, modelo genérico para outras classes
 * Elas não podem ser instanciadas.
 * Após definir as classes, Get and Set devem ser gerados
 **/
public abstract class CadastroPessoas {
    private String nome;
    private String sobrenome;
    private String endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
