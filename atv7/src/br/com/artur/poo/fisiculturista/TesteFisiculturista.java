package br.com.artur.poo.fisiculturista;

//import br.com.artur.poo.exercicio.Treino;

public class TesteFisiculturista {

	public static void main(String[] args) {
		Fisiculturista ramonDino = new Fisiculturista("Ramon Dino", 27,10,false);
		ramonDino.disputarCampeonato();
		System.out.println(ramonDino.campeonatosDisputados);
		/*Não é possível instanciar a classe Treino nesse pacote, pois o modificador de
		 * acesso da classe Treino é default, ou seja, ela só pode ser acessível dentro da
		 * própria classe ou dentro do pacote em que ela foi criada; para resolver isso, teriamos
		 * que mudar seu modificador de acesso para public
		 */
		//Treino peito = new Treino("supino reto","peito",4,12);
		//peito.verExercicio();

	}

}
