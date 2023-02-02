package Mod12_Exercicio;

public class User {
    private String nomes;
    private String cadastro;
    private String nomeSexo;

    public User(String nomes, String cadastro, String nomeSexo){
        this.nomes = nomes;
        this.cadastro = cadastro;
        this.nomeSexo = nomeSexo;
    }

    public String getNomes() {
        return nomes;
    }

    public void setNomes(String nomes) {
        this.nomes = nomes;
    }

    public String getCadastro() {
        return cadastro;
    }

    public void setCadastro(String cadastro) {
        this.cadastro = cadastro;
    }

    public String getNomeSexo() {
        return nomeSexo;
    }

    public void setNomeSexo(String nomeSexo) {
        this.nomeSexo = nomeSexo;
    }

    @Override
    public String toString() {
        return "User{" +
                "nomes='" + nomes + '\'' +
                ", cadastro='" + cadastro + '\'' +
                ", nomeSexo='" + nomeSexo + '\'' +
                '}';
    }
}