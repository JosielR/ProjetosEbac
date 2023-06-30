package Mod14_CRUD;

import java.util.Objects;

/**
 * @author Josiel Rocha
 * Projeto CRUD - Cadastro de clientes
 */
public class Cliente {
    private String nome;
    private Long cpf;
    private Long telefone;
    private String endereco;
    private Integer numero;
    private String cidade;
    private String estado;

    //Os construtores são métodos especiais em uma classe que são usados para criar e inicializar objetos dessa classe.
    // Eles são usados para definir os valores iniciais dos atributos de um objeto quando ele é instanciado.
    public Cliente(String nome, Long cpf, Long telefone, String endereco, Integer numero, String cidade, String estado) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
    }

    //Método Getter and Setter
    public String getNome() {return nome;}

    public void setNome(String nome) { this.nome = nome;}

    public Long getCpf() {return cpf;}

    public void setCpf(Long cpf) {this.cpf = cpf;}

    public Long getTelefone() {return telefone;}

    public void setTelefone(Long telefone) {this.telefone = telefone;}

    public String getEndereco() {return endereco;}

    public void setEndereco(String endereco) {this.endereco = endereco;}

    public Integer getNumero() {return numero;}

    public void setNumero(Integer numero) {this.numero = numero;}

    public String getCidade() {return cidade;}

    public void setCidade(String cidade) {this.cidade = cidade;}

    public String getEstado() {return estado;}

    public void setEstado(String estado) {this.estado = estado;}


    //, equals() é usado para comparar a igualdade entre dois objetos, enquanto hashCode() é usado para gerar um valor
    // de hash único para um objeto. Ambos são importantes para trabalhar com objetos em coleções, garantindo uma
    // comparação correta e eficiente.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(cpf, cliente.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                '}';
    }
}
