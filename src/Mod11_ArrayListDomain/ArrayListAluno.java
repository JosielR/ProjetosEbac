package Mod11_ArrayListDomain;

/**
 * @author Josiel Rocha
 * Exemplo de cadastro de alunos.
 */
public class ArrayListAluno implements Comparable<ArrayListAluno>{

        private String nome;
        private Integer idade;
        private Double nota;
        private String sala;

        public ArrayListAluno(String nome, Integer idade, Double nota){
            //Sem o a declaração do this todos os dados que serão declarados na classe ArrayListAlunoIst ficarão null.
            this.nome = nome;
            this.idade = idade;
            this.nota = nota;
        }

        //Declaração do método Getter and Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    //Sem o ToString o programa armazena os dados adicionados na memória com outra nomenclatura. Por isso se for preferível ter os nomes claros, use ToString.
   //Usado para converter o objeto em String.
    @Override
    public String toString() {
        return this.nome;
    }

    //CompareTo é usado para verificar entre os objetos a sua igualdade.
    @Override
    public int compareTo(ArrayListAluno aluno) {
        return this.nome.compareTo(aluno.getNome());
    }
}


