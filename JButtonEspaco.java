package br.com.artur.poo.campominado;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

public class JButtonEspaco  extends JButton{
	int i; //linha
	int j; //coluna
	Campo c;
	String text;
	
	public JButtonEspaco(Campo c) {
		text = "";
		this.setText(text);
		this.c = c;
		this.addActionListener((java.awt.event.ActionEvent evt) -> { 
		botaoPressionado(evt);
		});
	}
	//Adição desse escutador para ele detectar quando um quadradinho for clicado

	
	public void botaoPressionado(java.awt.event.ActionEvent evt) {
		//Quando o botão for pressionado, vai alterá-lo visualmente
		int ret = c.clicar(i, j);
		text = Integer.toString(ret);
		setText(text);
		this.setEnabled(false);
		
	}
	
	
	public void setPos(int i, int j) {
		this.i = i;
		this.j = j;
	}
	
	}

