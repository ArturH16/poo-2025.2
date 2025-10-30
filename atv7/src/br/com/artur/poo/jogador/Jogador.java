package br.com.artur.poo.jogador;

public class Jogador {
	private String nome;
	private String time;
	private String posicao;
	
	Jogador(String nome, String time, String posicao) {
		setNome(nome);
		setTime(time);
		setPosicao(posicao);
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public String getTime(){
		return this.time;
	}
	
	public String getPosicao(){
		return this.posicao;
	}
	
	public String setNome(String nome){
		return this.nome = nome;
	}
	public String setTime(String time){
		return this.time = time;
	}
	public String setPosicao(String posicao){
		return this.posicao = posicao;
	}

}
