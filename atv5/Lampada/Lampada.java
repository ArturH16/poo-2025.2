public class Lampada {
    boolean ligada;
    String tipoLampada;
    int ano;

    public boolean ligar() {
        ligada = true;
        return true;
    }
    public boolean desligar() {
        ligada = false;
        return false;
    }

    public String trocar_lampada() {
        return "LÂMPADA TROCADA";
    }
}
