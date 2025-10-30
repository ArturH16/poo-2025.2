package br.com.artur.poo.funcionario;

public class Funcionario {
	 public String nome;
	   public String matricula;
	   public String funcao;

	     public Funcionario(String nome, String matricula, String funcao) {
	    this.nome = nome;
	    this.matricula = matricula;
	    this.funcao = funcao;

	   }
	   
	   public void verFuncao() {
	    System.out.println("A funcão do funcionário é " + this.funcao);
	   }

}
