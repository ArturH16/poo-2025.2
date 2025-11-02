package br.com.artur.poo.exercicio;

public class Treino {
	String nomeExercicio;
	String musculo;
	int series;
	int repeticoes;
	
	Treino(String nomeExercicio, String musculo, int series, int repeticoes) {
		this.nomeExercicio = nomeExercicio;
		this.musculo = musculo;
		this.series = series;
		this.repeticoes = repeticoes;
	}
	
	public void verExercicio() {
		System.out.println("O nome do exercício feito foi " + this.nomeExercicio);
	}

}
