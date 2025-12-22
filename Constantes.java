package br.com.artur.poo.campominado;

public final class Constantes {
	private static int NUM_LINHAS = 5;
	private static int NUM_COL = 5;
	private static int NUM_MINAS = 5;
	private static  int TAM_ESPACO = 30;
	
	
	public static int getNUM_COL() {
		return NUM_COL;
	}
	
	
	public static void setNUM_COL(int nUM_COL) {
		NUM_COL = nUM_COL;
	}
	
	
	public static int getNUM_LINHAS() {
		return NUM_LINHAS;
	}
	
	
	public static void setNUM_LINHAS(int nUM_LINHAS) {
		NUM_LINHAS = nUM_LINHAS;
	}


	public static int getNUM_MINAS() {
		return NUM_MINAS;
	}


	public static void setNUM_MINAS(int nUM_MINAS) {
		NUM_MINAS = nUM_MINAS;
	}


	public static int getTAM_ESPACO() {
		return TAM_ESPACO;
	}


	public static void setTAM_ESPACO(int tAM_ESPACO) {
		TAM_ESPACO = tAM_ESPACO;
	}
}
