package br.com.artur.poo.pessoa;

public class Pessoa {
    public String nome;
    private String cpf;
    protected String tipoSanguineo;

     public Pessoa(String nome, String tipoSanguineo) {
        this.nome = nome;
        this.tipoSanguineo = tipoSanguineo;
    }

    public Pessoa() {

    }
    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
}
