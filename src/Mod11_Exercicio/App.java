package Mod11_Exercicio;

import java.util.*;

/**
 * @author Josiel Rocha
 * Exercicio do Módulo 11.
 */
public class App {

    public static void main(String[] args) {
        registroNomes();
    }

    private static void registroNomes(){
        //Lista tipada como User. Encontrado na Classe User.
        ArrayList<User> usuarios = new ArrayList<User>();
        System.out.println("Vamos começar o seu cadastro.");

        Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o seu nome completo: ");
            String nomeCompleto = scanner.nextLine();

            System.out.println("Digite o seu sexo: ");
            String sexoUsuario = scanner.nextLine();

            //Novos usuarios
            User novoUsuario = new User(nomeCompleto, sexoUsuario);
            usuarios.add(novoUsuario);
            scanner.close();

        //Usuarios registrados
        User a = new User("Arthur Sousa", "Masculino");
        User b = new User("Josiel Rocha", "Masculino");
        User c = new User("Julha Catarina", "Feminino");
        User d = new User("Dara Cristina", "Feminino");
        User e = new User("Amanda Caroline", "Feminino");
        User f = new User("Sebastião Humberto", "Masculino");

        usuarios.add(a);
        usuarios.add(b);
        usuarios.add(c);
        usuarios.add(d);
        usuarios.add(e);
        usuarios.add(f);

// Usuario separados por sexo
        Collections.sort(usuarios);
        System.out.println(usuarios);

    }
}

