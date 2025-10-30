package br.com.artur.poo.pessoa;

import br.com.artur.poo.funcionario.Funcionario;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa aluno = new Pessoa("artur",18,"m");
	    System.out.println(aluno.idade);
	    Funcionario jose = new Funcionario("josé","320","zelador");
	    jose.verFuncao();

	}

}
