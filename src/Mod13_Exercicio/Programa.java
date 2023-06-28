package Mod13_Exercicio;

import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        List<CadastroPessoas> cadastros = new ArrayList<>();

        // Cadastro Pessoa Física
        PessoaFisica cadastropf = new PessoaFisica();
        cadastropf.setNome("Josiel");
        cadastropf.setSobrenome("Rocha");
        cadastropf.setEndereco("Quadra 10 Conjunto C Casa 29");
        cadastropf.setCpf("000.111.222-33");
        cadastros.add(cadastropf);


        // Cadastro Pessoa Jurídica
        PessoaJurica cadastropj = new PessoaJurica();
        cadastropj.setNome("Anabele");
        cadastropj.setSobrenome("Gloss");
        cadastropj.setEndereco("Quadra 30 Conjunto A Casa 01");
        cadastropj.setCnpj("05.311.244/0001-09");
        cadastros.add(cadastropj);

        // Impressão da coleção
        for (CadastroPessoas cadastro : cadastros){
            System.out.println(cadastro);
        }

    }
}
