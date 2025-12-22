package br.com.artur.poo.campominado;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameCampo extends JFrame {
	JPanel painel;
	JButtonEspaco[][] matrizBut;
	Campo c;
	
	
	public JFrameCampo(Campo c) {
		this.c = c;
		this.painel = new JPanel();
		this.add(painel);
		painel.setLayout(null);
		this.matrizBut = new JButtonEspaco[Constantes.getNUM_LINHAS()][Constantes.getNUM_COL()];
		for (int i = 0; i < Constantes.getNUM_LINHAS(); i++) {
			for (int j = 0; j < Constantes.getNUM_COL(); j++) {
				//Cria cada quadradinho visualmente
				matrizBut[i][j] = new JButtonEspaco(this.c);
				matrizBut[i][j].i = i;
				matrizBut[i][j].j = j;
				//Define largura e altura de cada quadradinho
				matrizBut[i][j].setSize(30,30);
				//Define onde cada botão vai ficar no campo
				matrizBut[i][j].setLocation(30*j,30*i);
				painel.add(matrizBut[i][j]);
			}

		}
		confIniciais();
	}
	
	private void confIniciais() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(Constantes.getTAM_ESPACO() * Constantes.getNUM_COL(), Constantes.getNUM_LINHAS() * Constantes.getTAM_ESPACO() + 300);
		this.painel = new JPanel();
		this.setVisible(true);

	}

}
