package br.com.artur.poo.fisiculturista;

public class Fisiculturista {
	String nome;
	int idade;
	int campeonatosDisputados;
	boolean isTreinouHoje;
	
	Fisiculturista(String nome, int idade, int campeonatosDisputados, boolean isTreinouHoje) {
		this.nome = nome;
		this.idade = idade;
		this.campeonatosDisputados = campeonatosDisputados;
		this.isTreinouHoje = isTreinouHoje;
	}
	
	 int disputarCampeonato() {
		 return this.campeonatosDisputados ++;
		
	}
	

}
