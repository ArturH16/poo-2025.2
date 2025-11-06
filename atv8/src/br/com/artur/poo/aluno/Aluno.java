package br.com.artur.poo.aluno;
import br.com.artur.poo.pessoa.Pessoa;

public class Aluno extends Pessoa {
    public String matricula;
   public double notas;

    public Aluno(String nome, String cpf,String tipoSanguineo, String matricula, double notas) {
        super(nome,tipoSanguineo);
        super.setCpf(cpf);
        this.matricula = matricula;
        this.notas = notas;
    }

    public void mostrarInformacoes() {
        System.out.println("Olá aluno " + super.nome + "\nSeu CPF é " + super.getCpf() + "\nSeu tipo sanguíneo é " + tipoSanguineo + "\nSua matrícula é " + this.matricula + "\nSua nota na prova foi " + this.notas);
    }
    
}
