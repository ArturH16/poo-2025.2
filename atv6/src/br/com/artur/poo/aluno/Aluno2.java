package br.com.artur.poo.aluno;

public class Aluno2 {
    String nome;
    String matricula;
    int idade;
    String curso;

    public Aluno2( String nome, String matricula, int idade, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        this.curso = curso;
    }

    public Aluno2() {
        this.curso = "Informática";
    }

    public Aluno2( int idade) {
        this.idade = idade;
    }
}