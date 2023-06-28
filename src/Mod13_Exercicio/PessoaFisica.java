package Mod13_Exercicio;

/**
 * @author Josiel Rocha
 * "extends" é uma classe de herença, ela está herdando os dados da classe abstrata, genérica, CadastroPessoas.
 */
public class PessoaFisica extends CadastroPessoas{
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    @Override
    public String toString() {
        return "Pessoa Fisica {" +
                "Nome = '" + getNome() + '\'' +
                ", Sobrenome = '" + getSobrenome() + '\'' +
                ", Endereco='" + getEndereco() + '\'' +
                ", CPF = '" + cpf + '\'' +
                '}';
    }
}
