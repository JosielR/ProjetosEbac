package Mod14_CRUD;

import javax.swing.*;

public class App {
        private static IClienteDAO IClienteDAO;

    public static void main(String[] args) {
        IClienteDAO = new ClienteMapDAO();
        String opcao = JOptionPane.showInputDialog("Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração ou 5 para sair.", JOptionPane.INFORMATION_MESSAGE);

        while (!isOpcaoValida(opcao)) {
            if ("".equals(opcao)){
                sair();
            }
            opcao = JOptionPane.showInputDialog("Opção inválida. Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração ou 5 para sair.",JOptionPane.INFORMATION_MESSAGE);
            //Se a opção digitada for igual a opção desejada, retornará o número 1.
            if (isOpcaoCadastro(opcao)) {
                JOptionPane.showMessageDialog(null, "Opção: " + opcao, "Erro", JOptionPane.INFORMATION_MESSAGE);
            }

            while (isOpcaoValida(opcao)){
                if(isOpcaoSair(opcao)){
                    sair();
                } else if (isCadastro(opcao)) {
                    String dados = JOptionPane.showInputDialog("Digite os dados do cliente separados por vírgula, conforme o exemplo: Nome, CPF, Telefone, Endereço Cidade", JOptionPane.INFORMATION_MESSAGE);
                    cadastrar(dados);
                    
                }
            }

        }
    }

    private static void cadastrar(String dados) {
        String[] dadosSeparados = dados.split(",");
        Cliente cliente = new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
    }

    private static boolean isCadastro(String opcao) {
        if("1".equals(opcao)){
            return true;
        }
        return false;
    }

    private static boolean isOpcaoSair(String opcao) {
        if("5".equals(opcao)){
            return true;
        }
        return false;
    }

    private static void sair() {
        JOptionPane.showMessageDialog(null,"Até logo", "Sair", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private static boolean isOpcaoCadastro(String opcao) {
        if("".equals(opcao)){
            return true;
        }
        return false;
    }

    private static boolean isOpcaoValida(String opcao){
        if("1".equals(opcao)|| "2".equals(opcao) || "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao)){
        return true;
        }
        return false;
    }
}
