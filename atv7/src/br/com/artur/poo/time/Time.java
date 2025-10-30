package br.com.artur.poo.time;

public class Time {
	private String nome;
	private int idade;
	private int quattitulos;
	
	
	public Time(String nome, int idade, int quattitulos) {
		setNome(nome);
		setIdade(idade);
		setquatTitulos(quattitulos);
	}
	
	public String getNome(){
		return this.nome;
	}
	public String setNome(String nome) {
		return this.nome = nome;
		
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public int setIdade(int idade) {
		return this.idade = idade;
	}
	
	public int getquatTitulos() {
		return this.quattitulos;
	}
	
	public int setquatTitulos( int quattitulos) {
		return this.quattitulos = quattitulos;
	}

}
