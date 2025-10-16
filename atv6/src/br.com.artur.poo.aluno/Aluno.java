public class Aluno {
    String nome;
    String matricula;
    int idade;
    String curso;

    public Aluno( String nome, String matricula, int idade, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        this.curso = curso;
    }

    public Aluno() {
        this.curso = "Informática";
    }

    public Aluno( int idade) {
        this.idade = idade;
    }
}