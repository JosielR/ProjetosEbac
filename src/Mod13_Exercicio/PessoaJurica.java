package Mod13_Exercicio;

public class PessoaJurica extends CadastroPessoas{
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    @Override
    public String toString() {
        return "Pessoa Jurídica {" +
                "Nome = '" + getNome() + '\'' +
                ", Sobrenome = '" + getSobrenome() + '\'' +
                ", Endereco = '" + getEndereco() + '\'' +
                ", CNPJ = '" + cnpj + '\'' +
                '}';
    }
}
