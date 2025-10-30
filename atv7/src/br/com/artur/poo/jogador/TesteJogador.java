package br.com.artur.poo.jogador;

import br.com.artur.poo.time.Time;

public class TesteJogador {
	public static void main(String[] args) {
		Jogador neymar = new Jogador("neymar","Santos","ponta");
		System.out.println(neymar.getTime());
		Time Santos = new Time("Santos",120,54);
		System.out.println(Santos.getquatTitulos());
	}

}
