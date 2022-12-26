package Mod7_Tarefa_Classes;

/**
 * @author Josiel Rocha
 * Início da tarefa referente ao Módulo 7.
 */
public class Tarefa_Classes {
    /** Variáveis referentes à classe Tarefa_Classes
     * Obtenção de dados CPF, Nome e Endereço
     */
    private int CPF;
    private String Nome;
    private String Endereco;

    /** Criação de métodos Get e Set (Getter and Setter)
     * Cada variável recebe dois métodos, um get e outro set.
     * @return
     */
    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }
}

