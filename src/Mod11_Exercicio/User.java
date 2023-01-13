package Mod11_Exercicio;

public class User implements Comparable<User>{
    private String nomeCompleto;
    private String sexoUsuario;

    public User(String nomeCompleto, String sexoUsuario) {
        this.nomeCompleto = nomeCompleto;
        this.sexoUsuario = sexoUsuario;
    }


    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getSexoUsuario() {
        return sexoUsuario;
    }

    public void setSexoUsuario(String sexoUsuario) {
        this.sexoUsuario = sexoUsuario;
    }

    @Override
    public String toString() {
        return  '\n'+"Nome:" + nomeCompleto + ','+
                " Sexo:" + sexoUsuario
                ;
    }
    //Implementação do Comparable.
    @Override
    //'User' é o nome da classe.
    public int compareTo(User sexo) {
        return this.sexoUsuario.compareTo(sexo.getSexoUsuario());
    }
}


