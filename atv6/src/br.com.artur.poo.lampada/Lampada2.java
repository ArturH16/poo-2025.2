public class Lampada2 {
    String tipo;
    int ano;
    boolean isLigada;
    public  boolean ligarLampada() {
        this.isLigada = true;
        return isLigada;
    }
    public Lampada2(String tipo, int ano, boolean isLigada) {
        this.tipo = tipo;
        this.ano = ano;
        this.isLigada = isLigada;
    }

    public Lampada2() {
        this.isLigada = false;
    }

    public Lampada2( String tipo) {
        this.tipo = tipo;
    }

    
}
